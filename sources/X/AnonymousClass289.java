package X;

/* renamed from: X.289  reason: invalid class name */
public class AnonymousClass289 extends C24490C6i {
    public final /* synthetic */ AnonymousClass1IX A00;
    public final /* synthetic */ AnonymousClass1IX A01;
    public final /* synthetic */ C55242fS A02;

    public AnonymousClass289(AnonymousClass1IX r1, AnonymousClass1IX r2, C55242fS r3) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public Object A02(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null && obj2 != null) {
            return this.A02.A02.A00.A00(obj, obj2);
        }
        throw new AssertionError();
    }

    public boolean A03(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.A02.A02.A00.A01(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.A02.A02.A00.A02(obj, obj2);
            }
            return false;
        } else if (obj2 != null) {
            return false;
        } else {
            return true;
        }
    }
}
