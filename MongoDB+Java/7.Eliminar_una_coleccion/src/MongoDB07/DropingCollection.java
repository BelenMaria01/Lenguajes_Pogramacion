package MongoDB07;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DropingCollection {
	public static void main(String[] args) {
		
		// Creacion a Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creando una coleccion
		System.out.println("Coleccion creada correctamente");
		
		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		
		// Elimiando una coleccion
		collection.drop();
		System.out.println("coleccion elimiando correctamente");
	}
	
}
