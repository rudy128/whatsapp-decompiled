package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0F implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C23231Bdh bdh = null;
        C23230Bdg bdg = null;
        C23229Bdf bdf = null;
        C23174BcU bcU = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 2:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 4:
                    bdh = (C23231Bdh) C26300CxD.A0A(parcel, C23231Bdh.CREATOR, readInt);
                    break;
                case 5:
                    bdg = (C23230Bdg) C26300CxD.A0A(parcel, C23230Bdg.CREATOR, readInt);
                    break;
                case 6:
                    bdf = (C23229Bdf) C26300CxD.A0A(parcel, C23229Bdf.CREATOR, readInt);
                    break;
                case 7:
                    bcU = (C23174BcU) C26300CxD.A0A(parcel, C23174BcU.CREATOR, readInt);
                    break;
                case 8:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 9:
                    C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23204Bcy(bcU, bdg, bdh, bdf, str, str2, str3, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23204Bcy[i];
    }
}
