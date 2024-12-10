package com.whatsapp.messaging.xmpp;

import X.A1B;
import X.A7W;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass19K;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.C162248Jv;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C18600wl;
import X.C196269uj;
import X.C201511a;
import X.C29921d6;
import X.C29931d7;
import X.C29941d8;
import X.C30391dr;
import X.C30451dy;
import android.os.Build;
import android.os.Handler;

public final class XmppConnectionMetricsWorkManager implements C201511a {
    public final C18030ve A00;
    public final AnonymousClass19K A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = new C18110vm(new C29921d6(this));
    public final C18100vl A05 = new C18110vm(new C29931d7(this));
    public final C18100vl A06 = new C18110vm(new C29941d8(this));
    public final C18600wl A07;
    public volatile AnonymousClass1OB A08;

    public XmppConnectionMetricsWorkManager(C18030ve r3, AnonymousClass19K r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r7, 5);
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A00 = r3;
        this.A07 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.A7W r6, com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r7, java.lang.String r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.AnonymousClass3FC
            if (r0 == 0) goto L_0x006a
            r5 = r9
            X.3FC r5 = (X.AnonymousClass3FC) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r1) goto L_0x0070
            X.C30691eM.A01(r2)
        L_0x0020:
            X.C18070vi.A0a(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = X.C29431cG.A0c(r2)
            return r0
        L_0x002a:
            X.C30691eM.A01(r2)
            X.5oM r3 = r6.A04(r8)
            X.C18070vi.A0X(r3)
            r5.label = r1
            boolean r0 = r3.isDone()     // Catch:{ ExecutionException -> 0x0078 }
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = X.C181049Oy.A00(r3)     // Catch:{ ExecutionException -> 0x0078 }
            goto L_0x0067
        L_0x0041:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C31781g7.A02
            X.1dr r0 = X.C30581eB.A02(r5)
            X.1g7 r2 = new X.1g7
            r2.<init>(r1, r0)
            r2.A0F()
            r0 = 8
            X.Aim r1 = new X.Aim
            r1.<init>(r3, r2, r0)
            X.C1A r0 = X.C1A.A01
            r3.BBG(r1, r0)
            X.3IX r0 = new X.3IX
            r0.<init>(r3)
            r2.Bdu(r0)
            java.lang.Object r2 = r2.A0C()
        L_0x0067:
            if (r2 != r4) goto L_0x0020
            return r4
        L_0x006a:
            X.3FC r5 = new X.3FC
            r5.<init>(r7, r9)
            goto L_0x0012
        L_0x0070:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            X.C18070vi.A0b(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager.A00(X.A7W, com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager, java.lang.String, X.1dr):java.lang.Object");
    }

    public static final void A01(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager) {
        C196269uj r2 = new C196269uj(XmppLogoutWorker.class);
        if (Build.VERSION.SDK_INT >= 31) {
            r2.A05(AnonymousClass00R.A00);
        }
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        r2.A03(a1b.A01());
        ((A7W) xmppConnectionMetricsWorkManager.A01.get()).A07((C162248Jv) r2.A00(), AnonymousClass00R.A00, "xmpp-logout-worker");
    }

    public void A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C196269uj r1 = new C196269uj(XmppLifecycleWorker.class);
            if (i >= 31) {
                r1.A05(AnonymousClass00R.A00);
            }
            A1B a1b = new A1B();
            Integer num = AnonymousClass00R.A01;
            a1b.A00 = num;
            r1.A03(a1b.A01());
            ((A7W) this.A01.get()).A07((C162248Jv) r1.A00(), num, "xmpp-lifecycle-worker");
        }
    }

    public void A03(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C18030ve r2 = this.A00;
            if (!C18020vd.A05(C18040vf.A01, r2, 3531)) {
                return;
            }
            if (C18020vd.A05(C18040vf.A02, r2, 7777)) {
                C18100vl r1 = this.A05;
                ((Handler) r1.getValue()).removeMessages(1);
                ((Handler) r1.getValue()).sendEmptyMessageDelayed(1, ((long) ((Number) this.A06.getValue()).intValue()) * 1000);
            } else if (!z) {
                A01(this);
            } else if (this.A08 == null) {
                XmppConnectionMetricsWorkManager$startLogoutWork$1 xmppConnectionMetricsWorkManager$startLogoutWork$1 = new XmppConnectionMetricsWorkManager$startLogoutWork$1(this, (C30391dr) null);
                AnonymousClass1OR r12 = AnonymousClass1OR.A00;
                this.A08 = C30451dy.A02(AnonymousClass00R.A00, r12, xmppConnectionMetricsWorkManager$startLogoutWork$1, (AnonymousClass1OX) this.A04.getValue());
            }
        }
    }
}
