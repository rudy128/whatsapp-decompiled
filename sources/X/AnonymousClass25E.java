package X;

import android.text.TextUtils;

/* renamed from: X.25E  reason: invalid class name */
public final class AnonymousClass25E implements AnonymousClass25C, AnonymousClass25D {
    public final AW0 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass25E) {
                AnonymousClass25E r5 = (AnonymousClass25E) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AW0 aw0 = this.A00;
        int i = 0;
        int hashCode = (aw0 == null ? 0 : aw0.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentTransactionInfoDataExt(paymentTransactionInfoData=");
        sb.append(this.A00);
        sb.append(", paymentTransactionId=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass25E(AW0 aw0, String str) {
        this.A00 = aw0;
        this.A01 = str;
    }

    public void BF3(AnonymousClass206 r5, AnonymousClass206 r6) {
        if (AnonymousClass25B.A00(r5) != null && AnonymousClass25B.A00(r6) != null) {
            AW0 A002 = AnonymousClass25B.A00(r5);
            if (A002 != null) {
                AW0 A003 = AnonymousClass25B.A00(r6);
                synchronized (A002) {
                    if (A003 != null) {
                        if (TextUtils.isEmpty(A003.A0K) || A003.A0K.equals(A002.A0K)) {
                            A003.A0K = A002.A0K;
                            A003.A02 = A002.A02;
                            A003.A06 = A002.A06;
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
