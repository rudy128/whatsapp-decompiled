package X;

/* renamed from: X.6rU  reason: invalid class name and case insensitive filesystem */
public final class C134996rU {
    public final AnonymousClass6RN A00;
    public final boolean A01;

    public C134996rU(AnonymousClass6RN r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134996rU) {
                C134996rU r5 = (C134996rU) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StorageChatTypeItem(type=");
        A10.append(this.A00);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A01);
    }
}
