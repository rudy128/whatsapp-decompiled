package X;

/* renamed from: X.6IY  reason: invalid class name */
public class AnonymousClass6IY extends C64632v5 {
    public final /* synthetic */ C116505xr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IY(C116505xr r1, String str) {
        super(str);
        this.A00 = r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C116505xr r2 = this.A00;
        r2.A09(false);
        AnonymousClass7EL r1 = r2.A04;
        r1.A00();
        r1.A01 = null;
        r2.A05.A00();
        C116505xr.A00(r1, r2, charSequence);
    }
}
