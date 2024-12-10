package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7Oo  reason: invalid class name and case insensitive filesystem */
public final class C146297Oo implements AnonymousClass86B {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C146297Oo) {
                C146297Oo r5 = (C146297Oo) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public C146297Oo(View view, ImageView imageView, ImageView imageView2) {
        C18070vi.A0o(view, imageView, imageView2);
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = imageView2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostMigrationShareViewData(containerView=");
        A10.append(this.A00);
        A10.append(", fbShareIcon=");
        A10.append(this.A01);
        A10.append(", igShareIcon=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
