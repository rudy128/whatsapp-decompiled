package X;

import android.text.TextUtils;

public final class CYZ {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CYZ cyz = (CYZ) obj;
            if (!(this.A00 == cyz.A00 && this.A01 == cyz.A01 && TextUtils.equals(this.A02, cyz.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AnonymousClass8BW.A02(this.A02);
    }

    public CYZ(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
