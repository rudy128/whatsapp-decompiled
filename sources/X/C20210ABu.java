package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ABu  reason: case insensitive filesystem */
public final class C20210ABu implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.8pH, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Bundle readBundle = parcel.readBundle(AnonymousClass8pH.class.getClassLoader());
        ? obj = new Object();
        obj.A00 = readBundle;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pH[i];
    }
}
