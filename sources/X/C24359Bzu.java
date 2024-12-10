package X;

import java.util.Map;

/* renamed from: X.Bzu  reason: case insensitive filesystem */
public enum C24359Bzu {
    A09("OBJECT", 0),
    A03("BOOLEAN", 1),
    A05("CHAR", 2),
    A07("FLOAT", 4),
    A06("DOUBLE", 8),
    A04("BYTE", 1),
    A0A("SHORT", 2),
    A08("INT", 4);
    
    public static final Map A00 = null;
    public final int size;
    public final int typeId;

    /* access modifiers changed from: public */
    static {
        C24359Bzu[] bzuArr;
        C19820z3<C24359Bzu> A002 = C19780yz.A00(bzuArr);
        A01 = A002;
        A00 = C17880vN.A11();
        for (C24359Bzu bzu : A002) {
            C17880vN.A1O(bzu, A00, bzu.typeId);
        }
    }

    /* access modifiers changed from: public */
    C24359Bzu(String str, int i) {
        this.typeId = r2;
        this.size = i;
    }
}
