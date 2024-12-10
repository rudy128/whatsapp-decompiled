package X;

import android.content.Context;
import android.util.Log;
import java.util.Collections;

/* renamed from: X.7OT  reason: invalid class name */
public class AnonymousClass7OT implements BCH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7OT(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public void C3d(CQF cqf) {
        CQF cqf2 = cqf;
        if (this.A00 != 0) {
            ((C185199cC) this.A01).A01.A00(new C146617Py(cqf2, this.A02, this.A04, this.A03, 26));
            return;
        }
        C26209Cul.A02((Context) this.A02, cqf, C199029zJ.A01, (CXY) this.A04, Collections.emptyMap());
        ((C1604788q) this.A03).BJB(true);
    }

    public void C3j(C187029f9 r6) {
        if (this.A00 != 0) {
            ((C185199cC) this.A01).A01.A00(new C21451AkI(this.A02, ((AnonymousClass86X) this.A03).BM3(), 15));
            return;
        }
        if (r6.A00 == 5) {
            Log.e("AccountLinkingLauncher", "should launch as an async action");
        }
        ((C1604788q) this.A03).BJC(r6.A02, false);
    }

    public void C3l(String str) {
    }
}
