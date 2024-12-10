package X;

/* renamed from: X.CaS  reason: case insensitive filesystem */
public final class C25176CaS {
    public final C18030ve A00;
    public final BWA A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25176CaS) && C18070vi.A18(this.A00, ((C25176CaS) obj).A00));
    }

    public int hashCode() {
        int A0I = AnonymousClass000.A0I(0);
        return ((((((((((((((((((((((AnonymousClass000.A0L(this.A00) + 1231) * 31) + 1237) * 31) + 1237) * 31) + 1231) * 31) + 1237) * 31) + 1237) * 31) + 48) * 31) + 1237) * 31) + 1237) * 31) + A0I) * 31) + A0I) * 31) + 1237;
    }

    public /* synthetic */ C25176CaS(C18030ve r2) {
        this.A00 = r2;
        this.A01 = new BWA(r2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExperimentConfiguration(abProps=");
        A10.append(this.A00);
        C108975cc.A16(A10, ", isRealTimeDisplayEncoderWarmUpDisabled=");
        C108975cc.A15(A10, ", useCTAudioProcessor=");
        C108975cc.A15(A10, ", audioEnhancementEnableWarmup=");
        C108975cc.A16(A10, ", isHandleOutViewLifecycleEnabled=");
        C108975cc.A15(A10, ", enableMediaAccuracyCapture=");
        C108975cc.A15(A10, ", enableMediaAccuracyAudioCapture=");
        A10.append(", mediaAccuracyCaptureTimestampsCsv=");
        A10.append("0");
        C108975cc.A15(A10, ", enableTextureAvailableRaceConditionFix=");
        C108975cc.A15(A10, ", enableRetryableMediaCompositionPlayer=");
        A10.append(", retryableMediaCompositionPlayerMaxRetries=");
        A10.append(0);
        A10.append(", retryableMediaCompositionPlayerErrorThresholdMs=");
        A10.append(0);
        A10.append(", enableOnTheFlyGlobalVolumeUpdate=");
        return C17900vP.A0F(A10, false);
    }
}
