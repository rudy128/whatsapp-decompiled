package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Bcz  reason: case insensitive filesystem */
public class C23205Bcz extends DJ0 {
    public static final C23205Bcz A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public static boolean A02(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new C23205Bcz("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0z = C17880vN.A0z(r4);
        for (byte[] encodeToString : bArr) {
            A0z.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A0z);
        return A0z;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof C23205Bcz) {
            C23205Bcz bcz = (C23205Bcz) obj;
            if (A02(this.A00, bcz.A00) && Arrays.equals(this.A01, bcz.A01) && A02(A00(this.A03), A00(bcz.A03)) && A02(A00(this.A04), A00(bcz.A04)) && A02(A00(this.A05), A00(bcz.A05)) && A02(A00(this.A06), A00(bcz.A06))) {
                int[] iArr = this.A02;
                if (iArr == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList A0z = C17880vN.A0z(r2);
                    for (int A1D : iArr) {
                        C17890vO.A1D(A0z, A1D);
                    }
                    Collections.sort(A0z);
                    list = A0z;
                }
                int[] iArr2 = bcz.A02;
                if (iArr2 == null) {
                    list2 = Collections.emptyList();
                } else {
                    ArrayList A0z2 = C17880vN.A0z(r2);
                    for (int A1D2 : iArr2) {
                        C17890vO.A1D(A0z2, A1D2);
                    }
                    Collections.sort(A0z2);
                    list2 = A0z2;
                }
                if (!A02(list, list2) || !A02(A00(this.A07), A00(bcz.A07))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String A1H;
        StringBuilder A0u = BE6.A0u("ExperimentTokens");
        A0u.append("(");
        String str = this.A00;
        if (str == null) {
            A1H = "null";
        } else {
            StringBuilder A0t = BE6.A0t(BE8.A0C(str) + 2);
            A0t.append("'");
            A1H = AnonymousClass001.A1H(str, "'", A0t);
        }
        A0u.append(A1H);
        A0u.append(", ");
        byte[] bArr = this.A01;
        A0u.append("direct");
        A0u.append("=");
        if (bArr == null) {
            A0u.append("null");
        } else {
            A0u.append("'");
            A0u.append(Base64.encodeToString(bArr, 3));
            A0u.append("'");
        }
        A0u.append(", ");
        A01("GAIA", A0u, this.A03);
        A0u.append(", ");
        A01("PSEUDO", A0u, this.A04);
        A0u.append(", ");
        A01("ALWAYS", A0u, this.A05);
        A0u.append(", ");
        A01("OTHER", A0u, this.A06);
        A0u.append(", ");
        int[] iArr = this.A02;
        A0u.append("weak");
        A0u.append("=");
        if (iArr == null) {
            A0u.append("null");
        } else {
            A0u.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A0u.append(", ");
                }
                A0u.append(i2);
                i++;
                z = false;
            }
            A0u.append(")");
        }
        A0u.append(", ");
        A01("directs", A0u, this.A07);
        return AnonymousClass000.A0y(")", A0u);
    }

    public C23205Bcz(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A01, 3, DJ0.A0L(parcel, this.A00));
        C26293Cx2.A0H(parcel, this.A03, 4);
        C26293Cx2.A0H(parcel, this.A04, 5);
        C26293Cx2.A0H(parcel, this.A05, 6);
        C26293Cx2.A0H(parcel, this.A06, 7);
        C26293Cx2.A0E(parcel, this.A02, 8);
        C26293Cx2.A0H(parcel, this.A07, 9);
        C26293Cx2.A05(parcel, A002);
    }
}
