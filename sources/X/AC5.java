package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC5 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.8pG, java.lang.Object, X.8pe] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        ? obj = new Object();
        obj.A0P(parcel);
        obj.A05 = parcel.readString();
        obj.A04 = parcel.readString();
        obj.A03 = parcel.readString();
        obj.A02 = (Boolean) parcel.readSerializable();
        obj.A06 = parcel.readString();
        obj.A01 = (C20274AEh) AnonymousClass3Ma.A08(parcel, C20274AEh.class);
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170308pe[i];
    }
}
