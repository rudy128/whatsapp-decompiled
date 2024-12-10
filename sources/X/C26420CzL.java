package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.CzL  reason: case insensitive filesystem */
public final class C26420CzL implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        int A02 = C26300CxD.A02(parcel);
        HashSet A12 = C17880vN.A12();
        String str = null;
        int i2 = 0;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        C23080Bav bav = null;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C26300CxD.A03(parcel, readInt);
                    i = 1;
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    i = 2;
                    break;
                case 3:
                    i3 = C26300CxD.A03(parcel, readInt);
                    i = 3;
                    break;
                case 4:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    i = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C26300CxD.A0A(parcel, PendingIntent.CREATOR, readInt);
                    i = 5;
                    break;
                case 6:
                    bav = (C23080Bav) C26300CxD.A0A(parcel, C23080Bav.CREATOR, readInt);
                    i = 6;
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    continue;
            }
            C17890vO.A1D(A12, i);
        }
        if (parcel.dataPosition() == A02) {
            return new C23258Be8(pendingIntent, bav, str, A12, bArr, i2, i3);
        }
        throw new C27213DZn(parcel, AnonymousClass001.A1I("Overread allowed size end=", AnonymousClass000.A10(), A02));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23258Be8[i];
    }
}
