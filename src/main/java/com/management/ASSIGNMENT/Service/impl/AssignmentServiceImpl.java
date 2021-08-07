package com.management.ASSIGNMENT.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.management.ASSIGNMENT.Entity.Assignment;
import com.management.ASSIGNMENT.Entity.Submission;
import com.management.ASSIGNMENT.Repository.AssignmentRepository;
import com.management.ASSIGNMENT.Service.AssignmentService;

@Service
public class AssignmentServiceImpl implements AssignmentService {
	
	private AssignmentRepository assignmentRepository;
	
	public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
		super();
		this.assignmentRepository = assignmentRepository;
	}

	@Override
	public List<Assignment> getAllAssignments() {
		return assignmentRepository.findAll();
	}

	@Override
	public Assignment saveAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}

	@Override
	public Assignment getAssignmentById(long id) {
		return assignmentRepository.findById(id).get();
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {	
		return assignmentRepository.save(assignment);
	}

	@Override
	public void deleteAssignmentById(Long id) {
		assignmentRepository.deleteById(id);	
	}

}
