package X;

import android.content.Context;

/* renamed from: X.A1c  reason: case insensitive filesystem */
public class C19967A1c {
    public int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19967A1c)) {
            return false;
        }
        C19967A1c a1c = (C19967A1c) obj;
        return this.A00 == a1c.A00 && C42171xk.A00(this.A01, a1c.A01);
    }

    public String A00(Context context) {
        String str = this.A01;
        if (str == null) {
            return context.getString(this.A00);
        }
        return str;
    }

    public C19967A1c(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public C19967A1c(int i) {
        this.A00 = i;
        this.A01 = null;
    }
}
