package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABy  reason: case insensitive filesystem */
public final class C20214ABy implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.8pG, java.lang.Object, X.8pd] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        ? obj = new Object();
        obj.A0P(parcel);
        obj.A04 = parcel.readString();
        obj.A03 = parcel.readString();
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170298pd[i];
    }
}
