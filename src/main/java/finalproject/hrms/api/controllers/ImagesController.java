package finalproject.hrms.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finalproject.hrms.business.abstracts.ImageService;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

	private ImageService imageService;

	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
}
