package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.D9k  reason: case insensitive filesystem */
public class C26687D9k implements E9Q {
    public E9Q A00;
    public final E9Q A01;
    public final Map A02;

    public Uri Bb3() {
        return null;
    }

    public long CAj(C26115Csd csd) {
        String str;
        E9Q e9q;
        C26115Csd csd2 = csd;
        Map map = this.A02;
        if (map.size() == 1) {
            Iterator A0l = C17890vO.A0l(map);
            str = null;
            while (A0l.hasNext()) {
                str = C17880vN.A0v(A0l);
            }
        } else {
            str = C17880vN.A0s(csd2.A06, map);
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(C108945cZ.A17(str));
            long j = csd2.A01;
            long j2 = csd2.A03;
            long j3 = csd2.A02;
            csd2 = new C26115Csd(fromFile, csd2.A05, csd2.A06, (byte[]) null, csd2.A00, j, j2, j3);
            e9q = new C26688D9l(false);
        } else {
            e9q = this.A01;
        }
        this.A00 = e9q;
        return e9q.CAj(csd2);
    }

    public void close() {
        E9Q e9q = this.A00;
        if (e9q != null) {
            e9q.close();
            this.A00 = null;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        E9Q e9q = this.A00;
        if (e9q == null) {
            return -1;
        }
        return e9q.read(bArr, i, i2);
    }

    public C26687D9k(E9Q e9q, Map map) {
        this.A01 = e9q;
        this.A02 = map;
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        this.A01.BBr(e8b);
    }
}
