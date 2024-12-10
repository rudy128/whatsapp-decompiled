package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: X.7BD  reason: invalid class name */
public final class AnonymousClass7BD implements C28606E9x, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ C122126Mw A00;

    public void C0j() {
    }

    public void C0p(C24399C1u c1u, C0Q c0q) {
    }

    public void C0z(int i) {
    }

    public void C8e() {
    }

    public void C93(C26539D3a d3a) {
    }

    public void CAS(C0Q c0q, String str) {
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public AnonymousClass7BD(C122126Mw r1) {
        this.A00 = r1;
    }

    public void C0r(int i, boolean z) {
        this.A00.A08.A0J(new C146837Qu(this, i, 8, z));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C122126Mw.A00(new Surface(surfaceTexture), this.A00, true);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C122126Mw.A00((Surface) null, this.A00, true);
        return true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C122126Mw.A00(surfaceHolder.getSurface(), this.A00, false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C122126Mw.A00((Surface) null, this.A00, false);
    }
}
