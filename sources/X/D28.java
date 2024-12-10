package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D28 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BbB, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str6 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 8:
                    str7 = C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A01 = str;
        obj.A05 = str2;
        obj.A04 = str3;
        obj.A00 = str4;
        obj.A03 = str5;
        obj.A02 = str6;
        obj.A06 = str7;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23096BbB[i];
    }
}
