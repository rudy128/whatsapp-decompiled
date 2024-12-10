package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1E4  reason: invalid class name */
public final class AnonymousClass1E4 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = AnonymousClass1E3.CREATOR;
        return new AnonymousClass1E3((UserJid) parcel.readParcelable(AnonymousClass1E3.class.getClassLoader()), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1E3[i];
    }
}
