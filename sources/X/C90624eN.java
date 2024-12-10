package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4eN  reason: invalid class name and case insensitive filesystem */
public class C90624eN implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90624eN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public boolean onPreDraw() {
        switch (this.A00) {
            case 0:
                View view = (View) this.A02;
                AnonymousClass3MX.A1G(view, this);
                C91824gJ r0 = (C91824gJ) this.A01;
                view.post(new C27081DTg(r0.A03, this, r0.A00, 42));
                return true;
            case 1:
                C79093uR r1 = (C79093uR) this.A02;
                AnonymousClass3MX.A1G(r1, this);
                r1.A1T((AnonymousClass205) this.A01);
                return true;
            default:
                C17960vV.A02();
                if (((AnonymousClass4NU) this.A01).A00) {
                    AnonymousClass3MX.A1G((View) this.A02, this);
                    return true;
                }
                SystemClock.elapsedRealtime();
                return true;
        }
    }
}
