package dataBase;

import java.util.List;

import com.bean.VendorTenderAssignedFullDetails;

public interface Vendor_Tender_DAO {
	public List<VendorTenderAssignedFullDetails> viewAssignedDetails(int bid_tender)throws TenderAssignedException;
}
