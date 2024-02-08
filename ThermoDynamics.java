public class Thermodynamics {

    // Calculate thermal expansion (ΔL = α * L_0 * ΔT)
    public static double calculateThermalExpansion(double coefficientOfLinearExpansion, double initialLength, double temperatureChange) {
        return coefficientOfLinearExpansion * initialLength * temperatureChange;
    }

    // Calculate heat transferred (Q = m * c * ΔT)
    public static double calculateHeatTransferred(double mass, double specificHeatCapacity, double temperatureChange) {
        return mass * specificHeatCapacity * temperatureChange;
    }

    // Calculate latent heat (Q = m * L)
    public static double calculateLatentHeat(double mass, double latentHeat) {
        return mass * latentHeat;
    }

    // Calculate change in internal energy for an ideal gas (ΔU = m * Cv * ΔT)
    public static double calculateInternalEnergyChange(double mass, double specificHeatAtConstantVolume, double temperatureChange) {
        return mass * specificHeatAtConstantVolume * temperatureChange;
    }

    // Calculate efficiency of a heat engine (η = W_out / Q_in)
    public static double calculateHeatEngineEfficiency(double workOutput, double heatInput) {
        if (heatInput == 0) throw new IllegalArgumentException("Heat input cannot be zero.");
        return workOutput / heatInput;
    }
    
  // Calculate change in entropy (ΔS = Q / T)
    public static double calculateEntropyChange(double heat, double temperature) {
        if (temperature == 0) throw new IllegalArgumentException("Temperature cannot be zero.");
        return heat / temperature;
    }

    // Calculate specific heat at constant pressure (Cp = Q / (m * ΔT))
    public static double calculateSpecificHeatAtConstantPressure(double heat, double mass, double temperatureChange) {
        if (temperatureChange == 0) throw new IllegalArgumentException("Temperature change cannot be zero.");
        return heat / (mass * temperatureChange);
    }

    // Calculate specific heat at constant volume (Cv = ΔU / (m * ΔT))
    public static double calculateSpecificHeatAtConstantVolume(double internalEnergyChange, double mass, double temperatureChange) {
        if (temperatureChange == 0) throw new IllegalArgumentException("Temperature change cannot be zero.");
        return internalEnergyChange / (mass * temperatureChange);
    }

    // Calculate coefficient of volume expansion (β = ΔV / (V_0 * ΔT))
    public static double calculateCoefficientOfVolumeExpansion(double volumeChange, double initialVolume, double temperatureChange) {
        if (temperatureChange == 0) throw new IllegalArgumentException("Temperature change cannot be zero.");
        return volumeChange / (initialVolume * temperatureChange);
    }

    // Calculate heat transfer for phase change (Q = m * L)
    public static double calculateHeatForPhaseChange(double mass, double latentHeat) {
        return mass * latentHeat;
    }

}