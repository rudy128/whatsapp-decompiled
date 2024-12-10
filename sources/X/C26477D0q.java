package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0q  reason: case insensitive filesystem */
public final class C26477D0q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        C23168BcO bcO = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    bcO = (C23168BcO) C26300CxD.A0A(parcel, C23168BcO.CREATOR, readInt);
                    break;
                case 3:
                    iBinder = C26300CxD.A09(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C26300CxD.A0A(parcel, PendingIntent.CREATOR, readInt);
                    break;
                case 5:
                    iBinder2 = C26300CxD.A09(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = C26300CxD.A09(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23091Bb6(pendingIntent, iBinder, iBinder2, iBinder3, bcO, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23091Bb6[i];
    }
}
