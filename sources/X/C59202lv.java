package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: X.2lv  reason: invalid class name and case insensitive filesystem */
public final class C59202lv {
    public int A00;
    public final ColorStateList A01;
    public final Shader A02;

    public boolean A02() {
        if (this.A02 == null && this.A00 == 0) {
            return false;
        }
        return true;
    }

    public C59202lv(ColorStateList colorStateList, Shader shader, int i) {
        this.A02 = shader;
        this.A01 = colorStateList;
        this.A00 = i;
    }

    public int A00() {
        return this.A00;
    }

    public Shader A01() {
        return this.A02;
    }
}
