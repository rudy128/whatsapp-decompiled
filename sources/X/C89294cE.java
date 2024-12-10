package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cE  reason: invalid class name and case insensitive filesystem */
public final class C89294cE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public C89294cE(String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C89294cE r4 = (C89294cE) obj;
            if (!C18070vi.A18(this.A00, r4.A00) || !C42171xk.A00(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
