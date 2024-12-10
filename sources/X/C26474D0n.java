package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0n  reason: case insensitive filesystem */
public final class C26474D0n implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C23193Bcn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 4:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 5:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 6:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 7:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 8:
                    str4 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 9:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 10:
                    i3 = C26300CxD.A03(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23193Bcn(str, str2, str3, str4, i, i2, i3, z, z2);
    }
}
