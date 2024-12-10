package X;

import com.whatsapp.bot.home.sync.discovery.DiscoveryBots;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1z1  reason: invalid class name and case insensitive filesystem */
public final class C42961z1 {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1DT A04 = new AnonymousClass1DS((Object) null);
    public final AnonymousClass1M9 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public volatile AnonymousClass1E7 A08;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1DT, X.1DS] */
    public C42961z1(AnonymousClass1M9 r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r3;
        this.A07 = r7;
        this.A06 = r8;
        this.A03 = r9;
        Boolean bool = C17960vV.A01;
    }

    public final void A02() {
        if (A00(this, false) == null) {
            if (C18020vd.A00(C18040vf.A02, this.A01, 4417) >= 0) {
                ((C446424f) this.A03.get()).A01().A0A(new C21111Aef(this, 0), new C21502AlB(this.A02, 1));
            }
        }
    }

    public final boolean A04(DiscoveryBots discoveryBots) {
        if (discoveryBots != null) {
            long j = discoveryBots.A00;
            C18030ve r2 = this.A01;
            if (AnonymousClass11P.A01(this.A00) <= (((long) C18020vd.A00(C18040vf.A02, r2, 4417)) * 1000) + j) {
                Set<AnonymousClass20Q> singleton = Collections.singleton(discoveryBots.A01);
                C18070vi.A0X(singleton);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (AnonymousClass20Q r0 : singleton) {
                    linkedHashSet.add(r0.A00);
                }
                if (A01(linkedHashSet)) {
                    List<C435920d> list = discoveryBots.A02;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return false;
                    }
                    for (C435920d r02 : list) {
                        if (!r02.A02.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final DiscoveryBots A00(C42961z1 r5, boolean z) {
        AnonymousClass1DT r4 = r5.A04;
        DiscoveryBots discoveryBots = (DiscoveryBots) r4.A06();
        if (discoveryBots == null || !r5.A04(discoveryBots)) {
            discoveryBots = ((C33221iT) r5.A07.get()).A00();
            if (discoveryBots != null) {
                UserJid userJid = discoveryBots.A01.A00;
                List singletonList = Collections.singletonList(userJid);
                C18070vi.A0X(singletonList);
                if (r5.A01(singletonList)) {
                    r5.A08 = r5.A05.A0H(userJid);
                }
            }
            if (!r5.A04(discoveryBots)) {
                if (z) {
                    r4.A0E((Object) null);
                }
                return null;
            }
        }
        r4.A0E(discoveryBots);
        return discoveryBots;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0168, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x016b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016c, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x016f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(java.util.Collection r37) {
        /*
            r36 = this;
            r9 = r36
            X.00H r0 = r9.A06
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.0vl r10 = r0.A01
            java.lang.Object r1 = r10.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.util.Set r1 = r1.keySet()
            X.C18070vi.A0X(r1)
            r11 = r37
            java.util.Set r5 = X.C29431cG.A14(r11, r1)
            boolean r1 = r5.isEmpty()
            r14 = 1
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x01a4
            X.00H r1 = r0.A00
            java.lang.Object r7 = r1.get()
            X.23Y r7 = (X.AnonymousClass23Y) r7
            r8 = 0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0173
            r1 = 10
            int r1 = X.C29351c6.A0C(r5, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Iterator r2 = r5.iterator()
        L_0x0050:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.String r1 = r1.getRawString()
            r3.add(r1)
            goto L_0x0050
        L_0x0064:
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.Object[] r3 = r3.toArray(r1)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r2 = new X.23b
            r2.<init>(r3, r1)
            X.1Lt r1 = r7.A00
            X.1at r3 = r1.get()
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x0169 }
        L_0x007b:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0169 }
            if (r1 == 0) goto L_0x0170
            java.lang.Object r8 = r13.next()     // Catch:{ all -> 0x0169 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x0169 }
            r1 = r3
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0169 }
            X.1Ev r7 = r1.A02     // Catch:{ all -> 0x0169 }
            int r12 = r8.length     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r2.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "\n            SELECT\n              jid,\n              tag,\n              name,\n              is_default,\n              attributes,\n              description,\n              category,\n              prompts,\n              persona_id,\n              commands_description,\n              commands,\n              avatar_url,\n              is_meta_created,\n              creator_name,\n              creator_profile_url,\n              card_title,\n              count,\n              capabilities,\n              last_updated_time_ms,\n              created_by_me\n            FROM\n              wa_bot_profiles\n            WHERE\n              jid\n            IN\n              "
            r2.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = X.AnonymousClass1H2.A00(r12)     // Catch:{ all -> 0x0169 }
            r2.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "\n        "
            r2.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "GET_BOT_PROFILES_BY_JIDS"
            android.database.Cursor r15 = r7.A0A(r2, r1, r8)     // Catch:{ all -> 0x0169 }
            X.C18070vi.A0b(r15)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "jid"
            int r8 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "tag"
            int r17 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "name"
            int r18 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "is_default"
            int r19 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "attributes"
            int r20 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "description"
            int r21 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "category"
            int r22 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "prompts"
            int r23 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "persona_id"
            int r24 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "commands_description"
            int r25 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "commands"
            int r26 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "avatar_url"
            int r27 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "is_meta_created"
            int r28 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "creator_name"
            int r29 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "creator_profile_url"
            int r30 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "card_title"
            int r31 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "count"
            int r32 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "capabilities"
            int r33 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "last_updated_time_ms"
            int r34 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "created_by_me"
            int r35 = r15.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0162 }
        L_0x0129:
            boolean r1 = r15.moveToNext()     // Catch:{ all -> 0x0162 }
            if (r1 == 0) goto L_0x015d
            java.lang.String r2 = r15.getString(r8)     // Catch:{ all -> 0x0162 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0162 }
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0162 }
            com.whatsapp.jid.UserJid r1 = r1.A04(r2)     // Catch:{ all -> 0x0162 }
            if (r1 != 0) goto L_0x0153
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r7 = "BotProfileStore/readBotProfilesFromCursor invalid jid="
            r1.append(r7)     // Catch:{ all -> 0x0162 }
            r1.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0129
        L_0x0153:
            r16 = r1
            X.24e r2 = X.AnonymousClass23Y.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0162 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0162 }
            goto L_0x0129
        L_0x015d:
            r15.close()     // Catch:{ all -> 0x0169 }
            goto L_0x007b
        L_0x0162:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            X.CDX.A00(r15, r1)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016b }
        L_0x016b:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0170:
            r3.close()
        L_0x0173:
            java.util.Iterator r7 = r5.iterator()
        L_0x0177:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01a4
            java.lang.Object r3 = r7.next()
            java.lang.Object r2 = r4.get(r3)
            if (r2 == 0) goto L_0x0194
            java.lang.Object r1 = r10.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r1.put(r3, r2)
            r6.put(r3, r2)
            goto L_0x0177
        L_0x0194:
            X.0vl r1 = r0.A02
            java.lang.Object r2 = r1.getValue()
            X.00z r2 = (X.C002100z) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            r2.A08(r3, r1)
            goto L_0x0177
        L_0x01a4:
            java.util.Iterator r2 = r11.iterator()
        L_0x01a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x01a8
            java.lang.Object r0 = r10.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x01a8
            r6.put(r1, r0)
            goto L_0x01a8
        L_0x01c8:
            boolean r0 = r6.isEmpty()
            r7 = 0
            if (r0 != 0) goto L_0x0218
            java.util.Set r1 = r6.keySet()
            X.00H r0 = r9.A03
            java.lang.Object r6 = r0.get()
            X.C18070vi.A0X(r6)
            X.24f r6 = (X.C446424f) r6
            java.util.Iterator r8 = r1.iterator()
        L_0x01e2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r5 = r8.next()
            r1 = r5
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.C18070vi.A0d(r1, r7)
            X.1M9 r0 = r6.A00
            X.1E7 r1 = r0.A0H(r1)
            int r0 = r1.A07
            if (r0 < 0) goto L_0x01e2
            if (r0 == 0) goto L_0x0216
            X.1Lr r0 = r6.A01
            java.io.File r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0216
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0216
            long r3 = r1.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01e2
        L_0x0216:
            if (r5 == 0) goto L_0x0219
        L_0x0218:
            return r7
        L_0x0219:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42961z1.A01(java.util.Collection):boolean");
    }

    public final void A03(AnonymousClass1F9 r3, C22821Di r4) {
        AnonymousClass1E7 r0 = this.A08;
        if (r0 != null) {
            r4.invoke(r0);
        } else {
            this.A02.CGN(new C21455AkM(r3, this, r4));
        }
    }
}
