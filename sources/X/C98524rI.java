package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4rI  reason: invalid class name and case insensitive filesystem */
public abstract class C98524rI implements Comparable {
    public final int A00;
    public final C108885cS A01;

    public C98524rI(C108885cS r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public static AnonymousClass1FY A03(C98524rI r0) {
        return r0.A01.CFa();
    }

    public View A04() {
        if (this instanceof C77983rv) {
            return ((C77983rv) this).A00;
        }
        if (this instanceof C77993rw) {
            return ((C77993rw) this).A00;
        }
        if (this instanceof C78003rx) {
            return ((C78003rx) this).A01;
        }
        if (this instanceof AnonymousClass3s0) {
            return ((AnonymousClass3s0) this).A01;
        }
        if (this instanceof C78013ry) {
            return ((C78013ry) this).A00;
        }
        return (ViewGroup) AnonymousClass3MX.A0D(((C78023rz) this).A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0415  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C77983rv
            if (r0 == 0) goto L_0x00c7
            r4 = r13
            X.3rv r4 = (X.C77983rv) r4
            android.view.View r0 = r4.A00     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x0025
            X.1FY r0 = A03(r4)     // Catch:{ Exception -> 0x00aa }
            android.view.LayoutInflater r2 = r0.getLayoutInflater()     // Catch:{ Exception -> 0x00aa }
            r1 = 2131627159(0x7f0e0c97, float:1.8881575E38)
            android.view.ViewGroup r0 = r4.A03     // Catch:{ Exception -> 0x00aa }
            android.view.View r1 = r2.inflate(r1, r0)     // Catch:{ Exception -> 0x00aa }
            r0 = 2131435943(0x7f0b21a7, float:1.8493742E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ Exception -> 0x00aa }
            r4.A00 = r0     // Catch:{ Exception -> 0x00aa }
        L_0x0025:
            X.5YR r0 = r4.A02     // Catch:{ Exception -> 0x00aa }
            if (r0 == 0) goto L_0x0046
            android.view.ViewGroup r3 = r4.A03     // Catch:{ Exception -> 0x00aa }
            r0 = 2131435945(0x7f0b21a9, float:1.8493746E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r3, r0)     // Catch:{ Exception -> 0x00aa }
            X.9tI r1 = r4.A01     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x003a
            r0 = 0
            X.C90074dU.A01(r2, r4, r1, r0)     // Catch:{ Exception -> 0x00aa }
        L_0x003a:
            r0 = 2131435944(0x7f0b21a8, float:1.8493744E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r3, r0)     // Catch:{ Exception -> 0x00aa }
            r0 = 14
            X.C89904dD.A00(r1, r4, r0)     // Catch:{ Exception -> 0x00aa }
        L_0x0046:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r0 = "SurveyConversationBanner/show qp.IsNull="
            r2.append(r0)     // Catch:{ Exception -> 0x00aa }
            X.5YR r0 = r4.A02     // Catch:{ Exception -> 0x00aa }
            r1 = 1
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r2.append(r0)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r0 = " surveyInfo.isNull="
            r2.append(r0)     // Catch:{ Exception -> 0x00aa }
            X.9tI r0 = r4.A01     // Catch:{ Exception -> 0x00aa }
            if (r0 == 0) goto L_0x0064
            r1 = 0
        L_0x0064:
            java.lang.String r2 = X.AnonymousClass3MY.A0r(r2, r1)     // Catch:{ Exception -> 0x00aa }
            X.A6O r3 = r4.A06     // Catch:{ Exception -> 0x00aa }
            X.44e r1 = r4.A07     // Catch:{ Exception -> 0x00aa }
            com.whatsapp.jid.UserJid r0 = r4.A08     // Catch:{ Exception -> 0x00aa }
            X.0ve r5 = r4.A04     // Catch:{ Exception -> 0x00aa }
            X.AnonymousClass4GG.A00(r5, r3, r1, r0, r2)     // Catch:{ Exception -> 0x00aa }
            X.5YR r0 = r4.A02     // Catch:{ Exception -> 0x00aa }
            r2 = 8
            if (r0 == 0) goto L_0x00a2
            X.9tI r1 = r4.A01     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00a2
            r0 = 3
            r3.A05(r1, r0)     // Catch:{ Exception -> 0x00aa }
            X.5YR r3 = r4.A02     // Catch:{ Exception -> 0x00aa }
            if (r3 == 0) goto L_0x008e
            X.1o6 r2 = r4.A0A     // Catch:{ Exception -> 0x00aa }
            X.9Ik r1 = X.C179549Ik.IMPRESSION     // Catch:{ Exception -> 0x00aa }
            r0 = 11389(0x2c7d, float:1.596E-41)
            r2.A00(r1, r3, r0)     // Catch:{ Exception -> 0x00aa }
        L_0x008e:
            android.view.View r2 = r4.A00     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x00ef
            r1 = 4470(0x1176, float:6.264E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x00aa }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x009e
            r6 = 8
        L_0x009e:
            r2.setVisibility(r6)     // Catch:{ Exception -> 0x00aa }
            return
        L_0x00a2:
            android.view.View r0 = r4.A00     // Catch:{ Exception -> 0x00aa }
            if (r0 == 0) goto L_0x00ef
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x00aa }
            return
        L_0x00aa:
            r3 = move-exception
            X.A6O r2 = r4.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SurveyConversationBanner/show exception="
            r1.append(r0)
            java.lang.String r0 = X.C25359CeJ.A00(r3)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 0
            r2.A03(r0, r0, r1)
            return
        L_0x00c7:
            boolean r0 = r13 instanceof X.C77993rw
            if (r0 == 0) goto L_0x00f0
            r3 = r13
            X.3rw r3 = (X.C77993rw) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x00ef
            X.1FY r0 = A03(r3)
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131626233(0x7f0e08f9, float:1.8879696E38)
            android.view.ViewGroup r0 = r3.A01
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 2131433749(0x7f0b1915, float:1.8489292E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A00 = r0
            r3.A0A()
        L_0x00ef:
            return
        L_0x00f0:
            boolean r0 = r13 instanceof X.C78003rx
            if (r0 == 0) goto L_0x0129
            r3 = r13
            X.3rx r3 = (X.C78003rx) r3
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x00ef
            X.1FY r1 = A03(r3)
            X.C18070vi.A0X(r1)
            X.0ve r0 = X.AnonymousClass1J8.A00(r1)
            boolean r0 = X.AnonymousClass1J8.A02(r0)
            r2 = 2131626007(0x7f0e0817, float:1.8879238E38)
            if (r0 == 0) goto L_0x0112
            r2 = 2131626008(0x7f0e0818, float:1.887924E38)
        L_0x0112:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A03
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131433762(0x7f0b1922, float:1.8489319E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01 = r0
            X.C78003rx.A00(r3)
            return
        L_0x0129:
            boolean r0 = r13 instanceof X.AnonymousClass3s0
            if (r0 == 0) goto L_0x013d
            r5 = r13
            X.3s0 r5 = (X.AnonymousClass3s0) r5
            X.9Bw r0 = r5.A08
            r6 = 0
            if (r0 != 0) goto L_0x0358
            X.2mw r0 = r5.A07
            if (r0 != 0) goto L_0x0358
            r5.A06(r6)
            return
        L_0x013d:
            boolean r0 = r13 instanceof X.C78013ry
            if (r0 == 0) goto L_0x0192
            r3 = r13
            X.3ry r3 = (X.C78013ry) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x00ef
            X.1FY r1 = A03(r3)
            X.0ve r0 = X.AnonymousClass1J8.A00(r1)
            boolean r0 = X.AnonymousClass1J8.A02(r0)
            r2 = 2131624512(0x7f0e0240, float:1.8876206E38)
            if (r0 == 0) goto L_0x015c
            r2 = 2131624513(0x7f0e0241, float:1.8876208E38)
        L_0x015c:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A04
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131428980(0x7f0b0674, float:1.847962E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A00 = r0
            X.C78013ry.A00(r3)
            r5 = 1
            r6 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r9 = r5
            r11 = r5
            r12 = r6
            r7 = r5
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 4
            X.C74613c2.A00(r4, r3, r0)
            r0 = 400(0x190, double:1.976E-321)
            r4.setDuration(r0)
            android.view.View r0 = r3.A00
            X.C17960vV.A05(r0)
            r0.startAnimation(r4)
            return
        L_0x0192:
            r5 = r13
            X.3rz r5 = (X.C78023rz) r5
            X.1bI r4 = r5.A01
            android.view.View r0 = X.AnonymousClass3MX.A0D(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00ef
            android.view.View r0 = X.AnonymousClass3MX.A0D(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getChildCount()
            r3 = 0
            boolean r12 = X.AnonymousClass000.A1R(r0)
            boolean r0 = r5 instanceof X.C77953rs
            if (r0 == 0) goto L_0x022f
            r8 = r5
            X.3rs r8 = (X.C77953rs) r8
            X.1bI r0 = r8.A01
            android.view.View r0 = X.AnonymousClass3MX.A0D(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0 = 2131626959(0x7f0e0bcf, float:1.8881169E38)
            android.view.View r2 = r8.A0A(r0)
            r0 = 2131435454(0x7f0b1fbe, float:1.849275E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 13
            X.C89904dD.A00(r1, r8, r0)
            r0 = 2131435456(0x7f0b1fc0, float:1.8492755E38)
            androidx.recyclerview.widget.RecyclerView r7 = X.AnonymousClass3MX.A0Q(r2, r0)
            X.6l3 r6 = r8.A04
            X.1pZ r2 = r8.A05
            X.C18070vi.A0b(r7)
            X.1ki r0 = r8.A08
            r1 = 1
            X.7KN r0 = r6.A00(r7, r2, r0, r1)
            r8.A02 = r0
            r0.A00()
            r8.A00 = r7
            r8.A03 = r1
            X.C77953rs.A00(r8)
        L_0x01f8:
            X.1FY r0 = A03(r5)
            X.01n r1 = r0.getSupportActionBar()
            if (r1 == 0) goto L_0x0206
            r0 = 0
            r1.A0J(r0)
        L_0x0206:
            android.view.View r1 = X.AnonymousClass3MX.A0D(r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            float r0 = r5.A00
            X.AnonymousClass1HF.A0W(r1, r0)
            android.view.View r0 = X.AnonymousClass3MX.A0D(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setVisibility(r3)
            if (r12 == 0) goto L_0x00ef
            android.view.View r3 = X.AnonymousClass3MX.A0D(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 29
            X.4rh r2 = new X.4rh
            r2.<init>(r5, r0)
            r0 = 10
            r3.postDelayed(r2, r0)
            return
        L_0x022f:
            boolean r0 = r5 instanceof X.C77973ru
            if (r0 == 0) goto L_0x0255
            r6 = r5
            X.3ru r6 = (X.C77973ru) r6
            X.4MM r0 = r6.A01
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x01f8
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r1 = r6.A04
            X.1DT r0 = r1.A01
            X.206 r2 = X.AnonymousClass3MX.A0r(r0)
            X.1vp r0 = r1.A03
            java.lang.Object r1 = r0.A06()
            X.4Tu r1 = (X.C86974Tu) r1
            X.4TQ r0 = new X.4TQ
            r0.<init>(r1, r2)
            r6.A0B(r0)
            goto L_0x01f8
        L_0x0255:
            boolean r0 = r5 instanceof X.C77933rq
            if (r0 == 0) goto L_0x0291
            r7 = r5
            X.3rq r7 = (X.C77933rq) r7
            X.1bI r6 = r7.A01
            android.view.View r0 = r6.A02()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            boolean r0 = r7.A07
            r2 = 2131625512(0x7f0e0628, float:1.8878234E38)
            if (r0 == 0) goto L_0x0271
            r2 = 2131625513(0x7f0e0629, float:1.8878236E38)
        L_0x0271:
            X.1FY r0 = A03(r7)
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            android.view.View r0 = r6.A02()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131433758(0x7f0b191e, float:1.848931E38)
            android.view.View r0 = r1.findViewById(r0)
            r7.A01 = r0
            X.C77933rq.A00(r7)
            goto L_0x01f8
        L_0x0291:
            boolean r0 = r5 instanceof X.C77963rt
            if (r0 == 0) goto L_0x02a8
            r2 = r5
            X.3rt r2 = (X.C77963rt) r2
            X.4MM r0 = r2.A02
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x01f8
            X.1E7 r1 = r2.A00
            if (r1 == 0) goto L_0x01f8
            r0 = 0
            r2.BD4(r0, r1)
            goto L_0x01f8
        L_0x02a8:
            r6 = r5
            X.3rr r6 = (X.C77943rr) r6
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r6.A02
            if (r0 != 0) goto L_0x01f8
            android.widget.ImageView r0 = r6.A00
            if (r0 != 0) goto L_0x01f8
            X.1bI r9 = r6.A01
            android.view.View r0 = X.AnonymousClass3MX.A0D(r9)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r11 = 35
            X.48m r2 = new X.48m
            r2.<init>(r6, r11)
            X.1FY r8 = A03(r6)
            X.C18070vi.A0X(r8)
            X.1np r10 = r6.A07
            r1 = 2131887603(0x7f1205f3, float:1.9409818E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r7 = "learn-more"
            java.lang.String r1 = X.C17880vN.A0q(r8, r7, r0, r3, r1)
            X.7Pi r0 = new X.7Pi
            r0.<init>(r6, r8, r11)
            android.text.SpannableStringBuilder r7 = X.AnonymousClass3MY.A0A(r8, r10, r0, r1, r7)
            X.0ve r0 = r6.A06
            boolean r0 = X.AnonymousClass1J8.A02(r0)
            if (r0 == 0) goto L_0x031a
            r0 = 2131624717(0x7f0e030d, float:1.8876622E38)
            r6.A0A(r0)
            android.view.View r1 = X.AnonymousClass3MX.A0D(r9)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 2131430639(0x7f0b0cef, float:1.8482985E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r0
            r6.A02 = r0
            if (r0 == 0) goto L_0x0308
            r0.setText((java.lang.CharSequence) r7)
        L_0x0308:
            com.whatsapp.wds.components.banners.WDSBannerCompact r1 = r6.A02
            if (r1 == 0) goto L_0x0311
            r0 = 47
            X.C90004dN.A00(r1, r6, r8, r0)
        L_0x0311:
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r6.A02
            if (r0 == 0) goto L_0x01f8
            r0.setOnDismissListener((android.view.View.OnClickListener) r2)
            goto L_0x01f8
        L_0x031a:
            r0 = 2131624716(0x7f0e030c, float:1.887662E38)
            r6.A0A(r0)
            android.view.View r1 = X.AnonymousClass3MX.A0D(r9)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 2131430637(0x7f0b0ced, float:1.848298E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r1, r0)
            r6.A00 = r0
            android.view.View r1 = X.AnonymousClass3MX.A0D(r9)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 2131430638(0x7f0b0cee, float:1.8482983E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.text.ReadMoreTextView r0 = (com.whatsapp.text.ReadMoreTextView) r0
            r6.A01 = r0
            if (r0 == 0) goto L_0x0345
            r0.setText(r7)
        L_0x0345:
            com.whatsapp.text.ReadMoreTextView r0 = r6.A01
            if (r0 == 0) goto L_0x034f
            X.C72473Md.A1D(r0)
            X.C72473Md.A1C(r0)
        L_0x034f:
            android.widget.ImageView r0 = r6.A00
            if (r0 == 0) goto L_0x01f8
            r0.setOnClickListener(r2)
            goto L_0x01f8
        L_0x0358:
            android.view.View r0 = r5.A01
            if (r0 != 0) goto L_0x041f
            X.1VT r1 = r5.A0M
            X.1IV r0 = r5.A0L
            r1.registerObserver(r0)
            X.1FY r0 = A03(r5)
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r0 = 2131625769(0x7f0e0729, float:1.8878755E38)
            android.view.ViewGroup r1 = r5.A0C
            r2.inflate(r0, r1)
            r0 = 2131431899(0x7f0b11db, float:1.848554E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r1, r0)
            r5.A01 = r4
            if (r4 == 0) goto L_0x041f
            r0 = 2131433729(0x7f0b1901, float:1.8489252E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r4, r0)
            com.whatsapp.calling.PeerAvatarLayout r1 = (com.whatsapp.calling.PeerAvatarLayout) r1
            r5.A06 = r1
            if (r1 == 0) goto L_0x0391
            r0 = 2131167219(0x7f0707f3, float:1.7948705E38)
            r1.setFixedContactPhotoSizeRes(r0)
        L_0x0391:
            com.whatsapp.calling.PeerAvatarLayout r3 = r5.A06
            if (r3 == 0) goto L_0x03aa
            android.content.Context r2 = r3.getContext()
            r1 = 2130969015(0x7f0401b7, float:1.75467E38)
            r0 = 2131100115(0x7f0601d3, float:1.7812602E38)
            int r1 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r0 = 2131167218(0x7f0707f2, float:1.7948703E38)
            r3.A01 = r0
            r3.A00 = r1
        L_0x03aa:
            com.whatsapp.calling.PeerAvatarLayout r3 = r5.A06
            if (r3 == 0) goto L_0x03ba
            X.0ve r2 = r5.A0J
            r1 = 10911(0x2a9f, float:1.529E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3.A0G = r0
        L_0x03ba:
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r4, r0)
            r5.A05 = r0
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r4, r0)
            r5.A04 = r0
            r0 = 2131431864(0x7f0b11b8, float:1.848547E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r4, r0)
            r5.A0A = r0
            if (r0 == 0) goto L_0x03da
            r0.setEnabled(r6)
        L_0x03da:
            X.0ve r3 = r5.A0J
            r8 = 6121(0x17e9, float:8.577E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r8)
            if (r0 != 0) goto L_0x03ef
            r0 = 2131431865(0x7f0b11b9, float:1.8485471E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r4, r0)
            r5.A03 = r0
        L_0x03ef:
            X.9Bw r0 = r5.A08
            if (r0 == 0) goto L_0x04a7
            int r7 = r0.A07
            boolean r1 = r0.A0J
        L_0x03f7:
            com.whatsapp.wds.components.button.WDSButton r6 = r5.A0A
            if (r6 == 0) goto L_0x0406
            if (r7 == 0) goto L_0x042c
            r0 = 1
            if (r7 == r0) goto L_0x042c
            r0 = 2
            if (r7 == r0) goto L_0x0455
            r0 = 3
            if (r7 == r0) goto L_0x0455
        L_0x0406:
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A0A
            if (r1 == 0) goto L_0x040f
            r0 = 48
            X.C90004dN.A00(r1, r5, r4, r0)
        L_0x040f:
            boolean r0 = X.C40811vJ.A0X(r3)
            if (r0 == 0) goto L_0x041f
            r1 = 49
            X.4dN r0 = new X.4dN
            r0.<init>(r5, r4, r1)
            r4.setOnClickListener(r0)
        L_0x041f:
            X.10I r2 = r5.A0K
            r1 = 32
            X.4rh r0 = new X.4rh
            r0.<init>(r5, r1)
            r2.CGN(r0)
            return
        L_0x042c:
            boolean r0 = X.C18020vd.A05(r2, r3, r8)
            if (r0 == 0) goto L_0x043b
            r0 = 2131233133(0x7f08096d, float:1.8082395E38)
            if (r1 == 0) goto L_0x0458
            r0 = 2131233132(0x7f08096c, float:1.8082393E38)
            goto L_0x0458
        L_0x043b:
            r0 = 10911(0x2a9f, float:1.529E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x044c
            r0 = 2131231623(0x7f080387, float:1.8079332E38)
            if (r1 == 0) goto L_0x0458
            r0 = 2131231646(0x7f08039e, float:1.8079379E38)
            goto L_0x0458
        L_0x044c:
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r1 == 0) goto L_0x0458
            r0 = 2131232406(0x7f080696, float:1.808092E38)
            goto L_0x0458
        L_0x0455:
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
        L_0x0458:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0406
            int r8 = r0.intValue()
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0491
            X.0vl r7 = r5.A0N
            java.lang.Object r2 = r7.getValue()
            X.2mO r2 = (X.C59492mO) r2
            android.content.Context r1 = X.AnonymousClass3MY.A04(r6)
            r0 = 0
            X.28v r2 = r2.A00(r1, r8, r0)
            if (r2 == 0) goto L_0x0406
            java.lang.Object r1 = r7.getValue()
            X.2mO r1 = (X.C59492mO) r1
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r6)
            r1.A02 = r0
            r6.setIcon((android.graphics.drawable.Drawable) r2)
            r2.start()
            goto L_0x0406
        L_0x0491:
            X.0vl r1 = r5.A0N
            boolean r0 = r1.Bf6()
            if (r0 == 0) goto L_0x04a2
            java.lang.Object r0 = r1.getValue()
            X.2mO r0 = (X.C59492mO) r0
            r0.A02()
        L_0x04a2:
            r6.setIcon((int) r8)
            goto L_0x0406
        L_0x04a7:
            X.2mw r0 = r5.A07
            if (r0 == 0) goto L_0x0406
            r7 = 1
            int r1 = r0.A00
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            goto L_0x03f7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98524rI.A05():void");
    }

    public final void A06(boolean z) {
        C108885cS r1 = this.A01;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.conversation.banner.SupportsConversationBanners");
        C86414Rn conversationBanners = ((AnonymousClass5Z9) r1).getConversationBanners();
        Class<?> cls = getClass();
        C18070vi.A0d(cls, 0);
        C98524rI A002 = conversationBanners.A00.A00(cls);
        if (A002 != null && A002.equals(conversationBanners.A00())) {
            A002.Bcw(new C94414ka(A002, conversationBanners, 0), z);
        }
    }

    public final void A07(boolean z) {
        C108885cS r1 = this.A01;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.conversation.banner.SupportsConversationBanners");
        ((AnonymousClass5Z9) r1).getConversationBanners().A01(getClass(), z);
    }

    public boolean A08() {
        int i;
        C46162Dk r1;
        if (this instanceof C77983rv) {
            C77983rv r2 = (C77983rv) this;
            A6O a6o = r2.A06;
            C18070vi.A0d("SurveyConversationBanner/canShow without jidFilter", 0);
            a6o.A03((C134696r0) null, (C196009uJ) null, "SurveyConversationBanner/canShow without jidFilter");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SurveyConversationBanner/canShow qp.IsNull=");
            A10.append(AnonymousClass000.A1X(r2.A02));
            A10.append(" surveyInfo.isNull=");
            String A0r = AnonymousClass3MY.A0r(A10, AnonymousClass000.A1X(r2.A01));
            AnonymousClass44e r6 = r2.A07;
            UserJid userJid = r2.A08;
            C18030ve r4 = r2.A04;
            AnonymousClass4GG.A00(r4, a6o, r6, userJid, A0r);
            if (r2.A02 != null && r2.A01 != null) {
                return true;
            }
            AnonymousClass3MW.A1T(new AnonymousClass49M(r4, a6o, r6, userJid, r2.A0A, AnonymousClass3MW.A0z(r2)), r2.A09, 0);
            return false;
        }
        if (this instanceof C77993rw) {
            C77993rw r3 = (C77993rw) this;
            AnonymousClass1BI r12 = r3.A03.A0J;
            if (!C22971Dz.A0V(r12)) {
                return false;
            }
            C29691ci A0A = r3.A02.A0A(r12);
            if (!(A0A instanceof C46162Dk) || (r1 = (C46162Dk) A0A) == null || !r1.A0P() || r1.A01 == 0) {
                return false;
            }
        } else {
            if (this instanceof C78003rx) {
                C78003rx r22 = (C78003rx) this;
                AnonymousClass1E7 A0D = r22.A05.A0D(r22.A02);
                if (A0D == null || A0D.A0w) {
                    return false;
                }
                i = r22.A00;
            } else if (this instanceof AnonymousClass3s0) {
                AnonymousClass3s0 r13 = (AnonymousClass3s0) this;
                if (r13.A08 == null && r13.A07 == null) {
                    return false;
                }
                return true;
            } else if (this instanceof C78013ry) {
                C78013ry r5 = (C78013ry) this;
                if (r5.A0B || r5.A0C) {
                    return false;
                }
                AnonymousClass1SG r23 = r5.A07;
                Class<UserJid> cls = UserJid.class;
                Jid A06 = r5.A01.A06(cls);
                C17960vV.A07(A06);
                C29691ci A0A2 = r23.A01.A0A((AnonymousClass1BI) A06);
                if (A0A2 == null || A0A2.A0E == -1 || r5.A02 == null) {
                    return false;
                }
                Jid A062 = r5.A01.A06(cls);
                C17960vV.A07(A062);
                if (A062.equals(r5.A02) || r5.A06.A0H(r5.A02).A0H != null) {
                    return false;
                }
                return true;
            } else if (this instanceof C77953rs) {
                C77953rs r14 = (C77953rs) this;
                boolean A012 = C77953rs.A01(r14);
                List A102 = AnonymousClass3MW.A10(r14.A09.A00);
                if (A102 == null) {
                    A102 = C18460wS.A00;
                }
                int size = A102.size();
                int A002 = C18020vd.A00(C18040vf.A02, r14.A06, 7560);
                if (A002 < 1) {
                    A002 = 1;
                }
                boolean z = false;
                if (size >= A002) {
                    z = true;
                }
                if (!A012 || !z) {
                    return false;
                }
                return true;
            } else if (this instanceof C77973ru) {
                return AnonymousClass000.A1W(((C77973ru) this).A04.A01.A06());
            } else {
                if (this instanceof C77933rq) {
                    C77933rq r15 = (C77933rq) this;
                    if (r15.A02 == null || r15.A03) {
                        return false;
                    }
                    i = r15.A00;
                } else if (this instanceof C77963rt) {
                    C77963rt r16 = (C77963rt) this;
                    return r16.BEC(r16.A00);
                } else {
                    C77943rr r52 = (C77943rr) this;
                    AnonymousClass00H r8 = r52.A05.A00;
                    long j = C17880vN.A0B(r8).getLong("pref_cag_events_banner_first_seen_timestamp", 0);
                    if (j != 0) {
                        if (C17880vN.A1W(C17880vN.A0B(r8), "pref_cag_events_banner_dismissed") || AnonymousClass11P.A01(r52.A04) >= j + C77943rr.A08 || r52.A01.Bg7()) {
                            return false;
                        }
                        if (C18020vd.A05(C18040vf.A02, r52.A06, 9932)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean A09() {
        C108885cS r1 = this.A01;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.conversation.banner.SupportsConversationBanners");
        return AnonymousClass000.A1Z(((AnonymousClass5Z9) r1).getConversationBanners().A00(), this);
    }

    public void Bcw(AnonymousClass5Z8 r13, boolean z) {
        TranslateAnimation translateAnimation;
        View view;
        View view2;
        if (this instanceof C77983rv) {
            C72453Mb.A1D(((C77983rv) this).A00);
        } else if (this instanceof C77993rw) {
            C77993rw r2 = (C77993rw) this;
            if (r2.A09() && (view2 = r2.A00) != null) {
                view2.setVisibility(8);
                r2.A01.removeView(r2.A00);
                r2.A00 = null;
            }
        } else if (this instanceof C78003rx) {
            C78003rx r22 = (C78003rx) this;
            if (z) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                C74603c1.A00(translateAnimation2, r13, r22, 5);
                translateAnimation2.setDuration(400);
                View view3 = r22.A01;
                if (view3 != null) {
                    view3.startAnimation(translateAnimation2);
                }
            } else {
                C72453Mb.A1D(r22.A01);
                r22.A03.removeView(r22.A01);
                r22.A01 = null;
                r13.Bvb();
            }
            C98774rh.A01(r22.A06, r22, 33);
        } else {
            if (this instanceof AnonymousClass3s0) {
                AnonymousClass3s0 r23 = (AnonymousClass3s0) this;
                r23.A0M.unregisterObserver(r23.A0L);
                AnonymousClass3s0.A01(r23);
                C18100vl r1 = r23.A0N;
                if (r1.Bf6()) {
                    ((C59492mO) r1.getValue()).A02();
                }
                C72453Mb.A1D(r23.A01);
                r23.A0C.removeView(r23.A01);
                r23.A01 = null;
                r23.A05 = null;
                r23.A04 = null;
                r23.A06 = null;
                r23.A08 = null;
                r23.A07 = null;
                r23.A00 = 9;
                r23.A03 = null;
                r23.A0A = null;
            } else {
                if (this instanceof C78013ry) {
                    C78013ry r24 = (C78013ry) this;
                    if (z) {
                        translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                        C74603c1.A00(translateAnimation, r24, r13, 4);
                        translateAnimation.setDuration(400);
                        view = r24.A00;
                        C17960vV.A05(view);
                    } else {
                        C72453Mb.A1A(r24.A00);
                        r24.A04.removeView(r24.A00);
                        r24.A00 = null;
                    }
                } else {
                    C78023rz r25 = (C78023rz) this;
                    if (z) {
                        translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                        translateAnimation.setDuration(220);
                        translateAnimation.setInterpolator(new AccelerateInterpolator());
                        C74603c1.A00(translateAnimation, r13, r25, 3);
                        view = (ViewGroup) AnonymousClass3MX.A0D(r25.A01);
                    } else {
                        C78023rz.A02(r25, r13);
                        return;
                    }
                }
                view.startAnimation(translateAnimation);
                return;
            }
            r13.Bvb();
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C98524rI r3 = (C98524rI) obj;
        C18070vi.A0d(r3, 0);
        return C18070vi.A00(this.A00, r3.A00);
    }
}
