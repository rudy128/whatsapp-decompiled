package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.6Fe  reason: invalid class name and case insensitive filesystem */
public class C120736Fe extends C120816Fm {
    public AnonymousClass1L9 A00;
    public AnonymousClass190 A01;
    public AnonymousClass1KB A02;
    public C219217x A03;
    public C32211gp A04;
    public C824046k A05;
    public AnonymousClass1DC A06;
    public AnonymousClass10I A07;
    public AnonymousClass00H A08;
    public boolean A09;

    public /* bridge */ /* synthetic */ CharSequence A05(AnonymousClass1E7 r5, AnonymousClass206 r6) {
        C438921i r62 = (C438921i) r6;
        if (TextUtils.isEmpty(r62.A01)) {
            return "";
        }
        return AnonymousClass25G.A04(C120816Fm.A01(r5, r62, this), C72813Np.A03(this.A01.getPaint(), AnonymousClass4aX.A02(getContext(), 2131231686, 2131101888), r62.A01));
    }

    public void A0A(C438921i r3, List list) {
        super.A08(r3, list);
        this.A05.setMessage(r3, list);
        AnonymousClass3MY.A1E(this.A05, this, r3, 23);
    }
}
