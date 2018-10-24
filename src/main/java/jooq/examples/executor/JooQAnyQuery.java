package jooq.examples.executor;

import java.sql.ResultSet;

import javax.sql.XAConnection;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import jooq.examples.oracle.InitializeOracleSettings;

public class JooQAnyQuery extends InitializeOracleSettings{

	 public static void main(String[] args) throws Exception {
		createPool();
		XAConnection xacon = pool.getXAConnection();
		
		
		DSLContext create = DSL.using(xacon.getConnection(), SQLDialect.ORACLE12C);

		String sql = "SELECT title, first_name, last_name FROM book JOIN author ON book.author_id = author.id " +
				"WHERE book.published_in = 1948";
		
		// Fetch results using jOOQ
		Result<Record> result = create.fetch(sql);
		System.out.println(result);
		
		// Or execute that SQL with JDBC, fetching the ResultSet with jOOQ:
		ResultSet rs = xacon.getConnection().createStatement().executeQuery(sql);
		result = create.fetch(rs);
		System.out.println(result);
		
		xacon.close();
	}
}
