package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.OperationCanceledException;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.1QB  reason: invalid class name */
public class AnonymousClass1QB implements AnonymousClass1QA {
    public static final int[] A0O = {105, 118, 103, 97, 100, AnonymousClass74N.A03, 115, 111};
    public static final Pattern A0P = Pattern.compile("((?<= )|(?= ))");
    public Map A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final C24921Me A03;
    public final C18000vb A04;
    public final AnonymousClass1Q8 A05;
    public final AnonymousClass1LW A06;
    public final C25181Nf A07;
    public final AnonymousClass1Q9 A08;
    public final AnonymousClass1DL A09;
    public final AnonymousClass1NH A0A;
    public final C22611Cn A0B;
    public final AnonymousClass1Cd A0C;
    public final C18030ve A0D;
    public final AnonymousClass19Y A0E;
    public final C25001Mm A0F;
    public final AnonymousClass1M9 A0G;
    public final AnonymousClass1CJ A0H;
    public final C24621La A0I;
    public final AnonymousClass1Q5 A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M = C221618v.A00(AnonymousClass138.class);
    public final AnonymousClass00H A0N;

    public int A07(List list) {
        AnonymousClass26f A0C2;
        C34141jz r1 = new C34141jz(this.A04);
        r1.A02 = 109;
        r1.A0C = list;
        String[] strArr = {A0C((C42621yT) null, r1, (Integer) null)};
        try {
            C28781at A042 = this.A0C.get();
            try {
                A0C2 = ((C28801av) A042).A02.A0C((C42621yT) null, "SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? ", "GET_TOTAL_MEDIA_COUNT", strArr);
                int columnIndexOrThrow = A0C2.getColumnIndexOrThrow("count");
                if (A0C2.moveToNext()) {
                    int i = A0C2.getInt(columnIndexOrThrow);
                    A0C2.close();
                    A042.close();
                    return i;
                }
                A0C2.close();
                A042.close();
                return 0;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A0B.A03();
            return 0;
        } catch (SQLiteException e2) {
            Log.e("FtsMessageStore/search/error", e2);
            return 0;
        } catch (AnonymousClass1QC unused) {
            return 0;
        } catch (Exception e3) {
            if (!(e3 instanceof OperationCanceledException)) {
                throw e3;
            }
            return 0;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public AnonymousClass206 A0A(Cursor cursor, int i, int i2) {
        try {
            long j = cursor.getLong(i2);
            AnonymousClass1BI A0B2 = this.A06.A0B(cursor.getLong(i));
            if (C22971Dz.A0a(A0B2) || A0B2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=");
                sb.append(j);
                Log.e(sb.toString());
                return null;
            }
            try {
                AnonymousClass206 A022 = ((AnonymousClass1W6) this.A0K.get()).A02(cursor, A0B2);
                if (A022 != null) {
                    return A022;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=");
                sb2.append(j);
                Log.e(sb2.toString());
                return null;
            } catch (AssertionError | ClassCastException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=");
                sb3.append(j);
                Log.e(sb3.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e2);
            return null;
        }
    }

    public synchronized Map A0I() {
        if (this.A00 == null) {
            this.A00 = new HashMap();
            for (AnonymousClass16H r3 : (Set) this.A0N.get()) {
                String BVE = r3.BVE();
                if (this.A00.containsKey(BVE)) {
                    C17960vV.A0F(false, "Namespace already registered");
                }
                this.A00.put(BVE, r3);
            }
        }
        return this.A00;
    }

    public void A0L(AnonymousClass206 r7) {
        AnonymousClass206 r1 = r7;
        A09(r1, Collections.emptyMap(), BS5(), false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        r15 = new X.C61482pl(((X.C28801av) r6).A02.A06("messages_fts", "INSERT_FTS_DEPRECATED_MESSAGE", r8), 1, r15.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61482pl A00(X.C61482pl r15, X.AnonymousClass1QB r16, java.lang.String r17) {
        /*
            java.lang.String r5 = "docid"
            r0 = r16
            X.1Cd r0 = r0.A0C
            X.1au r6 = r0.A05()
            r0 = 2
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0057 }
            r8.<init>(r0)     // Catch:{ all -> 0x0057 }
            long r0 = r15.A02     // Catch:{ all -> 0x0057 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0057 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "content"
            r3 = r17
            r8.put(r2, r3)     // Catch:{ all -> 0x0057 }
            r2 = r6
            X.1av r2 = (X.C28801av) r2     // Catch:{ SQLiteConstraintException -> 0x0036 }
            X.1Ev r4 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x0036 }
            java.lang.String r3 = "messages_fts"
            java.lang.String r2 = "INSERT_FTS_DEPRECATED_MESSAGE"
            long r10 = r4.A06(r3, r2, r8)     // Catch:{ SQLiteConstraintException -> 0x0036 }
            long r13 = r15.A01     // Catch:{ SQLiteConstraintException -> 0x0036 }
            r12 = 1
            X.2pl r9 = new X.2pl     // Catch:{ SQLiteConstraintException -> 0x0036 }
            r9.<init>(r10, r12, r13)     // Catch:{ SQLiteConstraintException -> 0x0036 }
            goto L_0x0052
        L_0x0036:
            r8.remove(r5)     // Catch:{ all -> 0x0057 }
            r2 = r6
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0057 }
            X.1Ev r7 = r2.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = "messages_fts"
            java.lang.String r10 = "docid = ?"
            r2 = 1
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0057 }
            r0 = 0
            r12[r0] = r1     // Catch:{ all -> 0x0057 }
            java.lang.String r11 = "UPDATE_FTS_DEPRECATED_MESSAGE"
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0057 }
            goto L_0x0053
        L_0x0052:
            r15 = r9
        L_0x0053:
            r6.close()
            return r15
        L_0x0057:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x005c }
            throw r1
        L_0x005c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A00(X.2pl, X.1QB, java.lang.String):X.2pl");
    }

    private C61482pl A01(String str, String str2, String[] strArr) {
        int i;
        Cursor A0A2;
        try {
            C28781at A042 = this.A0C.get();
            try {
                A0A2 = ((C28801av) A042).A02.A0A(str, str2, strArr);
                if (A0A2.moveToNext()) {
                    C61482pl r4 = new C61482pl(A0A2.getLong(A0A2.getColumnIndexOrThrow("docid")), 1, A0A2.getLong(A0A2.getColumnIndexOrThrow("_id")));
                    A0A2.close();
                    A042.close();
                    return r4;
                }
                A0A2.close();
                A042.close();
                i = -4;
                return C61482pl.A00(i);
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteException e) {
            if (e.getMessage() == null || !e.getMessage().contains("FTS expression tree is too large")) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/getRowIdForJidSearch/error/");
                sb.append(str2);
                Log.e(sb.toString(), e);
                i = -3;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/getRowIdForJidSearch/too-large/");
                sb2.append(str2);
                Log.e(sb2.toString(), e);
                i = -2;
            }
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public static String A02(AnonymousClass1QB r6, AnonymousClass206 r7) {
        Set<String> BUj;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : r6.A0I().entrySet()) {
            if (!(entry == null || entry.getValue() == null || (BUj = ((AnonymousClass16H) entry.getValue()).BUj(r7)) == null)) {
                String str = (String) entry.getKey();
                for (String str2 : BUj) {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return TextUtils.join(" ", arrayList);
    }

    public static String A04(List list, List list2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C209514c.A00);
        sb2.append(" FROM ");
        sb2.append("message AS message JOIN ( ");
        sb.append(sb2.toString());
        sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
        list2.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(" INTERSECT ");
            sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
            list2.add(list.get(i));
        }
        sb.append(") ON message._id = message_row_id");
        return sb.toString();
    }

    public static boolean A05(C42621yT r1) {
        if (r1 == null || !r1.A03()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (X.C25291Nq.A04(r1, 12434) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.AnonymousClass1QB r2, X.AnonymousClass206 r3) {
        /*
            X.205 r0 = r3.A0v
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x0051
            boolean r0 = X.C22971Dz.A0a(r1)
            if (r0 != 0) goto L_0x0051
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 != 0) goto L_0x0051
            boolean r0 = X.C22971Dz.A0S(r1)
            if (r0 != 0) goto L_0x0051
            int r1 = r3.A0u
            r0 = 35
            if (r1 == r0) goto L_0x0051
            boolean r0 = r3 instanceof X.AnonymousClass22J
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.C442822v
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.C442622t
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.C436420i
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.C441322g
            if (r0 == 0) goto L_0x0040
            X.0ve r1 = r2.A0D
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 12434(0x3092, float:1.7424E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0040:
            boolean r0 = r3 instanceof X.AnonymousClass22W
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.C441122e
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3 instanceof X.AnonymousClass216
            if (r0 != 0) goto L_0x0051
            boolean r1 = r3 instanceof X.C444523m
            r0 = 0
            if (r1 == 0) goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A06(X.1QB, X.206):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r0.isEmpty() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1 != false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0322  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A08(X.C42621yT r20, X.C34141jz r21, java.lang.Integer r22) {
        /*
            r19 = this;
            java.lang.String r7 = "fts_done"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r15 = r21
            X.1BI r1 = r15.A03
            r0 = 0
            if (r1 == 0) goto L_0x000f
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x032f
            java.lang.String r0 = "FtsMessageStore/search-with-jid/"
        L_0x0013:
            r2.append(r0)
            java.lang.String r0 = r15.A02()
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.1Ez r3 = new X.1Ez
            r3.<init>((java.lang.String) r0)
            r5 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r1, r0)
            r8 = r19
            boolean r0 = r8.A0O()
            r2 = r22
            if (r0 != 0) goto L_0x0053
            X.19Y r1 = r8.A0E
            java.lang.String r0 = "fts_not_ready"
            X.C137386vN.A01(r1, r2, r0)
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x004c:
            r3.A03(r0)
        L_0x004f:
            r3.A02()
            return r4
        L_0x0053:
            r18 = r20
            boolean r0 = A05(r18)
            java.lang.String r11 = "cancelled"
            java.lang.String r9 = "fts_cancelled"
            if (r0 != 0) goto L_0x0325
            long r16 = r8.BS5()
            java.util.List r0 = r15.A0D
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            java.lang.String r12 = "FTS_QUERY"
            r13 = 1
            java.util.List r0 = r15.A04()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r1 != 0) goto L_0x0156
            if (r0 != 0) goto L_0x00a9
            int r1 = r15.A02
            r0 = 0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            if (r0 != 0) goto L_0x00a9
            X.1BI r1 = r15.A03
            r0 = 0
            if (r1 == 0) goto L_0x008f
            r0 = 1
        L_0x008f:
            if (r0 != 0) goto L_0x00a9
            java.util.List r0 = r15.A0C
            if (r0 == 0) goto L_0x009c
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 != 0) goto L_0x00a9
            X.19Y r1 = r8.A0E
            java.lang.String r0 = "fts_empty"
            X.C137386vN.A01(r1, r2, r0)
            java.lang.String r0 = "empty"
            goto L_0x004c
        L_0x00a9:
            X.1BI r0 = r15.A03
            r1 = 0
            if (r0 == 0) goto L_0x00af
            r1 = 1
        L_0x00af:
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            if (r0 != 0) goto L_0x02e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C51002Wp.A05
            r1.append(r0)
            java.lang.String r0 = " ORDER BY docid DESC"
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.List r0 = r15.A04()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r15.A02()
            java.lang.String r0 = r8.A0G(r0)
        L_0x00df:
            r1[r5] = r0
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r6, r1)
            java.lang.String r12 = "FTS_DEPRECATED_QUERY"
            goto L_0x0188
        L_0x00ea:
            r0 = 0
            goto L_0x00df
        L_0x00ec:
            if (r0 != 0) goto L_0x02e9
            java.util.List r0 = r15.A04()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "no jid v1"
            goto L_0x004c
        L_0x00fe:
            X.1BI r1 = r15.A03
            r12 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0105
            r0 = 1
        L_0x0105:
            X.C17960vV.A0D(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C51002Wp.A04
            r1.append(r0)
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)
            java.lang.String r0 = "_id"
            r1.append(r0)
            java.lang.String r0 = " DESC"
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            java.util.List r0 = r15.A04()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = r15.A02()
            java.lang.String r0 = r8.A0G(r0)
        L_0x013c:
            r6[r5] = r0
            X.1LW r1 = r8.A06
            X.1BI r0 = r15.A03
            long r0 = r1.A09(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6[r12] = r0
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r10, r6)
            java.lang.String r12 = "FTS_DEPRECATED_QUERY_WITH_JID"
            goto L_0x0188
        L_0x0154:
            r0 = 0
            goto L_0x013c
        L_0x0156:
            if (r0 != 0) goto L_0x01bd
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r0 = r15.A0D
            if (r0 != 0) goto L_0x016b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x016b:
            java.lang.String r0 = A04(r0, r6)
            r1.append(r0)
            java.lang.String r0 = " ORDER BY message._id DESC"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r1, r0)
            java.lang.String r12 = "FTS_QUERY_WITH_LABEL"
        L_0x0188:
            boolean r0 = A05(r18)
            if (r0 != 0) goto L_0x0325
            java.lang.Object r0 = r13.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r13 = r13.second
            java.lang.String[] r13 = (java.lang.String[]) r13
            java.lang.String r1 = "compiled"
            r3.A03(r1)
            X.19Y r6 = r8.A0E
            X.C137386vN.A01(r6, r2, r1)
            boolean r1 = r0.isEmpty()
            r10 = 1
            r14 = r1 ^ 1
            java.lang.String r1 = "FtsMessageStore/search/sql empty"
            X.C17960vV.A0F(r14, r1)
            int r1 = r15.A01
            if (r1 != 0) goto L_0x01b1
            r10 = 0
        L_0x01b1:
            java.lang.String r1 = "FtsMessageStore/refusing to query unbounded search"
            X.C17960vV.A0F(r10, r1)
            int r14 = r15.A01
            int r1 = r15.A00
            int r14 = r14 * r1
            goto L_0x0333
        L_0x01bd:
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x02e9
            X.1NH r1 = r8.A0A
            java.util.List r0 = r15.A0D
            if (r0 != 0) goto L_0x01cc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x01cc:
            java.util.HashSet r1 = r1.A01(r0)
            int r0 = r1.size()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x01dd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r1 = r6.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1LW r0 = r8.A06
            long r0 = r0.A09(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.add(r0)
            goto L_0x01dd
        L_0x01f7:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r15.A0D
            if (r0 != 0) goto L_0x0205
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0205:
            java.lang.String r12 = A04(r0, r6)
            java.util.List r0 = r15.A04()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02af
            java.lang.String r0 = r15.A02()
            java.lang.String r10 = r8.A0G(r0)
        L_0x021d:
            X.C17960vV.A07(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = " JOIN messages_fts ON docid = message._id WHERE messages_fts.content MATCH ?"
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r6.add(r10)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x02c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = " UNION "
            r1.append(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "SELECT "
            r12.append(r0)
            java.lang.String r0 = X.C209514c.A00
            r12.append(r0)
            java.lang.String r0 = " FROM "
            r12.append(r0)
            java.lang.String r0 = "available_message_view AS message JOIN messages_fts AS messages_fts ON messages_fts.docid = message.sort_id"
            r12.append(r0)
            java.lang.String r0 = " WHERE content MATCH ?"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r6.add(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " AND chat_row_id in ("
            r10.append(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.util.Iterator r0 = r13.iterator()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x02b2
            java.util.Iterator r16 = r13.iterator()
            r14 = 1
        L_0x028d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r13 = r16.next()
            if (r13 == 0) goto L_0x028d
            if (r14 == 0) goto L_0x02a9
            r14 = 0
        L_0x029c:
            java.lang.String r0 = "?"
            r12.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            r6.add(r0)
            goto L_0x028d
        L_0x02a9:
            java.lang.String r0 = ", "
            r12.append(r0)
            goto L_0x029c
        L_0x02af:
            r10 = 0
            goto L_0x021d
        L_0x02b2:
            java.lang.String r0 = r12.toString()
            r10.append(r0)
            java.lang.String r0 = ")"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r1.append(r0)
            java.lang.String r12 = r1.toString()
        L_0x02c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = " ORDER BY message._id DESC"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r1, r0)
            java.lang.String r12 = "FTS_DEPRECATED_QUERY_WITH_LABEL"
            goto L_0x0188
        L_0x02e9:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = r18
            java.lang.String r0 = r8.A0C(r0, r15, r2)
            r1[r5] = r0
            X.0ve r10 = r8.A0D
            r6 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r6)
            if (r0 == 0) goto L_0x0322
            java.lang.String r0 = X.C51002Wp.A07
        L_0x0302:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            X.11S r0 = r8.A02
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x031f
            java.lang.String r0 = " ORDER BY timestamp DESC"
        L_0x0311:
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r0, r1)
            goto L_0x0188
        L_0x031f:
            java.lang.String r0 = " ORDER BY docid DESC"
            goto L_0x0311
        L_0x0322:
            java.lang.String r0 = X.C51002Wp.A06
            goto L_0x0302
        L_0x0325:
            X.19Y r0 = r8.A0E
            X.C137386vN.A01(r0, r2, r9)
            r3.A03(r11)
            goto L_0x004f
        L_0x032f:
            java.lang.String r0 = "FtsMessageStore/search/"
            goto L_0x0013
        L_0x0333:
            X.1Cd r1 = r8.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
            X.1at r16 = r1.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
            r1 = r16
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x03dc }
            X.1Ev r10 = r1.A02     // Catch:{ all -> 0x03dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03dc }
            r1.<init>()     // Catch:{ all -> 0x03dc }
            r1.append(r0)     // Catch:{ all -> 0x03dc }
            java.lang.String r0 = "  LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x03dc }
            int r0 = r15.A01     // Catch:{ all -> 0x03dc }
            r1.append(r0)     // Catch:{ all -> 0x03dc }
            java.lang.String r0 = " OFFSET "
            r1.append(r0)     // Catch:{ all -> 0x03dc }
            r1.append(r14)     // Catch:{ all -> 0x03dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03dc }
            r0 = r18
            X.26f r10 = r10.A0C(r0, r1, r12, r13)     // Catch:{ all -> 0x03dc }
        L_0x0363:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x03cb
            boolean r0 = A05(r18)     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x0386
            X.C137386vN.A01(r6, r2, r9)     // Catch:{ all -> 0x03d2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03d2 }
            java.lang.Object r0 = r4.second     // Catch:{ all -> 0x03d2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x03d2 }
            android.util.Pair r9 = new android.util.Pair     // Catch:{ all -> 0x03d2 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x03d2 }
            r3.A03(r11)     // Catch:{ all -> 0x03d2 }
            r3.A02()     // Catch:{ all -> 0x03d2 }
            goto L_0x03c4
        L_0x0386:
            X.00H r0 = r8.A0K     // Catch:{ all -> 0x03d2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03d2 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x03d2 }
            X.206 r12 = r0.A01(r10)     // Catch:{ all -> 0x03d2 }
            int r5 = r5 + 1
            if (r12 == 0) goto L_0x0363
            int r0 = r12.A0C()     // Catch:{ all -> 0x03d2 }
            r13 = 1
            if (r0 == r13) goto L_0x03a8
            X.1Q9 r0 = r8.A08     // Catch:{ all -> 0x03d2 }
            long r0 = r0.A00     // Catch:{ all -> 0x03d2 }
            boolean r0 = X.AnonymousClass25A.A0y(r12, r0)     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x03a8
            r13 = 0
        L_0x03a8:
            if (r13 == 0) goto L_0x0363
            X.1CJ r1 = r8.A0H     // Catch:{ all -> 0x03d2 }
            X.205 r0 = r12.A0v     // Catch:{ all -> 0x03d2 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x03d2 }
            boolean r0 = r1.A0S(r0)     // Catch:{ all -> 0x03d2 }
            if (r0 != 0) goto L_0x0363
            boolean r0 = A06(r8, r12)     // Catch:{ all -> 0x03d2 }
            if (r0 != 0) goto L_0x0363
            java.lang.Object r0 = r4.second     // Catch:{ all -> 0x03d2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x03d2 }
            r0.add(r12)     // Catch:{ all -> 0x03d2 }
            goto L_0x0363
        L_0x03c4:
            r10.close()     // Catch:{ all -> 0x03dc }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
            return r9
        L_0x03cb:
            r10.close()     // Catch:{ all -> 0x03dc }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
            goto L_0x043e
        L_0x03d2:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x03d7 }
            goto L_0x03db
        L_0x03d7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03dc }
        L_0x03db:
            throw r1     // Catch:{ all -> 0x03dc }
        L_0x03dc:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x03e1 }
            goto L_0x03e5
        L_0x03e1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
        L_0x03e5:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0435, 1QC -> 0x043e, SQLiteException -> 0x03ec, Exception -> 0x03e6 }
        L_0x03e6:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 != 0) goto L_0x043e
            throw r1
        L_0x03ec:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x041e
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "FTS expression tree is too large"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x041e
            java.lang.String r0 = "FtsMessageStore/search/error/query-too-large"
            com.whatsapp.util.Log.e(r0, r5)
            java.lang.String r0 = "fts_query_too_large"
            X.C137386vN.A01(r6, r2, r0)
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.second
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r1, r0)
            java.lang.String r0 = "query-too-large"
        L_0x0417:
            r3.A03(r0)
            r3.A02()
            return r9
        L_0x041e:
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r5)
            X.C137386vN.A01(r6, r2, r7)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.second
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r1, r0)
            java.lang.String r0 = "error"
            goto L_0x0417
        L_0x0435:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r8.A0B
            r0.A03()
        L_0x043e:
            X.C137386vN.A01(r6, r2, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "found: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r4.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r4.second
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r1, r0)
            r3.A03(r2)
            r3.A02()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A08(X.1yT, X.1jz, java.lang.Integer):android.util.Pair");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:9|(2:11|(1:23)(1:15))|16|(1:(1:19)(1:21))(1:22)|20|24|25|26|27|28|29|30|31|33|(1:48)(2:37|38)) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0102, code lost:
        r12 = new X.C61482pl(((X.C28801av) r10).A02.A06("message_ftsv2", "INSERT_FTS_MESSAGE", r14), 1, r13.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C61482pl A09(X.AnonymousClass206 r22, java.util.Map r23, long r24, boolean r26) {
        /*
            r21 = this;
            r2 = r21
            if (r26 != 0) goto L_0x0010
            boolean r0 = r2.A0O()
            if (r0 != 0) goto L_0x0010
            r0 = -5
        L_0x000b:
            X.2pl r12 = X.C61482pl.A00(r0)
        L_0x000f:
            return r12
        L_0x0010:
            r10 = r22
            X.205 r7 = r10.A0v
            X.1BI r8 = r7.A00
            boolean r0 = A06(r2, r10)
            if (r0 == 0) goto L_0x001e
            r0 = -6
            goto L_0x000b
        L_0x001e:
            java.lang.String r6 = r2.A0F(r10)
            long r0 = r10.A0y
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = r23
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x004e
            int r1 = r6.length()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L_0x0089
            java.util.regex.Pattern r0 = X.AnonymousClass2W6.A00
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.find()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0089
            X.0vb r0 = r2.A04
            java.lang.String r1 = X.C20103A7h.A01(r0, r6)
        L_0x004e:
            X.1BI r3 = r10.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A01(r3)
            java.lang.String r9 = A02(r2, r10)
            long r5 = r10.A0y
            long r3 = r10.A0x
            r16 = 1
            X.2pl r0 = new X.2pl
            r12 = r0
            r13 = r0
            r14 = r5
            r17 = r3
            r13.<init>(r14, r16, r17)
            boolean r3 = r7.A02
            java.lang.String r7 = "docid"
            if (r11 != 0) goto L_0x0084
            if (r3 == 0) goto L_0x0081
            java.lang.String r11 = "1"
        L_0x0076:
            java.lang.String r6 = r2.A0E(r8)
            X.1Cd r3 = r2.A0C
            X.1au r10 = r3.A05()
            goto L_0x0099
        L_0x0081:
            java.lang.String r11 = "0"
            goto L_0x0076
        L_0x0084:
            java.lang.String r11 = r2.A0E(r11)
            goto L_0x0076
        L_0x0089:
            X.1Mm r9 = r2.A0F
            long r3 = r10.A0x
            long r0 = r10.A0y
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r5 = new com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob
            r5.<init>(r3, r0)
            r9.A01(r5)
            r1 = r6
            goto L_0x004e
        L_0x0099:
            r3 = 4
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0117 }
            r14.<init>(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "content"
            r14.put(r3, r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "fts_jid"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r4.<init>()     // Catch:{ all -> 0x0117 }
            r4.append(r11)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = " "
            r4.append(r3)     // Catch:{ all -> 0x0117 }
            r4.append(r6)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0117 }
            r14.put(r5, r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "fts_namespace"
            r14.put(r3, r9)     // Catch:{ all -> 0x0117 }
            long r5 = r0.A02     // Catch:{ all -> 0x0117 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0117 }
            r14.put(r7, r3)     // Catch:{ all -> 0x0117 }
            r3 = r10
            X.1av r3 = (X.C28801av) r3     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            X.1Ev r8 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            java.lang.String r4 = "message_ftsv2"
            java.lang.String r3 = "INSERT_FTS_MESSAGE"
            long r16 = r8.A06(r4, r3, r14)     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            long r3 = r0.A01     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            r18 = 1
            X.2pl r15 = new X.2pl     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            r19 = r3
            r15.<init>(r16, r18, r19)     // Catch:{ SQLiteConstraintException -> 0x00e4 }
            goto L_0x0102
        L_0x00e4:
            r14.remove(r7)     // Catch:{ all -> 0x0117 }
            r3 = r10
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0117 }
            X.1Ev r13 = r3.A02     // Catch:{ all -> 0x0117 }
            java.lang.String r15 = "message_ftsv2"
            java.lang.String r16 = "docid = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0117 }
            r3 = 0
            r7[r3] = r4     // Catch:{ all -> 0x0117 }
            java.lang.String r17 = "UPDATE_FTS_MESSAGE"
            r18 = r7
            r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0117 }
            goto L_0x0103
        L_0x0102:
            r12 = r15
        L_0x0103:
            r10.close()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x000f
            r4 = 1
            int r3 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x000f
            X.2pl r12 = A00(r0, r2, r1)
            return r12
        L_0x0117:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x011c }
            throw r1
        L_0x011c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A09(X.206, java.util.Map, long, boolean):X.2pl");
    }

    public C34141jz A0B(AnonymousClass1BI r4) {
        C34141jz r2 = new C34141jz(this.A04);
        r2.A03 = r4;
        if (C22971Dz.A0e(r4)) {
            List singletonList = Collections.singletonList(new Object());
            if (r2.A0A != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return r2;
            }
            r2.A0A = singletonList;
            return r2;
        }
        r2.A0B = Collections.emptyList();
        return r2;
    }

    public String A0D(C42621yT r12, C34141jz r13, String str) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry entry : A0I().entrySet()) {
            if (A05(r12)) {
                break;
            }
            String str2 = (String) entry.getKey();
            C54532eI BVF = ((AnonymousClass16H) entry.getValue()).BVF(r13);
            if (BVF != null) {
                if (!BVF.A02.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(BVF.A02.size());
                    for (String str3 : BVF.A02) {
                        if (A05(r12)) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("fts_namespace:");
                        sb.append(str2);
                        sb.append(str3);
                        arrayList2.add(sb.toString());
                    }
                    arrayList.add(TextUtils.join(" OR ", arrayList2));
                    z3 = true;
                }
                for (String str4 : BVF.A00) {
                    if (A05(r12)) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fts_namespace:");
                    sb2.append(str2);
                    sb2.append(str4);
                    arrayList.add(sb2.toString());
                    z2 = true;
                }
                for (String str5 : BVF.A01) {
                    if (A05(r12)) {
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("fts_namespace:-");
                    sb3.append(str2);
                    sb3.append(str5);
                    arrayList.add(sb3.toString());
                    z = true;
                }
            }
        }
        if (A05(r12) || !z || z2 || z3 || !TextUtils.isEmpty(str)) {
            String join = TextUtils.join(" ", arrayList);
            if (TextUtils.isEmpty(join)) {
                return str;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" ");
            sb4.append(join);
            return sb4.toString();
        }
        throw new IllegalStateException("Compiled FTS query comprised entirely of NOTs");
    }

    public String A0E(AnonymousClass1BI r5) {
        return Long.toString(this.A09.A09(r5) + 10, 36);
    }

    public String A0F(AnonymousClass206 r4) {
        AnonymousClass3KT BXT = ((C437420t) ((AnonymousClass20Z) ((C55452fn) this.A0L.get()).A04.getValue()).A00(r4.A0u)).BXT(r4);
        return BXT instanceof C690335q ? ((C690335q) BXT).A00.toString() : "";
    }

    @Deprecated
    public String A0G(String str) {
        boolean z;
        String obj;
        StringBuilder sb;
        String trim = C20103A7h.A01(this.A04, str).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (!trim.startsWith("\"") || !trim.endsWith("\"") || length <= 2) {
            z = false;
        } else {
            z = true;
            trim = trim.substring(1, length - 1);
        }
        String trim2 = C20103A7h.A01.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(trim2);
            sb2.append("\"");
            obj = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(trim2);
            sb3.append("*");
            obj = sb3.toString();
        }
        if (obj.indexOf(105) == -1) {
            return obj;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append(obj);
            sb.append(" OR ");
            sb.append(obj.replace('i', 305));
        } else {
            String[] split = A0P.split(obj);
            sb = new StringBuilder();
            for (String str2 : split) {
                if (str2.indexOf(105) != -1) {
                    sb.append(str2);
                    sb.append(" OR ");
                    str2 = str2.replace('i', 305);
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0H(X.C42621yT r22, X.C34141jz r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r3 = r23
            java.util.List r19 = r3.A04()
            r4 = 0
        L_0x000c:
            int r0 = r19.size()
            if (r4 >= r0) goto L_0x011c
            boolean r0 = A05(r22)
            if (r0 != 0) goto L_0x011c
            r0 = r19
            java.lang.Object r6 = r0.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0112
            int r0 = r19.size()
            r12 = 1
            int r0 = r0 - r12
            r18 = 0
            if (r4 != r0) goto L_0x002e
            r18 = 1
        L_0x002e:
            monitor-enter(r3)
            java.util.Map r11 = r3.A0E     // Catch:{ all -> 0x0119 }
            if (r11 != 0) goto L_0x003a
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0119 }
            r11.<init>()     // Catch:{ all -> 0x0119 }
            r3.A0E = r11     // Catch:{ all -> 0x0119 }
        L_0x003a:
            monitor-exit(r3)
            java.lang.Object r8 = r3.A0J
            monitor-enter(r8)
            java.lang.Object r9 = r11.get(r6)     // Catch:{ all -> 0x0116 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0116 }
            r10 = r21
            r7 = r24
            if (r9 == 0) goto L_0x0053
            X.19Y r5 = r10.A0E     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "fts_cached_jids"
            X.C137386vN.A01(r5, r7, r0)     // Catch:{ all -> 0x0116 }
        L_0x0051:
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            goto L_0x00cc
        L_0x0053:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0116 }
            r9.<init>()     // Catch:{ all -> 0x0116 }
            java.util.List r2 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x0116 }
            r10.A0N(r3)     // Catch:{ all -> 0x0116 }
            X.19Y r5 = r10.A0E     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "fts_warm_cache"
            X.C137386vN.A01(r5, r7, r0)     // Catch:{ all -> 0x0116 }
            java.util.List r0 = r3.A0B     // Catch:{ all -> 0x0116 }
            r1 = 0
            if (r0 == 0) goto L_0x006c
            r1 = 1
        L_0x006c:
            java.lang.String r0 = "contact list null after warming"
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r1 = "FtsMessageStore/filter"
            X.1Ez r17 = new X.1Ez     // Catch:{ all -> 0x0116 }
            r0 = r17
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0116 }
            java.util.List r0 = r3.A0B     // Catch:{ all -> 0x0116 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0116 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0116 }
        L_0x0083:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r14 = r16.next()     // Catch:{ all -> 0x0116 }
            X.1E7 r14 = (X.AnonymousClass1E7) r14     // Catch:{ all -> 0x0116 }
            boolean r0 = A05(r22)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0098
            if (r18 == 0) goto L_0x0098
            goto L_0x00f1
        L_0x0098:
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r13 = r14.A06(r0)     // Catch:{ all -> 0x0116 }
            X.1BI r13 = (X.AnonymousClass1BI) r13     // Catch:{ all -> 0x0116 }
            if (r13 == 0) goto L_0x0083
            boolean r0 = r13 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r13 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0083
        L_0x00aa:
            X.1Me r0 = r10.A03     // Catch:{ all -> 0x0116 }
            r1 = r0
            int r0 = r6.length()     // Catch:{ all -> 0x0116 }
            r15 = 0
            if (r0 <= r12) goto L_0x00b5
            r15 = 1
        L_0x00b5:
            r0 = 0
            boolean r0 = r1.A0m(r14, r2, r15, r0)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0083
            r9.add(r13)     // Catch:{ all -> 0x0116 }
            goto L_0x0083
        L_0x00c0:
            r11.put(r6, r9)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "fts_search"
            X.C137386vN.A01(r5, r7, r0)     // Catch:{ all -> 0x0116 }
            r17.A02()     // Catch:{ all -> 0x0116 }
            goto L_0x0051
        L_0x00cc:
            java.util.List r0 = r3.A09
            if (r0 == 0) goto L_0x00f8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x00d9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.util.List r0 = r3.A09
            boolean r0 = X.C25181Nf.A00(r1, r0)
            if (r0 == 0) goto L_0x00d9
            r8.add(r1)
            goto L_0x00d9
        L_0x00f1:
            java.lang.String r0 = "fts_last_cancel"
            X.C137386vN.A01(r5, r7, r0)     // Catch:{ all -> 0x0116 }
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r0 = "fts_unfiltered"
            X.C137386vN.A01(r5, r7, r0)
        L_0x00fd:
            r8 = r9
            goto L_0x0104
        L_0x00ff:
            java.lang.String r0 = "fts_filtered"
            X.C137386vN.A01(r5, r7, r0)
        L_0x0104:
            java.lang.String r0 = "fts_token_jids"
            X.C137386vN.A01(r5, r7, r0)
            android.util.Pair r1 = android.util.Pair.create(r6, r8)
            r0 = r20
            r0.add(r1)
        L_0x0112:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0116:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x0119:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x011c:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A0H(X.1yT, X.1jz, java.lang.Integer):java.util.ArrayList");
    }

    public void A0J() {
        C41851xA BD0;
        AnonymousClass1Cd r0 = this.A0C;
        C28791au A052 = r0.A05();
        try {
            r0.A06();
            C22601Cm r5 = r0.A02;
            AnonymousClass1Ez r4 = new AnonymousClass1Ez("databasehelper/createFtsTable");
            BD0 = A052.BD0();
            r5.A0A.get();
            AnonymousClass1F6 r2 = new AnonymousClass1F6();
            r2.CE7((AnonymousClass138) this.A0M.get(), "message_ftsv2");
            C23141Ev r02 = ((C28801av) A052).A02;
            r2.A02(r02);
            r5.A08(r02);
            BD0.A00();
            BD0.close();
            StringBuilder sb = new StringBuilder();
            sb.append("databasehelper/createFtsDeprecatedTable time spent:");
            sb.append(r4.A02());
            Log.i(sb.toString());
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

    public void A0K() {
        C41851xA BD0;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez("FtsMessageStore/drop");
        AnonymousClass1Cd r3 = this.A0C;
        C28791au A052 = r3.A05();
        try {
            BD0 = A052.BD0();
            C23141Ev r2 = ((C28801av) A052).A02;
            r2.A0E(C25071Mt.A02("messages_fts"), "DROP_TABLE_MESSAGES_FTS_DEPRECATED");
            r2.A0E(C25071Mt.A02("message_ftsv2"), "DROP_TABLE_MESSAGE_FTS");
            r3.A06();
            r3.A02.A07(A052);
            C24621La r32 = this.A0I;
            r32.A03("migration_fts_index");
            r32.A03("migration_fts_retry");
            r32.A04("fts_index_start", 0);
            r32.A05("fts_ready", 0);
            BD0.A00();
            BD0.close();
            A052.close();
            r5.A02();
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A0D, 11565) != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(X.C34141jz r15) {
        /*
            r14 = this;
            java.util.List r0 = r15.A0B
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C60542oC.A01(r15)
            if (r0 == 0) goto L_0x00b6
            X.0ve r2 = r14.A0D
            r1 = 11565(0x2d2d, float:1.6206E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b6
        L_0x0016:
            java.lang.Object r2 = r15.A0J
            monitor-enter(r2)
            java.util.List r0 = r15.A0B     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = X.C60542oC.A01(r15)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00b1
            X.0ve r3 = r14.A0D     // Catch:{ all -> 0x00b3 }
            r1 = 11565(0x2d2d, float:1.6206E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00b1
        L_0x002f:
            java.lang.String r0 = "FtsMessageStore/getSearchableContacts"
            X.1Ez r3 = new X.1Ez     // Catch:{ all -> 0x00b3 }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00b3 }
            X.1Q5 r4 = r14.A0J     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "warm-contact"
            X.0vt r0 = X.AnonymousClass1Q5.A01     // Catch:{ all -> 0x00b3 }
            X.2jm r5 = r4.A00(r0, r1)     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C60542oC.A01(r15)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0094
            X.0ve r4 = r14.A0D     // Catch:{ all -> 0x00b3 }
            r1 = 11565(0x2d2d, float:1.6206E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0094
            X.1M9 r0 = r14.A0G     // Catch:{ all -> 0x00b3 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00b3 }
            r7.<init>()     // Catch:{ all -> 0x00b3 }
            X.1M2 r6 = r0.A04     // Catch:{ all -> 0x00b3 }
            r12 = 1
            r8 = 0
            r10 = r8
            r11 = r8
            r13 = r8
            r9 = r8
            X.AnonymousClass1M2.A0C(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00b3 }
            X.AnonymousClass1M9.A01(r0, r7)     // Catch:{ all -> 0x00b3 }
        L_0x0068:
            r15.A0B = r7     // Catch:{ all -> 0x00b3 }
            java.util.List r0 = r15.A0A     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00a4
            java.util.Iterator r4 = r7.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x0072:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x00b3 }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ all -> 0x00b3 }
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r1 = r1.A06(r0)     // Catch:{ all -> 0x00b3 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0090
            java.util.List r0 = r15.A0A     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C25181Nf.A00(r1, r0)     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0072
        L_0x0090:
            r4.remove()     // Catch:{ all -> 0x00b3 }
            goto L_0x0072
        L_0x0094:
            X.1Nf r0 = r14.A07     // Catch:{ all -> 0x00b3 }
            java.util.Map r0 = r0.A04()     // Catch:{ all -> 0x00b3 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00b3 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x00b3 }
            r7.<init>(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x0068
        L_0x00a4:
            r5.A00()     // Catch:{ all -> 0x00b3 }
            java.util.List r0 = r15.A0B     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00ae
            r0.size()     // Catch:{ all -> 0x00b3 }
        L_0x00ae:
            r3.A02()     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            throw r0
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QB.A0N(X.1jz):void");
    }

    public boolean A0O() {
        if (this.A0I.A01("fts_ready", 0) % 2 != 0) {
            return true;
        }
        return false;
    }

    public C61482pl BLE(AnonymousClass206 r19, C34141jz r20, boolean z, boolean z2) {
        Cursor A0A2;
        String str;
        String str2;
        String[] strArr;
        String str3;
        C34141jz r5 = r20;
        boolean z3 = z;
        boolean z4 = z2;
        if (A0O()) {
            AnonymousClass1Ez r12 = new AnonymousClass1Ez("FtsMessageStore/searchforjid");
            AnonymousClass1BI r13 = r5.A03;
            C17960vV.A07(r13);
            long A032 = AnonymousClass25A.A03(r19);
            if (A032 == Long.MIN_VALUE) {
                Log.e("FtsMessageStore/searchforjid/startSortId < 0");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("start:");
                sb.append(A032);
                sb.append(" up:");
                sb.append(z3);
                sb.append(" includeStartMessage:");
                sb.append(z4);
                r12.A03(sb.toString());
                if (!r5.A04().isEmpty()) {
                    long BS5 = BS5();
                    if (BS5 == 1) {
                        StringBuilder sb2 = new StringBuilder(C51002Wp.A04);
                        C26121Qx.A03(sb2, z3, z4);
                        sb2.append(" LIMIT 1");
                        str = sb2.toString();
                        strArr = new String[]{A0G(r5.A02()), String.valueOf(this.A06.A09(r13)), String.valueOf(A032)};
                        str2 = "FIND_FTS_MESSAGE_FOR_JID_DEPRECATED";
                    } else if (BS5 == 5) {
                        r5.A0F = true;
                        if (C18020vd.A05(C18040vf.A02, this.A0D, 6261)) {
                            str3 = C51002Wp.A07;
                        } else {
                            str3 = C51002Wp.A06;
                        }
                        StringBuilder sb3 = new StringBuilder(str3);
                        C26121Qx.A03(sb3, z3, z4);
                        sb3.append(" LIMIT 1");
                        str = sb3.toString();
                        strArr = new String[]{A0C((C42621yT) null, r5, (Integer) null), String.valueOf(A032)};
                        str2 = "FIND_FTS_MESSAGE_FOR_JID";
                    } else {
                        str = "";
                        str2 = str;
                        strArr = null;
                    }
                    C17960vV.A07(strArr);
                    r12.A03("compiled");
                    C61482pl A012 = A01(str, str2, strArr);
                    if (A012.A00 == -2) {
                        r5.A0F = false;
                        A012 = A01(str, "FIND_FTS_MESSAGE_FOR_JID_CONTENT_ONLY", new String[]{A0C((C42621yT) null, r5, (Integer) null), String.valueOf(A032)});
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("found: ");
                    sb4.append(A012.A01);
                    r12.A03(sb4.toString());
                    r12.A02();
                    return A012;
                }
            }
            return C61482pl.A00(-4);
        }
        AnonymousClass1Ez r3 = new AnonymousClass1Ez("FtsMessageStore/like/searchforjid");
        AnonymousClass1BI r6 = r5.A03;
        C17960vV.A07(r6);
        long A033 = AnonymousClass25A.A03(r19);
        if (A033 == Long.MIN_VALUE) {
            Log.e("FtsMessageStore/like/searchforjid/startid < 0");
            return C61482pl.A00(-4);
        }
        String replace = r5.A02().replace("'", "''").replace("%", "\\%");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("(");
        sb5.append("(");
        sb5.append("text_data LIKE '%");
        sb5.append(replace);
        sb5.append("%' ESCAPE '\\'");
        sb5.append(" AND ");
        sb5.append("message_type = '0");
        sb5.append("') ");
        sb5.append(")");
        String obj = sb5.toString();
        StringBuilder sb6 = new StringBuilder("   SELECT _id, sort_id FROM available_message_view WHERE chat_row_id = ?");
        sb6.append(" AND ");
        sb6.append(obj);
        C26121Qx.A03(sb6, z3, z4);
        sb6.append(" LIMIT 1");
        String obj2 = sb6.toString();
        C61482pl A002 = C61482pl.A00(-4);
        String[] strArr2 = {String.valueOf(this.A06.A09(r6)), String.valueOf(A033)};
        C28781at A042 = this.A0C.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A(obj2, "FIND_MESSAGE_FOR_JID_LIKE", strArr2);
            if (A0A2.moveToNext()) {
                A002 = new C61482pl(A0A2.getLong(A0A2.getColumnIndexOrThrow("sort_id")), 1, A0A2.getLong(A0A2.getColumnIndexOrThrow("_id")));
            }
            A0A2.close();
            A042.close();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("found: ");
            sb7.append(A002.A01);
            r3.A03(sb7.toString());
            r3.A02();
            return A002;
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

    public long BS5() {
        long A012 = this.A0I.A01("fts_ready", 0);
        long j = 1;
        if (!(A012 == 1 || A012 == 3)) {
            j = 5;
            if (!(A012 == 0 || A012 == 2 || A012 == 5)) {
                C17960vV.A0F(false, "Unknown Fts version, using V2");
            }
        }
        return j;
    }

    public AnonymousClass1QB(AnonymousClass190 r2, AnonymousClass11S r3, C25001Mm r4, AnonymousClass1M9 r5, C24921Me r6, C18000vb r7, AnonymousClass1Q8 r8, AnonymousClass1LW r9, AnonymousClass1CJ r10, C25181Nf r11, AnonymousClass1Q9 r12, AnonymousClass1DL r13, AnonymousClass1NH r14, C22611Cn r15, AnonymousClass1Cd r16, C24621La r17, C18030ve r18, AnonymousClass1Q5 r19, AnonymousClass19Y r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23) {
        this.A0D = r18;
        this.A09 = r13;
        this.A06 = r9;
        this.A01 = r2;
        this.A02 = r3;
        this.A0H = r10;
        this.A0F = r4;
        this.A0A = r14;
        this.A03 = r6;
        this.A04 = r7;
        this.A0K = r21;
        this.A0J = r19;
        this.A0I = r17;
        this.A05 = r8;
        this.A0C = r16;
        this.A0G = r5;
        this.A08 = r12;
        this.A0N = r23;
        this.A0E = r20;
        this.A07 = r11;
        this.A0L = r22;
        this.A0B = r15;
    }

    private String A03(AnonymousClass1BI r8, boolean z) {
        StringBuilder sb;
        String A0E2 = A0E(r8);
        if (C22971Dz.A0e(r8) || !z) {
            sb = new StringBuilder();
            sb.append("fts_jid:");
            sb.append(A0E2);
        } else {
            sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fts_jid: ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("1 ");
            sb3.append(A0E2);
            String obj = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("\"");
            sb4.append(obj);
            sb4.append("\"");
            sb2.append(sb4.toString());
            sb.append(sb2.toString());
            sb.append(" OR ");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fts_jid: ");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("0 ");
            sb6.append(A0E2);
            String obj2 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("\"");
            sb7.append(obj2);
            sb7.append("\"");
            sb5.append(sb7.toString());
            sb.append(sb5.toString());
        }
        return sb.toString();
    }

    public String A0C(C42621yT r13, C34141jz r14, Integer num) {
        StringBuilder sb;
        String str = "";
        if (!r14.A04().isEmpty()) {
            String A022 = r14.A02();
            if (!A022.startsWith("\"") || !A022.endsWith("\"") || A022.length() <= 2) {
                if (!r14.A0F || !C60542oC.A00(this)) {
                    sb = new StringBuilder();
                    sb.append(str);
                    List<String> A042 = r14.A04();
                    ArrayList arrayList = new ArrayList(A042.size());
                    for (String append : A042) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("content:");
                        sb2.append(append);
                        arrayList.add(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(TextUtils.join(" ", arrayList));
                    sb3.append("*");
                    str = sb3.toString();
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    if (!r14.A04().isEmpty()) {
                        ArrayList A0H2 = A0H(r13, r14, num);
                        StringBuilder sb4 = new StringBuilder();
                        int size = A0H2.size();
                        for (int i = 0; i < size && !A05(r13); i++) {
                            boolean z = false;
                            if (i == size - 1) {
                                z = true;
                            }
                            sb4.append(" ");
                            Pair pair = (Pair) A0H2.get(i);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("content:");
                            sb5.append((String) pair.first);
                            if (z) {
                                sb5.append('*');
                            }
                            for (int i2 = 0; i2 < ((List) pair.second).size(); i2++) {
                                AnonymousClass1BI r11 = (AnonymousClass1BI) ((List) pair.second).get(i2);
                                if (C22971Dz.A0Y(r11) || C22971Dz.A0e(r11)) {
                                    sb5.append(" OR ");
                                    sb5.append("fts_jid:");
                                    sb5.append(A0E(r11));
                                }
                            }
                            sb4.append(sb5.toString());
                        }
                        str = sb4.toString().trim();
                    }
                }
                sb.append(str);
                str = sb.toString();
            } else {
                str = A022;
            }
        }
        AnonymousClass1BI r4 = r14.A03;
        boolean z2 = false;
        if (r4 != null) {
            z2 = true;
        }
        if (z2) {
            C17960vV.A07(r4);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(" ");
            sb6.append(A03(r4, r14.A0G));
            str = sb6.toString();
        }
        List list = r14.A0C;
        if (list != null && !list.isEmpty()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(" ");
            List list2 = r14.A0C;
            C17960vV.A07(list2);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(A03((AnonymousClass1BI) list2.get(0), true));
            for (int i3 = 1; i3 < list2.size(); i3++) {
                sb8.append(" OR ");
                sb8.append(A03((AnonymousClass1BI) list2.get(i3), true));
            }
            sb7.append(sb8.toString());
            str = sb7.toString();
        }
        return A0D(r13, r14, str);
    }

    public void A0M(C34141jz r3) {
        try {
            A0N(r3);
        } catch (IllegalStateException e) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e);
        }
    }

    public void CQy(AnonymousClass206 r1) {
        A0L(r1);
    }
}
