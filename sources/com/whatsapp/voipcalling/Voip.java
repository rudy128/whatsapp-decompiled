package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C218617r;
import X.C22971Dz;
import X.C40811vJ;
import android.graphics.Bitmap;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.calling.callbacks.DataChannelCallback;
import com.whatsapp.calling.crypto.CryptoCallback;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;

public final class Voip {
    public static CryptoCallback A00;
    public static final SimpleDateFormat A01 = AnonymousClass8BS.A0q("yyyyMMddHHmmss");
    public static volatile SignalingXmppCallback A02;

    public enum DebugTapType {
        RECEIVED_AND_DECODED,
        CAPTURED_AND_POST_PROCESSED,
        OUTGOING_ENCODED,
        RAW_CAPTURED,
        RAW_PLAYBACK
    }

    public class JidHelper {
        public static Jid getNullable(String str) {
            return Jid.Companion.A02(str);
        }

        public static UserJid convertToUserJid(Jid jid) {
            if (C22971Dz.A0d(jid)) {
                return (UserJid) jid;
            }
            if (jid instanceof DeviceJid) {
                return ((DeviceJid) jid).userJid;
            }
            return null;
        }

        public static int getAgent(Jid jid) {
            return jid.getAgent();
        }

        public static int getDevice(Jid jid) {
            return jid.getDevice();
        }

        public static String getDomain(Jid jid) {
            return jid.getServer();
        }

        public static String getIdentifier(Jid jid) {
            return jid.user;
        }

        public static int getType(Jid jid) {
            return jid.getType();
        }
    }

    public static native void acceptCall();

    public static native void acceptCallWithVideoStopped();

    public static native int acceptVideoUpgrade();

    public static native void adjustAudioLevel(int i);

    public static native int cancelInviteToGroupCall(UserJid userJid);

    public static native int cancelServerReminder(String str, GroupJid groupJid);

    public static native int cancelVideoUpgrade(int i);

    public static native void checkOngoingCalls(String[] strArr, DeviceJid[] deviceJidArr);

    public static native void cleanupUnfinishedCallStats();

    public static native void clearVoipParam(String str);

    public static native int createCallLink(boolean z, long j);

    public static native boolean dumpLastVideoFrame(UserJid userJid, Bitmap bitmap);

    public static native int editCallLink(String str, boolean z, long j);

    public static native void endCall(boolean z, int i);

    public static native void endCallAndAcceptPendingCall(String str);

    public static native void endCallAndAcceptPendingCallWithVideoStopped(String str);

    public static native long getCallDuration();

    public static native CallInfo getCallInfo();

    public static native CallLinkInfo getCallLinkInfo();

    public static native String getCurrentCallId();

    public static native int getCurrentCallLinkState();

    public static native int getCurrentCallState();

    public static native CallState getCurrentCallStateEnum();

    public static native UserJid getPeerJid();

    public static native WamCall getUnfinishedCallEvent(JNIUtils jNIUtils);

    public static native String getVoipParam(String str);

    public static native String getVoipParamForCall(String str, String str2);

    public static native int groupCallBufferProcessMessages();

    public static native void handleIncomingTerminatePush(String str);

    public static native int invite(CallParticipantJid[] callParticipantJidArr, boolean z);

    public static native int inviteToGroupCall(CallParticipantJid callParticipantJid);

    public static native int joinCallLink();

    public static native int joinOngoingCall(String str, UserJid userJid, DeviceJid deviceJid, boolean z, CallParticipantJid[] callParticipantJidArr, boolean z2, GroupJid groupJid, int i, String str2, String str3, boolean z3, boolean z4, String str4);

    public static native void muteCall(boolean z);

    public static native int nativeHandleIncomingSignalingXmpp(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native int nativeHandleIncomingSignalingXmppAck(Jid jid, String str, int i, VoipStanzaChildNode[] voipStanzaChildNodeArr);

    public static native int nativeHandleIncomingSignalingXmppReceipt(Jid jid, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeHandleIncomingXmppOffer(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, int i3, int i4);

    public static native int nativeParseXmppOffer(CallOfferInfo[] callOfferInfoArr, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(VoipEventCallback voipEventCallback);

    public static native int nativeRegisterJNIUtils(JNIUtils jNIUtils);

    public static native void nativeRegisterMultiNetworkCallback(MultiNetworkCallback multiNetworkCallback);

    public static native void nativeRegisterSignalingXmppCallback(SignalingXmppCallback signalingXmppCallback);

    public static native void nativeUnregisterCryptoCallback();

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterJNIUtils();

    public static native void nativeUnregisterMultiNetworkCallback();

    public static native void nativeUnregisterSignalingXmppCallback();

    public static native void notifyAudioRouteChange(int i);

    public static native void notifyDeviceIdentityChanged(DeviceJid deviceJid);

    public static native void notifyDeviceIdentityDeleted(DeviceJid deviceJid);

    public static native int notifyFailureToCreateAlternativeSocket(boolean z);

    public static native int notifyLostOfAlternativeNetwork();

    public static native void onCallInterrupted(boolean z, boolean z2);

    public static native int peekIncomingOffer(String str, DeviceJid deviceJid, DeviceJid deviceJid2, boolean z, long j, long j2, boolean z2);

    public static native int previewCallLink(String str, boolean z, boolean z2);

    public static native void processPipModeChange(boolean z);

    public static native int refreshCaptureDevice();

    public static native int refreshVideoDevice();

    public static native void registerDataChannelCallback(DataChannelCallback dataChannelCallback);

    public static native void rejectCall(String str, String str2, int i);

    public static native void rejectCallWithoutCallContext(String str, boolean z, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, int i, int i2);

    public static native void rejectPendingCall(String str);

    public static native int rejectVideoUpgrade(int i);

    public static native int requestVideoUpgrade();

    public static native void resendOfferOnDecryptionFailure(DeviceJid deviceJid, String str);

    public static native void sendDTMFTone(String str);

    public static native int sendMutePeerRequestInGroupCall(UserJid userJid);

    public static native void sendRekeyRequest(DeviceJid deviceJid, int i);

    public static native int sendRemoveUserRequest(UserJid userJid);

    public static native int sendWaveToVoiceChat(CallParticipantJid callParticipantJid);

    public static native int setAsyncCaptureFailed();

    public static native int setBatteryState(float f, float f2, boolean z);

    public static native int setCallInfoManagerVersion(int i);

    public static native void setCallLowDataUsage(boolean z);

    public static native void setEnableAudioEffectAvailabilityCache(boolean z);

    public static native boolean setEnableFixedVideoOrientation(boolean z);

    public static native int setScreenSize(int i, int i2);

    public static native int setServerReminder(String str, GroupJid groupJid, long j);

    public static native int setVideoDisplayPort(UserJid userJid, VideoPort videoPort);

    public static native int setVideoPreviewPort(VideoPort videoPort);

    public static native int setVideoPreviewSize(int i, int i2);

    public static native int setVoipStackLogLevel(int i);

    public static native int startCall(String str, CallParticipantJid[] callParticipantJidArr, boolean z, GroupJid groupJid, boolean z2, String str2, boolean z3, boolean z4, String str3, int i, boolean z5, boolean z6, boolean z7, boolean z8, String[] strArr, String[] strArr2, UserJid userJid);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native int startTestNetworkConditionWithAlternativeSocket(int i, String str, int i2);

    public static native void startVideoCaptureStream();

    public static native void startVideoRenderStream(UserJid userJid);

    public static native boolean stopCallRecording();

    public static native void stopVideoCaptureStream(boolean z, boolean z2);

    public static native void stopVideoRenderStream(UserJid userJid);

    public static native int switchCamera();

    public static native int switchNetworkWithAlternativeSocket(int i, String str, int i2);

    public static native void timeoutPendingCall(String str);

    public static native int toggleToHammerheadDev(boolean z);

    public static native int turnCameraOff();

    public static native int turnCameraOn();

    public static native int turnScreenShareOff();

    public static native int turnScreenShareOn();

    public static native void updateNetworkMedium(int i, int i2);

    public static native void updateNetworkRestrictions(boolean z);

    public static native int updateParticipantsRxSubscription(UserJid[] userJidArr);

    public static native void videoDeviceAndDisplayOrientationChanged(int i, int i2, boolean z);

    public class RecordingInfo {
        public final File outputFile;
        public OutputStream outputStream;

        public RecordingInfo(C218617r r6, DebugTapType debugTapType) {
            String str;
            int ordinal = debugTapType.ordinal();
            if (ordinal == 1) {
                str = "record.processed";
            } else if (ordinal == 2) {
                str = "record.encoded";
            } else if (ordinal == 0) {
                str = "received.decoded";
            } else if (ordinal == 3) {
                str = "record.raw";
            } else if (ordinal == 4) {
                str = "playback.raw";
            } else {
                throw AnonymousClass000.A0n(AnonymousClass001.A1E(debugTapType, "unknown debug tap type: ", AnonymousClass000.A10()));
            }
            String A0r = AnonymousClass8BU.A0r(Voip.A01, System.currentTimeMillis());
            r6.A08();
            StringBuilder A11 = AnonymousClass000.A11(A0r);
            A11.append(".");
            A11.append(str);
            File A0X = AnonymousClass8BW.A0X((File) null, ".wav.gz", A11);
            this.outputFile = A0X;
            try {
                this.outputStream = new GZIPOutputStream(new FileOutputStream(A0X, true));
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.outputStream = null;
            }
        }

        public File getOutputFile() {
            return this.outputFile;
        }

        public OutputStream getOutputStream() {
            return this.outputStream;
        }
    }

    public static CallState A03(C18030ve r2) {
        try {
            if (!C18020vd.A05(C18040vf.A02, r2, 9386)) {
                return getCurrentCallStateEnum();
            }
            int currentCallState = getCurrentCallState();
            switch (currentCallState) {
                case 0:
                    return CallState.NONE;
                case 1:
                    return CallState.CALLING;
                case 2:
                    return CallState.PRE_ACCEPT_RECEIVED;
                case 3:
                    return CallState.RECEIVED_CALL;
                case 4:
                    return CallState.ACCEPT_SENT;
                case 5:
                    return CallState.ACCEPT_RECEIVED;
                case 6:
                    return CallState.ACTIVE;
                case 9:
                    return CallState.REJOINING;
                case 10:
                    return CallState.LINK;
                case 11:
                    return CallState.CONNECTED_LONELY;
                case 12:
                    return CallState.PRECALLING;
                case 13:
                    return CallState.ENDING;
                case 14:
                    return CallState.BCALL_STARTING;
                default:
                    C17960vV.A0F(false, AnonymousClass001.A1I("unknown call state: ", AnonymousClass000.A10(), currentCallState));
                    return CallState.NONE;
            }
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return CallState.NONE;
        }
    }

    public static String A06(int i) {
        if (i == 0) {
            return "kAudOutputDefault";
        }
        if (i == 1) {
            return "kAudOutputSpeaker";
        }
        if (i == 2) {
            return "kAudOutputEarpiece";
        }
        if (i == 3) {
            return "kAudOutputBluetooth";
        }
        if (i == 4) {
            return "kAudOutputHeadset";
        }
        C17960vV.A0F(false, "UNKNOWN AudioRoute");
        return "UNKNOWN AudioRoute";
    }

    public static boolean A0A(CallState callState) {
        if (callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
            return true;
        }
        return false;
    }

    public static boolean A0B(CallState callState) {
        if (callState == null) {
            return false;
        }
        if (A0A(callState) || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }

    public static AcousticEchoCanceler A00(int i, boolean z) {
        if (!A08()) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AcousticEchoCanceler create = AcousticEchoCanceler.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A0h(create, "voip/hackBuiltInAec/enabled ", A10, i3);
                    C17900vP.A0j(" with previous session id ", A10, i);
                    return create;
                }
                i2++;
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/hackBuiltInAec/failed previousAudioSessionId = ");
        A102.append(i);
        C17900vP.A0j(", range = ", A102, 50);
        return null;
    }

    public static AutomaticGainControl A01(int i, boolean z) {
        boolean z2;
        try {
            z2 = AutomaticGainControl.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AutomaticGainControl create = AutomaticGainControl.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A0h(create, "voip/hackBuiltInAgc/enabled ", A10, i3);
                    C17900vP.A0j(" with previous session id ", A10, i);
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/hackBuiltInAgc/failed previousAudioSessionId = ");
        A102.append(i);
        C17900vP.A0j(", range = ", A102, 50);
        return null;
    }

    public static NoiseSuppressor A02(int i, boolean z) {
        boolean z2;
        try {
            z2 = NoiseSuppressor.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                NoiseSuppressor create = NoiseSuppressor.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A0h(create, "voip/hackBuiltInNs/enabled ", A10, i3);
                    C17900vP.A0j(" with previous session id ", A10, i);
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/hackBuiltInNs/failed previousAudioSessionId = ");
        A102.append(i);
        C17900vP.A0j(", range = ", A102, 50);
        return null;
    }

    public static Boolean A04(String str) {
        Integer A05 = A05(str);
        if (A05 != null) {
            return Boolean.valueOf(AnonymousClass000.A1O(A05.intValue()));
        }
        return null;
    }

    public static Integer A05(String str) {
        String A07 = A07(str);
        if (A07 == null || A07.isEmpty()) {
            C17900vP.A0f("No value found for param ", str, AnonymousClass000.A10());
            return null;
        }
        try {
            return Integer.valueOf(A07);
        } catch (NumberFormatException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Wrong format for param ");
            A10.append(str);
            C17900vP.A0h(", value ", A07, A10, e);
            return null;
        }
    }

    public static String A07(String str) {
        String voipParam = getVoipParam(str);
        if (voipParam == null || voipParam.isEmpty()) {
            return null;
        }
        return voipParam;
    }

    public static boolean A08() {
        try {
            return AcousticEchoCanceler.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            return false;
        }
    }

    public static boolean A09(CallInfo callInfo, String str) {
        if (!C40811vJ.A0e(callInfo) || !TextUtils.equals(str, callInfo.callId)) {
            return false;
        }
        return true;
    }
}
