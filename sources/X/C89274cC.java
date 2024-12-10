package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.4cC  reason: invalid class name and case insensitive filesystem */
public class C89274cC implements Parcelable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public C89274cC(UserJid userJid, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }
}
