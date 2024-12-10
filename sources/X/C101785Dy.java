package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView;

/* renamed from: X.5Dy  reason: invalid class name and case insensitive filesystem */
public final class C101785Dy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AudioChatBottomSheetFooterView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101785Dy(AudioChatBottomSheetFooterView audioChatBottomSheetFooterView) {
        super(0);
        this.this$0 = audioChatBottomSheetFooterView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = this.this$0;
        C18070vi.A0d(audioChatBottomSheetFooterView, 0);
        ViewStub A0E = AnonymousClass3MW.A0E(audioChatBottomSheetFooterView, 2131432877);
        boolean A05 = C18020vd.A05(C18040vf.A01, this.this$0.getAbProps(), 7875);
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView2 = this.this$0;
        if (A05) {
            A0E.setLayoutResource(2131627448);
            ViewGroup.LayoutParams layoutParams = A0E.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                layoutParams.width = -2;
                A0E.setLayoutParams(layoutParams);
                C28931bI A0p = AnonymousClass3MW.A0p(A0E);
                A0p.A05(new C90034dQ(audioChatBottomSheetFooterView2, 31));
                return A0p;
            }
            throw AnonymousClass3MY.A0k();
        }
        A0E.setLayoutResource(2131624230);
        C28931bI A0p2 = AnonymousClass3MW.A0p(A0E);
        C98254qp.A00(A0p2, audioChatBottomSheetFooterView2, 9);
        return A0p2;
    }
}
