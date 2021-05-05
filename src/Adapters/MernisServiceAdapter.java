package Adapters;

import java.rmi.RemoteException;
import java.util.Calendar;

import Abstract.GamerCheckServiceInterface;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckServiceInterface{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
		             Long.parseLong(gamer.getNationalityId()),
		            				gamer.getFirstName().toUpperCase(),
		            				gamer.getLastName().toUpperCase(),
		            				gamer.getDateOfBirth().get(Calendar.YEAR));
		} catch (NumberFormatException | RemoteException e) {
				e.printStackTrace();
		}
		return result;
	}
	

}
