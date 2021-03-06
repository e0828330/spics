package db.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Patient;
import entities.Trial;
import entities.TrialData;

@Local
public interface ITrialDataDAO extends IGenericDAO<TrialData, Long>{

	public boolean attributeGroupHasTrialData(Long agId);
	
	public boolean attributeHasTrialData(Long attId);
	
	public boolean trialFormHasTrialData(Long tfId);
	
	public long getTrialDataCount(Trial trial);
	
	public int getTrialDataCountForPersonalExport(Long trialId, String username);
	
	public List<TrialData> getTrialDatasForPersonalExport(Long trialId, String username, int offset, int count);

	public int getTrialDataCountForFullExport(Long trialId);
	
	public List<TrialData> getTrialDatasForFullExport(Long trialId, int offset, int count);
	
	public int getCountByPatient(Patient p);
	
	public void flush();
	
}
