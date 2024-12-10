package X;

import android.content.Context;

/* renamed from: X.8yu  reason: invalid class name and case insensitive filesystem */
public class C175558yu extends C177699Af {
    public final int A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1KI A03;
    public final C33711jG A04;
    public final C31061ex A05;
    public final AnonymousClass1QS A06;
    public final C189579jT A07;
    public final C30931ek A08;
    public final AnonymousClass10I A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C175558yu(Context context, AnonymousClass1KB r9, AnonymousClass11E r10, AnonymousClass1KI r11, C33711jG r12, AnonymousClass1QD r13, C31061ex r14, AnonymousClass1QS r15, C189579jT r16, C30931ek r17, AnonymousClass17E r18, C50412Ui r19, AnonymousClass10I r20, String str, String str2, String str3, String str4, int i) {
        super(r10, r13, r14, r18, r19);
        this.A01 = context;
        this.A02 = r9;
        this.A09 = r20;
        this.A08 = r17;
        this.A06 = r15;
        this.A05 = r14;
        this.A03 = r11;
        this.A04 = r12;
        this.A0A = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A00 = i;
        this.A0D = str4;
        this.A07 = r16;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r13 = (C19760yx) obj;
        String str = (String) r13.A00;
        A7B a7b = (A7B) r13.A01;
        if (str == null) {
            C17900vP.A0X(a7b, "PAY: BrazilUpdateMerchantAccountAction token error: ", AnonymousClass000.A10());
            this.A07.A00(a7b);
            return;
        }
        C31061ex r6 = this.A05;
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[7];
        AnonymousClass8BV.A1M("action", "br-update-merchant-account", r2);
        AnonymousClass8BV.A1N("bank-token", str, r2);
        C17890vO.A12("bank-code", this.A0C, r2);
        AnonymousClass8BV.A1O("bank-branch", this.A0B, r2);
        r2[4] = AnonymousClass8BR.A0h("bank-account-type", String.valueOf(this.A00));
        r2[5] = AnonymousClass8BR.A0h("device-id", this.A08.A01());
        r2[6] = AnonymousClass8BR.A0h("nonce", this.A0D);
        r6.A0I(new C175408yf(this.A01, this.A04, this.A02, this, 8), AnonymousClass8BR.A0k("account", r2), "set", C20113A7w.A0L);
    }
}
