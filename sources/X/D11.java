package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D11 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        C23143Bbw bbw = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 2:
                    bbw = (C23143Bbw) C26300CxD.A0A(parcel, C23143Bbw.CREATOR, readInt);
                    break;
                case 3:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 4:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 5:
                    bcR = DJ0.A0A(parcel, readInt);
                    break;
                case 6:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23188Bci(bbw, bcR, bcM, str, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23188Bci[i];
    }
}
