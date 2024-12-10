package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.D3h  reason: case insensitive filesystem */
public final class C26546D3h implements Parcelable {
    public static final E0X CREATOR = new C26654D8d(5);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26546D3h d3h = (C26546D3h) obj;
            if (!(this.A02 == d3h.A02 && this.A01 == d3h.A01 && this.A03 == d3h.A03 && Arrays.equals(this.A04, d3h.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(AnonymousClass000.A1W(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C26546D3h(byte[] bArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ColorInfo(");
        A10.append(this.A02);
        A10.append(", ");
        A10.append(this.A01);
        A10.append(", ");
        A10.append(this.A03);
        A10.append(", ");
        A10.append(AnonymousClass000.A1W(this.A04));
        return AnonymousClass8BU.A0q(A10);
    }
}
