package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2zc  reason: invalid class name and case insensitive filesystem */
public final class C67332zc implements AnonymousClass1L0 {
    public final C219518a A00;

    public C67332zc(C219518a r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        File[] listFiles;
        LinkedHashSet linkedHashSet;
        long j;
        C219518a r8 = this.A00;
        synchronized (r8) {
            File A01 = C219518a.A01(r8);
            if (!(A01 == null || (listFiles = A01.listFiles()) == null)) {
                for (File file : listFiles) {
                    WtPersistentSession A002 = C219518a.A00(file);
                    if (A002 != null && (linkedHashSet = A002.A03) != null) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                            if (wtCachedPsk.useTestTime) {
                                j = 3600000;
                            } else {
                                j = System.currentTimeMillis();
                            }
                            if (j - wtCachedPsk.ticketIssuedTime <= wtCachedPsk.ticketLifetime) {
                                break;
                            }
                        }
                    }
                    file.delete();
                    file.getAbsolutePath();
                }
            }
        }
    }
}
