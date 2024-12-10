package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Cky  reason: case insensitive filesystem */
public class C25728Cky {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public C62 A00(short s) {
        int intValue;
        Number A1E = C108945cZ.A1E(Short.valueOf(s), this.A03);
        if (A1E == null || (intValue = A1E.intValue()) >= this.A00) {
            return null;
        }
        return (C62) this.A02.get(intValue);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.C62, java.lang.Object] */
    public C25728Cky(byte[] bArr) {
        int length = bArr.length;
        this.A03 = C17880vN.A11();
        int i = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList A13 = AnonymousClass000.A13();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i < length) {
            short s = wrap.getShort();
            int A002 = C26287Cwn.A00(wrap);
            byte[] bArr2 = new byte[A002];
            wrap.get(bArr2);
            ? obj = new Object();
            obj.A00 = s;
            obj.A01 = bArr2;
            A13.add(obj);
            C17880vN.A1P(Short.valueOf(s), this.A03, this.A00);
            this.A00++;
            i += A002 + 4;
        }
        if (i == length) {
            this.A01 = i;
            this.A02 = AnonymousClass000.A13();
            this.A02 = C17880vN.A10(A13);
            return;
        }
        throw BEA.A0X("Error while parsing extension");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("extensions{extensions=");
        BE6.A1L(A10, this.A02.toArray());
        A10.append(", idx=");
        A10.append(this.A00);
        A10.append(", totalNetworkBytes=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }

    public C25728Cky() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = AnonymousClass000.A13();
    }
}
