package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czu  reason: case insensitive filesystem */
public final class C26455Czu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23087Bb2 bb2 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bb2 = (C23087Bb2) C26300CxD.A0A(parcel, C23087Bb2.CREATOR, readInt);
                    break;
                case 2:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 3:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 4:
                    iArr = C26300CxD.A0Q(parcel, readInt);
                    break;
                case 5:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C26300CxD.A0Q(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23090Bb5(bb2, iArr, iArr2, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23090Bb5[i];
    }
}
