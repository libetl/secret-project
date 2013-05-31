package org.cylio.project.bi.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


  public enum ModelProvider {
    INSTANCE;

    private List<BusinessInformation> businessInformations;

    private ModelProvider() {
      businessInformations = new ArrayList<BusinessInformation>();
      businessInformations.add (new BusinessInformation ("bi1", "desc1", 
          Arrays.asList (new String []{"taga1", "taga2"})));
      businessInformations.add (new BusinessInformation ("bi2", "desc2", 
          Arrays.asList (new String []{"tagb1", "tagb2"})));
      businessInformations.add (new BusinessInformation ("bi3", "desc3", 
          Arrays.asList (new String []{"tagc1", "tagc2"})));
    }

    public List<BusinessInformation> getbusinessInformations() {
      return businessInformations;
    }

  }
