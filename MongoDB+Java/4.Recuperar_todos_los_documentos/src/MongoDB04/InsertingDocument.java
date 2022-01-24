package MongoDB04;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class InsertingDocument {

	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost",27017);
		
		// Creando credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de dato correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Recuperando una Coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection seleccionado correctamente");
		
		Document document = new Document("title","MongoDB")
				.append("id", 1)
				.append("description", "database")
				.append("likes", 100)
				.append("url", "https://www.tutorialspoint.com/bongodb/")
				.append("by", "tutorials point");
				collection.insertOne(document);
		System.out.println("Documento insertado correctamente");
		
	}

}
