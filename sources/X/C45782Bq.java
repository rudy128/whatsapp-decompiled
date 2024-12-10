package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2Bq  reason: invalid class name and case insensitive filesystem */
public class C45782Bq extends C195879u4 {
    public final AnonymousClass11S A00;
    public final C25001Mm A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1R8 A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass11P A05;
    public final C19830z4 A06;
    public final AnonymousClass1P3 A07;
    public final C25571Os A08;
    public final AnonymousClass1MZ A09;
    public final AnonymousClass1PT A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final Random A0D;

    private void A00() {
        long A012 = AnonymousClass11P.A01(this.A05);
        C19830z4 r7 = this.A06;
        AnonymousClass00H r6 = r7.A00;
        if (!C17880vN.A0B(r6).contains("dithered_last_signed_prekey_rotation")) {
            long A032 = A012 - C17890vO.A03(this.A0D.nextInt(2592000));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("no signed prekey rotation schedule established; setting last rotation time to ");
            C17890vO.A1A(A10, A87.A02(A032));
            C17880vN.A1D(C19830z4.A00(r7), "dithered_last_signed_prekey_rotation", A032);
        }
        long j = C17880vN.A0B(r6).getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A012) {
            long j2 = j + 2592000000L;
            if (j2 >= A012) {
                long j3 = j2 - A012;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("scheduling alarm to trigger signed prekey rotation; now=");
                A102.append(A87.A02(A012));
                A102.append("; lastSignedPrekeyRotation=");
                A102.append(A87.A02(j));
                C17900vP.A0m("; deltaToAlarm=", A102, j3);
                PendingIntent A033 = A03("com.whatsapp.action.ROTATE_SIGNED_PREKEY", 134217728);
                if (!this.A03.A00(A033, 2, j3 + SystemClock.elapsedRealtime())) {
                    Log.w("RotateKeysAction/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("scheduling immediate signed prekey rotation; now=");
        A103.append(A87.A02(A012));
        A103.append("; lastSignedPrekeyRotation=");
        C17890vO.A1A(A103, A87.A02(j));
        this.A0B.CGF(new C70613Bu(this, 38));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0502, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0505, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0509, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x050c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        X.CDX.A00(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x026a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0347, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.CDX.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x034b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x034c, code lost:
        if (r10 != null) goto L_0x034e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C45782Bq r43) {
        /*
            r4 = r43
            X.1Os r0 = r4.A08
            X.3Ez r25 = r0.A07()
            X.11P r0 = r4.A05     // Catch:{ all -> 0x053e }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x053e }
            X.0z4 r2 = r4.A06     // Catch:{ all -> 0x053e }
            r17 = r2
            android.content.SharedPreferences r5 = X.C17890vO.A0B(r17)     // Catch:{ all -> 0x053e }
            java.lang.String r9 = "dithered_last_signed_prekey_rotation"
            r2 = -9223372036854775808
            long r7 = r5.getLong(r9, r2)     // Catch:{ all -> 0x053e }
            r5 = 0
            r18 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0045
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0045
            long r5 = r7 + r18
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053e }
            java.lang.String r0 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotate keys alarm fired before ready to rotate signed prekey; rotation skipped until "
            r1.append(r0)     // Catch:{ all -> 0x053e }
            java.lang.String r0 = X.A87.A02(r5)     // Catch:{ all -> 0x053e }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x053e }
            goto L_0x0511
        L_0x0045:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053e }
            java.lang.String r2 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotating signed prekey now; now="
            r3.append(r2)     // Catch:{ all -> 0x053e }
            java.lang.String r2 = X.A87.A02(r0)     // Catch:{ all -> 0x053e }
            r3.append(r2)     // Catch:{ all -> 0x053e }
            java.lang.String r2 = "; lastSignedPrekeyRotation="
            r3.append(r2)     // Catch:{ all -> 0x053e }
            java.lang.String r2 = X.A87.A02(r7)     // Catch:{ all -> 0x053e }
            X.C17890vO.A1A(r3, r2)     // Catch:{ all -> 0x053e }
            X.1P3 r5 = r4.A07     // Catch:{ all -> 0x053e }
            X.1Os r2 = r5.A0H     // Catch:{ all -> 0x053e }
            r43 = r2
            X.3Ez r16 = r43.A07()     // Catch:{ all -> 0x053e }
            X.1PJ r11 = r5.A01     // Catch:{ all -> 0x052d }
            X.2cG r3 = r11.A03()     // Catch:{ all -> 0x052d }
            X.1PH r2 = r11.A00     // Catch:{ all -> 0x052d }
            X.1PI r2 = r2.A05     // Catch:{ all -> 0x052d }
            X.1PD r8 = r2.A00     // Catch:{ all -> 0x052d }
            java.lang.String r12 = "prekey_id"
            X.1MH r2 = r8.A01     // Catch:{ all -> 0x052d }
            X.1at r15 = r2.get()     // Catch:{ all -> 0x052d }
            r2 = r15
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0523 }
            X.1Ev r13 = r2.A02     // Catch:{ all -> 0x0523 }
            java.lang.String r6 = "SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1"
            java.lang.String r2 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation"
            android.database.Cursor r6 = X.C23141Ev.A00(r13, r6, r2)     // Catch:{ all -> 0x0523 }
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x0517 }
            r10 = 0
            if (r2 == 0) goto L_0x00bf
            int r14 = X.C17890vO.A01(r6, r12)     // Catch:{ all -> 0x0517 }
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = 1
            if (r14 == r7) goto L_0x00a0
            int r10 = r14 + 1
            goto L_0x00bf
        L_0x00a0:
            r6.close()     // Catch:{ all -> 0x0523 }
            java.lang.String r7 = "SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1"
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x0523 }
            r2 = 8388607(0x7fffff, float:1.1754942E-38)
            X.C17880vN.A1S(r6, r2, r10)     // Catch:{ all -> 0x0523 }
            java.lang.String r2 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation2"
            android.database.Cursor r6 = r13.A0A(r7, r2, r6)     // Catch:{ all -> 0x0523 }
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x0517 }
            if (r2 == 0) goto L_0x00bf
            int r2 = X.C17890vO.A01(r6, r12)     // Catch:{ all -> 0x0517 }
            int r10 = r2 + 1
        L_0x00bf:
            r6.close()     // Catch:{ all -> 0x0523 }
            r15.close()     // Catch:{ all -> 0x052d }
            X.11P r2 = r11.A01     // Catch:{ all -> 0x052d }
            long r30 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x052d }
            X.2cF r6 = X.C63962tz.A00()     // Catch:{ all -> 0x052d }
            X.2kN r3 = r3.A00     // Catch:{ all -> 0x052d }
            X.1jP r2 = r6.A01     // Catch:{ all -> 0x052d }
            byte[] r2 = r2.A00()     // Catch:{ all -> 0x052d }
            byte[] r28 = X.C63962tz.A09(r3, r2)     // Catch:{ all -> 0x052d }
            X.2qS r7 = new X.2qS     // Catch:{ all -> 0x052d }
            r26 = r7
            r27 = r6
            r29 = r10
            r26.<init>(r27, r28, r29, r30)     // Catch:{ all -> 0x052d }
            X.2BQ r6 = r7.A00     // Catch:{ all -> 0x052d }
            int r10 = r6.id_     // Catch:{ all -> 0x052d }
            X.2cF r2 = r7.A00()     // Catch:{ all -> 0x052d }
            X.1jP r2 = r2.A01     // Catch:{ all -> 0x052d }
            byte[] r2 = r2.A00     // Catch:{ all -> 0x052d }
            X.AiX r11 = new X.AiX     // Catch:{ all -> 0x052d }
            r11.<init>(r2)     // Catch:{ all -> 0x052d }
            X.2cF r2 = r7.A00()     // Catch:{ all -> 0x052d }
            X.2kN r2 = r2.A00     // Catch:{ all -> 0x052d }
            byte[] r3 = r2.A00     // Catch:{ all -> 0x052d }
            X.9ZN r2 = new X.9ZN     // Catch:{ all -> 0x052d }
            r2.<init>(r3)     // Catch:{ all -> 0x052d }
            X.9cI r15 = new X.9cI     // Catch:{ all -> 0x052d }
            r15.<init>(r2, r11)     // Catch:{ all -> 0x052d }
            int r11 = r6.id_     // Catch:{ all -> 0x052d }
            long r2 = r6.timestamp_     // Catch:{ all -> 0x052d }
            X.DSQ r6 = r6.signature_     // Catch:{ all -> 0x052d }
            byte[] r13 = r6.A06()     // Catch:{ all -> 0x052d }
            X.2BQ r6 = X.AnonymousClass2BQ.DEFAULT_INSTANCE     // Catch:{ all -> 0x052d }
            X.Bmt r12 = r6.A0N()     // Catch:{ all -> 0x052d }
            X.2Az r12 = (X.C45672Az) r12     // Catch:{ all -> 0x052d }
            r12.A0G(r11)     // Catch:{ all -> 0x052d }
            X.AiX r6 = r15.A01     // Catch:{ all -> 0x052d }
            byte[] r14 = r6.A00()     // Catch:{ all -> 0x052d }
            r11 = 0
            int r6 = r14.length     // Catch:{ all -> 0x052d }
            X.BmB r6 = X.DSQ.A01(r14, r11, r6)     // Catch:{ all -> 0x052d }
            r12.A0J(r6)     // Catch:{ all -> 0x052d }
            X.9ZN r6 = r15.A00     // Catch:{ all -> 0x052d }
            byte[] r14 = r6.A00     // Catch:{ all -> 0x052d }
            int r6 = r14.length     // Catch:{ all -> 0x052d }
            X.BmB r6 = X.DSQ.A01(r14, r11, r6)     // Catch:{ all -> 0x052d }
            r12.A0I(r6)     // Catch:{ all -> 0x052d }
            int r6 = r13.length     // Catch:{ all -> 0x052d }
            X.BmB r6 = X.DSQ.A01(r13, r11, r6)     // Catch:{ all -> 0x052d }
            r12.A0K(r6)     // Catch:{ all -> 0x052d }
            r12.A0H(r2)     // Catch:{ all -> 0x052d }
            X.Bm6 r2 = r12.A0C()     // Catch:{ all -> 0x052d }
            X.2BQ r2 = (X.AnonymousClass2BQ) r2     // Catch:{ all -> 0x052d }
            byte[] r2 = r2.A0M()     // Catch:{ all -> 0x052d }
            r8.A00(r10, r2)     // Catch:{ all -> 0x052d }
            X.2eE r2 = X.C63962tz.A04(r7)     // Catch:{ all -> 0x052d }
            if (r16 == 0) goto L_0x015a
            r16.close()     // Catch:{ all -> 0x053e }
        L_0x015a:
            X.1Mm r8 = r4.A01     // Catch:{ all -> 0x053e }
            byte[] r7 = r2.A01     // Catch:{ all -> 0x053e }
            byte[] r6 = r2.A00     // Catch:{ all -> 0x053e }
            byte[] r3 = r2.A02     // Catch:{ all -> 0x053e }
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r2 = new com.whatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ all -> 0x053e }
            r2.<init>(r7, r6, r3)     // Catch:{ all -> 0x053e }
            r8.A01(r2)     // Catch:{ all -> 0x053e }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r17)     // Catch:{ all -> 0x053e }
            X.C17880vN.A1D(r2, r9, r0)     // Catch:{ all -> 0x053e }
            X.11S r10 = r4.A00     // Catch:{ all -> 0x053e }
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A00(r10)     // Catch:{ all -> 0x053e }
            if (r2 == 0) goto L_0x0511
            long r16 = r0 - r18
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x053e }
            X.1M9 r2 = r4.A02     // Catch:{ all -> 0x053e }
            r2.A0m(r3)     // Catch:{ all -> 0x053e }
            int r2 = r3.size()     // Catch:{ all -> 0x053e }
            long r6 = (long) r2     // Catch:{ all -> 0x053e }
            r8 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0196
            r2 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r0 = r0 - r2
            goto L_0x0198
        L_0x0196:
            r0 = r16
        L_0x0198:
            r10.A0I()     // Catch:{ all -> 0x053e }
            X.1E3 r2 = r10.A02     // Catch:{ all -> 0x053e }
            X.2nE r8 = X.C63962tz.A02(r2)     // Catch:{ all -> 0x053e }
            X.1Oy r2 = r5.A08     // Catch:{ all -> 0x053e }
            r42 = r2
            java.lang.String r3 = "getOldSenderKeys"
            X.2nE r3 = X.C25631Oy.A00(r2, r8, r3)     // Catch:{ all -> 0x053e }
            if (r3 == 0) goto L_0x0270
            java.lang.String r24 = "group_id"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053e }
            java.lang.String r2 = "SignalSenderKeyStore get keys older than:"
            r9.append(r2)     // Catch:{ all -> 0x053e }
            r5 = r16
            r9.append(r5)     // Catch:{ all -> 0x053e }
            java.lang.String r23 = " for sender:"
            r2 = r23
            r9.append(r2)     // Catch:{ all -> 0x053e }
            r9.append(r3)     // Catch:{ all -> 0x053e }
            java.lang.String r7 = " statusKeyExpirationTimeMs:"
            X.C17900vP.A0m(r7, r9, r0)     // Catch:{ all -> 0x053e }
            long r18 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x053e }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x053e }
            r2 = r42
            X.1MH r2 = r2.A03     // Catch:{ all -> 0x053e }
            r41 = r2
            X.1au r9 = r41.A06()     // Catch:{ all -> 0x053e }
            r2 = r9
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x050a }
            X.1Ev r2 = r2.A02     // Catch:{ all -> 0x050a }
            r26 = r2
            java.lang.String r10 = "SELECT group_id FROM sender_keys WHERE sender_account_id = ? AND sender_account_type = ? AND device_id = ? AND group_id != ? AND timestamp < ?"
            r22 = 5
            r2 = r22
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ all -> 0x050a }
            java.lang.String r14 = r3.A03     // Catch:{ all -> 0x050a }
            r15[r11] = r14     // Catch:{ all -> 0x050a }
            int r2 = r3.A01     // Catch:{ all -> 0x050a }
            java.lang.String r13 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x050a }
            r12 = 1
            r15[r12] = r13     // Catch:{ all -> 0x050a }
            int r2 = r3.A00     // Catch:{ all -> 0x050a }
            java.lang.String r21 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x050a }
            r20 = 2
            r15[r20] = r21     // Catch:{ all -> 0x050a }
            X.1cg r5 = X.C29671cg.A00     // Catch:{ all -> 0x050a }
            java.lang.String r2 = r5.getRawString()     // Catch:{ all -> 0x050a }
            r11 = 3
            r15[r11] = r2     // Catch:{ all -> 0x050a }
            java.lang.String r19 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x050a }
            r18 = 4
            r15[r18] = r19     // Catch:{ all -> 0x050a }
            java.lang.String r2 = "SignalSenderKeyStore/SELECT_GROUP_ID_WHERE_GROUP_NOT_EXISTS"
            r3 = r2
            r2 = r26
            android.database.Cursor r10 = r2.A0A(r10, r3, r15)     // Catch:{ all -> 0x050a }
            java.lang.String r3 = "SELECT group_id FROM sender_keys WHERE sender_account_id = ? AND sender_account_type = ? AND device_id = ? AND group_id = ? AND timestamp < ?"
            r2 = r22
            java.lang.String[] r12 = X.C17880vN.A1b(r14, r13, r2, r12)     // Catch:{ all -> 0x0503 }
            r12[r20] = r21     // Catch:{ all -> 0x0503 }
            X.C17880vN.A1J(r5, r12, r11)     // Catch:{ all -> 0x0503 }
            r12[r18] = r19     // Catch:{ all -> 0x0503 }
            java.lang.String r11 = "SignalSenderKeyStore/SELECT_GROUP_ID_WHERE_GROUP_EXISTS"
            r2 = r26
            android.database.Cursor r3 = r2.A0A(r3, r11, r12)     // Catch:{ all -> 0x0503 }
            r2 = r24
            int r11 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0268 }
        L_0x023b:
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x0268 }
            if (r2 == 0) goto L_0x024c
            java.lang.String r2 = r10.getString(r11)     // Catch:{ all -> 0x0268 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0268 }
            r6.add(r2)     // Catch:{ all -> 0x0268 }
            goto L_0x023b
        L_0x024c:
            r2 = r24
            int r11 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0268 }
        L_0x0252:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0268 }
            if (r2 == 0) goto L_0x0263
            java.lang.String r2 = r3.getString(r11)     // Catch:{ all -> 0x0268 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0268 }
            r6.add(r2)     // Catch:{ all -> 0x0268 }
            goto L_0x0252
        L_0x0263:
            r3.close()     // Catch:{ all -> 0x0503 }
            goto L_0x034e
        L_0x0268:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x026a }
        L_0x026a:
            r1 = move-exception
            X.CDX.A00(r3, r0)     // Catch:{ all -> 0x0503 }
            goto L_0x034b
        L_0x0270:
            java.lang.String r3 = "group_id"
            r21 = 0
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053e }
            java.lang.String r2 = "SignalSenderKeyStore get keys older than:"
            r9.append(r2)     // Catch:{ all -> 0x053e }
            r5 = r16
            r9.append(r5)     // Catch:{ all -> 0x053e }
            java.lang.String r23 = " for sender:"
            r2 = r23
            r9.append(r2)     // Catch:{ all -> 0x053e }
            r9.append(r8)     // Catch:{ all -> 0x053e }
            java.lang.String r7 = " statusKeyExpirationTimeMs:"
            X.C17900vP.A0m(r7, r9, r0)     // Catch:{ all -> 0x053e }
            long r19 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x053e }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x053e }
            java.lang.String r29 = "sender_id = ? AND sender_type = ? AND device_id = ? AND group_id != ? AND timestamp < ?"
            r13 = 5
            java.lang.String[] r10 = new java.lang.String[r13]     // Catch:{ all -> 0x053e }
            java.lang.String r12 = r8.A03     // Catch:{ all -> 0x053e }
            r10[r11] = r12     // Catch:{ all -> 0x053e }
            int r2 = r8.A01     // Catch:{ all -> 0x053e }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x053e }
            r2 = 1
            r10[r2] = r11     // Catch:{ all -> 0x053e }
            int r5 = r8.A00     // Catch:{ all -> 0x053e }
            java.lang.String r18 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x053e }
            r15 = 2
            r10[r15] = r18     // Catch:{ all -> 0x053e }
            X.1cg r5 = X.C29671cg.A00     // Catch:{ all -> 0x053e }
            java.lang.String r14 = r5.getRawString()     // Catch:{ all -> 0x053e }
            r9 = 3
            r10[r9] = r14     // Catch:{ all -> 0x053e }
            java.lang.String r19 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x053e }
            r14 = 4
            r10[r14] = r19     // Catch:{ all -> 0x053e }
            java.lang.String r35 = "sender_id = ? AND sender_type = ? AND device_id = ? AND group_id = ? AND timestamp < ?"
            java.lang.String[] r11 = X.C17880vN.A1b(r12, r11, r13, r2)     // Catch:{ all -> 0x053e }
            r11[r15] = r18     // Catch:{ all -> 0x053e }
            X.C17880vN.A1J(r5, r11, r9)     // Catch:{ all -> 0x053e }
            r11[r14] = r19     // Catch:{ all -> 0x053e }
            r9 = r42
            X.1MH r9 = r9.A03     // Catch:{ all -> 0x053e }
            r41 = r9
            X.1au r9 = r41.A06()     // Catch:{ all -> 0x053e }
            r12 = r9
            X.1av r12 = (X.C28801av) r12     // Catch:{ all -> 0x050a }
            X.1Ev r13 = r12.A02     // Catch:{ all -> 0x050a }
            java.lang.String r27 = "sender_keys"
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x050a }
            r12[r21] = r3     // Catch:{ all -> 0x050a }
            java.lang.String r34 = "SignalSenderKeyStore/getOldSenderKeysLegacy"
            r31 = 0
            r33 = r31
            r26 = r13
            r28 = r12
            r30 = r10
            r32 = r31
            android.database.Cursor r10 = r26.A0B(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x050a }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0503 }
            r2[r21] = r3     // Catch:{ all -> 0x0503 }
            java.lang.String r40 = "SignalSenderKeyStore/getOldSenderKeysLegacy1"
            r38 = r31
            r39 = r31
            r32 = r13
            r33 = r27
            r34 = r2
            r36 = r11
            r37 = r31
            android.database.Cursor r11 = r32.A0B(r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0503 }
            if (r10 == 0) goto L_0x032a
            int r12 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0345 }
        L_0x0319:
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x0345 }
            if (r2 == 0) goto L_0x032a
            java.lang.String r2 = r10.getString(r12)     // Catch:{ all -> 0x0345 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0345 }
            r6.add(r2)     // Catch:{ all -> 0x0345 }
            goto L_0x0319
        L_0x032a:
            if (r11 == 0) goto L_0x034c
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0345 }
        L_0x0330:
            boolean r2 = r11.moveToNext()     // Catch:{ all -> 0x0345 }
            if (r2 == 0) goto L_0x0341
            java.lang.String r2 = r11.getString(r3)     // Catch:{ all -> 0x0345 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0345 }
            r6.add(r2)     // Catch:{ all -> 0x0345 }
            goto L_0x0330
        L_0x0341:
            r11.close()     // Catch:{ all -> 0x0503 }
            goto L_0x034c
        L_0x0345:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0347 }
        L_0x0347:
            r1 = move-exception
            X.CDX.A00(r11, r0)     // Catch:{ all -> 0x0503 }
        L_0x034b:
            throw r1     // Catch:{ all -> 0x0503 }
        L_0x034c:
            if (r10 == 0) goto L_0x0351
        L_0x034e:
            r10.close()     // Catch:{ all -> 0x050a }
        L_0x0351:
            r9.close()     // Catch:{ all -> 0x053e }
            int r2 = r6.size()     // Catch:{ all -> 0x053e }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x053e }
            r10.<init>(r2)     // Catch:{ all -> 0x053e }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ all -> 0x053e }
        L_0x0361:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x053e }
            if (r2 == 0) goto L_0x0374
            java.lang.String r3 = X.C17880vN.A0v(r9)     // Catch:{ all -> 0x053e }
            X.2nC r2 = new X.2nC     // Catch:{ all -> 0x053e }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x053e }
            r10.add(r2)     // Catch:{ all -> 0x053e }
            goto L_0x0361
        L_0x0374:
            boolean r2 = r10.isEmpty()     // Catch:{ all -> 0x053e }
            if (r2 == 0) goto L_0x037f
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ all -> 0x053e }
            goto L_0x03a2
        L_0x037f:
            int r2 = r10.size()     // Catch:{ all -> 0x053e }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x053e }
            r9.<init>(r2)     // Catch:{ all -> 0x053e }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x053e }
        L_0x038c:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x053e }
            if (r2 == 0) goto L_0x03a2
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x053e }
            X.2nC r3 = (X.C59982nC) r3     // Catch:{ all -> 0x053e }
            r2 = r43
            X.3Ez r2 = X.C25571Os.A01(r2, r3)     // Catch:{ all -> 0x053e }
            r9.add(r2)     // Catch:{ all -> 0x053e }
            goto L_0x038c
        L_0x03a2:
            r2 = r43
            r2.A0A(r9)     // Catch:{ all -> 0x0539 }
            java.lang.String r3 = "removeOldSenderKeys"
            r2 = r42
            X.2nE r12 = X.C25631Oy.A00(r2, r8, r3)     // Catch:{ all -> 0x0539 }
            if (r12 == 0) goto L_0x040b
            java.lang.String r10 = "sender_keys"
            r15 = 0
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0539 }
            java.lang.String r2 = "SignalSenderKeyStore deleting keys older than:"
            r8.append(r2)     // Catch:{ all -> 0x0539 }
            r2 = r16
            r8.append(r2)     // Catch:{ all -> 0x0539 }
            r2 = r23
            r8.append(r2)     // Catch:{ all -> 0x0539 }
            r8.append(r12)     // Catch:{ all -> 0x0539 }
            X.C17900vP.A0m(r7, r8, r0)     // Catch:{ all -> 0x0539 }
            r14 = 5
            java.lang.String[] r11 = new java.lang.String[r14]     // Catch:{ all -> 0x0539 }
            java.lang.String r13 = r12.A03     // Catch:{ all -> 0x0539 }
            r11[r15] = r13     // Catch:{ all -> 0x0539 }
            int r0 = r12.A01     // Catch:{ all -> 0x0539 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0539 }
            r3 = 1
            r11[r3] = r8     // Catch:{ all -> 0x0539 }
            int r0 = r12.A00     // Catch:{ all -> 0x0539 }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0539 }
            r2 = 2
            r11[r2] = r12     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0539 }
            r1 = 3
            r11[r1] = r0     // Catch:{ all -> 0x0539 }
            r0 = 4
            r11[r0] = r19     // Catch:{ all -> 0x0539 }
            java.lang.String r7 = "sender_account_id = ? AND sender_account_type = ? AND device_id = ? AND group_id != ? AND timestamp < ?"
            java.lang.String[] r3 = X.C17880vN.A1b(r13, r8, r14, r3)     // Catch:{ all -> 0x0539 }
            r3[r2] = r12     // Catch:{ all -> 0x0539 }
            X.C17880vN.A1J(r5, r3, r1)     // Catch:{ all -> 0x0539 }
            r3[r0] = r19     // Catch:{ all -> 0x0539 }
            java.lang.String r2 = "sender_account_id = ? AND sender_account_type = ? AND device_id = ? AND group_id = ? AND timestamp < ?"
            X.1au r5 = r41.A06()     // Catch:{ all -> 0x0539 }
            X.1xA r8 = r5.BD0()     // Catch:{ all -> 0x04fc }
            goto L_0x0474
        L_0x040b:
            java.lang.String r10 = "sender_keys"
            r12 = 0
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0539 }
            java.lang.String r2 = "SignalSenderKeyStore deleting keys older than:"
            r11.append(r2)     // Catch:{ all -> 0x0539 }
            r2 = r16
            r11.append(r2)     // Catch:{ all -> 0x0539 }
            r2 = r23
            r11.append(r2)     // Catch:{ all -> 0x0539 }
            r11.append(r8)     // Catch:{ all -> 0x0539 }
            X.C17900vP.A0m(r7, r11, r0)     // Catch:{ all -> 0x0539 }
            java.lang.String r11 = "sender_id = ? AND sender_type = ? AND device_id = ? AND group_id != ? AND timestamp < ?"
            r14 = 5
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x0539 }
            java.lang.String r13 = r8.A03     // Catch:{ all -> 0x0539 }
            r7[r12] = r13     // Catch:{ all -> 0x0539 }
            int r0 = r8.A01     // Catch:{ all -> 0x0539 }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0539 }
            r2 = 1
            r7[r2] = r12     // Catch:{ all -> 0x0539 }
            int r0 = r8.A00     // Catch:{ all -> 0x0539 }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0539 }
            r8 = 2
            r7[r8] = r15     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0539 }
            r1 = 3
            r7[r1] = r0     // Catch:{ all -> 0x0539 }
            r0 = 4
            r7[r0] = r19     // Catch:{ all -> 0x0539 }
            java.lang.String r3 = "sender_id = ? AND sender_type = ? AND device_id = ? AND group_id = ? AND timestamp < ?"
            java.lang.String[] r2 = X.C17880vN.A1b(r13, r12, r14, r2)     // Catch:{ all -> 0x0539 }
            r2[r8] = r15     // Catch:{ all -> 0x0539 }
            X.C17880vN.A1J(r5, r2, r1)     // Catch:{ all -> 0x0539 }
            r2[r0] = r19     // Catch:{ all -> 0x0539 }
            X.1au r5 = r41.A06()     // Catch:{ all -> 0x0539 }
            X.1xA r8 = r5.BD0()     // Catch:{ all -> 0x04fc }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04f5 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeysLegacy2"
            r1.A04(r10, r11, r0, r7)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeysLegacy3"
            r1.A04(r10, r3, r0, r2)     // Catch:{ all -> 0x04f5 }
            goto L_0x0483
        L_0x0474:
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04f5 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeysSingleSession2"
            r1.A04(r10, r7, r0, r11)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeysSingleSession3"
            r1.A04(r10, r2, r0, r3)     // Catch:{ all -> 0x04f5 }
        L_0x0483:
            r8.A00()     // Catch:{ all -> 0x04f5 }
            r8.close()     // Catch:{ all -> 0x04fc }
            r5.close()     // Catch:{ all -> 0x0539 }
            X.C25571Os.A05(r9)     // Catch:{ all -> 0x053e }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x053e }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x053e }
        L_0x0497:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x04d0
            java.lang.String r3 = X.C17880vN.A0v(r5)     // Catch:{ all -> 0x053e }
            r2 = 0
            if (r3 == 0) goto L_0x0497
            int r0 = r3.length()     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x0497
            com.whatsapp.jid.Jid r1 = X.C22911Dt.A00(r3)     // Catch:{ all -> 0x04bd }
            boolean r0 = r1 instanceof X.AnonymousClass1E9     // Catch:{ all -> 0x04bd }
            if (r0 == 0) goto L_0x04b7
            X.1E9 r1 = (X.AnonymousClass1E9) r1     // Catch:{ all -> 0x04bd }
            if (r1 == 0) goto L_0x04b7
            goto L_0x04c3
        L_0x04b7:
            X.11T r0 = new X.11T     // Catch:{ all -> 0x04bd }
            r0.<init>((java.lang.String) r3)     // Catch:{ all -> 0x04bd }
            throw r0     // Catch:{ all -> 0x04bd }
        L_0x04bd:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x053e }
            r1.<init>(r0)     // Catch:{ all -> 0x053e }
        L_0x04c3:
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x053e }
            if (r0 != 0) goto L_0x04c8
            r2 = r1
        L_0x04c8:
            X.1E9 r2 = (X.AnonymousClass1E9) r2     // Catch:{ all -> 0x053e }
            if (r2 == 0) goto L_0x0497
            r7.add(r2)     // Catch:{ all -> 0x053e }
            goto L_0x0497
        L_0x04d0:
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x053e }
        L_0x04d4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x0511
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x053e }
            X.1E9 r2 = (X.AnonymousClass1E9) r2     // Catch:{ all -> 0x053e }
            X.1PT r1 = r4.A0A     // Catch:{ all -> 0x053e }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ all -> 0x053e }
            r1.A0D(r2, r0)     // Catch:{ all -> 0x053e }
            X.1MZ r1 = r4.A09     // Catch:{ all -> 0x053e }
            X.1MW r0 = r1.A08     // Catch:{ all -> 0x053e }
            X.2tp r0 = r0.A0C(r2)     // Catch:{ all -> 0x053e }
            r1.A09(r0)     // Catch:{ all -> 0x053e }
            goto L_0x04d4
        L_0x04f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04f7 }
        L_0x04f7:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x04fc }
            throw r0     // Catch:{ all -> 0x04fc }
        L_0x04fc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04fe }
        L_0x04fe:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0539 }
            throw r0     // Catch:{ all -> 0x0539 }
        L_0x0503:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0505 }
        L_0x0505:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x050a }
            throw r0     // Catch:{ all -> 0x050a }
        L_0x050a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r1 = move-exception
            X.CDX.A00(r9, r0)     // Catch:{ all -> 0x053e }
            goto L_0x053d
        L_0x0511:
            if (r25 == 0) goto L_0x0516
            r25.close()
        L_0x0516:
            return
        L_0x0517:
            r1 = move-exception
            if (r6 == 0) goto L_0x0522
            r6.close()     // Catch:{ all -> 0x051e }
            goto L_0x0522
        L_0x051e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0523 }
        L_0x0522:
            throw r1     // Catch:{ all -> 0x0523 }
        L_0x0523:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0528 }
            goto L_0x052c
        L_0x0528:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x052d }
        L_0x052c:
            throw r1     // Catch:{ all -> 0x052d }
        L_0x052d:
            r1 = move-exception
            if (r16 == 0) goto L_0x053d
            r16.close()     // Catch:{ all -> 0x0534 }
            goto L_0x053d
        L_0x0534:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x053e }
            goto L_0x053d
        L_0x0539:
            r1 = move-exception
            X.C25571Os.A05(r9)     // Catch:{ all -> 0x053e }
        L_0x053d:
            throw r1     // Catch:{ all -> 0x053e }
        L_0x053e:
            r1 = move-exception
            if (r25 == 0) goto L_0x0549
            r25.close()     // Catch:{ all -> 0x0545 }
            throw r1
        L_0x0545:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x0549:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45782Bq.A02(X.2Bq):void");
    }

    public boolean A06(Intent intent) {
        return C17890vO.A1S(intent, "com.whatsapp.action.ROTATE_SIGNED_PREKEY");
    }

    public C45782Bq(Context context, AnonymousClass11S r2, C25001Mm r3, AnonymousClass1M9 r4, AnonymousClass1R8 r5, AnonymousClass11C r6, AnonymousClass11P r7, C19830z4 r8, AnonymousClass1P3 r9, C25571Os r10, AnonymousClass1MZ r11, AnonymousClass1PT r12, AnonymousClass10I r13, AnonymousClass00H r14, Random random) {
        super(context);
        this.A05 = r7;
        this.A0D = random;
        this.A03 = r5;
        this.A00 = r2;
        this.A0B = r13;
        this.A08 = r10;
        this.A01 = r3;
        this.A02 = r4;
        this.A0A = r12;
        this.A0C = r14;
        this.A04 = r6;
        this.A07 = r9;
        this.A06 = r8;
        this.A09 = r11;
    }

    public static void A01(Intent intent, C45782Bq r4) {
        PowerManager.WakeLock wakeLock;
        AssertionError assertionError;
        C17900vP.A0Y(intent, "RotateKeysAction/rotateSignedPrekeyAndSenderKeys; intent=", AnonymousClass000.A10());
        PowerManager A0G = r4.A04.A0G();
        if (A0G == null) {
            Log.w("RotateKeysAction/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            wakeLock = C181789Rv.A00(A0G, "RotateKeysAction#rotateSignedPrekeyAndSenderKeys", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            if (r4.A07.A0Y()) {
                A02(r4);
            } else {
                ((C25581Ot) r4.A0C.get()).A00(new C70613Bu(r4, 37)).get();
            }
            r4.A00();
            if (wakeLock != null) {
                wakeLock.release();
                return;
            }
            return;
        } catch (InterruptedException e) {
            e = e;
            assertionError = new AssertionError("interrupted during rotate keys alarm");
        } catch (ExecutionException e2) {
            e = e2;
            assertionError = new AssertionError("exception during rotate keys alarm");
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
        assertionError.initCause(e);
        throw assertionError;
    }

    public void A04() {
        A00();
    }

    public void A05(Intent intent) {
        A01(intent, this);
    }
}
