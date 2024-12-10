package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8v6  reason: invalid class name and case insensitive filesystem */
public final class C173458v6 extends UserJid implements Parcelable {
    public static final C173458v6 A00 = new C173458v6();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 8;
    }

    public C173458v6() {
        super("Server");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C72473Md.A0w(parcel);
    }
}
