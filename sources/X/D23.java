package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D23 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BbC, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 3:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 4:
                    i3 = C26300CxD.A03(parcel, readInt);
                    break;
                case 5:
                    i4 = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    i5 = C26300CxD.A03(parcel, readInt);
                    break;
                case 7:
                    i6 = C26300CxD.A03(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 9:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A05 = i;
        obj.A03 = i2;
        obj.A00 = i3;
        obj.A01 = i4;
        obj.A02 = i5;
        obj.A04 = i6;
        obj.A07 = z;
        obj.A06 = str;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23097BbC[i];
    }
}
