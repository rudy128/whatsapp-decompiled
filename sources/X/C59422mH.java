package X;

import android.content.ContentValues;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.2mH  reason: invalid class name and case insensitive filesystem */
public final class C59422mH {
    public final AnonymousClass1Q6 A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1LW A02;

    public final void A00(C28791au r7, GroupJid groupJid, boolean z) {
        C18070vi.A0d(groupJid, 1);
        if (!z) {
            String[] strArr = new String[1];
            AnonymousClass1LW.A03(this.A02, groupJid, strArr, 0);
            ContentValues A08 = C17880vN.A08();
            C17880vN.A18(A08, "invalid_state", 1);
            ((C28801av) r7).A02.A02(A08, "message_poll", "message_row_id IN (SELECT _id FROM available_message_view WHERE (available_message_view.chat_row_id = ? AND available_message_view.message_type = 66))", "message_poll.INVALIDATE_POLL_MESSAGES", strArr);
            r7.BJ7(new C21433Ak0(this, groupJid, 20));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0126, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0129, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass22H r21) {
        /*
            r20 = this;
            r0 = 0
            r5 = r21
            X.C18070vi.A0d(r5, r0)
            r0 = r20
            X.1Cd r4 = r0.A01
            X.1au r2 = r4.A05()
            r0 = 6
            android.content.ContentValues r7 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = "message_row_id"
            long r0 = r5.A0x     // Catch:{ all -> 0x0123 }
            X.C17880vN.A19(r7, r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "selectable_options_count"
            int r0 = r5.A02     // Catch:{ all -> 0x0123 }
            X.C17880vN.A18(r7, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "invalid_state"
            int r0 = r5.A00     // Catch:{ all -> 0x0123 }
            X.C17880vN.A18(r7, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "poll_logging_id"
            long r0 = r5.A04     // Catch:{ all -> 0x0123 }
            X.C17880vN.A19(r7, r6, r0)     // Catch:{ all -> 0x0123 }
            int r10 = r5.A01     // Catch:{ all -> 0x0123 }
            r8 = 0
            if (r10 == 0) goto L_0x0048
            long r0 = r5.A03     // Catch:{ all -> 0x0123 }
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0048
            java.lang.String r0 = "poll_type"
            X.C17880vN.A18(r7, r0, r10)     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "correct_option_id"
            long r0 = r5.A03     // Catch:{ all -> 0x0123 }
            X.C17880vN.A19(r7, r6, r0)     // Catch:{ all -> 0x0123 }
        L_0x0048:
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0123 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0123 }
            java.lang.String r15 = "message_poll"
            java.lang.String r1 = "insertOrUpdateMessagePoll/INSERT_MESSAGE_POLL"
            r0 = 5
            long r6 = r6.A09(r15, r1, r7, r0)     // Catch:{ all -> 0x0123 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "PollMessageStore/insertOrUpdateMessagePoll/insert error, rowId="
            X.AnonymousClass206.A06(r5, r0, r1)     // Catch:{ all -> 0x0123 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0123 }
        L_0x0066:
            r2.close()
            X.1au r2 = r4.A05()
            java.util.List r0 = r5.A07     // Catch:{ all -> 0x0123 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0123 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0123 }
        L_0x0076:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x0123 }
            X.A18 r9 = (X.A18) r9     // Catch:{ all -> 0x0123 }
            r0 = 5
            android.content.ContentValues r8 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0123 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0123 }
            X.C17880vN.A19(r8, r3, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "option_sha256"
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x0123 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "option_name"
            java.lang.String r0 = r9.A04     // Catch:{ all -> 0x0123 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "vote_total"
            int r0 = r9.A00     // Catch:{ all -> 0x0123 }
            X.C17880vN.A18(r8, r1, r0)     // Catch:{ all -> 0x0123 }
            long r0 = r9.A01     // Catch:{ all -> 0x0123 }
            r10 = -1
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = "_id"
            X.C17880vN.A19(r8, r6, r0)     // Catch:{ all -> 0x0123 }
        L_0x00af:
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0123 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "message_poll_option"
            java.lang.String r0 = "PollMessageStore/insertOrUpdatePollOptionTable"
            r7 = 5
            long r0 = r6.A09(r1, r0, r8, r7)     // Catch:{ all -> 0x0123 }
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0112
            r9.A01 = r0     // Catch:{ all -> 0x0123 }
            int r8 = r5.A01     // Catch:{ all -> 0x0123 }
            r6 = 1
            if (r8 != r6) goto L_0x0076
            boolean r6 = r9.A03     // Catch:{ all -> 0x0123 }
            if (r6 == 0) goto L_0x0076
            r5.A03 = r0     // Catch:{ all -> 0x0123 }
            X.1au r6 = r4.A05()     // Catch:{ all -> 0x0123 }
            android.content.ContentValues r14 = X.C17890vO.A08()     // Catch:{ all -> 0x0110 }
            java.lang.String r8 = "correct_option_id"
            long r0 = r5.A03     // Catch:{ all -> 0x0110 }
            X.C17880vN.A19(r14, r8, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "poll_type"
            int r0 = r5.A01     // Catch:{ all -> 0x0110 }
            X.C17880vN.A18(r14, r1, r0)     // Catch:{ all -> 0x0110 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0110 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0110 }
            java.lang.String r16 = "message_row_id = ?"
            java.lang.String[] r18 = X.AnonymousClass206.A09(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r17 = "updateCorrectPollOptionId/UPDATE_MESSAGE_POLL"
            r19 = r7
            int r0 = r13.A03(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0110 }
            long r0 = (long) r0     // Catch:{ all -> 0x0110 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "PollMessageStore/updateCorrectPollOptionId/update error, rowId="
            X.AnonymousClass206.A06(r5, r0, r1)     // Catch:{ all -> 0x0110 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0110 }
        L_0x010b:
            r6.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0076
        L_0x0110:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011a }
        L_0x0112:
            java.lang.String r0 = "PollMessageStore/insertOrUpdatePollOptionTable the row was not updated"
            android.database.SQLException r1 = new android.database.SQLException     // Catch:{ all -> 0x0123 }
            r1.<init>(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x011e
        L_0x011a:
            r1 = move-exception
            X.CDX.A00(r6, r0)     // Catch:{ all -> 0x0123 }
        L_0x011e:
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x011f:
            r2.close()
            return
        L_0x0123:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59422mH.A01(X.22H):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass22H r15) {
        /*
            r14 = this;
            r4 = 0
            X.1Cd r0 = r14.A01
            X.1au r2 = r0.A05()
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x005f }
            java.util.List r0 = r15.A07     // Catch:{ all -> 0x0058 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0014:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x0058 }
            X.A18 r6 = (X.A18) r6     // Catch:{ all -> 0x0058 }
            r5 = 1
            android.content.ContentValues r9 = X.C17880vN.A09(r5)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "vote_total"
            int r0 = r6.A00     // Catch:{ all -> 0x0058 }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x0058 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0058 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = "message_poll_option"
            java.lang.String r11 = "_id = ?"
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x0058 }
            long r0 = r6.A01     // Catch:{ all -> 0x0058 }
            X.C17880vN.A1V(r13, r4, r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r12 = "PollMessageStore/MESSAGE_POLL_OPTION_UPDATE_VOTE_TOTAL"
            int r0 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0058 }
            if (r0 == r5) goto L_0x0014
            java.lang.String r1 = "updatePollOptionVoteTotals/updatePollOptionVoteTotals the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0058 }
            r0.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x004e:
            r3.A00()     // Catch:{ all -> 0x0058 }
            r3.close()     // Catch:{ all -> 0x005f }
            r2.close()
            return
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59422mH.A02(X.22H):void");
    }

    public C59422mH(AnonymousClass1LW r1, AnonymousClass1Q6 r2, AnonymousClass1Cd r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
