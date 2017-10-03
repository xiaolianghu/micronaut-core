package org.particleframework.context.exceptions;

import org.particleframework.context.BeanResolutionContext;
import org.particleframework.core.type.Argument;
import org.particleframework.inject.FieldInjectionPoint;
import org.particleframework.inject.MethodInjectionPoint;

/**
 * Represents a circular dependency failure
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class CircularDependencyException extends DependencyInjectionException {
    public CircularDependencyException(BeanResolutionContext resolutionContext, Argument argument, String message) {
        super(resolutionContext, argument, message, true);
    }

    public CircularDependencyException(BeanResolutionContext resolutionContext, FieldInjectionPoint fieldInjectionPoint, String message) {
        super(resolutionContext, fieldInjectionPoint, message, true);
    }

    public CircularDependencyException(BeanResolutionContext resolutionContext, MethodInjectionPoint methodInjectionPoint, Argument argument, String message) {
        super(resolutionContext, methodInjectionPoint, argument, message, true);
    }
}
