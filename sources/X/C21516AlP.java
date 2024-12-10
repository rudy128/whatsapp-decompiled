package X;

/* renamed from: X.AlP  reason: case insensitive filesystem */
public class C21516AlP implements C18140vp {
    public final int A00;
    public final Object A01;

    public C21516AlP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        return com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A03(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0029;
                case 2: goto L_0x0033;
                case 3: goto L_0x003e;
                case 4: goto L_0x0062;
                case 5: goto L_0x008f;
                case 6: goto L_0x00a8;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00d2;
                case 9: goto L_0x00da;
                case 10: goto L_0x00e6;
                case 11: goto L_0x00f3;
                case 12: goto L_0x0101;
                case 13: goto L_0x012e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.1nB r0 = (X.C36001nB) r0
            X.Adw r2 = new X.Adw
            r2.<init>(r0)
            return r2
        L_0x000f:
            java.lang.Object r0 = r8.A01
            X.9NA r0 = (X.AnonymousClass9NA) r0
            android.content.Context r3 = r0.A00
            java.lang.String r2 = X.C182269Ts.A00()
            if (r2 != 0) goto L_0x001d
            java.lang.String r2 = "default"
        L_0x001d:
            java.lang.String r1 = "light_prefs"
            r0 = 0
            java.io.File r0 = r3.getDir(r1, r0)
            java.io.File r2 = X.C17880vN.A0e(r0, r2)
            return r2
        L_0x0029:
            java.lang.Object r0 = r8.A01
            X.A7v r0 = (X.A7v) r0
            X.9X8 r2 = new X.9X8
            r2.<init>(r0)
            return r2
        L_0x0033:
            java.lang.Object r1 = r8.A01
            X.10I r1 = (X.AnonymousClass10I) r1
            r0 = 1
            X.10s r2 = new X.10s
            r2.<init>(r1, r0)
            return r2
        L_0x003e:
            java.lang.Object r1 = r8.A01
            X.9mO r1 = (X.C191319mO) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A02     // Catch:{ IOException -> 0x005b }
            java.io.File r1 = X.C108945cZ.A16(r0)     // Catch:{ IOException -> 0x005b }
            java.lang.String r0 = "flows_json_cache_dir"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x005b }
            r1 = 8388608(0x800000, double:4.144523E-317)
            r0 = 0
            X.AiK r2 = X.AiK.A01(r0, r3, r1)     // Catch:{ IOException -> 0x005b }
            return r2
        L_0x005b:
            java.lang.String r0 = "FlowsLogger/FlowJSONPrefetchDiskLruCache/init: /$/{e.message}"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
            return r2
        L_0x0062:
            java.lang.Object r1 = r8.A01
            X.A4x r1 = (X.C20051A4x) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A01     // Catch:{ IOException -> 0x007f }
            java.io.File r1 = X.C108945cZ.A16(r0)     // Catch:{ IOException -> 0x007f }
            java.lang.String r0 = "extensions_reporting_cache_dir"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x007f }
            r1 = 10485760(0xa00000, double:5.180654E-317)
            r0 = 0
            X.AiK r2 = X.AiK.A01(r0, r3, r1)     // Catch:{ IOException -> 0x007f }
            return r2
        L_0x007f:
            r1 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsReportingDiskCache/init: "
            r2.append(r0)
            java.lang.String r0 = r1.getMessage()
            goto L_0x0129
        L_0x008f:
            java.lang.Object r0 = r8.A01
            X.10I r0 = (X.AnonymousClass10I) r0
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            java.lang.String r1 = "ThumbnailDownloadQueue"
            r3 = 1
            r4 = 2
            r6 = 5
            r5 = 10
            X.2Py r2 = r0.BHv(r1, r2, r3, r4, r5, r6)
            r2.allowCoreThreadTimeOut(r3)
            return r2
        L_0x00a8:
            java.lang.Object r0 = r8.A01
            X.10I r0 = (X.AnonymousClass10I) r0
            r5 = 10
            X.3Ew r2 = new X.3Ew
            r2.<init>()
            java.lang.String r1 = "ParallelMediaDownload"
            r3 = 1
            r6 = 60
            r4 = r3
            X.2Py r2 = r0.BHv(r1, r2, r3, r4, r5, r6)
            r2.allowCoreThreadTimeOut(r3)
            r1 = 2
            X.AlE r0 = new X.AlE
            r0.<init>(r1)
            r2.setRejectedExecutionHandler(r0)
            return r2
        L_0x00ca:
            java.lang.Object r1 = r8.A01
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131233504(0x7f080ae0, float:1.8083147E38)
            goto L_0x00e1
        L_0x00d2:
            java.lang.Object r1 = r8.A01
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131233502(0x7f080ade, float:1.8083143E38)
            goto L_0x00e1
        L_0x00da:
            java.lang.Object r1 = r8.A01
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r1 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r1
            r0 = 2131233503(0x7f080adf, float:1.8083145E38)
        L_0x00e1:
            X.1Jp r2 = com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A03(r1, r0)
            return r2
        L_0x00e6:
            java.lang.Object r0 = r8.A01
            X.9uV r0 = (X.C196129uV) r0
            X.0vc r1 = r0.A00
            java.lang.String r0 = "migration_export"
            android.content.SharedPreferences r2 = r1.A05(r0)
            return r2
        L_0x00f3:
            java.lang.Object r1 = r8.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.9Xs r2 = new X.9Xs
            r2.<init>(r1)
            return r2
        L_0x0101:
            java.lang.Object r1 = r8.A01
            X.9bx r1 = (X.C185059bx) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A00     // Catch:{ IOException -> 0x011e }
            java.io.File r1 = X.C108945cZ.A16(r0)     // Catch:{ IOException -> 0x011e }
            java.lang.String r0 = "payment_links_cache_dir"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x011e }
            r1 = 1048576(0x100000, double:5.180654E-318)
            r0 = 0
            X.AiK r2 = X.AiK.A01(r0, r3, r1)     // Catch:{ IOException -> 0x011e }
            return r2
        L_0x011e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentLinksDiskLRUCacheLogger"
            r2.append(r0)
            java.lang.String r0 = "/PaymentLinksDiskLRUCache/init: /$/{e.message}"
        L_0x0129:
            X.C17890vO.A19(r2, r0)
            r2 = 0
            return r2
        L_0x012e:
            java.lang.Object r0 = r8.A01
            X.1OS r0 = (X.AnonymousClass1OS) r0
            X.Adv r2 = new X.Adv
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21516AlP.get():java.lang.Object");
    }
}
