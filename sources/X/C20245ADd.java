package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADd  reason: case insensitive filesystem */
public final class C20245ADd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20245ADd) {
                C20245ADd aDd = (C20245ADd) obj;
                if (!C18070vi.A18(this.A00, aDd.A00) || !C18070vi.A18(this.A01, aDd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public C20245ADd(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductVariantProperty(name=");
        A10.append(this.A00);
        A10.append(", value=");
        return C17900vP.A0B(this.A01, A10);
    }
}
