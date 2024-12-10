package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0R4  reason: invalid class name */
public final class AnonymousClass0R4 implements Parcelable.ClassLoaderCreator {
    /* renamed from: A00 */
    public AnonymousClass08V createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C16290s1 A00;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            A00 = AnonymousClass0Q9.A00();
        } else if (readInt == 1) {
            A00 = AnonymousClass0Q9.A06();
        } else if (readInt == 2) {
            A00 = AnonymousClass0Q9.A05();
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported MutableState policy ");
            A10.append(readInt);
            throw AnonymousClass000.A0o(" was restored", A10);
        }
        return new AnonymousClass08V(A00, readValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass08V[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
