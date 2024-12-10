package com.whatsapp.voipcalling;

import X.C134216qE;
import X.C181219Pp;
import com.whatsapp.jid.UserJid;

public class CallLinkInfo {
    public static final String DEFAULT_CALL_LINK_CALL_ID = "default";
    public final UserJid creatorJid;
    public final long eventStartTimeSec;
    public final int linkState;
    public C134216qE self;
    public final String token;
    public final boolean videoEnabled;

    private void setSelfParticipantInfo(UserJid userJid, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6) {
        UserJid userJid2 = userJid;
        boolean z8 = z7;
        int i7 = i;
        int i8 = i2;
        boolean z9 = z;
        boolean z10 = z2;
        boolean z11 = z3;
        boolean z12 = z4;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        this.self = new C134216qE(userJid2, i7, true, z8, false, false, false, 0, false, i8, z9, z10, z11, z12, i9, i10, i11, z5, z6, false, false, false, false, 0, 1, false, 0, false, i6);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("token: ");
        sb.append(this.token);
        sb.append(", videoEnabled: ");
        sb.append(this.videoEnabled);
        sb.append(", linkState: ");
        sb.append(C181219Pp.A00(this.linkState));
        return sb.toString();
    }

    public CallLinkInfo(int i, UserJid userJid, String str, boolean z) {
        this.linkState = i;
        this.creatorJid = userJid;
        this.token = str;
        this.videoEnabled = z;
        this.eventStartTimeSec = 0;
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    public long getEventStartTimeSec() {
        return this.eventStartTimeSec;
    }

    public int getLinkState() {
        return this.linkState;
    }

    public C134216qE getSelfInfo() {
        return this.self;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public CallLinkInfo(String str, boolean z, long j) {
        this.linkState = 0;
        this.creatorJid = null;
        this.token = str;
        this.videoEnabled = z;
        this.eventStartTimeSec = j;
    }
}
