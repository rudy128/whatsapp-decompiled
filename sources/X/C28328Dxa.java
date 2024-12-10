package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;

/* renamed from: X.Dxa  reason: case insensitive filesystem */
public class C28328Dxa extends C28342Dxo {
    public final C28342Dxo[] A00;

    public int A0D() {
        Enumeration A0K = A0K();
        int i = 0;
        while (A0K.hasMoreElements()) {
            i += ((AnonymousClass1Bx) A0K.nextElement()).CP9().A0D();
        }
        return i + 2 + 2;
    }

    public boolean A0H() {
        return true;
    }

    public Enumeration A0K() {
        return new C27101DUf(this, this.A00 == null ? 2 : 3);
    }

    public C28328Dxa(C28342Dxo[] dxoArr) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        int i = 0;
        while (i != dxoArr.length) {
            try {
                A15.write(dxoArr[i].A00);
                i++;
            } catch (IOException e) {
                throw AnonymousClass000.A0k(BEA.A0j(e, "exception converting octets ", AnonymousClass000.A10()));
            }
        }
        byte[] byteArray = A15.toByteArray();
        if (byteArray != null) {
            this.A00 = byteArray;
            this.A00 = dxoArr;
            return;
        }
        throw AnonymousClass000.A0s("'string' cannot be null");
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        Enumeration A0K = A0K();
        if (z) {
            C26039Cr0.A01(cr0, 36);
        }
        C26039Cr0.A01(cr0, 128);
        while (A0K.hasMoreElements()) {
            cr0.A05(((AnonymousClass1Bx) A0K.nextElement()).CP9(), true);
        }
        C26039Cr0.A01(cr0, 0);
        C26039Cr0.A01(cr0, 0);
    }

    public C28328Dxa(byte[] bArr) {
        if (bArr != null) {
            this.A00 = bArr;
            this.A00 = null;
            return;
        }
        throw AnonymousClass000.A0s("'string' cannot be null");
    }
}
