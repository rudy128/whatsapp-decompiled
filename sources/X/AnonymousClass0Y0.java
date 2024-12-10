package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.0Y0  reason: invalid class name */
public class AnonymousClass0Y0 implements AnonymousClass1HM {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    public void BlO(View view) {
        this.A01 = true;
    }

    public AnonymousClass0Y0(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    public void A00(AnonymousClass1HC r2, int i) {
        this.A02.A02 = r2;
        this.A00 = i;
    }

    public void BlP(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A02 = null;
            AnonymousClass0Y0.super.setVisibility(this.A00);
        }
    }

    public void BlQ() {
        AnonymousClass0Y0.super.setVisibility(0);
        this.A01 = false;
    }
}
