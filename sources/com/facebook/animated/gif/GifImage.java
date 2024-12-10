package com.facebook.animated.gif;

import X.AnonymousClass00R;
import X.AnonymousClass1AK;
import X.C24255ByD;
import X.C24988CSo;
import X.C25798CmA;
import X.E4S;
import X.EAH;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class GifImage implements EAH, E4S {
    public static volatile boolean sInitialized;
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public boolean doesRenderSupportScaling() {
        return false;
    }

    public static synchronized void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                AnonymousClass1AK.A00("gifimage");
            }
        }
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public EAH decodeFromByteBuffer(ByteBuffer byteBuffer, C25798CmA cmA) {
        ensure();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, cmA.A00, cmA.A03);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = cmA.A01;
        return nativeCreateFromDirectByteBuffer;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C24988CSo getFrameInfo(int i) {
        C24255ByD byD;
        GifFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            Integer num = AnonymousClass00R.A00;
            int disposalMode = nativeGetFrame.getDisposalMode();
            if (!(disposalMode == 0 || disposalMode == 1)) {
                if (disposalMode == 2) {
                    byD = C24255ByD.DISPOSE_TO_BACKGROUND;
                } else if (disposalMode == 3) {
                    byD = C24255ByD.DISPOSE_TO_PREVIOUS;
                }
                return new C24988CSo(byD, num, xOffset, yOffset, width, height);
            }
            byD = C24255ByD.DISPOSE_DO_NOT;
            return new C24988CSo(byD, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        int i = nativeGetLoopCount + 1;
        if (nativeGetLoopCount == 0) {
            return 0;
        }
        return i;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    public GifImage() {
    }
}
