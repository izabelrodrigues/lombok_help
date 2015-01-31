package lombok_help;

public class LombokTeste {

	public static void main(String[] args) {
		ModelExampleLombok modelExampleLombok = new ModelExampleLombok();
		modelExampleLombok.setAtributo01(01);
		
		int atributo01 = modelExampleLombok.getAtributo01();
		int hasCode = modelExampleLombok.hashCode();
		
		System.out.println("atributo01: " + atributo01);
		System.out.println("hasCode: " + hasCode);
		System.out.println("equals: " + modelExampleLombok.equals(new ModelExampleLombok()));
		
		ModelExampleLombok modelExampleLombok2 = new ModelExampleLombok(01, "atributo02", "atributo03", false, 10.0, 06);
		System.out.println("atributo05 - objeto02: " + modelExampleLombok2.getAtributo05());

	}
}
