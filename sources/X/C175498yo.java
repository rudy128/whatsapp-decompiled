package X;

import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8yo  reason: invalid class name and case insensitive filesystem */
public abstract class C175498yo extends C20992Ack {
    public int A00;
    public AZ6 A01;
    public AnonymousClass90Z A02;
    public String A03;
    public final C196259ui A04;
    public final String A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.87L] */
    public static AEC A00(C29621ca r5) {
        return new AEC(new C1418477e(new Object(), String.class, r5.A0Q("alias_value", (String) null), "upiAlias"), r5.A0P("alias_type"), r5.A0P("alias_id"), r5.A0P("alias_status").toLowerCase(Locale.US));
    }

    public C175498yo(Context context, AnonymousClass1KB r2, C33711jG r3, C196259ui r4, AZ6 az6, AnonymousClass90Z r6, String str, String str2, int i) {
        super(context, r3, r2);
        this.A05 = str;
        this.A04 = r4;
        this.A01 = az6;
        this.A00 = i;
        this.A03 = str2;
        this.A02 = r6;
    }

    public static String A01(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(" seqNumPrefix: ");
        sb.append(str3);
        sb.append(" bindID: ");
        return C20088A6q.A01(str4);
    }

    public void A04(A7B a7b) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: onRequestError action: ");
        String str2 = this.A05;
        A10.append(str2);
        C17900vP.A0Y(a7b, " error: ", A10);
        AZ6 az6 = this.A01;
        if (az6 != null) {
            az6.A0A(a7b, this.A00, 1);
        }
        C196259ui r1 = this.A04;
        if (r1 != null) {
            r1.A04(str2, a7b.A00);
        }
        AnonymousClass90Z r12 = this.A02;
        if (r12 != null && (str = this.A03) != null) {
            r12.A03(a7b, str);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A05(X.A7B r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: onResponseError action: "
            r1.append(r0)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = " error: "
            X.C17900vP.A0Y(r6, r0, r1)
            X.AZ6 r2 = r5.A01
            if (r2 == 0) goto L_0x001d
            int r1 = r5.A00
            r0 = 1
            r2.A0A(r6, r1, r0)
        L_0x001d:
            X.90Z r1 = r5.A02
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0028
            r1.A03(r6, r0)
        L_0x0028:
            X.9ui r3 = r5.A04
            if (r3 == 0) goto L_0x0082
            int r0 = r6.A00
            r3.A04(r4, r0)
            int r4 = r6.A00
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 426(0x1aa, float:5.97E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 460(0x1cc, float:6.45E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 410(0x19a, float:5.75E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 409(0x199, float:5.73E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r4 == r0) goto L_0x006b
            r0 = 440(0x1b8, float:6.17E-43)
            if (r4 != r0) goto L_0x0082
            monitor-enter(r3)
            r3.A02 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "tos-"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x006b:
            monitor-enter(r3)
            r3.A01 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "payability-"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0081:
            monitor-exit(r3)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175498yo.A05(X.A7B):void");
    }

    public void A06(C29621ca r6) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: onResponseSuccess for op: action: ");
        String str2 = this.A05;
        C17890vO.A1A(A10, str2);
        AZ6 az6 = this.A01;
        if (az6 != null) {
            az6.A0A((A7B) null, this.A00, 2);
        }
        AnonymousClass90Z r0 = this.A02;
        if (!(r0 == null || (str = this.A03) == null)) {
            Map map = r0.A03.A04;
            C222119a r02 = (C222119a) map.get(str);
            if (r02 != null) {
                r02.A0C(2);
                map.remove(str);
            }
        }
        C196259ui r03 = this.A04;
        if (r03 != null) {
            r03.A03(str2);
        }
    }

    public C175498yo(Context context, AnonymousClass1KB r3, C33711jG r4, C196259ui r5, AZ6 az6, String str, int i) {
        super(context, r4, r3);
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r5;
        this.A01 = az6;
        this.A00 = i;
    }

    public C175498yo(Context context, AnonymousClass1KB r4, C33711jG r5, C196259ui r6, String str) {
        super(context, r5, r4);
        this.A01 = null;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r6;
    }
}
