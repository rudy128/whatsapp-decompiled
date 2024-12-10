package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0YO  reason: invalid class name */
public final class AnonymousClass0YO implements C16890tO {
    public static Object A00(C01930Bz r2, AnonymousClass0C5 r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        View.OnClickListener onClickListener = r3.A04;
        if (onClickListener != null) {
            r2.setOnClickListener(onClickListener);
        }
        r2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r2.setFocusable(r3.A06);
        r2.setFocusableInTouchMode(false);
        r2.setEnabled(r3.A05);
        if (r3.A00 == -1) {
            return null;
        }
        r2.setClickable(false);
        return null;
    }

    public static void A01(C01930Bz r2) {
        C18070vi.A0d(r2, 1);
        r2.setOnClickListener((View.OnClickListener) null);
        r2.setClickable(false);
        r2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r2.setFocusable(false);
        r2.setFocusableInTouchMode(false);
    }

    public /* synthetic */ String BQX() {
        return C02730Fd.A00(this);
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        return A00((C01930Bz) obj, (AnonymousClass0C5) obj2);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        A01((C01930Bz) obj);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
