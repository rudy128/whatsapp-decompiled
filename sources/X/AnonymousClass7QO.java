package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.7QO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C34531kd A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ C26551So A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        C34531kd r1 = this.A01;
        AnonymousClass1BI r0 = this.A02;
        File file = this.A05;
        C26551So r3 = this.A04;
        boolean z = this.A06;
        AnonymousClass206 r2 = this.A03;
        boolean z2 = this.A07;
        try {
            r1.A0B(r2, r3, (C692236j) null, file, (String) null, Collections.singletonList(r0), this.A00, false, z, z2);
        } catch (IOException e) {
            Log.e("SendMedia/checkSizeAndSend/e", e);
        }
    }

    public /* synthetic */ AnonymousClass7QO(C34531kd r1, AnonymousClass1BI r2, AnonymousClass206 r3, C26551So r4, File file, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = file;
        this.A04 = r4;
        this.A06 = z;
        this.A03 = r3;
        this.A07 = z2;
        this.A00 = i;
    }
}
