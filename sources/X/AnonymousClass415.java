package X;

import android.app.Activity;

/* renamed from: X.415  reason: invalid class name */
public final class AnonymousClass415 extends C96344nh {
    public final /* synthetic */ AnonymousClass4aY A00;
    public final /* synthetic */ C79823w5 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass415(AnonymousClass4aY r8, C79823w5 r9, AnonymousClass11P r10, AnonymousClass1NN r11, AnonymousClass122 r12, AnonymousClass126 r13, C188679ho r14, AnonymousClass1PQ r15) {
        super(r10, r11, r12, r13, r14, r15);
        this.A00 = r8;
        this.A01 = r9;
    }

    public void C7e(AnonymousClass4OX r9, AnonymousClass1EC r10) {
        AnonymousClass1EC r5 = r10;
        C18070vi.A0h(r10, r9);
        Activity activity = (Activity) AnonymousClass3MW.A0z(AnonymousClass3MW.A0Q(this.A00)).get();
        if (activity != null && !activity.isFinishing()) {
            super.C7e(r9, r10);
            String A002 = C83764Go.A00(activity, r9);
            C79823w5 r4 = this.A01;
            r4.A01.A0J(new C21462AkT(this, activity, r4, r5, A002, 6));
        }
    }

    public void C8g() {
        super.C8g();
        Activity activity = (Activity) AnonymousClass3MW.A0z(AnonymousClass3MW.A0Q(this.A00)).get();
        if (activity != null && !activity.isFinishing()) {
            this.A01.A01.A0J(new C98704ra(this, activity, 42));
        }
    }
}
