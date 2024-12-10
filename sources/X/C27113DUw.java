package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.DUw  reason: case insensitive filesystem */
public final class C27113DUw implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = false;
    public final C27309Dbg A04;
    public final Object[] A05;
    public final /* synthetic */ C27309Dbg A06;

    public C27113DUw(C27309Dbg dbg, C27309Dbg dbg2) {
        this.A06 = dbg;
        this.A04 = dbg2;
        this.A05 = dbg2.A02;
        this.A01 = dbg2.A00;
        int A022 = dbg2.A02(-1);
        this.A00 = A022;
        this.A02 = A022;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1Q(this.A00);
    }

    public final Object next() {
        if (this.A01 == this.A04.A00) {
            int i = this.A00;
            if (i >= 0) {
                Object[] objArr = this.A05;
                Object obj = objArr[i];
                if (obj == C27309Dbg.A03) {
                    obj = null;
                }
                this.A02 = i;
                this.A03 = true;
                while (true) {
                    i++;
                    if (i < objArr.length) {
                        if (objArr[i] != null) {
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                this.A00 = i;
                return obj;
            }
            throw BE6.A14();
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        int i = this.A01;
        C27309Dbg dbg = this.A04;
        if (i != dbg.A00) {
            throw new ConcurrentModificationException();
        } else if (this.A03) {
            this.A03 = false;
            Object[] objArr = this.A05;
            dbg.remove(objArr[this.A02]);
            this.A01++;
            int i2 = this.A02;
            while (true) {
                if (i2 < objArr.length) {
                    if (objArr[i2] != null) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.A00 = i2;
        } else {
            throw BE6.A0k();
        }
    }
}
