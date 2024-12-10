package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.List;

/* renamed from: X.6xW  reason: invalid class name and case insensitive filesystem */
public class C138686xW {
    public final int A00;
    public final int A01;
    public final long A02;
    public final GroupJid A03;
    public final UserJid A04;
    public final CallState A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static C138686xW A00(CallInfo callInfo, int i, boolean z) {
        boolean z2;
        String str;
        CallInfo callInfo2 = callInfo;
        if (callInfo2.hasPendingCall()) {
            C56102gu r3 = callInfo2.callWaitingInfo;
            UserJid userJid = r3.A03.initialPeerJid;
            C17960vV.A07(userJid);
            String str2 = r3.A04;
            CallState callState = CallState.RECEIVED_CALL;
            if (r3.A00 > 1 || ((str = r3.A05) != null && !str.isEmpty())) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = r3.A08;
            List list = r3.A06;
            return new C138686xW(r3.A02, userJid, callState, str2, list, -1, 0, 0, false, z2, z3, false, false, true, r3.A07, false, r3.A09, false);
        }
        List peerJids = callInfo2.getPeerJids();
        String str3 = callInfo2.callId;
        CallState callState2 = callInfo2.callState;
        boolean z4 = callInfo2.isCaller;
        boolean z5 = callInfo2.isGroupCall;
        boolean z6 = callInfo2.videoEnabled;
        boolean isCallOnHold = callInfo2.isCallOnHold();
        long j = callInfo2.callDuration;
        UserJid A0T = C108955ca.A0T(callInfo2);
        return new C138686xW(callInfo2.groupJid, A0T, callState2, str3, peerJids, i, 0, j, z4, z5, z6, z, isCallOnHold, false, callInfo2.isJoinableGroupCall, callInfo2.isInLonelyState(), callInfo2.isAudioChat(), false);
    }

    public C138686xW(GroupJid groupJid, UserJid userJid, CallState callState, String str, List list, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A06 = str;
        this.A05 = callState;
        this.A09 = z;
        this.A0A = z2;
        this.A0H = z3;
        this.A0F = z4;
        this.A0E = z5;
        this.A02 = j;
        this.A04 = userJid;
        this.A07 = list;
        this.A0G = z6;
        this.A03 = groupJid;
        this.A0D = z7;
        this.A0C = z8;
        this.A00 = i;
        this.A08 = z9;
        this.A01 = i2;
        this.A0B = z10;
    }
}
