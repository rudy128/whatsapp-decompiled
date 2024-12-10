package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3rV  reason: invalid class name and case insensitive filesystem */
public class C77803rV extends C75433hU {
    public int A00;
    public long A01;
    public Handler A02;
    public AnonymousClass1E7 A03;
    public Runnable A04;
    public ConversationTitleViewModel A05;
    public final C34511kb A06;
    public final C203411t A07;
    public final AnonymousClass1M9 A08;
    public final AnonymousClass11P A09;
    public final C19830z4 A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass1MZ A0C;
    public final AnonymousClass126 A0D;
    public final C42211xo A0E;
    public final AnonymousClass1EC A0F;
    public final AnonymousClass4SY A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass1F9 A0I;
    public final AnonymousClass1FD A0J;
    public final C19880zA A0K;
    public final AnonymousClass4R6 A0L;
    public final AnonymousClass3L6 A0M;
    public final C27141Uw A0N;
    public final AnonymousClass1LU A0O;
    public final AnonymousClass1PU A0P;

    private synchronized void A05(AnonymousClass1GV r4) {
        AnonymousClass1E7 r0 = this.A03;
        if (r0 != null) {
            r4.accept(r0);
        } else {
            this.A0g.CGF(new C146497Pi(this, r4, 34));
        }
    }

    private void A03() {
        C39331st r0;
        boolean z = true;
        int i = 0;
        if (this.A0M) {
            if (this.A0H.A04 <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A07;
            if (z) {
                r0 = new C39331st();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
            return;
        }
        WaImageView waImageView = this.A0F;
        if (waImageView != null) {
            if (this.A0H.A04 <= 0) {
                z = false;
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                this.A0F.setImageResource(2131231888);
            }
        }
    }

    private void A04() {
        C42111xd r0;
        AnonymousClass1E7 r5 = this.A0H;
        boolean z = true;
        boolean A1R = AnonymousClass000.A1R(r5.A04);
        if (this.A00 != 2 || !r5.A0n || A1R || !AnonymousClass3MX.A1Z(this.A0d)) {
            z = false;
        }
        if (this.A0M) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A07;
            if (z) {
                r0 = new C42111xd();
            } else if (!A1R) {
                r0 = null;
            } else {
                return;
            }
            wDSProfilePhoto.setProfileBadge(r0);
            return;
        }
        WaImageView waImageView = this.A0F;
        if (waImageView == null) {
            return;
        }
        if (z) {
            waImageView.setVisibility(0);
            this.A0F.setImageResource(2131233483);
        } else if (!A1R) {
            waImageView.setVisibility(8);
        }
    }

    public void A0H(AnonymousClass1E7 r3) {
        if (!this.A0C.A0J(this.A0F) || this.A00 != 3) {
            super.A0H(r3);
        } else {
            A05(new C91264fP(this, 5));
        }
    }

    public void A0I() {
        this.A00 = this.A0B.A06(this.A0F);
        super.A0I();
        this.A0L.A00();
        A03();
        A04();
    }

    public String BO6() {
        return "GroupConversationTitle";
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00 = this.A0B.A06(this.A0F);
        super.onActivityCreated(activity, bundle);
        this.A0N.A00(this.A0M);
    }

    public void onActivityPaused(Activity activity) {
        this.A0G.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r14.A0C.A0K(r14.A0F) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (((X.C32171gl) r1.A03()).Bey(r14.A0F) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0168, code lost:
        if ((!X.C18020vd.A05(r1, r2, 11474)) != false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C77803rV r14) {
        /*
            long r7 = java.lang.System.currentTimeMillis()
            r6 = 1
            r4 = 0
            r2 = 5000(0x1388, double:2.4703E-320)
            long r0 = r14.A01
            long r7 = r7 - r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r2 = 0
            if (r0 < 0) goto L_0x0011
            r2 = 1
        L_0x0011:
            X.0zA r1 = r14.A0K
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r1.A03()
            X.1gl r1 = (X.C32171gl) r1
            X.1EC r0 = r14.A0F
            boolean r1 = r1.Bey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r2 != 0) goto L_0x00b5
            if (r0 != 0) goto L_0x00b5
            X.1E7 r0 = r14.A0H
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x02fa
            int r1 = r14.A00
            r0 = 3
            if (r1 != r0) goto L_0x004b
            X.1MZ r1 = r14.A0C
            X.1EC r0 = r14.A0F
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0154
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            r0 = 2131893155(0x7f121ba3, float:1.9421079E38)
        L_0x0047:
            r1.setText(r0)
        L_0x004a:
            return
        L_0x004b:
            r0 = 2
            if (r1 == r0) goto L_0x007b
            r0 = 6
            if (r1 == r0) goto L_0x007b
            X.0ve r3 = r14.A0d
            r0 = 6843(0x1abb, float:9.589E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0069
            r0 = 11474(0x2cd2, float:1.6078E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0069
            goto L_0x016a
        L_0x0069:
            X.1E7 r0 = r14.A0H
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0096
            X.1MZ r1 = r14.A0C
            X.1EC r0 = r14.A0F
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0096
            goto L_0x0124
        L_0x007b:
            com.whatsapp.TextEmojiLabel r0 = r14.A0C
            X.AnonymousClass3MW.A1S(r0)
            X.1kb r2 = r14.A06
            X.1EC r1 = r14.A0F
            int r0 = r14.A00
            boolean r0 = r2.A0W(r1, r0)
            if (r0 == 0) goto L_0x004a
            r1 = 4
            X.4fP r0 = new X.4fP
            r0.<init>(r14, r1)
            r14.A05(r0)
            return
        L_0x0096:
            r0 = 12061(0x2f1d, float:1.6901E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0301
            r0 = 10862(0x2a6e, float:1.5221E-41)
            int r0 = X.C18020vd.A00(r2, r3, r0)
            if (r0 < r6) goto L_0x0301
            X.0z4 r3 = r14.A0A
            r1 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            java.lang.String r0 = "last_tapped_for_group_info_timestamp"
            boolean r0 = r3.A2b(r0, r1)
            if (r0 != 0) goto L_0x0301
        L_0x00b5:
            X.0ve r12 = r14.A0d
            r0 = 11474(0x2cd2, float:1.6078E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r12, r0)
            r0 = r0 ^ 1
            r9 = 3
            if (r0 == 0) goto L_0x0105
            int r0 = r14.A00
            if (r0 != r9) goto L_0x00d3
            X.1MZ r1 = r14.A0C
            X.1EC r0 = r14.A0F
            boolean r0 = r1.A0K(r0)
            r8 = 1
            if (r0 == 0) goto L_0x00d4
        L_0x00d3:
            r8 = 0
        L_0x00d4:
            X.00H r11 = r14.A0H
            java.lang.Object r10 = r11.get()
            X.2ri r10 = (X.C62632ri) r10
            com.whatsapp.TextEmojiLabel r3 = r14.A0C
            X.1E7 r2 = r14.A0H
            long r0 = r14.A01
            int r7 = r14.A00
            X.C18070vi.A0d(r3, r4)
            boolean r2 = X.C62632ri.A00(r10, r2)
            if (r2 == 0) goto L_0x0105
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            if (r7 == 0) goto L_0x0105
            if (r2 == 0) goto L_0x0105
            int r7 = r7.intValue()
            if (r9 != r7) goto L_0x0134
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x013a
        L_0x0105:
            r0 = 10056(0x2748, float:1.4091E-41)
            int r0 = X.C36301nf.A00(r12, r0, r4)
            if (r0 <= 0) goto L_0x012b
            r3 = 0
        L_0x010e:
            X.1E7 r1 = r14.A0H
            boolean r0 = r1.A0j
            if (r0 != 0) goto L_0x02fa
            if (r3 == 0) goto L_0x011c
            com.whatsapp.TextEmojiLabel r2 = r14.A0C
        L_0x0118:
            r2.setText(r3)
            return
        L_0x011c:
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x017b
            int r0 = r14.A00
            if (r0 == r9) goto L_0x017b
        L_0x0124:
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            r0 = 2131893153(0x7f121ba1, float:1.9421074E38)
            goto L_0x0047
        L_0x012b:
            X.1xn r1 = r14.A0V
            X.1E7 r0 = r14.A0H
            java.lang.String r3 = r1.A00(r0)
            goto L_0x010e
        L_0x0134:
            r2 = 2
            if (r7 == r2) goto L_0x013a
            r2 = 6
            if (r7 != r2) goto L_0x0105
        L_0x013a:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r0
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            android.text.SpannableStringBuilder r3 = r10.A01(r3)
            java.lang.Object r2 = r11.get()
            X.2ri r2 = (X.C62632ri) r2
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            android.view.View r0 = r14.A02
            goto L_0x0177
        L_0x0154:
            X.0ve r2 = r14.A0d
            r0 = 6843(0x1abb, float:9.589E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x019c
            r0 = 11474(0x2cd2, float:1.6078E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019c
        L_0x016a:
            X.00H r0 = r14.A0H
            java.lang.Object r2 = r0.get()
            X.2ri r2 = (X.C62632ri) r2
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            android.view.View r0 = r14.A02
            r3 = 0
        L_0x0177:
            r2.A04(r0, r1, r3)
            return
        L_0x017b:
            X.4R6 r4 = r14.A0L
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x004a
            int r0 = r14.A00
            if (r0 != r9) goto L_0x01a3
            X.1xo r0 = r14.A0E
            boolean r0 = r0.A00(r1)
            if (r0 != 0) goto L_0x01a3
            X.126 r0 = r14.A0D
            int r0 = r0.A0I(r1)
            if (r0 == r6) goto L_0x01a3
            X.1MZ r1 = r14.A0C
            X.1EC r0 = r14.A0F
            r1.A0K(r0)
        L_0x019c:
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            r0 = 2131888507(0x7f12097b, float:1.9411651E38)
            goto L_0x0047
        L_0x01a3:
            X.1xo r2 = r14.A0E
            X.1E7 r0 = r14.A0H
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x004a
            X.1E7 r1 = r14.A0H
            boolean r0 = r2.A00(r1)
            if (r0 != 0) goto L_0x004a
            X.126 r0 = r14.A0D
            int r0 = r0.A0I(r1)
            if (r0 == r6) goto L_0x004a
            X.4SY r3 = r14.A0G
            X.4md r0 = r3.A0E
            com.whatsapp.jid.GroupJid r8 = r3.A0F
            boolean r0 = r0.A01(r8)
            if (r0 != 0) goto L_0x0214
            X.1CJ r0 = r3.A0B
            boolean r0 = r0.A0R(r8)
            if (r0 != 0) goto L_0x0214
            X.0ve r2 = r3.A0D
            r0 = 10862(0x2a6e, float:1.5221E-41)
            int r0 = X.C18020vd.A00(r5, r2, r0)
            if (r0 < r6) goto L_0x0224
            long r0 = r3.A01
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01eb
            X.11P r0 = r3.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            r3.A01 = r0
        L_0x01eb:
            r0 = 12062(0x2f1e, float:1.6902E-41)
            int r7 = X.C18020vd.A00(r5, r2, r0)
            X.11P r0 = r3.A0A
            long r9 = X.AnonymousClass11P.A01(r0)
            long r0 = r3.A01
            long r9 = r9 - r0
            long r0 = (long) r7
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0224
            X.0vl r2 = r3.A0I
            java.lang.Object r6 = r2.getValue()
            android.os.Handler r6 = (android.os.Handler) r6
            X.4LE r5 = r3.A09
            r3 = 27
            X.AkF r2 = new X.AkF
            r2.<init>(r5, r3)
            long r0 = r0 - r9
            r6.postDelayed(r2, r0)
        L_0x0214:
            X.1E7 r0 = r14.A0H
            boolean r0 = X.C83804Gs.A00(r0)
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            if (r0 == 0) goto L_0x0308
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0224:
            X.1MZ r0 = r3.A0C
            X.1MW r0 = r0.A08
            X.1MS r0 = r0.A04
            X.2tp r0 = r0.A0A(r8)
            if (r0 == 0) goto L_0x0214
            X.10f r9 = r0.A07()
            r7 = 0
            if (r9 == 0) goto L_0x0214
            int r0 = r9.size()
            r3.A00 = r0
            int r0 = r9.size()
            boolean r0 = X.AnonymousClass4W4.A01(r2, r0)
            if (r0 == 0) goto L_0x0288
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0254
            X.1mk r1 = r3.A08
            X.1k3 r0 = r3.A07
            r1.registerObserver(r0)
            r3.A05 = r6
        L_0x0254:
            X.1Rj r12 = r3.A0H
            X.1IZ r13 = r9.iterator()
            r11 = 0
        L_0x025b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02b6
            X.1BI r1 = X.C17880vN.A0Q(r13)
            X.11S r0 = r12.A01
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x025b
            boolean r0 = X.AnonymousClass1E5.A00(r1)
            if (r0 != 0) goto L_0x025b
            java.util.concurrent.ConcurrentHashMap r0 = r12.A0F
            java.lang.Object r0 = r0.get(r1)
            X.1zh r0 = (X.C43371zh) r0
            if (r0 == 0) goto L_0x025b
            long r0 = r0.A05
            r9 = 1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x025b
            int r11 = r11 + 1
            goto L_0x025b
        L_0x0288:
            boolean r0 = r8 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0214
            int r0 = r9.size()
            boolean r0 = X.AnonymousClass4W4.A00(r2, r0)
            if (r0 == 0) goto L_0x0214
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x02a3
            X.1mk r1 = r3.A08
            X.1k3 r0 = r3.A07
            r1.registerObserver(r0)
            r3.A05 = r6
        L_0x02a3:
            X.1Rj r0 = r3.A0H
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0F
            java.lang.Object r0 = r0.get(r8)
            X.1zh r0 = (X.C43371zh) r0
            if (r0 == 0) goto L_0x02ba
            int r1 = r0.A00
            r0 = 2
            if (r1 < r0) goto L_0x02ba
            r7 = r1
            goto L_0x02ba
        L_0x02b6:
            if (r11 < r6) goto L_0x02ba
            int r7 = r11 + 1
        L_0x02ba:
            long r0 = (long) r7
            X.3zs r3 = r3.A03
            if (r3 == 0) goto L_0x02e7
            r6 = 11746(0x2de2, float:1.646E-41)
            boolean r2 = X.C18020vd.A05(r5, r2, r6)
            if (r2 == 0) goto L_0x02e7
            java.lang.Long r2 = r3.A07
            if (r2 != 0) goto L_0x02d1
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A07 = r2
        L_0x02d1:
            java.lang.Long r2 = r3.A09
            long r5 = X.C17900vP.A01(r2)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x02e1
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A09 = r2
        L_0x02e1:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A08 = r0
        L_0x02e7:
            if (r7 <= 0) goto L_0x0214
            com.whatsapp.TextEmojiLabel r2 = r14.A0C
            X.01E r0 = r14.A0U
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755078(0x7f100046, float:1.9141025E38)
            java.lang.String r3 = X.C72473Md.A0k(r1, r7, r0)
            goto L_0x0118
        L_0x02fa:
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            r0 = 2131898573(0x7f1230cd, float:1.9432068E38)
            goto L_0x0047
        L_0x0301:
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            r0 = 2131896770(0x7f1229c2, float:1.942841E38)
            goto L_0x0047
        L_0x0308:
            java.lang.String r0 = r4.A01
            r1.A0R(r0)
            com.whatsapp.TextEmojiLabel r1 = r14.A0C
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77803rV.A06(X.3rV):void");
    }

    public void A0J(Activity activity) {
        super.A0J(activity);
        if (this.A00 == 3) {
            C18000vb r3 = this.A0a;
            ViewGroup viewGroup = this.A04;
            Resources resources = this.A0U.getResources();
            C18070vi.A0X(resources);
            C27641Ww.A05(viewGroup, r3, resources.getDimensionPixelOffset(2131168774), 0);
        }
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) AnonymousClass3MW.A0N(this.A0J).A00(ConversationTitleViewModel.class);
        this.A05 = conversationTitleViewModel;
        C91624fz.A01(this.A0I, conversationTitleViewModel.A01, this, 29);
        ConversationTitleViewModel conversationTitleViewModel2 = this.A05;
        conversationTitleViewModel2.A03.A0A(this.A0f);
        conversationTitleViewModel2.A05.get();
        conversationTitleViewModel2.A01.A0F(new Object());
        A0E(new C90004dN(this, activity, 43));
        AnonymousClass1Y5.A02(this.A04, 2131886188);
        A03();
        A04();
    }

    public /* synthetic */ void A0K(AnonymousClass1E7 r1) {
        super.A0H(r1);
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        super.onActivityDestroyed(activity);
        Handler handler = this.A02;
        if (!(handler == null || (runnable = this.A04) == null)) {
            handler.removeCallbacks(runnable);
        }
        AnonymousClass4SY r2 = this.A0G;
        if (r2.A05) {
            r2.A08.unregisterObserver(r2.A07);
            r2.A05 = false;
        }
        C26241Rj r0 = r2.A0H;
        r0.A0E.remove(r2.A0G);
        C72473Md.A1P(r2.A0I);
        this.A0N.A01(this.A0M);
        AnonymousClass4R6 r3 = this.A0L;
        AnonymousClass49P r22 = r3.A00;
        if (r22 != null) {
            r22.A0B(false);
            Handler handler2 = r22.A00;
            if (handler2 != null) {
                handler2.removeCallbacks(r22.A01);
            }
            r22.A00 = null;
            r22.A01 = null;
            r3.A00 = null;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0d, 11474)) {
            ((C62632ri) this.A0H.get()).A03();
        }
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        this.A0G.A01();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77803rV(X.AnonymousClass01E r38, X.AnonymousClass1F9 r39, X.AnonymousClass1FD r40, X.C19880zA r41, X.C42201xn r42, X.AnonymousClass4JN r43, X.AnonymousClass1KB r44, X.AnonymousClass11S r45, X.C72043Kk r46, X.AnonymousClass4ZR r47, X.C39511tC r48, X.C35751mk r49, X.C34511kb r50, X.C32111gf r51, X.AnonymousClass1VW r52, X.AnonymousClass1M9 r53, X.C24671Lf r54, X.C24921Me r55, X.C27191Vc r56, X.C27171Va r57, X.AnonymousClass11P r58, X.C19830z4 r59, X.C18000vb r60, X.AnonymousClass1Q1 r61, X.AnonymousClass1CJ r62, X.C25181Nf r63, X.AnonymousClass1MZ r64, X.AnonymousClass1E7 r65, X.AnonymousClass1KW r66, X.C18030ve r67, X.AnonymousClass126 r68, X.C27141Uw r69, X.C25191Ng r70, X.C42211xo r71, X.AnonymousClass1LT r72, X.AnonymousClass1LU r73, X.AnonymousClass1EC r74, X.AnonymousClass1PU r75, X.AnonymousClass1DC r76, X.AnonymousClass10I r77, X.AnonymousClass00H r78) {
        /*
            r37 = this;
            r24 = 0
            r9 = r37
            r28 = r66
            r27 = r65
            r26 = r63
            r25 = r61
            r23 = r60
            r22 = r57
            r21 = r56
            r4 = r55
            r29 = r67
            r10 = r38
            r30 = r70
            r11 = r42
            r31 = r72
            r12 = r44
            r6 = r74
            r13 = r45
            r0 = r75
            r14 = r46
            r34 = r76
            r15 = r47
            r2 = r77
            r16 = r48
            r17 = r49
            r18 = r52
            r19 = r54
            r32 = r6
            r33 = r0
            r35 = r2
            r36 = r24
            r20 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r58
            r9.A09 = r1
            r1 = r73
            r9.A0O = r1
            r1 = r53
            r9.A08 = r1
            r1 = r51
            r9.A07 = r1
            r1 = r59
            r9.A0A = r1
            r1 = r50
            r9.A06 = r1
            r1 = r69
            r9.A0N = r1
            r1 = r64
            r9.A0C = r1
            r9.A0F = r6
            r1 = r62
            r9.A0B = r1
            r9.A0P = r0
            r0 = r71
            r9.A0E = r0
            r0 = r68
            r9.A0D = r0
            r0 = r40
            r9.A0J = r0
            r0 = r39
            r9.A0I = r0
            r3 = r78
            r9.A0H = r3
            r0 = r41
            r9.A0K = r0
            r0 = 0
            X.4kW r1 = new X.4kW
            r1.<init>(r9, r0)
            X.4R6 r0 = new X.4R6
            r0.<init>(r4, r1, r6, r2)
            r9.A0L = r0
            X.0ve r2 = r9.A0d
            r1 = 11474(0x2cd2, float:1.6078E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ac
            r0 = 1
            X.4kV r1 = new X.4kV
            r1.<init>(r9, r0)
            java.lang.Object r0 = r3.get()
            X.2ri r0 = (X.C62632ri) r0
            r0.A03 = r1
        L_0x00ac:
            X.4LE r7 = new X.4LE
            r7.<init>(r9)
            r0 = r43
            X.1K2 r1 = r0.A00
            X.10E r8 = r1.A01
            X.11P r13 = X.AnonymousClass10E.A6O(r8)
            X.0ve r16 = X.AnonymousClass10E.A8r(r8)
            X.1CJ r14 = X.AnonymousClass3Ma.A0d(r8)
            X.18K r17 = X.AnonymousClass3Ma.A0g(r8)
            X.00S r0 = r8.A8b
            java.lang.Object r5 = r0.get()
            X.1Rj r5 = (X.C26241Rj) r5
            X.1K1 r0 = r1.A00
            X.00S r0 = r0.A0c
            java.lang.Object r4 = r0.get()
            X.4md r4 = (X.C95684md) r4
            X.00S r0 = r8.A4Z
            java.lang.Object r3 = r0.get()
            X.1Oe r3 = (X.C25431Oe) r3
            X.00S r0 = r8.A2F
            java.lang.Object r2 = r0.get()
            X.1mk r2 = (X.C35751mk) r2
            X.00S r0 = r8.ABr
            java.lang.Object r1 = r0.get()
            X.1Nl r1 = (X.C25241Nl) r1
            X.1MZ r15 = X.AnonymousClass3MY.A0V(r8)
            X.4SY r0 = new X.4SY
            r10 = r0
            r11 = r2
            r12 = r7
            r18 = r1
            r19 = r4
            r20 = r6
            r21 = r5
            r22 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9.A0G = r0
            r1 = 8
            X.4nc r0 = new X.4nc
            r0.<init>(r9, r1)
            r9.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77803rV.<init>(X.01E, X.1F9, X.1FD, X.0zA, X.1xn, X.4JN, X.1KB, X.11S, X.3Kk, X.4ZR, X.1tC, X.1mk, X.1kb, X.1gf, X.1VW, X.1M9, X.1Lf, X.1Me, X.1Vc, X.1Va, X.11P, X.0z4, X.0vb, X.1Q1, X.1CJ, X.1Nf, X.1MZ, X.1E7, X.1KW, X.0ve, X.126, X.1Uw, X.1Ng, X.1xo, X.1LT, X.1LU, X.1EC, X.1PU, X.1DC, X.10I, X.00H):void");
    }
}
