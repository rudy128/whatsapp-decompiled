package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1N8  reason: invalid class name */
public class AnonymousClass1N8 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CL A01;
    public final C22611Cn A02;
    public final AnonymousClass1Cd A03;
    public final C24661Le A04;
    public final AnonymousClass1N5 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1CJ A07;

    public ArrayList A00(AnonymousClass1BI r12, long j, boolean z) {
        Cursor A0A;
        AnonymousClass1Ez r6 = new AnonymousClass1Ez(false);
        r6.A05("msgstore/unsentreadreceiptsforjid");
        ArrayList arrayList = new ArrayList();
        AnonymousClass1N5 r7 = this.A05;
        if (r7.A03(r12) || z) {
            C29691ci A0A2 = this.A07.A0A(r12);
            if (A0A2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/unsentreadreceiptsforjid/no chat for ");
                sb.append(r12);
                Log.w(sb.toString());
                return arrayList;
            } else if (A0A2.A0R != A0A2.A0T) {
                String[] strArr = new String[3];
                strArr[0] = String.valueOf(this.A00.A09(r12));
                strArr[1] = String.valueOf(A0A2.A0S);
                if (r7.A04(r12)) {
                    j = A0A2.A0U;
                }
                strArr[2] = String.valueOf(j);
                try {
                    C28781at A042 = this.A03.get();
                    try {
                        A0A = ((C28801av) A042).A02.A0A(AnonymousClass203.A0P, "UNSENT_READ_RECEIPTS_FOR_JID_SQL", strArr);
                        while (A0A.moveToNext()) {
                            AnonymousClass206 A022 = ((AnonymousClass1W6) this.A06.get()).A02(A0A, r12);
                            if (A022 != null && A022.A0I > 1415214000000L) {
                                arrayList.add(A022);
                            }
                        }
                        A0A.close();
                        A042.close();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("msgstore/unsentreadreceiptsforjid ");
                        sb2.append(arrayList.size());
                        sb2.append(" | time spent:");
                        sb2.append(r6.A02());
                        Log.i(sb2.toString());
                        return arrayList;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    Log.i("msgstore/unsentreadreceiptsforjid/IllegalStateException ", e);
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    this.A02.A03();
                } catch (SQLiteFullException e3) {
                    this.A01.A00(0);
                    throw e3;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        }
        return arrayList;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A02.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1BI r7, long r8, long r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CJ r0 = r6.A07
            X.1ci r3 = r0.A0A(r7)
            if (r3 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/setchatreadreceiptssent/no chat for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0038:
            return
        L_0x0039:
            long r1 = r3.A0U
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r3.A0T = r8
            r3.A0U = r10
            X.1LW r5 = r6.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
            monitor-enter(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
            r0 = 3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0067 }
            r4.<init>(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = "last_read_receipt_sent_message_row_id"
            long r0 = r3.A0T     // Catch:{ all -> 0x0067 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = "last_read_receipt_sent_message_sort_id"
            long r0 = r3.A0U     // Catch:{ all -> 0x0067 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
            r5.A0M(r4, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x006f, Error | RuntimeException -> 0x006a }
        L_0x006a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x006f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r6.A02
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N8.A01(X.1BI, long, long):void");
    }

    public AnonymousClass1N8(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1CL r3, C22611Cn r4, AnonymousClass1Cd r5, C24661Le r6, AnonymousClass1N5 r7, AnonymousClass00H r8) {
        this.A00 = r1;
        this.A07 = r2;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
