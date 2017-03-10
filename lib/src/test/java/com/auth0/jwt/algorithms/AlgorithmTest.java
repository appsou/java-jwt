package com.auth0.jwt.algorithms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.nio.charset.StandardCharsets;
import java.security.interfaces.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

public class AlgorithmTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldThrowHMAC256InstanceWithNullSecretBytes() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        byte[] secret = null;
        Algorithm.HMAC256(secret);
    }

    @Test
    public void shouldThrowHMAC384InstanceWithNullSecretBytes() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        byte[] secret = null;
        Algorithm.HMAC384(secret);
    }

    @Test
    public void shouldThrowHMAC512InstanceWithNullSecretBytes() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        byte[] secret = null;
        Algorithm.HMAC512(secret);
    }

    @Test
    public void shouldThrowHMAC256InstanceWithNullSecret() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        String secret = null;
        Algorithm.HMAC256(secret);
    }

    @Test
    public void shouldThrowHMAC384InstanceWithNullSecret() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        String secret = null;
        Algorithm.HMAC384(secret);
    }

    @Test
    public void shouldThrowHMAC512InstanceWithNullSecret() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The Secret cannot be null");
        String secret = null;
        Algorithm.HMAC512(secret);
    }

    @Test
    public void shouldThrowRSA256InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA256(null);
    }

    @Test
    public void shouldThrowRSA256InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA256(null, null);
    }

    @Test
    public void shouldThrowRSA384InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA384(null);
    }

    @Test
    public void shouldThrowRSA384InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA384(null, null);
    }

    @Test
    public void shouldThrowRSA512InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA512(null);
    }

    @Test
    public void shouldThrowRSA512InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.RSA512(null, null);
    }

    @Test
    public void shouldThrowECDSA256InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA256(null);
    }

    @Test
    public void shouldThrowECDSA256InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA256(null, null);
    }

    @Test
    public void shouldThrowECDSA384InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA384(null);
    }

    @Test
    public void shouldThrowECDSA384InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA384(null, null);
    }

    @Test
    public void shouldThrowECDSA512InstanceWithNullKey() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA512(null);
    }

    @Test
    public void shouldThrowECDSA512InstanceWithNullKeys() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Both provided Keys cannot be null.");
        Algorithm.ECDSA512(null, null);
    }

    @Test
    public void shouldCreateHMAC256AlgorithmWithBytes() throws Exception {
        Algorithm algorithm = Algorithm.HMAC256("secret".getBytes(StandardCharsets.UTF_8));

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA256"));
        assertThat(algorithm.getName(), is("HS256"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateHMAC384AlgorithmWithBytes() throws Exception {
        Algorithm algorithm = Algorithm.HMAC384("secret".getBytes(StandardCharsets.UTF_8));

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA384"));
        assertThat(algorithm.getName(), is("HS384"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateHMAC512AlgorithmWithBytes() throws Exception {
        Algorithm algorithm = Algorithm.HMAC512("secret".getBytes(StandardCharsets.UTF_8));

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA512"));
        assertThat(algorithm.getName(), is("HS512"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateHMAC256AlgorithmWithString() throws Exception {
        Algorithm algorithm = Algorithm.HMAC256("secret");

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA256"));
        assertThat(algorithm.getName(), is("HS256"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateHMAC384AlgorithmWithString() throws Exception {
        Algorithm algorithm = Algorithm.HMAC384("secret");

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA384"));
        assertThat(algorithm.getName(), is("HS384"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateHMAC512AlgorithmWithString() throws Exception {
        Algorithm algorithm = Algorithm.HMAC512("secret");

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(HMACAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("HmacSHA512"));
        assertThat(algorithm.getName(), is("HS512"));
        assertThat(((HMACAlgorithm) algorithm).getSecret(), is("secret".getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void shouldCreateRSA256AlgorithmWithPublicKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPublicKey.class));
        Algorithm algorithm = Algorithm.RSA256(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withRSA"));
        assertThat(algorithm.getName(), is("RS256"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateRSA256AlgorithmWithPrivateKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPrivateKey.class));
        Algorithm algorithm = Algorithm.RSA256(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withRSA"));
        assertThat(algorithm.getName(), is("RS256"));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateRSA256Algorithm() throws Exception {
        RSAPublicKey publicKey = mock(RSAPublicKey.class);
        RSAPrivateKey privateKey = mock(RSAPrivateKey.class);
        Algorithm algorithm = Algorithm.RSA256(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withRSA"));
        assertThat(algorithm.getName(), is("RS256"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateRSA384AlgorithmWithPublicKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPublicKey.class));
        Algorithm algorithm = Algorithm.RSA384(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withRSA"));
        assertThat(algorithm.getName(), is("RS384"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateRSA384AlgorithmWithPrivateKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPrivateKey.class));
        Algorithm algorithm = Algorithm.RSA384(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withRSA"));
        assertThat(algorithm.getName(), is("RS384"));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateRSA384Algorithm() throws Exception {
        RSAPublicKey publicKey = mock(RSAPublicKey.class);
        RSAPrivateKey privateKey = mock(RSAPrivateKey.class);
        Algorithm algorithm = Algorithm.RSA384(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withRSA"));
        assertThat(algorithm.getName(), is("RS384"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateRSA512AlgorithmWithPublicKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPublicKey.class));
        Algorithm algorithm = Algorithm.RSA512(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withRSA"));
        assertThat(algorithm.getName(), is("RS512"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateRSA512AlgorithmWithPrivateKey() throws Exception {
        RSAKey key = mock(RSAKey.class, withSettings().extraInterfaces(RSAPrivateKey.class));
        Algorithm algorithm = Algorithm.RSA512(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withRSA"));
        assertThat(algorithm.getName(), is("RS512"));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateRSA512Algorithm() throws Exception {
        RSAPublicKey publicKey = mock(RSAPublicKey.class);
        RSAPrivateKey privateKey = mock(RSAPrivateKey.class);
        Algorithm algorithm = Algorithm.RSA512(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(RSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withRSA"));
        assertThat(algorithm.getName(), is("RS512"));
        assertThat(((RSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((RSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateECDSA256AlgorithmWithPublicKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPublicKey.class));
        Algorithm algorithm = Algorithm.ECDSA256(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withECDSA"));
        assertThat(algorithm.getName(), is("ES256"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA256AlgorithmWithPrivateKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPrivateKey.class));
        Algorithm algorithm = Algorithm.ECDSA256(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withECDSA"));
        assertThat(algorithm.getName(), is("ES256"));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA256Algorithm() throws Exception {
        ECPublicKey publicKey = mock(ECPublicKey.class);
        ECPrivateKey privateKey = mock(ECPrivateKey.class);
        Algorithm algorithm = Algorithm.ECDSA256(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA256withECDSA"));
        assertThat(algorithm.getName(), is("ES256"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateECDSA384AlgorithmWithPublicKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPublicKey.class));
        Algorithm algorithm = Algorithm.ECDSA384(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withECDSA"));
        assertThat(algorithm.getName(), is("ES384"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA384AlgorithmWithPrivateKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPrivateKey.class));
        Algorithm algorithm = Algorithm.ECDSA384(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withECDSA"));
        assertThat(algorithm.getName(), is("ES384"));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA384Algorithm() throws Exception {
        ECPublicKey publicKey = mock(ECPublicKey.class);
        ECPrivateKey privateKey = mock(ECPrivateKey.class);
        Algorithm algorithm = Algorithm.ECDSA384(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA384withECDSA"));
        assertThat(algorithm.getName(), is("ES384"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateECDSA512AlgorithmWithPublicKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPublicKey.class));
        Algorithm algorithm = Algorithm.ECDSA512(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withECDSA"));
        assertThat(algorithm.getName(), is("ES512"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA512AlgorithmWithPrivateKey() throws Exception {
        ECKey key = mock(ECKey.class, withSettings().extraInterfaces(ECPrivateKey.class));
        Algorithm algorithm = Algorithm.ECDSA512(key);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withECDSA"));
        assertThat(algorithm.getName(), is("ES512"));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(key));
    }

    @Test
    public void shouldCreateECDSA512Algorithm() throws Exception {
        ECPublicKey publicKey = mock(ECPublicKey.class);
        ECPrivateKey privateKey = mock(ECPrivateKey.class);
        Algorithm algorithm = Algorithm.ECDSA512(publicKey, privateKey);

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(ECDSAAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("SHA512withECDSA"));
        assertThat(algorithm.getName(), is("ES512"));
        assertThat(((ECDSAAlgorithm) algorithm).getPublicKey(), is(publicKey));
        assertThat(((ECDSAAlgorithm) algorithm).getPrivateKey(), is(privateKey));
    }

    @Test
    public void shouldCreateNoneAlgorithm() throws Exception {
        Algorithm algorithm = Algorithm.none();

        assertThat(algorithm, is(notNullValue()));
        assertThat(algorithm, is(instanceOf(NoneAlgorithm.class)));
        assertThat(algorithm.getDescription(), is("none"));
        assertThat(algorithm.getName(), is("none"));
    }

}