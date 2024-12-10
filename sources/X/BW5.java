package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;

public class BW5 extends MediaEffect {
    public float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Float.compare(((BW5) obj).A00, this.A00) == 0;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new float[]{this.A00});
    }

    public String toString() {
        return A01().toString();
    }
}
