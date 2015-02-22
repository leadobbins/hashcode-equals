/**
 * 
 */
package com.distinctive_software.collections.hashcode_equals;

import java.util.Objects;
import java.util.UUID;

/**
 * Demo class for hashCode and Equals
 * 
 * @author ladobbins
 *
 */
public class EmployeeId {
	
	private UUID id;

	public EmployeeId() {
		super();
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final EmployeeId other = (EmployeeId) obj;
		return Objects.equals(id, other.id);
	}
		
	
}
