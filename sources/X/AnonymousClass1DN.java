package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1DN  reason: invalid class name */
public class AnonymousClass1DN {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1DM A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final AnonymousClass1Cd A05;
    public final AnonymousClass1DK A06;
    public final C18030ve A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AnonymousClass1DL A09;
    public final AnonymousClass00H A0A;

    public static final void A00(AnonymousClass190 r3, String str, String str2, Throwable th) {
        C18070vi.A0d(r3, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("migration-failed-");
        sb.append(str2);
        sb.append('-');
        sb.append(str);
        String obj = sb.toString();
        Log.e(obj, th);
        r3.A0G(obj, th.toString(), true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: X.2fY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: X.1aX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: X.1aY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: X.1aT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v350, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v354, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: X.2dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: X.2fY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: X.2fY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: X.1aY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: X.1aY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: X.1aY} */
    /* JADX WARNING: type inference failed for: r10v12, types: [X.2fY, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03db, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseMigration/doMigration/conditions check requires to stop migration process; name = ");
        r1.append(r4);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x041f, code lost:
        if (r1 == 0) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0583, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        r1 = r58.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x091e, code lost:
        if (r1.hasNext() == false) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x092a, code lost:
        if (((X.C37431pX) r1.next()).isValid() != false) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x092d, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x092e, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0950, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09ba, code lost:
        r11 = (X.C28581aT) r5;
        r11.A08.CGF(new X.C98564rM(r11, 9));
        r10 = r11.A05;
        r9 = r10.A01;
        r16 = ((android.content.SharedPreferences) r9.getValue()).getLong("label_message_count", -1);
        r1 = ((android.content.SharedPreferences) r9.getValue()).getBoolean("stars_user_initiated", false);
        r0 = r11.A06;
        r12 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09ee, code lost:
        if (r1 == false) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09f0, code lost:
        r1 = new X.C46772Fv();
        r1.A00 = 12;
        r1.A03 = java.lang.Long.valueOf(r16);
        r1.A02 = java.lang.Long.valueOf(r12);
        ((X.AnonymousClass18K) r0.A00.get()).CC7(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a18, code lost:
        if (r16 > 0) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a1a, code lost:
        r2 = ((android.content.SharedPreferences) r9.getValue()).edit();
        r2.putBoolean("eligible_for_phase3", true);
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a31, code lost:
        if ((r5 instanceof X.AnonymousClass1aX) != false) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a33, code lost:
        r2 = (X.AnonymousClass1aX) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0a46, code lost:
        r2.A0B.CGF(new X.C98564rM(r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a51, code lost:
        r2.A03.A0J(new X.C98564rM(r2, 3));
        r9 = r2.A09;
        r8 = r2.A07;
        r10 = ((android.content.SharedPreferences) r8.A01.getValue()).getLong("label_message_count", -1);
        r12 = r8.A00();
        r2 = (X.AnonymousClass18K) r9.A00.get();
        r1 = new X.C46772Fv();
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a86, code lost:
        if ((r5 instanceof X.AnonymousClass1aY) != false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a88, code lost:
        r2 = (X.AnonymousClass1aY) r5;
        r2.A07.CGF(new X.C70573Bq(r2, 48));
        r9 = r2.A05;
        r8 = r2.A04;
        r10 = ((android.content.SharedPreferences) r8.A01.getValue()).getLong("label_message_count", -1);
        r12 = r8.A00();
        r2 = (X.AnonymousClass18K) r9.A00.get();
        r1 = new X.C46772Fv();
        r0 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0abe, code lost:
        r1.A00 = java.lang.Integer.valueOf(r0);
        r0 = java.lang.Long.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0ac9, code lost:
        r2 = (X.AnonymousClass18K) r0.A00.get();
        r1 = new X.C46772Fv();
        r1.A00 = 9;
        r0 = java.lang.Long.valueOf(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        r59.removeAll(r31);
        r31.clear();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:352:0x0858 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d5 A[Catch:{ Exception -> 0x0953 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06ea A[Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f, all -> 0x07cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06f5 A[Catch:{ all -> 0x07dd, all -> 0x07e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07b6 A[Catch:{ all -> 0x07ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07fa A[Catch:{ all -> 0x0946 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0824 A[Catch:{ all -> 0x0946 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x09ba A[Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0a2f A[Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0b66  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0b8e  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0be5  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0950 A[EDGE_INSN: B:491:0x0950->B:408:0x0950 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C56792i2 r58, java.util.List r59) {
        /*
            r57 = this;
            X.2dx r32 = new X.2dx
            r32.<init>()
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.util.HashSet r30 = new java.util.HashSet
            r30.<init>()
        L_0x000f:
            java.util.Iterator r29 = r59.iterator()
            r20 = 0
        L_0x0015:
            boolean r0 = r29.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r5 = r29.next()
            X.1a4 r5 = (X.C28381a4) r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DatabaseMigrationManager/handleMigrationPhase; name="
            r1.append(r2)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = "; start processing."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r58.A00()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r0 != 0) goto L_0x0074
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = "; conditions check requires to stop migration process."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0059:
            r1 = r59
            r0 = r31
            r1.removeAll(r0)
            r31.clear()
            if (r20 != 0) goto L_0x000f
            r0 = r32
            long r2 = r0.A01
            int r0 = r59.size()
            long r0 = (long) r0
            long r2 = r2 + r0
            r0 = r32
            r0.A01 = r2
            return
        L_0x0074:
            r1.<init>()
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r3 = r5.A01()
            r1 = 2
            java.lang.String r2 = "DatabaseMigrationManager/processMigrations; name="
            r22 = 3
            r0 = r22
            if (r3 == r0) goto L_0x00e7
            boolean r0 = r5.A0I()
            if (r0 != 0) goto L_0x00e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = "; migration is disabled, skipping."
        L_0x00a6:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00b0:
            r0 = 2
            r6 = 1
            if (r1 == r0) goto L_0x0be5
            r2 = 3
            r0 = r31
            r0.add(r5)
            r0 = r32
            if (r1 == r2) goto L_0x0bdc
            long r0 = r0.A00
            long r0 = r0 + r6
            r2 = r32
            r2.A00 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigrationManager/handleMigrationPhase/migration failed; migration.name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x0015
            r0 = r30
            r0.add(r4)
            goto L_0x0015
        L_0x00e7:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x00fb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = "; stale and needs rollback, skipping."
            goto L_0x00a6
        L_0x00fb:
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x010f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = "; already migrated, skipping."
            goto L_0x00a6
        L_0x010f:
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x012a
            boolean r0 = r5.A0I()
            if (r0 != 0) goto L_0x012a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = "; migration exceeds retry count; mark it as stuck and skip."
            goto L_0x00a6
        L_0x012a:
            boolean r0 = r5.A0B()
            if (r0 != 0) goto L_0x013f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = "; not enough storage to migrate, skipping."
            goto L_0x00a6
        L_0x013f:
            r5.A0C()
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x01bc
            java.util.HashSet r0 = r5.A09()
            java.util.Iterator r6 = r0.iterator()
        L_0x0150:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            r0 = r57
            X.1DK r0 = r0.A06
            X.1a4 r3 = r0.A01(r5)
            if (r3 != 0) goto L_0x0186
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = ";  has a dependency '"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = "' - not found, skipping."
        L_0x017b:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0150
        L_0x0186:
            boolean r0 = r3.A0D()
            java.lang.String r1 = "; has a dependency '"
            if (r0 != 0) goto L_0x01a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r0 = "' - not migrated, not ready."
            goto L_0x017b
        L_0x01a2:
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r0 = "' - stale, not ready."
            goto L_0x017b
        L_0x01bc:
            java.lang.String r28 = "DatabaseMigration/afterMigration/error; name="
            java.lang.String r27 = "; time spent="
            java.lang.String r26 = "; current_index="
            boolean r0 = r5.A0F()
            java.lang.String r2 = "DatabaseMigration/doMigration/begin; name="
            r3 = 0
            if (r0 == 0) goto L_0x01ef
            X.190 r1 = r5.A01
            java.lang.String r0 = "db-migration-stale"
            r1.A0G(r0, r4, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = " is stale, should be rolled back first."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01e9:
            r22 = 4
        L_0x01eb:
            r1 = r22
            goto L_0x00b0
        L_0x01ef:
            X.1La r15 = r5.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "migration_stats_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.String r6 = r15.A02(r0)
            java.lang.String r8 = "retry_count"
            java.lang.String r9 = "migration_time_spent"
            java.lang.String r10 = "db_size_change"
            java.lang.String r11 = "row_skipped"
            java.lang.String r0 = "row_processed"
            if (r6 != 0) goto L_0x0286
            X.2fZ r3 = new X.2fZ
            r3.<init>()
        L_0x0217:
            long r0 = r3.A02
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0225
            long r0 = r5.A03()
            r3.A02 = r0
        L_0x0225:
            X.1Cd r0 = r5.A02
            r56 = r0
            r56.A06()
            java.io.File r0 = r0.A03
            r55 = r0
            long r18 = r55.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = "; before_size="
            r6.append(r0)
            r0 = r18
            r6.append(r0)
            java.lang.String r0 = "; start_index="
            r6.append(r0)
            java.lang.String r24 = r5.A08()
            r0 = -1
            r2 = r24
            long r0 = r15.A01(r2, r0)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = 0
            X.1Ez r23 = new X.1Ez
            r0 = r23
            r0.<init>((boolean) r6)
            r23.A04()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "/before_migrate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            goto L_0x02ea
        L_0x0286:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02ce }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x02ce }
            X.2fZ r3 = new X.2fZ     // Catch:{ JSONException -> 0x02ce }
            r3.<init>()     // Catch:{ JSONException -> 0x02ce }
            boolean r1 = r7.has(r0)     // Catch:{ JSONException -> 0x02ce }
            if (r1 == 0) goto L_0x029c
            long r0 = r7.getLong(r0)     // Catch:{ JSONException -> 0x02ce }
            r3.A03 = r0     // Catch:{ JSONException -> 0x02ce }
        L_0x029c:
            boolean r0 = r7.has(r11)     // Catch:{ JSONException -> 0x02ce }
            if (r0 == 0) goto L_0x02a8
            long r0 = r7.getLong(r11)     // Catch:{ JSONException -> 0x02ce }
            r3.A04 = r0     // Catch:{ JSONException -> 0x02ce }
        L_0x02a8:
            boolean r0 = r7.has(r10)     // Catch:{ JSONException -> 0x02ce }
            if (r0 == 0) goto L_0x02b4
            long r0 = r7.getLong(r10)     // Catch:{ JSONException -> 0x02ce }
            r3.A00 = r0     // Catch:{ JSONException -> 0x02ce }
        L_0x02b4:
            boolean r0 = r7.has(r9)     // Catch:{ JSONException -> 0x02ce }
            if (r0 == 0) goto L_0x02c0
            long r0 = r7.getLong(r9)     // Catch:{ JSONException -> 0x02ce }
            r3.A01 = r0     // Catch:{ JSONException -> 0x02ce }
        L_0x02c0:
            boolean r0 = r7.has(r8)     // Catch:{ JSONException -> 0x02ce }
            if (r0 == 0) goto L_0x0217
            long r0 = r7.getLong(r8)     // Catch:{ JSONException -> 0x02ce }
            r3.A02 = r0     // Catch:{ JSONException -> 0x02ce }
            goto L_0x0217
        L_0x02ce:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to read migration statistics from stored data; reset to default values. Data: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r3)
            X.2fZ r3 = new X.2fZ
            r3.<init>()
            goto L_0x0217
        L_0x02ea:
            boolean r0 = r5.A0B()     // Catch:{ Exception -> 0x03a6 }
            if (r0 == 0) goto L_0x03a2
            boolean r0 = r58.A00()     // Catch:{ Exception -> 0x03a6 }
            if (r0 != 0) goto L_0x0325
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03a6 }
            r1.<init>()     // Catch:{ Exception -> 0x03a6 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x03a6 }
            r1.append(r4)     // Catch:{ Exception -> 0x03a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x03a6 }
            r0 = r58
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x03aa }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x03aa }
        L_0x0312:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x03aa }
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x03aa }
            X.1pX r0 = (X.C37431pX) r0     // Catch:{ Exception -> 0x03aa }
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x03aa }
            if (r0 != 0) goto L_0x0312
            goto L_0x03a2
        L_0x0325:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r5.A00     // Catch:{ Exception -> 0x03a6 }
            if (r0 == r1) goto L_0x0332
            java.lang.String r0 = r5.A05()     // Catch:{ Exception -> 0x03a6 }
            r15.A04(r0, r1)     // Catch:{ Exception -> 0x03a6 }
        L_0x0332:
            r0 = -1
            r7 = r24
            long r8 = r15.A01(r7, r0)     // Catch:{ Exception -> 0x03a6 }
            r0 = 0
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0345
            r7 = r24
            r15.A05(r7, r0)     // Catch:{ Exception -> 0x03a6 }
        L_0x0345:
            boolean r0 = r5 instanceof X.C28581aT     // Catch:{ Exception -> 0x03a6 }
            if (r0 == 0) goto L_0x0365
            r8 = r5
            X.1aT r8 = (X.C28581aT) r8     // Catch:{ Exception -> 0x03a6 }
            X.1aA r7 = r8.A07     // Catch:{ Exception -> 0x03a6 }
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03a6 }
            java.lang.String r0 = "message_label_deprecation_migrated"
            r7.A00(r0, r1)     // Catch:{ Exception -> 0x03a6 }
            X.10I r7 = r8.A08     // Catch:{ Exception -> 0x03a6 }
            r1 = 8
        L_0x035c:
            X.4rM r0 = new X.4rM     // Catch:{ Exception -> 0x03a6 }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x03a6 }
            r7.CGF(r0)     // Catch:{ Exception -> 0x03a6 }
            goto L_0x039f
        L_0x0365:
            boolean r0 = r5 instanceof X.AnonymousClass1aX     // Catch:{ Exception -> 0x03a6 }
            if (r0 == 0) goto L_0x037c
            r8 = r5
            X.1aX r8 = (X.AnonymousClass1aX) r8     // Catch:{ Exception -> 0x03a6 }
            X.1aA r7 = r8.A0A     // Catch:{ Exception -> 0x03a6 }
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03a6 }
            java.lang.String r0 = "message_label_deprecation_migrated"
            r7.A00(r0, r1)     // Catch:{ Exception -> 0x03a6 }
            X.10I r7 = r8.A0B     // Catch:{ Exception -> 0x03a6 }
            r1 = 4
            goto L_0x035c
        L_0x037c:
            boolean r0 = r5 instanceof X.AnonymousClass1aY     // Catch:{ Exception -> 0x03a6 }
            if (r0 == 0) goto L_0x0393
            r8 = r5
            X.1aY r8 = (X.AnonymousClass1aY) r8     // Catch:{ Exception -> 0x03a6 }
            X.1aA r7 = r8.A06     // Catch:{ Exception -> 0x03a6 }
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03a6 }
            java.lang.String r0 = "message_label_deprecation_migrated"
            r7.A00(r0, r1)     // Catch:{ Exception -> 0x03a6 }
            X.10I r7 = r8.A07     // Catch:{ Exception -> 0x03a6 }
            r1 = 0
            goto L_0x035c
        L_0x0393:
            boolean r0 = r5 instanceof X.AnonymousClass1aZ     // Catch:{ Exception -> 0x03a6 }
            if (r0 == 0) goto L_0x039f
            r0 = r5
            X.1aZ r0 = (X.AnonymousClass1aZ) r0     // Catch:{ Exception -> 0x03a6 }
            X.1QB r0 = r0.A00     // Catch:{ Exception -> 0x03a6 }
            r0.A0J()     // Catch:{ Exception -> 0x03a6 }
        L_0x039f:
            r21 = 0
            goto L_0x03a4
        L_0x03a2:
            r21 = 1
        L_0x03a4:
            r14 = 0
            goto L_0x03c8
        L_0x03a6:
            r14 = move-exception
            r21 = 0
            goto L_0x03ad
        L_0x03aa:
            r14 = move-exception
            r21 = 1
        L_0x03ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/beforeMigration/error; name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r14)
            X.190 r1 = r5.A01
            java.lang.String r0 = "before-migration"
            A00(r1, r4, r0, r14)
        L_0x03c8:
            r2.A02()
            if (r14 != 0) goto L_0x0b2a
            if (r21 != 0) goto L_0x0b2a
        L_0x03cf:
            boolean r0 = r5.A0B()     // Catch:{ Exception -> 0x0953 }
            if (r0 == 0) goto L_0x0950
            boolean r0 = r58.A00()     // Catch:{ Exception -> 0x0953 }
            if (r0 != 0) goto L_0x03f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0953 }
            r1.<init>()     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name = "
            r1.append(r0)     // Catch:{ Exception -> 0x0953 }
            r1.append(r4)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0953 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0953 }
            goto L_0x0912
        L_0x03f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0953 }
            r1.<init>()     // Catch:{ Exception -> 0x0953 }
            r1.append(r4)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = "/doMigrationInSmallBatch/processBatch"
            r1.append(r0)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0953 }
            X.1Ez r25 = new X.1Ez     // Catch:{ Exception -> 0x0953 }
            r1 = r25
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0953 }
            r25.A04()     // Catch:{ Exception -> 0x0953 }
            boolean r0 = r5 instanceof X.AnonymousClass1a5     // Catch:{ Exception -> 0x0953 }
            if (r0 == 0) goto L_0x0473
            r0 = r56
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A05     // Catch:{ Exception -> 0x0953 }
            int r1 = r0.getWriteHoldCount()     // Catch:{ Exception -> 0x0953 }
            if (r1 > 0) goto L_0x0421
            int r1 = r0.getReadHoldCount()     // Catch:{ Exception -> 0x0953 }
            r0 = 0
            if (r1 != 0) goto L_0x0422
        L_0x0421:
            r0 = 1
        L_0x0422:
            X.C17960vV.A0D(r0)     // Catch:{ Exception -> 0x0953 }
            r56.A06()     // Catch:{ Exception -> 0x0953 }
            r0 = r56
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r0.A04     // Catch:{ Exception -> 0x0953 }
            r11.lock()     // Catch:{ Exception -> 0x0953 }
            X.1au r12 = r56.A05()     // Catch:{ all -> 0x093b }
            java.lang.String r10 = "RenameDeprecatedTablesMigration"
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0931 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0931 }
            java.lang.String r8 = "message_view_old_schema"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0931 }
            r1.<init>()     // Catch:{ all -> 0x0931 }
            java.lang.String r0 = "DROP VIEW IF EXISTS "
            r1.append(r0)     // Catch:{ all -> 0x0931 }
            r1.append(r8)     // Catch:{ all -> 0x0931 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0931 }
            java.lang.String r2 = "dropViewIfExistsWithoutStatement"
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r8)     // Catch:{ all -> 0x0931 }
            java.lang.String r0 = "DROP_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ all -> 0x0931 }
            java.lang.String r0 = X.AnonymousClass2TU.A00(r10, r2, r0)     // Catch:{ all -> 0x0931 }
            r9.A0E(r7, r0)     // Catch:{ all -> 0x0931 }
            r12.close()     // Catch:{ all -> 0x093b }
            r11.unlock()     // Catch:{ Exception -> 0x0953 }
            X.2fY r2 = new X.2fY     // Catch:{ Exception -> 0x0953 }
            r2.<init>()     // Catch:{ Exception -> 0x0953 }
            r0 = 0
            r2.A04 = r0     // Catch:{ Exception -> 0x0953 }
            r2.A01 = r6     // Catch:{ Exception -> 0x0953 }
            goto L_0x0897
        L_0x0473:
            boolean r0 = r5 instanceof X.AnonymousClass1a7     // Catch:{ Exception -> 0x0953 }
            if (r0 == 0) goto L_0x04cd
            X.2fY r2 = new X.2fY     // Catch:{ Exception -> 0x0953 }
            r2.<init>()     // Catch:{ Exception -> 0x0953 }
            r0 = 0
            r2.A04 = r0     // Catch:{ Exception -> 0x0953 }
            r2.A01 = r6     // Catch:{ Exception -> 0x0953 }
            X.1au r17 = r56.A05()     // Catch:{ Exception -> 0x0953 }
            java.lang.String[] r16 = X.C22601Cm.A0E     // Catch:{ all -> 0x0940 }
            r10 = 22
            r9 = 0
        L_0x048b:
            r0 = r16[r9]     // Catch:{ all -> 0x0940 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0940 }
            r1.<init>()     // Catch:{ all -> 0x0940 }
            r1.append(r0)     // Catch:{ all -> 0x0940 }
            java.lang.String r0 = "_old"
            r1.append(r0)     // Catch:{ all -> 0x0940 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0940 }
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0940 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0940 }
            java.lang.String r0 = "table"
            java.lang.String r13 = X.C28331Zy.A00(r7, r0, r8)     // Catch:{ all -> 0x0940 }
            long r0 = r2.A04     // Catch:{ all -> 0x0940 }
            r11 = 1
            long r0 = r0 + r11
            r2.A04 = r0     // Catch:{ all -> 0x0940 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0940 }
            if (r0 == 0) goto L_0x04bd
            int r9 = r9 + 1
            if (r9 >= r10) goto L_0x0894
            goto L_0x048b
        L_0x04bd:
            java.lang.String r8 = X.C25071Mt.A02(r8)     // Catch:{ all -> 0x0940 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0940 }
            java.lang.String r0 = "DropDeprecatedTablesMigration/DROP_TABLE"
            r7.A0F(r8, r0, r1)     // Catch:{ all -> 0x0940 }
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x0940 }
            goto L_0x0894
        L_0x04cd:
            java.lang.String r42 = "; batchSize="
            java.lang.String r41 = "DatabaseMigration/doMigrationInSmallBatch/error; name="
            X.2fY r2 = new X.2fY     // Catch:{ Exception -> 0x0953 }
            r2.<init>()     // Catch:{ Exception -> 0x0953 }
            X.1a0 r0 = r5.A04     // Catch:{ Exception -> 0x0953 }
            X.0ve r7 = r0.A00     // Catch:{ Exception -> 0x0953 }
            r1 = 607(0x25f, float:8.5E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0953 }
            int r1 = X.C18020vd.A00(r0, r7, r1)     // Catch:{ Exception -> 0x0953 }
            if (r1 <= 0) goto L_0x04ff
            boolean r0 = r5 instanceof X.C28581aT     // Catch:{ Exception -> 0x0953 }
            r40 = r0
            r0 = 32
            int r8 = java.lang.Math.min(r0, r1)     // Catch:{ Exception -> 0x0953 }
        L_0x04ee:
            r2.A02 = r8     // Catch:{ Exception -> 0x0953 }
            java.lang.String r39 = r5.A08()     // Catch:{ Exception -> 0x0953 }
            r0 = -1
            r7 = r39
            long r0 = r15.A01(r7, r0)     // Catch:{ Exception -> 0x0953 }
            r2.A04 = r0     // Catch:{ Exception -> 0x0953 }
            goto L_0x0506
        L_0x04ff:
            boolean r0 = r5 instanceof X.C28581aT     // Catch:{ Exception -> 0x0953 }
            r40 = r0
            r8 = 32
            goto L_0x04ee
        L_0x0506:
            r16 = 0
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x051a
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch/start index was not set to 0."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0953 }
            r0 = r16
            r2.A04 = r0     // Catch:{ Exception -> 0x0953 }
            r7 = r39
            r15.A05(r7, r0)     // Catch:{ Exception -> 0x0953 }
        L_0x051a:
            int r1 = r2.A01     // Catch:{ Exception -> 0x0953 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0953 }
            int r1 = r1 + r0
            int r0 = r2.A00     // Catch:{ Exception -> 0x0953 }
            int r1 = r1 + r0
            int r0 = r2.A02     // Catch:{ Exception -> 0x0953 }
            if (r1 >= r0) goto L_0x0897
            boolean r0 = r58.A00()     // Catch:{ Exception -> 0x0953 }
            if (r0 != 0) goto L_0x0542
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0953 }
            r1.<init>()     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x0953 }
            r1.append(r4)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0953 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0953 }
            goto L_0x0897
        L_0x0542:
            r56.A06()     // Catch:{ Exception -> 0x0953 }
            r0 = r56
            X.1Cm r0 = r0.A02     // Catch:{ Exception -> 0x0953 }
            X.1Ev r0 = r0.Bbw()     // Catch:{ Exception -> 0x0953 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ Exception -> 0x0953 }
            boolean r0 = r0.inTransaction()     // Catch:{ Exception -> 0x0953 }
            r12 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Database migration shouldn't be wrapped to a transaction."
            X.C17960vV.A0F(r1, r0)     // Catch:{ Exception -> 0x0953 }
            X.1at r35 = r56.get()     // Catch:{ Exception -> 0x066a }
            long r0 = r2.A04     // Catch:{ all -> 0x0660 }
            if (r40 == 0) goto L_0x0584
            r0 = r5
            X.1aT r0 = (X.C28581aT) r0     // Catch:{ all -> 0x0660 }
            X.0zA r1 = r0.A00     // Catch:{ all -> 0x0660 }
            boolean r7 = r1.A07()     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x065c
            X.0zA r0 = r0.A01     // Catch:{ all -> 0x0660 }
            boolean r7 = r0.A07()     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x065c
            r0.A03()     // Catch:{ all -> 0x0660 }
            r1.A03()     // Catch:{ all -> 0x0660 }
            java.lang.String r0 = "getLabeledMessageRowIds"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0660 }
            r1.<init>(r0)     // Catch:{ all -> 0x0660 }
        L_0x0583:
            throw r1     // Catch:{ all -> 0x0660 }
        L_0x0584:
            boolean r7 = r5 instanceof X.AnonymousClass1aX     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x0598
            r0 = r5
            X.1aX r0 = (X.AnonymousClass1aX) r0     // Catch:{ all -> 0x0660 }
            X.0zA r0 = r0.A01     // Catch:{ all -> 0x0660 }
            r0.A03()     // Catch:{ all -> 0x0660 }
            java.lang.String r0 = "getLabeledMessageRowIds"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0660 }
            r1.<init>(r0)     // Catch:{ all -> 0x0660 }
            goto L_0x0583
        L_0x0598:
            boolean r7 = r5 instanceof X.AnonymousClass1aY     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x05bd
            r0 = r5
            X.1aY r0 = (X.AnonymousClass1aY) r0     // Catch:{ all -> 0x0660 }
            X.0zA r1 = r0.A00     // Catch:{ all -> 0x0660 }
            boolean r7 = r1.A07()     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x065c
            X.0zA r0 = r0.A01     // Catch:{ all -> 0x0660 }
            boolean r7 = r0.A07()     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x065c
            r0.A03()     // Catch:{ all -> 0x0660 }
            r1.A03()     // Catch:{ all -> 0x0660 }
            java.lang.String r0 = "getLabeledMessageRowIds"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0660 }
            r1.<init>(r0)     // Catch:{ all -> 0x0660 }
            goto L_0x0583
        L_0x05bd:
            boolean r7 = r5 instanceof X.AnonymousClass1aZ     // Catch:{ all -> 0x0660 }
            if (r7 == 0) goto L_0x065c
            r7 = r5
            X.1aZ r7 = (X.AnonymousClass1aZ) r7     // Catch:{ all -> 0x0660 }
            java.util.Map r9 = r7.A01     // Catch:{ all -> 0x0660 }
            r36 = r9
            r36.clear()     // Catch:{ all -> 0x0660 }
            r9 = r35
            X.1av r9 = (X.C28801av) r9     // Catch:{ Exception -> 0x064f }
            X.1Ev r11 = r9.A02     // Catch:{ Exception -> 0x064f }
            java.lang.String r10 = X.C50632Ve.A00     // Catch:{ Exception -> 0x064f }
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ Exception -> 0x064f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x064f }
            r9[r6] = r0     // Catch:{ Exception -> 0x064f }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x064f }
            r9[r12] = r0     // Catch:{ Exception -> 0x064f }
            java.lang.String r0 = "MIGRATION_GET_PRE_BATCH_QUERY_FOR_message_fts"
            android.database.Cursor r9 = r11.A0A(r10, r0, r9)     // Catch:{ Exception -> 0x064f }
            java.lang.String r0 = "chat_row_id"
            int r34 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0643 }
            java.lang.String r0 = "_id"
            int r33 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0643 }
        L_0x05f4:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0643 }
            if (r0 == 0) goto L_0x063f
            X.1QB r10 = r7.A00     // Catch:{ Exception -> 0x0638 }
            r1 = r34
            r0 = r33
            X.206 r1 = r10.A0A(r9, r1, r0)     // Catch:{ Exception -> 0x0638 }
            if (r1 == 0) goto L_0x05f4
            boolean r0 = X.AnonymousClass1QB.A06(r10, r1)     // Catch:{ Exception -> 0x0638 }
            if (r0 != 0) goto L_0x05f4
            java.lang.String r11 = r10.A0F(r1)     // Catch:{ Exception -> 0x0638 }
            int r13 = r11.length()     // Catch:{ Exception -> 0x0638 }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r13 >= r0) goto L_0x05f4
            java.util.regex.Pattern r0 = X.AnonymousClass2W6.A00     // Catch:{ Exception -> 0x0638 }
            java.util.regex.Matcher r0 = r0.matcher(r11)     // Catch:{ Exception -> 0x0638 }
            boolean r0 = r0.find()     // Catch:{ Exception -> 0x0638 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05f4
            X.0vb r0 = r10.A04     // Catch:{ Exception -> 0x0638 }
            java.lang.String r10 = X.C20103A7h.A01(r0, r11)     // Catch:{ Exception -> 0x0638 }
            long r0 = r1.A0y     // Catch:{ Exception -> 0x0638 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0638 }
            r0 = r36
            r0.put(r1, r10)     // Catch:{ Exception -> 0x0638 }
            goto L_0x05f4
        L_0x0638:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/single fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0643 }
            goto L_0x05f4
        L_0x063f:
            r9.close()     // Catch:{ Exception -> 0x064f }
            goto L_0x065c
        L_0x0643:
            r0 = move-exception
            if (r9 == 0) goto L_0x064e
            r9.close()     // Catch:{ all -> 0x064a }
            goto L_0x064e
        L_0x064a:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ Exception -> 0x064f }
        L_0x064e:
            throw r0     // Catch:{ Exception -> 0x064f }
        L_0x064f:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/inner fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0656 }
            goto L_0x065c
        L_0x0656:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/failed to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0660 }
        L_0x065c:
            r35.close()     // Catch:{ Exception -> 0x066a }
            goto L_0x0691
        L_0x0660:
            r1 = move-exception
            r35.close()     // Catch:{ all -> 0x0665 }
            goto L_0x0669
        L_0x0665:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x066a }
        L_0x0669:
            throw r1     // Catch:{ Exception -> 0x066a }
        L_0x066a:
            r9 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0953 }
            r7.<init>()     // Catch:{ Exception -> 0x0953 }
            r0 = r41
            r7.append(r0)     // Catch:{ Exception -> 0x0953 }
            r7.append(r4)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = "; failed preBatchWork; startIndex="
            r7.append(r0)     // Catch:{ Exception -> 0x0953 }
            long r0 = r2.A04     // Catch:{ Exception -> 0x0953 }
            r7.append(r0)     // Catch:{ Exception -> 0x0953 }
            r0 = r42
            r7.append(r0)     // Catch:{ Exception -> 0x0953 }
            r7.append(r8)     // Catch:{ Exception -> 0x0953 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0953 }
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ Exception -> 0x0953 }
        L_0x0691:
            X.1au r38 = r56.A05()     // Catch:{ Exception -> 0x0953 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0946 }
            r7.<init>()     // Catch:{ all -> 0x0946 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch; name="
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            r7.append(r4)     // Catch:{ all -> 0x0946 }
            java.lang.String r0 = "; startIndex="
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            long r0 = r2.A04     // Catch:{ all -> 0x0946 }
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            r0 = r42
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            r7.append(r8)     // Catch:{ all -> 0x0946 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0946 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0946 }
            java.util.concurrent.atomic.AtomicBoolean r33 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0946 }
            r0 = r33
            r0.<init>(r6)     // Catch:{ all -> 0x0946 }
            X.2fY r11 = new X.2fY     // Catch:{ all -> 0x0946 }
            r11.<init>()     // Catch:{ all -> 0x0946 }
            X.2uR r9 = new X.2uR     // Catch:{ all -> 0x07e2 }
            r9.<init>(r5, r0, r12)     // Catch:{ all -> 0x07e2 }
            r7 = r38
            X.1av r7 = (X.C28801av) r7     // Catch:{ all -> 0x07e2 }
            X.1Ev r1 = r7.A02     // Catch:{ all -> 0x07e2 }
            X.1Ci r0 = r7.A01     // Catch:{ all -> 0x07e2 }
            X.1xA r37 = r7.A00(r9, r0, r1)     // Catch:{ all -> 0x07e2 }
            long r0 = r2.A04     // Catch:{ all -> 0x07d8 }
            r7 = r38
            android.database.Cursor r9 = r5.A04(r7, r8, r0)     // Catch:{ all -> 0x07d8 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x07cc }
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x07cc }
            if (r8 != 0) goto L_0x06f5
            r37.A00()     // Catch:{ all -> 0x07cc }
            r9.close()     // Catch:{ all -> 0x07d8 }
            r37.close()     // Catch:{ all -> 0x07e2 }
            goto L_0x0890
        L_0x06f5:
            if (r40 != 0) goto L_0x079e
            boolean r0 = r5 instanceof X.AnonymousClass1aX     // Catch:{ all -> 0x07cc }
            if (r0 != 0) goto L_0x079e
            boolean r0 = r5 instanceof X.AnonymousClass1aY     // Catch:{ all -> 0x07cc }
            if (r0 != 0) goto L_0x079e
            r1 = r5
            X.1aZ r1 = (X.AnonymousClass1aZ) r1     // Catch:{ all -> 0x07cc }
            int r0 = r9.getCount()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0796 }
            r36 = 1
            if (r0 == r12) goto L_0x070c
            r36 = 0
        L_0x070c:
            X.1QB r0 = r1.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r54 = r0
            java.util.Map r0 = r1.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r45 = r0
            r46 = 5
            r0 = -5
            X.2pl r0 = X.C61482pl.A00(r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            java.lang.String r1 = "_id"
            int r35 = r9.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            java.lang.String r1 = "chat_row_id"
            int r34 = r9.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r7 = 0
        L_0x0728:
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            if (r1 == 0) goto L_0x077d
            r10 = r54
            r1 = r34
            r0 = r35
            X.206 r10 = r10.A0A(r9, r1, r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            if (r10 != 0) goto L_0x074c
            int r7 = r7 + 1
            long r52 = r9.getLong(r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r49 = -9223372036854775808
            r51 = -6
            X.2pl r0 = new X.2pl     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r48 = r0
            r48.<init>(r49, r51, r52)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            goto L_0x0728
        L_0x074c:
            r43 = r54
            r44 = r10
            r48 = r12
            X.2pl r0 = r43.A09(r44, r45, r46, r48)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            int r1 = r0.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r13 = r1
            r1 = -6
            if (r13 != r1) goto L_0x0771
            long r0 = r10.A0y     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r51 = r0
            long r0 = r10.A0x     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r43 = r0
            X.2pl r0 = new X.2pl     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r48 = r0
            r49 = r51
            r51 = r12
            r52 = r43
            r48.<init>(r49, r51, r52)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
        L_0x0771:
            r1 = r54
            X.1Q8 r1 = r1.A05     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            X.205 r10 = r10.A0v     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r1.A01(r10)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            int r7 = r7 + 1
            goto L_0x0728
        L_0x077d:
            long r0 = r0.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            X.2fY r10 = new X.2fY     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.<init>()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.A03 = r6     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.A00 = r6     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.A02 = r6     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.A04 = r0     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            r10.A01 = r7     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x078f }
            goto L_0x07af
        L_0x078f:
            if (r36 == 0) goto L_0x0796
            java.lang.String r0 = "FtsDatabaseMigration/skipping single row"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07cc }
        L_0x0796:
            X.2fY r10 = new X.2fY     // Catch:{ all -> 0x07cc }
            r0 = -1
            r10.<init>()     // Catch:{ all -> 0x07cc }
            goto L_0x07a5
        L_0x079e:
            X.2fY r10 = new X.2fY     // Catch:{ all -> 0x07cc }
            r0 = -1
            r10.<init>()     // Catch:{ all -> 0x07cc }
        L_0x07a5:
            r10.A03 = r6     // Catch:{ all -> 0x07cc }
            r10.A00 = r6     // Catch:{ all -> 0x07cc }
            r10.A02 = r6     // Catch:{ all -> 0x07cc }
            r10.A04 = r0     // Catch:{ all -> 0x07cc }
            r10.A01 = r6     // Catch:{ all -> 0x07cc }
        L_0x07af:
            r11 = r10
            long r0 = r10.A04     // Catch:{ all -> 0x07ca }
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x07c3
            r7 = r39
            r15.A05(r7, r0)     // Catch:{ all -> 0x07ca }
            r37.A00()     // Catch:{ all -> 0x07ca }
            r0 = r33
            r0.set(r12)     // Catch:{ all -> 0x07ca }
        L_0x07c3:
            r9.close()     // Catch:{ all -> 0x07d8 }
            r37.close()     // Catch:{ all -> 0x07e2 }
            goto L_0x07f4
        L_0x07ca:
            r0 = move-exception
            goto L_0x07cf
        L_0x07cc:
            r0 = move-exception
            if (r9 == 0) goto L_0x07d7
        L_0x07cf:
            r9.close()     // Catch:{ all -> 0x07d3 }
            goto L_0x07d7
        L_0x07d3:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ all -> 0x07d8 }
        L_0x07d7:
            throw r0     // Catch:{ all -> 0x07d8 }
        L_0x07d8:
            r1 = move-exception
            r37.close()     // Catch:{ all -> 0x07dd }
            goto L_0x07e1
        L_0x07dd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x07e2 }
        L_0x07e1:
            throw r1     // Catch:{ all -> 0x07e2 }
        L_0x07e2:
            r7 = move-exception
            boolean r9 = r5.A0J(r7, r8)     // Catch:{ all -> 0x0946 }
            r0 = -1
            if (r9 == 0) goto L_0x0945
            r7 = r33
            r7.set(r6)     // Catch:{ all -> 0x0946 }
            r11.A04 = r0     // Catch:{ all -> 0x0946 }
            r11.A01 = r6     // Catch:{ all -> 0x0946 }
        L_0x07f4:
            boolean r0 = r33.get()     // Catch:{ all -> 0x0946 }
            if (r0 == 0) goto L_0x0824
            long r0 = r11.A04     // Catch:{ all -> 0x0946 }
            r2.A04 = r0     // Catch:{ all -> 0x0946 }
            r7 = r39
            r15.A05(r7, r0)     // Catch:{ all -> 0x0946 }
            int r7 = r2.A01     // Catch:{ all -> 0x0946 }
            int r0 = r11.A01     // Catch:{ all -> 0x0946 }
            int r7 = r7 + r0
            r2.A01 = r7     // Catch:{ all -> 0x0946 }
            int r1 = r2.A03     // Catch:{ all -> 0x0946 }
            int r0 = r11.A03     // Catch:{ all -> 0x0946 }
            int r1 = r1 + r0
            r2.A03 = r1     // Catch:{ all -> 0x0946 }
            int r0 = r2.A00     // Catch:{ all -> 0x0946 }
            int r9 = r11.A00     // Catch:{ all -> 0x0946 }
            int r0 = r0 + r9
            r2.A00 = r0     // Catch:{ all -> 0x0946 }
            int r9 = r2.A02     // Catch:{ all -> 0x0946 }
            int r9 = r9 - r7
            int r9 = r9 - r1
            int r9 = r9 - r0
            int r0 = r8 * 2
            int r8 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x0946 }
            goto L_0x088b
        L_0x0824:
            if (r8 != r12) goto L_0x0889
            long r0 = r2.A04     // Catch:{ SQLException -> 0x0858 }
            r7 = r38
            android.database.Cursor r7 = r5.A04(r7, r12, r0)     // Catch:{ SQLException -> 0x0858 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x084c }
            if (r0 == 0) goto L_0x0848
            long r9 = r2.A04     // Catch:{ all -> 0x084c }
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x084c }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x084c }
            int r0 = r0 - r12
            long r0 = (long) r0     // Catch:{ all -> 0x084c }
            long r0 = java.lang.Math.max(r9, r0)     // Catch:{ all -> 0x084c }
            r2.A04 = r0     // Catch:{ all -> 0x084c }
        L_0x0848:
            r7.close()     // Catch:{ SQLException -> 0x0858 }
            goto L_0x0858
        L_0x084c:
            r1 = move-exception
            if (r7 == 0) goto L_0x0857
            r7.close()     // Catch:{ all -> 0x0853 }
            goto L_0x0857
        L_0x0853:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLException -> 0x0858 }
        L_0x0857:
            throw r1     // Catch:{ SQLException -> 0x0858 }
        L_0x0858:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0946 }
            r7.<init>()     // Catch:{ all -> 0x0946 }
            r0 = r41
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            r7.append(r4)     // Catch:{ all -> 0x0946 }
            java.lang.String r0 = "; failed record - skipping row; index="
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            long r0 = r2.A04     // Catch:{ all -> 0x0946 }
            r7.append(r0)     // Catch:{ all -> 0x0946 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0946 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0946 }
            long r0 = r2.A04     // Catch:{ all -> 0x0946 }
            r9 = 1
            long r0 = r0 + r9
            r2.A04 = r0     // Catch:{ all -> 0x0946 }
            int r7 = r2.A03     // Catch:{ all -> 0x0946 }
            int r7 = r7 + 1
            r2.A03 = r7     // Catch:{ all -> 0x0946 }
            r7 = r39
            r15.A05(r7, r0)     // Catch:{ all -> 0x0946 }
            goto L_0x088b
        L_0x0889:
            int r8 = r8 / 2
        L_0x088b:
            r38.close()     // Catch:{ Exception -> 0x0953 }
            goto L_0x051a
        L_0x0890:
            r38.close()     // Catch:{ Exception -> 0x0953 }
            goto L_0x0897
        L_0x0894:
            r17.close()     // Catch:{ Exception -> 0x0953 }
        L_0x0897:
            int r0 = r2.A01     // Catch:{ Exception -> 0x0953 }
            long r7 = (long) r0     // Catch:{ Exception -> 0x0953 }
            long r0 = r3.A03     // Catch:{ Exception -> 0x0953 }
            long r0 = r0 + r7
            r3.A03 = r0     // Catch:{ Exception -> 0x0953 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0953 }
            long r7 = (long) r0     // Catch:{ Exception -> 0x0953 }
            long r0 = r3.A04     // Catch:{ Exception -> 0x0953 }
            long r0 = r0 + r7
            r3.A04 = r0     // Catch:{ Exception -> 0x0953 }
            X.C28381a4.A00(r5, r3)     // Catch:{ Exception -> 0x0953 }
            int r1 = r2.A01     // Catch:{ Exception -> 0x0953 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0953 }
            int r1 = r1 + r0
            int r0 = r2.A00     // Catch:{ Exception -> 0x0953 }
            int r1 = r1 + r0
            r10 = 0
            if (r1 <= 0) goto L_0x08b6
            r10 = 1
        L_0x08b6:
            r25.A02()     // Catch:{ Exception -> 0x0953 }
            r0 = -1
            r2 = r24
            r15.A01(r2, r0)     // Catch:{ Exception -> 0x0955 }
            r23.A01()     // Catch:{ Exception -> 0x0955 }
            if (r10 == 0) goto L_0x090d
            long r0 = r25.A01()     // Catch:{ Exception -> 0x0955 }
            X.1a0 r2 = r5.A04     // Catch:{ Exception -> 0x0955 }
            X.0ve r8 = r2.A00     // Catch:{ Exception -> 0x0955 }
            r7 = 608(0x260, float:8.52E-43)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ Exception -> 0x0955 }
            int r2 = X.C18020vd.A00(r2, r8, r7)     // Catch:{ Exception -> 0x0955 }
            int r2 = r2 * 1000
            if (r2 <= 0) goto L_0x090d
            long r7 = (long) r2     // Catch:{ Exception -> 0x0955 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x090d
            X.190 r9 = r5.A01     // Catch:{ Exception -> 0x0955 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0955 }
            r7.<init>()     // Catch:{ Exception -> 0x0955 }
            java.lang.String r2 = "db-long-running-process-batch/"
            r7.append(r2)     // Catch:{ Exception -> 0x0955 }
            r7.append(r4)     // Catch:{ Exception -> 0x0955 }
            java.lang.String r8 = r7.toString()     // Catch:{ Exception -> 0x0955 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0955 }
            r7.<init>()     // Catch:{ Exception -> 0x0955 }
            java.lang.String r2 = "name="
            r7.append(r2)     // Catch:{ Exception -> 0x0955 }
            r7.append(r4)     // Catch:{ Exception -> 0x0955 }
            java.lang.String r2 = ", duration="
            r7.append(r2)     // Catch:{ Exception -> 0x0955 }
            r7.append(r0)     // Catch:{ Exception -> 0x0955 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0955 }
            r9.A0G(r8, r0, r6)     // Catch:{ Exception -> 0x0955 }
        L_0x090d:
            r21 = 0
            if (r10 != 0) goto L_0x03cf
            goto L_0x096c
        L_0x0912:
            r0 = r58
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x092d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x092d }
        L_0x091a:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x092d }
            if (r0 == 0) goto L_0x0950
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x092d }
            X.1pX r0 = (X.C37431pX) r0     // Catch:{ Exception -> 0x092d }
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x092d }
            if (r0 != 0) goto L_0x091a
            goto L_0x0950
        L_0x092d:
            r14 = move-exception
            r21 = 1
            goto L_0x0958
        L_0x0931:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0936 }
            goto L_0x093a
        L_0x0936:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x093b }
        L_0x093a:
            throw r1     // Catch:{ all -> 0x093b }
        L_0x093b:
            r0 = move-exception
            r11.unlock()     // Catch:{ Exception -> 0x0953 }
            throw r0     // Catch:{ Exception -> 0x0953 }
        L_0x0940:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x094b }
            goto L_0x094f
        L_0x0945:
            throw r7     // Catch:{ all -> 0x0946 }
        L_0x0946:
            r1 = move-exception
            r38.close()     // Catch:{ all -> 0x094b }
            goto L_0x094f
        L_0x094b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0953 }
        L_0x094f:
            throw r1     // Catch:{ Exception -> 0x0953 }
        L_0x0950:
            r21 = 1
            goto L_0x096c
        L_0x0953:
            r14 = move-exception
            goto L_0x0958
        L_0x0955:
            r14 = move-exception
            r21 = 0
        L_0x0958:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/doMigration/error; name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r14)
        L_0x096c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DatabaseMigration/doMigration/migrated; name="
            r2.append(r0)
            r2.append(r4)
            r0 = r26
            r2.append(r0)
            r0 = -1
            r7 = r24
            long r0 = r15.A01(r7, r0)
            r2.append(r0)
            r0 = r27
            r2.append(r0)
            long r0 = r23.A02()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r14 != 0) goto L_0x0b2a
            if (r21 != 0) goto L_0x0b2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "/after_migrate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Ez r7 = new X.1Ez
            r7.<init>((java.lang.String) r0)
            boolean r0 = r5 instanceof X.C28581aT     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r0 == 0) goto L_0x0a2f
            r11 = r5
            X.1aT r11 = (X.C28581aT) r11     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.10I r2 = r11.A08     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1 = 9
            X.4rM r0 = new X.4rM     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0.<init>(r11, r1)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r2.CGF(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aR r10 = r11.A05     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.0vl r9 = r10.A01     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r8 = r9.getValue()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.String r2 = "label_message_count"
            r0 = -1
            long r16 = r8.getLong(r2, r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r1 = r9.getValue()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.String r0 = "stars_user_initiated"
            boolean r1 = r1.getBoolean(r0, r6)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aQ r0 = r11.A06     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            long r12 = r10.A00()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r1 != 0) goto L_0x0ac9
            X.00H r0 = r0.A00     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r2 = r0.get()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.18K r2 = (X.AnonymousClass18K) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.2Fv r1 = new X.2Fv     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.<init>()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A00 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A03 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A02 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r2.CC7(r1)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b27
            java.lang.Object r0 = r9.getValue()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.String r1 = "eligible_for_phase3"
            r0 = 1
            r2.putBoolean(r1, r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r2.apply()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            goto L_0x0b27
        L_0x0a2f:
            boolean r0 = r5 instanceof X.AnonymousClass1aX     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r0 == 0) goto L_0x0a84
            r2 = r5
            X.1aX r2 = (X.AnonymousClass1aX) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.0zA r0 = r2.A00     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            boolean r0 = r0.A07()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r0 == 0) goto L_0x0a51
            X.0zA r0 = r2.A02     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            boolean r0 = r0.A07()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r0 == 0) goto L_0x0a51
            X.10I r6 = r2.A0B     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1 = 2
            X.4rM r0 = new X.4rM     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0.<init>(r2, r1)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r6.CGF(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
        L_0x0a51:
            X.1KB r1 = r2.A03     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.4rM r0 = new X.4rM     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r6 = r22
            r0.<init>(r2, r6)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A0J(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aQ r9 = r2.A09     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aR r8 = r2.A07     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.0vl r0 = r8.A01     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r6 = r0.getValue()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.String r2 = "label_message_count"
            r0 = -1
            long r10 = r6.getLong(r2, r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            long r12 = r8.A00()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.00H r0 = r9.A00     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r2 = r0.get()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.18K r2 = (X.AnonymousClass18K) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.2Fv r1 = new X.2Fv     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.<init>()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0 = 7
            goto L_0x0abe
        L_0x0a84:
            boolean r0 = r5 instanceof X.AnonymousClass1aY     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            if (r0 == 0) goto L_0x0b27
            r2 = r5
            X.1aY r2 = (X.AnonymousClass1aY) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.10I r6 = r2.A07     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1 = 48
            X.3Bq r0 = new X.3Bq     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0.<init>(r2, r1)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r6.CGF(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aQ r9 = r2.A05     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.1aR r8 = r2.A04     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.0vl r0 = r8.A01     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r6 = r0.getValue()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.String r2 = "label_message_count"
            r0 = -1
            long r10 = r6.getLong(r2, r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            long r12 = r8.A00()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.00H r0 = r9.A00     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r2 = r0.get()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.18K r2 = (X.AnonymousClass18K) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.2Fv r1 = new X.2Fv     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.<init>()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0 = 15
        L_0x0abe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A00 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            goto L_0x0ae2
        L_0x0ac9:
            X.00H r0 = r0.A00     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Object r2 = r0.get()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.18K r2 = (X.AnonymousClass18K) r2     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            X.2Fv r1 = new X.2Fv     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.<init>()     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A00 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
        L_0x0ae2:
            r1.A03 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A02 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r1.A01 = r0     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            r2.CC7(r1)     // Catch:{ 1DO -> 0x0af5, Exception -> 0x0b0b }
            goto L_0x0b27
        L_0x0af5:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r28
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r14)
            goto L_0x0b27
        L_0x0b0b:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r28
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r14)
            X.190 r1 = r5.A01
            java.lang.String r0 = "after-migration"
            A00(r1, r4, r0, r14)
        L_0x0b27:
            r7.A02()
        L_0x0b2a:
            r56.A06()
            long r0 = r55.length()
            long r8 = r0 - r18
            long r6 = r3.A00
            long r6 = r6 + r8
            r3.A00 = r6
            X.C28381a4.A00(r5, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "DatabaseMigration/doMigration; name="
            r2.append(r6)
            r2.append(r4)
            java.lang.String r6 = "; db size:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = " increase:"
            r2.append(r6)
            double r6 = (double) r0
            r0 = r18
            double r8 = (double) r0
            double r6 = r6 / r8
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r14 != 0) goto L_0x0b8e
            if (r21 != 0) goto L_0x01e9
            long r0 = r3.A04
            double r6 = (double) r0
            long r2 = r3.A03
            double r0 = (double) r2
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 * r2
            double r1 = java.lang.Math.floor(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b89
            X.190 r2 = r5.A01
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "skipped"
            A00(r2, r4, r0, r1)
        L_0x0b89:
            r5.A0A()
            goto L_0x01eb
        L_0x0b8e:
            long r0 = r3.A02
            r6 = 1
            long r0 = r0 + r6
            r3.A02 = r0
            X.C28381a4.A00(r5, r3)
            java.lang.String r2 = r5.A06()
            long r0 = r5.A03()
            long r0 = r0 + r6
            r15.A05(r2, r0)
            java.lang.String r2 = r5.A07()
            r0 = 0
            r15.A05(r2, r0)
            java.lang.String r0 = "receipt_device"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "stuck"
            if (r0 != 0) goto L_0x0bc0
            java.lang.String r0 = "receipt_user"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0bd1
        L_0x0bc0:
            long r6 = r5.A03()
            r1 = 20
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0bd1
        L_0x0bca:
            X.190 r0 = r5.A01
            A00(r0, r4, r3, r14)
            goto L_0x01e9
        L_0x0bd1:
            long r6 = r5.A03()
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e9
            goto L_0x0bca
        L_0x0bdc:
            long r1 = r0.A02
            long r1 = r1 + r6
            r0.A02 = r1
            r20 = 1
            goto L_0x0015
        L_0x0be5:
            r0 = r31
            r0.add(r5)
            r0 = r32
            long r0 = r0.A01
            long r0 = r0 + r6
            r2 = r32
            r2.A01 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DN.A01(X.2i2, java.util.List):void");
    }

    public int A03(C28381a4 r14, C54322dx r15) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            AnonymousClass1IZ it = this.A06.A00().values().iterator();
            while (it.hasNext()) {
                C28381a4 r2 = (C28381a4) it.next();
                if (r2.A09().contains(r14.A05)) {
                    arrayList.add(r2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C28381a4 r4 = (C28381a4) it2.next();
            int A032 = A03(r4, r15);
            if (A032 != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseMigrationManager/processMigrations; name=");
                sb.append(r14.A05);
                sb.append("; cannot rollback, because reverse dependency ");
                sb.append(r4.A05);
                sb.append(" cannot be rolled (");
                sb.append(A032);
                sb.append(")");
                Log.i(sb.toString());
                r15.A01++;
                return A032;
            }
        }
        if (r14.A0D() || r14.A0C() || r14.A0F()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DatabaseMigrationManager/processMigrations; name=");
                String str = r14.A05;
                sb2.append(str);
                sb2.append("; trying to rollback migration.");
                Log.i(sb2.toString());
                if (!(r14 instanceof AnonymousClass1aZ)) {
                    r14.A01.A0G("db-rollbacks-not-supported", str, false);
                } else {
                    AnonymousClass1aZ r7 = (AnonymousClass1aZ) r14;
                    AnonymousClass1Ez r42 = new AnonymousClass1Ez(false);
                    r42.A04();
                    C28791au A052 = r14.A02.A05();
                    try {
                        C41851xA BD0 = A052.BD0();
                        try {
                            if (r14.A00 != Integer.MIN_VALUE) {
                                C24621La r8 = r14.A03;
                                r8.A03(r14.A05());
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append("_complete");
                                r8.A03(sb3.toString());
                            }
                            C24621La r82 = r14.A03;
                            r82.A03(r14.A06());
                            r82.A03(r14.A07());
                            r82.A03(r14.A08());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("migration_stats_");
                            sb4.append(str);
                            r82.A03(sb4.toString());
                            try {
                                C17960vV.A0D(false);
                                AnonymousClass1Ez r1 = new AnonymousClass1Ez("FtsMessageStore/reset");
                                AnonymousClass1QB r0 = r7.A00;
                                r0.A0K();
                                r0.A0J();
                                r1.A02();
                                BD0.A00();
                                BD0.close();
                                A052.close();
                                r42.A02();
                            } catch (Exception e) {
                                e = e;
                                A00(r14.A01, str, "rollback", e);
                            } catch (Throwable th) {
                                BD0.close();
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            A00(r14.A01, str, "before-rollback", e);
                            throw e;
                        }
                    } catch (Throwable th2) {
                        try {
                            A052.close();
                        } catch (Throwable th3) {
                            AnonymousClass0DT.A00(th2, th3);
                        }
                        throw th2;
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("DatabaseMigrationManager/processMigrations; name=");
                sb5.append(str);
                sb5.append("; migration was rolled back.");
                Log.i(sb5.toString());
                if (r14.A0D() || r14.A0C()) {
                    this.A00.A0G("db-rollback-had-no-effect", str, false);
                    r15.A01++;
                    return 3;
                }
                r15.A02++;
                return 3;
            } catch (Exception e3) {
                AnonymousClass190 r43 = this.A00;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("name=");
                String str2 = r14.A05;
                sb6.append(str2);
                sb6.append(", ");
                sb6.append(e3);
                r43.A0G("db-rollback-failed", sb6.toString(), false);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("DatabaseMigrationManager/processMigrations/error; name=");
                sb7.append(str2);
                sb7.append("; failed to rollback migration.");
                Log.e(sb7.toString());
                r15.A00++;
                return 4;
            }
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("DatabaseMigrationManager/processMigrations; name=");
            sb8.append(r14.A05);
            sb8.append("; rollback not needed, already in original state");
            Log.i(sb8.toString());
            return 3;
        }
    }

    public void A04() {
        Log.i("DatabaseMigrationManager/processAllConsistencyChecks");
        A05(new C56792i2(new C37431pX[0]), this.A06.A00().keySet(), 8);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, X.2dx] */
    public boolean A05(C56792i2 r23, Set set, int i) {
        Cursor A0A2;
        Cursor A0A3;
        Set set2 = set;
        if (set2.isEmpty()) {
            Log.i("DatabaseMigrationManager/processMigrations/no migrations requested, skipping.");
            return true;
        }
        AtomicBoolean atomicBoolean = this.A08;
        if (atomicBoolean.getAndSet(true)) {
            Log.w("DatabaseMigrationManager/processMigrations/migrations already in progress");
            return false;
        }
        new AnonymousClass1Ez("DatabaseMigrationManager/processMigrations");
        AnonymousClass00H r12 = this.A0A;
        ((AnonymousClass1O1) r12.get()).A01("db_migration", true);
        try {
            if (!C18020vd.A05(C18040vf.A02, this.A07, 12931)) {
                Log.w("DatabaseMigrationManager/loading all jids");
                AnonymousClass1DL r1 = this.A09;
                AnonymousClass1Ez r11 = new AnonymousClass1Ez(false);
                r11.A04();
                try {
                    C28781at A042 = r1.A01.get();
                    try {
                        A0A3 = ((C28801av) A042).A02.A0A("SELECT _id, user, server, agent, device, type, raw_string FROM jid", "GET_ALL_JID_SQL", (String[]) null);
                        int columnIndexOrThrow = A0A3.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = A0A3.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                        int columnIndexOrThrow3 = A0A3.getColumnIndexOrThrow("server");
                        int columnIndexOrThrow4 = A0A3.getColumnIndexOrThrow("agent");
                        int columnIndexOrThrow5 = A0A3.getColumnIndexOrThrow("device");
                        int columnIndexOrThrow6 = A0A3.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        int columnIndexOrThrow7 = A0A3.getColumnIndexOrThrow("raw_string");
                        while (A0A3.moveToNext()) {
                            long j = A0A3.getLong(columnIndexOrThrow);
                            Jid A032 = AnonymousClass1DL.A03(A0A3, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7);
                            if (A032 != null) {
                                AnonymousClass1DL.A07(r1, A032, j);
                            }
                        }
                        A0A3.close();
                        A042.close();
                        r1.A03.size();
                        r11.A02();
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (SQLiteBlobTooBigException unused) {
                    int i2 = -1;
                    try {
                        C28781at A043 = r1.A01.get();
                        try {
                            A0A2 = ((C28801av) A043).A02.A0A("SELECT COUNT(*) as count FROM jid", "GET_ALL_ROW_COUNT_SQL", (String[]) null);
                            if (A0A2.moveToLast()) {
                                i2 = A0A2.getInt(A0A2.getColumnIndexOrThrow("count"));
                            }
                            A0A2.close();
                            A043.close();
                            StringBuilder sb = new StringBuilder();
                            sb.append("JidStore/populateJidRowIdCache(); failing to load the window for ");
                            sb.append(i2);
                            Log.i(sb.toString());
                            AnonymousClass190 r9 = r1.A00;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("failing to load the window for ");
                            sb2.append(i2);
                            r9.A0G("JidStore/populateJidRowIdCache/blobTooBig", sb2.toString(), false);
                        } catch (Throwable th2) {
                            if (A0A2 != null) {
                                A0A2.close();
                            }
                        }
                    } catch (Exception e) {
                        Log.w("JidStore/populateJidRowIdCache/failed to get count", e);
                    } catch (Throwable th3) {
                        AnonymousClass0DT.A00(th, th3);
                    }
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th, th4);
                }
            }
            C201110w A002 = this.A06.A00();
            HashSet hashSet = new HashSet();
            LinkedList linkedList = new LinkedList(set2);
            while (true) {
                Object poll = linkedList.poll();
                if (poll == null) {
                    break;
                } else if (!hashSet.contains(poll)) {
                    hashSet.add(poll);
                    C28381a4 r0 = (C28381a4) A002.get(poll);
                    if (r0 != null) {
                        linkedList.addAll(r0.A09());
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = A002.get(next);
                if (obj != null) {
                    hashMap.put(next, obj);
                } else {
                    hashSet2.add(next);
                }
            }
            if (!hashSet2.isEmpty()) {
                this.A00.A0G("db-missing-migration-name", hashSet2.toString(), false);
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                entry.getValue();
                hashMap2.put(key, 1L);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            Iterator it2 = new HashSet(hashMap2.keySet()).iterator();
            while (it2.hasNext()) {
                arrayDeque.add(it2.next());
                while (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    C28381a4 r02 = (C28381a4) hashMap.get(str);
                    if (r02 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("DatabaseMigrationManager/sortedMigrations; can't get migration with name ");
                        sb3.append(str);
                        sb3.append("from a map of migrations");
                        Log.e(sb3.toString());
                        AnonymousClass190 r13 = this.A00;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("DatabaseMigrationManager/sortedMigrations/missing dependent migration; name=");
                        sb4.append(str);
                        r13.A0G(sb4.toString(), (String) null, false);
                    } else {
                        HashSet A092 = r02.A09();
                        C17960vV.A07(A092);
                        for (Object next2 : A092) {
                            Long l = (Long) hashMap2.get(next2);
                            if (l == null) {
                                l = 1L;
                                hashMap2.put(next2, l);
                            }
                            Long l2 = (Long) hashMap2.get(str);
                            if (l2 == null) {
                                l2 = 1L;
                                hashMap2.put(str, l2);
                            }
                            long longValue = l.longValue();
                            long longValue2 = l2.longValue();
                            if (longValue <= longValue2) {
                                hashMap2.put(next2, Long.valueOf(longValue2 + 1));
                                arrayDeque.add(next2);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList(hashMap.values());
            Collections.sort(arrayList, new C146997Rk((Map) hashMap2, 4));
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = new ArrayList(arrayList);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList4.add((C28381a4) it3.next());
            }
            if ((i & 1) != 0) {
                ? obj2 = new Object();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C28381a4 r14 = (C28381a4) it4.next();
                    if (A02(r14) && A03(r14, obj2) != 3) {
                        this.A00.A0G("db-rollback-not-completed", r14.A05, false);
                    }
                }
            }
            C56792i2 r15 = r23;
            if ((i & 2) != 0) {
                A01(r15, arrayList4);
            }
            if ((i & 4) != 0) {
                A01(r15, arrayList5);
            }
            if ((i & 8) != 0) {
                Log.i("DatabaseMigrationManager/handleConsistencyPhase");
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    it5.next();
                }
            }
            ((AnonymousClass1O1) r12.get()).A01("db_migration", false);
            atomicBoolean.set(false);
            return true;
        } catch (Exception e2) {
            Log.e("DatabaseMigrationManager/processMigrations/error while processing scheduled migrations.", e2);
            this.A00.A0G("db-process-migration-failure", e2.toString(), false);
            ((AnonymousClass1O1) r12.get()).A01("db_migration", false);
            atomicBoolean.set(false);
            return false;
        } catch (OutOfMemoryError e3) {
            Log.e("DatabaseMigrationManager/processMigrations/ OOM while processing scheduled migrations.", e3);
            this.A00.A0G("db-process-migration-failure", e3.toString(), false);
            ((AnonymousClass1O1) r12.get()).A01("db_migration", false);
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th5) {
            ((AnonymousClass1O1) r12.get()).A01("db_migration", false);
            atomicBoolean.set(false);
            throw th5;
        }
        throw th;
        throw th2;
    }

    public AnonymousClass1DN(AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass1DM r5, AnonymousClass11P r6, C19830z4 r7, AnonymousClass1DL r8, AnonymousClass1Cd r9, AnonymousClass1DK r10, C18030ve r11, AnonymousClass00H r12) {
        this.A03 = r6;
        this.A07 = r11;
        this.A09 = r8;
        this.A00 = r3;
        this.A01 = r4;
        this.A06 = r10;
        this.A04 = r7;
        this.A05 = r9;
        this.A0A = r12;
        this.A02 = r5;
    }

    public static boolean A02(C28381a4 r3) {
        if ((r3.A0C() || r3.A0D()) && r3.A01() == 1) {
            return true;
        }
        boolean A0F = r3.A0F();
        if (A0F) {
            StringBuilder sb = new StringBuilder();
            sb.append("DatabaseMigrationManager/needsRollback, migration '");
            sb.append(r3.A05);
            sb.append("' is stale, rollback.");
            Log.i(sb.toString());
        }
        return A0F;
    }
}
