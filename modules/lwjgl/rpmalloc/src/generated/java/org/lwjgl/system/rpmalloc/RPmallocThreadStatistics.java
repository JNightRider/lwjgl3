/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct rpmalloc_thread_statistics_t {
 *     size_t sizecache;
 *     size_t spancache;
 *     size_t thread_to_global;
 *     size_t global_to_thread;
 *     struct {
 *         size_t current;
 *         size_t peak;
 *         size_t to_global;
 *         size_t from_global;
 *         size_t to_cache;
 *         size_t from_cache;
 *         size_t to_reserved;
 *         size_t from_reserved;
 *         size_t map_calls;
 *     } {@link span_use span_use}[64];
 *     struct {
 *         size_t alloc_current;
 *         size_t alloc_peak;
 *         size_t alloc_total;
 *         size_t free_total;
 *         size_t spans_to_cache;
 *         size_t spans_from_cache;
 *         size_t spans_from_reserved;
 *         size_t map_calls;
 *     } {@link size_use size_use}[128];
 * }}</pre>
 */
@NativeType("struct rpmalloc_thread_statistics_t")
public class RPmallocThreadStatistics extends Struct<RPmallocThreadStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZECACHE,
        SPANCACHE,
        THREAD_TO_GLOBAL,
        GLOBAL_TO_THREAD,
        SPAN_USE,
        SIZE_USE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(span_use.SIZEOF, span_use.ALIGNOF, 64),
            __array(size_use.SIZEOF, size_use.ALIGNOF, 128)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZECACHE = layout.offsetof(0);
        SPANCACHE = layout.offsetof(1);
        THREAD_TO_GLOBAL = layout.offsetof(2);
        GLOBAL_TO_THREAD = layout.offsetof(3);
        SPAN_USE = layout.offsetof(4);
        SIZE_USE = layout.offsetof(5);
    }

    protected RPmallocThreadStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RPmallocThreadStatistics create(long address, @Nullable ByteBuffer container) {
        return new RPmallocThreadStatistics(address, container);
    }

    /**
     * Creates a {@code RPmallocThreadStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPmallocThreadStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sizecache} field. */
    @NativeType("size_t")
    public long sizecache() { return nsizecache(address()); }
    /** @return the value of the {@code spancache} field. */
    @NativeType("size_t")
    public long spancache() { return nspancache(address()); }
    /** @return the value of the {@code thread_to_global} field. */
    @NativeType("size_t")
    public long thread_to_global() { return nthread_to_global(address()); }
    /** @return the value of the {@code global_to_thread} field. */
    @NativeType("size_t")
    public long global_to_thread() { return nglobal_to_thread(address()); }
    /** @return a {@link span_use}.Buffer view of the {@code span_use} field. */
    @NativeType("*[64]")
    public span_use.Buffer span_use() { return nspan_use(address()); }
    /** @return a {@link span_use} view of the struct at the specified index of the {@code span_use} field. */
    @NativeType("*")
    public span_use span_use(int index) { return nspan_use(address(), index); }
    /** @return a {@link size_use}.Buffer view of the {@code size_use} field. */
    @NativeType("*[128]")
    public size_use.Buffer size_use() { return nsize_use(address()); }
    /** @return a {@link size_use} view of the struct at the specified index of the {@code size_use} field. */
    @NativeType("*")
    public size_use size_use(int index) { return nsize_use(address(), index); }

    // -----------------------------------

    /** Returns a new {@code RPmallocThreadStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPmallocThreadStatistics malloc() {
        return new RPmallocThreadStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RPmallocThreadStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPmallocThreadStatistics calloc() {
        return new RPmallocThreadStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RPmallocThreadStatistics} instance allocated with {@link BufferUtils}. */
    public static RPmallocThreadStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RPmallocThreadStatistics(memAddress(container), container);
    }

    /** Returns a new {@code RPmallocThreadStatistics} instance for the specified memory address. */
    public static RPmallocThreadStatistics create(long address) {
        return new RPmallocThreadStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RPmallocThreadStatistics createSafe(long address) {
        return address == NULL ? null : new RPmallocThreadStatistics(address, null);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RPmallocThreadStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RPmallocThreadStatistics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocThreadStatistics.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code RPmallocThreadStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocThreadStatistics malloc(MemoryStack stack) {
        return new RPmallocThreadStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RPmallocThreadStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocThreadStatistics calloc(MemoryStack stack) {
        return new RPmallocThreadStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocThreadStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocThreadStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sizecache}. */
    public static long nsizecache(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.SIZECACHE); }
    /** Unsafe version of {@link #spancache}. */
    public static long nspancache(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.SPANCACHE); }
    /** Unsafe version of {@link #thread_to_global}. */
    public static long nthread_to_global(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.THREAD_TO_GLOBAL); }
    /** Unsafe version of {@link #global_to_thread}. */
    public static long nglobal_to_thread(long struct) { return memGetAddress(struct + RPmallocThreadStatistics.GLOBAL_TO_THREAD); }
    /** Unsafe version of {@link #span_use}. */
    public static span_use.Buffer nspan_use(long struct) { return span_use.create(struct + RPmallocThreadStatistics.SPAN_USE, 64); }
    /** Unsafe version of {@link #span_use(int) span_use}. */
    public static span_use nspan_use(long struct, int index) {
        return span_use.create(struct + RPmallocThreadStatistics.SPAN_USE + check(index, 64) * span_use.SIZEOF);
    }
    /** Unsafe version of {@link #size_use}. */
    public static size_use.Buffer nsize_use(long struct) { return size_use.create(struct + RPmallocThreadStatistics.SIZE_USE, 128); }
    /** Unsafe version of {@link #size_use(int) size_use}. */
    public static size_use nsize_use(long struct, int index) {
        return size_use.create(struct + RPmallocThreadStatistics.SIZE_USE + check(index, 128) * size_use.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link RPmallocThreadStatistics} structs. */
    public static class Buffer extends StructBuffer<RPmallocThreadStatistics, Buffer> implements NativeResource {

        private static final RPmallocThreadStatistics ELEMENT_FACTORY = RPmallocThreadStatistics.create(-1L);

        /**
         * Creates a new {@code RPmallocThreadStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RPmallocThreadStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected RPmallocThreadStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sizecache} field. */
        @NativeType("size_t")
        public long sizecache() { return RPmallocThreadStatistics.nsizecache(address()); }
        /** @return the value of the {@code spancache} field. */
        @NativeType("size_t")
        public long spancache() { return RPmallocThreadStatistics.nspancache(address()); }
        /** @return the value of the {@code thread_to_global} field. */
        @NativeType("size_t")
        public long thread_to_global() { return RPmallocThreadStatistics.nthread_to_global(address()); }
        /** @return the value of the {@code global_to_thread} field. */
        @NativeType("size_t")
        public long global_to_thread() { return RPmallocThreadStatistics.nglobal_to_thread(address()); }
        /** @return a {@link span_use}.Buffer view of the {@code span_use} field. */
        @NativeType("*[64]")
        public span_use.Buffer span_use() { return RPmallocThreadStatistics.nspan_use(address()); }
        /** @return a {@link span_use} view of the struct at the specified index of the {@code span_use} field. */
        @NativeType("*")
        public span_use span_use(int index) { return RPmallocThreadStatistics.nspan_use(address(), index); }
        /** @return a {@link size_use}.Buffer view of the {@code size_use} field. */
        @NativeType("*[128]")
        public size_use.Buffer size_use() { return RPmallocThreadStatistics.nsize_use(address()); }
        /** @return a {@link size_use} view of the struct at the specified index of the {@code size_use} field. */
        @NativeType("*")
        public size_use size_use(int index) { return RPmallocThreadStatistics.nsize_use(address(), index); }

    }

    /**
     * <pre>{@code
     * struct {
     *     size_t current;
     *     size_t peak;
     *     size_t to_global;
     *     size_t from_global;
     *     size_t to_cache;
     *     size_t from_cache;
     *     size_t to_reserved;
     *     size_t from_reserved;
     *     size_t map_calls;
     * }}</pre>
     */
    @NativeType("struct")
    public static class span_use extends Struct<span_use> {
    
        /** The struct size in bytes. */
        public static final int SIZEOF;
    
        /** The struct alignment in bytes. */
        public static final int ALIGNOF;
    
        /** The struct member offsets. */
        public static final int
            CURRENT,
            PEAK,
            TO_GLOBAL,
            FROM_GLOBAL,
            TO_CACHE,
            FROM_CACHE,
            TO_RESERVED,
            FROM_RESERVED,
            MAP_CALLS;
    
        static {
            Layout layout = __struct(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            );
    
            SIZEOF = layout.getSize();
            ALIGNOF = layout.getAlignment();
    
            CURRENT = layout.offsetof(0);
            PEAK = layout.offsetof(1);
            TO_GLOBAL = layout.offsetof(2);
            FROM_GLOBAL = layout.offsetof(3);
            TO_CACHE = layout.offsetof(4);
            FROM_CACHE = layout.offsetof(5);
            TO_RESERVED = layout.offsetof(6);
            FROM_RESERVED = layout.offsetof(7);
            MAP_CALLS = layout.offsetof(8);
        }
    
        protected span_use(long address, @Nullable ByteBuffer container) {
            super(address, container);
        }
    
        @Override
        protected span_use create(long address, @Nullable ByteBuffer container) {
            return new span_use(address, container);
        }
    
        /**
         * Creates a {@code span_use} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
         * visible to the struct instance and vice versa.
         *
         * <p>The created instance holds a strong reference to the container object.</p>
         */
        public span_use(ByteBuffer container) {
            super(memAddress(container), __checkContainer(container, SIZEOF));
        }
    
        @Override
        public int sizeof() { return SIZEOF; }
    
        /** @return the value of the {@code current} field. */
        @NativeType("size_t")
        public long current() { return ncurrent(address()); }
        /** @return the value of the {@code peak} field. */
        @NativeType("size_t")
        public long peak() { return npeak(address()); }
        /** @return the value of the {@code to_global} field. */
        @NativeType("size_t")
        public long to_global() { return nto_global(address()); }
        /** @return the value of the {@code from_global} field. */
        @NativeType("size_t")
        public long from_global() { return nfrom_global(address()); }
        /** @return the value of the {@code to_cache} field. */
        @NativeType("size_t")
        public long to_cache() { return nto_cache(address()); }
        /** @return the value of the {@code from_cache} field. */
        @NativeType("size_t")
        public long from_cache() { return nfrom_cache(address()); }
        /** @return the value of the {@code to_reserved} field. */
        @NativeType("size_t")
        public long to_reserved() { return nto_reserved(address()); }
        /** @return the value of the {@code from_reserved} field. */
        @NativeType("size_t")
        public long from_reserved() { return nfrom_reserved(address()); }
        /** @return the value of the {@code map_calls} field. */
        @NativeType("size_t")
        public long map_calls() { return nmap_calls(address()); }
    
        // -----------------------------------
    
        /** Returns a new {@code span_use} instance for the specified memory address. */
        public static span_use create(long address) {
            return new span_use(address, null);
        }
    
        /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static @Nullable span_use createSafe(long address) {
            return address == NULL ? null : new span_use(address, null);
        }
    
        /**
         * Create a {@link span_use.Buffer} instance at the specified memory.
         *
         * @param address  the memory address
         * @param capacity the buffer capacity
         */
        public static span_use.Buffer create(long address, int capacity) {
            return new Buffer(address, capacity);
        }
    
        /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static span_use.@Nullable Buffer createSafe(long address, int capacity) {
            return address == NULL ? null : new Buffer(address, capacity);
        }
    
        // -----------------------------------
    
        /** Unsafe version of {@link #current}. */
        public static long ncurrent(long struct) { return memGetAddress(struct + span_use.CURRENT); }
        /** Unsafe version of {@link #peak}. */
        public static long npeak(long struct) { return memGetAddress(struct + span_use.PEAK); }
        /** Unsafe version of {@link #to_global}. */
        public static long nto_global(long struct) { return memGetAddress(struct + span_use.TO_GLOBAL); }
        /** Unsafe version of {@link #from_global}. */
        public static long nfrom_global(long struct) { return memGetAddress(struct + span_use.FROM_GLOBAL); }
        /** Unsafe version of {@link #to_cache}. */
        public static long nto_cache(long struct) { return memGetAddress(struct + span_use.TO_CACHE); }
        /** Unsafe version of {@link #from_cache}. */
        public static long nfrom_cache(long struct) { return memGetAddress(struct + span_use.FROM_CACHE); }
        /** Unsafe version of {@link #to_reserved}. */
        public static long nto_reserved(long struct) { return memGetAddress(struct + span_use.TO_RESERVED); }
        /** Unsafe version of {@link #from_reserved}. */
        public static long nfrom_reserved(long struct) { return memGetAddress(struct + span_use.FROM_RESERVED); }
        /** Unsafe version of {@link #map_calls}. */
        public static long nmap_calls(long struct) { return memGetAddress(struct + span_use.MAP_CALLS); }
    
        // -----------------------------------
    
        /** An array of {@link span_use} structs. */
        public static class Buffer extends StructBuffer<span_use, Buffer> {
    
            private static final span_use ELEMENT_FACTORY = span_use.create(-1L);
    
            /**
             * Creates a new {@code span_use.Buffer} instance backed by the specified container.
             *
             * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
             * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
             * by {@link span_use#SIZEOF}, and its mark will be undefined.</p>
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
            protected span_use getElementFactory() {
                return ELEMENT_FACTORY;
            }
    
            /** @return the value of the {@code current} field. */
            @NativeType("size_t")
            public long current() { return span_use.ncurrent(address()); }
            /** @return the value of the {@code peak} field. */
            @NativeType("size_t")
            public long peak() { return span_use.npeak(address()); }
            /** @return the value of the {@code to_global} field. */
            @NativeType("size_t")
            public long to_global() { return span_use.nto_global(address()); }
            /** @return the value of the {@code from_global} field. */
            @NativeType("size_t")
            public long from_global() { return span_use.nfrom_global(address()); }
            /** @return the value of the {@code to_cache} field. */
            @NativeType("size_t")
            public long to_cache() { return span_use.nto_cache(address()); }
            /** @return the value of the {@code from_cache} field. */
            @NativeType("size_t")
            public long from_cache() { return span_use.nfrom_cache(address()); }
            /** @return the value of the {@code to_reserved} field. */
            @NativeType("size_t")
            public long to_reserved() { return span_use.nto_reserved(address()); }
            /** @return the value of the {@code from_reserved} field. */
            @NativeType("size_t")
            public long from_reserved() { return span_use.nfrom_reserved(address()); }
            /** @return the value of the {@code map_calls} field. */
            @NativeType("size_t")
            public long map_calls() { return span_use.nmap_calls(address()); }
    
        }
    
    }

    /**
     * <pre>{@code
     * struct {
     *     size_t alloc_current;
     *     size_t alloc_peak;
     *     size_t alloc_total;
     *     size_t free_total;
     *     size_t spans_to_cache;
     *     size_t spans_from_cache;
     *     size_t spans_from_reserved;
     *     size_t map_calls;
     * }}</pre>
     */
    @NativeType("struct")
    public static class size_use extends Struct<size_use> {
    
        /** The struct size in bytes. */
        public static final int SIZEOF;
    
        /** The struct alignment in bytes. */
        public static final int ALIGNOF;
    
        /** The struct member offsets. */
        public static final int
            ALLOC_CURRENT,
            ALLOC_PEAK,
            ALLOC_TOTAL,
            FREE_TOTAL,
            SPANS_TO_CACHE,
            SPANS_FROM_CACHE,
            SPANS_FROM_RESERVED,
            MAP_CALLS;
    
        static {
            Layout layout = __struct(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            );
    
            SIZEOF = layout.getSize();
            ALIGNOF = layout.getAlignment();
    
            ALLOC_CURRENT = layout.offsetof(0);
            ALLOC_PEAK = layout.offsetof(1);
            ALLOC_TOTAL = layout.offsetof(2);
            FREE_TOTAL = layout.offsetof(3);
            SPANS_TO_CACHE = layout.offsetof(4);
            SPANS_FROM_CACHE = layout.offsetof(5);
            SPANS_FROM_RESERVED = layout.offsetof(6);
            MAP_CALLS = layout.offsetof(7);
        }
    
        protected size_use(long address, @Nullable ByteBuffer container) {
            super(address, container);
        }
    
        @Override
        protected size_use create(long address, @Nullable ByteBuffer container) {
            return new size_use(address, container);
        }
    
        /**
         * Creates a {@code size_use} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
         * visible to the struct instance and vice versa.
         *
         * <p>The created instance holds a strong reference to the container object.</p>
         */
        public size_use(ByteBuffer container) {
            super(memAddress(container), __checkContainer(container, SIZEOF));
        }
    
        @Override
        public int sizeof() { return SIZEOF; }
    
        /** @return the value of the {@code alloc_current} field. */
        @NativeType("size_t")
        public long alloc_current() { return nalloc_current(address()); }
        /** @return the value of the {@code alloc_peak} field. */
        @NativeType("size_t")
        public long alloc_peak() { return nalloc_peak(address()); }
        /** @return the value of the {@code alloc_total} field. */
        @NativeType("size_t")
        public long alloc_total() { return nalloc_total(address()); }
        /** @return the value of the {@code free_total} field. */
        @NativeType("size_t")
        public long free_total() { return nfree_total(address()); }
        /** @return the value of the {@code spans_to_cache} field. */
        @NativeType("size_t")
        public long spans_to_cache() { return nspans_to_cache(address()); }
        /** @return the value of the {@code spans_from_cache} field. */
        @NativeType("size_t")
        public long spans_from_cache() { return nspans_from_cache(address()); }
        /** @return the value of the {@code spans_from_reserved} field. */
        @NativeType("size_t")
        public long spans_from_reserved() { return nspans_from_reserved(address()); }
        /** @return the value of the {@code map_calls} field. */
        @NativeType("size_t")
        public long map_calls() { return nmap_calls(address()); }
    
        // -----------------------------------
    
        /** Returns a new {@code size_use} instance for the specified memory address. */
        public static size_use create(long address) {
            return new size_use(address, null);
        }
    
        /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static @Nullable size_use createSafe(long address) {
            return address == NULL ? null : new size_use(address, null);
        }
    
        /**
         * Create a {@link size_use.Buffer} instance at the specified memory.
         *
         * @param address  the memory address
         * @param capacity the buffer capacity
         */
        public static size_use.Buffer create(long address, int capacity) {
            return new Buffer(address, capacity);
        }
    
        /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static size_use.@Nullable Buffer createSafe(long address, int capacity) {
            return address == NULL ? null : new Buffer(address, capacity);
        }
    
        // -----------------------------------
    
        /** Unsafe version of {@link #alloc_current}. */
        public static long nalloc_current(long struct) { return memGetAddress(struct + size_use.ALLOC_CURRENT); }
        /** Unsafe version of {@link #alloc_peak}. */
        public static long nalloc_peak(long struct) { return memGetAddress(struct + size_use.ALLOC_PEAK); }
        /** Unsafe version of {@link #alloc_total}. */
        public static long nalloc_total(long struct) { return memGetAddress(struct + size_use.ALLOC_TOTAL); }
        /** Unsafe version of {@link #free_total}. */
        public static long nfree_total(long struct) { return memGetAddress(struct + size_use.FREE_TOTAL); }
        /** Unsafe version of {@link #spans_to_cache}. */
        public static long nspans_to_cache(long struct) { return memGetAddress(struct + size_use.SPANS_TO_CACHE); }
        /** Unsafe version of {@link #spans_from_cache}. */
        public static long nspans_from_cache(long struct) { return memGetAddress(struct + size_use.SPANS_FROM_CACHE); }
        /** Unsafe version of {@link #spans_from_reserved}. */
        public static long nspans_from_reserved(long struct) { return memGetAddress(struct + size_use.SPANS_FROM_RESERVED); }
        /** Unsafe version of {@link #map_calls}. */
        public static long nmap_calls(long struct) { return memGetAddress(struct + size_use.MAP_CALLS); }
    
        // -----------------------------------
    
        /** An array of {@link size_use} structs. */
        public static class Buffer extends StructBuffer<size_use, Buffer> {
    
            private static final size_use ELEMENT_FACTORY = size_use.create(-1L);
    
            /**
             * Creates a new {@code size_use.Buffer} instance backed by the specified container.
             *
             * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
             * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
             * by {@link size_use#SIZEOF}, and its mark will be undefined.</p>
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
            protected size_use getElementFactory() {
                return ELEMENT_FACTORY;
            }
    
            /** @return the value of the {@code alloc_current} field. */
            @NativeType("size_t")
            public long alloc_current() { return size_use.nalloc_current(address()); }
            /** @return the value of the {@code alloc_peak} field. */
            @NativeType("size_t")
            public long alloc_peak() { return size_use.nalloc_peak(address()); }
            /** @return the value of the {@code alloc_total} field. */
            @NativeType("size_t")
            public long alloc_total() { return size_use.nalloc_total(address()); }
            /** @return the value of the {@code free_total} field. */
            @NativeType("size_t")
            public long free_total() { return size_use.nfree_total(address()); }
            /** @return the value of the {@code spans_to_cache} field. */
            @NativeType("size_t")
            public long spans_to_cache() { return size_use.nspans_to_cache(address()); }
            /** @return the value of the {@code spans_from_cache} field. */
            @NativeType("size_t")
            public long spans_from_cache() { return size_use.nspans_from_cache(address()); }
            /** @return the value of the {@code spans_from_reserved} field. */
            @NativeType("size_t")
            public long spans_from_reserved() { return size_use.nspans_from_reserved(address()); }
            /** @return the value of the {@code map_calls} field. */
            @NativeType("size_t")
            public long map_calls() { return size_use.nmap_calls(address()); }
    
        }
    
    }

}