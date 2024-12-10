package X;

/* renamed from: X.0nW  reason: invalid class name and case insensitive filesystem */
public final class C13510nW extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C26251Cvq $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13510nW(C26251Cvq cvq, AnonymousClass1OS r3, int i, int i2, long j) {
        super(2);
        this.$contentColor = j;
        this.$typography = cvq;
        this.$content = r3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r8) {
        C17130tn r0 = r8;
        AnonymousClass0PE.A02(r0, this.$typography, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default, this.$contentColor);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
