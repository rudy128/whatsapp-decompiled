package X;

import java.util.List;

/* renamed from: X.8yr  reason: invalid class name and case insensitive filesystem */
public class C175528yr extends C177699Af {
    public final int A00;
    public final C191069ly A01;
    public final BB7 A02;
    public final List A03;

    public C175528yr(AnonymousClass11E r7, AnonymousClass1QD r8, C31061ex r9, C191069ly r10, BB7 bb7, AnonymousClass17E r12, C50412Ui r13, List list, int i) {
        super(r7, r8, r9, r12, r13);
        this.A03 = list;
        this.A02 = bb7;
        this.A00 = i;
        this.A01 = r10;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        A7B A002;
        C19760yx r7 = (C19760yx) obj;
        String str = (String) r7.A00;
        A7B a7b = (A7B) r7.A01;
        BB7 bb7 = this.A02;
        if (bb7 != null) {
            if (str == null) {
                AnonymousClass8BS.A1G("PinTokenizer", AnonymousClass001.A1E(a7b, "PaymentPinTokenTask token error: ", AnonymousClass000.A10()));
                if (a7b != null) {
                    A002 = a7b;
                } else {
                    A002 = A7B.A00();
                }
                bb7.Bss(A002);
            } else {
                bb7.C7R(str);
            }
        }
        C191069ly r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (str == null) {
            AnonymousClass8BS.A1G("PinTokenizer", AnonymousClass001.A1E(a7b, "PaymentPinTokenTask token error: ", AnonymousClass000.A10()));
            if (a7b == null) {
                a7b = A7B.A00();
            }
            if (AnonymousClass8BV.A1Z(r1.A01)) {
                r1.A02.decrementAndGet();
                r1.A00.Bss(a7b);
                return;
            }
            return;
        }
        r1.A00(this.A00, str);
    }
}
