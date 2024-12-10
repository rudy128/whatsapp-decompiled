package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8Cr  reason: invalid class name and case insensitive filesystem */
public final class C161318Cr extends ResultReceiver {
    public final /* synthetic */ C22458B8q A00;
    public final /* synthetic */ AZG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161318Cr(Handler handler, C22458B8q b8q, AZG azg) {
        super(handler);
        this.A00 = b8q;
        this.A01 = azg;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 2) {
            try {
                JSONObject A15 = C17880vN.A15();
                JSONObject A152 = C17880vN.A15();
                try {
                    this.A00.C2e(i, bundle);
                    A15.put("status", "0");
                    A152.put("data", A15);
                } catch (JSONException unused) {
                    Log.e("onReceiveResult JSONException");
                }
                C187079fE r3 = ((A0F) this.A01.A02.get()).A00;
                if (r3 != null) {
                    String obj = A152.toString();
                    android.util.Log.d(C187079fE.class.getName(), "Common Library Callback Called");
                    try {
                        r3.A03.BKn(obj);
                    } catch (RemoteException unused2) {
                        android.util.Log.e("CLServices", "Remote Exception in Common Library Callback");
                    }
                }
            } catch (Exception unused3) {
                Log.e("onReceiveResult java.lang.Exception");
            }
        } else {
            this.A00.C2e(i, bundle);
        }
    }
}
