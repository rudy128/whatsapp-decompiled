package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D1q  reason: case insensitive filesystem */
public final class C26503D1q implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C23205Bcz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 4:
                    bArr2 = C26300CxD.A0T(parcel, readInt);
                    break;
                case 5:
                    bArr3 = C26300CxD.A0T(parcel, readInt);
                    break;
                case 6:
                    bArr4 = C26300CxD.A0T(parcel, readInt);
                    break;
                case 7:
                    bArr5 = C26300CxD.A0T(parcel, readInt);
                    break;
                case 8:
                    iArr = C26300CxD.A0Q(parcel, readInt);
                    break;
                case 9:
                    bArr6 = C26300CxD.A0T(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23205Bcz(str, bArr, iArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }
}
