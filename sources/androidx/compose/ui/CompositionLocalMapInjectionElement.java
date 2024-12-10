package androidx.compose.ui;

import X.AnonymousClass0QV;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C013908h;
import X.C17030tc;
import X.C18070vi;

public final class CompositionLocalMapInjectionElement extends AnonymousClass0WA {
    public final C17030tc A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.08h] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C17030tc r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        C013908h r32 = (C013908h) r3;
        C17030tc r1 = this.A00;
        r32.A00 = r1;
        AnonymousClass0QV.A03(r32).CIR(r1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CompositionLocalMapInjectionElement) || !C18070vi.A18(((CompositionLocalMapInjectionElement) obj).A00, this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public CompositionLocalMapInjectionElement(C17030tc r1) {
        this.A00 = r1;
    }
}
