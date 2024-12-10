package X;

import android.view.View;

/* renamed from: X.0Bj  reason: invalid class name */
public class AnonymousClass0Bj extends AnonymousClass1HN {
    public int A00;
    public boolean A01;
    public final int A02 = 1;
    public final Object A03;

    public AnonymousClass0Bj(AnonymousClass03K r2, int i) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = false;
    }

    public void BlO(View view) {
        if (1 - this.A02 != 0) {
            super.BlO(view);
        } else {
            this.A01 = true;
        }
    }

    public void BlP(View view) {
        if (this.A02 == 0) {
            int i = this.A00 + 1;
            this.A00 = i;
            AnonymousClass0KW r2 = (AnonymousClass0KW) this.A03;
            if (i == r2.A04.size()) {
                AnonymousClass1HM r1 = r2.A02;
                if (r1 != null) {
                    r1.BlP((View) null);
                }
                this.A00 = 0;
                this.A01 = false;
                r2.A03 = false;
            }
        } else if (!this.A01) {
            ((AnonymousClass03K) this.A03).A08.setVisibility(this.A00);
        }
    }

    public void BlQ() {
        if (this.A02 != 0) {
            ((AnonymousClass03K) this.A03).A08.setVisibility(0);
        } else if (!this.A01) {
            this.A01 = true;
            AnonymousClass1HM r0 = ((AnonymousClass0KW) this.A03).A02;
            if (r0 != null) {
                r0.BlQ();
            }
        }
    }

    public AnonymousClass0Bj(AnonymousClass0KW r2) {
        this.A03 = r2;
        this.A01 = false;
        this.A00 = 0;
    }
}
