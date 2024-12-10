package X;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;

/* renamed from: X.Ajo  reason: case insensitive filesystem */
public abstract class C21421Ajo implements Runnable {
    public final C20346AHc A00 = new C20346AHc();

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        r2.close();
        r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0197, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0198, code lost:
        X.C20076A6c.A02(r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000e, B:29:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            r5 = r9
            boolean r0 = r9 instanceof X.AnonymousClass8KQ     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x007c
            X.8KQ r5 = (X.AnonymousClass8KQ) r5     // Catch:{ all -> 0x019c }
            X.A7W r8 = r5.A00     // Catch:{ all -> 0x019c }
            androidx.work.impl.WorkDatabase r4 = r8.A04     // Catch:{ all -> 0x019c }
            r4.A07()     // Catch:{ all -> 0x019c }
            X.BD8 r1 = r4.A0E()     // Catch:{ all -> 0x0197 }
            X.AHv r1 = (X.C20365AHv) r1     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"
            r7 = 0
            X.AHX r6 = X.A3D.A00(r0, r7)     // Catch:{ all -> 0x0197 }
            X.A6c r0 = r1.A02     // Catch:{ all -> 0x0197 }
            r0.A06()     // Catch:{ all -> 0x0197 }
            r3 = 0
            android.database.Cursor r2 = X.AnonymousClass9OB.A00(r0, r6, r7)     // Catch:{ all -> 0x0197 }
            java.util.ArrayList r1 = X.AnonymousClass8BV.A0w(r2)     // Catch:{ all -> 0x00e1 }
        L_0x0029:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x003f
            boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x003b
        L_0x0037:
            java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00e1 }
        L_0x003b:
            r1.add(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x0029
        L_0x003f:
            r2.close()     // Catch:{ all -> 0x0197 }
            r6.A00()     // Catch:{ all -> 0x0197 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0197 }
        L_0x0049:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0197 }
            r5.A00(r8, r0)     // Catch:{ all -> 0x0197 }
            goto L_0x0049
        L_0x0057:
            X.9UN r3 = new X.9UN     // Catch:{ all -> 0x0197 }
            r3.<init>(r4)     // Catch:{ all -> 0x0197 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = "last_cancel_all_time_ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0197 }
            X.9po r1 = new X.9po     // Catch:{ all -> 0x0197 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0197 }
            androidx.work.impl.WorkDatabase r0 = r3.A00     // Catch:{ all -> 0x0197 }
            X.BA2 r0 = r0.A0A()     // Catch:{ all -> 0x0197 }
            r0.Bdd(r1)     // Catch:{ all -> 0x0197 }
            r4.A08()     // Catch:{ all -> 0x0197 }
            X.C20076A6c.A02(r4)     // Catch:{ all -> 0x019c }
            goto L_0x018a
        L_0x007c:
            boolean r0 = r9 instanceof X.AnonymousClass8KT     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x00e9
            X.8KT r5 = (X.AnonymousClass8KT) r5     // Catch:{ all -> 0x019c }
            X.A7W r7 = r5.A00     // Catch:{ all -> 0x019c }
            androidx.work.impl.WorkDatabase r4 = r7.A04     // Catch:{ all -> 0x019c }
            r4.A07()     // Catch:{ all -> 0x019c }
            X.BD8 r2 = r4.A0E()     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x0197 }
            X.AHv r2 = (X.C20365AHv) r2     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            X.AHX r8 = X.A3D.A02(r0, r1)     // Catch:{ all -> 0x0197 }
            X.A6c r0 = r2.A02     // Catch:{ all -> 0x0197 }
            r0.A06()     // Catch:{ all -> 0x0197 }
            r6 = 0
            r3 = 0
            android.database.Cursor r2 = X.AnonymousClass9OB.A00(r0, r8, r6)     // Catch:{ all -> 0x0197 }
            java.util.ArrayList r1 = X.AnonymousClass8BV.A0w(r2)     // Catch:{ all -> 0x00d9 }
        L_0x00a6:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00b4
            r0 = r3
            goto L_0x00b8
        L_0x00b4:
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d9 }
        L_0x00b8:
            r1.add(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x00a6
        L_0x00bc:
            r2.close()     // Catch:{ all -> 0x0197 }
            r8.A00()     // Catch:{ all -> 0x0197 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0197 }
        L_0x00c6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0197 }
            r5.A00(r7, r0)     // Catch:{ all -> 0x0197 }
            goto L_0x00c6
        L_0x00d4:
            r4.A08()     // Catch:{ all -> 0x0197 }
            goto L_0x017c
        L_0x00d9:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0197 }
            r8.A00()     // Catch:{ all -> 0x0197 }
            goto L_0x00e8
        L_0x00e1:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0197 }
            r6.A00()     // Catch:{ all -> 0x0197 }
        L_0x00e8:
            throw r0     // Catch:{ all -> 0x0197 }
        L_0x00e9:
            boolean r0 = r9 instanceof X.AnonymousClass8KS     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x015c
            X.8KS r5 = (X.AnonymousClass8KS) r5     // Catch:{ all -> 0x019c }
            X.A7W r7 = r5.A00     // Catch:{ all -> 0x019c }
            androidx.work.impl.WorkDatabase r6 = r7.A04     // Catch:{ all -> 0x019c }
            r6.A07()     // Catch:{ all -> 0x019c }
            X.BD8 r2 = r6.A0E()     // Catch:{ all -> 0x0157 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x0157 }
            X.AHv r2 = (X.C20365AHv) r2     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            X.AHX r8 = X.A3D.A02(r0, r1)     // Catch:{ all -> 0x0157 }
            X.A6c r0 = r2.A02     // Catch:{ all -> 0x0157 }
            r0.A06()     // Catch:{ all -> 0x0157 }
            r4 = 0
            r3 = 0
            android.database.Cursor r2 = X.AnonymousClass9OB.A00(r0, r8, r4)     // Catch:{ all -> 0x0157 }
            java.util.ArrayList r1 = X.AnonymousClass8BV.A0w(r2)     // Catch:{ all -> 0x014f }
        L_0x0113:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0129
            boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0121
            r0 = r3
            goto L_0x0125
        L_0x0121:
            java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x014f }
        L_0x0125:
            r1.add(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0113
        L_0x0129:
            r2.close()     // Catch:{ all -> 0x0157 }
            r8.A00()     // Catch:{ all -> 0x0157 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0157 }
        L_0x0133:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0157 }
            r5.A00(r7, r0)     // Catch:{ all -> 0x0157 }
            goto L_0x0133
        L_0x0141:
            r6.A08()     // Catch:{ all -> 0x0157 }
            X.C20076A6c.A02(r6)     // Catch:{ all -> 0x019c }
            X.00I r1 = r7.A02     // Catch:{ all -> 0x019c }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x019c }
            X.C20066A5p.A01(r1, r6, r0)     // Catch:{ all -> 0x019c }
            goto L_0x018a
        L_0x014f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0157 }
            r8.A00()     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            X.C20076A6c.A02(r6)     // Catch:{ all -> 0x019c }
            goto L_0x019b
        L_0x015c:
            X.8KR r5 = (X.AnonymousClass8KR) r5     // Catch:{ all -> 0x019c }
            X.A7W r3 = r5.A00     // Catch:{ all -> 0x019c }
            androidx.work.impl.WorkDatabase r2 = r3.A04     // Catch:{ all -> 0x019c }
            r2.A07()     // Catch:{ all -> 0x019c }
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0192 }
            r5.A00(r3, r0)     // Catch:{ all -> 0x0192 }
            r2.A08()     // Catch:{ all -> 0x0192 }
            X.C20076A6c.A02(r2)     // Catch:{ all -> 0x019c }
            X.00I r1 = r3.A02     // Catch:{ all -> 0x019c }
            java.util.List r0 = r3.A07     // Catch:{ all -> 0x019c }
            X.C20066A5p.A01(r1, r2, r0)     // Catch:{ all -> 0x019c }
            goto L_0x018a
        L_0x017c:
            X.C20076A6c.A02(r4)     // Catch:{ all -> 0x019c }
            boolean r0 = r5.A02     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x018a
            X.00I r1 = r7.A02     // Catch:{ all -> 0x019c }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x019c }
            X.C20066A5p.A01(r1, r4, r0)     // Catch:{ all -> 0x019c }
        L_0x018a:
            X.AHc r1 = r9.A00     // Catch:{ all -> 0x019c }
            X.8Jr r0 = X.BDL.A01     // Catch:{ all -> 0x019c }
            r1.A00(r0)     // Catch:{ all -> 0x019c }
            return
        L_0x0192:
            r0 = move-exception
            X.C20076A6c.A02(r2)     // Catch:{ all -> 0x019c }
            goto L_0x019b
        L_0x0197:
            r0 = move-exception
            X.C20076A6c.A02(r4)     // Catch:{ all -> 0x019c }
        L_0x019b:
            throw r0     // Catch:{ all -> 0x019c }
        L_0x019c:
            r2 = move-exception
            X.AHc r1 = r9.A00
            X.8Js r0 = new X.8Js
            r0.<init>(r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21421Ajo.run():void");
    }

    public void A00(A7W a7w, String str) {
        C21469Aka A002;
        WorkDatabase workDatabase = a7w.A04;
        BD8 A0E = workDatabase.A0E();
        C22400B6d A09 = workDatabase.A09();
        LinkedList A14 = AnonymousClass8BR.A14();
        A14.add(str);
        while (!A14.isEmpty()) {
            String str2 = (String) A14.remove();
            Integer BZd = A0E.BZd(str2);
            if (!(BZd == AnonymousClass00R.A0C || BZd == AnonymousClass00R.A0N)) {
                C20365AHv aHv = (C20365AHv) A0E;
                C20076A6c a6c = aHv.A02;
                a6c.A06();
                C19955A0m a0m = aHv.A07;
                BDc A01 = a0m.A01();
                if (str2 == null) {
                    A01.BDA(1);
                } else {
                    A01.BDB(1, str2);
                }
                a6c.A07();
                try {
                    AHW.A00(a6c, A01);
                } finally {
                    C20076A6c.A02(a6c);
                    a0m.A02(A01);
                }
            }
            A14.addAll(A09.BQV(str2));
        }
        C20359AHp aHp = a7w.A03;
        synchronized (aHp.A09) {
            A5Z A003 = A5Z.A00();
            String str3 = C20359AHp.A0B;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Processor cancelling ");
            AnonymousClass8BW.A16(A003, str, str3, A10);
            aHp.A07.add(str);
            A002 = C20359AHp.A00(aHp, str);
        }
        C20359AHp.A01(A002, str, 1);
        for (C22531BBo BEL : a7w.A07) {
            BEL.BEL(str);
        }
    }
}
