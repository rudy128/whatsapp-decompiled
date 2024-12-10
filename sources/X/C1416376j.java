package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76j  reason: invalid class name and case insensitive filesystem */
public class C1416376j implements Parcelable.Creator {
    public final int A00;

    public C1416376j(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.76m, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.A00 != 0) {
            C18070vi.A0d(parcel, 0);
            return new C1418477e(parcel);
        }
        ? obj = new Object();
        obj.A01 = parcel.readString();
        obj.A00 = parcel.readInt();
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.A00 != 0) {
            return new C1418477e[i];
        }
        return new C1416676m[i];
    }
}
