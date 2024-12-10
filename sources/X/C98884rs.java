package X;

import java.util.Comparator;
import java.util.Set;

/* renamed from: X.4rs  reason: invalid class name and case insensitive filesystem */
public class C98884rs implements Comparator {
    public Set A00;
    public final C98964s0 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r6.A00.contains(r4.A06(r2)) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            X.4Mh r7 = (X.C85154Mh) r7
            X.4Mh r8 = (X.C85154Mh) r8
            int r0 = r7.A00
            r5 = -1
            r2 = 4
            if (r0 == r2) goto L_0x002d
            r1 = 8
            if (r0 == r1) goto L_0x002d
            int r0 = r8.A00
            if (r0 == r2) goto L_0x002c
            if (r0 == r1) goto L_0x002c
            java.lang.Object r3 = r7.A01
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r4 = r8.A01
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            boolean r1 = r3.A0F()
            boolean r0 = r4.A0F()
            if (r1 == r0) goto L_0x002e
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r5 = 1
        L_0x002d:
            return r5
        L_0x002e:
            java.util.Set r1 = r6.A00
            X.C17960vV.A07(r1)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r3.A06(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0052
            java.util.Set r1 = r6.A00
            com.whatsapp.jid.Jid r0 = r4.A06(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0052
        L_0x004b:
            X.4s0 r0 = r6.A01
            int r5 = r0.compare(r3, r4)
            return r5
        L_0x0052:
            java.util.Set r1 = r6.A00
            com.whatsapp.jid.Jid r0 = r3.A06(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002d
            java.util.Set r1 = r6.A00
            com.whatsapp.jid.Jid r0 = r4.A06(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004b
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98884rs.compare(java.lang.Object, java.lang.Object):int");
    }

    public C98884rs(AnonymousClass11S r2, C24921Me r3, int i) {
        this.A01 = new C98964s0(r2, r3, i);
    }
}
