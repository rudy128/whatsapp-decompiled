package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.8v2  reason: invalid class name and case insensitive filesystem */
public final class C173418v2 extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173418v2(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        if (!C36321nh.A02(str)) {
            throw new AnonymousClass11T(str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 28;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getServer() {
        return "interop.g.us";
    }
}
