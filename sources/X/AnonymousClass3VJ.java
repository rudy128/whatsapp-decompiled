package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VJ  reason: invalid class name */
public class AnonymousClass3VJ extends AnonymousClass1J2 {
    public final C22801Dg A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final C34511kb A03;
    public final AnonymousClass4ZH A04;
    public final C84804Kx A05 = new C84804Kx(this);
    public final AnonymousClass1M9 A06;
    public final C23581Gv A07 = new C94174kA(this, 3);
    public final C24671Lf A08;
    public final C28741ap A09 = new C95414mC(this, 5);
    public final AnonymousClass1Q1 A0A;
    public final AnonymousClass1CJ A0B;
    public final C25231Nk A0C = new C95444mF(this, 9);
    public final AnonymousClass1NN A0D;
    public final AnonymousClass1R3 A0E;
    public final AnonymousClass1WR A0F = new C95514mM(this, 2);
    public final C24681Lg A0G;
    public final C18030ve A0H;
    public final C25221Nj A0I = new C96314ne(this, 8);
    public final C25191Ng A0J;
    public final C34201k6 A0K = new AnonymousClass411(this, 3);
    public final C39501tB A0L;
    public final C42211xo A0M;
    public final C35201lp A0N;
    public final C41111vp A0O;
    public final C200710s A0P;
    public final C41731wy A0Q = AnonymousClass3MW.A0o();
    public final C41731wy A0R = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0S;
    public final Comparator A0T;
    public final Comparator A0U;
    public final Map A0V = C17880vN.A13();
    public final Map A0W = C17880vN.A11();
    public final C22821Di A0X = C99244sV.A00(this, 14);
    public final C22821Di A0Y = C99244sV.A00(this, 12);
    public final C22821Di A0Z = C99244sV.A00(this, 13);
    public final C41111vp A0a;

    public static ArrayList A00(AnonymousClass3VJ r6, C29691ci r7, Map map) {
        HashSet A082 = r6.A03.A08(AnonymousClass3MW.A0i(r7.A08()));
        if (!A082.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A082.iterator();
            while (it.hasNext()) {
                AnonymousClass1CJ r0 = r6.A0B;
                GroupJid groupJid = ((A2B) it.next()).A02;
                C29691ci A0A2 = r0.A0A(groupJid);
                if (A0A2 != null && !A0A2.A0m) {
                    map.put(groupJid, r7);
                    A13.add(A0A2);
                }
            }
            if (!A13.isEmpty()) {
                return A13;
            }
        }
        return null;
    }

    public static List A03(AnonymousClass3VJ r4, C29691ci r5) {
        List<C29691ci> list = (List) r4.A0V.remove(r5);
        if (list != null) {
            for (C29691ci A082 : list) {
                r4.A0W.remove(AnonymousClass3MW.A0f(A082.A08()));
            }
        }
        return list;
    }

    public static boolean A05(AnonymousClass3VJ r5, AnonymousClass1BI r6) {
        if (r6 instanceof AnonymousClass1EC) {
            Map map = r5.A0V;
            if (!map.isEmpty()) {
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    C29691ci r2 = (C29691ci) AnonymousClass000.A16(A15).getKey();
                    AnonymousClass1BI A082 = r2.A08();
                    if ((A082 instanceof AnonymousClass1EC) && r6.equals(A082)) {
                        A03(r5, r2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A0S() {
        this.A0D.unregisterObserver(this.A0C);
        this.A0N.unregisterObserver(this.A05);
        this.A0L.unregisterObserver(this.A0K);
        this.A0G.unregisterObserver(this.A0F);
        this.A0J.unregisterObserver(this.A0I);
        this.A08.unregisterObserver(this.A07);
        AnonymousClass4ZH r0 = this.A04;
        r0.A03.unregisterObserver(r0.A02);
        this.A0A.unregisterObserver(this.A09);
    }

    public boolean A0T() {
        C18030ve r2 = this.A0H;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 5543) || C18020vd.A05(r1, r2, 7983) || !C18020vd.A05(r1, r2, 12705)) {
            return false;
        }
        return true;
    }

    public boolean A0U() {
        C18030ve r2 = this.A0H;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 5543)) {
            AnonymousClass1MG r0 = this.A03.A08;
            r0.A04();
            if (r0.A01.size() <= 0 || !C18020vd.A05(r1, r2, 7983) || !C18020vd.A05(r1, r2, 12705)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass3VJ(AnonymousClass1KB r6, AnonymousClass11S r7, C34511kb r8, AnonymousClass1M9 r9, C24671Lf r10, AnonymousClass1Q1 r11, AnonymousClass1CJ r12, AnonymousClass1NN r13, AnonymousClass1R3 r14, C24681Lg r15, C18030ve r16, C25191Ng r17, C39501tB r18, C42211xo r19, C35201lp r20, AnonymousClass10I r21, AnonymousClass00H r22) {
        this.A0H = r16;
        this.A01 = r6;
        this.A02 = r7;
        this.A0B = r12;
        this.A0A = r11;
        this.A0P = C200710s.A00(r21);
        this.A08 = r10;
        this.A0E = r14;
        this.A0G = r15;
        this.A0M = r19;
        this.A0S = r22;
        this.A03 = r8;
        this.A0L = r18;
        this.A0D = r13;
        this.A0N = r20;
        this.A0J = r17;
        this.A06 = r9;
        this.A0O = AnonymousClass3MW.A0n(AnonymousClass000.A13());
        C41111vp A0n = AnonymousClass3MW.A0n(AnonymousClass000.A13());
        this.A0a = A0n;
        this.A0U = new C98934rx(r12);
        this.A0T = new C98944ry(r8, r12);
        AnonymousClass4ZH r2 = new AnonymousClass4ZH(r13, C99244sV.A00(this, 15));
        this.A04 = r2;
        C22801Dg r3 = new C22801Dg();
        this.A00 = r3;
        r3.A0H(A0n, new C91584fv(r3, 26));
        r3.A0H(r2.A04, new C91584fv(this, 27));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d8, code lost:
        if (r8.isEmpty() != false) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013f A[LOOP:1: B:47:0x0136->B:51:0x013f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass3VJ r25, boolean r26) {
        /*
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            r9 = r25
            boolean r0 = r9.A0U()
            r7 = 6
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L_0x001e
            X.0ve r2 = r9.A0H
            if (r2 == 0) goto L_0x0177
            X.0vf r1 = X.C18040vf.A01
            r0 = 12549(0x3105, float:1.7585E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0177
        L_0x001e:
            java.util.Map r15 = r9.A0V
            java.util.Set r0 = r15.keySet()
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            java.util.Comparator r0 = r9.A0T
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r17 = r1.iterator()
        L_0x0031:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r4 = r17.next()
            X.1ci r4 = (X.C29691ci) r4
            java.lang.Object r1 = r15.get(r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 == 0) goto L_0x0031
            r2 = 7
            X.4sU r0 = new X.4sU
            r0.<init>(r2)
            java.util.List r13 = X.C29431cG.A0z(r1, r0)
            X.1BI r0 = r4.A08()
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass3MW.A0f(r0)
            if (r3 == 0) goto L_0x005f
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x006a
        L_0x005f:
            X.4ZH r0 = r9.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x006a
            goto L_0x0031
        L_0x006a:
            X.4ZH r1 = r9.A04
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00b3
            X.1BI r0 = r4.A08()
            com.whatsapp.jid.GroupJid r3 = X.C36321nh.A00(r0)
            if (r3 != 0) goto L_0x0086
            java.util.List r12 = java.util.Collections.emptyList()
        L_0x0082:
            r8.addAll(r12)
            goto L_0x0031
        L_0x0086:
            r0 = 16
            X.5Am r22 = X.AnonymousClass3MW.A16(r1, r0)
            r0 = 17
            X.5Am r23 = X.AnonymousClass3MW.A16(r1, r0)
            X.4TK r0 = r1.A00
            java.util.Set r0 = r0.A00
            boolean r25 = X.C29431cG.A18(r0, r3)
            r24 = 1
            X.4V8 r1 = new X.4V8
            r21 = r3
            r18 = r1
            r19 = r4
            r20 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.2kl r0 = new X.2kl
            r0.<init>(r1, r2, r3)
            java.util.List r12 = java.util.Collections.singletonList(r0)
            goto L_0x0082
        L_0x00b3:
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            X.1BI r0 = r4.A08()
            com.whatsapp.jid.GroupJid r3 = X.C36321nh.A00(r0)
            X.1M9 r1 = r9.A06
            X.1BI r0 = r4.A08()
            X.1E7 r11 = r1.A0E(r0)
            if (r3 == 0) goto L_0x00f6
            X.0ve r0 = r9.A0H
            boolean r10 = X.AnonymousClass1J8.A08(r0)
            X.1Di r1 = r9.A0Y
            X.1Di r0 = r9.A0Z
            X.4V8 r2 = new X.4V8
            r25 = r6
            r18 = r2
            r19 = r4
            r20 = r11
            r21 = r3
            r22 = r1
            r23 = r0
            r24 = r6
            if (r10 == 0) goto L_0x010e
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r1 = 22
        L_0x00ee:
            X.2kl r0 = new X.2kl
            r0.<init>(r2, r1, r3)
            r12.add(r0)
        L_0x00f6:
            X.1R3 r2 = r9.A0E
            X.1BI r1 = r4.A08()
            r0 = 1
            X.206 r14 = r2.A06(r1, r0)
            r10 = 0
            if (r14 == 0) goto L_0x0135
            X.11S r0 = r9.A02
            boolean r0 = X.AnonymousClass25A.A0S(r0, r14)
            if (r0 == 0) goto L_0x0135
            monitor-enter(r4)
            goto L_0x0113
        L_0x010e:
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r1 = 7
            goto L_0x00ee
        L_0x0113:
            long r2 = r4.A0M     // Catch:{ all -> 0x0181 }
            monitor-exit(r4)
            monitor-enter(r4)
            long r0 = r4.A0L     // Catch:{ all -> 0x0181 }
            monitor-exit(r4)
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 < 0) goto L_0x0135
            X.1Di r0 = r9.A0X
            X.4TJ r2 = new X.4TJ
            r2.<init>(r14, r0)
            X.1BI r3 = r14.A0H()
            r1 = 12
            X.2kl r0 = new X.2kl
            r0.<init>(r2, r1, r3)
            r12.add(r0)
            r14 = 1
            goto L_0x0136
        L_0x0135:
            r14 = 0
        L_0x0136:
            int r0 = r13.size()
            if (r10 >= r0) goto L_0x015f
            r3 = 3
            if (r14 >= r3) goto L_0x015f
            java.lang.Object r1 = r13.get(r10)
            X.1ci r1 = (X.C29691ci) r1
            X.1BI r0 = r1.A08()
            X.1tO r2 = new X.1tO
            r2.<init>((X.AnonymousClass1E7) r11, (X.AnonymousClass1BI) r0)
            X.1BI r1 = r1.A08()
            X.2kl r0 = new X.2kl
            r0.<init>(r2, r3, r1)
            r12.add(r0)
            int r14 = r14 + 1
            int r10 = r10 + 1
            goto L_0x0136
        L_0x015f:
            X.0ve r0 = r9.A0H
            boolean r0 = X.AnonymousClass1J8.A08(r0)
            if (r0 != 0) goto L_0x0082
            r2 = 8
            X.1BI r1 = r4.A08()
            X.2kl r0 = new X.2kl
            r0.<init>(r4, r2, r1)
            r12.add(r0)
            goto L_0x0082
        L_0x0177:
            X.2kl r0 = new X.2kl
            r0.<init>(r5, r7, r5)
            r8.add(r6, r0)
            goto L_0x001e
        L_0x0181:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0184:
            int r0 = r8.size()
            if (r0 == 0) goto L_0x01da
            boolean r0 = r9.A0T()
            if (r0 == 0) goto L_0x019f
            X.0ve r2 = r9.A0H
            if (r2 == 0) goto L_0x01f5
            X.0vf r1 = X.C18040vf.A01
            r0 = 12549(0x3105, float:1.7585E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != r0) goto L_0x01f5
        L_0x019f:
            X.00H r0 = r9.A0S
            java.lang.Object r0 = r0.get()
            X.4Q3 r0 = (X.AnonymousClass4Q3) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "simplified_community_creation_banner_dismissed"
            boolean r2 = r1.getBoolean(r0, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunitySharedPrefs/ isSimplifyCommunityCreationBannerDismissed()/isDismissed = "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 != 0) goto L_0x01d4
            X.0ve r2 = r9.A0H
            r1 = 12705(0x31a1, float:1.7803E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x01d4
            r1 = 23
            X.2kl r0 = new X.2kl
            r0.<init>(r5, r1, r5)
            r8.add(r6, r0)
        L_0x01d4:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01e8
        L_0x01da:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            r1 = 9
            X.2kl r0 = new X.2kl
            r0.<init>(r5, r1, r5)
            r8.add(r0)
        L_0x01e8:
            X.1vp r0 = r9.A0O
            r0.A0E(r8)
            if (r26 == 0) goto L_0x01f4
            X.1vp r0 = r9.A0a
            r0.A0E(r8)
        L_0x01f4:
            return
        L_0x01f5:
            X.2kl r0 = new X.2kl
            r0.<init>(r5, r7, r5)
            r8.add(r6, r0)
            goto L_0x019f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VJ.A04(X.3VJ, boolean):void");
    }
}
