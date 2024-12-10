package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class D18 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder4 = null;
        byte[] bArr2 = null;
        C23202Bcw bcw = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        byte[] bArr3 = null;
        String str3 = null;
        int i = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    iBinder = C26300CxD.A09(parcel2, readInt);
                    break;
                case 2:
                    iBinder2 = C26300CxD.A09(parcel2, readInt);
                    break;
                case 3:
                    iBinder3 = C26300CxD.A09(parcel2, readInt);
                    break;
                case 4:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 6:
                    bArr = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 7:
                    iBinder4 = C26300CxD.A09(parcel2, readInt);
                    break;
                case 8:
                    bArr2 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 9:
                    bcw = (C23202Bcw) C26300CxD.A0A(parcel2, C23202Bcw.CREATOR, readInt);
                    break;
                case 10:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 11:
                    bcR = DJ0.A0A(parcel2, readInt);
                    break;
                case 12:
                    bArr3 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 13:
                    str3 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 14:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel2, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23201Bcv(iBinder, iBinder2, iBinder3, iBinder4, bcR, bcw, bcM, str, str2, str3, bArr, bArr2, bArr3, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23201Bcv[i];
    }
}
