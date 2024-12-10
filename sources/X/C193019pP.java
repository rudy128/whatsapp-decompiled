package X;

import java.util.List;

/* renamed from: X.9pP  reason: invalid class name and case insensitive filesystem */
public final class C193019pP {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193019pP) && C18070vi.A18(this.A00, ((C193019pP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193019pP(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VariantsCarouselFragmentUiState(carouselDisplayData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
