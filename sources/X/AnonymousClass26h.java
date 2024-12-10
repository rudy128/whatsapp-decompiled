package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.26h  reason: invalid class name */
public class AnonymousClass26h extends Drawable.ConstantState {
    public AnimatorSet A00;
    public AnonymousClass00P A01;
    public C24291Jp A02;
    public ArrayList A03;

    public Drawable newDrawable(Resources resources) {
        throw AnonymousClass000.A0n("No constant state support for SDK < 24.");
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        throw AnonymousClass000.A0n("No constant state support for SDK < 24.");
    }
}
