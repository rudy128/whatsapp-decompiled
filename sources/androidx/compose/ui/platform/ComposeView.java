package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass0Q9;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y1;
import X.C05660Vf;
import X.C12780mJ;
import X.C17130tn;
import X.C17330uU;
import android.content.Context;
import android.util.AttributeSet;

public final class ComposeView extends AnonymousClass05G {
    public boolean A00;
    public final C17330uU A01;

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(AnonymousClass1OS r2) {
        this.A00 = true;
        this.A01.setValue(r2);
        if (!isAttachedToWindow()) {
            return;
        }
        if (this.A00 != null || isAttachedToWindow()) {
            AnonymousClass05G.A01(this);
            return;
        }
        throw AnonymousClass000.A0n("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = AnonymousClass0Q9.A02((Object) null);
    }

    public void A05(C17130tn r3, int i) {
        r3.COC(420213850);
        AnonymousClass1OS r1 = (AnonymousClass1OS) this.A01.getValue();
        if (r1 != null) {
            r1.invoke(r3, 0);
        }
        C05660Vf BKF = r3.BKF();
        if (BKF != null) {
            BKF.A03(new C12780mJ(this, i));
        }
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
