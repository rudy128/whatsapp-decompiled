package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.media.transcode.MediaTranscodeService;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.7FN  reason: invalid class name */
public class AnonymousClass7FN implements AnonymousClass1WR, C29961dA {
    public AnonymousClass195 A00;
    public AnonymousClass190 A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11C A03;
    public AnonymousClass118 A04;
    public C18030ve A05;
    public boolean A06 = false;
    public boolean A07 = false;

    public static void A00(AnonymousClass7FN r4, AnonymousClass206 r5) {
        r4.A06 = false;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaTranscodeService/stop-service for message:");
        C17900vP.A0b(r5.A0v, A10);
        Context context = r4.A04.A00;
        if (Build.VERSION.SDK_INT < 26 || !r4.A07) {
            context.stopService(new Intent(context, MediaTranscodeService.class));
        } else {
            C25081Mu.A00(context, new Intent(context, MediaTranscodeService.class).setAction("com.whatsapp.media.transcode.MediaTranscodeService.STOP"));
        }
        r4.A07 = false;
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByI() {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r9.A05, 11124) == -1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A05, 8976) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            int r6 = r10.A0u
            r0 = 3
            r5 = 2
            r8 = 0
            r7 = 1
            if (r6 == r0) goto L_0x0016
            r0 = 13
            if (r6 == r0) goto L_0x0016
            r0 = 9
            if (r6 == r0) goto L_0x0016
            if (r6 != r5) goto L_0x0056
            int r0 = r10.A09
            if (r0 == r7) goto L_0x0056
        L_0x0016:
            r4 = 1
        L_0x0017:
            X.205 r1 = r10.A0v
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0033
            if (r6 == 0) goto L_0x0033
            X.0ve r2 = r9.A05
            r1 = 11124(0x2b74, float:1.5588E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = -1
            r3 = 1
            if (r1 != r0) goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r6 == r7) goto L_0x0040
            r0 = 20
            if (r6 == r0) goto L_0x0040
            r0 = 105(0x69, float:1.47E-43)
            if (r6 == r0) goto L_0x0040
            if (r6 != r5) goto L_0x004d
        L_0x0040:
            X.0ve r2 = r9.A05
            r1 = 8976(0x2310, float:1.2578E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0054
            if (r3 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r8 = 1
        L_0x0055:
            return r8
        L_0x0056:
            r4 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FN.A01(X.206):boolean");
    }

    public void ByP(AnonymousClass206 r4) {
        if (!C18020vd.A05(C18040vf.A02, this.A05, 11664) && A01(r4)) {
            this.A02.A0J(new C146807Qr(this, r4, 47));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0121=Splitter:B:50:0x0121, B:29:0x00c6=Splitter:B:29:0x00c6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByK(X.AnonymousClass206 r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.A01(r9)
            if (r0 == 0) goto L_0x0152
            java.util.HashMap r5 = com.whatsapp.media.transcode.MediaTranscodeService.A0B
            monitor-enter(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "MediaTranscodeService/onMessageChanged for message:"
            r1.append(r0)     // Catch:{ all -> 0x014f }
            X.205 r6 = r9.A0v     // Catch:{ all -> 0x014f }
            r1.append(r6)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = " : status = "
            r1.append(r0)     // Catch:{ all -> 0x014f }
            int r0 = r9.A0D()     // Catch:{ all -> 0x014f }
            r1.append(r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = " : in progress = "
            r1.append(r0)     // Catch:{ all -> 0x014f }
            boolean r0 = r5.containsKey(r6)     // Catch:{ all -> 0x014f }
            r1.append(r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = " : size = "
            r1.append(r0)     // Catch:{ all -> 0x014f }
            int r0 = r5.size()     // Catch:{ all -> 0x014f }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x014f }
            int r1 = r9.A0D()     // Catch:{ all -> 0x014f }
            r0 = 1
            if (r1 != r0) goto L_0x00d3
            boolean r0 = r5.containsKey(r6)     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x0144
            X.21V r9 = (X.AnonymousClass21V) r9     // Catch:{ all -> 0x014f }
            r5.put(r6, r9)     // Catch:{ all -> 0x014f }
            X.1TJ r1 = com.whatsapp.media.transcode.MediaTranscodeService.A0A     // Catch:{ all -> 0x014f }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x014f }
            r1.A04(r0)     // Catch:{ all -> 0x014f }
            boolean r0 = X.AnonymousClass112.A0A()     // Catch:{ all -> 0x014f }
            r7 = 1
            if (r0 == 0) goto L_0x008d
            X.0ve r2 = r8.A05     // Catch:{ all -> 0x014f }
            boolean r0 = X.C108945cZ.A1S(r6)     // Catch:{ all -> 0x014f }
            r1 = 12600(0x3138, float:1.7656E-41)
            if (r0 == 0) goto L_0x0069
            r1 = 12601(0x3139, float:1.7658E-41)
        L_0x0069:
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x014f }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x008d
            X.11C r2 = r8.A03     // Catch:{ all -> 0x014f }
            android.app.job.JobScheduler r1 = r2.A01     // Catch:{ all -> 0x014f }
            if (r1 != 0) goto L_0x0081
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r1 = X.AnonymousClass11C.A03(r2, r0, r7)     // Catch:{ all -> 0x014f }
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1     // Catch:{ all -> 0x014f }
            r2.A01 = r1     // Catch:{ all -> 0x014f }
        L_0x0081:
            X.118 r0 = r8.A04     // Catch:{ all -> 0x014f }
            boolean r0 = X.C123896Wg.A00(r1, r0)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            r8.A06 = r7     // Catch:{ all -> 0x014f }
            goto L_0x014d
        L_0x008d:
            boolean r0 = r8.A06     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x014d
            X.118 r0 = r8.A04     // Catch:{ all -> 0x014f }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x014f }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x014f }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "com.whatsapp.media.transcode.MediaTranscodeService.START"
            android.content.Intent r3 = r1.setAction(r0)     // Catch:{ all -> 0x014f }
            X.195 r0 = r8.A00     // Catch:{ all -> 0x014f }
            boolean r0 = r0.A00     // Catch:{ all -> 0x014f }
            java.lang.String r2 = "MediaTranscodeService/start-service-foreground for message:"
            if (r0 != 0) goto L_0x00b8
            r8.A07 = r7     // Catch:{ all -> 0x014f }
            X.C25081Mu.A00(r4, r3)     // Catch:{ all -> 0x014f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x014f }
            X.C17900vP.A0Y(r6, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014d
        L_0x00b8:
            r4.startService(r3)     // Catch:{ IllegalStateException -> 0x00c6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalStateException -> 0x00c6 }
            java.lang.String r0 = "MediaTranscodeService/start-service for message:"
            X.C17900vP.A0Y(r6, r0, r1)     // Catch:{ IllegalStateException -> 0x00c6 }
            goto L_0x014d
        L_0x00c6:
            r8.A07 = r7     // Catch:{ all -> 0x014f }
            X.C25081Mu.A00(r4, r3)     // Catch:{ all -> 0x014f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x014f }
            X.C17900vP.A0Y(r6, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014d
        L_0x00d3:
            boolean r0 = r5.containsKey(r6)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            int r1 = r9.A0D()     // Catch:{ all -> 0x014f }
            r0 = 2
            if (r1 != r0) goto L_0x012e
            int r1 = r5.size()     // Catch:{ all -> 0x014f }
            r0 = 1
            if (r1 != r0) goto L_0x012e
            X.1BI r3 = r6.A00     // Catch:{ all -> 0x014f }
            boolean r2 = X.C22971Dz.A0a(r3)     // Catch:{ all -> 0x014f }
            X.0ve r1 = r8.A05     // Catch:{ all -> 0x014f }
            r0 = 8932(0x22e4, float:1.2516E-41)
            if (r2 == 0) goto L_0x00f5
            r0 = 11657(0x2d89, float:1.6335E-41)
        L_0x00f5:
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x014f }
            boolean r0 = X.C18020vd.A05(r2, r1, r0)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x012e
            boolean r0 = X.C22971Dz.A0a(r3)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x010d
            X.0ve r1 = r8.A05     // Catch:{ all -> 0x014f }
            r0 = 11124(0x2b74, float:1.5588E-41)
            int r0 = X.C18020vd.A00(r2, r1, r0)     // Catch:{ all -> 0x014f }
            long r1 = (long) r0     // Catch:{ all -> 0x014f }
            goto L_0x0119
        L_0x010d:
            X.0ve r1 = r8.A05     // Catch:{ all -> 0x014f }
            r0 = 8931(0x22e3, float:1.2515E-41)
            int r0 = X.C18020vd.A00(r2, r1, r0)     // Catch:{ all -> 0x014f }
            long r1 = X.C17890vO.A03(r0)
        L_0x0119:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x0121:
            X.1KB r4 = r8.A02     // Catch:{ all -> 0x014f }
            r3 = 48
            X.7Qr r0 = new X.7Qr     // Catch:{ all -> 0x014f }
            r0.<init>(r8, r9, r3)     // Catch:{ all -> 0x014f }
            r4.A0K(r0, r1)     // Catch:{ all -> 0x014f }
            goto L_0x014d
        L_0x012e:
            r5.remove(r6)     // Catch:{ all -> 0x014f }
            X.1TJ r1 = com.whatsapp.media.transcode.MediaTranscodeService.A0A     // Catch:{ all -> 0x014f }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x014f }
            r1.A04(r0)     // Catch:{ all -> 0x014f }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            A00(r8, r9)     // Catch:{ all -> 0x014f }
            goto L_0x014d
        L_0x0144:
            X.1TJ r1 = com.whatsapp.media.transcode.MediaTranscodeService.A0A     // Catch:{ all -> 0x014f }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x014f }
            r1.A04(r0)     // Catch:{ all -> 0x014f }
        L_0x014d:
            monitor-exit(r5)     // Catch:{ all -> 0x014f }
            return
        L_0x014f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014f }
            throw r0
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FN.ByK(X.206, int):void");
    }
}
