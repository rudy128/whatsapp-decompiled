package X;

import android.view.View;

/* renamed from: X.0gc  reason: invalid class name and case insensitive filesystem */
public final class C09380gc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C05230Ra $listener;
    public final /* synthetic */ C1593084a $poolingContainerListener;
    public final /* synthetic */ AnonymousClass05G $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09380gc(AnonymousClass05G r2, C1593084a r3, C05230Ra r4) {
        super(0);
        this.$view = r2;
        this.$listener = r4;
        this.$poolingContainerListener = r3;
    }

    public static final void A00(View view, C1593084a r3) {
        C18070vi.A0d(view, 0);
        C18070vi.A0d(r3, 1);
        AnonymousClass6Z9 r0 = (AnonymousClass6Z9) view.getTag(2131433963);
        if (r0 == null) {
            r0 = new AnonymousClass6Z9();
            view.setTag(2131433963, r0);
        }
        r0.A00.remove(r3);
    }

    public final void A01() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        A00(this.$view, this.$poolingContainerListener);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A01();
        return C27621Wu.A00;
    }
}
