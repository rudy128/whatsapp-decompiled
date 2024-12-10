package com.facebook.video.heroplayer.service;

import X.C18070vi;
import X.C24790CKj;
import X.C24993CSt;
import X.C25018CTu;
import X.C25238CbZ;
import X.C26205Cuc;
import X.C27066DRp;
import X.C28409E0a;
import X.C28570E8b;
import X.C3T;
import X.CA4;
import X.CA6;
import X.D40;
import X.D48;
import X.D49;
import X.DGM;
import X.E1O;
import X.E1P;

public final class LiveLatencyManager {
    public static final CA6 Companion = new Object();
    public final E1O debugEventLogger;
    public final C26205Cuc exoPlayer;
    public final C25018CTu heroDependencies;
    public final C27066DRp heroPlayerSetting;
    public final C24790CKj liveJumpRateLimiter;
    public final C3T liveLatencySelector;
    public final C24993CSt liveLowLatencyDecisions;
    public final C25238CbZ request;
    public final CA4 rewindableVideoMode;
    public final E1P traceLogger;

    public final String getCurrentLatencyConfigName() {
        return null;
    }

    public final String getLiveVideoCommentQuality() {
        return null;
    }

    public final int getStreamLatencyToggleState() {
        return -1;
    }

    public final C28570E8b getTransferListener() {
        return null;
    }

    public final boolean isBufferingStartedBySeek() {
        return false;
    }

    public final boolean isBufferingStoppedBySeekAndClear() {
        return false;
    }

    public final void maybeChangePlaybackSpeed(long j) {
    }

    public final boolean maybeSetDynamicLoadCursorPosition() {
        return false;
    }

    public final void maybeUpdateStreamLatencyModePIDValues() {
    }

    public final void notifyBufferingStarted(D49 d49, D40 d40, boolean z) {
    }

    public final void notifyBufferingStopped(D49 d49, D40 d40, boolean z) {
    }

    public final void notifyLiveStateChanged(D40 d40) {
    }

    public final void notifyPaused(D49 d49) {
    }

    public final void onDownstreamFormatChange(D48 d48) {
    }

    public final void refreshPlayerState(D49 d49) {
    }

    public final void setBandwidthMeter(C28409E0a e0a) {
    }

    public final void setLiveLowLatencyOptimization(boolean z) {
    }

    public final void setPlaybackSpeed(float f) {
    }

    public final void setStreamLatencyMode(int i) {
    }

    public final boolean useToggleOverride() {
        return false;
    }

    public LiveLatencyManager(C27066DRp dRp, C26205Cuc cuc, CA4 ca4, C25238CbZ cbZ, C24993CSt cSt, C24790CKj cKj, C25018CTu cTu, DGM dgm, C3T c3t, E1P e1p, E1O e1o) {
        C18070vi.A0w(dRp, cuc, ca4, cbZ, cSt);
        C18070vi.A0l(cKj, cTu);
        C18070vi.A0d(c3t, 9);
        C18070vi.A0d(e1o, 11);
        this.heroPlayerSetting = dRp;
        this.exoPlayer = cuc;
        this.rewindableVideoMode = ca4;
        this.request = cbZ;
        this.liveLowLatencyDecisions = cSt;
        this.liveJumpRateLimiter = cKj;
        this.heroDependencies = cTu;
        this.liveLatencySelector = c3t;
        this.traceLogger = e1p;
        this.debugEventLogger = e1o;
    }
}
