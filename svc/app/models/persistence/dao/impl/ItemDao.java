package models.persistence.dao.impl;

import com.google.inject.Inject;
import models.persistence.dao.GenericDao;
import models.persistence.dao.play.EntityManagerProvider;
import models.persistence.entities.ProjectEntity;

/**
 * Created by a614407 on 18/01/2016.
 */

public class ItemDao extends GenericDao<ProjectEntity> {
    @Inject
    public ItemDao(EntityManagerProvider emp) {super(emp);}
}
