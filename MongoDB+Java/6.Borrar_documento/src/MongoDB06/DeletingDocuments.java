package MongoDB06;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeletingDocuments {
	public static void main(String[] args) {

		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);
		
		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDB", "password".toCharArray());
		System.out.println("Conectano la base de datos correctamente");
		
		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Recuperando una Coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection selecionado correctamente");
		
		// Eliminando el documento
		collection.deleteOne(Filters.eq("id",1));
		System.out.println("Documento elimiando correctamente...");
		
		/*
		 * Recuperando los documentos después de la actualización
		 * Obtener el objeto iterable
		 */
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		
		// Generando la iteracion
		Iterator it = iterDoc.iterator();
		
		while (it.hasNext()) {
			System.out.println("Insertar documento: "+i);
			System.out.println(it.next());
			i++;
		}
	}
}
