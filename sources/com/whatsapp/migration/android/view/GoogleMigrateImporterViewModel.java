package com.whatsapp.migration.android.view;

import X.A8V;
import X.AW3;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11E;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass2LQ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.BDR;
import X.C108945cZ;
import X.C139916ze;
import X.C17880vN;
import X.C17900vP;
import X.C197959xY;
import X.C20113A7w;
import X.C219217x;
import X.C33841jT;
import android.content.Context;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

public class GoogleMigrateImporterViewModel extends AnonymousClass1J2 {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass11E A05;
    public final AnonymousClass118 A06;
    public final C219217x A07;
    public final C20113A7w A08;
    public final C197959xY A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final BDR A0D;
    public final AnonymousClass2LQ A0E;
    public final C33841jT A0F;

    public void A0S() {
        this.A0E.unregisterObserver(this.A0D);
    }

    public void A0T() {
        this.A0F.A04();
        A0V(18);
        this.A00.A0E(C17880vN.A0j());
        this.A08.A0C();
        Context context = this.A06.A00;
        Log.i("GoogleMigrateService/stopImport()");
        ((C139916ze) this.A0B.get()).A03(context, GoogleMigrateService.class);
    }

    public void A0U() {
        A8V A0q = AnonymousClass8BR.A0q(this.A0C);
        C197959xY r2 = this.A09;
        A0q.A0M("google_migrate_import_started", (String) null, C197959xY.A00(r2).getString("google_migrate_ios_funnel_id", (String) null), C197959xY.A00(r2).getString("google_migrate_ios_export_duration", (String) null), 0);
        Context context = this.A06.A00;
        Log.i("GoogleMigrateService/startImport()");
        ((C139916ze) this.A0B.get()).A02(context, C108945cZ.A0G("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT"), GoogleMigrateService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (X.C72463Mc.A1W(r5.A0A) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(boolean r6) {
        /*
            r5 = this;
            java.lang.String r2 = "google_migrate_confirm_continue_import"
            X.00H r0 = r5.A0C
            X.A8V r1 = X.AnonymousClass8BR.A0q(r0)
            if (r6 == 0) goto L_0x005d
            java.lang.String r0 = "google_migrate_recoverable_error"
            r1.A0H(r0, r2)
            X.1DT r1 = r5.A01
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x0029
            int r1 = X.C72463Mc.A0A(r1)
            r0 = 6
            if (r1 == r0) goto L_0x0029
            r0 = 9
            if (r1 == r0) goto L_0x005b
            r0 = 11
            if (r1 == r0) goto L_0x0058
            switch(r1) {
                case 13: goto L_0x0055;
                case 14: goto L_0x0052;
                case 15: goto L_0x004f;
                case 16: goto L_0x004c;
                default: goto L_0x0029;
            }
        L_0x0029:
            r4 = 1
        L_0x002a:
            X.118 r0 = r5.A06
            android.content.Context r3 = r0.A00
            X.00H r0 = r5.A0B
            java.lang.Object r2 = r0.get()
            X.6ze r2 = (X.C139916ze) r2
            java.lang.String r0 = "GoogleMigrateService/prepareBeforeRetry()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "migration_error_code"
            r1.putExtra(r0, r4)
            java.lang.Class<com.whatsapp.migration.android.integration.service.GoogleMigrateService> r0 = com.whatsapp.migration.android.integration.service.GoogleMigrateService.class
            r2.A02(r3, r1, r0)
            return
        L_0x004c:
            r4 = 102(0x66, float:1.43E-43)
            goto L_0x002a
        L_0x004f:
            r4 = 103(0x67, float:1.44E-43)
            goto L_0x002a
        L_0x0052:
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x002a
        L_0x0055:
            r4 = 104(0x68, float:1.46E-43)
            goto L_0x002a
        L_0x0058:
            r4 = 301(0x12d, float:4.22E-43)
            goto L_0x002a
        L_0x005b:
            r4 = 2
            goto L_0x002a
        L_0x005d:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            r1.A0H(r0, r2)
            X.17x r0 = r5.A07
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0073
            X.00H r0 = r5.A0A
            boolean r1 = X.C72463Mc.A1W(r0)
            r0 = 3
            if (r1 != 0) goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            r5.A0V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0X(boolean):void");
    }

    public GoogleMigrateImporterViewModel(AnonymousClass11E r4, AnonymousClass118 r5, C219217x r6, C20113A7w a7w, AnonymousClass2LQ r8, C33841jT r9, C197959xY r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        AW3 aw3 = new AW3(this, 1);
        this.A0D = aw3;
        this.A06 = r5;
        this.A0C = r11;
        this.A0B = r12;
        this.A0A = r13;
        this.A07 = r6;
        this.A0F = r9;
        this.A0E = r8;
        this.A09 = r10;
        this.A05 = r4;
        this.A08 = a7w;
        r8.registerObserver(aw3);
        int A062 = a7w.A06();
        if (A062 == 0) {
            Log.i("GoogleMigrateImporterViewModel/onCreate/REQUEST_FOR_PERMISSION state");
            A0V(0);
            return;
        }
        C17900vP.A0j("GoogleMigrateImporterViewModel/onCreate/already has state. Current screen = ", AnonymousClass000.A10(), A062);
        A0V(A062);
        if (A062 == 2) {
            A0W(2);
        } else if (A062 == 3) {
            AnonymousClass3MX.A1K(this.A03, a7w.A05());
            A0U();
        } else if (A062 == 18) {
            A0T();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = java.lang.Integer.valueOf(r11);
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.C42171xk.A00(r2, r1.A06()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        com.whatsapp.util.Log.i("GoogleMigrateImporterViewModel/currentScreen/post");
        r1.A0E(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(int r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/setCurrentScreen: "
            X.C17900vP.A0j(r0, r1, r11)
            java.lang.String r0 = "google_migrate_recoverable_error"
            java.lang.String r4 = "unknown"
            r5 = 0
            switch(r11) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0047;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                case 4: goto L_0x004d;
                case 5: goto L_0x0044;
                case 6: goto L_0x003f;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                case 9: goto L_0x003f;
                case 10: goto L_0x003c;
                case 11: goto L_0x0039;
                case 12: goto L_0x0036;
                case 13: goto L_0x0033;
                case 14: goto L_0x0030;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            X.1DT r1 = r10.A01
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C42171xk.A00(r2, r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/post"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0E(r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r5 = "encryption_no_connection"
            goto L_0x004c
        L_0x002d:
            java.lang.String r5 = "encryption_timed_out"
            goto L_0x004c
        L_0x0030:
            java.lang.String r5 = "encryption_key_not_found"
            goto L_0x004c
        L_0x0033:
            java.lang.String r5 = "encryption_key_mismatch"
            goto L_0x004c
        L_0x0036:
            java.lang.String r5 = "generic_recoverable"
            goto L_0x004c
        L_0x0039:
            java.lang.String r5 = "jabber_id_not_found"
            goto L_0x004c
        L_0x003c:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            goto L_0x004c
        L_0x003f:
            java.lang.String r0 = "google_migrate_unrecoverable_error"
            java.lang.String r5 = "generic_unrecoverable"
            goto L_0x004c
        L_0x0044:
            java.lang.String r0 = "google_migrate_import_complete"
            goto L_0x004c
        L_0x0047:
            java.lang.String r0 = "google_migrate_rejected_permission"
            goto L_0x004c
        L_0x004a:
            java.lang.String r0 = "google_migrate_permission"
        L_0x004c:
            r4 = r0
        L_0x004d:
            X.9xY r3 = r10.A09
            android.content.SharedPreferences r1 = X.C197959xY.A00(r3)
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r2 = 0
            java.lang.String r6 = r1.getString(r0, r2)
            android.content.SharedPreferences r1 = X.C197959xY.A00(r3)
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r7 = r1.getString(r0, r2)
            X.00H r0 = r10.A0C
            X.A8V r3 = X.AnonymousClass8BR.A0q(r0)
            r8 = 0
            r3.A0M(r4, r5, r6, r7, r8)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0V(int):void");
    }

    public void A0W(Integer num) {
        int i = 2;
        if (num.intValue() != 2) {
            AnonymousClass8BR.A0q(this.A0C).A0I("google_migrate_import_complete", "google_migrate_import_complete_next");
            i = 8;
        }
        A0V(i);
        this.A00.A0E(num);
        this.A08.A0C();
        Context context = this.A06.A00;
        Log.i("GoogleMigrateService/stopImport()");
        ((C139916ze) this.A0B.get()).A03(context, GoogleMigrateService.class);
    }
}
