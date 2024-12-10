package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D27 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.BbG] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 3:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 4:
                    str3 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    str4 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 6:
                    str5 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 7:
                    str6 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 8:
                    str7 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 9:
                    str8 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 10:
                    str9 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 11:
                    str10 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 12:
                    str11 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 13:
                    str12 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 14:
                    str13 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 15:
                    str14 = C26300CxD.A0D(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        ? obj = new Object();
        obj.A05 = str;
        obj.A07 = str2;
        obj.A0D = str3;
        obj.A0B = str4;
        obj.A08 = str5;
        obj.A02 = str6;
        obj.A00 = str7;
        obj.A01 = str8;
        obj.A03 = str9;
        obj.A0C = str10;
        obj.A09 = str11;
        obj.A06 = str12;
        obj.A04 = str13;
        obj.A0A = str14;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23101BbG[i];
    }
}
