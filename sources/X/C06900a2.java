package X;

import java.util.ListIterator;

/* renamed from: X.0a2  reason: invalid class name and case insensitive filesystem */
public final class C06900a2 implements ListIterator, C18450wR {
    public final /* synthetic */ C06880a0 A00;
    public final /* synthetic */ C98474rD A01;

    public C06900a2(C06880a0 r1, C98474rD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass000.A0n("Cannot modify a state list through an iterator");
    }

    public boolean hasNext() {
        if (this.A01.element >= this.A00.size() - 1) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1Q(this.A01.element);
    }

    public Object next() {
        C98474rD r3 = this.A01;
        int i = r3.element + 1;
        C06880a0 r1 = this.A00;
        C04110Lw.A00(i, r1.size());
        r3.element = i;
        return r1.get(i);
    }

    public int nextIndex() {
        return this.A01.element + 1;
    }

    public Object previous() {
        C98474rD r3 = this.A01;
        int i = r3.element;
        C06880a0 r1 = this.A00;
        C04110Lw.A00(i, r1.size());
        r3.element = i - 1;
        return r1.get(i);
    }

    public int previousIndex() {
        return this.A01.element;
    }

    public /* bridge */ /* synthetic */ void remove() {
        throw AnonymousClass000.A0n("Cannot modify a state list through an iterator");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass000.A0n("Cannot modify a state list through an iterator");
    }
}
