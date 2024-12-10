package X;

/* renamed from: X.24y  reason: invalid class name and case insensitive filesystem */
public final class C448324y implements C447624r {
    public final AnonymousClass00H A00;

    public C448324y(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r5, C49702Rn r6) {
        C18070vi.A0d(r5, 0);
        if (r5.A0z(8)) {
            C25951Qg.A05((C25951Qg) this.A00.get(), r5, "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?", r5.A0x);
            if (r6 != null) {
                new AnonymousClass20F(C448324y.class);
                throw new NullPointerException("onProcessorExecuted");
            }
        }
    }
}
