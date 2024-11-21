package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.FizzRepository;
import repository.BuzzRepository;

public class FizzBuzzService {
	@Autowired
	private FizzRepository fizzRepository;

	@Autowired
	private BuzzRepository buzzRepository;
}
