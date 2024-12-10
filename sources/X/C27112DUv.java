package X;

import java.util.Iterator;

/* renamed from: X.DUv  reason: case insensitive filesystem */
public final class C27112DUv implements Iterator {
    public boolean canRemove;
    public C25259Cby currentEntry;
    public final Iterator entryIterator;
    public int laterCount;
    public final C28677EDz multiset;
    public int totalCount;

    public boolean hasNext() {
        if (this.laterCount > 0 || this.entryIterator.hasNext()) {
            return true;
        }
        return false;
    }

    public void remove() {
        C201310y.checkRemove(this.canRemove);
        if (this.totalCount == 1) {
            this.entryIterator.remove();
        } else {
            C28677EDz eDz = this.multiset;
            C25259Cby cby = this.currentEntry;
            cby.getClass();
            eDz.remove(cby.getElement());
        }
        this.totalCount--;
        this.canRemove = false;
    }

    public C27112DUv(C28677EDz eDz, Iterator it) {
        this.multiset = eDz;
        this.entryIterator = it;
    }

    public Object next() {
        if (hasNext()) {
            int i = this.laterCount;
            if (i == 0) {
                C25259Cby cby = (C25259Cby) this.entryIterator.next();
                this.currentEntry = cby;
                i = cby.getCount();
                this.laterCount = i;
                this.totalCount = i;
            }
            this.laterCount = i - 1;
            this.canRemove = true;
            C25259Cby cby2 = this.currentEntry;
            cby2.getClass();
            return cby2.getElement();
        }
        throw BE6.A14();
    }
}
