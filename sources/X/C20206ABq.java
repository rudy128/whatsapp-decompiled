package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABq  reason: case insensitive filesystem */
public final class C20206ABq implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.8pG, X.8pc, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        ? obj = new Object();
        obj.A0P(parcel);
        obj.A00 = parcel.readLong();
        obj.A01 = parcel.readString();
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170288pc[i];
    }
}
