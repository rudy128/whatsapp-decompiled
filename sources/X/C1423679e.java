package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.79e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1423679e implements AnonymousClass02j {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ C139346yg A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C22821Di A03;
    public final /* synthetic */ JSONObject A04;

    public final void Bkx(Object obj) {
        C139346yg r6 = this.A01;
        JSONObject jSONObject = this.A04;
        AnonymousClass1FY r4 = this.A00;
        UserJid userJid = this.A02;
        C22821Di r2 = this.A03;
        C005702m r8 = (C005702m) obj;
        C18070vi.A0d(r2, 4);
        if (r8 != null && r8.A00 == -1) {
            C139346yg.A00(r4, r6, userJid, r2, jSONObject);
        }
    }

    public /* synthetic */ C1423679e(AnonymousClass1FY r1, C139346yg r2, UserJid userJid, C22821Di r4, JSONObject jSONObject) {
        this.A01 = r2;
        this.A04 = jSONObject;
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = r4;
    }
}
