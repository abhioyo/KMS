package com.paisa.awsSecretManager;

import com.paisa.awsSecretManager.awsSecretManager.AwsSecretManager;
import com.paisa.awsSecretManager.awsSecretManager.AwsSecretMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSecretManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSecretManagerApplication.class, args);

		AwsSecretManager awsSecretManager=new AwsSecretManager();
		AwsSecretMapper awsSecretMapper= awsSecretManager.getSecret();
	}

}
