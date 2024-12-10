package X;

import java.util.Hashtable;

/* renamed from: X.DYt  reason: case insensitive filesystem */
public class C27194DYt implements C28600E9r {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public C28599E9q A02;
    public byte[] A03;
    public byte[] A04;
    public E8N A05;
    public E8N A06;

    public void BJ5(byte[] bArr, int i) {
        C28599E9q e9q = this.A02;
        byte[] bArr2 = this.A04;
        int i2 = this.A00;
        e9q.BJ6(bArr2, i2);
        E8N e8n = this.A06;
        if (e8n != null) {
            ((E8N) e9q).CFg(e8n);
            e9q.update(bArr2, i2, e9q.BQf());
        } else {
            e9q.update(bArr2, 0, bArr2.length);
        }
        e9q.BJ6(bArr, i);
        while (i2 < bArr2.length) {
            bArr2[i2] = 0;
            i2++;
        }
        E8N e8n2 = this.A05;
        if (e8n2 != null) {
            ((E8N) e9q).CFg(e8n2);
            return;
        }
        byte[] bArr3 = this.A03;
        e9q.update(bArr3, 0, bArr3.length);
    }

    public int BUJ() {
        return this.A01;
    }

    public void CQK(byte b) {
        this.A02.CQK(b);
    }

    public void reset() {
        C28599E9q e9q = this.A02;
        e9q.reset();
        byte[] bArr = this.A03;
        e9q.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A02.update(bArr, i, i2);
    }

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public C27194DYt(C28599E9q e9q) {
        int intValue;
        if (e9q instanceof EEP) {
            intValue = ((EEP) e9q).BNv();
        } else {
            Number number = (Number) A07.get(e9q.BMl());
            if (number != null) {
                intValue = number.intValue();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("unknown digest passed: ");
                throw AnonymousClass001.A12(e9q.BMl(), A10);
            }
        }
        this.A02 = e9q;
        int BQf = e9q.BQf();
        this.A01 = BQf;
        this.A00 = intValue;
        this.A03 = new byte[intValue];
        this.A04 = new byte[(intValue + BQf)];
    }

    public void BdA(E3O e3o) {
        byte[] bArr;
        int length;
        C28599E9q e9q = this.A02;
        e9q.reset();
        byte[] bArr2 = ((C27190DYo) e3o).A00;
        int length2 = bArr2.length;
        int i = this.A00;
        if (length2 > i) {
            e9q.update(bArr2, 0, length2);
            bArr = this.A03;
            e9q.BJ6(bArr, 0);
            length2 = this.A01;
        } else {
            bArr = this.A03;
            System.arraycopy(bArr2, 0, bArr, 0, length2);
        }
        while (true) {
            length = bArr.length;
            if (length2 >= length) {
                break;
            }
            bArr[length2] = 0;
            length2++;
        }
        byte[] bArr3 = this.A04;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ 92);
        }
        boolean z = e9q instanceof E8N;
        if (z) {
            E8N BFx = ((E8N) e9q).BFx();
            this.A06 = BFx;
            ((C28599E9q) BFx).update(bArr3, 0, i);
        }
        e9q.update(bArr, 0, length);
        if (z) {
            this.A05 = ((E8N) e9q).BFx();
        }
    }
}
