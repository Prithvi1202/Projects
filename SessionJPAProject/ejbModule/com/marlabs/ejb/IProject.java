package com.marlabs.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.marlabs.ejb.entities.Project;

@Remote
public interface IProject {
	
	void saveProject(Project project);
    Project findProject(Project project);
    List<Project> retrieveAllProjects();

}
