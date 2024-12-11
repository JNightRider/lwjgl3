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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image creation information for querying subresource layout.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
 * <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in {@code pCreateInfo}</li>
 * <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in {@code pCreateInfo}</li>
 * <li>If {@code format} of the {@code image} is a color format that is not a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, and {@code tiling} of the {@code pCreateInfo} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code format} of the {@code pCreateInfo} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</li>
 * <li>If {@code format} of the {@code pCreateInfo} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code format} of the {@code pCreateInfo} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If the {@code tiling} of the {@code pCreateInfo} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and has a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkImageCreateInfo} structure</li>
 * <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid {@link VkImageSubresource2} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageCreateInfo}, {@link VkImageSubresource2}, {@link VK14#vkGetDeviceImageSubresourceLayout GetDeviceImageSubresourceLayout}, {@link KHRMaintenance5#vkGetDeviceImageSubresourceLayoutKHR GetDeviceImageSubresourceLayoutKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceImageSubresourceInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * {@link #pCreateInfo};
 *     {@link VkImageSubresource2 VkImageSubresource2} const * {@link #pSubresource};
 * }</code></pre>
 */
public class VkDeviceImageSubresourceInfo extends Struct<VkDeviceImageSubresourceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO,
        PSUBRESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PSUBRESOURCE = layout.offsetof(3);
    }

    protected VkDeviceImageSubresourceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceImageSubresourceInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceImageSubresourceInfo(address, container);
    }

    /**
     * Creates a {@code VkDeviceImageSubresourceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageSubresourceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a {@link VkImageCreateInfo} structure containing parameters affecting creation of the image to query. */
    @NativeType("VkImageCreateInfo const *")
    public VkImageCreateInfo pCreateInfo() { return npCreateInfo(address()); }
    /** pSubresource is a pointer to a {@link VkImageSubresource2} structure selecting a specific image subresource for the query. */
    @NativeType("VkImageSubresource2 const *")
    public VkImageSubresource2 pSubresource() { return npSubresource(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceImageSubresourceInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO} value to the {@link #sType} field. */
    public VkDeviceImageSubresourceInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceImageSubresourceInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link #pCreateInfo} field. */
    public VkDeviceImageSubresourceInfo pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageSubresource2} to the {@link #pSubresource} field. */
    public VkDeviceImageSubresourceInfo pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) { npSubresource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceImageSubresourceInfo set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        VkImageSubresource2 pSubresource
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        pSubresource(pSubresource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageSubresourceInfo set(VkDeviceImageSubresourceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageSubresourceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfo malloc() {
        return new VkDeviceImageSubresourceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfo calloc() {
        return new VkDeviceImageSubresourceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageSubresourceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageSubresourceInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfo} instance for the specified memory address. */
    public static VkDeviceImageSubresourceInfo create(long address) {
        return new VkDeviceImageSubresourceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceImageSubresourceInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceImageSubresourceInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceImageSubresourceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceImageSubresourceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfo malloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfo calloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceImageSubresourceInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceImageSubresourceInfo.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkImageCreateInfo npCreateInfo(long struct) { return VkImageCreateInfo.create(memGetAddress(struct + VkDeviceImageSubresourceInfo.PCREATEINFO)); }
    /** Unsafe version of {@link #pSubresource}. */
    public static VkImageSubresource2 npSubresource(long struct) { return VkImageSubresource2.create(memGetAddress(struct + VkDeviceImageSubresourceInfo.PSUBRESOURCE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceImageSubresourceInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceImageSubresourceInfo.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkImageCreateInfo) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkImageCreateInfo value) { memPutAddress(struct + VkDeviceImageSubresourceInfo.PCREATEINFO, value.address()); }
    /** Unsafe version of {@link #pSubresource(VkImageSubresource2) pSubresource}. */
    public static void npSubresource(long struct, VkImageSubresource2 value) { memPutAddress(struct + VkDeviceImageSubresourceInfo.PSUBRESOURCE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceImageSubresourceInfo.PCREATEINFO));
        check(memGetAddress(struct + VkDeviceImageSubresourceInfo.PSUBRESOURCE));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageSubresourceInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceImageSubresourceInfo, Buffer> implements NativeResource {

        private static final VkDeviceImageSubresourceInfo ELEMENT_FACTORY = VkDeviceImageSubresourceInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageSubresourceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageSubresourceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceImageSubresourceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceImageSubresourceInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceImageSubresourceInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceImageSubresourceInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceImageSubresourceInfo.npNext(address()); }
        /** @return a {@link VkImageCreateInfo} view of the struct pointed to by the {@link VkDeviceImageSubresourceInfo#pCreateInfo} field. */
        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() { return VkDeviceImageSubresourceInfo.npCreateInfo(address()); }
        /** @return a {@link VkImageSubresource2} view of the struct pointed to by the {@link VkDeviceImageSubresourceInfo#pSubresource} field. */
        @NativeType("VkImageSubresource2 const *")
        public VkImageSubresource2 pSubresource() { return VkDeviceImageSubresourceInfo.npSubresource(address()); }

        /** Sets the specified value to the {@link VkDeviceImageSubresourceInfo#sType} field. */
        public VkDeviceImageSubresourceInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageSubresourceInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO} value to the {@link VkDeviceImageSubresourceInfo#sType} field. */
        public VkDeviceImageSubresourceInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO); }
        /** Sets the specified value to the {@link VkDeviceImageSubresourceInfo#pNext} field. */
        public VkDeviceImageSubresourceInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageSubresourceInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link VkDeviceImageSubresourceInfo#pCreateInfo} field. */
        public VkDeviceImageSubresourceInfo.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageSubresourceInfo.npCreateInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageSubresource2} to the {@link VkDeviceImageSubresourceInfo#pSubresource} field. */
        public VkDeviceImageSubresourceInfo.Buffer pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) { VkDeviceImageSubresourceInfo.npSubresource(address(), value); return this; }

    }

}