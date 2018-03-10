package com.watson.ObeyingDesignPrinciples.OCP;

public class ClaimApprovalManager {

    public ClaimApprovalManager() {
    }
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....\n");
        }
    }

}
