package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D1F implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23148Bc1 bc1 = null;
        C23145Bby bby = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        C23151Bc4 bc4 = null;
        C23146Bbz bbz = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bc1 = (C23148Bc1) C26300CxD.A0A(parcel, C23148Bc1.CREATOR, readInt);
                    break;
                case 2:
                    bby = (C23145Bby) C26300CxD.A0A(parcel, C23145Bby.CREATOR, readInt);
                    break;
                case 3:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    arrayList = C26300CxD.A0G(parcel, C23165BcL.CREATOR, readInt);
                    break;
                case 6:
                    arrayList2 = C26300CxD.A0G(parcel, C23162BcI.CREATOR, readInt);
                    break;
                case 7:
                    arrayList3 = C26300CxD.A0G(parcel, C23155BcB.CREATOR, readInt);
                    break;
                case 8:
                    bc4 = (C23151Bc4) C26300CxD.A0A(parcel, C23151Bc4.CREATOR, readInt);
                    break;
                case 9:
                    bbz = (C23146Bbz) C26300CxD.A0A(parcel, C23146Bbz.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23167BcN(bby, bbz, bc1, bc4, arrayList, arrayList2, arrayList3, bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23167BcN[i];
    }
}
