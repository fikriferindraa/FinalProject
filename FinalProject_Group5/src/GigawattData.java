
public class GigawattData {
	
	String BillDate, Name, Address, AccountNumber;
	int Arrears, OldMeter, NewMeter; 
	double Total_Unit, TotalCharge, Total_Bill;
	
	public GigawattData(String ud1, String ud2, String ud3, String ud4, int ud5, int ud6, int ud7, double TU, double TC, double TB) 
	{
		this.AccountNumber = ud1;
		this.BillDate = ud2;
		this.Name = ud3;
		this.Address = ud4;
		this.Arrears = ud5;
		this.OldMeter = ud6;
		this.NewMeter = ud7;
		this.Total_Unit = TU;
		this.TotalCharge = TC;
		this.Total_Bill = TB;
	}
	// getter
    public String getBillDate() {
        return BillDate;
    }
    public String getAccountNo() {
        return AccountNumber;
    }
    public String getUserName() {
        return Name;
    }
    public String getUserAddress() {
        return Address;
    }
    public double getOverdueAmt() {
        return Arrears;
    }
    public double getOldMeter() {
        return OldMeter;
    }
    public double getNewMeter() {
        return NewMeter;
    }
    public double getTotalUsage() {
        return Total_Unit;
    }
    public double getTotalCharge() {
        return TotalCharge;
    }
    public double getTotalBill() {
        return Total_Bill;
    }
    //setter
    public void setTotalUsage(double totalUsage) {
        this.Total_Unit = totalUsage;
    }
    public void setTotalCharge(double totalCharge) {
        this.TotalCharge = totalCharge;
    }
    public void setTotalBill(double totalBill) {
        this.Total_Bill = totalBill;
    }
}
