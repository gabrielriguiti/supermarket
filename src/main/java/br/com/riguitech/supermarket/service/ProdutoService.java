package br.com.riguitech.supermarket.service;

import br.com.riguitech.supermarket.database.ConnectionOracle;
import br.com.riguitech.supermarket.model.entity.Produto;
import br.com.riguitech.supermarket.util.LogFile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @since v1.1
 * @version 1.0
 */
public class ProdutoService {

    /**
     * @since v1.1
     * @param produto Recebe uma instância de Produto com os dados que serão
     *                salvos no banco de dados.
     */
    public static void cadastrarProduto(Produto produto) {

        Connection connection = ConnectionOracle.openConnection();

        String sql = "INSERT INTO PRODUTOS (CODPROD, DESCRPROD, COMPLEMENTO, CODBARRAS, MARCA, PERCDESC)\n" +
                "VALUES (SEQ_PRODUTOS.NEXTVAL, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setString(2, produto.getComplemento());
            stmt.setLong(3, produto.getCodBarras());
            stmt.setString(4, produto.getMarca());
            stmt.setDouble(5, produto.getPercDesconto());
            stmt.executeUpdate();

        } catch (SQLException e) {

            LogFile.logger.info("Erro ao cadastro produto: "
                    .concat(e.getMessage()));
        }
    }
}
