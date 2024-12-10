package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.7Rd  reason: invalid class name and case insensitive filesystem */
public class C146927Rd implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((AnonymousClass73C) obj).A02(), ((AnonymousClass73C) obj2).A02());
    }

    public C146927Rd(C18000vb r3) {
        Collator A0r = C108965cb.A0r(r3);
        this.A00 = A0r;
        A0r.setDecomposition(1);
    }
}
