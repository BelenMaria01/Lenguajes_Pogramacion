package MongoDB01;

import com.mongodb.MongoCredential;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectToDB {
	public static void main(String[] args) {

		// Creando el Mongo Client
		MongoClient mongo = new MongoClient("localhost", 27017);

		// Creando Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
		System.out.println("Base de datos conectado correctamente");

		// Accediendo a la Base de Datos
		MongoDatabase database = mongo.getDatabase("myDb");
		System.out.println("credentials ::" + credential);
	}
}
