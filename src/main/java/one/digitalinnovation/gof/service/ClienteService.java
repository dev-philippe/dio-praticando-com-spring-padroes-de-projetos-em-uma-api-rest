package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão </b> no domínio de cliente.Com
 * isso, se necessário, podemos ter multiplos implementações dessa mesma
 * interface.
 *
 * @author devphilippe
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(long id);


    void deletar(Long id);
}
