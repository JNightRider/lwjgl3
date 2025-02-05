/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkExecutionGraphPipelineScratchSizeAMDX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize minSize;
 *     VkDeviceSize maxSize;
 *     VkDeviceSize sizeGranularity;
 * }}</pre>
 */
public class VkExecutionGraphPipelineScratchSizeAMDX extends Struct<VkExecutionGraphPipelineScratchSizeAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINSIZE,
        MAXSIZE,
        SIZEGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSIZE = layout.offsetof(2);
        MAXSIZE = layout.offsetof(3);
        SIZEGRANULARITY = layout.offsetof(4);
    }

    protected VkExecutionGraphPipelineScratchSizeAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExecutionGraphPipelineScratchSizeAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, container);
    }

    /**
     * Creates a {@code VkExecutionGraphPipelineScratchSizeAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExecutionGraphPipelineScratchSizeAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code minSize} field. */
    @NativeType("VkDeviceSize")
    public long minSize() { return nminSize(address()); }
    /** @return the value of the {@code maxSize} field. */
    @NativeType("VkDeviceSize")
    public long maxSize() { return nmaxSize(address()); }
    /** @return the value of the {@code sizeGranularity} field. */
    @NativeType("VkDeviceSize")
    public long sizeGranularity() { return nsizeGranularity(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX} value to the {@code sType} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code minSize} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX minSize(@NativeType("VkDeviceSize") long value) { nminSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxSize} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX maxSize(@NativeType("VkDeviceSize") long value) { nmaxSize(address(), value); return this; }
    /** Sets the specified value to the {@code sizeGranularity} field. */
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularity(@NativeType("VkDeviceSize") long value) { nsizeGranularity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExecutionGraphPipelineScratchSizeAMDX set(
        int sType,
        long pNext,
        long minSize,
        long maxSize,
        long sizeGranularity
    ) {
        sType(sType);
        pNext(pNext);
        minSize(minSize);
        maxSize(maxSize);
        sizeGranularity(sizeGranularity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExecutionGraphPipelineScratchSizeAMDX set(VkExecutionGraphPipelineScratchSizeAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineScratchSizeAMDX malloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineScratchSizeAMDX calloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated with {@link BufferUtils}. */
    public static VkExecutionGraphPipelineScratchSizeAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineScratchSizeAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance for the specified memory address. */
    public static VkExecutionGraphPipelineScratchSizeAMDX create(long address) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExecutionGraphPipelineScratchSizeAMDX createSafe(long address) {
        return address == NULL ? null : new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExecutionGraphPipelineScratchSizeAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineScratchSizeAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineScratchSizeAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExecutionGraphPipelineScratchSizeAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExecutionGraphPipelineScratchSizeAMDX.PNEXT); }
    /** Unsafe version of {@link #minSize}. */
    public static long nminSize(long struct) { return memGetLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.MINSIZE); }
    /** Unsafe version of {@link #maxSize}. */
    public static long nmaxSize(long struct) { return memGetLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.MAXSIZE); }
    /** Unsafe version of {@link #sizeGranularity}. */
    public static long nsizeGranularity(long struct) { return memGetLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.SIZEGRANULARITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExecutionGraphPipelineScratchSizeAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExecutionGraphPipelineScratchSizeAMDX.PNEXT, value); }
    /** Unsafe version of {@link #minSize(long) minSize}. */
    public static void nminSize(long struct, long value) { memPutLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.MINSIZE, value); }
    /** Unsafe version of {@link #maxSize(long) maxSize}. */
    public static void nmaxSize(long struct, long value) { memPutLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.MAXSIZE, value); }
    /** Unsafe version of {@link #sizeGranularity(long) sizeGranularity}. */
    public static void nsizeGranularity(long struct, long value) { memPutLong(struct + VkExecutionGraphPipelineScratchSizeAMDX.SIZEGRANULARITY, value); }

    // -----------------------------------

    /** An array of {@link VkExecutionGraphPipelineScratchSizeAMDX} structs. */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineScratchSizeAMDX, Buffer> implements NativeResource {

        private static final VkExecutionGraphPipelineScratchSizeAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineScratchSizeAMDX.create(-1L);

        /**
         * Creates a new {@code VkExecutionGraphPipelineScratchSizeAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExecutionGraphPipelineScratchSizeAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExecutionGraphPipelineScratchSizeAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExecutionGraphPipelineScratchSizeAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExecutionGraphPipelineScratchSizeAMDX.npNext(address()); }
        /** @return the value of the {@code minSize} field. */
        @NativeType("VkDeviceSize")
        public long minSize() { return VkExecutionGraphPipelineScratchSizeAMDX.nminSize(address()); }
        /** @return the value of the {@code maxSize} field. */
        @NativeType("VkDeviceSize")
        public long maxSize() { return VkExecutionGraphPipelineScratchSizeAMDX.nmaxSize(address()); }
        /** @return the value of the {@code sizeGranularity} field. */
        @NativeType("VkDeviceSize")
        public long sizeGranularity() { return VkExecutionGraphPipelineScratchSizeAMDX.nsizeGranularity(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkExecutionGraphPipelineScratchSizeAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX} value to the {@code sType} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer pNext(@NativeType("void *") long value) { VkExecutionGraphPipelineScratchSizeAMDX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code minSize} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer minSize(@NativeType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.nminSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxSize} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer maxSize(@NativeType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.nmaxSize(address(), value); return this; }
        /** Sets the specified value to the {@code sizeGranularity} field. */
        public VkExecutionGraphPipelineScratchSizeAMDX.Buffer sizeGranularity(@NativeType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.nsizeGranularity(address(), value); return this; }

    }

}