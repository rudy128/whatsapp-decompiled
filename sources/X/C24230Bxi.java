package X;

import java.io.OutputStream;

/* renamed from: X.Bxi  reason: case insensitive filesystem */
public final class C24230Bxi extends OutputStream {
    public int A00;
    public DRN A01;
    public final BSG A02;

    public void write(byte[] bArr, int i, int i2) {
        C18070vi.A0d(bArr, 0);
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("length=");
            A10.append(bArr.length);
            A10.append("; regionStart=");
            A10.append(i);
            throw BEA.A0Z("; regionLength=", A10, i2);
        } else if (DRN.A02(this.A01)) {
            int i3 = this.A00 + i2;
            if (DRN.A02(this.A01)) {
                DRN drn = this.A01;
                if (drn != null) {
                    if (i3 > ((EAI) drn.A05()).BZK()) {
                        BSG bsg = this.A02;
                        Object obj = bsg.get(i3);
                        C18070vi.A0X(obj);
                        EAI eai = (EAI) obj;
                        DRN drn2 = this.A01;
                        if (drn2 != null) {
                            ((EAI) drn2.A05()).BFy(eai, this.A00);
                            DRN drn3 = this.A01;
                            C18070vi.A0b(drn3);
                            drn3.close();
                            this.A01 = DRN.A00(bsg, eai);
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                    DRN drn4 = this.A01;
                    if (drn4 != null) {
                        ((EAI) drn4.A05()).CSN(this.A00, bArr, i, i2);
                        this.A00 += i2;
                        return;
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw new C27204DZd();
        } else {
            throw new C27204DZd();
        }
    }

    public DRG A00() {
        if (DRN.A02(this.A01)) {
            DRN drn = this.A01;
            if (drn != null) {
                return new DRG(drn, this.A00);
            }
            throw C17880vN.A0g();
        }
        throw new C27204DZd();
    }

    public void close() {
        DRN drn = this.A01;
        if (drn != null) {
            drn.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public C24230Bxi(BSG bsg, int i) {
        if (i > 0) {
            this.A02 = bsg;
            this.A00 = 0;
            this.A01 = DRN.A00(bsg, bsg.get(i));
            return;
        }
        throw AnonymousClass000.A0n("Check failed.");
    }

    public C24230Bxi() {
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }
}
