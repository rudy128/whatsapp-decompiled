package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D24 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BbA, java.lang.Object] */
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23096BbB bbB = null;
        String str = null;
        String str2 = null;
        C23047BaO[] baOArr = null;
        C23085Bb0[] bb0Arr = null;
        String[] strArr = null;
        C23045BaM[] baMArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bbB = (C23096BbB) C26300CxD.A0A(parcel, C23096BbB.CREATOR, readInt);
                    break;
                case 3:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 5:
                    baOArr = (C23047BaO[]) C26300CxD.A0R(parcel, C23047BaO.CREATOR, readInt);
                    break;
                case 6:
                    bb0Arr = (C23085Bb0[]) C26300CxD.A0R(parcel, C23085Bb0.CREATOR, readInt);
                    break;
                case 7:
                    strArr = C26300CxD.A0S(parcel, readInt);
                    break;
                case 8:
                    baMArr = (C23045BaM[]) C26300CxD.A0R(parcel, C23045BaM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        ? obj = new Object();
        obj.A00 = bbB;
        obj.A01 = str;
        obj.A02 = str2;
        obj.A05 = baOArr;
        obj.A04 = bb0Arr;
        obj.A06 = strArr;
        obj.A03 = baMArr;
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23095BbA[i];
    }
}
