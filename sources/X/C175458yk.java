package X;

import android.content.Context;

/* renamed from: X.8yk  reason: invalid class name and case insensitive filesystem */
public class C175458yk extends C20992Ack {
    public final /* synthetic */ BBE A00;
    public final /* synthetic */ C188049gn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175458yk(Context context, C33711jG r2, BBE bbe, C188049gn r4, AnonymousClass119 r5, String str, String str2) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A02 = str;
        this.A00 = bbe;
        this.A03 = str2;
    }

    public void A04(A7B a7b) {
        AnonymousClass1QE r2 = this.A01.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentKycAction ");
        A10.append(this.A02);
        AnonymousClass8BX.A1C(r2, a7b, ": onRequestError: ", A10);
        this.A00.BwU(a7b);
    }

    public void A05(A7B a7b) {
        AnonymousClass1QE r2 = this.A01.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentKycAction ");
        A10.append(this.A02);
        AnonymousClass8BX.A1C(r2, a7b, ": onResponseError: ", A10);
        this.A00.BwU(a7b);
    }

    public void A06(C29621ca r6) {
        AnonymousClass1QE r2;
        String str;
        C29621ca A0j = AnonymousClass8BR.A0j(r6);
        if (A0j == null) {
            r2 = this.A01.A05;
            StringBuilder A11 = AnonymousClass000.A11("PaymentKycAction ");
            A11.append(this.A02);
            str = AnonymousClass000.A0y(": onResponseSuccess: missing account node", A11);
        } else {
            A7B A012 = A7B.A01(A0j);
            if (A012 != null) {
                C188049gn r3 = this.A01;
                AnonymousClass1QE r22 = r3.A05;
                StringBuilder A112 = AnonymousClass000.A11("PaymentKycAction ");
                A112.append(this.A02);
                AnonymousClass8BX.A1C(r22, A012, ": onResponseSuccess: account-node error: ", A112);
                if (A012.A00 == 1448) {
                    r3.A04.A02(A012, this.A03, "KYC");
                }
                this.A00.BwU(A012);
                return;
            }
            C64532uv A002 = AnonymousClass2TR.A00(A0j);
            if (A002 != null) {
                this.A00.BwV(A002);
                return;
            } else {
                r2 = this.A01.A05;
                str = "PaymentKycAction/createCallback PaymentKycInfo is null";
            }
        }
        r2.A05(str);
        this.A00.BwU(A7B.A00());
    }
}
