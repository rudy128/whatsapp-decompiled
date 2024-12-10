package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.75z  reason: invalid class name and case insensitive filesystem */
public final class C1415375z implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ArrayList A0z = C17880vN.A0z(A0A);
        for (int i = 0; i != A0A; i++) {
            A0z.add(AnonymousClass77E.CREATOR.createFromParcel(parcel));
        }
        return new C1417676w(A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1417676w[i];
    }
}
