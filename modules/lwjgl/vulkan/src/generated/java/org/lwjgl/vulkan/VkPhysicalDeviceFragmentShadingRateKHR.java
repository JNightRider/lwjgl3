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
 * struct VkPhysicalDeviceFragmentShadingRateKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkSampleCountFlags sampleCounts;
 *     {@link VkExtent2D VkExtent2D} fragmentSize;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShadingRateKHR extends Struct<VkPhysicalDeviceFragmentShadingRateKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLECOUNTS,
        FRAGMENTSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLECOUNTS = layout.offsetof(2);
        FRAGMENTSIZE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceFragmentShadingRateKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShadingRateKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRateKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateKHR(ByteBuffer container) {
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
    /** @return the value of the {@code sampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampleCounts() { return nsampleCounts(address()); }
    /** @return a {@link VkExtent2D} view of the {@code fragmentSize} field. */
    public VkExtent2D fragmentSize() { return nfragmentSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateKHR set(VkPhysicalDeviceFragmentShadingRateKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateKHR malloc() {
        return new VkPhysicalDeviceFragmentShadingRateKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateKHR calloc() {
        return new VkPhysicalDeviceFragmentShadingRateKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRateKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateKHR create(long address) {
        return new VkPhysicalDeviceFragmentShadingRateKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShadingRateKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShadingRateKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShadingRateKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateKHR.PNEXT); }
    /** Unsafe version of {@link #sampleCounts}. */
    public static int nsampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateKHR.SAMPLECOUNTS); }
    /** Unsafe version of {@link #fragmentSize}. */
    public static VkExtent2D nfragmentSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRateKHR.FRAGMENTSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShadingRateKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateKHR.npNext(address()); }
        /** @return the value of the {@code sampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleCounts() { return VkPhysicalDeviceFragmentShadingRateKHR.nsampleCounts(address()); }
        /** @return a {@link VkExtent2D} view of the {@code fragmentSize} field. */
        public VkExtent2D fragmentSize() { return VkPhysicalDeviceFragmentShadingRateKHR.nfragmentSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateKHR.npNext(address(), value); return this; }

    }

}