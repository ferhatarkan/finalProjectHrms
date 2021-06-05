package finalproject.hrms.business.abstracts;

import java.util.List;

import finalproject.hrms.core.utilities.results.DataResult;
import finalproject.hrms.core.utilities.results.Result;
import finalproject.hrms.entities.concretes.CvLanguage;

public interface CvLanguageService {

	Result deleteLanguage(int languageId);

	DataResult<List<CvLanguage>> getByCvId(int cvId);

}
