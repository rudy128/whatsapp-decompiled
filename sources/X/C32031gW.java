package X;

/* renamed from: X.1gW  reason: invalid class name and case insensitive filesystem */
public class C32031gW {
    public final C25931Qe A00;
    public final C27331Vr A01;
    public final C18030ve A02;
    public final C200710s A03;

    public C32031gW(C18030ve r3, C25931Qe r4, C27331Vr r5, AnonymousClass10I r6) {
        this.A02 = r3;
        this.A03 = new C200710s(r6, true);
        this.A01 = r5;
        this.A00 = r4;
    }

    public void A00(AnonymousClass206 r5, Runnable runnable) {
        C693336u A0O = r5.A0O();
        boolean z = false;
        if (A0O != null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FMessageThumbnailAsyncLoader/loadAsync/should not be called for a message that doesn't support thumbnails. Message type = ");
        sb.append(r5.A0u);
        C17960vV.A0F(z, sb.toString());
        if (A0O == null) {
            return;
        }
        if (C18070vi.A09(r5, C693336u.class).A03) {
            runnable.run();
        } else {
            this.A03.execute(new AnonymousClass3C4(this, r5, runnable, 35));
        }
    }
}
