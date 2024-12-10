package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3IR  reason: invalid class name */
public final class AnonymousClass3IR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33131iK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IR(C33131iK r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C58902lR r6 = (C58902lR) obj;
        if (r6 != null) {
            SharedPreferences.Editor A0A = C17890vO.A0A(this.this$0.A03.A01);
            for (C59192lu r2 : r6.A00) {
                UserJid userJid = r2.A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(userJid.getRawString());
                A0A.putBoolean(AnonymousClass000.A0y("_biz_intent", A10), r2.A01);
            }
            A0A.apply();
        }
        return C27621Wu.A00;
    }
}
