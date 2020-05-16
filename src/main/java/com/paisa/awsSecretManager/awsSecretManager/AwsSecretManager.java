package com.paisa.awsSecretManager.awsSecretManager;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Base64;

public class AwsSecretManager {

    private ObjectMapper objectMapper = new ObjectMapper();

    public  AwsSecretMapper getSecret() {

        AwsSecretMapper awsSecretMapper=null;
        String secretName = "stg-pricing-secret";
        String region = "ap-southeast-1";
        AWSSecretsManager client  = AWSSecretsManagerClientBuilder.standard()
                .withRegion(region)
                .build();

        String secret=null, decodedBinarySecret=null;
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);
        GetSecretValueResult getSecretValueResult = null;

        try {
            getSecretValueResult = client.getSecretValue(getSecretValueRequest);
        } catch (DecryptionFailureException e) {
            throw e;
        } catch (InternalServiceErrorException e) {
            throw e;
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidRequestException e) {
            throw e;
        } catch (ResourceNotFoundException e) {
            throw e;
        }
        if (getSecretValueResult.getSecretString() != null) {
            secret = getSecretValueResult.getSecretString();
        }
        else {
            decodedBinarySecret = new String(Base64.getDecoder().decode(getSecretValueResult.getSecretBinary()).array());
        }
      try {
           awsSecretMapper=objectMapper.readValue(secret,AwsSecretMapper.class);
      }
      catch (Exception e)
      {

      }
      return awsSecretMapper;

    }
}
