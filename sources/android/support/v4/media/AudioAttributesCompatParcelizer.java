package android.support.v4.media;

import X.C25849Cn7;
import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C25849Cn7 cn7) {
        return androidx.media.AudioAttributesCompatParcelizer.read(cn7);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C25849Cn7 cn7) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, cn7);
    }
}
