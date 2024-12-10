package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.75a  reason: invalid class name and case insensitive filesystem */
public final class C1412875a implements Handler.Callback {
    public C110125ey A00;
    public WebMessagePort A01;
    public final Context A02;
    public final Handler A03;
    public final UserJid A04;
    public final AnonymousClass1QS A05;
    public final Looper A06;
    public final AnonymousClass1LU A07;

    public boolean handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        if (message.what != 0) {
            return true;
        }
        A03(new C156667uj(message, this));
        return true;
    }

    public static final void A03(C18090vk r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("Api check failed");
        }
    }

    public C1412875a(Context context, Looper looper, AnonymousClass1LU r4, UserJid userJid, AnonymousClass1QS r6) {
        this.A02 = context;
        this.A06 = looper;
        this.A07 = r4;
        this.A04 = userJid;
        this.A05 = r6;
        this.A03 = new Handler(looper, this);
    }

    public static final void A02(C1412875a r4, Object obj, JSONObject jSONObject) {
        Object obj2;
        JSONObject put = C17880vN.A15().put("responseData", C17880vN.A15().put("result", obj));
        Object obj3 = null;
        if (jSONObject != null) {
            obj2 = jSONObject.get("method");
        } else {
            obj2 = null;
        }
        JSONObject put2 = put.put("method", obj2);
        if (jSONObject != null) {
            obj3 = jSONObject.get("callbackID");
        }
        A03(new C156657ui(r4, put2.put("callbackID", obj3)));
    }
}
