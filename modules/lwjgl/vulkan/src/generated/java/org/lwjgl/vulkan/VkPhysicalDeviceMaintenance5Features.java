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
 * Structure describing whether the implementation supports maintenance5 functionality.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance5Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMaintenance5Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance5Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #maintenance5};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance5Features extends Struct<VkPhysicalDeviceMaintenance5Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAINTENANCE5;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAINTENANCE5 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMaintenance5Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance5Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance5Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance5Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance5Features(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>The ability to expose support for the optional format {@link VK14#VK_FORMAT_A1B5G5R5_UNORM_PACK16 FORMAT_A1B5G5R5_UNORM_PACK16}.</li>
     * <li>The ability to expose support for the optional format {@link VK14#VK_FORMAT_A8_UNORM FORMAT_A8_UNORM}.</li>
     * <li>A property to indicate that multisample coverage operations are performed after sample counting in EarlyFragmentTests mode.</li>
     * <li>Creating a {@code VkBufferView} with a subset of the associated {@code VkBuffer} usage using {@link VkBufferUsageFlags2CreateInfo}.</li>
     * <li>A new function {@link VK14#vkCmdBindIndexBuffer2 CmdBindIndexBuffer2}, allowing a range of memory to be bound as an index buffer.</li>
     * <li>{@link VK10#vkGetDeviceProcAddr GetDeviceProcAddr} will return {@code NULL} for function pointers of core functions for versions higher than the version requested by the application.</li>
     * <li>{@link VK13#vkCmdBindVertexBuffers2 CmdBindVertexBuffers2} supports using {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} in the {@code pSizes} parameter.</li>
     * <li>If {@code PointSize} is not written, a default value of {@code 1.0} is used for the size of points.</li>
     * <li>{@link VkShaderModuleCreateInfo} <b>can</b> be added as a chained structure to pipeline creation via {@link VkPipelineShaderStageCreateInfo}, rather than having to create a shader module.</li>
     * <li>A function {@link VK14#vkGetRenderingAreaGranularity GetRenderingAreaGranularity} to query the optimal render area for a dynamic rendering instance.</li>
     * <li>A property to indicate that depth/stencil texturing operations with {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE} have defined behavior.</li>
     * <li>{@link VK14#vkGetDeviceImageSubresourceLayout GetDeviceImageSubresourceLayout} allows an application to perform a {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout} query without having to create an image.</li>
     * <li>{@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} as the {@code layerCount} member of {@link VkImageSubresourceLayers}.</li>
     * <li>A property to indicate whether {@code PointSize} controls the final rasterization of polygons if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-polygonmode">polygon mode</a> is {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT}.</li>
     * <li>Two properties to indicate the non-strict line rasterization algorithm used.</li>
     * <li>Two new flags words {@code VkPipelineCreateFlagBits2} and {@code VkBufferUsageFlagBits2}.</li>
     * <li>Physical-device-level functions <b>can</b> now be called with any value in the valid range for a type beyond the defined enumerants, such that applications can avoid checking individual features, extensions, or versions before querying supported properties of a particular enumerant.</li>
     * <li>Copies between images of any type are allowed, with 1D images treated as 2D images with a height of 1.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance5() { return nmaintenance5(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance5Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance5Features sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance5Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maintenance5} field. */
    public VkPhysicalDeviceMaintenance5Features maintenance5(@NativeType("VkBool32") boolean value) { nmaintenance5(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance5Features set(
        int sType,
        long pNext,
        boolean maintenance5
    ) {
        sType(sType);
        pNext(pNext);
        maintenance5(maintenance5);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance5Features set(VkPhysicalDeviceMaintenance5Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5Features malloc() {
        return new VkPhysicalDeviceMaintenance5Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5Features calloc() {
        return new VkPhysicalDeviceMaintenance5Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance5Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance5Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance5Features create(long address) {
        return new VkPhysicalDeviceMaintenance5Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance5Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance5Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance5Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance5Features.PNEXT); }
    /** Unsafe version of {@link #maintenance5}. */
    public static int nmaintenance5(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Features.MAINTENANCE5); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance5Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance5Features.PNEXT, value); }
    /** Unsafe version of {@link #maintenance5(boolean) maintenance5}. */
    public static void nmaintenance5(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance5Features.MAINTENANCE5, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance5Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance5Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance5Features ELEMENT_FACTORY = VkPhysicalDeviceMaintenance5Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance5Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance5Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance5Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance5Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance5Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance5Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5Features#maintenance5} field. */
        @NativeType("VkBool32")
        public boolean maintenance5() { return VkPhysicalDeviceMaintenance5Features.nmaintenance5(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance5Features#sType} field. */
        public VkPhysicalDeviceMaintenance5Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5Features.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES} value to the {@link VkPhysicalDeviceMaintenance5Features#sType} field. */
        public VkPhysicalDeviceMaintenance5Features.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance5Features#pNext} field. */
        public VkPhysicalDeviceMaintenance5Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance5Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance5Features#maintenance5} field. */
        public VkPhysicalDeviceMaintenance5Features.Buffer maintenance5(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMaintenance5Features.nmaintenance5(address(), value ? 1 : 0); return this; }

    }

}