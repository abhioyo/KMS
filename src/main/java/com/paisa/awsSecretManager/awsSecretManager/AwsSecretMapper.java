package com.paisa.awsSecretManager.awsSecretManager;

public class AwsSecretMapper {
String username;
String password;
String engine;
String host;
int port;
String dbname;
String dbInstanceIdentifier;

    @Override
    public String toString() {
        return "AwsSecretMapper{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", engine='" + engine + '\'' +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", dbname='" + dbname + '\'' +
                ", dbInstanceIdentifier='" + dbInstanceIdentifier + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getDbInstanceIdentifier() {
        return dbInstanceIdentifier;
    }

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }
}
