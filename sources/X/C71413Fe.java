package X;

/* renamed from: X.3Fe  reason: invalid class name and case insensitive filesystem */
public final class C71413Fe extends AnonymousClass3F7 {
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ AnonymousClass1OS $this_createCoroutineUnintercepted$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71413Fe(Object obj, C30391dr r2, AnonymousClass1OS r3) {
        super(r2);
        this.$this_createCoroutineUnintercepted$inlined = r3;
        this.$receiver$inlined = obj;
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C30691eM.A01(obj);
            C18070vi.A0z(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            AnonymousClass1OS r1 = this.$this_createCoroutineUnintercepted$inlined;
            C41681wt.A04(r1, 2);
            return r1.invoke(this.$receiver$inlined, this);
        } else if (i == 1) {
            this.label = 2;
            C30691eM.A01(obj);
            return obj;
        } else {
            throw AnonymousClass000.A0n("This coroutine had already completed");
        }
    }
}
