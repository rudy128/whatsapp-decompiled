package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class BGU extends CharacterStyle implements UpdateAppearance {
    public final C17330uU A00 = AnonymousClass0Q9.A02(new AnonymousClass0QG(AnonymousClass0QG.A01));
    public final C016009d A01;
    public final float A02;
    public final C16300s2 A03 = AnonymousClass0PF.A01(new C27460Dfp(this));

    public void updateDrawState(TextPaint textPaint) {
        float f = this.A02;
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(C22339B3q.A01(C28851b7.A02(f, 0.0f, 1.0f) * 255.0f));
        }
        textPaint.setShader((Shader) this.A03.getValue());
    }

    public BGU(C016009d r4, float f) {
        this.A01 = r4;
        this.A02 = f;
    }
}
