package MongoDB2;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class CreatingCollection {
	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando una Autenticacion con Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectandose a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creando una coleccion (tablas)
		database.createCollection("sampleCollection");
		System.out.println("Coleccion creada correctamente");
	}
}
