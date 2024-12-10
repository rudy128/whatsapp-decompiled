package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ADF) {
                ADF adf = (ADF) obj;
                if (!(C18070vi.A18(this.A02, adf.A02) && this.A00 == adf.A00 && this.A01 == adf.A01)) {
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
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShopContent(id=");
        A10.append(this.A02);
        A10.append(", surface=");
        A10.append(this.A00);
        A10.append(", version=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
