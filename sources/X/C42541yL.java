package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1yL  reason: invalid class name and case insensitive filesystem */
public final class C42541yL extends UserJid implements Parcelable {
    public static final C42541yL A00 = new C42541yL();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public C42541yL() {
        super("0");
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "s.whatsapp.net";
    }
}
