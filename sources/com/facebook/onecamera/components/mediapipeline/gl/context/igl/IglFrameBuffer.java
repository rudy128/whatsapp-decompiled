package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.AnonymousClass1A8;
import X.C22834BRm;
import X.C9V;
import X.CZB;
import X.E9R;
import com.facebook.jni.HybridData;

public final class IglFrameBuffer implements E9R {
    public static final C9V Companion = new Object();
    public static final String TEXTURE_DESCRIPTION = "IglFrameBufferTexture";
    public final int frameBufferId = getFrameBufferIdNative();
    public final int height = getHeightNative();
    public final boolean is10Bit;
    public final HybridData mHybridData;
    public final CZB texture = new C22834BRm(getIglTexture());
    public final int width = getWidthNative();

    private final native void bindNative();

    private final native int getFrameBufferIdNative();

    private final native int getHeightNative();

    private final native IglTexture getIglTexture();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native int getWidthNative();

    private final native void releaseNative();

    private final native void unbindNative();

    public void lock() {
    }

    public void unlock() {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C9V, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("mediapipeline-igl-context");
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public CZB getTexture() {
        return this.texture;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean is10Bit() {
        return this.is10Bit;
    }

    public void release() {
        this.texture.A01();
        releaseNative();
    }

    public IglFrameBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void bind() {
        bindNative();
    }

    public void unbind() {
        unbindNative();
    }
}
