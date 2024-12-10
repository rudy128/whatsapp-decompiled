package X;

import android.view.KeyEvent;

/* renamed from: X.0NA  reason: invalid class name */
public final class AnonymousClass0NA {
    public final KeyEvent A00;

    public boolean equals(Object obj) {
        return A00(this.A00, obj);
    }

    public static boolean A00(KeyEvent keyEvent, Object obj) {
        if (!(obj instanceof AnonymousClass0NA) || !C18070vi.A18(keyEvent, ((AnonymousClass0NA) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        KeyEvent keyEvent = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyEvent(nativeKeyEvent=");
        return AnonymousClass001.A1F(keyEvent, A10);
    }

    public /* synthetic */ AnonymousClass0NA(KeyEvent keyEvent) {
        this.A00 = keyEvent;
    }
}
