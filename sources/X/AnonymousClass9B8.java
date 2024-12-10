package X;

import android.content.Intent;
import java.util.List;

/* renamed from: X.9B8  reason: invalid class name */
public class AnonymousClass9B8 extends A34 {
    public final /* synthetic */ AnonymousClass91R A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass9B8(AnonymousClass91R r1, String str, List list, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = list;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AW0 aw0 = (AW0) obj;
        AnonymousClass91R r3 = this.A00;
        if (!r3.A11) {
            r3.A0V.A02(r3.A00, 2);
            r3.CEx();
            r3.A4o();
            C19954A0l a0l = (C19954A0l) r3.A0Q.get();
            if (C29431cG.A18(C19954A0l.A04, r3.A0g)) {
                if (C18020vd.A05(C18040vf.A02, a0l.A00, 8558) && r3.A0c) {
                    Intent A0A = C17880vN.A0A();
                    AnonymousClass91R.A15(A0A, r3);
                    C72453Mb.A16(r3, A0A);
                    return;
                }
            }
            r3.A4d();
        } else if (aw0 == null) {
            A7B a7b = new A7B(C20752AXh.A00(r3.A04, 0));
            AnonymousClass90Z r6 = r3.A0V;
            int i = r3.A00;
            r6.A05("error_code", (long) a7b.A00, i);
            r6.A02(i, 3);
            r3.A5W(a7b);
        } else {
            r3.A0V.A02(r3.A00, 2);
            AnonymousClass91R.A18(aw0, r3, true);
        }
    }
}
