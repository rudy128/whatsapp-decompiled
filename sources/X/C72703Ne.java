package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ne  reason: invalid class name and case insensitive filesystem */
public class C72703Ne extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72703Ne(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment;
        switch (this.A00) {
            case 0:
                BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment2 = (BusinessTransitionInfoDialogFragment) this.A01;
                businessTransitionInfoDialogFragment2.A07.get();
                businessTransitionInfoDialogFragment = businessTransitionInfoDialogFragment2;
                break;
            case 1:
                businessTransitionInfoDialogFragment = (Fragment) this.A01;
                break;
            default:
                C18090vk r0 = ((GalleryPartialPermissionBanner) this.A02).A00;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
        }
        businessTransitionInfoDialogFragment.A1k(AnonymousClass1LU.A1B(businessTransitionInfoDialogFragment.A14(), (UserJid) this.A02));
    }

    public void updateDrawState(TextPaint textPaint) {
        if (2 - this.A00 != 0) {
            textPaint.setColor(AnonymousClass3MZ.A09((Fragment) this.A01).getColor(2131099690));
            textPaint.clearShadowLayer();
            return;
        }
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(AnonymousClass1YH.A00((Resources.Theme) null, ((View) this.A01).getResources(), 2131103264));
    }
}
