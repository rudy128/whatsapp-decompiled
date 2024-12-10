package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0VS  reason: invalid class name */
public final class AnonymousClass0VS implements C16640sl, AnonymousClass1GC {
    public C23381Fv A00;
    public AnonymousClass1OS A01 = AnonymousClass0M9.A00();
    public boolean A02;
    public final C16640sl A03;
    public final AndroidComposeView A04;

    public void C6U(C27581Wq r2, AnonymousClass1F9 r3) {
        if (r2 == C27581Wq.ON_DESTROY) {
            dispose();
        } else if (r2 == C27581Wq.ON_CREATE && !this.A02) {
            CIT(this.A01);
        }
    }

    public void CIT(AnonymousClass1OS r3) {
        this.A04.setOnViewTreeOwnersAvailable(new C11090jT(this, r3));
    }

    public void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(2131437091, (Object) null);
            C23381Fv r0 = this.A00;
            if (r0 != null) {
                r0.A06(this);
            }
        }
        this.A03.dispose();
    }

    public AnonymousClass0VS(C16640sl r2, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = r2;
    }

    public final C16640sl A04() {
        return this.A03;
    }

    public final AndroidComposeView A05() {
        return this.A04;
    }
}
