package X;

import android.content.Context;
import java.util.Collections;

/* renamed from: X.AfP  reason: case insensitive filesystem */
public class C21154AfP implements BCH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass9UP A01;
    public final /* synthetic */ C184099aP A02;

    public void C3j(C187029f9 r5) {
        C182419Uh r2;
        C22414B6w b6w;
        C198009xd r3 = new C198009xd(new C182429Ui(true), 1);
        if (r5.A00 == 5) {
            r2 = new C166518d1(r5.A01, r3);
        } else {
            r2 = new C166508d0(r3, r5.A02);
        }
        C189189if r1 = this.A01.A00;
        synchronized (r1) {
            b6w = r1.A00;
        }
        if (b6w != null) {
            b6w.C3U(r2);
        }
    }

    public void C3l(String str) {
    }

    public C21154AfP(Context context, AnonymousClass9UP r2, C184099aP r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
    }

    public void C3d(CQF cqf) {
        C22414B6w b6w;
        CXY cxy = (CXY) this.A02.A01.get();
        if (cxy == null) {
            C166508d0 r2 = new C166508d0(C198009xd.A02, AnonymousClass000.A0n("Bloks Host not available."));
            C189189if r1 = this.A01.A00;
            synchronized (r1) {
                b6w = r1.A00;
            }
            if (b6w != null) {
                b6w.C3U(r2);
                return;
            }
            return;
        }
        C26209Cul.A02(this.A00, cqf, C199029zJ.A01, cxy, Collections.emptyMap());
    }
}
