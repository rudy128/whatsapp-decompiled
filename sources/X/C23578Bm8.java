package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Bm8  reason: case insensitive filesystem */
public class C23578Bm8 extends C27296DbR<String> implements EE5, RandomAccess {
    public static final EE5 A01;
    public static final C23578Bm8 A02;
    public final List A00;

    static {
        C23578Bm8 bm8 = new C23578Bm8();
        A02 = bm8;
        bm8.A00 = false;
        A01 = bm8;
    }

    public Object BXq(int i) {
        return this.A00.get(i);
    }

    public List Bay() {
        return Collections.unmodifiableList(this.A00);
    }

    public EE5 Bb0() {
        if (this.A00) {
            return new C27297DbS(this);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        String A0q;
        int A022;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof DSQ) {
            DSQ dsq = (DSQ) obj;
            A0q = dsq.A04();
            C23581BmB bmB = (C23581BmB) dsq;
            int A07 = bmB.A07();
            A022 = C25412CfK.A00.A02(bmB.bytes, A07, bmB.A02() + A07);
        } else {
            byte[] bArr = (byte[]) obj;
            A0q = BE6.A0q(CIC.A04, bArr);
            A022 = C25412CfK.A00.A02(bArr, 0, bArr.length);
        }
        if (A022 == 0) {
            list.set(i, A0q);
        }
        return A0q;
    }

    public int size() {
        return this.A00.size();
    }

    public C23578Bm8(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public void BAo(DSQ dsq) {
        A01();
        this.A00.add(dsq);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ EE9 Bk8(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.A00);
            return new C23578Bm8(A0z);
        }
        throw BE6.A0j();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof EE5) {
            collection = ((EE5) collection).Bay();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof DSQ) {
            return ((DSQ) remove).A04();
        }
        return BE6.A0q(CIC.A04, (byte[]) remove);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        if (obj2 instanceof String) {
            return obj2;
        }
        if (obj2 instanceof DSQ) {
            return ((DSQ) obj2).A04();
        }
        return BE6.A0q(CIC.A04, (byte[]) obj2);
    }

    public C23578Bm8() {
        this(C17880vN.A0z(10));
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
