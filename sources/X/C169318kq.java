package X;

/* renamed from: X.8kq  reason: invalid class name and case insensitive filesystem */
public final class C169318kq extends C180589Nd {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169318kq) && this.A00 == ((C169318kq) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C169318kq(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HasCatalogChip(isSelected=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C169318kq() {
        this(false);
    }
}
