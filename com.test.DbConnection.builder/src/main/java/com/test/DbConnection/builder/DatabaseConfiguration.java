package com.test.DbConnection.builder;

public class DatabaseConfiguration {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfiguration(String databaseUrl, String username, String password, int maxConnections, boolean enableCache, boolean isReadOnly) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        this.maxConnections = maxConnections;
        this.enableCache = enableCache;
        this.isReadOnly = isReadOnly;
    }
    
    private DatabaseConfiguration(DatabaseConfigurationBuilder builder) {
    	this(builder.getDatabaseUrl(), builder.getUsername(), builder.getPassword(), builder.getMaxConnections(), builder.isEnableCache(), builder.isReadOnly());
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }
    
    @WithBuilder
    public static class DatabaseConfigurationBuilder {
    	private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;
        
    	public String getDatabaseUrl() {
    		return databaseUrl;
    	}
    	public DatabaseConfigurationBuilder setDatabaseUrl(String databaseUrl) {
    		this.databaseUrl = databaseUrl;
    		return this;
    	}
    	public String getUsername() {
    		return username;
    	}
    	public DatabaseConfigurationBuilder setUsername(String username) {
    		this.username = username;
    		return this;
    	}
    	public String getPassword() {
    		return password;
    	}
    	public DatabaseConfigurationBuilder setPassword(String password) {
    		this.password = password;
    		return this;
    	}
    	public int getMaxConnections() {
    		return maxConnections;
    	}
    	public DatabaseConfigurationBuilder setMaxConnections(int maxConnections) {
    		this.maxConnections = maxConnections;
    		return this;
    	}
    	public boolean isEnableCache() {
    		return enableCache;
    	}
    	public DatabaseConfigurationBuilder setEnableCache(boolean enableCache) {
    		this.enableCache = enableCache;
    		return this;
    	}
    	public boolean isReadOnly() {
    		return isReadOnly;
    	}
    	public DatabaseConfigurationBuilder setReadOnly(boolean isReadOnly) {
    		this.isReadOnly = isReadOnly;
    		return this;
    	}
        
    	public DatabaseConfiguration build() {
    		return new DatabaseConfiguration(this);
    	}
        
    }
    
    public static DatabaseConfigurationBuilder getBuilder(){
    	return new DatabaseConfigurationBuilder();
    }
}