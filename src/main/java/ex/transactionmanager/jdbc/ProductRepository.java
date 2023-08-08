package ex.transactionmanager.jdbc;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    @Qualifier("readJdbcTemplate")
    private final JdbcTemplate read;

    @Qualifier("crudJdbcTemplate")
    private final JdbcTemplate crud;

    public String getProduct(Long productId) {
        return null;
    }

    public int insertOrder(Order order) {
        return 0;
    }
}
