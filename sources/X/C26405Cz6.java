package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cz6  reason: case insensitive filesystem */
public final class C26405Cz6 implements Parcelable.ClassLoaderCreator {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, java.lang.Object, X.BL0] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C18070vi.A0d(parcel, 0);
        ? r1 = new C27741Xj(parcel, classLoader);
        r1.A00 = -1;
        r1.A00 = parcel.readInt();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BL0[i];
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, java.lang.Object, X.BL0] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        ? r1 = new C27741Xj(parcel, (ClassLoader) null);
        r1.A00 = -1;
        r1.A00 = parcel.readInt();
        return r1;
    }
}
