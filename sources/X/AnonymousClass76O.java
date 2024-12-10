package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76O  reason: invalid class name */
public final class AnonymousClass76O implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.76n, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        boolean booleanValue = A3Y.A00(parcel).booleanValue();
        ? obj = new Object();
        obj.A00 = booleanValue;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1416776n[i];
    }
}
