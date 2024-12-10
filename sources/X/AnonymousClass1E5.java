package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1E5  reason: invalid class name */
public final class AnonymousClass1E5 extends UserJid implements Parcelable {
    public static final AnonymousClass1E5 A00 = new AnonymousClass1E5();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public AnonymousClass1E5() {
        super("");
    }

    public static final boolean A00(Jid jid) {
        if (jid == A00) {
            return true;
        }
        return false;
    }

    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for MeJid");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "status_me";
    }
}
