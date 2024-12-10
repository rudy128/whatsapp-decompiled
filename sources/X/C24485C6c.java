package X;

/* renamed from: X.C6c  reason: case insensitive filesystem */
public abstract class C24485C6c {
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public C27190DYo A01(int i) {
        if ((this instanceof C28384DyU) || (this instanceof C28381DyR) || !(this instanceof C28382DyS)) {
            return A02(i);
        }
        int i2 = i / 8;
        return new C27190DYo(C28382DyS.A00((C28382DyS) this, 3, i2), 0, i2);
    }

    public C27190DYo A02(int i) {
        int i2;
        byte[] A002;
        if (this instanceof C28384DyU) {
            i2 = i / 8;
            A002 = C28384DyU.A00((C28384DyU) this, i2);
        } else if (this instanceof C28381DyR) {
            C28381DyR dyR = (C28381DyR) this;
            i2 = i / 8;
            if (i2 <= dyR.A00.BQf()) {
                A002 = C28381DyR.A00(dyR);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Can't generate a derived key ");
                A10.append(i2);
                throw AnonymousClass001.A12(" bytes long.", A10);
            }
        } else if (this instanceof C28382DyS) {
            i2 = i / 8;
            A002 = C28382DyS.A00((C28382DyS) this, 1, i2);
        } else {
            i2 = i / 8;
            A002 = C28383DyT.A00((C28383DyT) this, i2);
        }
        return new C27190DYo(A002, 0, i2);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.DYm] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.DYm] */
    public DYm A03(int i, int i2) {
        int i3;
        int i4;
        byte[] A002;
        if (this instanceof C28384DyU) {
            i3 = i / 8;
            i4 = i2 / 8;
            A002 = C28384DyU.A00((C28384DyU) this, i3 + i4);
        } else if (this instanceof C28381DyR) {
            C28381DyR dyR = (C28381DyR) this;
            i3 = i / 8;
            i4 = i2 / 8;
            int i5 = i3 + i4;
            if (i5 <= dyR.A00.BQf()) {
                A002 = C28381DyR.A00(dyR);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Can't generate a derived key ");
                A10.append(i5);
                throw AnonymousClass001.A12(" bytes long.", A10);
            }
        } else if (this instanceof C28382DyS) {
            C28382DyS dyS = (C28382DyS) this;
            int i6 = i / 8;
            int i7 = i2 / 8;
            byte[] A003 = C28382DyS.A00(dyS, 1, i6);
            byte[] A004 = C28382DyS.A00(dyS, 2, i7);
            C27190DYo dYo = new C27190DYo(A003, 0, i6);
            ? obj = new Object();
            byte[] bArr = new byte[i7];
            obj.A01 = bArr;
            obj.A00 = dYo;
            System.arraycopy(A004, 0, bArr, 0, i7);
            return obj;
        } else {
            i3 = i / 8;
            i4 = i2 / 8;
            A002 = C28383DyT.A00((C28383DyT) this, i3 + i4);
        }
        C27190DYo dYo2 = new C27190DYo(A002, 0, i3);
        ? obj2 = new Object();
        byte[] bArr2 = new byte[i4];
        obj2.A01 = bArr2;
        obj2.A00 = dYo2;
        System.arraycopy(A002, i3, bArr2, 0, i4);
        return obj2;
    }
}
