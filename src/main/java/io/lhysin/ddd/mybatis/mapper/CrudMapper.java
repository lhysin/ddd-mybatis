package io.lhysin.ddd.mybatis.mapper;

import io.lhysin.ddd.mybatis.provider.CrudSqlProvider;
import org.apache.ibatis.annotations.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudMapper<T, ID extends Serializable> extends ProvierMapper<T, ID> {

    @InsertProvider(type = CrudSqlProvider.class, method = "save")
    int save(T entity);

    @SelectProvider(type = CrudSqlProvider.class, method = "findById")
    Optional<T> findById(ID id);

    @SelectProvider(type = CrudSqlProvider.class, method = "findAllById")
    List<T> findAllById(Iterable<ID> ids);

    @SelectProvider(type = CrudSqlProvider.class, method = "count")
    long count();

    @DeleteProvider(type = CrudSqlProvider.class, method = "deleteById")
    int deleteById(ID id);

    @DeleteProvider(type = CrudSqlProvider.class, method = "delete")
    int delete(T entity);

    @DeleteProvider(type = CrudSqlProvider.class, method = "deleteAllById")
    int deleteAllById(Iterable<ID> ids);

    @InsertProvider(type = CrudSqlProvider.class, method = "create")
    int create(T entity);

    @UpdateProvider(type = CrudSqlProvider.class, method = "update")
    int update(T entity);

    @UpdateProvider(type = CrudSqlProvider.class, method = "dynamicUpdate")
    int dynamicUpdate(T entity);

    @InsertProvider(type = CrudSqlProvider.class, method = "createAll")
    int createAll(Iterable<T> entities);

}
