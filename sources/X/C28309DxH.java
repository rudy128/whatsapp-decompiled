package X;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.DxH  reason: case insensitive filesystem */
public class C28309DxH extends AnonymousClass1By {
    public Hashtable A00;
    public Vector A01;

    public AnonymousClass1Bz CP9() {
        Vector vector = this.A01;
        C26135Csy csy = new C26135Csy(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            csy.A02((AnonymousClass1By) this.A00.get(elements.nextElement()));
        }
        return new C28357Dy3(csy);
    }

    public static C28314DxM A01(Object obj, C28309DxH dxH) {
        return (C28314DxM) dxH.A00.get(obj);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.DxH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.DxM] */
    public static C28309DxH A02(Object obj) {
        C28314DxM dxM;
        AnonymousClass1Bx A0M;
        if (obj instanceof C28309DxH) {
            return (C28309DxH) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = new Hashtable();
        obj2.A01 = new Vector();
        Enumeration A0L = A05.A0L();
        while (A0L.hasMoreElements()) {
            Object nextElement = A0L.nextElement();
            AnonymousClass1C0 r0 = C28314DxM.A03;
            if (nextElement instanceof C28314DxM) {
                dxM = (C28314DxM) nextElement;
            } else if (nextElement != null) {
                C28339Dxl A052 = C28339Dxl.A05(nextElement);
                ? obj3 = new Object();
                if (A052.A0K() == 2) {
                    obj3.A00 = AnonymousClass1C0.A02(A052.A0M(0));
                    obj3.A02 = false;
                    A0M = A052.A0M(1);
                } else if (A052.A0K() == 3) {
                    obj3.A00 = AnonymousClass1C0.A02(A052.A0M(0));
                    obj3.A02 = AnonymousClass000.A1O(C28336Dxi.A02(A052.A0M(1)).A00);
                    A0M = A052.A0M(2);
                } else {
                    throw C28339Dxl.A02(A052);
                }
                obj3.A01 = C28342Dxo.A03(A0M);
                dxM = obj3;
            } else {
                dxM = null;
            }
            Hashtable hashtable = obj2.A00;
            AnonymousClass1C0 r2 = dxM.A00;
            if (!hashtable.containsKey(r2)) {
                obj2.A00.put(r2, dxM);
                obj2.A01.addElement(r2);
            } else {
                throw AnonymousClass8BX.A0V(r2, "repeated extension found: ", AnonymousClass000.A10());
            }
        }
        return obj2;
    }
}
