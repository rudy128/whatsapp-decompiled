package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D1T implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 2:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 3:
                    z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 4:
                    z4 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    z5 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    z6 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23092Bb7(z, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23092Bb7[i];
    }
}
