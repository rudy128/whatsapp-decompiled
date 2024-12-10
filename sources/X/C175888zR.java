package X;

import android.content.Context;

/* renamed from: X.8zR  reason: invalid class name and case insensitive filesystem */
public class C175888zR extends C175498yo {
    public final /* synthetic */ C22453B8l A00;
    public final /* synthetic */ C175798zI A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175888zR(Context context, AnonymousClass1KB r8, C33711jG r9, C196259ui r10, C22453B8l b8l, C175798zI r12, String str) {
        super(context, r8, r9, r10, "register-alias");
        this.A01 = r12;
        this.A02 = str;
        this.A00 = b8l;
    }

    public void A04(A7B a7b) {
        C175798zI.A00(a7b, this.A01, this.A02);
        super.A04(a7b);
        this.A00.C2n((AEC) null, a7b);
    }

    public void A05(A7B a7b) {
        C175798zI.A00(a7b, this.A01, this.A02);
        super.A05(a7b);
        this.A00.C2n((AEC) null, a7b);
    }

    public void A06(C29621ca r6) {
        C29621ca A0K;
        C175798zI r4 = this.A01;
        C175798zI.A00((A7B) null, r4, this.A02);
        super.A06(r6);
        C29621ca A0j = AnonymousClass8BR.A0j(r6);
        if (A0j != null && (A0K = A0j.A0K("alias")) != null) {
            C22453B8l b8l = this.A00;
            try {
                b8l.C2n(C175498yo.A00(A0K), (A7B) null);
            } catch (AnonymousClass1UI unused) {
                r4.A00.A05("onRegisterVpaAlias/onResponseSuccess/corrupt stream exception");
                b8l.C2n((AEC) null, new A7B(500));
            }
        }
    }
}
