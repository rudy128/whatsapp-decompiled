package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bO  reason: invalid class name */
public final class AnonymousClass4bO implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C89334cI(AnonymousClass000.A1O(parcel.readInt()), (Uri) AnonymousClass3Ma.A08(parcel, C89334cI.class));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89334cI[i];
    }
}
