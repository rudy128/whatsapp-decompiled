package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.25U  reason: invalid class name */
public final class AnonymousClass25U implements C28021Yn {
    public final float A00;
    public final C28021Yn A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass25U)) {
            return false;
        }
        AnonymousClass25U r4 = (AnonymousClass25U) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
    }

    public float BPT(RectF rectF) {
        return Math.max(0.0f, this.A01.BPT(rectF) + this.A00);
    }

    public AnonymousClass25U(C28021Yn r3, float f) {
        if (r3 instanceof AnonymousClass25U) {
            throw new NullPointerException("adjustment");
        }
        this.A01 = r3;
        this.A00 = f;
    }
}
