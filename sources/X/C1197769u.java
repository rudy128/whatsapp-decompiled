package X;

import java.util.Arrays;

/* renamed from: X.69u  reason: invalid class name and case insensitive filesystem */
public final class C1197769u extends C133706pM {
    public final int A00;

    public C1197769u(C126136cF r3, int i, boolean z) {
        super(r3, 0, z, true);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !super.equals(obj) || !(obj instanceof C1197769u) || this.A00 != ((C1197769u) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, super.hashCode());
        AnonymousClass000.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
