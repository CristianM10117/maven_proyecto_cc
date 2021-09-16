package ejercicios.clases.wrappers;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//byte primitivo 
	byte datoByte = 2; 
	Byte datoByteWrapper = 3;  //Wrapper
	
	System.out.println("primitivo: "+datoByte);
	System.out.println("Wrapper: "+datoByteWrapper);
	//conversiones
	byte datoByte1 = 6; 
	Byte datoConvertido = datoByte1; 
	System.out.println("Byte convertido: "+datoConvertido);
	//Conversiones 2
	Byte datoConvertido2 = 6; 
	byte datoByte2 = datoConvertido.byteValue(); 
	System.out.println("byte convertido: "+datoByte2);
	
    //short
	short datoShort = 1; //primitivo
	Short datoShortWrapper = 1; //Wrapper
	
	System.out.println("primitivo: "+datoShort);
	System.out.println("Wrapper: "+datoShortWrapper);
	//Conversiones
		short datoShort1 = 4; 
		Short datoShortConvertido = datoShort1;
		System.out.println("Short convertido: "+datoShortConvertido);
		//Conversiones 2
		Short datoShort2 = 5; 
		short datoShortConvertido2 = datoShort2.shortValue();
		System.out.println("short convertido: "+datoShortConvertido2);
	
	//int 
	int edad = 45; //primitivo
	Integer edadWrapper = 48; //Wrapper
	System.out.println("primitivo: "+edad);
	System.out.println("Wrapper: "+edadWrapper);
	//Conversiones 
	int edad1 = 45; 
	Integer integerConvertido = edad1; 
	System.out.println("Int convertido: "+integerConvertido);
	//Conversiones 2
	Integer edad2 = 30; 
	int DatoInteger = edad2.intValue();
	
	//long
	long valorGrande = 12343; //primitivo
	Long valorGrandeWrapper = (long) 2342423; //Wrapper
	
	System.out.println("primitivo: "+valorGrande);
	System.out.println("Wrapper: "+valorGrandeWrapper);
	//Conversiones
	long valorGrande1 = 45345;
	Long valorLongConvertido = valorGrande1; 
	System.out.println("Long convertido: "+valorLongConvertido);
	//Conversiones 2
	Long valorGrande2 = (long) 23424; 
	long valorLongConvertido2 = valorGrande2.longValue();
	System.out.println("Long convertido: "+valorLongConvertido2);
	
	//boolean
	boolean valorTrue = true; //primitivo
	Boolean valorTrueWrapper = true; //Wrapper
	
	System.out.println("primitivo: "+valorTrue);
	System.out.println("Wrapper: "+valorTrueWrapper);
	//Conversiones
	boolean valorFalse = false; 
	Boolean valorBooleanConvertido = valorFalse;
	System.out.println("Boolean convertido: "+valorBooleanConvertido);
	//Conversiones 2
	Boolean valorFalse2 = false; 
	boolean valorBooleanConvertido2 = valorFalse2.booleanValue();
	System.out.println("Boolean convertido: "+valorBooleanConvertido2);
	
	//float
	float valorDecimal = (float) 2.10; //primitivo
	Float valorDecimalWrapper = (float) 2.20; //Wrapper
	
	System.out.println("primitivo: "+valorDecimal);
	System.out.println("Wrapper: "+valorDecimalWrapper);
	//Conversiones
	float valorDecimal1 = (float) 20.10; 
	Float valorFloatConvertido = valorDecimal1; 
	System.out.println("Float convertido: "+valorFloatConvertido);
	//Conversiones 2
	Float valorFloat2 = (float) 14.6; 
	float valorFloatConvertido2 = valorFloat2.floatValue();
	System.out.println("Float convertido: "+valorFloatConvertido2);
	
	//double
	double valorDecimal2 = 10.1; //primitivo
	Double valorDecimal2Wrapper = 20.13; //Wrapper
	
	System.out.println("primitivo: "+valorDecimal2);
	System.out.println("Wrapper: "+valorDecimal2Wrapper);
	//Conversiones
	double valorDouble = 1234.34; 
	Double valorDoubleConvertido = valorDouble;
	System.out.println("Double convertido: "+valorDoubleConvertido);
	//Conversiones 2
	Double valorDouble2 = 34534.32; 
	double valorDoubleConvertido2 = valorDouble2.doubleValue();
	System.out.println("Double convertido: "+valorDoubleConvertido2);
	
	//char
	char letra = 'A'; //primitivo
	Character letraWrapper = 'B'; //Wrapper
	
	System.out.println("primitivo: "+letra);
	System.out.println("Wrapper: "+letraWrapper);
	//Conversiones 
	char letra1 = 'C'; 
	Character valorCharConvertido = letra1; 
	System.out.println("Char convertido: "+valorCharConvertido);
	//Conversiones 2
	Character letra2 = 'D'; 
	char valorCharConvertido2 = letra2.charValue(); 
	System.out.println("Char convertido: "+valorCharConvertido2);
	}
}