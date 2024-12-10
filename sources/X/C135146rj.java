package X;

import java.util.List;

/* renamed from: X.6rj  reason: invalid class name and case insensitive filesystem */
public final class C135146rj {
    public final C195989uH A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135146rj) {
                C135146rj r5 = (C135146rj) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)));
    }

    public C135146rj(C195989uH r1, String str, List list) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsGetSingleEffectParams(effectId=");
        A10.append(this.A01);
        A10.append(", deviceCapabilities=");
        A10.append(this.A00);
        A10.append(", supportedCompressionTypes=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
