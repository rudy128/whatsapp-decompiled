package com.facebook.animated.webp;

import X.AnonymousClass00R;
import X.C24255ByD;
import X.C24988CSo;
import X.C25386Cem;
import X.C25798CmA;
import X.C26208Cuj;
import X.E4S;
import X.EAH;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class WebPImage implements EAH, E4S {
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, C25798CmA cmA) {
        C25386Cem.A00();
        C26208Cuj.A01(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public EAH decodeFromByteBuffer(ByteBuffer byteBuffer, C25798CmA cmA) {
        C25386Cem.A00();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = cmA.A01;
        return nativeCreateFromDirectByteBuffer;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C24988CSo getFrameInfo(int i) {
        Integer num;
        C24255ByD byD;
        WebPFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            if (nativeGetFrame.isBlendWithPreviousFrame()) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            if (nativeGetFrame.shouldDisposeToBackgroundColor()) {
                byD = C24255ByD.DISPOSE_TO_BACKGROUND;
            } else {
                byD = C24255ByD.DISPOSE_DO_NOT;
            }
            return new C24988CSo(byD, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }

    public WebPFrame getFrame(int i) {
        return getFrame(i);
    }
}
