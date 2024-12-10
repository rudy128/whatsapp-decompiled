package X;

import java.util.Iterator;

/* renamed from: X.Dy2  reason: case insensitive filesystem */
public class C28356Dy2 extends C28339Dxl {
    public byte[] A00;

    public synchronized int A0D() {
        int i;
        byte[] bArr = this.A00;
        if (bArr != null) {
            int length = bArr.length;
            i = C26084Cs1.A00(length) + 1 + length;
        } else {
            i = super.A0F().A0D();
        }
        return i;
    }

    public synchronized AnonymousClass1Bz A0E() {
        A09(this);
        return super.A0E();
    }

    public synchronized AnonymousClass1Bz A0F() {
        A09(this);
        return super.A0F();
    }

    public synchronized void A0G(C26039Cr0 cr0, boolean z) {
        byte[] bArr = this.A00;
        if (bArr != null) {
            cr0.A06(bArr, 48, z);
        } else {
            super.A0F().A0G(cr0, z);
        }
    }

    public synchronized int hashCode() {
        A09(this);
        return super.hashCode();
    }

    public synchronized Iterator iterator() {
        A09(this);
        return super.iterator();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.DUd, java.lang.Object] */
    public static void A09(C28356Dy2 dy2) {
        byte[] bArr = dy2.A00;
        if (bArr != null) {
            C26135Csy csy = new C26135Csy();
            ? obj = new Object();
            obj.A01 = new C24178Bwo(bArr, true);
            obj.A00 = C27099DUd.A00(obj);
            while (obj.hasMoreElements()) {
                csy.A02((AnonymousClass1By) obj.nextElement());
            }
            dy2.A00 = csy.A03();
            dy2.A00 = null;
        }
    }
}
