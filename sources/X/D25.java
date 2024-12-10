package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D25 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Bb9] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C23097BbC bbC = null;
        C23097BbC bbC2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 5:
                    str4 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 6:
                    str5 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 7:
                    bbC = (C23097BbC) C26300CxD.A0A(parcel, C23097BbC.CREATOR, readInt);
                    break;
                case 8:
                    bbC2 = (C23097BbC) C26300CxD.A0A(parcel, C23097BbC.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A06 = str;
        obj.A02 = str2;
        obj.A03 = str3;
        obj.A04 = str4;
        obj.A05 = str5;
        obj.A01 = bbC;
        obj.A00 = bbC2;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23094Bb9[i];
    }
}
