package X;

import android.widget.RadioButton;

/* renamed from: X.6p1  reason: invalid class name and case insensitive filesystem */
public final class C133586p1 {
    public final C110675gp A00;
    public final C18000vb A01;

    public final void A00(int i) {
        RadioButton radioButton;
        C110675gp r2 = this.A00;
        C110675gp.A00(r2);
        if (i != 0) {
            if (i == 1) {
                radioButton = r2.A02;
            } else if (i == 2) {
                radioButton = r2.A03;
            } else if (i != 3) {
                return;
            }
            radioButton.setChecked(true);
        }
        radioButton = r2.A04;
        radioButton.setChecked(true);
    }

    public final void A01(int i, int i2) {
        C18000vb r7 = this.A01;
        Object[] objArr = new Object[1];
        boolean A1b = C72453Mb.A1b(objArr, i);
        String A0K = r7.A0K(objArr, 2131755407, (long) i);
        C18070vi.A0X(A0K);
        C110675gp r4 = this.A00;
        r4.A06.setText(A0K);
        Object[] objArr2 = new Object[1];
        C17880vN.A1T(objArr2, i2, A1b ? 1 : 0);
        String A0K2 = r7.A0K(objArr2, 2131755408, (long) i2);
        C18070vi.A0X(A0K2);
        r4.A05.setText(A0K2);
    }

    public C133586p1(C18000vb r1, C110675gp r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
