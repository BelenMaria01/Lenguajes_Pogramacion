package MongoDB03;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class SelectingCollection {

	public static void main(String[] args) {
		
		// Creando el Mongo Client
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creando una coleccion
		System.out.println("colection creado correctamente");
		
		// Recuperando una Coleccion
		MongoCollection<Document> collection = database.getCollection("myCollection");
		System.out.println("Coleccion myCollection seleccionado correctamente");
		
	}

}
