package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC0 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pR r2 = new AnonymousClass8pR();
        Class<C1418477e> cls = C1418477e.class;
        r2.A01 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r2.A01 = parcel.readString();
        r2.A00 = parcel.readInt();
        r2.A02 = parcel.readString();
        r2.A03 = parcel.readString();
        r2.A03 = C17890vO.A1R(parcel.readInt());
        r2.A05 = parcel.readString();
        r2.A06 = parcel.readString();
        r2.A02 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r2.A00 = parcel.readLong();
        return r2;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pR[i];
    }
}
