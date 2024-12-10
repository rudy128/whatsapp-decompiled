package X;

import com.facebook.wearable.mediastream.model.SUPToggleState;

/* renamed from: X.BXi  reason: case insensitive filesystem */
public final class C22962BXi extends SUPToggleState {
    public final boolean A00;

    public C22962BXi(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Available(isUseGlassesTooltipVisible=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C22962BXi() {
        this(false);
    }
}
