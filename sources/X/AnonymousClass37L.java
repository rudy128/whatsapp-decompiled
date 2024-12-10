package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.37L  reason: invalid class name */
public class AnonymousClass37L implements C35341m5 {
    public final AnonymousClass3LB A00;
    public final AnonymousClass11P A01;

    public void A02(DeviceJid[] deviceJidArr, int i) {
        String[] strArr;
        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-error");
        AnonymousClass3LB r3 = this.A00;
        Bundle A0D = C17880vN.A0D();
        if (!A0D.containsKey("jids")) {
            if (deviceJidArr != null) {
                strArr = C22971Dz.A0j(Arrays.asList(deviceJidArr));
            } else {
                strArr = null;
            }
            A0D.putStringArray("jids", strArr);
            A0D.putInt("errorCode", i);
            C17890vO.A0o(r3, A0D, 76);
            return;
        }
        throw AnonymousClass001.A12(" already used", AnonymousClass000.A11("jids"));
    }

    public AnonymousClass37L(AnonymousClass11P r1, AnonymousClass3LB r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public static void A00(int i) {
        C17900vP.A0j("ConnectionThreadRequestsImpl/on-qr-sync-error ", AnonymousClass000.A10(), i);
    }

    public void A01(C29621ca r7, Long l, int i) {
        C17900vP.A0j("ConnectionThreadRequestsImpl/on-xmpp-recv type=", AnonymousClass000.A10(), i);
        AnonymousClass3LB r5 = this.A00;
        Message obtain = Message.obtain((Handler) null, 0, i, 0, r7);
        if (l != null) {
            obtain.getData().putLong("loggableStanzaId", l.longValue());
        }
        r5.CAe(obtain);
    }

    public void ByO(C63362sw r6, Map map) {
        Object A002;
        long currentTimeMillis = System.currentTimeMillis() - r6.A0X;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConnectionThreadRequestsImpl/message remote=");
        A10.append(r6.A0Z);
        A10.append(" id=");
        A10.append(r6.A0h);
        A10.append(" participant=");
        Jid jid = r6.A0Y;
        if (C22971Dz.A00(jid) == null) {
            A002 = "none";
        } else {
            A002 = C22971Dz.A00(jid);
        }
        A10.append(A002);
        A10.append(" delay=");
        A10.append(currentTimeMillis);
        A10.append(" offline=");
        A10.append(r6.A0G);
        A10.append(" edit=");
        C17900vP.A0o(A10, r6.A01);
        this.A00.CAe(Message.obtain((Handler) null, 0, 0, 0, new C53562cj(r6, map)));
    }
}
