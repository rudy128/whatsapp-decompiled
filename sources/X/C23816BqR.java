package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;

/* renamed from: X.BqR  reason: case insensitive filesystem */
public class C23816BqR extends BqS {
    public int A00 = 0;
    public ImageView A01;
    public final View.OnClickListener A02 = new C89914dE(this, 2);
    public final Runnable A03 = new C98784ri((Object) this, 36);

    public void A1y() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView = this.A03;
        AnonymousClass21V fMessage = getFMessage();
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            C88564a8.A01(viewOnceDownloadProgressView.A01, fMessage, viewOnceDownloadProgressView.A04);
        }
    }

    public void A20() {
        C17960vV.A0F(false, "ConversationRowViewOnceMedia/senders can not view their own media");
    }

    public Drawable getPopupDrawable() {
        AnonymousClass1KW r5 = this.A15;
        Resources resources = getResources();
        int[] A1X = BE6.A1X();
        A1X[0] = 129323;
        return r5.A07(resources, new C117025z5(A1X), -1);
    }

    public C23816BqR(Context context, C108875cR r4, AnonymousClass21V r5) {
        super(context, r4, r5);
        A2v();
    }

    public void A2v() {
        super.A2v();
        int Bbc = ((AnonymousClass215) getFMessage()).Bbc();
        if (Bbc != 0) {
            if (Bbc == 1) {
                A2t();
                WaTextView waTextView = this.A02;
                waTextView.setText(2131897928);
                AnonymousClass3MY.A0w(getContext(), waTextView, getMediaTypeDescriptionString());
            } else if (Bbc == 2) {
                BqS.A02(this.A03, getFMessage(), 2, true);
                A2w(this.A01, 2, true);
                A2u();
            } else {
                return;
            }
            View view = this.A01;
            view.setOnClickListener(this.A02);
            AnonymousClass3uP.A0W(view, this);
            return;
        }
        AnonymousClass21V fMessage = getFMessage();
        int A002 = AnonymousClass25A.A00(fMessage);
        BqS.A02(this.A03, fMessage, A002, true);
        View view2 = this.A01;
        A2w(view2, A002, true);
        if (A002 == 2) {
            view2.setOnClickListener(this.A02);
            AnonymousClass3uP.A0W(view2, this);
        }
        A2u();
    }
}
