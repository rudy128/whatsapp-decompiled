package X;

import android.content.Context;
import java.util.Iterator;

public class DEJ implements EDF {
    public C25515ChD A00;
    public final C22890BUb A01;
    public final CPX A02;
    public final CZ2 A03;
    public final boolean A04;
    public final Context A05;
    public final C25511Ch9 A06;
    public volatile int A07 = 0;

    public static synchronized void A00(DEJ dej) {
        synchronized (dej) {
            dej.A01();
            if (dej.A07 == 1) {
                C22890BUb bUb = dej.A01;
                bUb.Bd6();
                bUb.BdF();
                dej.A07 = 2;
            }
        }
    }

    public synchronized void A01() {
        int i;
        if (this.A07 == 0) {
            CPX cpx = this.A02;
            C22890BUb bUb = this.A01;
            if (!cpx.A00) {
                cpx.A00 = true;
                for (C28552E7c Bhc : cpx.A02) {
                    Bhc.Bhc(this, new C25054CVi(bUb, cpx));
                }
                int i2 = 0;
                do {
                    i = i2;
                    i2++;
                } while (i < r4);
                for (int i3 = 0; i3 < r4; i3++) {
                }
                for (int i4 = 0; i4 < r4; i4++) {
                }
            }
            this.A07 = 1;
        }
    }

    public EDK BP7(C22892BUd bUd) {
        synchronized (this) {
            if (this.A07 == 0) {
                if (this.A04) {
                    A00(this);
                } else {
                    A01();
                }
            }
        }
        E9j e9j = (E9j) this.A02.A01.get(bUd);
        if (e9j != null) {
            return (EDK) e9j;
        }
        throw AnonymousClass000.A0k("Component not available. Did you add specify the dependency or the plugin configuration?");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.A07 == 4) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A07     // Catch:{ all -> 0x0046 }
            r0 = 3
            if (r1 == r0) goto L_0x000c
            int r2 = r3.A07     // Catch:{ all -> 0x0046 }
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r1 = 2
            if (r0 == 0) goto L_0x0017
            r3.A07 = r1     // Catch:{ all -> 0x0046 }
            X.BUb r0 = r3.A01     // Catch:{ all -> 0x0046 }
            r0.BIn()     // Catch:{ all -> 0x0046 }
        L_0x0017:
            int r0 = r3.A07     // Catch:{ all -> 0x0046 }
            if (r0 != r1) goto L_0x0023
            r0 = 1
            r3.A07 = r0     // Catch:{ all -> 0x0046 }
            X.BUb r0 = r3.A01     // Catch:{ all -> 0x0046 }
            r0.release()     // Catch:{ all -> 0x0046 }
        L_0x0023:
            boolean r0 = r3.A04     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            int r1 = r3.A07     // Catch:{ all -> 0x0046 }
            r0 = 1
            if (r1 != r0) goto L_0x0044
            r0 = 0
            r3.A07 = r0     // Catch:{ all -> 0x0046 }
            X.CPX r1 = r3.A02     // Catch:{ all -> 0x0046 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003d
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0046 }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0046 }
            r0.clear()     // Catch:{ all -> 0x0046 }
        L_0x003d:
            X.BUb r0 = r3.A01     // Catch:{ all -> 0x0046 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0046 }
            r0.clear()     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEJ.release():void");
    }

    public E4f BP8(C9Z c9z) {
        return this.A03.A00(c9z);
    }

    public Object BPA(C25313CdJ cdJ) {
        return this.A06.A00.get(cdJ);
    }

    public boolean BeL(C22892BUd bUd) {
        return this.A02.A01.containsKey(bUd);
    }

    public boolean BeM(C9Z c9z) {
        return this.A03.A02.containsKey(c9z);
    }

    public Context getContext() {
        return this.A05;
    }

    public DEJ(Context context, C25511Ch9 ch9, C28552E7c[] e7cArr) {
        boolean z = false;
        this.A05 = context.getApplicationContext();
        this.A01 = new C22890BUb();
        this.A06 = ch9;
        Boolean bool = (Boolean) ch9.A00.get(EDF.A00);
        this.A04 = bool != null ? bool.booleanValue() : z;
        this.A02 = new CPX(e7cArr);
        CZ2 cz2 = new CZ2(e7cArr);
        this.A03 = cz2;
        if (!cz2.A00) {
            cz2.A00 = true;
            for (C28552E7c Bhd : cz2.A04) {
                Bhd.Bhd(this, cz2);
            }
            Iterator it = cz2.A01.iterator();
            while (it.hasNext()) {
                DEE dee = (DEE) ((E4f) it.next());
                if (!dee.A01) {
                    dee.A01 = true;
                }
            }
            cz2.A00(EDJ.A00);
        }
    }
}
