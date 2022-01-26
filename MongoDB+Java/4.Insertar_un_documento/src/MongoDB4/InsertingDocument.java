package MongoDB4;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingDocument {

	public static void main(String[] args) {
		
		// Creando un cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando una autenticacion con Credential
		MongoCredential credential;
		credential = MongoCredential.createCredential("SampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection se ha seleccionado correctamente");
		
		// Insertando los documentos
		Document document = new Document("title","MongoDB")
				.append("id", 1)
				.append("description", "database")
				.append("likes", 100)
				.append("url", "https://www.google.es/")
				.append("by", "Mirmiano");
		collection.insertOne(document);
		System.out.println("Documento insertado correctamente");
	}

}
