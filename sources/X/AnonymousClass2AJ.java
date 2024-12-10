package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.2AJ  reason: invalid class name */
public class AnonymousClass2AJ extends AnonymousClass1IX<E> {
    public final transient int length;
    public final transient int offset;
    public final /* synthetic */ AnonymousClass1IX this$0;

    public boolean isPartialView() {
        return true;
    }

    public AnonymousClass2AJ(AnonymousClass1IX r1, int i, int i2) {
        this.this$0 = r1;
        this.offset = i;
        this.length = i2;
    }

    public Object get(int i) {
        C199610h.A01(i, this.length);
        return this.this$0.get(i + this.offset);
    }

    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    public int internalArrayEnd() {
        return this.this$0.internalArrayStart() + this.offset + this.length;
    }

    public int internalArrayStart() {
        return this.this$0.internalArrayStart() + this.offset;
    }

    public AnonymousClass1IX subList(int i, int i2) {
        C199610h.A03(i, i2, this.length);
        AnonymousClass1IX r1 = this.this$0;
        int i3 = this.offset;
        return r1.subList(i + i3, i2 + i3);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    public int size() {
        return this.length;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }
}
