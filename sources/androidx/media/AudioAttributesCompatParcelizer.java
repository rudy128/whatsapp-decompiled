package androidx.media;

import X.C25849Cn7;

public class AudioAttributesCompatParcelizer {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(C25849Cn7 cn7) {
        ? obj = new Object();
        Object obj2 = obj.A00;
        if (cn7.A09(1)) {
            obj2 = cn7.A04();
        }
        obj.A00 = (AudioAttributesImpl) obj2;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C25849Cn7 cn7) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        cn7.A05(1);
        cn7.A08(audioAttributesImpl);
    }
}
