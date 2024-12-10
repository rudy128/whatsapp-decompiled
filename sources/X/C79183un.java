package X;

import android.content.Context;

/* renamed from: X.3un  reason: invalid class name and case insensitive filesystem */
public final class C79183un extends C75063dv {
    public final Context A00;
    public final AnonymousClass5XU A01;
    public final AnonymousClass11P A02;
    public final C26031Qo A03;
    public final AnonymousClass1BI A04;
    public final AnonymousClass1EC A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C102455Gn(this));

    private final AnonymousClass3Ts getViewModel() {
        return (AnonymousClass3Ts) this.A06.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79183un(Context context, AnonymousClass5XU r6, AnonymousClass11P r7, C26031Qo r8, AnonymousClass1BI r9, AnonymousClass1EC r10) {
        super(context);
        C18070vi.A0o(r7, r8, r6);
        this.A02 = r7;
        this.A03 = r8;
        this.A01 = r6;
        this.A00 = context;
        this.A05 = r10;
        this.A04 = r9;
        C91644g1.A00((AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class), getViewModel().A00, new AnonymousClass5S4(this), 15);
    }
}
