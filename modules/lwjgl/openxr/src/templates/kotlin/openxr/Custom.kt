/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import org.lwjgl.generator.*
import openxr.templates.*
import java.io.*
import kotlin.math.*

private fun generateDispatchableHandle(handle: PointerType<*>, parent: PointerType<*>) {
    Generator.register(object : GeneratorTarget(Module.OPENXR, handle.name) {
        init {
            this.documentation = "Wraps an {@code ${handle.name}} handle."
        }

        override fun PrintWriter.generateJava() {
            val parentVar = parent.name[2].lowercase() + parent.name.substring(3)
            generateJavaPreamble()
            println(
"""public class ${handle.name} extends DispatchableHandle {

    private final ${parent.name} $parentVar;

    /**
     * Creates an {@code ${handle.name}} using the specified native handle and {@code ${parent.name}}.
     *
     * @param handle ${" ".repeat(max(0, parentVar.length - "handle".length))}the native {@code ${handle.name}} handle
     * @param $parentVar the {@code ${parent.name}} from which {@code handle} was created
     */
    public ${handle.name}(long handle, ${parent.name} $parentVar) {
        super(handle, $parentVar.getCapabilities());
        this.$parentVar = $parentVar;
    }

    /** Returns the {@code ${parent.name}} from which this handle was created. */
    public ${parent.name} get${parent.name.substring(2)}() {
        return $parentVar;
    }

}""")
        }
    })
}

fun templateCustomization() {
    generateDispatchableHandle(XrActionSet, XrInstance)
    generateDispatchableHandle(XrAction, XrActionSet)
    generateDispatchableHandle(XrBodyTrackerFB, XrSession)
    generateDispatchableHandle(XrBodyTrackerHTC, XrSession)
    generateDispatchableHandle(XrDebugUtilsMessengerEXT, XrInstance)
    generateDispatchableHandle(XrEnvironmentDepthProviderMETA, XrSession)
    generateDispatchableHandle(XrEnvironmentDepthSwapchainMETA, XrEnvironmentDepthProviderMETA)
    generateDispatchableHandle(XrEyeTrackerFB, XrSession)
    generateDispatchableHandle(XrExportedLocalizationMapML, XrSession)
    generateDispatchableHandle(XrFaceTrackerFB, XrSession)
    generateDispatchableHandle(XrFaceTracker2FB, XrSession)
    generateDispatchableHandle(XrFacialExpressionClientML, XrSession)
    generateDispatchableHandle(XrFacialTrackerHTC, XrSession)
    generateDispatchableHandle(XrFoveationProfileFB, XrSession)
    generateDispatchableHandle(XrGeometryInstanceFB, XrSession)
    generateDispatchableHandle(XrHandTrackerEXT, XrSession)
    generateDispatchableHandle(XrMarkerDetectorML, XrSession)
    generateDispatchableHandle(XrPassthroughColorLutMETA, XrPassthroughFB)
    generateDispatchableHandle(XrPassthroughFB, XrSession)
    generateDispatchableHandle(XrPassthroughHTC, XrSession)
    generateDispatchableHandle(XrPassthroughLayerFB, XrSession)
    generateDispatchableHandle(XrPlaneDetectorEXT, XrSession)
    generateDispatchableHandle(XrSceneMSFT, XrSceneObserverMSFT)
    generateDispatchableHandle(XrSceneObserverMSFT, XrSession)
    generateDispatchableHandle(XrSession, XrInstance)
    generateDispatchableHandle(XrSpace, XrSession)
    generateDispatchableHandle(XrSpaceUserFB, XrSession)
    generateDispatchableHandle(XrSpatialAnchorMSFT, XrSession)
    generateDispatchableHandle(XrSpatialAnchorStoreConnectionMSFT, XrSession)
    generateDispatchableHandle(XrSpatialAnchorsStorageML, XrSession)
    generateDispatchableHandle(XrSpatialGraphNodeBindingMSFT, XrSession)
    generateDispatchableHandle(XrSwapchain, XrSession)
    generateDispatchableHandle(XrTriangleMeshFB, XrSession)
    generateDispatchableHandle(XrVirtualKeyboardMETA, XrSession)
    generateDispatchableHandle(XrWorldMeshDetectorML, XrSession)

    XR10.apply {
        LongConstant(
            "OpenXR current version number.",

            "CURRENT_API_VERSION".."XR_MAKE_VERSION(1, 1, 43)"
        )

        LongConstant(
            """
            The version of the OpenXR 1.0 API.

            The "major" and "minor" components are always 1.0, while the "patch" component matches #CURRENT_API_VERSION.
            """,

            "API_VERSION_1_0".."XR_MAKE_VERSION(1, 0, XR_VERSION_PATCH(XR_CURRENT_API_VERSION))"
        )

        macro(expression = "((major & 0xFFFFL) << 48) | ((minor & 0xFFFFL) << 32) | (patch & 0xFFFF_FFFFL)")..uint64_t(
            "XR_MAKE_VERSION",
            """
            Packs a three-component version number into a packed version number integer.

            This macro <b>can</b> be used when constructing the ##XrApplicationInfo{@code ::apiVersion} parameter passed to #CreateInstance().
            """,

            MapToInt..uint16_t("major", "the major version number, packed into the most-significant 16 bits"),
            MapToInt..uint16_t("minor", "the minor version number, packed into the second-most-significant group of 16 bits"),
            uint32_t("patch", "the patch version number, in the least-significant 32 bits"),

            noPrefix = true
        )

        macro(expression = "(short)((version >> 48) & 0xFFFFL)")..uint16_t(
            "XR_VERSION_MAJOR",
            "Extracts the major version number from a packed version number.",

            uint64_t("version", "a packed version number"),

            noPrefix = true
        )

        macro(expression = "(short)((version >> 32) & 0xFFFFL)")..uint16_t(
            "XR_VERSION_MINOR",
            "Extracts the minor version number from a packed version number.",

            uint64_t("version", "a packed version number"),

            noPrefix = true
        )

        macro(expression = "(int)(version & 0xFFFF_FFFFL)")..uint32_t(
            "XR_VERSION_PATCH",
            "Extracts the patch version number from a packed version number.",

            uint64_t("version", "a packed version number"),

            noPrefix = true
        )

        IntConstant(
            "Compile-time symbols, ignore.",

            "USE_GRAPHICS_API_OPENGL".."0",
            "USE_GRAPHICS_API_OPENGL_ES".."0",
            "USE_GRAPHICS_API_VULKAN".."0",

            "USE_PLATFORM_EGL".."0",
            "USE_PLATFORM_WIN32".."0",
            "USE_PLATFORM_XLIB".."0",
            "USE_PLATFORM_XCB".."0",
            "USE_PLATFORM_WAYLAND".."0",
        )

        LongConstant(
            "API Constants",

            "NULL_HANDLE"..0L,
            "NULL_PATH"..0L,
            "NULL_SYSTEM_ID"..0L,
            "NO_DURATION"..0L,
            "INFINITE_DURATION".."0x7FFF_FFFF_FFFF_FFFFL",
            "MIN_HAPTIC_DURATION"..-1L,
            "MAX_EVENT_DATA_SIZE".."XrEventDataBuffer.SIZEOF"
        )

        FloatConstant(
            "API Constants",

            "FREQUENCY_UNSPECIFIED".."0f"
        )

        IntConstant(
            "API Constants",

            "TRUE".."1",
            "FALSE".."0",
            "MAX_EXTENSION_NAME_SIZE".."128",
            "MAX_API_LAYER_NAME_SIZE".."256",
            "MAX_API_LAYER_DESCRIPTION_SIZE".."256",
            "MAX_SYSTEM_NAME_SIZE".."256",
            "MAX_APPLICATION_NAME_SIZE".."128",
            "MAX_ENGINE_NAME_SIZE".."128",
            "MAX_RUNTIME_NAME_SIZE".."128",
            "MAX_PATH_LENGTH".."256",
            "MAX_STRUCTURE_NAME_SIZE".."64",
            "MAX_RESULT_STRING_SIZE".."64",
            "MAX_GRAPHICS_APIS_SUPPORTED".."32",
            "MAX_ACTION_SET_NAME_SIZE".."64",
            "MAX_ACTION_NAME_SIZE".."64",
            "MAX_LOCALIZED_ACTION_SET_NAME_SIZE".."128",
            "MAX_LOCALIZED_ACTION_NAME_SIZE".."128",
            "MIN_COMPOSITION_LAYERS_SUPPORTED".."16",
            "UUID_SIZE".."16"
        )

        macro(expression = "result >= 0")..bool(
            "XR_SUCCEEDED",
            "",

            int("result", ""),

            noPrefix = true
        )

        macro(expression = "result == 0")..bool(
            "XR_UNQUALIFIED_SUCCESS",
            "",

            int("result", ""),

            noPrefix = true
        )

        macro(expression = "result < 0")..bool(
            "XR_FAILED",
            "",

            int("result", ""),

            noPrefix = true
        )

        nullable..this["GetInstanceProcAddr"].getParam("instance")
    }

    XR11.apply {
        javaImport("static org.lwjgl.openxr.XR10.*")
        documentation =
            """
            The core OpenXR 1.1 functionality.

            OpenXR version 1.1 <em>promoted</em> a number of key extensions into the core API:

            ${ul(
                KHR_locate_spaces.link,
                KHR_maintenance1.link,
                EXT_hp_mixed_reality_controller.link,
                EXT_local_floor.link,
                EXT_palm_pose.link,
                EXT_samsung_odyssey_controller.link,
                EXT_uuid.link,
                BD_controller_interaction.link,
                HTC_vive_cosmos_controller_interaction.link,
                HTC_vive_focus3_controller_interaction.link,
                ML_ml2_controller_interaction.link,
                VARJO_quad_views.link
            )}
            """

        LongConstant(
            """
            The version of the OpenXR 1.1 API.

            The "major" and "minor" components are always 1.1, while the "patch" component matches #CURRENT_API_VERSION.
            """,

            "API_VERSION_1_1".."XR_MAKE_VERSION(1, 1, XR_VERSION_PATCH(XR_CURRENT_API_VERSION))"
        )
    }

    EXT_hand_tracking.apply {
        IntConstant(
            "API Constants",

            "HAND_JOINT_COUNT_EXT".."26"
        )
    }

    MSFT_controller_model.apply {
        LongConstant(
            "API Constants",

            "NULL_CONTROLLER_MODEL_KEY_MSFT"..0L
        )
    }

    FB_render_model.apply {
        LongConstant(
            "API Constants",

            "NULL_RENDER_MODEL_KEY_FB"..0L
        )
    }

    HTC_body_tracking.apply {
        IntConstant(
            "API Constants",

            "BODY_JOINT_COUNT_HTC"..26
        )
    }

    HTC_facial_tracking.apply {
        IntConstant(
            "API Constants",

            "FACIAL_EXPRESSION_EYE_COUNT_HTC"..14,
            "FACIAL_EXPRESSION_LIP_COUNT_HTC"..37
        )
    }

    FB_haptic_amplitude_envelope.apply {
        IntConstant(
            "API Constants",

            "MAX_HAPTIC_AMPLITUDE_ENVELOPE_SAMPLES_FB"..4000
        )
    }

    FB_haptic_pcm.apply {
        IntConstant(
            "API Constants",

            "MAX_HAPTIC_PCM_BUFFER_SIZE_FB"..4000
        )
    }
}