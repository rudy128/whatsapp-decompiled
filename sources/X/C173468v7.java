package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8v7  reason: invalid class name and case insensitive filesystem */
public final class C173468v7 extends UserJid implements Parcelable {
    public static final C173468v7 A00 = new C173468v7();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 11;
    }

    public C173468v7() {
        super("");
    }

    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for LidMeJid");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "lid_me";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C72473Md.A0w(parcel);
    }
}
