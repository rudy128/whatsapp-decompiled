package com.whatsapp.jid;

import X.AnonymousClass11T;
import X.C18070vi;
import X.C22951Dx;
import android.os.Parcel;
import android.os.Parcelable;

public final class PhoneUserJid extends UserJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public static final C22951Dx Companion = new Object();
    public static final UserJid WHATSAPP_CAPS_SURVEY = C22951Dx.A01("16505361212");
    public final String userString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneUserJid(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.userString = str;
        if (!C22951Dx.A02(this.user)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid user: ");
            sb.append(this.user);
            throw new AnonymousClass11T(sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.userString);
    }

    public String getServer() {
        return "s.whatsapp.net";
    }
}
