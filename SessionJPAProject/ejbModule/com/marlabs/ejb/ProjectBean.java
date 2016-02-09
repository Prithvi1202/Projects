package com.marlabs.ejb;

import javax.ejb.Stateless;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.marlabs.ejb.entities.Project;



/**
 * Session Bean implementation class ProjectBean
 */
@Stateless(mappedName = "project")
public class ProjectBean implements IProject {

	@PersistenceContext(unitName = "JPADB")
    private EntityManager entityManager;
 
    public ProjectBean() {   }
 
    @Override
    public void saveProject(Project project) {
        entityManager.persist(project);
    }
 
    @Override
    public Project findProject(Project project) {
        Project p = entityManager.find(Project.class,
                    project.getPnumber());
        return p;
    }
 
    @Override
    public List<Project> retrieveAllProjects() {
 
        String q = "SELECT p from " + Project.class.getName() + " p";
        Query query = entityManager.createQuery(q);
        List<Project> projects = query.getResultList();
        return projects;
    }

}
