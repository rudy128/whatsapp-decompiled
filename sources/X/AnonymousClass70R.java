package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.70R  reason: invalid class name */
public class AnonymousClass70R {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public MediaCaptionTextView A09;
    public C28931bI A0A;
    public C28931bI A0B;
    public C28931bI A0C;
    public C28931bI A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public C28931bI A0G;
    public boolean A0H;
    public final boolean A0I;

    public final View A01() {
        View view = this.A04;
        if (view != null) {
            return view;
        }
        C18070vi.A11("statusDetailsBackground");
        throw null;
    }

    public final ViewGroup A02() {
        ViewGroup viewGroup = this.A06;
        if (viewGroup != null) {
            return viewGroup;
        }
        C18070vi.A11("bottomSheet");
        throw null;
    }

    public final ViewGroup A03() {
        ViewGroup viewGroup = this.A07;
        if (viewGroup != null) {
            return viewGroup;
        }
        C18070vi.A11("contentContainer");
        throw null;
    }

    public final MediaCaptionTextView A06() {
        if (!this.A0I) {
            return this.A09;
        }
        C28931bI r2 = this.A0B;
        if (r2 == null || r2.A00 == null) {
            return null;
        }
        return (MediaCaptionTextView) r2.A02();
    }

    public final C28931bI A07() {
        C28931bI r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("controlFrame");
        throw null;
    }

    public final C28931bI A08() {
        C28931bI r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("replyBar");
        throw null;
    }

    public AnonymousClass70R(boolean z) {
        this.A0I = z;
    }

    public static View A00(AnonymousClass70R r0) {
        return r0.A08().A02();
    }

    public final TextView A04() {
        return C72453Mb.A0W(A07().A02(), 2131429541);
    }

    public final CircularProgressBar A05() {
        return (CircularProgressBar) AnonymousClass3MX.A0C(A07().A02(), 2131434181);
    }

    public final boolean A09() {
        MediaCaptionTextView A062 = A06();
        if (A062 != null && A062.getVisibility() == 0) {
            return true;
        }
        C28931bI r0 = this.A0E;
        if (r0 == null || r0.A01() != 0) {
            return false;
        }
        return true;
    }
}
