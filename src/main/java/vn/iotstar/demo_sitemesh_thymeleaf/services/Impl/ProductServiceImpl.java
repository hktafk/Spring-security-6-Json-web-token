package vn.iotstar.demo_sitemesh_thymeleaf.services.Impl;

public class ProductServiceImpl  implements ProductServices {
	@Autowired
	private ProductRepository repo;
	public ProductServiceImpl(ProductRepository repo) {
	this.repo repo;
	
	@Override
	public List<Product> listAll() { 
		return repo.findAll();
	}
	
	@Override
	public Product save (Product product) { 
		return repo.save(product);
	}
	
	@Override
	public Product get (Long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void delete (Long id) {
	repo.deleteById(id);
 } 
}
