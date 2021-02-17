package br.com.riguitech.supermarket.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @version 1.0
 * @since v1.1
 */
public class LoadProperties {

    /**
     * Carrega o arquivo de propriedades da aplicação.
     *
     * @return Retorna o arquivo de propriedades carregado.
     * @throws IOException
     * @since v1.1
     */
    public static Properties loadProperties() throws IOException {

        Properties properties = new Properties();

        FileInputStream file = new FileInputStream(
                "C:\\Java\\workspace\\supermarket\\src\\main\\resources\\application.properties"
        );

        properties.load(file);

        return properties;
    }
}
