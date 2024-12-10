package X;

import android.graphics.Rect;

/* renamed from: X.1Zi  reason: invalid class name and case insensitive filesystem */
public final class C28211Zi {
    public final AnonymousClass1HO A00;
    public final AnonymousClass1Zh A01;

    public C28211Zi(AnonymousClass1HO r2, AnonymousClass1Zh r3) {
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C18070vi.A18(cls2, cls)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
                C28211Zi r5 = (C28211Zi) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Rect A00() {
        AnonymousClass1Zh r0 = this.A01;
        return new Rect(r0.A01, r0.A03, r0.A02, r0.A00);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WindowMetrics( bounds=");
        sb.append(this.A01);
        sb.append(", windowInsetsCompat=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
