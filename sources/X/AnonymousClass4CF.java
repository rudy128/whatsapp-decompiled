package X;

import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.List;

/* renamed from: X.4CF  reason: invalid class name */
public final class AnonymousClass4CF extends AnonymousClass4F6 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4CF) && C18070vi.A18(this.A00, ((AnonymousClass4CF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public static void A00(WDSTextLayout wDSTextLayout, List list) {
        wDSTextLayout.setContent(new AnonymousClass4CF(list));
    }

    public AnonymousClass4CF(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Bullets(bulletItems=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
