package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.2nT  reason: invalid class name and case insensitive filesystem */
public final class C60152nT {
    public final AnonymousClass11S A00;
    public final C25001Mm A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1Q6 A03;
    public final C32601hS A04;
    public final C32021gV A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final Set A0B = C17880vN.A14();
    public final AnonymousClass1LW A0C;
    public final AnonymousClass1CJ A0D;
    public final C32481hG A0E;
    public final AnonymousClass1WM A0F;
    public final C32801hm A0G;
    public final AnonymousClass00H A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.1CJ r1 = r8.A0D
            X.205 r0 = r9.A0v
            X.1BI r6 = r0.A00
            X.1ci r5 = r1.A0A(r6)
            boolean r0 = r5 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00de
            if (r5 == 0) goto L_0x00de
            long r3 = r5.A0W
            long r1 = r9.A0x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            long r3 = r5.A0X
            long r1 = r9.A0y
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            X.00H r0 = r8.A0H
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r2 = r0.A02
            r1 = 10259(0x2813, float:1.4376E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00de
            X.00H r5 = r8.A0A
            java.lang.Object r7 = r5.get()
            X.1hF r7 = (X.C32471hF) r7
            r1 = 0
            boolean r0 = r6 instanceof X.C29681ch
            if (r0 == 0) goto L_0x00de
            if (r6 == 0) goto L_0x00de
            X.1Cd r0 = r7.A03
            X.1at r4 = r0.get()
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00d7 }
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x00d7 }
            X.AnonymousClass1LW.A03(r0, r6, r3, r1)     // Catch:{ all -> 0x00d7 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00d7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00d7 }
            java.lang.String r1 = "SELECT server_message_id FROM newsletter_message as newsletter_message LEFT JOIN message_revoked as message_revoked ON newsletter_message.message_row_id = message_revoked.message_row_id  WHERE chat_row_id = ? AND newsletter_message.message_row_id > 0  AND message_revoked.message_row_id IS NULL ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r0 = "GET_LAST_NON_DELETED_MESSAGE_SERVER_ID"
            android.database.Cursor r3 = X.C18070vi.A04(r2, r1, r0, r3)     // Catch:{ all -> 0x00d7 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x006c
            r1 = -1
            goto L_0x0073
        L_0x006c:
            java.lang.String r0 = "server_message_id"
            long r1 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x00d0 }
        L_0x0073:
            r3.close()     // Catch:{ all -> 0x00d7 }
            r4.close()
            X.121 r0 = r7.A02
            X.122 r0 = (X.AnonymousClass122) r0
            X.00H r0 = r0.A1E
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.206 r4 = r0.A03(r6, r1)
            if (r4 == 0) goto L_0x00de
            java.lang.Object r3 = r5.get()
            X.1hF r3 = (X.C32471hF) r3
            long r5 = r4.A0x
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            X.1CJ r1 = r3.A01
            X.205 r0 = r4.A0v
            X.1BI r0 = r0.A00
            X.1ci r2 = r1.A0A(r0)
            boolean r0 = r2 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00de
            if (r2 == 0) goto L_0x00de
            monitor-enter(r2)
            long r0 = r4.A0x     // Catch:{ all -> 0x00cd }
            r2.A0W = r0     // Catch:{ all -> 0x00cd }
            long r0 = r4.A0y     // Catch:{ all -> 0x00cd }
            r2.A0X = r0     // Catch:{ all -> 0x00cd }
            long r0 = r4.A0x     // Catch:{ all -> 0x00cd }
            r2.A0P = r0     // Catch:{ all -> 0x00cd }
            long r0 = r4.A0y     // Catch:{ all -> 0x00cd }
            r2.A0Q = r0     // Catch:{ all -> 0x00cd }
            long r0 = r4.A0I     // Catch:{ all -> 0x00cd }
            r2.A0Z = r0     // Catch:{ all -> 0x00cd }
            r2.A0g = r4     // Catch:{ all -> 0x00cd }
            r2.A0f = r4     // Catch:{ all -> 0x00cd }
            X.00H r0 = r3.A07     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00cd }
            X.1i5 r0 = (X.C32991i5) r0     // Catch:{ all -> 0x00cd }
            r0.A02(r2)     // Catch:{ all -> 0x00cd }
            monitor-exit(r2)
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60152nT.A02(X.206):void");
    }

    public final boolean A04(C29681ch r17, AnonymousClass206 r18) {
        long j;
        boolean z;
        C691336a A002;
        AnonymousClass8BG A012;
        String str;
        AnonymousClass1CJ r1 = this.A0D;
        C29681ch r2 = r17;
        AnonymousClass4aS.A06(r1, r2);
        this.A0C.A09(r2);
        C29691ci A0A2 = r1.A0A(r2);
        AnonymousClass206 r7 = r18;
        if (A0A2 == null && this.A0B.add(r2)) {
            this.A01.A01(AnonymousClass2UG.A00(r2, new AnonymousClass356(this, r7)));
        }
        AnonymousClass205 r5 = r7.A0v;
        C18070vi.A0W(r5);
        AnonymousClass206 A003 = ((C57282ip) C18070vi.A0E(this.A07)).A00(r5, false);
        if (A003 != null) {
            if (!(r7 instanceof AnonymousClass23N)) {
                C691536c A004 = C60492o7.A00(A003);
                C691536c A005 = C60492o7.A00(r7);
                if (A005 != null) {
                    j = A005.A00;
                } else {
                    j = r7.A0I;
                }
                if (A004 != null && A004.A00 > j) {
                    z = false;
                    A002 = C50382Uf.A00(A003);
                    A012 = C63892tr.A01(A003);
                    boolean A11 = r7.A11(131072);
                    A03(r7, Boolean.valueOf(A002.A07), Long.valueOf(A002.A03), A002.A04, str, AnonymousClass11P.A01(this.A02), true, false);
                    C63892tr.A07(A012, r7);
                    ((C32471hF) this.A0A.get()).A05(r7);
                    return z;
                } else if (!(r7 instanceof AnonymousClass22H)) {
                    r7.A0a(A003.A0D());
                    r7.A0x = A003.A0x;
                    if (r7.A11(131072)) {
                        this.A05.A0J(r7, AnonymousClass00R.A00);
                    }
                    try {
                        z = C17880vN.A0c(this.A06).A05(r7, 33);
                        if (r7.A11(131072)) {
                            this.A04.A01(r7);
                        }
                        this.A03.A0B(r7);
                        if (!r7.A0u()) {
                            C57562jH r3 = (C57562jH) this.A09.get();
                            C17880vN.A0d(r3.A02).A00(new C21435Ak2(A003, r3, r7, 20));
                        }
                    } catch (SQLiteException e) {
                        Log.e("NewsletterMessageManager/unable to update the message", e);
                        z = false;
                    }
                    A002 = C50382Uf.A00(A003);
                    A012 = C63892tr.A01(A003);
                    boolean A112 = r7.A11(131072);
                    A03(r7, Boolean.valueOf(A002.A07), Long.valueOf(A002.A03), A002.A04, str, AnonymousClass11P.A01(this.A02), true, false);
                    C63892tr.A07(A012, r7);
                    ((C32471hF) this.A0A.get()).A05(r7);
                    return z;
                }
            } else if (!(A003 instanceof AnonymousClass23N) || r7.A0y != A003.A0y) {
                if (r7.A11(1048576)) {
                    r7.A0a(16);
                }
                AnonymousClass23N r0 = (AnonymousClass23N) r7;
                z = A05(A003, r0, true);
                if (z && !r0.A0u()) {
                    C57562jH r32 = (C57562jH) this.A09.get();
                    C17880vN.A0d(r32.A02).A00(new C21435Ak2(A003, r32, r7, 20));
                }
                A002 = C50382Uf.A00(A003);
                A012 = C63892tr.A01(A003);
                boolean A1122 = r7.A11(131072);
                if (A002 != null && (!((str = A002.A05) == null || str.length() == 0) || A1122)) {
                    A03(r7, Boolean.valueOf(A002.A07), Long.valueOf(A002.A03), A002.A04, str, AnonymousClass11P.A01(this.A02), true, false);
                    if (A012 != null && !r7.A11(1048576)) {
                        C63892tr.A07(A012, r7);
                    }
                }
                ((C32471hF) this.A0A.get()).A05(r7);
                return z;
            }
            z = true;
            A002 = C50382Uf.A00(A003);
            A012 = C63892tr.A01(A003);
            boolean A11222 = r7.A11(131072);
            A03(r7, Boolean.valueOf(A002.A07), Long.valueOf(A002.A03), A002.A04, str, AnonymousClass11P.A01(this.A02), true, false);
            C63892tr.A07(A012, r7);
            ((C32471hF) this.A0A.get()).A05(r7);
            return z;
        }
        if (r7.A11(1048576)) {
            if (r5.A02) {
                r7.A0a(4);
            } else {
                r7.A0a(0);
            }
        }
        if ((A0A2 instanceof C46162Dk) && ((C46162Dk) A0A2).A0A && this.A0B.add(r2)) {
            this.A01.A01(AnonymousClass2UG.A00(r2, new AnonymousClass356(this, (AnonymousClass206) null)));
        }
        boolean A062 = ((C32471hF) this.A0A.get()).A06(r7);
        ((AnonymousClass1W1) this.A08.get()).CQy(r7);
        if (A062) {
            this.A03.A0B(r7);
        }
        return A062;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = ((X.C32471hF) r2.A0A.get()).A06(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass206 r3, X.AnonymousClass23N r4, boolean r5) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1hG r0 = r2.A0E
            boolean r1 = r0.A04(r4, r5)
            if (r1 != 0) goto L_0x001a
            X.00H r0 = r2.A0A
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            boolean r1 = r0.A06(r4)
            if (r1 == 0) goto L_0x0028
        L_0x001a:
            X.00H r0 = r2.A0A
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            r0.A04(r4)
            r2.A02(r3)
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60152nT.A05(X.206, X.23N, boolean):boolean");
    }

    public C60152nT(AnonymousClass11S r18, C25001Mm r19, AnonymousClass11P r20, AnonymousClass1LW r21, AnonymousClass1CJ r22, C32481hG r23, AnonymousClass1Q6 r24, C32601hS r25, AnonymousClass1WM r26, C32801hm r27, C32021gV r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34) {
        AnonymousClass1LW r0 = r21;
        AnonymousClass1CJ r13 = r22;
        C25001Mm r14 = r19;
        AnonymousClass11P r15 = r20;
        AnonymousClass11S r16 = r18;
        C18070vi.A0w(r15, r0, r16, r13, r14);
        AnonymousClass00H r7 = r29;
        AnonymousClass00H r6 = r30;
        C32601hS r10 = r25;
        AnonymousClass1WM r9 = r26;
        AnonymousClass1Q6 r11 = r24;
        C18070vi.A0x(r7, r6, r9, r11, r10);
        AnonymousClass00H r5 = r31;
        AnonymousClass00H r4 = r32;
        AnonymousClass00H r3 = r33;
        C18070vi.A0r(r5, r4, r3);
        C32481hG r12 = r23;
        C18070vi.A0d(r12, 14);
        AnonymousClass00H r2 = r34;
        C32021gV r8 = r28;
        C18070vi.A0m(r8, r2);
        this.A02 = r15;
        this.A0C = r0;
        this.A00 = r16;
        this.A0D = r13;
        this.A01 = r14;
        this.A06 = r7;
        this.A07 = r6;
        this.A0F = r9;
        this.A03 = r11;
        this.A04 = r10;
        this.A0A = r5;
        this.A08 = r4;
        this.A0H = r3;
        this.A0E = r12;
        this.A0G = r27;
        this.A05 = r8;
        this.A09 = r2;
    }

    public final void A00(C29681ch r21, AnonymousClass206 r22, List list, List list2, long j) {
        boolean z;
        int i;
        int i2;
        AnonymousClass7C9 r1;
        String str;
        AnonymousClass206 r9 = r22;
        if (list != null) {
            z = true;
        } else if (list2 != null) {
            z = false;
        } else {
            return;
        }
        A03(r9, (Boolean) null, (Long) null, (Long) null, (String) null, j, z, false);
        if (list != null) {
            ArrayList A0D2 = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9D6 r0 = (AnonymousClass9D6) it.next();
                AnonymousClass11S r12 = this.A00;
                String str2 = r0.A02;
                long j2 = r0.A00;
                C18070vi.A0d(str2, 0);
                C691336a A002 = C50382Uf.A00(r9);
                if (A002 != null) {
                    str = A002.A05;
                } else {
                    str = null;
                }
                A0D2.add(new C115125tR(r12, r21, str2, j2, r9.A0x, str2.equals(str)));
            }
            ArrayList A0m = C29431cG.A0m(A0D2);
            if (!C63892tr.A07(new AnonymousClass7C9(A0m), r9)) {
                AnonymousClass8BG A012 = C63892tr.A01(r9);
                if ((A012 instanceof AnonymousClass7C9) && (r1 = (AnonymousClass7C9) A012) != null) {
                    List list3 = r1.A00;
                    synchronized (list3) {
                        list3.clear();
                        list3.addAll(A0m);
                    }
                }
            }
        }
        if (list2 != null && (r9 instanceof AnonymousClass22H)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list2));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AnonymousClass9DK r13 = (AnonymousClass9DK) it2.next();
                linkedHashMap.put(C197019w1.A00((byte[]) r13.A01), Long.valueOf(r13.A00));
            }
            AnonymousClass22H r92 = (AnonymousClass22H) r9;
            AnonymousClass25F r14 = r92.A06;
            synchronized (r14) {
                r14.A02((AnonymousClass229) null);
                r14.A01();
            }
            for (A18 a18 : r92.A07) {
                String str3 = a18.A02;
                if (linkedHashMap.containsKey(str3)) {
                    Number number = (Number) linkedHashMap.get(str3);
                    i2 = 0;
                    if (number != null) {
                        i = number.intValue();
                        if (i < 0) {
                            a18.A00 = i2;
                        }
                        i2 = i;
                        a18.A00 = i2;
                    }
                }
                i = 0;
                i2 = i;
                a18.A00 = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [X.36a, java.lang.Object, X.229] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r24 == null) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082 A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac A[Catch:{ all -> 0x014f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(X.AnonymousClass206 r21, java.lang.Boolean r22, java.lang.Long r23, java.lang.Long r24, java.lang.String r25, long r26, boolean r28, boolean r29) {
        /*
            r20 = this;
            r6 = r20
            monitor-enter(r6)
            r13 = 0
            r2 = 0
            if (r28 == 0) goto L_0x000b
            r0 = 1
            goto L_0x000d
        L_0x000b:
            r0 = 0
        L_0x000d:
            r10 = r21
            X.36a r8 = X.C50382Uf.A00(r10)     // Catch:{ all -> 0x015b }
            r11 = r24
            r7 = r25
            r4 = r26
            if (r8 != 0) goto L_0x004c
            if (r23 == 0) goto L_0x0021
            long r2 = r23.longValue()     // Catch:{ all -> 0x015b }
        L_0x0021:
            int r9 = r10.A0u     // Catch:{ all -> 0x015b }
            r8 = 3
            boolean r14 = X.AnonymousClass000.A1T(r9, r8)
            if (r22 == 0) goto L_0x002e
            boolean r13 = r22.booleanValue()     // Catch:{ all -> 0x015b }
        L_0x002e:
            r8 = 0
            X.36a r12 = new X.36a     // Catch:{ all -> 0x015b }
            r12.<init>()     // Catch:{ all -> 0x015b }
            r12.A00 = r8     // Catch:{ all -> 0x015b }
            r12.A05 = r7     // Catch:{ all -> 0x015b }
            r12.A04 = r11     // Catch:{ all -> 0x015b }
            r12.A01 = r0     // Catch:{ all -> 0x015b }
            r12.A02 = r4     // Catch:{ all -> 0x015b }
            r12.A03 = r2     // Catch:{ all -> 0x015b }
            r12.A06 = r14     // Catch:{ all -> 0x015b }
            r12.A07 = r13     // Catch:{ all -> 0x015b }
            java.lang.Class<X.36a> r0 = X.C691336a.class
            X.AnonymousClass206.A05(r10, r12, r0)     // Catch:{ all -> 0x015b }
            goto L_0x0159
        L_0x004c:
            X.36a r8 = X.C50382Uf.A00(r10)     // Catch:{ all -> 0x015b }
            r18 = 0
            if (r8 == 0) goto L_0x005f
            java.lang.String r12 = r8.A05     // Catch:{ all -> 0x015b }
        L_0x0056:
            X.36a r8 = X.C50382Uf.A00(r10)     // Catch:{ all -> 0x015b }
            if (r8 == 0) goto L_0x0073
            java.lang.Long r9 = r8.A04     // Catch:{ all -> 0x015b }
            goto L_0x0062
        L_0x005f:
            r12 = r18
            goto L_0x0056
        L_0x0062:
            if (r9 == 0) goto L_0x0075
            if (r24 == 0) goto L_0x0077
            long r16 = r11.longValue()     // Catch:{ all -> 0x015b }
            long r14 = r9.longValue()     // Catch:{ all -> 0x015b }
            int r8 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0077
            goto L_0x0079
        L_0x0073:
            r9 = r18
        L_0x0075:
            if (r24 != 0) goto L_0x0079
        L_0x0077:
            r14 = 0
            goto L_0x007c
        L_0x0079:
            r14 = 1
            r12 = r7
            r9 = r11
        L_0x007c:
            X.36a r8 = X.C50382Uf.A00(r10)     // Catch:{ all -> 0x015b }
            if (r8 == 0) goto L_0x009e
            r8.A00 = r2     // Catch:{ all -> 0x015b }
            r8.A05 = r12     // Catch:{ all -> 0x015b }
            r8.A04 = r9     // Catch:{ all -> 0x015b }
            r8.A01 = r0     // Catch:{ all -> 0x015b }
            r8.A02 = r4     // Catch:{ all -> 0x015b }
            if (r23 == 0) goto L_0x0093
            long r0 = r23.longValue()     // Catch:{ all -> 0x015b }
            goto L_0x0095
        L_0x0093:
            long r0 = r8.A03     // Catch:{ all -> 0x015b }
        L_0x0095:
            r8.A03 = r0     // Catch:{ all -> 0x015b }
            if (r22 == 0) goto L_0x00a1
            boolean r0 = r22.booleanValue()     // Catch:{ all -> 0x015b }
            goto L_0x00a3
        L_0x009e:
            r8 = r18
            goto L_0x00a5
        L_0x00a1:
            boolean r0 = r8.A07     // Catch:{ all -> 0x015b }
        L_0x00a3:
            r8.A07 = r0     // Catch:{ all -> 0x015b }
        L_0x00a5:
            java.lang.Class<X.36a> r0 = X.C691336a.class
            X.AnonymousClass206.A05(r10, r8, r0)     // Catch:{ all -> 0x015b }
            if (r14 == 0) goto L_0x0159
            java.util.ArrayList r1 = X.C17880vN.A0z(r13)     // Catch:{ all -> 0x015b }
            X.7C9 r0 = new X.7C9     // Catch:{ all -> 0x015b }
            r0.<init>(r1)     // Catch:{ all -> 0x015b }
            X.C63892tr.A07(r0, r10)     // Catch:{ all -> 0x015b }
            X.8BG r0 = X.C63892tr.A01(r10)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0152
            X.8BG r1 = X.C63892tr.A01(r10)     // Catch:{ all -> 0x015b }
            boolean r0 = r1 instanceof X.AnonymousClass7C9     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0159
            X.7C9 r1 = (X.AnonymousClass7C9) r1     // Catch:{ all -> 0x015b }
            if (r1 == 0) goto L_0x0159
            X.11S r14 = r6.A00     // Catch:{ all -> 0x015b }
            X.205 r0 = r10.A0v     // Catch:{ all -> 0x015b }
            X.1BI r5 = r0.A00     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r5, r0)     // Catch:{ all -> 0x015b }
            X.1ch r5 = (X.C29681ch) r5     // Catch:{ all -> 0x015b }
            long r11 = r10.A0x     // Catch:{ all -> 0x015b }
            r8 = 1
            X.C18070vi.A0d(r5, r8)     // Catch:{ all -> 0x015b }
            java.util.List r4 = r1.A00     // Catch:{ all -> 0x015b }
            monitor-enter(r4)     // Catch:{ all -> 0x015b }
            java.util.Iterator r18 = r4.iterator()     // Catch:{ all -> 0x014f }
            r10 = 0
            r17 = 1
        L_0x00e7:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0128
            java.lang.Object r9 = r18.next()     // Catch:{ all -> 0x014f }
            X.5tR r9 = (X.C115125tR) r9     // Catch:{ all -> 0x014f }
            boolean r0 = r9.A01     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x014f }
            boolean r0 = X.C18070vi.A18(r0, r7)     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x014d
            r9.A01 = r13     // Catch:{ all -> 0x014f }
            if (r29 == 0) goto L_0x010a
            long r0 = r9.A00     // Catch:{ all -> 0x014f }
            r15 = -1
            long r0 = r0 + r15
            r9.A00 = r0     // Catch:{ all -> 0x014f }
        L_0x010a:
            long r0 = r9.A00     // Catch:{ all -> 0x014f }
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x00e7
            r10 = r9
            goto L_0x00e7
        L_0x0112:
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x014f }
            boolean r0 = X.C18070vi.A18(r0, r7)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x00e7
            r9.A01 = r8     // Catch:{ all -> 0x014f }
            if (r29 == 0) goto L_0x0125
            long r0 = r9.A00     // Catch:{ all -> 0x014f }
            r15 = 1
            long r0 = r0 + r15
            r9.A00 = r0     // Catch:{ all -> 0x014f }
        L_0x0125:
            r17 = 0
            goto L_0x00e7
        L_0x0128:
            if (r10 == 0) goto L_0x0131
            java.util.Collection r0 = X.C41681wt.A00(r4)     // Catch:{ all -> 0x014f }
            r0.remove(r10)     // Catch:{ all -> 0x014f }
        L_0x0131:
            if (r17 == 0) goto L_0x014d
            if (r25 == 0) goto L_0x014d
            int r0 = r7.length()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            r15 = 1
            X.5tR r0 = new X.5tR     // Catch:{ all -> 0x014f }
            r17 = r11
            r19 = r8
            r11 = r0
            r12 = r14
            r13 = r5
            r14 = r7
            r11.<init>(r12, r13, r14, r15, r17, r19)     // Catch:{ all -> 0x014f }
            r4.add(r0)     // Catch:{ all -> 0x014f }
        L_0x014d:
            monitor-exit(r4)     // Catch:{ all -> 0x015b }
            goto L_0x0159
        L_0x014f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x015b }
            goto L_0x0158
        L_0x0152:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x015b }
        L_0x0158:
            throw r0     // Catch:{ all -> 0x015b }
        L_0x0159:
            monitor-exit(r6)
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60152nT.A03(X.206, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, long, boolean, boolean):void");
    }

    public final void A01(C29681ch r13, AnonymousClass22H r14, List list, long j) {
        C18070vi.A0h(r13, r14);
        List list2 = r14.A07;
        C18070vi.A0X(list2);
        ArrayList<A18> A13 = AnonymousClass000.A13();
        for (Object next : list2) {
            A18 a18 = (A18) next;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C18070vi.A18(a18.A02, it.next())) {
                        A13.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList A0D2 = C29351c6.A0D(A13);
        for (A18 a182 : A13) {
            C17880vN.A1R(A0D2, a182.A01);
        }
        C32801hm r2 = this.A0G;
        long j2 = j;
        AnonymousClass22E r22 = new AnonymousClass22E(r2.A00.A01(r13, true), new A51((AnonymousClass1BI) null, r14.A0v), (List) A0D2, j2, r14.A0x, j2);
        r22.A0a(17);
        AnonymousClass1WM.A00(this.A0F, r22, true);
    }
}
