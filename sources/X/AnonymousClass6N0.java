package X;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.6N0  reason: invalid class name */
public class AnonymousClass6N0 extends AnonymousClass7B0 implements AnonymousClass1TI {
    public final C128806gi A00;
    public final AnonymousClass34B A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6N0(android.content.Context r2, X.AnonymousClass34B r3, X.C128806gi r4) {
        /*
            r1 = this;
            X.1TJ r0 = r3.A0B
            java.lang.Object r0 = r0.A00()
            X.2ex r0 = (X.C54942ex) r0
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0010:
            r1.<init>(r2, r0)
            r1.A01 = r3
            r1.A00 = r4
            return
        L_0x0018:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N0.<init>(android.content.Context, X.34B, X.6gi):void");
    }

    public long CAj(C26115Csd csd) {
        this.A01.A0B.A03(this, (Executor) null);
        return super.CAj(csd);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        File file = ((C54942ex) obj).A01;
        Uri fromFile = Uri.fromFile(file);
        synchronized (this.A04) {
            if (!fromFile.equals(this.A01)) {
                this.A01 = fromFile;
                this.A02 = true;
            }
        }
        C128806gi r5 = this.A00;
        if (r5 != null) {
            if (!(r5.A01 == null || r5.A00 == file.length())) {
                AnonymousClass7RJ.A00(r5.A02, r5, 33);
            }
            r5.A00 = file.length();
        }
    }

    public void close() {
        this.A01.A0B.A02(this);
        super.close();
    }
}
