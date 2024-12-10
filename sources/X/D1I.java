package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D1I implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        ArrayList arrayList = null;
        byte[] bArr3 = null;
        C23167BcN bcN = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C26300CxD.A07(parcel2, readInt);
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 3:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 4:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    j2 = C26300CxD.A07(parcel2, readInt);
                    break;
                case 6:
                    str3 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 7:
                    bArr = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 8:
                    bArr2 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 9:
                    arrayList = C26300CxD.A0G(parcel2, C23147Bc0.CREATOR, readInt);
                    break;
                case 10:
                    i2 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 11:
                    bArr3 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 12:
                    bcN = (C23167BcN) C26300CxD.A0A(parcel2, C23167BcN.CREATOR, readInt);
                    break;
                case 13:
                    i3 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 14:
                    i4 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 15:
                    str4 = C26300CxD.A0D(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23171BcR(bcN, str, str2, str3, str4, arrayList, bArr, bArr2, bArr3, i, i2, i3, i4, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23171BcR[i];
    }
}
