package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0v  reason: case insensitive filesystem */
public final class C26482D0v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 2:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 3:
                    str3 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 5:
                    bArr = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 6:
                    bArr2 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 7:
                    bArr3 = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 8:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 9:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 10:
                    bcR = DJ0.A0A(parcel2, readInt);
                    break;
                case 11:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel2, C23166BcM.CREATOR, readInt);
                    break;
                case 12:
                    i2 = C26300CxD.A03(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23190Bck(bcR, bcM, str, str2, str3, bArr, bArr2, bArr3, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23190Bck[i];
    }
}
