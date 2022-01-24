package MongoDB08;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class ListOfCollection {
	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient ("localhost", 27017);
		
		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Base de datos conectado correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		System.out.println("Colecicon creada correctamente");
		
		for (String name:database.listCollectionNames()) {
			System.out.println(name);
		}
	}
}
