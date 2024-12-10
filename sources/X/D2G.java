package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2G implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Bb8] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
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
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 7:
                    f = C26300CxD.A01(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A01 = i;
        obj.A02 = i2;
        obj.A03 = i3;
        obj.A04 = z;
        obj.A05 = z2;
        obj.A00 = f;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23093Bb8[i];
    }
}
