package androidx.media;

import X.C25849Cn7;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C25849Cn7 cn7) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = (AudioAttributes) cn7.A02(audioAttributesImplApi26.A01, 1);
        audioAttributesImplApi26.A00 = cn7.A01(audioAttributesImplApi26.A00, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C25849Cn7 cn7) {
        cn7.A07(audioAttributesImplApi26.A01, 1);
        cn7.A06(audioAttributesImplApi26.A00, 2);
    }
}
