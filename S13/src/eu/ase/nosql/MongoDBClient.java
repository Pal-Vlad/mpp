package eu.ase.nosql;

import com.mongodb.client.*;
import org.bson.Document;

import javax.print.Doc;

public class MongoDBClient {
    public static void main(String[] args) {
        try(MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")){
            MongoDatabase db = mongoClient.getDatabase("test");
            System.out.println(("Connceted to db successfully"));

            if(db.getCollection("mycol") != null) {
                db.getCollection("mycol").drop();
            }

            db.createCollection("mycol");
            System.out.println("collection created succesfully");
            MongoCollection<Document> coll = db.getCollection("mycol");
            System.out.println("Collection selected succesfully");

            Document document = new Document("title", "MongoDb").append("description", "database").append("likes", 100).append("url", "https://google.com").append("by", "GOOGLE");
            coll.insertOne(document);
            System.out.println("Document inserted sucesfully");

            FindIterable<Document> iterableFind = coll.find();
            MongoCursor<Document> cursor = iterableFind.iterator();
            while(cursor.hasNext()) {
                System.out.println(cursor.next());

            }

            cursor.close();


        }
    }
}
