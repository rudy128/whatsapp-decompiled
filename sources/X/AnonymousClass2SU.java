package X;

import java.util.Iterator;

/* renamed from: X.2SU  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass2SU {
    public static /* synthetic */ String A00(CharSequence charSequence, Iterable iterable) {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                A10.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                A10.append(charSequence);
            }
        }
        return A10.toString();
    }
}
