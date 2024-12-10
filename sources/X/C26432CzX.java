package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzX  reason: case insensitive filesystem */
public final class C26432CzX implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C23204Bcy bcy = null;
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
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    str4 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) C26300CxD.A0A(parcel, Uri.CREATOR, readInt);
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
                case 9:
                    bcy = (C23204Bcy) C26300CxD.A0A(parcel, C23204Bcy.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23142Bbv(uri, bcy, str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23142Bbv[i];
    }
}
