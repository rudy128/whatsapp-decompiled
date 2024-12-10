package com.whatsapp.jid;

import X.C18070vi;
import X.C22911Dt;
import X.C22921Du;
import X.C42171xk;
import android.os.Parcelable;
import java.util.Arrays;

public abstract class Jid implements Comparable, Parcelable {
    public static final C22911Dt Companion = new Object();
    public static final C22921Du JID_FACTORY = C22921Du.A01();
    public final String user;

    public Jid(String str) {
        C18070vi.A0d(str, 1);
        this.user = str;
    }

    public int compareTo(Jid jid) {
        C18070vi.A0d(jid, 0);
        return getRawString().compareTo(jid.getRawString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        return C42171xk.A00(this.user, jid.user) && C18070vi.A18(getServer(), jid.getServer()) && getType() == jid.getType();
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public abstract String getServer();

    public abstract int getType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public String getRawString() {
        return C22911Dt.A01(this.user, getServer());
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public final boolean isProtocolCompliant() {
        int type = getType();
        if (type == 2 || type == 9 || type == 11 || type == 8) {
            return false;
        }
        return true;
    }

    public String toString() {
        return getObfuscatedString();
    }
}
