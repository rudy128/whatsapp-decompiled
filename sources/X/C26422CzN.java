package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzN  reason: case insensitive filesystem */
public final class C26422CzN implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23111BbQ bbQ = null;
        C23139Bbs bbs = null;
        String str = null;
        C23130Bbj bbj = null;
        C23125Bbe bbe = null;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bbQ = (C23111BbQ) C26300CxD.A0A(parcel, C23111BbQ.CREATOR, readInt);
                    break;
                case 2:
                    bbs = (C23139Bbs) C26300CxD.A0A(parcel, C23139Bbs.CREATOR, readInt);
                    break;
                case 3:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    bbj = (C23130Bbj) C26300CxD.A0A(parcel, C23130Bbj.CREATOR, readInt);
                    break;
                case 7:
                    bbe = (C23125Bbe) C26300CxD.A0A(parcel, C23125Bbe.CREATOR, readInt);
                    break;
                case 8:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23140Bbt(bbs, bbe, bbj, bbQ, str, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23140Bbt[i];
    }
}
