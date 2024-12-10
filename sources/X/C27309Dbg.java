package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Dbg  reason: case insensitive filesystem */
public class C27309Dbg<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {
    public static final Object A03 = new CXi();
    public static final Object[] A04 = BE6.A1Z();
    public static final long serialVersionUID = 0;
    public transient int A00 = 0;
    public transient int A01 = 0;
    public transient Object[] A02;
    public int mSize = 0;

    public C27309Dbg() {
        Object[] objArr;
        float f = 0.0f / 0.75f;
        int i = (int) f;
        if (i >= 0) {
            if (i == 0) {
                objArr = A04;
            } else {
                objArr = new Object[i];
            }
            this.A02 = objArr;
            return;
        }
        throw AnonymousClass8BR.A0w(StringFormatUtil.formatStrLocaleSafe("adjustedCapacity = %d, capacity = %d, LOAD_FACTOR = %s, (capacity / LOAD_FACTOR) = %s", Integer.valueOf(i), 0, Float.toString(0.75f), Float.toString(f)));
    }

    public static int A01(Object[] objArr, Object obj) {
        int length = objArr.length;
        int A002 = A00(obj, length);
        int i = A002;
        do {
            Object obj2 = objArr[i];
            if (obj2 == null || obj2 == obj || obj2.equals(obj)) {
                return i;
            }
            i++;
            if (i == length) {
                i = 0;
                continue;
            }
        } while (i != A002);
        return i;
    }

    public void clear() {
        this.mSize = 0;
        Arrays.fill(this.A02, (Object) null);
        this.A00++;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    Object[] objArr = this.A02;
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        if (obj2 == null || set.contains(obj2)) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = A02(-1);
        int i = 0;
        while (A022 >= 0) {
            i = AnonymousClass000.A0O(this.A02[A022], i);
            A022 = A02(A022);
        }
        return i;
    }

    public int A02(int i) {
        Object[] objArr;
        do {
            i++;
            objArr = this.A02;
            if (i >= objArr.length) {
                return Integer.MIN_VALUE;
            }
        } while (objArr[i] == null);
        return i;
    }

    public boolean add(Object obj) {
        if (this.mSize >= this.A01) {
            this.A00++;
            int i = 2;
            int i2 = r5 * 2;
            if (i2 != 0) {
                i = i2;
            }
            Object[] objArr = new Object[i];
            for (Object obj2 : this.A02) {
                if (obj2 != null) {
                    objArr[A01(objArr, obj2)] = obj2;
                }
            }
            this.A02 = objArr;
            this.A01 = (int) (((float) i) * 0.75f);
        }
        if (obj == null) {
            obj = A03;
        }
        int length = this.A02.length;
        int A002 = A00(obj, length);
        while (true) {
            Object[] objArr2 = this.A02;
            Object obj3 = objArr2[A002];
            if (obj3 == null) {
                this.mSize++;
                this.A00++;
                objArr2[A002] = obj;
                return true;
            } else if (obj3 == obj || obj3.equals(obj)) {
                return false;
            } else {
                A002++;
                if (A002 == length) {
                    A002 = 0;
                }
            }
        }
        return false;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.A02;
        if (objArr.length == 0) {
            return false;
        }
        if (obj == null) {
            obj = A03;
        }
        if (objArr[A01(objArr, obj)] != null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.mSize);
    }

    public Iterator iterator() {
        return new C27113DUw(this, this);
    }

    public boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.A02;
        if (objArr.length != 0) {
            if (obj == null) {
                obj = A03;
            }
            int A012 = A01(objArr, obj);
            Object[] objArr2 = this.A02;
            if (objArr2[A012] != null) {
                int length = objArr2.length;
                while (true) {
                    int i = A012;
                    while (true) {
                        boolean z = true;
                        A012++;
                        if (A012 >= length) {
                            A012 = 0;
                        }
                        Object[] objArr3 = this.A02;
                        obj2 = objArr3[A012];
                        if (obj2 != null) {
                            int A002 = A00(obj2, length);
                            if (A002 <= i) {
                                z = false;
                            }
                            if (A012 >= i) {
                                if (!z) {
                                    break;
                                }
                            } else if (z) {
                                continue;
                            }
                            if (A002 > A012) {
                                break;
                            }
                        } else {
                            this.A00++;
                            this.mSize--;
                            objArr3[i] = null;
                            return true;
                        }
                    }
                    this.A02[i] = obj2;
                }
            }
        }
        return false;
    }

    public int size() {
        return this.mSize;
    }

    public static int A00(Object obj, int i) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + ((hashCode << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return ((i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE) % i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        objectInputStream.readFloat();
        this.A02 = new Object[readInt];
        this.mSize = 0;
        int readInt2 = objectInputStream.readInt();
        for (int i = 0; i < readInt2; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A02.length);
        objectOutputStream.writeFloat(0.75f);
        objectOutputStream.writeInt(size());
        int A022 = A02(-1);
        while (A022 >= 0) {
            Object obj = this.A02[A022];
            if (obj == A03) {
                obj = null;
            }
            objectOutputStream.writeObject(obj);
            A022 = A02(A022);
        }
    }

    public Object clone() {
        try {
            C27309Dbg dbg = (C27309Dbg) super.clone();
            Object[] objArr = new Object[this.A02.length];
            dbg.A02 = objArr;
            Object[] objArr2 = this.A02;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return dbg;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int A022 = A02(-1);
        int i = 0;
        while (A022 >= 0) {
            int i2 = i + 1;
            Object obj = this.A02[A022];
            if (obj == A03) {
                obj = null;
            }
            objArr[i] = obj;
            A022 = A02(A022);
            i = i2;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('{');
        int A022 = A02(-1);
        boolean z = true;
        while (A022 >= 0) {
            Object obj = this.A02[A022];
            if (!z) {
                A10.append(", ");
            }
            if (obj == A03) {
                obj = "null";
            }
            A10.append(obj);
            A022 = A02(A022);
            z = false;
        }
        return C17890vO.A0b(A10);
    }

    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return A04;
        }
        Object[] objArr = new Object[size];
        int A022 = A02(-1);
        int i = 0;
        while (A022 >= 0) {
            int i2 = i + 1;
            Object obj = this.A02[A022];
            if (obj == A03) {
                obj = null;
            }
            objArr[i] = obj;
            A022 = A02(A022);
            i = i2;
        }
        return objArr;
    }
}
