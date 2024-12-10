package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.61H  reason: invalid class name */
public final class AnonymousClass61H extends C112825m6 {
    public ViewGroup A00;
    public WaTextView A01;
    public final C18090vk A02;
    public final View A03;
    public final WaImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61H(View view, C18090vk r3, boolean z) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A03 = view;
        this.A02 = r3;
        this.A00 = (ViewGroup) C18070vi.A05(view, 2131429705);
        this.A01 = AnonymousClass3Ma.A0N(view, 2131427528);
        this.A04 = C108965cb.A0I(view, 2131427483);
        A0B(z);
    }

    public final void A0B(boolean z) {
        ViewGroup viewGroup = this.A00;
        if (z) {
            AnonymousClass78O.A00(viewGroup, this, 48);
            AnonymousClass3MW.A1Q(viewGroup);
        } else {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
        viewGroup.setEnabled(z);
        this.A04.setEnabled(z);
        WaTextView waTextView = this.A01;
        Resources resources = this.A03.getResources();
        int i = 2131103156;
        if (z) {
            i = 2131103150;
        }
        waTextView.setTextColor(resources.getColor(i));
    }
}
