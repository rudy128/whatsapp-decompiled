package X;

import android.view.View;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
public class C28321Zx implements AnonymousClass1HE {
    public View A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C28311Zw A02;

    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r6) {
        C33321id A05 = r6.A00.A05(7);
        View view2 = this.A00;
        if (view2 == null) {
            view2 = this.A01.findViewById(2131432928);
            this.A00 = view2;
        }
        view2.setPadding(0, 0, 0, A05.A00);
        return r6;
    }

    public C28321Zx(View view, C28311Zw r3) {
        this.A02 = r3;
        this.A01 = view;
    }
}
