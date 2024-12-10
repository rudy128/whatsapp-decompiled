package X;

import com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logAction$queueingResult$1;

/* renamed from: X.1Of  reason: invalid class name and case insensitive filesystem */
public final class C25441Of {
    public C52282af A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C25431Oe A03;
    public final C18100vl A04 = new C18110vm(new AnonymousClass3Di(3));
    public final C18100vl A05 = new C18110vm(new C71023Dm(this, 45));
    public final C18600wl A06;
    public final C18600wl A07;
    public final AnonymousClass1OX A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass11P A0A;

    public C25441Of(AnonymousClass190 r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, C25431Oe r7, C18600wl r8, C18600wl r9, AnonymousClass1OX r10) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r10, 8);
        this.A0A = r4;
        this.A01 = r5;
        this.A09 = r3;
        this.A02 = r6;
        this.A03 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
    }

    public void A00(C22821Di r9) {
        C52282af r6;
        IllegalStateException illegalStateException;
        if (C18020vd.A05(C18040vf.A02, this.A01, 11688)) {
            C85854Oz r7 = new C85854Oz(System.currentTimeMillis());
            r9.invoke(r7);
            Integer num = r7.A01;
            if (num == null || num.intValue() != 5) {
                Integer num2 = r7.A04;
                if (num2 == null || num2.intValue() != 1) {
                    r6 = this.A00;
                } else {
                    r6 = new C52282af(this.A03);
                    this.A00 = r6;
                }
                AnonymousClass1OX r4 = this.A08;
                Object CQ0 = ((C108495bn) this.A05.getValue()).CQ0(C30451dy.A02(AnonymousClass00R.A01, AnonymousClass1OR.A00, new MessagingFunnelLoggerImpl$logAction$queueingResult$1(r7, r6, this, (C30391dr) null), r4));
                if (!(!(CQ0 instanceof AnonymousClass4PR))) {
                    AnonymousClass190 r2 = this.A09;
                    if (CQ0 instanceof AnonymousClass5WK) {
                        illegalStateException = new IllegalStateException("Channel is closed");
                    } else {
                        illegalStateException = new IllegalStateException("Channel is full");
                    }
                    r2.A0E("MessagingFunnelLogger/Unable to queue event", (String) null, illegalStateException);
                }
            }
        }
    }
}
