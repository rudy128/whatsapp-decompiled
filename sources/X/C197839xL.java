package X;

import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xL  reason: invalid class name and case insensitive filesystem */
public final class C197839xL {
    public final Map A00;
    public final Map A01;

    public C197839xL(Parcel parcel) {
        LinkedHashMap A13 = C17880vN.A13();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A13.put(AnonymousClass8BT.A0i(parcel), parcel.readString());
        }
        this.A01 = A13;
        LinkedHashMap A132 = C17880vN.A13();
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            A132.put(AnonymousClass8BT.A0i(parcel), parcel.readString());
        }
        this.A00 = A132;
    }

    public C197839xL() {
        this.A01 = C17880vN.A13();
        this.A00 = C17880vN.A13();
    }
}
