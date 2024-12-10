package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.7Rc  reason: invalid class name and case insensitive filesystem */
public final class C146917Rc implements Comparator {
    public final Collator A00;

    public C146917Rc(C18000vb r3) {
        Collator A0r = C108965cb.A0r(r3);
        A0r.setDecomposition(1);
        this.A00 = A0r;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass7EH r4 = (AnonymousClass7EH) obj;
        AnonymousClass7EH r5 = (AnonymousClass7EH) obj2;
        C18070vi.A0h(r4, r5);
        return this.A00.compare(r4.A00, r5.A00);
    }
}
