package X;

import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.Bxg  reason: case insensitive filesystem */
public class C24228Bxg extends OutputStream {
    public boolean A00 = false;
    public final C28475E2q A01;

    public void close() {
        this.A00 = true;
    }

    public void write(byte[] bArr, int i, int i2) {
        List list;
        if (!this.A00) {
            C27347DcJ dcJ = (C27347DcJ) this.A01;
            try {
                int i3 = i2;
                CWK cwk = new CWK(bArr, i, i3);
                if (dcJ.A0C && !dcJ.A0B) {
                    C27006DPc dPc = dcJ.A02;
                    if (!(!dPc.A0Y || dPc.A0R == null || (list = dPc.A0S) == null)) {
                        dPc.A0Z = true;
                        long j = (long) i3;
                        long j2 = dPc.A0C.A01.maxEarlyDataSize;
                        if (dPc.A04 + j > j2) {
                            dPc.A04 = j2;
                            long j3 = dPc.A05 + j;
                            long j4 = dPc.A06;
                            if (j3 <= j4) {
                                dPc.A05 = j3;
                                list.add(cwk);
                                return;
                            }
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Client request exceeded the max spillover limit ");
                            A10.append(j3);
                            throw BE9.A0b(C17890vO.A0a(" > ", A10, j4), (byte) 80);
                        }
                        dcJ.A06.A00(new C24829CLx(cwk));
                        dcJ.A02.A0R.add(cwk);
                        dcJ.A02.A04 += j;
                        return;
                    }
                }
                dcJ.A06.A00(new C24829CLx(cwk));
            } catch (C219718c e) {
                C27347DcJ.A06(dcJ, e.ex, (byte) 2, e.description, e.errorTransient);
            } catch (Exception e2) {
                C27347DcJ.A06(dcJ, new SSLException(BE9.A0u(e2)), (byte) 2, (byte) 80, false);
            }
        } else {
            throw C17880vN.A0f("Stream is closed.");
        }
    }

    public C24228Bxg(C28475E2q e2q) {
        this.A01 = e2q;
    }

    public void write(int i) {
        if (!this.A00) {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
            return;
        }
        throw C17880vN.A0f("Stream is closed.");
    }

    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw C17880vN.A0f("Stream is closed.");
    }
}
