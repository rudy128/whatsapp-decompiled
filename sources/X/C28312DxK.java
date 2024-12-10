package X;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: X.DxK  reason: case insensitive filesystem */
public class C28312DxK extends AnonymousClass1By {
    public static final Hashtable A01 = new Hashtable();
    public static final String[] A02;
    public C28335Dxh A00;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    static {
        String[] strArr = new String[11];
        BEB.A1X(strArr);
        A02 = strArr;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.DxK] */
    public static C28312DxK A01(Object obj) {
        if (!(obj instanceof C28312DxK)) {
            if (obj == null) {
                return null;
            }
            int A0K = C28335Dxh.A02(obj).A0K();
            Integer valueOf = Integer.valueOf(A0K);
            Hashtable hashtable = A01;
            if (!hashtable.containsKey(valueOf)) {
                ? obj2 = new Object();
                obj2.A00 = new C28335Dxh(A0K);
                hashtable.put(valueOf, obj2);
            }
            obj = hashtable.get(valueOf);
        }
        return (C28312DxK) obj;
    }

    public String toString() {
        String str;
        int intValue = new BigInteger(this.A00.A00).intValue();
        if (intValue < 0 || intValue > 10) {
            str = "invalid";
        } else {
            str = A02[intValue];
        }
        return AnonymousClass001.A1H("CRLReason: ", str, AnonymousClass000.A10());
    }
}
