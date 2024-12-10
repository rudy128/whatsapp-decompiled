package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzQ  reason: case insensitive filesystem */
public final class C26425CzQ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        int i = 0;
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
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23137Bbq(str, str2, str3, str4, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23137Bbq[i];
    }
}
