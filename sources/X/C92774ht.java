package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.4ht  reason: invalid class name and case insensitive filesystem */
public final class C92774ht implements BCQ {
    public final AnonymousClass1VU A00;

    public /* bridge */ /* synthetic */ void Blh(BCx bCx) {
        C92814hx r3 = (C92814hx) bCx;
        C18070vi.A0d(r3, 0);
        ImageView BSp = r3.BSp();
        if (BSp != null) {
            BSp.setImageDrawable(r3.A03);
        }
    }

    public /* bridge */ /* synthetic */ void Bwu(BCx bCx) {
        C92814hx r3 = (C92814hx) bCx;
        C18070vi.A0d(r3, 0);
        ImageView BSp = r3.BSp();
        if (BSp != null) {
            BSp.setImageDrawable(r3.A02);
        }
    }

    public /* bridge */ /* synthetic */ void Bx6(Bitmap bitmap, BCx bCx, boolean z) {
        C92814hx r6 = (C92814hx) bCx;
        C18070vi.A0h(r6, bitmap);
        ImageView BSp = r6.BSp();
        if (BSp != null) {
            BSp.setImageDrawable(this.A00.A01(BSp.getResources(), bitmap, AnonymousClass3Ma.A0J()));
        }
        C108315bU r0 = r6.A04;
        if (r0 != null) {
            r0.C8b(bitmap);
        }
    }

    public C92774ht(AnonymousClass1VU r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void Bx1(BCx bCx) {
    }
}
