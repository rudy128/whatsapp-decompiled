package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.76U  reason: invalid class name */
public final class AnonymousClass76U implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        if (C72453Mb.A0A(parcel) == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                A0z.add(AnonymousClass777.CREATOR.createFromParcel(parcel));
            }
        }
        return new C1417876y(A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417876y[i];
    }
}
