package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: X.CzH  reason: case insensitive filesystem */
public final class C26416CzH implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        HashMap A11 = C17880vN.A11();
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = HashMap.class.getClassLoader();
        if (i >= 33) {
            Class<String> cls = String.class;
            parcel.readMap(A11, classLoader, cls, cls);
        } else {
            parcel.readMap(A11, classLoader);
        }
        return new D4E(A11);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D4E[i];
    }
}
