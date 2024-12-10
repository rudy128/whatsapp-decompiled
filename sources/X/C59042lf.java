package X;

import android.text.TextUtils;

/* renamed from: X.2lf  reason: invalid class name and case insensitive filesystem */
public class C59042lf {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C59042lf r7 = (C59042lf) obj;
            if (this.A00 != r7.A00 || !TextUtils.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        int A0I = AnonymousClass000.A0I(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return A0I + i;
    }

    public C59042lf(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(":");
        return AnonymousClass000.A0y(AnonymousClass1EG.A0B(this.A01, 4), A10);
    }
}
