package androidx.media;

import X.C25849Cn7;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C25849Cn7 cn7) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) cn7.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = cn7.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C25849Cn7 cn7) {
        cn7.A07(audioAttributesImplApi21.A01, 1);
        cn7.A06(audioAttributesImplApi21.A00, 2);
    }
}
