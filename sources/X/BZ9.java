package X;

import java.util.Map;

public final class BZ9 extends C26126Cso implements C1593684g {
    public static final C24924CPx A01;
    public static final C22993BYp A02;
    public static final C24599CAv A03;
    public C25829Cmg A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CAv] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.BYp] */
    static {
        ? obj = new Object();
        A03 = obj;
        ? obj2 = new Object();
        A02 = obj2;
        A01 = new C24924CPx(obj2, obj, "Nearby.CONNECTIONS_API");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.CWx, java.lang.Object] */
    public static final void A00(BZ9 bz9, String str) {
        CWD A002;
        C25829Cmg cmg = bz9.A00;
        synchronized (cmg) {
            Map map = cmg.A00;
            if (!map.containsKey(str)) {
                map.put(str, C17880vN.A0p());
            }
            A002 = cmg.A00(bz9, map.get(str), "connection");
        }
        C25829Cmg cmg2 = bz9.A00;
        ? obj = new Object();
        obj.A04 = DTT.A00;
        obj.A01 = A002;
        obj.A02 = C26897DIe.A00;
        obj.A03 = C26898DIf.A00;
        obj.A00 = 1268;
        cmg2.A03(bz9, obj.A00());
    }

    public static final void A01(BZ9 bz9, String str) {
        CYG A002;
        C25829Cmg cmg = bz9.A00;
        synchronized (cmg) {
            Map map = cmg.A00;
            if (!map.containsKey(str)) {
                map.put(str, C17880vN.A0p());
            }
            A002 = C25934Coz.A00(map.get(str), "connection");
        }
        cmg.A02(bz9, A002);
    }
}
