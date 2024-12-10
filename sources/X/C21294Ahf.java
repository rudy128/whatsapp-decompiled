package X;

/* renamed from: X.Ahf  reason: case insensitive filesystem */
public final class C21294Ahf implements BCJ {
    public final /* synthetic */ C20998Acq A00;

    public C21294Ahf(C20998Acq acq) {
        this.A00 = acq;
    }

    public void Bc5(AnonymousClass9FP r3) {
        C20998Acq.A00(this.A00, new C172868u9(r3));
    }

    public void Bc7(AnonymousClass9FG r3) {
        C20998Acq.A00(this.A00, new C172878uA(r3));
    }

    public void Bc8(AnonymousClass9FA r7) {
        Object obj;
        Throwable A002;
        Throwable r1;
        C20998Acq acq = this.A00;
        C29621ca A03 = r7.A03();
        C192659ol r4 = acq.A02;
        AIj aIj = (AIj) acq.A00.A00;
        Class cls = aIj.A01;
        C18070vi.A0z(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.infra.graphql.MexIqHandler>");
        Object A01 = r4.A01(A03, cls, aIj.A02);
        if (A01 instanceof AnonymousClass1IU) {
            A002 = C30671eK.A00(A01);
            if (!(A002 instanceof C172848u7)) {
                r1 = new C172928uF("Unknown parsing failure while processing response", A002);
            }
            C20998Acq.A00(acq, (AnonymousClass1O9) A002);
        }
        try {
            C33051iB r0 = acq.A01;
            C30691eM.A01(A01);
            r0.C3V((C172768tz) A01);
            obj = C27621Wu.A00;
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        A002 = C30671eK.A00(obj);
        if (A002 != null) {
            if (!(A002 instanceof C172818u4)) {
                r1 = new C172958uI("Unknown product failure while processing response", A002);
            }
            C20998Acq.A00(acq, (AnonymousClass1O9) A002);
        }
        return;
        A002 = r1;
        C20998Acq.A00(acq, (AnonymousClass1O9) A002);
    }
}
