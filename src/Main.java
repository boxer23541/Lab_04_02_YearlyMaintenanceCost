public class Main
{

    public static void main(String[] args)
    {
        double summerCost = 235.43;
        double fallCost = 321.53;
        double winterCost = 215.76;
        double springCost = 312.54;

        double yearlyCost = summerCost + fallCost + winterCost + springCost;

        System.out.printf("The home maintenance costs for%nSummer: $" + summerCost + "%nFall: $" + fallCost + "%nWinter: $" + winterCost + "%nSpring: $" + springCost + "%nYearly: $" + yearlyCost);
    }
}
