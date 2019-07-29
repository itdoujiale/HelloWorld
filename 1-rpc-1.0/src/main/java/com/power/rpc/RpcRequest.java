package com.power.rpc;

import java.io.Serializable;

/**
 * @ClassName: RpcRequest
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:40
 **/
public class RpcRequest implements Serializable {

    private static final long serialVersionUID = 4028990381323166553L;

    private  String className;
    private  String methodName;

    private  Object[] parameter;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameter() {
        return parameter;
    }

    public void setParameter(Object[] parameter) {
        this.parameter = parameter;
    }
}
