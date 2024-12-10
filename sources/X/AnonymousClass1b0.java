package X;

/* renamed from: X.1b0  reason: invalid class name */
public final class AnonymousClass1b0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1b0(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25391Oa r4 = (C25391Oa) obj;
        C18070vi.A0d(r4, 0);
        CharSequence charSequence = this.$this_splitToSequence;
        C18070vi.A0d(charSequence, 0);
        return charSequence.subSequence(r4.A00, r4.A01 + 1).toString();
    }
}
