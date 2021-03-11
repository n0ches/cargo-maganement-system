
public class Packet {
	private int packetID;
	private int senderCustomer;
	private int receiverCustomer;
	private int weight;
	private String volume;
	private Date date;
	private int price;
	private Boolean status;
	private int availibility;
	
	public Packet(int senderCustomer, int receiverCustomer, int weight, String volume,Date date) {
		this.senderCustomer = senderCustomer;
		this.receiverCustomer = receiverCustomer;
		this.weight = weight;
		this.volume = volume;
		this.date = date;
		status=true;
		availibility=0;
	}
	public Packet() {
		this.packetID=-1;
		this.senderCustomer = -1;
		this.receiverCustomer = -1;
		this.weight = 0;
		this.volume = null;
		this.date = null;
		status=false;
		availibility=(-2);
	}
	
		public int calculate(int weight,String volume) {
			int price=0;
			if(weight<6) {
				if(volume.equals("small")) 
				{
					price= 10;
				}
				else if(volume.equals("medium")) {
					price= 15;
				}
				else if(volume.equals("large")) {
					price= 20;
				}
			}
			else if(weight<11 && weight>6) {
				if(volume.equals("small")) 
				{
					price= 25;
				}
				else if(volume.equals("medium")) {
					price= 30;
				}
				else if(volume.equals("large")) {
					price= 40;
				}
			}
			else if(weight>=11) {
				if(volume.equals("small")) 
				{
					price= 45;
				}
				else if(volume.equals("medium")) {
					price= 50;
				}
				else if(volume.equals("large")) {
					price= 55;
				}
			}
			return price;
		}
	
	
	/**
	 * @return the availibility
	 */
	public int getAvailibility() {
		return availibility;
	}
	/**
	 * @param availibility the availibility to set
	 */
	public void setAvailibility(int availibility) {
		this.availibility = availibility;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @return the packetID
	 */
	public int getPacketID() {
		return packetID;
	}

	/**
	 * @param packetID the packetID to set
	 */
	public void setPacketID(int packetID) {
		this.packetID = packetID;
	}

	/**
	 * @return the senderCustomer
	 */
	public int getSenderCustomer() {
		return senderCustomer;
	}

	/**
	 * @param senderCustomer the senderCustomer to set
	 */
	public void setSenderCustomer(int senderCustomer) {
		this.senderCustomer = senderCustomer;
	}

	/**
	 * @return the receiverCustomer
	 */
	public int getReceiverCustomer() {
		return receiverCustomer;
	}

	/**
	 * @param receiverCustomer the receiverCustomer to set
	 */
	public void setReceiverCustomer(int receiverCustomer) {
		this.receiverCustomer = receiverCustomer;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	public void display() {
		System.out.println("Weight: "+ this.weight);
		System.out.println("Volume: " + this.volume);
		System.out.println("Date: " + date.display());
	}
	
}
