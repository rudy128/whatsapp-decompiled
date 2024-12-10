package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.LRUCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.A2a  reason: case insensitive filesystem */
public final class C19988A2a {
    public final C18030ve A00;
    public final LRUCache A01 = new LRUCache(5);
    public final AnonymousClass11N A02;

    public ArrayList A01(UserJid userJid, String str) {
        ArrayList A13;
        C18070vi.A0d(str, 0);
        synchronized (this) {
            Map map = A00(userJid).A01;
            C195139sr r1 = (C195139sr) map.get(str);
            A13 = AnonymousClass000.A13();
            if (r1 != null && !r1.A04) {
                Iterator it = r1.A03.iterator();
                while (it.hasNext()) {
                    C195139sr r0 = (C195139sr) map.get(C17880vN.A0v(it));
                    if (r0 != null) {
                        A13.add(r0);
                    }
                }
            }
        }
        return A13;
    }

    public void A02(AN7 an7, UserJid userJid, boolean z) {
        synchronized (this) {
            for (C193519qE r0 : an7.A01) {
                C195139sr r4 = r0.A00;
                List list = r4.A03;
                list.clear();
                for (C195139sr r2 : r0.A01) {
                    String str = r2.A01;
                    list.add(str);
                    A00(userJid).A01.put(str, r2);
                }
                String str2 = r4.A01;
                C193729qZ A002 = A00(userJid);
                if (z) {
                    C195139sr r02 = (C195139sr) A00(userJid).A01.get("catalog_category_dummy_root_id");
                    if (r02 != null) {
                        r02.A03.add(str2);
                    } else {
                        continue;
                    }
                }
                A002.A01.put(str2, r4);
            }
        }
    }

    public void A03(UserJid userJid) {
        synchronized (this) {
            this.A01.remove(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.UserJid r12, java.lang.String r13) {
        /*
            r11 = this;
            r10 = r11
            r7 = 0
            X.C18070vi.A0d(r13, r7)
            monitor-enter(r10)
            java.lang.String r0 = "catalog_category_dummy_root_id"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0034
            com.whatsapp.util.LRUCache r8 = r11.A01     // Catch:{ all -> 0x0056 }
            java.lang.Object r9 = r8.get(r12)     // Catch:{ all -> 0x0056 }
            X.9qZ r9 = (X.C193729qZ) r9     // Catch:{ all -> 0x0056 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ all -> 0x0056 }
            X.0ve r1 = r11.A00     // Catch:{ all -> 0x0056 }
            r0 = 2081(0x821, float:2.916E-42)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)     // Catch:{ all -> 0x0056 }
            long r5 = r2.toMillis(r0)     // Catch:{ all -> 0x0056 }
            if (r9 == 0) goto L_0x0034
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0056 }
            long r1 = r9.A00     // Catch:{ all -> 0x0056 }
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            r8.remove(r12)     // Catch:{ all -> 0x0056 }
        L_0x0034:
            X.9qZ r0 = r11.A00(r12)     // Catch:{ all -> 0x0054 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r0.get(r13)     // Catch:{ all -> 0x0054 }
            X.9sr r2 = (X.C195139sr) r2     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r2 != 0) goto L_0x0045
            monitor-exit(r10)
            return r7
        L_0x0045:
            boolean r0 = r2.A04     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0052
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0056 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0052
            r1 = 1
        L_0x0052:
            monitor-exit(r10)
            return r1
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19988A2a.A04(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }

    private final C193729qZ A00(UserJid userJid) {
        LRUCache lRUCache = this.A01;
        UserJid userJid2 = userJid;
        C193729qZ r3 = (C193729qZ) lRUCache.get(userJid2);
        if (r3 != null) {
            return r3;
        }
        C193729qZ r32 = new C193729qZ(C17880vN.A13(), System.currentTimeMillis());
        r32.A01.put("catalog_category_dummy_root_id", new C195139sr(new AEI("catalog_category_dummy_root_id", (String) null, (String) null, 0, 0), "catalog_category_dummy_root_id", "root", AnonymousClass000.A13(), false));
        lRUCache.put(userJid2, r32);
        return r32;
    }

    public C19988A2a(AnonymousClass11N r3, C18030ve r4) {
        C18070vi.A0j(r3, r4);
        this.A02 = r3;
        this.A00 = r4;
    }
}
