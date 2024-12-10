package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity;
import com.whatsapp.payments.ui.BrazilPixInfoAddedBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.Azk  reason: case insensitive filesystem */
public final class C22230Azk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22230Azk(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        DialogFragment brazilPixInfoAddedBottomSheet;
        AnonymousClass1GP supportFragmentManager;
        String str2;
        C198179xu r8 = (C198179xu) obj;
        C18070vi.A0d(r8, 0);
        int i = r8.A00;
        if (i == 0) {
            BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity = this.this$0;
            if (brazilPaymentPixOnboardingActivity.A00 != null) {
                String str3 = brazilPaymentPixOnboardingActivity.A07;
                if (str3 != null && !str3.equals("merchant_payment_upsell_prompt")) {
                    AnonymousClass1QO r0 = brazilPaymentPixOnboardingActivity.A03;
                    if (r0 != null) {
                        if (C18020vd.A05(C18040vf.A02, r0.A02, 7857)) {
                            if (C18070vi.A18(this.this$0.A07, "chat_attachment")) {
                                BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity2 = this.this$0;
                                Object obj2 = r8.A01;
                                C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.data.payments.PixKey");
                                C20339AGv.A00(brazilPaymentPixOnboardingActivity2, ((AnonymousClass8FL) AnonymousClass3MW.A0N(brazilPaymentPixOnboardingActivity2).A00(BrazilSendPixKeyViewModel.class)).A00, new C22229Azj(brazilPaymentPixOnboardingActivity2), 35);
                                String str4 = brazilPaymentPixOnboardingActivity2.A07;
                                UserJid userJid = brazilPaymentPixOnboardingActivity2.A01;
                                C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
                                brazilPixInfoAddedBottomSheet = AnonymousClass9RH.A00((C194929sW) obj2, userJid, str4, "add_non_native_p2m_payment_method", (String) null);
                                supportFragmentManager = brazilPaymentPixOnboardingActivity2.getSupportFragmentManager();
                                str2 = "BrazilPixSendKeyBottomSheet";
                            } else {
                                BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity3 = this.this$0;
                                String str5 = brazilPaymentPixOnboardingActivity3.A07;
                                String str6 = brazilPaymentPixOnboardingActivity3.A05;
                                brazilPixInfoAddedBottomSheet = new BrazilPixInfoAddedBottomSheet();
                                Bundle A0D = C17880vN.A0D();
                                A0D.putInt("payment_account_type", 6);
                                A0D.putString("referral_screen", str5);
                                A0D.putString("campaign_id", str6);
                                brazilPixInfoAddedBottomSheet.A1R(A0D);
                                brazilPixInfoAddedBottomSheet.A2D(false);
                                supportFragmentManager = brazilPaymentPixOnboardingActivity3.getSupportFragmentManager();
                                str2 = "BrazilPixInfoAddedBottomSheet";
                            }
                            C20098A7b.A03(brazilPixInfoAddedBottomSheet, supportFragmentManager, str2);
                        }
                    } else {
                        str = "paymentsGatingManager";
                    }
                }
                BrazilPaymentPixOnboardingActivity.A03(this.this$0);
            } else {
                str = "smbQuickReplyRepository";
            }
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            Log.e("BrazilPaymentPixOnboardingActivity/onCreate failed to create pix key");
        }
        return C27621Wu.A00;
    }
}
