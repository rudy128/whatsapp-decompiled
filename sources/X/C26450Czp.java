package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czp  reason: case insensitive filesystem */
public final class C26450Czp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 3:
                    i3 = C26300CxD.A03(parcel, readInt);
                    break;
                case 4:
                    j = C26300CxD.A07(parcel, readInt);
                    break;
                case 5:
                    j2 = C26300CxD.A07(parcel, readInt);
                    break;
                case 6:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 7:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 8:
                    i4 = C26300CxD.A03(parcel, readInt);
                    break;
                case 9:
                    i5 = C26300CxD.A03(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23098BbD(str, str2, i, i2, i3, i4, i5, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23098BbD[i];
    }
}
