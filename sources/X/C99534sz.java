package X;

/* renamed from: X.4sz  reason: invalid class name and case insensitive filesystem */
public final class C99534sz implements AnonymousClass1G2 {
    public final Object A00;
    public final C18560wh A01;
    public final AnonymousClass1OS A02;

    /* JADX INFO: finally extract failed */
    public Object BJt(Object obj, C30391dr r7) {
        C18560wh r4 = this.A01;
        Object obj2 = this.A00;
        AnonymousClass1OS r3 = this.A02;
        Object A002 = C30631eG.A00(obj2, r4);
        try {
            C99284sZ r1 = new C99284sZ(r7, r4);
            C41681wt.A04(r3, 2);
            Object invoke = r3.invoke(obj, r1);
            C30631eG.A02(A002, r4);
            return AnonymousClass3MX.A13(invoke);
        } catch (Throwable th) {
            C30631eG.A02(A002, r4);
            throw th;
        }
    }

    public C99534sz(C18560wh r3, AnonymousClass1G2 r4) {
        this.A01 = r3;
        this.A00 = C30631eG.A01(r3);
        this.A02 = new AnonymousClass55U((C30391dr) null, r4);
    }
}
