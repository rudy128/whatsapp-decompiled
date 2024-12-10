package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1a4  reason: invalid class name and case insensitive filesystem */
public abstract class C28381a4 {
    public final int A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1Cd A02;
    public final C24621La A03;
    public final C28351a0 A04;
    public final String A05;
    public final AnonymousClass11Z A06;
    public final C26291Ro A07;
    public final AnonymousClass1a2 A08;
    public final AnonymousClass1a6 A09;
    public final AnonymousClass1W6 A0A;
    public final AnonymousClass00H A0B;

    public static void A00(C28381a4 r5, C55312fZ r6) {
        String str;
        C24621La r4 = r5.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("migration_stats_");
        sb.append(r5.A05);
        String obj = sb.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("row_processed", r6.A03);
            jSONObject.put("row_skipped", r6.A04);
            jSONObject.put("db_size_change", r6.A00);
            jSONObject.put("migration_time_spent", r6.A01);
            jSONObject.put("retry_count", r6.A02);
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e("Failed to save migration statistics to JSON object.", e);
            str = null;
        }
        r4.A06(obj, str);
    }

    public int A01() {
        if ((this instanceof AnonymousClass1aZ) || A0I() || (this instanceof AnonymousClass1a5) || (this instanceof AnonymousClass1a7)) {
            return 3;
        }
        C28351a0 r0 = this.A04;
        String str = this.A05;
        C18030ve r2 = r0.A00;
        C18040vf r1 = C18040vf.A02;
        if (C28351a0.A00(C18020vd.A01(r1, r2, 207), str)) {
            return 1;
        }
        if (C28351a0.A00(C18020vd.A01(r1, r2, 208), str) || !C28351a0.A00(C18020vd.A01(r1, r2, 209), str)) {
            return 2;
        }
        return 3;
    }

    public long A03() {
        C24621La r5 = this.A03;
        if (0 == r5.A01(A07(), 0)) {
            return r5.A01(A06(), 0);
        }
        return 0;
    }

    public Cursor A04(C28781at r6, int i, long j) {
        String str;
        C23141Ev r3 = ((C28801av) r6).A02;
        if (!(this instanceof AnonymousClass1a5)) {
            if (!(this instanceof C28581aT) && !(this instanceof AnonymousClass1aX)) {
                if (!(this instanceof AnonymousClass1a7)) {
                    if (!(this instanceof AnonymousClass1aY)) {
                        str = C50632Ve.A00;
                        String[] strArr = {String.valueOf(j), String.valueOf(i)};
                        StringBuilder sb = new StringBuilder();
                        sb.append("MIGRATION_GET_QUERY_FOR_");
                        sb.append(this.A05);
                        return r3.A0A(str, sb.toString(), strArr);
                    }
                }
            }
            str = "SELECT _id, label_id, message_row_id FROM labeled_messages WHERE _id > ?  LIMIT ?";
            String[] strArr2 = {String.valueOf(j), String.valueOf(i)};
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MIGRATION_GET_QUERY_FOR_");
            sb2.append(this.A05);
            return r3.A0A(str, sb2.toString(), strArr2);
        }
        str = "";
        String[] strArr22 = {String.valueOf(j), String.valueOf(i)};
        StringBuilder sb22 = new StringBuilder();
        sb22.append("MIGRATION_GET_QUERY_FOR_");
        sb22.append(this.A05);
        return r3.A0A(str, sb22.toString(), strArr22);
    }

    public String A05() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05);
        sb.append("_in_progress");
        return sb.toString();
    }

    public String A06() {
        if (this instanceof AnonymousClass1a5) {
            return "rename_deprecated_tables_retry_count";
        }
        if (this instanceof C28581aT) {
            return "labelled_messages_to_stars_retry_count";
        }
        if (this instanceof AnonymousClass1aX) {
            return "label_messages_to_label_chats_retry_count";
        }
        if (this instanceof AnonymousClass1a7) {
            return "drop_deprecated_tables_retry_count";
        }
        if (this instanceof AnonymousClass1aY) {
            return "delete_labels_from_messages_retry_count";
        }
        return "migration_fts_retry";
    }

    public String A07() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05);
        sb.append("_retry_revision");
        return sb.toString();
    }

    public String A08() {
        if (this instanceof AnonymousClass1a5) {
            return "rename_deprecated_tables_start_index";
        }
        if (this instanceof C28581aT) {
            return "labelled_messages_to_stars_start_index";
        }
        if (this instanceof AnonymousClass1aX) {
            return "label_messages_to_label_chats_start_index";
        }
        if (this instanceof AnonymousClass1a7) {
            return "drop_deprecated_tables_start_index";
        }
        if (this instanceof AnonymousClass1aY) {
            return "delete_labels_from_messages_start_index";
        }
        return "migration_fts_index";
    }

    public HashSet A09() {
        if (!(this instanceof AnonymousClass1a7)) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        hashSet.add("rename_deprecated_tables");
        return hashSet;
    }

    public void A0A() {
        C24621La r3 = this.A03;
        r3.A03(A08());
        r3.A03(A06());
        r3.A03(A07());
        int i = this.A00;
        if (Integer.MIN_VALUE != i) {
            r3.A03(A05());
            StringBuilder sb = new StringBuilder();
            sb.append(this.A05);
            sb.append("_complete");
            r3.A04(sb.toString(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r3 != -1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r15 = this;
            X.11Z r0 = r15.A06
            long r5 = r0.A02()
            X.1a0 r0 = r15.A04
            java.lang.String r10 = r15.A05
            X.0ve r2 = r0.A00
            r1 = 402(0x192, float:5.63E-43)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r1 = X.C18020vd.A01(r0, r2, r1)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r1 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r13 = 0
            if (r0 == 0) goto L_0x0052
            r3 = 0
        L_0x0028:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0094
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; availableInternalPhoneStorage="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; minInternalStorageRequired="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0052:
            java.lang.String r0 = ";"
            java.lang.String[] r11 = r1.split(r0)
            int r9 = r11.length
            r12 = 0
            r8 = 0
        L_0x005b:
            r1 = -1
            if (r8 >= r9) goto L_0x0090
            r0 = r11[r8]
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.startsWith(r10)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r3.split(r0)
            int r3 = r4.length
            r0 = 2
            if (r3 != r0) goto L_0x008d
            r7 = r4[r12]
            r0 = 1
            r0 = r4[r0]
            long r3 = X.C20099A7c.A04(r0, r1)
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x008d
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            goto L_0x0028
        L_0x008d:
            int r8 = r8 + 1
            goto L_0x005b
        L_0x0090:
            r3 = 10485760(0xa00000, double:5.180654E-317)
            goto L_0x0028
        L_0x0094:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28381a4.A0B():boolean");
    }

    public boolean A0C() {
        if (this.A03.A01(A08(), -1) >= 0) {
            return true;
        }
        return false;
    }

    public boolean A0D() {
        if (!(this instanceof AnonymousClass1a5) && !(this instanceof C28581aT) && !(this instanceof AnonymousClass1aX)) {
            if (this instanceof AnonymousClass1a7) {
                if (this.A03.A00("drop_deprecated_tables_status", 0) == 1) {
                    return true;
                }
                return false;
            } else if (!(this instanceof AnonymousClass1aY)) {
                AnonymousClass1QB r1 = ((AnonymousClass1aZ) this).A00;
                if (!r1.A0O() || r1.BS5() != 5) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public boolean A0E() {
        AnonymousClass1a2 r1 = this.A08;
        String str = this.A05;
        if (!((Set) r1.A01.get()).contains(str)) {
            if (C28351a0.A00(C18020vd.A01(C18040vf.A02, r1.A00.A00, 404), str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0F() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        if ((this instanceof AnonymousClass1a5) || (this instanceof AnonymousClass1a7) || (this instanceof AnonymousClass1aZ)) {
            return false;
        }
        if ((A0D() || A0C()) && !A0H()) {
            sb = new StringBuilder();
            sb.append("DatabaseMigration/isStale, migration '");
            sb.append(this.A05);
            str = "' doesn't met dependency requirements, mark as stale.";
        } else {
            int i = this.A00;
            if (Integer.MIN_VALUE != i) {
                C24621La r6 = this.A03;
                int A002 = r6.A00(A05(), -1);
                if (A0C() && A002 == -1) {
                    sb2 = new StringBuilder();
                    sb2.append("DatabaseMigration/isStale, migration '");
                    sb2.append(this.A05);
                    sb2.append("' started, but its version = ");
                    sb2.append(A002);
                } else if (A002 == -1 || A002 == i) {
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = this.A05;
                    sb3.append(str2);
                    sb3.append("_complete");
                    int A003 = r6.A00(sb3.toString(), -1);
                    if (!(A003 == -1 || A003 == i)) {
                        sb = new StringBuilder();
                        sb.append("DatabaseMigration/isStale, migration '");
                        sb.append(str2);
                        sb.append("' completed, but has version = ");
                        sb.append(A003);
                        sb.append(", expected version = ");
                        sb.append(i);
                        str = ", mark as stale to re-run.";
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("DatabaseMigration/isStale, migration '");
                    sb2.append(this.A05);
                    sb2.append("' started, but has version = ");
                    sb2.append(A002);
                    sb2.append(", expected version = ");
                    sb2.append(i);
                }
                sb2.append(", mark as stale.");
                Log.i(sb2.toString());
                return true;
            }
            return false;
        }
        sb2.append(str);
        Log.i(sb2.toString());
        return true;
    }

    public boolean A0G() {
        if (!(this instanceof AnonymousClass1aZ) && A03() > 100) {
            return true;
        }
        return false;
    }

    public boolean A0I() {
        C28351a0 r1 = this.A04;
        String str = this.A05;
        if (!r1.A02.contains(str)) {
            if (C28351a0.A00(C18020vd.A01(C18040vf.A02, r1.A00, 242), str) || A0E()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0J(Throwable th, int i) {
        StringBuilder sb;
        String str;
        if (th instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        boolean z = th instanceof SQLiteBlobTooBigException;
        if (i == 1) {
            if (z) {
                sb = new StringBuilder();
                sb.append("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                sb.append(this.A05);
                str = "; BlobTooBigException - skipping row";
            } else if (!(th instanceof IllegalStateException)) {
                return false;
            } else {
                sb = new StringBuilder();
                sb.append("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                sb.append(this.A05);
                str = "; IllegalStateException - skipping row";
            }
            sb.append(str);
            Log.e(sb.toString());
            return true;
        } else if (z || (th instanceof SQLiteOutOfMemoryException) || (th instanceof IllegalStateException)) {
            return true;
        } else {
            return false;
        }
    }

    public C28381a4(C28371a3 r2, String str, int i) {
        this.A05 = str;
        this.A00 = i;
        this.A01 = r2.A00;
        this.A06 = (AnonymousClass11Z) r2.A0B.get();
        this.A0A = r2.A08;
        this.A0B = r2.A0A;
        this.A03 = r2.A05;
        this.A04 = r2.A07;
        this.A02 = r2.A04;
        this.A09 = (AnonymousClass1a6) r2.A09.get();
        this.A08 = r2.A06;
        this.A07 = r2.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r5 = this;
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0011
            boolean r1 = r5.A0H()
            r0 = 11
            if (r1 != 0) goto L_0x0010
            r0 = 13
        L_0x0010:
            return r0
        L_0x0011:
            int r0 = r5.A01()
            r4 = 4
            r3 = 2
            r2 = 1
            if (r0 != r3) goto L_0x0028
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x006f
            r0 = 0
            return r0
        L_0x0028:
            int r0 = r5.A01()
            r1 = 3
            if (r0 != r1) goto L_0x005b
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x0045
            r0 = 12
            return r0
        L_0x0045:
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x0057
            r5.A0C()
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0055
            return r1
        L_0x0055:
            r0 = 5
            return r0
        L_0x0057:
            r0 = 10
            return r0
        L_0x005a:
            return r2
        L_0x005b:
            int r0 = r5.A01()
            if (r0 != r2) goto L_0x0070
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x006d
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x006f
        L_0x006d:
            r0 = 7
            return r0
        L_0x006f:
            return r4
        L_0x0070:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28381a4.A02():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H() {
        /*
            r5 = this;
            java.util.HashSet r0 = r5.A09()
            java.util.Iterator r2 = r0.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            X.00H r0 = r5.A0B
            java.lang.Object r0 = r0.get()
            X.1DK r0 = (X.AnonymousClass1DK) r0
            X.1a4 r1 = r0.A01(r4)
            r3 = 0
            if (r1 != 0) goto L_0x0046
            X.190 r2 = r5.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.A05
            r1.append(r0)
            java.lang.String r0 = " depends on "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " (missing)"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "db-migration-missing-dep"
            r2.A0G(r0, r1, r3)
        L_0x0045:
            return r3
        L_0x0046:
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0008
            return r3
        L_0x0053:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28381a4.A0H():boolean");
    }
}
