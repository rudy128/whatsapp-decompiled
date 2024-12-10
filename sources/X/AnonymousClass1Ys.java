package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.1Ys  reason: invalid class name */
public final class AnonymousClass1Ys implements C28021Yn {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass1Ys) && this.A00 == ((AnonymousClass1Ys) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public AnonymousClass1Ys(float f) {
        this.A00 = f;
    }

    public float BPT(RectF rectF) {
        return this.A00;
    }
}
