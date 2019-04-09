package com.olebas.http_server.io;

import javax.sql.DataSource;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Properties;

public interface HttpServerContext {

    ServerInfo getServerInfo();

    Collection<String> getSupportedRequestMethods();

    Properties getSupportedResponseStatuses();

    DataSource getDataSource();

    Path getRootPath();

    String getContentType(String extension);

    HtmlTemplateManager getHtmlTemplateManager();

    Integer getExpiresDaysForResourse(String extension);
}
