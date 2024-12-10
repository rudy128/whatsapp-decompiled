package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.6LE  reason: invalid class name */
public class AnonymousClass6LE extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public AnonymousClass6LE(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A06 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
        this.A02 = obj5;
        this.A07 = str;
        this.A05 = obj6;
    }

    public void A04(View view) {
        int i;
        if (this.A00 != 0) {
            AnonymousClass730 r3 = (AnonymousClass730) this.A06;
            List list = (List) this.A05;
            ((Handler) this.A03).removeCallbacks((Runnable) this.A02);
            r3.A03.CGF(new C21357Aim(r3, list, 2));
            C129246hU r0 = (C129246hU) this.A04;
            C41751x0.A01(r0.A01, r0.A02, r0.A03);
            ((C139026y5) C18070vi.A0E(r3.A05)).A01((Boolean) null, (Integer) this.A01, (Integer) null, (Integer) null, this.A07, list, 2, true);
            C30131dR A13 = C108945cZ.A13(r3.A0B);
            C108995ce.A1G(C108945cZ.A11(r3.A06), A13, AnonymousClass730.A0C);
            A13.A03("TAP_UNDO");
            return;
        }
        C139126yG r5 = (C139126yG) this.A06;
        Object obj = this.A04;
        Integer num = (Integer) this.A01;
        List A002 = AnonymousClass6YC.A00(num);
        ((Handler) this.A03).removeCallbacks((Runnable) this.A02);
        AnonymousClass10I r4 = r5.A01;
        AnonymousClass7RO.A02(r4, obj, A002, r5, 48);
        String str = this.A07;
        switch (num.intValue()) {
            case 0:
                i = 2131898368;
                break;
            case 1:
                i = 2131898378;
                break;
            default:
                i = 2131898352;
                break;
        }
        C139126yG.A00((C38471rL) null, r5, str, i, 0);
        C146787Qp.A00(r4, this.A05, 44);
    }
}
