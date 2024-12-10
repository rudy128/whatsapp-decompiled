package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.485  reason: invalid class name */
public final class AnonymousClass485 extends ReadMoreTextView {
    public final Context A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1LU A02;
    public final AnonymousClass1EC A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass485(Context context, AnonymousClass11P r5, AnonymousClass1LU r6, AnonymousClass1EC r7) {
        super(context);
        int A0G = C72453Mb.A0G(r5, r6, 1);
        C18070vi.A0f(context, 3, r7);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = context;
        this.A03 = r7;
        C29261bv.A08(this, 2132083154);
        setLineHeight(getResources().getDimensionPixelSize(2131166124));
        setLinesLimit(A0G);
        setGravity(17);
        setVisibility(8);
        setLinkAppearanceSpan(new TextAppearanceSpan(context, 2132083157));
        this.A05 = context.getString(2131899186);
        this.A01 = AnonymousClass1YL.A00(context, 2130968583, 2131099679);
    }

    public static final void setupReadMoreClickListener$lambda$1(AnonymousClass485 r5, View view) {
        C18070vi.A0d(r5, 0);
        Activity A002 = AnonymousClass1L9.A00(r5.A00);
        if (A002 instanceof AnonymousClass01E) {
            Intent A13 = AnonymousClass1LU.A13(A002, r5.A03, false, true, true);
            C60442o2.A00(A13, r5.A01, C72463Mc.A0p(A002));
            A002.startActivity(A13, (Bundle) null);
        }
    }
}
