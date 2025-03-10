/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_alpha_test = "QCOMAlphaTest".nativeClassGLES("QCOM_alpha_test", postfix = QCOM) {
    IntConstant(
        "ALPHA_TEST_QCOM"..0x0BC0
    )

    IntConstant(
        "ALPHA_TEST_FUNC_QCOM"..0x0BC1,
        "ALPHA_TEST_REF_QCOM"..0x0BC2
    )

    void(
        "AlphaFuncQCOM",

        GLenum("func"),
        GLfloat("ref")
    )
}