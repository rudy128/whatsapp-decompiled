package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.4Xl  reason: invalid class name and case insensitive filesystem */
public class C87884Xl {
    public final AnonymousClass1ST A00;
    public final C133656pG A01;
    public final C218617r A02;
    public final C24921Me A03;
    public final C62182qv A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;

    public C010105w A01(Activity activity, AnonymousClass1FR r10, AnonymousClass1BI r11) {
        Activity activity2 = activity;
        C73203Rj A002 = AnonymousClass4a6.A00(activity);
        A002.A0D(2131890232);
        AnonymousClass1FR r4 = r10;
        AnonymousClass1BI r6 = r11;
        A002.A0Z(new AnonymousClass4b0(activity2, r4, this, r6, 2), 2131891318);
        A002.A0Y(new AnonymousClass4b0(activity2, r4, this, r6, 3), 2131898585);
        return A002.create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r7 = (X.AnonymousClass21V) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.app.Activity r12, X.AnonymousClass1FR r13, X.AnonymousClass1BI r14) {
        /*
            r11 = this;
            X.1ST r3 = r11.A00     // Catch:{ all -> 0x00c1 }
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "mediamsgstore/getMediaMessages "
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r14)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = " limit:"
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ all -> 0x00c1 }
            r4 = 0
            X.1Ez r1 = new X.1Ez     // Catch:{ all -> 0x00c1 }
            r1.<init>((boolean) r4)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "mediamsgstore/getMediaMessages/"
            r1.A05(r0)     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00c1 }
            X.1LW r0 = r3.A02     // Catch:{ all -> 0x00c1 }
            long r6 = r0.A09(r14)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c1 }
            java.lang.String r8 = X.C51012Wq.A08     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = "GET_MEDIA_MESSAGES_FOR_EXPORT"
            X.1Cd r0 = r3.A08     // Catch:{ SQLiteDiskIOException -> 0x00ba }
            X.1at r9 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00ba }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b0 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x00b0 }
            r0[r4] = r10     // Catch:{ all -> 0x00b0 }
            android.database.Cursor r6 = r6.A0A(r8, r7, r0)     // Catch:{ all -> 0x00b0 }
        L_0x0044:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x007b
            X.00H r0 = r3.A0C     // Catch:{ all -> 0x00a4 }
            X.206 r7 = X.C72463Mc.A0h(r6, r14, r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r7 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0044
            X.21V r7 = (X.AnonymousClass21V) r7     // Catch:{ all -> 0x00a4 }
            X.2rc r8 = r7.A02     // Catch:{ all -> 0x00a4 }
            if (r8 == 0) goto L_0x0044
            X.205 r0 = r7.A0v     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = r8.A0V     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0044
        L_0x0064:
            java.io.File r0 = r8.A0G     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0044
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = X.C72473Md.A1Q(r0)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0044
            r5.add(r7)     // Catch:{ all -> 0x00a4 }
            int r0 = r5.size()     // Catch:{ all -> 0x00a4 }
            if (r0 < r2) goto L_0x0044
        L_0x007b:
            r6.close()     // Catch:{ all -> 0x00b0 }
            r9.close()     // Catch:{ SQLiteDiskIOException -> 0x00ba }
            r1.A02()     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "mediamsgstore/getMediaMessages size:"
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            int r0 = r5.size()     // Catch:{ all -> 0x00c1 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x00c1 }
            int r0 = r5.size()     // Catch:{ all -> 0x00c1 }
            if (r0 <= 0) goto L_0x00a0
            r0 = 10
            X.AnonymousClass4Yv.A01(r12, r0)
            return
        L_0x00a0:
            A00(r12, r13, r11, r14, r4)
            return
        L_0x00a4:
            r1 = move-exception
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDiskIOException -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            X.1CL r0 = r3.A06     // Catch:{ all -> 0x00c1 }
            r0.A00(r2)     // Catch:{ all -> 0x00c1 }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87884Xl.A02(android.app.Activity, X.1FR, X.1BI):void");
    }

    public C87884Xl(C133656pG r1, C218617r r2, C24921Me r3, C62182qv r4, AnonymousClass1ST r5, C18030ve r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r2;
        this.A01 = r1;
        this.A07 = r8;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = r5;
    }

    public static void A00(Context context, AnonymousClass1FR r12, C87884Xl r13, AnonymousClass1BI r14, boolean z) {
        r12.CNB(2131895078, 2131895077);
        AnonymousClass10I r1 = r13.A06;
        C18030ve r10 = r13.A05;
        Context context2 = context;
        C17890vO.A0u(new C49252Pt(context2, r12, r13.A01, r13.A02, r13.A03, (AnonymousClass11Z) r13.A07.get(), r13.A04, r10, r14, z), r1);
    }
}
