package com.wugui.datatx.core.datasource;

import com.wugui.datatx.core.enums.DbType;

/**
 * data source of MongoDB
 */
public class MongoDBDataSource extends BaseDataSource {


  public String getMongoClientURI() {
    return getAddress();
  }

  @Override
  public String driverClassSelector() {
    return null;
  }

  @Override
  public DbType dbTypeSelector() {
    return DbType.MONGODB;
  }
}
