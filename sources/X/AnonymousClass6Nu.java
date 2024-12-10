package X;

import android.content.Context;
import android.view.MenuItem;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Nu  reason: invalid class name */
public final class AnonymousClass6Nu extends C115085tN {
    public AnonymousClass86V A00;
    public List A01;
    public final Context A02;
    public final AnonymousClass89U A03;
    public final Map A04 = C17880vN.A11();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Nu(Context context, C18000vb r3, AnonymousClass89U r4) {
        super(r3);
        C18070vi.A0d(r4, 2);
        this.A02 = context;
        this.A03 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        r3 = X.AnonymousClass3NL.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r5.setIcon(r3);
        r5.setShowAsAction(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r1.equals(r0) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r5.setShowAsAction(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BqX(android.view.Menu r11) {
        /*
            r10 = this;
            r7 = 0
            X.C18070vi.A0d(r11, r7)
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x00be
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x00be
            java.util.Iterator r9 = r0.iterator()
            r6 = 0
        L_0x0017:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r9.next()
            X.6gl r4 = (X.C128836gl) r4
            java.lang.String r1 = r4.A02
            java.lang.String r0 = ""
            if (r1 != r0) goto L_0x002e
            java.lang.String r0 = r4.A01
            if (r0 != 0) goto L_0x002e
            goto L_0x0017
        L_0x002e:
            android.view.MenuItem r5 = r11.add(r7, r6, r7, r1)
            X.C18070vi.A0X(r5)
            X.E8A r0 = r4.A00
            if (r0 == 0) goto L_0x0049
            java.util.Map r3 = r10.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1 = 10
            X.7Cf r0 = new X.7Cf
            r0.<init>(r4, r1)
            r3.put(r2, r0)
        L_0x0049:
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x0055
            int r0 = r1.hashCode()
            r8 = 1
            switch(r0) {
                case -906336856: goto L_0x0058;
                case -316266717: goto L_0x0068;
                case 3327275: goto L_0x006b;
                case 109400031: goto L_0x0092;
                case 529642498: goto L_0x0095;
                case 928814795: goto L_0x0098;
                case 1505434244: goto L_0x00b2;
                default: goto L_0x0055;
            }
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x0017
        L_0x0058:
            java.lang.String r0 = "search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            X.0vb r2 = r10.A00
            android.content.Context r1 = r10.A02
            r0 = 2131232271(0x7f08060f, float:1.8080647E38)
            goto L_0x00a7
        L_0x0068:
            java.lang.String r0 = "open_in_browser"
            goto L_0x00b4
        L_0x006b:
            java.lang.String r0 = "lock"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            X.0vb r1 = r10.A00
            android.content.Context r4 = r10.A02
            r0 = 2131232065(0x7f080541, float:1.8080229E38)
            X.3cP r3 = X.AnonymousClass3NL.A00(r4, r1, r0)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2130971791(0x7f040c8f, float:1.755233E38)
            r0 = 2131102909(0x7f060cbd, float:1.781827E38)
            int r1 = X.AnonymousClass3Ma.A01(r4, r2, r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r1, r0)
            goto L_0x00ab
        L_0x0092:
            java.lang.String r0 = "share"
            goto L_0x00b4
        L_0x0095:
            java.lang.String r0 = "overflow"
            goto L_0x00b4
        L_0x0098:
            java.lang.String r0 = "report_a_bug"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            X.0vb r2 = r10.A00
            android.content.Context r1 = r10.A02
            r0 = 2131233221(0x7f0809c5, float:1.8082573E38)
        L_0x00a7:
            X.3cP r3 = X.AnonymousClass3NL.A00(r1, r2, r0)
        L_0x00ab:
            r5.setIcon(r3)
            r5.setShowAsAction(r8)
            goto L_0x0055
        L_0x00b2:
            java.lang.String r0 = "copy_link"
        L_0x00b4:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r5.setShowAsAction(r7)
            goto L_0x0055
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Nu.BqX(android.view.Menu):void");
    }

    public boolean Bze(MenuItem menuItem) {
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        Map map = this.A04;
        Integer valueOf = Integer.valueOf(A012);
        if (!map.containsKey(valueOf)) {
            return false;
        }
        AnonymousClass86V r0 = this.A00;
        if (r0 == null) {
            return true;
        }
        C23736Boh BM1 = r0.BM1();
        Object obj = map.get(valueOf);
        C17960vV.A07(obj);
        C25974Cph.A00(ALS.A06(BM1), C199029zJ.A01, ((AnonymousClass86X) obj).BM3());
        return true;
    }
}
