package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.Image;

public interface ImageService {

	DataResult<List<Image>> getAll();

	Result add(Image image);

	Result delete(int id);

	DataResult<Image> getById(int id);

}
