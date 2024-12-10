package com.whatsapp.voipcalling;

import X.C134216qE;
import X.C17960vV;
import X.C22971Dz;
import X.C56102gu;
import X.C83594Fx;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public UserJid callLinkCreatorJid;
    public int callLinkState;
    public String callLinkToken;
    public int callResult;
    public int callSetupErrorType;
    public final CallState callState;
    public C56102gu callWaitingInfo;
    public boolean canRingAll;
    public int connectedLimit;
    public final DeviceJid creatorDeviceJid;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isBCall;
    public boolean isBCallBroadcaster;
    public final boolean isBotCall;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public boolean isLightweight;
    public boolean isPhashBasedCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public final String relayCallUuid;
    public String scheduledId;
    public C134216qE self;
    public final String selfParticipantUuid;
    public final String tsLogCallId;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    private void addParticipantInfo(C134216qE r3) {
        this.participants.put(r3.A0A, r3);
        if (r3.A0M) {
            this.self = r3;
        }
    }

    public static CallInfo convertCallLinkInfoToCallInfo(CallLinkInfo callLinkInfo) {
        CallLinkInfo callLinkInfo2 = callLinkInfo;
        C134216qE r3 = callLinkInfo2.self;
        CallInfo callInfo = new CallInfo(CallState.LINK, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, (String) null, (String) null, (String) null, (UserJid) null, (UserJid) null, (UserJid) null, (DeviceJid) null, (GroupJid) null, false, true, false, false, callLinkInfo2.videoEnabled, false, 0, 0, false, r3.A0R, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, callLinkInfo2.token, (String) null, false, false, false, false, false, false);
        callInfo.addParticipantInfo(r3);
        callInfo.callLinkCreatorJid = callLinkInfo2.creatorJid;
        callInfo.callLinkState = callLinkInfo2.linkState;
        return callInfo;
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        CallState callState2;
        String str;
        CallInfo callInfo2 = callInfo;
        C56102gu r11 = callInfo2.callWaitingInfo;
        boolean z = true;
        if (r11.A01 == 1) {
            callState2 = CallState.RECEIVED_CALL;
        } else {
            callState2 = CallState.ACTIVE;
        }
        UserJid userJid = r11.A03.initialPeerJid;
        C17960vV.A07(userJid);
        String str2 = r11.A04;
        List<UserJid> list = r11.A06;
        UserJid userJid2 = (UserJid) list.get(0);
        DeviceJid primaryDevice = ((UserJid) list.get(0)).getPrimaryDevice();
        GroupJid groupJid2 = r11.A02;
        if (r11.A00 <= 1 && ((str = r11.A05) == null || str.isEmpty())) {
            z = false;
        }
        boolean z2 = callInfo2.isGroupCallEnabled;
        boolean z3 = r11.A08;
        String str3 = str2;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        GroupJid groupJid3 = groupJid2;
        boolean z4 = z;
        CallInfo callInfo3 = new CallInfo(callState2, str3, (String) null, (String) null, (String) null, userJid, userJid3, userJid4, primaryDevice, groupJid3, false, z4, z2, false, z3, false, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, -1, 0, r11.A07, r11.A05, (String) null, false, false, false, false, false, false);
        C134216qE r0 = callInfo2.self;
        UserJid userJid5 = r0.A0A;
        int i = r0.A04;
        boolean z5 = r0.A0F;
        boolean z6 = r0.A0J;
        boolean z7 = r0.A0D;
        int i2 = r0.A03;
        boolean z8 = z5;
        boolean z9 = z6;
        boolean z10 = z7;
        int i3 = i2;
        callInfo3.addParticipantInfo(userJid5, i, true, false, z8, z9, z10, i3, r0.A0G, 1, r0.A0R, r0.A0Q, r0.A0P, r0.A0O, r0.A09, r0.A06, r0.A07 * 90, r0.A0B, r0.A0C, r0.A0N, false, false, false, 0, r0.A05, false, 0, false, r0.A01);
        for (UserJid addParticipantInfo : list) {
            callInfo3.addParticipantInfo(addParticipantInfo, 2, false, false, false, false, false, 0, false, z3 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, false, false, false, false, 0, 1, false, 0, false, 0);
        }
        callInfo3.setCallWaitingInfo(0, "", 0, new String[0], (GroupJid) null, false, false, 0, false, (CallLogInfo) null, false, (String) null, false);
        return callInfo3;
    }

    public boolean enableAudioVideoSwitch() {
        C134216qE r0 = this.self;
        if (r0 == null || !r0.A0B) {
            return false;
        }
        return true;
    }

    public int getConnectedParticipantsCount() {
        return C83594Fx.A00(this.participants);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C134216qE getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 != 0) goto L_0x002a
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r3.next()
            X.6qE r2 = (X.C134216qE) r2
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r1 = r2.A0A
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0029:
            return r2
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.6qE");
    }

    public C134216qE getInfoByJid(UserJid userJid) {
        return (C134216qE) this.participants.get(userJid);
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public List getPeerJids() {
        ArrayList arrayList = new ArrayList();
        for (C134216qE r1 : this.participants.values()) {
            if (!r1.A0M) {
                arrayList.add(r1.A0A);
            }
        }
        return arrayList;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        if (this.callState != CallState.ACTIVE || getDefaultPeerInfo() == null) {
            return false;
        }
        int i = getDefaultPeerInfo().A04;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public final boolean hasPendingCall() {
        int i;
        C56102gu r3 = this.callWaitingInfo;
        if (r3.A01 != 1 || (i = r3.A03.callLogResultType) == 4 || i == 2) {
            return false;
        }
        return true;
    }

    public boolean isAudioChat() {
        if (this.groupJid == null || !this.isLightweight) {
            return false;
        }
        return true;
    }

    public boolean isCallFull() {
        if (this.connectedLimit <= 0 || C83594Fx.A00(this.participants) < this.connectedLimit) {
            return false;
        }
        return true;
    }

    public boolean isCallLinkLobbyOrJoiningState() {
        int i = this.callLinkState;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isEitherSideRequestingUpgrade() {
        C134216qE r0;
        if (this.isGroupCall || this.callState == CallState.NONE || (r0 = this.self) == null) {
            return false;
        }
        if (r0.A08 == 3 || isPeerRequestingUpgrade()) {
            return true;
        }
        return false;
    }

    public boolean isInLonelyState() {
        CallState callState2 = this.callState;
        if (callState2 != CallState.CONNECTED_LONELY) {
            if (callState2 == CallState.ACTIVE) {
                for (C134216qE r1 : this.participants.values()) {
                    if (r1.A04 != 1 || r1.A0M) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean isLidCall() {
        return C22971Dz.A0T(this.creatorJid);
    }

    public boolean isPhashBasedCall() {
        if (this.groupJid == null || !this.isPhashBasedCall) {
            return false;
        }
        return true;
    }

    public boolean isSelfCallOnHold() {
        C134216qE r0 = this.self;
        if (r0 == null || !r0.A0F) {
            return false;
        }
        return true;
    }

    public boolean isSelfRequestingUpgrade() {
        C134216qE r2;
        if (this.isGroupCall || (r2 = this.self) == null || this.callState == CallState.NONE || r2.A08 != 3) {
            return false;
        }
        return true;
    }

    public boolean isStartedFromCallLink() {
        if (this.callLinkToken != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallId: ");
        sb.append(this.callId);
        sb.append(", peerJid: ");
        sb.append(this.peerJid);
        sb.append(", callState: ");
        sb.append(this.callState);
        return sb.toString();
    }

    public CallInfo(CallState callState2, String str, String str2, String str3, String str4, UserJid userJid, UserJid userJid2, UserJid userJid3, DeviceJid deviceJid, GroupJid groupJid2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, int i4, boolean z10, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.callState = callState2;
        this.callId = str;
        this.tsLogCallId = str2;
        this.relayCallUuid = str3;
        this.selfParticipantUuid = str4;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.creatorDeviceJid = deviceJid;
        this.groupJid = groupJid2;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.connectedLimit = i4;
        this.isJoinableGroupCall = z10;
        this.callLinkToken = str5;
        this.scheduledId = str6;
        this.isLightweight = z11;
        this.canRingAll = z12;
        this.isPhashBasedCall = z13;
        this.isBCall = z14;
        this.isBCallBroadcaster = z15;
        this.isBotCall = z16;
    }

    private void setCallLinkCreatorJid(UserJid userJid) {
        this.callLinkCreatorJid = userJid;
    }

    private void setCallLinkState(int i) {
        this.callLinkState = i;
    }

    private void setCallWaitingInfo(int i, String str, int i2, String[] strArr, GroupJid groupJid2, boolean z, boolean z2, int i3, boolean z3, CallLogInfo callLogInfo, boolean z4, String str2, boolean z5) {
        String str3 = str;
        GroupJid groupJid3 = groupJid2;
        CallLogInfo callLogInfo2 = callLogInfo;
        String str4 = str2;
        this.callWaitingInfo = new C56102gu(groupJid3, callLogInfo2, str3, str4, C22971Dz.A0A(UserJid.class, Arrays.asList(strArr)), i, i2, z, z4, z5);
    }

    public boolean canRingAll() {
        return this.canRingAll;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public UserJid getCallLinkCreatorJid() {
        return this.callLinkCreatorJid;
    }

    public int getCallLinkState() {
        return this.callLinkState;
    }

    public String getCallLinkToken() {
        return this.callLinkToken;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public CallState getCallState() {
        return this.callState;
    }

    public C56102gu getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedLimit() {
        return this.connectedLimit;
    }

    public DeviceJid getCreatorDeviceJid() {
        boolean isCallLinkLobbyOrJoiningState = isCallLinkLobbyOrJoiningState();
        DeviceJid deviceJid = this.creatorDeviceJid;
        if (!isCallLinkLobbyOrJoiningState) {
            C17960vV.A07(deviceJid);
        }
        return deviceJid;
    }

    public UserJid getCreatorJid() {
        boolean isCallLinkLobbyOrJoiningState = isCallLinkLobbyOrJoiningState();
        UserJid userJid = this.creatorJid;
        if (!isCallLinkLobbyOrJoiningState) {
            C17960vV.A07(userJid);
        }
        return userJid;
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public UserJid getInitialPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.initialPeerJid;
        C17960vV.A07(userJid);
        return userJid;
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.peerJid;
        C17960vV.A07(userJid);
        return userJid;
    }

    public String getRelayCallUuid() {
        return this.relayCallUuid;
    }

    public String getScheduledId() {
        return this.scheduledId;
    }

    public C134216qE getSelfInfo() {
        return this.self;
    }

    public String getSelfParticipantUuid() {
        return this.selfParticipantUuid;
    }

    public String getTSLogCallId() {
        return this.tsLogCallId;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isBCall() {
        return this.isBCall;
    }

    public boolean isBCallBroadcaster() {
        return this.isBCallBroadcaster;
    }

    public boolean isBotCall() {
        return this.isBotCall;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallOnHold() {
        if (!isCallLinkLobbyOrJoiningState() && !isInLonelyState()) {
            C134216qE r0 = this.self;
            if (r0 == null || !r0.A0F) {
                for (C134216qE r1 : this.participants.values()) {
                    if (r1.A0M || r1.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        C134216qE defaultPeerInfo = getDefaultPeerInfo();
        if (defaultPeerInfo == null || defaultPeerInfo.A08 != 3) {
            return false;
        }
        return true;
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    public void setCallDuration(long j) {
        this.callDuration = j;
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, boolean z7, boolean z8, boolean z9, boolean z10, int i4, int i5, int i6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i7, int i8, boolean z17, int i9, boolean z18, int i10) {
        boolean z19 = true;
        int i11 = i;
        if (i11 < 1 || (i11 > 7 && i11 != 11)) {
            z19 = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid participant state ");
        sb.append(i11);
        C17960vV.A0F(z19, sb.toString());
        boolean z20 = z7;
        int i12 = i3;
        boolean z21 = z6;
        int i13 = i2;
        boolean z22 = z5;
        boolean z23 = z4;
        boolean z24 = z3;
        boolean z25 = z2;
        boolean z26 = z;
        UserJid userJid2 = userJid;
        int i14 = i9;
        boolean z27 = z17;
        int i15 = i8;
        int i16 = i7;
        boolean z28 = z16;
        boolean z29 = z15;
        boolean z30 = z14;
        boolean z31 = z13;
        boolean z32 = z12;
        boolean z33 = z11;
        int i17 = i6;
        C134216qE r2 = new C134216qE(userJid2, i11, z26, z25, z24, z23, z22, i13, z21, i12, z20, z8, z9, z10, i4, i5, i17, z33, z32, z31, z30, z29, z28, i16, i15, z27, i14, z18, i10);
        this.participants.put(userJid2, r2);
        if (r2.A0M) {
            this.self = r2;
        }
    }
}
