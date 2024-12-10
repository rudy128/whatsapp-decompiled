package X;

/* renamed from: X.2VI  reason: invalid class name */
public abstract class AnonymousClass2VI {
    public static final Object A00(C30391dr r8) {
        Object obj;
        Object obj2;
        C30611eE r82;
        C18560wh context = r8.getContext();
        C30551e8.A05(context);
        C30391dr A02 = C30581eB.A02(r8);
        if (!(A02 instanceof C30611eE) || (r82 = (C30611eE) A02) == null) {
            obj = C27621Wu.A00;
            obj2 = obj;
        } else {
            C18600wl r3 = r82.A03;
            if (r3.A0C(context)) {
                obj2 = C27621Wu.A00;
                r82.A00 = obj2;
                r82.A00 = 1;
                r3.A0B(r82, context);
            } else {
                AnonymousClass3F4 r2 = new AnonymousClass3F4();
                C18560wh plus = context.plus(r2);
                obj2 = C27621Wu.A00;
                r82.A00 = obj2;
                r82.A00 = 1;
                r3.A0B(r82, plus);
                if (r2.A00) {
                    AnonymousClass1IJ A00 = C37591po.A00();
                    AnonymousClass1JD r0 = A00.A01;
                    if (r0 != null && !r0.isEmpty()) {
                        long j = A00.A00;
                        boolean z = true;
                        if (j < 4294967296L) {
                            z = false;
                        }
                        if (z) {
                            r82.A00 = obj2;
                            r82.A00 = 1;
                            A00.A0G(r82);
                        } else {
                            A00.A00 = j + 4294967296L;
                            try {
                                r82.run();
                                do {
                                } while (A00.A0I());
                            } catch (Throwable th) {
                                A00.A0H(true);
                                throw th;
                            }
                            A00.A0H(true);
                        }
                    }
                    obj = obj2;
                }
            }
            obj = C31751g4.COROUTINE_SUSPENDED;
        }
        if (obj == C31751g4.COROUTINE_SUSPENDED) {
            return obj;
        }
        return obj2;
    }
}
