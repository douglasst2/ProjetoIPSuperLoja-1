package Produto;

public interface RepositorioProduto {
	public String removerProduto(String nomeproduto) throws ProdutoNaoRemovidoException;

	public boolean existeProduto(String nomeproduto) throws ProdutoInexistenteException;

	public void cadastrarProduto(Produto produto);

	public Produto procurarProduto(String nomedoproduto) throws ProdutoNaoEncontradoException;

	public void atualizarProduto(Produto produto, String nomedoproduto) throws ProdutoNaoAtualizadoException;
}
