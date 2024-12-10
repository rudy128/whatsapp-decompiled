package X;

import android.view.View;

/* renamed from: X.BJm  reason: case insensitive filesystem */
public final class C22671BJm extends C25247Cbm implements AnonymousClass1HE {
    public View A00;
    public AnonymousClass1HO A01;
    public boolean A02;

    public C22671BJm() {
        super(1);
    }

    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r6) {
        C18070vi.A0h(view, r6);
        this.A00 = view;
        this.A01 = r6;
        int i = 7;
        if (!this.A02) {
            i = 15;
        }
        C33321id A07 = r6.A07(i);
        C18070vi.A0X(A07);
        view.setPadding(A07.A01, A07.A03, A07.A02, A07.A00);
        return AnonymousClass1HO.A01;
    }
}
