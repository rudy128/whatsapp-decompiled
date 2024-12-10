package X;

import com.whatsapp.util.Log;

/* renamed from: X.ARp  reason: case insensitive filesystem */
public final class C20605ARp implements C201511a {
    public AnonymousClass8CE A00;
    public AnonymousClass8C6 A01;
    public final C29831cw A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C219217x A06;
    public final AnonymousClass19D A07;
    public final AnonymousClass10I A08;

    public void A00() {
        AnonymousClass11B A0O;
        if (this.A01 != null) {
            this.A02.A02(this.A01, C108945cZ.A0E(this.A05));
            this.A01 = null;
        }
        try {
            AnonymousClass8CE r1 = this.A00;
            if (!(r1 == null || (A0O = this.A03.A0O()) == null)) {
                AnonymousClass11B.A00(A0O).unregisterContentObserver(r1);
            }
            this.A00 = null;
        } catch (Exception e) {
            Log.e("FlashCallManager/unregisterCallLogContentObserver/error", e);
        }
    }

    public C20605ARp(C29831cw r1, AnonymousClass11C r2, AnonymousClass11P r3, AnonymousClass118 r4, C219217x r5, AnonymousClass19D r6, AnonymousClass10I r7) {
        C18070vi.A0w(r4, r7, r2, r5, r1);
        C18070vi.A0l(r3, r6);
        this.A05 = r4;
        this.A08 = r7;
        this.A03 = r2;
        this.A06 = r5;
        this.A02 = r1;
        this.A04 = r3;
        this.A07 = r6;
    }
}
