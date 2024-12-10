package com.whatsapp.fieldstats.events;

import X.AnonymousClass184;
import X.AnonymousClass186;
import X.C107425Zq;
import X.C18070vi;
import X.C18180vt;
import java.util.LinkedHashMap;
import java.util.Map;

public final class WamJoinableCall extends AnonymousClass184 {
    public Long acceptAckLatencyMs;
    public String callRandomId;
    public String callReplayerId;
    public Integer callSide;
    public Boolean groupAcceptNoCriticalGroupUpdate;
    public Long groupAcceptToCriticalGroupUpdateMs;
    public Boolean hasScheduleExactAlarmPermission;
    public Boolean hasSpamDialog;
    public Boolean isCallFull;
    public Boolean isEventsLink;
    public Boolean isFromCallLink;
    public Boolean isLidCall;
    public Boolean isLinkCreator;
    public Boolean isLinkJoin;
    public Boolean isLinkedGroupCall;
    public Boolean isPendingCall;
    public Boolean isPhashBased;
    public Boolean isPhashMismatch;
    public Boolean isRejoin;
    public Boolean isRering;
    public Boolean isScheduledCall;
    public Boolean isUpgradedGroupCallBeforeConnected;
    public Boolean isVoiceChat;
    public Long joinAckLatencyMs;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Long lobbyAckLatencyMs;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Long lobbyOpenDurationMs;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Boolean nseEnabled;
    public Long nseOfflineQueueMs;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Long numOutgoingRingingPeers;
    public Long queryAckLatencyMs;
    public Long randomScheduledId;
    public Boolean receivedByNse;
    public Boolean rejoinMissingDbMapping;
    public Long timeSinceAcceptMs;
    public Long timeSinceLastClientPollMinutes;
    public Boolean videoEnabled;

    public WamJoinableCall() {
        super(2572, new C18180vt(1, 1, 1, false), 0, -1);
    }

    public static /* synthetic */ void getCallSide$annotations() {
    }

    public static /* synthetic */ void getLegacyCallResult$annotations() {
    }

    public static /* synthetic */ void getLobbyEntryPoint$annotations() {
    }

    public static /* synthetic */ void getLobbyExit$annotations() {
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(23, this.acceptAckLatencyMs);
        r3.CHf(1, this.callRandomId);
        r3.CHf(31, this.callReplayerId);
        r3.CHf(41, this.callSide);
        r3.CHf(37, this.groupAcceptNoCriticalGroupUpdate);
        r3.CHf(38, this.groupAcceptToCriticalGroupUpdateMs);
        r3.CHf(42, this.hasScheduleExactAlarmPermission);
        r3.CHf(26, this.hasSpamDialog);
        r3.CHf(30, this.isCallFull);
        r3.CHf(50, this.isEventsLink);
        r3.CHf(32, this.isFromCallLink);
        r3.CHf(45, this.isLidCall);
        r3.CHf(39, this.isLinkCreator);
        r3.CHf(33, this.isLinkJoin);
        r3.CHf(24, this.isLinkedGroupCall);
        r3.CHf(14, this.isPendingCall);
        r3.CHf(46, this.isPhashBased);
        r3.CHf(48, this.isPhashMismatch);
        r3.CHf(3, this.isRejoin);
        r3.CHf(8, this.isRering);
        r3.CHf(40, this.isScheduledCall);
        r3.CHf(47, this.isUpgradedGroupCallBeforeConnected);
        r3.CHf(43, this.isVoiceChat);
        r3.CHf(34, this.joinAckLatencyMs);
        r3.CHf(16, this.joinableAcceptBeforeLobbyAck);
        r3.CHf(9, this.joinableDuringCall);
        r3.CHf(17, this.joinableEndCallBeforeLobbyAck);
        r3.CHf(6, this.legacyCallResult);
        r3.CHf(19, this.lobbyAckLatencyMs);
        r3.CHf(2, this.lobbyEntryPoint);
        r3.CHf(4, this.lobbyExit);
        r3.CHf(5, this.lobbyExitNackCode);
        r3.CHf(49, this.lobbyOpenDurationMs);
        r3.CHf(18, this.lobbyQueryWhileConnected);
        r3.CHf(7, this.lobbyVisibleT);
        r3.CHf(27, this.nseEnabled);
        r3.CHf(28, this.nseOfflineQueueMs);
        r3.CHf(13, this.numConnectedPeers);
        r3.CHf(12, this.numInvitedParticipants);
        r3.CHf(20, this.numOutgoingRingingPeers);
        r3.CHf(35, this.queryAckLatencyMs);
        r3.CHf(44, this.randomScheduledId);
        r3.CHf(29, this.receivedByNse);
        r3.CHf(22, this.rejoinMissingDbMapping);
        r3.CHf(36, this.timeSinceAcceptMs);
        r3.CHf(21, this.timeSinceLastClientPollMinutes);
        r3.CHf(10, this.videoEnabled);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(23, this.acceptAckLatencyMs);
        linkedHashMap.put(1, this.callRandomId);
        linkedHashMap.put(31, this.callReplayerId);
        linkedHashMap.put(41, this.callSide);
        linkedHashMap.put(37, this.groupAcceptNoCriticalGroupUpdate);
        linkedHashMap.put(38, this.groupAcceptToCriticalGroupUpdateMs);
        linkedHashMap.put(42, this.hasScheduleExactAlarmPermission);
        linkedHashMap.put(26, this.hasSpamDialog);
        linkedHashMap.put(30, this.isCallFull);
        linkedHashMap.put(50, this.isEventsLink);
        linkedHashMap.put(32, this.isFromCallLink);
        linkedHashMap.put(45, this.isLidCall);
        linkedHashMap.put(39, this.isLinkCreator);
        linkedHashMap.put(33, this.isLinkJoin);
        linkedHashMap.put(24, this.isLinkedGroupCall);
        linkedHashMap.put(14, this.isPendingCall);
        linkedHashMap.put(46, this.isPhashBased);
        linkedHashMap.put(48, this.isPhashMismatch);
        linkedHashMap.put(3, this.isRejoin);
        linkedHashMap.put(8, this.isRering);
        linkedHashMap.put(40, this.isScheduledCall);
        linkedHashMap.put(47, this.isUpgradedGroupCallBeforeConnected);
        linkedHashMap.put(43, this.isVoiceChat);
        linkedHashMap.put(34, this.joinAckLatencyMs);
        linkedHashMap.put(16, this.joinableAcceptBeforeLobbyAck);
        linkedHashMap.put(9, this.joinableDuringCall);
        linkedHashMap.put(17, this.joinableEndCallBeforeLobbyAck);
        linkedHashMap.put(6, this.legacyCallResult);
        linkedHashMap.put(19, this.lobbyAckLatencyMs);
        linkedHashMap.put(2, this.lobbyEntryPoint);
        linkedHashMap.put(4, this.lobbyExit);
        linkedHashMap.put(5, this.lobbyExitNackCode);
        linkedHashMap.put(49, this.lobbyOpenDurationMs);
        linkedHashMap.put(18, this.lobbyQueryWhileConnected);
        linkedHashMap.put(7, this.lobbyVisibleT);
        linkedHashMap.put(27, this.nseEnabled);
        linkedHashMap.put(28, this.nseOfflineQueueMs);
        linkedHashMap.put(13, this.numConnectedPeers);
        linkedHashMap.put(12, this.numInvitedParticipants);
        linkedHashMap.put(20, this.numOutgoingRingingPeers);
        linkedHashMap.put(35, this.queryAckLatencyMs);
        linkedHashMap.put(44, this.randomScheduledId);
        linkedHashMap.put(29, this.receivedByNse);
        linkedHashMap.put(22, this.rejoinMissingDbMapping);
        linkedHashMap.put(36, this.timeSinceAcceptMs);
        linkedHashMap.put(21, this.timeSinceLastClientPollMinutes);
        linkedHashMap.put(10, this.videoEnabled);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        StringBuilder sb = new StringBuilder();
        sb.append("WamJoinableCall {");
        AnonymousClass186.A00(this.acceptAckLatencyMs, "acceptAckLatencyMs", sb);
        AnonymousClass186.A00(this.callRandomId, "callRandomId", sb);
        AnonymousClass186.A00(this.callReplayerId, "callReplayerId", sb);
        Integer num = this.callSide;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "callSide", sb);
        AnonymousClass186.A00(this.groupAcceptNoCriticalGroupUpdate, "groupAcceptNoCriticalGroupUpdate", sb);
        AnonymousClass186.A00(this.groupAcceptToCriticalGroupUpdateMs, "groupAcceptToCriticalGroupUpdateMs", sb);
        AnonymousClass186.A00(this.hasScheduleExactAlarmPermission, "hasScheduleExactAlarmPermission", sb);
        AnonymousClass186.A00(this.hasSpamDialog, "hasSpamDialog", sb);
        AnonymousClass186.A00(this.isCallFull, "isCallFull", sb);
        AnonymousClass186.A00(this.isEventsLink, "isEventsLink", sb);
        AnonymousClass186.A00(this.isFromCallLink, "isFromCallLink", sb);
        AnonymousClass186.A00(this.isLidCall, "isLidCall", sb);
        AnonymousClass186.A00(this.isLinkCreator, "isLinkCreator", sb);
        AnonymousClass186.A00(this.isLinkJoin, "isLinkJoin", sb);
        AnonymousClass186.A00(this.isLinkedGroupCall, "isLinkedGroupCall", sb);
        AnonymousClass186.A00(this.isPendingCall, "isPendingCall", sb);
        AnonymousClass186.A00(this.isPhashBased, "isPhashBased", sb);
        AnonymousClass186.A00(this.isPhashMismatch, "isPhashMismatch", sb);
        AnonymousClass186.A00(this.isRejoin, "isRejoin", sb);
        AnonymousClass186.A00(this.isRering, "isRering", sb);
        AnonymousClass186.A00(this.isScheduledCall, "isScheduledCall", sb);
        AnonymousClass186.A00(this.isUpgradedGroupCallBeforeConnected, "isUpgradedGroupCallBeforeConnected", sb);
        AnonymousClass186.A00(this.isVoiceChat, "isVoiceChat", sb);
        AnonymousClass186.A00(this.joinAckLatencyMs, "joinAckLatencyMs", sb);
        AnonymousClass186.A00(this.joinableAcceptBeforeLobbyAck, "joinableAcceptBeforeLobbyAck", sb);
        AnonymousClass186.A00(this.joinableDuringCall, "joinableDuringCall", sb);
        AnonymousClass186.A00(this.joinableEndCallBeforeLobbyAck, "joinableEndCallBeforeLobbyAck", sb);
        Integer num2 = this.legacyCallResult;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        AnonymousClass186.A00(obj2, "legacyCallResult", sb);
        AnonymousClass186.A00(this.lobbyAckLatencyMs, "lobbyAckLatencyMs", sb);
        Integer num3 = this.lobbyEntryPoint;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        AnonymousClass186.A00(obj3, "lobbyEntryPoint", sb);
        Integer num4 = this.lobbyExit;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        AnonymousClass186.A00(obj4, "lobbyExit", sb);
        AnonymousClass186.A00(this.lobbyExitNackCode, "lobbyExitNackCode", sb);
        AnonymousClass186.A00(this.lobbyOpenDurationMs, "lobbyOpenDurationMs", sb);
        AnonymousClass186.A00(this.lobbyQueryWhileConnected, "lobbyQueryWhileConnected", sb);
        AnonymousClass186.A00(this.lobbyVisibleT, "lobbyVisibleT", sb);
        AnonymousClass186.A00(this.nseEnabled, "nseEnabled", sb);
        AnonymousClass186.A00(this.nseOfflineQueueMs, "nseOfflineQueueMs", sb);
        AnonymousClass186.A00(this.numConnectedPeers, "numConnectedPeers", sb);
        AnonymousClass186.A00(this.numInvitedParticipants, "numInvitedParticipants", sb);
        AnonymousClass186.A00(this.numOutgoingRingingPeers, "numOutgoingRingingPeers", sb);
        AnonymousClass186.A00(this.queryAckLatencyMs, "queryAckLatencyMs", sb);
        AnonymousClass186.A00(this.randomScheduledId, "randomScheduledId", sb);
        AnonymousClass186.A00(this.receivedByNse, "receivedByNse", sb);
        AnonymousClass186.A00(this.rejoinMissingDbMapping, "rejoinMissingDbMapping", sb);
        AnonymousClass186.A00(this.timeSinceAcceptMs, "timeSinceAcceptMs", sb);
        AnonymousClass186.A00(this.timeSinceLastClientPollMinutes, "timeSinceLastClientPollMinutes", sb);
        AnonymousClass186.A00(this.videoEnabled, "videoEnabled", sb);
        sb.append("}");
        String obj5 = sb.toString();
        C18070vi.A0X(obj5);
        return obj5;
    }
}
