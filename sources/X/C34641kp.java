package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1kp  reason: invalid class name and case insensitive filesystem */
public class C34641kp implements AnonymousClass1R4 {
    public AnonymousClass2PG A00;
    public final C34531kd A01;
    public final C33251iW A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass11P A04;
    public final C19830z4 A05;
    public final AnonymousClass122 A06;
    public final AnonymousClass1Cd A07;
    public final C34591kk A08;
    public final AnonymousClass1WM A09;
    public final C18030ve A0A;
    public final C34631ko A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final C26431Sc A0E;

    public void Bvh() {
        AnonymousClass1Cd r0 = this.A07;
        r0.A06();
        if (r0.A08) {
            Iterator it = this.A08.A02().iterator();
            while (it.hasNext()) {
                AnonymousClass206 r9 = (AnonymousClass206) it.next();
                long A012 = AnonymousClass11P.A01(this.A04);
                long j = r9.A0I;
                if (j + 10800000 < A012 && j + 86400000 >= A012 && A01(r9)) {
                    C19830z4 r6 = this.A05;
                    if (((SharedPreferences) r6.A00.get()).getLong("last_unsent_notification_time", 0) + 86400000 < A012) {
                        Log.i("Posting notification about unsent messages");
                        C19830z4.A00(r6).putLong("last_unsent_notification_time", A012).apply();
                        C34631ko r5 = this.A0B;
                        Context context = r5.A00.A00;
                        C18070vi.A0X(context);
                        String string = context.getString(2131892111);
                        C18070vi.A0X(string);
                        String string2 = context.getString(2131892110);
                        C18070vi.A0X(string2);
                        AnonymousClass00H r02 = r5.A01;
                        r02.get();
                        r02.get();
                        Intent A022 = AnonymousClass1LU.A02(context);
                        A022.putExtra("fromNotification", true);
                        PendingIntent A002 = C1408573i.A00(context, 1, A022, 0);
                        C1409673t A032 = C217217d.A03(context);
                        A032.A0M = "failure_notifications@1";
                        A032.A0F(string);
                        A032.A09(System.currentTimeMillis());
                        A032.A06(3);
                        A032.A0G(true);
                        A032.A0E(string);
                        A032.A0D(string2);
                        A032.A0A = A002;
                        A032.A08.icon = 2131231578;
                        Notification A052 = A032.A05();
                        C18070vi.A0X(A052);
                        ((C27301Vn) r5.A02.get()).BkR(6, A052);
                        r5.A03 = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C34641kp(C34531kd r2, C33251iW r3, AnonymousClass11E r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass122 r7, AnonymousClass1Cd r8, C34591kk r9, AnonymousClass1WM r10, C18030ve r11, C26431Sc r12, C34631ko r13, AnonymousClass10I r14, AnonymousClass00H r15) {
        Boolean bool = C17960vV.A01;
        this.A04 = r5;
        this.A0A = r11;
        this.A01 = r2;
        this.A0C = r14;
        this.A02 = r3;
        this.A0E = r12;
        this.A06 = r7;
        this.A0D = r15;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A07 = r8;
        this.A03 = r4;
        this.A0B = r13;
    }

    public static void A00(C34641kp r3, AnonymousClass206 r4, Runnable runnable) {
        boolean A0w = r4.A0w();
        AnonymousClass00H r0 = r3.A0D;
        if (A0w) {
            ((C203911y) r0.get()).A02(r4);
            return;
        }
        C203911y r32 = (C203911y) r0.get();
        C130816k3 r2 = new C130816k3(r32.A08, r4);
        r2.A07 = true;
        r2.A06 = true;
        C203911y.A00(r32, new C136506tv(r2), (C26981Ug) null, runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A0A, 10433) != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("app/unsent/autoretry ");
        r1.append(r8.A01);
        r1.append(" ");
        r1.append(r5);
        r1.append(" media uploaded already");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A0A, 11298) != false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass206 r13) {
        /*
            r12 = this;
            int r3 = r13.A0D()
            r11 = 0
            r1 = 20
            if (r3 == r1) goto L_0x0016
            r0 = 7
            if (r3 != r0) goto L_0x0017
            X.205 r0 = r13.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            return r11
        L_0x0017:
            int r5 = r13.A0u
            java.lang.String r7 = "app/unsent/skip "
            java.lang.String r9 = "app/unsent/autoretry "
            r2 = 2
            java.lang.String r4 = " "
            r6 = 1
            if (r5 == r6) goto L_0x00f1
            if (r5 == r2) goto L_0x00f1
            r0 = 3
            if (r5 == r0) goto L_0x00f1
            r0 = 5
            if (r5 == r0) goto L_0x00c9
            r0 = 13
            if (r5 == r0) goto L_0x00f1
            r0 = 16
            if (r5 == r0) goto L_0x00c9
            if (r5 == r1) goto L_0x00f1
            r0 = 82
            if (r5 == r0) goto L_0x00f1
            r0 = 90
            if (r5 == r0) goto L_0x00e2
            r0 = 99
            if (r5 == r0) goto L_0x00a6
            r0 = 105(0x69, float:1.47E-43)
            if (r5 == r0) goto L_0x00f1
            r0 = 42
            if (r5 == r0) goto L_0x00f1
            r0 = 43
            if (r5 == r0) goto L_0x00f1
            switch(r5) {
                case 7: goto L_0x009e;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00f1;
                case 10: goto L_0x00e2;
                default: goto L_0x0050;
            }
        L_0x0050:
            boolean r0 = r13 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0164
            X.1Sc r8 = r12.A0E
            r1 = r13
            X.21V r1 = (X.AnonymousClass21V) r1
            boolean r0 = r8.A0H(r1)
            if (r0 != 0) goto L_0x007c
            X.1So r0 = X.C63972u0.A02(r1)
            boolean r0 = X.C63972u0.A09(r0)
            if (r0 == 0) goto L_0x0164
            long r2 = r1.A01
            int r0 = r1.A0D
            long r0 = (long) r0
            android.util.Pair r0 = r8.A0A(r2, r0)
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0164
        L_0x007c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.205 r0 = r13.A0v
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " need transcode"
        L_0x0093:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r11
        L_0x009e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/system "
            goto L_0x00e9
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r3 != r2) goto L_0x00c3
            r1.<init>()
            r1.append(r9)
            X.205 r0 = r13.A0v
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " one media item already uploaded"
            r1.append(r0)
            goto L_0x0130
        L_0x00c3:
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/album "
            goto L_0x00e9
        L_0x00c9:
            r3 = r13
            X.218 r3 = (X.AnonymousClass218) r3
            double r0 = r3.A01
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            double r0 = r3.A00
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/location "
            goto L_0x00e9
        L_0x00e2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/call "
        L_0x00e9:
            r1.append(r0)
            X.205 r0 = r13.A0v
            java.lang.String r0 = r0.A01
            goto L_0x0093
        L_0x00f1:
            r0 = r13
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x0050
            boolean r0 = r1.A0Q
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0102
            if (r3 != r2) goto L_0x014b
        L_0x0102:
            X.205 r8 = r13.A0v
            X.1BI r10 = r8.A00
            boolean r0 = X.C22971Dz.A0a(r10)
            java.lang.String r3 = " media uploaded already"
            if (r0 == 0) goto L_0x0138
            X.0ve r2 = r12.A0A
            r1 = 10433(0x28c1, float:1.462E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0138
        L_0x011a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = r8.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            r1.append(r3)
        L_0x0130:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r6
        L_0x0138:
            boolean r0 = X.C22971Dz.A0a(r10)
            if (r0 != 0) goto L_0x014b
            X.0ve r2 = r12.A0A
            r1 = 11298(0x2c22, float:1.5832E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x014b
            goto L_0x011a
        L_0x014b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.205 r0 = r13.A0v
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " autoretry disabled"
            goto L_0x0093
        L_0x0164:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34641kp.A01(X.206):boolean");
    }
}
