package X;

import java.util.Iterator;

/* renamed from: X.DUu  reason: case insensitive filesystem */
public class C27111DUu implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ C27298DbT A03;

    public /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        C27298DbT dbT = this.A03;
        if (i < dbT.A00.size()) {
            return dbT.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass000.A15(dbT.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public C27111DUu(C27298DbT dbT) {
        this.A03 = dbT;
    }

    public boolean hasNext() {
        int i = this.A00 + 1;
        C27298DbT dbT = this.A03;
        if (i >= dbT.A00.size()) {
            if (dbT.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A15(dbT.A01);
                this.A01 = it;
            }
            if (it.hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void remove() {
        if (this.A02) {
            this.A02 = false;
            C27298DbT dbT = this.A03;
            C27298DbT.A03(dbT);
            if (this.A00 < dbT.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                C27298DbT.A01(dbT, i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass000.A15(dbT.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass000.A0n("remove() was called before next()");
    }
}
