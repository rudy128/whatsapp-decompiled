package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1E3  reason: invalid class name */
public final class AnonymousClass1E3 extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1E3(UserJid userJid, int i) {
        super(userJid, i);
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 17;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }
}
