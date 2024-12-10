package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AC9 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.90a, java.lang.Object, X.AD9] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        C18070vi.A0d(A0y, 1);
        ? obj = new Object();
        obj.A00 = "DOC_UPLOAD";
        obj.A00 = A0y;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1762390a[i];
    }
}
