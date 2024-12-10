package X;

import android.view.View;
import java.util.List;

/* renamed from: X.4YG  reason: invalid class name */
public final class AnonymousClass4YG {
    public static final C18100vl A02 = AnonymousClass1DF.A01(new C99064sD(6));
    public final View A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YG) {
                AnonymousClass4YG r5 = (AnonymousClass4YG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass4YG(View view, List list) {
        this.A01 = list;
        this.A00 = view;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpSellSnackBarConfig(viewsForSnackBarTransition=");
        A10.append(this.A01);
        A10.append(", anchorView=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
