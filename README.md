# springboot


1. application.properties.
   
   We have to add these two lines to the application.properties file inorder to 
   create embedded database and print the logging output when the script is ran.
   
        # Tell Spring to create Embeeded Database
        spring.jpa.hibernate.ddl-auto=none
        # Log output to console at debug level 
        logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
