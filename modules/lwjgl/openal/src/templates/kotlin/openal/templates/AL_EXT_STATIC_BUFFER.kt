/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_STATIC_BUFFER = "EXTStaticBuffer".nativeClassAL("EXT_STATIC_BUFFER") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension provides a means for the caller to avoid the overhead associated with the #BufferData() call which performs a physical copy of the
        data provided by the caller to internal buffers. When using the $extensionName extension, OpenAL's internal buffers use the data pointer provided by
        the caller for all data access.
        """

    ALvoid(
        "BufferDataStatic",
        "Sets the sample data of the specified buffer.",

        ALint("buffer", "the buffer handle"),
        ALenum("format", "the data format"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALvoid.p("data", "the sample data"),
        AutoSize("data")..ALsizei("len", "the data buffer size, in bytes"),
        ALsizei("freq", "the data frequency")
    ).directContext()
}