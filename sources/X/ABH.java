package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABH implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.8pX, java.lang.Object, X.8pa] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        ? obj = new Object();
        obj.A09 = parcel.readString();
        obj.A03 = parcel.readString();
        obj.A07 = parcel.readString();
        obj.A04 = parcel.readString();
        obj.A05 = parcel.readString();
        obj.A00 = (C1418477e) AnonymousClass3Ma.A08(parcel, C1418477e.class);
        obj.A02 = parcel.readString();
        obj.A01 = (AnonymousClass8pS) AnonymousClass3Ma.A08(parcel, AnonymousClass8pS.class);
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170268pa[i];
    }
}
