package X;

/* renamed from: X.3F7  reason: invalid class name */
public abstract class AnonymousClass3F7 extends C30411dt {
    public AnonymousClass3F7(C30391dr r3) {
        super(r3);
        if (r3 != null && r3.getContext() != AnonymousClass1OR.A00) {
            throw AnonymousClass000.A0k("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public C18560wh getContext() {
        return AnonymousClass1OR.A00;
    }
}
