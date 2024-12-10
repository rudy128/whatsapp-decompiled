package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6oG  reason: invalid class name and case insensitive filesystem */
public final class C133156oG {
    public View A00;
    public View A01;
    public final Context A02;
    public final ViewGroup A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C149797jd(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C149807je(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C149817jf(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C149827jg(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C149837jh(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C149847ji(this));

    public final void A00(C112375lN r3) {
        View view = this.A01;
        if (view != null && view.getVisibility() == 0) {
            C108965cb.A1N(this.A09.getValue());
            AnonymousClass3MW.A0A(this.A06).setVisibility(0);
            C18100vl r1 = this.A05;
            if (((RecyclerView) r1.getValue()).A0B == null) {
                ((RecyclerView) r1.getValue()).setAdapter(r3);
            }
        }
    }

    public C133156oG(Context context, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A02 = context;
    }
}
