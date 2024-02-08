public class FluidDynamics {

    // Calculate pressure at a depth in a fluid (P = P_0 + ρgh)
    public static double calculatePressureWithDepth(double surfacePressure, double density, double height, double gravity) {
        return surfacePressure + (density * gravity * height);
    }

    // Calculate buoyant force (B = ρ * V_displaced * g)
    public static double calculateBuoyantForce(double fluidDensity, double volumeDisplaced, double gravity) {
        return fluidDensity * volumeDisplaced * gravity;
    }

    // Calculate flow rate (Q = A * v)
    public static double calculateFlowRate(double area, double velocity) {
        return area * velocity;
    }

    // Calculate Reynolds number (Re = ρ * v * D / η)
    public static double calculateReynoldsNumber(double density, double velocity, double characteristicLength, double dynamicViscosity) {
        return (density * velocity * characteristicLength) / dynamicViscosity;
    }

    // Calculate drag force (Fd = 0.5 * ρ * v^2 * Cd * A)
    public static double calculateDragForce(double density, double velocity, double dragCoefficient, double area) {
        return 0.5 * density * Math.pow(velocity, 2) * dragCoefficient * area;
    }
    
    // Calculate dynamic viscosity (η = F * d / A * dv)
    public static double calculateDynamicViscosity(double force, double distance, double area, double velocityGradient) {
        return (force * distance) / (area * velocityGradient);
    }

    // Calculate Bernoulli's equation for fluid in motion (P + 0.5 * ρ * v^2 + ρ * g * h = constant)
    public static double calculateBernoulliPressure(double fluidDensity, double velocity, double height, double gravity, double totalPressure) {
        return totalPressure - (0.5 * fluidDensity * Math.pow(velocity, 2)) - (fluidDensity * gravity * height);
    }

    // Calculate volume flow rate (Qv = A * v)
    public static double calculateVolumeFlowRate(double area, double velocity) {
        return area * velocity;
    }

    // Calculate mass flow rate (ṁ = ρ * Qv)
    public static double calculateMassFlowRate(double density, double volumeFlowRate) {
        return density * volumeFlowRate;
    }

    // Calculate Froude number (Fr = v / √(g * l))
    public static double calculateFroudeNumber(double velocity, double gravity, double characteristicLength) {
        return velocity / Math.sqrt(gravity * characteristicLength);
    }

    // Calculate Mach number (Ma = v / c)
    public static double calculateMachNumber(double velocity, double speedOfSound) {
        return velocity / speedOfSound;
    }

    // Calculate bulk modulus (K = -ΔP / (ΔV/V_0))
    public static double calculateBulkModulus(double pressureChange, double volumeChange, double initialVolume) {
        if (initialVolume == 0) throw new IllegalArgumentException("Initial volume cannot be zero.");
        return -pressureChange / (volumeChange / initialVolume);
    }

    // Calculate surface tension force (F = γ * l)
    public static double calculateSurfaceTensionForce(double surfaceTension, double length) {
        return surfaceTension * length;
    }

    // Calculate capillary rise (h = 2 * γ * cos(θ) / (ρ * g * r))
    public static double calculateCapillaryRise(double surfaceTension, double contactAngle, double density, double gravity, double radiusOfTube) {
        return (2 * surfaceTension * Math.cos(Math.toRadians(contactAngle))) / (density * gravity * radiusOfTube);
    }

    // Calculate viscosity using Poiseuille's Law (η = (π * r^4 * ΔP) / (8 * l * Q))
    public static double calculateViscosityPoiseuillesLaw(double radius, double pressureDifference, double length, double flowRate) {
        if (flowRate == 0) throw new IllegalArgumentException("Flow rate cannot be zero.");
        return (Math.PI * Math.pow(radius, 4) * pressureDifference) / (8 * length * flowRate);
    }
    
    // Add more methods for fluid dynamics as necessary...
}
