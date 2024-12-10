package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ul  reason: invalid class name and case insensitive filesystem */
public final class C64432ul implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C47722Jp.CREATOR;
        return new C47722Jp((UserJid) parcel.readParcelable(C47722Jp.class.getClassLoader()), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C47722Jp[i];
    }
}
