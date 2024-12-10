package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADt  reason: case insensitive filesystem */
public final class C20261ADt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public C20261ADt(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C20261ADt) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A00, AnonymousClass3MW.A1a(), 0);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PriceTier:{'id'='");
        A10.append(this.A00);
        A10.append("', 'symbol'='");
        A10.append(this.A02);
        A10.append("', 'name'='");
        A10.append(this.A01);
        return AnonymousClass000.A0y("'}", A10);
    }
}
