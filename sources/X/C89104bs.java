package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bs  reason: invalid class name and case insensitive filesystem */
public final class C89104bs implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object createFromParcel2;
        Object obj = null;
        if (C72453Mb.A0A(parcel) == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C89314cG.CREATOR.createFromParcel(parcel);
        }
        C89314cG r2 = (C89314cG) createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = C89434cS.CREATOR.createFromParcel(parcel);
        }
        C89434cS r1 = (C89434cS) createFromParcel2;
        if (parcel.readInt() != 0) {
            obj = C89324cH.CREATOR.createFromParcel(parcel);
        }
        return new C89424cR(r2, (C89324cH) obj, r1);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89424cR[i];
    }
}
