package com.watson.ObeyingDesignPrinciples.OCP;

public class VehicleInsuranceSurveyor  extends  InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.print("VehicleInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
