package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.7Rb  reason: invalid class name and case insensitive filesystem */
public class C146907Rb implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((AnonymousClass25N) obj).A06;
        String str2 = ((AnonymousClass25N) obj2).A06;
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return 1;
        } else if (str2 == null) {
            return -1;
        } else {
            return this.A00.compare(str, str2);
        }
    }

    public C146907Rb(C18000vb r3) {
        Collator A0r = C108965cb.A0r(r3);
        this.A00 = A0r;
        A0r.setDecomposition(1);
    }
}
