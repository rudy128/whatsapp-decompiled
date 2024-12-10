package com.whatsapp.calling;

import X.C18070vi;
import com.whatsapp.jid.UserJid;

public final class CallSummary {
    public UserJid callCreatorJid;
    public String callID;
    public CallSummaryUser[] callSummaryUsers;
    public int durationMs;
    public boolean isVideoCall;

    public CallSummary(UserJid userJid, String str, boolean z, int i, CallSummaryUser[] callSummaryUserArr) {
        C18070vi.A0d(userJid, 1);
        C18070vi.A0d(str, 2);
        C18070vi.A0d(callSummaryUserArr, 5);
        this.callCreatorJid = userJid;
        this.callID = str;
        this.isVideoCall = z;
        this.durationMs = i;
        this.callSummaryUsers = callSummaryUserArr;
    }
}
