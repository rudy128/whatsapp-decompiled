package com.whatsapp.contact.picker.invite.compose.perf.render;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C110835hB;
import X.C18070vi;
import X.C18090vk;

public final class OnFirstContentDrawModifierElement extends AnonymousClass0WA {
    public final C18090vk A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnFirstContentDrawModifierElement) && C18070vi.A18(this.A00, ((OnFirstContentDrawModifierElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.5hB] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        C18090vk r1 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        C110835hB r22 = (C110835hB) r2;
        C18070vi.A0d(r22, 0);
        r22.A00 = this.A00;
    }

    public OnFirstContentDrawModifierElement(C18090vk r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnFirstContentDrawModifierElement(onDrawComplete=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
