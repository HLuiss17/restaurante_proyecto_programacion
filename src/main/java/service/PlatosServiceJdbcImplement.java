package service;

import models.Platos;
import repositories.PlatosRepositoryJdbcImplement;
import repositories.Repository;

import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PlatosServiceJdbcImplement implements PlatosService{
    //DECLARO UNA variable de de la clase repository llamamos al modelo platos
    private Repository<Platos> repositoryJdbc;
    // Creamos un constructor
    public PlatosServiceJdbcImplement(Connection connection) {
        this.repositoryJdbc = new PlatosRepositoryJdbcImplement(connection);
    }

    @Override
    public List<Platos> listar() {
        try {
            return repositoryJdbc.listar();
        } catch (SQLException throwables) {
            throw new ServiceJdbcException(throwables.getMessage(), throwables.getCause());
        }
    }

    @Override
    public Optional<Platos> agregarPorId(Long idplato) {
        return Optional.empty();
    }

    @Override
    public void guardar(Platos plato) {

    }

    @Override
    public void eliminar(Long id) {

    }
}
