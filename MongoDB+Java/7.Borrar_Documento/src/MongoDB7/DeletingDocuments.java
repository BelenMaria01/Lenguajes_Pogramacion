package MongoDB7;

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
		MongoClient mongo = new MongoClient("localhost", 2017);

		// Creandod un autenticador con Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Conectando a la base de datos correctamente");

		// Accediendo a la base de datos
		MongoDatabase database = mongo.getDatabase("myDb");

		// Recuperando una coleccion
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("La coleccion sampleCollection ha sido seleccionado correctamente");

		// Eliminar el documentos
		collection.deleteOne(Filters.eq("id", 1));
		System.out.println("Documento eliminado...");

		// Recuperando el documento después de la actualización
		// Obtener el objeto iterable
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;

		// Obtener el interador
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println("Insertar documento: " + i);
			System.out.println(it.next());
			i++;
		}
	}
}
