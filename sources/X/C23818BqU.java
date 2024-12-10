package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.BqU  reason: case insensitive filesystem */
public class C23818BqU extends C23819BqW {
    public boolean A00;
    public final /* synthetic */ PopupNotification A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23818BqU(Context context, C37451pZ r9, C31131f4 r10, PopupNotification popupNotification, C441822l r12) {
        super(context, r9, (C108875cR) null, popupNotification.A0X, r10, r12);
        this.A01 = popupNotification;
        A1M();
    }

    public boolean A1b() {
        return true;
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            C23820BqX.A05(r4, r2, A0O, this);
        }
    }

    public void onDraw(Canvas canvas) {
        View view = this.A08;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168276);
            view.setLayoutParams(layoutParams);
        }
        AnonymousClass3tU.A07(view, this);
        super.onDraw(canvas);
    }
}
