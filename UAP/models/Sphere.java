package models;
import bases.Shape;
import interfaces.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Sphere extends Shape implements ThreeDimensional, MassCalculable, MassConverter, PIrequired, ShippingCostCalculator {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere() {

    }

    @Override
    public double getSurfaceArea() {
        return 4 * PIE * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PIE * radius * radius * radius;
    }

    @Override
    public double getaMass() {
        return DENSITY * THICKNESS * getSurfaceArea();
    }

    @Override
    public void printInfo() {
        System.out.println("Volume\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t: " + getaMass());
        System.out.println("Massa dalam kilogram\t: " + gramToKilogram());
        System.out.println("Shipping Cost\t: " + rupiahFormat.format(calculateCost()));
    }

    @Override
    public double gramToKilogram() {
        return getaMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

     NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));



}
