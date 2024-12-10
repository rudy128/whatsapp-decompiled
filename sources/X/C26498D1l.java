package X;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* renamed from: X.D1l  reason: case insensitive filesystem */
public final class C26498D1l implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.Bco, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        Bc7 bc7 = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr = null;
        int[] iArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = false;
        int i = 0;
        int i2 = 0;
        boolean z9 = true;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = true;
        while (true) {
            int i3 = A02;
            if (parcel2.dataPosition() < i3) {
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
                        parcelUuid = (ParcelUuid) C26300CxD.A0A(parcel2, ParcelUuid.CREATOR, readInt);
                        break;
                    case 8:
                        z5 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
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
                        i = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 13:
                        i2 = C26300CxD.A03(parcel2, readInt);
                        break;
                    case 14:
                        bArr = C26300CxD.A0O(parcel2, readInt);
                        break;
                    case 15:
                        j = C26300CxD.A07(parcel2, readInt);
                        break;
                    case 16:
                        iArr = C26300CxD.A0Q(parcel2, readInt);
                        break;
                    case 17:
                        z9 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 18:
                        z10 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 19:
                        z11 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    case 20:
                        z12 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                        break;
                    default:
                        C26300CxD.A0I(parcel2, readInt);
                        break;
                }
            } else {
                C26300CxD.A0H(parcel2, i3);
                ? obj = new Object();
                obj.A04 = bc7;
                obj.A05 = z;
                obj.A06 = z2;
                obj.A07 = z3;
                obj.A08 = z4;
                obj.A03 = parcelUuid;
                obj.A09 = z5;
                obj.A0A = z6;
                obj.A0B = z7;
                obj.A0C = z8;
                obj.A00 = i;
                obj.A01 = i2;
                obj.A0H = bArr;
                obj.A02 = j;
                obj.A0I = iArr;
                obj.A0D = z9;
                obj.A0E = z10;
                obj.A0F = z11;
                obj.A0G = z12;
                return obj;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23194Bco[i];
    }
}
