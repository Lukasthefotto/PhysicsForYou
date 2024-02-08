public class Mechanics {

    // Calculate velocity (v = ds/dt)
    public static double calculateVelocity(double displacement, double time) {
        if(time == 0) throw new IllegalArgumentException("Time cannot be zero.");
        return displacement / time;
    }

    // Calculate kinetic energy (K = 1/2 * m * v^2)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // Calculate gravitational potential energy (Ug = m * g * h)
    public static double calculateGravitationalPotentialEnergy(double mass, double height, double gravity) {
        return mass * gravity * height;
    }
    
    // Calculate acceleration (a = Δv/Δt)
    public static double calculateAcceleration(double finalVelocity, double initialVelocity, double time) {
        return (finalVelocity - initialVelocity) / time;
    }

    // Calculate force from Newton's second law (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // Calculate momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // Calculate work done by a force (W = F * d * cos(θ))
    public static double calculateWork(double force, double displacement, double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        return force * displacement * Math.cos(angleInRadians);
    }

    // Calculate power (P = W/t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // Calculate centripetal acceleration (ac = v^2/r)
    public static double calculateCentripetalAcceleration(double velocity, double radius) {
        return Math.pow(velocity, 2) / radius;
    }

    // Calculate impulse (J = F * Δt)
    public static double calculateImpulse(double force, double time) {
        return force * time;
    }

    // Calculate angular velocity (ω = θ/t)
    public static double calculateAngularVelocity(double angularDisplacement, double time) {
        return angularDisplacement / time;
    }

    // Calculate angular acceleration (α = Δω/Δt)
    public static double calculateAngularAcceleration(double finalAngularVelocity, double initialAngularVelocity, double time) {
        return (finalAngularVelocity - initialAngularVelocity) / time;
    }

    // Calculate torque (τ = r * F * sin(θ))
    public static double calculateTorque(double radius, double force, double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        return radius * force * Math.sin(angleInRadians);
    }
}