package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.7Ra  reason: invalid class name and case insensitive filesystem */
public class C146897Ra implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer A002 = AnonymousClass70u.A00(str, str2);
        if (A002 == null) {
            return this.A00.compare(str, str2);
        }
        return A002.intValue();
    }

    public C146897Ra(C18000vb r3) {
        Collator A0r = C108965cb.A0r(r3);
        this.A00 = A0r;
        A0r.setDecomposition(1);
    }
}
