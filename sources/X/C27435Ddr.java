package X;

/* renamed from: X.Ddr  reason: case insensitive filesystem */
public final class C27435Ddr extends C30421du implements AnonymousClass1G2, C30401ds {
    public final C18560wh collectContext;
    public final int collectContextSize;
    public final AnonymousClass1G2 collector;
    public C30391dr completion_;
    public C18560wh lastEmissionContext;

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public C27435Ddr(C18560wh r3, AnonymousClass1G2 r4) {
        super(C27154DWp.A00, AnonymousClass1OR.A00);
        this.collector = r4;
        this.collectContext = r3;
        this.collectContextSize = AnonymousClass000.A0M(r3.fold(AnonymousClass3MY.A0f(), C28222Dte.A00));
    }

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.completion_;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public C18560wh getContext() {
        C18560wh r0 = this.lastEmissionContext;
        if (r0 == null) {
            return AnonymousClass1OR.A00;
        }
        return r0;
    }

    public Object BJt(Object obj, C30391dr r6) {
        IllegalStateException A0o;
        try {
            C18560wh context = r6.getContext();
            C30551e8.A05(context);
            C18560wh r2 = this.lastEmissionContext;
            if (r2 != context) {
                if (r2 instanceof C27155DWq) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    A10.append(((C27155DWq) r2).A00);
                    A10.append(", but then emission attempt of value '");
                    A10.append(obj);
                    A0o = AnonymousClass000.A0n(AnonymousClass1Y7.A01(AnonymousClass000.A0y("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ", A10)));
                } else if (AnonymousClass000.A0M(context.fold(AnonymousClass3MY.A0f(), new DsX(this))) == this.collectContextSize) {
                    this.lastEmissionContext = context;
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    A102.append(this.collectContext);
                    A102.append(",\n\t\tbut emission happened in ");
                    A102.append(context);
                    A0o = AnonymousClass000.A0o(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead", A102);
                }
                throw A0o;
            }
            this.completion_ = r6;
            C36001nB r22 = CGS.A00;
            AnonymousClass1G2 r1 = this.collector;
            C18070vi.A0z(r1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object invoke = r22.invoke(r1, obj, this);
            C31751g4 r12 = C31751g4.COROUTINE_SUSPENDED;
            if (!C18070vi.A18(invoke, r12)) {
                this.completion_ = null;
            }
            if (invoke != r12) {
                return C27621Wu.A00;
            }
            return invoke;
        } catch (Throwable th) {
            this.lastEmissionContext = new C27155DWq(r6.getContext(), th);
            throw th;
        }
    }

    public Object invokeSuspend(Object obj) {
        Throwable A00 = C30671eK.A00(obj);
        if (A00 != null) {
            C18560wh r1 = this.lastEmissionContext;
            if (r1 == null) {
                r1 = AnonymousClass1OR.A00;
            }
            this.lastEmissionContext = new C27155DWq(r1, A00);
        }
        C30391dr r0 = this.completion_;
        if (r0 != null) {
            r0.resumeWith(obj);
        }
        return C31751g4.COROUTINE_SUSPENDED;
    }
}
