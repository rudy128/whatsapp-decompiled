package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1cZ  reason: invalid class name and case insensitive filesystem */
public final class C29611cZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new AnonymousClass1MD((Jid) parcel.readParcelable(AnonymousClass1MD.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readByte());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1MD[i];
    }
}
