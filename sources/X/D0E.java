package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

public final class D0E implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        C23153Bc9 bc9 = null;
        C23158BcE bcE = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C23173BcT bcT = null;
        Integer num = null;
        C23129Bbi bbi = null;
        String str = null;
        C23169BcP bcP = null;
        String str2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    bc9 = (C23153Bc9) C26300CxD.A0A(parcel2, C23153Bc9.CREATOR, readInt);
                    break;
                case 3:
                    bcE = (C23158BcE) C26300CxD.A0A(parcel2, C23158BcE.CREATOR, readInt);
                    break;
                case 4:
                    bArr = C26300CxD.A0O(parcel2, readInt);
                    break;
                case 5:
                    arrayList = C26300CxD.A0G(parcel2, C23150Bc3.CREATOR, readInt);
                    break;
                case 6:
                    int A04 = C26300CxD.A04(parcel2, readInt);
                    if (A04 != 0) {
                        C26300CxD.A0J(parcel2, A04, 8);
                        d = Double.valueOf(parcel2.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                case 7:
                    arrayList2 = C26300CxD.A0G(parcel2, C23157BcD.CREATOR, readInt);
                    break;
                case 8:
                    bcT = (C23173BcT) C26300CxD.A0A(parcel2, C23173BcT.CREATOR, readInt);
                    break;
                case 9:
                    int A042 = C26300CxD.A04(parcel2, readInt);
                    if (A042 != 0) {
                        C26300CxD.A0J(parcel2, A042, 4);
                        num = AnonymousClass8BT.A0i(parcel2);
                        break;
                    } else {
                        num = null;
                        break;
                    }
                case 10:
                    bbi = (C23129Bbi) C26300CxD.A0A(parcel2, C23129Bbi.CREATOR, readInt);
                    break;
                case 11:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 12:
                    bcP = (C23169BcP) C26300CxD.A0A(parcel2, C23169BcP.CREATOR, readInt);
                    break;
                case 13:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) C26300CxD.A0A(parcel2, ResultReceiver.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23232Bdi(resultReceiver, bcP, bcT, bc9, bcE, bbi, d, num, str, str2, arrayList, arrayList2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23232Bdi[i];
    }
}
