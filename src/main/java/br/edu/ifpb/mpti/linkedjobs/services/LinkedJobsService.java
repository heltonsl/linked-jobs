package br.edu.ifpb.mpti.linkedjobs.services;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.ifpb.mpti.linkedjobs.model.Job;

@Path("/jobs")
public class LinkedJobsService {

    @Inject EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Job> getJobs() {
        return entityManager.createQuery("select j from Jobs j", Job.class).getResultList();
    }
}