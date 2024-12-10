package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.home.ui.StarredMessagesPlaceholderActivity;

public final /* synthetic */ class AGX implements AnonymousClass1HE {
    public final /* synthetic */ StarredMessagesPlaceholderActivity A00;

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r6) {
        ViewTreeObserver viewTreeObserver;
        StarredMessagesPlaceholderActivity starredMessagesPlaceholderActivity = this.A00;
        C18070vi.A0d(r6, 2);
        C33321id A07 = r6.A07(7);
        C18070vi.A0X(A07);
        starredMessagesPlaceholderActivity.A01 = A07.A03;
        ViewGroup viewGroup = starredMessagesPlaceholderActivity.A04;
        ViewGroup.LayoutParams layoutParams = null;
        View view2 = null;
        if (viewGroup != null) {
            view2 = viewGroup.getChildAt(0);
        }
        starredMessagesPlaceholderActivity.A02 = view2;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        starredMessagesPlaceholderActivity.A03 = layoutParams;
        View view3 = starredMessagesPlaceholderActivity.A02;
        if (!(view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new C20296AFe(starredMessagesPlaceholderActivity, 2));
        }
        return AnonymousClass1HO.A01;
    }

    public /* synthetic */ AGX(StarredMessagesPlaceholderActivity starredMessagesPlaceholderActivity) {
        this.A00 = starredMessagesPlaceholderActivity;
    }
}
