package com.limelight.utils;

import android.content.Context;
import android.view.Surface;
import android.view.View;

/**
 * Lenticular build of the panel driver: there is nothing to drive.
 *
 * On a panel whose lens is bonded to the glass — the ProMa King, the RED Hydrogen One — the
 * optics are always on and the weave never moves, so {@link Stereo3DRenderer}'s own shader
 * does the whole job and this class stays out of the way. The leia flavour replaces it with
 * one that hands the frame to Leia's CNSDK instead.
 *
 * Both versions must keep the same shape, because the shared code is compiled against
 * whichever one the flavour selects.
 */
public final class PanelDriver {

    /** Receives the surface the stream should be decoded into, once the panel has one. */
    public interface SurfaceListener {
        void onPanelSurfaceReady(Surface surface);
    }

    /** Declared to match the Leia driver; nothing on this side converts anything. */
    public interface ConversionListener {
        void onConversionInputReady(Surface input, int width, int height);
    }

    /**
     * Always false here. A lenticular panel has no converter of its own, so the eyes are made
     * in the shader as before.
     */
    public boolean startConversion(Context context, Surface out, int eyeWidth, int eyeHeight,
                                   float strength, ConversionListener listener) {
        return false;
    }

    public void stopConversion() {
    }

    /** Nothing to take down: this side holds no SDK of its own. */
    public static synchronized void shutdown() {
    }

    /** @return null here; only the leia flavour has a panel to drive. */
    public static PanelDriver get(Context context) {
        return null;
    }

    private PanelDriver() {
    }

    /** True when this driver, rather than the shader, produces the interlaced frame. */
    public boolean ownsInterlacing() {
        return false;
    }

    /**
     * @return null here, so the caller builds its own view and weaves in the shader.
     */
    public View createStreamView(Context context, int width, int height,
                                 SurfaceListener listener) {
        return null;
    }

    /** Tells the panel whether the frames arriving are side-by-side or a single view. */
    public void setStereoContent(boolean sideBySide) {
    }

    /** Tells the panel the size of the frames it is being given. */
    public void setSourceSize(int width, int height) {
    }

    public void set3DMode(boolean enabled) {
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onWindowFocusChanged(boolean hasFocus) {
    }
}
