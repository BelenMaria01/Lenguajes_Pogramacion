package MongoDB8;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DropingCollection {

	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando una autenticacion con Credential
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creando una coleccion (tabla)
		System.out.println("Coleccion creado correctamente");
		
		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		
		// Eliminando una coleccion
		collection.drop();
		System.out.println("Coleccion eliminado correctamente");
	}

}
