package com.quickbite.service;

import java.util.List;

import com.quickbite.Exception.ReviewException;
import com.quickbite.model.Review;
import com.quickbite.model.User;
import com.quickbite.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
