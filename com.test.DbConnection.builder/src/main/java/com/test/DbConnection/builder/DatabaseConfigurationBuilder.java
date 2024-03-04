package com.test.DbConnection.builder;

//@WithBuilder
//public class DatabaseConfigurationBuilder {
//	private String databaseUrl;
//    private String username;
//    private String password;
//    private int maxConnections;
//    private boolean enableCache;
//    private boolean isReadOnly;
//    
//	public String getDatabaseUrl() {
//		return databaseUrl;
//	}
//	public DatabaseConfigurationBuilder setDatabaseUrl(String databaseUrl) {
//		this.databaseUrl = databaseUrl;
//		return this;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public DatabaseConfigurationBuilder setUsername(String username) {
//		this.username = username;
//		return this;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public DatabaseConfigurationBuilder setPassword(String password) {
//		this.password = password;
//		return this;
//	}
//	public int getMaxConnections() {
//		return maxConnections;
//	}
//	public DatabaseConfigurationBuilder setMaxConnections(int maxConnections) {
//		this.maxConnections = maxConnections;
//		return this;
//	}
//	public boolean isEnableCache() {
//		return enableCache;
//	}
//	public DatabaseConfigurationBuilder setEnableCache(boolean enableCache) {
//		this.enableCache = enableCache;
//		return this;
//	}
//	public boolean isReadOnly() {
//		return isReadOnly;
//	}
//	public DatabaseConfigurationBuilder setReadOnly(boolean isReadOnly) {
//		this.isReadOnly = isReadOnly;
//		return this;
//	}
//    
//	public DatabaseConfiguration build() {
//		return new DatabaseConfiguration(this);
//	}
//    
//}