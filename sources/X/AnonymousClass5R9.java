package X;

import android.widget.TextView;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;

/* renamed from: X.5R9  reason: invalid class name */
public final class AnonymousClass5R9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SharePhoneNumberBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5R9(SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet) {
        super(1);
        this.this$0 = sharePhoneNumberBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        String str;
        TextView textView;
        AnonymousClass4TD r7 = (AnonymousClass4TD) obj;
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = this.this$0;
        C18070vi.A0b(r7);
        String str2 = r7.A01;
        if (!(str2 == null || (textView = sharePhoneNumberBottomSheet.A02) == null)) {
            textView.setText(str2);
        }
        int A0I = C72453Mb.A0I(sharePhoneNumberBottomSheet.A03);
        if (A0I == 3 || A0I == 4) {
            i = 2131896105;
        } else {
            i = 2131896104;
            if (A0I != 5) {
                i = 2131896106;
            }
        }
        String A16 = AnonymousClass3MX.A16(sharePhoneNumberBottomSheet, r7.A00, new Object[1], 0, i);
        C18070vi.A0b(A16);
        TextView textView2 = sharePhoneNumberBottomSheet.A04;
        if (textView2 != null) {
            C36401np r1 = sharePhoneNumberBottomSheet.A01;
            if (r1 != null) {
                textView2.setText(r1.A03(textView2.getContext(), A16), TextView.BufferType.SPANNABLE);
                C18030ve r0 = sharePhoneNumberBottomSheet.A00;
                if (r0 != null) {
                    AnonymousClass3Ma.A1I(textView2, r0);
                } else {
                    str = "abProps";
                }
            } else {
                str = "linkifier";
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
