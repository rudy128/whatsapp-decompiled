package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.3RG  reason: invalid class name */
public final class AnonymousClass3RG extends LinearLayout implements AnonymousClass009, AnonymousClass1F9 {
    public C73343Uy A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C23381Fv A03;
    public final C23391Fw A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3RG(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C73343Uy) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z.A6G.get();
        }
        C23391Fw r0 = new C23391Fw(this);
        this.A04 = r0;
        this.A03 = r0;
    }

    public final void setViewModel(C73343Uy r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public C23381Fv getLifecycle() {
        return this.A03;
    }

    public final C73343Uy getViewModel() {
        C73343Uy r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A04.A08(C23401Fx.RESUMED);
        C72473Md.A10(this);
        setOrientation(1);
        AnonymousClass3MY.A1K(this, getViewModel().A09, AnonymousClass3MW.A16(this, 1), 15);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A04.A08(C23401Fx.DESTROYED);
    }
}
