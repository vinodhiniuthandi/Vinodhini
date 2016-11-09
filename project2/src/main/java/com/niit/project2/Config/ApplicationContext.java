package com.niit.project2.Config;

import java.util.Properties;




import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.project2.DAO.BillingAddressDAO;
import com.niit.project2.DAO.BillingAddressDAOImpl;
import com.niit.project2.DAO.CardDetailDAO;
import com.niit.project2.DAO.CardDetailDAOImpl;
import com.niit.project2.DAO.CartDAO;
import com.niit.project2.DAO.CartDAOImpl;
import com.niit.project2.DAO.CartItemDAO;
import com.niit.project2.DAO.CartItemDAOImpl;
import com.niit.project2.DAO.CategoryDAO;
import com.niit.project2.DAO.SupplierDAO;
import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.DAO.CategoryDAOImpl;
import com.niit.project2.DAO.CustomerDAO;
import com.niit.project2.DAO.CustomerDAOImpl;
import com.niit.project2.DAO.OrderDAO;
import com.niit.project2.DAO.OrderDAOImpl;
import com.niit.project2.DAO.OrderDetailDAO;
import com.niit.project2.DAO.OrderDetailDAOImpl;
import com.niit.project2.DAO.OrderedItemDAO;
import com.niit.project2.DAO.OrderedItemDAOImpl;
import com.niit.project2.DAO.ProductDAOImpl;
import com.niit.project2.DAO.ShippingAddressDAO;
import com.niit.project2.DAO.ShippingAddressDAOImpl;
import com.niit.project2.DAO.SupplierDAOImpl;
import com.niit.project2.DAO.UserDAO;
import com.niit.project2.DAO.UserDAOImpl;
import com.niit.project2.Model.BillingAddress;
import com.niit.project2.Model.CardDetail;
import com.niit.project2.Model.Cart;
import com.niit.project2.Model.CartItem;
import com.niit.project2.Model.Category;
import com.niit.project2.Model.Customer;
import com.niit.project2.Model.Order;
import com.niit.project2.Model.OrderDetail;
import com.niit.project2.Model.OrderedItem;
import com.niit.project2.Model.Product;
import com.niit.project2.Model.ShippingAddress;
import com.niit.project2.Model.Supplier;
import com.niit.project2.Model.User;



	@Configuration
	@ComponentScan("com.niit.project2")
	@EnableTransactionManagement
	public class ApplicationContext{	
		@Bean
			    public DataSource getH2DataSource() {
				 @SuppressWarnings("unused")
				String url ="jdbc:h2:mem:test;"+
			    "INIT = CREATE SCHEMA IF NOT EXISTS TEST";
				 DriverManagerDataSource dataSource=new DriverManagerDataSource();
				 dataSource.setDriverClassName("org.h2.Driver");
			    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/testfashion");
			    	dataSource.setUsername("sa");
			    	dataSource.setPassword("");
			    	return dataSource;
			    }
			    
			    private Properties getHibernateProperties() {
			    	Properties properties = new Properties();
			    	properties.put("hibernate.show_sql", "true");
			    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			    	properties.put("hibernate.hdbm2ddl.auto","create");
			    	return properties;
			    }
			    

			    
			    @Autowired
			    @Bean(name = "sessionFactory")
			    public SessionFactory getSessionFactory(DataSource dataSource) {
			    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			    	sessionBuilder.addProperties(getHibernateProperties());
			    	sessionBuilder.addAnnotatedClasses(Category.class);
			    	sessionBuilder.addAnnotatedClasses(Supplier.class);
			    	sessionBuilder.addAnnotatedClasses(Product.class);
			    	sessionBuilder.addAnnotatedClasses(User.class);
			    	sessionBuilder.addAnnotatedClasses(BillingAddress.class);
			    	sessionBuilder.addAnnotatedClasses(ShippingAddress.class);
			    	sessionBuilder.addAnnotatedClasses(Customer.class);
			    	sessionBuilder.addAnnotatedClasses(Cart.class);
			    	sessionBuilder.addAnnotatedClasses(CardDetail.class);
			    	sessionBuilder.addAnnotatedClasses(CartItem.class);
			    	sessionBuilder.addAnnotatedClasses(OrderDetail.class);
			    	sessionBuilder.addAnnotatedClasses(OrderedItem.class);
			    	sessionBuilder.addAnnotatedClasses(Order.class);
					return sessionBuilder.buildSessionFactory();
			    }
			 
				@Autowired
				@Bean(name = "transactionManager")
				public HibernateTransactionManager getTransactionManager(
						SessionFactory sessionFactory) {
					HibernateTransactionManager transactionManager = new HibernateTransactionManager(
							sessionFactory);

					return transactionManager;
				}
					
				
			    @Autowired
			    @Bean(name="categoryDAOImpl")
			    public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
			    	return new CategoryDAOImpl(sessionFactory);
			    }
			    @Autowired
			    @Bean(name="productDAOImpl")
			    public ProductDAO getProductDAO(SessionFactory sessionFactory) {
			    	return new ProductDAOImpl(sessionFactory);
			    } @Autowired
			    @Bean(name="supplierDAOImpl")
			    public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
			    	return new SupplierDAOImpl(sessionFactory);
			    }
			    @Autowired
			    @Bean(name="customerDAOImpl")
			    public CustomerDAO getCustomerDAO(SessionFactory sessionFactory) {
			    	return new CustomerDAOImpl(sessionFactory);
			    }
			    	 @Autowired
					    @Bean(name="cardDetailDAOImpl")
					    public CardDetailDAO getCardDetailDAO(SessionFactory sessionFactory) {
					    	return new CardDetailDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="billingAddressDAOImpl")
					    public BillingAddressDAO getBillingAddressDAO(SessionFactory sessionFactory) {
					    	return new BillingAddressDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="shippingAddressDAOImpl")
					    public ShippingAddressDAO getShippingAddressDAO(SessionFactory sessionFactory) {
					    	return new ShippingAddressDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="orderDetailDAOImpl")
					    public OrderDetailDAO getOrderDetailDAO(SessionFactory sessionFactory) {
					    	return new OrderDetailDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="orderedItemDAOImpl")
					    public OrderedItemDAO getOrderedItemDAO(SessionFactory sessionFactory) {
					    	return new OrderedItemDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="cartDAOImpl")
					    public CartDAO getCartDAO(SessionFactory sessionFactory) {
					    	return new CartDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="cartItemDAOImpl")
					    public CartItemDAO getCartItemDAO(SessionFactory sessionFactory) {
					    	return new CartItemDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="userDAOImpl")
					    public UserDAO getUserDAO(SessionFactory sessionFactory) {
					    	return new UserDAOImpl(sessionFactory);
					    }
			    	 @Autowired
					    @Bean(name="orderDAOImpl")
					    public OrderDAO getOrderDAO(SessionFactory sessionFactory) {
					    	return new OrderDAOImpl(sessionFactory);
					    }
				    }
				    
