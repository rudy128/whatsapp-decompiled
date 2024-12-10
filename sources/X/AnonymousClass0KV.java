package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0KV  reason: invalid class name */
public abstract class AnonymousClass0KV {
    public int A00;
    public Map.Entry A01;
    public Map.Entry A02;
    public final C06960a8 A03;
    public final Iterator A04;

    public final void A01() {
        Map.Entry entry;
        this.A01 = this.A02;
        Iterator it = this.A04;
        if (it.hasNext()) {
            entry = AnonymousClass000.A16(it);
        } else {
            entry = null;
        }
        this.A02 = entry;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1W(this.A02);
    }

    public final void remove() {
        C06960a8 r2 = this.A03;
        if (r2.A00() == this.A00) {
            Map.Entry entry = this.A01;
            if (entry != null) {
                r2.remove(entry.getKey());
                this.A01 = null;
                this.A00 = r2.A00();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    public AnonymousClass0KV(C06960a8 r2, Iterator it) {
        this.A03 = r2;
        this.A04 = it;
        this.A00 = r2.A00();
        A01();
    }

    public final C06960a8 A00() {
        return this.A03;
    }
}
