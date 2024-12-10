package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0V implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        C23144Bbx bbx = null;
        C23122Bbb bbb = null;
        C23116BbV bbV = null;
        C23123Bbc bbc = null;
        C23118BbX bbX = null;
        C23119BbY bbY = null;
        C23027Ba3 ba3 = null;
        C23120BbZ bbZ = null;
        C23115BbU bbU = null;
        C23206Bd0 bd0 = null;
        C23121Bba bba = null;
        C23159BcF bcF = null;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    bbx = (C23144Bbx) C26300CxD.A0A(parcel2, C23144Bbx.CREATOR, readInt);
                    break;
                case 3:
                    bbb = (C23122Bbb) C26300CxD.A0A(parcel2, C23122Bbb.CREATOR, readInt);
                    break;
                case 4:
                    bbV = (C23116BbV) C26300CxD.A0A(parcel2, C23116BbV.CREATOR, readInt);
                    break;
                case 5:
                    bbc = (C23123Bbc) C26300CxD.A0A(parcel2, C23123Bbc.CREATOR, readInt);
                    break;
                case 6:
                    bbX = (C23118BbX) C26300CxD.A0A(parcel2, C23118BbX.CREATOR, readInt);
                    break;
                case 7:
                    bbY = (C23119BbY) C26300CxD.A0A(parcel2, C23119BbY.CREATOR, readInt);
                    break;
                case 8:
                    ba3 = (C23027Ba3) C26300CxD.A0A(parcel2, C23027Ba3.CREATOR, readInt);
                    break;
                case 9:
                    bbZ = (C23120BbZ) C26300CxD.A0A(parcel2, C23120BbZ.CREATOR, readInt);
                    break;
                case 10:
                    bbU = (C23115BbU) C26300CxD.A0A(parcel2, C23115BbU.CREATOR, readInt);
                    break;
                case 11:
                    bd0 = (C23206Bd0) C26300CxD.A0A(parcel2, C23206Bd0.CREATOR, readInt);
                    break;
                case 12:
                    bba = (C23121Bba) C26300CxD.A0A(parcel2, C23121Bba.CREATOR, readInt);
                    break;
                case 13:
                    bcF = (C23159BcF) C26300CxD.A0A(parcel2, C23159BcF.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23169BcP(bbx, bbU, bbV, bbX, bbY, bbZ, bcF, bd0, bba, bbb, ba3, bbc);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23169BcP[i];
    }
}
