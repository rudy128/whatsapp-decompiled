package X;

import java.util.List;

/* renamed from: X.36f  reason: invalid class name and case insensitive filesystem */
public final class C691836f implements AnonymousClass25D {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C691836f) && C18070vi.A18(this.A00, ((C691836f) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C691836f(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotRenderingMetadata(keywords=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
