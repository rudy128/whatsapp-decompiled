package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.3ru  reason: invalid class name and case insensitive filesystem */
public class C77973ru extends C78023rz implements C108915cV {
    public PinInChatBannerMultiplePinsIndicator A00;
    public final AnonymousClass4MM A01;
    public final C79833w6 A02;
    public final C18030ve A03;
    public final PinInChatBannerViewModel A04;
    public final AnonymousClass4XQ A05;

    public C77973ru(C108885cS r5, AnonymousClass4MM r6, C79833w6 r7, C18030ve r8, PinInChatBannerViewModel pinInChatBannerViewModel, AnonymousClass4XQ r10, C28931bI r11) {
        super(r5, r11, 50);
        this.A03 = r8;
        this.A05 = r10;
        this.A02 = r7;
        this.A01 = r6;
        this.A04 = pinInChatBannerViewModel;
        if (r6.A01) {
            AnonymousClass1DT r2 = pinInChatBannerViewModel.A01;
            C108885cS r3 = this.A01;
            C91624fz.A01(r3.CFa(), r2, this, 31);
            C91624fz.A01(r3.CFa(), pinInChatBannerViewModel.A03, this, 32);
        }
        C41731wy r22 = this.A04.A04;
        if (r22.A00 <= 0) {
            C91624fz.A01(C98524rI.A03(this), r22, this, 33);
        }
    }

    public static void A00(C77973ru r5, AnonymousClass206 r6) {
        C28931bI r3 = r5.A01;
        C89904dD.A00(r3.A02(), r5, 12);
        C90284dp.A00(r3.A02(), r5, r6, 4);
        AnonymousClass4XQ r2 = r5.A05;
        View A022 = r3.A02();
        C18070vi.A0d(A022, 1);
        int i = r6.A0u;
        C437120q r4 = (C437120q) ((AnonymousClass20Z) r2.A03.getValue()).A00(i);
        if (r4.Bfs(r6) || r4.CS5()) {
            TextEmojiLabel A0c = C72453Mb.A0c(A022, 2131433853);
            View findViewById = A022.findViewById(2131433858);
            if (findViewById == null) {
                findViewById = A022.findViewById(2131433857);
                findViewById.setVisibility(8);
            }
            View findViewById2 = A022.findViewById(2131433856);
            if (findViewById2 == null) {
                findViewById2 = A022.findViewById(2131433855);
                findViewById2.setVisibility(8);
            }
            C18070vi.A0b(findViewById);
            C135396s8 r1 = new C135396s8(findViewById, findViewById2, A0c);
            A0c.setTextDirection(5);
            r4.CFC(r1, r6);
            return;
        }
        r2.A00.A0G("pin-in-chat-unexpected-render", String.valueOf(i), false);
    }

    public void A0B(AnonymousClass4TQ r5) {
        int i;
        C28931bI r3 = this.A01;
        if (r3.A02().findViewById(2131433854) == null) {
            ((ViewGroup) r3.A02()).removeAllViews();
            int i2 = 2131626465;
            if (AnonymousClass1J8.A02(this.A03)) {
                i2 = 2131626468;
            }
            A0A(i2);
            this.A00 = (PinInChatBannerMultiplePinsIndicator) AnonymousClass1HF.A06(r3.A02(), 2131433854);
        }
        AnonymousClass206 r0 = r5.A01;
        if (r0 != null) {
            A00(this, r0);
            C86974Tu r32 = r5.A00;
            PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator = this.A00;
            if (pinInChatBannerMultiplePinsIndicator != null) {
                if (r32.A01 <= 1) {
                    i = 4;
                } else {
                    pinInChatBannerMultiplePinsIndicator.setupIndicator(r32);
                    pinInChatBannerMultiplePinsIndicator = this.A00;
                    i = 0;
                }
                pinInChatBannerMultiplePinsIndicator.setVisibility(i);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BD4(AnonymousClass5Z8 r1, Object obj) {
        A0B((AnonymousClass4TQ) obj);
    }

    public /* bridge */ /* synthetic */ boolean BEC(Object obj) {
        AnonymousClass4TQ r3 = (AnonymousClass4TQ) obj;
        if (r3 == null || r3.A01 == null) {
            return false;
        }
        return true;
    }
}
