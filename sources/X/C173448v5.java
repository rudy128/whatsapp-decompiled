package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8v5  reason: invalid class name and case insensitive filesystem */
public final class C173448v5 extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173448v5(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length >= 18 && length <= 32) {
            int i = 0;
            do {
                char charAt = str.charAt(i);
                if ('0' <= charAt) {
                    if (charAt >= ':') {
                        char c = 'g';
                        if ('a' > charAt) {
                            if ('A' <= charAt) {
                                c = 'G';
                            }
                        }
                        if (charAt >= c) {
                        }
                    }
                    i++;
                }
            } while (i < length);
            return;
        }
        throw new AnonymousClass11T(str);
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 10;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getServer() {
        return "call";
    }
}
