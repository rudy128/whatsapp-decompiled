package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0r  reason: case insensitive filesystem */
public final class C26478D0r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    iBinder = C26300CxD.A09(parcel, readInt);
                    break;
                case 2:
                    iBinder2 = C26300CxD.A09(parcel, readInt);
                    break;
                case 3:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = C26300CxD.A09(parcel, readInt);
                    break;
                case 6:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 7:
                    bcR = DJ0.A0A(parcel, readInt);
                    break;
                case 8:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23200Bcu(iBinder, iBinder2, iBinder3, bcR, bcM, str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23200Bcu[i];
    }
}
