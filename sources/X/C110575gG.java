package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;

/* renamed from: X.5gG  reason: invalid class name and case insensitive filesystem */
public final class C110575gG extends LinearLayout {
    public WaImageView A00;
    public TextView A01;
    public TextView A02;
    public final int A03;
    public final C132666nJ A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C153087ox(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C153097oy(this));
    public final AnonymousClass728 A07;
    public final C36731oN A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110575gG(Context context, C132666nJ r6, AnonymousClass728 r7, C36731oN r8, int i) {
        super(context, (AttributeSet) null, 0);
        C18070vi.A0d(r7, 5);
        C18070vi.A0l(r6, r8);
        View inflate = AnonymousClass3MZ.A0D(this).inflate(2131626601, this, true);
        this.A00 = (WaImageView) AnonymousClass3MX.A0C(inflate, 2131434073);
        this.A02 = C72453Mb.A0W(inflate, 2131434074);
        this.A01 = C72453Mb.A0W(inflate, 2131434075);
        AnonymousClass1Y5.A0A(this.A02, true);
        this.A03 = i;
        this.A07 = r7;
        this.A04 = r6;
        this.A08 = r8;
    }

    private final int getPaddingVerticalDivider() {
        return C72453Mb.A0I(this.A05);
    }

    private final int getPaddingVerticalFixed() {
        return C72453Mb.A0I(this.A06);
    }

    public final void setItemPaddingIfNeeded(boolean z) {
        int i;
        C18100vl r3 = this.A06;
        int A0I = C72453Mb.A0I(r3);
        if (z) {
            i = C72453Mb.A0I(this.A05);
        } else {
            i = 0;
        }
        setPadding(0, C72453Mb.A0I(r3), 0, A0I + i);
    }

    public final void setSecondaryText(String str) {
        this.A07.A04(AnonymousClass3MY.A04(this), this.A01, this.A08, str, (String) null, false);
    }

    public final void setText(String str) {
        this.A07.A04(AnonymousClass3MY.A04(this), this.A02, this.A08, str, (String) null, false);
    }
}
