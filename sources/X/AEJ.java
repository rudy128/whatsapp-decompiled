package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class AEJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public String A02;
    public final boolean A03;
    public final List A04;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEJ) {
                AEJ aej = (AEJ) obj;
                if (this.A00 != aej.A00 || this.A03 != aej.A03 || !C18070vi.A18(this.A04, aej.A04) || !C18070vi.A18(this.A02, aej.A02) || !C18070vi.A18(this.A01, aej.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeStringList(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return ((((AnonymousClass0DV.A00(this.A00 * 31, this.A03) + AnonymousClass001.A0k(this.A04)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01);
    }

    public AEJ(String str, String str2, List list, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductStatus(status=");
        A10.append(this.A00);
        A10.append(", appealable=");
        A10.append(this.A03);
        A10.append(", reasonCodes=");
        A10.append(this.A04);
        A10.append(", rejectReason=");
        A10.append(this.A02);
        A10.append(", commerceUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
