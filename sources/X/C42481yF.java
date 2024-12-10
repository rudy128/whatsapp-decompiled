package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.community.CommunityStackView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.Set;

/* renamed from: X.1yF  reason: invalid class name and case insensitive filesystem */
public class C42481yF extends C42461yD implements C42471yE {
    public WaTextView A00;
    public C43441zo A01;
    public AnonymousClass2DB A02;
    public AnonymousClass2D7 A03;
    public C42611yS A04;
    public C42431yA A05;
    public C39631tO A06;
    public C139106yE A07;
    public final int A08;
    public final C42201xn A09;
    public final C42361y3 A0A;
    public final C42371y4 A0B;
    public final C42381y5 A0C;
    public final C42451yC A0D;
    public final AnonymousClass1PW A0E;
    public final C34511kb A0F;
    public final AnonymousClass1VW A0G;
    public final C37451pZ A0H;
    public final C37471pb A0I;
    public final C34021jm A0J;
    public final C19830z4 A0K;
    public final AnonymousClass1TD A0L;
    public final C22621Co A0M;
    public final AnonymousClass1TA A0N;
    public final AnonymousClass1R3 A0O;
    public final AnonymousClass1WM A0P;
    public final C42221xp A0Q;
    public final C39541tF A0R;
    public final C34651kr A0S;
    public final AnonymousClass1Nb A0T;
    public final Runnable A0U = new C449025f((Object) this, 31);
    public final boolean A0V;
    public final C19880zA A0W;
    public final AnonymousClass1KB A0X;
    public final AnonymousClass10I A0Y;

    public static void A06(Context context, View view) {
        view.setVisibility(0);
        int A002 = AnonymousClass1YL.A00(view.getContext(), 2130971681, 2131102798);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(view.getContext(), 2130969266, 2131100278)));
        }
        C17960vV.A07(context);
        view.setBackground(new C109475dV(C19740yt.A00(context, A002)));
    }

    private void A0A(AnonymousClass1E7 r5) {
        A05(2);
        ViewGroup viewGroup = (ViewGroup) this.A06.A0F.A02();
        if (viewGroup instanceof CommunityStackView) {
            Context context = this.A02;
            String string = context.getString(2131896791);
            String string2 = context.getString(2131896788);
            String A0K2 = r5.A0K();
            if (A0K2 != null) {
                AnonymousClass1Y5.A08(viewGroup, A0K2, string2, string);
            }
            CommunityStackView communityStackView = (CommunityStackView) viewGroup;
            communityStackView.setParentGroupProfilePhoto(r5, this.A0H);
            A07(communityStackView.A00, r5.A0J);
        } else {
            Log.e("ConversationViewFiller/setParentGroupProfilePhoto/Unexpected class instance");
        }
        viewGroup.setFocusable(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r5 != 10) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if ((!r14.A0C.A01(r15)) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017d, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(X.AnonymousClass1E7 r15, X.AnonymousClass1E7 r16, X.AnonymousClass1EC r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r14 = this;
            r0 = 3
            r4 = 0
            r3 = 1
            r6 = 0
            r1 = r19
            if (r1 != r0) goto L_0x0009
            r6 = 1
        L_0x0009:
            X.1xZ r2 = r14.A06
            android.widget.ImageView r5 = r2.A04
            boolean r0 = r5 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0018
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r5
            X.1sg r0 = X.C39201sg.CIRCLE
            r5.setProfilePhotoShape(r0)
        L_0x0018:
            X.1bI r5 = r2.A0E
            r0 = 8
            r5.A04(r0)
            boolean r0 = r14.A0E()
            r11 = r15
            r7 = r17
            if (r0 != 0) goto L_0x007c
            int r5 = r14.A08
            if (r5 != r3) goto L_0x002e
            if (r20 == 0) goto L_0x0072
        L_0x002e:
            X.1kb r0 = r14.A0F
            boolean r0 = r0.A0W(r7, r1)
            if (r0 == 0) goto L_0x006c
            X.1bI r0 = r2.A0U
            android.view.View r6 = r0.A02()
            com.whatsapp.community.SubgroupWithParentView r6 = (com.whatsapp.community.SubgroupWithParentView) r6
            X.1pZ r0 = r14.A0H
            r6.setSubgroupProfilePhoto(r15, r1, r0)
            X.1BI r1 = r15.A0J
            android.view.View r0 = r6.getTransitionView()
            A07(r0, r1)
            X.118 r5 = r14.A08
            r2 = 2131886291(0x7f1200d3, float:1.9407157E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.1Me r0 = r14.A05
            java.lang.String r0 = r0.A0I(r15)
            r1[r4] = r0
            java.lang.String r0 = r5.A02(r2, r1)
            r6.setContentDescription(r0)
            r0 = 2131886301(0x7f1200dd, float:1.9407177E38)
            X.AnonymousClass1Y5.A02(r6, r0)
            r14.A05(r3)
        L_0x006b:
            return
        L_0x006c:
            if (r5 == r3) goto L_0x0072
            r0 = 10
            if (r5 != r0) goto L_0x017d
        L_0x0072:
            X.1xo r0 = r14.A0C
            boolean r0 = r0.A01(r15)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017d
        L_0x007c:
            r10 = 1
        L_0x007d:
            if (r6 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x00c5
            int r1 = r14.A08
            r0 = 4
            if (r1 != r0) goto L_0x00c5
            X.0ve r5 = r14.A0B
            if (r5 == 0) goto L_0x00c5
            X.0vf r1 = X.C18040vf.A01
            r0 = 10545(0x2931, float:1.4777E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            if (r0 == 0) goto L_0x00c5
            r0 = r16
            if (r16 == 0) goto L_0x00c1
            r14.A0A(r0)
        L_0x009b:
            X.1bI r0 = r2.A0E
            r0.A04(r4)
        L_0x00a0:
            android.widget.ImageView r1 = r2.A04
            r0 = 2131886301(0x7f1200dd, float:1.9407177E38)
            X.AnonymousClass1Y5.A02(r1, r0)
            boolean r0 = r15.A0F()
            if (r0 == 0) goto L_0x006b
            android.widget.ImageView r5 = r2.A04
            X.118 r2 = r14.A08
            r1 = 2131886246(0x7f1200a6, float:1.9407065E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r18
            java.lang.String r0 = r2.A02(r1, r0)
            r5.setContentDescription(r0)
            return
        L_0x00c1:
            r14.A0A(r15)
            goto L_0x009b
        L_0x00c5:
            r14.A05(r4)
            android.widget.ImageView r1 = r2.A04
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x00d5
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            X.1sg r0 = X.C39201sg.SQUIRCLE
            r1.setProfilePhotoShape(r0)
        L_0x00d5:
            X.1pZ r6 = r14.A0H
            android.widget.ImageView r0 = r2.A04
            r6.A03(r0)
            android.widget.ImageView r0 = r2.A04
            android.content.res.Resources r9 = r0.getResources()
            if (r10 == 0) goto L_0x0132
            boolean r0 = X.C22891Dp.A02
            r8 = 2131231044(0x7f080144, float:1.8078158E38)
            if (r0 == 0) goto L_0x00ee
            r8 = 2131231045(0x7f080145, float:1.807816E38)
        L_0x00ee:
            android.widget.ImageView r0 = r2.A04
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources$Theme r5 = r0.getTheme()
            X.2wZ r1 = new X.2wZ
            r1.<init>(r4)
            X.0ve r0 = r14.A0B
            android.graphics.drawable.Drawable r1 = X.AnonymousClass1VU.A00(r5, r9, r1, r0, r8)
            android.widget.ImageView r0 = r2.A04
            r0.setImageDrawable(r1)
            if (r10 != 0) goto L_0x00a0
            if (r17 == 0) goto L_0x00a0
            X.1kb r0 = r14.A0F
            X.1EC r1 = r0.A05(r7)
            if (r1 == 0) goto L_0x00a0
            X.1M9 r0 = r14.A04
            X.1MA r0 = r0.A03
            X.1E7 r5 = r0.A0A(r1)
            if (r5 == 0) goto L_0x00a0
            int r1 = r14.A08
            if (r1 == r3) goto L_0x0126
            r0 = 10
            if (r1 != r0) goto L_0x0136
        L_0x0126:
            X.1xo r0 = r14.A0C
            boolean r0 = r0.A01(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0136
            goto L_0x00a0
        L_0x0132:
            r8 = 2131233211(0x7f0809bb, float:1.8082553E38)
            goto L_0x00ee
        L_0x0136:
            android.widget.ImageView r0 = r2.A04
            r6.A07(r0, r5)
            goto L_0x00a0
        L_0x013d:
            if (r1 != r3) goto L_0x0144
            r14.A0A(r15)
            goto L_0x00a0
        L_0x0144:
            r14.A05(r4)
            X.1pZ r5 = r14.A0H
            android.widget.ImageView r1 = r2.A04
            X.1yC r0 = r14.A0D
            X.1K2 r0 = r0.A00
            X.10E r6 = r0.A01
            X.00S r0 = r6.A17
            java.lang.Object r9 = r0.get()
            X.1z1 r9 = (X.C42961z1) r9
            X.00S r0 = r6.A2d
            java.lang.Object r10 = r0.get()
            X.1VW r10 = (X.AnonymousClass1VW) r10
            X.00S r0 = r6.A4j
            java.lang.Object r13 = r0.get()
            X.1PU r13 = (X.AnonymousClass1PU) r13
            X.00S r0 = r6.A7y
            java.lang.Object r12 = r0.get()
            X.1VU r12 = (X.AnonymousClass1VU) r12
            X.1z4 r8 = new X.1z4
            r8.<init>(r9, r10, r11, r12, r13)
            if (r1 == 0) goto L_0x00a0
            r5.A05(r1, r8, r15, r3)
            goto L_0x00a0
        L_0x017d:
            r10 = 0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A0B(X.1E7, X.1E7, X.1EC, java.lang.String, int, boolean):void");
    }

    public void CRM(UserJid userJid, C139106yE r11) {
        AnonymousClass1E7 r4;
        C139106yE r6 = r11;
        this.A07 = r11;
        C42071xZ r2 = this.A06;
        ImageView imageView = r2.A04;
        if (imageView instanceof WDSProfilePhoto) {
            A0D(r11, (WDSProfilePhoto) imageView);
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) r2.A04;
            String str = null;
            UserJid userJid2 = userJid;
            C58982lZ A002 = A00((AnonymousClass1E7) null, userJid, (Set) null);
            if (A002 != null) {
                C42931yy r0 = A002.A01;
                r4 = r0.A01;
                str = r0.A08;
            } else {
                r4 = null;
            }
            A0C(r4, userJid2, r6, wDSProfilePhoto, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r9.A02 == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r4 != null) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C58982lZ A00(X.AnonymousClass1E7 r23, X.AnonymousClass1BI r24, java.util.Set r25) {
        /*
            r22 = this;
            r6 = r22
            X.1M9 r9 = r6.A04
            r7 = r24
            X.1E7 r5 = r9.A0D(r7)
            r12 = 0
            r14 = r25
            if (r25 == 0) goto L_0x021b
            java.util.HashSet r19 = r9.A0R(r14)
        L_0x0013:
            X.1Nb r0 = r6.A0T
            X.1yM r21 = r0.A0Z(r7)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r2 = X.C36321nh.A00(r7)
            X.00H r3 = r6.A0H
            boolean r0 = X.C42561yN.A00(r7, r3)
            r8 = 1
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r1 = r3.get()
            X.1yO r1 = (X.C42571yO) r1
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.1TD r0 = r1.A03
            java.util.Map r0 = r0.A0H
            java.lang.Object r4 = r0.get(r7)
            X.206 r4 = (X.AnonymousClass206) r4
            r1 = r12
            r2 = r12
        L_0x003e:
            if (r4 == 0) goto L_0x012d
        L_0x0040:
            if (r5 == 0) goto L_0x012d
            X.11S r10 = r6.A03
            X.1PW r11 = r6.A0E
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.C18070vi.A0d(r11, r8)
            X.1BI r3 = r4.A0H()
            if (r3 == 0) goto L_0x00e8
            boolean r0 = X.C42701yb.A01(r3)
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r11.A08()
            if (r0 == 0) goto L_0x00e8
        L_0x005f:
            if (r1 == 0) goto L_0x00e6
            X.212 r0 = r1.A01
            X.1BI r0 = r0.A0H()
            if (r0 == 0) goto L_0x00e6
            X.1E7 r0 = r9.A0D(r0)
            if (r0 == 0) goto L_0x0077
            X.1Me r10 = r6.A05
            java.lang.String r10 = r10.A0K(r0)
            if (r10 != 0) goto L_0x0078
        L_0x0077:
            r1 = r12
        L_0x0078:
            if (r3 == 0) goto L_0x00e4
            X.1E7 r11 = r9.A0D(r3)
        L_0x007e:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r8)
            if (r1 == 0) goto L_0x00e2
            X.212 r9 = r1.A01
            X.205 r9 = r9.A0v
            X.1BI r10 = r9.A00
            boolean r10 = X.C22971Dz.A0e(r10)
            if (r10 == 0) goto L_0x00e2
            boolean r9 = r9.A02
            if (r9 != 0) goto L_0x00e2
        L_0x0094:
            if (r5 == 0) goto L_0x00aa
            X.1Me r9 = r6.A05
            java.lang.String r18 = r9.A0K(r5)
            if (r4 == 0) goto L_0x00aa
            if (r21 == 0) goto L_0x00aa
            if (r11 != 0) goto L_0x00a4
            if (r3 != 0) goto L_0x00aa
        L_0x00a4:
            if (r8 != 0) goto L_0x00aa
            if (r25 != 0) goto L_0x00ab
            if (r19 == 0) goto L_0x00b7
        L_0x00aa:
            return r12
        L_0x00ab:
            if (r19 == 0) goto L_0x00aa
            int r8 = r14.size()
            int r3 = r19.size()
            if (r8 != r3) goto L_0x00aa
        L_0x00b7:
            X.6yE r3 = r6.A07
            X.1yy r9 = new X.1yy
            r12 = r23
            r14 = r2
            r15 = r4
            r16 = r3
            r13 = r7
            r10 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1yA r3 = r6.A05
            X.25L r17 = r3.BQq(r7)
            X.25M r3 = new X.25M
            r13 = r3
            r14 = r11
            r15 = r0
            r16 = r12
            r18 = r2
            r19 = r4
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.2lZ r12 = new X.2lZ
            r12.<init>(r3, r9)
            return r12
        L_0x00e2:
            r8 = 0
            goto L_0x0094
        L_0x00e4:
            r11 = r12
            goto L_0x007e
        L_0x00e6:
            r0 = r12
            goto L_0x0078
        L_0x00e8:
            X.1BI r3 = X.AnonymousClass25G.A01(r10, r5, r4)
            goto L_0x005f
        L_0x00ee:
            X.1CJ r1 = r6.A0A
            int r0 = r1.A06(r2)
            if (r0 != r8) goto L_0x018b
            X.1kb r2 = r6.A0F
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r0 = X.C42941yz.A00(r7)
            com.whatsapp.jid.GroupJid r2 = r2.A03(r0)
            if (r2 == 0) goto L_0x0160
            X.1R3 r4 = r6.A0O
            X.1yA r13 = r6.A05
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            r0 = 5
            X.C18070vi.A0d(r13, r0)
            boolean r0 = X.C42561yN.A00(r2, r3)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r3.get()
            X.1yO r0 = (X.C42571yO) r0
            X.1TD r0 = r0.A03
            java.util.Map r0 = r0.A0H
            java.lang.Object r4 = r0.get(r2)
            X.206 r4 = (X.AnonymousClass206) r4
        L_0x012a:
            if (r4 != 0) goto L_0x0162
        L_0x012c:
            r1 = r12
        L_0x012d:
            r3 = r12
            goto L_0x005f
        L_0x0130:
            boolean r0 = r13.BeW()
            X.206 r4 = r1.A0E(r2)
            if (r0 == 0) goto L_0x012a
            X.1yB r13 = (X.C42441yB) r13
            boolean r0 = r13.BeW()
            if (r0 == 0) goto L_0x012a
            X.25L r3 = r13.BQq(r2)
            if (r4 == 0) goto L_0x012c
            if (r3 == 0) goto L_0x0162
            long r0 = r3.A00
            long r15 = r3.A02()
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0155
            r0 = r15
        L_0x0155:
            long r10 = r4.A0I
            int r15 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0162
            X.206 r4 = r13.BRW(r3)
            goto L_0x012a
        L_0x0160:
            r4 = r12
            goto L_0x012c
        L_0x0162:
            X.1WM r1 = r6.A0P
            X.205 r0 = r4.A0v
            X.1BI r3 = r0.A00
            X.1CJ r0 = r1.A05
            X.1ci r0 = r0.A0A(r3)
            if (r0 != 0) goto L_0x0187
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListCachedDisplayedMessageAddOnV2/no chat for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 0
            goto L_0x0040
        L_0x0187:
            X.2d8 r1 = r0.A0i
            goto L_0x0040
        L_0x018b:
            X.1yA r11 = r6.A05
            boolean r0 = r11.BeW()
            X.206 r4 = r1.A0E(r7)
            if (r0 == 0) goto L_0x01bf
            X.1yB r11 = (X.C42441yB) r11
            X.C18070vi.A0d(r7, r8)
            boolean r0 = r11.BeW()
            if (r0 == 0) goto L_0x01bf
            X.25L r10 = r11.BQq(r7)
            if (r4 == 0) goto L_0x01bf
            if (r10 == 0) goto L_0x01bf
            long r2 = r10.A00
            long r15 = r10.A02()
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b5
            r2 = r15
        L_0x01b5:
            long r0 = r4.A0I
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x01bf
            X.206 r4 = r11.BRW(r10)
        L_0x01bf:
            X.1WM r0 = r6.A0P
            X.1CJ r0 = r0.A05
            X.1ci r0 = r0.A0A(r7)
            if (r0 != 0) goto L_0x0218
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListCachedDisplayedMessageAddOnV2/no chat for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 0
        L_0x01de:
            if (r4 == 0) goto L_0x0215
            X.11P r2 = r6.A07
            java.lang.Long r0 = r4.A0U
            if (r0 == 0) goto L_0x0215
            long r10 = r0.longValue()
            long r2 = X.AnonymousClass11P.A01(r2)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0215
            int r0 = r4.A0C()
            if (r0 == r8) goto L_0x0215
            X.1Co r10 = r6.A0M
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0L
            java.lang.Object r3 = r0.get()
            X.1gM r3 = (X.C31931gM) r3
            r0 = 4
            X.3Bx r2 = new X.3Bx
            r2.<init>(r10, r4, r0)
            r0 = 20
            r3.A01(r2, r0)
        L_0x0215:
            r2 = r12
            goto L_0x003e
        L_0x0218:
            X.2d8 r1 = r0.A0i
            goto L_0x01de
        L_0x021b:
            r19 = r12
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A00(X.1E7, X.1BI, java.util.Set):X.2lZ");
    }

    private void A01() {
        C42071xZ r2 = this.A06;
        r2.A08.setVisibility(8);
        r2.A0L.A04(8);
        r2.A05.setVisibility(8);
        r2.A0M.A04(8);
        r2.A0N.A04(8);
        r2.A0O.A04(8);
        r2.A0D.A04(8);
        r2.A07.setVisibility(0);
        C43411zl.A00(r2.A07);
        r2.A07.A0L();
        r2.A07.setText("");
        r2.A07.setPlaceholder(80);
    }

    private void A02() {
        C42071xZ r4 = this.A06;
        C42131xg r5 = r4.A09;
        if (r5.A00 == null) {
            Context context = r5.A06.getContext();
            r5.A00 = new C74743cP(C40501uo.A00(context.getTheme(), context.getResources(), 2131233145), r5.A04);
        }
        C42121xe r1 = r5.A06;
        r1.getUnreadIndicatorView().setText((CharSequence) null);
        r1.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        r1.getUnreadIndicatorView().setBackground(r5.A00);
        r4.A09.A06.getUnreadIndicatorView().setVisibility(0);
    }

    private void A04(int i) {
        int i2 = this.A08;
        if (i2 != 3 && i2 != 4) {
            C42071xZ r4 = this.A06;
            C42131xg r3 = r4.A09;
            Context context = this.A02;
            C17960vV.A07(context);
            int i3 = 2130969265;
            int i4 = 2131100277;
            if (i > 0) {
                i3 = 2130969267;
                i4 = 2131100279;
            }
            r3.A06.getDateView().setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, i3, i4)));
            WaTextView dateView = r4.A09.A06.getDateView();
            if (i > 0) {
                C43421zm.A04(dateView);
            } else {
                dateView.A0L();
            }
        }
    }

    private void A05(int i) {
        C42071xZ r4 = this.A06;
        ImageView imageView = r4.A04;
        int i2 = 0;
        int i3 = 8;
        if (i == 0) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        C28931bI r2 = r4.A0U;
        int i4 = 8;
        if (1 == i) {
            i4 = 0;
        }
        r2.A04(i4);
        C28931bI r1 = r4.A0F;
        if (2 != i) {
            i2 = 8;
        }
        r1.A04(i2);
    }

    public static void A07(View view, AnonymousClass1BI r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp.conversationslist.ConversationsFragment");
        sb.append(C22971Dz.A06(r3));
        AnonymousClass1Xr.A04(view, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024e, code lost:
        if (r1 <= 0) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a4, code lost:
        if (r12 != false) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c0, code lost:
        if (r5 != 3) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c5, code lost:
        if (r11 != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (r7 != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (X.C18070vi.A18(X.C43271zX.A00, r5) == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f6, code lost:
        if ((r7 instanceof X.AnonymousClass24H) != false) goto L_0x01f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.AnonymousClass25M r26, X.C42481yF r27, X.C42931yy r28, boolean r29) {
        /*
            r6 = r26
            X.2d8 r0 = r6.A05
            r19 = r0
            r12 = r28
            X.1E7 r0 = r12.A01
            r28 = r0
            X.1BI r8 = r0.A0J
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r18 = X.C42941yz.A00(r8)
            r3 = r27
            X.1CJ r11 = r3.A0A
            r0 = r18
            int r25 = r11.A06(r0)
            java.lang.String r15 = r12.A08
            X.1yM r14 = r6.A06
            boolean r16 = r14.A0A()
            boolean r7 = r14.A0S
            X.1E7 r0 = r6.A00
            r17 = r0
            X.1xZ r2 = r3.A06
            android.view.View r1 = r2.A02
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.listitem.WDSListItem
            if (r0 == 0) goto L_0x0039
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r1
            r1.A08()
        L_0x0039:
            X.0ve r10 = r3.A0B
            r0 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            r1 = 0
            if (r0 == 0) goto L_0x03d7
            X.206 r0 = r6.A04
            com.whatsapp.jid.GroupJid r4 = r6.A03
            r27 = r4
            com.whatsapp.TextEmojiLabel r4 = r2.A07
            r4.setPlaceholder(r1)
            if (r29 != 0) goto L_0x0066
            android.widget.ImageView r4 = r2.A06
            r4.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r4 = r2.A08
            r4.setVisibility(r1)
            X.1E7 r13 = r6.A01
            r5 = r27
            r4 = r28
            r3.A0H(r4, r13, r5, r0)
        L_0x0066:
            r4 = 9682(0x25d2, float:1.3567E-41)
            boolean r4 = X.C18020vd.A05(r9, r10, r4)
            if (r4 != 0) goto L_0x0076
            r4 = 11256(0x2bf8, float:1.5773E-41)
            boolean r4 = X.C18020vd.A05(r9, r10, r4)
            if (r4 == 0) goto L_0x008b
        L_0x0076:
            X.1BI r4 = r12.A03
            boolean r5 = r14.A0A()
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r5)
            r20 = r3
            r21 = r12
            r22 = r4
            r24 = r15
            r20.A09(r21, r22, r23, r24, r25)
        L_0x008b:
            r13 = 8
            if (r8 == 0) goto L_0x009c
            X.0z4 r4 = r3.A0K
            boolean r4 = X.AnonymousClass1Q0.A03(r4, r11, r8)
            if (r4 == 0) goto L_0x009c
            int r4 = r3.A08
            switch(r4) {
                case 0: goto L_0x03d0;
                case 1: goto L_0x009c;
                case 2: goto L_0x03c9;
                case 3: goto L_0x009c;
                case 4: goto L_0x009c;
                case 5: goto L_0x009c;
                case 6: goto L_0x009c;
                case 7: goto L_0x03d0;
                case 8: goto L_0x03c9;
                case 9: goto L_0x03df;
                case 10: goto L_0x009c;
                case 11: goto L_0x03c9;
                default: goto L_0x009c;
            }
        L_0x009c:
            X.1bI r5 = r2.A0M
            r4 = 8
            if (r16 == 0) goto L_0x00a3
            r4 = 0
        L_0x00a3:
            r5.A04(r4)
        L_0x00a6:
            int r5 = r3.A08
            r4 = 3
            if (r5 == r4) goto L_0x03b4
            r14 = 5
            if (r5 == r14) goto L_0x03b4
            X.1bI r4 = r2.A0O
            if (r7 == 0) goto L_0x00b3
        L_0x00b2:
            r13 = 0
        L_0x00b3:
            r4.A04(r13)
            if (r7 == 0) goto L_0x00c9
            X.1E7 r4 = r12.A00
            r26 = 1
            r22 = r4
            r23 = r18
            r24 = r15
            r20 = r3
            r21 = r28
            r20.A0B(r21, r22, r23, r24, r25, r26)
        L_0x00c9:
            if (r29 != 0) goto L_0x0220
            if (r0 == 0) goto L_0x0220
            if (r19 == 0) goto L_0x03b1
            long r4 = r0.A0I
            boolean r7 = r0 instanceof X.AnonymousClass23N
            if (r7 == 0) goto L_0x00da
            r4 = r0
            X.23N r4 = (X.AnonymousClass23N) r4
            long r4 = r4.A00
        L_0x00da:
            r7 = r19
            X.212 r7 = r7.A01
            long r11 = r7.A0I
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x03b1
            boolean r14 = r7 instanceof X.AnonymousClass227
            if (r14 == 0) goto L_0x0102
            r5 = r7
            X.227 r5 = (X.AnonymousClass227) r5
            java.lang.String[] r4 = X.C1409073n.A04
            X.C18070vi.A0d(r5, r1)
            java.lang.String r5 = r5.A01
            if (r5 == 0) goto L_0x03b1
            int r4 = r5.length()
            if (r4 == 0) goto L_0x03b1
            java.lang.String r4 = X.C43271zX.A00
            boolean r4 = X.C18070vi.A18(r4, r5)
            if (r4 != 0) goto L_0x03b1
        L_0x0102:
            r16 = 0
            X.2mO r4 = r3.A00
            if (r4 == 0) goto L_0x010b
            r4.A02()
        L_0x010b:
            r4 = r19
            X.206 r4 = r4.A00
            android.util.Pair r13 = r3.A0G(r4)
            android.widget.ImageView r5 = r2.A05
            r11 = 8
            r5.setVisibility(r11)
            android.widget.ImageView r5 = r2.A06
            r5.setVisibility(r11)
            X.1bI r5 = r2.A0H
            r5.A04(r11)
            X.1bI r5 = r2.A0T
            r5.A04(r11)
            boolean r11 = r28.A0F()
            X.205 r5 = r7.A0v
            boolean r12 = r5.A02
            if (r11 == 0) goto L_0x03a4
            if (r12 != 0) goto L_0x03a6
            if (r17 == 0) goto L_0x0147
            X.1Me r11 = r3.A05
            r5 = r28
            X.1BI r5 = r5.A0J
            int r15 = r11.A0A(r5)
            r5 = r17
            java.lang.String r16 = r11.A0T(r5, r15)
        L_0x0147:
            X.C17960vV.A07(r19)
            X.118 r11 = r3.A08
            com.whatsapp.TextEmojiLabel r5 = r2.A07
            r21 = r5
            X.1y2 r5 = r3.A01
            r20 = r5
            X.11S r15 = r3.A03
            r5 = r16
            if (r14 == 0) goto L_0x028c
            r12 = r7
            X.227 r12 = (X.AnonymousClass227) r12
            android.content.Context r11 = r11.A00
            java.lang.String r4 = r12.A01
            java.lang.String r15 = X.C1409073n.A02(r4)
            java.lang.String r10 = ""
            r9 = r10
            if (r16 == 0) goto L_0x0175
            java.lang.String r5 = r16.toString()
            java.lang.String r4 = "⁣"
            java.lang.String r10 = r5.replaceAll(r4, r10)
        L_0x0175:
            java.lang.Object r5 = r13.first
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            java.lang.Object r4 = r13.second
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x018a
            java.lang.String r13 = r4.toString()
            java.lang.String r4 = "⁣"
            java.lang.String r9 = r13.replaceAll(r4, r9)
        L_0x018a:
            if (r5 == 0) goto L_0x019e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "⁣ "
            r13.append(r4)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
        L_0x019e:
            X.205 r4 = r12.A0v
            boolean r4 = r4.A02
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L_0x0275
            r12 = 2131894928(0x7f122290, float:1.9424675E38)
        L_0x01a9:
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r1] = r15
            r4[r14] = r9
        L_0x01af:
            java.lang.String r9 = r11.getString(r12, r4)
            r4 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = X.AnonymousClass1EG.A0E(r9, r4)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r4)
            if (r5 == 0) goto L_0x01d8
            r4 = r21
            X.AnonymousClass4aX.A0C(r5, r4)
            X.3Np r11 = new X.3Np
            r11.<init>(r5)
            java.lang.String r4 = "⁣"
            int r9 = r9.indexOf(r4)
            int r5 = r9 + 1
        L_0x01d3:
            r4 = 17
            r10.setSpan(r11, r9, r5, r4)
        L_0x01d8:
            com.whatsapp.TextEmojiLabel r5 = r2.A07
            X.C18070vi.A0d(r5, r1)
            r5.getContext()
            android.graphics.Typeface r4 = X.C43421zm.A01()
            r5.setTypeface(r4, r1)
            if (r10 == 0) goto L_0x03b1
            r9 = 1
            if (r16 == 0) goto L_0x020b
            boolean r4 = r0 instanceof X.C445823z
            if (r4 != 0) goto L_0x01f8
            boolean r4 = r0 instanceof X.AnonymousClass2MQ
            if (r4 != 0) goto L_0x01f8
            boolean r4 = r7 instanceof X.AnonymousClass24H
            if (r4 == 0) goto L_0x020b
        L_0x01f8:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r1] = r16
            java.lang.String r4 = "%s: "
            java.lang.String r5 = java.lang.String.format(r4, r5)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r5)
            android.text.SpannableStringBuilder r10 = r4.append(r10)
        L_0x020b:
            boolean r4 = X.C87494Vu.A00(r0)
            X.C42461yD.A03(r3, r10, r9, r4)
            r4 = 1
            r9 = r3
            r10 = r28
            r11 = r17
            r12 = r27
            r13 = r0
            r14 = r1
            r9.A0K(r10, r11, r12, r13, r14)
        L_0x021f:
            r1 = r4
        L_0x0220:
            X.1yA r5 = r3.A05
            boolean r4 = r5.BeW()
            if (r4 == 0) goto L_0x0268
            if (r29 != 0) goto L_0x0268
            if (r0 == 0) goto L_0x0268
            X.25L r6 = r6.A02
            if (r6 == 0) goto L_0x0268
            if (r8 == 0) goto L_0x0268
            X.206 r8 = r5.BRW(r6)
            if (r1 == 0) goto L_0x0269
            if (r19 == 0) goto L_0x0250
            long r4 = r6.A00
            long r6 = r6.A02()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0245
            r4 = r6
        L_0x0245:
            r0 = r19
            X.212 r0 = r0.A01
        L_0x0249:
            long r6 = r0.A0I
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0251
        L_0x0250:
            r0 = 0
        L_0x0251:
            if (r8 == 0) goto L_0x0268
            if (r0 == 0) goto L_0x0268
            r4 = 0
            r1 = r18
            r0 = r28
            r3.A0H(r0, r4, r1, r8)
            boolean r0 = r8 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0268
            android.widget.ImageView r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
        L_0x0268:
            return
        L_0x0269:
            long r4 = r6.A00
            long r6 = r6.A02()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0249
            r4 = r6
            goto L_0x0249
        L_0x0275:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            r12 = 2131894927(0x7f12228f, float:1.9424673E38)
            if (r4 != 0) goto L_0x01a9
            r12 = 2131894926(0x7f12228e, float:1.942467E38)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r14] = r15
            r4[r13] = r9
            goto L_0x01af
        L_0x028c:
            boolean r13 = r4 instanceof X.AnonymousClass22H
            if (r13 == 0) goto L_0x02f9
            X.22H r4 = (X.AnonymousClass22H) r4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r9 = 1
            android.content.Context r11 = r11.A00
            if (r12 == 0) goto L_0x02e1
            android.content.res.Resources r9 = r11.getResources()
            r5 = 2131894671(0x7f12218f, float:1.9424153E38)
            java.lang.String r9 = r9.getString(r5)
        L_0x02a7:
            r13.append(r9)
            java.lang.String r5 = "   "
            r13.append(r5)
            java.lang.String r4 = r4.A05
            r13.append(r4)
            java.lang.String r5 = r13.toString()
            r4 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = X.AnonymousClass1EG.A0E(r5, r4)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r4)
            r5 = 2131232664(0x7f080798, float:1.8081444E38)
            r4 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass4aX.A02(r11, r5, r4)
            r4 = r21
            X.AnonymousClass4aX.A0C(r5, r4)
            X.3Np r11 = new X.3Np
            r11.<init>(r5)
            int r4 = r9.length()
            int r9 = r4 + 1
            int r5 = r4 + 2
            goto L_0x01d3
        L_0x02e1:
            android.content.res.Resources r12 = r11.getResources()
            r10 = 2131894672(0x7f122190, float:1.9424155E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            boolean r9 = android.text.TextUtils.isEmpty(r16)
            if (r9 == 0) goto L_0x02f2
            java.lang.String r5 = r7.A0e
        L_0x02f2:
            r14[r1] = r5
            java.lang.String r9 = r12.getString(r10, r14)
            goto L_0x02a7
        L_0x02f9:
            boolean r5 = r4 instanceof X.C445823z
            if (r5 == 0) goto L_0x03a1
            boolean r5 = r7 instanceof X.AnonymousClass24H
            if (r5 == 0) goto L_0x0373
            r5 = 5563(0x15bb, float:7.795E-42)
            boolean r5 = X.C18020vd.A05(r9, r10, r5)
            if (r5 == 0) goto L_0x0373
            X.23z r4 = (X.C445823z) r4
            r11 = r7
            X.24H r11 = (X.AnonymousClass24H) r11
            X.2Qx r12 = r11.A02
            r5 = 9278(0x243e, float:1.3001E-41)
            boolean r13 = X.C18020vd.A05(r9, r10, r5)
            r5 = 2
            X.2Qx[] r10 = new X.C49552Qx[r5]
            X.2Qx r5 = X.C49552Qx.NOT_GOING
            r10[r1] = r5
            X.2Qx r9 = X.C49552Qx.GOING
            r5 = 1
            r10[r5] = r9
            java.util.List r5 = java.util.Arrays.asList(r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            if (r13 == 0) goto L_0x0332
            X.2Qx r5 = X.C49552Qx.MAYBE
            r9.add(r5)
        L_0x0332:
            boolean r5 = r9.contains(r12)
            if (r5 == 0) goto L_0x03a1
            X.205 r5 = r11.A0v
            boolean r5 = r5.A02
            if (r5 == 0) goto L_0x036e
            r15.A0I()
            com.whatsapp.jid.PhoneUserJid r9 = r15.A0E
        L_0x0343:
            int r11 = r11.A00
            int r10 = r12.ordinal()
            r5 = 1
            if (r10 == r5) goto L_0x0366
            r5 = 3
            if (r10 == r5) goto L_0x0363
            java.lang.Integer r24 = X.AnonymousClass00R.A0j
        L_0x0351:
            java.lang.Integer r25 = X.AnonymousClass00R.A01
            r5 = 128(0x80, float:1.794E-43)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r5)
            r22 = r4
            r23 = r9
            android.text.SpannableStringBuilder r10 = r20.A00(r21, r22, r23, r24, r25, r26)
            goto L_0x01d8
        L_0x0363:
            java.lang.Integer r24 = X.AnonymousClass00R.A0u
            goto L_0x0351
        L_0x0366:
            if (r11 <= 0) goto L_0x036b
            java.lang.Integer r24 = X.AnonymousClass00R.A0Y
            goto L_0x0351
        L_0x036b:
            java.lang.Integer r24 = X.AnonymousClass00R.A0N
            goto L_0x0351
        L_0x036e:
            X.1BI r9 = r11.A0H()
            goto L_0x0343
        L_0x0373:
            boolean r5 = r7 instanceof X.AnonymousClass213
            if (r5 == 0) goto L_0x03a1
            r5 = 5563(0x15bb, float:7.795E-42)
            boolean r5 = X.C18020vd.A05(r9, r10, r5)
            if (r5 == 0) goto L_0x03a1
            X.23z r4 = (X.C445823z) r4
            X.1BI r12 = r7.A0H()
            boolean r5 = r4.A08
            if (r5 == 0) goto L_0x039e
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
        L_0x038b:
            java.lang.Integer r14 = X.AnonymousClass00R.A01
            r5 = 128(0x80, float:1.794E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            r9 = r20
            r10 = r21
            r11 = r4
            android.text.SpannableStringBuilder r10 = r9.A00(r10, r11, r12, r13, r14, r15)
            goto L_0x01d8
        L_0x039e:
            java.lang.Integer r13 = X.AnonymousClass00R.A01
            goto L_0x038b
        L_0x03a1:
            r10 = 0
            goto L_0x01d8
        L_0x03a4:
            if (r12 == 0) goto L_0x0147
        L_0x03a6:
            android.content.Context r11 = r3.A02
            r5 = 2131891155(0x7f1213d3, float:1.9417022E38)
            java.lang.String r16 = r11.getString(r5)
            goto L_0x0147
        L_0x03b1:
            r4 = 0
            goto L_0x021f
        L_0x03b4:
            boolean r5 = r8 instanceof X.AnonymousClass1EC
            if (r5 == 0) goto L_0x03c2
            r5 = r8
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            int r5 = r11.A06(r5)
            r11 = 1
            if (r5 == r4) goto L_0x03c3
        L_0x03c2:
            r11 = 0
        L_0x03c3:
            X.1bI r4 = r2.A0O
            if (r11 == 0) goto L_0x00b3
            goto L_0x00b2
        L_0x03c9:
            X.1bI r4 = r2.A0M
            r4.A04(r13)
            goto L_0x00a6
        L_0x03d0:
            X.1bI r4 = r2.A0M
            r4.A04(r1)
            goto L_0x00a6
        L_0x03d7:
            X.206 r0 = r12.A05
            com.whatsapp.jid.GroupJid r4 = r12.A04
            r27 = r4
            goto L_0x0066
        L_0x03df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ConversationViewFiller/this state does not exist. State = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A08(X.25M, X.1yF, X.1yy, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03eb, code lost:
        if (r9 > 1) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013a, code lost:
        if (r11 > 1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017a, code lost:
        if (r9 > 1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fb, code lost:
        if (r5 == 5) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x034a, code lost:
        if (r11 > 1) goto L_0x034c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(X.C42931yy r18, X.AnonymousClass1BI r19, java.lang.Boolean r20, java.lang.String r21, int r22) {
        /*
            r17 = this;
            r2 = r19
            r7 = r17
            X.1CJ r10 = r7.A0A
            int r8 = r10.A03(r2)
            r3 = r18
            X.1E7 r4 = r3.A01
            int r5 = r7.A08
            r1 = 1
            if (r5 == r1) goto L_0x0017
            r0 = 10
            if (r5 != r0) goto L_0x01cd
        L_0x0017:
            X.1xo r0 = r7.A0C
            boolean r0 = r0.A01(r4)
            r0 = r0 ^ 1
            r6 = 1
            if (r0 == 0) goto L_0x01cd
            r0 = r22
            if (r0 != r1) goto L_0x0182
            X.1xZ r5 = r7.A06
            X.1xg r1 = r5.A09
            r0 = 8
            r1.A03(r0)
            X.0ve r3 = r7.A0B
            r1 = 6884(0x1ae4, float:9.647E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r4 = 0
            X.1kb r3 = r7.A0F
            X.1EC r2 = (X.AnonymousClass1EC) r2
            if (r0 == 0) goto L_0x007d
            java.util.List r0 = r3.A0C(r2)
            java.util.Iterator r16 = r0.iterator()
            r8 = 0
            r15 = 0
            r11 = 0
            r9 = 0
        L_0x004c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r0 = r16.next()
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r12 = r0.A02
            X.1ci r0 = r10.A0A(r12)
            r13 = 0
            if (r0 == 0) goto L_0x006e
            int r0 = r0.A0A
            long r2 = (long) r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0074
            int r11 = r11 + 1
            long r0 = (long) r8
            long r0 = r0 + r2
            int r8 = (int) r0
        L_0x006e:
            int r0 = r10.A02(r12)
            int r15 = r15 + r0
            goto L_0x004c
        L_0x0074:
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            int r9 = r9 + 1
            goto L_0x006e
        L_0x007d:
            X.C18070vi.A0d(r2, r4)
            X.1MG r0 = r3.A08
            java.util.HashSet r0 = r0.A03(r2)
            java.util.List r1 = X.C34511kb.A00(r3, r0)
            X.0vl r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.util.List r0 = X.C29431cG.A0y(r1, r0)
            java.util.List r0 = X.C29431cG.A0t(r0)
            java.util.Iterator r16 = r0.iterator()
            r8 = 0
            r15 = 0
            r11 = 0
            r9 = 0
        L_0x00a2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r16.next()
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r12 = r0.A02
            X.1ci r0 = r10.A0A(r12)
            r13 = 0
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.A0A
            long r2 = (long) r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ca
            int r11 = r11 + 1
            long r0 = (long) r8
            long r0 = r0 + r2
            int r8 = (int) r0
        L_0x00c4:
            int r0 = r10.A02(r12)
            int r15 = r15 + r0
            goto L_0x00a2
        L_0x00ca:
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r9 = r9 + 1
            goto L_0x00c4
        L_0x00d3:
            X.1xg r0 = r5.A09
            r2 = 8
            r0.A03(r2)
            X.1xg r0 = r5.A09
            r1 = 8
            if (r15 <= 0) goto L_0x00e1
            r1 = 0
        L_0x00e1:
            X.1xe r0 = r0.A06
            com.whatsapp.WaImageView r0 = r0.getUnreadImportantIndicatorView()
            r0.setVisibility(r1)
            android.view.View r0 = r5.A00
            r0.setVisibility(r4)
            X.1bI r0 = r5.A0L
            r0.A04(r2)
            X.1bI r0 = r5.A0J
            r0.A04(r2)
            if (r8 <= 0) goto L_0x014e
            X.1xg r3 = r5.A09
            X.0vb r0 = r7.A09
            java.text.NumberFormat r2 = r0.A0L()
            long r0 = (long) r8
            java.lang.String r1 = r2.format(r0)
            X.1xe r0 = r3.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setText(r1)
            X.1xg r9 = r5.A09
            android.view.View r0 = r5.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755469(0x7f1001cd, float:1.9141818E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r4] = r0
            java.lang.String r1 = r3.getQuantityString(r2, r8, r1)
            X.1xe r0 = r9.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setContentDescription(r1)
            X.1xg r1 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A05(r0)
            if (r11 <= r6) goto L_0x0141
        L_0x013c:
            X.1xg r0 = r5.A09
            r0.A01()
        L_0x0141:
            X.1xg r0 = r5.A09
            X.1xe r0 = r0.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setVisibility(r4)
            goto L_0x0360
        L_0x014e:
            if (r9 <= 0) goto L_0x017d
            X.1xg r0 = r5.A09
            java.lang.String r1 = ""
            X.1xe r0 = r0.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setText(r1)
            X.1xg r2 = r5.A09
            android.content.Context r1 = r7.A02
            r0 = 2131891884(0x7f1216ac, float:1.94185E38)
            java.lang.String r1 = r1.getString(r0)
            X.1xe r0 = r2.A06
            android.view.View r0 = r0.getContentView()
            r0.setContentDescription(r1)
            X.1xg r1 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A05(r0)
            if (r9 <= r6) goto L_0x0141
            goto L_0x013c
        L_0x017d:
            r7.A02()
            goto L_0x0360
        L_0x0182:
            X.1xZ r1 = r7.A06
            com.whatsapp.TextEmojiLabel r0 = r1.A08
            r0.A0L()
            android.view.View r0 = r1.A00
            r9 = 0
            r0.setVisibility(r9)
            X.1xg r6 = r1.A09
            r6.A03(r9)
            X.0ve r4 = r6.A05
            X.0vf r1 = X.C18040vf.A01
            r0 = 11039(0x2b1f, float:1.5469E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 != 0) goto L_0x01a7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r6.A05(r0)
        L_0x01a7:
            r1 = 0
            X.1xe r4 = r6.A06
            android.view.View r0 = r4.getContentView()
            r0.setContentDescription(r1)
            boolean r0 = r4.getUnreadIndicatorInflated()
            r1 = 8
            if (r0 == 0) goto L_0x01c0
            com.whatsapp.WaTextView r0 = r4.getUnreadIndicatorView()
            r0.setVisibility(r1)
        L_0x01c0:
            boolean r0 = r4.getUnreadImportantIndicatorInflated()
            if (r0 == 0) goto L_0x01cd
            com.whatsapp.WaImageView r0 = r4.getUnreadImportantIndicatorView()
            r0.setVisibility(r1)
        L_0x01cd:
            int r9 = r10.A02(r2)
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r10)
            r0.get(r2)
            java.lang.Boolean r2 = r3.A07
            X.1xZ r4 = r7.A06
            X.1bI r0 = r4.A0J
            r1 = 8
            r0.A04(r1)
            X.1bI r0 = r4.A0G
            r0.A04(r1)
            X.1bI r0 = r4.A0L
            r0.A04(r1)
            X.1bI r0 = r4.A0C
            r0.A04(r1)
            r3 = 0
            r0 = 4
            if (r5 == r0) goto L_0x01fd
            r0 = 3
            if (r5 == r0) goto L_0x01fd
            r1 = 5
            r0 = 0
            if (r5 != r1) goto L_0x01fe
        L_0x01fd:
            r0 = 1
        L_0x01fe:
            r1 = -1
            if (r0 == 0) goto L_0x0223
            X.0ve r0 = r7.A0B
            boolean r0 = X.AnonymousClass1J8.A08(r0)
            if (r0 != 0) goto L_0x0223
            if (r8 > 0) goto L_0x0215
            if (r8 == r1) goto L_0x0215
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03bb
        L_0x0215:
            X.1bI r0 = r4.A0G
            r0.A04(r3)
            if (r9 <= 0) goto L_0x03bb
            X.1bI r0 = r4.A0J
        L_0x021e:
            r0.A04(r3)
            goto L_0x03bb
        L_0x0223:
            if (r8 <= 0) goto L_0x02b0
            X.1bI r0 = r4.A0L
            android.view.View r5 = r0.A02()
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0vb r0 = r7.A09
            java.text.NumberFormat r2 = r0.A0L()
            long r0 = (long) r8
            java.lang.String r0 = r2.format(r0)
            r5.setText(r0)
            X.1bI r0 = r4.A0L
            android.view.View r6 = r0.A02()
            android.view.View r0 = r4.A0H
            android.content.res.Resources r5 = r0.getResources()
            r2 = 2131755469(0x7f1001cd, float:1.9141818E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r3] = r0
            java.lang.String r0 = r5.getQuantityString(r2, r8, r1)
            r6.setContentDescription(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02a4
            X.0ve r2 = r7.A0B
            r1 = 9682(0x25d2, float:1.3567E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02a4
            X.1bI r0 = r4.A0L
            android.view.View r6 = r0.A02()
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.Context r5 = r7.A02
            r6.setVisibility(r3)
            android.content.Context r2 = r6.getContext()
            r1 = 2130971681(0x7f040c21, float:1.7552107E38)
            r0 = 2131102798(0x7f060c4e, float:1.7818044E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.C17960vV.A07(r5)
            int r0 = X.C19740yt.A00(r5, r0)
            r6.setTextColor(r0)
            r0 = 0
            r6.setBackground(r0)
        L_0x0299:
            if (r9 <= 0) goto L_0x02a0
            X.1bI r0 = r4.A0J
            r0.A04(r3)
        L_0x02a0:
            X.1bI r0 = r4.A0L
            goto L_0x021e
        L_0x02a4:
            X.1bI r0 = r4.A0L
            android.view.View r1 = r0.A02()
            android.content.Context r0 = r7.A02
            A06(r0, r1)
            goto L_0x0299
        L_0x02b0:
            if (r8 == r1) goto L_0x02ba
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03bb
        L_0x02ba:
            X.1bI r0 = r4.A0L
            android.view.View r1 = r0.A02()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = ""
            r1.setText(r0)
            X.1bI r0 = r4.A0L
            android.view.View r2 = r0.A02()
            android.content.Context r1 = r7.A02
            r0 = 2131891884(0x7f1216ac, float:1.94185E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            X.1bI r0 = r4.A0L
            android.view.View r0 = r0.A02()
            A06(r1, r0)
            goto L_0x02a0
        L_0x02e3:
            X.1xg r0 = r5.A09
            r2 = 8
            r0.A03(r2)
            X.1xg r0 = r5.A09
            r1 = 8
            if (r15 <= 0) goto L_0x02f1
            r1 = 0
        L_0x02f1:
            X.1xe r0 = r0.A06
            com.whatsapp.WaImageView r0 = r0.getUnreadImportantIndicatorView()
            r0.setVisibility(r1)
            android.view.View r0 = r5.A00
            r0.setVisibility(r4)
            X.1bI r0 = r5.A0L
            r0.A04(r2)
            X.1bI r0 = r5.A0J
            r0.A04(r2)
            if (r8 <= 0) goto L_0x03bf
            X.1xg r3 = r5.A09
            X.0vb r0 = r7.A09
            java.text.NumberFormat r2 = r0.A0L()
            long r0 = (long) r8
            java.lang.String r1 = r2.format(r0)
            X.1xe r0 = r3.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setText(r1)
            X.1xg r9 = r5.A09
            android.view.View r0 = r5.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755469(0x7f1001cd, float:1.9141818E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r4] = r0
            java.lang.String r1 = r3.getQuantityString(r2, r8, r1)
            X.1xe r0 = r9.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setContentDescription(r1)
            X.1xg r1 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A05(r0)
            if (r11 <= r6) goto L_0x0351
        L_0x034c:
            X.1xg r0 = r5.A09
            r0.A01()
        L_0x0351:
            X.1xg r0 = r5.A09
            X.1xe r0 = r0.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setVisibility(r4)
        L_0x035c:
            r7.A04(r8)
            r8 = 0
        L_0x0360:
            com.whatsapp.TextEmojiLabel r0 = r5.A08
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r5.A08
            X.C43421zm.A04(r0)
            X.1bI r0 = r5.A0R
            r0.A04(r4)
            X.1bI r0 = r5.A0R
            android.view.View r3 = r0.A02()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.0vb r2 = r7.A09
            X.1bI r0 = r5.A0R
            android.view.View r0 = r0.A02()
            android.content.Context r1 = r0.getContext()
            r0 = 2131233205(0x7f0809b5, float:1.808254E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass03S.A01(r1, r0)
            X.3cP r0 = new X.3cP
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            if (r21 == 0) goto L_0x03ae
            X.1xg r0 = r5.A09
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r4] = r21
            X.1xe r0 = r0.A06
            android.view.View r2 = r0.getContentView()
            r1 = 2131888539(0x7f12099b, float:1.9411716E38)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getString(r1, r3)
            r2.setContentDescription(r0)
        L_0x03ae:
            X.1xg r0 = r5.A09
            java.lang.String r1 = "Button"
            X.1xe r0 = r0.A06
            android.view.View r0 = r0.getContentView()
            X.AnonymousClass1Y5.A07(r0, r1)
        L_0x03bb:
            r7.A04(r8)
            return
        L_0x03bf:
            if (r9 <= 0) goto L_0x03ef
            X.1xg r0 = r5.A09
            java.lang.String r1 = ""
            X.1xe r0 = r0.A06
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            r0.setText(r1)
            X.1xg r2 = r5.A09
            android.content.Context r1 = r7.A02
            r0 = 2131891884(0x7f1216ac, float:1.94185E38)
            java.lang.String r1 = r1.getString(r0)
            X.1xe r0 = r2.A06
            android.view.View r0 = r0.getContentView()
            r0.setContentDescription(r1)
            X.1xg r1 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A05(r0)
            if (r9 <= r6) goto L_0x0351
            goto L_0x034c
        L_0x03ef:
            r7.A02()
            goto L_0x035c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A09(X.1yy, X.1BI, java.lang.Boolean, java.lang.String, int):void");
    }

    private void A0C(AnonymousClass1E7 r11, UserJid userJid, C139106yE r13, WDSProfilePhoto wDSProfilePhoto, String str) {
        int i;
        if (r11 != null) {
            if (this.A03.A0O(r11.A0J)) {
                str = this.A02.getString(2131898595);
            }
            if (str != null) {
                Context context = this.A02;
                String string = context.getString(2131896788);
                String string2 = context.getString(2131896787, new Object[]{str});
                String string3 = context.getString(2131896790);
                if (r13 != null && r13.A01() && ((i = r13.A01) > 0 || (this.A08 == 1 && this.A0V))) {
                    string2 = context.getResources().getQuantityString(2131755452, i, new Object[]{str, Integer.valueOf(i)});
                }
                if (userJid != null) {
                    if (C43391zj.A00(this.A04, this.A0A, userJid) > 0) {
                        string2 = context.getString(2131896789, new Object[]{string2});
                    }
                }
                AnonymousClass1Y5.A08(wDSProfilePhoto, string2, string, string3);
            }
        }
    }

    private void A0D(C139106yE r4, WDSProfilePhoto wDSProfilePhoto) {
        int i;
        C39211sh r1;
        if (r4 == null || !r4.A01() || ((i = r4.A01) <= 0 && (this.A08 != 1 || !this.A0V))) {
            wDSProfilePhoto.setStatusIndicatorEnabled(false);
            return;
        }
        wDSProfilePhoto.setProfilePhotoShape(C39201sg.CIRCLE);
        wDSProfilePhoto.setStatusIndicatorEnabled(true);
        if (i > 0) {
            r1 = C39211sh.UNSEEN;
        } else {
            r1 = C39211sh.SEEN_CHATLIST;
        }
        wDSProfilePhoto.setProfileStatus(new C39231sj(r1));
    }

    private boolean A0E() {
        int i = this.A08;
        if (i == 4 || i == 3 || i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04bc, code lost:
        if (X.C18020vd.A05(r1, r3.A0d, 8530) == false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04e2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04e3, code lost:
        if (r35 != null) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04e5, code lost:
        r19.C4E(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04ec, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0400 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0433 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0468 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x046f A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0481 A[Catch:{ all -> 0x04e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F(X.C42481yF r33, X.C42931yy r34, X.C38341r8 r35, int r36) {
        /*
            r7 = r34
            X.1BI r5 = r7.A03
            X.1E7 r4 = r7.A01
            X.1E7 r0 = r7.A02
            r32 = r0
            X.206 r0 = r7.A05
            r21 = r0
            com.whatsapp.jid.GroupJid r0 = r7.A04
            r31 = r0
            java.lang.String r0 = r7.A08
            r20 = r0
            r6 = r33
            android.content.Context r0 = r6.A02
            r22 = r0
            X.C17960vV.A07(r22)
            r19 = r35
            r33 = r36
            X.1xZ r3 = r6.A06     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A02     // Catch:{ all -> 0x04e0 }
            r11 = 0
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
            X.0ve r2 = r6.A0B     // Catch:{ all -> 0x04e0 }
            r0 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x04e0 }
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x003c
            com.whatsapp.TextEmojiLabel r0 = r3.A07     // Catch:{ all -> 0x04e0 }
            r0.setPlaceholder(r11)     // Catch:{ all -> 0x04e0 }
        L_0x003c:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x04e0 }
            X.1EC r8 = X.C42941yz.A00(r5)     // Catch:{ all -> 0x04e0 }
            X.1CJ r0 = r6.A0A     // Catch:{ all -> 0x04e0 }
            r30 = r0
            int r10 = r0.A06(r8)     // Catch:{ all -> 0x04e0 }
            X.1E7 r0 = r7.A00     // Catch:{ all -> 0x04e0 }
            r9 = 0
            r12 = r6
            r13 = r4
            r14 = r0
            r15 = r8
            r16 = r20
            r17 = r10
            r18 = r11
            r12.A0B(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x04e0 }
            boolean r0 = X.C22971Dz.A0c(r5)     // Catch:{ all -> 0x04e0 }
            r8 = r0 ^ 1
            r0 = 1
            if (r8 != r0) goto L_0x0069
            X.1bI r0 = r3.A0Q     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r0.A00     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x0074
        L_0x0069:
            X.1bI r0 = r3.A0Q     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r0.A02()     // Catch:{ all -> 0x04e0 }
            com.whatsapp.components.SelectionCheckView r0 = (com.whatsapp.components.SelectionCheckView) r0     // Catch:{ all -> 0x04e0 }
            r0.setEnabled(r8)     // Catch:{ all -> 0x04e0 }
        L_0x0074:
            X.1jm r0 = r6.A0J     // Catch:{ all -> 0x04e0 }
            r29 = r0
            java.util.Set r0 = r29.BYt()     // Catch:{ all -> 0x04e0 }
            boolean r12 = r0.contains(r5)     // Catch:{ all -> 0x04e0 }
            r0 = r29
            boolean r8 = r0.CEa(r5)     // Catch:{ all -> 0x04e0 }
            if (r12 == 0) goto L_0x00dd
            r0 = 2
            r3.A0J(r11, r0)     // Catch:{ all -> 0x04e0 }
        L_0x008c:
            r3.A0L(r12, r8)     // Catch:{ all -> 0x04e0 }
            boolean r0 = X.C22971Dz.A0c(r5)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x0179
            android.widget.ImageView r8 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0 = 1
            r8.setEnabled(r0)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            A07(r0, r5)     // Catch:{ all -> 0x04e0 }
            X.1zS r12 = new X.1zS     // Catch:{ all -> 0x04e0 }
            r12.<init>(r6, r5)     // Catch:{ all -> 0x04e0 }
            X.1zT r8 = new X.1zT     // Catch:{ all -> 0x04e0 }
            r0 = r33
            r8.<init>(r6, r5, r0)     // Catch:{ all -> 0x04e0 }
            X.1zU r13 = new X.1zU     // Catch:{ all -> 0x04e0 }
            r13.<init>(r6, r5)     // Catch:{ all -> 0x04e0 }
            android.view.View$OnCreateContextMenuListener r0 = r29.BVh()     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x00c0
            android.view.View r14 = r3.A0H     // Catch:{ all -> 0x04e0 }
            android.view.View$OnCreateContextMenuListener r0 = r29.BVh()     // Catch:{ all -> 0x04e0 }
            r14.setOnCreateContextMenuListener(r0)     // Catch:{ all -> 0x04e0 }
        L_0x00c0:
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0.setOnClickListener(r8)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setOnClickListener(r8)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0.setOnLongClickListener(r13)     // Catch:{ all -> 0x04e0 }
            android.view.View r14 = r3.A0H     // Catch:{ all -> 0x04e0 }
            r14.setOnClickListener(r12)     // Catch:{ all -> 0x04e0 }
            r14.setOnLongClickListener(r13)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setOnLongClickListener(r13)     // Catch:{ all -> 0x04e0 }
            goto L_0x00e1
        L_0x00dd:
            r3.A0J(r11, r11)     // Catch:{ all -> 0x04e0 }
            goto L_0x008c
        L_0x00e1:
            if (r20 == 0) goto L_0x01bf
            r15 = r20
            boolean r0 = r6.A0E()     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x01bf
            r8 = 6
            r12 = 3
            r13 = 2
            if (r10 == r13) goto L_0x0113
            if (r10 == r12) goto L_0x0113
            if (r10 == r8) goto L_0x0113
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e0 }
            r8.<init>()     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = "ConversationViewFiller/setSubgroupAccessibilityStringsIfNeeded/group type: "
            r8.append(r0)     // Catch:{ all -> 0x04e0 }
            r8.append(r10)     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = " wasn't expected in this view, set a11y appropriately"
            r8.append(r0)     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x04e0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04e0 }
            r0 = 0
            X.AnonymousClass1HF.A0f(r14, r0)     // Catch:{ all -> 0x04e0 }
            goto L_0x01bf
        L_0x0113:
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            r16 = r0
            if (r10 != r12) goto L_0x0122
            r12 = 2131888506(0x7f12097a, float:1.941165E38)
            r0 = r22
            java.lang.String r15 = r0.getString(r12)     // Catch:{ all -> 0x04e0 }
        L_0x0122:
            r0 = r16
            X.1xe r0 = r0.A06     // Catch:{ all -> 0x04e0 }
            android.view.View r12 = r0.getContentView()     // Catch:{ all -> 0x04e0 }
            r12.setContentDescription(r15)     // Catch:{ all -> 0x04e0 }
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            java.lang.String r12 = "Button"
            X.1xe r0 = r0.A06     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r0.getContentView()     // Catch:{ all -> 0x04e0 }
            X.AnonymousClass1Y5.A07(r0, r12)     // Catch:{ all -> 0x04e0 }
            int r12 = r6.A08     // Catch:{ all -> 0x04e0 }
            r0 = 4
            if (r12 == r0) goto L_0x0145
            r0 = 5
            if (r12 == r0) goto L_0x014c
            if (r12 == r8) goto L_0x014c
            goto L_0x01a6
        L_0x0145:
            r0 = 2131888887(0x7f120af7, float:1.9412422E38)
            X.AnonymousClass1Y5.A02(r14, r0)     // Catch:{ all -> 0x04e0 }
            goto L_0x016e
        L_0x014c:
            X.1zB[] r12 = new X.C43061zB[r13]     // Catch:{ all -> 0x04e0 }
            r15 = 16
            r8 = 2131888887(0x7f120af7, float:1.9412422E38)
            X.1zB r0 = new X.1zB     // Catch:{ all -> 0x04e0 }
            r0.<init>(r15, r8)     // Catch:{ all -> 0x04e0 }
            r12[r11] = r0     // Catch:{ all -> 0x04e0 }
            X.1zB r16 = new X.1zB     // Catch:{ all -> 0x04e0 }
            r8 = 2131886301(0x7f1200dd, float:1.9407177E38)
            r0 = 32
            r15 = r8
            r8 = r0
            r0 = r16
            r0.<init>(r8, r15)     // Catch:{ all -> 0x04e0 }
            r0 = 1
            r12[r0] = r16     // Catch:{ all -> 0x04e0 }
            X.AnonymousClass1Y5.A0B(r14, r12)     // Catch:{ all -> 0x04e0 }
        L_0x016e:
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0.setImportantForAccessibility(r13)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setImportantForAccessibility(r13)     // Catch:{ all -> 0x04e0 }
            goto L_0x01bf
        L_0x0179:
            r8 = r5
            X.1EB r8 = (X.AnonymousClass1EB) r8     // Catch:{ all -> 0x04e0 }
            r0 = 10
            X.4dO r12 = new X.4dO     // Catch:{ all -> 0x04e0 }
            r12.<init>(r6, r8, r0)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0.setEnabled(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r0.setOnClickListener(r12)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A04     // Catch:{ all -> 0x04e0 }
            r8 = 0
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A0H     // Catch:{ all -> 0x04e0 }
            r0.setOnClickListener(r12)     // Catch:{ all -> 0x04e0 }
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setOnClickListener(r12)     // Catch:{ all -> 0x04e0 }
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x04e0 }
            goto L_0x01bf
        L_0x01a6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e0 }
            r8.<init>()     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = "ConversationViewFiller/setSubgroupAccessibilityStringsIfNeeded/Use case: "
            r8.append(r0)     // Catch:{ all -> 0x04e0 }
            r8.append(r12)     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = " wasn't expected here, set a11y appropriately"
            r8.append(r0)     // Catch:{ all -> 0x04e0 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x04e0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04e0 }
        L_0x01bf:
            android.view.View r0 = r3.A01     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
            r0 = 11256(0x2bf8, float:1.5773E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x01db
            com.whatsapp.TextEmojiLabel r0 = r3.A08     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A06     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A05     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
        L_0x01db:
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            r0.A03(r11)     // Catch:{ all -> 0x04e0 }
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            X.1xi r0 = r0.A03     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r0 = r0.A01     // Catch:{ all -> 0x04e0 }
            r0.setPadding(r11, r11, r11, r11)     // Catch:{ all -> 0x04e0 }
            X.11S r8 = r6.A03     // Catch:{ all -> 0x04e0 }
            X.1BI r0 = r4.A0J     // Catch:{ all -> 0x04e0 }
            boolean r0 = r8.A0O(r0)     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x023a
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            java.util.List r13 = r29.BXB()     // Catch:{ all -> 0x04e0 }
            X.1zf r8 = r6.A0G     // Catch:{ all -> 0x04e0 }
            X.1xi r12 = r0.A03     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r0 = r12.A01     // Catch:{ all -> 0x04e0 }
            r0.setPlaceholder(r11)     // Catch:{ all -> 0x04e0 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A09(r4, r8, r13, r0)     // Catch:{ all -> 0x04e0 }
        L_0x0207:
            r0 = 9682(0x25d2, float:1.3567E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x0222
            r0 = 11256(0x2bf8, float:1.5773E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x0222
            r14 = 0
            r11 = r6
            r12 = r7
            r13 = r5
            r15 = r20
            r16 = r10
            r11.A09(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04e0 }
        L_0x0222:
            r0 = 11256(0x2bf8, float:1.5773E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            if (r0 != 0) goto L_0x029b
            r0 = r21
            boolean r0 = r0 instanceof X.C436420i     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x029b
            r0 = r21
            X.20i r0 = (X.C436420i) r0     // Catch:{ all -> 0x04e0 }
            int r11 = r0.A00     // Catch:{ all -> 0x04e0 }
            r0 = 2
            if (r11 == r0) goto L_0x027e
            goto L_0x027b
        L_0x023a:
            r0 = r30
            boolean r0 = r0.A0R(r5)     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x0266
            boolean r0 = r6.A0E()     // Catch:{ all -> 0x04e0 }
            r8 = 1
            if (r0 != 0) goto L_0x024d
            int r0 = r6.A08     // Catch:{ all -> 0x04e0 }
            if (r0 != r8) goto L_0x0266
        L_0x024d:
            X.1xg r12 = r3.A09     // Catch:{ all -> 0x04e0 }
            X.118 r8 = r6.A08     // Catch:{ all -> 0x04e0 }
            r0 = 2131888506(0x7f12097a, float:1.941165E38)
            java.lang.String r13 = r8.A01(r0)     // Catch:{ all -> 0x04e0 }
            X.1zf r8 = r6.A0G     // Catch:{ all -> 0x04e0 }
            X.1xi r12 = r12.A03     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r0 = r12.A01     // Catch:{ all -> 0x04e0 }
            r0.setPlaceholder(r11)     // Catch:{ all -> 0x04e0 }
            r0 = 0
            r12.A0F(r8, r13, r0)     // Catch:{ all -> 0x04e0 }
            goto L_0x0207
        L_0x0266:
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            java.util.List r12 = r29.BXB()     // Catch:{ all -> 0x04e0 }
            X.1zf r8 = r6.A0G     // Catch:{ all -> 0x04e0 }
            X.1xi r11 = r0.A03     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r0 = r11.A01     // Catch:{ all -> 0x04e0 }
            r0.setPlaceholder(r9)     // Catch:{ all -> 0x04e0 }
            r0 = r20
            r11.A0F(r8, r0, r12)     // Catch:{ all -> 0x04e0 }
            goto L_0x0207
        L_0x027b:
            r0 = 3
            if (r11 != r0) goto L_0x029b
        L_0x027e:
            java.lang.String r0 = r21.A0P()     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x02e5
            int r0 = r0.length()     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x02e5
            java.lang.String r12 = r21.A0P()     // Catch:{ all -> 0x04e0 }
        L_0x028e:
            X.1xg r0 = r3.A09     // Catch:{ all -> 0x04e0 }
            X.1xi r11 = r0.A03     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r0 = r11.A01     // Catch:{ all -> 0x04e0 }
            r0.setPlaceholder(r9)     // Catch:{ all -> 0x04e0 }
            r0 = 0
            r11.A0F(r8, r12, r0)     // Catch:{ all -> 0x04e0 }
        L_0x029b:
            X.C17960vV.A07(r22)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0P     // Catch:{ all -> 0x04e0 }
            r11 = 8
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A06     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r9)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0R     // Catch:{ all -> 0x04e0 }
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0S     // Catch:{ all -> 0x04e0 }
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r0 = r3.A05     // Catch:{ all -> 0x04e0 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0N     // Catch:{ all -> 0x04e0 }
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0H     // Catch:{ all -> 0x04e0 }
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            X.1bI r0 = r3.A0T     // Catch:{ all -> 0x04e0 }
            r0.A04(r11)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r11 = r3.A05     // Catch:{ all -> 0x04e0 }
            r0 = 0
            r11.setBackground(r0)     // Catch:{ all -> 0x04e0 }
            java.util.Set r0 = r7.A09     // Catch:{ all -> 0x04e0 }
            r18 = r0
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r11 = r4.A06(r0)     // Catch:{ all -> 0x04e0 }
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x04e0 }
            X.1BI r11 = (X.AnonymousClass1BI) r11     // Catch:{ all -> 0x04e0 }
            int r0 = r6.A08     // Catch:{ all -> 0x04e0 }
            r13 = 7
            r12 = 8
            if (r0 != r13) goto L_0x0357
            goto L_0x02f5
        L_0x02e5:
            X.118 r0 = r6.A08     // Catch:{ all -> 0x04e0 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x04e0 }
            android.content.res.Resources r11 = r0.getResources()     // Catch:{ all -> 0x04e0 }
            r0 = 2131890864(0x7f1212b0, float:1.9416432E38)
            java.lang.String r12 = r11.getString(r0)     // Catch:{ all -> 0x04e0 }
            goto L_0x028e
        L_0x02f5:
            if (r18 == 0) goto L_0x0357
            com.whatsapp.TextEmojiLabel r11 = r3.A08     // Catch:{ all -> 0x04e0 }
            r11.setVisibility(r12)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r11 = r3.A07     // Catch:{ all -> 0x04e0 }
            r28 = r11
            android.content.res.Resources r17 = r22.getResources()     // Catch:{ all -> 0x04e0 }
            int r16 = r18.size()     // Catch:{ all -> 0x04e0 }
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x04e0 }
            X.1Me r12 = r6.A05     // Catch:{ all -> 0x04e0 }
            java.util.Iterator r15 = r18.iterator()     // Catch:{ all -> 0x04e0 }
        L_0x0311:
            boolean r13 = r15.hasNext()     // Catch:{ all -> 0x04e0 }
            if (r13 == 0) goto L_0x032c
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x04e0 }
            X.1E7 r13 = (X.AnonymousClass1E7) r13     // Catch:{ all -> 0x04e0 }
            if (r13 == 0) goto L_0x0311
            X.1BI r14 = r13.A0J     // Catch:{ all -> 0x04e0 }
            X.11S r13 = r12.A00     // Catch:{ all -> 0x04e0 }
            boolean r13 = r13.A0O(r14)     // Catch:{ all -> 0x04e0 }
            if (r13 == 0) goto L_0x0311
            r26 = 1
            goto L_0x032e
        L_0x032c:
            r26 = 0
        L_0x032e:
            r24 = 2
            r25 = -1
            r27 = 1
            r22 = r12
            r23 = r18
            java.lang.String r12 = r22.A0b(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x04e0 }
            r11[r9] = r12     // Catch:{ all -> 0x04e0 }
            r14 = 2131755364(0x7f100164, float:1.9141605E38)
            r13 = r17
            r12 = r16
            java.lang.String r24 = r13.getQuantityString(r14, r12, r11)     // Catch:{ all -> 0x04e0 }
            java.util.List r25 = r29.BXB()     // Catch:{ all -> 0x04e0 }
            r26 = 150(0x96, float:2.1E-43)
            r22 = r28
            r23 = r8
            r22.A0Q(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x04e0 }
            goto L_0x03bc
        L_0x0357:
            X.1BI r8 = r4.A0J     // Catch:{ all -> 0x04e0 }
            boolean r8 = X.C22971Dz.A0N(r8)     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x039e
            X.00H r8 = r6.A0H     // Catch:{ all -> 0x04e0 }
            boolean r8 = X.C42561yN.A00(r11, r8)     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x039e
            X.1xn r8 = r6.A09     // Catch:{ all -> 0x04e0 }
            java.lang.String r11 = r8.A00(r4)     // Catch:{ all -> 0x04e0 }
            if (r11 == 0) goto L_0x039e
            android.widget.ImageView r8 = r3.A06     // Catch:{ all -> 0x04e0 }
            r8.setVisibility(r12)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r8 = r3.A08     // Catch:{ all -> 0x04e0 }
            r8.setVisibility(r12)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r8 = r3.A05     // Catch:{ all -> 0x04e0 }
            r8.setVisibility(r12)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r8 = r3.A07     // Catch:{ all -> 0x04e0 }
            r8.setText(r11)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r12 = r3.A07     // Catch:{ all -> 0x04e0 }
            r13 = 2130969175(0x7f040257, float:1.7547024E38)
            r11 = 2131100193(0x7f060221, float:1.781276E38)
            r8 = r22
            int r11 = X.AnonymousClass1YL.A00(r8, r13, r11)     // Catch:{ all -> 0x04e0 }
            int r8 = X.C19740yt.A00(r8, r11)     // Catch:{ all -> 0x04e0 }
            r12.setTextColor(r8)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r8 = r3.A07     // Catch:{ all -> 0x04e0 }
            X.C43421zm.A04(r8)     // Catch:{ all -> 0x04e0 }
            goto L_0x03bc
        L_0x039e:
            if (r0 != 0) goto L_0x03be
            X.1BI r11 = r4.A0J     // Catch:{ all -> 0x04e0 }
            if (r11 == 0) goto L_0x03be
            r8 = r30
            boolean r8 = r8.A0S(r11)     // Catch:{ all -> 0x04e0 }
            if (r8 == 0) goto L_0x03be
            com.whatsapp.TextEmojiLabel r8 = r3.A07     // Catch:{ all -> 0x04e0 }
            X.C43411zl.A00(r8)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.TextEmojiLabel r11 = r3.A07     // Catch:{ all -> 0x04e0 }
            java.lang.String r8 = r4.A0Z     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x03b9
            java.lang.String r8 = ""
        L_0x03b9:
            r11.A0R(r8)     // Catch:{ all -> 0x04e0 }
        L_0x03bc:
            r13 = 1
            goto L_0x03bf
        L_0x03be:
            r13 = 0
        L_0x03bf:
            r8 = 11256(0x2bf8, float:1.5773E-41)
            boolean r8 = X.C18020vd.A05(r1, r2, r8)     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x03d2
            if (r13 != 0) goto L_0x03d2
            r12 = r32
            r11 = r31
            r8 = r21
            r6.A0H(r4, r12, r11, r8)     // Catch:{ all -> 0x04e0 }
        L_0x03d2:
            X.1bI r11 = r3.A0D     // Catch:{ all -> 0x04e0 }
            r8 = r30
            boolean r8 = r8.A0Q(r5)     // Catch:{ all -> 0x04e0 }
            if (r8 == 0) goto L_0x03f1
            if (r0 == 0) goto L_0x03ef
            r8 = 6
            if (r0 == r8) goto L_0x03ef
            r8 = 5
            if (r0 == r8) goto L_0x03ef
            r8 = 4
            if (r0 == r8) goto L_0x03ef
            X.0z4 r8 = r6.A0K     // Catch:{ all -> 0x04e0 }
            boolean r8 = r8.A2Q()     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x03f1
        L_0x03ef:
            r8 = 0
            goto L_0x03f3
        L_0x03f1:
            r8 = 8
        L_0x03f3:
            r11.A04(r8)     // Catch:{ all -> 0x04e0 }
            X.1xg r12 = r3.A09     // Catch:{ all -> 0x04e0 }
            X.1BI r8 = r4.A0J     // Catch:{ all -> 0x04e0 }
            boolean r8 = X.C43381zi.A01(r2, r8)     // Catch:{ all -> 0x04e0 }
            if (r8 != 0) goto L_0x0411
            boolean r8 = r4.A0O()     // Catch:{ all -> 0x04e0 }
            if (r8 == 0) goto L_0x040f
            r8 = 3961(0xf79, float:5.55E-42)
            boolean r2 = X.C18020vd.A05(r1, r2, r8)     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x040f
            goto L_0x0411
        L_0x040f:
            r2 = 0
            goto L_0x0412
        L_0x0411:
            r2 = 1
        L_0x0412:
            X.1xi r11 = r12.A03     // Catch:{ all -> 0x04e0 }
            r11.A0E(r4)     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x0427
            X.0ve r8 = r12.A05     // Catch:{ all -> 0x04e0 }
            r2 = 9292(0x244c, float:1.3021E-41)
            boolean r2 = X.C18020vd.A05(r1, r8, r2)     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x0427
            r2 = 1
            r11.A03(r2)     // Catch:{ all -> 0x04e0 }
        L_0x0427:
            X.1tF r2 = r6.A0R     // Catch:{ all -> 0x04e0 }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x046f
            boolean r2 = r5 instanceof X.AnonymousClass1ED     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x046f
            X.1bI r2 = r3.A0K     // Catch:{ all -> 0x04e0 }
            r2.A04(r9)     // Catch:{ all -> 0x04e0 }
            X.1bI r2 = r3.A0K     // Catch:{ all -> 0x04e0 }
            android.view.View r2 = r2.A02()     // Catch:{ all -> 0x04e0 }
            com.whatsapp.WaTextView r2 = (com.whatsapp.WaTextView) r2     // Catch:{ all -> 0x04e0 }
            r6.A00 = r2     // Catch:{ all -> 0x04e0 }
            X.1kr r8 = r6.A0S     // Catch:{ all -> 0x04e0 }
            r2 = r5
            X.1ED r2 = (X.AnonymousClass1ED) r2     // Catch:{ all -> 0x04e0 }
            java.lang.String r8 = r8.A00(r2)     // Catch:{ all -> 0x04e0 }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x0469
            java.lang.String r2 = "ConversationViewFiller/setInteropLabelIfNeeded no display name"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x04e0 }
            com.whatsapp.WaTextView r8 = r6.A00     // Catch:{ all -> 0x04e0 }
            java.lang.String r2 = ""
            r8.setText(r2)     // Catch:{ all -> 0x04e0 }
        L_0x045d:
            X.1M9 r8 = r6.A04     // Catch:{ all -> 0x04e0 }
            r2 = r30
            int r8 = X.C43391zj.A00(r8, r2, r5)     // Catch:{ all -> 0x04e0 }
            r2 = 0
            if (r8 <= 0) goto L_0x0478
            goto L_0x0477
        L_0x0469:
            com.whatsapp.WaTextView r2 = r6.A00     // Catch:{ all -> 0x04e0 }
            r2.setText(r8)     // Catch:{ all -> 0x04e0 }
            goto L_0x045d
        L_0x046f:
            X.1bI r8 = r3.A0K     // Catch:{ all -> 0x04e0 }
            r2 = 8
            r8.A04(r2)     // Catch:{ all -> 0x04e0 }
            goto L_0x045d
        L_0x0477:
            r2 = 1
        L_0x0478:
            r3.A0K(r2, r8)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r8 = r3.A04     // Catch:{ all -> 0x04e0 }
            boolean r2 = r8 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto     // Catch:{ all -> 0x04e0 }
            if (r2 == 0) goto L_0x04a1
            X.6yE r2 = r7.A06     // Catch:{ all -> 0x04e0 }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r8 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r8     // Catch:{ all -> 0x04e0 }
            r6.A0D(r2, r8)     // Catch:{ all -> 0x04e0 }
            android.widget.ImageView r8 = r3.A04     // Catch:{ all -> 0x04e0 }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r8 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r8     // Catch:{ all -> 0x04e0 }
            X.6yE r7 = r6.A07     // Catch:{ all -> 0x04e0 }
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x04e0 }
            com.whatsapp.jid.UserJid r23 = X.C22941Dw.A01(r5)     // Catch:{ all -> 0x04e0 }
            r21 = r6
            r22 = r4
            r24 = r7
            r25 = r8
            r26 = r20
            r21.A0C(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x04e0 }
        L_0x04a1:
            android.view.View r2 = r3.A00     // Catch:{ all -> 0x04e0 }
            r2.setVisibility(r9)     // Catch:{ all -> 0x04e0 }
            r2 = 6
            if (r0 == r2) goto L_0x04ac
            r2 = 5
            if (r0 != r2) goto L_0x04d6
        L_0x04ac:
            r0 = 2
            if (r10 != r0) goto L_0x04be
            boolean r0 = r4.A0n     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x04be
            X.0ve r2 = r3.A0d     // Catch:{ all -> 0x04e0 }
            r0 = 8530(0x2152, float:1.1953E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x04e0 }
            r4 = 1
            if (r0 != 0) goto L_0x04bf
        L_0x04be:
            r4 = 0
        L_0x04bf:
            android.widget.ImageView r2 = r3.A04     // Catch:{ all -> 0x04e0 }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2     // Catch:{ all -> 0x04e0 }
            X.1sk r1 = r2.A04     // Catch:{ all -> 0x04e0 }
            boolean r0 = r1 instanceof X.C42111xd     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x04cd
            if (r4 != 0) goto L_0x04cd
            r0 = 0
            goto L_0x04d3
        L_0x04cd:
            if (r1 != 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            X.1sk r0 = r3.A0g     // Catch:{ all -> 0x04e0 }
        L_0x04d3:
            r2.setProfileBadge(r0)     // Catch:{ all -> 0x04e0 }
        L_0x04d6:
            if (r35 == 0) goto L_0x04df
            r1 = r19
            r0 = r33
            r1.C4E(r0)
        L_0x04df:
            return r13
        L_0x04e0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04e2 }
        L_0x04e2:
            r2 = move-exception
            if (r35 == 0) goto L_0x04ec
            r1 = r19
            r0 = r33
            r1.C4E(r0)
        L_0x04ec:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A0F(X.1yF, X.1yy, X.1r8, int):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.2DB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: X.1zo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.2DB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: X.2DB} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r2, 10545) == false) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0422  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0J(X.C39621tN r38, X.C38341r8 r39, X.C139106yE r40, int r41, boolean r42) {
        /*
            r37 = this;
            r8 = r38
            X.1tO r8 = (X.C39631tO) r8
            r7 = r37
            r17 = r40
            if (r40 == 0) goto L_0x000e
            r0 = r17
            r7.A07 = r0
        L_0x000e:
            boolean r4 = r7.A0E()
            if (r4 != 0) goto L_0x001b
            int r1 = r7.A08
            r0 = 1
            if (r1 == r0) goto L_0x001b
            if (r1 != 0) goto L_0x00c0
        L_0x001b:
            X.1xZ r3 = r7.A06
            android.widget.ImageView r0 = r3.A04
            android.content.res.Resources r6 = r0.getResources()
            X.0ve r2 = r7.A0B
            if (r4 == 0) goto L_0x0431
            if (r2 == 0) goto L_0x042c
            X.0vf r1 = X.C18040vf.A01
            r0 = 10545(0x2931, float:1.4777E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x042c
        L_0x0033:
            r0 = 2131169509(0x7f0710e5, float:1.795335E38)
        L_0x0036:
            int r5 = r6.getDimensionPixelSize(r0)
            int r10 = r7.A08
            r4 = 4
            if (r10 != r4) goto L_0x0427
            if (r2 == 0) goto L_0x004b
            X.0vf r1 = X.C18040vf.A01
            r0 = 10545(0x2931, float:1.4777E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0427
        L_0x004b:
            r0 = 2131166369(0x7f0704a1, float:1.7946981E38)
        L_0x004e:
            int r9 = r6.getDimensionPixelSize(r0)
            if (r10 != r4) goto L_0x0422
            if (r2 == 0) goto L_0x0063
            X.0vf r1 = X.C18040vf.A01
            r0 = 10545(0x2931, float:1.4777E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 2131166370(0x7f0704a2, float:1.7946983E38)
            if (r1 != 0) goto L_0x0066
        L_0x0063:
            r0 = 2131166369(0x7f0704a1, float:1.7946981E38)
        L_0x0066:
            int r1 = r6.getDimensionPixelSize(r0)
            r0 = 2131168778(0x7f070e0a, float:1.7951867E38)
            int r2 = r6.getDimensionPixelSize(r0)
            r0 = 2131166369(0x7f0704a1, float:1.7946981E38)
            int r4 = r6.getDimensionPixelSize(r0)
            android.view.View r0 = r3.A01
            X.C42491yG.A09(r0, r9, r1)
            X.1bI r1 = r3.A0J
            android.view.ViewGroup$LayoutParams r0 = r1.A03()
            r0.width = r2
            r0.height = r2
            r1.A06(r0)
            X.1bI r1 = r3.A0O
            android.view.ViewGroup$LayoutParams r0 = r1.A03()
            r0.width = r2
            r0.height = r2
            r1.A06(r0)
            X.1bI r1 = r3.A0M
            android.view.ViewGroup$LayoutParams r0 = r1.A03()
            r0.width = r2
            r0.height = r2
            r1.A06(r0)
            X.1sf r2 = X.C39191sf.SMALL
            int r0 = r2.dimension
            int r0 = r6.getDimensionPixelSize(r0)
            if (r5 == r0) goto L_0x00b0
            X.1sf r2 = X.C39191sf.MEDIUM
        L_0x00b0:
            android.widget.ImageView r1 = r3.A04
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x041d
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r1.setProfilePhotoSize(r2)
        L_0x00bb:
            android.view.View r0 = r3.A02
            r0.setMinimumHeight(r4)
        L_0x00c0:
            X.1BI r6 = r8.BTb()
            X.1E7 r1 = r8.A00
            boolean r0 = r8 instanceof X.C42191xm
            if (r0 == 0) goto L_0x0419
            r0 = r8
            X.1xm r0 = (X.C42191xm) r0
            java.util.Set r0 = r0.A01
            r16 = r0
        L_0x00d1:
            r0 = r16
            X.2lZ r3 = r7.A00(r1, r6, r0)
            r36 = r39
            r35 = r41
            if (r3 == 0) goto L_0x0134
            X.1yy r2 = r3.A01
            r1 = r36
            r0 = r35
            boolean r1 = A0F(r7, r2, r1, r0)
            X.25M r0 = r3.A00
            A08(r0, r7, r2, r1)
        L_0x00ec:
            r7.A06 = r8
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r4 = X.C36321nh.A00(r6)
            X.00H r0 = r7.A0H
            java.lang.Object r8 = r0.get()
            X.1yO r8 = (X.C42571yO) r8
            if (r4 == 0) goto L_0x0133
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1TD r5 = r8.A03
            java.util.Map r0 = r5.A0H
            java.lang.Object r0 = r0.get(r6)
            if (r0 != 0) goto L_0x0133
            X.1TA r0 = r7.A0N
            X.2Q4 r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0444
            X.1TD r2 = r7.A0L
            long r0 = r0.A01()
            X.9Bw r3 = r2.A04(r0)
            if (r3 == 0) goto L_0x0444
            X.00H r0 = r5.A0E
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 2
            X.3C4 r1 = new X.3C4
            r1.<init>(r5, r4, r3, r0)
            r0 = 15
            r2.A01(r1, r0)
        L_0x0133:
            return
        L_0x0134:
            if (r42 == 0) goto L_0x025d
            X.1y3 r0 = r7.A0A
            X.1K2 r0 = r0.A00
            X.10E r13 = r0.A01
            X.00S r0 = r13.A04
            java.lang.Object r12 = r0.get()
            X.0ve r12 = (X.C18030ve) r12
            X.00S r0 = r13.A63
            java.lang.Object r11 = r0.get()
            X.11S r11 = (X.AnonymousClass11S) r11
            X.00S r0 = r13.A13
            java.lang.Object r10 = r0.get()
            X.1PW r10 = (X.AnonymousClass1PW) r10
            X.00S r0 = r13.A2H
            java.lang.Object r9 = r0.get()
            X.1CJ r9 = (X.AnonymousClass1CJ) r9
            X.00S r0 = r13.ABX
            java.lang.Object r5 = r0.get()
            X.1Me r5 = (X.C24921Me) r5
            X.00S r0 = r13.A2f
            java.lang.Object r4 = r0.get()
            X.1M9 r4 = (X.AnonymousClass1M9) r4
            X.00S r0 = r13.A5f
            java.lang.Object r3 = r0.get()
            X.1R3 r3 = (X.AnonymousClass1R3) r3
            X.00S r0 = r13.AA1
            java.lang.Object r2 = r0.get()
            X.1xp r2 = (X.C42221xp) r2
            X.00S r0 = r13.A2L
            java.lang.Object r1 = r0.get()
            X.1kb r1 = (X.C34511kb) r1
            X.10G r0 = r13.A00
            X.00S r0 = r0.A39
            java.lang.Object r0 = r0.get()
            X.1yA r0 = (X.C42431yA) r0
            X.00S r13 = r13.A1h
            X.00H r27 = X.C000200d.A00(r13)
            X.0zB r14 = X.C19890zB.A00
            X.1yS r13 = new X.1yS
            r24 = r6
            r25 = r0
            r26 = r17
            r28 = r16
            r15 = r11
            r16 = r10
            r17 = r1
            r18 = r4
            r19 = r5
            r20 = r9
            r21 = r3
            r22 = r2
            r23 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7.A04 = r13
            java.lang.Object r14 = r13.call()     // Catch:{ all -> 0x0459 }
            X.1yy r14 = (X.C42931yy) r14     // Catch:{ all -> 0x0459 }
            if (r14 == 0) goto L_0x00ec
            r1 = r36
            r0 = r35
            boolean r13 = A0F(r7, r14, r1, r0)
            if (r13 != 0) goto L_0x01d7
            X.0ve r2 = r7.A0B
            r1 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01d7
            r7.A01()
        L_0x01d7:
            X.1y4 r1 = r7.A0B
            X.206 r0 = r14.A05
            r26 = r0
            X.1K2 r0 = r1.A00
            X.10E r0 = r0.A01
            X.00S r1 = r0.A04
            java.lang.Object r12 = r1.get()
            X.0ve r12 = (X.C18030ve) r12
            X.00S r1 = r0.A63
            java.lang.Object r11 = r1.get()
            X.11S r11 = (X.AnonymousClass11S) r11
            X.00S r1 = r0.A13
            java.lang.Object r10 = r1.get()
            X.1PW r10 = (X.AnonymousClass1PW) r10
            X.00S r1 = r0.A2H
            java.lang.Object r9 = r1.get()
            X.1CJ r9 = (X.AnonymousClass1CJ) r9
            X.00S r1 = r0.A2f
            java.lang.Object r5 = r1.get()
            X.1M9 r5 = (X.AnonymousClass1M9) r5
            X.00S r1 = r0.A5f
            java.lang.Object r4 = r1.get()
            X.1R3 r4 = (X.AnonymousClass1R3) r4
            X.00S r1 = r0.A2E
            java.lang.Object r3 = r1.get()
            X.1Nb r3 = (X.AnonymousClass1Nb) r3
            X.00S r1 = r0.A6I
            java.lang.Object r2 = r1.get()
            X.1WM r2 = (X.AnonymousClass1WM) r2
            X.00S r1 = r0.A2L
            java.lang.Object r1 = r1.get()
            X.1kb r1 = (X.C34511kb) r1
            X.00S r15 = r0.A1h
            X.00H r28 = X.C000200d.A00(r15)
            X.10G r0 = r0.A00
            X.00S r0 = r0.A39
            java.lang.Object r0 = r0.get()
            X.1yA r0 = (X.C42431yA) r0
            X.1zo r15 = new X.1zo
            r16 = r11
            r17 = r10
            r18 = r1
            r19 = r5
            r20 = r9
            r21 = r4
            r22 = r2
            r23 = r12
            r25 = r0
            r27 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7.A01 = r15
            X.1pb r3 = r7.A0I
            X.1zq r2 = new X.1zq
            r2.<init>(r7, r14, r13)
            goto L_0x0374
        L_0x025d:
            X.1tO r0 = r7.A06
            boolean r0 = X.C39611tM.A01(r8, r0)
            if (r0 != 0) goto L_0x02d2
            X.0ve r2 = r7.A0B
            r1 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            android.content.Context r0 = r7.A02
            X.C17960vV.A07(r0)
            if (r1 == 0) goto L_0x0379
            X.1xZ r5 = r7.A06
            android.view.View r0 = r5.A02
            r4 = 0
            r0.setPadding(r4, r4, r4, r4)
            android.widget.ImageView r0 = r5.A04
            r0.setEnabled(r4)
            android.view.View r0 = r5.A01
            r1 = 0
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r5.A04
            r0.setOnClickListener(r1)
            android.view.View r0 = r5.A01
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r0 = r5.A04
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r1 = r5.A04
            r0 = 2131231557(0x7f080345, float:1.8079198E38)
            r1.setImageResource(r0)
            X.1VW r3 = r7.A0G
            android.widget.ImageView r2 = r5.A04
            X.1BI r0 = r8.BTb()
            X.C18070vi.A0d(r2, r4)
            int r1 = r3.A03(r0, r4)
            X.1VX r0 = X.AnonymousClass1VW.A01(r0)
            r3.A0B(r2, r0, r1)
            android.view.View r0 = r5.A01
            r0.setVisibility(r4)
            X.1bI r0 = r5.A0P
            r1 = 8
            r0.A04(r1)
            android.widget.ImageView r0 = r5.A06
            r0.setVisibility(r1)
            r5.A0L(r4, r4)
            X.1xg r0 = r5.A09
            r0.A02()
            r7.A01()
        L_0x02d2:
            X.1y5 r0 = r7.A0C
            X.1K2 r0 = r0.A00
            X.10E r15 = r0.A01
            X.00S r0 = r15.A04
            java.lang.Object r14 = r0.get()
            X.0ve r14 = (X.C18030ve) r14
            X.00S r0 = r15.A63
            java.lang.Object r13 = r0.get()
            X.11S r13 = (X.AnonymousClass11S) r13
            X.00S r0 = r15.A13
            java.lang.Object r12 = r0.get()
            X.1PW r12 = (X.AnonymousClass1PW) r12
            X.00S r0 = r15.A2H
            java.lang.Object r11 = r0.get()
            X.1CJ r11 = (X.AnonymousClass1CJ) r11
            X.00S r0 = r15.ABX
            java.lang.Object r10 = r0.get()
            X.1Me r10 = (X.C24921Me) r10
            X.00S r0 = r15.A2f
            java.lang.Object r9 = r0.get()
            X.1M9 r9 = (X.AnonymousClass1M9) r9
            X.00S r0 = r15.A5f
            java.lang.Object r5 = r0.get()
            X.1R3 r5 = (X.AnonymousClass1R3) r5
            X.00S r0 = r15.A2E
            java.lang.Object r4 = r0.get()
            X.1Nb r4 = (X.AnonymousClass1Nb) r4
            X.00S r0 = r15.A6I
            java.lang.Object r3 = r0.get()
            X.1WM r3 = (X.AnonymousClass1WM) r3
            X.00S r0 = r15.AA1
            java.lang.Object r2 = r0.get()
            X.1xp r2 = (X.C42221xp) r2
            X.00S r0 = r15.A2L
            java.lang.Object r1 = r0.get()
            X.1kb r1 = (X.C34511kb) r1
            X.10G r0 = r15.A00
            X.00S r0 = r0.A39
            java.lang.Object r0 = r0.get()
            X.1yA r0 = (X.C42431yA) r0
            X.00S r15 = r15.A1h
            X.00H r33 = X.C000200d.A00(r15)
            X.0zB r18 = X.C19890zB.A00
            X.2DB r15 = new X.2DB
            r28 = r14
            r29 = r6
            r30 = r0
            r31 = r4
            r32 = r17
            r34 = r16
            r19 = r13
            r20 = r12
            r21 = r1
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r5
            r26 = r3
            r27 = r2
            r17 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7.A02 = r15
            X.1pb r3 = r7.A0I
            X.2z7 r2 = new X.2z7
            r1 = r36
            r0 = r35
            r2.<init>(r7, r1, r0)
        L_0x0374:
            r3.A00(r2, r15)
            goto L_0x00ec
        L_0x0379:
            X.1xZ r3 = r7.A06
            android.view.View r0 = r3.A02
            r2 = 0
            r0.setPadding(r2, r2, r2, r2)
            android.widget.ImageView r0 = r3.A04
            r0.setEnabled(r2)
            android.view.View r0 = r3.A01
            r1 = 0
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r3.A04
            r0.setOnClickListener(r1)
            android.view.View r0 = r3.A01
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r0 = r3.A04
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r1 = r3.A04
            r0 = 2131231557(0x7f080345, float:1.8079198E38)
            r1.setImageResource(r0)
            X.1VW r5 = r7.A0G
            android.widget.ImageView r4 = r3.A04
            X.1BI r0 = r8.BTb()
            X.C18070vi.A0d(r4, r2)
            int r1 = r5.A03(r0, r2)
            X.1VX r0 = X.AnonymousClass1VW.A01(r0)
            r5.A0B(r4, r0, r1)
            android.view.View r0 = r3.A01
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r0 = r3.A08
            r1 = 8
            r0.setVisibility(r1)
            X.1bI r0 = r3.A0L
            r0.A04(r1)
            X.1bI r0 = r3.A0P
            r0.A04(r1)
            android.widget.ImageView r0 = r3.A06
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A05
            r0.setVisibility(r1)
            X.1bI r0 = r3.A0M
            r0.A04(r1)
            X.1bI r0 = r3.A0N
            r0.A04(r1)
            X.1bI r0 = r3.A0O
            r0.A04(r1)
            X.1bI r0 = r3.A0D
            r0.A04(r1)
            r3.A0L(r2, r2)
            X.1xg r0 = r3.A09
            r0.A02()
            com.whatsapp.TextEmojiLabel r0 = r3.A07
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r0 = r3.A07
            X.C43411zl.A00(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A07
            r0.A0L()
            com.whatsapp.TextEmojiLabel r1 = r3.A07
            java.lang.String r0 = ""
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A07
            r0 = 80
            r1.setPlaceholder(r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            goto L_0x02d2
        L_0x0419:
            r16 = 0
            goto L_0x00d1
        L_0x041d:
            X.C42491yG.A09(r1, r5, r5)
            goto L_0x00bb
        L_0x0422:
            r0 = 2131166081(0x7f070381, float:1.7946397E38)
            goto L_0x0066
        L_0x0427:
            r0 = 2131166107(0x7f07039b, float:1.794645E38)
            goto L_0x004e
        L_0x042c:
            r0 = 2131165965(0x7f07030d, float:1.7946162E38)
            goto L_0x0036
        L_0x0431:
            if (r2 == 0) goto L_0x043f
            X.0vf r1 = X.C18040vf.A01
            r0 = 10544(0x2930, float:1.4775E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x043f
            goto L_0x0033
        L_0x043f:
            r0 = 2131166074(0x7f07037a, float:1.7946383E38)
            goto L_0x0036
        L_0x0444:
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            X.2D7 r3 = new X.2D7
            r3.<init>(r7, r6)
            r7.A03 = r3
            X.1pb r2 = r7.A0I
            r1 = 0
            X.AQR r0 = new X.AQR
            r0.<init>(r8, r4, r1)
            r2.A00(r0, r3)
            return
        L_0x0459:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.A0J(X.1tN, X.1r8, X.6yE, int, boolean):void");
    }

    public void A0K(AnonymousClass1E7 r7, AnonymousClass1E7 r8, GroupJid groupJid, AnonymousClass206 r10, boolean z) {
        String str;
        if (this.A08 == 1) {
            AnonymousClass1BI r1 = r7.A0J;
            C36321nh r0 = GroupJid.Companion;
            GroupJid A002 = C36321nh.A00(r1);
            AnonymousClass1CJ r12 = this.A0A;
            if (r12.A06(A002) == 1 && (!this.A0C.A01(r7))) {
                if (r12.A0R(groupJid)) {
                    str = this.A08.A01(2131888506);
                } else if (r12.A0F(groupJid) != null) {
                    str = r12.A0F(groupJid);
                } else {
                    str = null;
                }
                C42071xZ r4 = this.A06;
                r4.A0R.A04(8);
                boolean isEmpty = TextUtils.isEmpty(str);
                TextEmojiLabel textEmojiLabel = r4.A08;
                if (isEmpty) {
                    textEmojiLabel.setVisibility(8);
                } else {
                    textEmojiLabel.A0R(str);
                    r4.A08.setVisibility(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    r4.A0R.A04(0);
                    ((ImageView) r4.A0R.A02()).setImageDrawable(new C74743cP(AnonymousClass03S.A01(r4.A0R.A02().getContext(), 2131233205), this.A09));
                    return;
                }
                return;
            }
        }
        super.A0K(r7, r8, groupJid, r10, z);
    }

    public void A0I() {
        super.A0I();
        C42611yS r0 = this.A04;
        if (r0 != null) {
            r0.A00.A01();
            this.A04 = null;
        }
        C43441zo r02 = this.A01;
        if (r02 != null) {
            r02.A00.A01();
            this.A01 = null;
        }
        AnonymousClass2DB r03 = this.A02;
        if (r03 != null) {
            r03.A00.A01();
            this.A02 = null;
        }
        AnonymousClass2D7 r04 = this.A03;
        if (r04 != null) {
            r04.A00.A01();
            this.A03 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42481yF(android.content.Context r31, X.C19880zA r32, X.C42201xn r33, X.C42361y3 r34, X.C42371y4 r35, X.C42381y5 r36, X.C42451yC r37, X.AnonymousClass1KB r38, X.AnonymousClass11S r39, X.C32191gn r40, X.C37551pj r41, X.AnonymousClass1PW r42, X.C34511kb r43, X.AnonymousClass1VW r44, X.AnonymousClass1M9 r45, X.C24921Me r46, X.C37451pZ r47, X.C37471pb r48, X.C34021jm r49, X.C42071xZ r50, X.AnonymousClass11C r51, X.AnonymousClass11P r52, X.AnonymousClass118 r53, X.C19830z4 r54, X.C18000vb r55, X.AnonymousClass1TD r56, X.C22621Co r57, X.AnonymousClass1CJ r58, X.AnonymousClass1NA r59, X.AnonymousClass1TA r60, X.AnonymousClass1R3 r61, X.AnonymousClass1WM r62, X.C42221xp r63, X.C42351y2 r64, X.C18030ve r65, X.AnonymousClass12L r66, X.C42211xo r67, X.C39541tF r68, X.C34651kr r69, X.C32091gc r70, X.C42431yA r71, X.AnonymousClass1QO r72, X.AnonymousClass1QS r73, X.AnonymousClass1R2 r74, X.C42341y1 r75, X.AnonymousClass1Nb r76, X.AnonymousClass1PU r77, X.C43351zf r78, X.AnonymousClass10I r79, X.AnonymousClass00H r80, X.AnonymousClass00H r81, int r82, boolean r83) {
        /*
            r30 = this;
            r2 = r30
            r16 = r59
            r15 = r58
            r14 = r55
            r13 = r53
            r12 = r52
            r11 = r51
            r10 = r50
            r9 = r49
            r8 = r46
            r7 = r45
            r3 = r31
            r22 = r72
            r23 = r73
            r24 = r74
            r25 = r75
            r26 = r77
            r27 = r78
            r28 = r80
            r29 = r81
            r21 = r70
            r6 = r41
            r5 = r40
            r4 = r39
            r20 = r67
            r19 = r66
            r18 = r65
            r17 = r64
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 31
            X.25f r0 = new X.25f
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.A0U = r0
            r0 = r82
            r2.A08 = r0
            r0 = r38
            r2.A0X = r0
            r0 = r79
            r2.A0Y = r0
            r0 = r42
            r2.A0E = r0
            r0 = r57
            r2.A0M = r0
            r0 = r44
            r2.A0G = r0
            r0 = r33
            r2.A09 = r0
            r0 = r61
            r2.A0O = r0
            r0 = r56
            r2.A0L = r0
            r0 = r76
            r2.A0T = r0
            r0 = r69
            r2.A0S = r0
            r0 = r34
            r2.A0A = r0
            r0 = r47
            r2.A0H = r0
            r0 = r62
            r2.A0P = r0
            r0 = r63
            r2.A0Q = r0
            r0 = r54
            r2.A0K = r0
            r0 = r43
            r2.A0F = r0
            r0 = r60
            r2.A0N = r0
            r0 = r48
            r2.A0I = r0
            r0 = r68
            r2.A0R = r0
            r0 = r35
            r2.A0B = r0
            r0 = r36
            r2.A0C = r0
            r0 = r32
            r2.A0W = r0
            r2.A0J = r9
            r0 = r83
            r2.A0V = r0
            r0 = r71
            r2.A05 = r0
            r0 = r37
            r2.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42481yF.<init>(android.content.Context, X.0zA, X.1xn, X.1y3, X.1y4, X.1y5, X.1yC, X.1KB, X.11S, X.1gn, X.1pj, X.1PW, X.1kb, X.1VW, X.1M9, X.1Me, X.1pZ, X.1pb, X.1jm, X.1xZ, X.11C, X.11P, X.118, X.0z4, X.0vb, X.1TD, X.1Co, X.1CJ, X.1NA, X.1TA, X.1R3, X.1WM, X.1xp, X.1y2, X.0ve, X.12L, X.1xo, X.1tF, X.1kr, X.1gc, X.1yA, X.1QO, X.1QS, X.1R2, X.1y1, X.1Nb, X.1PU, X.1zf, X.10I, X.00H, X.00H, int, boolean):void");
    }
}
