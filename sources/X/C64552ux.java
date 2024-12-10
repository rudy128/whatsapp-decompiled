package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2ux  reason: invalid class name and case insensitive filesystem */
public final class C64552ux implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A01, new Object[1], 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((C64552ux) obj).A01);
    }

    public C64552ux(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{'type'='");
        A10.append(this.A01);
        A10.append("', 'level'='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
