package com.whatsapp.audioRecording;

import X.AnonymousClass000;
import X.AnonymousClass001;

public final class NoiseMetrics {
    public final float avgLoudnessDiffNoiseFrames;
    public final float avgLoudnessDiffSpeechFrames;
    public final float avgLoudnessOutputNoiseFrames;
    public final float avgLoudnessOutputSpeechFrames;

    public final float component1() {
        return this.avgLoudnessDiffNoiseFrames;
    }

    public final float component2() {
        return this.avgLoudnessDiffSpeechFrames;
    }

    public final float component3() {
        return this.avgLoudnessOutputNoiseFrames;
    }

    public final float component4() {
        return this.avgLoudnessOutputSpeechFrames;
    }

    public final NoiseMetrics copy(float f, float f2, float f3, float f4) {
        return new NoiseMetrics(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoiseMetrics) {
                NoiseMetrics noiseMetrics = (NoiseMetrics) obj;
                if (!(Float.compare(this.avgLoudnessDiffNoiseFrames, noiseMetrics.avgLoudnessDiffNoiseFrames) == 0 && Float.compare(this.avgLoudnessDiffSpeechFrames, noiseMetrics.avgLoudnessDiffSpeechFrames) == 0 && Float.compare(this.avgLoudnessOutputNoiseFrames, noiseMetrics.avgLoudnessOutputNoiseFrames) == 0 && Float.compare(this.avgLoudnessOutputSpeechFrames, noiseMetrics.avgLoudnessOutputSpeechFrames) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NoiseMetrics copy$default(NoiseMetrics noiseMetrics, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = noiseMetrics.avgLoudnessDiffNoiseFrames;
        }
        if ((i & 2) != 0) {
            f2 = noiseMetrics.avgLoudnessDiffSpeechFrames;
        }
        if ((i & 4) != 0) {
            f3 = noiseMetrics.avgLoudnessOutputNoiseFrames;
        }
        if ((i & 8) != 0) {
            f4 = noiseMetrics.avgLoudnessOutputSpeechFrames;
        }
        return new NoiseMetrics(f, f2, f3, f4);
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0B(Float.floatToIntBits(this.avgLoudnessDiffNoiseFrames) * 31, this.avgLoudnessDiffSpeechFrames), this.avgLoudnessOutputNoiseFrames) + Float.floatToIntBits(this.avgLoudnessOutputSpeechFrames);
    }

    public NoiseMetrics(float f, float f2, float f3, float f4) {
        this.avgLoudnessDiffNoiseFrames = f;
        this.avgLoudnessDiffSpeechFrames = f2;
        this.avgLoudnessOutputNoiseFrames = f3;
        this.avgLoudnessOutputSpeechFrames = f4;
    }

    public final float getAvgLoudnessDiffNoiseFrames() {
        return this.avgLoudnessDiffNoiseFrames;
    }

    public final float getAvgLoudnessDiffSpeechFrames() {
        return this.avgLoudnessDiffSpeechFrames;
    }

    public final float getAvgLoudnessOutputNoiseFrames() {
        return this.avgLoudnessOutputNoiseFrames;
    }

    public final float getAvgLoudnessOutputSpeechFrames() {
        return this.avgLoudnessOutputSpeechFrames;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoiseMetrics(avgLoudnessDiffNoiseFrames=");
        A10.append(this.avgLoudnessDiffNoiseFrames);
        A10.append(", avgLoudnessDiffSpeechFrames=");
        A10.append(this.avgLoudnessDiffSpeechFrames);
        A10.append(", avgLoudnessOutputNoiseFrames=");
        A10.append(this.avgLoudnessOutputNoiseFrames);
        A10.append(", avgLoudnessOutputSpeechFrames=");
        return AnonymousClass001.A1K(A10, this.avgLoudnessOutputSpeechFrames);
    }
}
