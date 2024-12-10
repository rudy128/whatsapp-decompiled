package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7SZ  reason: invalid class name */
public final class AnonymousClass7SZ implements AnonymousClass1JQ {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ AnonymousClass1JQ A01;

    public AnonymousClass7SZ(Comparator comparator, AnonymousClass1JQ r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public Iterator iterator() {
        List A07 = AnonymousClass1b2.A07(this.A01);
        C29391cC.A0H(A07, this.A00);
        return A07.iterator();
    }
}
