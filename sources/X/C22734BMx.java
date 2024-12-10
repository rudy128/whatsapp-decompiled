package X;

/* renamed from: X.BMx  reason: case insensitive filesystem */
public class C22734BMx extends AnonymousClass29P {
    public /* bridge */ /* synthetic */ Object A06(C40511up r10, float f) {
        Object obj;
        float floatValue;
        C25723Ckt ckt = this.A03;
        float f2 = f;
        if (ckt != null) {
            float f3 = r10.A0A;
            Float f4 = r10.A06;
            if (f4 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f4.floatValue();
            }
            Object obj2 = r10.A0E;
            Object obj3 = r10.A07;
            if (obj3 == null) {
                obj3 = obj2;
            }
            return ckt.A01(obj2, obj3, f3, floatValue, f2, A03(), this.A02);
        } else if (f != 1.0f || (obj = r10.A07) == null) {
            return r10.A0E;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.CT7] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CXZ, java.lang.Object] */
    public void A0C(C25723Ckt ckt) {
        super.A0B(new BN7(this, new Object(), new Object(), ckt));
    }
}
