package X;

import java.util.Map;

/* renamed from: X.1dj  reason: invalid class name and case insensitive filesystem */
public abstract class C30311dj implements C30301di {
    public C30071dL A00;

    public void BKB(Object obj, String str, String str2, int i, int i2) {
        if (this instanceof C30321dk) {
            this.A00.flowEndFail(A00(), str, str2);
            ((C30321dk) this).A00 = -1;
        }
    }

    public void BKH(Object obj, int i, int i2) {
        if (this instanceof C30321dk) {
            this.A00.flowEndSuccess(A00());
            ((C30321dk) this).A00 = -1;
        }
    }

    public void Bim(Object obj, String str, String str2, int i, int i2) {
        if (this instanceof C30321dk) {
            this.A00.flowMarkError(A00(), str, str2);
            ((C30321dk) this).A00 = -1;
        }
    }

    public long A00() {
        if (this instanceof C30321dk) {
            return ((C30321dk) this).A00;
        }
        return 0;
    }

    public void A01() {
        if (this instanceof C30321dk) {
            C30321dk r6 = (C30321dk) this;
            long j = r6.A00;
            if (j != -1) {
                r6.A00.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                r6.A00.flowEndFail(r6.A00, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
            }
        }
    }

    public void A02(String str, Object obj) {
        C30071dL r3;
        long A002;
        String obj2;
        if (obj != null) {
            String str2 = str;
            if (obj instanceof Long) {
                this.A00.flowAnnotate(A00(), str2, ((Number) obj).longValue());
            } else if (obj instanceof Double) {
                C30071dL r32 = this.A00;
                long A003 = A00();
                double doubleValue = ((Number) obj).doubleValue();
                ((C30081dM) r32).A00.markerAnnotate((int) A003, (int) (A003 >>> 32), str2, doubleValue);
            } else if (obj instanceof Integer) {
                this.A00.flowAnnotate(A00(), str, ((Number) obj).intValue());
            } else {
                if (obj instanceof String) {
                    r3 = this.A00;
                    A002 = A00();
                    obj2 = (String) obj;
                } else {
                    boolean z = obj instanceof Boolean;
                    r3 = this.A00;
                    A002 = A00();
                    if (z) {
                        r3.flowAnnotate(A002, str, ((Boolean) obj).booleanValue());
                        return;
                    }
                    obj2 = obj.toString();
                }
                r3.flowAnnotate(A002, str, obj2);
            }
        }
    }

    public void BC6(Object obj, Map map, int i, int i2) {
        if ((this instanceof C30321dk) && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                A02((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public void Bin(Object obj, String str, Map map, int i, int i2) {
        if (this instanceof C30321dk) {
            this.A00.flowMarkPoint(A00(), str);
        }
    }

    public void COL(Object obj, String str, int i, int i2, boolean z) {
        if (this instanceof C30321dk) {
            A01();
            this.A00.BLQ(new C58442kh(str, z), A00());
        }
    }

    public void BK9(Object obj, String str, int i, int i2) {
        long A002 = A00();
        if (this instanceof C30321dk) {
            this.A00.flowEndCancel(A002, str);
            ((C30321dk) this).A00 = -1;
        }
    }
}
