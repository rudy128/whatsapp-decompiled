package X;

/* renamed from: X.5zW  reason: invalid class name and case insensitive filesystem */
public final class C117285zW extends AnonymousClass6T5 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117285zW) && C18070vi.A18(this.A00, ((C117285zW) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C117285zW(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MoveToAvatarCategory(category=");
        return C17900vP.A0B(this.A00, A10);
    }
}
