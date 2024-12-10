package androidx.compose.ui.text.font;

import X.AnonymousClass1OR;
import X.AnonymousClass4ZF;
import X.C22821Di;
import X.C24693CGf;
import X.C24694CGg;
import X.C25213Cb9;
import X.C26599D5p;
import X.C27919DoH;
import X.C28615EAm;
import X.CIX;
import X.CMN;
import X.DSF;
import X.E08;
import X.E3V;
import X.ECY;

public final class FontFamilyResolverImpl implements E3V {
    public final AnonymousClass4ZF A00;
    public final CIX A01;
    public final E08 A02;
    public final C28615EAm A03;
    public final CMN A04;
    public final C22821Di A05 = new C27919DoH(this);

    public ECY CFu(C24693CGf cGf, DSF dsf, int i, int i2) {
        DSF dsf2 = dsf;
        int i3 = ((C26599D5p) this.A03).A00;
        if (!(i3 == 0 || i3 == Integer.MAX_VALUE)) {
            int i4 = dsf.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = 1000;
            }
            dsf2 = new DSF(i4);
        }
        return A00(this, new C25213Cb9(cGf, dsf2, (Object) null, i, i2));
    }

    public /* synthetic */ FontFamilyResolverImpl(E08 e08, C28615EAm eAm) {
        CMN cmn = C24694CGg.A01;
        AnonymousClass4ZF r1 = new AnonymousClass4ZF(C24694CGg.A00, AnonymousClass1OR.A00);
        CIX cix = new CIX();
        this.A02 = e08;
        this.A03 = eAm;
        this.A04 = cmn;
        this.A00 = r1;
        this.A01 = cix;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final X.ECY A00(androidx.compose.ui.text.font.FontFamilyResolverImpl r6, X.C25213Cb9 r7) {
        /*
            X.CMN r5 = r6.A04
            X.Dq6 r4 = new X.Dq6
            r4.<init>(r6, r7)
            X.C77 r3 = r5.A01
            monitor-enter(r3)
            X.Cbu r2 = r5.A00     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.A01(r7)     // Catch:{ all -> 0x0036 }
            X.ECY r1 = (X.ECY) r1     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            monitor-exit(r3)
            X.Dq7 r0 = new X.Dq7     // Catch:{ Exception -> 0x002b }
            r0.<init>(r7, r5)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r1 = r4.invoke(r0)     // Catch:{ Exception -> 0x002b }
            X.ECY r1 = (X.ECY) r1     // Catch:{ Exception -> 0x002b }
            monitor-enter(r3)
            java.lang.Object r0 = r2.A01(r7)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            r2.A02(r7, r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            java.lang.String r0 = "Could not load font"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0, r1)
            throw r2
        L_0x0034:
            monitor-exit(r3)
            return r1
        L_0x0036:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.A00(androidx.compose.ui.text.font.FontFamilyResolverImpl, X.Cb9):X.ECY");
    }
}
