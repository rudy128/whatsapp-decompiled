package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1IN;
import X.AnonymousClass1IT;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass3MY;
import X.C100124u0;
import X.C18600wl;
import X.C22801Dg;
import X.C23871Hy;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C30691eM;
import X.C85614Ob;
import java.util.concurrent.CancellationException;

public final class CoroutineLiveData extends C22801Dg {
    public C85614Ob A00;

    public final C27621Wu A0I(C30391dr r5) {
        C100124u0 r3;
        int i;
        if (r5 instanceof C100124u0) {
            r3 = (C100124u0) r5;
            int i2 = r3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3.label = i2 - Integer.MIN_VALUE;
                Object obj = r3.result;
                i = r3.label;
                if (i != 0 || i == 1) {
                    C30691eM.A01(obj);
                    return C27621Wu.A00;
                }
                throw AnonymousClass000.A0l();
            }
        }
        r3 = new C100124u0(this, r5);
        Object obj2 = r3.result;
        i = r3.label;
        if (i != 0) {
        }
        C30691eM.A01(obj2);
        return C27621Wu.A00;
    }

    public void A07() {
        super.A07();
        C85614Ob r3 = this.A00;
        if (r3 != null) {
            AnonymousClass1OB r0 = r3.A00;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            r3.A00 = null;
            if (r3.A01 == null) {
                r3.A01 = AnonymousClass3MY.A0s(new BlockRunner$maybeRun$1(r3, (C30391dr) null), r3.A05);
            }
        }
    }

    public void A08() {
        super.A08();
        C85614Ob r4 = this.A00;
        if (r4 == null) {
            return;
        }
        if (r4.A00 == null) {
            AnonymousClass1OX r3 = r4.A05;
            C18600wl r0 = C23871Hy.A00;
            r4.A00 = C30451dy.A02(AnonymousClass00R.A00, ((AnonymousClass1IT) AnonymousClass1IN.A00).A01, new BlockRunner$cancel$1(r4, (C30391dr) null), r3);
            return;
        }
        throw AnonymousClass000.A0n("Cancel call cannot happen without a maybeRun");
    }
}
