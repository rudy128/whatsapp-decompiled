package com.whatsapp.voipcalling;

import X.C17960vV;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

public class CallOfferInfo {
    public final CallGroupInfo callGroupInfo;
    public final String callId;
    public final String callLinkToken;
    public final long epochTimeMillis;
    public final UserJid fromJid;
    public final GroupJid groupJid;
    public final String groupPhash;
    public final boolean isAudioChat;
    public final boolean isJoinableCall;
    public final boolean isOfferExpired;
    public final boolean isVideoCall;
    public final String scheduledId;
    public final int silenceReason;
    public final boolean uploadFieldStat;

    public static CallOfferInfo create(UserJid userJid, GroupJid groupJid2, String str, long j, boolean z, CallGroupInfo callGroupInfo2, boolean z2, boolean z3, String str2, String str3, int i, boolean z4, String str4, boolean z5) {
        if (str != null) {
            return new CallOfferInfo(userJid, groupJid2, str, j, z, callGroupInfo2, z2, z3, str2, str3, i, z4, str4, z5);
        }
        C17960vV.A0F(false, "callId shouldn't be null");
        return null;
    }

    public boolean isJoinableGroupCall() {
        if (!this.isJoinableCall || this.callGroupInfo == null) {
            return false;
        }
        return true;
    }

    public CallOfferInfo(UserJid userJid, GroupJid groupJid2, String str, long j, boolean z, CallGroupInfo callGroupInfo2, boolean z2, boolean z3, String str2, String str3, int i, boolean z4, String str4, boolean z5) {
        this.fromJid = userJid;
        this.groupJid = groupJid2;
        this.callId = str;
        this.epochTimeMillis = j;
        this.isVideoCall = z;
        this.callGroupInfo = callGroupInfo2;
        this.uploadFieldStat = z2;
        this.isJoinableCall = z3;
        this.callLinkToken = str2;
        this.scheduledId = str3;
        this.silenceReason = i;
        this.isAudioChat = z4;
        this.groupPhash = str4;
        this.isOfferExpired = z5;
    }

    public String getLinkToken() {
        return this.callLinkToken;
    }

    public GroupJid getOfferGroupJid() {
        return this.groupJid;
    }
}
