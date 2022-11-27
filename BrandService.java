package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.reponses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;


public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
