package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.30r  reason: invalid class name and case insensitive filesystem */
public final class C677430r implements AnonymousClass1WS {
    public final C24681Lg A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0187, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0175, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0180, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0183, code lost:
        r1 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByH(X.AnonymousClass206 r20, int r21) {
        /*
            r19 = this;
            r0 = 0
            r4 = r20
            X.C18070vi.A0d(r4, r0)
            boolean r0 = X.AnonymousClass206.A08(r4)
            if (r0 == 0) goto L_0x0190
            X.36k r0 = X.C60472o5.A00(r4)
            if (r0 == 0) goto L_0x0190
            java.lang.Long r0 = r0.A02()
            if (r0 == 0) goto L_0x0190
            long r2 = r0.longValue()
            r1 = r19
            X.00H r0 = r1.A02
            X.206 r8 = X.AnonymousClass1W2.A02(r0, r2)
            if (r8 == 0) goto L_0x0190
            X.00H r0 = r1.A01
            java.lang.Object r2 = r0.get()
            X.2pX r2 = (X.C61352pX) r2
            boolean r0 = r4 instanceof X.AnonymousClass23N
            monitor-enter(r2)
            java.lang.String r17 = X.C61352pX.A00(r8)     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r6 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x018d }
        L_0x0039:
            X.36k r0 = X.C60472o5.A00(r8)     // Catch:{ all -> 0x018d }
            r11 = 0
            if (r0 == 0) goto L_0x004d
            int r0 = r0.A00()     // Catch:{ all -> 0x018d }
            java.lang.Long r1 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x018d }
        L_0x0048:
            X.205 r12 = r8.A0v     // Catch:{ all -> 0x018d }
            boolean r0 = r12.A02     // Catch:{ all -> 0x018d }
            goto L_0x0052
        L_0x004d:
            r1 = r11
            goto L_0x0048
        L_0x004f:
            java.lang.Integer r6 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x018d }
            goto L_0x0039
        L_0x0052:
            if (r0 == 0) goto L_0x018b
            if (r1 == 0) goto L_0x018b
            X.00H r0 = r2.A01     // Catch:{ all -> 0x018d }
            r18 = r0
            java.lang.Object r5 = r18.get()     // Catch:{ all -> 0x018d }
            X.2aI r5 = (X.C52052aI) r5     // Catch:{ all -> 0x018d }
            long r3 = r1.longValue()     // Catch:{ all -> 0x018d }
            monitor-enter(r5)     // Catch:{ all -> 0x018d }
            r0 = 0
            int r9 = r6.intValue()     // Catch:{ all -> 0x0188 }
            if (r9 == r0) goto L_0x0075
            java.lang.String r14 = "comment_deletes"
        L_0x006e:
            X.1WI r0 = r5.A00     // Catch:{ all -> 0x0188 }
            X.1au r6 = r0.A06()     // Catch:{ all -> 0x0188 }
            goto L_0x0078
        L_0x0075:
            java.lang.String r14 = "comments"
            goto L_0x006e
        L_0x0078:
            X.1xA r7 = r6.BD0()     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "comments_event_logging"
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x017a }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C28331Zy.A00(r13, r0, r10)     // Catch:{ all -> 0x017a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x017a }
            r0 = r0 ^ 1
            r16 = 0
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "CommentsDailyActionLoggingStore/incrementCount: table does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017a }
            r7.close()     // Catch:{ all -> 0x0181 }
            r6.close()     // Catch:{ all -> 0x0188 }
            goto L_0x00e8
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "\n          UPDATE comments_event_logging \n            SET \n              "
            r1.append(r0)     // Catch:{ all -> 0x017a }
            r1.append(r14)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = " = "
            r1.append(r0)     // Catch:{ all -> 0x017a }
            r1.append(r14)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = " + ?, \n              accumulated_comments = ? \n            WHERE\n              comment_space_id = ?\n        "
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "update_comment_action"
            X.2nI r14 = r13.A0D(r1, r0)     // Catch:{ all -> 0x017a }
            r15 = 1
            r0 = 1
            android.database.sqlite.SQLiteStatement r13 = r14.A00     // Catch:{ all -> 0x017a }
            r13.bindLong(r15, r0)     // Catch:{ all -> 0x017a }
            r0 = 2
            r13.bindLong(r0, r3)     // Catch:{ all -> 0x017a }
            r1 = 3
            r0 = r17
            r13.bindString(r1, r0)     // Catch:{ all -> 0x017a }
            int r0 = r14.A00()     // Catch:{ all -> 0x017a }
            r7.A00()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x00de
            r16 = 1
        L_0x00de:
            r7.close()     // Catch:{ all -> 0x0181 }
            r6.close()     // Catch:{ all -> 0x0188 }
            monitor-exit(r5)     // Catch:{ all -> 0x018d }
            if (r16 != 0) goto L_0x018b
            goto L_0x00e9
        L_0x00e8:
            monitor-exit(r5)     // Catch:{ all -> 0x018d }
        L_0x00e9:
            X.1BI r6 = r12.A00     // Catch:{ all -> 0x018d }
            if (r6 == 0) goto L_0x0108
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x018d }
            if (r5 == 0) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018d }
            r0 = 64
            r1.append(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r0 = r6.getServer()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = X.AnonymousClass1YF.A0K(r0, r5)     // Catch:{ all -> 0x018d }
        L_0x0108:
            X.1EC r6 = (X.AnonymousClass1EC) r6     // Catch:{ all -> 0x018d }
            if (r6 == 0) goto L_0x0123
            X.1MW r0 = r2.A00     // Catch:{ all -> 0x018d }
            int r0 = r0.A09(r6)     // Catch:{ all -> 0x018d }
        L_0x0112:
            int r12 = X.C64002u3.A03(r0)     // Catch:{ all -> 0x018d }
            long r0 = r8.A0I     // Catch:{ all -> 0x018d }
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r0 % r5
            long r0 = r0 - r5
            long r6 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x018d }
            goto L_0x0125
        L_0x0123:
            r0 = 0
            goto L_0x0112
        L_0x0125:
            if (r11 == 0) goto L_0x018b
            java.lang.Object r5 = r18.get()     // Catch:{ all -> 0x018d }
            X.2aI r5 = (X.C52052aI) r5     // Catch:{ all -> 0x018d }
            java.lang.String r14 = X.C61352pX.A00(r8)     // Catch:{ all -> 0x018d }
            monitor-enter(r5)     // Catch:{ all -> 0x018d }
            r0 = 0
            r1 = 1
            if (r9 == r0) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            java.lang.String r13 = "comments"
            goto L_0x013c
        L_0x013a:
            java.lang.String r13 = "comment_deletes"
        L_0x013c:
            X.1WI r0 = r5.A00     // Catch:{ all -> 0x0188 }
            X.1au r9 = r0.A06()     // Catch:{ all -> 0x0188 }
            r0 = 7
            android.content.ContentValues r8 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "comment_space_id"
            r8.put(r0, r14)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "comment_parent_group_id"
            r8.put(r0, r11)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "group_size_bucket"
            X.C17880vN.A18(r8, r0, r12)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "cag_message_sent_ds"
            X.C17880vN.A19(r8, r0, r6)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "accumulated_comments"
            X.C17880vN.A19(r8, r0, r3)     // Catch:{ all -> 0x0173 }
            X.C17880vN.A18(r8, r13, r1)     // Catch:{ all -> 0x0173 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0173 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "update_comment_action"
            r1.A05(r10, r0, r8)     // Catch:{ all -> 0x0173 }
            r9.close()     // Catch:{ all -> 0x0188 }
            monitor-exit(r5)     // Catch:{ all -> 0x018d }
            goto L_0x018b
        L_0x0173:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r1 = move-exception
            X.CDX.A00(r9, r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x017a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r1 = move-exception
            X.CDX.A00(r6, r0)     // Catch:{ all -> 0x0188 }
        L_0x0187:
            throw r1     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x018d }
            throw r0     // Catch:{ all -> 0x018d }
        L_0x018b:
            monitor-exit(r2)
            return
        L_0x018d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677430r.ByH(X.206, int):void");
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public void Bya(Collection collection, Map map) {
        C692336k A002;
        Long A022;
        AnonymousClass206 A023;
        C18070vi.A0d(collection, 0);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (!(!AnonymousClass206.A08(A0Y) || (A002 = C60472o5.A00(A0Y)) == null || (A022 = A002.A02()) == null || (A023 = AnonymousClass1W2.A02(this.A02, A022.longValue())) == null)) {
                A13.add(A023);
            }
        }
        C17880vN.A0d(this.A03).A00(new AnonymousClass7RL(this, C29431cG.A0t(C29431cG.A11(A13)), 42));
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public C677430r(C24681Lg r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
