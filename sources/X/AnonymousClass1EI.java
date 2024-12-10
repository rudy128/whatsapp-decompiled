package X;

import android.os.Process;
import com.whatsapp.util.Log;

/* renamed from: X.1EI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1EI implements Runnable {
    public final /* synthetic */ AnonymousClass1CJ A00;
    public final /* synthetic */ AnonymousClass1DR A01;
    public final /* synthetic */ AnonymousClass1CI A02;
    public final /* synthetic */ AnonymousClass00H A03;
    public final /* synthetic */ AnonymousClass00H A04;

    public final void run() {
        AnonymousClass1CI r3 = this.A02;
        AnonymousClass00H r1 = this.A03;
        AnonymousClass1DR r5 = this.A01;
        AnonymousClass1CJ r4 = this.A00;
        AnonymousClass00H r2 = this.A04;
        Process.setThreadPriority(-8);
        boolean A09 = ((C22611Cn) r1.get()).A00.A09(r5, false);
        AnonymousClass1CJ.A01(r4);
        if (A09) {
            Log.i("app-init/main/msgstoredb/healthy");
            C219017v r42 = (C219017v) r2.get();
            if (C18020vd.A05(C18040vf.A02, r42.A0S, 9606)) {
                ((AnonymousClass11A) r42.A0f.get()).A00(new C70583Br(r42, 42));
            } else {
                r42.A07();
            }
        }
        C18030ve r22 = r3.A08;
        if (C18020vd.A05(C18040vf.A02, r22, 12809)) {
            ((AnonymousClass1Nb) r3.A0J.get()).A0f();
        }
        if (C18020vd.A05(C18040vf.A01, r22, 12901)) {
            r3.A03.A03();
        }
        Process.setThreadPriority(0);
    }

    public /* synthetic */ AnonymousClass1EI(AnonymousClass1CJ r1, AnonymousClass1DR r2, AnonymousClass1CI r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
    }
}
