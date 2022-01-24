package MongoDB05;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdatingDocument {
	public static void main(String[] args) {

		// Creando un Cliente mongo
		MongoClient mongo = new MongoClient("locahost", 27017);

		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectado a la base de datos correctamente");

		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");

		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection selecciono correctamente");

		collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
		System.out.println("Documento actualizado correctamente...");

		/*
		 * Recuperando los documentos después de la actualización
		 * Obtener el objeto iterable
		 */
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;

		// Generando la interaccion
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}

	}
}
