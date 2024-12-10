package X;

import android.content.Context;

/* renamed from: X.3um  reason: invalid class name and case insensitive filesystem */
public final class C79173um extends C75063dv {
    public final Context A00;
    public final AnonymousClass5XR A01;
    public final AnonymousClass1EC A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C102435Gl(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79173um(Context context, AnonymousClass5XR r6, AnonymousClass1EC r7) {
        super(context);
        C18070vi.A0d(r6, 1);
        this.A01 = r6;
        this.A00 = context;
        this.A02 = r7;
        C91644g1.A00((AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class), getViewModel().A00, new AnonymousClass5S1(this), 12);
    }

    private final AnonymousClass3UH getViewModel() {
        return (AnonymousClass3UH) this.A03.getValue();
    }
}
