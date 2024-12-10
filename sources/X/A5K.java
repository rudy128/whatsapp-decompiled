package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Arrays;

public final class A5K {
    public static final A5K A05 = new A5K((String) null, new Object[0], 0, 8);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Object[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof A5K)) {
                return false;
            }
            A5K a5k = (A5K) obj;
            if (this.A01 != a5k.A01 || this.A00 != a5k.A00) {
                return false;
            }
            String str = this.A03;
            String str2 = a5k.A03;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            String str3 = this.A02;
            String str4 = a5k.A02;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (str4 == null || !str3.equals(str4)) {
                return false;
            }
            return Arrays.equals(this.A04, a5k.A04);
        }
    }

    public String A00(Resources resources) {
        int i = this.A00;
        if (i != 0) {
            Object[] objArr = this.A04;
            if (objArr == null || objArr.length <= 0) {
                return resources.getString(i);
            }
            return resources.getString(i, objArr);
        }
        String str = this.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        String str = this.A03;
        int i = 1;
        if (str != null) {
            i = str.hashCode() + 31;
        }
        String str2 = this.A02;
        if (str2 != null) {
            i = C108945cZ.A09(str2, i * 31);
        }
        return Arrays.hashCode(this.A04) | ((((i * 31) + this.A00) * 31) + this.A01);
    }

    public A5K(String str) {
        int A012 = C72453Mb.A01(TextUtils.isEmpty(str) ? 1 : 0);
        this.A03 = str;
        this.A00 = 0;
        this.A02 = null;
        this.A01 = A012;
        this.A04 = null;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextConfiguration{text='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", textResId=");
        A10.append(this.A00);
        A10.append(", formatArgs=");
        A10.append(Arrays.toString(this.A04));
        return C17890vO.A0b(A10);
    }

    public A5K(String str, Object[] objArr, int i, int i2) {
        this.A03 = null;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = objArr;
    }
}
