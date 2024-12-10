package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: X.Bbj  reason: case insensitive filesystem */
public final class C23130Bbj extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23130Bbj) {
                C23130Bbj bbj = (C23130Bbj) obj;
                if (this.A01 != bbj.A01 || !Arrays.equals(this.A02, bbj.A02) || !AnonymousClass026.A00(this.A00, bbj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C23130Bbj(byte[] bArr, String str, boolean z) {
        if (z) {
            C18210vx.A00(bArr);
            C18210vx.A00(str);
        }
        this.A01 = z;
        this.A02 = bArr;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1N(A1b, this.A01);
        return (AnonymousClass000.A0P(this.A00, A1b, 1) * 31) + Arrays.hashCode(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A01);
        C26293Cx2.A0D(parcel, this.A02, 2, false);
        C26293Cx2.A0A(parcel, this.A00, 3, false);
        C26293Cx2.A05(parcel, A002);
    }
}
