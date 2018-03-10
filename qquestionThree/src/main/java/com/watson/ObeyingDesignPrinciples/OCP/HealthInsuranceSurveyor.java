package com.watson.ObeyingDesignPrinciples.OCP;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

    public HealthInsuranceSurveyor() {
    }

    @Override
    public boolean isValidClaim() {
        System.out.print("HealthInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
