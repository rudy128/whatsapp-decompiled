package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.D1p  reason: case insensitive filesystem */
public final class C26502D1p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        int i = 0;
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 2) {
                i2 = C26300CxD.A06(parcel, c, 3, readInt, i2);
            } else {
                clientAppContext = (ClientAppContext) C26300CxD.A0A(parcel, ClientAppContext.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23072Ban(clientAppContext, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23072Ban[i];
    }
}
