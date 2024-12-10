package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76v  reason: invalid class name and case insensitive filesystem */
public class C1417576v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public void A00() {
        if (this instanceof C120006Az) {
            C17880vN.A1C(((C192669om) ((C120006Az) this).A00.A02.get()).A03.A00().edit(), "nux_seen_count", Integer.MAX_VALUE);
        }
    }

    public void A01() {
        if (this instanceof C120006Az) {
            C190139kR r1 = ((C192669om) ((C120006Az) this).A00.A02.get()).A03;
            C17880vN.A1C(r1.A00().edit(), "nux_seen_count", C17890vO.A00(r1.A00(), "nux_seen_count") + 1);
        }
    }

    public boolean A02() {
        if (!(this instanceof C120006Az)) {
            return false;
        }
        C133666pH r2 = ((C120006Az) this).A00;
        return AnonymousClass000.A1U(C17890vO.A00(((C192669om) r2.A02.get()).A03.A00(), "nux_seen_count"), C18020vd.A00(C18040vf.A02, r2.A00, 6374));
    }
}
