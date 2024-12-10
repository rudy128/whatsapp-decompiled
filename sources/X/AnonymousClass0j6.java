package X;

/* renamed from: X.0j6  reason: invalid class name */
public final class AnonymousClass0j6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0U5 this$0;
    public final /* synthetic */ C06020Wq this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0j6(C06020Wq r2, AnonymousClass0U5 r3) {
        super(1);
        this.this$0 = r3;
        this.this$1 = r2;
    }

    /* renamed from: A00 */
    public final C17190uG invoke(C16580sf r6) {
        long j;
        long j2;
        C17190uG BHB;
        C16300s2 r0 = (C16300s2) this.this$0.A02.get(r6.BSw());
        if (r0 != null) {
            j = ((C26142Ct5) r0.getValue()).A03();
        } else {
            j = 0;
        }
        C16300s2 r02 = (C16300s2) this.this$0.A02.get(r6.BaC());
        if (r02 != null) {
            j2 = ((C26142Ct5) r02.getValue()).A03();
        } else {
            j2 = 0;
        }
        C15990rX r03 = (C15990rX) this.this$1.A00.getValue();
        if (r03 == null || (BHB = r03.BHB(j, j2)) == null) {
            return new AnonymousClass0U0((Object) null, 1500.0f);
        }
        return BHB;
    }
}
