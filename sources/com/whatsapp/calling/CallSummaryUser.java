package com.whatsapp.calling;

import X.AnonymousClass1B7;
import com.whatsapp.jid.UserJid;

public final class CallSummaryUser implements AnonymousClass1B7 {
    public final UserJid jid;
    public final int state;

    public boolean isCallConnected() {
        if (this.state != 1) {
            return false;
        }
        return true;
    }

    public CallSummaryUser(UserJid userJid, int i) {
        this.jid = userJid;
        this.state = i;
    }

    public UserJid getCallUserJid() {
        return this.jid;
    }
}
