package X;

import android.text.TextUtils;

/* renamed from: X.9Nw  reason: invalid class name and case insensitive filesystem */
public class C180779Nw {
    public int A00;
    public int A01;
    public String A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C180779Nw)) {
            return false;
        }
        C180779Nw r4 = (C180779Nw) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01 && TextUtils.equals(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, (((527 + this.A00) * 31) + this.A01) * 31);
    }
}
