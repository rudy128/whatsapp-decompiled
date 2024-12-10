package X;

import java.util.Map;

/* renamed from: X.9r0  reason: invalid class name and case insensitive filesystem */
public final class C193999r0 {
    public final AnonymousClass90N A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193999r0) {
                C193999r0 r5 = (C193999r0) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C193999r0(AnonymousClass90N r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StateInputCacheData(cachedState=");
        A10.append(this.A00);
        A10.append(", cachedStateInput=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
