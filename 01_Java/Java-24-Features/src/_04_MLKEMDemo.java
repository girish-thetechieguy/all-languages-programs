// javac MLKEMDemo.java
// java MLKEMDemo

import java.security.*;
import java.security.spec.NamedParameterSpec;
import javax.crypto.*;

public class _04_MLKEMDemo {
	public static void main(String[] args) throws Exception {
		// Generate key pair with ML-KEM
//		KeyPairGenerator kpg = KeyPairGenerator.getInstance("ML-KEM");
//		kpg.initialize(new NamedParameterSpec("ML-KEM-512"));
//		KeyPair kp = kpg.generateKeyPair();
//
//		// Encapsulation (sender)
//		KEM kem = KEM.getInstance("ML-KEM");
//		KEM.Encapsulator encapsulator = kem.newEncapsulator(kp.getPublic());
//		KEM.Encapsulated encapsulation = encapsulator.encapsulate();
//		SecretKey senderKey = encapsulation.getKey();
//
//		// Decapsulation (receiver)
//		KEM.Decapsulator decapsulator = kem.decapsulator(kp.getPrivate());
//		SecretKey receiverKey = decapsulator.decapsulate(encapsulation.getEncapsulation());
//
//		System.out.println("Sender Key:   " + senderKey.getEncoded().length + " bytes");
//		System.out.println("Receiver Key: " + receiverKey.getEncoded().length + " bytes");
	}
}
