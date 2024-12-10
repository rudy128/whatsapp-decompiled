package X;

import java.util.ListIterator;

public final class DVC implements ListIterator, C18450wR {
    public final ListIterator A00;
    public final /* synthetic */ C27352DcO A01;

    public DVC(C27352DcO dcO, int i) {
        this.A01 = dcO;
        this.A00 = dcO.A00.listIterator(C29411cE.A0Q(dcO, i));
    }

    public void add(Object obj) {
        ListIterator listIterator = this.A00;
        listIterator.add(obj);
        listIterator.previous();
    }

    public boolean hasNext() {
        return this.A00.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A00.previous();
    }

    public int nextIndex() {
        C27352DcO dcO = this.A01;
        return AnonymousClass1ZU.A04(dcO) - this.A00.previousIndex();
    }

    public Object previous() {
        return this.A00.next();
    }

    public int previousIndex() {
        C27352DcO dcO = this.A01;
        return AnonymousClass1ZU.A04(dcO) - this.A00.nextIndex();
    }

    public void remove() {
        this.A00.remove();
    }

    public void set(Object obj) {
        this.A00.set(obj);
    }
}
