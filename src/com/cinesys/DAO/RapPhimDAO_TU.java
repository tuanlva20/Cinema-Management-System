
package com.cinesys.DAO;

import java.util.List;

public abstract class RapPhimDAO_TU <E,K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K key);
    abstract public List <E> selectAll();
    abstract public E selectByID(K key);
    abstract protected List <E> selectBySQL(String sql,Object ...arg);
}
