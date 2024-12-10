package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.75h  reason: invalid class name and case insensitive filesystem */
public final class C1413575h implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ArrayList A0z = C17880vN.A0z(A0A);
        for (int i = 0; i != A0A; i++) {
            A0z.add(AnonymousClass3Ma.A08(parcel, C115165tV.class));
        }
        return new C115165tV(C137126ux.A00(parcel.readString()), parcel.readString(), A0z, parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C115165tV[i];
    }
}
