package X;

import android.view.View;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.4CG  reason: invalid class name */
public final class AnonymousClass4CG extends AnonymousClass4F6 {
    public final View A00;

    public AnonymousClass4CG(View view) {
        C18070vi.A0d(view, 1);
        this.A00 = view;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4CG) && C18070vi.A18(this.A00, ((AnonymousClass4CG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public static void A00(View view, WDSTextLayout wDSTextLayout) {
        wDSTextLayout.setContent(new AnonymousClass4CG(view));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Custom(view=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
