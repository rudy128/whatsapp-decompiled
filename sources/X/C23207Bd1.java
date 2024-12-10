package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bd1  reason: case insensitive filesystem */
public final class C23207Bd1 extends DJ0 implements Parcelable, ECT {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C23207Bd1) {
                C23207Bd1 bd1 = (C23207Bd1) obj;
                if (!this.A00.equals(bd1.A00) || !C25332Cdd.A01(bd1.A01, this.A01) || !C25332Cdd.A01(bd1.A02, this.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder A0q = BE7.A0q(BE8.A0C(substring) + 16, BE8.A0C(substring2));
            A0q.append(substring);
            A0q.append("...");
            A0q.append(substring2);
            trim = AnonymousClass001.A1I("::", A0q, i);
        }
        String str2 = this.A01;
        String str3 = this.A02;
        StringBuilder A0q2 = BE7.A0q(BE8.A0C(trim) + 31 + BE8.A0C(str2), BE8.A0C(str3));
        A0q2.append("Channel{token=");
        A0q2.append(trim);
        A0q2.append(", nodeId=");
        A0q2.append(str2);
        A0q2.append(", path=");
        return BEA.A0n(str3, A0q2);
    }

    public C23207Bd1(String str, String str2, String str3) {
        C18210vx.A00(str);
        this.A00 = str;
        C18210vx.A00(str2);
        this.A01 = str2;
        C18210vx.A00(str3);
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0L = DJ0.A0L(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, A0L);
        C26293Cx2.A0A(parcel, this.A02, 4, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
