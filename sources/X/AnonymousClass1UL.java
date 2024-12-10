package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1UL  reason: invalid class name */
public class AnonymousClass1UL {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1R3 A04;
    public final C24751Ln A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1MW A07;

    public static Map A00(AnonymousClass1E7 r8, AnonymousClass1UL r9) {
        AnonymousClass1BI r6 = r8.A0J;
        if (C22971Dz.A0d(r6)) {
            AnonymousClass11S r1 = r9.A00;
            r1.A0I();
            AnonymousClass1E8 r0 = r1.A0D;
            if (r0 != null) {
                UserJid userJid = (UserJid) r0.A0J;
                AnonymousClass1E2 A09 = r1.A09();
                HashSet hashSet = new HashSet();
                UserJid userJid2 = (UserJid) r6;
                HashSet hashSet2 = new HashSet();
                UserJid A0F = r9.A05.A0F(userJid2);
                UserJid userJid3 = A0F;
                if (C22971Dz.A0Y(userJid2)) {
                    userJid3 = userJid2;
                }
                if (!C22971Dz.A0U(userJid2)) {
                    userJid2 = A0F;
                }
                if (C22971Dz.A0Y(userJid3) && userJid != null) {
                    hashSet2.addAll(r9.A03.A08.A0E(userJid, Collections.singleton(userJid3), -1).keySet());
                }
                if (C22971Dz.A0U(userJid2) && A09 != null) {
                    hashSet2.addAll(r9.A03.A08.A0E(A09, Collections.singleton(userJid2), -1).keySet());
                }
                HashSet hashSet3 = new HashSet();
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI r12 = (AnonymousClass1BI) it.next();
                    if (!((C59742mo) r9.A06.get()).A02.A0R(r12)) {
                        hashSet3.add(r12);
                    }
                }
                hashSet.addAll(hashSet3);
                return r9.A01.A0P(hashSet);
            }
        }
        return Collections.emptyMap();
    }

    public AnonymousClass1EC A02(UserJid userJid) {
        AnonymousClass1EC A0D;
        AnonymousClass1EC A0D2;
        AnonymousClass11S r1 = this.A00;
        r1.A0I();
        AnonymousClass1E8 r0 = r1.A0D;
        if (r0 != null) {
            UserJid userJid2 = (UserJid) r0.A0J;
            AnonymousClass1E2 A09 = r1.A09();
            UserJid A0F = this.A05.A0F(userJid);
            UserJid userJid3 = A0F;
            if (C22971Dz.A0Y(userJid)) {
                userJid3 = userJid;
            }
            if (!C22971Dz.A0U(userJid)) {
                userJid = A0F;
            }
            if (userJid2 != null && userJid3 != null && (A0D2 = this.A07.A0D(userJid2, userJid3)) != null) {
                return A0D2;
            }
            if (A09 == null || userJid == null || (A0D = this.A07.A0D(A09, userJid)) == null) {
                return null;
            }
            return A0D;
        }
        return null;
    }

    public AnonymousClass1UL(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass1CJ r3, AnonymousClass1MZ r4, AnonymousClass1R3 r5, AnonymousClass1MW r6, C24751Ln r7, AnonymousClass00H r8) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r7;
        this.A04 = r5;
        this.A07 = r6;
        this.A03 = r4;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        r2.A01 = r0;
        r2.A02 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194369rc A01(X.AnonymousClass1E7 r14) {
        /*
            r13 = this;
            java.util.Map r8 = A00(r14, r13)
            X.9rc r2 = new X.9rc
            r2.<init>()
            int r0 = r8.size()
            r2.A00 = r0
            int r0 = r8.size()
            if (r0 == 0) goto L_0x01ac
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r0 = r8.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0022:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r6 = r7.next()
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r4 = r6.A06(r0)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = r6.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            X.2ml r3 = new X.2ml
            r3.<init>()
            java.lang.String r1 = r6.A0K()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r3.A03 = r1
            X.11S r1 = r13.A00
            com.whatsapp.jid.UserJid r0 = r6.A0K
            boolean r0 = r1.A0O(r0)
            r3.A05 = r0
            X.1MZ r0 = r13.A03
            boolean r0 = r0.A0K(r4)
            r3.A04 = r0
            X.1CJ r0 = r13.A02
            long r0 = r0.A08(r4)
            r3.A02 = r0
            r5.add(r3)
            goto L_0x0022
        L_0x006f:
            r1 = 25
            X.Akr r0 = new X.Akr
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x01ac
            int r0 = r5.size()
            r6 = 0
            r4 = 1
            if (r0 == r4) goto L_0x019f
            java.util.Iterator r1 = r5.iterator()
        L_0x008b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r3 = r1.next()
            X.2ml r3 = (X.C59712ml) r3
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x008b
            r0 = 2
        L_0x009c:
            r2.A01 = r0
            r2.A02 = r3
            return r2
        L_0x00a1:
            java.util.Iterator r1 = r5.iterator()
        L_0x00a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r3 = r1.next()
            X.2ml r3 = (X.C59712ml) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00a5
            r0 = 3
            goto L_0x009c
        L_0x00b7:
            r5.clear()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r0 = r8.values()
            java.util.Iterator r12 = r0.iterator()
        L_0x00c7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r10 = r12.next()
            X.1E7 r10 = (X.AnonymousClass1E7) r10
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r7 = r10.A06(r0)
            X.1E9 r7 = (X.AnonymousClass1E9) r7
            if (r7 == 0) goto L_0x00c7
            java.lang.String r0 = r10.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c7
            X.1CJ r0 = r13.A02
            long r0 = r0.A08(r7)
            X.1MZ r3 = r13.A03
            X.1MW r3 = r3.A08
            X.2tp r3 = r3.A0B(r7)
            X.10f r11 = r3.A09()
            X.1IX r3 = r11.asList()
            X.1IZ r9 = r3.iterator()
            r8 = 0
        L_0x0102:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0119
            java.lang.Object r7 = r9.next()
            X.1BI r7 = (X.AnonymousClass1BI) r7
            X.1M9 r3 = r13.A01
            boolean r3 = r3.A0z(r7)
            if (r3 == 0) goto L_0x0102
            int r8 = r8 + 1
            goto L_0x0102
        L_0x0119:
            X.2ml r7 = new X.2ml
            r7.<init>()
            java.lang.String r3 = r10.A0K()
            X.C18070vi.A0d(r3, r6)
            r7.A03 = r3
            r7.A02 = r0
            int r0 = r11.size()
            r7.A00 = r0
            r7.A01 = r8
            r5.add(r7)
            goto L_0x00c7
        L_0x0135:
            int r0 = r5.size()
            if (r0 == 0) goto L_0x01ac
            int r0 = r5.size()
            if (r0 == r4) goto L_0x019f
            r1 = 26
            X.Akr r0 = new X.Akr
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x014f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r1 = r3.next()
            X.2ml r1 = (X.C59712ml) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x014f
            r0 = 4
            r2.A01 = r0
            r2.A02 = r1
            return r2
        L_0x0165:
            r1 = 27
            X.Akr r0 = new X.Akr
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0183
            r0 = 5
            r2.A01 = r0
            java.lang.Object r0 = r5.get(r6)
            X.2ml r0 = (X.C59712ml) r0
            X.C18070vi.A0d(r0, r6)
            r2.A02 = r0
        L_0x0183:
            int r0 = r5.size()
            if (r0 <= r4) goto L_0x01ac
            java.lang.Object r0 = r5.get(r6)
            X.2ml r0 = (X.C59712ml) r0
            int r1 = r0.A00
            java.lang.Object r0 = r5.get(r4)
            X.2ml r0 = (X.C59712ml) r0
            int r0 = r0.A00
            if (r1 != r0) goto L_0x01ac
            r0 = 6
            r2.A01 = r0
            return r2
        L_0x019f:
            r2.A01 = r4
            java.lang.Object r0 = r5.get(r6)
            X.2ml r0 = (X.C59712ml) r0
            X.C18070vi.A0d(r0, r6)
            r2.A02 = r0
        L_0x01ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UL.A01(X.1E7):X.9rc");
    }
}
