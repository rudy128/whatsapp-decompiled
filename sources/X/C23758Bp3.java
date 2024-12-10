package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Bp3  reason: case insensitive filesystem */
public class C23758Bp3 extends C25836Cmq {
    public final Object A00;
    public final boolean A01 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C23758Bp3)) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = ((C23758Bp3) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (!obj2.equals(obj3)) {
                return false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Du6, X.CtO] */
    public Object A09() {
        try {
            if (this.A01) {
                return this.A00;
            }
            return new C26156CtO(-1).A0D(this.A00.toString(), C25453Cg5.A02.A00);
        } catch (C2P e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public C23758Bp3(CharSequence charSequence) {
        this.A00 = charSequence.toString();
    }

    public static C25836Cmq A00(C25836Cmq cmq) {
        return cmq.A03().A08();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Bp4, X.Cmq] */
    public C25836Cmq A08() {
        if (!(A09() instanceof List)) {
            return EB4.A03;
        }
        List<Object> unmodifiableList = Collections.unmodifiableList((List) A09());
        ? obj = new Object();
        obj.A00 = AnonymousClass000.A13();
        for (Object A02 : unmodifiableList) {
            obj.A00.add(C25836Cmq.A02(A02));
        }
        return obj;
    }

    public C23758Bp3(Object obj) {
        this.A00 = obj;
    }
}
