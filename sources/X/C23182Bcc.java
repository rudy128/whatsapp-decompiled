package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcc  reason: case insensitive filesystem */
public final class C23182Bcc extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public C23166BcM A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23182Bcc) {
                C23182Bcc bcc = (C23182Bcc) obj;
                if (C25332Cdd.A01(this.A00, bcc.A00)) {
                    if (!DJ0.A0H(bcc.A02, Integer.valueOf(this.A02)) || !C25332Cdd.A01(this.A01, bcc.A01)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C23182Bcc(C23166BcM bcM, String str, int i) {
        this.A00 = str;
        this.A02 = i;
        this.A01 = bcM;
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A00;
        AnonymousClass000.A1M(A1a, this.A02);
        return AnonymousClass000.A0P(this.A01, A1a, 2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A00);
        C26293Cx2.A06(parcel, 2, this.A02);
        C26293Cx2.A09(parcel, this.A01, 3, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23182Bcc() {
        this.A02 = 0;
    }
}
