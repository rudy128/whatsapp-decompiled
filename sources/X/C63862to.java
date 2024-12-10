package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2to  reason: invalid class name and case insensitive filesystem */
public final class C63862to {
    public final C19880zA A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1M9 A03;
    public final C19830z4 A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass1MS A07;
    public final C24751Ln A08;
    public final C18030ve A09;
    public final AnonymousClass126 A0A;
    public final AnonymousClass128 A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass1Cd A0E;
    public final AnonymousClass1PQ A0F;

    public C63862to(C19880zA r19, AnonymousClass190 r20, AnonymousClass11S r21, AnonymousClass1M9 r22, AnonymousClass11P r23, C19830z4 r24, AnonymousClass1CJ r25, AnonymousClass121 r26, AnonymousClass1MS r27, AnonymousClass1MZ r28, AnonymousClass1Cd r29, C24751Ln r30, C18030ve r31, AnonymousClass126 r32, AnonymousClass128 r33, AnonymousClass1PQ r34) {
        C18030ve r5 = r31;
        AnonymousClass1CJ r11 = r25;
        AnonymousClass11P r13 = r23;
        AnonymousClass11S r14 = r21;
        AnonymousClass190 r16 = r20;
        C18070vi.A0w(r13, r5, r16, r14, r11);
        AnonymousClass126 r4 = r32;
        AnonymousClass1Cd r7 = r29;
        C24751Ln r6 = r30;
        C19830z4 r12 = r24;
        AnonymousClass1M9 r15 = r22;
        C18070vi.A0x(r15, r6, r4, r7, r12);
        AnonymousClass128 r3 = r33;
        AnonymousClass1PQ r2 = r34;
        AnonymousClass1MS r9 = r27;
        AnonymousClass1MZ r8 = r28;
        AnonymousClass121 r10 = r26;
        C18070vi.A0y(r10, r2, r3, r9, r8);
        C19880zA r17 = r19;
        C18070vi.A0d(r17, 16);
        this.A0C = r13;
        this.A09 = r5;
        this.A01 = r16;
        this.A02 = r14;
        this.A05 = r11;
        this.A03 = r15;
        this.A08 = r6;
        this.A0A = r4;
        this.A0E = r7;
        this.A04 = r12;
        this.A06 = r10;
        this.A0F = r2;
        this.A0B = r3;
        this.A07 = r9;
        this.A0D = r8;
        this.A00 = r17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(X.C47712Jo r5, java.util.Collection r6, java.util.List r7, X.C18090vk r8) {
        /*
            r4 = this;
            X.1Cd r0 = r4.A0E
            X.1au r2 = r0.A05()
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x0034 }
            X.126 r1 = r4.A0A     // Catch:{ all -> 0x002d }
            java.util.ArrayList r0 = X.C29431cG.A0m(r7)     // Catch:{ all -> 0x002d }
            r1.A0W(r5, r0)     // Catch:{ all -> 0x002d }
            java.util.ArrayList r0 = X.C29431cG.A0m(r6)     // Catch:{ all -> 0x002d }
            r1.A0V(r5, r0)     // Catch:{ all -> 0x002d }
            r1 = 11
            X.Aik r0 = new X.Aik     // Catch:{ all -> 0x002d }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x002d }
            r2.BJ7(r0)     // Catch:{ all -> 0x002d }
            r3.A00()     // Catch:{ all -> 0x002d }
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x002d }
            r3.close()     // Catch:{ all -> 0x0034 }
            goto L_0x003a
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x004d }
            r1.<init>(r0)     // Catch:{ all -> 0x004d }
        L_0x003a:
            java.lang.Throwable r0 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "BroadcastListManager/replaceParticipants failed to replace participants for "
            X.C17900vP.A0X(r5, r0, r1)     // Catch:{ all -> 0x004d }
        L_0x0049:
            r2.close()
            return
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63862to.A04(X.2Jo, java.util.Collection, java.util.List, X.0vk):void");
    }

    public static final boolean A05(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C22971Dz.A0T(C17880vN.A0S(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C48392Mh A00(X.C63862to r8, X.C47712Jo r9, java.util.List r10) {
        /*
            boolean r0 = A05(r10)
            if (r0 == 0) goto L_0x0056
            X.0ve r2 = r8.A09
            r1 = 4509(0x119d, float:6.318E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r10.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x001a
            r3.add(r1)
            goto L_0x001a
        L_0x002c:
            java.util.Set r1 = X.C29431cG.A12(r3)
            X.1Ln r0 = r8.A08
            java.util.Map r3 = r0.A0L(r1)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r10.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r3.get(r1)
        L_0x0050:
            if (r1 == 0) goto L_0x003e
            r7.add(r1)
            goto L_0x003e
        L_0x0056:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r10.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r0 != 0) goto L_0x005e
            r7.add(r1)
            goto L_0x005e
        L_0x0070:
            int r1 = r10.size()
            int r0 = r7.size()
            if (r1 == r0) goto L_0x00af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BroadcastListManager/filterParticipants "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r2 = "; input="
            r1.append(r2)
            r1.append(r10)
            r0 = 59
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.190 r3 = r8.A01
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r9)
            X.C17890vO.A15(r2, r1, r10)
            java.lang.String r0 = "; output="
            X.C17890vO.A14(r0, r1, r7)
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "lid-broadcast-filtered-participants"
            r3.A0G(r0, r2, r1)
        L_0x00af:
            X.126 r2 = r8.A0A
            r1 = 0
            boolean r0 = A05(r7)
            r2.A0U(r9, r7, r1, r0)
            boolean r1 = A05(r7)
            X.11S r0 = r8.A02
            if (r1 == 0) goto L_0x00e9
            X.1E2 r6 = r0.A0A()
        L_0x00c5:
            X.C18070vi.A0b(r6)
            X.1BI r6 = (X.AnonymousClass1BI) r6
            X.1PQ r1 = r8.A0F
            X.11P r0 = r8.A0C
            long r3 = X.AnonymousClass11P.A01(r0)
            r5 = 0
            X.1PP r0 = r1.A02
            X.205 r2 = X.C17880vN.A0Z(r9, r0)
            r1 = 9
            X.2Mh r0 = new X.2Mh
            r0.<init>(r2, r1, r3)
            r0.A0i(r5)
            r0.A01 = r7
            r0.A0d(r6)
            return r0
        L_0x00e9:
            com.whatsapp.jid.PhoneUserJid r6 = X.AnonymousClass11S.A01(r0)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63862to.A00(X.2to, X.2Jo, java.util.List):X.2Mh");
    }

    public static final ArrayList A01(C63862to r4, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof PhoneUserJid) {
                A13.add(next);
            }
        }
        Map A0L = r4.A08.A0L(C29431cG.A12(A13));
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next2 : list) {
            if (next2 instanceof PhoneUserJid) {
                next2 = A0L.get(next2);
            } else if (!(next2 instanceof AnonymousClass1E2)) {
            }
            if (next2 != null) {
                A132.add(next2);
            }
        }
        return A132;
    }

    public static final List A02(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (C22971Dz.A0X((Jid) next)) {
                A13.add(next);
            }
        }
        ArrayList A0D2 = C29351c6.A0D(A13);
        for (Object next2 : A13) {
            C18070vi.A0z(next2, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            A0D2.add(next2);
        }
        return A0D2;
    }

    public static final void A03(C63862to r6, C47712Jo r7, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BroadcastListManager/convertListAddressingMode converting list ");
        A10.append(r7);
        C17900vP.A0f(" to ", str, A10);
        C63872tp A0C2 = r6.A0D.A08.A0C(r7);
        C199410f A072 = A0C2.A07();
        C18070vi.A0X(A072);
        boolean equals = str.equals("lid");
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A072.iterator();
        if (equals) {
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof PhoneUserJid) && next != null) {
                    A13.add(next);
                }
            }
            r6.A04(r7, r6.A08.A0L(C29431cG.A12(A13)).values(), A13, new AnonymousClass3I0(A0C2, r6, r7));
            return;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if ((next2 instanceof AnonymousClass1E2) && next2 != null) {
                A13.add(next2);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            PhoneUserJid A0D2 = r6.A08.A0D((AnonymousClass1E1) it2.next());
            if (A0D2 != null) {
                A132.add(A0D2);
            }
        }
        r6.A04(r7, A132, A13, new AnonymousClass3I1(A0C2, r6, r7));
    }
}
