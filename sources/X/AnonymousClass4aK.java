package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4aK  reason: invalid class name */
public final class AnonymousClass4aK {
    public AnonymousClass5ZC A00;
    public AnonymousClass5ZD A01;
    public AnonymousClass5ZE A02;
    public AnonymousClass5ZF A03;
    public AnonymousClass5ZH A04;
    public final Context A05;
    public final C27201Vd A06;
    public final C108875cR A07;
    public final C25181Nf A08;
    public final C436420i A09;
    public final C32191gn A0A;
    public final C34511kb A0B;
    public final C203411t A0C;
    public final AnonymousClass1M9 A0D;
    public final C37451pZ A0E;
    public final AnonymousClass5ZN A0F;
    public final AnonymousClass5ZO A0G;
    public final AnonymousClass5ZP A0H;
    public final AnonymousClass5XM A0I;
    public final AnonymousClass5XO A0J;
    public final AnonymousClass5XP A0K;
    public final AnonymousClass5XQ A0L;
    public final AnonymousClass5ZR A0M;
    public final AnonymousClass5XT A0N;
    public final AnonymousClass5ZU A0O;
    public final AnonymousClass5XV A0P;
    public final AnonymousClass5XX A0Q;
    public final C18030ve A0R;
    public final C88304Zd A0S;

    public static CommunityPhotoHeader A00(Context context, C37451pZ r4, AnonymousClass1E7 r5) {
        C18070vi.A0d(r4, 1);
        CommunityPhotoHeader communityPhotoHeader = new CommunityPhotoHeader(context, (AttributeSet) null, 0);
        communityPhotoHeader.A06(r5, r4);
        return communityPhotoHeader;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.LinearLayout, X.3RJ, android.view.View, android.view.ViewGroup] */
    public static final AnonymousClass3RJ A01(Context context, C37451pZ r6, AnonymousClass1E7 r7, AnonymousClass1E7 r8) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        C18070vi.A0d(r6, 3);
        ? linearLayout = new LinearLayout(context, (AttributeSet) null, 0);
        if (!linearLayout.A06) {
            linearLayout.A06 = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(linearLayout.generatedComponent());
            linearLayout.A04 = AnonymousClass3MZ.A0s(A0O2);
            linearLayout.A03 = AnonymousClass10E.A6Q(A0O2);
        }
        View.inflate(context, 2131624806, linearLayout);
        linearLayout.A02 = (GroupPhotoHeader) linearLayout.findViewById(2131431236);
        linearLayout.A00 = AnonymousClass3MW.A0S(linearLayout, 2131427855);
        linearLayout.A01 = (CommunityPhotoHeader) linearLayout.findViewById(2131429220);
        GroupPhotoHeader groupPhotoHeader = linearLayout.A02;
        if (groupPhotoHeader != null) {
            if (AnonymousClass3MW.A1Z(linearLayout.getWhatsAppLocale())) {
                scaleType2 = ImageView.ScaleType.FIT_START;
            } else {
                scaleType2 = ImageView.ScaleType.FIT_END;
            }
            groupPhotoHeader.setScaleType(scaleType2);
            groupPhotoHeader.A06(r7, r6);
        }
        WaImageView waImageView = linearLayout.A00;
        if (waImageView != null) {
            AnonymousClass3NL.A01(linearLayout.getContext(), waImageView, linearLayout.getWhatsAppLocale(), 2131231681);
        }
        CommunityPhotoHeader communityPhotoHeader = linearLayout.A01;
        if (communityPhotoHeader != null) {
            if (AnonymousClass3MW.A1Z(linearLayout.getWhatsAppLocale())) {
                scaleType = ImageView.ScaleType.FIT_END;
            } else {
                scaleType = ImageView.ScaleType.FIT_START;
            }
            communityPhotoHeader.setScaleType(scaleType);
            communityPhotoHeader.A06(r8, r6);
        }
        return linearLayout;
    }

    public static final GroupPhotoHeader A02(Context context, C37451pZ r4, AnonymousClass1E7 r5) {
        C18070vi.A0d(r4, 2);
        GroupPhotoHeader groupPhotoHeader = new GroupPhotoHeader(context, (AttributeSet) null, 0);
        groupPhotoHeader.A06(r5, r4);
        return groupPhotoHeader;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.TextView, android.view.View, java.lang.Object, X.3Rk, X.4Bz, com.whatsapp.wds.components.button.WDSButton] */
    public static final AnonymousClass4Bz A03(Context context, AnonymousClass1EC r5, C436420i r6) {
        ? wDSButton = new WDSButton(context, (AttributeSet) null);
        wDSButton.A06();
        wDSButton.setVariant(C27881Xz.OUTLINE);
        wDSButton.setText(2131895362);
        wDSButton.setFocusable(true);
        AnonymousClass1EC r1 = r5;
        if (r5 != null) {
            wDSButton.setOnClickListener(new AnonymousClass78E(r1, wDSButton, r1, r6, 13));
        }
        return wDSButton;
    }

    public static void A04(Context context, AnonymousClass5ZE r2, AnonymousClass5ZG r3, AnonymousClass4aK r4) {
        r4.A02 = r2;
        r4.A04 = new C75073dw(context, r3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.5ZE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.5ZE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: com.whatsapp.community.SubgroupWithParentView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: X.1EC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.5ZE} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r6v20, types: [X.4km] */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r7v30, types: [X.4kg] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.4kk] */
    /* JADX WARNING: type inference failed for: r9v9, types: [X.4ki] */
    /* JADX WARNING: type inference failed for: r14v6, types: [X.4kh] */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r13v6, types: [X.4kj] */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4aK(android.content.Context r28, X.C32191gn r29, X.C34511kb r30, X.C203411t r31, X.AnonymousClass1M9 r32, X.C27201Vd r33, X.C108875cR r34, X.AnonymousClass5ZN r35, X.AnonymousClass5ZO r36, X.AnonymousClass5ZP r37, X.AnonymousClass5XM r38, X.AnonymousClass5XO r39, X.AnonymousClass5XP r40, X.AnonymousClass5XQ r41, X.AnonymousClass5ZR r42, X.AnonymousClass5XT r43, X.AnonymousClass5ZU r44, X.AnonymousClass5XV r45, X.AnonymousClass5XX r46, X.C25181Nf r47, X.C18030ve r48, X.C88304Zd r49, X.C436420i r50) {
        /*
            r27 = this;
            r6 = r33
            r2 = r31
            r7 = r30
            r26 = r29
            r11 = r43
            r15 = r38
            r12 = r41
            r13 = r40
            r17 = r46
            r18 = r39
            r10 = r45
            r21 = r48
            r3 = r26
            r0 = r21
            X.C18070vi.A0w(r2, r3, r7, r0, r6)
            r24 = r37
            r25 = r35
            r5 = r32
            r20 = r49
            r4 = r47
            r3 = r25
            r1 = r20
            r0 = r24
            X.C18070vi.A0x(r5, r1, r3, r4, r0)
            r14 = r36
            r0 = r18
            X.C18070vi.A0y(r13, r15, r14, r0, r12)
            r23 = r42
            r1 = r23
            r0 = r17
            X.C18070vi.A0t(r1, r10, r11, r0)
            r1 = 20
            r22 = r44
            r0 = r22
            X.C18070vi.A0d(r0, r1)
            r0 = 21
            r1 = r28
            X.C18070vi.A0d(r1, r0)
            r0 = 23
            r3 = r34
            X.C18070vi.A0d(r3, r0)
            r0 = r27
            r0.<init>()
            r0.A0C = r2
            r2 = r26
            r0.A0A = r2
            r0.A0B = r7
            r2 = r21
            r0.A0R = r2
            r0.A06 = r6
            r0.A0D = r5
            r2 = r20
            r0.A0S = r2
            r2 = r25
            r0.A0F = r2
            r0.A08 = r4
            r2 = r24
            r0.A0H = r2
            r0.A0K = r13
            r0.A0I = r15
            r0.A0G = r14
            r2 = r18
            r0.A0J = r2
            r0.A0L = r12
            r2 = r23
            r0.A0M = r2
            r0.A0P = r10
            r0.A0N = r11
            r2 = r17
            r0.A0Q = r2
            r2 = r22
            r0.A0O = r2
            r0.A05 = r1
            r2 = r50
            r0.A09 = r2
            r0.A07 = r3
            android.app.Activity r4 = X.C18050vg.A00(r1)
            boolean r3 = r4 instanceof X.AnonymousClass5YT
            if (r3 == 0) goto L_0x051a
            X.5YT r4 = (X.AnonymousClass5YT) r4
            X.1pZ r9 = r4.getContactPhotosLoader()
        L_0x00ae:
            r0.A0E = r9
            int r4 = r2.A00
            r3 = 139(0x8b, float:1.95E-43)
            if (r4 != r3) goto L_0x0512
            r4 = r2
            X.2Mg r4 = (X.C48382Mg) r4
            X.1yz r3 = X.AnonymousClass1EC.A01
            r3 = 2
            com.whatsapp.jid.GroupJid r3 = r4.A19(r3)
        L_0x00c0:
            X.1EC r3 = X.C42941yz.A00(r3)
            boolean r4 = r2 instanceof X.C48372Mf
            r8 = 0
            if (r4 == 0) goto L_0x0509
            r6 = r2
            X.2Mg r6 = (X.C48382Mg) r6
            r4 = 1
            com.whatsapp.jid.GroupJid r4 = r6.A19(r4)
            X.1EC r16 = X.C42941yz.A00(r4)
            if (r16 == 0) goto L_0x050b
            if (r3 == 0) goto L_0x050b
            X.1EC r19 = r7.A05(r3)
        L_0x00dd:
            r4 = r16
            X.1E7 r7 = r5.A0H(r4)
        L_0x00e3:
            if (r3 == 0) goto L_0x0506
            X.1E7 r6 = r5.A0H(r3)
        L_0x00e9:
            X.4kl r5 = new X.4kl
            r4 = r26
            r5.<init>(r4, r2)
            boolean r4 = r2 instanceof X.C1772497v
            if (r4 == 0) goto L_0x0117
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r4 = A00(r1, r9, r7)
            A04(r1, r4, r5, r0)
            r4 = r24
            X.3du r4 = r4.BGO(r1, r2)
            r0.A00 = r4
            if (r3 == 0) goto L_0x0112
            r10 = 1
        L_0x0106:
            r9 = 6
            r4 = r25
            r5 = r1
            r6 = r3
            r7 = r16
            r8 = r2
            X.4C5 r8 = r4.BGo(r5, r6, r7, r8, r9, r10)
        L_0x0112:
            X.5ZD r8 = (X.AnonymousClass5ZD) r8
            r0.A01 = r8
        L_0x0116:
            return
        L_0x0117:
            boolean r4 = r2 instanceof X.C1772697x
            if (r4 != 0) goto L_0x04f1
            boolean r4 = r2 instanceof X.C1772897z
            if (r4 != 0) goto L_0x04f1
            boolean r4 = r2 instanceof X.C1772797y
            if (r4 != 0) goto L_0x04f1
            boolean r4 = r2 instanceof X.C1772597w
            if (r4 == 0) goto L_0x0143
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r3 = A00(r1, r9, r7)
            A04(r1, r3, r5, r0)
            X.3QP r3 = r14.BGN(r1, r2)
            r0.A00 = r3
            if (r7 == 0) goto L_0x013a
            X.1EC r8 = X.AnonymousClass3Ma.A0n(r7)
        L_0x013a:
            X.4Bz r5 = A03(r1, r8, r2)
        L_0x013e:
            X.5ZD r5 = (X.AnonymousClass5ZD) r5
            r0.A01 = r5
            return
        L_0x0143:
            boolean r4 = r2 instanceof X.AnonymousClass980
            if (r4 != 0) goto L_0x04be
            boolean r4 = r2 instanceof X.AnonymousClass981
            if (r4 != 0) goto L_0x04be
            boolean r4 = r2 instanceof X.AnonymousClass982
            if (r4 == 0) goto L_0x01ae
            X.3RJ r4 = A01(r1, r9, r6, r7)
            A04(r1, r4, r5, r0)
            X.3QP r4 = r14.BGN(r1, r2)
            r0.A00 = r4
            if (r3 == 0) goto L_0x0112
            X.4lB r11 = (X.C94784lB) r11
            int r4 = r11.A00
            if (r4 == 0) goto L_0x0193
            java.lang.Object r4 = r11.A01
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r6 = r4.A00
            X.10G r5 = r6.A00
            X.00S r4 = r5.AAr
            java.lang.Object r7 = r4.get()
            X.5ZM r7 = (X.AnonymousClass5ZM) r7
            X.1MZ r17 = X.AnonymousClass3MY.A0V(r6)
            X.00S r4 = r5.AAo
        L_0x017e:
            java.lang.Object r4 = r4.get()
            X.5ZS r4 = (X.AnonymousClass5ZS) r4
            X.4kj r8 = new X.4kj
            r13 = r8
            r14 = r1
            r15 = r7
            r16 = r4
            r18 = r3
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0112
        L_0x0193:
            java.lang.Object r6 = r11.A01
            X.1K2 r6 = (X.AnonymousClass1K2) r6
            X.1K1 r5 = r6.A00
            X.00S r4 = r5.A7R
            java.lang.Object r7 = r4.get()
            X.5ZM r7 = (X.AnonymousClass5ZM) r7
            X.10E r4 = r6.A01
            X.1MZ r17 = X.AnonymousClass3MY.A0V(r4)
            X.00S r4 = r5.A7O
            goto L_0x017e
        L_0x01ae:
            boolean r4 = r2 instanceof X.C1772397u
            if (r4 == 0) goto L_0x01d9
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r3 = A02(r1, r9, r6)
            A04(r1, r3, r5, r0)
            r3 = 0
            X.4C0 r5 = new X.4C0
            r5.<init>(r1, r3)
            r5.A06()
            r1 = 2131899578(0x7f1234ba, float:1.9434106E38)
            r5.setText(r1)
            X.1Xz r1 = X.C27881Xz.OUTLINE
            r5.setVariant(r1)
            r3 = 45
            X.4dU r1 = new X.4dU
            r1.<init>(r2, r5, r3)
            r5.setOnClickListener(r1)
            goto L_0x013e
        L_0x01d9:
            boolean r4 = r2 instanceof X.AnonymousClass984
            if (r4 == 0) goto L_0x0243
            if (r6 == 0) goto L_0x0241
            r4 = 1
            X.C18070vi.A0d(r9, r4)
            r10 = 0
            r4 = 0
            X.3pY r7 = new X.3pY
            r7.<init>(r1, r10, r4)
            r4 = 2
            r7.setSubgroupProfilePhoto(r6, r4, r9)
        L_0x01ee:
            A04(r1, r7, r5, r0)
            r4 = r24
            X.3du r4 = r4.BGO(r1, r2)
            r0.A00 = r4
            if (r3 == 0) goto L_0x0112
            X.4l2 r15 = (X.C94694l2) r15
            int r5 = r15.A00
            java.lang.Object r4 = r15.A01
            if (r5 == 0) goto L_0x022e
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r4 = r4.A00
            X.10G r5 = r4.A00
            X.00S r4 = r5.AAX
            java.lang.Object r6 = r4.get()
            X.5ZN r6 = (X.AnonymousClass5ZN) r6
            X.00S r4 = r5.AAe
        L_0x0217:
            java.lang.Object r4 = r4.get()
            X.5ZV r4 = (X.AnonymousClass5ZV) r4
            X.4kh r8 = new X.4kh
            r14 = r8
            r15 = r1
            r16 = r6
            r17 = r4
            r18 = r3
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0112
        L_0x022e:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.1K1 r5 = r4.A00
            X.00S r4 = r5.A77
            java.lang.Object r6 = r4.get()
            X.5ZN r6 = (X.AnonymousClass5ZN) r6
            X.00S r4 = r5.A7D
            goto L_0x0217
        L_0x0241:
            r7 = r8
            goto L_0x01ee
        L_0x0243:
            boolean r4 = r2 instanceof X.AnonymousClass98D
            if (r4 == 0) goto L_0x026c
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r4 = A02(r1, r9, r6)
            A04(r1, r4, r5, r0)
            r4 = r2
            X.2Mg r4 = (X.C48382Mg) r4
            int r5 = r4.A18()
            r4 = 1
            if (r5 != r4) goto L_0x0267
            r4 = r24
            X.3du r4 = r4.BGO(r1, r2)
        L_0x025e:
            r0.A00 = r4
            if (r3 == 0) goto L_0x0112
            r10 = 0
            r16 = r19
            goto L_0x0106
        L_0x0267:
            X.3QP r4 = r14.BGN(r1, r2)
            goto L_0x025e
        L_0x026c:
            boolean r4 = r2 instanceof X.AnonymousClass98C
            if (r4 == 0) goto L_0x028f
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r3 = A02(r1, r9, r6)
            A04(r1, r3, r5, r0)
            r3 = r2
            X.2Mg r3 = (X.C48382Mg) r3
            int r3 = r3.A18()
            if (r3 != 0) goto L_0x0288
            X.3QP r3 = r14.BGN(r1, r2)
        L_0x0284:
            X.5ZC r3 = (X.AnonymousClass5ZC) r3
            goto L_0x04c9
        L_0x0288:
            r3 = r24
            X.3du r3 = r3.BGO(r1, r2)
            goto L_0x0284
        L_0x028f:
            r4 = r20
            boolean r4 = r4.A03(r2)
            if (r4 == 0) goto L_0x033c
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r4 = A02(r1, r9, r6)
            A04(r1, r4, r5, r0)
            if (r3 == 0) goto L_0x0116
            X.4l6 r12 = (X.C94734l6) r12
            int r5 = r12.A00
            java.lang.Object r4 = r12.A01
            if (r5 == 0) goto L_0x0325
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r4 = r4.A00
            X.10G r5 = r4.A00
            X.00S r4 = r5.AAk
            java.lang.Object r4 = r4.get()
            X.5XR r4 = (X.AnonymousClass5XR) r4
            X.3um r7 = new X.3um
            r7.<init>(r1, r4, r3)
            r5.AXE(r7)
        L_0x02c0:
            r0.A03 = r7
            X.4CV r5 = X.AnonymousClass4CV.DESCRIPTION_OR_ADD
            r4 = r23
            X.3QQ r4 = r4.BGr(r1, r5, r3)
            r0.A00 = r4
            X.4l5 r13 = (X.C94724l5) r13
            int r5 = r13.A00
            java.lang.Object r4 = r13.A01
            if (r5 == 0) goto L_0x0308
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r4 = r4.A00
            X.10G r5 = r4.A00
            X.00S r4 = r5.AAZ
            java.lang.Object r8 = r4.get()
            X.5ZT r8 = (X.AnonymousClass5ZT) r8
            X.00S r4 = r5.AAX
            java.lang.Object r7 = r4.get()
            X.5ZN r7 = (X.AnonymousClass5ZN) r7
            X.00S r4 = r5.AAc
        L_0x02f2:
            java.lang.Object r4 = r4.get()
            X.E2m r4 = (X.C28471E2m) r4
            X.4ki r5 = new X.4ki
            r9 = r5
            r10 = r1
            r11 = r7
            r12 = r8
            r13 = r4
            r14 = r6
            r15 = r3
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x013e
        L_0x0308:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.1K1 r5 = r4.A00
            X.00S r4 = r5.A79
            java.lang.Object r8 = r4.get()
            X.5ZT r8 = (X.AnonymousClass5ZT) r8
            X.00S r4 = r5.A77
            java.lang.Object r7 = r4.get()
            X.5ZN r7 = (X.AnonymousClass5ZN) r7
            X.00S r4 = r5.A7B
            goto L_0x02f2
        L_0x0325:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.1K1 r5 = r4.A00
            X.00S r4 = r5.A7K
            java.lang.Object r4 = r4.get()
            X.5XR r4 = (X.AnonymousClass5XR) r4
            X.3um r7 = new X.3um
            r7.<init>(r1, r4, r3)
            r5.A8u(r7)
            goto L_0x02c0
        L_0x033c:
            r4 = r20
            boolean r4 = r4.A02(r2)
            if (r4 == 0) goto L_0x0455
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r4 = A02(r1, r9, r6)
            r0.A02 = r4
            if (r3 == 0) goto L_0x0116
            r7 = 11410(0x2c92, float:1.5989E-41)
            X.0vf r6 = X.C18040vf.A02
            r4 = r21
            boolean r4 = X.C18020vd.A05(r6, r4, r7)
            if (r4 == 0) goto L_0x038c
            X.1BI r13 = r2.A0H()
            r4 = r17
            X.4lG r4 = (X.C94834lG) r4
            int r6 = r4.A00
            java.lang.Object r4 = r4.A01
            if (r6 == 0) goto L_0x044f
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r6 = r4.A00
        L_0x036a:
            X.1Mc r15 = X.AnonymousClass3Ma.A0u(r6)
            X.1M9 r8 = X.AnonymousClass10E.A4z(r6)
            X.1Me r9 = X.AnonymousClass3MZ.A0g(r6)
            X.00S r4 = r6.A32
            java.lang.Object r4 = r4.get()
            X.1Qo r4 = (X.C26031Qo) r4
            X.126 r12 = X.AnonymousClass3MY.A0X(r6)
            X.4km r6 = new X.4km
            r7 = r1
            r10 = r5
            r11 = r4
            r14 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = r6
        L_0x038c:
            X.3dw r4 = new X.3dw
            r4.<init>(r1, r5)
            r0.A04 = r4
            X.1BI r5 = r2.A0H()
            r4 = r22
            X.3un r4 = r4.BGs(r1, r5, r3)
            r0.A03 = r4
            X.1BI r5 = r2.A0H()
            if (r5 == 0) goto L_0x044b
            X.1Nf r4 = r0.A08
            X.1E7 r4 = r4.A01(r5)
            X.2lf r4 = r4.A0H
            if (r4 == 0) goto L_0x044b
            X.4CV r5 = X.AnonymousClass4CV.DESCRIPTION_OR_ADD
        L_0x03b1:
            r4 = r23
            X.3QQ r4 = r4.BGr(r1, r5, r3)
            r0.A00 = r4
            r4 = r18
            X.4l4 r4 = (X.C94714l4) r4
            int r5 = r4.A00
            java.lang.Object r4 = r4.A01
            if (r5 == 0) goto L_0x0412
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r6 = r4.A00
            X.0ve r16 = X.AnonymousClass10E.A8r(r6)
            X.1Mc r20 = X.AnonymousClass3Ma.A0u(r6)
            X.126 r17 = X.AnonymousClass3MY.A0X(r6)
            X.10G r5 = r6.A00
            X.00S r4 = r5.AAZ
            java.lang.Object r7 = r4.get()
            X.5ZT r7 = (X.AnonymousClass5ZT) r7
            X.00S r4 = r5.AAX
            java.lang.Object r8 = r4.get()
            X.5ZN r8 = (X.AnonymousClass5ZN) r8
            X.1MZ r15 = X.AnonymousClass3MY.A0V(r6)
            X.00S r4 = r5.AAh
            java.lang.Object r6 = r4.get()
            X.5ZW r6 = (X.AnonymousClass5ZW) r6
            X.00S r4 = r5.AAi
        L_0x03fb:
            java.lang.Object r4 = r4.get()
            X.5XW r4 = (X.AnonymousClass5XW) r4
            X.4kk r5 = new X.4kk
            r9 = r5
            r10 = r1
            r11 = r8
            r12 = r7
            r13 = r6
            r14 = r4
            r18 = r3
            r19 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x013e
        L_0x0412:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.10E r6 = r4.A01
            X.0ve r16 = X.AnonymousClass10E.A8r(r6)
            X.1Mc r20 = X.AnonymousClass3Ma.A0u(r6)
            X.126 r17 = X.AnonymousClass3MY.A0X(r6)
            X.1K1 r5 = r4.A00
            X.00S r4 = r5.A79
            java.lang.Object r7 = r4.get()
            X.5ZT r7 = (X.AnonymousClass5ZT) r7
            X.00S r4 = r5.A77
            java.lang.Object r8 = r4.get()
            X.5ZN r8 = (X.AnonymousClass5ZN) r8
            X.1MZ r15 = X.AnonymousClass3MY.A0V(r6)
            X.00S r4 = r5.A7G
            java.lang.Object r6 = r4.get()
            X.5ZW r6 = (X.AnonymousClass5ZW) r6
            X.00S r4 = r5.A7H
            goto L_0x03fb
        L_0x044b:
            X.4CV r5 = X.AnonymousClass4CV.DESCRIPTION_OR_NOTHING
            goto L_0x03b1
        L_0x044f:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.10E r6 = r4.A01
            goto L_0x036a
        L_0x0455:
            r4 = r20
            boolean r4 = r4.A04(r2)
            if (r4 == 0) goto L_0x0116
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader r4 = A02(r1, r9, r6)
            A04(r1, r4, r5, r0)
            if (r3 == 0) goto L_0x0116
            X.1BI r5 = r2.A0H()
            r4 = r22
            X.3un r4 = r4.BGs(r1, r5, r3)
            r0.A03 = r4
            X.4CV r5 = X.AnonymousClass4CV.DESCRIPTION_OR_ADD
            r4 = r23
            X.3QQ r4 = r4.BGr(r1, r5, r3)
            r0.A00 = r4
            X.4lD r10 = (X.C94804lD) r10
            int r5 = r10.A00
            java.lang.Object r4 = r10.A01
            if (r5 == 0) goto L_0x04ab
            X.10H r4 = (X.AnonymousClass10H) r4
            X.10E r4 = r4.A00
            X.10G r5 = r4.A00
            X.00S r4 = r5.AAZ
            java.lang.Object r6 = r4.get()
            X.5ZT r6 = (X.AnonymousClass5ZT) r6
            X.00S r4 = r5.AAX
        L_0x0498:
            java.lang.Object r4 = r4.get()
            X.5ZN r4 = (X.AnonymousClass5ZN) r4
            X.4kg r5 = new X.4kg
            r7 = r5
            r8 = r1
            r9 = r4
            r10 = r6
            r11 = r3
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x013e
        L_0x04ab:
            X.1K2 r4 = (X.AnonymousClass1K2) r4
            X.1K1 r5 = r4.A00
            X.00S r4 = r5.A79
            java.lang.Object r6 = r4.get()
            X.5ZT r6 = (X.AnonymousClass5ZT) r6
            X.00S r4 = r5.A77
            goto L_0x0498
        L_0x04be:
            X.3RJ r3 = A01(r1, r9, r6, r7)
            A04(r1, r3, r5, r0)
            X.3QP r3 = r14.BGN(r1, r2)
        L_0x04c9:
            r0.A00 = r3
            r3 = 0
            X.4By r5 = new X.4By
            r5.<init>(r1, r3)
            r5.A06()
            X.1Xz r1 = X.C27881Xz.OUTLINE
            r5.setVariant(r1)
            r1 = 2131895363(0x7f122443, float:1.9425557E38)
            r5.setText(r1)
            if (r16 == 0) goto L_0x013e
            r8 = 11
            X.78E r3 = new X.78E
            r4 = r16
            r6 = r4
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r5.setOnClickListener(r3)
            goto L_0x013e
        L_0x04f1:
            com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader r3 = A00(r1, r9, r7)
            A04(r1, r3, r5, r0)
            X.3QP r3 = r14.BGN(r1, r2)
            r0.A00 = r3
            r3 = r16
            X.4Bz r5 = A03(r1, r3, r2)
            goto L_0x013e
        L_0x0506:
            r6 = r8
            goto L_0x00e9
        L_0x0509:
            r16 = r8
        L_0x050b:
            r19 = r8
            if (r16 != 0) goto L_0x00dd
            r7 = r8
            goto L_0x00e3
        L_0x0512:
            X.1yz r3 = X.AnonymousClass1EC.A01
            X.205 r3 = r2.A0v
            X.1BI r3 = r3.A00
            goto L_0x00c0
        L_0x051a:
            X.1Vd r4 = r0.A06
            java.lang.String r3 = "context-card"
            X.1pZ r9 = r4.A06(r1, r3)
            X.C18070vi.A0b(r9)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aK.<init>(android.content.Context, X.1gn, X.1kb, X.11t, X.1M9, X.1Vd, X.5cR, X.5ZN, X.5ZO, X.5ZP, X.5XM, X.5XO, X.5XP, X.5XQ, X.5ZR, X.5XT, X.5ZU, X.5XV, X.5XX, X.1Nf, X.0ve, X.4Zd, X.20i):void");
    }
}
