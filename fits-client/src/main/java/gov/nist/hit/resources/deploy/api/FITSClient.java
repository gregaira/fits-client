package gov.nist.hit.resources.deploy.api;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import gov.nist.healthcare.cds.domain.SoftwareConfig;
import gov.nist.healthcare.cds.domain.TestCase;
import gov.nist.healthcare.cds.domain.TestPlan;
import gov.nist.healthcare.cds.domain.wrapper.Report;
import gov.nist.hit.resources.deploy.exception.InsupportedApiMethod;

public interface FITSClient {

	public ResponseEntity<List<TestPlan>> getTestPlans() throws InsupportedApiMethod;
	public ResponseEntity<List<Report>> execute(SoftwareConfig software, Date relativeAssessmentDate, List<TestCase> tcs) throws InsupportedApiMethod;
	public boolean validCredentials();
	public ResponseEntity<List<SoftwareConfig>> getSoftwareConfiguration() throws InsupportedApiMethod;
	
}
