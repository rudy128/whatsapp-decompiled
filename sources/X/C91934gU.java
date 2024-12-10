package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.4gU  reason: invalid class name and case insensitive filesystem */
public class C91934gU implements C28582E8t {
    public View A00;
    public final C22654BId A01;
    public final C36731oN A02;
    public final C26106CsQ A03;
    public final C33451iq A04;
    public final C18140vp A05;
    public final C18030ve A06;

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        return AnonymousClass000.A1W(this.A04.A08());
    }

    public void CQJ() {
        if (this.A00 == null) {
            C22654BId bId = this.A01;
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(bId), bId, 2131625003);
            this.A00 = A09;
            bId.addView(A09);
            C26106CsQ.A00(this.A03, 1);
        }
        C33451iq r8 = this.A04;
        C48252Lt A08 = r8.A08();
        C17960vV.A07(A08);
        View view = this.A00;
        C17960vV.A05(view);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131436620);
        C22654BId bId2 = this.A01;
        A0J.setText(AnonymousClass4Z3.A00(bId2.getContext(), (C107725aU) null, false, A08.A04));
        ((AnonymousClass44y) AnonymousClass1HF.A06(this.A00, 2131436619)).A07(A08);
        String str = A08.A01;
        String A012 = AnonymousClass4Z3.A01(str);
        C18030ve r1 = this.A06;
        C63592tN A002 = r8.A03.A00();
        C17960vV.A07(A002);
        boolean A022 = C63802ti.A02(r1, A002);
        HashMap A023 = AnonymousClass4Z3.A02(str);
        if (A022 && bId2.getContext() != null) {
            AnonymousClass3MY.A0w(bId2.getContext(), A0J, 2131890840);
        }
        this.A00.setOnClickListener(new C824548a(this, A012, A023, A022));
        AnonymousClass1HF.A06(this.A00, 2131428811).setOnClickListener(new AnonymousClass48Z(0, this, A022));
        Log.i("UserNoticeBanner/update/banner shown");
        this.A00.setVisibility(0);
    }

    public C91934gU(C22654BId bId, C18030ve r2, C36731oN r3, C26106CsQ csQ, C33451iq r5, C18140vp r6) {
        this.A06 = r2;
        this.A03 = csQ;
        this.A04 = r5;
        this.A01 = bId;
        this.A02 = r3;
        this.A05 = r6;
    }
}
