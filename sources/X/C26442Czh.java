package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Czh  reason: case insensitive filesystem */
public final class C26442Czh implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C23192Bcm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23193Bcn bcn = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        C23205Bcz[] bczArr = null;
        boolean z = true;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bcn = (C23193Bcn) C26300CxD.A0A(parcel, C23193Bcn.CREATOR, readInt);
                    break;
                case 3:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 4:
                    iArr = C26300CxD.A0Q(parcel, readInt);
                    break;
                case 5:
                    strArr = C26300CxD.A0S(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C26300CxD.A0Q(parcel, readInt);
                    break;
                case 7:
                    bArr2 = C26300CxD.A0T(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 9:
                    bczArr = (C23205Bcz[]) C26300CxD.A0R(parcel, C23205Bcz.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23192Bcm(bcn, bArr, iArr, iArr2, bczArr, strArr, bArr2, z);
    }
}
