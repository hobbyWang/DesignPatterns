package com.wry.patterns.factory.methodfactory.type2.factory;

import com.wry.patterns.factory.methodfactory.type2.product.FileLogger;
import com.wry.patterns.factory.methodfactory.type2.product.Logger;

//文件日志记录器工厂类：具体工厂
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
