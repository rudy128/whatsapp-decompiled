package X;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class DAN implements C28590E9f {
    public final CET A00;
    public final E4K A01;
    public final String A02;
    public volatile C24850CMt A03 = new C24850CMt((C28590E9f) null, (File) null);

    public synchronized C28590E9f A00() {
        C28590E9f e9f;
        File file;
        C24850CMt cMt = this.A03;
        if (cMt.A00 == null || (file = cMt.A01) == null || !file.exists()) {
            if (!(this.A03.A00 == null || this.A03.A01 == null)) {
                C24543C8o.A00(this.A03.A01);
            }
            File A0e = C17880vN.A0e((File) this.A01.get(), this.A02);
            try {
                C24544C8p.A00(A0e);
                Class<DAN> cls = DAN.class;
                String absolutePath = A0e.getAbsolutePath();
                EAY eay = C26265CwA.A00;
                if (eay.BfN(3)) {
                    eay.BHz(cls.getSimpleName(), BE7.A0o("Created cache directory %s", AnonymousClass8BV.A1b(absolutePath)));
                }
                this.A03 = new C24850CMt(new DAO(this.A00, A0e), A0e);
            } catch (C24206BxI e) {
                throw e;
            }
        }
        e9f = this.A03.A00;
        C26208Cuj.A01(e9f);
        return e9f;
    }

    public DAN(CET cet, E4K e4k, String str) {
        this.A00 = cet;
        this.A01 = e4k;
        this.A02 = str;
    }

    public Collection BRL() {
        return A00().BRL();
    }

    public C25100CXt BYI(Object obj, String str) {
        return A00().BYI(obj, str);
    }

    public CPI BdZ(Object obj, String str) {
        return A00().BdZ(obj, str);
    }

    public void CCy() {
        try {
            A00().CCy();
        } catch (IOException e) {
            Class<DAN> cls = DAN.class;
            EAY eay = C26265CwA.A00;
            if (eay.BfN(6)) {
                eay.BJo(cls.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    public long CEU(CWT cwt) {
        return A00().CEU(cwt);
    }

    public boolean isExternal() {
        try {
            return A00().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
