package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1JA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JA implements AnonymousClass1J9 {
    public final /* synthetic */ AnonymousClass1GP A00;

    public final void onBackStackChanged() {
        AnonymousClass1GR r2 = this.A00.A0U;
        List A04 = r2.A04();
        C18070vi.A0X(A04);
        ListIterator listIterator = A04.listIterator(A04.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (((Fragment) previous).A0B != null) {
                if (previous != null) {
                    List<Fragment> A042 = r2.A04();
                    C18070vi.A0X(A042);
                    for (Fragment fragment : A042) {
                        View view = fragment.A0B;
                        if (view != null) {
                            boolean equals = fragment.equals(previous);
                            int i = 4;
                            if (equals) {
                                i = 1;
                            }
                            view.setImportantForAccessibility(i);
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public /* synthetic */ AnonymousClass1JA(AnonymousClass1GP r1) {
        this.A00 = r1;
    }
}
