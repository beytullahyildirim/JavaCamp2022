package kodlama.io.rentACar.business.reponses;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllBrandsResponse {
	private int id;
	private String name;
	
	

}
