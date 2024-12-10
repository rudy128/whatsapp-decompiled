package X;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5tP  reason: invalid class name and case insensitive filesystem */
public final class C115105tP extends C112205l6 {
    public final C57642jP A00;
    public final C128296fl A01;
    public final C1598486c A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115105tP(C57642jP r2, C128296fl r3, C1598486c r4, List list, Map map) {
        super(list);
        C18070vi.A0f(list, 1, map);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = map;
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C122626Rc r3;
        C128296fl r0;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            C128296fl r02 = this.A01;
            C122626Rc r4 = C122626Rc.A05;
            HashMap hashMap = r02.A02;
            C136486tt r32 = (C136486tt) hashMap.get(r4);
            if (r32 == null) {
                r32 = r02.A01.A00(r02.A00, r4);
                hashMap.put(r4, r32);
            }
            C1598486c r2 = this.A02;
            int i2 = AnonymousClass6RQ.LIST.layoutId;
            return new C115845vs(C108995ce.A0K(i2, viewGroup), this.A00, r32, r2);
        } else if (i != 1) {
            if (i == 2) {
                List list2 = C42011xT.A0I;
                r0 = this.A01;
                r3 = C122626Rc.A02;
            } else if (i == 3) {
                List list3 = C42011xT.A0I;
                r0 = this.A01;
                r3 = C122626Rc.A03;
            } else if (i == 4) {
                List list4 = C42011xT.A0I;
                C1598486c r22 = this.A02;
                C18070vi.A0d(r22, 1);
                return new C115865vx(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624167, false), r22);
            } else if (i == 5) {
                List list5 = C42011xT.A0I;
                return new C115855vw(C123786Vv.A00(viewGroup, 2131624167));
            } else if (i == 8) {
                List list6 = C42011xT.A0I;
                return new C115815vp(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624312, false), this.A02);
            } else {
                throw new AssertionError(AnonymousClass001.A1I("Unknown view type ", AnonymousClass000.A10(), i));
            }
            HashMap hashMap2 = r0.A02;
            C136486tt r7 = (C136486tt) hashMap2.get(r3);
            if (r7 == null) {
                r7 = r0.A01.A00(r0.A00, r3);
                hashMap2.put(r3, r7);
            }
            C1598486c r8 = this.A02;
            C57642jP r6 = this.A00;
            Map map = this.A03;
            C18070vi.A0d(r8, 2);
            return new C115875vy(C123786Vv.A00(viewGroup, 2131624164), r6, r7, r8, map);
        } else {
            List list7 = C42011xT.A0I;
            ShimmerFrameLayout A002 = C123786Vv.A00(viewGroup, AnonymousClass6RQ.LIST.layoutId);
            C18070vi.A0b(A002);
            return new C115825vq(A002);
        }
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C112935mH r22 = (C112935mH) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B(false);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C112935mH r62 = (C112935mH) r6;
        C18070vi.A0d(r62, 0);
        C1594084k r2 = (C1594084k) this.A00.get(i);
        if (r62 instanceof C115835vr) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.ChatHistory");
            ((C115835vr) r62).A0C((C143287Cu) r2);
        } else if (r62 instanceof C115845vs) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.LoadedBot");
            ((C115845vs) r62).A0C((C143307Cw) r2);
        } else if (r62 instanceof C115825vq) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.BotShimmer");
            ((C115825vq) r62).A0C((C143327Cy) r2);
        } else if (r62 instanceof C115875vy) {
            C115875vy r63 = (C115875vy) r62;
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section");
            C143257Cr r22 = (C143257Cr) r2;
            C18070vi.A0d(r22, 0);
            r63.A00 = r22;
            C115115tQ r1 = r63.A02;
            r1.A00 = r22.A00;
            boolean z = r22.A04;
            r1.A01 = z;
            r1.A0X(r22.A03);
            C38251qy layoutManager = r63.A01.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.A19((Parcelable) r63.A03.get(r22.A01));
            }
            r63.A0B(z);
        } else if (r62 instanceof C115865vx) {
            C115865vx r64 = (C115865vx) r62;
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.Header");
            C143247Cq r23 = (C143247Cq) r2;
            C18070vi.A0d(r23, 0);
            TextView textView = r64.A00;
            C143257Cr r12 = r23.A00;
            textView.setText(r12.A02);
            boolean z2 = r12.A05;
            WDSButton wDSButton = r64.A02;
            if (z2) {
                wDSButton.setVisibility(0);
                AnonymousClass78Q.A00(wDSButton, r64, r23, 44);
                return;
            }
            wDSButton.setVisibility(8);
        } else if (r62 instanceof C115855vw) {
            C115855vw r65 = (C115855vw) r62;
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.HeaderShimmer");
            C143317Cx r24 = (C143317Cx) r2;
            C18070vi.A0d(r24, 0);
            r65.A00.setText(r24.A00);
            r65.A0B(true);
        } else if (r62 instanceof C115815vp) {
            C115815vp r66 = (C115815vp) r62;
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.bot.discovery.LoadedDiscoveryBots.Section.ErrorItem");
            C143277Ct r25 = (C143277Ct) r2;
            C18070vi.A0d(r25, 0);
            r66.A01.setText(r25.A00);
            WaTextView waTextView = r66.A00;
            waTextView.setText(2131895332);
            AnonymousClass3MZ.A1I(waTextView, r66, 46);
        }
    }

    public int getItemViewType(int i) {
        C1594084k r1 = (C1594084k) this.A00.get(i);
        if (r1 instanceof C143307Cw) {
            return 0;
        }
        if (r1 instanceof C143327Cy) {
            return 1;
        }
        if (r1 instanceof C143247Cq) {
            return 4;
        }
        if (r1 instanceof C143257Cr) {
            if (((C143257Cr) r1).A00 == AnonymousClass6RQ.CAROUSEL_LARGE) {
                return 2;
            }
            return 3;
        } else if (r1 instanceof C143317Cx) {
            return 5;
        } else {
            if (!(r1 instanceof C143277Ct)) {
                return 0;
            }
            return 8;
        }
    }
}
