package br.com.riguitech.supermarket.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @version 1.0
 * @since v1.1
 */
public class LogFile {

    public static Logger logger;

    /**
     * Criar e manipula o arquivo de log da aplicação.
     *
     * @since v1.1
     */
    public static void crateLog() {

        logger = Logger.getLogger("logTotal");

        FileHandler fileHandler;

        String diretorio = "C:\\Java\\workspace\\supermarket\\logs\\";
        String arquivo = "server.log";

        try {
            fileHandler = new FileHandler(diretorio + arquivo);

            logger.addHandler(fileHandler);

            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);

            logger.setUseParentHandlers(false);

        } catch (IOException e) {

            System.out.println("Erro ao gerar arquivo de log: "
                    .concat(e.getMessage()));
        }
    }
}
