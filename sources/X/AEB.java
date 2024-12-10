package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEB) {
                AEB aeb = (AEB) obj;
                if (!C18070vi.A18(this.A02, aeb.A02) || !C18070vi.A18(this.A01, aeb.A01) || this.A00 != aeb.A00 || this.A03 != aeb.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public int hashCode() {
        return C17880vN.A01((C17890vO.A02(this.A01, C17880vN.A03(this.A02)) + this.A00) * 31, this.A03);
    }

    public AEB(String str, String str2, int i, boolean z) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConnectedAccount:{'id'='");
        A10.append(this.A02);
        A10.append("', 'name'='");
        A10.append(this.A01);
        A10.append("', 'likes'='");
        A10.append(this.A00);
        A10.append("', 'hasMediaPost'='");
        A10.append(this.A03);
        return AnonymousClass000.A0y("'}", A10);
    }
}
