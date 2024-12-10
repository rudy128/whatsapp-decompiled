package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1UH  reason: invalid class name */
public class AnonymousClass1UH {
    public final C19880zA A00;
    public final C26911Ty A01;
    public final AnonymousClass1UB A02;
    public final AnonymousClass1U1 A03;
    public final AnonymousClass1U6 A04;
    public final AnonymousClass1UG A05;
    public final C26891Tw A06;
    public final AnonymousClass1U7 A07;
    public final AnonymousClass1UA A08;
    public final AnonymousClass1UC A09;
    public final AnonymousClass1U0 A0A;
    public final AnonymousClass1UF A0B;
    public final AnonymousClass123 A0C;
    public final C18030ve A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;

    public void A00(AnonymousClass2R1 r11, C188829i3 r12, C59902n4 r13, AnonymousClass1E7 r14, long j) {
        UserJid userJid = r12.A0D;
        C17960vV.A07(userJid);
        if (userJid.equals(r14.A0J)) {
            Map singletonMap = Collections.singletonMap(r12.A0D, r12);
            A01(r11, r13, (AnonymousClass2HO) null, Collections.singletonList(new C20043A4m(r14).A00()), singletonMap, (Map) null, j, false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("jid doesn't match, jid1=");
        sb.append(r12.A0D);
        sb.append(", jid2=");
        sb.append(r14.A0J);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A02(C59902n4 r7, Collection collection) {
        A00 a00 = r7.A05;
        if (a00 != null && a00.A04) {
            C51822Zt r5 = (C51822Zt) this.A0I.get();
            C18070vi.A0d(collection, 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C188829i3 r0 = (C188829i3) it.next();
                AnonymousClass1E2 r2 = r0.A0C;
                UserJid userJid = r0.A0D;
                if (r2 != null && (userJid instanceof PhoneUserJid)) {
                    arrayList.add(new AnonymousClass1D6(r2, userJid));
                }
            }
            Map A0D2 = AnonymousClass1D7.A0D(arrayList);
            if (!A0D2.isEmpty()) {
                r5.A00.A0K(A0D2);
            }
        }
    }

    public AnonymousClass1UH(C19880zA r2, C26911Ty r3, AnonymousClass1UB r4, AnonymousClass1U1 r5, AnonymousClass1U6 r6, AnonymousClass1UG r7, C26891Tw r8, AnonymousClass1U7 r9, AnonymousClass1UA r10, AnonymousClass1UC r11, AnonymousClass1U0 r12, AnonymousClass1UF r13, AnonymousClass123 r14, C18030ve r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22) {
        this.A0D = r15;
        this.A0I = r16;
        this.A0C = r14;
        this.A06 = r8;
        this.A01 = r3;
        this.A0A = r12;
        this.A0K = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r9;
        this.A08 = r10;
        this.A02 = r4;
        this.A09 = r11;
        this.A0H = r18;
        this.A0G = r19;
        this.A00 = r2;
        this.A0B = r13;
        this.A05 = r7;
        this.A0E = r20;
        this.A0F = r21;
        this.A0J = r22;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r0v145, types: [java.lang.Object, X.2kB] */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e6, code lost:
        if (r0.A04 == 2) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0531, code lost:
        if (r3 != 1) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0533, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05b7, code lost:
        if (r3 != r4.A00) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0682, code lost:
        if (r3.A02 == false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0686, code lost:
        if (r3 != null) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0688, code lost:
        r7 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x068a, code lost:
        if (r7 == null) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x068c, code lost:
        r14 = r3.A00;
        r31 = X.AnonymousClass1U6.A01(r10, r1, r0.A06, r0.A05);
        r13.A0I();
        r3 = r13.A0E;
        X.C17960vV.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06ac, code lost:
        if (r3.equals(r1) == false) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06ae, code lost:
        r4 = new java.util.HashMap(X.AnonymousClass1MR.A00(r6, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06b7, code lost:
        r27 = r6.A05(r1);
        r3 = r0.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06bd, code lost:
        if (r3 != null) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06bf, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06c0, code lost:
        r13 = X.C201110w.copyOf((java.util.Map) r8.A08(r7.validIndexes_, r4, r3, r7.currentIndex_));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0701, code lost:
        if (X.AnonymousClass1U5.A04(r8, r1, r7, new X.AnonymousClass1A3(new X.C19760yx(new X.C54292du(r13, X.AnonymousClass1U6.A00(r13.keySet(), r27, r7.rawId_, r7.timestamp_, r31), r8), java.lang.Boolean.valueOf(r31))), r0.A06) != false) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0703, code lost:
        r4 = new java.lang.StringBuilder();
        r3 = "contactsyncDevicesupdater/update/verifyAndUpdateKeyIndexListData indexList fail, userJid=";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x070a, code lost:
        r4.append(r3);
        r4.append(r1);
        com.whatsapp.util.Log.w(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0717, code lost:
        r4 = new X.C19760yx(r9, java.lang.Boolean.valueOf(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0722, code lost:
        if (r14 == null) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0724, code lost:
        r8.A06.A0a(r14, X.C63962tz.A02(r1.getPrimaryDevice()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0731, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0736, code lost:
        r4 = r6.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x073c, code lost:
        r4 = new java.lang.StringBuilder();
        r3 = "contactsyncDevicesupdater/update/verifyADVSignedKeyIndexList fail keyIndexListNull, userJid=";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09d7, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09da, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a83, code lost:
        if (r8.get(r7) == null) goto L_0x0a85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ce6, code lost:
        if (r0 == null) goto L_0x0ce8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0239, code lost:
        if (r4 != null) goto L_0x041e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x0b71 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass2R1 r53, X.C59902n4 r54, X.AnonymousClass2HO r55, java.util.List r56, java.util.Map r57, java.util.Map r58, long r59, boolean r61) {
        /*
            r52 = this;
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.HashSet r22 = new java.util.HashSet
            r22.<init>()
            r15 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            java.util.HashSet r23 = new java.util.HashSet
            r23.<init>()
            r5 = r52
            X.00H r0 = r5.A0F
            java.lang.Object r3 = r0.get()
            X.2gG r3 = (X.C55722gG) r3
            r7 = 1
            r51 = r53
            boolean r0 = r51.A00()
            r11 = r54
            if (r0 != 0) goto L_0x0035
            r0 = r51
            X.2Qw r1 = r0.mode
            X.2Qw r0 = X.C49542Qw.FULL
            if (r1 != r0) goto L_0x00be
        L_0x0035:
            X.A00 r1 = r11.A02
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "/ContactSyncIntegrityUpdater/"
            r4.append(r0)
            int r2 = r1.A00
            r4.append(r2)
            r1 = 47
            r4.append(r1)
            X.0z4 r6 = r3.A05
            int r0 = r6.A0D()
            r4.append(r0)
            r4.append(r1)
            long r0 = r6.A0O()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r8 = r6.A0D()
            r4 = 2
            if (r8 == r2) goto L_0x00a9
            r6.A1F(r2)
            r0 = 0
            if (r2 == r7) goto L_0x09b6
            if (r2 == r4) goto L_0x098e
            r9 = 3
            if (r2 != r9) goto L_0x00a1
            X.00H r9 = r6.A00
            java.lang.Object r10 = r9.get()
            android.content.SharedPreferences r10 = (android.content.SharedPreferences) r10
            java.lang.String r9 = "native_contacts_enter_integrity_timelock_timestamp"
            long r12 = r10.getLong(r9, r0)
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x00a1
            X.11P r0 = r3.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            r6.A1P(r0)
            X.1Ua r9 = r3.A03
            X.11P r0 = r9.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            r6 = 3
            X.C26931Ua.A00(r9, r6, r0)
        L_0x00a1:
            X.1To r0 = r3.A00
            r0.A0G()
            r0.A0I()
        L_0x00a9:
            if (r2 != r7) goto L_0x0983
            X.1UN r0 = r3.A06
            X.0z4 r0 = r0.A02
            long r6 = r0.A0O()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00be
            X.12E r0 = r3.A02
            r0.A08()
        L_0x00be:
            r50 = r57
            java.util.Collection r0 = r50.values()
            r5.A02(r11, r0)
            java.util.Iterator r20 = r56.iterator()
        L_0x00cb:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0a13
            java.lang.Object r7 = r20.next()
            X.9iB r7 = (X.C188899iB) r7
            X.1E7 r2 = r7.A07
            X.C17960vV.A07(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A06(r6)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 != 0) goto L_0x0103
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "syncresultupdater/skip/no-user-jid phoneNumber="
            r1.append(r0)
            java.lang.String r2 = r7.A0E
            r0 = 4
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r2, r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00cb
        L_0x0103:
            r0 = r21
            r0.put(r1, r7)
            r0 = r50
            java.lang.Object r0 = r0.get(r1)
            X.9i3 r0 = (X.C188829i3) r0
            if (r0 == 0) goto L_0x00cb
            int r4 = r0.A04
            r3 = 3
            if (r4 == r3) goto L_0x09f6
            X.A00 r3 = r11.A02
            if (r3 == 0) goto L_0x01f4
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x01f4
            X.1UF r4 = r5.A0B
            r3 = 1
            r4.A00(r0, r2, r3)
            boolean r3 = r51.A00()
            if (r3 == 0) goto L_0x013f
            X.00H r3 = r5.A0J
            java.lang.Object r3 = r3.get()
            X.1UN r3 = (X.AnonymousClass1UN) r3
            boolean r3 = r3.A08()
            if (r3 == 0) goto L_0x013f
            byte[] r3 = r7.A00
            if (r3 == 0) goto L_0x013f
            if (r61 != 0) goto L_0x0151
        L_0x013f:
            boolean r3 = r7.A0L
            if (r3 == 0) goto L_0x01e4
            X.00H r3 = r5.A0J
            java.lang.Object r3 = r3.get()
            X.1UN r3 = (X.AnonymousClass1UN) r3
            boolean r3 = r3.A07()
            if (r3 == 0) goto L_0x01e4
        L_0x0151:
            X.00H r3 = r5.A0K
            java.lang.Object r4 = r3.get()
            X.2Zu r4 = (X.C51832Zu) r4
            r14 = 1
            com.whatsapp.jid.UserJid r13 = r0.A0D
            if (r13 == 0) goto L_0x01e4
            int r3 = r2.A01
            if (r3 == r14) goto L_0x01e4
            X.1M9 r12 = r4.A00
            X.1M2 r8 = r12.A04
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r14)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            java.lang.String r9 = "is_contact_synced"
            r4.put(r9, r10)
            X.1Lt r3 = r8.A00     // Catch:{ IllegalArgumentException -> 0x018b }
            X.1au r3 = r3.A06()     // Catch:{ IllegalArgumentException -> 0x018b }
            X.AnonymousClass1M2.A09(r4, r8, r3, r13)     // Catch:{ all -> 0x0181 }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x018b }
            goto L_0x01a8
        L_0x0181:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x0186 }
            goto L_0x018a
        L_0x0186:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r4, r3)     // Catch:{ IllegalArgumentException -> 0x018b }
        L_0x018a:
            throw r4     // Catch:{ IllegalArgumentException -> 0x018b }
        L_0x018b:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ContactManagerDatabase/updateNativeContactSync failed "
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = ", "
            r4.append(r3)
            r4.append(r14)
            java.lang.String r3 = r4.toString()
            X.C17960vV.A09(r3, r8)
        L_0x01a8:
            X.0ve r8 = r12.A0H
            r4 = 10624(0x2980, float:1.4887E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r8, r4)
            if (r3 == 0) goto L_0x01e2
            X.1Lo r3 = r12.A02
            X.00H r3 = r3.A00
            java.lang.Object r3 = r3.get()
            X.1Ly r3 = (X.C24861Ly) r3
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r14)
            r4.put(r9, r10)
            X.1Lt r3 = r3.A00
            X.1au r9 = r3.A06()
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x09d4 }
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ all -> 0x09d4 }
            java.lang.String r3 = r13.getRawString()     // Catch:{ all -> 0x09d4 }
            r8[r15] = r3     // Catch:{ all -> 0x09d4 }
            java.lang.String r10 = "wa_address_book"
            java.lang.String r3 = "jid = ?"
            X.C24861Ly.A01(r4, r9, r10, r3, r8)     // Catch:{ all -> 0x09d4 }
            r9.close()
        L_0x01e2:
            r2.A01 = r14
        L_0x01e4:
            r3 = r51
            X.2Qw r4 = r3.mode
            X.2Qw r3 = X.C49542Qw.FULL
            if (r4 != r3) goto L_0x0425
            r3 = r51
            X.2Qy r4 = r3.context
            X.2Qy r3 = X.C49562Qy.REGISTRATION
            if (r4 != r3) goto L_0x0425
        L_0x01f4:
            com.whatsapp.jid.UserJid r9 = r0.A0D
            boolean r3 = X.C22971Dz.A0T(r9)
            if (r3 == 0) goto L_0x020d
            X.1Tw r8 = r5.A06
            if (r9 == 0) goto L_0x020d
            boolean r4 = r2.A0z
            boolean r3 = r7.A0T
            if (r4 == r3) goto L_0x020d
            r2.A0z = r3
            X.1M9 r4 = r8.A00
            r4.A0l(r9, r3)
        L_0x020d:
            X.A00 r3 = r11.A0C
            if (r3 == 0) goto L_0x023b
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x023b
            X.00H r3 = r5.A0H
            java.lang.Object r9 = r3.get()
            X.2c5 r9 = (X.C53162c5) r9
            java.lang.String r8 = r0.A0J
            if (r8 == 0) goto L_0x023b
            X.1E2 r4 = r0.A0C
            if (r4 != 0) goto L_0x041e
            com.whatsapp.jid.UserJid r4 = r0.A0D
            boolean r3 = r4 instanceof com.whatsapp.jid.PhoneUserJid
            if (r3 == 0) goto L_0x0233
            X.1Ln r3 = r9.A01
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            X.1E1 r4 = r3.A0A(r4)
        L_0x0233:
            boolean r3 = r4 instanceof X.AnonymousClass1E2
            if (r3 == 0) goto L_0x023b
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            if (r4 != 0) goto L_0x041e
        L_0x023b:
            X.A00 r3 = r11.A0A
            if (r3 == 0) goto L_0x027f
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x027f
            X.1U0 r12 = r5.A0A
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ContactSyncStatusUpdater/update/syncUser.statusType="
            r4.append(r3)
            int r3 = r0.A03
            r4.append(r3)
            java.lang.String r3 = " contact="
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            com.whatsapp.jid.Jid r10 = r2.A06(r6)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            if (r10 != 0) goto L_0x03b4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ContactSyncStatusUpdater/update failed: no jid/contact="
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x027f:
            X.A00 r3 = r11.A0B
            if (r3 == 0) goto L_0x02c4
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x02c4
            X.00H r3 = r5.A0G
            java.lang.Object r8 = r3.get()
            X.2c4 r8 = (X.C53152c4) r8
            X.0ve r9 = r8.A01
            r4 = 5839(0x16cf, float:8.182E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r9, r4)
            if (r3 == 0) goto L_0x02c4
            java.lang.String r3 = r0.A0H
            r2.A0Z = r3
            java.lang.String r3 = r0.A0I
            r2.A0a = r3
            long r3 = r0.A08
            r2.A0F = r3
            com.whatsapp.jid.Jid r12 = r2.A06(r6)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            if (r12 == 0) goto L_0x02c4
            X.1M9 r10 = r8.A00
            long r3 = r2.A0F
            java.lang.String r9 = r2.A0Z
            java.lang.String r8 = r2.A0a
            r24 = r10
            r25 = r12
            r26 = r9
            r27 = r8
            r28 = r3
            r24.A0k(r25, r26, r27, r28)
        L_0x02c4:
            X.A00 r3 = r11.A09
            if (r3 == 0) goto L_0x02ec
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x02ec
            com.whatsapp.jid.UserJid r3 = r7.A09
            if (r3 == 0) goto L_0x02ec
            X.1UC r4 = r5.A09
            boolean r3 = r2.A0z
            boolean r7 = r7.A0T
            if (r3 == r7) goto L_0x02e7
            r2.A0z = r7
            X.1M9 r7 = r4.A00
            com.whatsapp.jid.Jid r4 = r2.A06(r6)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r3 = r2.A0z
            r7.A0l(r4, r3)
        L_0x02e7:
            X.1UF r3 = r5.A0B
            r3.A00(r0, r2, r15)
        L_0x02ec:
            X.A00 r3 = r11.A07
            if (r3 == 0) goto L_0x0354
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x0354
            X.1UA r3 = r5.A08
            int r7 = r0.A04
            r28 = 1
            r4 = 2
            if (r7 == r4) goto L_0x03a7
            int r10 = r0.A02
            r4 = -1
            if (r10 == r4) goto L_0x03a7
            java.lang.String r9 = r0.A0G
            java.lang.String r4 = "image"
            boolean r12 = r4.equals(r9)
            r7 = r59
            if (r12 == 0) goto L_0x0312
            int r4 = r2.A07
            if (r4 != r10) goto L_0x031e
        L_0x0312:
            java.lang.String r4 = "preview"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x0388
            int r4 = r2.A08
            if (r4 == r10) goto L_0x0388
        L_0x031e:
            java.lang.String r4 = r0.A0E
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x037f
            com.whatsapp.jid.UserJid r14 = r0.A0D
            java.lang.String r12 = r0.A0E
            java.lang.String r10 = r0.A0F
            int r9 = r0.A02
            java.lang.String r13 = r0.A0G
            java.lang.String r4 = "preview"
            boolean r4 = r4.equals(r13)
            r31 = 1
            if (r4 == 0) goto L_0x033c
            r31 = 2
        L_0x033c:
            r28 = 0
            X.2gM r4 = new X.2gM
            r24 = r4
            r25 = r14
            r26 = r12
            r27 = r10
            r29 = r28
            r30 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            X.1U9 r3 = r3.A01
            r3.A01(r4, r7)
        L_0x0354:
            X.A00 r3 = r11.A01
            if (r3 == 0) goto L_0x04c2
            boolean r3 = r3.A04
            if (r3 == 0) goto L_0x04c2
            X.1UB r3 = r5.A02
            boolean r4 = r2.A0u
            if (r4 != 0) goto L_0x04c2
            r9 = 1
            r2.A0u = r9
            X.1M9 r8 = r3.A03
            com.whatsapp.jid.Jid r10 = r2.A06(r6)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            X.1M2 r7 = r8.A04
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>(r9)
            java.lang.String r4 = "is_business_synced"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r6.put(r4, r3)
            goto L_0x0489
        L_0x037f:
            X.AnonymousClass1UA.A00(r3, r0)
            java.lang.String r3 = "ContactSyncPictureUpdater/update photo id doesn't match the existing one in db"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            goto L_0x0354
        L_0x0388:
            X.1U8 r4 = r3.A02
            if (r12 == 0) goto L_0x038e
            r28 = 2
        L_0x038e:
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 - r59
            java.lang.Long r26 = java.lang.Long.valueOf(r9)
            r25 = 0
            r27 = 1
            r29 = 200(0xc8, float:2.8E-43)
            r24 = r4
            r24.A00(r25, r26, r27, r28, r29)
            X.AnonymousClass1UA.A00(r3, r0)
            goto L_0x0354
        L_0x03a7:
            X.AnonymousClass1UA.A00(r3, r0)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            if (r4 == 0) goto L_0x0354
            X.1Tv r3 = r3.A00
            r3.A03(r4)
            goto L_0x0354
        L_0x03b4:
            int r14 = r0.A03
            r9 = 2
            r13 = 0
            r8 = 1
            r3 = 0
            if (r9 == r14) goto L_0x03e8
            if (r8 != r14) goto L_0x03e2
            long r8 = r0.A08
            long r3 = r2.A0F
            int r13 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x03d1
            java.lang.String r4 = r0.A0H
            java.lang.String r3 = r2.A0Z
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            if (r3 != 0) goto L_0x027f
        L_0x03d1:
            java.lang.String r13 = r0.A0H
            r2.A0Z = r13
            long r3 = r0.A08
        L_0x03d7:
            r2.A0F = r3
            X.1M9 r8 = r12.A00
            r8.A0j(r10, r13, r3)
            int r16 = r16 + 1
            goto L_0x027f
        L_0x03e2:
            if (r14 != 0) goto L_0x03f5
            int r8 = r0.A04
            if (r8 != r9) goto L_0x027f
        L_0x03e8:
            long r8 = r2.A0F
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x03f2
            java.lang.String r8 = r2.A0Z
            if (r8 == 0) goto L_0x027f
        L_0x03f2:
            r2.A0Z = r13
            goto L_0x03d7
        L_0x03f5:
            r8 = 3
            if (r8 != r14) goto L_0x09de
            X.0ve r13 = r12.A02
            r9 = 5839(0x16cf, float:8.182E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r8 = X.C18020vd.A05(r8, r13, r9)
            if (r8 != 0) goto L_0x027f
            X.118 r8 = r12.A01
            android.content.Context r8 = r8.A00
            android.content.res.Resources r9 = r8.getResources()
            r8 = 2131889231(0x7f120c4f, float:1.941312E38)
            java.lang.String r8 = r9.getString(r8)
            r2.A0Z = r8
            r2.A0F = r3
            X.1M9 r9 = r12.A00
            r9.A0j(r10, r8, r3)
            goto L_0x027f
        L_0x041e:
            X.1M4 r3 = r9.A00
            r3.Bdc(r4, r8)
            goto L_0x023b
        L_0x0425:
            X.0ve r8 = r5.A0D
            r4 = 8434(0x20f2, float:1.1819E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r8, r4)
            if (r3 == 0) goto L_0x01f4
            X.1U1 r4 = r5.A03
            boolean r3 = r0.A0M
            r2.A0q = r3
            X.1M9 r9 = r4.A00
            X.1M2 r12 = r9.A04
            r3 = 1
            X.1Ez r10 = new X.1Ez
            r10.<init>((boolean) r3)
            r10.A04()
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>(r3)
            boolean r3 = r2.A0q
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "is_reachable"
            r8.put(r3, r4)
            X.1BI r3 = r2.A0J
            X.AnonymousClass1M2.A0A(r8, r12, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "ContactManagerDatabase/updateContactReachability for contact jid="
            r8.append(r3)
            X.1BI r3 = r2.A0J
            r8.append(r3)
            java.lang.String r3 = ""
            r8.append(r3)
            java.lang.String r3 = " | time: "
            r8.append(r3)
            long r3 = r10.A01()
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.1MA r4 = r9.A03
            X.1BI r3 = r2.A0J
            r4.A0C(r3)
            goto L_0x01f4
        L_0x0489:
            X.1Lt r3 = r7.A00     // Catch:{ IllegalArgumentException -> 0x04a0 }
            X.1au r3 = r3.A06()     // Catch:{ IllegalArgumentException -> 0x04a0 }
            X.AnonymousClass1M2.A09(r6, r7, r3, r10)     // Catch:{ all -> 0x0496 }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x04a0 }
            goto L_0x04bd
        L_0x0496:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x049b }
            goto L_0x049f
        L_0x049b:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r4, r3)     // Catch:{ IllegalArgumentException -> 0x04a0 }
        L_0x049f:
            throw r4     // Catch:{ IllegalArgumentException -> 0x04a0 }
        L_0x04a0:
            r6 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ContactManagerDatabase/unable to update contact business sync "
            r4.append(r3)
            r4.append(r10)
            java.lang.String r3 = ", "
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            X.C17960vV.A09(r3, r6)
        L_0x04bd:
            X.1MA r3 = r8.A03
            r3.A0C(r10)
        L_0x04c2:
            X.A00 r3 = r11.A03
            if (r3 == 0) goto L_0x054a
            X.1U6 r10 = r5.A04
            X.1MR r6 = r10.A04
            X.2rW r25 = r6.A05(r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r15)
            int r3 = r0.A00
            r12 = 1
            if (r3 != r12) goto L_0x0511
            long r3 = r6.A01(r1)
            long r7 = r0.A06
            int r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x05bb
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = "contactsyncDevicesupdater/update/timestamp is less than existing one, current="
            r14.append(r13)
            r14.append(r3)
            java.lang.String r13 = "; new time="
            r14.append(r13)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            com.whatsapp.util.Log.w((java.lang.String) r7)
            X.1U5 r7 = r10.A02
            r7.A0C(r1, r3)
            X.1U2 r10 = r10.A03
            long r7 = r0.A06
            r26 = r10
            r27 = r3
            r29 = r15
            r30 = r7
            r26.A03(r27, r29, r30)
        L_0x0511:
            X.0yx r4 = new X.0yx
            r4.<init>(r9, r9)
        L_0x0516:
            java.lang.Object r3 = r4.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
            java.lang.Object r3 = r4.A01
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r7 = r3.booleanValue()
            X.2rW r4 = r6.A05(r1)
            r6 = 0
            if (r25 != 0) goto L_0x05af
            if (r4 == 0) goto L_0x0534
            int r3 = r4.A00
        L_0x0531:
            if (r3 != r12) goto L_0x0534
        L_0x0533:
            r6 = 1
        L_0x0534:
            if (r8 == 0) goto L_0x0538
            int r19 = r19 + 1
        L_0x0538:
            if (r6 == 0) goto L_0x053f
            r3 = r22
            r3.add(r1)
        L_0x053f:
            if (r7 == 0) goto L_0x054a
            com.whatsapp.jid.DeviceJid r3 = r1.getPrimaryDevice()
            r4 = r23
            r4.add(r3)
        L_0x054a:
            X.A00 r3 = r11.A06
            if (r3 == 0) goto L_0x07a9
            X.1U7 r12 = r5.A07
            X.1QO r3 = r12.A02
            boolean r3 = r3.A0D()
            if (r3 == 0) goto L_0x07a9
            X.9ef r3 = r0.A0B
            if (r3 == 0) goto L_0x07a9
            boolean r4 = r3.A01
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r4)
            java.lang.String r10 = r3.A00
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r3 = r3.A02
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0744
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r8 = r3.iterator()
        L_0x0579:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0744
            java.lang.Object r3 = r8.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r6 = r4.intValue()
            java.lang.Object r3 = r3.getValue()
            X.9ay r3 = (X.C184449ay) r3
            r7 = 3
            r4 = 1
            if (r6 == r4) goto L_0x059e
            r4 = 3
            r7 = 1
            if (r6 == r4) goto L_0x059e
            r7 = 0
        L_0x059e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = r3.A01
            java.lang.String r4 = r3.A00
            X.0yx r3 = new X.0yx
            r3.<init>(r6, r4)
            r9.put(r7, r3)
            goto L_0x0579
        L_0x05af:
            r3 = r25
            int r3 = r3.A00
            if (r4 == 0) goto L_0x0531
            int r4 = r4.A00
            if (r3 == r4) goto L_0x0534
            goto L_0x0533
        L_0x05bb:
            X.11S r13 = r10.A00
            r13.A0I()
            com.whatsapp.jid.PhoneUserJid r3 = r13.A0E
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x05e9
            boolean r3 = r13.A0N()
            if (r3 != 0) goto L_0x05e9
            X.1RK r4 = r10.A01
            java.util.Map r3 = r0.A0L
            if (r3 != 0) goto L_0x05e4
            r3 = 0
        L_0x05d5:
            boolean r7 = r4.A0C(r3, r12, r15)
        L_0x05d9:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            X.0yx r4 = new X.0yx
            r4.<init>(r3, r9)
            goto L_0x0516
        L_0x05e4:
            X.10w r3 = X.C201110w.copyOf((java.util.Map) r3)
            goto L_0x05d5
        L_0x05e9:
            byte[] r3 = r0.A0O
            if (r3 != 0) goto L_0x0676
            java.util.Map r3 = r0.A0L
            if (r3 == 0) goto L_0x0613
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r4 = r3.iterator()
        L_0x05f9:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0613
            java.lang.Object r3 = r4.next()
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            int r3 = r3.getDevice()
            if (r3 == 0) goto L_0x05f9
            X.1U2 r4 = r10.A03
            r3 = 6
            r7 = 0
            r4.A01(r3, r15)
            goto L_0x05d9
        L_0x0613:
            r13.A0I()
            com.whatsapp.jid.PhoneUserJid r3 = r13.A0E
            boolean r3 = r1.equals(r3)
            r3 = r3 ^ 1
            X.C17960vV.A0D(r3)
            long r7 = r0.A06
            long r3 = r0.A05
            r26 = r10
            r27 = r1
            r28 = r7
            r30 = r3
            boolean r10 = X.AnonymousClass1U6.A01(r26, r27, r28, r30)
            X.2rW r8 = r6.A05(r1)
            java.util.Map r3 = r0.A0L
            if (r3 != 0) goto L_0x0671
            X.10w r24 = X.C201110w.of()
        L_0x063d:
            java.util.Map r3 = r0.A0L
            if (r3 == 0) goto L_0x0662
            X.10w r7 = X.C201110w.copyOf((java.util.Map) r3)
        L_0x0645:
            if (r8 != 0) goto L_0x064d
            r3 = 0
        L_0x0648:
            boolean r7 = r6.A0G(r7, r3, r1, r10)
            goto L_0x05d9
        L_0x064d:
            int r13 = r8.A01
            long r3 = r0.A06
            X.10f r26 = r24.keySet()
            r27 = r8
            r28 = r13
            r29 = r3
            r31 = r10
            X.2rW r3 = X.AnonymousClass1U6.A00(r26, r27, r28, r29, r31)
            goto L_0x0648
        L_0x0662:
            com.whatsapp.jid.DeviceJid r4 = r1.getPrimaryDevice()
            r13 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            X.10w r7 = X.C201110w.of(r4, r3)
            goto L_0x0645
        L_0x0671:
            X.10w r24 = X.C201110w.copyOf((java.util.Map) r3)
            goto L_0x063d
        L_0x0676:
            X.1U5 r8 = r10.A02
            X.2mA r3 = r8.A07(r1, r3)
            if (r3 == 0) goto L_0x0684
            boolean r4 = r3.A02
            r24 = 1
            if (r4 != 0) goto L_0x0688
        L_0x0684:
            r24 = 0
            if (r3 == 0) goto L_0x073c
        L_0x0688:
            X.2BR r7 = r3.A01
            if (r7 == 0) goto L_0x073c
            X.2kO r14 = r3.A00
            long r3 = r0.A06
            r30 = r3
            long r3 = r0.A05
            r26 = r10
            r27 = r1
            r28 = r30
            r30 = r3
            boolean r31 = X.AnonymousClass1U6.A01(r26, r27, r28, r30)
            r13.A0I()
            com.whatsapp.jid.PhoneUserJid r3 = r13.A0E
            X.C17960vV.A07(r3)
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0736
            X.10w r3 = X.AnonymousClass1MR.A00(r6, r15)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r3)
        L_0x06b7:
            X.2rW r27 = r6.A05(r1)
            java.util.Map r3 = r0.A0L
            if (r3 != 0) goto L_0x06c0
            r3 = r4
        L_0x06c0:
            X.EDj r13 = r7.validIndexes_
            int r10 = r7.currentIndex_
            java.util.HashMap r3 = r8.A08(r13, r4, r3, r10)
            X.10w r13 = X.C201110w.copyOf((java.util.Map) r3)
            int r10 = r7.rawId_
            long r3 = r7.timestamp_
            X.10f r26 = r13.keySet()
            r28 = r10
            r29 = r3
            X.2rW r10 = X.AnonymousClass1U6.A00(r26, r27, r28, r29, r31)
            long r3 = r0.A06
            r32 = r3
            X.2du r3 = new X.2du
            r3.<init>(r13, r10, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r31)
            X.0yx r4 = new X.0yx
            r4.<init>(r3, r10)
            X.1A3 r3 = new X.1A3
            r3.<init>(r4)
            r26 = r8
            r27 = r1
            r28 = r7
            r29 = r3
            r30 = r32
            boolean r3 = X.AnonymousClass1U5.A04(r26, r27, r28, r29, r30)
            if (r3 != 0) goto L_0x0722
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "contactsyncDevicesupdater/update/verifyAndUpdateKeyIndexListData indexList fail, userJid="
        L_0x070a:
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
        L_0x0717:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r24)
            X.0yx r4 = new X.0yx
            r4.<init>(r9, r3)
            goto L_0x0516
        L_0x0722:
            if (r14 == 0) goto L_0x0731
            X.1P3 r4 = r8.A06
            com.whatsapp.jid.DeviceJid r3 = r1.getPrimaryDevice()
            X.2nE r3 = X.C63962tz.A02(r3)
            r4.A0a(r14, r3)
        L_0x0731:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            goto L_0x0717
        L_0x0736:
            java.util.Map r4 = r6.A0B(r1)
            goto L_0x06b7
        L_0x073c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "contactsyncDevicesupdater/update/verifyADVSignedKeyIndexList fail keyIndexListNull, userJid="
            goto L_0x070a
        L_0x0744:
            X.9ef r3 = r0.A0B
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r3 = r3.A03
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0791
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r13 = r3.iterator()
        L_0x075b:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0791
            java.lang.Object r3 = r13.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r6 = r4.intValue()
            java.lang.Object r3 = r3.getValue()
            X.9az r3 = (X.C184459az) r3
            r7 = 3
            r4 = 1
            if (r6 == r4) goto L_0x0780
            r4 = 3
            r7 = 1
            if (r6 == r4) goto L_0x0780
            r7 = 0
        L_0x0780:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = r3.A01
            java.lang.String r4 = r3.A00
            X.0yx r3 = new X.0yx
            r3.<init>(r6, r4)
            r8.put(r7, r3)
            goto L_0x075b
        L_0x0791:
            X.1KH r3 = r12.A01
            X.1Ln r4 = r12.A00
            r24 = r4
            r25 = r3
            r26 = r1
            r28 = r10
            r29 = r9
            r30 = r8
            boolean r1 = X.C62862s7.A02(r24, r25, r26, r27, r28, r29, r30)
            if (r1 == 0) goto L_0x07a9
            int r17 = r17 + 1
        L_0x07a9:
            X.A00 r1 = r11.A04
            if (r1 == 0) goto L_0x07cb
            X.1UG r8 = r5.A05
            com.whatsapp.jid.UserJid r7 = r0.A0D
            if (r7 == 0) goto L_0x07cb
            int r1 = r2.A02
            int r6 = r0.A01
            if (r1 == r6) goto L_0x07cb
            long r3 = r2.A0B
            long r1 = r0.A07
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x07cb
            r3 = -1
            if (r6 == r3) goto L_0x07cb
            X.1M9 r3 = r8.A00
            r3.A0i(r7, r6, r1)
            int r18 = r18 + 1
        L_0x07cb:
            X.A00 r1 = r11.A00
            if (r1 == 0) goto L_0x0951
            X.0zA r2 = r5.A00
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0951
            java.lang.Object r6 = r2.A03()
            X.1UE r6 = (X.AnonymousClass1UE) r6
            com.whatsapp.jid.UserJid r4 = r0.A0D
            if (r4 == 0) goto L_0x0951
            X.2n8 r10 = r0.A0A
            if (r10 == 0) goto L_0x0951
            boolean r1 = r10.A0G
            if (r1 != 0) goto L_0x0951
            X.1UD r1 = r6.A00
            X.0ve r3 = r1.A00
            r2 = 11684(0x2da4, float:1.6373E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x080c
            boolean r1 = r4 instanceof X.C42711yc
            if (r1 == 0) goto L_0x080c
            java.lang.String r1 = r4.user
            java.lang.String r2 = X.C60882ol.A00(r1)
            if (r2 == 0) goto L_0x080c
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x080c
            r4 = r1
        L_0x080c:
            int r1 = r10.A01
            r42 = r1
            java.lang.String r1 = r10.A0B
            r26 = r1
            java.lang.String r25 = ""
            if (r1 != 0) goto L_0x081a
            r26 = r25
        L_0x081a:
            java.lang.Boolean r1 = r10.A02
            if (r1 == 0) goto L_0x0862
            boolean r48 = r1.booleanValue()
        L_0x0822:
            java.lang.String r14 = r10.A04
            if (r14 != 0) goto L_0x0828
            r14 = r25
        L_0x0828:
            java.lang.String r13 = r10.A0A
            if (r13 != 0) goto L_0x082e
            r13 = r25
        L_0x082e:
            java.lang.String r7 = r10.A06
            if (r7 != 0) goto L_0x0834
            r7 = r25
        L_0x0834:
            java.util.List r2 = r10.A0F
            r9 = 10
            int r1 = X.C29351c6.A0C(r2, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Iterator r12 = r2.iterator()
        L_0x0845:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0865
            java.lang.Object r1 = r12.next()
            X.2le r1 = (X.C59032le) r1
            java.lang.String r8 = r1.A01
            java.lang.String r2 = r1.A00
            if (r2 != 0) goto L_0x0859
            r2 = r25
        L_0x0859:
            X.24Z r1 = new X.24Z
            r1.<init>(r8, r2)
            r3.add(r1)
            goto L_0x0845
        L_0x0862:
            r48 = 0
            goto L_0x0822
        L_0x0865:
            java.lang.String r1 = r10.A0C
            r35 = r1
            java.lang.String r1 = r10.A07
            r36 = r1
            java.util.List r1 = r10.A0E
            int r8 = X.C29351c6.A0C(r1, r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            java.util.Iterator r24 = r1.iterator()
        L_0x087c:
            boolean r1 = r24.hasNext()
            if (r1 == 0) goto L_0x089a
            java.lang.Object r1 = r24.next()
            X.2ld r1 = (X.C59022ld) r1
            java.lang.String r12 = r1.A01
            java.lang.String r9 = r1.A00
            if (r9 != 0) goto L_0x0890
            r9 = r25
        L_0x0890:
            r8 = 0
            X.24c r1 = new X.24c
            r1.<init>(r8, r12, r9)
            r2.add(r1)
            goto L_0x087c
        L_0x089a:
            java.lang.Boolean r1 = r10.A03
            if (r1 == 0) goto L_0x08f2
            boolean r49 = r1.booleanValue()
        L_0x08a2:
            java.lang.String r1 = r10.A08
            r37 = r1
            java.lang.String r1 = r10.A09
            r38 = r1
            java.lang.String r1 = r10.A05
            r39 = r1
            int r12 = r10.A00
            java.util.List r1 = r10.A0D
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r25 = r1.iterator()
        L_0x08bb:
            boolean r1 = r25.hasNext()
            if (r1 == 0) goto L_0x08f5
            java.lang.Object r9 = r25.next()
            X.0z2 r1 = X.AnonymousClass2R0.A00
            java.util.Iterator r24 = r1.iterator()
        L_0x08cb:
            boolean r1 = r24.hasNext()
            if (r1 == 0) goto L_0x08f0
            java.lang.Object r8 = r24.next()
            r1 = r8
            X.2R0 r1 = (X.AnonymousClass2R0) r1
            java.lang.String r1 = r1.capability
            boolean r1 = X.C18070vi.A18(r1, r9)
            if (r1 == 0) goto L_0x08cb
        L_0x08e0:
            X.2R0 r8 = (X.AnonymousClass2R0) r8
            if (r8 == 0) goto L_0x08bb
            long r8 = r8.flagValue
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            if (r1 == 0) goto L_0x08bb
            r10.add(r1)
            goto L_0x08bb
        L_0x08f0:
            r8 = 0
            goto L_0x08e0
        L_0x08f2:
            r49 = 1
            goto L_0x08a2
        L_0x08f5:
            java.util.Iterator r10 = r10.iterator()
            r44 = 0
        L_0x08fb:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x090e
            java.lang.Object r1 = r10.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r8 = r1.longValue()
            long r44 = r44 | r8
            goto L_0x08fb
        L_0x090e:
            X.00H r1 = r6.A03
            java.lang.Object r1 = r1.get()
            X.11P r1 = (X.AnonymousClass11P) r1
            long r46 = X.AnonymousClass11P.A01(r1)
            r29 = 0
            X.24e r1 = new X.24e
            r27 = r1
            r28 = r4
            r30 = r26
            r31 = r14
            r32 = r13
            r33 = r7
            r34 = r29
            r40 = r3
            r41 = r2
            r43 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r48, r49)
            X.00H r2 = r6.A01
            java.lang.Object r4 = r2.get()
            X.10T r4 = (X.AnonymousClass10T) r4
            r3 = 1
            X.4om r2 = new X.4om
            r2.<init>(r1, r3)
            r4.notifyAllObservers(r2)
            X.00H r2 = r6.A02
            java.lang.Object r2 = r2.get()
            X.1Pl r2 = (X.C25741Pl) r2
            r2.A02(r1)
        L_0x0951:
            com.whatsapp.jid.UserJid r2 = r0.A0D
            if (r2 == 0) goto L_0x00cb
            X.2pC r3 = X.C61142pC.A01
            java.util.Set r0 = X.C61142pC.A04
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x00cb
            monitor-enter(r3)
            X.1BI r0 = X.C61142pC.A00     // Catch:{ all -> 0x09db }
            boolean r0 = X.C18070vi.A18(r0, r2)     // Catch:{ all -> 0x09db }
            if (r0 != 0) goto L_0x0980
            java.util.List r0 = X.C61142pC.A02     // Catch:{ all -> 0x09db }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x09db }
        L_0x096e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x09db }
            if (r0 == 0) goto L_0x097e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x09db }
            X.1Di r0 = (X.C22821Di) r0     // Catch:{ all -> 0x09db }
            r0.invoke(r2)     // Catch:{ all -> 0x09db }
            goto L_0x096e
        L_0x097e:
            X.C61142pC.A00 = r2     // Catch:{ all -> 0x09db }
        L_0x0980:
            monitor-exit(r3)
            goto L_0x00cb
        L_0x0983:
            if (r2 != r4) goto L_0x00be
            if (r8 == r4) goto L_0x00be
            X.1kK r0 = r3.A01
            r0.A00()
            goto L_0x00be
        L_0x098e:
            X.00H r9 = r6.A00
            java.lang.Object r10 = r9.get()
            android.content.SharedPreferences r10 = (android.content.SharedPreferences) r10
            java.lang.String r9 = "native_contacts_enter_integrity_pending_timestamp"
            long r12 = r10.getLong(r9, r0)
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x00a1
            X.11P r0 = r3.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            r6.A1O(r0)
            X.1Ua r6 = r3.A03
            X.11P r0 = r6.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            X.C26931Ua.A00(r6, r4, r0)
            goto L_0x00a1
        L_0x09b6:
            long r12 = r6.A0P()
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x00a1
            X.11P r0 = r3.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            r6.A1N(r0)
            X.1Ua r6 = r3.A03
            X.11P r0 = r6.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            X.C26931Ua.A00(r6, r7, r0)
            goto L_0x00a1
        L_0x09d4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x09d6 }
        L_0x09d6:
            r1 = move-exception
            X.CDX.A00(r9, r0)
            throw r1
        L_0x09db:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x09de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unrecognized status type="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x09f6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "syncUser with type="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " cannot be updated"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0a13:
            X.A00 r0 = r11.A01
            if (r0 == 0) goto L_0x0f33
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0f33
            X.1Ty r0 = r5.A01
            java.util.HashMap r0 = r0.A0B()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>(r0)
            X.1UB r13 = r5.A02
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r24 = new java.util.HashMap
            r24.<init>()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Set r0 = r21.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x0a44:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0b52
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            r1 = r50
            java.lang.Object r6 = r1.get(r7)
            X.9i3 r6 = (X.C188829i3) r6
            r3 = 0
            if (r6 == 0) goto L_0x0ad5
            X.9ed r2 = r6.A09
            if (r2 == 0) goto L_0x0ad5
            r9 = 0
            com.whatsapp.jid.UserJid r1 = r2.A02     // Catch:{ 1UI -> 0x0e65 }
            if (r1 == 0) goto L_0x0a78
            X.1ca r0 = r2.A03     // Catch:{ 1UI -> 0x0e65 }
            if (r0 == 0) goto L_0x0a78
            java.lang.String r3 = "profile"
            X.1ca r0 = r0.A0K(r3)     // Catch:{ 1UI -> 0x0e65 }
            X.AEW r3 = X.A82.A01(r1, r0)     // Catch:{ 1UI -> 0x0e65 }
        L_0x0a78:
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x0a85
            java.lang.Object r1 = r8.get(r7)
            r0 = 1
            if (r1 != 0) goto L_0x0a86
        L_0x0a85:
            r0 = 0
        L_0x0a86:
            if (r3 == 0) goto L_0x0a89
            r9 = 1
        L_0x0a89:
            if (r0 == 0) goto L_0x0ab8
            if (r9 == 0) goto L_0x0a9b
            java.lang.Object r1 = r8.get(r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0aa1
        L_0x0a9b:
            r11.add(r7)
            r12.put(r7, r3)
        L_0x0aa1:
            X.9dG r0 = r2.A00
            if (r0 == 0) goto L_0x0abb
            r4.put(r7, r0)
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0a44
            X.1PM r0 = r13.A04
            X.1yf r1 = r0.A02(r7)
            r0 = r24
            r0.put(r7, r1)
            goto L_0x0a44
        L_0x0ab8:
            if (r9 != 0) goto L_0x0a9b
            goto L_0x0aa1
        L_0x0abb:
            r0 = r58
            if (r58 == 0) goto L_0x0ac5
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0a44
        L_0x0ac5:
            X.1PM r1 = r13.A04
            X.1yf r0 = r1.A02(r7)
            if (r0 == 0) goto L_0x0ad0
            r11.add(r7)
        L_0x0ad0:
            r1.A03(r7)
            goto L_0x0a44
        L_0x0ad5:
            java.lang.Object r0 = r0.getValue()
            X.9iB r0 = (X.C188899iB) r0
            r9 = 0
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0a44
            X.1PM r2 = r13.A04
            X.1yf r6 = r2.A02(r7)
            X.1Ty r1 = r13.A02
            X.AEW r0 = r1.A08(r7)
            if (r0 == 0) goto L_0x0af1
            r9 = 1
        L_0x0af1:
            if (r6 == 0) goto L_0x0afe
            java.lang.String r0 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0afe
            r2.A03(r7)
        L_0x0afe:
            if (r9 == 0) goto L_0x0b10
            if (r7 == 0) goto L_0x0b05
            r1.A08(r7)
        L_0x0b05:
            X.0vl r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            X.9CB r0 = (X.AnonymousClass9CB) r0
            r0.A0K(r7)
        L_0x0b10:
            if (r6 == 0) goto L_0x0b4f
            java.lang.String r3 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0b4f
            if (r9 == 0) goto L_0x0a44
            X.00H r0 = r13.A07
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.122> r0 = X.AnonymousClass122.class
            X.11a r2 = r1.A01(r0)
            X.122 r2 = (X.AnonymousClass122) r2
            X.2kB r1 = new X.2kB
            r1.<init>()
            int r0 = r6.A03
            r1.A03 = r0
            r1.A07 = r3
            X.1ya r0 = r6.A00()
            r1.A05 = r0
            int r0 = X.AnonymousClass2V2.A00(r6)
            r1.A02 = r0
            X.2mv r0 = r1.A00()
            r2.BAz(r7, r0)
        L_0x0b4a:
            r11.add(r7)
            goto L_0x0a44
        L_0x0b4f:
            if (r9 == 0) goto L_0x0a44
            goto L_0x0b4a
        L_0x0b52:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0c68
            X.1Ty r14 = r13.A02
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Set r0 = r12.entrySet()
            java.util.Iterator r20 = r0.iterator()
        L_0x0b71:
            boolean r0 = r20.hasNext()
            r7 = 1
            if (r0 == 0) goto L_0x0bd9
            java.lang.Object r0 = r20.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.getValue()
            X.AEW r3 = (X.AEW) r3
            if (r3 == 0) goto L_0x0bd7
            int r2 = r3.A00
        L_0x0b8e:
            X.AEW r1 = r14.A08(r6)
            if (r2 == 0) goto L_0x0bc7
            if (r2 == r7) goto L_0x0bbd
            r0 = 2
            if (r2 != r0) goto L_0x0bc7
            boolean r0 = X.C26911Ty.A05(r14, r3, r1)
            if (r0 == 0) goto L_0x0ba2
            r10.add(r6)
        L_0x0ba2:
            if (r1 == 0) goto L_0x0b71
        L_0x0ba4:
            int r0 = r1.A00
            if (r0 != r7) goto L_0x0b71
            if (r3 == 0) goto L_0x0b71
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0b71
            X.C18070vi.A0d(r6, r15)
            X.0vl r0 = r14.A0G
            java.lang.Object r0 = r0.getValue()
            X.2nQ r0 = (X.C60122nQ) r0
            r0.A01(r6, r15)
            goto L_0x0b71
        L_0x0bbd:
            boolean r0 = X.C26911Ty.A04(r14, r3, r1)
            if (r0 == 0) goto L_0x0ba2
            r9.add(r6)
            goto L_0x0ba2
        L_0x0bc7:
            if (r3 == 0) goto L_0x0ba2
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0ba2
            if (r1 == 0) goto L_0x0b71
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0ba4
            r8.add(r6)
            goto L_0x0ba4
        L_0x0bd7:
            r2 = 0
            goto L_0x0b8e
        L_0x0bd9:
            X.0vl r0 = r14.A04
            java.lang.Object r0 = r0.getValue()
            X.9CB r0 = (X.AnonymousClass9CB) r0
            r0.A0L(r12)
            X.C26911Ty.A01(r14, r9)
            X.C26911Ty.A02(r14, r10)
            X.C26911Ty.A00(r14, r8)
            java.util.Set r0 = r12.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0bf5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0c68
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r6 = r0.getValue()
            X.AEW r6 = (X.AEW) r6
            X.0vl r3 = r14.A07
            java.lang.Object r0 = r3.getValue()
            X.A2z r0 = (X.C20009A2z) r0
            X.0ve r2 = r0.A07
            r1 = 4208(0x1070, float:5.897E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.C18070vi.A0d(r8, r15)
            boolean r0 = X.C26911Ty.A03(r14, r6)
            if (r1 == 0) goto L_0x0c57
            if (r0 == 0) goto L_0x0bf5
            java.lang.Object r0 = r3.getValue()
            X.A2z r0 = (X.C20009A2z) r0
            X.00H r1 = r0.A0D
            java.lang.Object r1 = r1.get()
            X.4S5 r1 = (X.AnonymousClass4S5) r1
            com.whatsapp.jid.UserJid r1 = r1.A00(r8)
            java.lang.String r1 = r1.getRawString()
            X.0z4 r0 = r0.A06
            r0.A1S(r1)
            r0.A1T(r1)
            java.lang.Object r1 = r3.getValue()
            X.A2z r1 = (X.C20009A2z) r1
            X.2xv r0 = new X.2xv
            r0.<init>(r14)
            r1.A05(r0, r6, r8, r15)
            goto L_0x0bf5
        L_0x0c57:
            if (r0 == 0) goto L_0x0bf5
            java.lang.Object r1 = r3.getValue()
            X.A2z r1 = (X.C20009A2z) r1
            X.2xv r0 = new X.2xv
            r0.<init>(r14)
            r1.A05(r0, r6, r8, r7)
            goto L_0x0bf5
        L_0x0c68:
            X.1F8 r14 = X.C199410f.builder()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0e03
            X.1PM r10 = r13.A04
            X.C17960vV.A01()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.00H r0 = r10.A06
            r21 = r0
            java.lang.Object r1 = r21.get()
            X.2nO r1 = (X.C60102nO) r1
            java.lang.String r0 = "VerifiedNameManager"
            r1.A02(r0)
            java.lang.Object r2 = r21.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "usync"
            r2.A03(r1, r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r20 = r0.iterator()
        L_0x0cb0:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0da4
            java.lang.Object r4 = r20.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion
            if (r0 == 0) goto L_0x0da1
            com.whatsapp.jid.DeviceJid r3 = r0.getPrimaryDevice()
        L_0x0cca:
            X.C17960vV.A07(r3)
            X.1P3 r2 = r10.A04
            boolean r0 = r2.A0Y()
            if (r0 == 0) goto L_0x0d65
            X.3DC r0 = new X.3DC
            r0.<init>(r2, r3)
            X.1P3 r1 = r0.A00
            com.whatsapp.jid.DeviceJid r0 = r0.A01
            X.2nE r0 = X.C63962tz.A02(r0)
            X.2kO r0 = r1.A0D(r0)
        L_0x0ce6:
            if (r0 != 0) goto L_0x0ceb
        L_0x0ce8:
            r8.add(r3)
        L_0x0ceb:
            java.lang.Object r0 = r4.getValue()
            if (r0 == 0) goto L_0x0d47
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            byte[] r0 = r0.A02
            if (r0 == 0) goto L_0x0d47
            com.whatsapp.jid.UserJid r15 = r3.userJid
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            byte[] r2 = r0.A02
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            int r1 = r0.A00
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            X.1ya r4 = r0.A01
            X.1ya r0 = new X.1ya
            r0.<init>(r4)
            boolean r0 = X.AnonymousClass1PM.A00(r10, r15, r0, r2, r1)
            if (r0 == 0) goto L_0x0d25
            com.whatsapp.jid.UserJid r0 = r3.userJid
            r6.add(r0)
        L_0x0d25:
            com.whatsapp.jid.UserJid r0 = r3.userJid
            X.1yf r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x0d37
            int r0 = r0.A02
            if (r0 == 0) goto L_0x0d3c
            boolean r0 = r8.contains(r3)
            if (r0 != 0) goto L_0x0d3c
        L_0x0d37:
            r8.add(r3)
            goto L_0x0cb0
        L_0x0d3c:
            boolean r0 = r9.contains(r3)
            if (r0 != 0) goto L_0x0cb0
            r9.add(r3)
            goto L_0x0cb0
        L_0x0d47:
            com.whatsapp.jid.UserJid r15 = r3.userJid
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            int r2 = r0.A00
            java.lang.Object r0 = r4.getValue()
            X.9dG r0 = (X.C185859dG) r0
            X.1ya r1 = r0.A01
            r0 = 0
            boolean r0 = r10.A05(r15, r1, r2, r0)
            if (r0 == 0) goto L_0x0cb0
            r7.add(r3)
            goto L_0x0cb0
        L_0x0d65:
            X.00H r0 = r10.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            X.1Ot r1 = (X.C25581Ot) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            X.3DC r0 = new X.3DC     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            r0.<init>(r2, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0d7e }
            goto L_0x0ce6
        L_0x0d7e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: failed to get identity entry for jid = "
            r1.append(r0)
            java.lang.Object r0 = r4.getKey()
            r1.append(r0)
            java.lang.String r0 = " error = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x0ce8
        L_0x0da1:
            r3 = 0
            goto L_0x0cca
        L_0x0da4:
            java.lang.Object r1 = r21.get()
            X.2nO r1 = (X.C60102nO) r1
            r0 = 1
            r1.A04(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: jidsWithLevelOrPrivacyUpdate = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0ddb
            X.00H r0 = r13.A07
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.123> r0 = X.AnonymousClass123.class
            X.11a r0 = r1.A01(r0)
            X.123 r0 = (X.AnonymousClass123) r0
            r0.A02(r8)
        L_0x0ddb:
            java.util.Iterator r1 = r7.iterator()
        L_0x0ddf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0df1
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r11.add(r0)
            goto L_0x0ddf
        L_0x0df1:
            java.util.Iterator r1 = r6.iterator()
        L_0x0df5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e0b
            java.lang.Object r0 = r1.next()
            r11.add(r0)
            goto L_0x0df5
        L_0x0e03:
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x0e0b:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0e32
            X.1KB r2 = r13.A01
            r1 = 7
            X.3Cl r0 = new X.3Cl
            r0.<init>(r13, r9, r12, r1)
            r2.A0J(r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x0e20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e32
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r14.add((java.lang.Object) r0)
            goto L_0x0e20
        L_0x0e32:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0e4e
            java.util.Iterator r1 = r7.iterator()
        L_0x0e3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e4e
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r14.add((java.lang.Object) r0)
            goto L_0x0e3c
        L_0x0e4e:
            X.1M9 r0 = r13.A03
            r0.A0S()
            int r2 = r11.size()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r24)
            X.10f r0 = r14.build()
            X.2m8 r13 = new X.2m8
            r13.<init>(r0, r1, r2)
            goto L_0x0e97
        L_0x0e65:
            r3 = move-exception
            X.C17960vV.A0B(r3)
            X.190 r2 = r13.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "source=ContactSyncBusinessUpdater message="
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CorruptStreamException"
            r2.A0G(r0, r1, r15)
            int r2 = r11.size()
            X.10w r1 = X.C201110w.of()
            X.10f r0 = X.C199410f.of()
            X.2m8 r13 = new X.2m8
            r13.<init>(r0, r1, r2)
        L_0x0e97:
            int r15 = r13.A00
            X.00H r0 = r5.A0E
            java.lang.Object r12 = r0.get()
            X.12A r12 = (X.AnonymousClass12A) r12
            X.10f r11 = X.C199410f.copyOf((java.util.Collection) r22)
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            X.10f r1 = r13.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0f33
            java.util.Iterator r14 = r1.iterator()
        L_0x0eb5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0f33
            java.lang.Object r10 = r14.next()
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            boolean r0 = r11.contains(r10)
            if (r0 != 0) goto L_0x0eb5
            X.00H r0 = r12.A03
            java.lang.Object r0 = r0.get()
            X.1Ok r0 = (X.C25491Ok) r0
            boolean r0 = r0.A00(r10)
            if (r0 != 0) goto L_0x0eb5
            X.C18070vi.A0b(r10)
            java.util.Map r0 = r13.A02
            java.lang.Object r0 = r0.get(r10)
            X.1yf r0 = (X.C42741yf) r0
            X.1PM r1 = r12.A02
            X.1yf r1 = r1.A02(r10)
            r9 = 0
            if (r1 == 0) goto L_0x0f31
            X.1ya r8 = r1.A00()
        L_0x0eed:
            int r7 = X.AnonymousClass2V2.A00(r1)
            if (r1 == 0) goto L_0x0f2e
            int r6 = r1.A03
            java.lang.String r4 = r1.A08
        L_0x0ef7:
            if (r0 == 0) goto L_0x0f2a
            int r3 = r0.A03
            java.lang.String r9 = r0.A08
            X.1ya r2 = r0.A00()
            int r1 = X.AnonymousClass2V2.A00(r0)
        L_0x0f05:
            X.2kB r0 = new X.2kB
            r0.<init>()
            r0.A03 = r3
            r0.A01 = r6
            r0.A07 = r9
            r0.A06 = r4
            r0.A05 = r2
            r0.A04 = r8
            r0.A02 = r1
            r0.A00 = r7
            X.2mv r1 = r0.A00()
            X.0vl r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            X.122 r0 = (X.AnonymousClass122) r0
            r0.BAz(r10, r1)
            goto L_0x0eb5
        L_0x0f2a:
            r2 = r9
            r1 = r7
            r3 = 0
            goto L_0x0f05
        L_0x0f2e:
            r4 = r9
            r6 = 0
            goto L_0x0ef7
        L_0x0f31:
            r8 = r9
            goto L_0x0eed
        L_0x0f33:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0f57
            r1 = 200(0xc8, float:2.8E-43)
            r0 = r23
            java.lang.Iterable r0 = X.C26063Crd.partition(r0, r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0f45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0f57
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.123 r0 = r5.A0C
            r0.A02(r1)
            goto L_0x0f45
        L_0x0f57:
            r2 = r55
            if (r55 == 0) goto L_0x0f86
            r0 = r16
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0K = r0
            r0 = r19
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            long r0 = (long) r15
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            r0 = r17
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            r0 = r18
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
        L_0x0f86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UH.A01(X.2R1, X.2n4, X.2HO, java.util.List, java.util.Map, java.util.Map, long, boolean):void");
    }
}
