package X;

import android.view.View;
import android.widget.ListView;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;

/* renamed from: X.4cs  reason: invalid class name and case insensitive filesystem */
public final class C89694cs implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ListView A02;
    public final /* synthetic */ C84694Km A03;
    public final /* synthetic */ AnonymousClass1EC A04;
    public final /* synthetic */ C18090vk A05;

    public void onViewDetachedFromWindow(View view) {
    }

    public C89694cs(View view, View view2, ListView listView, C84694Km r4, AnonymousClass1EC r5, C18090vk r6) {
        this.A01 = view;
        this.A03 = r4;
        this.A02 = listView;
        this.A00 = view2;
        this.A04 = r5;
        this.A05 = r6;
    }

    public void onViewAttachedToWindow(View view) {
        VCOverscrollEntryPointView vCOverscrollEntryPointView;
        this.A01.removeOnAttachStateChangeListener(this);
        C84694Km r1 = this.A03;
        if (view instanceof VCOverscrollEntryPointView) {
            vCOverscrollEntryPointView = (VCOverscrollEntryPointView) view;
        } else {
            vCOverscrollEntryPointView = null;
        }
        r1.A00 = vCOverscrollEntryPointView;
        if (vCOverscrollEntryPointView != null) {
            vCOverscrollEntryPointView.A02 = this.A02;
            vCOverscrollEntryPointView.setComposer(this.A00);
        }
        VCOverscrollEntryPointView vCOverscrollEntryPointView2 = r1.A00;
        if (vCOverscrollEntryPointView2 != null) {
            vCOverscrollEntryPointView2.A04 = this.A04;
            vCOverscrollEntryPointView2.A0B = this.A05;
            vCOverscrollEntryPointView2.A07();
        }
    }
}
