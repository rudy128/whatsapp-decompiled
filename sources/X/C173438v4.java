package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8v4  reason: invalid class name and case insensitive filesystem */
public final class C173438v4 extends Jid implements Parcelable {
    public static final C173438v4 A00 = new C173438v4();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 13;
    }

    public C173438v4() {
        super("");
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C72473Md.A0w(parcel);
    }
}
