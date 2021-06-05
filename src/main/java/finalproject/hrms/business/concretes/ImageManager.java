package finalproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalproject.hrms.business.abstracts.ImageService;
import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.ErrorDataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.core.utilities.results.SuccessDataResult;
import finalproject.hrms.core.utilities.results.SuccessResult;
import finalproject.hrms.dataAccess.abstracts.ImageDao;
import finalproject.hrms.entities.concretes.Image;
@Service
public class ImageManager implements ImageService{
	 ImageDao imageDao;

	    @Autowired
	    public ImageManager(ImageDao imageDao) {
	        this.imageDao = imageDao;
	    }

	    @Override
	    public DataResult<List<Image>> getAll() {
	        return new SuccessDataResult<List<Image>>(this.imageDao.getByOrderById(),"Data listelendi");
	    }

		@Override
	    public Result add(Image image) {
	        this.imageDao.save(image);
	        return new SuccessResult("Başarıyla eklendi");
	    }

		@Override
	    public Result delete(int id) {
	        this.imageDao.deleteById(id);
	        return new SuccessResult("Başarıyla silindi");
	    }

		@Override
	    public DataResult<Image> getById(int id) {
	        if(!this.imageDao.existsById(id)){
	            return new ErrorDataResult<Image>("Bu idye ait resim bulunamadı");
	        }
	        return new SuccessDataResult<Image>(this.imageDao.getOne(id),"Verilen id ye ait resim listelendi");
	    }

}
