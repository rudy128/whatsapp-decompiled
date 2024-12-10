package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class D9H implements ECQ {
    public static final Parcelable.Creator CREATOR = D3B.A00(13);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D9H d9h = (D9H) obj;
            if (!this.A02.equals(d9h.A02) || !Arrays.equals(this.A03, d9h.A03) || this.A00 != d9h.A00 || this.A01 != d9h.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C17890vO.A02(this.A02, 527) + Arrays.hashCode(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte[] bArr = this.A03;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public D9H(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mdta: key=");
        return AnonymousClass000.A0y(this.A02, A10);
    }

    public D9H(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
