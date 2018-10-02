package phone.src;

public class Iphone extends Phone implements Ringable {
	
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	@Override
    public String ring() {
        return "Iphone " + this.getVersionNumber() + " " + this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Iphone is unlock now!!!";
    }
    @Override
    public void displayInfo() {
       System.out.println("Iphone " + this.getVersionNumber() + " from " + this.getCarrier());         
    }
}
