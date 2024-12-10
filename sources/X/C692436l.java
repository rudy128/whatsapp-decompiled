package X;

import java.util.List;

/* renamed from: X.36l  reason: invalid class name and case insensitive filesystem */
public final class C692436l implements AnonymousClass229 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C692436l) && C18070vi.A18(this.A00, ((C692436l) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C692436l(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProcessedVideos(videos=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
