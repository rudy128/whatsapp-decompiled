package X;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.permissions.RequestPermissionsBottomSheet;

/* renamed from: X.48i  reason: invalid class name and case insensitive filesystem */
public class C825348i extends C38471rL {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C825348i(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = 0;
        this.A01 = acceptInviteLinkActivity;
        this.A02 = "invite-via-link-unavailable";
    }

    public void A04(View view) {
        ConversationAttachmentContentView conversationAttachmentContentView;
        String str;
        switch (this.A00) {
            case 0:
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A01;
                AnonymousClass3MW.A0a(acceptInviteLinkActivity.A0G).A01(acceptInviteLinkActivity, "invite-via-link-unavailable");
                return;
            case 1:
                OrderDetailFragment orderDetailFragment = (OrderDetailFragment) this.A01;
                int A0H = orderDetailFragment.A0M.A0H(orderDetailFragment.A0J);
                C63572tK A022 = orderDetailFragment.A0L.A02();
                if (A0H == 1 && A022 != null) {
                    C63572tK r0 = C63572tK.A0E;
                    if ("BR".equals(A022.A03)) {
                        C73203Rj A04 = AnonymousClass4a6.A04(orderDetailFragment);
                        A04.A0E(2131893327);
                        A04.A0D(2131893326);
                        A04.A0Z(new C1411874q(8), 2131899286);
                        AnonymousClass3MY.A1G(A04);
                        A6X a6x = orderDetailFragment.A0P;
                        UserJid userJid = orderDetailFragment.A0J;
                        C81643zZ r1 = new C81643zZ();
                        r1.A01 = 4;
                        r1.A03 = "received_cart";
                        if (!AnonymousClass1EG.A0H("from_cart")) {
                            r1.A05 = "from_cart";
                        }
                        ((C57812jg) a6x.A06.get()).A00(r1, userJid);
                        a6x.A02.CC7(r1);
                        return;
                    }
                }
                orderDetailFragment.A14();
                orderDetailFragment.A01.A03();
                orderDetailFragment.A14();
                AnonymousClass4aU.A03(orderDetailFragment.A15(), "");
                throw AnonymousClass000.A0s("getCreateOrderActivity");
            case 2:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                A09 a09 = new A09(view, callLogActivity.A0N, C17880vN.A0m());
                a09.A02 = this.A02;
                a09.A01(callLogActivity);
                return;
            case 3:
                conversationAttachmentContentView = (ConversationAttachmentContentView) this.A01;
                C88184Yq r12 = conversationAttachmentContentView.A0E;
                str = this.A02;
                r12.A05(str, (Integer) null);
                break;
            case 4:
                conversationAttachmentContentView = (ConversationAttachmentContentView) this.A01;
                Integer A012 = conversationAttachmentContentView.getActionThreadType();
                C88184Yq r02 = conversationAttachmentContentView.A0E;
                str = this.A02;
                r02.A05(str, A012);
                break;
            case 5:
                String str2 = this.A02;
                Uri parse = Uri.parse(str2);
                if (parse.getScheme() == null) {
                    parse = Uri.parse(AnonymousClass001.A1H("http://", str2, AnonymousClass000.A10()));
                }
                try {
                    AnonymousClass3MY.A11(AnonymousClass3MY.A07(parse), (View) this.A01);
                    return;
                } catch (ActivityNotFoundException unused) {
                    ((AnonymousClass3uP) this.A01).A0S.A08(2131886448, 0);
                    return;
                }
            case 6:
                StickerExpressionsFragment.A05((StickerExpressionsFragment) this.A01, this.A02, true);
                return;
            case 7:
                String str3 = this.A02;
                if (str3 != null) {
                    AnonymousClass00H r03 = ((RequestPermissionsBottomSheet) this.A01).A06;
                    if (r03 != null) {
                        ((A8V) r03.get()).A0I(str3, "not_now");
                    } else {
                        C18070vi.A11("funnelLogger");
                        throw null;
                    }
                }
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                dialogFragment.A28();
                C72463Mc.A1A(dialogFragment);
                return;
            default:
                AnonymousClass46m r3 = (AnonymousClass46m) this.A01;
                r3.A05.A00(4);
                C72453Mb.A18(r3.getContext(), r3.A00, this.A02);
                return;
        }
        conversationAttachmentContentView.A0D.A0I(str, false);
    }

    public C825348i(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
