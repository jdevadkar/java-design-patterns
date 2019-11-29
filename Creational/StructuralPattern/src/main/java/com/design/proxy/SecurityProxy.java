package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The Class SecurityProxy.
 */
public class SecurityProxy implements InvocationHandler {

	/** The obj. */
	private Object obj;

	/**
	 * Instantiates a new security proxy.
	 *
	 * @param obj the obj
	 */
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	/**
	 * New instance.
	 *
	 * @param obj the obj
	 * @return the object
	 */
	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new SecurityProxy(obj));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {

		Object result;
		try {
			result = m.invoke(obj, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation excrption: " + e.getMessage());
		}
		return result;
	}

}
