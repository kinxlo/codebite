package model;


public enum Element {

	/* SYMBOL NAME ATOMIC_WEIGHT ELECTRONEGATIVITY ELECTRONIC CONFIGURATION*/
	H("Hydrogen", 1.00794f, 2.1f, "1s1"), 
	He("Helium", 4.0026f, 0, "1s2"), 
	Li("Lithium",6.941f, 0.98f, "[He]2s1"), 
	Be("Beryllium", 9.01218f, 1.57f, "[He]2s2"), 
	B("Boron",10.811f, 2.04f, "[He]2s22p1"), 
	C("Carbon", 12.011f, 2.55f, "[He]2s22p2"), 
	N("Nitrogen",14.0067f, 3.04f, "[He]2s22p3"), 
	O("Oxygen", 15.9994f, 3.44f, "[He]2s22p4"), 
	F("Fluorine",18.9984f, 3.98f, "[He]2s22p5"), 
	Ne("Neon", 20.1797f, 0, "[He]2s22p6"), 
	Na("Sodium", 22.98977f,0.93f, "[Ne]3s1"), 
	Mg("Magnesium", 24.305f, 1.31f, "[Ne]3s2"), 
	Al("Aluminum", 26.98154f,1.61f, "[Ne]3s23p1"), 
	Si("Silicon", 28.0855f, 1.9f, "[Ne]3s23p2"), 
	P("Phosphorus", 30.97376f,2.19f, "[Ne]3s23p3"), 
	S("Sulfur", 32.066f, 2.58f, "[Ne]3s23p4"), 
	Cl("Chlorine", 35.4527f, 3.16f, "[Ne]3s23p5"), 
	Ar("Argon", 39.948f, 0, "[Ne]3s23p6"), 
	K("Potassium", 39.0983f, 0.82f, "[Ar]4s1"), 
	Ca("Calcium", 40.078f, 1, "[Ar]4s2"), 
	Sc("Scandium", 44.9559f, 1.36f, "[Ar]3d14s2"), 
	Ti("Titanium", 47.88f, 1.54f, "[Ar]3d24s2"), 
	V("Vanadium", 50.9415f, 1.63f, "[Ar]3d34s2"), 
	Cr("Chromium", 51.996f, 1.66f, "[Ar]3d54s1"), 
	Mn("Manganese", 54.938f, 1.55f, "[Ar]3d54s2"), 
	Fe("Iron", 55.847f, 1.83f, "[Ar]3d64s2"), 
	Co("Cobalt", 58.9332f, 1.88f, "[Ar]3d74s2"), 
	Ni("Nickel", 58.6934f, 1.91f, "[Ar]3d84s2"), 
	Cu("Copper", 63.546f, 1.9f, "[Ar]3d104s1"), 
	Zn("Zinc",65.39f, 1.65f, "[Ar]3d104s2"), 
	Ga("Gallium", 69.723f, 1.81f, "[Ar]3d104s24p1"), 
	Ge("Germanium",72.61f, 2.01f, "[Ar]3d104s24p2"), 
	As("Arsenic", 74.9216f, 2.18f, "[Ar]3d104s24p3"), 
	Se("Selenium",78.96f, 2.55f, "[Ar]3d104s24p4"), 
	Br("Bromine", 79.904f, 2.96f, "[Ar]3d104s24p5"), 
	Kr("Krypton", 83.8f,0, "[Ar]3d104s24p6"), 
	Rb("Rubidium", 85.4678f, 0.82f, "[Kr]5s1"), 
	Sr("Strontium", 87.62f, 0.95f, "[Kr]5s2"), 
	Y("Yttrium", 88.9059f, 1.22f, "[Kr]4d15s2"), 
	Zr("Zirconium", 91.224f, 1.33f, "[Kr]4d25s2"), 
	Nb("Niobium", 92.9064f, 1.6f, "[Kr]4d45s1"), 
	Mo("Molybdenum", 95.94f, 2.16f, "[Kr]4d55s1"), 
	Tc("Technetium", 98, 1.9f, "[Kr]4d55s2"), 
	Ru("Ruthenium", 101.07f, 2.2f, "[Kr]4d75s1"), 
	Rh("Rhodium", 102.9055f, 2.28f, "[Kr]4d85s1"), 
	Pd("Palladium", 106.42f, 2.2f, "[Kr]4d10"), 
	Ag("Silver", 107.868f, 1.93f, "[Kr]4d105s1"), 
	Cd("Cadmium", 112.41f, 1.69f, "[Kr]4d105s2"), 
	In("Indium", 114.82f, 1.78f, "[Kr]4d105s25p1"), 
	Sn("Tin", 118.71f, 1.96f, "[Kr]4d105s25p2"), 
	Sb("Antimony", 121.757f, 2.05f, "[Kr]4d105s25p3"), 
	Te("Tellurium", 127.6f, 2.1f, "[Kr]4d105s25p4"), 
	I("Iodine", 126.9045f, 2.66f, "[Kr]4d105s25p5"), 
	Xe("Xenon", 131.29f, 2.6f, "[Kr]4d105s25p6"), 
	Cs("Cesium", 132.9054f, 0.79f, "[Xe]6s1"), 
	Ba("Barium", 137.33f, 0.89f, "[Xe]6s2"), 
	La("Lanthanum", 138.9055f, 1.1f, "[Xe]5d16s2"), 
	Ce("Cerium", 140.12f, 1.12f, "[Xe]4f15d16s2"), 
	Pr("Praseodymium", 140.9077f, 1.13f, "[Xe]4f36s2"), 
	Nd("Neodymium", 144.24f, 1.14f, "[Xe]4f46s2"), 
	Pm("Promethium", 145, 1.13f, "[Xe]4f56s2"), 
	Sm("Samarium", 150.36f, 1.17f, "[Xe]4f66s2"), 
	Eu("Europium", 151.965f, 1.2f, "[Xe]4f76s2"), 
	Gd("Gadolinium", 157.25f, 1.2f, "[Xe]4f75d16s2"), 
	Tb("Terbium", 158.9253f, 1.1f, "[Xe]4f96s2"), 
	Dy("Dysprosium", 162.5f, 1.22f, "[Xe]4f106s2"), 
	Ho("Holmium", 164.9303f, 1.23f, "[Xe]4f116s2"), 
	Er("Erbium", 167.26f, 1.24f, "[Xe]4f126s2"), 
	Tm("Thulium", 168.9342f, 1.25f, "[Xe]4f136s2"), 
	Yb("Ytterbium", 173.04f, 1.1f, "[Xe]4f146s2"), 
	Lu("Lutetium", 174.967f, 1.27f, "[Xe]4f145d16s2"), 
	Hf("Hafnium", 178.49f, 1.3f, "[Xe]4f145d26s2"), 
	Ta("Tantalum", 180.9479f, 1.5f, "[Xe]4f145d36s2"), 
	W("Tungsten", 183.85f, 2.36f, "[Xe]4f145d46s2"), 
	Re("Rhenium", 186.207f, 1.9f, "[Xe]4f145d56s2"), 
	Os("Osmium", 190.2f, 2.2f, "[Xe]4f145d66s2"), 
	Ir("Iridium", 192.22f, 2.2f, "[Xe]4f145d76s2"), 
	Pt("Platinum", 195.08f, 2.28f, "[Xe]4f145d96s1"), 
	Au("Gold", 196.9665f, 2.54f, "[Xe]4f145d106s1"), 
	Hg("Mercury", 200.59f, 2, "[Xe]4f145d106s2"), 
	Tl("Thallium", 204.383f, 2.04f, "[Xe]4f145d106s26p1"), 
	Pb("Lead", 207.2f, 2.33f, "[Xe]4f145d106s26p2"), 
	Bi("Bismuth", 208.9804f, 2.02f, "[Xe]4f145d106s26p3"), 
	Po("Polonium", 209, 2, "[Xe]4f145d106s26p4"), 
	At("Astatine", 210, 2.2f, "[Xe]4f145d106s26p5"), 
	Rn("Radon", 222, 0, "[Xe]4f145d106s26p6"), 
	Fr("Francium", 223,0.7f, "[Rn]7s1"), 
	Ra("Radium", 226.0254f, 0.89f, "[Rn]7s2"), 
	Ac("Actinium", 227, 1.1f, "[Rn]6d17s2"), 
	Th("Thorium", 232.0381f, 1.3f, "[Rn]6d27s2"), 
	Pa("Protactinium", 231.0359f, 1.5f, "[Rn]5f26d17s2"), 
	U("Uranium", 238.029f, 1.38f, "[Rn]5f36d17s2"), 
	Np("Neptunium", 237.0482f, 1.36f, "[Rn]5f46d17s2"), 
	Pu("Plutonium", 244, 1.28f, "[Rn]5f67s2"), 
	Am("Americium", 243, 1.3f, "[Rn]5f77s2"), 
	Cm("Curium",247, 1.3f, "[Rn]5f76d17s2"), 
	Bk("Berkelium", 247, 1.3f, "[Rn]5f97s2"), 
	Cf("Californium", 251, 1.3f, "[Rn]5f107s2"), 
	Es("Einsteinium", 252, 1.3f, "[Rn]5f117s2"), 
	Fm("Fermium", 257, 1.3f, "[Rn]5f127s2"), 
	Md("Mendelevium", 258, 1.3f, "[Rn]5f137s2"), 
	No("Nobelium", 259, 1.3f, "[Rn]5f147s2"), 
	Lr("Lawrencium", 262, 0, "[Rn]5f147s27p1"), 
	Rf("Rutherfordium", 261, 0, "[Rn]5f146d27s2"), 
	Db("Dubnium",262, 0, "[Rn]5f146d37s2"), 
	Sg("Seaborgium", 263, 0, "[Rn]5f146d47s2"), 
	Bh("Bohrium", 262, 0, "[Rn]5f146d57s2"), 
	Hs("Hassium", 265, 0, "[Rn]5f146d67s2"), 
	Mt("Meitnerium", 266, 0, "[Rn]5f146d77s2"), 
	Ds("Darmstadtium",269, 0, "[Rn]5f146d97s1"), 
	Uub("Roentgenium", 272, 0, "[Rn]5f146d107s1"), 
	Uuc("Copernium", 277, 0, "[Rn]5f146d107s2"),
	Uud("Nihonium", 277, 0, "[Rn]5f146d107s27p1"),
	Uue("Flerovium", 277, 0, "[Rn]5f146d107s27p2"),
	Uuf("Moscovium", 277, 0, "[Rn]5f146d107s27p3"),
	Uug("Livermorium", 277, 0, "[Rn]5f146d107s27p4"),
	Uuh("Tennessine", 277, 0, "[Rn]5f146d107s27p5"),
	Uuj("Oganesson", 277, 0, "[Rn]5f146d107s27p6");


	private final String fullName;
	private final float atomicMass;
	private final float electroNegativity;
	private final String electronicConfiguration;
	
	private Element(String fullName, float atomicMass, float electroNegativity, String electronicConfiguration) {

		this.fullName = fullName;
		this.atomicMass = atomicMass;
		this.electroNegativity = electroNegativity;
		this.electronicConfiguration = electronicConfiguration;
		
	}

	/**
	 * Get the atomic number of this Element.
	 * 
	 * @return this Element's atomic number in 'u'
	 */
	public int getAtomicNumber() {
		return this.ordinal() + 1;
	}

	/**
	 * Get the symbol of this Element.
	 * 
	 * @return this Element's symbol (1 to 3 chars long)
	 */
	public String getSymbol() {
		return this.name();
	}

	/**
	 * Get the full name of this Element
	 * 
	 * @return this Element's full name (not the symbol)
	 */
	public String getFullName() {
		return this.fullName;
	}

	/**
	 * Get the atomic mass of this Element.
	 * 
	 * @return this Element's average atomic mass in 'u'
	 */
	public float getAtomicMass() {
		return this.atomicMass;
	}

	/**
	 * get the electron negativity of this Element.
	 * 
	 * @return this Element's electron negativity in Pauling
	 */
	public float getElectroNegativity() {
		return this.electroNegativity;
	}
	
	public String getElectronicConfiguration(){
		return this.electronicConfiguration;
	}

	/**
	 * Get a String representation of this Element.
	 * <p>
	 * For example:<br>
	 * <i>He[fullName="Helium", atomicMass="4.0026", electroNegativity="0"]</i>
	 * 
	 * @return a String representation of this Element.
	 */
	public String toString() {
		String display = "<html>"
							+ "<strong>"
							+ "Name: " + this.getFullName()
							+ "<br>"
							+ "Symbol: " + this.name()
							+ "<br>"
							+ "Atomic Number: " + this.getAtomicNumber() 
							+ "<br>"
							+ "Atomic mass: " + this.getAtomicMass() 
							+ "<br>"
							+ "Electro-negatvity: " + this.getElectroNegativity()
							+ "<br>"
							+ "Electronic Configuration: " + this.electronicConfiguration
							+ "<br>"
							+ "</strong>" +
						 "</html>";
		return display;
	}

	
}