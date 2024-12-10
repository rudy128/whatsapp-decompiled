package X;

/* renamed from: X.5Ao  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5Ao extends AnonymousClass1JJ implements C36001nB {
    public static final AnonymousClass5Ao A00 = new AnonymousClass5Ao();

    public AnonymousClass5Ao() {
        super(3, AnonymousClass4M6.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass4M6 r7 = (AnonymousClass4M6) obj;
        C27175DXk dXk = (C27175DXk) obj2;
        long j = r7.A00;
        if (j <= 0) {
            dXk.A01 = C27621Wu.A00;
        } else {
            C21357Aim aim = new C21357Aim(r7, dXk, 10);
            C18070vi.A0z(dXk, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C18560wh r1 = dXk.A04;
            dXk.A00 = C62882s9.A02(r1).Bdz(aim, r1, j);
        }
        return C27621Wu.A00;
    }
}
