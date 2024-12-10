package X;

import java.util.List;

/* renamed from: X.5ze  reason: invalid class name and case insensitive filesystem */
public final class C117355ze extends AnonymousClass6T7 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117355ze) && C18070vi.A18(this.A00, ((C117355ze) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C117355ze(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SocialStickers(stickers=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
