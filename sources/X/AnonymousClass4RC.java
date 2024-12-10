package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4RC  reason: invalid class name */
public final class AnonymousClass4RC {
    public C86534Sa A00;
    public AEW A01;
    public boolean A02;
    public final AnonymousClass1DS A03;
    public final C26911Ty A04;
    public final C41731wy A05;
    public final C23421Fz A06;

    public final void A00(C86534Sa r5) {
        CallState callState;
        C41731wy r3;
        Integer num;
        if (this.A02) {
            r3 = this.A05;
            num = AnonymousClass00R.A18;
        } else {
            if (r5 != null) {
                callState = r5.A0B;
            } else {
                callState = null;
            }
            if (callState != CallState.ACTIVE) {
                r3 = this.A05;
                num = AnonymousClass00R.A0j;
            } else {
                if (r5 != null) {
                    if (r5.A0Q) {
                        C134216qE r0 = r5.A07;
                        if (r0 == null || r0.A08 != 1) {
                            r3 = this.A05;
                            num = AnonymousClass00R.A0Y;
                        } else {
                            boolean z = r5.A0M;
                            r3 = this.A05;
                            if (z) {
                                num = AnonymousClass00R.A0j;
                            } else {
                                num = AnonymousClass00R.A00;
                            }
                        }
                    } else if (r5.A0L) {
                        r3 = this.A05;
                        num = AnonymousClass00R.A0N;
                    }
                }
                r3 = this.A05;
                num = AnonymousClass00R.A0C;
            }
        }
        r3.A0F(new AnonymousClass4YK((AnonymousClass1BI) null, (Boolean) null, num));
    }

    public AnonymousClass4RC(C26911Ty r4, AnonymousClass00H r5, C18600wl r6) {
        C18070vi.A0o(r5, r4, r6);
        this.A04 = r4;
        this.A06 = AnonymousClass4I5.A00(r6, new C99464sr(this, ((C85914Pf) C18070vi.A0E(r5)).A00(false), 2));
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A05 = A0o;
        this.A03 = A0o;
    }
}
