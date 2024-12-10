package X;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7OS  reason: invalid class name */
public final class AnonymousClass7OS implements BCH {
    public final /* synthetic */ CXY A00;
    public final /* synthetic */ C1603488c A01;
    public final /* synthetic */ WeakReference A02;

    public void C3d(CQF cqf) {
        C1603488c r1;
        AnonymousClass6U4 r0;
        C18070vi.A0d(cqf, 0);
        Context A0F = C108945cZ.A0F(this.A02);
        if (A0F != null) {
            C26209Cul.A02(A0F, cqf, C199029zJ.A01, this.A00, AnonymousClass1D7.A0I());
            r1 = this.A01;
            r0 = AnonymousClass6N8.A00;
        } else {
            r1 = this.A01;
            r0 = AnonymousClass6N7.A00;
        }
        r1.BpJ(r0);
    }

    public void C3j(C187029f9 r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A00 == 5) {
            Log.e("AsyncActionLauncher", "should launch as an async action");
        }
        this.A01.BpJ(new AnonymousClass6N5(r3));
    }

    public void C3l(String str) {
    }

    public AnonymousClass7OS(CXY cxy, C1603488c r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = cxy;
    }
}
