package X;

import android.content.Intent;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7N7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7N7 implements AnonymousClass3LO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C115095tO A02;

    public final void BuX(File file) {
        C26551So r7;
        C115095tO r2 = this.A02;
        Intent intent = this.A01;
        int i = this.A00;
        try {
            C34531kd r4 = r2.A0C;
            AnonymousClass1BI r5 = r2.A0S;
            if (C22971Dz.A0V(r5)) {
                r7 = C26551So.A0S;
            } else {
                r7 = C26551So.A05;
            }
            boolean booleanExtra = intent.getBooleanExtra("has_preview", true);
            AnonymousClass8A7 r1 = r2.A0I;
            r4.A0G.CGF(new AnonymousClass7QO(r4, r5, r1.getQuotedMessage(), r7, file, i, booleanExtra, r2.A0g));
            r1.BCn();
        } catch (IOException e) {
            r2.A09.A08(2131896086, 0);
            Log.e((Throwable) e);
        }
    }

    public /* synthetic */ AnonymousClass7N7(Intent intent, C115095tO r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }
}
