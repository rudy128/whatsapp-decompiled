package X;

import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4Hm  reason: invalid class name and case insensitive filesystem */
public abstract class C84004Hm {
    public static /* synthetic */ void A00(AnonymousClass01E r4, Toolbar toolbar, C18000vb r6, CharSequence charSequence) {
        int A01 = AnonymousClass4Z9.A01(AnonymousClass3MY.A04(toolbar), false);
        AnonymousClass5UR r2 = new AnonymousClass5UR(r4);
        toolbar.setTitle(charSequence);
        toolbar.setBackgroundResource(A01);
        toolbar.A0Q(r4, 2132083960);
        AnonymousClass3NL.A02(toolbar.getContext(), toolbar, r6, 2131231675);
        toolbar.setNavigationOnClickListener(new AnonymousClass78L(r2, 17));
        toolbar.setNavigationContentDescription(2131898718);
        Window window = r4.getWindow();
        window.clearFlags(67108864);
        window.setStatusBarColor(C19740yt.A00(r4, A01));
        r4.setTitle(charSequence);
        r4.setSupportActionBar(toolbar);
    }
}
