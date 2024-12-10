package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0R6  reason: invalid class name */
public class AnonymousClass0R6 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        return new AnonymousClass0RM(readBundle);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0RM[i];
    }
}
