package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1yJ  reason: invalid class name and case insensitive filesystem */
public class C42521yJ extends AnonymousClass1EE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42521yJ(UserJid userJid, int i) {
        super(userJid, i);
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public int getAgent() {
        return 1;
    }

    public int getType() {
        return 19;
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
        return "lid";
    }
}
