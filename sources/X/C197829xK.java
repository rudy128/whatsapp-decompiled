package X;

import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xK  reason: invalid class name and case insensitive filesystem */
public final class C197829xK {
    public long A00;
    public final Map A01;

    public C197829xK(Parcel parcel) {
        this.A00 = parcel.readLong();
        LinkedHashMap A13 = C17880vN.A13();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A13.put(AnonymousClass8BT.A0i(parcel), parcel.readString());
        }
        this.A01 = A13;
    }

    public C197829xK() {
        this.A00 = 0;
        this.A01 = C17880vN.A13();
    }
}
