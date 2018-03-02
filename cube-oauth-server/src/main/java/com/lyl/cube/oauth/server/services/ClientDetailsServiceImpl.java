package com.lyl.cube.oauth.server.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

  @Override
  public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
    return new BaseClientDetails();
//    Optional<AppClient> client = clientRepository.findOneById(clientId);
//
//    if(client.isPresent())
//    {
//      AppClient appClient = client.get();
//
//      BaseClientDetails clientDetails = new BaseClientDetails();
//      clientDetails.setClientId(clientId);
//      clientDetails.setClientSecret(appClient.getSecret());
//      clientDetails.setScope(appClient.getScopes());
//      clientDetails.setAuthorizedGrantTypes(appClient.getGrantTypes());
//
//      return clientDetails;
    // Confidential client where client secret can be kept safe (e.g. server side)
//         .withClient("confidential").secret("secret")
//        .authorizedGrantTypes("client_credentials", "authorization_code", "refresh_token")
//        .scopes("read", "write")
//        .redirectUris("http://localhost:8080/client/")
//
//        .and()
//
//        // Public client where client secret is vulnerable (e.g. mobile apps, browsers)
//        .withClient("public") // No secret!
//        .authorizedGrantTypes("client_credentials", "implicit")
//        .scopes("read")
//        .redirectUris("http://localhost:8080/client/")
//
//        .and()
//
//        // Trusted client: similar to confidential client but also allowed to handle user password
//        .withClient("trusted").secret("secret")
//        .authorities("ROLE_TRUSTED_CLIENT")
//        .authorizedGrantTypes("client_credentials", "password", "authorization_code", "refresh_token")
//        .scopes("read", "write")
//        .redirectUris("http://localhost:8080/client/")
//    }
//    else
//    {
//      throw new ClientIdNotFoundException("Not found client with id '".concat(clientId).concat("'"));
//    }
  }
}