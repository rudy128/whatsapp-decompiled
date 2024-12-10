package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.1Yo  reason: invalid class name and case insensitive filesystem */
public final class C28031Yo implements C28021Yn {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C28031Yo) && this.A00 == ((C28031Yo) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public float BPT(RectF rectF) {
        return this.A00 * Math.min(rectF.width(), rectF.height());
    }

    public C28031Yo(float f) {
        this.A00 = f;
    }
}
