package X;

import com.whatsapp.util.Log;

/* renamed from: X.1RE  reason: invalid class name */
public class AnonymousClass1RE {
    public AnonymousClass1RF A00 = new AnonymousClass1RF();
    public Runnable A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass1RD A04;
    public final AnonymousClass1RC A05;
    public final AnonymousClass10I A06;

    public synchronized void A02(boolean z) {
        AnonymousClass1RF r1 = this.A00;
        if (!AnonymousClass1RF.A01(r1) && AnonymousClass1RF.A00(r1.A00, z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/onAppStateSyncComplete isSuccess=");
            sb.append(z);
            Log.i(sb.toString());
            this.A04.notifyAllObservers(new AnonymousClass7KX(20));
            A00(this);
        }
    }

    public static void A00(AnonymousClass1RE r5) {
        C23691Hg r1;
        AnonymousClass1RF r2 = r5.A00;
        if (AnonymousClass1RF.A03(r2)) {
            boolean A022 = AnonymousClass1RF.A02(r2);
            boolean z = r2.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/handleCompleted isSuccess=");
            sb.append(A022);
            sb.append(", hasTimedOut=");
            sb.append(z);
            Log.i(sb.toString());
            synchronized (r5) {
                Runnable runnable = r5.A01;
                if (runnable != null) {
                    r5.A06.CEz(runnable);
                    r5.A01 = null;
                }
                AnonymousClass11U r12 = r2.A01;
                synchronized (r12) {
                    r12.A00 = 1;
                }
                AnonymousClass11U r13 = r2.A00;
                synchronized (r13) {
                    r13.A00 = 1;
                }
                r2.A02 = false;
            }
            AnonymousClass1RD r22 = r5.A04;
            if (A022) {
                r1 = new AnonymousClass7KX(18);
            } else {
                r1 = new AnonymousClass7KP(z, 1);
            }
            r22.notifyAllObservers(r1);
        }
    }

    public void A01(boolean z) {
        AnonymousClass1RF r1 = this.A00;
        if (!AnonymousClass1RF.A01(r1) && AnonymousClass1RF.A00(r1.A01, z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/onHistorySyncComplete isSuccess=");
            sb.append(z);
            Log.i(sb.toString());
            this.A04.notifyAllObservers(new AnonymousClass7KX(19));
            A00(this);
        }
    }

    public AnonymousClass1RE(AnonymousClass11S r2, AnonymousClass18O r3, AnonymousClass1RD r4, AnonymousClass1RC r5, AnonymousClass10I r6) {
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }
}
