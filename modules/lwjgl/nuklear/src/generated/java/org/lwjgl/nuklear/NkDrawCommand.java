/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct nk_draw_command {
 *     unsigned int elem_count;
 *     {@link NkRect struct nk_rect} clip_rect;
 *     {@link NkHandle nk_handle} texture;
 *     {@link NkHandle nk_handle} userdata;
 * }}</pre>
 */
@NativeType("struct nk_draw_command")
public class NkDrawCommand extends Struct<NkDrawCommand> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ELEM_COUNT,
        CLIP_RECT,
        TEXTURE,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ELEM_COUNT = layout.offsetof(0);
        CLIP_RECT = layout.offsetof(1);
        TEXTURE = layout.offsetof(2);
        USERDATA = layout.offsetof(3);
    }

    protected NkDrawCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkDrawCommand create(long address, @Nullable ByteBuffer container) {
        return new NkDrawCommand(address, container);
    }

    /**
     * Creates a {@code NkDrawCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkDrawCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code elem_count} field. */
    @NativeType("unsigned int")
    public int elem_count() { return nelem_count(address()); }
    /** @return a {@link NkRect} view of the {@code clip_rect} field. */
    @NativeType("struct nk_rect")
    public NkRect clip_rect() { return nclip_rect(address()); }
    /** @return a {@link NkHandle} view of the {@code texture} field. */
    @NativeType("nk_handle")
    public NkHandle texture() { return ntexture(address()); }
    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }

    // -----------------------------------

    /** Returns a new {@code NkDrawCommand} instance for the specified memory address. */
    public static NkDrawCommand create(long address) {
        return new NkDrawCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkDrawCommand createSafe(long address) {
        return address == NULL ? null : new NkDrawCommand(address, null);
    }

    /**
     * Create a {@link NkDrawCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkDrawCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #elem_count}. */
    public static int nelem_count(long struct) { return memGetInt(struct + NkDrawCommand.ELEM_COUNT); }
    /** Unsafe version of {@link #clip_rect}. */
    public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawCommand.CLIP_RECT); }
    /** Unsafe version of {@link #texture}. */
    public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkDrawCommand.TEXTURE); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawCommand.USERDATA); }

    // -----------------------------------

    /** An array of {@link NkDrawCommand} structs. */
    public static class Buffer extends StructBuffer<NkDrawCommand, Buffer> {

        private static final NkDrawCommand ELEMENT_FACTORY = NkDrawCommand.create(-1L);

        /**
         * Creates a new {@code NkDrawCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkDrawCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code elem_count} field. */
        @NativeType("unsigned int")
        public int elem_count() { return NkDrawCommand.nelem_count(address()); }
        /** @return a {@link NkRect} view of the {@code clip_rect} field. */
        @NativeType("struct nk_rect")
        public NkRect clip_rect() { return NkDrawCommand.nclip_rect(address()); }
        /** @return a {@link NkHandle} view of the {@code texture} field. */
        @NativeType("nk_handle")
        public NkHandle texture() { return NkDrawCommand.ntexture(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkDrawCommand.nuserdata(address()); }

    }

}