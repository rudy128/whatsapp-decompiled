package com.whatsapp.voipcalling;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1DC;
import X.AnonymousClass1DD;
import X.AnonymousClass1HQ;
import X.AnonymousClass1VE;
import X.AnonymousClass71B;
import X.C146787Qp;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18140vp;
import X.C19830z4;
import X.C218617r;
import X.C219217x;
import X.C22971Dz;
import X.C24191Jf;
import X.C24521Kq;
import X.C40811vJ;
import X.C41371wF;
import X.C53072bw;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.areffects.arclass.ArClassManager;
import com.whatsapp.calling.audio.VoipSystemAudioManager;
import com.whatsapp.calling.util.VoipFaceDetector;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.io.File;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public final C18030ve abProps;
    public final AnonymousClass00H arClassManager;
    public final AnonymousClass71B bweMlModelManager;
    public final C218617r fMessageIO;
    public final C18140vp isPartialLandscapeModeSupported;
    public final C18140vp isVideoRotationSupportedProvider;
    public final AnonymousClass11S meManager;
    public int previousAudioSessionId = -1;
    public final C53072bw privacyCallRelaying;
    public final C18010vc sharedPreferencesFactory;
    public final AnonymousClass1DC systemFeatures;
    public final AnonymousClass11C systemServices;
    public final VoipCameraManager voipCameraManager;
    public final AnonymousClass1HQ voipNative;
    public final AnonymousClass1VE voipSharedPreferences;
    public final AnonymousClass00H voipSystemAudioManager;
    public final AnonymousClass118 waContext;
    public final AnonymousClass00H waDebugBuildSharedPreferences;
    public final C219217x waPermissionsHelper;
    public final C19830z4 waSharedPreferences;
    public final AnonymousClass10I waWorkers;

    public static int getSamplingHash(int i, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[(length + 4)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i2;
        iArr2[length + 1] = i;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i3;
        return Arrays.hashCode(iArr2);
    }

    private boolean isH265SwCodecSupported() {
        return false;
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), true, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i) {
        int[] iArr;
        int[] iArr2 = {16000, 48000, 44100, 22050, 8000, 11025, 32000, 24000, 12000};
        if (is48kHzAudioEnabled() || isRunAtNative()) {
            iArr = findAvailableAudioSamplingRate(iArr2, 2, -1);
        } else {
            iArr = findAvailableAudioSamplingRate(iArr2, 2, i);
        }
        return iArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r1.intValue() != 1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("BweMLModelManager/getBweMlModelPath/BWE ML model version not supported: ");
        r1.append(r7);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 != 1) goto L_0x0038;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getBweMLModelPath(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.71B r5 = r6.bweMlModelManager     // Catch:{ all -> 0x0087 }
            java.util.Map r1 = X.AnonymousClass71B.A36     // Catch:{ all -> 0x0087 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r1.get(r7)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0087 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0087 }
        L_0x0015:
            X.6tQ r1 = r5.A01     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "wa_bwe_pl_classifier_mobile"
            java.lang.String r3 = r1.A00(r0, r2)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x001f:
            java.lang.String r0 = "vid_rc.enable_ptedge_lib_loading"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A05(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "vid_rc.enable_executorch_lib_loading"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)     // Catch:{ all -> 0x0087 }
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            int r0 = r2.intValue()     // Catch:{ all -> 0x0087 }
            r2 = 1
            if (r0 == r3) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r1 == 0) goto L_0x0042
            int r1 = r1.intValue()     // Catch:{ all -> 0x0087 }
            r0 = 1
            if (r1 == r3) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            if (r0 == 0) goto L_0x0048
            r4 = 1
        L_0x0048:
            r3 = 0
            if (r4 == 0) goto L_0x0071
            X.0ve r2 = r5.A00     // Catch:{ all -> 0x0087 }
            r1 = 11454(0x2cbe, float:1.605E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0087 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0071
            int r2 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x005c }
            goto L_0x0015
        L_0x005c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "BweMLModelManager/getBweMlModelPath/BWE ML model version not supported: "
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            r1.append(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0087 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0071:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "BweMLModelManager/getBweMlModelPath/BWE ML model: should not skip hash check"
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            r1.append(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0087 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r6)
            return r3
        L_0x0087:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.getBweMLModelPath(java.lang.String):java.lang.String");
    }

    public int getCallAdminVersion() {
        return 1;
    }

    public boolean getCallLinkIsRemovable() {
        return true;
    }

    public int getNativeSamplingRate() {
        int i;
        String property;
        try {
            int i2 = AnonymousClass1VE.A00(this.voipSharedPreferences).getInt("audio_native_sampling_rate", -1);
            if (i2 >= 8000 && i2 <= 96000) {
                return i2;
            }
            AudioManager A0D = this.systemServices.A0D();
            if (A0D == null || (property = A0D.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) == null) {
                i = -1;
            } else {
                i = Integer.valueOf(property).intValue();
            }
            AnonymousClass1VE.A00(this.voipSharedPreferences).edit().putInt("audio_native_sampling_rate", i).apply();
            return i;
        } catch (Throwable th) {
            Log.e(th);
            return -1;
        }
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        H26xSupportResult h26xSupportResult;
        SharedPreferences A00 = AnonymousClass1VE.A00(this.voipSharedPreferences);
        if (!A00.contains("video_codec_h264_hw_supported") || !A00.contains("video_codec_h264_sw_supported") || !A00.contains("video_codec_h265_hw_supported") || !A00.contains("video_codec_h265_sw_supported")) {
            h26xSupportResult = null;
        } else {
            h26xSupportResult = new H26xSupportResult(A00.getBoolean("video_codec_h264_hw_supported", false), A00.getBoolean("video_codec_h264_sw_supported", false), A00.getBoolean("video_codec_h265_hw_supported", false), A00.getBoolean("video_codec_h265_sw_supported", false));
        }
        return h26xSupportResult;
    }

    public synchronized void updateH26XCodecSupported(boolean z) {
        if (z) {
            this.waWorkers.CGF(new C146787Qp(this, 12));
        } else {
            this.voipSharedPreferences.A07(isH26XCodecSupported());
        }
    }

    public void uploadCrashLog(String str) {
    }

    public boolean allowAlternativeNetworkForAudioCall() {
        if (((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false) || this.waSharedPreferences.A04() == 0) {
            return false;
        }
        return true;
    }

    public boolean allowAlternativeNetworkForVideoCall() {
        if (((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false) || (this.waSharedPreferences.A04() & 4) == 0) {
            return false;
        }
        return true;
    }

    public VoipFaceDetector createVoipFaceDetector(int i, boolean z) {
        if (C41371wF.A00(this.waContext.A00) == 0) {
            return VoipFaceDetector.create(this.waContext.A00, i, z);
        }
        return null;
    }

    public boolean disableGroupVideoCallReconnectingRingtone() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 9912);
    }

    public boolean disallowAllP2P() {
        C53072bw r3 = this.privacyCallRelaying;
        if (AnonymousClass1VE.A00(r3.A00).getBoolean("privacy_always_relay", false) || r3.A01.A00()) {
            return true;
        }
        return false;
    }

    public boolean enableOrientationScaleTypeChanges() {
        if (C18020vd.A00(C18040vf.A02, this.abProps, 3153) > 0) {
            return true;
        }
        return false;
    }

    public boolean geNewMinimizedBanner() {
        return C40811vJ.A0G(this.meManager, this.abProps);
    }

    public int getAiRtcFoundationVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 9427);
    }

    public boolean getAlwaysEnabledOrientationScaleTypeChanges() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 3975);
    }

    public int getAppExitReasonVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 8147);
    }

    public int getArClass() {
        return ((ArClassManager) this.arClassManager.get()).A00();
    }

    public int getAudioLevelSpeakingThreshold() {
        return Math.min(C18020vd.A00(C18040vf.A02, this.abProps, 1213), StringTreeSet.OFFSET_BASE_ENCODING);
    }

    public boolean getBoolValueByCode(int i) {
        return C18020vd.A05(C18040vf.A02, this.abProps, i);
    }

    public int getCallAudioShareVersion() {
        return C18020vd.A00(C18040vf.A02, ((AnonymousClass1DD) this.systemFeatures).A02, 6598);
    }

    public int getCallInfoManagerVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 8303);
    }

    public int getCallOfferRedialStatsVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 6709);
    }

    public int getCalleeOfferPeekTimeoutMs() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 5090);
    }

    public int getCallingLidVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 3358);
    }

    public int getCapiCallingAlphaVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4067);
    }

    public String getDebugDirectory() {
        this.fMessageIO.A08();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        this.waDebugBuildSharedPreferences.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        this.waDebugBuildSharedPreferences.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        this.waDebugBuildSharedPreferences.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        this.waDebugBuildSharedPreferences.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        this.waDebugBuildSharedPreferences.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        return false;
    }

    public int getDefaultEndpointThreadPollTimeout() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 11129);
    }

    public int getDisableReconnectingToneConnectedParticipantThreshold() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4211);
    }

    public boolean getEnableEarlyAudioDriverStart() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 12529);
    }

    public boolean getEnableJoinAndAcceptOngoingCall() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 5570);
    }

    public boolean getEnablePeekOfferCallIdCache() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 5323);
    }

    public boolean getEnableRingForGcOnOfferExpire() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 10103);
    }

    public float getFloatValueByCode(int i) {
        return this.abProps.A0F(C18040vf.A02, i);
    }

    public boolean getGcPreviousSegmentCallResult() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 12611);
    }

    public final String getGenAIManualPhoneNumber() {
        return C18020vd.A01(C18040vf.A02, this.abProps, 9624);
    }

    public int getGroupCallBufferParticipantThreshold() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 2251);
    }

    public int getGroupCallBufferProcessDelay() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 1092);
    }

    public int getHeartbeatIntervalS() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 1430);
    }

    public int getHeartbeatLonelyStateIntervalS() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 5486);
    }

    public boolean getIgnoreJoinableTerminateInAcceptSentState() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 10045);
    }

    public boolean getIgnoreJoinableTerminateInNonConnectedState() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 12189);
    }

    public boolean getIgnoreJoinableTerminateOnExpiredOffer() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 11519);
    }

    public boolean getIgnoreOneToOneTerminateInGroupCall() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 10273);
    }

    public int getIntValueByCode(int i) {
        return C18020vd.A00(C18040vf.A02, this.abProps, i);
    }

    public int getLandscapeModeVariant() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 3976);
    }

    public int getLightWeightCallingVersion() {
        if (this.meManager.A0N()) {
            return 0;
        }
        return C18020vd.A00(C18040vf.A02, this.abProps, 3362);
    }

    public int getLobbyTimeoutMin() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 1565);
    }

    public int getMaxGroupSizeForLongRingtone() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4710);
    }

    public int getMaxNumParticipantsForScreenSharing() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 3694);
    }

    public int getMinCallSizeForSSSpeakerRanking() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 7931);
    }

    public int getMissedCallFieldStatsBitmap() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 11067);
    }

    public int getOibweSlowPolling() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4382);
    }

    public int getRingForGcOnOfferExpireOption() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 12423);
    }

    public int getRingForGcOnOfferExpireTimeoutMs() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 12207);
    }

    public int getScreenShareOptions() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4218);
    }

    public int getScreenShareVersion() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 3171);
    }

    public int getSecurityFixesBitmap() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 3094);
    }

    public String getSelfLidJid() {
        Jid A09;
        boolean A0N = this.meManager.A0N();
        AnonymousClass11S r0 = this.meManager;
        if (A0N) {
            A09 = r0.A08();
        } else {
            A09 = r0.A09();
        }
        return C22971Dz.A06(A09);
    }

    public String getSelfPhoneJid() {
        Jid jid;
        boolean A0N = this.meManager.A0N();
        AnonymousClass11S r0 = this.meManager;
        if (A0N) {
            r0.A0I();
            jid = r0.A02;
        } else {
            r0.A0I();
            jid = r0.A0E;
        }
        return C22971Dz.A06(jid);
    }

    public int getSfuSecondaryRemoteBweImpl() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 11472);
    }

    public int getSignalingLatencySettings() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 5408);
    }

    public String getStringValueByCode(int i) {
        return C18020vd.A01(C18040vf.A02, this.abProps, i);
    }

    public final String getTimeSeriesDirectory() {
        File A06 = C40811vJ.A06(this.waContext.A00);
        if (A06 != null) {
            return A06.getAbsolutePath();
        }
        Log.e("getTimeSeriesDirectory base time series directory is null");
        return "";
    }

    public int getUpdateSpeakerStatusIntervalMs() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 1106);
    }

    public int getVidStreamPauseResumeJbResetThreshold() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 2642);
    }

    public int getVoiceChatRingAllMaxGroupSize() {
        return C18020vd.A00(C18040vf.A02, this.abProps, 4716);
    }

    public final String getVoipCacheDirectory() {
        String str;
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "voip");
            if (file.exists() || file.mkdirs()) {
                return file.getAbsolutePath();
            }
            str = "getVoipCacheDirectory could not init directory";
        } else {
            str = "getVoipCacheDirectory Cache Directory is null";
        }
        Log.e(str);
        return "";
    }

    public VoipSystemAudioManager getVoipSystemAudioManager() {
        return (VoipSystemAudioManager) this.voipSystemAudioManager.get();
    }

    public int getYearClass() {
        return C24191Jf.A02(this.systemServices, this.sharedPreferencesFactory);
    }

    public MediaCodecVideoEncoder initMediaCodecVideoEncoder() {
        return new MediaCodecVideoEncoder(this.voipSharedPreferences, this.systemFeatures);
    }

    public boolean is48kHzAudioEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 7255);
    }

    public boolean isAsyncCallWaitingEventEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 9210);
    }

    public boolean isCallStateMachineEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 4249);
    }

    public boolean isFixedVideoOrientationEnabled() {
        return ((Boolean) this.isVideoRotationSupportedProvider.get()).booleanValue();
    }

    public boolean isGroupCallBufferEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 1039);
    }

    public boolean isInitBweForGroupCallEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 2601);
    }

    public boolean isLowDataUsageEnabled() {
        return ((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false);
    }

    public boolean isMuteParticipantEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 1111);
    }

    public boolean isReportCallRepalyerIdAllowed() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 1834);
    }

    public boolean isRunAtNative() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 8689);
    }

    public boolean isScheduledCallEnabled() {
        return C40811vJ.A0W(this.abProps);
    }

    public boolean isSilentOfferEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 3235);
    }

    public boolean isVidQualityManagerEnabled() {
        return AnonymousClass1VE.A00(this.voipSharedPreferences).getBoolean("enable_vid_quality_manager", false);
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return C18020vd.A05(C18040vf.A02, this.voipSharedPreferences.A01, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public boolean isVideoRotationEnabled() {
        if (!((Boolean) this.isVideoRotationSupportedProvider.get()).booleanValue()) {
            if (!((Boolean) this.isPartialLandscapeModeSupported.get()).booleanValue()) {
                return false;
            }
            if (C18020vd.A00(C18040vf.A02, this.abProps, 3976) == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isVoipStanzaSmaxationEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 1520);
    }

    public boolean isWamCallExtendedEnabled() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 1939);
    }

    /* renamed from: lambda$updateH26XCodecSupported$0$com-whatsapp-voipcalling-JNIUtils  reason: not valid java name */
    public /* synthetic */ void m35lambda$updateH26XCodecSupported$0$comwhatsappvoipcallingJNIUtils() {
        this.voipSharedPreferences.A07(isH26XCodecSupported());
    }

    public boolean setNetworkInfoBeforeCaptureStart() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 11676);
    }

    public boolean shouldRemoveGroupInfoFromGroupCallExtensionOffer() {
        return C18020vd.A05(C18040vf.A02, this.abProps, 4899);
    }

    public JNIUtils(C18030ve r2, AnonymousClass11S r3, AnonymousClass118 r4, AnonymousClass10I r5, C218617r r6, AnonymousClass1HQ r7, AnonymousClass11C r8, AnonymousClass1DC r9, AnonymousClass71B r10, VoipCameraManager voipCameraManager2, AnonymousClass00H r12, C53072bw r13, AnonymousClass00H r14, C219217x r15, C19830z4 r16, AnonymousClass1VE r17, C18010vc r18, AnonymousClass00H r19, C18140vp r20, C18140vp r21) {
        this.abProps = r2;
        this.meManager = r3;
        this.waContext = r4;
        this.waWorkers = r5;
        this.fMessageIO = r6;
        this.voipNative = r7;
        this.arClassManager = r12;
        this.systemServices = r8;
        this.systemFeatures = r9;
        this.bweMlModelManager = r10;
        this.voipCameraManager = voipCameraManager2;
        this.privacyCallRelaying = r13;
        this.voipSystemAudioManager = r14;
        this.waPermissionsHelper = r15;
        this.waSharedPreferences = r16;
        this.voipSharedPreferences = r17;
        this.sharedPreferencesFactory = r18;
        this.waDebugBuildSharedPreferences = r19;
        this.isPartialLandscapeModeSupported = r20;
        this.isVideoRotationSupportedProvider = r21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1.equalsIgnoreCase("jfvelte") == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isH264HwCodecSupported() {
        /*
            r6 = this;
            boolean r0 = X.C39761tb.A04()
            r5 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "jflte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "jfvelte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_BOARD
            int r3 = r4.length
            r2 = 0
        L_0x0028:
            if (r2 >= r3) goto L_0x0037
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.BOARD
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0037:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_HARDWARE
            int r3 = r4.length
            r2 = 0
        L_0x003b:
            if (r2 >= r3) goto L_0x004a
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.HARDWARE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            java.lang.Boolean r0 = X.C17970vW.A03
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.isH264HwCodecSupported():boolean");
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    public boolean getOverrideIpConfigPreferIpv6() {
        return false;
    }

    public VoipCameraManager getVoipCameraManager() {
        return this.voipCameraManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r11 > 64000) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0223, code lost:
        if (r15 == null) goto L_0x0249;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0314 A[EDGE_INSN: B:151:0x0314->B:127:0x0314 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x038a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x013d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] findAvailableAudioSamplingRate(int[] r30, int r31, int r32) {
        /*
            r29 = this;
            java.lang.String r22 = ", audio source "
            java.lang.String r21 = ", buffer size "
            java.lang.String r20 = " works"
            java.lang.String r19 = " doesn't work"
            java.lang.String r18 = "voip/findAvailableAudioSamplingRate/sampling rate "
            r10 = r30
            int r9 = r10.length
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r9)
            r14 = 1
            int[] r3 = new int[r14]
            r5 = 0
            r0 = 16000(0x3e80, float:2.2421E-41)
            r3[r5] = r0
            r6 = r29
            X.17x r0 = r6.waPermissionsHelper
            boolean r0 = r0.A0E()
            r12 = 64000(0xfa00, float:8.9683E-41)
            r2 = 8000(0x1f40, float:1.121E-41)
            r11 = r32
            if (r0 != 0) goto L_0x0049
            if (r11 < r2) goto L_0x0035
            if (r11 > r12) goto L_0x0035
            int[] r3 = new int[r14]
            r3[r5] = r32
        L_0x0034:
            return r3
        L_0x0035:
            boolean r0 = r6.is48kHzAudioEnabled()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6.isRunAtNative()
            if (r0 != 0) goto L_0x0034
            int[] r3 = new int[r14]
            r0 = 44100(0xac44, float:6.1797E-41)
            r3[r5] = r0
            return r3
        L_0x0049:
            boolean r0 = r6.is48kHzAudioEnabled()
            if (r0 != 0) goto L_0x0363
            boolean r0 = r6.isRunAtNative()
            if (r0 != 0) goto L_0x0363
            r0 = 6
            r8 = r31
            int r5 = getSamplingHash(r0, r10, r8, r11)
            X.1VE r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r4 = "audio_sampling_hash"
            r0 = -1
            int r0 = r1.getInt(r4, r0)
            if (r5 != r0) goto L_0x00b5
            X.1VE r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r3 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r1 = "audio_sampling_rates"
            java.lang.String r0 = ""
            java.lang.String r13 = r3.getString(r1, r0)
            r15 = 0
            int[] r3 = new int[r15]
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00b1
            int r1 = r13.length()
            r0 = 2
            if (r1 <= r0) goto L_0x00b1
            int r1 = r1 - r14
            java.lang.String r1 = r13.substring(r14, r1)
            java.lang.String r0 = ","
            java.lang.String[] r14 = r1.split(r0)
            int r13 = r14.length
            int[] r1 = new int[r13]
        L_0x0097:
            if (r15 >= r13) goto L_0x00b0
            r0 = r14[r15]     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x00a8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            r1[r15] = r0     // Catch:{ NumberFormatException -> 0x00a8 }
            int r15 = r15 + 1
            goto L_0x0097
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipSharedPrefs/ "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00b1
        L_0x00b0:
            r3 = r1
        L_0x00b1:
            int r0 = r3.length
            if (r0 != r8) goto L_0x00b5
            return r3
        L_0x00b5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r9)
            r0 = -1
            if (r11 != r0) goto L_0x00ff
            int r2 = r6.getNativeSamplingRate()
        L_0x00c1:
            if (r2 <= 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sampling rate server setting("
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ") : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.add(r0)
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            if (r2 >= r9) goto L_0x0106
            r1 = r30[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.add(r0)
        L_0x00fc:
            int r2 = r2 + 1
            goto L_0x00e7
        L_0x00ff:
            if (r11 < r2) goto L_0x0104
            r2 = r11
            if (r11 <= r12) goto L_0x00c1
        L_0x0104:
            r2 = 0
            goto L_0x00c1
        L_0x0106:
            r0 = 4
            int[] r10 = new int[r0]
            r10 = {0, 1, 4, 5} // fill-array
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.add(r0)
            r2 = 4
            r1 = 0
        L_0x011b:
            if (r1 >= r2) goto L_0x0129
            r0 = r10[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x011b
        L_0x0129:
            java.util.Iterator r17 = r9.iterator()
        L_0x012d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0314
            java.lang.Object r2 = r17.next()
            java.lang.Number r2 = (java.lang.Number) r2
            java.util.Iterator r16 = r3.iterator()
        L_0x013d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x030e
            java.lang.Object r1 = r16.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r10 = r1.intValue()
            r9 = 16
            r0 = 2
            int r9 = android.media.AudioRecord.getMinBufferSize(r10, r9, r0)     // Catch:{ IllegalArgumentException -> 0x0288, all -> 0x0282 }
            r0 = -2
            if (r9 == r0) goto L_0x026b
            int r24 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            int r28 = r9 * 2
            r26 = 16
            r27 = 2
            android.media.AudioRecord r23 = new android.media.AudioRecord     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r25 = r10
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            int r11 = r23.getState()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r0 = 1
            if (r11 != r0) goto L_0x0251
            int r12 = r23.getAudioSessionId()     // Catch:{ all -> 0x0245 }
            r6.previousAudioSessionId = r12     // Catch:{ all -> 0x0245 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0245 }
            r11.<init>()     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ recorder session id "
            r11.append(r0)     // Catch:{ all -> 0x0245 }
            r11.append(r12)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0245 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0245 }
            X.1VE r0 = r6.voipSharedPreferences     // Catch:{ all -> 0x0245 }
            r24 = r0
            int r0 = r6.previousAudioSessionId     // Catch:{ all -> 0x0245 }
            android.content.SharedPreferences r13 = X.AnonymousClass1VE.A00(r24)     // Catch:{ all -> 0x0245 }
            java.lang.String r11 = "aec_os_version"
            r12 = 0
            java.lang.String r14 = r13.getString(r11, r12)     // Catch:{ all -> 0x0245 }
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0245 }
            boolean r14 = r13.equals(r14)     // Catch:{ all -> 0x0245 }
            if (r14 != 0) goto L_0x0249
            boolean r14 = com.whatsapp.voipcalling.Voip.A08()     // Catch:{ all -> 0x0245 }
            r15 = 0
            if (r14 == 0) goto L_0x0229
            android.media.audiofx.AcousticEchoCanceler r15 = android.media.audiofx.AcousticEchoCanceler.create(r0)     // Catch:{ all -> 0x0217 }
            if (r15 == 0) goto L_0x0249
            android.media.audiofx.AudioEffect$Descriptor r12 = r15.getDescriptor()     // Catch:{ all -> 0x0217 }
            if (r12 == 0) goto L_0x0225
            java.util.UUID r14 = r12.uuid     // Catch:{ all -> 0x0217 }
            if (r14 == 0) goto L_0x0225
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            r13.<init>()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "voip/AcousticEchoCanceler implementor:"
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r12.implementor     // Catch:{ all -> 0x0217 }
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " uuid:"
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            r13.append(r14)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " enabled:"
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            boolean r0 = r15.getEnabled()     // Catch:{ all -> 0x0217 }
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " hasControl:"
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            boolean r0 = r15.hasControl()     // Catch:{ all -> 0x0217 }
            r13.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0217 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r14 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0217 }
            java.util.UUID r0 = r12.uuid     // Catch:{ all -> 0x0217 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0217 }
            java.lang.String r12 = r12.implementor     // Catch:{ all -> 0x0217 }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r24)     // Catch:{ all -> 0x0217 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0217 }
            android.content.SharedPreferences$Editor r11 = r0.putString(r11, r14)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r13)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r11.putString(r0, r12)     // Catch:{ all -> 0x0217 }
            r0.apply()     // Catch:{ all -> 0x0217 }
            goto L_0x0225
        L_0x0217:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x021c }
            goto L_0x0223
        L_0x021c:
            r0 = move-exception
            if (r15 == 0) goto L_0x0222
            r15.release()     // Catch:{ all -> 0x0245 }
        L_0x0222:
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x0223:
            if (r15 == 0) goto L_0x0249
        L_0x0225:
            r15.release()     // Catch:{ all -> 0x0245 }
            goto L_0x0249
        L_0x0229:
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r24)     // Catch:{ all -> 0x0245 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0245 }
            android.content.SharedPreferences$Editor r11 = r0.putString(r11, r13)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r11.putString(r0, r12)     // Catch:{ all -> 0x0245 }
            r0.apply()     // Catch:{ all -> 0x0245 }
            goto L_0x0249
        L_0x0245:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IllegalArgumentException -> 0x024e, all -> 0x0296 }
        L_0x0249:
            r23.release()     // Catch:{ IllegalArgumentException -> 0x024e, all -> 0x0296 }
            goto L_0x02d3
        L_0x024e:
            r11 = move-exception
            r13 = 1
            goto L_0x028d
        L_0x0251:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ Recorder state "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            int r0 = r23.getState()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            goto L_0x0280
        L_0x026b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ can not find min buffer size for rate "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            r11.append(r10)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x028b, all -> 0x0285 }
        L_0x0280:
            r13 = 0
            goto L_0x02d4
        L_0x0282:
            r12 = move-exception
            r9 = 0
            goto L_0x0286
        L_0x0285:
            r12 = move-exception
        L_0x0286:
            r13 = 0
            goto L_0x0298
        L_0x0288:
            r11 = move-exception
            r9 = 0
            goto L_0x028c
        L_0x028b:
            r11 = move-exception
        L_0x028c:
            r13 = 0
        L_0x028d:
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ "
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0294 }
            goto L_0x02d4
        L_0x0294:
            r12 = move-exception
            goto L_0x0298
        L_0x0296:
            r12 = move-exception
            r13 = 1
        L_0x0298:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r0 = r18
            r11.append(r0)
            r11.append(r10)
            r0 = r19
            if (r13 == 0) goto L_0x02ab
            r0 = r20
        L_0x02ab:
            r11.append(r0)
            r0 = r21
            r11.append(r0)
            int r0 = r9 * 2
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x038a
            r7.add(r1)
            int r0 = r7.size()
            if (r0 < r8) goto L_0x038a
            goto L_0x030e
        L_0x02d3:
            r13 = 1
        L_0x02d4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r0 = r18
            r11.append(r0)
            r11.append(r10)
            r0 = r19
            if (r13 == 0) goto L_0x02e7
            r0 = r20
        L_0x02e7:
            r11.append(r0)
            r0 = r21
            r11.append(r0)
            int r0 = r9 * 2
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x013d
            r7.add(r1)
            int r0 = r7.size()
            if (r0 < r8) goto L_0x013d
        L_0x030e:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x012d
        L_0x0314:
            java.util.Collections.sort(r7)
            int r2 = r7.size()
            int[] r3 = new int[r2]
            r1 = 0
        L_0x031e:
            if (r1 >= r2) goto L_0x032f
            java.lang.Object r0 = r7.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x031e
        L_0x032f:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0338
            r0 = -1
            r6.previousAudioSessionId = r0
        L_0x0338:
            if (r2 <= 0) goto L_0x0034
            X.1VE r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r5)
            r0.apply()
            X.1VE r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "audio_sampling_rates"
            java.lang.String r0 = java.util.Arrays.toString(r3)
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
            r0.apply()
            return r3
        L_0x0363:
            int r4 = r6.getNativeSamplingRate()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "preferred native sampling rate is "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 < r2) goto L_0x0034
            if (r4 > r12) goto L_0x0034
            boolean r0 = r6.isRunAtNative()
            if (r0 == 0) goto L_0x038b
            int[] r0 = new int[r14]
            r0[r5] = r4
            return r0
        L_0x038a:
            throw r12
        L_0x038b:
            r0 = 2
            int[] r3 = new int[r0]
            r0 = 16000(0x3e80, float:2.2421E-41)
            r3[r5] = r0
            r3[r14] = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }
}
