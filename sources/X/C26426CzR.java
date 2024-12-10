package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.CzR  reason: case insensitive filesystem */
public final class C26426CzR implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 6:
                    arrayList = C26300CxD.A0F(parcel, readInt);
                    break;
                case 7:
                    z3 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23139Bbs(str, str2, str3, arrayList, z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23139Bbs[i];
    }
}
