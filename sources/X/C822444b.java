package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.44b  reason: invalid class name and case insensitive filesystem */
public final class C822444b extends A5S {
    public final HashSet A00 = C17880vN.A12();
    public final C18030ve A01;
    public final C190589lC A02;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass4FP r6) {
        /*
            r5 = this;
            r4 = 0
            X.0ve r2 = r5.A01
            r1 = 6551(0x1997, float:9.18E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0080
            com.whatsapp.jid.UserJid r0 = r6.A01
            java.lang.Object r2 = r5.A04(r0)
            X.4FP r2 = (X.AnonymousClass4FP) r2
            java.lang.String r1 = r6.A08
            r3 = 1
            if (r1 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x0081
            boolean r0 = r2.A0B
            if (r0 != r3) goto L_0x0081
        L_0x0020:
            java.lang.String r1 = r6.A08
            if (r1 != 0) goto L_0x0028
            java.lang.String r0 = r2.A08
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            r2.A08 = r0
            java.lang.String r1 = r6.A09
            if (r1 != 0) goto L_0x0033
            java.lang.String r0 = r2.A09
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            r2.A09 = r0
            java.lang.String r1 = r6.A05
            if (r1 != 0) goto L_0x003e
            java.lang.String r0 = r2.A05
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r0 = r1
        L_0x003f:
            r2.A05 = r0
            java.lang.Boolean r1 = r6.A02
            if (r1 != 0) goto L_0x0049
            java.lang.Boolean r0 = r2.A02
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            r2.A02 = r0
            java.lang.Boolean r1 = r6.A03
            if (r1 != 0) goto L_0x0054
            java.lang.Boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            r2.A03 = r0
            java.lang.String r1 = r6.A0A
            if (r1 != 0) goto L_0x005f
            java.lang.String r0 = r2.A0A
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            r2.A0A = r0
            java.lang.String r0 = r6.A06
            r2.A06 = r0
            java.lang.String r0 = r6.A07
            r2.A07 = r0
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0070
            boolean r3 = r2.A0B
        L_0x0070:
            r2.A0B = r3
            X.1E2 r0 = r6.A00
            if (r0 != 0) goto L_0x0078
            X.1E2 r0 = r2.A00
        L_0x0078:
            r2.A00 = r0
            r5.A08(r2)
            A00(r5)
        L_0x0080:
            return
        L_0x0081:
            X.9lC r0 = r5.A02
            r0.A00(r1, r4, r3)
            r6.A0B = r3
        L_0x0088:
            if (r2 != 0) goto L_0x0020
            r5.A08(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C822444b.A09(X.4FP):void");
    }

    public static final void A00(C822444b r5) {
        HashSet hashSet = r5.A00;
        synchronized (hashSet) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C78543sy r3 = (C78543sy) ((C106825Xi) it.next());
                r3.A0S.CGP(new C98784ri((Object) r3, 5));
            }
        }
    }

    public /* bridge */ /* synthetic */ C194049r5 A03(Object obj) {
        AnonymousClass4FP r4 = (AnonymousClass4FP) obj;
        C18070vi.A0d(r4, 0);
        return new C194049r5(r4.A00, r4.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822444b(C18030ve r3, C190589lC r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        super((AnonymousClass16B) AnonymousClass12Q.A01(49162), r5, r6, "ctwa_flow_context_store");
        C18070vi.A0s(r5, r6, r3, r4);
        this.A01 = r3;
        this.A02 = r4;
    }
}
