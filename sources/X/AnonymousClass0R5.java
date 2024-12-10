package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0R5  reason: invalid class name */
public class AnonymousClass0R5 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public AnonymousClass0R5(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (this.A00 != 0) {
            return new AnonymousClass03L(parcel, classLoader);
        }
        return new AnonymousClass0Bm(parcel, classLoader);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.A00 != 0) {
            return new AnonymousClass03L[i];
        }
        return new AnonymousClass0Bm[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.A00 != 0) {
            return new AnonymousClass03L(parcel, (ClassLoader) null);
        }
        return new AnonymousClass0Bm(parcel, (ClassLoader) null);
    }
}
