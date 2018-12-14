package kr.or.ddit.service;

import kr.or.ddit.dao.ISampleDAO;

public class SampleService {	
//	SampleOracleDAO sampleDAO = new SampleOracleDAO();
//	ISampleDAO sampleDAO = new SampleOracleDAO();
//	1. factory method pattern
//	ISampleDAO sampleDAO = new SampleDAOFactory().getSampleDAO();
//	2. strategy pattern
	ISampleDAO sampleDAO;
	
	public void setSampleDAO(ISampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}
	
	public String retrieveSampleContent(String pk) {
		CharSequence rowData = sampleDAO.selectSampleData(pk);
		return rowData + "  를 다시 제가공함";
	}
}
