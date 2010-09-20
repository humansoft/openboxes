import com.mchange.v2.c3p0.ComboPooledDataSource
import org.codehaus.groovy.grails.commons.ConfigurationHolder as CH

beans = {
	
	customPropertyEditorRegistrar(util.CustomPropertyEditorRegistrar)
	
	
	/**
	 * c3P0 pooled data source that allows 'DB keepalive' queries
	 * to prevent stale/closed DB connections
	 * Still using the JDBC configuration settings from DataSource.groovy
	 * to have easy environment specific setup available
	 */
	dataSource(ComboPooledDataSource) { bean ->
		bean.destroyMethod = 'close'
		//use grails' datasource configuration for connection user, password, driver and JDBC url
		user = CH.config.dataSource.username
		password = CH.config.dataSource.password
		driverClass = CH.config.dataSource.driverClassName
		jdbcUrl = CH.config.dataSource.url
		//connection test settings
		idleConnectionTestPeriod = 2 * 60 * 60 // 2 hours
		initialPoolSize = 10
		maxPoolSize = 30 
		maxStatements = 180
		// test connections 
		testConnectionOnCheckin = true
		//force connections to renew after 4 hours
		maxConnectionAge = 4 * 60 * 60
		//get rid too many of idle connections after 30 minutes
		maxIdleTimeExcessConnections = 30 * 60
	
		
	}
}


