package com.whatsapp.voipcalling;

import com.whatsapp.jid.UserJid;

public final class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallOfferAckError {errorJid=");
        sb.append(this.errorJid);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append('}');
        return sb.toString();
    }

    public CallOfferAckError(String str, int i) {
        this.errorCode = i;
        UserJid A04 = UserJid.Companion.A04(str);
        if (A04 != null) {
            this.errorJid = A04;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
