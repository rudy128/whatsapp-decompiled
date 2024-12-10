package X;

import java.util.Enumeration;

/* renamed from: X.DxY  reason: case insensitive filesystem */
public class C28326DxY extends AnonymousClass1By implements AnonymousClass1Bw {
    public C28337Dxj A00;
    public C28340Dxm A01;
    public C28340Dxm A02;
    public C28340Dxm A03;
    public C28340Dxm A04;
    public C28325DxX A05;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Dxl, X.1Bz] */
    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(6);
        csy.A02(this.A00);
        csy.A02(this.A03);
        csy.A02(this.A05);
        C28340Dxm dxm = this.A01;
        if (dxm != null) {
            C28341Dxn.A07(dxm, csy, false);
        }
        C28340Dxm dxm2 = this.A02;
        if (dxm2 != null) {
            C28341Dxn.A05(dxm2, csy);
        }
        csy.A02(this.A04);
        ? obj = new Object();
        obj.A00 = csy.A03();
        return obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.DxY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.DxX, java.lang.Object] */
    public static C28326DxY A01(Object obj) {
        C28325DxX dxX;
        if (obj instanceof C28326DxY) {
            return (C28326DxY) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A052 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        Enumeration A0L = A052.A0L();
        obj2.A00 = (C28337Dxj) A0L.nextElement();
        obj2.A03 = (C28340Dxm) A0L.nextElement();
        Object nextElement = A0L.nextElement();
        if (nextElement instanceof C28325DxX) {
            dxX = (C28325DxX) nextElement;
        } else if (nextElement != null) {
            C28339Dxl A053 = C28339Dxl.A05(nextElement);
            ? obj3 = new Object();
            obj3.A02 = true;
            Enumeration A0L2 = A053.A0L();
            obj3.A01 = (AnonymousClass1C0) A0L2.nextElement();
            if (A0L2.hasMoreElements()) {
                obj3.A00 = C28341Dxn.A02((C28341Dxn) A0L2.nextElement());
            }
            obj3.A02 = A053 instanceof C28354Dy0;
            dxX = obj3;
        } else {
            dxX = null;
        }
        obj2.A05 = dxX;
        while (A0L.hasMoreElements()) {
            AnonymousClass1Bz r1 = (AnonymousClass1Bz) A0L.nextElement();
            if (r1 instanceof C28341Dxn) {
                C28341Dxn dxn = (C28341Dxn) r1;
                int i = dxn.A00;
                if (i == 0) {
                    obj2.A01 = C28340Dxm.A03(dxn);
                } else if (i == 1) {
                    obj2.A02 = C28340Dxm.A03(dxn);
                } else {
                    throw AnonymousClass001.A13("unknown tag value ", AnonymousClass000.A10(), i);
                }
            } else {
                obj2.A04 = (C28340Dxm) r1;
            }
        }
        return obj2;
    }
}
