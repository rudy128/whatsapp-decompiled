package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* renamed from: X.AOg  reason: case insensitive filesystem */
public final class C20521AOg implements B7Y {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C190959ln A02;
    public final /* synthetic */ A6L A03;

    public C20521AOg(Activity activity, Context context, C190959ln r3, A6L a6l) {
        this.A02 = r3;
        this.A03 = a6l;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void C3p(boolean z) {
        if (!z) {
            this.A02.A00(AnonymousClass00R.A01);
            return;
        }
        A6L a6l = this.A03;
        File A0a = ((C218617r) a6l.A0Q.get()).A0a(AnonymousClass000.A0y(".jpg", C17900vP.A0G()));
        Context context = this.A01;
        C190959ln r5 = this.A02;
        Activity activity = this.A00;
        try {
            Uri A022 = C64062u9.A02(context, A0a);
            Intent A0G = C108945cZ.A0G("android.media.action.IMAGE_CAPTURE");
            A0G.putExtra("output", A022);
            C184059aL r3 = new C184059aL(r5, A0a);
            if (!(activity instanceof AnonymousClass1FY)) {
                C190959ln r2 = r3.A00;
                File file = r3.A01;
                r2.A00(AnonymousClass00R.A0N);
                file.delete();
                return;
            }
            AnonymousClass1FY r4 = (AnonymousClass1FY) activity;
            r4.A4P(new AM1(r4, r3, a6l, 1));
            r4.startActivityForResult(A0G, 1);
        } catch (IOException unused) {
            r5.A00(AnonymousClass00R.A0N);
            A0a.delete();
        }
    }
}
