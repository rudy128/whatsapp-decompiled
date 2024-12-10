package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.ACv  reason: case insensitive filesystem */
public final class C20237ACv implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        ArrayList A0z = C17880vN.A0z(A0A);
        int i = 0;
        while (i != A0A) {
            i = AnonymousClass8BV.A01(parcel, C20254ADm.CREATOR, A0z, i);
        }
        return new AER((UserJid) AnonymousClass3Ma.A08(parcel, AER.class), (AE3) AE3.CREATOR.createFromParcel(parcel), A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AER[i];
    }
}
