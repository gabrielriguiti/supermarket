package br.com.riguitech.supermarket.database;

import br.com.riguitech.supermarket.properties.LoadProperties;
import br.com.riguitech.supermarket.util.LogFile;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @version 1.0
 * @since v1.1
 */
public class ConnectionOracle {

    static String login;
    static String senha;
    static String host;
    static String porta;
    static String SID;

    /**
     * Carrega as credenciais do banco de dados.
     *
     * @since v1.1
     */
    private static void loadCredentials() {

        try {
            Properties properties = LoadProperties.loadProperties();

            host = properties.getProperty("database.host");
            login = properties.getProperty("database.login");
            senha = properties.getProperty("database.senha");
            porta = properties.getProperty("database.porta");
            SID = properties.getProperty("database.SID");


        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    /**
     * Abre uma conexão com o banco de dados.
     *
     * @return Retorna uma conexão aberta com o banco.
     * @since v1.1
     */
    public static Connection openConnection() {

        try {

            loadCredentials();

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@" + host + ":" + porta + ":" + SID,
                    login,
                    senha
            );

            return connection;

        } catch (ClassNotFoundException | SQLException e) {

            LogFile.logger.info("Erro ao conectar com o banco de dados: "
                    .concat(e.getMessage()));
        }

        return null;
    }

    /**
     * Testa a conexão com o banco de dados.
     *
     * @since v1.1
     */
    public static void checkConnection() {

        Connection connection = openConnection();

        if (connection != null) {

            LogFile.logger.info("Conexão estabelecida com o banco de dados!");

        } else {

            LogFile.logger.info("Não foi possível estabelecer conexão com o banco de dados!");
        }
    }
}
