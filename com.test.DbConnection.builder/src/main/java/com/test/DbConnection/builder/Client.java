package com.test.DbConnection.builder;

public class Client {

	public static void main(String[] args) {
		DatabaseConfiguration configuration = DatabaseConfiguration.getBuilder()
				.setDatabaseUrl("localhost://8080")
				.setEnableCache(false)
				.setMaxConnections(20)
				.setReadOnly(true)
				.setPassword("beetle").build();

	}

}
