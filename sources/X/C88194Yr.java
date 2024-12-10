package X;

import com.whatsapp.jid.PhoneUserJid;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Yr  reason: invalid class name and case insensitive filesystem */
public final class C88194Yr {
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final AnonymousClass1PP A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass00H A06;

    public final AnonymousClass24H A01(C445823z r5) {
        C201110w copyOf;
        C18070vi.A0d(r5, 0);
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A05);
        if (A002 == null) {
            return null;
        }
        AnonymousClass25F r1 = r5.A0A;
        C18070vi.A0d(r1, 0);
        C692936q r12 = (C692936q) r1.A02;
        if (r12 == null || (copyOf = C201110w.copyOf(r12.A00)) == null) {
            return null;
        }
        return (AnonymousClass24H) copyOf.get(A002);
    }

    public final String A02(C445823z r9) {
        C18070vi.A0d(r9, 0);
        C194409rg r2 = r9.A01;
        if (r2 != null) {
            String str = r2.A02;
            if ((str != null && str.length() != 0) || ((str = r2.A01) != null && str.length() != 0)) {
                return str;
            }
            C193789qf r0 = r2.A00;
            if (r0 != null) {
                double d = r0.A00;
                Double valueOf = Double.valueOf(d);
                double d2 = r0.A01;
                Double valueOf2 = Double.valueOf(d2);
                if (!(valueOf == null || valueOf2 == null || (d == 0.0d && d2 == 0.0d))) {
                    DecimalFormat decimalFormat = new DecimalFormat("###.######");
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(decimalFormat.format(d));
                    A10.append(", ");
                    return AnonymousClass000.A0y(decimalFormat.format(d2), A10);
                }
            }
        }
        return null;
    }

    public final boolean A04(C445823z r7) {
        long j;
        C18070vi.A0d(r7, 0);
        Long l = r7.A03;
        if (!C18020vd.A05(C18040vf.A02, this.A02, 8509) || l == null) {
            j = r7.A00;
        } else {
            j = l.longValue();
        }
        if (j >= AnonymousClass11P.A01(this.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A02, 5562) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A02, 7258) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r3 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass1BI r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            boolean r0 = X.C22971Dz.A0e(r8)
            r6 = 1
            if (r0 != 0) goto L_0x001e
            boolean r0 = X.C22971Dz.A0d(r8)
            if (r0 == 0) goto L_0x006a
            X.0ve r2 = r7.A02
            r1 = 8357(0x20a5, float:1.171E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
        L_0x001b:
            if (r1 == 0) goto L_0x006a
        L_0x001d:
            return r6
        L_0x001e:
            X.1CJ r1 = r7.A01
            X.1EC r0 = X.AnonymousClass3MW.A0i(r8)
            int r5 = r1.A06(r0)
            r0 = 2
            if (r5 == r0) goto L_0x002e
            r0 = 6
            if (r5 != r0) goto L_0x003b
        L_0x002e:
            X.0ve r2 = r7.A02
            r1 = 5562(0x15ba, float:7.794E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r5 != 0) goto L_0x004b
            X.0ve r2 = r7.A02
            r1 = 7258(0x1c5a, float:1.017E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0064
        L_0x004b:
            r3 = 0
            r0 = 3
            if (r5 != r0) goto L_0x0064
            X.0ve r2 = r7.A02
            r0 = 5562(0x15ba, float:7.794E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0064
            r0 = 9932(0x26cc, float:1.3918E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r4 != 0) goto L_0x001d
            if (r3 != 0) goto L_0x001d
            goto L_0x001b
        L_0x006a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88194Yr.A05(X.1BI):boolean");
    }

    public C88194Yr(AnonymousClass11S r1, AnonymousClass11P r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass1PP r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r4, r1, r3, r6);
        C18070vi.A0l(r7, r5);
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r1;
        this.A01 = r3;
        this.A06 = r6;
        this.A04 = r7;
        this.A03 = r5;
    }

    public static final ArrayList A00(C88194Yr r5, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A032 = C17880vN.A0c(r5.A06).A01.A03(C17890vO.A07(it));
            if (A032 != null) {
                A13.add(A032);
            }
        }
        return A13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03() {
        /*
            r8 = this;
            java.util.HashSet r5 = X.C17880vN.A12()
            X.00H r7 = r8.A04
            java.lang.Object r4 = r7.get()
            X.2r4 r4 = (X.C62232r4) r4
            X.11P r6 = r8.A00
            long r1 = X.AnonymousClass11P.A01(r6)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            X.C17880vN.A1V(r3, r0, r1)
            X.1Cd r0 = r4.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nJOIN message_add_on\nON message_event.message_row_id = message_add_on.parent_message_row_id\nJOIN message_add_on_event_response\nON message_add_on._id = message_add_on_event_response.message_add_on_row_id\nWHERE \n    message_event.start_time > ?\n    AND\n    message_event.is_canceled = 0\n    AND\n    message_add_on_event_response.response = 1\n    AND\n    message_add_on.from_me = 1\nORDER BY start_time\nASC\nLIMIT 20"
            java.lang.String r0 = "GET_UPCOMING_EVENTS_WHERE_I_RESPONDING_GOING_QUERY_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x008a }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0083 }
            X.C62232r4.A00(r2, r0)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ all -> 0x008a }
        L_0x003b:
            r4.close()
            r5.addAll(r0)
            java.lang.Object r4 = r7.get()
            X.2r4 r4 = (X.C62232r4) r4
            long r1 = X.AnonymousClass11P.A01(r6)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            X.C17880vN.A1V(r3, r0, r1)
            X.1Cd r0 = r4.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nJOIN message\nON message_event.message_row_id  = message._id\nWHERE \n    message_event.start_time > ?\n    AND\n    message_event.is_canceled = 0\n    AND\n    message.from_me = 1\n    AND\n    message.message_type = 92\nORDER BY start_time\nASC\nLIMIT 20"
            java.lang.String r0 = "GET_UPCOMING_EVENTS_CREATED_BY_ME_QUERY_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x008a }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0083 }
            X.C62232r4.A00(r2, r0)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0074
            r2.close()     // Catch:{ all -> 0x008a }
        L_0x0074:
            r4.close()
            r5.addAll(r0)
            java.util.List r0 = X.C29431cG.A0t(r5)
            java.util.ArrayList r0 = A00(r8, r0)
            return r0
        L_0x0083:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88194Yr.A03():java.util.ArrayList");
    }
}
