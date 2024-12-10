package X;

import java.util.List;

/* renamed from: X.288  reason: invalid class name */
public class AnonymousClass288 extends C24490C6i {
    public final /* synthetic */ AnonymousClass7Q7 A00;

    public AnonymousClass288(AnonymousClass7Q7 r1) {
        this.A00 = r1;
    }

    public int A00() {
        return ((List) this.A00.A04).size();
    }

    public int A01() {
        return ((List) this.A00.A05).size();
    }

    public Object A02(int i, int i2) {
        AnonymousClass7Q7 r3 = this.A00;
        Object obj = ((List) r3.A05).get(i);
        Object obj2 = ((List) r3.A04).get(i2);
        if (obj != null && obj2 != null) {
            return ((C40431uh) r3.A02).A04.A00.A00(obj, obj2);
        }
        throw new AssertionError();
    }

    public boolean A03(int i, int i2) {
        AnonymousClass7Q7 r3 = this.A00;
        Object obj = ((List) r3.A05).get(i);
        Object obj2 = ((List) r3.A04).get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return ((C40431uh) r3.A02).A04.A00.A01(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i, int i2) {
        AnonymousClass7Q7 r3 = this.A00;
        Object obj = ((List) r3.A05).get(i);
        Object obj2 = ((List) r3.A04).get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return ((C40431uh) r3.A02).A04.A00.A02(obj, obj2);
            }
            return false;
        } else if (obj2 != null) {
            return false;
        } else {
            return true;
        }
    }
}
