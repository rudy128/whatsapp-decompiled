package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1yK  reason: invalid class name and case insensitive filesystem */
public final class C42531yK implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C42521yJ.CREATOR;
        return new C42521yJ((UserJid) parcel.readParcelable(C42521yJ.class.getClassLoader()), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C42521yJ[i];
    }
}
