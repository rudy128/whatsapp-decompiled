package X;

import android.content.Context;
import android.os.Handler;

public final class BUF extends C22891BUc implements C28661ECy {
    public int A00;
    public int A01;
    public Handler A02;
    public final Context A03;
    public final C25132CZh A04 = new C25132CZh();
    public final C18100vl A05;
    public final C18100vl A06;

    public static final void A00(BUF buf, C18090vk r4) {
        Handler handler = buf.A02;
        if (handler == null) {
            C9Z c9z = EDI.A00;
            C28592E9h e9h = buf.A00;
            if (e9h.BeM(c9z)) {
                buf.A02 = ((EDI) e9h.BP8(c9z)).BSH("Lite-Controller-Thread");
            }
            handler = buf.A02;
            if (handler == null) {
                r4.invoke();
                return;
            }
        }
        handler.post(new C21466AkX(r4, 49));
    }

    public C22892BUd BTg() {
        C22892BUd bUd = C28661ECy.A00;
        C18070vi.A0Z(bUd);
        return bUd;
    }

    public BUF(C28592E9h e9h) {
        super(e9h);
        Context context = e9h.getContext();
        C18070vi.A0X(context);
        this.A03 = context;
        Integer num = AnonymousClass00R.A0C;
        this.A05 = AnonymousClass1DF.A00(num, new C27490DgJ(this));
        this.A06 = AnonymousClass1DF.A00(num, new C27491DgK(this));
    }
}
