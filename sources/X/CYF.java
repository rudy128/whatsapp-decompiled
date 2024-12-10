package X;

import android.net.Uri;

public class CYF {
    public Uri A00;
    public float[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CYF cyf = (CYF) obj;
            C26159CtX.A01(this.A01);
            C26159CtX.A01(cyf.A01);
            float[] fArr = cyf.A01;
            int length = fArr.length;
            float[] fArr2 = this.A01;
            int length2 = fArr2.length;
            if (length == length2) {
                int i = 0;
                while (i < length2) {
                    if (Float.compare(fArr[i], fArr2[i]) == 0) {
                        i++;
                    }
                }
                return AnonymousClass026.A00(this.A00, cyf.A00);
            }
        }
        return false;
    }

    public int hashCode() {
        C26159CtX.A01(this.A01);
        int A0l = AnonymousClass001.A0l(this.A00);
        int i = 0;
        while (true) {
            float[] fArr = this.A01;
            if (i >= fArr.length) {
                return A0l;
            }
            float f = fArr[i];
            A0l = (A0l * 31) + BE9.A07((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f);
            i++;
        }
    }
}
