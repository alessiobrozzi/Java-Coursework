public class FloatDiv {
    public static void main(String args[]) {
        int age = Integer.parseInt(args[0]);
        int exposure = Integer.parseInt(args[1]);

        System.out.format("Patient Age: %d%n", age);
        System.out.format("Days since bitten: %d%n", exposure);
        
        double exp1 = exposure;
        double age1 = age;
        double dose = ((exp1 * 250) / age1);
        System.out.format("Dosage of antidote: %.3fmg%n", dose);
    }
}