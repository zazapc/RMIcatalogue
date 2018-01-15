package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import metier.Produit;

public interface IcatalogueRemote extends Remote{
	
	public List<Produit> consulterProduitsParMC(String mc)throws RemoteException;
	public List<Produit> consulterProduits()throws RemoteException;
	public  Produit  consulterProduit(Long idP)throws RemoteException;
	public  double getPrixMoyen()throws RemoteException;

}
