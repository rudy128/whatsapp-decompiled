package X;

import com.facebook.android.exoplayer2.util.Util;

public final class CYY {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CYY cyy = (CYY) obj;
            if (!Util.A0D(this.A01, cyy.A01) || !Util.A0D(this.A02, cyy.A02) || !Util.A0D(this.A00, cyy.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (C17880vN.A03(this.A01) + AnonymousClass8BW.A02(this.A02)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A03 + i;
    }

    public CYY(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
