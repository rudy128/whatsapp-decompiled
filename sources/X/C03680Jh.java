package X;

import android.content.res.Resources;

/* renamed from: X.0Jh  reason: invalid class name and case insensitive filesystem */
public final class C03680Jh {
    public final int A00;
    public final Resources.Theme A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C03680Jh) {
                C03680Jh r5 = (C03680Jh) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public C03680Jh(Resources.Theme theme, int i) {
        this.A01 = theme;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Key(theme=");
        A10.append(this.A01);
        A10.append(", id=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
