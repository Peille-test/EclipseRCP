 
package com.opcoach.training.rental.ui;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;

public class RentalAddon {

	@PostConstruct
	public void rentalInit(IEclipseContext ctx, IExtensionRegistry reg ) {
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
		
		for(IConfigurationElement elt : reg.getConfigurationElementsFor("com.opcoach.training.rental.ui.Device")) {
			System.out.println("j'ai trouver : " + elt.getName()  + ", class : " + elt.getAttribute("driver"));
			System.out.println("id : " + elt.getAttribute("Id"));
		}
		
	}

}
