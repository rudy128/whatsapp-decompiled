package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5tQ  reason: invalid class name and case insensitive filesystem */
public final class C115115tQ extends C112205l6 {
    public AnonymousClass6RQ A00 = AnonymousClass6RQ.LIST;
    public boolean A01;
    public final C57642jP A02;
    public final C136486tt A03;
    public final C127026dg A04;
    public final C1598486c A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115115tQ(C57642jP r2, C136486tt r3, C127026dg r4, C1598486c r5, List list) {
        super(list);
        C18070vi.A0d(list, 1);
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A002;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            C136486tt r3 = this.A03;
            C1598486c r2 = this.A05;
            int i2 = this.A00.layoutId;
            return new C115845vs(C108995ce.A0K(i2, viewGroup), this.A02, r3, r2);
        } else if (i != 1) {
            switch (i) {
                case 6:
                    List list2 = C42011xT.A0I;
                    return new C115805vo(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624165, false), this.A04);
                case 7:
                    List list3 = C42011xT.A0I;
                    return new C115885vz(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624311, false));
                case 8:
                    List list4 = C42011xT.A0I;
                    return new C115815vp(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624312, false), this.A05);
                case 9:
                    List list5 = C42011xT.A0I;
                    return new C115835vr(C108995ce.A0K(this.A00.layoutId, viewGroup), this.A03, this.A05);
                default:
                    throw new AssertionError(AnonymousClass001.A1I("Unknown view type ", AnonymousClass000.A10(), i));
            }
        } else {
            List list6 = C42011xT.A0I;
            int i3 = this.A00.layoutId;
            if (this.A01) {
                A002 = AnonymousClass3MZ.A0D(viewGroup).inflate(i3, viewGroup, false);
            } else {
                A002 = C123786Vv.A00(viewGroup, i3);
            }
            C18070vi.A0b(A002);
            return new C115825vq(A002);
        }
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C112935mH r22 = (C112935mH) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B(false);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        C115885vz r42 = (C115885vz) r4;
        C18070vi.A0d(r42, 0);
        AnonymousClass8B7 r2 = (AnonymousClass8B7) this.A00.get(i);
        if (r42 instanceof C115835vr) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.ChatHistory");
            ((C115835vr) r42).A0C((C143287Cu) r2);
        } else if (r42 instanceof C115845vs) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.LoadedBot");
            ((C115845vs) r42).A0C((C143307Cw) r2);
        } else if (r42 instanceof C115825vq) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.BotShimmer");
            ((C115825vq) r42).A0C((C143327Cy) r2);
        } else if (r42 instanceof C115805vo) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.Explore");
            C18070vi.A0d(r2, 0);
            TextEmojiLabel textEmojiLabel = r42.A03;
            if (textEmojiLabel != null) {
                textEmojiLabel.setText(r42.A0H.getResources().getText(2131886619));
            }
            TextView textView = r42.A01;
            if (textView != null) {
                textView.setText(r42.A0H.getResources().getText(2131886618));
            }
            AnonymousClass3MZ.A1I(r42.A0H, r42, 47);
        } else if (r42 instanceof C115815vp) {
            C115815vp r43 = (C115815vp) r42;
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.ErrorItem");
            C143277Ct r22 = (C143277Ct) r2;
            C18070vi.A0d(r22, 0);
            r43.A01.setText(r22.A00);
            WaTextView waTextView = r43.A00;
            waTextView.setText(2131895332);
            AnonymousClass3MZ.A1I(waTextView, r43, 46);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A00.get(i);
        if (obj instanceof C143287Cu) {
            return 9;
        }
        if (obj instanceof C143307Cw) {
            return 0;
        }
        if (obj instanceof C143327Cy) {
            return 1;
        }
        if (obj instanceof C143267Cs) {
            return 6;
        }
        if (obj instanceof C143297Cv) {
            return 7;
        }
        if (!(obj instanceof C143277Ct)) {
            return 0;
        }
        return 8;
    }
}
