package X;

/* renamed from: X.Am0  reason: case insensitive filesystem */
public final /* synthetic */ class C21553Am0 implements C22841Dk, B77 {
    public final /* synthetic */ C30391dr A00;

    public C21553Am0(C30391dr r1) {
        this.A00 = r1;
    }

    public final C18080vj BS6() {
        return new AnonymousClass1JJ(1, this.A00, C180469Mr.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public final int hashCode() {
        return BS6().hashCode();
    }

    public final void Bmx(AEW aew) {
        this.A00.resumeWith(aew);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B77) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, BS6());
    }
}
