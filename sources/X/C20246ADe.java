package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADe  reason: case insensitive filesystem */
public final class C20246ADe implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20246ADe) {
                C20246ADe aDe = (C20246ADe) obj;
                if (!C18070vi.A18(this.A00, aDe.A00) || !C18070vi.A18(this.A01, aDe.A01)) {
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

    public C20246ADe(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrderProductImage(imageId=");
        A10.append(this.A00);
        A10.append(", url=");
        return C17900vP.A0B(this.A01, A10);
    }
}
