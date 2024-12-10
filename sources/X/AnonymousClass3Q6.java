package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.3Q6  reason: invalid class name */
public final class AnonymousClass3Q6 extends LinearLayout {
    public final LinearLayout A00;
    public final C18100vl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Q6(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass5NI(context, this));
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        addView(linearLayout);
    }

    public final LinearLayout getAttachmentsContainer() {
        return this.A00;
    }

    public final LinearLayout getHintsContainer() {
        return (LinearLayout) this.A01.getValue();
    }
}
