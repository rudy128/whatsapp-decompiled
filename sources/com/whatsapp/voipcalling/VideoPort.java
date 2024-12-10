package com.whatsapp.voipcalling;

import X.CZE;
import X.E2y;
import X.E8J;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    CZE createSurfaceTexture();

    @Deprecated
    Context getContext();

    @Deprecated
    SurfaceHolder getSurfaceHolder();

    @Deprecated
    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(CZE cze);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    void renderTexture(CZE cze, int i, int i2);

    int resetBlackScreen();

    void setCornerRadius(float f);

    void setListener(E2y e2y);

    void setPassthroughVideoPortCallback(E8J e8j);

    int setScaleType(int i);

    int setScaleTypeForVR(int i, boolean z);

    int useLanczosFilter(int i);
}
