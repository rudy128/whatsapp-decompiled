package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czy  reason: case insensitive filesystem */
public final class C26459Czy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        C23175BcV bcV = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
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
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 4:
                    i3 = C26300CxD.A03(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 6:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 7:
                    i4 = C26300CxD.A03(parcel, readInt);
                    break;
                case 8:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 9:
                    bcV = (C23175BcV) C26300CxD.A0A(parcel, C23175BcV.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23196Bcq(bcV, str, str2, i, i2, i3, i4, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23196Bcq[i];
    }
}
