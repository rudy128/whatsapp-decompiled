package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.34Z  reason: invalid class name */
public final class AnonymousClass34Z implements C25471Oi {
    public static final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public final AnonymousClass1PW A00;
    public final C695037l A01;
    public final AnonymousClass1UD A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final AnonymousClass18K A05;
    public final C60122nQ A06;
    public final AnonymousClass00H A07;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r6) {
        int i;
        C18070vi.A0d(r6, 0);
        AnonymousClass206 r4 = r6.A0A;
        if (r4 != null) {
            C60122nQ r3 = this.A06;
            AnonymousClass1BI r2 = r4.A0v.A00;
            if (r3.A03(r2)) {
                i = 2;
            } else if (r3.A04(r2)) {
                i = 3;
            } else {
                return;
            }
            A01((AnonymousClass206) null, r4, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012a, code lost:
        if (r0 != null) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass206 r12, X.AnonymousClass206 r13, java.lang.Integer r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x022d
            int r0 = r14.intValue()
        L_0x0006:
            if (r0 == 0) goto L_0x01a3
            X.1UD r1 = r11.A02
            X.0ve r3 = r1.A00
            X.0vf r2 = X.C18040vf.A01
            r0 = 10254(0x280e, float:1.4369E-41)
            int r4 = X.C18020vd.A00(r2, r3, r0)
            if (r4 == 0) goto L_0x0019
            r0 = 2
            if (r4 != r0) goto L_0x00c4
        L_0x0019:
            X.2Hi r4 = new X.2Hi
            r4.<init>()
            java.lang.Class<X.Aby> r0 = X.C20944Aby.class
            X.229 r0 = X.AnonymousClass206.A01(r13, r0)
            X.Aby r0 = (X.C20944Aby) r0
            if (r0 == 0) goto L_0x003a
            X.9IU r0 = r0.A00
            int r6 = r0.ordinal()
            r5 = 1
            r0 = 0
            if (r6 == r0) goto L_0x0227
            if (r6 != r5) goto L_0x003a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0038:
            r4.A06 = r0
        L_0x003a:
            X.36h r5 = X.AnonymousClass2UW.A00(r13)
            if (r5 == 0) goto L_0x021e
            X.C17960vV.A07(r5)
            java.lang.String r0 = r5.A02
            r4.A08 = r0
            X.2Qn r0 = r5.A01
            int r7 = r0.ordinal()
            r0 = 1
            r6 = 3
            if (r7 == r0) goto L_0x0218
            r0 = 2
            r5 = 4
            if (r7 == r0) goto L_0x0212
            if (r7 == r6) goto L_0x0211
            r0 = 4
            r5 = 7
            if (r7 == r0) goto L_0x0212
            r0 = 0
        L_0x005c:
            r4.A01 = r0
            X.00H r0 = r11.A07
            int r0 = X.C62242r5.A00(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A04 = r0
        L_0x006a:
            if (r12 == 0) goto L_0x0084
            int r0 = X.C64002u3.A05(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x020e
            X.1PW r0 = r11.A00
            java.lang.Integer r0 = r0.A04(r12)
        L_0x0082:
            r4.A00 = r0
        L_0x0084:
            X.11P r0 = r11.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A07 = r0
            if (r14 != 0) goto L_0x00a0
            X.1PW r1 = r11.A00
            X.205 r0 = r13.A0v
            X.1BI r0 = r0.A00
            int r0 = r1.A01(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x00a0:
            r4.A03 = r14
            java.lang.Class<X.36b> r0 = X.C691436b.class
            X.229 r0 = X.AnonymousClass206.A01(r13, r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x00b4
            java.lang.Integer r0 = X.C17880vN.A0m()
            r4.A02 = r0
        L_0x00b4:
            java.lang.Integer r0 = r4.A03
            if (r0 == 0) goto L_0x0207
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0207
            X.18K r0 = r11.A05
            r0.CC4(r4)
        L_0x00c4:
            r0 = 10254(0x280e, float:1.4369E-41)
            int r1 = X.C18020vd.A00(r2, r3, r0)
            r2 = 1
            if (r1 == r2) goto L_0x00d0
            r0 = 2
            if (r1 != r0) goto L_0x01a3
        L_0x00d0:
            if (r12 == 0) goto L_0x01a3
            X.205 r0 = r12.A0v
            if (r0 == 0) goto L_0x01a3
            java.lang.String r7 = r0.A01
            if (r7 == 0) goto L_0x01a3
            java.util.concurrent.ConcurrentHashMap r6 = A08
            java.lang.Object r5 = r6.get(r7)
            X.2g0 r5 = (X.C55562g0) r5
            if (r5 == 0) goto L_0x01a3
            int r4 = r5.A05
            java.lang.Class<X.Aby> r0 = X.C20944Aby.class
            X.229 r0 = X.AnonymousClass206.A01(r13, r0)
            X.Aby r0 = (X.C20944Aby) r0
            if (r0 == 0) goto L_0x010d
            X.9IU r0 = r0.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0201
            if (r1 != r2) goto L_0x010d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x00ff:
            r3 = 261881857(0xf9c0001, float:1.5382789E-29)
            X.37l r2 = r11.A01
            java.lang.String r1 = "model_type"
            int r0 = r0.intValue()
            r2.markerAnnotate((int) r3, (int) r4, (java.lang.String) r1, (int) r0)
        L_0x010d:
            X.36h r0 = X.AnonymousClass2UW.A00(r13)
            if (r0 == 0) goto L_0x01a3
            X.2Qn r2 = r0.A01
            int r8 = r2.ordinal()
            r0 = 1
            r3 = 3
            if (r8 == r0) goto L_0x01fb
            r1 = 2
            r0 = 4
            if (r8 == r1) goto L_0x0126
            if (r8 == r3) goto L_0x01f8
            if (r8 != r0) goto L_0x017e
            r0 = 7
        L_0x0126:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x017e
        L_0x012c:
            boolean r10 = r5.A04
            if (r10 == 0) goto L_0x01f4
            java.lang.String r9 = "PLUGIN_"
        L_0x0132:
            r8 = 95
            int r3 = r0.intValue()
            r0 = 4
            if (r3 != r0) goto L_0x01d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A01
        L_0x0144:
            int r0 = r0.incrementAndGet()
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
        L_0x014c:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r9)
            r0 = 2
            if (r3 != r0) goto L_0x01b9
            java.lang.String r0 = "REQUEST_RECV"
        L_0x0155:
            java.lang.String r10 = X.AnonymousClass001.A1H(r0, r1, r8)
            X.37l r9 = r11.A01
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r1 = 261881857(0xf9c0001, float:1.5382789E-29)
            X.19A r0 = r9.A00
            X.2A6 r3 = new X.2A6
            r3.<init>(r0, r9, r8, r1)
            r3.A02 = r10
            r0 = -1
            r3.A00 = r0
            X.00H r0 = r11.A07
            int r1 = X.C62242r5.A00(r13, r0)
            java.lang.String r0 = "media_type"
            com.facebook.quicklog.PointEditor r0 = r3.addPointData((java.lang.String) r0, (int) r1)
            r0.markerEditingCompleted()
        L_0x017e:
            X.2Qn r0 = X.C49452Qn.FIRST
            if (r2 != r0) goto L_0x0187
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            r0.incrementAndGet()
        L_0x0187:
            X.2Qn r0 = X.C49452Qn.LAST
            if (r2 != r0) goto L_0x0190
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            r0.decrementAndGet()
        L_0x0190:
            X.2Qn r0 = X.C49452Qn.FULL
            if (r2 == r0) goto L_0x01ac
            X.36i r0 = X.AnonymousClass2UX.A00(r13)
            if (r0 == 0) goto L_0x01a4
            boolean r0 = r5.A04
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a4
            r0 = 1
            r5.A04 = r0
        L_0x01a3:
            return
        L_0x01a4:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            int r0 = r0.get()
            if (r0 > 0) goto L_0x01a3
        L_0x01ac:
            r2 = 2
            X.37l r1 = r11.A01
            r0 = 261881857(0xf9c0001, float:1.5382789E-29)
            r1.markerEnd(r0, r4, r2)
            r6.remove(r7)
            return
        L_0x01b9:
            r0 = 3
            if (r3 != r0) goto L_0x01bf
            java.lang.String r0 = "FIRST_RESPONSE"
            goto L_0x0155
        L_0x01bf:
            r0 = 4
            if (r3 != r0) goto L_0x01c5
            java.lang.String r0 = "INNER_RESPONSE"
            goto L_0x0155
        L_0x01c5:
            r0 = 5
            if (r3 != r0) goto L_0x01cb
            java.lang.String r0 = "LAST_RESPONSE"
            goto L_0x0155
        L_0x01cb:
            r0 = 7
            if (r3 != r0) goto L_0x01d1
            java.lang.String r0 = "FULL_RESPONSE"
            goto L_0x0155
        L_0x01d1:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x0155
        L_0x01d4:
            java.lang.String r1 = ""
            if (r10 == 0) goto L_0x014c
            r0 = 3
            if (r3 != r0) goto L_0x01e6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A00
            goto L_0x0144
        L_0x01e6:
            r0 = 5
            if (r3 != r0) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A02
            goto L_0x0144
        L_0x01f4:
            java.lang.String r9 = ""
            goto L_0x0132
        L_0x01f8:
            r0 = 5
            goto L_0x0126
        L_0x01fb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x012c
        L_0x0201:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00ff
        L_0x0207:
            X.18K r0 = r11.A05
            r0.CC7(r4)
            goto L_0x00c4
        L_0x020e:
            r0 = 0
            goto L_0x0082
        L_0x0211:
            r5 = 5
        L_0x0212:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x005c
        L_0x0218:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x005c
        L_0x021e:
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A01 = r0
            goto L_0x006a
        L_0x0227:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0038
        L_0x022d:
            X.1PW r1 = r11.A00
            X.205 r0 = r13.A0v
            X.1BI r0 = r0.A00
            int r0 = r1.A01(r0)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34Z.A01(X.206, X.206, java.lang.Integer):void");
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public AnonymousClass34Z(AnonymousClass1PW r1, C695037l r2, AnonymousClass1UD r3, AnonymousClass11P r4, C19830z4 r5, AnonymousClass18K r6, C60122nQ r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r7, r6, r3, r1);
        C18070vi.A0q(r8, r5, r2);
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = r2;
    }

    public static final int A00(AnonymousClass206 r3) {
        C20949Ac3 A002 = AnonymousClass9RU.A00(r3);
        if (A002 != null) {
            int ordinal = A002.A00.ordinal();
            if (ordinal == 0) {
                return 1;
            }
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 4;
            }
            if (ordinal != 4) {
                return 0;
            }
            return 6;
        }
        return 0;
    }

    public String BSr() {
        return "BotMessageLogging";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
