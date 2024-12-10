package X;

import android.view.View;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.calling.header.ui.CallScreenDetailsLayout;
import com.whatsapp.calling.header.ui.CallScreenDetailsLayout$setupOnAttach$1;
import com.whatsapp.calling.header.ui.CallScreenHeaderView;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;

/* renamed from: X.4ct  reason: invalid class name and case insensitive filesystem */
public class C89704ct implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C89704ct(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, int i) {
        view.addOnAttachStateChangeListener(new C89704ct(view, view, i));
    }

    public void onViewAttachedToWindow(View view) {
        switch (this.A00) {
            case 0:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                AnonymousClass3RI.A04((AnonymousClass3RI) this.A02);
                return;
            case 1:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                CallControlCard.A01((CallControlCard) this.A02);
                return;
            case 2:
                return;
            case 3:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                CallScreenDetailsLayout callScreenDetailsLayout = (CallScreenDetailsLayout) this.A02;
                AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(callScreenDetailsLayout);
                if (A002 != null) {
                    AnonymousClass3MX.A1Q(new CallScreenDetailsLayout$setupOnAttach$1(A002, callScreenDetailsLayout, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
                }
                if (!callScreenDetailsLayout.isAttachedToWindow()) {
                    callScreenDetailsLayout.A05.A02();
                    return;
                } else {
                    A00(callScreenDetailsLayout, 2);
                    return;
                }
            case 4:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                ((CallScreenHeaderView) this.A02).A07();
                return;
            case 5:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = (AudioChatBottomSheetFooterView) this.A02;
                if (C18020vd.A05(C18040vf.A01, audioChatBottomSheetFooterView.getAbProps(), 7875)) {
                    C72473Md.A11(audioChatBottomSheetFooterView, audioChatBottomSheetFooterView.getResources().getDimensionPixelSize(2131168775));
                    return;
                }
                return;
            default:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                C18090vk r0 = ((VCOverscrollEntryPointView) this.A02).A0B;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (2 - this.A00 == 0) {
            ((View) this.A01).removeOnAttachStateChangeListener(this);
            ((CallScreenDetailsLayout) this.A02).A05.A02();
        }
    }
}
