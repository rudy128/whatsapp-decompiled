package X;

import java.util.List;

/* renamed from: X.4Sc  reason: invalid class name and case insensitive filesystem */
public final class C86554Sc {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86554Sc) && C18070vi.A18(this.A00, ((C86554Sc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C86554Sc(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsBannersConfiguration(effectBanners=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
