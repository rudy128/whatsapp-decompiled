package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: X.DTi  reason: case insensitive filesystem */
public final class C27083DTi implements Runnable, SurfaceTexture.OnFrameAvailableListener {
    public static final int[] A06 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = BE6.A1X();

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    public void run() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public C27083DTi(Handler handler) {
        this.A04 = handler;
    }
}
