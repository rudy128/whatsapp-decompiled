package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D37 implements Parcelable.Creator {
    public final /* synthetic */ Class A00;

    public D37(Class cls) {
        this.A00 = cls;
    }

    public Object createFromParcel(Parcel parcel) {
        try {
            return this.A00.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            String canonicalName = this.A00.getCanonicalName();
            if (canonicalName == null) {
                canonicalName = null;
            }
            throw AnonymousClass000.A0n(canonicalName);
        }
    }

    public Object[] newArray(int i) {
        return new Object[i];
    }
}
