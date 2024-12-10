package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.Btd  reason: case insensitive filesystem */
public final class C23996Btd extends Jid implements Parcelable {
    public static final C23996Btd A00 = new C23996Btd();
    public static final Parcelable.Creator CREATOR = new Object();

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 20;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(1);
    }

    public C23996Btd() {
        super("");
    }

    public String getServer() {
        return "call";
    }
}
