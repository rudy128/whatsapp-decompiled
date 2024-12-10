package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5nI  reason: invalid class name and case insensitive filesystem */
public class C113565nI extends C42011xT {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final C18000vb A08;

    public void A0B() {
        if (!this.A00) {
            this.A01.setBackgroundResource(0);
            C29191bl.A02((ViewGroup) this.A0H, new AnonymousClass1LG());
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A03.setSelected(false);
            this.A00 = true;
        }
    }

    public C113565nI(Context context, ViewGroup viewGroup, C18000vb r5) {
        super(AnonymousClass3MX.A09(LayoutInflater.from(context), viewGroup, 2131627108));
        this.A08 = r5;
        View view = this.A0H;
        this.A01 = view.findViewById(2131434339);
        this.A02 = view.findViewById(2131434331);
        this.A04 = view.findViewById(2131434335);
        this.A03 = view.findViewById(2131434332);
        this.A05 = view.findViewById(2131434337);
        this.A07 = AnonymousClass3MW.A0D(view, 2131434368);
        this.A06 = AnonymousClass3MW.A0D(view, 2131434364);
    }
}
