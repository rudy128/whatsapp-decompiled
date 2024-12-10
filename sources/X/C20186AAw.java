package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAw  reason: case insensitive filesystem */
public final class C20186AAw implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.ADD, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        C18070vi.A0d(A0y, 1);
        ? obj = new Object();
        obj.A00 = A0y;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADD[i];
    }
}
