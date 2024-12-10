package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* renamed from: X.CWt  reason: case insensitive filesystem */
public abstract class C25083CWt {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public C26140Ct3 A01;
    public final C26140Ct3 A02;
    public final int[] A03 = new int[1];
    public final int[] A04 = new int[1];

    public void A00() {
        C26140Ct3 ct3 = this.A01;
        EGLSurface eGLSurface = this.A00;
        synchronized (ct3.A07) {
            boolean equals = ct3.A03.equals(EGL14.eglGetCurrentContext());
            boolean equals2 = ct3.A04.equals(EGL14.EGL_NO_DISPLAY);
            boolean equals3 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
            boolean equals4 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12378));
            if (!equals || !equals3 || !equals4) {
                if (!EGL14.eglMakeCurrent(ct3.A04, eGLSurface, eGLSurface, ct3.A03)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("eglMakeCurrent, contextWasAlreadyCurrent=");
                    A10.append(equals);
                    A10.append(" isDisplayNoDisplay=");
                    A10.append(equals2);
                    A10.append(" drawSurfaceWasAlreadyCurrent=");
                    A10.append(equals3);
                    C26058CrU.A02(C17900vP.A0D(" readSurfaceWasAlreadyCurrent=", A10, equals4));
                    if (!EGL14.eglMakeCurrent(ct3.A04, eGLSurface, eGLSurface, ct3.A03)) {
                        StringBuilder A11 = AnonymousClass000.A11("eglMakeCurrent, contextWasAlreadyCurrent=");
                        A11.append(equals);
                        A11.append(" isDisplayNoDisplay=");
                        A11.append(equals2);
                        A11.append(" drawSurfaceWasAlreadyCurrent=");
                        A11.append(equals3);
                        C26058CrU.A02(C17900vP.A0D(" readSurfaceWasAlreadyCurrent=", A11, equals4));
                    }
                }
            }
        }
    }

    public C25083CWt(C26140Ct3 ct3) {
        this.A01 = ct3;
        this.A02 = ct3;
    }
}
