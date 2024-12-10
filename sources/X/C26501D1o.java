package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.D1o  reason: case insensitive filesystem */
public final class C26501D1o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 2:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new ClientAppContext(str, str2, str3, i, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientAppContext[i];
    }
}
