package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.Bcl  reason: case insensitive filesystem */
public class C23191Bcl extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    @Deprecated
    public final int A00;
    public final long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C23191Bcl) {
            C23191Bcl bcl = (C23191Bcl) obj;
            String str = this.A02;
            String str2 = bcl.A02;
            if (str == null ? str2 == null : str.equals(str2)) {
                long j = this.A01;
                if (j == -1) {
                    j = (long) this.A00;
                }
                long j2 = bcl.A01;
                if (j2 == -1) {
                    j2 = (long) bcl.A00;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        cyh.A00(Long.valueOf(j), "version");
        return cyh.toString();
    }

    public C23191Bcl(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A02;
        long j = this.A01;
        if (j == -1) {
            j = (long) this.A00;
        }
        C17890vO.A1M(A1b, j);
        return Arrays.hashCode(A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A02, 1, false);
        int i2 = this.A00;
        C26293Cx2.A06(parcel, 2, i2);
        long j = this.A01;
        if (j == -1) {
            j = (long) i2;
        }
        C26293Cx2.A07(parcel, 3, j);
        C26293Cx2.A05(parcel, A002);
    }

    public C23191Bcl(String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = -1;
    }
}
