package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.ACn  reason: case insensitive filesystem */
public final class C20229ACn implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ArrayList A0z = C17880vN.A0z(A0A);
        int i = 0;
        while (i != A0A) {
            i = AnonymousClass8BV.A01(parcel, C20285AEt.CREATOR, A0z, i);
        }
        return new C20242ADa(A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20242ADa[i];
    }
}
