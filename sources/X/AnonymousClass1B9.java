package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipant;

/* renamed from: X.1B9  reason: invalid class name */
public final class AnonymousClass1B9 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new CallParticipant((UserJid) parcel.readParcelable(CallParticipant.class.getClassLoader()), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CallParticipant[i];
    }
}
