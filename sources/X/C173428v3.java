package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8v3  reason: invalid class name and case insensitive filesystem */
public final class C173428v3 extends Jid implements Parcelable {
    public static final C173428v3 A00 = new C173428v3();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 16;
    }

    public C173428v3() {
        super("");
    }

    public String getServer() {
        return "g.us";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C72473Md.A0w(parcel);
    }
}
