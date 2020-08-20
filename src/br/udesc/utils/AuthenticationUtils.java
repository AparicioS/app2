package br.udesc.utils;

import java.lang.reflect.Method;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ResourceInfo;

import br.udesc.dao.ServicosUsuarioDao;
import br.udesc.modelo.Servico;
import br.udesc.modelo.ServicoUsuarioAutorizado;
import br.udesc.modelo.Usuario;

public class AuthenticationUtils {

	private static ResourceInfo _resourceInfo;

	
	
	private static Map< String, Usuario> usuarios = new HashMap<>();
	
	static {
		 
		usuarios.put("a", new Usuario("a", "a")); // YTph
//		usuarios.put("b", new Usuario("b", "b", "inserirCliente")); // Yjpi
//		Usuario u = new Usuario("c", "c", "admin");
//		u.addRole("alterarCliente");
//		usuarios.put("c", u); // Yzpj
		
	}
	
	public static boolean isUsuarioAutenticado(String authString){
        
		if (authString == null)
			return false;
		
        try {
            String decodedAuth = "";
            // Header is in the format "Basic 5tyc0uiDat4"
            // We need to extract data before decoding it back to original string
            String[] authParts = authString.split("\\s+");
            String authInfo = authParts[1];
            // Decode the data back to original string
            byte[] bytes = null;
            bytes = Base64.getDecoder().decode(authInfo);
            decodedAuth = new String(bytes);
            
	        StringTokenizer tokenizer = new StringTokenizer(decodedAuth, ":");
	        String username = tokenizer.nextToken();
	        String password = tokenizer.nextToken();
        
	        String[] roles;
	        if (_resourceInfo != null) {
	        	
	        	Method method = _resourceInfo.getResourceMethod();
	        	RolesAllowed[] anotacoes = method.getAnnotationsByType(RolesAllowed.class);
	        	if (anotacoes.length == 1) {
	        		roles = anotacoes[0].value();
	        	} else {
	        		roles = new String[] {};
	        	}
	        	
	        } else {
	        	roles = new String[] {};
	        }
	        
	        /**
	         * aqui voce vai incluir a sua logica para validar o usuario e a senha.
	         * Por exemplo, puxar do BD. Eu estou usando Map soh para exemplificar.
	         */
	        ServicosUsuarioDao sdd = new ServicosUsuarioDao();
	        
	        List<ServicoUsuarioAutorizado> listaAuto = sdd.listar();
	        ServicoUsuarioAutorizado sa = new ServicoUsuarioAutorizado();
	        for(ServicoUsuarioAutorizado sd : listaAuto) {
	        	if(sd.getUsuario().getNome().equals(username) && sd.getUsuario().getSenha().equals(password)) {
	        		sa = sd;
	        	}
	        }
	        
	        Usuario usuario = sa.getUsuario();
	        Servico servico = sa.getServico();
	        
	        if ( usuario != null && usuario.getSenha().equals(password)) {
	        
	        	if (roles.length > 0) {
		        	
		        	for (String role:roles) {
		        		if (servico.getNomeServico().equals(role)) 
		        			return true;
		        	}
		        	
		        	return false;
	        	}
	        	
	            return true;
	        } else {
	        	return false;
	        }
        } catch (Exception e) {
        	return false;
        }
         
    }

	public static boolean isMetodoPermitido() {
		
		Method method = _resourceInfo.getResourceMethod();
    	RolesAllowed[] anotacoes = method.getAnnotationsByType(RolesAllowed.class);
    	
		return anotacoes.length == 0;
	}
	
	public static void setResourceInfo(ResourceInfo resourceInfo) {
		
		_resourceInfo = resourceInfo;
		
	}

}
