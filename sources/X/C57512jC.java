package X;

/* renamed from: X.2jC  reason: invalid class name and case insensitive filesystem */
public class C57512jC {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;
    public final C18100vl A02;

    public C57512jC(AnonymousClass190 r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0o(r4, r3, r5);
        this.A00 = r3;
        this.A01 = r5;
        this.A02 = new C18110vm(new AnonymousClass3HO(r4));
    }

    public final AnonymousClass206 A00(AnonymousClass206 r8, AnonymousClass205 r9) {
        boolean A16 = C18070vi.A16(r8, r9);
        int i = r8.A0u;
        AnonymousClass20A A002 = ((AnonymousClass20Z) this.A02.getValue()).A00(i);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.fmessage.cloning.FMessageCloningIntegrationPoint<T of com.whatsapp.fmessage.cloning.FMessageCloningSubsystem.cloneUsingFMessagePlatform>");
        AnonymousClass206 BF7 = ((C436620k) A002).BF7(r8, r9, r8.A0I);
        for (C72193Kz C17 : (Iterable) C18070vi.A0E(this.A01)) {
            C17.C17(r8, BF7);
        }
        Class<?> cls = r8.getClass();
        Class<?> cls2 = BF7.getClass();
        if (cls != cls2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("type=");
            A10.append(i);
            A10.append(", original-class=");
            A10.append(cls.getSimpleName());
            A10.append(", cloned-class=");
            this.A00.A0G("fmessage-clone-class-mismatch", AnonymousClass000.A0y(cls2.getSimpleName(), A10), A16);
        }
        return BF7;
    }
}
