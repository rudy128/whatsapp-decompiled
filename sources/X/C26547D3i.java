package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.D3i  reason: case insensitive filesystem */
public final class C26547D3i implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(8);
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
            C26547D3i d3i = (C26547D3i) obj;
            if (!(this.A02 == d3i.A02 && this.A01 == d3i.A01 && this.A03 == d3i.A03 && Arrays.equals(this.A04, d3i.A04))) {
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

    public C26547D3i(Parcel parcel) {
        byte[] bArr;
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
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
