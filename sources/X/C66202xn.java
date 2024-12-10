package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.crash.upload.ExceptionsUploadService;

/* renamed from: X.2xn  reason: invalid class name and case insensitive filesystem */
public class C66202xn implements AnonymousClass191, AnonymousClass3LM {
    public boolean A00 = false;
    public final Context A01;
    public final C25081Mu A02;

    public void BlV() {
        this.A00 = true;
    }

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        Context context = this.A01;
        boolean z = this.A00;
        C25081Mu r3 = this.A02;
        Class<ExceptionsUploadService> cls = ExceptionsUploadService.class;
        Intent intent = new Intent(context, cls);
        intent.putExtra("app_version_changed", z);
        r3.A01(context, intent, cls, 1);
    }

    public C66202xn(Context context, C25081Mu r3) {
        this.A01 = context;
        this.A02 = r3;
    }

    public void Ba9() {
    }
}
