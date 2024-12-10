package X;

import android.os.ConditionVariable;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Cr  reason: invalid class name and case insensitive filesystem */
public class C70833Cr implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C70833Cr(ConditionVariable conditionVariable, C28371a3 r3, AnonymousClass1DN r4, C18030ve r5) {
        this.A00 = 32;
        this.A01 = r5;
        this.A04 = r4;
        this.A02 = r3;
        this.A03 = conditionVariable;
    }

    public static List A00(C187679gC r1, Object obj, Object obj2, Map map) {
        r1.A00.unregisterObserver(obj);
        ((C39511tC) r1.A03.get()).unregisterObserver(obj);
        return (List) map.remove(obj2);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0ff6;
                case 1: goto L_0x0faf;
                case 2: goto L_0x0f63;
                case 3: goto L_0x0f44;
                case 4: goto L_0x0f1f;
                case 5: goto L_0x0f0b;
                case 6: goto L_0x0898;
                case 7: goto L_0x0eb6;
                case 8: goto L_0x0e82;
                case 9: goto L_0x082a;
                case 10: goto L_0x0810;
                case 11: goto L_0x06db;
                case 12: goto L_0x0e6e;
                case 13: goto L_0x0e3d;
                case 14: goto L_0x0e29;
                case 15: goto L_0x0de3;
                case 16: goto L_0x06a5;
                case 17: goto L_0x0dcb;
                case 18: goto L_0x0db7;
                case 19: goto L_0x046f;
                case 20: goto L_0x0d2c;
                case 21: goto L_0x0d05;
                case 22: goto L_0x0cd1;
                case 23: goto L_0x0c6f;
                case 24: goto L_0x0431;
                case 25: goto L_0x0c14;
                case 26: goto L_0x0c00;
                case 27: goto L_0x0b87;
                case 28: goto L_0x0b77;
                case 29: goto L_0x0b61;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x0406;
                case 33: goto L_0x0ae6;
                case 34: goto L_0x03b7;
                case 35: goto L_0x0ab5;
                case 36: goto L_0x0a74;
                case 37: goto L_0x0385;
                case 38: goto L_0x1017;
                case 39: goto L_0x0a5b;
                case 40: goto L_0x0281;
                case 41: goto L_0x0a3c;
                case 42: goto L_0x0a03;
                case 43: goto L_0x09d1;
                case 44: goto L_0x09b6;
                case 45: goto L_0x0935;
                case 46: goto L_0x011b;
                case 47: goto L_0x00d8;
                case 48: goto L_0x0081;
                case 49: goto L_0x0045;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A01
            X.1RK r6 = (X.AnonymousClass1RK) r6
            java.lang.Object r2 = r0.A02
            X.4Zh r2 = (X.C88344Zh) r2
            java.lang.Object r1 = r0.A03
            X.2m6 r1 = (X.C59312m6) r1
            java.lang.Object r5 = r0.A04
            X.2cS r5 = (X.C53392cS) r5
            com.whatsapp.jid.DeviceJid r0 = r2.A08
            X.2kO r4 = r1.A01
            X.2nE r3 = X.C63962tz.A02(r0)
            X.1P3 r2 = r6.A0F
            com.whatsapp.jid.DeviceJid r1 = X.C63962tz.A03(r3)
            X.11S r0 = r2.A03
            boolean r0 = r0.A0P(r1)
            X.C17960vV.A0C(r0)
            X.AnonymousClass1P3.A05(r4, r3, r2)
            r0 = 0
            r6.A03 = r0
            X.1RK r4 = r5.A01
            X.2m6 r3 = r5.A00
            X.10s r2 = r4.A0I
            r1 = 14
            X.3Ch r0 = new X.3Ch
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r5 = r0.A01
            X.2qF r5 = (X.C61782qF) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r0.A04
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1Cd r0 = r5.A06
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0044
            boolean r0 = X.C22971Dz.A0T(r4)
            if (r0 == 0) goto L_0x0072
            boolean r0 = X.C22971Dz.A0Y(r3)
            if (r0 == 0) goto L_0x0072
            X.1Ln r1 = r5.A07
            r0 = r4
            X.1E1 r0 = (X.AnonymousClass1E1) r0
            r1.A0P(r0, r3)
        L_0x0072:
            java.util.HashSet r1 = X.C61782qF.A00(r2, r5)
            X.1KB r6 = r5.A01
            r0 = 39
            X.7R0 r2 = new X.7R0
            r2.<init>(r5, r1, r4, r0)
            goto L_0x0894
        L_0x0081:
            java.lang.Object r2 = r0.A01
            X.6xb r2 = (X.C138736xb) r2
            java.lang.Object r5 = r0.A02
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r1 = r0.A03
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.Object r4 = r0.A04
            android.net.Uri r4 = (android.net.Uri) r4
            X.00H r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.1KB r0 = (X.AnonymousClass1KB) r0
            r0.A04()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            int r2 = r1.A0u
            r1 = 1
            if (r2 == r1) goto L_0x00d2
            r0 = 3
            if (r2 == r0) goto L_0x00ce
            r0 = 13
            if (r2 == r0) goto L_0x00ce
            r0 = 42
            if (r2 == r0) goto L_0x0044
            r0 = 43
            if (r2 == r0) goto L_0x0044
            r3.setData(r4)
        L_0x00ba:
            r3.setFlags(r1)
            android.content.Context r1 = r5.A14()
            X.8Aj r0 = r5.A0m
            if (r0 == 0) goto L_0x00c8
            r0.Byw()
        L_0x00c8:
            X.1L9 r0 = r5.A0D
            r0.A08(r1, r3)
            return
        L_0x00ce:
            java.lang.String r0 = "video/*"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r0 = "image/*"
        L_0x00d4:
            r3.setDataAndType(r4, r0)
            goto L_0x00ba
        L_0x00d8:
            java.lang.Object r5 = r0.A01
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A02
            X.6uk r4 = (X.C136996uk) r4
            java.lang.Object r2 = r0.A03
            X.36w r2 = (X.C693536w) r2
            java.lang.Object r3 = r0.A04
            X.1hY r3 = (X.C32661hY) r3
            r1 = 1
            byte[] r0 = r4.A0G()
            r5.A0p(r0)
            r2.A0A = r1
            boolean r0 = X.C20120A8f.A06(r5)
            if (r0 == 0) goto L_0x0119
            X.00H r0 = r3.A0B
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r1 = r5.A0v
            X.1W2 r0 = r0.A01
            X.206 r2 = r0.A05(r1)
            if (r2 == 0) goto L_0x0119
        L_0x0108:
            X.121 r1 = r3.A04
            r0 = -1
            r1.CQx(r2, r0)
            X.1KB r6 = r3.A02
            r0 = 38
            X.7Qr r2 = new X.7Qr
            r2.<init>(r3, r5, r0)
            goto L_0x0894
        L_0x0119:
            r2 = r5
            goto L_0x0108
        L_0x011b:
            java.lang.Object r1 = r0.A01
            X.1Cd r1 = (X.AnonymousClass1Cd) r1
            java.lang.Object r5 = r0.A02
            X.1DN r5 = (X.AnonymousClass1DN) r5
            java.lang.Object r6 = r0.A03
            X.0vd r6 = (X.C18020vd) r6
            java.lang.Object r7 = r0.A04
            X.2gy r7 = (X.C56142gy) r7
            r1.A06()
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0044
            r0 = 0
            X.1pX[] r0 = new X.C37431pX[r0]
            X.2i2 r9 = new X.2i2
            r9.<init>(r0)
            r3 = 1
            java.lang.String r0 = "DatabaseMigrationManager/processAllRollbacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r8 = X.C17880vN.A12()
            X.1DK r0 = r5.A06
            X.10w r0 = r0.A00()
            X.10e r0 = r0.values()
            X.1IZ r4 = r0.iterator()
        L_0x0152:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r2 = r4.next()
            X.1a4 r2 = (X.C28381a4) r2
            boolean r0 = X.AnonymousClass1DN.A02(r2)
            if (r0 == 0) goto L_0x0152
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DatabaseMigrationManager/add migration to pending rollbacks: "
            r1.append(r0)
            java.lang.String r0 = r2.A05
            X.C17890vO.A1A(r1, r0)
            r8.add(r0)
            goto L_0x0152
        L_0x0176:
            r5.A05(r9, r8, r3)
            r1 = 425(0x1a9, float:5.96E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x0186
            r5.A04()
        L_0x0186:
            X.1Cd r0 = r7.A04
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, message store is not ready, skip async migrations."
        L_0x0191:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AsyncMigrations/finalizeMigrationsAppAsyncInit, migrations shouldn't be run on async init."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x019a:
            X.1NP r10 = r7.A01
            int r1 = r10.A01()
            r0 = 512(0x200, float:7.175E-43)
            if (r1 == r0) goto L_0x01e3
            long r1 = java.lang.System.currentTimeMillis()
            X.1La r11 = r7.A05
            r4 = 0
            java.lang.String r6 = "async_init_migration_start_time"
            long r8 = r11.A01(r6, r4)
            long r4 = r1 - r8
            long r8 = java.lang.Math.abs(r4)
            r4 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, skip because of time from last run is equal to "
            r2.append(r0)
            long r0 = X.C17880vN.A04(r8)
            r2.append(r0)
            java.lang.String r0 = " seconds, should be more then "
            r2.append(r0)
            r0 = 7200(0x1c20, double:3.5573E-320)
            r2.append(r0)
            java.lang.String r0 = " seconds."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            goto L_0x0191
        L_0x01e0:
            r11.A05(r6, r1)
        L_0x01e3:
            X.2Ds r1 = r7.A07
            r0 = 0
            r1.A02(r0)
            X.18O r1 = r7.A00
            X.18R r0 = X.AnonymousClass18O.A0T
            boolean r2 = r1.A09(r0)
            int r1 = r10.A01()
            r0 = 512(0x200, float:7.175E-43)
            r9 = 0
            boolean r5 = X.AnonymousClass000.A1T(r1, r0)
            if (r2 != 0) goto L_0x0201
            if (r5 != 0) goto L_0x0201
            return
        L_0x0201:
            X.2F3 r6 = new X.2F3
            r6.<init>()
            java.lang.String r0 = "OnAsyncInitMigrationRunner/ftsMigration"
            X.1Ez r8 = new X.1Ez
            r8.<init>((java.lang.String) r0)
            X.1DK r0 = r7.A08
            java.lang.String r1 = "message_fts"
            X.1a4 r11 = r0.A01(r1)
            if (r11 == 0) goto L_0x0243
            boolean r0 = r11.A0D()
            if (r0 != 0) goto L_0x0243
            java.util.HashSet r4 = X.C17880vN.A12()
            r4.add(r1)
            X.1pX[] r3 = new X.C37431pX[r3]
            X.1Vz r2 = r7.A02
            X.11P r1 = r7.A03
            X.2yc r0 = new X.2yc
            r0.<init>(r2, r1)
            r3[r9] = r0
            X.2i2 r2 = new X.2i2
            r2.<init>(r3)
            X.1DN r1 = r7.A06
            r0 = 7
            boolean r0 = r1.A05(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
        L_0x0243:
            if (r5 == 0) goto L_0x0044
            if (r11 == 0) goto L_0x0044
            X.1Rp r5 = r7.A0A
            java.lang.String r4 = "fts_migration_elapsed_time_in_ms"
            r1 = 0
            java.lang.String r0 = r5.A0K(r4)
            long r2 = X.C20099A7c.A04(r0, r1)
            boolean r0 = r11.A0D()
            if (r0 == 0) goto L_0x0277
            r10.A0B(r9)
            long r0 = r8.A02()
            long r0 = r0 + r2
            long r0 = X.C17880vN.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            X.18K r0 = r7.A09
            r0.CC7(r6)
            r0 = 0
        L_0x0273:
            X.C26301Rp.A04(r5, r4, r0)
            return
        L_0x0277:
            long r0 = r8.A02()
            long r2 = r2 + r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L_0x0273
        L_0x0281:
            java.lang.Object r3 = r0.A01
            X.DOr r3 = (X.C26995DOr) r3
            java.lang.Object r2 = r0.A02
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            java.lang.Object r1 = r0.A03
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r0.A04
            java.util.Map r5 = (java.util.Map) r5
            X.C18070vi.A0k(r1, r5)
            r0 = 2131627150(0x7f0e0c8e, float:1.8881556E38)
            r2.setLayoutResource(r0)
            android.view.View r6 = r2.inflate()     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.glasses.layouts.SupToggle"
            X.C18070vi.A0z(r6, r0)     // Catch:{ IllegalStateException -> 0x1043 }
            com.whatsapp.glasses.layouts.SupToggle r6 = (com.whatsapp.glasses.layouts.SupToggle) r6     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.Iterator r4 = X.AnonymousClass000.A15(r1)     // Catch:{ IllegalStateException -> 0x1043 }
        L_0x02a9:
            boolean r0 = r4.hasNext()     // Catch:{ IllegalStateException -> 0x1043 }
            if (r0 == 0) goto L_0x02d7
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IllegalStateException -> 0x1043 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ IllegalStateException -> 0x1043 }
            if (r1 == 0) goto L_0x02a9
            java.util.Map r0 = X.C26995DOr.A0V     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalStateException -> 0x1043 }
            if (r0 == 0) goto L_0x02a9
            int r0 = r0.intValue()     // Catch:{ IllegalStateException -> 0x1043 }
            android.view.View r0 = X.C18070vi.A05(r6, r0)     // Catch:{ IllegalStateException -> 0x1043 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ IllegalStateException -> 0x1043 }
            r0.setImageBitmap(r1)     // Catch:{ IllegalStateException -> 0x1043 }
            goto L_0x02a9
        L_0x02d7:
            r6.setImageBitmaps(r5)     // Catch:{ IllegalStateException -> 0x1043 }
            X.118 r4 = r3.A0I     // Catch:{ IllegalStateException -> 0x1043 }
            android.content.Context r5 = r4.A00     // Catch:{ IllegalStateException -> 0x1043 }
            X.C18070vi.A0X(r5)     // Catch:{ IllegalStateException -> 0x1043 }
            X.0vb r1 = r3.A0K     // Catch:{ IllegalStateException -> 0x1043 }
            X.CpK r0 = new X.CpK     // Catch:{ IllegalStateException -> 0x1043 }
            r0.<init>(r5, r1)     // Catch:{ IllegalStateException -> 0x1043 }
            r3.A04 = r0     // Catch:{ IllegalStateException -> 0x1043 }
            r3.A05 = r6     // Catch:{ IllegalStateException -> 0x1043 }
            X.0vp r0 = r3.A08     // Catch:{ IllegalStateException -> 0x1043 }
            if (r0 == 0) goto L_0x103c
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x1043 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            if (r0 == 0) goto L_0x030e
            com.whatsapp.glasses.layouts.SupToggle r2 = r3.A05     // Catch:{ IllegalStateException -> 0x1043 }
            if (r2 == 0) goto L_0x030e
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ IllegalStateException -> 0x1043 }
            r0 = 2131168985(0x7f070ed9, float:1.7952287E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x1043 }
            float r0 = -r0
            r2.setTranslationY(r0)     // Catch:{ IllegalStateException -> 0x1043 }
        L_0x030e:
            X.E9o r2 = r3.A02     // Catch:{ IllegalStateException -> 0x1043 }
            if (r2 == 0) goto L_0x031d
            r1 = 17
            X.7SB r0 = new X.7SB     // Catch:{ IllegalStateException -> 0x1043 }
            r0.<init>((java.lang.Object) r3, (int) r1)     // Catch:{ IllegalStateException -> 0x1043 }
            X.DOs r2 = (X.C26996DOs) r2     // Catch:{ IllegalStateException -> 0x1043 }
            r2.A04 = r0     // Catch:{ IllegalStateException -> 0x1043 }
        L_0x031d:
            r2 = 0
            X.C26995DOr.A04(r3, r2)     // Catch:{ IllegalStateException -> 0x1043 }
            com.whatsapp.glasses.layouts.SupToggle r5 = r3.A05     // Catch:{ IllegalStateException -> 0x1043 }
            if (r5 == 0) goto L_0x0044
            X.1VE r0 = r3.A0H     // Catch:{ IllegalStateException -> 0x1043 }
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.String r0 = "smart_glasses_user_initiated"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ IllegalStateException -> 0x1043 }
            if (r0 != 0) goto L_0x036b
            X.00H r8 = r3.A0Q     // Catch:{ IllegalStateException -> 0x1043 }
            java.lang.Object r0 = X.C18070vi.A0E(r8)     // Catch:{ IllegalStateException -> 0x1043 }
            X.A1I r0 = (X.A1I) r0     // Catch:{ IllegalStateException -> 0x1043 }
            com.whatsapp.glasses.SUPBottomSheetView r7 = new com.whatsapp.glasses.SUPBottomSheetView     // Catch:{ IllegalStateException -> 0x1043 }
            r7.<init>(r4, r0)     // Catch:{ IllegalStateException -> 0x1043 }
            r3.A03 = r7     // Catch:{ IllegalStateException -> 0x1043 }
            X.1Oh r6 = r3.A0N     // Catch:{ IllegalStateException -> 0x1043 }
            r4 = 1
            java.util.Map r0 = r7.A03     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.Set r1 = r0.keySet()     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.Set r0 = r7.A04     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.LinkedHashSet r1 = X.C41841x9.A04(r0, r1)     // Catch:{ IllegalStateException -> 0x1043 }
            X.C0L r0 = r7.A02     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.Set r0 = X.C18070vi.A0P(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.LinkedHashSet r2 = X.C41841x9.A04(r0, r1)     // Catch:{ IllegalStateException -> 0x1043 }
            r1 = 30
            X.7S3 r0 = new X.7S3     // Catch:{ IllegalStateException -> 0x1043 }
            r0.<init>((java.lang.Object) r7, (int) r1)     // Catch:{ IllegalStateException -> 0x1043 }
            X.C197219wL.A01(r6, r7, r8, r2, r0)     // Catch:{ IllegalStateException -> 0x1043 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05     // Catch:{ IllegalStateException -> 0x1043 }
            r0.set(r4)     // Catch:{ IllegalStateException -> 0x1043 }
        L_0x036b:
            android.widget.ImageView r2 = r5.A04     // Catch:{ IllegalStateException -> 0x1043 }
            r1 = 38
            X.4dH r0 = new X.4dH     // Catch:{ IllegalStateException -> 0x1043 }
            r0.<init>(r3, r1)     // Catch:{ IllegalStateException -> 0x1043 }
            r2.setOnClickListener(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            android.widget.ImageView r2 = r5.A03     // Catch:{ IllegalStateException -> 0x1043 }
            r1 = 39
            X.4dH r0 = new X.4dH     // Catch:{ IllegalStateException -> 0x1043 }
            r0.<init>(r3, r1)     // Catch:{ IllegalStateException -> 0x1043 }
            r2.setOnClickListener(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            goto L_0x103b
        L_0x0385:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r3 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r3
            java.lang.Object r2 = r0.A03
            X.5zZ r2 = (X.C117315zZ) r2
            java.lang.Object r1 = r0.A04
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            X.5kV r0 = r3.A0C
            if (r0 == 0) goto L_0x03b5
            X.1uh r0 = r0.A00
            java.util.List r0 = r0.A02
        L_0x039b:
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x0044
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            if (r0 == 0) goto L_0x0044
            X.1qy r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x0044
            r0.A19(r1)
            return
        L_0x03b5:
            r0 = 0
            goto L_0x039b
        L_0x03b7:
            java.lang.Object r6 = r0.A01
            java.lang.ref.Reference r6 = (java.lang.ref.Reference) r6
            java.lang.Object r5 = r0.A02
            X.AEW r5 = (X.AEW) r5
            java.lang.Object r4 = r0.A03
            X.2gK r4 = (X.C55762gK) r4
            java.lang.Object r3 = r0.A04
            X.1BI r3 = (X.AnonymousClass1BI) r3
            r2 = 0
            java.lang.Object r1 = r6.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x0404
            X.1LU r0 = r4.A05
            android.content.Intent r3 = r0.A1x(r1, r3, r2)
        L_0x03d6:
            if (r5 == 0) goto L_0x03e5
            boolean r0 = r5.A0W
            java.lang.String r1 = "ctc_deeplink_option"
            if (r0 == 0) goto L_0x03ff
            if (r3 == 0) goto L_0x03e5
            java.lang.String r0 = "CALL"
        L_0x03e2:
            r3.putExtra(r1, r0)
        L_0x03e5:
            java.lang.Object r2 = r6.get()
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            if (r2 == 0) goto L_0x0044
            r2.CEx()
            android.os.Handler r1 = r2.A00
            r0 = 1
            r1.removeMessages(r0)
            if (r3 == 0) goto L_0x03fb
            r2.startActivity(r3)
        L_0x03fb:
            r2.finish()
            return
        L_0x03ff:
            if (r3 == 0) goto L_0x03e5
            java.lang.String r0 = "CHAT"
            goto L_0x03e2
        L_0x0404:
            r3 = 0
            goto L_0x03d6
        L_0x0406:
            java.lang.Object r9 = r0.A02
            X.1a3 r9 = (X.C28371a3) r9
            X.1La r11 = r9.A05
            X.11P r8 = r9.A02
            long r6 = X.AnonymousClass11P.A01(r8)
            r1 = 0
            java.lang.String r10 = "db_migration_attempt_timestamp"
            long r3 = r11.A01(r10, r1)
            long r1 = r6 - r3
            long r4 = java.lang.Math.abs(r1)
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0044
            r11.A05(r10, r6)
            java.lang.String r1 = "DatabaseMigrationAsyncTask/run/execute async task"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1057
        L_0x0431:
            java.lang.Object r3 = r0.A01
            X.1hb r3 = (X.C32691hb) r3
            java.lang.Object r2 = r0.A02
            X.23z r2 = (X.C445823z) r2
            java.lang.Object r1 = r0.A03
            X.212 r1 = (X.AnonymousClass212) r1
            java.lang.Object r5 = r0.A04
            X.1BI r5 = (X.AnonymousClass1BI) r5
            X.1W8 r0 = r3.A0O
            long r8 = r0.A00(r2)
            X.1WM r4 = r3.A0P
            r6 = 74
            r7 = 0
            r4.A0G(r5, r6, r7, r8)
            X.2d8 r0 = new X.2d8
            r0.<init>(r2, r1)
            r4.A0H(r5, r0)
            com.whatsapp.jid.UserJid r1 = r1.A0I()
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            X.00H r0 = r3.A0a
            java.lang.Object r0 = r0.get()
            X.2qs r0 = (X.C62152qs) r0
            r0.A01(r2)
            return
        L_0x046f:
            java.lang.Object r6 = r0.A01
            X.4aY r6 = (X.AnonymousClass4aY) r6
            java.lang.Object r1 = r0.A02
            X.4VG r1 = (X.AnonymousClass4VG) r1
            java.lang.Object r5 = r0.A03
            X.Abv r5 = (X.C20941Abv) r5
            java.lang.Object r9 = r0.A04
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            X.1BI r7 = r6.A3R
            if (r7 == 0) goto L_0x0044
            X.4TY r0 = r1.A02
            if (r0 == 0) goto L_0x06a2
            byte[] r11 = r0.A01
        L_0x0489:
            X.1iW r4 = r6.A1V
            X.00H r0 = r6.A5I
            java.lang.Object r0 = r0.get()
            X.4Zs r0 = (X.C88444Zs) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.4O3 r0 = (X.AnonymousClass4O3) r0
            X.00H r0 = r0.A02
            java.lang.Object r3 = r0.get()
            X.4aI r3 = (X.C88654aI) r3
            r12 = 0
            if (r5 == 0) goto L_0x04e4
            java.lang.String r2 = r5.A03
            java.lang.String r10 = r5.A05
            if (r10 != 0) goto L_0x04ad
            r10 = r12
        L_0x04ad:
            X.118 r13 = r4.A0L
            java.lang.String r8 = X.C60342nr.A00(r13, r2, r10)
            X.1R3 r0 = r4.A0W
            r1 = 50
            java.util.ArrayList r0 = r0.A09(r7, r1)
            java.util.Iterator r15 = r0.iterator()
        L_0x04bf:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04e7
            X.206 r14 = X.C17880vN.A0Y(r15)
            X.Abv r0 = X.C60532oB.A00(r14)
            if (r0 == 0) goto L_0x04bf
            X.Abv r0 = X.C60532oB.A00(r14)
            java.lang.String r14 = r0.A0C
            java.lang.String r0 = r5.A0C
            boolean r0 = X.AnonymousClass026.A00(r14, r0)
            if (r0 == 0) goto L_0x04bf
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r7)
            X.C88654aI.A02(r3, r0, r2, r1)
        L_0x04e4:
            r6.A40 = r12
            return
        L_0x04e7:
            r1 = 0
            if (r10 == 0) goto L_0x05c1
            java.lang.String r14 = r7.user
            r0 = 3
            X.C18070vi.A0d(r14, r0)
            r15 = 0
            int r0 = r10.length()     // Catch:{ JSONException -> 0x05a8 }
            if (r0 <= 0) goto L_0x0501
            org.json.JSONObject r10 = X.C17880vN.A16(r10)     // Catch:{ JSONException -> 0x05a8 }
            java.lang.String r0 = "cta_payload"
            java.lang.String r12 = r10.optString(r0)     // Catch:{ JSONException -> 0x05a8 }
        L_0x0501:
            if (r2 == 0) goto L_0x05ae
            boolean r0 = X.C60342nr.A01(r2, r12)     // Catch:{ JSONException -> 0x05a8 }
            if (r0 == 0) goto L_0x05ae
            int r0 = r2.hashCode()     // Catch:{ JSONException -> 0x05a8 }
            switch(r0) {
                case 116079: goto L_0x0517;
                case 3045982: goto L_0x0521;
                case 3146030: goto L_0x053a;
                case 555704345: goto L_0x054f;
                default: goto L_0x0510;
            }     // Catch:{ JSONException -> 0x05a8 }
        L_0x0510:
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/nativeFlowButtonFromCTAType: Invalid JSON"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x05a8 }
            goto L_0x05ae
        L_0x0517:
            java.lang.String r10 = "url"
            boolean r0 = r2.equals(r10)     // Catch:{ JSONException -> 0x05a8 }
            if (r0 == 0) goto L_0x0510
            goto L_0x0558
        L_0x0521:
            java.lang.String r0 = "call"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x05a8 }
            if (r0 == 0) goto L_0x0510
            java.lang.String r12 = "voice_call"
            java.lang.String r10 = "{}"
            X.AEe r0 = new X.AEe     // Catch:{ JSONException -> 0x05a8 }
            r0.<init>(r12, r10)     // Catch:{ JSONException -> 0x05a8 }
            X.ADl r10 = new X.ADl     // Catch:{ JSONException -> 0x05a8 }
            r10.<init>(r0, r1)     // Catch:{ JSONException -> 0x05a8 }
            goto L_0x05a0
        L_0x053a:
            java.lang.String r0 = "flow"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x05a8 }
            if (r0 == 0) goto L_0x0510
            java.lang.String r10 = "galaxy_message"
            X.AEe r0 = new X.AEe     // Catch:{ JSONException -> 0x05a8 }
            r0.<init>(r10, r12)     // Catch:{ JSONException -> 0x05a8 }
            X.ADl r10 = new X.ADl     // Catch:{ JSONException -> 0x05a8 }
            r10.<init>(r0, r1)     // Catch:{ JSONException -> 0x05a8 }
            goto L_0x05a0
        L_0x054f:
            java.lang.String r0 = "catalog"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x05a8 }
            if (r0 == 0) goto L_0x0510
            goto L_0x0587
        L_0x0558:
            if (r8 == 0) goto L_0x05ae
            if (r12 == 0) goto L_0x05ae
            org.json.JSONObject r14 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0581 }
            java.lang.String r0 = "display_text"
            r14.put(r0, r8)     // Catch:{ JSONException -> 0x0581 }
            r14.put(r10, r12)     // Catch:{ JSONException -> 0x0581 }
            java.lang.String r10 = "webview_presentation"
            java.lang.String r0 = "full"
            r14.put(r10, r0)     // Catch:{ JSONException -> 0x0581 }
            java.lang.String r12 = "cta_url"
            java.lang.String r10 = r14.toString()     // Catch:{ JSONException -> 0x0581 }
            X.AEe r0 = new X.AEe     // Catch:{ JSONException -> 0x0581 }
            r0.<init>(r12, r10)     // Catch:{ JSONException -> 0x0581 }
            X.ADl r10 = new X.ADl     // Catch:{ JSONException -> 0x0581 }
            r10.<init>(r0, r1)     // Catch:{ JSONException -> 0x0581 }
            goto L_0x05a0
        L_0x0581:
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/createVisitWebsiteButton: Invalid JSON"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x05a8 }
            goto L_0x05ae
        L_0x0587:
            org.json.JSONObject r10 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x05a2 }
            java.lang.String r0 = "business_phone_number"
            r10.put(r0, r14)     // Catch:{ JSONException -> 0x05a2 }
            java.lang.String r12 = "automated_greeting_message_view_catalog"
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x05a2 }
            X.AEe r0 = new X.AEe     // Catch:{ JSONException -> 0x05a2 }
            r0.<init>(r12, r10)     // Catch:{ JSONException -> 0x05a2 }
            X.ADl r10 = new X.ADl     // Catch:{ JSONException -> 0x05a2 }
            r10.<init>(r0, r1)     // Catch:{ JSONException -> 0x05a2 }
        L_0x05a0:
            r15 = r10
            goto L_0x05ae
        L_0x05a2:
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/createViewCatalogButton: Invalid JSON"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x05a8 }
            goto L_0x05ae
        L_0x05a8:
            r10 = move-exception
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/nativeFlowButtonFromCTAType: Invalid cta payload json"
            com.whatsapp.util.Log.e(r0, r10)
        L_0x05ae:
            r12 = r15
            if (r2 == 0) goto L_0x05c1
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x05c1
            if (r15 == 0) goto L_0x05c1
            boolean r0 = X.C60342nr.A01(r2, r8)
            r16 = 1
            if (r0 != 0) goto L_0x05c5
        L_0x05c1:
            r16 = 0
            if (r2 == 0) goto L_0x05de
        L_0x05c5:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x05de
            if (r12 != 0) goto L_0x05de
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A00(r7)
            boolean r0 = X.C18020vd.A04(r3)
            if (r0 == 0) goto L_0x05de
            r0 = 53
            X.C88654aI.A02(r3, r10, r2, r0)
        L_0x05de:
            java.lang.String r10 = r5.A0B
            java.lang.String r0 = "facebook"
            boolean r15 = r10.equals(r0)
            if (r15 != 0) goto L_0x05ff
            java.lang.String r0 = "instagram"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x05ff
            com.whatsapp.jid.UserJid r14 = X.C22941Dw.A00(r7)
            boolean r0 = X.C18020vd.A04(r3)
            if (r0 == 0) goto L_0x05ff
            r0 = 54
            X.C88654aI.A02(r3, r14, r2, r0)
        L_0x05ff:
            X.C18070vi.A0d(r13, r1)
            if (r15 == 0) goto L_0x068b
            r0 = 2131886588(0x7f1201fc, float:1.940776E38)
        L_0x0607:
            java.lang.String r14 = r13.A01(r0)
            r0 = 2131886587(0x7f1201fb, float:1.9407757E38)
            java.lang.String r13 = r13.A01(r0)
            r10 = 0
            X.AEE r0 = new X.AEE
            r0.<init>(r10, r14, r13, r11)
            if (r16 == 0) goto L_0x0686
            java.util.List r12 = java.util.Collections.singletonList(r12)
        L_0x061e:
            r18 = 3
            r11 = 2
            X.C18070vi.A0d(r12, r11)
            java.lang.String r15 = "{}"
            r17 = r10
            X.AEk r19 = new X.AEk
            r13 = r19
            r14 = r10
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r11 = r5.A07
            r12 = 4
            X.C18070vi.A0d(r8, r12)
            r29 = 5
            X.0wS r28 = X.C18460wS.A00
            r16 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r24 = r10
            r26 = r10
            r27 = r10
            X.AEt r13 = new X.AEt
            r15 = r10
            r18 = r0
            r23 = r11
            r25 = r8
            r14 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1PP r0 = r4.A0x
            X.205 r8 = r0.A01(r7, r1)
            X.11P r0 = r4.A0K
            long r0 = X.AnonymousClass11P.A01(r0)
            X.21L r12 = new X.21L
            r12.<init>(r8, r0)
            X.C60532oB.A01(r5, r12)
            r0 = 6
            r12.A0a(r0)
            r12.CIS(r13)
            r4.A0b(r12)
            X.122 r0 = r4.A0U
            r0.BBM(r12)
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r7)
            r0 = 44
            X.C88654aI.A02(r3, r1, r2, r0)
            goto L_0x04e4
        L_0x0686:
            java.util.List r12 = java.util.Collections.emptyList()
            goto L_0x061e
        L_0x068b:
            java.lang.String r0 = "instagram"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0698
            r0 = 2131886590(0x7f1201fe, float:1.9407763E38)
            goto L_0x0607
        L_0x0698:
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/headerStringFromSourceApp: Invalid source app"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131886589(0x7f1201fd, float:1.9407761E38)
            goto L_0x0607
        L_0x06a2:
            r11 = 0
            goto L_0x0489
        L_0x06a5:
            java.lang.Object r1 = r0.A01
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r5 = r0.A02
            X.1FU r5 = (X.AnonymousClass1FU) r5
            java.lang.Object r7 = r0.A03
            X.3wA r7 = (X.C79873wA) r7
            java.lang.Object r6 = r0.A04
            X.206 r6 = (X.AnonymousClass206) r6
            r3 = 1
            r2 = 3
            r0 = 2
            int r1 = r1.intValue()
            r4 = 0
            if (r1 == r3) goto L_0x10f5
            if (r1 == r2) goto L_0x10e8
            if (r1 == r0) goto L_0x10b2
            r0 = 0
            if (r1 != r0) goto L_0x0044
            X.10I r2 = r7.A03
            r1 = 11
            X.4ra r0 = new X.4ra
            r0.<init>(r7, r6, r1)
            r2.CGF(r0)
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin directly."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.C79873wA.A00(r5, r7, r6)
            return
        L_0x06db:
            java.lang.Object r1 = r0.A01
            X.48k r1 = (X.AnonymousClass48k) r1
            java.lang.Object r8 = r0.A02
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r3 = r0.A03
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r2 = r0.A04
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r7 = r1.A01
            X.3uP r7 = (X.AnonymousClass3uP) r7
            boolean r0 = r2 instanceof X.AnonymousClass23W
            if (r0 == 0) goto L_0x072e
            X.205 r0 = r2.A0v
            X.1BI r3 = r0.A00
            if (r3 == 0) goto L_0x0714
            X.23W r2 = (X.AnonymousClass23W) r2
            java.lang.String r2 = r2.A01
            java.lang.String r1 = r3.getRawString()
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r1 = r0.A02(r1)
            if (r2 == 0) goto L_0x0714
            if (r1 == 0) goto L_0x0714
            X.1MZ r0 = r7.A0z
            boolean r0 = r0.A0J(r1)
            if (r0 != 0) goto L_0x0714
            return
        L_0x0714:
            X.1M9 r0 = r7.A0j
            X.1E7 r0 = r0.A0G(r3)
            if (r0 == 0) goto L_0x0044
            X.1L9 r2 = r7.A0Q
            X.1LU r1 = new X.1LU
            r1.<init>()
            r0 = 0
            android.content.Intent r1 = r1.A1w(r8, r3, r0)
            java.lang.String r0 = "ConversationRow"
            r2.A0B(r8, r1, r0)
            return
        L_0x072e:
            X.00H r0 = r7.A1x
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r4 = r2.A0v
            X.1W2 r0 = r0.A01
            X.206 r9 = r0.A05(r4)
            r5 = 1
            if (r9 != 0) goto L_0x0765
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0759
            X.00H r0 = r7.A1x
            X.1W6 r6 = X.C17880vN.A0c(r0)
            X.1cg r1 = X.C29671cg.A00
            java.lang.String r0 = r4.A01
            X.205 r1 = X.AnonymousClass205.A01(r1, r0, r5)
            X.1W2 r0 = r6.A01
            X.206 r9 = r0.A05(r1)
            if (r9 != 0) goto L_0x0765
        L_0x0759:
            X.00H r0 = r7.A2N
            java.lang.Object r0 = r0.get()
            X.2mE r0 = (X.C59392mE) r0
            X.206 r9 = r0.A00(r4)
        L_0x0765:
            X.00H r0 = r7.A27
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            X.206 r10 = r0.BWF(r9)
            boolean r0 = r2 instanceof X.AnonymousClass22Q
            if (r0 == 0) goto L_0x078c
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x078c
            X.1KB r4 = r7.A0S
            r0 = 47
            X.7Pi r1 = new X.7Pi
            r1.<init>(r7, r2, r0)
        L_0x0788:
            r4.A0J(r1)
            return
        L_0x078c:
            if (r9 == 0) goto L_0x0044
            X.205 r4 = r9.A0v
            X.1BI r2 = r4.A00
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x07c3
            X.1Le r0 = r7.A12
            boolean r0 = r0.A0J(r9)
            if (r0 != 0) goto L_0x0044
            com.whatsapp.jid.UserJid r1 = r9.A0I()
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A0j(r8, r1, r5, r0, r0)
            int r1 = r3.A0u
            r0 = 103(0x67, float:1.44E-43)
            if (r1 != r0) goto L_0x07b6
            java.lang.String r1 = "playback_entry_method"
            r0 = 9
            r2.putExtra(r1, r0)
        L_0x07b6:
            X.AnonymousClass4aU.A00(r2, r4)
            X.1KB r4 = r7.A0S
            r0 = 48
            X.7Pi r1 = new X.7Pi
            r1.<init>(r8, r2, r0)
            goto L_0x0788
        L_0x07c3:
            X.C17960vV.A07(r2)
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x1112
            X.1LU r1 = new X.1LU
            r1.<init>()
            r0 = 0
            android.content.Intent r3 = r1.A1w(r8, r2, r0)
            if (r10 == 0) goto L_0x07ea
            java.lang.String r2 = "parent_row_id"
            long r0 = r10.A0x
            r3.putExtra(r2, r0)
            java.lang.String r2 = "parent_sort_id"
            long r0 = r10.A0y
            r3.putExtra(r2, r0)
        L_0x07ea:
            java.lang.String r2 = "row_id"
            long r0 = r9.A0x
            r3.putExtra(r2, r0)
            java.lang.String r2 = "sort_id"
            long r0 = r9.A0y
            r3.putExtra(r2, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "start_t"
            r3.putExtra(r0, r1)
            X.AnonymousClass4aU.A00(r3, r4)
            X.1KB r4 = r7.A0S
            r0 = 3
            X.4rb r1 = new X.4rb
            r1.<init>(r7, r3, r8, r0)
            goto L_0x0788
        L_0x0810:
            java.lang.Object r4 = r0.A01
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A04
            X.206 r1 = (X.AnonymousClass206) r1
            X.5cS r0 = X.C88404Zo.A01(r3)
            if (r0 == 0) goto L_0x0044
            r0.CH4(r4, r2, r1)
            return
        L_0x082a:
            java.lang.Object r5 = r0.A01
            X.3uP r5 = (X.AnonymousClass3uP) r5
            java.lang.Object r1 = r0.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.Object r3 = r0.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r7 = r0.A04
            X.1MZ r2 = r5.A0z
            android.content.Context r6 = r5.getContext()
            X.205 r0 = r1.A0v
            X.1BI r1 = r0.A00
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1MW r0 = r2.A08
            X.2tp r0 = r0.A0B(r1)
            r4 = 1
            X.C18070vi.A0d(r3, r4)
            X.2ho r0 = r0.A05
            X.C18070vi.A0X(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0044
            int r3 = r0.intValue()
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2130970023(0x7f0405a7, float:1.7548744E38)
            r1.resolveAttribute(r0, r2, r4)
            android.content.res.Resources r1 = r6.getResources()
            int r0 = r2.resourceId
            int[] r1 = r1.getIntArray(r0)
            X.C18070vi.A0X(r1)
            int r0 = r1.length
            int r3 = r3 % r0
            r0 = r1[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0044
            X.1KB r6 = r5.A0S
            X.4rb r2 = new X.4rb
            r2.<init>(r5, r7, r0, r4)
        L_0x0894:
            r6.A0J(r2)
            return
        L_0x0898:
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getWidth()
            float r12 = (float) r1
            java.lang.Object r2 = r0.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextPaint r3 = r2.getPaint()
            java.lang.Object r5 = r0.A02
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r1 = r5.toString()
            float r4 = r3.measureText(r1)
            java.lang.Object r3 = r0.A04
            X.2ri r3 = (X.C62632ri) r3
            int r0 = r3.A00
            float r0 = (float) r0
            float r4 = r4 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            java.lang.String r7 = r5.toString()
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]
            r1 = 0
            java.lang.String r0 = " "
            r6[r1] = r0
            r9 = 0
            java.util.List r1 = X.AnonymousClass1YF.A0S(r7, r6, r1)
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x08e0
            java.lang.Object r6 = X.C29431cG.A0d(r1)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x08e4
        L_0x08e0:
            java.lang.String r6 = r5.toString()
        L_0x08e4:
            android.text.TextPaint r7 = r2.getPaint()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 32
            java.lang.String r0 = X.C17890vO.A0Z(r6, r1, r0)
            float r0 = r7.measureText(r0)
            float r1 = r4 - r0
            r3.A04 = r8
            r2.setText(r5)
            X.0vb r0 = r3.A0D
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x090a
            float r12 = -r1
        L_0x090a:
            r10 = 0
            r13 = r9
            r15 = r9
            r16 = r10
            android.view.animation.TranslateAnimation r8 = new android.view.animation.TranslateAnimation
            r11 = r9
            r14 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 2000(0x7d0, double:9.88E-321)
            r8.setDuration(r0)
            X.8d8 r0 = new X.8d8
            r0.<init>(r5, r2, r6, r9)
            r8.setAnimationListener(r0)
            r3.A02 = r8
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = (int) r4
            r1.width = r0
            r2.setLayoutParams(r1)
            android.view.animation.Animation r0 = r3.A02
            r2.startAnimation(r0)
            return
        L_0x0935:
            java.lang.Object r1 = r0.A01
            X.6yc r1 = (X.C139306yc) r1
            java.lang.Object r10 = r0.A02
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.Object r7 = r0.A03
            byte[][] r7 = (byte[][]) r7
            java.lang.Object r0 = r0.A04
            X.6eA r0 = (X.C127326eA) r0
            X.2aa r9 = r1.A02
            X.6mi r8 = new X.6mi
            r8.<init>(r0, r1, r7)
            int r6 = r10.length
            int r2 = r7.length
            if (r6 == r2) goto L_0x0971
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "keytransparencyprotocolhelper/sendmultiserializedlookupiq Labels and keys differ in length: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " vs. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " . Request is canceled. Failing verification"
            X.C17890vO.A19(r1, r0)
            java.lang.String r2 = "Missing identity keys or labels"
            r1 = -1
            r0 = 0
            r8.A00(r0, r2, r1)
            return
        L_0x0971:
            X.00H r5 = r9.A00
            java.lang.String r15 = X.C17890vO.A0T(r5)
            java.util.ArrayList r4 = X.C17880vN.A0z(r2)
            r3 = 0
        L_0x097c:
            if (r3 >= r6) goto L_0x0997
            r1 = r7[r3]
            r0 = 4
            X.9Ee r2 = new X.9Ee
            r2.<init>((byte[]) r1, (int) r0)
            r0 = r10[r3]
            byte[] r1 = r0.getBytes()
            X.9Ee r0 = new X.9Ee
            r0.<init>((X.C178719Ee) r2, (byte[]) r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x097c
        L_0x0997:
            java.lang.String r1 = "1"
            r0 = 6
            X.9F5 r7 = new X.9F5
            r7.<init>(r15, r1, r4, r0)
            X.1OZ r12 = X.C17880vN.A0U(r5)
            X.1ca r14 = r7.BVP()
            r11 = 0
            X.7LP r6 = new X.7LP
            r6.<init>(r7, r8, r9, r10, r11)
            r17 = 32000(0x7d00, double:1.581E-319)
            r16 = 342(0x156, float:4.79E-43)
            r13 = r6
            r12.A0I(r13, r14, r15, r16, r17)
            return
        L_0x09b6:
            java.lang.Object r3 = r0.A01
            X.2gw r3 = (X.C56122gw) r3
            java.lang.Object r4 = r0.A02
            java.lang.Object r2 = r0.A03
            java.lang.Object r5 = r0.A04
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.11A r0 = r3.A07
            r6 = 43
            X.3Cr r1 = new X.3Cr
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.A00(r1)
            return
        L_0x09d1:
            java.lang.Object r1 = r0.A01
            X.10I r1 = (X.AnonymousClass10I) r1
            java.lang.Object r2 = r0.A02
            X.2gw r2 = (X.C56122gw) r2
            java.lang.Object r4 = r0.A03
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r9 = r0.A04
            X.770 r9 = (X.AnonymousClass770) r9
            r14 = 0
            r15 = 1
            X.1LU r11 = r2.A05
            X.1FU r4 = (X.AnonymousClass1FU) r4
            X.6mP r5 = r2.A00
            X.11C r7 = r2.A02
            X.1MB r10 = r2.A04
            X.17x r8 = r2.A03
            X.A98 r12 = r2.A06
            X.11E r6 = r2.A01
            java.lang.String r13 = "bloks/support"
            r3 = 0
            X.9BP r2 = new X.9BP
            r16 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String[] r0 = new java.lang.String[r14]
            r1.CGD(r2, r0)
            return
        L_0x0a03:
            java.lang.Object r5 = r0.A01
            X.126 r5 = (X.AnonymousClass126) r5
            java.lang.Object r4 = r0.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r2 = r0.A03
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r0.A04
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            X.AnonymousClass126.A0A(r5, r4)
            X.1MZ r1 = r5.A0O
            java.util.ArrayList r0 = X.C17880vN.A10(r2)
            r1.A0D(r4, r0)
            X.1KB r2 = r5.A04
            r1 = 39
            X.7Qq r0 = new X.7Qq
            r0.<init>(r5, r4, r1)
            r2.A0J(r0)
            X.1Uv r1 = r5.A0d
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r0 = r3.A06(r0)
            X.C17960vV.A07(r0)
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r1.A0X(r0)
            return
        L_0x0a3c:
            java.lang.Object r1 = r0.A01
            X.1mk r1 = (X.C35751mk) r1
            java.lang.Object r4 = r0.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            r1.A00(r4)
            java.lang.Object r3 = r0.A04
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r0.A03
            X.C18070vi.A0h(r2, r4)
            r1 = 13
            X.35N r0 = new X.35N
            r0.<init>(r2, r4, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x0a5b:
            java.lang.Object r4 = r0.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r0.A02
            X.6x5 r3 = (X.C138446x5) r3
            java.lang.Object r2 = r0.A03
            X.1bI r2 = (X.C28931bI) r2
            java.lang.Object r1 = r0.A04
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 8
            r4.setVisibility(r0)
            X.C138446x5.A00(r1, r3, r2)
            return
        L_0x0a74:
            java.lang.Object r3 = r0.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r7 = r0.A02
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r6 = r0.A03
            X.1KB r6 = (X.AnonymousClass1KB) r6
            java.lang.Object r2 = r0.A04
            android.content.Context r2 = (android.content.Context) r2
            r5 = 0
            r1 = 1
            X.C18070vi.A0d(r7, r1)
            r3.A0o(r7, r5, r5)
            int r0 = r7.size()
            if (r0 != r1) goto L_0x0a99
            r0 = 2131892052(0x7f121754, float:1.9418841E38)
            r6.A09(r0, r5)
            return
        L_0x0a99:
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131755233(0x7f1000e1, float:1.914134E38)
            int r2 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r7.size()
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            r6.A0H(r0, r5)
            return
        L_0x0ab5:
            java.lang.Object r4 = r0.A01
            X.2gK r4 = (X.C55762gK) r4
            java.lang.Object r5 = r0.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r2 = r0.A03
            java.lang.Object r3 = r0.A04
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.1M9 r0 = r4.A02
            X.1E7 r1 = r0.A0H(r5)
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0ae0
            boolean r0 = r1.A0z
            if (r0 != 0) goto L_0x0ae0
            boolean r0 = r1.A0u
            if (r0 != 0) goto L_0x0ae0
            X.31f r1 = r4.A03
            X.2R1 r0 = X.AnonymousClass2R1.A0F
            r1.A06(r0, r5)
        L_0x0ae0:
            X.1KB r0 = r4.A00
            r6 = 34
            goto L_0x0f3d
        L_0x0ae6:
            java.lang.Object r3 = r0.A01
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            java.lang.Object r6 = r0.A02
            X.9gC r6 = (X.C187679gC) r6
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A04
            X.C18070vi.A0i(r3, r5)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0b19 }
            r0 = 30
            r3.get(r0, r2)     // Catch:{ Exception -> 0x0b19 }
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            java.util.List r0 = A00(r6, r5, r4, r3)     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b3c
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b5e }
        L_0x0b09:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b3c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b5e }
            X.B81 r0 = (X.B81) r0     // Catch:{ all -> 0x0b5e }
            r0.BuT()     // Catch:{ all -> 0x0b5e }
            goto L_0x0b09
        L_0x0b19:
            r1 = move-exception
            java.lang.String r0 = "Cannot fetch the identity for business!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b3e }
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            java.util.List r0 = A00(r6, r5, r4, r3)     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b3c
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b5e }
        L_0x0b2c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b3c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b5e }
            X.B81 r0 = (X.B81) r0     // Catch:{ all -> 0x0b5e }
            r0.BuT()     // Catch:{ all -> 0x0b5e }
            goto L_0x0b2c
        L_0x0b3c:
            monitor-exit(r3)
            return
        L_0x0b3e:
            r2 = move-exception
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            java.util.List r0 = A00(r6, r5, r4, r3)     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b5c
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b5e }
        L_0x0b4c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b5e }
            if (r0 == 0) goto L_0x0b5c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b5e }
            X.B81 r0 = (X.B81) r0     // Catch:{ all -> 0x0b5e }
            r0.BuT()     // Catch:{ all -> 0x0b5e }
            goto L_0x0b4c
        L_0x0b5c:
            monitor-exit(r3)
            throw r2
        L_0x0b5e:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L_0x0b61:
            java.lang.Object r4 = r0.A01
            X.AVi r4 = (X.C20702AVi) r4
            java.lang.Object r3 = r0.A02
            X.9ge r3 = (X.C187959ge) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.Object r1 = r0.A04
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1U5 r0 = r4.A01
            r0.A0A(r3, r2, r1)
            return
        L_0x0b77:
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.A03
            X.AEs r0 = (X.C20284AEs) r0
            X.2tK r0 = r0.A07
            java.lang.String r0 = r0.A03
            r1.get(r0)
            return
        L_0x0b87:
            java.lang.Object r5 = r0.A01
            X.1MW r5 = (X.AnonymousClass1MW) r5
            java.lang.Object r4 = r0.A02
            X.1E9 r4 = (X.AnonymousClass1E9) r4
            java.lang.Object r7 = r0.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.A04
            java.util.List r6 = (java.util.List) r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ParticipantUserStore/updateGroupParticipants "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " participants:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " removeParticipants:"
            X.C17900vP.A0Y(r6, r0, r1)
            X.1Cd r0 = r5.A06
            X.1au r3 = r0.A05()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0bf6 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0bec }
        L_0x0bbe:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0bec }
            if (r0 == 0) goto L_0x0bce
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0bec }
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x0bec }
            r5.A0P(r4, r0)     // Catch:{ all -> 0x0bec }
            goto L_0x0bbe
        L_0x0bce:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0bec }
        L_0x0bd2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0bec }
            if (r0 == 0) goto L_0x0be2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0bec }
            X.2sr r0 = (X.C63312sr) r0     // Catch:{ all -> 0x0bec }
            r5.A0I(r0, r4)     // Catch:{ all -> 0x0bec }
            goto L_0x0bd2
        L_0x0be2:
            r2.A00()     // Catch:{ all -> 0x0bec }
            r2.close()     // Catch:{ all -> 0x0bf6 }
            r3.close()
            return
        L_0x0bec:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0bf1 }
            goto L_0x0bf5
        L_0x0bf1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bf6 }
        L_0x0bf5:
            throw r1     // Catch:{ all -> 0x0bf6 }
        L_0x0bf6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0bfb }
            throw r1
        L_0x0bfb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0c00:
            java.lang.Object r5 = r0.A01
            X.10T r5 = (X.AnonymousClass10T) r5
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            r1 = 0
            X.4oq r0 = new X.4oq
            r0.<init>(r2, r4, r3, r1)
            r5.notifyAllObservers(r0)
            return
        L_0x0c14:
            java.lang.Object r8 = r0.A01
            X.1Ux r8 = (X.C27151Ux) r8
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r7 = r0.A03
            X.1EC r7 = (X.AnonymousClass1EC) r7
            java.lang.Object r6 = r0.A04
            X.2rV r6 = (X.C62502rV) r6
            java.util.Iterator r11 = X.AnonymousClass000.A15(r1)
        L_0x0c28:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0c6a
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r11)
            java.lang.Object r1 = r0.getKey()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r0.getValue()
            X.C17960vV.A07(r0)
            long r4 = X.C17880vN.A05(r0)
            X.1Qh r0 = r8.A01
            long r1 = r0.A02(r7, r1)
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0c28
            X.00H r0 = r8.A03
            X.206 r3 = X.AnonymousClass1W2.A02(r0, r1)
            X.23S r3 = (X.AnonymousClass23S) r3
            if (r3 == 0) goto L_0x0c28
            long r1 = r3.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0c28
            r0 = 1
            r3.A07 = r0
            r3.A01 = r4
            X.122 r0 = r8.A00
            r0.CQw(r3)
            goto L_0x0c28
        L_0x0c6a:
            r0 = 0
            X.C62502rV.A00(r0, r6, r0)
            return
        L_0x0c6f:
            java.lang.Object r1 = r0.A01
            X.1Vt r1 = (X.C27351Vt) r1
            java.lang.Object r4 = r0.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            java.lang.Object r3 = r0.A03
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r5 = r0.A04
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            X.00H r1 = r1.A00
            java.lang.Object r0 = r1.get()
            X.9j8 r0 = (X.AnonymousClass9j8) r0
            java.util.Map r0 = r0.A00
            r0.size()
            java.lang.Object r0 = r1.get()
            X.9j8 r0 = (X.AnonymousClass9j8) r0
            java.util.Map r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Iterator r1 = X.C17890vO.A0j(r0)
        L_0x0c9d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ccd
            java.lang.Object r0 = r1.next()
            X.9lA r0 = (X.C190569lA) r0
            int r2 = r0.A00
            r0 = 547(0x223, float:7.67E-43)
            if (r2 != r0) goto L_0x0cbc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backupencryption/received/needs-pn-otp-error "
            X.C17900vP.A0k(r0, r1, r2)
            r4.run()
            return
        L_0x0cbc:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0c9d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "backupencryption/received/error "
            X.C17900vP.A0k(r0, r1, r2)
            r3.run()
            return
        L_0x0ccd:
            r5.run()
            return
        L_0x0cd1:
            java.lang.Object r6 = r0.A01
            X.6oQ r6 = (X.C133256oQ) r6
            java.lang.Object r5 = r0.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r0.A03
            X.1E2 r4 = (X.AnonymousClass1E2) r4
            java.lang.Object r3 = r0.A04
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            X.0ve r2 = r6.A01
            r1 = 11287(0x2c17, float:1.5816E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.0vl r0 = r6.A0A
            java.lang.Object r2 = r0.getValue()
            X.A5S r2 = (X.A5S) r2
            if (r1 == 0) goto L_0x0cfe
            X.9ra r1 = new X.9ra
            r1.<init>(r4, r5, r3)
        L_0x0cfa:
            r2.A08(r1)
            return
        L_0x0cfe:
            r0 = 0
            X.9ra r1 = new X.9ra
            r1.<init>(r0, r5, r3)
            goto L_0x0cfa
        L_0x0d05:
            java.lang.Object r5 = r0.A01
            X.1px r5 = (X.C37681px) r5
            java.lang.Object r6 = r0.A02
            java.lang.Object r7 = r0.A03
            java.lang.Object r8 = r0.A04
            X.1pv r3 = r5.A04
            android.content.Context r2 = r5.A00
            r0 = 2131888968(0x7f120b48, float:1.9412586E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131897301(0x7f122bd5, float:1.9429488E38)
            java.lang.String r0 = r2.getString(r0)
            r9 = 15
            X.78E r4 = new X.78E
            r4.<init>(r5, r6, r7, r8, r9)
            r3.BAZ(r1, r0, r4)
            return
        L_0x0d2c:
            java.lang.Object r1 = r0.A01
            X.1ju r1 = (X.C34091ju) r1
            java.lang.Object r5 = r0.A02
            java.lang.Object r7 = r0.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.A04
            java.util.List r6 = (java.util.List) r6
            com.whatsapp.conversationslist.ConversationsFragment r4 = r1.A0Q
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0d95
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0d95
            r0 = 2131891748(0x7f121624, float:1.9418225E38)
            java.lang.String r2 = r4.A1H(r0)
        L_0x0d4f:
            android.view.View r1 = r4.A17()
            r12 = 0
            r0 = 0
            X.Bik r9 = X.C23520Bik.A00(r0, r1, r2, r12)
            r0 = 2131891747(0x7f121623, float:1.9418223E38)
            r8 = 14
            X.78E r3 = new X.78E
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A0F(r3, r0)
            android.content.Context r3 = r4.A14()
            android.content.Context r2 = r4.A14()
            r1 = 2130971311(0x7f040aaf, float:1.7551357E38)
            r0 = 2131102579(0x7f060b73, float:1.78176E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            int r0 = X.C19740yt.A00(r3, r0)
            r9.A0E(r0)
            java.util.List r11 = java.util.Collections.emptyList()
            X.11C r10 = r4.A1o
            X.1q9 r8 = r4.A1G()
            X.C18070vi.A0p(r11, r10, r8)
            X.4eK r7 = new X.4eK
            r7.<init>(r8, r9, r10, r11, r12)
            r7.A03()
            return
        L_0x0d95:
            boolean r1 = r7.isEmpty()
            android.content.Context r0 = r4.A14()
            android.content.res.Resources r2 = r0.getResources()
            if (r1 != 0) goto L_0x0daf
            r1 = 2131755214(0x7f1000ce, float:1.91413E38)
            int r0 = r7.size()
        L_0x0daa:
            java.lang.String r2 = r2.getQuantityString(r1, r0)
            goto L_0x0d4f
        L_0x0daf:
            r1 = 2131755215(0x7f1000cf, float:1.9141303E38)
            int r0 = r6.size()
            goto L_0x0daa
        L_0x0db7:
            java.lang.Object r3 = r0.A01
            X.A8c r3 = (X.C20119A8c) r3
            java.lang.Object r2 = r0.A02
            X.A2N r2 = (X.A2N) r2
            java.lang.Object r1 = r0.A03
            X.9tm r1 = (X.C195709tm) r1
            java.lang.Object r0 = r0.A04
            X.BBe r0 = (X.C22521BBe) r0
            X.C20119A8c.A02(r3, r2, r1, r0)
            return
        L_0x0dcb:
            java.lang.Object r4 = r0.A01
            X.A8c r4 = (X.C20119A8c) r4
            java.lang.Object r3 = r0.A02
            X.A2N r3 = (X.A2N) r3
            java.lang.Object r2 = r0.A03
            X.9tm r2 = (X.C195709tm) r2
            java.lang.Object r1 = r0.A04
            X.BBe r1 = (X.C22521BBe) r1
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.C20119A8c.A02(r4, r3, r2, r1)
            return
        L_0x0de3:
            java.lang.Object r7 = r0.A01
            X.724 r7 = (X.AnonymousClass724) r7
            java.lang.Object r6 = r0.A02
            X.77d r6 = (X.C1418377d) r6
            java.lang.Object r5 = r0.A03
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A04
            com.whatsapp.stickers.StickerView r4 = (com.whatsapp.stickers.StickerView) r4
            android.content.Context r0 = r4.getContext()
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass73J.A00(r0, r6)
            r4.setContentDescription(r0)
            X.1Sw r2 = r7.A0E
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r4)
            r0 = 2131168923(0x7f070e9b, float:1.7952162E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 2131233044(0x7f080914, float:1.8082214E38)
            r4.setImageResource(r0)
            X.3AQ r3 = new X.3AQ
            r3.<init>(r6, r2, r4, r1)
            X.1gV r2 = r7.A0F
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "quoted-"
            java.lang.String r0 = X.AnonymousClass206.A03(r5, r0, r1)
            X.C32021gV.A07(r4, r5, r3, r2, r0)
            return
        L_0x0e29:
            java.lang.Object r3 = r0.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r3
            java.lang.Object r2 = r0.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r1 = r0.A03
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.Object r0 = r0.A04
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A11(r3, r0, r2, r1)
            return
        L_0x0e3d:
            java.lang.Object r4 = r0.A01
            X.4X0 r4 = (X.AnonymousClass4X0) r4
            java.lang.Object r1 = r0.A02
            X.205 r1 = (X.AnonymousClass205) r1
            java.lang.Object r3 = r0.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r0.A04
            android.view.View r2 = (android.view.View) r2
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            java.lang.String r1 = r1.A01
            X.C18070vi.A0X(r1)
            r2.clearAnimation()
            boolean r0 = r3.isInLayout()
            if (r0 != 0) goto L_0x0e62
            r3.removeView(r2)
        L_0x0e62:
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return
        L_0x0e6e:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r1 = r0.A03
            X.73D r1 = (X.AnonymousClass73D) r1
            java.lang.Object r0 = r0.A04
            X.3sq r0 = (X.C78463sq) r0
            X.C78463sq.setupShareToMyStatusButton$lambda$14$lambda$13$lambda$12(r3, r2, r1, r0)
            return
        L_0x0e82:
            java.lang.Object r5 = r0.A01
            X.3uP r5 = (X.AnonymousClass3uP) r5
            java.lang.Object r2 = r0.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Object r1 = r0.A03
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            java.lang.Object r4 = r0.A04
            java.lang.String r0 = r5.getGroupRoleTitle()
            if (r0 == 0) goto L_0x0ea7
            if (r2 == 0) goto L_0x0ea7
            if (r1 == 0) goto L_0x0ea7
            X.1MZ r0 = r5.A0z
            X.2sr r0 = r0.A06(r1, r2)
            if (r0 == 0) goto L_0x0ea7
            int r0 = r0.A01
            r3 = 0
            if (r0 != 0) goto L_0x0ea9
        L_0x0ea7:
            r3 = 8
        L_0x0ea9:
            X.1KB r2 = r5.A0S
            r1 = 36
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r5, (int) r3, (int) r1, (java.lang.Object) r4)
            r2.CGP(r0)
            return
        L_0x0eb6:
            java.lang.Object r4 = r0.A01
            X.3s0 r4 = (X.AnonymousClass3s0) r4
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r5 = r0.A04
            X.9Bw r5 = (X.C178119Bw) r5
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            com.whatsapp.WaTextView r2 = r4.A05
            if (r2 == 0) goto L_0x0eea
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r1)
            r0 = 2131169436(0x7f07109c, float:1.7953202E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 0
            r2.setTextSize(r0, r1)
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x0f00
            r1 = 2131898016(0x7f122ea0, float:1.9430938E38)
        L_0x0ee7:
            r2.setText(r1)
        L_0x0eea:
            com.whatsapp.WaTextView r1 = r4.A04
            if (r1 == 0) goto L_0x0ef3
            r0 = 8
            r1.setVisibility(r0)
        L_0x0ef3:
            com.whatsapp.calling.PeerAvatarLayout r0 = r4.A06
            if (r0 == 0) goto L_0x0efc
            X.3WM r0 = r0.A05
            r0.A0W(r3)
        L_0x0efc:
            X.AnonymousClass3s0.A00(r4)
            return
        L_0x0f00:
            boolean r0 = r5.A0J
            r1 = 2131898713(0x7f123159, float:1.9432352E38)
            if (r0 == 0) goto L_0x0ee7
            r1 = 2131899576(0x7f1234b8, float:1.9434102E38)
            goto L_0x0ee7
        L_0x0f0b:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r0.A03
            java.lang.Object r2 = r0.A04
            r5 = 6
            X.3Cr r0 = new X.3Cr
            r0.<init>((java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (int) r5)
            X.C1420577z.A00(r3, r0)
            return
        L_0x0f1f:
            java.lang.Object r3 = r0.A01
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r2 = r0.A02
            X.3gf r2 = (X.AnonymousClass3gf) r2
            java.lang.Object r4 = r0.A03
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            java.lang.Object r5 = r0.A04
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1Me r1 = r2.A08
            r0 = 7
            X.1yg r0 = r1.A0D(r4, r0)
            r3.element = r0
            X.1KB r0 = r2.A05
            r6 = 3
        L_0x0f3d:
            X.3Cr r1 = new X.3Cr
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            goto L_0x1013
        L_0x0f44:
            java.lang.Object r4 = r0.A01
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            java.lang.Object r3 = r0.A02
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r2 = r0.A03
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r0.A04
            X.4SL r1 = (X.AnonymousClass4SL) r1
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r3.element
            X.1yg r0 = (X.C42751yg) r0
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A11(r4, r1, r0, r2)
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A12(r4, r1, r2)
            return
        L_0x0f63:
            java.lang.Object r1 = r0.A01
            X.6uk r1 = (X.C136996uk) r1
            java.lang.Object r9 = r0.A02
            X.2tk r9 = (X.C63822tk) r9
            java.lang.Object r8 = r0.A03
            X.2gz r8 = (X.C56152gz) r8
            java.lang.Object r10 = r0.A04
            X.2ia r10 = (X.C57132ia) r10
            java.io.File r7 = r1.A03()
            if (r7 == 0) goto L_0x0faa
            X.1l8 r0 = r9.A0M
            java.lang.String r6 = r8.A09
            java.lang.String r5 = r7.getAbsolutePath()
            X.C18070vi.A0X(r5)
            r1 = 1
            X.1Oq r0 = r0.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0fa3 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0fa3 }
            java.lang.String r2 = "UPDATE history_sync_companion SET local_path = ? WHERE message_id = ?"
            r0 = 2
            java.lang.String[] r1 = X.C17880vN.A1b(r5, r6, r0, r1)     // Catch:{ all -> 0x0fa3 }
            java.lang.String r0 = "HistorySyncCompanionStore.UPDATE_CHUNK_WITH_LOCAL_PATH"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x0fa3 }
            r4.close()
            X.C63822tk.A03(r10, r9, r8, r7)
            return
        L_0x0fa3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0fa5 }
        L_0x0fa5:
            r2 = move-exception
            X.CDX.A00(r4, r0)
            throw r2
        L_0x0faa:
            java.lang.IllegalStateException r2 = X.C17880vN.A0g()
            throw r2
        L_0x0faf:
            java.lang.Object r6 = r0.A01
            X.2Km r6 = (X.C47922Km) r6
            java.lang.Object r5 = r0.A02
            X.Af0 r5 = (X.C21132Af0) r5
            java.lang.Object r4 = r0.A03
            X.Af0 r4 = (X.C21132Af0) r4
            java.lang.Object r3 = r0.A04
            X.Af0 r3 = (X.C21132Af0) r3
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "CriticalSyncTimeout"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.5yg r2 = new X.5yg
            r2.<init>(r0)
            X.11Q r0 = r6.A06
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 2
            if (r1 < r0) goto L_0x0ff2
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            X.2Dn r0 = new X.2Dn
            r0.<init>(r1)
            r5.A0B(r0)
        L_0x0feb:
            r4.A0B(r2)
            r3.A0B(r2)
            return
        L_0x0ff2:
            r5.A0B(r2)
            goto L_0x0feb
        L_0x0ff6:
            java.lang.Object r5 = r0.A01
            X.3Zf r5 = (X.C74283Zf) r5
            java.lang.Object r2 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.Object r4 = r0.A04
            java.util.List r0 = X.C42011xT.A0I
            X.C18070vi.A0o(r2, r3, r4)
            X.4Rm r0 = r5.A03
            boolean r7 = r0.A01()
            X.1KB r0 = r5.A01
            r6 = 6
            X.Ak4 r1 = new X.Ak4
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x1013:
            r0.A0J(r1)
            return
        L_0x1017:
            java.lang.Object r3 = r0.A03     // Catch:{ all -> 0x1027 }
            X.DTu r3 = (X.C27094DTu) r3     // Catch:{ all -> 0x1027 }
            java.lang.Object r2 = r0.A04     // Catch:{ all -> 0x1027 }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x1027 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x1027 }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ all -> 0x1027 }
            r3.A00(r2, r1)     // Catch:{ all -> 0x1027 }
            return
        L_0x1027:
            r3 = move-exception
            java.lang.Object r0 = r0.A01
            X.BrJ r0 = (X.C23862BrJ) r0
            java.lang.Object r1 = r0.A01
            X.DP9 r1 = (X.DP9) r1
            X.00H r0 = X.C23861BrI.A06
            r1.A02(r3)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            throw r2
        L_0x103b:
            return
        L_0x103c:
            java.lang.String r0 = "enableNewCallControls"
            X.C18070vi.A11(r0)     // Catch:{ IllegalStateException -> 0x1043 }
            r0 = 0
            throw r0     // Catch:{ IllegalStateException -> 0x1043 }
        L_0x1043:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sup:VOIPGlassesPlugin.kt Failed to inflate supToggle due to "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Skipping"
            X.C17890vO.A19(r1, r0)
            return
        L_0x1057:
            java.lang.Object r5 = r0.A04     // Catch:{ all -> 0x10a9 }
            X.1DN r5 = (X.AnonymousClass1DN) r5     // Catch:{ all -> 0x10a9 }
            r1 = 1
            X.1pX[] r4 = new X.C37431pX[r1]     // Catch:{ all -> 0x10a9 }
            X.1Vz r1 = r9.A01     // Catch:{ all -> 0x10a9 }
            X.2yc r2 = new X.2yc     // Catch:{ all -> 0x10a9 }
            r2.<init>(r1, r8)     // Catch:{ all -> 0x10a9 }
            r1 = 0
            r4[r1] = r2     // Catch:{ all -> 0x10a9 }
            X.2i2 r3 = new X.2i2     // Catch:{ all -> 0x10a9 }
            r3.<init>(r4)     // Catch:{ all -> 0x10a9 }
            X.1DK r1 = r5.A06     // Catch:{ all -> 0x10a9 }
            X.10w r1 = r1.A00()     // Catch:{ all -> 0x10a9 }
            X.10f r2 = r1.keySet()     // Catch:{ all -> 0x10a9 }
            r1 = 7
            r5.A05(r3, r2, r1)     // Catch:{ all -> 0x10a9 }
            X.0z4 r2 = r5.A04     // Catch:{ all -> 0x10a9 }
            X.11P r1 = r5.A03     // Catch:{ all -> 0x10a9 }
            long r3 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x10a9 }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r2)     // Catch:{ all -> 0x10a9 }
            android.content.SharedPreferences$Editor r2 = r1.edit()     // Catch:{ all -> 0x10a9 }
            java.lang.String r1 = "db_last_all_migrations_attempt_timestamp"
            X.C17880vN.A1D(r2, r1, r3)     // Catch:{ all -> 0x10a9 }
            java.lang.Object r3 = r0.A01     // Catch:{ all -> 0x10a9 }
            X.0ve r3 = (X.C18030ve) r3     // Catch:{ all -> 0x10a9 }
            r2 = 424(0x1a8, float:5.94E-43)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x10a9 }
            boolean r1 = X.C18020vd.A05(r1, r3, r2)     // Catch:{ all -> 0x10a9 }
            if (r1 == 0) goto L_0x10a1
            r5.A04()     // Catch:{ all -> 0x10a9 }
        L_0x10a1:
            java.lang.Object r0 = r0.A03
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x10a9:
            r1 = move-exception
            java.lang.Object r0 = r0.A03
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            throw r1
        L_0x10b2:
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin after confirming to replace the pin."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131894578(0x7f122132, float:1.9423965E38)
            r3.A0E(r0)
            r0 = 2131894577(0x7f122131, float:1.9423963E38)
            r3.A0D(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r3.A0e(r5, r4, r0)
            r2 = 2131887451(0x7f12055b, float:1.940951E38)
            r1 = 5
            X.4fo r0 = new X.4fo
            r0.<init>(r5, r6, r7, r1)
            r3.A0g(r5, r0, r2)
            X.05w r0 = r3.create()
            r0.show()
            X.2r7 r1 = r7.A02
            r0 = 38
            r1.A01(r6, r4, r0)
            return
        L_0x10e8:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with other error."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131894575(0x7f12212f, float:1.9423959E38)
            goto L_0x1101
        L_0x10f5:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with no connection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131894576(0x7f122130, float:1.942396E38)
        L_0x1101:
            r1.A0D(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.A0g(r5, r4, r0)
            X.05w r0 = r1.create()
            r0.show()
            return
        L_0x1112:
            X.1KB r0 = r7.A0S
            r11 = 10
            X.3Cr r6 = new X.3Cr
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
            r0.A0J(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70833Cr.run():void");
    }

    public C70833Cr(C20119A8c a8c, A2N a2n, C195709tm r3, C22521BBe bBe, int i) {
        this.A00 = i;
        this.A01 = a8c;
        this.A02 = a2n;
        this.A03 = r3;
        this.A04 = bBe;
    }

    public C70833Cr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
    }
}
