package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4bR  reason: invalid class name */
public final class AnonymousClass4bR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C75843lq((UserJid) AnonymousClass3Ma.A08(parcel, C75843lq.class), parcel.readString(), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C75843lq[i];
    }
}
