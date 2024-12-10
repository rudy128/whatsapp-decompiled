package X;

import java.util.Map;

/* renamed from: X.8ys  reason: invalid class name and case insensitive filesystem */
public final class C175538ys extends C177699Af {
    public final AnonymousClass9YF A00;
    public final AnonymousClass10I A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175538ys(AnonymousClass11E r8, AnonymousClass1QD r9, C31061ex r10, AnonymousClass9YF r11, AnonymousClass17E r12, C50412Ui r13, AnonymousClass10I r14, String str, String str2) {
        super(r8, r9, r10, r12, r13);
        AnonymousClass8BU.A1H(r12, 5, r13);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r11;
        this.A01 = r14;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Integer num;
        C19760yx r6 = (C19760yx) obj;
        AnonymousClass9YF r3 = this.A00;
        if (r3 != null) {
            A7B a7b = null;
            if (r6 != null) {
                String str = (String) r6.A00;
                a7b = (A7B) r6.A01;
                if (!(str == null || str.length() == 0)) {
                    r3.A00.C7V(C108975cc.A0h("card_token", str));
                    return;
                }
            }
            BBM bbm = r3.A00;
            if (a7b != null) {
                num = Integer.valueOf(a7b.A00);
            } else {
                num = null;
            }
            bbm.Btu(new C19980A1q(num, "PaymentNetworkError", (String) null), (Map) null);
        }
    }
}
