package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ConnectionFactory {

	private final DataSource dataSource;

	public ConnectionFactory() {
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource
				.setJdbcUrl("jdbc:mysql://localhost/control_de_reservaciones?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("root1234");
		pooledDataSource.setMaxPoolSize(10);

		this.dataSource = (DataSource) pooledDataSource;
	}

	public Connection recuperaConexion() {

		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
