package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.10p  reason: invalid class name and case insensitive filesystem */
public abstract class C200410p extends C200310o {
    public static final int A0G(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        return objArr.length - 1;
    }

    public static final int A0H(Object[] objArr, Object obj) {
        C18070vi.A0d(objArr, 0);
        int i = 0;
        int length = objArr.length;
        if (obj == null) {
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            return -1;
        }
        while (i < length) {
            if (!obj.equals(objArr[i])) {
                i++;
            }
        }
        return -1;
        return i;
    }

    public static final String A0I(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AnonymousClass1Y6.A00(sb, obj, (C22821Di) null);
        }
        sb.append(charSequence3);
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }

    public static final List A0K(C25411Oc r2, byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        if (r2.A04()) {
            return C18460wS.A00;
        }
        return new AnonymousClass3F3(C200310o.A09(bArr, r2.A00, r2.A01 + 1));
    }

    public static final List A0L(byte[] bArr) {
        int i = 0;
        C18070vi.A0d(bArr, 0);
        int length = bArr.length;
        if (length == 0) {
            return C18460wS.A00;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(length);
            do {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            } while (i < length);
            return arrayList;
        }
        List singletonList = Collections.singletonList(Byte.valueOf(bArr[0]));
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final List A0M(byte[] bArr, int i) {
        if (i >= r4) {
            return A0L(bArr);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final List A0N(int[] iArr) {
        int i = 0;
        C18070vi.A0d(iArr, 0);
        int length = iArr.length;
        if (length == 0) {
            return C18460wS.A00;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(length);
            do {
                arrayList.add(Integer.valueOf(iArr[i]));
                i++;
            } while (i < length);
            return arrayList;
        }
        List singletonList = Collections.singletonList(Integer.valueOf(iArr[0]));
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final List A0O(long[] jArr) {
        C18070vi.A0d(jArr, 0);
        int length = jArr.length;
        if (length == 0) {
            return C18460wS.A00;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            do {
                arrayList.add(Long.valueOf(jArr[i]));
                i++;
            } while (i < length);
            return arrayList;
        }
        List singletonList = Collections.singletonList(Long.valueOf(jArr[0]));
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final List A0P(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List A0Q(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        int length = objArr.length;
        if (length == 0) {
            return C18460wS.A00;
        }
        if (length != 1) {
            return new ArrayList(new AnonymousClass1ZV(objArr, false));
        }
        List singletonList = Collections.singletonList(objArr[0]);
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final Set A0S(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C25511Om.A00;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(length));
            A0T(linkedHashSet, objArr);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        C18070vi.A0X(singleton);
        return singleton;
    }

    public static final void A0T(Collection collection, Object[] objArr) {
        for (Object add : objArr) {
            collection.add(add);
        }
    }

    public static final boolean A0V(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (i != iArr[i2]) {
                i2++;
            } else if (i2 < 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static final byte[] A0W(C25411Oc r2, byte[] bArr) {
        if (r2.A04()) {
            return new byte[0];
        }
        return C200310o.A09(bArr, r2.A00, r2.A01 + 1);
    }

    public static final String A0J(C22821Di r7, byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append("");
            }
            sb.append((CharSequence) r7.invoke(Byte.valueOf(b)));
        }
        sb.append("");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final List A0R(Object[] objArr, int i) {
        if (i >= 0) {
            int length = objArr.length;
            int i2 = length - i;
            if (i2 < 0 || i2 == 0) {
                return C18460wS.A00;
            }
            if (i2 >= length) {
                return A0Q(objArr);
            }
            if (i2 == 1) {
                List singletonList = Collections.singletonList(objArr[length - 1]);
                C18070vi.A0X(singletonList);
                return singletonList;
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(objArr[i3]);
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final boolean A0U(Object obj, Object[] objArr) {
        if (A0H(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }
}
