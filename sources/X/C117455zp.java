package X;

import java.util.List;

/* renamed from: X.5zp  reason: invalid class name and case insensitive filesystem */
public final class C117455zp extends AnonymousClass6TA {
    public final List A00;

    public C117455zp(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117455zp) && C18070vi.A18(this.A00, ((C117455zp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiSearchData(items=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
