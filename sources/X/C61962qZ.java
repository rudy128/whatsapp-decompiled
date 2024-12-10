package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* renamed from: X.2qZ  reason: invalid class name and case insensitive filesystem */
public final class C61962qZ {
    public final C200710s A00;
    public final LinkedHashMap A01 = C17880vN.A13();
    public final C18030ve A02;

    public C61962qZ(C18030ve r2, AnonymousClass10I r3) {
        C18070vi.A0d(r3, 2);
        this.A02 = r2;
        this.A00 = C200710s.A00(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r9.A0C != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C61962qZ r6, X.C19830z4 r7, X.C53622cp r8, X.C178119Bw r9) {
        /*
            X.0ve r2 = r6.A02
            r1 = 8993(0x2321, float:1.2602E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r3 = 1
            if (r0 <= r3) goto L_0x0045
            boolean r0 = r9.A0O()
            r2 = 0
            if (r0 == 0) goto L_0x0019
            com.whatsapp.jid.GroupJid r1 = r9.A0C
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            com.whatsapp.jid.GroupJid r5 = r9.A0C
            if (r0 == 0) goto L_0x004e
            X.4cT r0 = r9.A04
            com.whatsapp.jid.UserJid r4 = r0.A01
            java.util.ArrayList r0 = r9.A0B()
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r1.next()
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x002e
        L_0x0040:
            java.util.HashSet r2 = X.C29431cG.A0n(r2)
            goto L_0x005b
        L_0x0045:
            X.4cT r0 = r9.A04
            java.lang.String r0 = r0.A02
            int r2 = r0.hashCode()
            goto L_0x0072
        L_0x004e:
            r4 = 0
            X.1BI[] r1 = new X.AnonymousClass1BI[r3]
            X.4cT r0 = r9.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            r1[r2] = r0
            java.util.HashSet r2 = X.AnonymousClass1AP.A01(r1)
        L_0x005b:
            boolean r3 = r9.A0J
            r1 = 0
            int r0 = X.AnonymousClass001.A0l(r5)
            int r0 = r0 * 31
            if (r4 == 0) goto L_0x006a
            int r1 = r4.hashCode()
        L_0x006a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = X.AnonymousClass000.A0N(r2, r0)
            int r2 = r2 + r3
        L_0x0072:
            java.util.ArrayList r1 = r7.A0r()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00b3
            java.util.LinkedHashMap r4 = r6.A01
            monitor-enter(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r4.get(r1)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0093
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00b0 }
        L_0x0093:
            r0.add(r9)     // Catch:{ all -> 0x00b0 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b0 }
            if (r8 == 0) goto L_0x00ae
            X.1D6 r3 = X.AnonymousClass1D6.A01(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = r6.A01()     // Catch:{ all -> 0x00b0 }
            int r2 = r0.size()     // Catch:{ all -> 0x00b0 }
            X.3Ao r1 = r8.A00     // Catch:{ all -> 0x00b0 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x00b0 }
            r1.A06(r3, r2, r0)     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r4)
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61962qZ.A00(X.2qZ, X.0z4, X.2cp, X.9Bw):void");
    }

    public final ArrayList A01() {
        ArrayList A0F;
        LinkedHashMap linkedHashMap = this.A01;
        synchronized (linkedHashMap) {
            Collection values = linkedHashMap.values();
            C18070vi.A0X(values);
            A0F = C29351c6.A0F(values);
        }
        return A0F;
    }
}
