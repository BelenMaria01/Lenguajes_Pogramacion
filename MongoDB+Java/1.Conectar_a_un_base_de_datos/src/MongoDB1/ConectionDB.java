package MongoDB1;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class ConectionDB {
	public static void main(String[] args) {
		
		// Creando a un cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017); // donde esta la BBDD y el puerto
		
		// Creando la autenticacion
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectadose a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		System.out.println("Accediendo ::"+ credential);
		
	}
}
