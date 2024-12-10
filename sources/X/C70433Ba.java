package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.3Ba  reason: invalid class name and case insensitive filesystem */
public class C70433Ba implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object keys;
    public final Object values;

    public final Object legacyReadResolve() {
        Object[] objArr = (Object[]) this.keys;
        Object[] objArr2 = (Object[]) this.values;
        C201210x makeBuilder = makeBuilder(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            makeBuilder.put(objArr[i], objArr2[i]);
        }
        return makeBuilder.buildOrThrow();
    }

    public C201210x makeBuilder(int i) {
        return new C201210x(i);
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (!(obj instanceof C199410f)) {
            return legacyReadResolve();
        }
        C199310e r2 = (C199310e) obj;
        C201210x makeBuilder = makeBuilder(r2.size());
        AnonymousClass1IZ it = r2.iterator();
        AnonymousClass1IZ it2 = ((C199310e) this.values).iterator();
        while (it.hasNext()) {
            makeBuilder.put(it.next(), it2.next());
        }
        return makeBuilder.buildOrThrow();
    }

    public C70433Ba(C201110w r7) {
        Object[] objArr = new Object[r7.size()];
        Object[] objArr2 = new Object[r7.size()];
        AnonymousClass1IZ it = r7.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            objArr[i] = A16.getKey();
            objArr2[i] = A16.getValue();
            i++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }
}
