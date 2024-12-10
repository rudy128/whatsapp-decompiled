package androidx.work;

import X.AJU;
import X.AnonymousClass1OB;
import X.AnonymousClass1OD;
import X.AnonymousClass1OQ;
import X.AnonymousClass1OW;
import X.AnonymousClass1OY;
import X.AnonymousClass3MX;
import X.C113975oM;
import X.C18070vi;
import X.C18600wl;
import X.C20001A2q;
import X.C20367AHx;
import X.C21466AkX;
import X.C23871Hy;
import X.C30391dr;
import X.EEC;
import android.content.Context;

public abstract class CoroutineWorker extends C20001A2q {
    public final C113975oM A00;
    public final C18600wl A01;
    public final AnonymousClass1OD A02 = new AnonymousClass1OD((AnonymousClass1OB) null);

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5oM, java.lang.Object] */
    public final EEC A07() {
        AnonymousClass1OD r3 = new AnonymousClass1OD((AnonymousClass1OB) null);
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(AnonymousClass1OQ.A03(this.A01, r3));
        AJU aju = new AJU(new Object(), r3);
        AnonymousClass3MX.A1Q(new CoroutineWorker$getForegroundInfoAsync$1(this, aju, (C30391dr) null), A022);
        return aju;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0A(X.C30391dr r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof com.whatsapp.messaging.xmpp.XmppLogoutWorker
            if (r0 == 0) goto L_0x0064
            r3 = r7
            com.whatsapp.messaging.xmpp.XmppLogoutWorker r3 = (com.whatsapp.messaging.xmpp.XmppLogoutWorker) r3
            boolean r0 = r8 instanceof X.C21650Anf
            if (r0 == 0) goto L_0x0029
            r6 = r8
            X.Anf r6 = (X.C21650Anf) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r6.label = r2
        L_0x0019:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r4) goto L_0x002f
            java.lang.Object r3 = r6.L$0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker r3 = (com.whatsapp.messaging.xmpp.XmppLogoutWorker) r3
            goto L_0x0052
        L_0x0029:
            X.Anf r6 = new X.Anf
            r6.<init>(r3, r8)
            goto L_0x0019
        L_0x002f:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        L_0x0034:
            X.C30691eM.A01(r1)
            X.1dB r2 = r3.A02     // Catch:{ all -> 0x005d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005d }
            r2.A04 = r0     // Catch:{ all -> 0x005d }
            X.0wl r2 = r3.A03     // Catch:{ all -> 0x005d }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2     // Catch:{ all -> 0x005d }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x005d }
            r6.L$0 = r3     // Catch:{ all -> 0x005d }
            r6.label = r4     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = X.C30451dy.A00(r6, r2, r0)     // Catch:{ all -> 0x005d }
            if (r1 != r5) goto L_0x0055
            return r5
        L_0x0052:
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x005d }
        L_0x0055:
            X.9Lg r1 = (X.C180129Lg) r1     // Catch:{ all -> 0x005d }
            X.1dB r0 = r3.A02
            r0.A06()
            return r1
        L_0x005d:
            r1 = move-exception
            X.1dB r0 = r3.A02
            r0.A06()
            throw r1
        L_0x0064:
            r3 = r7
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r3 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r3
            boolean r0 = r8 instanceof X.C21648And
            if (r0 == 0) goto L_0x0089
            r6 = r8
            X.And r6 = (X.C21648And) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r6.label = r2
        L_0x0079:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0094
            if (r0 != r4) goto L_0x008f
            java.lang.Object r3 = r6.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r3 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r3
            goto L_0x00b2
        L_0x0089:
            X.And r6 = new X.And
            r6.<init>(r3, r8)
            goto L_0x0079
        L_0x008f:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
            throw r2
        L_0x0094:
            X.C30691eM.A01(r2)
            X.1dB r2 = r3.A06     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            r2.A03 = r0     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            X.0wl r2 = r3.A07     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            r0.<init>(r3, r1)     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            r6.L$0 = r3     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            r6.label = r4     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            java.lang.Object r2 = X.C30451dy.A00(r6, r2, r0)     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            if (r2 != r5) goto L_0x00b5
            return r5
        L_0x00b2:
            X.C30691eM.A01(r2)     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
        L_0x00b5:
            X.9Lg r2 = (X.C180129Lg) r2     // Catch:{ CancellationException -> 0x00d6, Exception -> 0x00ce }
            X.195 r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A05
            r0 = 0
            r1.A03(r0)
        L_0x00c8:
            X.1dB r0 = r3.A06
            r0.A05()
            return r2
        L_0x00ce:
            r2 = move-exception
            r1 = 2
            X.1dB r0 = r3.A06     // Catch:{ all -> 0x00dd }
            r0.A07(r1)     // Catch:{ all -> 0x00dd }
            throw r2     // Catch:{ all -> 0x00dd }
        L_0x00d6:
            r1 = move-exception
            X.1dB r0 = r3.A06     // Catch:{ all -> 0x00dd }
            r0.A07(r4)     // Catch:{ all -> 0x00dd }
            throw r1     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r2 = move-exception
            X.195 r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A05
            r0 = 0
            r1.A03(r0)
        L_0x00ef:
            X.1dB r0 = r3.A06
            r0.A05()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.A0A(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5oM, java.lang.Object, X.DMs] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        ? obj = new Object();
        this.A00 = obj;
        obj.BBG(new C21466AkX((Object) this, 19), ((C20367AHx) this.A01.A06).A01);
        this.A01 = C23871Hy.A00;
    }
}
