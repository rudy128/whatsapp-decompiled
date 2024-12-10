package X;

/* renamed from: X.5Rb  reason: invalid class name and case insensitive filesystem */
public final class C105195Rb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3PT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105195Rb(AnonymousClass3PT r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        AnonymousClass4SU r0 = this.this$0.A01;
        if (r0 == null) {
            C18070vi.A11("mediaCardUpdateHelper");
            throw null;
        }
        r0.A0A.setMediaInfo(str);
        return C27621Wu.A00;
    }
}
