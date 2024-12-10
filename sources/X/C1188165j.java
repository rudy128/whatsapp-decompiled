package X;

import java.util.List;

/* renamed from: X.65j  reason: invalid class name and case insensitive filesystem */
public final class C1188165j extends AnonymousClass6TQ {
    public final List A00;

    public C1188165j(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1188165j) && C18070vi.A18(this.A00, ((C1188165j) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PostBucketsResult(galleryFolders=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
