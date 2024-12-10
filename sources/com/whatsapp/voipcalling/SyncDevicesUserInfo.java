package com.whatsapp.voipcalling;

import com.whatsapp.jid.UserJid;

public final class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncDevicesUserInfo {jid=");
        sb.append(this.jid);
        sb.append(", phash=");
        sb.append(this.phash);
        sb.append('}');
        return sb.toString();
    }

    public SyncDevicesUserInfo(String str, String str2) {
        this.phash = str2;
        UserJid A04 = UserJid.Companion.A04(str);
        if (A04 != null) {
            this.jid = A04;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
