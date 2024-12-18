/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_HDCPError_t {
 *     EHDCPError eCode;
 * }</code></pre>
 */
@NativeType("struct VREvent_HDCPError_t")
public class VREventHDCPError extends Struct<VREventHDCPError> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ECODE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ECODE = layout.offsetof(0);
    }

    protected VREventHDCPError(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventHDCPError create(long address, @Nullable ByteBuffer container) {
        return new VREventHDCPError(address, container);
    }

    /**
     * Creates a {@code VREventHDCPError} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventHDCPError(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code eCode} field. */
    @NativeType("EHDCPError")
    public int eCode() { return neCode(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventHDCPError} instance for the specified memory address. */
    public static VREventHDCPError create(long address) {
        return new VREventHDCPError(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventHDCPError createSafe(long address) {
        return address == NULL ? null : new VREventHDCPError(address, null);
    }

    /**
     * Create a {@link VREventHDCPError.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventHDCPError.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventHDCPError.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eCode}. */
    public static int neCode(long struct) { return memGetInt(struct + VREventHDCPError.ECODE); }

    // -----------------------------------

    /** An array of {@link VREventHDCPError} structs. */
    public static class Buffer extends StructBuffer<VREventHDCPError, Buffer> {

        private static final VREventHDCPError ELEMENT_FACTORY = VREventHDCPError.create(-1L);

        /**
         * Creates a new {@code VREventHDCPError.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventHDCPError#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VREventHDCPError getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code eCode} field. */
        @NativeType("EHDCPError")
        public int eCode() { return VREventHDCPError.neCode(address()); }

    }

}