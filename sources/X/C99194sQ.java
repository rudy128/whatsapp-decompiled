package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.4sQ  reason: invalid class name and case insensitive filesystem */
public class C99194sQ implements C18080vj, C22821Di {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C99194sQ(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            int i = this.A01;
            boolean A1Y = AnonymousClass000.A1Y(obj);
            AnonymousClass4S3 A002 = C87704Wq.A00((C87704Wq) this.A02, i);
            if (A002 != null) {
                A002.A01 = A1Y;
            }
            return C27621Wu.A00;
        }
        int i2 = this.A01;
        Set set = (Set) this.A02;
        Map.Entry entry = (Map.Entry) obj;
        boolean z = true;
        if (i2 != 1 ? i2 != 2 || set.contains(entry.getKey()) : set.contains(entry.getValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
