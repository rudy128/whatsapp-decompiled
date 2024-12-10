package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.3rz  reason: invalid class name and case insensitive filesystem */
public abstract class C78023rz extends C98524rI {
    public final float A00;
    public final C28931bI A01;
    public final C18100vl A02;

    public static final void A02(C78023rz r8, AnonymousClass5Z8 r9) {
        C28931bI r4 = r8.A01;
        if (((ViewGroup) AnonymousClass3MX.A0D(r4)).getVisibility() != 8) {
            C003401n supportActionBar = C98524rI.A03(r8).getSupportActionBar();
            if (supportActionBar != null) {
                float A07 = supportActionBar.A07();
                float f = r8.A00;
                if (A07 != f) {
                    supportActionBar.A0J(f);
                    AnonymousClass1HF.A0W((ViewGroup) AnonymousClass3MX.A0D(r4), 0.0f);
                }
            }
            ((ViewGroup) AnonymousClass3MX.A0D(r4)).setVisibility(8);
            if (r8 instanceof C77953rs) {
                C77953rs r82 = (C77953rs) r8;
                AnonymousClass1BI chatJid = r82.A01.getChatJid();
                if ((chatJid instanceof C29681ch) && chatJid != null) {
                    int i = 4;
                    if (C77953rs.A01(r82)) {
                        i = 3;
                    }
                    AnonymousClass74D r5 = r82.A07;
                    long A0K = C72453Mb.A0K(r82.A0A);
                    C1185263u r2 = new C1185263u();
                    r2.A07 = chatJid.user;
                    r2.A00 = 2;
                    r2.A01 = Integer.valueOf(i);
                    r2.A02 = 2;
                    r2.A06 = Long.valueOf(A0K);
                    r5.A05.CC7(r2);
                }
            } else if (r8 instanceof C77973ru) {
                C77973ru r83 = (C77973ru) r8;
                PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator = r83.A00;
                if (pinInChatBannerMultiplePinsIndicator != null) {
                    pinInChatBannerMultiplePinsIndicator.setVisibility(4);
                    r83.A00 = null;
                }
                ((ViewGroup) r83.A01.A02()).removeAllViews();
                PinInChatBannerViewModel pinInChatBannerViewModel = r83.A04;
                Runnable runnable = pinInChatBannerViewModel.A00;
                if (runnable != null) {
                    pinInChatBannerViewModel.A02.A0I(runnable);
                }
                pinInChatBannerViewModel.A00 = null;
            } else if (r8 instanceof C77933rq) {
                C77933rq r84 = (C77933rq) r8;
                ((ViewGroup) r84.A01.A02()).removeAllViews();
                r84.A03 = true;
                r84.A01 = null;
                C98774rh.A01(r84.A06, r84, 31);
            }
            r9.Bvb();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78023rz(C108885cS r2, C28931bI r3, int i) {
        super(r2, i);
        C18070vi.A0j(r2, r3);
        this.A01 = r3;
        this.A00 = AnonymousClass3MY.A0J(r2.CFa()).A07();
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5N8(r2, this));
    }

    public final View A0A(int i) {
        return AnonymousClass3MX.A0B(C98524rI.A03(this).getLayoutInflater(), (ViewGroup) AnonymousClass3MX.A0D(this.A01), i, true);
    }
}
