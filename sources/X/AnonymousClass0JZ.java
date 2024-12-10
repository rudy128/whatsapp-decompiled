package X;

/* renamed from: X.0JZ  reason: invalid class name */
public final class AnonymousClass0JZ {
    public final long A00 = (4284900966L << 32);
    public final AnonymousClass0tB A01;

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
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                AnonymousClass0JZ r8 = (AnonymousClass0JZ) obj;
                long j = this.A00;
                long j2 = r8.A00;
                C02540Ek r0 = C05100Qk.A06;
                if (j != j2 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0I(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OverscrollConfiguration(glowColor=");
        AnonymousClass000.A1F(A10, this.A00);
        A10.append(", drawPadding=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public /* synthetic */ AnonymousClass0JZ() {
        C02540Ek r0 = C05100Qk.A06;
        C05560Us r02 = new C05560Us(0.0f, 0.0f, 0.0f, 0.0f);
        this.A01 = r02;
    }
}
