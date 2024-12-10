package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass121;
import X.AnonymousClass122;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Cd;
import X.AnonymousClass1Eu;
import X.AnonymousClass1Ez;
import X.AnonymousClass1LW;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1W6;
import X.AnonymousClass21V;
import X.AnonymousClass7FP;
import X.C000100c;
import X.C131926lt;
import X.C1406372h;
import X.C1409673t;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C194159rG;
import X.C217217d;
import X.C23141Ev;
import X.C25331Nu;
import X.C25991Qk;
import X.C27301Vn;
import X.C28781at;
import X.C28791au;
import X.C28801av;
import X.C29691ci;
import X.C41851xA;
import X.C51012Wq;
import X.C53292cI;
import X.C55592g3;
import X.C56192h3;
import X.C676930m;
import X.EEC;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConversationDeleteWorker extends Worker {
    public static final ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static final AtomicInteger A0C = new AtomicInteger();
    public static final AtomicInteger A0D = new AtomicInteger();
    public static final AtomicInteger A0E = new AtomicInteger();
    public static final AtomicLong A0F = new AtomicLong();
    public final Context A00;
    public final AnonymousClass190 A01;
    public final C25991Qk A02;
    public final C27301Vn A03;
    public final C18000vb A04;
    public final AnonymousClass1LW A05;
    public final AnonymousClass1CJ A06;
    public final AnonymousClass1NN A07;
    public final AnonymousClass121 A08;
    public final AnonymousClass1MZ A09;
    public final C1406372h A0A;

    public static void A00(ConversationDeleteWorker conversationDeleteWorker) {
        AtomicInteger atomicInteger = A0C;
        if (atomicInteger.get() <= 0) {
            A0E.set(0);
            A0D.set(0);
            A0F.set(0);
            atomicInteger.set(0);
            A0B.clear();
            conversationDeleteWorker.A03.BEJ(13, "ConversationDeleteWorker");
        }
    }

    private boolean A01(C56192h3 r36) {
        Cursor A0A2;
        C28791au A052;
        C41851xA BD0;
        C28791au A053;
        Cursor A0A3;
        C56192h3 r8 = r36;
        AnonymousClass1BI r7 = r8.A07;
        try {
            C676930m r10 = new C676930m(this, r8);
            C29691ci r5 = (C29691ci) AnonymousClass1CJ.A01(this.A06).get(r7);
            if (r5 == null || r5.A0F <= 1 || TextUtils.isEmpty(r5.A0j)) {
                return this.A08.BID(r8, r10, false);
            }
            C1406372h r11 = this.A0A;
            String rawString = r7.getRawString();
            AnonymousClass00H r2 = r11.A01.A00;
            if (rawString.equals(C17880vN.A0r(C17880vN.A0B(r2), "storage_usage_deletion_jid"))) {
                int i = C17880vN.A0B(r2).getInt("storage_usage_deletion_all_msg_cnt", 0);
                int i2 = C17880vN.A0B(r2).getInt("storage_usage_deletion_current_msg_cnt", 0);
                C55592g3 r22 = r11.A04;
                C131926lt r1 = new C131926lt(r10, r11);
                r1.A00(r7, i2, i);
                AnonymousClass121 r0 = r22.A01;
                r0.CQa(r7);
                return r0.BID(r8, new AnonymousClass7FP(r8, r1, r22, i2, i), false);
            }
            C55592g3 r9 = r11.A04;
            C131926lt r52 = new C131926lt(r10, r11);
            AnonymousClass1Ez r14 = new AnonymousClass1Ez("storageUsageMsgStore/deleteMessagesForJid");
            r9.A03.A0A(r7);
            AnonymousClass121 r4 = r9.A01;
            AnonymousClass122 r3 = (AnonymousClass122) r4;
            String[] A1Y = C17880vN.A1Y();
            C17890vO.A1J(A1Y, r3.A0C.A09(r7));
            AnonymousClass1Ez r23 = new AnonymousClass1Ez("CoreMessageStore/getMessageCountForJid");
            try {
                C28781at A042 = r3.A0V.get();
                try {
                    A0A3 = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8')", "GET_CHAT_MESSAGES_COUNT_EXCLUDE_DELETED_SQL", A1Y);
                    if (A0A3.moveToFirst()) {
                        long A062 = C17890vO.A06(A0A3, "count");
                        A0A3.close();
                        A042.close();
                        r23.A02();
                        if (A062 != 0) {
                            long j = r8.A06;
                            long j2 = r8.A01;
                            int i3 = r8.A00;
                            long j3 = r8.A04;
                            long j4 = r8.A05;
                            boolean z = r8.A0C;
                            boolean z2 = r8.A0B;
                            AnonymousClass1BI r16 = r7;
                            r8 = new C56192h3(r16, r8.A08, r8.A09, i3, j, j2, j3, j4, r8.A02, r8.A03, z, z2, r8.A0A);
                            C25991Qk r02 = r9.A02;
                            AnonymousClass1BI r32 = r8.A07;
                            int A022 = r02.A02(r32);
                            r52.A00(r32, 0, A022);
                            r4.CQa(r32);
                            boolean BID = r4.BID(r8, new AnonymousClass7FP(r8, r52, r9, 0, A022), false);
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("storageUsageMsgStore/deleteMessagesForJid ");
                            A10.append(r32);
                            A10.append(" success:true time spent:");
                            C17890vO.A16(A10, r14.A02());
                            return BID;
                        }
                    } else {
                        A0A3.close();
                        A042.close();
                        r23.A02();
                    }
                    r3.A0Y(r7, (Long) null);
                    C25991Qk r022 = r9.A02;
                    AnonymousClass1BI r322 = r8.A07;
                    int A0222 = r022.A02(r322);
                    r52.A00(r322, 0, A0222);
                    r4.CQa(r322);
                    boolean BID2 = r4.BID(r8, new AnonymousClass7FP(r8, r52, r9, 0, A0222), false);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("storageUsageMsgStore/deleteMessagesForJid ");
                    A102.append(r322);
                    A102.append(" success:true time spent:");
                    C17890vO.A16(A102, r14.A02());
                    return BID2;
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (Throwable th2) {
                r23.A02();
                throw th2;
            }
            throw th;
            throw th;
            throw th;
        } catch (IllegalStateException e) {
            Log.e("Error while deleting messages in batches, switching to old way of deleting...", e);
            int A023 = this.A02.A02(r7);
            AnonymousClass122 r24 = (AnonymousClass122) this.A08;
            C17960vV.A01();
            AnonymousClass1Ez r82 = new AnonymousClass1Ez("msgstore/deletemsgs/fallback");
            AnonymousClass1Ez r112 = new AnonymousClass1Ez("msgstore/deletemedia");
            HashSet A12 = C17880vN.A12();
            try {
                AnonymousClass1Cd r102 = r24.A0V;
                C28781at A043 = r102.get();
                try {
                    C23141Ev r12 = ((C28801av) A043).A02;
                    String str = C51012Wq.A03;
                    AnonymousClass1LW r142 = r24.A0C;
                    A0A2 = r12.A0A(str, "GET_MEDIA_FILE_MESSAGES_FOR_DELETE_SQL", new String[]{String.valueOf(r142.A09(r7))});
                    int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("remove_files");
                    while (A0A2.moveToNext()) {
                        AnonymousClass1W6 A0c = C17880vN.A0c(r24.A1E);
                        C18070vi.A0d(r7, 1);
                        AnonymousClass21V r53 = (AnonymousClass21V) A0c.A01.A04(A0A2, r7, true, true);
                        C17960vV.A07(r53);
                        boolean A054 = AnonymousClass1Eu.A05(A0A2, columnIndexOrThrow);
                        String str2 = r53.A05;
                        if (str2 != null) {
                            A12.add(str2);
                        }
                        r24.A0Q.A06(r53, A054, false);
                    }
                    A0A2.close();
                    A043.close();
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("CoreMessageStore/deletemedia ");
                    A103.append(r7);
                    A103.append(" timeSpent:");
                    C17890vO.A16(A103, r112.A02());
                    A052 = r102.A05();
                    BD0 = A052.BD0();
                    r24.A0R.A0A(r7);
                    C23141Ev r122 = ((C28801av) A052).A02;
                    String[] strArr = new String[1];
                    AnonymousClass1LW.A03(r142, r7, strArr, 0);
                    C17900vP.A0j("CoreMessageStore/deletemsgs/count:", AnonymousClass000.A10(), r122.A04("message", "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id= ?)", "deleteAllMessagesForJidInBackground/DELETE_MESSAGE", strArr));
                    C25331Nu r103 = r24.A0k;
                    try {
                        A053 = r103.A02.A05();
                        C23141Ev r143 = ((C28801av) A053).A02;
                        String[] strArr2 = new String[1];
                        AnonymousClass1LW.A03(r103.A00, r7, strArr2, 0);
                        int A044 = r143.A04("message_thumbnail", "message_row_id IN (SELECT _id FROM message WHERE chat_row_id = ?)", "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS", strArr2);
                        StringBuilder A104 = AnonymousClass000.A10();
                        A104.append("msgstore/deleteAllMessageThumbnailsFor-jid/");
                        A104.append(r7);
                        C17900vP.A0j("/", A104, A044);
                        A053.close();
                    } catch (SQLiteDatabaseCorruptException e2) {
                        Log.e("msgstore/deleteAllMessageThumbnailsFor-jid", e2);
                    } catch (Throwable th3) {
                        AnonymousClass0DT.A00(th, th3);
                    }
                    r103.A04(A12);
                    r24.A0L.A04(r7);
                    r24.A0G.A09();
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    StringBuilder A105 = AnonymousClass000.A10();
                    A105.append("CoreMessageStore/deletemsgs/fallback ");
                    A105.append(r7);
                    A105.append(" timeSpent:");
                    C17890vO.A16(A105, r82.A02());
                    A0C(r7, A023);
                    return true;
                } catch (Throwable th4) {
                    A053.close();
                    throw th4;
                }
            } catch (SQLiteDiskIOException e3) {
                r24.A0T.A00(1);
                throw e3;
            } catch (Throwable th5) {
                AnonymousClass0DT.A00(th, th5);
            }
        } catch (Throwable th6) {
            Log.e("conversation-delete-worker/delete/exception", th6);
            throw th6;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A07() {
        Context context = this.A00;
        String string = context.getString(2131889341);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        A032.A03 = -1;
        C17880vN.A1G(A032);
        A032.A0L = "progress";
        A032.A06 = -1;
        A032.A07(100, 0, true);
        C17890vO.A0m(A032, string, "", false);
        Notification A052 = A032.A05();
        ? obj = new Object();
        obj.A03(new C194159rG(13, A052, AnonymousClass112.A06() ? 1 : 0));
        return obj;
    }

    public void A09() {
        A0C.addAndGet(-1);
        A00(this);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.9Lg, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        X.C17900vP.A0e("conversation-delete-worker/handle-intent invalid action=", r6, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        X.AnonymousClass35V.A00(r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        if (r4.A00 <= 5) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014d, code lost:
        r13.A01.A0G("ConversationDeleteWorker/Deletion failed", (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015a, code lost:
        return new X.C162168Jj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0160, code lost:
        return new java.lang.Object();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r13 = this;
            androidx.work.WorkerParameters r4 = r13.A01
            X.A6Y r7 = r4.A01
            java.lang.String r1 = "job_id"
            java.util.Map r0 = r7.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x001d
            long r8 = X.C17880vN.A05(r1)
        L_0x0014:
            X.1Qk r2 = r13.A02
            X.1Cd r0 = r2.A02
            X.1at r6 = r0.get()
            goto L_0x0020
        L_0x001d:
            r8 = -1
            goto L_0x0014
        L_0x0020:
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0179 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0179 }
            java.lang.String r3 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE _id= ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r8)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_BY_ID_SQL"
            android.database.Cursor r3 = r5.A0A(r3, r0, r1)     // Catch:{ all -> 0x0179 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0161
            X.2h3 r1 = X.C25991Qk.A00(r3, r2)     // Catch:{ all -> 0x016d }
            r3.close()     // Catch:{ all -> 0x0179 }
            r6.close()
            if (r1 == 0) goto L_0x0167
            X.1BI r5 = r1.A07
            java.lang.String r0 = "delete_action"
            java.lang.String r6 = r7.A03(r0)
            int r0 = r6.hashCode()
            r3 = 0
            switch(r0) {
                case 893674186: goto L_0x005e;
                case 1096596436: goto L_0x0071;
                case 1835767556: goto L_0x0108;
                default: goto L_0x0053;
            }
        L_0x0053:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation-delete-worker/handle-intent invalid action="
            X.C17900vP.A0e(r0, r6, r1)
            goto L_0x0167
        L_0x005e:
            java.lang.String r0 = "action_singular_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r13.A01(r1)
            if (r0 == 0) goto L_0x0148
            r2.A05(r1)
            goto L_0x0167
        L_0x0071:
            java.lang.String r0 = "action_delete"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r13.A01(r1)
            if (r0 == 0) goto L_0x0148
            X.1CJ r0 = r13.A06
            boolean r0 = r0.A0T(r5)
            if (r0 == 0) goto L_0x0167
            r2.A05(r1)
            boolean r0 = r5 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x00fb
            X.1MZ r7 = r13.A09
            r4 = r5
            X.1E9 r4 = (X.AnonymousClass1E9) r4
            X.1Cd r0 = r7.A07
            X.1au r12 = r0.A05()
            X.1xA r11 = r12.BD0()     // Catch:{ all -> 0x0143 }
            X.1MW r10 = r7.A08     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "ParticipantUserStore/updateGroupParticipants/deleteParticipants "
            X.C17900vP.A0Y(r4, r0, r1)     // Catch:{ all -> 0x0139 }
            X.1Cd r0 = r10.A06     // Catch:{ all -> 0x0139 }
            X.1au r6 = r0.A05()     // Catch:{ all -> 0x0139 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012f }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "group_participant_user"
            java.lang.String r3 = "group_jid_row_id = ?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x012f }
            X.1DL r0 = r10.A05     // Catch:{ all -> 0x012f }
            long r0 = r0.A09(r4)     // Catch:{ all -> 0x012f }
            X.C17890vO.A1J(r2, r0)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "deleteParticipants/DELETE_GROUP_PARTICIPANT_USER"
            r9.A04(r8, r3, r0, r2)     // Catch:{ all -> 0x012f }
            X.1MU r2 = r10.A08     // Catch:{ all -> 0x012f }
            X.0ve r1 = r2.A01     // Catch:{ all -> 0x012f }
            r0 = 8088(0x1f98, float:1.1334E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ all -> 0x012f }
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x00e0
            r0 = 1
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x012f }
            X.1cj r0 = X.C29701cj.NOT_PARTICIPANT     // Catch:{ all -> 0x012f }
            X.AnonymousClass1MU.A00(r2, r0, r6, r4)     // Catch:{ all -> 0x012f }
        L_0x00e0:
            r6.close()     // Catch:{ all -> 0x0139 }
            X.1MX r2 = r7.A0A     // Catch:{ all -> 0x0139 }
            X.0ve r1 = r2.A02     // Catch:{ all -> 0x0139 }
            r0 = 1613(0x64d, float:2.26E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00f2
            r2.A02(r4)     // Catch:{ all -> 0x0139 }
        L_0x00f2:
            r11.A00()     // Catch:{ all -> 0x0139 }
            r11.close()     // Catch:{ all -> 0x0143 }
            r12.close()
        L_0x00fb:
            X.1LW r0 = r13.A05
            r0.A0K(r5)
            X.1NN r1 = r13.A07
            X.C17960vV.A07(r5)
            r0 = 29
            goto L_0x012b
        L_0x0108:
            java.lang.String r0 = "action_clear"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r13.A01(r1)
            if (r0 == 0) goto L_0x0148
            r2.A05(r1)
            X.121 r0 = r13.A08
            r0.CIH(r5, r3)
            r0.CKc(r5, r3)
            r0.CI5(r5, r3)
            X.1NN r1 = r13.A07
            X.C17960vV.A07(r5)
            r0 = 27
        L_0x012b:
            X.AnonymousClass35V.A00(r1, r5, r0)
            goto L_0x0167
        L_0x012f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0134 }
            goto L_0x0138
        L_0x0134:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0139 }
        L_0x0138:
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x013e }
            goto L_0x0142
        L_0x013e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0143 }
        L_0x0142:
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x017e }
            throw r1
        L_0x0148:
            int r1 = r4.A00
            r0 = 5
            if (r1 <= r0) goto L_0x015b
            X.190 r2 = r13.A01
            r1 = 0
            java.lang.String r0 = "ConversationDeleteWorker/Deletion failed"
            r2.A0G(r0, r1, r3)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        L_0x015b:
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            return r0
        L_0x0161:
            r3.close()     // Catch:{ all -> 0x0179 }
            r6.close()
        L_0x0167:
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x016d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0178
            r3.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0179 }
        L_0x0178:
            throw r1     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x017e }
            throw r1
        L_0x017e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.ConversationDeleteWorker.A0B():X.9Lg");
    }

    public void A0C(AnonymousClass1BI r12, int i) {
        int max;
        C53292cI r3 = (C53292cI) A0B.get(r12);
        synchronized (r3) {
            int i2 = r3.A00;
            max = Math.max(0, i - i2);
            r3.A00 = i2 + max;
            r3.A01 -= max;
        }
        AtomicInteger atomicInteger = A0E;
        atomicInteger.addAndGet(max);
        AtomicInteger atomicInteger2 = A0D;
        if (atomicInteger2.get() == 0 || atomicInteger.get() > atomicInteger2.get()) {
            Log.w("conversation-delete-worker/delete-progress/totalMessagesAllJids not updated.");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = A0F;
        if (uptimeMillis - atomicLong.get() >= 250) {
            atomicLong.set(uptimeMillis);
            int i3 = (atomicInteger.get() * 100) / atomicInteger2.get();
            Context context = this.A00;
            String string = context.getString(2131889341);
            Object[] objArr = new Object[3];
            AnonymousClass000.A1L(objArr, atomicInteger.get());
            AnonymousClass000.A1M(objArr, atomicInteger2.get());
            String A0q = C17880vN.A0q(context, this.A04.A0M().format(((double) i3) / 100.0d), objArr, 2, 2131889342);
            C1409673t A032 = C217217d.A03(context);
            A032.A0M = "other_notifications@1";
            A032.A03 = -1;
            C17880vN.A1G(A032);
            A032.A0L = "progress";
            A032.A06 = -1;
            A032.A07(100, i3, false);
            C17890vO.A0m(A032, string, A0q, false);
            this.A03.BkR(13, A032.A05());
        }
    }

    public ConversationDeleteWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A00 = context;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A05 = (AnonymousClass1LW) r1.A2G.get();
        this.A01 = A0H.BG6();
        this.A06 = (AnonymousClass1CJ) r1.A2H.get();
        this.A04 = A0H.CS9();
        this.A08 = (AnonymousClass121) r1.A2y.get();
        this.A02 = (C25991Qk) r1.A3I.get();
        this.A0A = (C1406372h) r1.Ao8.A00.A4t.get();
        this.A07 = (AnonymousClass1NN) r1.A2q.get();
        this.A03 = (C27301Vn) r1.A9A.get();
        this.A09 = (AnonymousClass1MZ) r1.A4t.get();
    }
}
