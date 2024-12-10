package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.8yv  reason: invalid class name and case insensitive filesystem */
public class C175568yv extends C177699Af {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final C33711jG A04;
    public final C31061ex A05;
    public final C189589jU A06;
    public final C30931ek A07;
    public final AnonymousClass10I A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C175568yv(Context context, AnonymousClass1KB r9, AnonymousClass11S r10, AnonymousClass11E r11, AnonymousClass11P r12, C33711jG r13, AnonymousClass1QD r14, C31061ex r15, C189589jU r16, C30931ek r17, AnonymousClass17E r18, C50412Ui r19, AnonymousClass10I r20, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(r11, r14, r15, r18, r19);
        this.A00 = context;
        this.A03 = r12;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = r20;
        this.A07 = r17;
        this.A05 = r15;
        this.A04 = r13;
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A09 = str6;
        this.A0D = str7;
        this.A06 = r16;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1MD A0h;
        C19760yx r14 = (C19760yx) obj;
        String str = (String) r14.A00;
        A7B a7b = (A7B) r14.A01;
        if (str != null) {
            ArrayList A13 = AnonymousClass000.A13();
            C17890vO.A11("action", "br-prelink-merchant", A13);
            String str2 = this.A0F;
            if ("PREPAID".equals(str2)) {
                C17960vV.A06(str);
                A0h = AnonymousClass8BR.A0h("card-token", str);
            } else if ("BANK".equals(str2)) {
                C17960vV.A06(str);
                C17890vO.A11("bank-token", str, A13);
                String str3 = this.A0C;
                C17960vV.A06(str3);
                C17890vO.A11("bank-code", str3, A13);
                String str4 = this.A0B;
                C17960vV.A06(str4);
                C17890vO.A11("bank-branch", str4, A13);
                String str5 = this.A0A;
                C17960vV.A06(str5);
                A0h = AnonymousClass8BR.A0h("bank-account-type", str5);
            } else {
                throw AnonymousClass000.A0n("Expecting card token or bank account!");
            }
            A13.add(A0h);
            C17890vO.A11("device-id", this.A07.A01(), A13);
            C17890vO.A11("nonce", AnonymousClass1PP.A00(this.A02, this.A03, false), A13);
            C17890vO.A11("verify-type", str2, A13);
            C17890vO.A11("verify-id", this.A0E, A13);
            this.A05.A0I(new C175408yf(this.A00, this.A04, this.A01, this, 6), AnonymousClass8BX.A0P(A13), "set", C20113A7w.A0L);
            return;
        }
        C17900vP.A0X(a7b, "PAY: BrazilMerchantPreLinkAction token error: ", AnonymousClass000.A10());
        this.A06.A00(a7b);
    }
}
