package X;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
public final class C06230Xm implements C17060tg {
    public static final C06230Xm A00 = new Object();

    public C18090vk Bdh(AnonymousClass05G r4) {
        if (r4.isAttachedToWindow()) {
            AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(r4);
            if (A002 != null) {
                return AnonymousClass0LQ.A00(r4, A002.getLifecycle());
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("View tree for ");
            A10.append(r4);
            throw AnonymousClass000.A0o(" has no ViewTreeLifecycleOwner", A10);
        }
        C98494rF r2 = new C98494rF();
        AnonymousClass0RZ r1 = new AnonymousClass0RZ(r4, r2, 0);
        r4.addOnAttachStateChangeListener(r1);
        r2.element = new C08360ey(r4, r1);
        return new C08580fK(r2);
    }
}
