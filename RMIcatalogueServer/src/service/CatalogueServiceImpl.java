package service;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import metier.MetierCatalogueImpl;
import metier.Produit;

public class CatalogueServiceImpl extends UnicastRemoteObject implements IcatalogueRemote{
	
	private MetierCatalogueImpl metier=new MetierCatalogueImpl();
	
	public CatalogueServiceImpl() throws RemoteException {
		
	}

	@Override
	public List<Produit> consulterProduitsParMC(String mc) throws RemoteException {
		// TODO Auto-generated method stub
		return metier.getProduitsParMC(mc);
	}

	@Override
	public List<Produit> consulterProduits() throws RemoteException {
		// TODO Auto-generated method stub
		return metier.listProduits();
	}

	@Override
	public Produit consulterProduit(Long idP) throws RemoteException {
		// TODO Auto-generated method stub
		return metier.getProduit(idP);
	}

	@Override
	public double getPrixMoyen() throws RemoteException {
		List<Produit> prods=metier.listProduits();
		double some=0;
		for(Produit p:prods){
			some=some+p.getPrix();
		}		
		return some/prods.size();
	}

}
