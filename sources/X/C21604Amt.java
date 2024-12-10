package X;

import java.util.TimerTask;
import org.npci.upi.security.pinactivitycomponent.s;
import org.npci.upi.security.pinactivitycomponent.u;

/* renamed from: X.Amt  reason: case insensitive filesystem */
public class C21604Amt extends TimerTask {
    public long A00 = (System.currentTimeMillis() - 45000);
    public final /* synthetic */ int A01;
    public final /* synthetic */ s A02;
    public final /* synthetic */ u A03;

    public C21604Amt(s sVar, u uVar, int i) {
        this.A02 = sVar;
        this.A03 = uVar;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012f, code lost:
        if (r7 == null) goto L_0x0134;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r9 = r17
            org.npci.upi.security.pinactivitycomponent.u r8 = r9.A03
            int r10 = r9.A01
            long r0 = r9.A00
            r2 = 2000(0x7d0, double:9.88E-321)
            long r0 = r0 - r2
            java.lang.String r2 = "content://sms/inbox"
            android.net.Uri r12 = android.net.Uri.parse(r2)
            r2 = 4
            java.lang.String[] r13 = new java.lang.String[r2]
            r7 = 0
            java.lang.String r6 = "_id"
            r13[r7] = r6
            java.lang.String r2 = "address"
            r5 = 1
            r13[r5] = r2
            java.lang.String r2 = "body"
            r4 = 2
            r13[r4] = r2
            r3 = 3
            java.lang.String r2 = "date"
            r13[r3] = r2
            java.lang.String r3 = "date > ?"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r14 = java.lang.String.format(r3, r2)
            java.lang.String r16 = "date DESC"
            android.content.Context r2 = r8.A00     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            android.content.ContentResolver r11 = r2.getContentResolver()     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            java.lang.String r2 = ""
            java.lang.String r0 = X.C17890vO.A0a(r2, r3, r0)     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            r15[r7] = r0     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            android.database.Cursor r7 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
        L_0x004a:
            boolean r0 = r7.moveToNext()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = r7.getString(r5)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = r7.getString(r4)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            X.9lb r3 = r8.A01(r1, r0, r10)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r3 == 0) goto L_0x004a
            int r0 = r7.getColumnIndex(r6)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.Long r0 = X.C17890vO.A0M(r7, r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r3.A02 = r11     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = r8.A01     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x0080
            X.9ZM r0 = r8.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = X.AnonymousClass8BW.A0t(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r8.A01 = r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x0080:
            boolean r0 = r0.contains(r11)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r3.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r11 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = r8.A01     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x00a0
            X.9ZM r0 = r8.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = X.AnonymousClass8BW.A0t(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r8.A01 = r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x00a0:
            boolean r0 = r0.contains(r11)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x004a
            java.lang.String r10 = r3.A02     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r10 != 0) goto L_0x00b3
            java.lang.String r0 = r3.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r10 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r10 != 0) goto L_0x00b3
            goto L_0x0116
        L_0x00b3:
            X.9ZM r0 = r8.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r6 = "msgID"
            android.content.SharedPreferences r8 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = r8.getString(r6, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r5 = ","
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.ArrayList r4 = X.C17880vN.A10(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            boolean r0 = r4.contains(r10)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x0116
            int r1 = r4.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0 = 10
            if (r1 < r0) goto L_0x00dd
            r0 = 0
            r4.remove(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x00dd:
            r4.add(r10)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            int r0 = r4.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 > 0) goto L_0x00e8
            r1 = 0
            goto L_0x010c
        L_0x00e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r4)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r2 = 1
        L_0x00f7:
            int r0 = r4.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r2 >= r0) goto L_0x010c
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r1, r5)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = X.C108945cZ.A1H(r4, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x010c:
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0.putString(r6, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0.commit()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x0116:
            r7.close()
            android.os.Handler r2 = X.C17890vO.A0D()
            r1 = 11
            X.Aim r0 = new X.Aim
            r0.<init>(r9, r3, r1)
            r2.post(r0)
            goto L_0x0134
        L_0x0128:
            r0 = move-exception
            if (r7 == 0) goto L_0x012e
            r7.close()
        L_0x012e:
            throw r0
        L_0x012f:
            if (r7 == 0) goto L_0x0134
        L_0x0131:
            r7.close()
        L_0x0134:
            long r0 = java.lang.System.currentTimeMillis()
            r9.A00 = r0
            return
        L_0x013b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21604Amt.run():void");
    }
}
