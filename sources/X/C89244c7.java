package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4c7  reason: invalid class name and case insensitive filesystem */
public final class C89244c7 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        boolean A1R = C72473Md.A1R(parcel);
        String readString = parcel.readString();
        return new C89444cT(parcel.readInt(), (UserJid) AnonymousClass3Ma.A08(parcel, C89444cT.class), readString, A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89444cT[i];
    }
}
