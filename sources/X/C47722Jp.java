package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Jp  reason: invalid class name and case insensitive filesystem */
public final class C47722Jp extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47722Jp(UserJid userJid, int i) {
        super(userJid, i);
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
        if (i != 99) {
            throw new AnonymousClass11T(AnonymousClass001.A1I("device_id should be 99 for hosted device, is ", AnonymousClass000.A10(), i));
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 24;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.user);
        A10.append(':');
        A10.append(this.A00);
        A10.append('@');
        return AnonymousClass000.A0y("hosted", A10);
    }

    public String getServer() {
        return "hosted";
    }
}
