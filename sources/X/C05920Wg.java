package X;

/* renamed from: X.0Wg  reason: invalid class name and case insensitive filesystem */
public final class C05920Wg implements C16990tY {
    public final int A00;

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
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((C05920Wg) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C05920Wg(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AndroidPointerIcon(type=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
