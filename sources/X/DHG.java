package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

public class DHG implements E7s {
    public DHE A00;
    public final C25516ChE A01;

    public boolean Bch() {
        return true;
    }

    public EAZ BGk(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C25998CqE cqE, C25092CXd cXd, C25752ClM clM, C26052CrM crM, CZT czt) {
        C26052CrM crM2 = crM;
        C26159CtX.A01(crM2);
        DHE dhe = new DHE(context, eGLContext, cqE, clM, crM2, this.A01, czt);
        this.A00 = dhe;
        return dhe;
    }

    public DHG(C25516ChE chE) {
        this.A01 = chE;
    }
}
