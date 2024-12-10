package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.ACw  reason: case insensitive filesystem */
public final class C20238ACw implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        int i = 0;
        while (i != readInt) {
            i = AnonymousClass8BV.A01(parcel, C20243ADb.CREATOR, A0z, i);
        }
        return new C20254ADm(A0y, A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20254ADm[i];
    }
}
