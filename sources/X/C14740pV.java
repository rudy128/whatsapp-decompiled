package X;

/* renamed from: X.0pV  reason: invalid class name and case insensitive filesystem */
public final class C14740pV extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C16040rc $indication;
    public final /* synthetic */ C16110rj $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14740pV(C16040rc r2, C16110rj r3) {
        super(3);
        this.$indication = r2;
        this.$interactionSource = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C17130tn A0b = AnonymousClass000.A0b(obj2, obj3);
        A0b.COB(-353972293);
        C16040rc r1 = this.$indication;
        if (r1 == null) {
            r1 = AnonymousClass0UD.A00;
        }
        C16050rd CEQ = r1.CEQ(this.$interactionSource, A0b);
        boolean A1X = AnonymousClass001.A1X(A0b, CEQ);
        Object CER = A0b.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0WJ(CEQ);
            AnonymousClass0VR.A0V(A0b, CER);
        }
        AnonymousClass0VR.A0L((AnonymousClass0VR) A0b);
        return CER;
    }
}
