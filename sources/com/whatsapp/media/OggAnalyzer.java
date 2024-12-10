package com.whatsapp.media;

import X.AnonymousClass000;
import X.AnonymousClass8BU;

public class OggAnalyzer {
    public static native OggFileReport examineOggStream(String str);

    public class OggAnalyzerException extends Exception {
        public final int errorCode;

        public OggAnalyzerException(int i) {
            this.errorCode = i;
        }

        public String toString() {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("OggAnalyzerException(errorCode=");
            A10.append(this.errorCode);
            return AnonymousClass8BU.A0q(A10);
        }
    }

    public class OggFileReport {
        public final int channels;
        public final float fileDurationSeconds;
        public final boolean isAudioStreamOpus;
        public final int numberOfStreams;
        public final int samplingRate;

        public OggFileReport(float f, int i, int i2, int i3, boolean z) {
            this.fileDurationSeconds = f;
            this.numberOfStreams = i;
            this.samplingRate = i2;
            this.channels = i3;
            this.isAudioStreamOpus = z;
        }

        public String toString() {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("OggFileReport(fileDurationSeconds=");
            A10.append(this.fileDurationSeconds);
            A10.append(", numberOfStreams=");
            A10.append(this.numberOfStreams);
            A10.append(", samplingRate=");
            A10.append(this.samplingRate);
            A10.append(", channels=");
            A10.append(this.channels);
            A10.append(", isAudioStreamOpus=");
            A10.append(this.isAudioStreamOpus);
            return AnonymousClass8BU.A0q(A10);
        }
    }
}
