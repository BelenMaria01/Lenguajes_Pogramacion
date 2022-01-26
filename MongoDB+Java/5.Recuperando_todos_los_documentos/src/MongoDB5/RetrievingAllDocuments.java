package MongoDB5;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RetrievingAllDocuments {

	public static void main(String[] args) {
		
		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando una autenticacion con Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectado a la base de datos correctamente");
		
		// Accediendo la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Recuperando una Coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection se ha seleccionado correctamente");
		
		// Obtener el objeto iterable
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		
		// Obtener el iterador
		Iterator it = iterDoc.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}
}
