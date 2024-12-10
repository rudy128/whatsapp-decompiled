package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.AzI  reason: case insensitive filesystem */
public final class C22202AzI extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C192869p7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22202AzI(C192869p7 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        Log.i("RecaptchaClientHandler/execute succeeded!");
        C19830z4 r7 = this.this$0.A07;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        C17960vV.A0F(AnonymousClass000.A1W(str), "Attempt to store null recaptcha token");
        if (elapsedRealtime <= 0) {
            z = false;
        }
        C17960vV.A0F(z, "Attempt to store invalid token time fetched");
        C17880vN.A1E(C19830z4.A00(r7), "less_beep_beep_identi", str);
        C17880vN.A1D(C19830z4.A00(r7), "less_beep_beep_time", elapsedRealtime);
        C192869p7 r1 = this.this$0;
        r1.A02 = AnonymousClass9IK.FETCH_SUCCEEDED;
        AnonymousClass8BR.A0W(r1.A09).A01("RECAPTCHA_EXECUTE_", "SUCCESS");
        return C27621Wu.A00;
    }
}
