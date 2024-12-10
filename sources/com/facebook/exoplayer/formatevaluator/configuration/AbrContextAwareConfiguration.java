package com.facebook.exoplayer.formatevaluator.configuration;

import X.AnonymousClass000;
import X.AnonymousClass1YE;
import X.C108975cc;
import X.C18070vi;
import X.C24295Bys;
import X.C27060DRg;
import X.C3D;
import X.C3R;
import X.C72473Md;
import X.CRF;
import android.net.ConnectivityManager;

public final class AbrContextAwareConfiguration {
    public final C27060DRg abrSetting;
    public final C3R connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final CRF playbackPreferences;

    public final int getHighBwRiskConfPct(C24295Bys bys) {
        int i;
        int i2;
        int i3;
        C18070vi.A0d(bys, 0);
        if (this.isLive) {
            C24295Bys bys2 = C24295Bys.ULTRA_LOW_LATENCY;
            C27060DRg dRg = this.abrSetting;
            if (bys == bys2) {
                return dRg.liveHighBwRiskConfPctUltraLowLatency;
            }
            return dRg.liveHighBwRiskConfPct;
        } else if (this.isBackgroundPrefetch && (i3 = this.abrSetting.backgroundPrefetchHighBwRiskConfPct) > 0) {
            return i3;
        } else {
            if (this.isSponsored) {
                C27060DRg dRg2 = this.abrSetting;
                int i4 = dRg2.adHighBwRiskConfPct;
                if (i4 > 0) {
                    return i4;
                }
                if (this.isPrefetch) {
                    i2 = dRg2.adHighBwRiskConfPctPrefetch;
                } else {
                    i2 = dRg2.adHighBwRiskConfPctOnScreen;
                }
                if (i2 > 0) {
                    return i2;
                }
            }
            if (!this.isPrefetch || !this.enableForegroundPrefetchQualityExperimentation || (i = this.abrSetting.foregroundPrefetchHighBwRiskConfPct) <= 0) {
                return this.abrSetting.highBwRiskConfPct;
            }
            return i;
        }
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, C24295Bys bys) {
        int i2;
        C18070vi.A0d(bys, 1);
        if (bys != C24295Bys.ULTRA_LOW_LATENCY || (i2 = this.abrSetting.ultraLowLatencyAdjustedLowestQualityIndex) < 0) {
            return i - 1;
        }
        return Math.min(i2, i - 1);
    }

    public final double getRiskAdjFactor(boolean z, C24295Bys bys) {
        C18070vi.A0d(bys, 1);
        boolean z2 = this.isLive;
        if (z) {
            C27060DRg dRg = this.abrSetting;
            if (z2) {
                return dRg.liveAudioRiskAdjFactor;
            }
            return dRg.audioRiskAdjFactor;
        } else if (!z2) {
            return this.abrSetting.riskAdjFactor;
        } else {
            if (bys == C24295Bys.LOW_LATENCY) {
                return this.abrSetting.liveUserLowLatencyRiskAdjFactor;
            }
            C24295Bys bys2 = C24295Bys.ULTRA_LOW_LATENCY;
            C27060DRg dRg2 = this.abrSetting;
            if (bys == bys2) {
                return dRg2.liveUserUltraLowLatencyRiskAdjFactor;
            }
            return dRg2.liveRiskAdjFactor;
        }
    }

    public final double getSystemicRiskFactor(boolean z, C24295Bys bys) {
        C18070vi.A0d(bys, 1);
        boolean z2 = this.isLive;
        if (z) {
            C27060DRg dRg = this.abrSetting;
            if (z2) {
                return dRg.liveSystemicRiskAudioFactor;
            }
            return dRg.systemicRiskAudioFactor;
        } else if (!z2) {
            if (this.isIGClips) {
                double d = this.abrSetting.systemRiskFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskFactor;
        } else if (bys == C24295Bys.LOW_LATENCY) {
            return this.abrSetting.liveUserLowLatencySystemicRiskFactor;
        } else {
            C24295Bys bys2 = C24295Bys.ULTRA_LOW_LATENCY;
            C27060DRg dRg2 = this.abrSetting;
            if (bys == bys2) {
                return dRg2.liveUserUltraLowLatencySystemicRiskFactor;
            }
            return dRg2.liveSystemicRiskFactor;
        }
    }

    public final double getVirtualBufferPercent(C24295Bys bys) {
        C18070vi.A0d(bys, 0);
        if (bys == C24295Bys.LOW_LATENCY) {
            return this.abrSetting.liveLSBVirtualBufferPercent;
        }
        if (bys == C24295Bys.ULTRA_LOW_LATENCY) {
            return this.abrSetting.liveULSBVirtualBufferPercent;
        }
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveVirtualBufferPercent;
        }
        return dRg.virtualBufferPercent;
    }

    public final boolean isSystemicRiskIBR(boolean z, C3D c3d) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return !dRg.liveSystemicRiskAudioEnableABR;
        }
        if (dRg.systemicRiskAudioEnableABR && c3d != null) {
            throw AnonymousClass000.A0s("isAudioAbrEligible");
        }
    }

    public final boolean shouldUseServerSideBWE(C24295Bys bys) {
        C18070vi.A0d(bys, 0);
        if (this.isLive) {
            if (bys == C24295Bys.ULTRA_LOW_LATENCY) {
                return this.abrSetting.useSSBweForUltraLowLatency;
            }
            if (bys == C24295Bys.LOW_LATENCY) {
                return this.abrSetting.useSSBweForLowLatency;
            }
            if (bys == C24295Bys.REGULAR_LATENCY) {
                return this.abrSetting.useSSBweForRegularLatency;
            }
        }
        return false;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveEnableInitialBitrateBoosterByNetworkQuality;
        }
        return dRg.enableInitialBitrateBoosterByNetworkQuality;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveInitialBitrateBoosterByNetworkQuality;
        }
        return dRg.initialBitrateBoosterByNetworkQuality;
    }

    public final boolean enableAndroidAPIBitrate() {
        return this.abrSetting.enableAndroidAPIBitrate;
    }

    public final boolean enableConfRiskBwCache() {
        return this.abrSetting.enableConfRiskBwCache;
    }

    public final boolean enableMosOverride() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.enableMosOverrideLive;
        }
        return dRg.enableMosOverride;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        if (this.isLive || !z || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCacheOverride;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        if (this.isLive || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCachePrefetchOverride;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean enableXPlatBweParity() {
        return this.abrSetting.enableXPlatBweParity;
    }

    public final long getAbrDurationForIntentional() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAbrDurationForIntentional;
        }
        return dRg.abrDurationForIntentional;
    }

    public final boolean getAllowAbrUpToWatchableMosInLowBuffer() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAllowAbrUpToWatchableMosInLowBuffer;
        }
        return dRg.allowAbrUpToWatchableMosInLowBuffer;
    }

    public final boolean getAllowAudioFormatsLowerThanDefault() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAllowAudioFormatsLowerThanDefault;
        }
        return dRg.allowAudioFormatsLowerThanDefault;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return this.abrSetting.androidBandwidthFallbackNumberOfSamples;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitIntentionalKbps;
        }
        return 0;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitUnintentionalKbps;
        }
        return 0;
    }

    public final float getAudioBandwidthFraction() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAudioBandwidthFractionCell;
        }
        return dRg.audioBandwidthFractionCell;
    }

    public final int getAudioMaxInitialBitrate() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAudioMaxInitialBitrate;
        }
        return dRg.audioMaxInitialBitrate;
    }

    public final float getAudioPrefetchBandwidthFraction() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAudioPrefetchBandwidthFraction;
        }
        return dRg.audioPrefetchBandwidthFraction;
    }

    public final boolean getAvoidUsingDefaultQualityForIdealWhenNoBWEstimate() {
        return this.abrSetting.liveAvoidUseDefault;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return this.abrSetting.bwWeightLimitForBWEDampening;
    }

    public final float getBandwidthMultiplier() {
        boolean z;
        CRF crf = this.playbackPreferences;
        synchronized (crf) {
            z = crf.A03;
        }
        if (!z || !this.isIGStory) {
            return 1.0f;
        }
        return this.abrSetting.bandwidthMultiplier;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsSponsoredVerticalVideos;
    }

    public final boolean getBypassWidthLimitsStories() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStories;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStoriesPrefetch;
    }

    public final ConnectivityManager getConnectivityManager() {
        return null;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    public final int getDefaultBwRiskConfPct() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveDefaultBwRiskConfPct;
        }
        return dRg.defaultBwRiskConfPct;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return this.abrSetting.dropRenderFrameRatioForPreventAbrUp;
    }

    public final boolean getEnableBsrV2Definition() {
        return this.abrSetting.enableBsrV2Definition;
    }

    public final boolean getEnableCdnBandwidthRestriction() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableCdnBandwidthRestriction;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableSegmentBitrate;
    }

    public final boolean getEnableVodPrefetchQSFix() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableVodPrefetchQSFix;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return this.abrSetting.forceCurrentNoWatchableFormatFrameDrop;
    }

    public final float getFrameDropFactor() {
        return this.abrSetting.frameDropFactor;
    }

    public final boolean getHashUrlForUnique() {
        return this.abrSetting.hashUrlForUnique;
    }

    public final int getHighBufferBandwidthConfPct() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveHighBufferBandwidthConfidencePct;
        }
        return dRg.highBufferBandwidthConfidencePct;
    }

    public final double getHighOrBetterMosThreshold() {
        return this.abrSetting.highOrBetterMosThreshold;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return this.abrSetting.honorDefaultBandwidthSR;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.initSegmentBandwidthExclusionLimitBytes;
    }

    public final float getLambdaFallingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveLambdaFallingBufferConfidenceCalculator;
        }
        return dRg.lambdaFallingBufferConfidenceCalculator;
    }

    public final float getLambdaRisingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveLambdaRisingBufferConfidenceCalculator;
        }
        return dRg.lambdaRisingBufferConfidenceCalculator;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAbrLatencyBasedAbrTargetBufferSizeMs;
        }
        return dRg.latencyBasedTargetBufferSizeMs;
    }

    public final int getLiveDefaultMaxWidth() {
        return this.abrSetting.liveAbrDefaultMaxWidthCell;
    }

    public final int getLowBufferBandwidthConfPct() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveLowBufferBandwidthConfidencePct;
        }
        return dRg.lowBufferBandwidthConfidencePct;
    }

    public final int getLowWatermarkMs() {
        if (this.isLive) {
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    public final float getMainProcessBitrateMultiplier() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMainProcessBitrateEstimateMultiplier;
        }
        return dRg.mainProcessBitrateEstimateMultiplier;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMABwDown;
        }
        return dRg.maxAlphaLowPassEMABwDown;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMABwUp;
        }
        return dRg.maxAlphaLowPassEMABwUp;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMABwVol;
        }
        return dRg.maxAlphaLowPassEMABwVol;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMATtfbDown;
        }
        return dRg.maxAlphaLowPassEMATtfbDown;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMATtfbUp;
        }
        return dRg.maxAlphaLowPassEMATtfbUp;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxAlphaLowPassEMATtfbVol;
        }
        return dRg.maxAlphaLowPassEMATtfbVol;
    }

    public final float getMaxBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxBandwidthMultiplier;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMaxBandwidthMultiplier;
        }
        return dRg.maxBandwidthMultiplier;
    }

    public final long getMaxBufferedDurationFallingBufferMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            if (z2) {
                i = dRg.liveStoriesMaxBufferedDurationMsFallingBuffer;
            } else {
                i = dRg.liveMaxBufferedDurationMsFallingBuffer;
            }
        } else if (z2) {
            i = dRg.storiesMaxBufferedDurationMsFallingBuffer;
        } else {
            i = dRg.maxBufferedDurationMsFallingBuffer;
        }
        return (long) i;
    }

    public final long getMaxDurationForQualityDecreaseMs() {
        int i;
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            i = dRg.liveMaxDurationForQualityDecreaseMs;
        } else {
            i = dRg.maxDurationForQualityDecreaseMs;
        }
        return (long) i;
    }

    public final int getMaxInitialBitrate() {
        int i;
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            i = dRg.liveInitialBitrate;
        } else {
            i = dRg.maxInitialBitrate;
        }
        return (int) (((double) i) * 1.0d);
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return this.abrSetting.maxNumberSmallBwSamplesIgnored;
    }

    public final float getMaxTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxTTFBMultiplier;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMaxTTFBMultiplier;
        }
        return dRg.maxTTFBMultiplier;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxWidthCell;
        }
        return dRg.maxWidthCell;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveMaxWidthInlinePlayer;
        }
        return dRg.maxWidthInlinePlayer;
    }

    public final int getMaxWidthSphericalVideo() {
        return this.abrSetting.maxWidthSphericalVideo;
    }

    public final int getMaxWidthToPrefetch() {
        boolean z;
        if (this.abrSetting.bypassPrefetchWidthLimits) {
            return Integer.MAX_VALUE;
        }
        CRF crf = this.playbackPreferences;
        synchronized (crf) {
            z = crf.A02;
        }
        if (z) {
            return this.abrSetting.maxWidthSphericalVideo;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return dRg.liveMaxWidthToPrefetchCell;
        }
        return dRg.maxWidthToPrefetchAbrCell;
    }

    public final float getMinBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinBandwidthMultiplier;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMinBandwidthMultiplier;
        }
        return dRg.minBandwidthMultiplier;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.minBufferedDurationMsForMosAwareCache;
    }

    public final long getMinDurationForHighBWQualityIncreaseMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            if (z2) {
                i = dRg.liveStoriesMinDurationForHighBWQualityIncreaseMs;
            } else {
                i = dRg.liveMinDurationForHighBWQualityIncreaseMs;
            }
        } else if (z2) {
            i = dRg.storiesMinDurationForHighBWQualityIncreaseMs;
        } else {
            i = dRg.minDurationForHighBWQualityIncreaseMs;
        }
        return (long) i;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return this.abrSetting.minFramesDropForPreventAbrUp;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return this.abrSetting.minFramesRenderedForPreventAbrUp;
    }

    public final int getMinMosConstraintLimit() {
        return this.abrSetting.minMosConstraintLimit;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMinMosForCachedQuality;
        }
        return dRg.minMosForCachedQuality;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.minOverallMosForABR;
    }

    public final float getMinPartiallyCachedSpan() {
        return this.abrSetting.minPartiallyCachedSpan;
    }

    public final float getMinTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinTTFBMultiplier;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMinTTFBMultiplier;
        }
        return dRg.minTTFBMultiplier;
    }

    public final int getMinWatchableMos() {
        int i;
        if (!this.isIGClips || (i = this.abrSetting.igClipsMinWatchableMos) <= 0) {
            return this.abrSetting.minWatchableMos;
        }
        return i;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return this.abrSetting.minWidthMultiplierFrameDrop;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.modBwRiskConfPct;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.modOverallMosForABR;
    }

    public final int getMosDiffPctForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.storiesMosDiffPctForCachedQuality;
        }
        return dRg.mosDiffPctForCachedQuality;
    }

    public final float getMosPrefetchFractionByNetworkQuality() {
        return this.abrSetting.mosPrefetchFractionByNetworkQuality;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return this.abrSetting.personalizedAggressiveStallDuration;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedBWRiskConfPctAggressive;
        }
        return dRg.personalizedBWRiskConfPctAggressive;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedBWRiskConfPctConservative;
        }
        return dRg.personalizedBWRiskConfPctConservative;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedBWRiskConfPctNormal;
        }
        return dRg.personalizedBWRiskConfPctNormal;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedBWRiskConfPctVeryAggressive;
        }
        return dRg.personalizedBWRiskConfPctVeryAggressive;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedBWRiskConfPctVeryConservative;
        }
        return dRg.personalizedBWRiskConfPctVeryConservative;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return this.abrSetting.personalizedConservativeStallDuration;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedRiskMultiplierAggressive;
        }
        return dRg.personalizedRiskMultiplierAggressive;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedRiskMultiplierConservative;
        }
        return dRg.personalizedRiskMultiplierConservative;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedRiskMultiplierVeryAggressive;
        }
        return dRg.personalizedRiskMultiplierVeryAggressive;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedRiskMultiplierVeryConservative;
        }
        return dRg.personalizedRiskMultiplierVeryConservative;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return this.abrSetting.personalizedVeryAggressiveStallDuration;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePersonalizedVirtualBufferPercent;
        }
        return dRg.personalizedVirtualBufferPercent;
    }

    public final CRF getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final int getPredictiveABRDownBufferMs() {
        return this.abrSetting.livePredictiveABRDownBufferMs;
    }

    public final int getPredictiveABRMaxSingleCycleDepletionMs() {
        return this.abrSetting.livePredictiveABRMaxSingleCycleDepletionMs;
    }

    public final float getPredictiveABRTtfbRatio() {
        return this.abrSetting.livePredictiveABRTtfbRatio;
    }

    public final int getPredictiveABRUpBufferMs() {
        return this.abrSetting.livePredictiveABRUpBufferMs;
    }

    public final boolean getPredictiveABRUpOnLiveHead() {
        return this.abrSetting.livePredictiveABRUpOnLiveHead;
    }

    public final int getPredictiveABRUpRetryIntervalMs() {
        return this.abrSetting.livePredictiveABRUpRetryIntervalMs;
    }

    public final float getPrefetchDurationMultiplier() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePrefetchDurationMultiplier;
        }
        return dRg.vodPrefetchDurationMultiplier;
    }

    public final int getPrefetchLongQueueBandwidthConfPct() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePrefetchLongQueueBandwidthConfidencePct;
        }
        return dRg.prefetchLongQueueBandwidthConfidencePct;
    }

    public final float getPrefetchLongQueueBandwidthFraction() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAbrPrefetchLongQueueBandwidthFraction;
        }
        return dRg.prefetchLongQueueBandwidthFraction;
    }

    public final int getPrefetchLongQueueSizeThreshold() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAbrPrefetchLongQueueSizeThreshold;
        }
        return dRg.prefetchLongQueueSizeThreshold;
    }

    public final int getPrefetchShortQueueBandwidthConfPct() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.livePrefetchShortQueueBandwidthConfidencePct;
        }
        return dRg.prefetchShortQueueBandwidthConfidencePct;
    }

    public final float getPrefetchShortQueueBandwidthFraction() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveAbrPrefetchShortQueueBandwidthFraction;
        }
        return dRg.prefetchShortQueueBandwidthFraction;
    }

    public final int getRiskRewardRatioBufferLimitMs() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveRiskRewardRatioBufferLimitMs;
        }
        return dRg.riskRewardRatioBufferLimitMs;
    }

    public final float getRiskRewardRatioLowerBound() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveRiskRewardRatioLowerBound;
        }
        return dRg.riskRewardRatioLowerBound;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return this.abrSetting.liveRiskRewardRatioUpperBound;
        }
        if (this.isStory) {
            float f = this.abrSetting.riskRewardRatioUpperBoundSfv;
            if (((double) f) > 0.0d) {
                return f;
            }
        }
        return this.abrSetting.riskRewardRatioUpperBound;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveScreenWidthMultiplierLandscapeVideo;
        }
        return dRg.screenWidthMultiplierLandscapeVideo;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveScreenWidthMultiplierPortraitVideo;
        }
        return dRg.screenWidthMultiplierPortraitVideo;
    }

    public final boolean getServerSideForwardBwe() {
        if (this.isLive) {
            return this.abrSetting.serverSideForwardBwe;
        }
        return false;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveShouldAvoidOnCellular;
        }
        return dRg.enableAvoidOnCellular;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return this.abrSetting.shouldCountFirstChunkOnly;
    }

    public final boolean getShouldEnableAudioIbr() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveEnableAudioIbrEvaluator;
        }
        return dRg.enableAudioIbrEvaluator;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveEnableAudioIbrCache;
        }
        return dRg.enableAudioIbrCache;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return this.abrSetting.enableBwOnlyEstimationForLongPoll;
    }

    public final boolean getShouldEnableMultiAudioSupport() {
        return this.abrSetting.enableMultiAudioSupport;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return this.abrSetting.enableTtfbOnlyEstimation;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return this.abrSetting.treatShortFormAsStories;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return this.abrSetting.shouldUseServerSideGoodput;
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.skipCachedAsCurrent;
    }

    public final double getSmartCacheOverrideThreshold() {
        return this.abrSetting.smartCacheOverrideThreshold;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return this.abrSetting.smartCacheOverridePrefetchThreshold;
    }

    public final float getSoftMinMosBandwidthFractionForAbrSelector() {
        return this.abrSetting.softMinMosBandwidthFractionForAbrSelector;
    }

    public final float getSoftMinMosForAbrSelector() {
        return this.abrSetting.softMinMosForAbrSelector;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeAcrossVideosMs;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeMs;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveSystemicRiskAvgSegmentDurationMs;
        }
        return dRg.systemicRiskAvgSegmentDurationMs;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return dRg.liveSystemicRiskAudioBitrateBoostFactor;
        }
        return dRg.systemicRiskAudioBitrateBoostFactor;
    }

    public final boolean getSystemicRiskEnable(boolean z) {
        boolean z2;
        boolean z3 = this.isLive;
        if (z) {
            C27060DRg dRg = this.abrSetting;
            if (z3) {
                return dRg.liveSystemicRiskAudioEnable;
            }
            return dRg.systemicRiskAudioEnable;
        }
        if (z3) {
            C27060DRg dRg2 = this.abrSetting;
            if (!dRg2.systemicRiskEnable) {
                return false;
            }
            z2 = dRg2.liveSystemicRiskEnable;
        } else {
            boolean z4 = this.isStory;
            C27060DRg dRg3 = this.abrSetting;
            boolean z5 = dRg3.systemicRiskEnable;
            if (!z4) {
                return z5;
            }
            if (!z5) {
                return false;
            }
            z2 = dRg3.systemicRiskEnableForStories;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return dRg.liveSystemicRiskAudioEnableDynOtherBitrate;
        }
        return dRg.systemicRiskAudioEnableDynOtherBitrate;
    }

    public final boolean getSystemicRiskEnableForPrefetch() {
        return this.abrSetting.systemicRiskEnableForPrefetch;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            C27060DRg dRg = this.abrSetting;
            if (z2) {
                return dRg.liveSystemicRiskAudioLowMosFactor;
            }
            return dRg.systemicRiskAudioLowMosFactor;
        } else if (z2) {
            return this.abrSetting.liveSystemicRiskLowMosFactor;
        } else {
            if (this.isIGClips) {
                double d = this.abrSetting.systemicRiskLowMosFactorForIgClips;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.systemicRiskLowMosFactor;
        }
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveSystemicRiskMaxLookaheadDurationMs;
        }
        return dRg.systemicRiskMaxLookaheadDurationMs;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.systemicRiskModMosFactor;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return dRg.liveSystemicRiskAudioOtherBitrate;
        }
        return dRg.systemicRiskAudioOtherBitrate;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return this.abrSetting.ttfbWeightLimitForBWEDampening;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveTreatCurrentNullAsLowBuffer;
        }
        return dRg.treatCurrentNullAsLowBuffer;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return this.abrSetting.ttfbMsecWithServerSideGoodput;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return this.abrSetting.useDefaultFormatAsBackupForScreenWidthConstraints;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.usePlaybackCsvqm;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.usePlaybackMosForLowMosABR;
    }

    public final boolean getUseUnifiedUploadMos() {
        return this.abrSetting.useUnifiedUploadMos;
    }

    public final int getVeryHighBufferDurationMsForBandwidthBoost() {
        boolean z;
        if (this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG >= 0) {
            CRF crf = this.playbackPreferences;
            synchronized (crf) {
                z = crf.A03;
            }
            if (z && this.isIGStory) {
                return this.abrSetting.veryHighBufferDurationMsForBandwidthBoostIG;
            }
        }
        if (this.isLive) {
            return -1;
        }
        return this.abrSetting.veryHighBufferDurationMsForBandwidthBoost;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        return false;
    }

    public final boolean overrideCacheWhenHighMos() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMos) {
            return false;
        }
        return true;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        if (!this.isStory || !this.abrSetting.overrideCacheWhenHighMosForPrefetch) {
            return false;
        }
        return true;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        if (this.isLive) {
            return this.abrSetting.alwaysPlayLiveCachedData;
        }
        return false;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.shouldEnableAvoidOnABR;
    }

    public final boolean shouldDeleteNonSR() {
        return this.abrSetting.shouldDeleteNonSR;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return this.abrSetting.shouldDeprecateLiveInitialABR;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.removeCDNResponseTimeForLongPoll;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return this.abrSetting.shouldLogInbandTelemetryBweDebugString;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldSelectIntermediateFormatRiskRewardBased() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveSelectIntermediateFormatRiskRewardBased;
        }
        return dRg.selectIntermediateFormatRiskRewardBased;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.useLogarithmicRisk;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveShouldUseLowPassEMAAsymmetryForBWEstimation;
        }
        return dRg.shouldUseLowPassEMAAsymmetryForBWEstimation;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveShouldUseLowPassEMAForBWEstimation;
        }
        return dRg.shouldUseLowPassEMAForBWEstimation;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveShouldUseLowPassWithWeightedEMAForBWEstimation;
        }
        return dRg.shouldUseLowPassWithWeightedEMAForBWEstimation;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useMosAwareCachedSelection;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z2) {
            return dRg.liveUseRiskRewardRatio;
        }
        return dRg.useRiskRewardRatio;
    }

    public final boolean updateFormatsWithIntentionChange() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveUpdateFormatsWithIntentionChange;
        }
        return dRg.updateFormatsWithIntentionChange;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForABRIfLower;
        }
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForAOCIfLower;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useOverallMosForABR;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveUsePersonalizedBWRiskConfPcts;
        }
        return dRg.usePersonalizedBWRiskConfPcts;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveUsePersonalizedRiskMultipliers;
        }
        return dRg.usePersonalizedRiskMultipliers;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        boolean z = this.isLive;
        C27060DRg dRg = this.abrSetting;
        if (z) {
            return dRg.liveUsePersonalizedVirtualBuffer;
        }
        return dRg.usePersonalizedVirtualBuffer;
    }

    public AbrContextAwareConfiguration(C27060DRg dRg, C3R c3r, CRF crf, boolean z, boolean z2) {
        String str;
        String str2;
        boolean z3;
        boolean z4;
        C72473Md.A1I(dRg, crf);
        this.abrSetting = dRg;
        this.connectivityManagerHolder = c3r;
        this.playbackPreferences = crf;
        this.isLive = z;
        synchronized (crf) {
            str = crf.A00;
        }
        synchronized (crf) {
            str2 = crf.A01;
        }
        boolean z5 = false;
        if ("fb_stories".equalsIgnoreCase(str) || (this.abrSetting.treatShortFormAsStories && ("fb_shorts_viewer".equalsIgnoreCase(str2) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(str2)))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isStory = z3;
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(str);
        this.isIGClips = str != null ? AnonymousClass1YE.A0A(C108975cc.A0d(str), "clips_viewer_", false) : z5;
        synchronized (crf) {
        }
        this.isThumbnail = false;
        synchronized (crf) {
            z4 = crf.A03;
        }
        this.isSponsored = z4;
        synchronized (crf) {
        }
        this.isBackgroundPrefetch = false;
        this.enableForegroundPrefetchQualityExperimentation = false;
        this.isPrefetch = z2;
    }
}
