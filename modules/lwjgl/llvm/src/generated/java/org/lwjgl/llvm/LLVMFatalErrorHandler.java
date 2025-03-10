/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class LLVMFatalErrorHandler extends Callback implements LLVMFatalErrorHandlerI {

    /**
     * Creates a {@code LLVMFatalErrorHandler} instance from the specified function pointer.
     *
     * @return the new {@code LLVMFatalErrorHandler}
     */
    public static LLVMFatalErrorHandler create(long functionPointer) {
        LLVMFatalErrorHandlerI instance = Callback.get(functionPointer);
        return instance instanceof LLVMFatalErrorHandler
            ? (LLVMFatalErrorHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMFatalErrorHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMFatalErrorHandler} instance that delegates to the specified {@code LLVMFatalErrorHandlerI} instance. */
    public static LLVMFatalErrorHandler create(LLVMFatalErrorHandlerI instance) {
        return instance instanceof LLVMFatalErrorHandler
            ? (LLVMFatalErrorHandler)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMFatalErrorHandler() {
        super(CIF);
    }

    LLVMFatalErrorHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMFatalErrorHandler {

        private final LLVMFatalErrorHandlerI delegate;

        Container(long functionPointer, LLVMFatalErrorHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Reason) {
            delegate.invoke(Reason);
        }

    }

}