package com.springdata.Mongodb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;







import com.mongodb.MongoClient;
import com.mongodb.client.result.DeleteResult;
import com.springdata.Mongodb.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	public static final String DB_NAME = "empdb";
	private static final String PERSON_COLLECTION = "Employee";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
	MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
	private MongoOperations mongoOps=new MongoTemplate(mongo,DB_NAME);
	
	
	
	
	public EmployeeRepoImpl() {
		super();
	}

	public EmployeeRepoImpl(MongoOperations mongoOps) {
		super();
		this.mongoOps = mongoOps;
	}

	@Override
	public void create(Employee e) {
		this.mongoOps.insert(e, PERSON_COLLECTION);

	}

	@Override
	public Employee readById(long id) {
		
		return this.mongoOps.findOne(new Query(Criteria.where("id").is(id)),Employee.class,PERSON_COLLECTION);
	}

	@Override
	public void update(Employee e) {
		this.mongoOps.save(e,PERSON_COLLECTION);

	}

	@Override
	public int deleteById(long id) {
		Query query = new Query(Criteria.where("_id").is(id));
		DeleteResult result = this.mongoOps.remove(query, Employee.class, PERSON_COLLECTION);
		return (int) result.getDeletedCount();
	}

	public static void main(String[] args) {
		EmployeeRepo employeeRepo=new EmployeeRepoImpl();
		Employee e=new Employee(2, "birappa", "20000");
		employeeRepo.create(e);
		
		System.out.println(employeeRepo.readById(e.getEmpId()));
	}
}
