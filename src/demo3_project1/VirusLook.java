package demo3_project1;

class VirusLook {
	public static void main(String arguments[]) {
		Virus smash = new Virus();
		Virus crash = new Virus();
		Virus crumble = new Virus();
		System.out.println("There are " + smash.thisVirus + " smash viruses.");
		System.out.println("There are " + crash.thisVirus + " crash viruses.");
		System.out.println("There are " + crumble.thisVirus + " smash viruses.");
		crumble.localVirus();
		System.out.println("There are " + Virus.getVirusCount() + " total viruses.");

	}
}
