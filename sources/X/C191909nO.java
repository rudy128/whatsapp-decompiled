package X;

import android.content.Context;

/* renamed from: X.9nO  reason: invalid class name and case insensitive filesystem */
public class C191909nO {
    public final AnonymousClass1KI A00;
    public final AnonymousClass1QS A01;
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass1OZ A06;
    public final C20074A6a A07;
    public final C33711jG A08;
    public final C31061ex A09;
    public final C191389mW A0A;
    public final C30931ek A0B;
    public final String A0C;

    public void A00(BB9 bb9) {
        AnonymousClass1QS r12 = this.A01;
        AnonymousClass1KH A0R = AnonymousClass8BR.A0R(r12);
        String str = this.A0C;
        C20284AEs A082 = A0R.A08(str);
        C17960vV.A07(A082);
        AnonymousClass8pK r1 = (AnonymousClass8pK) A082;
        AnonymousClass8pT r3 = (AnonymousClass8pT) r1.A08;
        BB9 bb92 = bb9;
        if (r3 != null) {
            if (r3.A07) {
                AnonymousClass11P r6 = this.A05;
                new A0N(this.A02, this.A03, this.A04, r6, this.A00, this.A06, this.A07, this.A08, this.A09, r12, new AY3(r1, bb92, this), this.A0A).A01(r1);
                return;
            } else if (r3.A0a) {
                bb92.Bo0(r1);
                return;
            }
        }
        AnonymousClass1OZ r5 = this.A06;
        String A0B2 = r5.A0B();
        String A012 = this.A0B.A01();
        C18070vi.A0k(str, A012);
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O, "w:pay");
        boolean A1X = AnonymousClass8BY.A1X(A0O, A0B2);
        C29591cX A0R2 = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R2, "action", "br-get-verification-methods");
        AnonymousClass8BY.A1B(A0R2, str, A1X);
        AnonymousClass8BY.A1C(A0R2, A012, A1X);
        r5.A0I(new C175428yh(this.A02, this.A08, this.A03, bb92, this, 8), C29591cX.A00(A0R2, A0O), A0B2, 204, 0);
    }

    public C191909nO(Context context, AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1KI r5, AnonymousClass1OZ r6, C20074A6a a6a, C33711jG r8, C31061ex r9, AnonymousClass1QS r10, C191389mW r11, C30931ek r12, String str) {
        this.A05 = r4;
        this.A02 = context;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r6;
        this.A0B = r12;
        this.A01 = r10;
        this.A09 = r9;
        this.A0A = r11;
        this.A00 = r5;
        this.A07 = a6a;
        this.A08 = r8;
        this.A0C = str;
    }
}
