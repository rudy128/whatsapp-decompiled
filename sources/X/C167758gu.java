package X;

import java.util.Arrays;

/* renamed from: X.8gu  reason: invalid class name and case insensitive filesystem */
public final class C167758gu extends C180279Lx {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C18070vi.A14(this, obj) && this.A00 == ((C167758gu) obj).A00;
        }
        return true;
    }

    public C167758gu(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoParamsStatusMessage{type=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
