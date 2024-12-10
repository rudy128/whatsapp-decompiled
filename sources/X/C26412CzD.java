package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.CzD  reason: case insensitive filesystem */
public final class C26412CzD implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C26542D3d.CREATOR;
        return new C26544D3f((C26542D3d) creator.createFromParcel(parcel), (C26542D3d) creator.createFromParcel(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C26544D3f[i];
    }
}
