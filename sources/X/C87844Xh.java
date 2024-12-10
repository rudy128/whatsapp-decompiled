package X;

import java.util.AbstractCollection;

/* renamed from: X.4Xh  reason: invalid class name and case insensitive filesystem */
public final class C87844Xh {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C87844Xh r4 = (C87844Xh) obj;
            if (this.A00 != r4.A00 || !C42171xk.A00(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public C87844Xh(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static C87844Xh A00(AnonymousClass3VQ r2, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return new C87844Xh(8, (String) null);
        }
        return new C87844Xh(0, r2.A0j.A0L().format((long) abstractCollection.size()));
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
