package X;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* renamed from: X.D1g  reason: case insensitive filesystem */
public final class C26493D1g implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Bcp, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        Bc7 bc7 = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr2 = null;
        C23154BcA[] bcAArr = null;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i = 0;
        int i2 = 0;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = true;
        boolean z16 = true;
        int i3 = 0;
        boolean z17 = true;
        int i4 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = true;
        boolean z21 = true;
        while (true) {
            int i5 = A02;
            if (parcel2.dataPosition() < i5) {
                int readInt = parcel2.readInt();
                switch ((char) readInt) {
                    case 1:
                        bc7 = (Bc7) C26300CxD.A0A(parcel2, Bc7.CREATOR, readInt);
                        break;
                    case 2:
                        z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 3:
                        z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 4:
                        z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 5:
                        z4 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 6:
                        bArr = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 7:
                        z5 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 8:
                        parcelUuid = (ParcelUuid) C26300CxD.A0A(parcel2, ParcelUuid.CREATOR, readInt);
                        break;
                    case 9:
                        z6 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 10:
                        z7 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 11:
                        z8 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 12:
                        z9 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 13:
                        z10 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 14:
                        z11 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 15:
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 16:
                        i2 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 17:
                        bArr2 = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 18:
                        j = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 19:
                        bcAArr = (C23154BcA[]) C26300CxD.A0R(parcel2, C23154BcA.CREATOR, readInt);
                        break;
                    case 20:
                        z12 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 21:
                        z13 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 22:
                        z14 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 23:
                        z15 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 24:
                        iArr = C26300CxD.A0Q(parcel2, readInt);
                        break;
                    case 25:
                        iArr2 = C26300CxD.A0Q(parcel2, readInt);
                        break;
                    case 26:
                        z16 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 27:
                        i3 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 28:
                        bArr3 = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 29:
                        z17 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 30:
                        i4 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 31:
                        z18 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case ' ':
                        z19 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case '!':
                        z20 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case '\"':
                        z21 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i5);
                ? obj = new Object();
                obj.A06 = bc7;
                obj.A0C = z;
                obj.A0D = z2;
                obj.A0E = z3;
                obj.A0F = z4;
                obj.A0T = bArr;
                obj.A0G = z5;
                obj.A05 = parcelUuid;
                obj.A0H = z6;
                obj.A0I = z7;
                obj.A0J = z8;
                obj.A0K = z9;
                obj.A0L = z10;
                obj.A0M = z11;
                obj.A02 = i;
                obj.A03 = i2;
                obj.A0U = bArr2;
                obj.A04 = j;
                obj.A0X = bcAArr;
                obj.A0N = z12;
                obj.A0O = z13;
                obj.A0P = z14;
                obj.A0Q = z15;
                obj.A0V = iArr;
                obj.A0W = iArr2;
                obj.A0R = z16;
                obj.A00 = i3;
                obj.A0S = bArr3;
                obj.A07 = z17;
                obj.A01 = i4;
                obj.A08 = z18;
                obj.A09 = z19;
                obj.A0A = z20;
                obj.A0B = z21;
                return obj;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23195Bcp[i];
    }
}
