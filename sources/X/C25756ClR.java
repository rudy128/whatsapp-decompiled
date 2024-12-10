package X;

import java.util.Locale;

/* renamed from: X.ClR  reason: case insensitive filesystem */
public final class C25756ClR {
    public final E0C A00;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25756ClR)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C18070vi.A18(((D66) this.A00).A00.toLanguageTag(), ((D66) ((C25756ClR) obj).A00).A00.toLanguageTag());
    }

    public static Locale A00(Object obj) {
        E0C e0c = ((C25756ClR) obj).A00;
        C18070vi.A0z(e0c, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((D66) e0c).A00;
    }

    public int hashCode() {
        return ((D66) this.A00).A00.toLanguageTag().hashCode();
    }

    public String toString() {
        return ((D66) this.A00).A00.toLanguageTag();
    }

    public C25756ClR(E0C e0c) {
        this.A00 = e0c;
    }
}
