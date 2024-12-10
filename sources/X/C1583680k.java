package X;

/* renamed from: X.80k  reason: invalid class name and case insensitive filesystem */
public final class C1583680k extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C128656gT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1583680k(C128656gT r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object invoke;
        C133636pE r3 = (C133636pE) obj;
        C18070vi.A0d(r3, 0);
        C135126rh A0C = r3.A01.A0C(1);
        if (A0C != null) {
            str = A0C.A00;
        } else {
            str = null;
        }
        AnonymousClass1JH r0 = (AnonymousClass1JH) this.this$0.A01.get(str);
        if (r0 != null && (invoke = ((C18090vk) r0).invoke()) != null) {
            return invoke;
        }
        String group = r3.A00.group();
        C18070vi.A0X(group);
        return group;
    }
}
