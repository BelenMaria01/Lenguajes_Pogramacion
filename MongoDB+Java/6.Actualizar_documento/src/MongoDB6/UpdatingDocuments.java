package MongoDB6;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdatingDocuments {

	public static void main(String[] args) {

		// Creando un Cliente Mongo
		MongoClient mongo = new MongoClient("localhost", 27017);

		// Creando una autenticacion con Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");

		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");

		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion myCollection se ha seleccionado correctamente");

		collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
		System.out.println("Documento actualizado correctamente...");

		// Recuperando el documento después de la actualización
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
