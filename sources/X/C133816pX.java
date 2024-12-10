package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pX  reason: invalid class name and case insensitive filesystem */
public abstract class C133816pX {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final ArrayList A03 = AnonymousClass000.A13();
    public final List A04 = AnonymousClass000.A13();

    public final void A00(AnonymousClass87D r2) {
        C18070vi.A0d(r2, 0);
        this.A03.add(r2);
        if (AnonymousClass000.A1a(this.A04)) {
            r2.C3w(this);
        }
    }

    public final void A01(String str, Collection collection, boolean z) {
        C17960vV.A02();
        this.A01 = z;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((AnonymousClass87D) it.next()).C3w(this);
        }
        this.A02 = false;
    }
}
