package MongoDB02;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class CreatingCollection {

	public static void main(String[] args) {
		// Creando Mongo Client
		MongoClient mongo = new MongoClient("localhost",27017);
		
		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDB", "password".toCharArray());
		System.out.println("Connected to the database successfully");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creando una coleccion
		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully");
	}

}
