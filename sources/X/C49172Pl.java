package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.contentprovider.MediaProvider;
import java.lang.ref.WeakReference;

/* renamed from: X.2Pl  reason: invalid class name and case insensitive filesystem */
public final class C49172Pl extends A34 {
    public final C218617r A00;
    public final AnonymousClass11P A01;
    public final C72403Lu A02;
    public final Integer A03;
    public final WeakReference A04;

    public C49172Pl(AnonymousClass1FU r2, C218617r r3, AnonymousClass11P r4, C72403Lu r5, Integer num) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = num;
        this.A04 = new WeakReference(r2);
    }

    public void A0F() {
        AnonymousClass1FU r0 = (AnonymousClass1FU) this.A04.get();
        if (r0 != null && !r0.Bed()) {
            this.A02.CNB(0, 2131895077);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.17r r2 = r7.A00
            java.io.File r3 = r2.A0F()
            r0 = 0
            X.C64062u9.A0H(r3, r0)
            java.lang.String r4 = X.C17890vO.A0Q()
            X.C18070vi.A0X(r4)
            java.lang.Integer r0 = r7.A03
            int r1 = r0.intValue()
            r0 = 1
            r6 = 0
            if (r1 == r0) goto L_0x0041
            r0 = 2
            if (r1 == r0) goto L_0x0036
            r0 = 3
            if (r1 != r0) goto L_0x0098
            X.118 r0 = r2.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wamo_gdpr.zip"
        L_0x002d:
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            java.io.File r5 = r2.A0Y(r4)
            goto L_0x004c
        L_0x0036:
            X.118 r0 = r2.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "channels_gdpr.zip"
            goto L_0x002d
        L_0x0041:
            X.118 r0 = r2.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "gdpr.zip"
            goto L_0x002d
        L_0x004c:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0073 }
            r3.<init>(r0)     // Catch:{ all -> 0x0073 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x006c }
            r2.<init>(r5)     // Catch:{ all -> 0x006c }
            int r0 = X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0065 }
            r2.close()     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0079
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0079:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = "ExportGdprReportTask/doInBackground/can't prepare report file"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        L_0x0085:
            X.11P r0 = r7.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            boolean r0 = r5.setLastModified(r0)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = "ExportGdprReportTask/doInBackground/failed to update report file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x0097:
            return r4
        L_0x0098:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49172Pl.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        AnonymousClass1FU r0 = (AnonymousClass1FU) this.A04.get();
        if (r0 != null && !r0.Bed()) {
            C72403Lu r4 = this.A02;
            r4.CEx();
            if (str3 != null) {
                Integer num = this.A03;
                AnonymousClass1FP r42 = (AnonymousClass1FP) r4;
                C18070vi.A0d(num, 1);
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                if (num == AnonymousClass00R.A01) {
                    str2 = "gdpr_report";
                } else if (num == AnonymousClass00R.A0C) {
                    str2 = "channels_gdpr_report";
                } else if (num == AnonymousClass00R.A0N) {
                    str2 = "content_gdpr_report";
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("MediaProvider/getGdprMediaUri/unexpected gdprReportType: ");
                    switch (num.intValue()) {
                        case 1:
                            str = "ACCOUNT";
                            break;
                        case 2:
                            str = "NEWSLETTER";
                            break;
                        case 3:
                            str = "WAMO";
                            break;
                        default:
                            str = "P2B";
                            break;
                    }
                    throw AnonymousClass000.A0n(AnonymousClass000.A0y(str, A10));
                }
                intent.putExtra("android.intent.extra.STREAM", MediaProvider.A05(str2, str3));
                intent.setType("application/zip");
                intent.addFlags(524288);
                r42.startActivityForResult(Intent.createChooser(intent, (CharSequence) null), 0);
            }
        }
    }
}
