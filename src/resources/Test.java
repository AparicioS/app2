package resources;

import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("app2UC");
	}

}
