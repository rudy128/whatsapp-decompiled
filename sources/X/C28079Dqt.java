package X;

import android.os.Looper;

/* renamed from: X.Dqt  reason: case insensitive filesystem */
public final class C28079Dqt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C23736Boh $environment;
    public final /* synthetic */ C25233CbU $queryDef;
    public final /* synthetic */ C25957CpP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28079Dqt(C25957CpP cpP, C23736Boh boh, C25233CbU cbU) {
        super(1);
        this.this$0 = cpP;
        this.$queryDef = cbU;
        this.$environment = boh;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        C25957CpP cpP = this.this$0;
        C25233CbU cbU = this.$queryDef;
        C21368Aix aix = new C21368Aix(this.$environment, obj, cbU, cpP, 13);
        if (C18070vi.A18(Looper.getMainLooper(), Looper.myLooper())) {
            aix.run();
        } else {
            C25957CpP.A07.post(aix);
        }
        return C27621Wu.A00;
    }
}
