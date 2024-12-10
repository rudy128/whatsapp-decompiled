package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75r  reason: invalid class name and case insensitive filesystem */
public final class C1414575r implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        C18070vi.A0d(parcel, 0);
        boolean A1R = C72473Md.A1R(parcel);
        AnonymousClass1BI r3 = (AnonymousClass1BI) AnonymousClass3Ma.A08(parcel, C115935w5.class);
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C115945w6.CREATOR.createFromParcel(parcel);
        }
        return new C115935w5((C115945w6) createFromParcel, r3, readInt, A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C115935w5[i];
    }
}
