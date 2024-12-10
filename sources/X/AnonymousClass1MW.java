package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1MW  reason: invalid class name */
public class AnonymousClass1MW {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1LY A03;
    public final AnonymousClass1MS A04;
    public final AnonymousClass1DL A05;
    public final AnonymousClass1Cd A06;
    public final AnonymousClass1MV A07;
    public final AnonymousClass1MU A08;
    public final C24751Ln A09;
    public final AnonymousClass1MR A0A;
    public final C18030ve A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass11P A0F;
    public final AnonymousClass1CJ A0G;
    public final C52032aG A0H = new C52032aG(this);
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;

    public static void A06(C63872tp r6, AnonymousClass1MW r7, UserJid userJid, boolean z) {
        UserJid userJid2 = userJid;
        C63312sr A0D2 = r6.A0D(userJid, false);
        AnonymousClass1E9 r3 = r6.A06;
        if (A0D2 != null) {
            r7.A07.A02(A0D2.A00(), r3, userJid2, A00(r7, userJid));
        }
        if (z) {
            r7.A07.A03(r3);
        }
    }

    public AnonymousClass1EC A0D(UserJid userJid, UserJid userJid2) {
        Cursor A0A2;
        String[] strArr = {String.valueOf(A00(this, userJid)), String.valueOf(A00(this, userJid2))};
        C28781at A042 = this.A06.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass2TP.A00(1), "ParticipantUserStore.getCommonGroup", strArr);
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("group_jid_row_id");
            while (A0A2.moveToNext()) {
                AnonymousClass1E9 r1 = (AnonymousClass1E9) this.A05.A0E(AnonymousClass1E9.class, A0A2.getLong(columnIndexOrThrow));
                if (r1 instanceof AnonymousClass1EC) {
                    AnonymousClass1EC r12 = (AnonymousClass1EC) r1;
                    if (A0M(this.A02.A0E(r12), r12)) {
                        A0A2.close();
                        A042.close();
                        return r12;
                    }
                }
            }
            A0A2.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0M(AnonymousClass1E7 r6, AnonymousClass1E9 r7) {
        GroupJid groupJid;
        if (r6 == null || !C22971Dz.A0W(r7) || r6.A0K() == null || (groupJid = (GroupJid) r6.A06(GroupJid.class)) == null) {
            return false;
        }
        AnonymousClass1CJ r2 = this.A0G;
        if (r2.A06(groupJid) != 1) {
            return !r2.A0S(groupJid) || ((C31191fA) this.A0J.get()).A03;
        }
        return false;
    }

    public boolean A0Q(UserJid userJid, String str) {
        Cursor A0A2;
        if (userJid == null) {
            return false;
        }
        String valueOf = String.valueOf(A00(this, userJid));
        C28781at A042 = this.A06.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", "CHECK_USER_IS_IN_GROUP_SQL", new String[]{str, valueOf});
            boolean moveToNext = A0A2.moveToNext();
            A0A2.close();
            A042.close();
            return moveToNext;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static C199410f A01(C199410f r4, UserJid userJid) {
        HashSet hashSet = new HashSet();
        try {
            AnonymousClass1IZ it = r4.iterator();
            while (it.hasNext()) {
                hashSet.add(DeviceJid.Companion.A03(userJid, ((Jid) it.next()).getDevice()));
            }
        } catch (AnonymousClass11T e) {
            Log.e((Throwable) e);
        }
        return C199410f.copyOf((Collection) hashSet);
    }

    public static UserJid A03(AnonymousClass1MW r1, UserJid userJid) {
        if (userJid.equals(AnonymousClass1E5.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipantUserStore/sanitizeParticipantJid/my jid = ");
            AnonymousClass11S r12 = r1.A01;
            r12.A0I();
            sb.append(r12.A0E);
            Log.i(sb.toString());
            r12.A0I();
            PhoneUserJid phoneUserJid = r12.A0E;
            C17960vV.A07(phoneUserJid);
            return phoneUserJid;
        } else if (!userJid.equals(C173468v7.A00)) {
            return userJid;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ParticipantUserStore/sanitizeParticipantJid/my lid jid = ");
            AnonymousClass11S r13 = r1.A01;
            sb2.append(r13.A09());
            Log.i(sb2.toString());
            return r13.A0A();
        }
    }

    public static void A05(C63872tp r2, AnonymousClass1MW r3) {
        C199410f A082;
        if (((C59742mo) r3.A0D.get()).A02.A0R(r2.A06)) {
            A082 = r2.A0A();
        } else {
            A082 = r2.A08();
        }
        AnonymousClass1IZ it = A082.iterator();
        while (it.hasNext()) {
            AnonymousClass1IZ it2 = ((C63312sr) it.next()).A00().iterator();
            while (it2.hasNext()) {
                ((C59232ly) it2.next()).A01 = false;
            }
        }
    }

    public static boolean A08(AnonymousClass1MW r9, AnonymousClass1E9 r10, long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/removeGroupParticipant ");
        sb.append(r10);
        sb.append(" ");
        sb.append(j);
        Log.i(sb.toString());
        String valueOf = String.valueOf(r9.A05.A09(r10));
        C28791au A052 = r9.A06.A05();
        try {
            AnonymousClass1MU r3 = r9.A08;
            if (C18020vd.A05(C18040vf.A02, r3.A01, 8088) && z) {
                C18070vi.A0d(r10, 1);
                AnonymousClass1MU.A00(r3, C29701cj.NOT_PARTICIPANT, A052, r10);
            }
            boolean z2 = false;
            if (((C28801av) A052).A02.A04("group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "removeGroupParticipant/DELETE_GROUP_PARTICIPANT_USER", new String[]{valueOf, String.valueOf(j)}) != 0) {
                z2 = true;
            }
            A052.close();
            return z2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public int A09(AnonymousClass1E9 r8) {
        Cursor A0A2;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/getGroupParticipantsCount ");
        sb.append(r8);
        Log.i(sb.toString());
        int A0A3 = A0A(r8);
        if (A0A3 != -1) {
            return A0A3;
        }
        String valueOf = String.valueOf(this.A05.A09(r8));
        C28781at A042 = this.A06.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(1) as count FROM group_participant_user WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANTS_COUNT_SQL", new String[]{valueOf});
            if (A0A2.moveToFirst()) {
                int i = A0A2.getInt(A0A2.getColumnIndexOrThrow("count"));
                A0A2.close();
                A042.close();
                return i;
            }
            A0A2.close();
            A042.close();
            return 0;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public int A0A(AnonymousClass1E9 r3) {
        C63872tp A0A2;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/getGroupParticipantsCountFromCacheIfAvailable ");
        sb.append(r3);
        Log.i(sb.toString());
        AnonymousClass1MS r1 = this.A04;
        C18070vi.A0d(r3, 0);
        if (!r1.A05.containsKey(r3) || (A0A2 = r1.A0A(r3)) == null) {
            return -1;
        }
        return A0A2.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057c, code lost:
        X.CDX.A00(r23, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0581, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x049b A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04e2 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04e3 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0506 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0541 A[Catch:{ all -> 0x0564 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C63872tp A0B(X.AnonymousClass1E9 r41) {
        /*
            r40 = this;
            r39 = r40
            r0 = r39
            X.1MS r4 = r0.A04
            X.2aG r3 = r0.A0H
            r0 = 0
            r8 = r41
            X.C18070vi.A0d(r8, r0)
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            java.util.Map r0 = r4.A05
            r38 = r0
            java.lang.Object r0 = r0.get(r8)
            X.2tp r0 = (X.C63872tp) r0
            if (r0 != 0) goto L_0x0585
            X.1Cd r0 = r4.A03
            X.1at r23 = r0.get()
            X.1MT r7 = r4.A01     // Catch:{ all -> 0x0579 }
            int r0 = r8.hashCode()     // Catch:{ all -> 0x0579 }
            double r0 = (double) r0     // Catch:{ all -> 0x0579 }
            double r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0579 }
            r5 = 4638707616191610880(0x4060000000000000, double:128.0)
            double r1 = r1 % r5
            int r0 = (int) r1     // Catch:{ all -> 0x0579 }
            java.util.concurrent.ConcurrentHashMap r2 = r7.A00     // Catch:{ all -> 0x0579 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0579 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0579 }
            if (r0 != 0) goto L_0x0047
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x0579 }
            r0.<init>()     // Catch:{ all -> 0x0579 }
            r2.putIfAbsent(r1, r0)     // Catch:{ all -> 0x0579 }
        L_0x0047:
            java.lang.Object r24 = r2.get(r1)     // Catch:{ all -> 0x0579 }
            if (r24 == 0) goto L_0x056f
            monitor-enter(r24)     // Catch:{ all -> 0x0579 }
            r0 = r38
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x056d }
            X.2tp r0 = (X.C63872tp) r0     // Catch:{ all -> 0x056d }
            if (r0 != 0) goto L_0x056b
            X.1Ln r0 = r4.A04     // Catch:{ all -> 0x056d }
            r37 = r0
            X.1MW r1 = r3.A00     // Catch:{ all -> 0x056d }
            X.00H r0 = r1.A0D     // Catch:{ all -> 0x056d }
            r36 = r0
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x056d }
            X.2mo r0 = (X.C59742mo) r0     // Catch:{ all -> 0x056d }
            int r2 = r0.A00(r8)     // Catch:{ all -> 0x056d }
            X.2tp r0 = new X.2tp     // Catch:{ all -> 0x056d }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x056d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0569 }
            r3.<init>()     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "ParticipantUserStore/migrated="
            r3.append(r2)     // Catch:{ all -> 0x0569 }
            r2 = 1
            r3.append(r2)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0569 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            X.1E9 r7 = r0.A06     // Catch:{ all -> 0x0569 }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0569 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0569 }
            r3.<init>()     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "ParticipantUserStore/getGroupParticipantsOptimized/"
            r3.append(r2)     // Catch:{ all -> 0x0569 }
            r3.append(r7)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0569 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0569 }
            r3.<init>()     // Catch:{ all -> 0x0569 }
            X.11S r4 = r1.A01     // Catch:{ all -> 0x0569 }
            r4.A0I()     // Catch:{ all -> 0x0569 }
            X.1E8 r2 = r4.A0D     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x010b
            java.lang.String r2 = "ParticipantUserStore/logged out"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
        L_0x00b3:
            java.lang.Object r6 = r36.get()     // Catch:{ all -> 0x0569 }
            X.2mo r6 = (X.C59742mo) r6     // Catch:{ all -> 0x0569 }
            X.1nh r2 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.GroupJid r5 = X.C36321nh.A00(r7)     // Catch:{ all -> 0x0569 }
            X.1CJ r2 = r6.A02     // Catch:{ all -> 0x0569 }
            boolean r15 = r2.A0R(r5)     // Catch:{ all -> 0x0569 }
            if (r15 == 0) goto L_0x0452
            java.lang.Object r2 = r36.get()     // Catch:{ all -> 0x0569 }
            X.2mo r2 = (X.C59742mo) r2     // Catch:{ all -> 0x0569 }
            r9 = 0
            X.C18070vi.A0d(r7, r9)     // Catch:{ all -> 0x0569 }
            X.1M9 r2 = r2.A01     // Catch:{ all -> 0x0569 }
            X.1E7 r2 = r2.A0G(r7)     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x00e3
            java.lang.String r5 = "lid"
            java.lang.String r2 = r2.A0O     // Catch:{ all -> 0x0569 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x0452
        L_0x00e3:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0569 }
            r10.<init>()     // Catch:{ all -> 0x0569 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0569 }
            r6.<init>()     // Catch:{ all -> 0x0569 }
            java.util.Set r2 = r3.keySet()     // Catch:{ all -> 0x0569 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x0569 }
        L_0x00f5:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0362
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0569 }
            boolean r2 = X.C22971Dz.A0Y(r5)     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x00f5
            r10.add(r5)     // Catch:{ all -> 0x0569 }
            goto L_0x00f5
        L_0x010b:
            X.1DL r5 = r1.A05     // Catch:{ all -> 0x0569 }
            long r9 = r5.A09(r7)     // Catch:{ all -> 0x0569 }
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0569 }
            X.1Cd r2 = r1.A06     // Catch:{ all -> 0x0569 }
            X.1at r22 = r2.get()     // Catch:{ all -> 0x0569 }
            r2 = r22
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x055f }
            X.1Ev r10 = r2.A02     // Catch:{ all -> 0x055f }
            java.lang.String r9 = "SELECT user_jid_row_id, pending, rank, add_timestamp, device_jid_row_id, sent_sender_key, sent_add_on_sender_key FROM group_participant_user JOIN group_participant_device ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x055f }
            r2 = 0
            r6[r2] = r11     // Catch:{ all -> 0x055f }
            java.lang.String r2 = "GET_GROUP_PARTICIPANT_USERS_SQL_OPTIMIZED"
            android.database.Cursor r2 = r10.A0A(r9, r2, r6)     // Catch:{ all -> 0x055f }
            java.lang.String r6 = "user_jid_row_id"
            int r21 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "device_jid_row_id"
            int r20 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "rank"
            int r19 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "pending"
            int r16 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "add_timestamp"
            int r12 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "sent_sender_key"
            int r15 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = "sent_add_on_sender_key"
            int r11 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0553 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0553 }
            r14.<init>()     // Catch:{ all -> 0x0553 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0553 }
            r10.<init>()     // Catch:{ all -> 0x0553 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0553 }
            r9.<init>()     // Catch:{ all -> 0x0553 }
        L_0x016b:
            boolean r6 = r2.moveToNext()     // Catch:{ all -> 0x0553 }
            if (r6 == 0) goto L_0x01d1
            r6 = r21
            long r27 = r2.getLong(r6)     // Catch:{ all -> 0x0553 }
            r6 = r20
            long r29 = r2.getLong(r6)     // Catch:{ all -> 0x0553 }
            r6 = r19
            int r26 = r2.getInt(r6)     // Catch:{ all -> 0x0553 }
            r6 = r16
            int r13 = r2.getInt(r6)     // Catch:{ all -> 0x0553 }
            r6 = 1
            r33 = 0
            if (r13 != r6) goto L_0x0190
            r33 = 1
        L_0x0190:
            boolean r6 = r2.isNull(r12)     // Catch:{ all -> 0x0553 }
            if (r6 == 0) goto L_0x0199
            r31 = 0
            goto L_0x019d
        L_0x0199:
            long r31 = r2.getLong(r12)     // Catch:{ all -> 0x0553 }
        L_0x019d:
            int r13 = r2.getInt(r15)     // Catch:{ all -> 0x0553 }
            r6 = 1
            r34 = 0
            if (r13 != r6) goto L_0x01a8
            r34 = 1
        L_0x01a8:
            boolean r13 = r2.isNull(r11)     // Catch:{ all -> 0x0553 }
            if (r13 != 0) goto L_0x01b6
            int r13 = r2.getInt(r11)     // Catch:{ all -> 0x0553 }
            r35 = 1
            if (r13 == r6) goto L_0x01b8
        L_0x01b6:
            r35 = 0
        L_0x01b8:
            java.lang.Long r6 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0553 }
            r10.add(r6)     // Catch:{ all -> 0x0553 }
            java.lang.Long r6 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x0553 }
            r9.add(r6)     // Catch:{ all -> 0x0553 }
            X.2gJ r6 = new X.2gJ     // Catch:{ all -> 0x0553 }
            r25 = r6
            r25.<init>(r26, r27, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x0553 }
            r14.add(r6)     // Catch:{ all -> 0x0553 }
            goto L_0x016b
        L_0x01d1:
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            java.util.HashMap r21 = r5.A0F(r6, r10)     // Catch:{ all -> 0x0553 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r6 = com.whatsapp.jid.DeviceJid.class
            java.util.HashMap r20 = r5.A0F(r6, r9)     // Catch:{ all -> 0x0553 }
            java.util.Iterator r19 = r14.iterator()     // Catch:{ all -> 0x0553 }
            r9 = 0
        L_0x01e2:
            boolean r5 = r19.hasNext()     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x030e
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x0553 }
            X.2gJ r10 = (X.C55752gJ) r10     // Catch:{ all -> 0x0553 }
            long r5 = r10.A03     // Catch:{ all -> 0x0553 }
            r33 = r5
            java.lang.Long r6 = java.lang.Long.valueOf(r33)     // Catch:{ all -> 0x0553 }
            r5 = r21
            java.lang.Object r13 = r5.get(r6)     // Catch:{ all -> 0x0553 }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x0553 }
            long r5 = r10.A02     // Catch:{ all -> 0x0553 }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0553 }
            r5 = r20
            java.lang.Object r12 = r5.get(r6)     // Catch:{ all -> 0x0553 }
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12     // Catch:{ all -> 0x0553 }
            if (r13 != 0) goto L_0x0214
            java.lang.String r5 = "ParticipantUserStore/getGroupParticipants invalid jid from db"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x0553 }
            goto L_0x01e2
        L_0x0214:
            com.whatsapp.jid.UserJid r11 = A03(r1, r13)     // Catch:{ all -> 0x0553 }
            boolean r5 = r4.A0O(r13)     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x0251
            if (r9 != 0) goto L_0x024f
            java.lang.String r5 = "ParticipantUserStore/getGroupParticipants/found orphaned me participant"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x0553 }
            X.190 r13 = r1.A00     // Catch:{ all -> 0x0553 }
            java.lang.String r9 = "participant-user-orphaned-me"
            java.lang.Class r5 = r7.getClass()     // Catch:{ all -> 0x0553 }
            java.lang.String r6 = r5.toString()     // Catch:{ all -> 0x0553 }
            r5 = 0
            r13.A0G(r9, r6, r5)     // Catch:{ all -> 0x0553 }
            java.util.HashSet r27 = new java.util.HashSet     // Catch:{ all -> 0x0553 }
            r27.<init>()     // Catch:{ all -> 0x0553 }
            int r14 = r10.A00     // Catch:{ all -> 0x0553 }
            boolean r13 = r10.A04     // Catch:{ all -> 0x0553 }
            long r5 = r10.A01     // Catch:{ all -> 0x0553 }
            X.2sr r9 = new X.2sr     // Catch:{ all -> 0x0553 }
            r25 = r9
            r26 = r11
            r28 = r14
            r29 = r5
            r31 = r13
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0553 }
        L_0x024f:
            r13 = r9
            goto L_0x0265
        L_0x0251:
            boolean r5 = r3.containsKey(r11)     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x0270
            java.lang.Object r13 = r3.get(r11)     // Catch:{ all -> 0x0553 }
            X.2sr r13 = (X.C63312sr) r13     // Catch:{ all -> 0x0553 }
        L_0x025d:
            X.C17960vV.A07(r13)     // Catch:{ all -> 0x0553 }
            com.whatsapp.jid.UserJid r5 = r13.A04     // Catch:{ all -> 0x0553 }
            r3.put(r5, r13)     // Catch:{ all -> 0x0553 }
        L_0x0265:
            X.1MV r14 = r1.A07     // Catch:{ all -> 0x0553 }
            boolean r5 = r10.A06     // Catch:{ all -> 0x0553 }
            r26 = r5
            boolean r5 = r10.A05     // Catch:{ all -> 0x0553 }
            r25 = r5
            goto L_0x028b
        L_0x0270:
            java.util.HashSet r27 = new java.util.HashSet     // Catch:{ all -> 0x0553 }
            r27.<init>()     // Catch:{ all -> 0x0553 }
            int r15 = r10.A00     // Catch:{ all -> 0x0553 }
            boolean r14 = r10.A04     // Catch:{ all -> 0x0553 }
            long r5 = r10.A01     // Catch:{ all -> 0x0553 }
            X.2sr r13 = new X.2sr     // Catch:{ all -> 0x0553 }
            r25 = r13
            r26 = r11
            r28 = r15
            r29 = r5
            r31 = r14
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0553 }
            goto L_0x025d
        L_0x028b:
            r15 = 0
            if (r12 == 0) goto L_0x01e2
            X.11S r6 = r14.A01     // Catch:{ all -> 0x0553 }
            boolean r5 = r6.A0O(r11)     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x02dc
            com.whatsapp.jid.UserJid r5 = r12.userJid     // Catch:{ all -> 0x0553 }
            boolean r5 = r6.A0O(r5)     // Catch:{ all -> 0x0553 }
            if (r5 != 0) goto L_0x02dc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0553 }
            r10.<init>()     // Catch:{ all -> 0x0553 }
            java.lang.String r5 = "ParticipantDeviceStore/getParticipantDevices/invalid self device: "
            r10.append(r5)     // Catch:{ all -> 0x0553 }
            r10.append(r12)     // Catch:{ all -> 0x0553 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0553 }
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x0553 }
            X.190 r10 = r14.A00     // Catch:{ all -> 0x0553 }
            int r5 = r12.getDevice()     // Catch:{ all -> 0x0553 }
            r16 = 0
            if (r5 != 0) goto L_0x02be
            r16 = 1
        L_0x02be:
            java.lang.String r12 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0553 }
            java.lang.String r5 = "participant-devices-invalid-self-devices"
            r10.A0G(r5, r12, r15)     // Catch:{ all -> 0x0553 }
            if (r16 == 0) goto L_0x01e2
            boolean r5 = X.C22971Dz.A0T(r11)     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x02d4
            X.1yJ r12 = r6.A08()     // Catch:{ all -> 0x0553 }
            goto L_0x02d9
        L_0x02d4:
            r6.A0I()     // Catch:{ all -> 0x0553 }
            X.1E3 r12 = r6.A02     // Catch:{ all -> 0x0553 }
        L_0x02d9:
            r15 = 1
            if (r12 == 0) goto L_0x01e2
        L_0x02dc:
            X.2ly r10 = new X.2ly     // Catch:{ all -> 0x0553 }
            r6 = r26
            r5 = r25
            r10.<init>(r12, r6, r5)     // Catch:{ all -> 0x0553 }
            if (r15 == 0) goto L_0x02ff
            X.10I r6 = r14.A04     // Catch:{ all -> 0x0553 }
            r30 = 5
            X.3CE r5 = new X.3CE     // Catch:{ all -> 0x0553 }
            r25 = r5
            r26 = r7
            r27 = r10
            r28 = r11
            r29 = r14
            r31 = r33
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0553 }
            r6.CGF(r5)     // Catch:{ all -> 0x0553 }
        L_0x02ff:
            java.util.concurrent.ConcurrentHashMap r11 = r13.A05     // Catch:{ all -> 0x0553 }
            com.whatsapp.jid.DeviceJid r6 = r10.A02     // Catch:{ all -> 0x0553 }
            boolean r5 = r11.containsKey(r6)     // Catch:{ all -> 0x0553 }
            if (r5 != 0) goto L_0x01e2
            r11.put(r6, r10)     // Catch:{ all -> 0x0553 }
            goto L_0x01e2
        L_0x030e:
            if (r9 == 0) goto L_0x034d
            com.whatsapp.jid.UserJid r6 = r9.A04     // Catch:{ all -> 0x0553 }
            X.1E2 r5 = r4.A09()     // Catch:{ all -> 0x0553 }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x0553 }
            if (r5 == 0) goto L_0x0327
            X.1E2 r5 = r4.A09()     // Catch:{ all -> 0x0553 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x0553 }
            X.2sr r5 = (X.C63312sr) r5     // Catch:{ all -> 0x0553 }
            goto L_0x0335
        L_0x0327:
            r4.A0I()     // Catch:{ all -> 0x0553 }
            com.whatsapp.jid.PhoneUserJid r5 = r4.A0E     // Catch:{ all -> 0x0553 }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x0553 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x0553 }
            X.2sr r5 = (X.C63312sr) r5     // Catch:{ all -> 0x0553 }
        L_0x0335:
            if (r5 != 0) goto L_0x033c
            r3.put(r6, r9)     // Catch:{ all -> 0x0553 }
            r15 = 1
            goto L_0x033d
        L_0x033c:
            r15 = 0
        L_0x033d:
            X.10I r6 = r1.A0C     // Catch:{ all -> 0x0553 }
            r14 = 24
            X.7RT r5 = new X.7RT     // Catch:{ all -> 0x0553 }
            r10 = r5
            r11 = r1
            r12 = r7
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0553 }
            r6.CGF(r5)     // Catch:{ all -> 0x0553 }
        L_0x034d:
            r2.close()     // Catch:{ all -> 0x055f }
            r22.close()     // Catch:{ all -> 0x0569 }
            X.1LY r9 = r1.A03     // Catch:{ all -> 0x0569 }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0569 }
            long r5 = r5 - r17
            java.lang.String r2 = "ParticipantUserStore/getGroupParticipantsOptimized"
            r9.A01(r2, r5)     // Catch:{ all -> 0x0569 }
            goto L_0x00b3
        L_0x0362:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0569 }
            r5.<init>(r10)     // Catch:{ all -> 0x0569 }
            r2 = r37
            java.util.Map r12 = r2.A0L(r5)     // Catch:{ all -> 0x0569 }
            java.util.Iterator r13 = r10.iterator()     // Catch:{ all -> 0x0569 }
        L_0x0371:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x03aa
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0569 }
            java.lang.Object r5 = r12.get(r11)     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0569 }
            boolean r2 = r5 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x0393
            java.lang.String r2 = "ParticipantUserStore/substitutePhoneJidsWithLids/could not find lid for jid"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            X.190 r11 = r1.A00     // Catch:{ all -> 0x0569 }
            r5 = 0
            java.lang.String r2 = "participant-cag-lid-not-found"
            r11.A0G(r2, r5, r9)     // Catch:{ all -> 0x0569 }
            goto L_0x0371
        L_0x0393:
            java.lang.Object r2 = r3.get(r11)     // Catch:{ all -> 0x0569 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0569 }
            X.2sr r2 = (X.C63312sr) r2     // Catch:{ all -> 0x0569 }
            X.2sr r2 = A02(r2, r5)     // Catch:{ all -> 0x0569 }
            r6.add(r2)     // Catch:{ all -> 0x0569 }
            r3.remove(r11)     // Catch:{ all -> 0x0569 }
            r3.put(r5, r2)     // Catch:{ all -> 0x0569 }
            goto L_0x0371
        L_0x03aa:
            X.10I r5 = r1.A0C     // Catch:{ all -> 0x0569 }
            r21 = 27
            X.3Cr r2 = new X.3Cr     // Catch:{ all -> 0x0569 }
            r16 = r2
            r17 = r1
            r18 = r7
            r19 = r6
            r20 = r10
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (int) r21)     // Catch:{ all -> 0x0569 }
            r5.CGF(r2)     // Catch:{ all -> 0x0569 }
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0569 }
            r6.<init>()     // Catch:{ all -> 0x0569 }
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0569 }
            r5.<init>()     // Catch:{ all -> 0x0569 }
            r4.A0I()     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.PhoneUserJid r2 = r4.A0E     // Catch:{ all -> 0x0569 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0569 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0569 }
            X.2sr r2 = (X.C63312sr) r2     // Catch:{ all -> 0x0569 }
            r14 = 1
            if (r2 == 0) goto L_0x043c
            int r2 = r2.A01     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x043c
        L_0x03df:
            java.util.Set r2 = r3.entrySet()     // Catch:{ all -> 0x0569 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x0569 }
        L_0x03e7:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0468
            java.lang.Object r2 = r13.next()     // Catch:{ all -> 0x0569 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0569 }
            java.lang.Object r11 = r2.getKey()     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x0569 }
            java.lang.Object r10 = r2.getValue()     // Catch:{ all -> 0x0569 }
            X.2sr r10 = (X.C63312sr) r10     // Catch:{ all -> 0x0569 }
            boolean r2 = X.C22971Dz.A0Y(r11)     // Catch:{ all -> 0x0569 }
            r12 = 0
            if (r2 == 0) goto L_0x0413
            java.lang.String r2 = "ParticipantUserStore/initParticipantsFromStorage/unexpectedly found pn jid in CAG"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            X.190 r3 = r1.A00     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "participant-cag-has-jid"
            r3.A0G(r2, r12, r9)     // Catch:{ all -> 0x0569 }
            goto L_0x03e7
        L_0x0413:
            if (r14 != 0) goto L_0x0419
            int r2 = r10.A01     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0430
        L_0x0419:
            r3 = r11
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ all -> 0x0569 }
            r2 = r37
            com.whatsapp.jid.PhoneUserJid r3 = r2.A0D(r3)     // Catch:{ all -> 0x0569 }
            if (r3 != 0) goto L_0x0434
            java.lang.String r2 = "ParticipantUserStore/initParticipantsFromStorage/could not find jid for lid"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            X.190 r3 = r1.A00     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "participant-cag-jid-not-found"
            r3.A0G(r2, r12, r9)     // Catch:{ all -> 0x0569 }
        L_0x0430:
            r6.put(r11, r10)     // Catch:{ all -> 0x0569 }
            goto L_0x03e7
        L_0x0434:
            X.2sr r2 = A02(r10, r3)     // Catch:{ all -> 0x0569 }
            r5.put(r3, r2)     // Catch:{ all -> 0x0569 }
            goto L_0x0430
        L_0x043c:
            X.1E2 r2 = r4.A09()     // Catch:{ all -> 0x0569 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0569 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0569 }
            X.2sr r2 = (X.C63312sr) r2     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0450
            int r2 = r2.A01     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0450
            goto L_0x03df
        L_0x0450:
            r14 = 0
            goto L_0x03df
        L_0x0452:
            java.util.Map r2 = r0.A09     // Catch:{ all -> 0x0569 }
            r2.clear()     // Catch:{ all -> 0x0569 }
            java.util.Map r2 = r0.A08     // Catch:{ all -> 0x0569 }
            r2.clear()     // Catch:{ all -> 0x0569 }
            int r2 = r0.A00     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0464
            r0.A0S(r3)     // Catch:{ all -> 0x0569 }
            goto L_0x0492
        L_0x0464:
            r0.A0T(r3)     // Catch:{ all -> 0x0569 }
            goto L_0x0492
        L_0x0468:
            X.1E2 r3 = r4.A0A()     // Catch:{ all -> 0x0569 }
            if (r14 != 0) goto L_0x048c
            boolean r2 = r6.containsKey(r3)     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x048c
            java.lang.Object r2 = r6.get(r3)     // Catch:{ all -> 0x0569 }
            X.2sr r2 = (X.C63312sr) r2     // Catch:{ all -> 0x0569 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0569 }
            r4.A0I()     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.PhoneUserJid r3 = r4.A0E     // Catch:{ all -> 0x0569 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0569 }
            X.2sr r2 = A02(r2, r3)     // Catch:{ all -> 0x0569 }
            r5.put(r3, r2)     // Catch:{ all -> 0x0569 }
        L_0x048c:
            r0.A0T(r5)     // Catch:{ all -> 0x0569 }
            r0.A0S(r6)     // Catch:{ all -> 0x0569 }
        L_0x0492:
            r0.A0O()     // Catch:{ all -> 0x0569 }
            boolean r2 = X.C22781De.A03()     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x04d3
            X.0ve r4 = r1.A0B     // Catch:{ all -> 0x0569 }
            r3 = 6700(0x1a2c, float:9.389E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x0569 }
            boolean r2 = X.C18020vd.A05(r2, r4, r3)     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x04d3
            r2 = 40
            X.25f r3 = new X.25f     // Catch:{ all -> 0x0569 }
            r3.<init>((java.lang.Object) r0, (int) r2)     // Catch:{ all -> 0x0569 }
            X.00H r2 = r1.A0E     // Catch:{ all -> 0x0569 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0569 }
            X.2lT r2 = (X.C58922lT) r2     // Catch:{ all -> 0x0569 }
            r2.A00(r0, r3)     // Catch:{ all -> 0x0569 }
        L_0x04b9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0569 }
            r3.<init>()     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = "ParticipantUserStore/syncParticipantDevicesWithDeviceStore "
            r3.append(r2)     // Catch:{ all -> 0x0569 }
            r3.append(r7)     // Catch:{ all -> 0x0569 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0569 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0569 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0569 }
            r5.<init>()     // Catch:{ all -> 0x0569 }
            goto L_0x04e0
        L_0x04d3:
            X.10I r4 = r1.A0C     // Catch:{ all -> 0x0569 }
            r3 = 42
            X.3Bx r2 = new X.3Bx     // Catch:{ all -> 0x0569 }
            r2.<init>(r1, r0, r3)     // Catch:{ all -> 0x0569 }
            r4.CGF(r2)     // Catch:{ all -> 0x0569 }
            goto L_0x04b9
        L_0x04e0:
            if (r15 == 0) goto L_0x04e3
            goto L_0x04e8
        L_0x04e3:
            X.10f r3 = r0.A09()     // Catch:{ all -> 0x0569 }
            goto L_0x04f2
        L_0x04e8:
            java.util.Map r2 = r0.A08     // Catch:{ all -> 0x0569 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0569 }
            X.10f r3 = X.C199410f.copyOf((java.util.Collection) r2)     // Catch:{ all -> 0x0569 }
        L_0x04f2:
            X.1MR r2 = r1.A0A     // Catch:{ all -> 0x0569 }
            java.util.HashMap r2 = r2.A07(r3)     // Catch:{ all -> 0x0569 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0569 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0569 }
        L_0x0500:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x053b
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0569 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0569 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x0569 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x0569 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0569 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0569 }
            if (r4 == 0) goto L_0x0500
            r2 = 0
            X.2sr r2 = r0.A0D(r4, r2)     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0500
            X.10f r2 = X.C199410f.copyOf((java.util.Collection) r3)     // Catch:{ all -> 0x0569 }
            X.2dY r3 = r0.A0E(r2, r4)     // Catch:{ all -> 0x0569 }
            boolean r2 = r3.A00     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x0531
            boolean r2 = r3.A01     // Catch:{ all -> 0x0569 }
            if (r2 == 0) goto L_0x0500
        L_0x0531:
            boolean r2 = r3.A02     // Catch:{ all -> 0x0569 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0569 }
            r5.put(r4, r2)     // Catch:{ all -> 0x0569 }
            goto L_0x0500
        L_0x053b:
            boolean r2 = r5.isEmpty()     // Catch:{ all -> 0x0569 }
            if (r2 != 0) goto L_0x054d
            X.10I r4 = r1.A0C     // Catch:{ all -> 0x0569 }
            r3 = 23
            X.3C4 r2 = new X.3C4     // Catch:{ all -> 0x0569 }
            r2.<init>(r1, r0, r5, r3)     // Catch:{ all -> 0x0569 }
            r4.CGF(r2)     // Catch:{ all -> 0x0569 }
        L_0x054d:
            r1 = r38
            r1.put(r8, r0)     // Catch:{ all -> 0x056d }
            goto L_0x056b
        L_0x0553:
            r1 = move-exception
            if (r2 == 0) goto L_0x055e
            r2.close()     // Catch:{ all -> 0x055a }
            goto L_0x055e
        L_0x055a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x055f }
        L_0x055e:
            throw r1     // Catch:{ all -> 0x055f }
        L_0x055f:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0564 }
            goto L_0x0568
        L_0x0564:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0569 }
        L_0x0568:
            throw r1     // Catch:{ all -> 0x0569 }
        L_0x0569:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x056d }
        L_0x056b:
            monitor-exit(r24)     // Catch:{ all -> 0x0579 }
            goto L_0x0582
        L_0x056d:
            r1 = move-exception
            goto L_0x0577
        L_0x056f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0579 }
            r1.<init>(r0)     // Catch:{ all -> 0x0579 }
            goto L_0x0578
        L_0x0577:
            monitor-exit(r24)     // Catch:{ all -> 0x0579 }
        L_0x0578:
            throw r1     // Catch:{ all -> 0x0579 }
        L_0x0579:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x057b }
        L_0x057b:
            r1 = move-exception
            r0 = r23
            X.CDX.A00(r0, r2)
            throw r1
        L_0x0582:
            r23.close()
        L_0x0585:
            r1 = r39
            X.1MU r1 = r1.A08
            r1.A03(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MW.A0B(X.1E9):X.2tp");
    }

    public HashMap A0E(UserJid userJid, Set set, int i) {
        Cursor A0A2;
        HashMap hashMap = new HashMap();
        if (set.isEmpty()) {
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid userJid2 = (UserJid) it.next();
            hashMap2.put(String.valueOf(A00(this, userJid2)), userJid2);
        }
        String valueOf = String.valueOf(A00(this, userJid));
        C443423b r1 = new C443423b(hashMap2.keySet().toArray(C19620yd.A0M), 974);
        HashMap hashMap3 = new HashMap();
        C28781at A042 = this.A06.get();
        try {
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                String[] strArr = (String[]) it2.next();
                int length = strArr.length;
                String[] strArr2 = new String[(length + 1)];
                System.arraycopy(strArr, 0, strArr2, 1, length);
                strArr2[0] = valueOf;
                A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass2TP.A00(length), "GET_GROUPS_BY_USER_JIDS_SQL", strArr2);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("group_jid_row_id");
                int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("user_jid_row_id");
                while (A0A2.moveToNext()) {
                    long j = A0A2.getLong(columnIndexOrThrow);
                    long j2 = A0A2.getLong(columnIndexOrThrow2);
                    Long valueOf2 = Long.valueOf(j);
                    Set set2 = (Set) hashMap3.get(valueOf2);
                    if (set2 == null) {
                        set2 = new HashSet();
                    }
                    set2.add(Long.valueOf(j2));
                    hashMap3.put(valueOf2, set2);
                }
                A0A2.close();
            }
            HashMap A0F2 = this.A05.A0F(AnonymousClass1E9.class, hashMap3.keySet());
            HashMap A0P = this.A02.A0P(A0F2.values());
            for (Map.Entry entry : hashMap3.entrySet()) {
                AnonymousClass1E9 r7 = (AnonymousClass1E9) A0F2.get(entry.getKey());
                if (A0M((AnonymousClass1E7) A0P.get(r7), r7)) {
                    HashSet hashSet = new HashSet();
                    for (Long valueOf3 : (Set) entry.getValue()) {
                        UserJid userJid3 = (UserJid) hashMap2.get(String.valueOf(valueOf3));
                        if (userJid3 != null) {
                            hashSet.add(userJid3);
                        }
                    }
                    hashMap.put((AnonymousClass1EC) r7, hashSet);
                    int i2 = i;
                    if (i2 > -1 && hashMap.size() >= i2) {
                        break;
                    }
                }
            }
            A042.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0F(AnonymousClass1E9 r20) {
        Cursor A0A2;
        UserJid userJid;
        HashSet hashSet = new HashSet();
        AnonymousClass1DL r7 = this.A05;
        String valueOf = String.valueOf(r7.A09(r20));
        C28781at A042 = this.A06.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANT_USER_JIDS_SQL", new String[]{valueOf});
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("server");
            int columnIndexOrThrow3 = A0A2.getColumnIndexOrThrow("agent");
            int columnIndexOrThrow4 = A0A2.getColumnIndexOrThrow("device");
            int columnIndexOrThrow5 = A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int columnIndexOrThrow6 = A0A2.getColumnIndexOrThrow("raw_string");
            int columnIndexOrThrow7 = A0A2.getColumnIndexOrThrow("user_jid_row_id");
            while (A0A2.moveToNext()) {
                UserJid userJid2 = (UserJid) r7.A0D(A0A2, A042, UserJid.class, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, A0A2.getLong(columnIndexOrThrow7));
                if (userJid2 == null) {
                    userJid = null;
                } else {
                    userJid = A03(this, userJid2);
                }
                if (userJid != null) {
                    hashSet.add(userJid);
                }
            }
            A0A2.close();
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0G(UserJid userJid) {
        Cursor A0A2;
        HashSet hashSet = new HashSet();
        C28781at A042 = this.A06.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?", "GET_PARTICIPANT_GROUPS_BY_USER_JID_SQL", new String[]{String.valueOf(A00(this, userJid))});
            while (A0A2.moveToNext()) {
                AnonymousClass1E9 r0 = (AnonymousClass1E9) this.A05.A0E(AnonymousClass1E9.class, A0A2.getLong(A0A2.getColumnIndexOrThrow("group_jid_row_id")));
                if (r0 != null) {
                    hashSet.add(r0);
                }
            }
            A0A2.close();
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0H(Set set) {
        Cursor A0A2;
        HashSet hashSet = new HashSet();
        if (set.isEmpty()) {
            return hashSet;
        }
        C28781at A042 = this.A06.get();
        try {
            Iterator it = new C443423b((DeviceJid[]) set.toArray(new DeviceJid[0]), 975).iterator();
            while (it.hasNext()) {
                DeviceJid[] deviceJidArr = (DeviceJid[]) it.next();
                C23141Ev r7 = ((C28801av) A042).A02;
                int length = deviceJidArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE ");
                sb.append("device_jid_row_id IN ");
                sb.append(AnonymousClass1H2.A00(length));
                sb.append(" AND ");
                sb.append("sent_sender_key = 1");
                String obj = sb.toString();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = String.valueOf(this.A05.A09(deviceJidArr[i]));
                }
                A0A2 = r7.A0A(obj, "GET_PARTICIPANT_GROUPS_WITH_SENDER_KEY_SENT_SQL", strArr);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("group_jid_row_id");
                HashSet hashSet2 = new HashSet();
                while (A0A2.moveToNext()) {
                    hashSet2.add(Long.valueOf(A0A2.getLong(columnIndexOrThrow)));
                }
                for (AnonymousClass1E9 r0 : this.A05.A0F(AnonymousClass1E9.class, hashSet2).values()) {
                    if (r0 != null) {
                        hashSet.add(r0);
                    }
                }
                A0A2.close();
            }
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0I(C63312sr r19, AnonymousClass1E9 r20) {
        C41851xA BD0;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/updateGroupParticipant ");
        AnonymousClass1E9 r14 = r20;
        sb.append(r14);
        sb.append(" ");
        C63312sr r1 = r19;
        sb.append(r1);
        Log.i(sb.toString());
        UserJid userJid = r1.A04;
        long A002 = A00(this, userJid);
        String valueOf = String.valueOf(this.A05.A09(r14));
        String valueOf2 = String.valueOf(A002);
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("group_jid_row_id", valueOf);
        contentValues.put("user_jid_row_id", valueOf2);
        contentValues.put("rank", Integer.valueOf(r1.A01));
        contentValues.put("pending", Integer.valueOf(r1.A03 ? 1 : 0));
        contentValues.put("add_timestamp", Long.valueOf(r1.A02));
        String[] strArr = {valueOf, valueOf2};
        C28791au A052 = this.A06.A05();
        try {
            BD0 = A052.BD0();
            C23141Ev r8 = ((C28801av) A052).A02;
            if (r8.A02(contentValues, "group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "insertOrUpdateGroupParticipant/UPDATE_GROUP_PARTICIPANT_USER", strArr) != 0) {
                this.A07.A02(r1.A00(), r14, userJid, A002);
            } else {
                r8.A05("group_participant_user", "insertOrUpdateGroupParticipant/INSERT_GROUP_PARTICIPANT_USER", contentValues);
                this.A07.A01(r1.A00(), r14, userJid, A002);
            }
            AnonymousClass1MU r6 = this.A08;
            boolean A0O = this.A01.A0O(userJid);
            if (C18020vd.A05(C18040vf.A02, r6.A01, 8088) && A0O) {
                r6.A05(A052, r14, r1.A01);
            }
            BD0.A00();
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0J(C63872tp r6) {
        C41851xA BD0;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/resetSentSenderKeyForAllParticipants ");
        sb.append(r6);
        Log.i(sb.toString());
        AnonymousClass1E9 r4 = r6.A06;
        C28791au A052 = this.A06.A05();
        try {
            BD0 = A052.BD0();
            this.A07.A03(r4);
            A05(r6, this);
            BD0.A00();
            BD0.close();
            A052.close();
            new C56692hs(r4);
            ((C25611Ow) this.A0I.get()).A01.A00();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0L(AnonymousClass1E9 r7, List list) {
        C41851xA BD0;
        C28791au A052 = this.A06.A05();
        try {
            BD0 = A052.BD0();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
                if ((r1 instanceof UserJid) && A0P(r7, (UserJid) r1)) {
                    z = true;
                }
            }
            if (z) {
                this.A07.A03(r7);
            }
            BD0.A00();
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0N(AnonymousClass1BI r4) {
        if (!(r4 instanceof GroupJid) || A0B((AnonymousClass1E9) r4).A06() <= 2) {
            return false;
        }
        return true;
    }

    public boolean A0O(AnonymousClass1E9 r4) {
        String valueOf = String.valueOf(this.A05.A09(r4));
        AnonymousClass11S r1 = this.A01;
        r1.A0I();
        PhoneUserJid phoneUserJid = r1.A0E;
        C17960vV.A07(phoneUserJid);
        if (A0Q(phoneUserJid, valueOf) || A0Q(r1.A09(), valueOf)) {
            return true;
        }
        return false;
    }

    public boolean A0P(AnonymousClass1E9 r4, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantUserStore/removeGroupParticipant ");
        sb.append(r4);
        sb.append(" ");
        sb.append(userJid);
        Log.i(sb.toString());
        return A08(this, r4, A00(this, userJid), this.A01.A0O(userJid));
    }

    public AnonymousClass1MW(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1M9 r4, AnonymousClass11P r5, AnonymousClass1CJ r6, AnonymousClass1LY r7, AnonymousClass1MS r8, AnonymousClass1DL r9, AnonymousClass1Cd r10, AnonymousClass1MV r11, AnonymousClass1MU r12, C24751Ln r13, AnonymousClass1MR r14, C18030ve r15, AnonymousClass10I r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20) {
        this.A0F = r5;
        this.A0B = r15;
        this.A05 = r9;
        this.A00 = r2;
        this.A01 = r3;
        this.A0C = r16;
        this.A0G = r6;
        this.A0D = r17;
        this.A02 = r4;
        this.A09 = r13;
        this.A0A = r14;
        this.A0I = r18;
        this.A03 = r7;
        this.A06 = r10;
        this.A0J = r19;
        this.A04 = r8;
        this.A08 = r12;
        this.A07 = r11;
        this.A0E = r20;
    }

    public static long A00(AnonymousClass1MW r2, UserJid userJid) {
        C17960vV.A0G(!TextUtils.isEmpty(userJid.getRawString()), "ParticipantUserStore/invalid-jid");
        AnonymousClass11S r1 = r2.A01;
        r1.A0I();
        PhoneUserJid phoneUserJid = r1.A0E;
        C17960vV.A07(phoneUserJid);
        if (phoneUserJid.equals(userJid)) {
            userJid = AnonymousClass1E5.A00;
        } else if (r1.A09() != null && r1.A09().equals(userJid)) {
            userJid = C173468v7.A00;
        }
        return r2.A05.A09(userJid);
    }

    public static C63312sr A02(C63312sr r10, UserJid userJid) {
        C199410f A002 = r10.A00();
        HashSet hashSet = new HashSet();
        AnonymousClass1IZ it = A002.iterator();
        while (true) {
            UserJid userJid2 = userJid;
            if (it.hasNext()) {
                C59232ly r4 = (C59232ly) it.next();
                try {
                    hashSet.add(new C59232ly(DeviceJid.Companion.A03(userJid, r4.A02.getDevice()), r4.A01, r4.A00));
                } catch (AnonymousClass11T unused) {
                    Log.e("ParticipantUserStore/generateDevicesForJid/invalid device jid");
                }
            } else {
                return new C63312sr(userJid2, hashSet, r10.A01, r10.A02, r10.A03);
            }
        }
    }

    public static void A04(C199410f r7, C63872tp r8, AnonymousClass1MW r9, UserJid userJid) {
        boolean z;
        AnonymousClass1IZ it = r7.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C22971Dz.A0T(((DeviceJid) it.next()).userJid)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z && r8.A00 == 0) {
            r9.A00.A0G("addDevice/group with lid", "trying to add a lid device for a non lid based group", false);
        }
        if (!C22971Dz.A0T(userJid) && z) {
            r9.A00.A0G("addDevice/group with lid", "a non lid participant and is trying to add a lid device", false);
        }
        C63312sr A0D2 = r8.A0D(userJid, false);
        if (A0D2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("GroupParticipants/addDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            return;
        }
        r8.A0B = true;
        AnonymousClass1IZ it2 = r7.iterator();
        while (it2.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it2.next();
            if ((!C22971Dz.A0T(userJid) && !C22971Dz.A0T(deviceJid)) || r8.A00 != 0) {
                C59232ly r3 = new C59232ly(deviceJid, false, false);
                ConcurrentHashMap concurrentHashMap = A0D2.A05;
                DeviceJid deviceJid2 = r3.A02;
                if (!concurrentHashMap.containsKey(deviceJid2)) {
                    concurrentHashMap.put(deviceJid2, r3);
                }
            }
        }
        if (!r7.isEmpty()) {
            C63872tp.A05(r8);
        }
    }

    public static void A07(AnonymousClass1MW r4, UserJid userJid, Set set, boolean z) {
        C41851xA BD0;
        set.size();
        C28791au A052 = r4.A06.A05();
        try {
            BD0 = A052.BD0();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A06((C63872tp) it.next(), r4, userJid, z);
            }
            BD0.A00();
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    @Deprecated
    public C63872tp A0C(AnonymousClass1E9 r3) {
        C63872tp A0B2 = A0B(r3);
        this.A08.A03(A0B2);
        return A0B2;
    }

    public void A0K(AnonymousClass1E9 r7, Collection collection) {
        C41851xA BD0;
        C63872tp A0B2 = A0B(r7);
        AnonymousClass1E9 r1 = A0B2.A06;
        C36321nh r0 = GroupJid.Companion;
        if (!((C59742mo) this.A0D.get()).A02.A0R(C36321nh.A00(r1))) {
            C28791au A052 = this.A06.A05();
            try {
                BD0 = A052.BD0();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C63312sr A0D2 = A0B2.A0D((UserJid) it.next(), false);
                    if (A0D2 != null) {
                        A0I(A0D2, r7);
                    }
                }
                BD0.A00();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
