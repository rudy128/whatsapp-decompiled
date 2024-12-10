package X;

import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4RD  reason: invalid class name */
public final class AnonymousClass4RD {
    public final C36531o3 A00;
    public final AnonymousClass11C A01;
    public final C18030ve A02;
    public final C36401np A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass1LU A06;

    public AnonymousClass4RD(AnonymousClass1L9 r1, C36531o3 r2, AnonymousClass11C r3, AnonymousClass1MZ r4, C18030ve r5, AnonymousClass1LU r6, C36401np r7) {
        C18070vi.A0w(r5, r7, r6, r1, r3);
        C18070vi.A0l(r2, r4);
        this.A02 = r5;
        this.A03 = r7;
        this.A06 = r6;
        this.A04 = r1;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r4;
    }

    public final void A00(AnonymousClass1FL r4, AnonymousClass1EC r5, WDSButton wDSButton, C18090vk r7) {
        C108235bM r1;
        C18070vi.A0i(wDSButton, r5);
        if (this.A05.A0P(r5)) {
            r1 = new C93964jp(r4, this.A04, this.A06, r5);
        } else {
            r1 = new C93954jo(r4);
        }
        C108235bM r12 = r1;
        wDSButton.setAction(r12.BNs());
        wDSButton.setText(r12.BQk());
        C90004dN.A00(wDSButton, r7, r12, 20);
    }
}
