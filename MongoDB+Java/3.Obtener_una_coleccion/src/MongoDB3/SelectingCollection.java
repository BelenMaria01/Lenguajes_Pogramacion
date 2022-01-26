package MongoDB3;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SelectingCollection {

	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando un Autenticacion con Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectado a la base de dato correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creandod una coleccion (Tabla)
		System.out.println("Coleccion creada correctamente");
		
		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("myCollection");
		System.out.println("La coleccion myCollection ha sido seleccionada correctamente");
	}

}
