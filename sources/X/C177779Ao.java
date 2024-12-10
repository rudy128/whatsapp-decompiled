package X;

import android.content.Context;
import android.media.Ringtone;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.lang.ref.WeakReference;

/* renamed from: X.9Ao  reason: invalid class name and case insensitive filesystem */
public class C177779Ao extends A34 {
    public final WeakReference A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Ringtone ringtone = (Ringtone) obj;
        A7v a7v = ((AnonymousClass9X8) this.A01.get()).A00;
        CallInfo A0r = AnonymousClass8BR.A0r(a7v.A08);
        if (A0r != null && A0r.callState == CallState.RECEIVED_CALL && a7v.A02 != null) {
            Ringtone ringtone2 = a7v.A01;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            a7v.A01 = ringtone;
            if (ringtone != null) {
                try {
                    A7v.A03(a7v);
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    try {
                        a7v.A01.stop();
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                    }
                    a7v.A01 = null;
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/ringtone/no-ringtone found for ");
                A10.append(a7v.A02);
                C17890vO.A0w(A10);
            }
        }
    }

    public C177779Ao(Context context, AnonymousClass9X8 r3) {
        this.A01 = AnonymousClass3MW.A0z(r3);
        this.A00 = AnonymousClass3MW.A0z(context);
    }
}
