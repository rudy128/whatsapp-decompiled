package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;

/* renamed from: X.78Y  reason: invalid class name */
public class AnonymousClass78Y implements View.OnKeyListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass78Y(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.A00 == 0) {
            return ((C108535br) this.A02).CAJ(i, keyEvent);
        }
        AnonymousClass6BJ r4 = (AnonymousClass6BJ) this.A01;
        TextView textView = (TextView) this.A02;
        C18070vi.A0d(keyEvent, 4);
        if (i != 67 || keyEvent.getAction() != 0 || !(r4 instanceof NewsletterDirectoryCategoriesActivity)) {
            return false;
        }
        String str = r4.A0M;
        if ((str != null && str.length() != 0) || r4.A09 == null) {
            return false;
        }
        AnonymousClass4VZ A4c = r4.A4c();
        C18070vi.A0z(A4c, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
        View view2 = ((AnonymousClass6FL) A4c).A00;
        boolean z = false;
        if (!(view2.findViewById(2131428924) instanceof ViewStub)) {
            z = view2.findViewById(2131428923).isSelected();
        }
        textView.setCursorVisible(z);
        if (z) {
            r4.A09 = null;
            r4.A00 = -1;
            r4.A4o(true);
        }
        AnonymousClass4VZ A4c2 = r4.A4c();
        C18070vi.A0z(A4c2, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
        ((AnonymousClass6FL) A4c2).A0E(true);
        return true;
    }
}
