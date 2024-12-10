package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.D3l  reason: case insensitive filesystem */
public final class C26549D3l implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(2);
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final long A0J;
    public final DUT A0K;
    public final C26541D3c A0L;
    public final C26547D3i A0M;
    public final Class A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final List A0U;
    public final byte[] A0V;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C26549D3l d3l = (C26549D3l) obj;
            int i2 = this.A00;
            if ((i2 == 0 || (i = d3l.A00) == 0 || i2 == i) && this.A0G == d3l.A0G && this.A0D == d3l.A0D && this.A04 == d3l.A04 && this.A0C == d3l.A0C && this.A0A == d3l.A0A && this.A0J == d3l.A0J && this.A0I == d3l.A0I && this.A09 == d3l.A09 && this.A0E == d3l.A0E && this.A0H == d3l.A0H && this.A06 == d3l.A06 && this.A0F == d3l.A0F && this.A0B == d3l.A0B && this.A07 == d3l.A07 && this.A08 == d3l.A08 && this.A03 == d3l.A03 && Float.compare(this.A01, d3l.A01) == 0 && Float.compare(this.A02, d3l.A02) == 0 && C25458CgB.A00(this.A0N, d3l.A0N) && C25458CgB.A00(this.A0Q, d3l.A0Q) && C25458CgB.A00(this.A0R, d3l.A0R) && C25458CgB.A00(this.A0O, d3l.A0O) && C25458CgB.A00(this.A0P, d3l.A0P) && C25458CgB.A00(this.A0T, d3l.A0T) && C25458CgB.A00(this.A0S, d3l.A0S) && Arrays.equals(this.A0V, d3l.A0V) && C25458CgB.A00(this.A0L, d3l.A0L) && C25458CgB.A00(this.A0M, d3l.A0M) && C25458CgB.A00(this.A0K, d3l.A0K)) {
                List list = this.A0U;
                int size = list.size();
                List list2 = d3l.A0U;
                if (size == list2.size()) {
                    int i3 = 0;
                    while (i3 < list.size()) {
                        if (Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                            i3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A0B2 = ((((((((((((((AnonymousClass000.A0B((AnonymousClass000.A0B((((((((((((((((((((((((((((((527 + C17900vP.A00(this.A0Q)) * 31) + AnonymousClass8BW.A02(this.A0R)) * 31) + C17900vP.A00(this.A0S)) * 31) + this.A0G) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31) + C17900vP.A00(this.A0O)) * 31) + AnonymousClass001.A0k(this.A0L)) * 31) + C17900vP.A00(this.A0P)) * 31) + C17900vP.A00(this.A0T)) * 31) + this.A0A) * 31) + ((int) this.A0J)) * 31) + this.A0I) * 31) + this.A09) * 31, this.A01) + this.A0E) * 31, this.A02) + this.A0H) * 31) + this.A06) * 31) + this.A0F) * 31) + this.A0B) * 31) + this.A07) * 31) + this.A08) * 31) + this.A03) * 31) + C17880vN.A02(this.A0N);
        this.A00 = A0B2;
        return A0B2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A0O);
        int i2 = 0;
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A0A);
        List list = this.A0U;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) list.get(i3));
        }
        parcel.writeParcelable(this.A0K, 0);
        parcel.writeLong(this.A0J);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0V;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A03);
    }

    public C26549D3l(Parcel parcel) {
        byte[] bArr;
        this.A0Q = parcel.readString();
        this.A0R = parcel.readString();
        this.A0S = parcel.readString();
        this.A0G = parcel.readInt();
        this.A0D = parcel.readInt();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int readInt2 = parcel.readInt();
        this.A0C = readInt2;
        this.A05 = readInt2 != -1 ? readInt2 : readInt;
        this.A0O = parcel.readString();
        this.A0L = (C26541D3c) AnonymousClass3Ma.A08(parcel, C26541D3c.class);
        this.A0P = parcel.readString();
        this.A0T = parcel.readString();
        this.A0A = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.A0U = C17880vN.A0z(readInt3);
        int i = 0;
        while (i < readInt3) {
            List list = this.A0U;
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                list.add(createByteArray);
                i++;
            } else {
                throw BE6.A0m();
            }
        }
        DUT dut = (DUT) AnonymousClass3Ma.A08(parcel, DUT.class);
        this.A0K = dut;
        this.A0J = parcel.readLong();
        this.A0I = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0E = parcel.readInt();
        this.A02 = parcel.readFloat();
        Class cls = null;
        if (AnonymousClass000.A1O(parcel.readInt())) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0V = bArr;
        this.A0H = parcel.readInt();
        this.A0M = (C26547D3i) AnonymousClass3Ma.A08(parcel, C26547D3i.class);
        this.A06 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0N = dut != null ? C26880DHn.class : cls;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Format(");
        A10.append(this.A0Q);
        A10.append(", ");
        A10.append(this.A0R);
        A10.append(", ");
        A10.append(this.A0P);
        A10.append(", ");
        A10.append(this.A0T);
        A10.append(", ");
        A10.append(this.A0O);
        A10.append(", ");
        A10.append(this.A05);
        A10.append(", ");
        A10.append(this.A0S);
        A10.append(", [");
        A10.append(this.A0I);
        A10.append(", ");
        A10.append(this.A09);
        A10.append(", ");
        A10.append(this.A01);
        A10.append("], [");
        A10.append(this.A06);
        A10.append(", ");
        A10.append(this.A0F);
        return AnonymousClass000.A0y("])", A10);
    }
}
