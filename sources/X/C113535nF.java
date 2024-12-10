package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import java.lang.ref.WeakReference;

/* renamed from: X.5nF  reason: invalid class name and case insensitive filesystem */
public abstract class C113535nF extends C42011xT {
    public WaTextView A00;
    public ImageView A01;
    public final View A02;
    public final AnonymousClass00H A03;
    public final C18090vk A04;
    public final AnonymousClass00H A05;

    public void A0B(C1418277c r6) {
        String str;
        C18070vi.A0d(r6, 0);
        View view = this.A02;
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131432872);
        if (A0U != null) {
            A0U.setText(r6.A06);
        } else {
            A0U = null;
        }
        this.A00 = A0U;
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131432853);
        this.A01 = A0H;
        if (A0H != null) {
            A0H.setImageResource(2131232710);
        }
        WeakReference A0z = AnonymousClass3MW.A0z(this.A01);
        if (!r6.A0B && (str = r6.A04) != null) {
            ((AnonymousClass6EY) this.A05.get()).A0C(str, new AnonymousClass7S8(A0z, this, 6));
        }
    }

    public C113535nF(View view, AnonymousClass00H r2, AnonymousClass00H r3, C18090vk r4) {
        super(view);
        this.A02 = view;
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }
}
