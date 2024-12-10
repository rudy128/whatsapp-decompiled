package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.9tS  reason: invalid class name and case insensitive filesystem */
public abstract class C195509tS {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C33621j7 A01;
    public final C219017v A02;
    public final C203911y A03;
    public final C58802lH A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;

    public void A00() {
        if (this instanceof C1775799i) {
            C1775799i r0 = (C1775799i) this;
            r0.A05.CGD(new C1775699h(r0), new Object[0]);
            return;
        }
        C1775899j r5 = (C1775899j) this;
        if (r5.A00) {
            C70603Bt r10 = new C70603Bt(r5, 47);
            C70603Bt r9 = new C70603Bt(r5, 48);
            C70603Bt r8 = new C70603Bt(r5, 49);
            C27351Vt r7 = r5.A06;
            C70833Cr r6 = new C70833Cr((Object) r7, (Object) r8, (Object) r9, (Object) r10, 23);
            File A0H = C33621j7.A00(r5.A01).A09.A0H();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A3K.A02(AnonymousClass9JN.A01()).iterator();
            while (it.hasNext()) {
                A13.addAll(A8L.A01(A0H, Collections.singletonList(it.next())));
            }
            if (r7.A00(r6, A13) != 0) {
                r5.A04.sendEmptyMessageDelayed(1, 32000);
                return;
            }
        }
        r5.A05.CGD(new AnonymousClass99g(r5, r5.A0F, r5.A00, r5.A0E), new Object[0]);
    }

    public void A01() {
        if (!(this instanceof C1775799i)) {
            ((C1775899j) this).A03.A00.A4c();
        }
    }

    public void A02(C192039nf r4) {
        if (this instanceof C1775799i) {
            boolean A002 = r4.A00();
            Object obj = ((C1775799i) this).A05.get();
            if (A002) {
                C18070vi.A0X(obj);
                C20735AWq.A00((AnonymousClass10T) obj, 36);
                return;
            }
            ((C175248yO) obj).A00(202, "Message Store cannot be verified");
            return;
        }
        ((C1775899j) this).A03.A00.A4d(r4);
    }

    public C195509tS(C33621j7 r2, C219017v r3, C203911y r4, C58802lH r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
    }
}
