package util.webservice;

import javax.xml.ws.WebFault;

/**
 * @author inso
 */
@WebFault(faultBean="util.webservice.SpicsWebserviceFault")
public class SpicsWebserviceException extends Exception {

	/**
	 * Default serial version id
	 */
	private static final long serialVersionUID = 1L;

	private String code;
	private String description;
	private String[] vars;
	
	private SpicsWebserviceFault fault;
	
	public SpicsWebserviceException() {
		super();
	}
	
	public SpicsWebserviceException(String message, SpicsWebserviceFault fault, Throwable cause) {
		super(message, cause);
		this.fault = fault;
	}
	
	public SpicsWebserviceException(String message, SpicsWebserviceFault fault) {
		super(message);
		this.fault = fault;
	}
	
	public SpicsWebserviceFault getFaultInfo() {
		return fault;
	}
	
	public SpicsWebserviceException(String code, String description,
			String... vars) {
		this.code = code;
		this.description = description;
		this.vars = vars;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getVars() {
		return vars;
	}

	public void setVars(String[] vars) {
		this.vars = vars;
	}
}
