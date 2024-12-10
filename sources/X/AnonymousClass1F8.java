package X;

import java.util.Arrays;

/* renamed from: X.1F8  reason: invalid class name */
public class AnonymousClass1F8 extends AnonymousClass1F7 {
    public int hashCode;
    public Object[] hashTable;

    private void addDeduping(Object obj) {
        this.hashTable.getClass();
        int length = this.hashTable.length - 1;
        int hashCode2 = obj.hashCode();
        int smear = AnonymousClass111.smear(hashCode2);
        while (true) {
            int i = smear & length;
            Object[] objArr = this.hashTable;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                objArr[i] = obj;
                this.hashCode += hashCode2;
                super.add(obj);
                return;
            } else if (!obj2.equals(obj)) {
                smear = i + 1;
            } else {
                return;
            }
        }
    }

    public C199410f build() {
        C199410f access$100;
        int i = this.size;
        if (i == 0) {
            return C199410f.of();
        }
        if (i != 1) {
            if (this.hashTable == null || C199410f.chooseTableSize(i) != this.hashTable.length) {
                access$100 = C199410f.construct(this.size, this.contents);
                this.size = access$100.size();
            } else {
                int i2 = this.size;
                Object[] objArr = this.contents;
                if (C199410f.shouldTrim(i2, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.hashCode;
                Object[] objArr2 = this.hashTable;
                access$100 = new AnonymousClass1HX(objArr, i3, objArr2, objArr2.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return access$100;
        }
        Object obj = this.contents[0];
        obj.getClass();
        return C199410f.of(obj);
    }

    public AnonymousClass1F8(int i) {
        super(i);
        this.hashTable = new Object[C199410f.chooseTableSize(i)];
    }

    public AnonymousClass1F8 add(Object obj) {
        C199610h.A04(obj);
        if (this.hashTable == null || C199410f.chooseTableSize(this.size) > this.hashTable.length) {
            this.hashTable = null;
            super.add(obj);
            return this;
        }
        addDeduping(obj);
        return this;
    }

    public AnonymousClass1F8 addAll(Iterable iterable) {
        C199610h.A04(iterable);
        if (this.hashTable != null) {
            for (Object add : iterable) {
                add(add);
            }
        } else {
            super.addAll(iterable);
        }
        return this;
    }

    public AnonymousClass1F8() {
        super(4);
    }

    public AnonymousClass1F8 add(Object... objArr) {
        if (this.hashTable != null) {
            for (Object add : objArr) {
                add(add);
            }
        } else {
            super.add(objArr);
        }
        return this;
    }
}
