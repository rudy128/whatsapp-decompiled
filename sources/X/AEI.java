package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(15);
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public AEI(String str, String str2, String str3, int i, int i2) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = i;
        this.A02 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AEI)) {
            return false;
        }
        return C18070vi.A18(this.A04, ((AEI) obj).A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductImage(imageId=");
        A10.append(this.A04);
        A10.append(", originalImageUrl=");
        A10.append(this.A00);
        A10.append(", scaledImageUrl=");
        A10.append(this.A01);
        A10.append(", width=");
        A10.append(this.A03);
        A10.append(", height=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
