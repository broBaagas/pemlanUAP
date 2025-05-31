package models;
import interfaces.*;
import bases.Shape;
import java.text.NumberFormat;
import java.util.Locale;

public class Torus extends Shape implements MassCalculable, MassConverter, PIrequired, ShippingCostCalculator, ThreeDimensional {
    private double majorRadius;
    private double minorRadius;

    @Override
    public double getaMass() {
        return DENSITY * THICKNESS * getSurfaceArea();
    }

    @Override
    public double getSurfaceArea(){
        return 4 * (PIE * PIE) * majorRadius * minorRadius;
    }

    public Torus() {

    }

    public Torus(double minorRadius, double majorRadius) {
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * (PIE * PIE) * majorRadius * (minorRadius * minorRadius);
    }

    @Override
    public double gramToKilogram() {
        return getaMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t: " + getaMass());
        System.out.println("Massa dalam kilogram\t: " + gramToKilogram());
        System.out.println("Shipping Cost\t: " + rupiahFormat.format(calculateCost()));
    }

    NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));


}
