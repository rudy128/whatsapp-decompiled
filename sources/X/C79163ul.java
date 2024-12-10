package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView;

/* renamed from: X.3ul  reason: invalid class name and case insensitive filesystem */
public abstract class C79163ul extends AnonymousClass3PM {
    public C36361nl A00;
    public AnonymousClass11C A01;
    public final C108875cR A02;

    public void A02(AnonymousClass210 r8) {
        AnonymousClass210 r4 = r8;
        if (r8.A01 == 4 || r8.A07 == null) {
            getSelectionView().A04(8);
            setOnClickListener((View.OnClickListener) null);
            setOnLongClickListener((View.OnLongClickListener) null);
            return;
        }
        C108875cR r3 = this.A02;
        if (r3 != null) {
            setOnLongClickListener(new C90284dp(this, r8, 9));
            if (r3.Bcq()) {
                C28931bI selectionView = getSelectionView();
                C72463Mc.A0N(selectionView).setClickable(true);
                selectionView.A02().bringToFront();
                selectionView.A05(new AnonymousClass78E(this, r3, r4, selectionView, 10));
                ((CarouselItemSelectionView) selectionView.A02()).setRowSelected(r3.Bfa(r8));
                C90074dU.A00(this, r8, 42);
            }
        }
        getSelectionView().A04(8);
        C90074dU.A00(this, r8, 42);
    }

    public abstract C28931bI getSelectionView();

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public C79163ul(Context context, C108875cR r2) {
        super(context);
        A01();
        this.A02 = r2;
    }

    public static final void A00(C108875cR r1, AnonymousClass210 r2, C28931bI r3) {
        if (r1.Bcq()) {
            ((CarouselItemSelectionView) r3.A02()).setRowSelected(r1.CPY(r2));
            return;
        }
        r1.COH(r2);
    }
}
