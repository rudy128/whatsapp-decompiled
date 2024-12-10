package androidx.media;

import X.C25849Cn7;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C25849Cn7 cn7) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = cn7.A01(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = cn7.A01(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = cn7.A01(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = cn7.A01(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C25849Cn7 cn7) {
        cn7.A06(audioAttributesImplBase.A03, 1);
        cn7.A06(audioAttributesImplBase.A00, 2);
        cn7.A06(audioAttributesImplBase.A01, 3);
        cn7.A06(audioAttributesImplBase.A02, 4);
    }
}
