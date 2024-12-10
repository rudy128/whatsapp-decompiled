package X;

import android.text.TextUtils;

public final class CYB {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != CYB.class) {
                return false;
            }
            CYB cyb = (CYB) obj;
            if (!TextUtils.equals(this.A00, cyb.A00) || this.A01 != cyb.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C17890vO.A02(this.A00, 31);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return ((A02 + i) * 31) + 1237;
    }

    public CYB(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
