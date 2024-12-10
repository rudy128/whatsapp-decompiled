package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2ue  reason: invalid class name and case insensitive filesystem */
public final class C64362ue implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C64582v0((PhoneUserJid) parcel.readParcelable(C64582v0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C64582v0[i];
    }
}
