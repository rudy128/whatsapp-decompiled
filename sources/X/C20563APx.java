package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.APx  reason: case insensitive filesystem */
public final class C20563APx implements C22438B7u {
    public final C19880zA A00;
    public final C57652jQ A01;
    public final AnonymousClass1P3 A02;
    public final AnonymousClass1RK A03;
    public final AnonymousClass1MQ A04;
    public final AnonymousClass00H A05;

    public Object CGG(C198589ya r7, C179319Hm r8, BCS bcs, String str, C30391dr r11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C31781g7.A04;
        C31781g7 r2 = new C31781g7(1, C30581eB.A02(r11));
        r2.A0F();
        C184369aq r5 = (C184369aq) this.A05.get();
        int A042 = C108955ca.A04(r8, 0);
        int i = 2;
        if (A042 != 0) {
            if (A042 == 1) {
                i = 3;
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        C170868qn r4 = new C170868qn();
        r4.A00 = Integer.valueOf(i);
        r4.A01 = Long.valueOf(AnonymousClass11P.A00(r5.A00));
        r5.A01.CC7(r4);
        AnonymousClass1P3 r0 = this.A02;
        r0.A0O();
        r0.A0P();
        C179319Hm r42 = C179319Hm.UNPAIRING;
        if (r8 == r42 && r7 != null) {
            C198589ya.A00(r7, C17890vO.A0L(), (String) null, 1);
        }
        this.A04.A07();
        if (r8 == r42 && r7 != null) {
            C198589ya.A00(r7, C17890vO.A0L(), (String) null, 4);
        }
        C19880zA r1 = this.A00;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("removeAllAgentDevices");
        }
        C20735AWq.A00(this.A03, 26);
        if (r8 == C179319Hm.PAIRING && bcs != null) {
            bcs.Bia(6);
        }
        r2.resumeWith(new C184379ar(AnonymousClass9I9.UNKNOWN, true));
        return r2.A0C();
    }

    public C20563APx(C19880zA r2, C57652jQ r3, AnonymousClass1P3 r4, AnonymousClass1RK r5, AnonymousClass1MQ r6, AnonymousClass00H r7) {
        C18070vi.A0w(r6, r4, r5, r2, r7);
        C18070vi.A0d(r3, 6);
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
    }
}
