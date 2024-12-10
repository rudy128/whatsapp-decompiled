package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1j  reason: case insensitive filesystem */
public final class C26496D1j implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.Bcw] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        byte[] bArr = null;
        long j = 0;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        Bc7 bc7 = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = true;
        while (true) {
            int i4 = A02;
            if (parcel2.dataPosition() < i4) {
                int readInt = parcel2.readInt();
                switch ((char) readInt) {
                    case 1:
                        z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 2:
                        z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 3:
                        z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 4:
                        z4 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 5:
                        z5 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 6:
                        z6 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 7:
                        z7 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 8:
                        z8 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 9:
                        bArr = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 10:
                        z9 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 11:
                        z10 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 12:
                        z11 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 13:
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 14:
                        i2 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 15:
                        iArr = C26300CxD.A0Q(parcel2, readInt);
                        break;
                    case 16:
                        iArr2 = C26300CxD.A0Q(parcel2, readInt);
                        break;
                    case 17:
                        bArr2 = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 18:
                        bc7 = (Bc7) C26300CxD.A0A(parcel2, Bc7.CREATOR, readInt);
                        break;
                    case 19:
                        i3 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 20:
                        j = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 21:
                        z12 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 22:
                        z13 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 23:
                        z14 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i4);
                ? obj = new Object();
                obj.A05 = z;
                obj.A06 = z2;
                obj.A07 = z3;
                obj.A08 = z4;
                obj.A09 = z5;
                obj.A0A = z6;
                obj.A0B = z7;
                obj.A0C = z8;
                obj.A0J = bArr;
                obj.A0D = z9;
                obj.A0E = z10;
                obj.A0F = z11;
                obj.A00 = i;
                obj.A01 = i2;
                obj.A0L = iArr;
                obj.A0M = iArr2;
                obj.A0K = bArr2;
                obj.A04 = bc7;
                obj.A02 = i3;
                obj.A03 = j;
                obj.A0G = z12;
                obj.A0H = z13;
                obj.A0I = z14;
                return obj;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23202Bcw[i];
    }
}
