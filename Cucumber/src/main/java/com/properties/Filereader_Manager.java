package com.properties;

public class Filereader_Manager {



	public static Filereader_Manager getinstaceFRM() {

		Filereader_Manager frm = new Filereader_Manager();

		return frm;

	}

	public Configuration_Reader getinstanceCR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;

	}

}
