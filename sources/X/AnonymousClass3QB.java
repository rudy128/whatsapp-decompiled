package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.conversation.comments.ui.CommentContactPictureView;
import com.whatsapp.conversation.comments.ui.CommentDateView;
import com.whatsapp.conversation.comments.ui.CommentDecryptionFailureTextView;
import com.whatsapp.conversation.comments.ui.CommentHeaderView;

/* renamed from: X.3QB  reason: invalid class name */
public final class AnonymousClass3QB extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) AnonymousClass3MX.A0C(this, 2131429844));
    public CommentContactPictureView A01 = ((CommentContactPictureView) AnonymousClass3MX.A0C(this, 2131429847));
    public CommentDateView A02 = ((CommentDateView) AnonymousClass3MX.A0C(this, 2131429203));
    public CommentDecryptionFailureTextView A03 = ((CommentDecryptionFailureTextView) AnonymousClass3MX.A0C(this, 2131429848));
    public CommentHeaderView A04 = ((CommentHeaderView) AnonymousClass3MX.A0C(this, 2131429845));
    public final C18100vl A05;

    public AnonymousClass3QB(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5GK(context));
        View.inflate(context, 2131624560, this);
    }

    private final void setupClickListener(AnonymousClass206 r3) {
        C90284dp.A00(this.A00, this, r3, 5);
    }

    public final void A00(C37451pZ r5, AnonymousClass206 r6) {
        this.A01.A07(r5, r6);
        CommentDecryptionFailureTextView commentDecryptionFailureTextView = this.A03;
        C17900vP.A0M(commentDecryptionFailureTextView.getWaSharedPreferences(), "decryption_failure_views", C17890vO.A00(C17890vO.A0B(commentDecryptionFailureTextView.getWaSharedPreferences()), "decryption_failure_views") + 1);
        commentDecryptionFailureTextView.getUiWamEventHelper().A01(r6, 2);
        this.A04.A02(r6);
        CommentDateView commentDateView = this.A02;
        C72473Md.A15(commentDateView, commentDateView.getTime(), commentDateView.getWhatsAppLocale(), r6);
        setupClickListener(r6);
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A05.getValue();
    }
}
