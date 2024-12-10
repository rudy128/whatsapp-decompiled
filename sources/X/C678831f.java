package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.31f  reason: invalid class name and case insensitive filesystem */
public final class C678831f implements C201511a {
    public final C26861Tt A00;
    public final AnonymousClass11P A01;
    public final ConcurrentHashMap A02;
    public final C18100vl A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass11E A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass1UH A08;
    public final AnonymousClass1UR A09;
    public final AnonymousClass1M4 A0A;
    public final AnonymousClass1UN A0B;
    public final C18030ve A0C;
    public final AnonymousClass00H A0D;
    public final ConcurrentHashMap A0E = new ConcurrentHashMap();
    public final ConcurrentHashMap A0F;

    public final Pair A04(AnonymousClass2R1 r26, List list) {
        String A002;
        Pair pair;
        Pair pair2;
        List list2;
        Integer num;
        List list3 = list;
        C18070vi.A0d(list3, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.A06.A09()) {
            Log.i("ContactQuerySync/querySyncPhoneNumbers: network_unavailable");
            return A00(C62602rf.A04, (Object) null);
        }
        A002 = C63412t2.A00("sync_sid_query");
        C18070vi.A0X(A002);
        try {
            C20995Acn acn = (C20995Acn) this.A03.getValue();
            int A003 = ((C192179nw) this.A0D.get()).A00();
            boolean A062 = C18020vd.A06(this.A0C);
            C17960vV.A0D(true);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                C20043A4m a4m = new C20043A4m((UserJid) null, C17880vN.A0v(it));
                a4m.A0D = true;
                a4m.A0N = true;
                a4m.A0K = true;
                a4m.A0C = true;
                a4m.A0G = true;
                a4m.A0I = true;
                a4m.A0O = A062;
                C17880vN.A1H(a4m, A13);
            }
            AnonymousClass2R1 r13 = r26;
            C26981Ug A052 = acn.A05(new A01(r13, A13, A003, true, false), A002, 32000);
            C18070vi.A0X(A052);
            A052.get(32000, TimeUnit.MILLISECONDS);
            ConcurrentHashMap concurrentHashMap = this.A02;
            C53372cQ r8 = (C53372cQ) concurrentHashMap.get(A002);
            if (r8 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("ContactQuerySync/querySyncPhoneNumbers: empty sync result for ");
                A10.append(list3);
                A10.append(" (syncId is ");
                Log.e(C17900vP.A0B(A002, A10));
                pair2 = A00(C62602rf.A03, (Object) null);
            } else {
                if (r2 == 0) {
                    A00 a00 = r8.A00.A02;
                    if (a00 == null || (num = a00.A01) == null || num.intValue() != 429) {
                        C17900vP.A0X(list3, "ContactQuerySync/querySyncPhoneNumbers: no users for ", AnonymousClass000.A10());
                        pair2 = A00(C62602rf.A03, (Object) null);
                    } else {
                        C17900vP.A0X(list3, "ContactQuerySync/querySyncPhoneNumbers: rate-limit-error ", AnonymousClass000.A10());
                        pair2 = A00(C62602rf.A05, (Object) null);
                    }
                } else {
                    ArrayList A132 = AnonymousClass000.A13();
                    for (C188829i3 r14 : r8.A01) {
                        if (r14.A04 == 1) {
                            AnonymousClass1UH r12 = this.A08;
                            List A0M = C18070vi.A0M(r14);
                            C59902n4 r15 = r8.A00;
                            r12.A02(r15, A0M);
                            AnonymousClass1M9 r11 = this.A07;
                            UserJid userJid = r14.A0D;
                            if (userJid != null) {
                                r12.A00(r13, r14, r15, r11.A0H(userJid), elapsedRealtime);
                                A132.add(r14);
                            } else {
                                throw C17890vO.A0K();
                            }
                        }
                        List list4 = r14.A0K;
                        if (!(list4 == null || !AnonymousClass000.A1a(list4) || (list2 = r14.A0K) == null)) {
                            list2.get(0);
                        }
                    }
                    pair2 = A00(C62602rf.A06, A132.toArray(new C188829i3[0]));
                }
            }
            concurrentHashMap.remove(A002);
            return pair2;
        } catch (TimeoutException unused) {
            Log.e("ContactQuerySync/querySyncPhoneNumbers/timeout");
            pair = A00(C62602rf.A03, (Object) null);
        } catch (ExecutionException e) {
            A02("querySyncPhoneNumber", e);
            pair = A00(C62602rf.A03, (Object) null);
        } catch (InterruptedException e2) {
            Log.e(AnonymousClass001.A1E(list3, "ContactQuerySync/querySyncPhoneNumbers: exception during Query Sync ", AnonymousClass000.A10()), e2);
            pair = A00(C62602rf.A02, (Object) null);
        } catch (Throwable th) {
            this.A02.remove(A002);
            throw th;
        }
        this.A02.remove(A002);
        return pair;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0192, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0195, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C19760yx A05(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            r13 = 0
            r4 = r22
            X.C18070vi.A0d(r4, r13)
            long r19 = android.os.SystemClock.elapsedRealtime()
            r3 = r21
            X.11E r0 = r3.A06
            boolean r0 = r0.A09()
            r2 = 0
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x001b:
            X.1M4 r8 = r3.A0A
            X.1M5 r8 = (X.AnonymousClass1M5) r8
            X.00H r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.2pY r0 = (X.C61362pY) r0
            X.1Cd r0 = r0.A00
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x018f }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "\n            SELECT lid_row_id\n            FROM lid_display_name\n            WHERE UPPER(username) = UPPER(?)\n            ORDER BY lid_row_id DESC\n            LIMIT 1\n            "
            java.lang.String[] r1 = X.C17880vN.A1a(r4, r13)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "LidDisplayNameStore/GET_LID_ROW_ID"
            android.database.Cursor r6 = r6.A0A(r5, r0, r1)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "lid_row_id"
            int r5 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x0188 }
            r1 = 0
            if (r5 < 0) goto L_0x0051
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x0051
            java.lang.Long r1 = X.C17890vO.A0M(r6, r5)     // Catch:{ all -> 0x0188 }
        L_0x0051:
            r6.close()     // Catch:{ all -> 0x018f }
            r7.close()
            r7 = 0
            if (r1 == 0) goto L_0x006b
            long r0 = r1.longValue()
            X.1DL r5 = r8.A00
            com.whatsapp.jid.Jid r1 = r5.A0B(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x006b
            r7 = r1
            X.1E2 r7 = (X.AnonymousClass1E2) r7
        L_0x006b:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r5 = X.C63412t2.A00(r0)
            X.C18070vi.A0X(r5)
            X.0vl r0 = r3.A03     // Catch:{ all -> 0x0181 }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x0181 }
            X.Acn r6 = (X.C20995Acn) r6     // Catch:{ all -> 0x0181 }
            X.2R1 r9 = X.AnonymousClass2R1.A0F     // Catch:{ all -> 0x0181 }
            X.00H r0 = r3.A0D     // Catch:{ all -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0181 }
            X.9nw r0 = (X.C192179nw) r0     // Catch:{ all -> 0x0181 }
            int r11 = r0.A00()     // Catch:{ all -> 0x0181 }
            X.0ve r0 = r3.A0C     // Catch:{ all -> 0x0181 }
            boolean r1 = X.C18020vd.A06(r0)     // Catch:{ all -> 0x0181 }
            r12 = 1
            X.C17960vV.A0D(r12)     // Catch:{ all -> 0x0181 }
            X.A4m r0 = new X.A4m     // Catch:{ all -> 0x0181 }
            r8 = r23
            r0.<init>(r7, r4, r8)     // Catch:{ all -> 0x0181 }
            r0.A0D = r12     // Catch:{ all -> 0x0181 }
            r0.A0N = r12     // Catch:{ all -> 0x0181 }
            r0.A0K = r12     // Catch:{ all -> 0x0181 }
            r0.A0C = r12     // Catch:{ all -> 0x0181 }
            r0.A0G = r12     // Catch:{ all -> 0x0181 }
            r0.A0I = r12     // Catch:{ all -> 0x0181 }
            r0.A0P = r12     // Catch:{ all -> 0x0181 }
            r0.A0O = r1     // Catch:{ all -> 0x0181 }
            X.9iB r0 = r0.A00()     // Catch:{ all -> 0x0181 }
            java.util.List r10 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0181 }
            X.A01 r8 = new X.A01     // Catch:{ all -> 0x0181 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0181 }
            r0 = 32000(0x7d00, double:1.581E-319)
            X.1Ug r7 = r6.A05(r8, r5, r0)     // Catch:{ all -> 0x0181 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0181 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x0176, ExecutionException -> 0x016f, InterruptedException -> 0x0164 }
            r7.get(r0, r6)     // Catch:{ TimeoutException -> 0x0176, ExecutionException -> 0x016f, InterruptedException -> 0x0164 }
            java.util.concurrent.ConcurrentHashMap r6 = r3.A02     // Catch:{ all -> 0x0181 }
            java.lang.Object r1 = r6.get(r5)     // Catch:{ all -> 0x0181 }
            X.2cQ r1 = (X.C53372cQ) r1     // Catch:{ all -> 0x0181 }
            if (r1 != 0) goto L_0x00eb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: empty sync result for "
            r1.append(r0)     // Catch:{ all -> 0x0181 }
            r1.append(r4)     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = " (syncId is "
            r1.append(r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = X.C17900vP.A0B(r5, r1)     // Catch:{ all -> 0x0181 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0181 }
            goto L_0x017d
        L_0x00eb:
            X.9i3[] r7 = r1.A01     // Catch:{ all -> 0x0181 }
            int r0 = r7.length     // Catch:{ all -> 0x0181 }
            if (r0 != 0) goto L_0x0116
            X.2n4 r0 = r1.A00     // Catch:{ all -> 0x0181 }
            X.A00 r0 = r0.A02     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = r0.A01     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x010c
            int r1 = r0.intValue()     // Catch:{ all -> 0x0181 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 != r0) goto L_0x010c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: rate-limit-error "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x017d
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: no users for "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x017d
        L_0x0116:
            r4 = r7[r13]     // Catch:{ all -> 0x0181 }
            int r0 = r4.A04     // Catch:{ all -> 0x0181 }
            if (r0 != r12) goto L_0x014e
            X.1UH r14 = r3.A08     // Catch:{ all -> 0x0181 }
            java.util.List r0 = X.C18070vi.A0M(r4)     // Catch:{ all -> 0x0181 }
            X.2n4 r7 = r1.A00     // Catch:{ all -> 0x0181 }
            r14.A02(r7, r0)     // Catch:{ all -> 0x0181 }
            X.1M9 r1 = r3.A07     // Catch:{ all -> 0x0181 }
            com.whatsapp.jid.UserJid r0 = r4.A0D     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x015f
            X.1E7 r1 = r1.A0H(r0)     // Catch:{ all -> 0x0181 }
            X.11S r2 = r3.A05     // Catch:{ all -> 0x0181 }
            X.1BI r0 = r1.A0J     // Catch:{ all -> 0x0181 }
            boolean r0 = r2.A0O(r0)     // Catch:{ all -> 0x0181 }
            if (r0 != 0) goto L_0x0145
            r15 = r9
            r18 = r1
            r16 = r4
            r17 = r7
            r14.A00(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0181 }
        L_0x0145:
            java.util.List r0 = r4.A0K     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x0159
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0150
        L_0x014e:
            r1 = r2
            goto L_0x0145
        L_0x0150:
            if (r0 != r12) goto L_0x0159
            java.util.List r0 = r4.A0K     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x0159
            r0.get(r13)     // Catch:{ all -> 0x0181 }
        L_0x0159:
            X.0yx r2 = new X.0yx     // Catch:{ all -> 0x0181 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x017d
        L_0x015f:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0164:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "ContactQuerySync/querySyncUsername: exception during Query Sync "
            X.C17900vP.A0h(r0, r4, r1, r6)     // Catch:{ all -> 0x0181 }
            goto L_0x017b
        L_0x016f:
            r1 = move-exception
            java.lang.String r0 = "querySyncUsername"
            r3.A02(r0, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x017b
        L_0x0176:
            java.lang.String r0 = "ContactQuerySync/querySyncUsername/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0181 }
        L_0x017b:
            java.util.concurrent.ConcurrentHashMap r6 = r3.A02
        L_0x017d:
            r6.remove(r5)
            return r2
        L_0x0181:
            r1 = move-exception
            java.util.concurrent.ConcurrentHashMap r0 = r3.A02
            r0.remove(r5)
            throw r1
        L_0x0188:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0191 }
        L_0x0191:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678831f.A05(java.lang.String, java.lang.String):X.0yx");
    }

    public final C62602rf A06(AnonymousClass2R1 r20, UserJid userJid) {
        C62602rf r1;
        C62602rf r12;
        Integer num;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid2, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass2R1 r10 = r20;
        if (r10 == AnonymousClass2R1.A0F || r10 == AnonymousClass2R1.A01) {
            if (!this.A06.A09()) {
                Log.i("ContactQuerySync/querySyncJid: network_unavailable");
                return C62602rf.A04;
            }
            ConcurrentHashMap concurrentHashMap = this.A0E;
            if (concurrentHashMap.putIfAbsent(userJid2, userJid2) != null) {
                return C62602rf.A08;
            }
            String A002 = C63412t2.A00("sync_sid_query");
            C18070vi.A0X(A002);
            try {
                int A003 = ((C192179nw) this.A0D.get()).A00();
                C18030ve r7 = this.A0C;
                C18040vf r13 = C18040vf.A02;
                C26981Ug A052 = ((C20995Acn) this.A03.getValue()).A05(A01.A00(r10, userJid2, (String) null, A003, C18020vd.A05(r13, r7, 5290), C18020vd.A05(r13, r7, 5751), C18020vd.A06(r7)), A002, 32000);
                C18070vi.A0X(A052);
                try {
                    A052.get(32000, TimeUnit.MILLISECONDS);
                    ConcurrentHashMap concurrentHashMap2 = this.A02;
                    C53372cQ r6 = (C53372cQ) concurrentHashMap2.get(A002);
                    if (r6 == null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("ContactQuerySync/querySyncJid: empty sync result for ");
                        A10.append(userJid2);
                        A10.append(" (syncId is ");
                        Log.e(C17900vP.A0B(A002, A10));
                        r12 = C62602rf.A03;
                    } else {
                        C188829i3[] r14 = r6.A01;
                        if (r14.length == 0) {
                            A00 a00 = r6.A00.A02;
                            if (a00 == null || (num = a00.A01) == null || num.intValue() != 429) {
                                C17900vP.A0X(userJid2, "ContactQuerySync/querySyncJid: no users for ", AnonymousClass000.A10());
                                r12 = C62602rf.A03;
                            } else {
                                C17900vP.A0X(userJid2, "ContactQuerySync/querySyncJid: rate-limit-error ", AnonymousClass000.A10());
                                r12 = C62602rf.A05;
                            }
                        } else {
                            C188829i3 r72 = r14[0];
                            if (r72.A04 == 1) {
                                AnonymousClass1UH r122 = this.A08;
                                List A0M = C18070vi.A0M(r72);
                                C59902n4 r62 = r6.A00;
                                r122.A02(r62, A0M);
                                AnonymousClass1M9 r15 = this.A07;
                                UserJid userJid3 = r72.A0D;
                                if (userJid3 != null) {
                                    r122.A00(r10, r72, r62, r15.A0H(userJid3), elapsedRealtime);
                                } else {
                                    throw C17890vO.A0K();
                                }
                            }
                            r12 = C62602rf.A06;
                        }
                    }
                    concurrentHashMap.remove(userJid2);
                    concurrentHashMap2.remove(A002);
                    return r12;
                } catch (TimeoutException unused) {
                    Log.e("ContactQuerySync/querySyncJid/timeout");
                    r1 = C62602rf.A03;
                    concurrentHashMap.remove(userJid2);
                    this.A02.remove(A002);
                    return r1;
                } catch (ExecutionException e) {
                    A02("querySyncJid", e);
                    r1 = C62602rf.A03;
                    concurrentHashMap.remove(userJid2);
                    this.A02.remove(A002);
                    return r1;
                }
            } catch (Exception e2) {
                Log.e("ContactQuerySync/querySyncJid/exception thrown", e2);
                this.A04.A0G("ContactQuerySync/querySyncJid", e2.getMessage(), true);
                r1 = C62602rf.A02;
            } catch (Throwable th) {
                concurrentHashMap.remove(userJid2);
                this.A02.remove(A002);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0n("Check failed.");
        }
    }

    private final void A01(C62602rf r4, AnonymousClass2HO r5, Integer num) {
        if (num != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0C, 9984) || this.A0B.A08()) {
                int i = r4.A00;
                int i2 = 3;
                if (i != 0) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            i2 = 6;
                            if (i != 6) {
                                i2 = -1;
                            }
                        }
                    }
                }
                r5.A0B = C17880vN.A0n(i2);
                AnonymousClass1UR r1 = this.A09;
                r5.A04 = AnonymousClass000.A0h();
                AnonymousClass1UR.A00(r1, r5);
                r1.A02.CC7(r5);
            }
        }
    }

    public final Pair A03(AnonymousClass2R1 r27, Integer num, String str) {
        ConcurrentHashMap concurrentHashMap;
        String A002;
        Pair pair;
        Pair pair2;
        List list;
        Integer num2;
        C62602rf r0;
        String str2 = str;
        C18070vi.A0d(str2, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass2R1 r17 = r27;
        AnonymousClass2R1 r02 = r17;
        if (r02 == AnonymousClass2R1.A0F || r02 == AnonymousClass2R1.A01) {
            AnonymousClass1UR r3 = this.A09;
            AnonymousClass2HO r2 = new AnonymousClass2HO();
            r2.A0L = r17.toString();
            Integer num3 = num;
            r2.A05 = num3;
            C17880vN.A1N(r2, r3.A03, AnonymousClass11P.A01(r3.A00));
            if (!this.A06.A09()) {
                Log.i("ContactQuerySync/querySyncPhoneNumber: network_unavailable");
                r0 = C62602rf.A04;
                A01(r0, r2, num3);
            } else {
                concurrentHashMap = this.A0F;
                if (concurrentHashMap.putIfAbsent(str2, str2) != null) {
                    if (num != null) {
                        if (C18020vd.A05(C18040vf.A02, this.A0C, 9984) || this.A0B.A08()) {
                            r3.A02(r2);
                        }
                    }
                    r0 = C62602rf.A08;
                } else {
                    A002 = C63412t2.A00("sync_sid_query");
                    C18070vi.A0X(A002);
                    try {
                        int A003 = ((C192179nw) this.A0D.get()).A00();
                        C18030ve r12 = this.A0C;
                        C18040vf r11 = C18040vf.A02;
                        C26981Ug A052 = ((C20995Acn) this.A03.getValue()).A05(A01.A00(r17, (UserJid) null, str2, A003, C18020vd.A05(r11, r12, 5290), C18020vd.A05(r11, r12, 5751), C18020vd.A06(r12)), A002, 32000);
                        C18070vi.A0X(A052);
                        A052.get(32000, TimeUnit.MILLISECONDS);
                        ConcurrentHashMap concurrentHashMap2 = this.A02;
                        C53372cQ r10 = (C53372cQ) concurrentHashMap2.get(A002);
                        if (r10 == null) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("ContactQuerySync/querySyncPhoneNumber: empty sync result for ");
                            A10.append(str2);
                            A10.append(" (syncId is ");
                            Log.e(C17900vP.A0B(A002, A10));
                            C62602rf r03 = C62602rf.A03;
                            A01(r03, r2, num3);
                            pair2 = A00(r03, (Object) null);
                        } else {
                            C188829i3[] r04 = r10.A01;
                            if (r04.length == 0) {
                                A00 a00 = r10.A00.A02;
                                if (a00 == null || (num2 = a00.A01) == null || num2.intValue() != 429) {
                                    C17900vP.A0e("ContactQuerySync/querySyncPhoneNumber: no users for ", str2, AnonymousClass000.A10());
                                    C62602rf r05 = C62602rf.A03;
                                    A01(r05, r2, num3);
                                    pair2 = A00(r05, (Object) null);
                                } else {
                                    C17900vP.A0e("ContactQuerySync/querySyncPhoneNumber: rate-limit-error ", str2, AnonymousClass000.A10());
                                    C62602rf r06 = C62602rf.A05;
                                    A01(r06, r2, num3);
                                    pair2 = A00(r06, (Object) null);
                                }
                            } else {
                                C188829i3 r07 = r04[0];
                                if (r07.A04 == 1) {
                                    AnonymousClass1UH r15 = this.A08;
                                    List A0M = C18070vi.A0M(r07);
                                    C59902n4 r14 = r10.A00;
                                    r15.A02(r14, A0M);
                                    AnonymousClass1M9 r102 = this.A07;
                                    UserJid userJid = r07.A0D;
                                    if (userJid != null) {
                                        r15.A00(r17, r07, r14, r102.A0H(userJid), elapsedRealtime);
                                    } else {
                                        throw C17890vO.A0K();
                                    }
                                }
                                List list2 = r07.A0K;
                                if (!(list2 == null || !AnonymousClass000.A1a(list2) || (list = r07.A0K) == null)) {
                                    list.get(0);
                                }
                                if (num != null && (C18020vd.A05(r11, r12, 9984) || this.A0B.A08())) {
                                    r2.A04 = true;
                                    AnonymousClass1UR.A00(r3, r2);
                                    r3.A02.CC7(r2);
                                }
                                pair2 = A00(C62602rf.A06, r07);
                            }
                        }
                        concurrentHashMap.remove(str2);
                        concurrentHashMap2.remove(A002);
                        return pair2;
                    } catch (TimeoutException unused) {
                        Log.e("ContactQuerySync/querySyncPhoneNumber/timeout");
                        C62602rf r08 = C62602rf.A03;
                        A01(r08, r2, num3);
                        pair = A00(r08, (Object) null);
                    } catch (ExecutionException e) {
                        A02("querySyncPhoneNumber", e);
                        C62602rf r09 = C62602rf.A03;
                        A01(r09, r2, num3);
                        pair = A00(r09, (Object) null);
                    } catch (InterruptedException e2) {
                        C17900vP.A0h("ContactQuerySync/querySyncPhoneNumber: exception during Query Sync ", str2, AnonymousClass000.A10(), e2);
                        C62602rf r010 = C62602rf.A02;
                        A01(r010, r2, num3);
                        pair = A00(r010, (Object) null);
                    } catch (Throwable th) {
                        concurrentHashMap.remove(str2);
                        this.A02.remove(A002);
                        throw th;
                    }
                }
            }
            return A00(r0, (Object) null);
        }
        throw AnonymousClass000.A0n("Check failed.");
        concurrentHashMap.remove(str2);
        this.A02.remove(A002);
        return pair;
    }

    public C678831f(AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass11E r5, AnonymousClass1M9 r6, AnonymousClass1UH r7, C26861Tt r8, AnonymousClass1UR r9, AnonymousClass3KO r10, AnonymousClass11P r11, AnonymousClass1M4 r12, AnonymousClass1UN r13, C18030ve r14, AnonymousClass00H r15) {
        C18070vi.A0w(r10, r14, r12, r15, r5);
        C18070vi.A0x(r6, r7, r8, r9, r3);
        C18070vi.A0r(r4, r13, r11);
        this.A0C = r14;
        this.A0A = r12;
        this.A0D = r15;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A00 = r8;
        this.A09 = r9;
        this.A04 = r3;
        this.A05 = r4;
        this.A0B = r13;
        this.A01 = r11;
        this.A03 = new C18110vm(new C71593Hp(this, r10));
        this.A0F = new ConcurrentHashMap();
        this.A02 = new ConcurrentHashMap();
    }

    public static Pair A00(Object obj, Object obj2) {
        Pair create = Pair.create(obj, obj2);
        C18070vi.A0X(create);
        return create;
    }

    private final void A02(String str, ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || ((executionException.getCause() instanceof Error) && !(executionException.getCause() instanceof AssertionError) && !(executionException.getCause() instanceof OutOfMemoryError))) {
            this.A04.A0G(AnonymousClass001.A1H("ContactQuerySync/", str, AnonymousClass000.A10()), executionException.getMessage(), true);
        }
    }
}
