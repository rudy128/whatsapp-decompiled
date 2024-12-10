package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D48 implements Parcelable {
    public static final D48 A0V = new D48(new C25702CkX());
    public static final E0X CREATOR = new C26654D8d(0);
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
    public final D3W A0K;
    public final DUU A0L;
    public final D42 A0M;
    public final C26546D3h A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final byte[] A0U;

    public static D48 A00(String str) {
        C25702CkX ckX = new C25702CkX();
        ckX.A0P = null;
        ckX.A0R = str;
        ckX.A0I = Long.MAX_VALUE;
        return new D48(ckX);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D48 d48 = (D48) obj;
            if (!(this.A04 == d48.A04 && this.A0D == d48.A0D && this.A0C == d48.A0C && this.A0A == d48.A0A && this.A0I == d48.A0I && this.A09 == d48.A09 && this.A01 == d48.A01 && this.A0E == d48.A0E && this.A02 == d48.A02 && this.A0H == d48.A0H && this.A05 == d48.A05 && this.A0F == d48.A0F && this.A0B == d48.A0B && this.A07 == d48.A07 && this.A08 == d48.A08 && this.A0J == d48.A0J && this.A0G == d48.A0G && Util.A0D(this.A0Q, d48.A0Q) && Util.A0D(this.A0R, d48.A0R) && this.A03 == d48.A03 && Util.A0D(this.A0P, d48.A0P) && Util.A0D(this.A0S, d48.A0S) && Util.A0D(this.A0O, d48.A0O) && Util.A0D(this.A0L, d48.A0L) && Util.A0D(this.A0M, d48.A0M) && Util.A0D(this.A0N, d48.A0N) && Arrays.equals(this.A0U, d48.A0U) && A01(d48) && Util.A0D(this.A0K, d48.A0K))) {
                return false;
            }
        }
        return true;
    }

    public boolean A01(D48 d48) {
        List list = this.A0T;
        int size = list.size();
        List list2 = d48.A0T;
        if (size == list2.size()) {
            int i = 0;
            while (i < list.size()) {
                if (Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A002 = ((((((((((((((((((((((((((527 + C17900vP.A00(this.A0Q)) * 31) + C17900vP.A00(this.A0R)) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31) + C17900vP.A00(this.A0O)) * 31) + AnonymousClass001.A0k(this.A0M)) * 31) + C17900vP.A00(this.A0P)) * 31) + C108955ca.A06(this.A0S)) * 31) + this.A0I) * 31) + this.A09) * 31) + this.A05) * 31) + this.A0F) * 31) + this.A03;
        this.A00 = A002;
        return A002;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0Q);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0U;
        parcel.writeInt(AnonymousClass000.A1W(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0N, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0G);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0J);
        List list = this.A0T;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) list.get(i2));
        }
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeParcelable(this.A0M, 0);
        this.A0K.writeToParcel(parcel, 0);
    }

    public D48(C25702CkX ckX) {
        this.A0Q = ckX.A0P;
        this.A0R = ckX.A0Q;
        this.A0G = ckX.A0F;
        this.A0D = ckX.A0C;
        this.A0C = ckX.A0B;
        this.A04 = ckX.A03;
        this.A0O = ckX.A0N;
        this.A0M = ckX.A0L;
        this.A0P = ckX.A0O;
        this.A0S = ckX.A0R;
        this.A0A = ckX.A09;
        List list = ckX.A0S;
        this.A0T = list == null ? Collections.emptyList() : list;
        DUU duu = ckX.A0K;
        this.A0L = duu;
        this.A0J = ckX.A0I;
        this.A0I = ckX.A0H;
        this.A09 = ckX.A08;
        this.A01 = ckX.A00;
        int i = ckX.A0D;
        int i2 = 0;
        this.A0E = i == -1 ? 0 : i;
        float f = ckX.A01;
        this.A02 = f == -1.0f ? 1.0f : f;
        this.A0U = ckX.A0T;
        this.A0H = ckX.A0G;
        this.A0N = ckX.A0M;
        this.A05 = ckX.A04;
        this.A0F = ckX.A0E;
        this.A0B = ckX.A0A;
        int i3 = ckX.A06;
        this.A07 = i3 == -1 ? 0 : i3;
        int i4 = ckX.A07;
        this.A08 = i4 != -1 ? i4 : i2;
        this.A03 = ckX.A02;
        int i5 = ckX.A05;
        if (i5 == 0 && duu != null) {
            i5 = 1;
        }
        this.A06 = i5;
        this.A0K = ckX.A0J;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Format(");
        A10.append(this.A0Q);
        A10.append(", ");
        A10.append(this.A0P);
        A10.append(", ");
        A10.append(this.A0S);
        A10.append(", ");
        A10.append(this.A0O);
        A10.append(", ");
        A10.append(this.A04);
        A10.append(", ");
        A10.append(this.A0R);
        A10.append(", [");
        A10.append(this.A0I);
        A10.append(", ");
        A10.append(this.A09);
        A10.append(", ");
        A10.append(this.A01);
        A10.append("], [");
        A10.append(this.A05);
        A10.append(", ");
        A10.append(this.A0F);
        return AnonymousClass000.A0y("])", A10);
    }
}
