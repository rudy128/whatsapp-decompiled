package com.whatsapp.group.view.custom;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass17W;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PU;
import X.AnonymousClass1VP;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Zx;
import X.AnonymousClass5I2;
import X.C000200d;
import X.C107205Yu;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C218317o;
import X.C24921Me;
import X.C27581Wq;
import X.C27691Xc;
import X.C40811vJ;
import X.C42141xh;
import X.C42211xo;
import X.C43251zV;
import X.C72043Kk;
import X.C72453Mb;
import X.C81723zh;
import X.C825148g;
import X.C825848y;
import X.C825948z;
import X.C87384Vj;
import X.C90044dR;
import X.C91454fi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.jid.Jid;

public final class GroupDetailsCard extends LinearLayout implements AnonymousClass009, C218317o {
    public AnonymousClass1L9 A00;
    public AnonymousClass11S A01;
    public C72043Kk A02;
    public AnonymousClass1VP A03;
    public C107205Yu A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public AnonymousClass118 A07;
    public C19830z4 A08;
    public C18000vb A09;
    public AnonymousClass1MZ A0A;
    public AnonymousClass1MW A0B;
    public AnonymousClass1E7 A0C;
    public AnonymousClass1KW A0D;
    public C18030ve A0E;
    public C81723zh A0F;
    public C91454fi A0G;
    public AnonymousClass126 A0H;
    public AnonymousClass1EC A0I;
    public AnonymousClass1PU A0J;
    public AnonymousClass1DC A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass031 A0N;
    public Integer A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public TextView A0U;
    public TextEmojiLabel A0V;
    public C42141xh A0W;
    public WaTextView A0X;
    public AnonymousClass4Zx A0Y;
    public boolean A0Z;
    public final C18100vl A0a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A04();
        this.A0a = AnonymousClass1DF.A01(new AnonymousClass5I2(this));
        LayoutInflater.from(getContext()).inflate(2131625495, this, true);
        View A062 = AnonymousClass1HF.A06(this, 2131427509);
        C18070vi.A0X(A062);
        this.A0S = A062;
        AnonymousClass1Y5.A07(A062, "Button");
        View A063 = AnonymousClass1HF.A06(this, 2131427471);
        C18070vi.A0X(A063);
        this.A0P = A063;
        AnonymousClass1Y5.A07(A063, "Button");
        View A064 = AnonymousClass1HF.A06(this, 2131427520);
        C18070vi.A0X(A064);
        this.A0R = A064;
        AnonymousClass1Y5.A07(A064, "Button");
        View A065 = AnonymousClass1HF.A06(this, 2131427486);
        C18070vi.A0X(A065);
        this.A0Q = A065;
        AnonymousClass1Y5.A07(A065, "Button");
        View A066 = AnonymousClass1HF.A06(this, 2131427535);
        C18070vi.A0X(A066);
        this.A0T = A066;
        AnonymousClass1Y5.A07(A066, "Button");
        View A067 = AnonymousClass1HF.A06(this, 2131431253);
        C18070vi.A0X(A067);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A067;
        this.A0V = textEmojiLabel;
        AnonymousClass1Y5.A07(textEmojiLabel, "Button");
        View A068 = AnonymousClass1HF.A06(this, 2131427806);
        C18070vi.A0X(A068);
        this.A0U = (TextView) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131431295);
        C18070vi.A0X(A069);
        this.A0X = (WaTextView) A069;
        this.A0W = C42141xh.A01(this, getTextEmojiLabelViewControllerFactory(), 2131431312);
        A01();
    }

    public static /* synthetic */ void getGroupCallButton$annotations() {
    }

    public static /* synthetic */ void getGroupCallButtonController$annotations() {
    }

    public static /* synthetic */ void getSearchChatButton$annotations() {
    }

    public static /* synthetic */ void getVideoCallButton$annotations() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1LU, java.lang.Object] */
    public static final void setupClickListeners$lambda$1(GroupDetailsCard groupDetailsCard, View view) {
        String str;
        C18070vi.A0d(groupDetailsCard, 0);
        C81723zh r1 = groupDetailsCard.A0F;
        if (r1 == null) {
            str = "wamGroupInfo";
        } else {
            r1.A08 = true;
            AnonymousClass1L9 activityUtils = groupDetailsCard.getActivityUtils();
            Context context = groupDetailsCard.getContext();
            ? obj = new Object();
            Context context2 = groupDetailsCard.getContext();
            AnonymousClass1E7 r0 = groupDetailsCard.A0C;
            if (r0 == null) {
                str = "groupChat";
            } else {
                activityUtils.A0B(context, AnonymousClass3MY.A06(context2, obj, AnonymousClass1E7.A00(r0)).putExtra("args_conversation_screen_entry_point", 1).putExtra("extra_show_search_on_create", true), "GroupChatInfoActivity");
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void setupClickListeners$lambda$2(GroupDetailsCard groupDetailsCard, View view) {
        C18070vi.A0d(groupDetailsCard, 0);
        C81723zh r2 = groupDetailsCard.A0F;
        if (r2 == null) {
            C18070vi.A11("wamGroupInfo");
            throw null;
        }
        r2.A0A = true;
        A02(groupDetailsCard.A0T, groupDetailsCard, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A02, 5021) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (getGroupChatManager().A0I(r12) != 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        if (X.AnonymousClass3MX.A1Z(getAbProps()) == false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass1E7 r12, X.C91454fi r13, X.AnonymousClass1EC r14, int r15, boolean r16) {
        /*
            r11 = this;
            r2 = 1
            X.C18070vi.A0e(r12, r2, r13)
            r11.A0C = r12
            r11.A0G = r13
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r9 = r12.A06(r1)
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            X.1EC r9 = (X.AnonymousClass1EC) r9
            r11.A0I = r9
            if (r9 != 0) goto L_0x0021
            java.lang.String r0 = "gid"
        L_0x001c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0021:
            android.content.Context r0 = r11.getContext()
            boolean r0 = r0 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x0058
            X.0ve r0 = r11.getAbProps()
            boolean r0 = X.C40811vJ.A0V(r0)
            if (r0 == 0) goto L_0x0058
            X.1MW r0 = r11.getParticipantUserStore()
            boolean r0 = r0.A0N(r9)
            if (r0 == 0) goto L_0x0058
            android.content.Context r3 = r11.getContext()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r4 = X.AnonymousClass1L9.A01(r3, r0)
            X.01E r4 = (X.AnonymousClass01E) r4
            X.5Yu r3 = r11.getGroupCallMenuHelperFactory()
            X.4jG r0 = new X.4jG
            r0.<init>(r12, r11, r9)
            X.4Zx r0 = r3.BGu(r4, r0, r9, r2)
            r11.A0Y = r0
        L_0x0058:
            boolean r0 = X.C83804Gs.A00(r12)
            if (r0 == 0) goto L_0x01dd
            X.118 r7 = r11.getWaContext()
            X.11S r4 = r11.getMeManager()
            X.1M9 r5 = r11.getContactManager()
            X.1Me r6 = r11.getWaContactNames()
            X.1MZ r8 = r11.getGroupParticipantsManager()
            r10 = 3
            java.lang.String r3 = X.C88374Zl.A01(r4, r5, r6, r7, r8, r9, r10)
        L_0x0077:
            boolean r0 = r12.A0P()
            r11.A06(r3, r0)
            X.1PU r0 = r11.getGroupChatUtils()
            boolean r6 = r0.A02(r9)
            X.1PU r0 = r11.getGroupChatUtils()
            X.1CJ r0 = r0.A00
            int r3 = r0.A06(r9)
            r0 = 2
            boolean r5 = X.AnonymousClass000.A1T(r3, r0)
            X.1PU r4 = r11.getGroupChatUtils()
            X.1CJ r0 = r4.A00
            int r3 = r0.A06(r9)
            r0 = 6
            if (r3 != r0) goto L_0x00af
            X.0ve r4 = r4.A02
            r3 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r4, r3)
            r0 = 1
            if (r3 != 0) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            r4 = 8
            r3 = 0
            if (r6 == 0) goto L_0x0159
            r5 = 2131888506(0x7f12097a, float:1.941165E38)
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r0 = r0.getString(r5)
            r11.setSubtitleText(r0)
            X.126 r0 = r11.getGroupChatManager()
            int r0 = r0.A0I(r12)
            if (r0 == r2) goto L_0x00db
        L_0x00cd:
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131755161(0x7f100099, float:1.9141193E38)
            java.lang.String r0 = X.C72473Md.A0k(r2, r15, r0)
            r11.setSubtitleNumberOfParticipantsText(r0)
        L_0x00db:
            X.1MZ r2 = r11.getGroupParticipantsManager()
            X.00H r0 = r11.getSuspensionManager()
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1xo r0 = (X.C42211xo) r0
            boolean r2 = X.C62822s3.A01(r2, r12, r0)
            android.view.View r0 = r11.A0P
            if (r2 == 0) goto L_0x0155
            r0.setVisibility(r3)
        L_0x00f4:
            X.00H r0 = r11.getSuspensionManager()
            boolean r2 = X.C72463Mc.A1T(r9, r0)
            android.view.View r3 = r11.A0S
            int r0 = X.C72453Mb.A07(r16)
            r3.setVisibility(r0)
            r2 = r2 ^ 1
            r3.setEnabled(r2)
            android.view.View r0 = r11.A0R
            if (r16 != 0) goto L_0x010f
            r4 = 0
        L_0x010f:
            r0.setVisibility(r4)
            android.view.View r0 = r11.A0R
            r0.setEnabled(r2)
            X.1E7 r0 = r13.A03
            if (r0 == r12) goto L_0x014a
            X.48z r0 = r13.A01
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0126
            r0.A0B(r2)
            r13.A01 = r3
        L_0x0126:
            X.48y r0 = r13.A00
            if (r0 == 0) goto L_0x012f
            r0.A0B(r2)
            r13.A00 = r3
        L_0x012f:
            r13.A03 = r3
            r13.A05 = r3
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r13.A08 = r0
            r13.A06 = r3
            r13.A04 = r3
            r13.A02 = r3
            r13.A03 = r12
            com.whatsapp.jid.Jid r0 = r12.A06(r1)
            X.C17960vV.A07(r0)
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r13.A05 = r0
        L_0x014a:
            X.4Lo r0 = new X.4Lo
            r0.<init>(r11)
            r13.A04 = r0
            A03(r11)
            return
        L_0x0155:
            r0.setVisibility(r4)
            goto L_0x00f4
        L_0x0159:
            if (r5 != 0) goto L_0x015d
            if (r0 == 0) goto L_0x01b8
        L_0x015d:
            X.1MZ r0 = r11.getGroupParticipantsManager()
            boolean r0 = r0.A0J(r9)
            if (r0 == 0) goto L_0x01b8
            X.1Me r0 = r11.getWaContactNames()
            java.lang.String r8 = r0.A0Y(r14)
            X.1E7 r0 = r11.A0C
            if (r0 != 0) goto L_0x0177
            java.lang.String r0 = "groupChat"
            goto L_0x001c
        L_0x0177:
            boolean r0 = r0.A0n
            if (r0 == 0) goto L_0x0186
            X.0ve r0 = r11.getAbProps()
            boolean r0 = X.AnonymousClass3MX.A1Z(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0187
        L_0x0186:
            r7 = 0
        L_0x0187:
            boolean r0 = X.AnonymousClass1EG.A0H(r8)
            if (r0 != 0) goto L_0x01a7
            android.content.res.Resources r6 = r11.getResources()
            r5 = 2131896582(0x7f122906, float:1.942803E38)
            if (r7 == 0) goto L_0x0199
            r5 = 2131891203(0x7f121403, float:1.941712E38)
        L_0x0199:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r6, r8, r0, r3, r5)
        L_0x019f:
            X.C18070vi.A0b(r0)
            r11.setSubtitleText(r0)
            goto L_0x00cd
        L_0x01a7:
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131896583(0x7f122907, float:1.9428031E38)
            if (r7 == 0) goto L_0x01b3
            r0 = 2131891204(0x7f121404, float:1.9417121E38)
        L_0x01b3:
            java.lang.String r0 = r2.getString(r0)
            goto L_0x019f
        L_0x01b8:
            X.00H r0 = r11.getSuspensionManager()
            X.1xo r0 = X.AnonymousClass3MX.A0i(r0)
            boolean r0 = r0.A02(r12)
            if (r0 == 0) goto L_0x01cd
            com.whatsapp.TextEmojiLabel r0 = r11.A0V
            r0.setVisibility(r4)
            goto L_0x00db
        L_0x01cd:
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131755171(0x7f1000a3, float:1.9141214E38)
            java.lang.String r0 = X.C72473Md.A0k(r2, r15, r0)
            r11.setSubtitleText(r0)
            goto L_0x00db
        L_0x01dd:
            X.1Me r0 = r11.getWaContactNames()
            java.lang.String r3 = r0.A0I(r12)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A05(X.1E7, X.4fi, X.1EC, int, boolean):void");
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setActivityUtils(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setCallsManager(AnonymousClass1VP r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setDependencyBridgeRegistryLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0L = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setGroupCallButton(View view) {
        C18070vi.A0d(view, 0);
        this.A0Q = view;
    }

    public final void setGroupCallMenuHelperFactory(C107205Yu r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setGroupChatManager(AnonymousClass126 r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setGroupChatUtils(AnonymousClass1PU r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setGroupInfoLoggingEvent(C81723zh r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setParticipantUserStore(AnonymousClass1MW r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setSearchChatButton(View view) {
        C18070vi.A0d(view, 0);
        this.A0R = view;
    }

    public final void setSuspensionManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0M = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(C72043Kk r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setVideoCallButton(View view) {
        C18070vi.A0d(view, 0);
        this.A0T = view;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    private final void A00() {
        View view = this.A0Q;
        C18030ve abProps = getAbProps();
        AnonymousClass11S meManager = getMeManager();
        AnonymousClass1MZ groupParticipantsManager = getGroupParticipantsManager();
        AnonymousClass1EC r0 = this.A0I;
        if (r0 == null) {
            C18070vi.A11("gid");
            throw null;
        }
        boolean A0H2 = C40811vJ.A0H(meManager, abProps, AnonymousClass3MW.A03(groupParticipantsManager, r0));
        float f = 1.0f;
        if (A0H2) {
            f = 0.4f;
        }
        view.setAlpha(f);
    }

    private final void A01() {
        C825148g.A00(this.A0S, this, 35);
        this.A0R.setOnClickListener(new C90044dR(this, 32));
        this.A0Q.setOnClickListener(new C90044dR(this, 34));
        this.A0T.setOnClickListener(new C90044dR(this, 33));
    }

    public static final void A02(View view, GroupDetailsCard groupDetailsCard, boolean z) {
        AnonymousClass4Zx r0 = groupDetailsCard.A0Y;
        if (r0 != null) {
            r0.A03(view, z ? 1 : 0);
        } else if (groupDetailsCard.getContext() instanceof AnonymousClass1FU) {
            AnonymousClass1FU A0P2 = AnonymousClass3MZ.A0P(groupDetailsCard.getContext());
            if (C18020vd.A05(C18040vf.A02, groupDetailsCard.getAbProps(), 7175)) {
                groupDetailsCard.getCallConfirmationSheetBridge();
                AnonymousClass1E7 r1 = groupDetailsCard.A0C;
                if (r1 != null) {
                    Jid A062 = r1.A06(AnonymousClass1EC.class);
                    if (A062 != null) {
                        AnonymousClass1EC r12 = (AnonymousClass1EC) A062;
                        C18070vi.A0d(r12, 1);
                        CallConfirmationSheet A012 = C87384Vj.A01(r12, 10, z);
                        groupDetailsCard.getCallConfirmationSheetBridge();
                        A0P2.CMk(A012, "CallConfirmationSheet");
                        return;
                    }
                    throw C17880vN.A0g();
                }
            } else {
                C19830z4 waSharedPreferences = groupDetailsCard.getWaSharedPreferences();
                AnonymousClass1E7 r13 = groupDetailsCard.A0C;
                if (r13 != null) {
                    CallConfirmationFragment.A04(A0P2, waSharedPreferences, r13, 10, z);
                    return;
                }
            }
            C18070vi.A11("groupChat");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r3 == X.AnonymousClass00R.A0C) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r13.getSystemFeatures();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r2 == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        if (r1.A0W() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ee, code lost:
        r2 = r13.A0Q;
        r1 = 2131233309;
        r0 = 2131898016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
        X.C72473Md.A1G(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.group.view.custom.GroupDetailsCard r13) {
        /*
            X.4fi r0 = r13.A0G
            if (r0 == 0) goto L_0x0053
            X.1E7 r2 = r0.A03
            if (r2 != 0) goto L_0x0114
            java.lang.Integer r1 = X.AnonymousClass00R.A00
        L_0x000a:
            r0.A08 = r1
        L_0x000c:
            java.lang.Integer r3 = r0.A08
            r13.A0O = r3
            X.1E7 r8 = r0.A03
            r2 = 0
            if (r8 == 0) goto L_0x0031
            X.0ve r9 = r0.A0J
            X.1EC r10 = r0.A05
            X.1HS r5 = r0.A0E
            X.1PU r11 = r0.A0N
            X.1MZ r7 = r0.A0H
            X.11S r4 = r0.A0A
            X.1M9 r6 = r0.A0F
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            if (r3 == r1) goto L_0x002c
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r12 = 0
            if (r3 != r1) goto L_0x002d
        L_0x002c:
            r12 = 1
        L_0x002d:
            boolean r2 = X.C63982u1.A09(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0031:
            android.view.View r1 = r13.A0Q
            r1.setEnabled(r2)
            android.view.View r1 = r13.A0T
            r1.setEnabled(r2)
            java.lang.Integer r1 = r13.A0O
            if (r1 != 0) goto L_0x010e
            r1 = -1
        L_0x0040:
            r3 = 0
            r2 = 8
            switch(r1) {
                case 1: goto L_0x00f7;
                case 2: goto L_0x00e1;
                case 3: goto L_0x0077;
                case 4: goto L_0x0063;
                case 5: goto L_0x0054;
                default: goto L_0x0046;
            }
        L_0x0046:
            android.view.View r0 = r13.A0Q
            r0.setVisibility(r2)
            android.view.View r0 = r13.A0T
            r0.setVisibility(r2)
        L_0x0050:
            r13.getSystemFeatures()
        L_0x0053:
            return
        L_0x0054:
            android.view.View r0 = r13.A0Q
            r0.setVisibility(r3)
            r13.A00()
            android.view.View r0 = r13.A0T
            r0.setVisibility(r2)
            goto L_0x00ee
        L_0x0063:
            android.view.View r0 = r13.A0Q
            r0.setVisibility(r3)
            android.view.View r0 = r13.A0T
            r0.setVisibility(r2)
            android.view.View r2 = r13.A0Q
            r1 = 2131231648(0x7f0803a0, float:1.8079383E38)
            r0 = 2131890894(0x7f1212ce, float:1.9416493E38)
            goto L_0x0109
        L_0x0077:
            android.view.View r1 = r13.A0Q
            r1.setVisibility(r3)
            android.view.View r1 = r13.A0T
            r1.setVisibility(r2)
            android.view.View r5 = r13.A0Q
            X.2Q4 r1 = r0.A07
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x00d0
            r4 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x008e:
            X.1HQ r3 = r0.A0C
            com.whatsapp.voipcalling.CallInfo r1 = r3.BO3()
            X.1EC r2 = r0.A05
            if (r2 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
            com.whatsapp.jid.GroupJid r1 = r1.groupJid
            boolean r2 = r2.equals(r1)
            r1 = 2131898286(0x7f122fae, float:1.9431485E38)
            if (r2 != 0) goto L_0x00a8
        L_0x00a5:
            r1 = 2131899582(0x7f1234be, float:1.9434114E38)
        L_0x00a8:
            X.C72473Md.A1G(r5, r4, r1)
            android.view.View r4 = r13.A0Q
            X.1E7 r1 = r0.A03
            if (r1 != 0) goto L_0x00b6
            r3 = 0
        L_0x00b2:
            r4.setEnabled(r3)
            goto L_0x0050
        L_0x00b6:
            X.1EC r2 = r0.A05
            X.1HS r0 = r0.A0E
            com.whatsapp.voipcalling.CallInfo r1 = r3.BO3()
            r3 = 0
            if (r2 == 0) goto L_0x00b2
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00ce
            boolean r0 = X.C40811vJ.A0d(r2, r1)
            if (r0 != 0) goto L_0x00ce
            goto L_0x00b2
        L_0x00ce:
            r3 = 1
            goto L_0x00b2
        L_0x00d0:
            X.9Bw r1 = r0.A06
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r1.A0W()
            r4 = 2131233309(0x7f080a1d, float:1.8082752E38)
            if (r1 != 0) goto L_0x008e
        L_0x00dd:
            r4 = 2131231762(0x7f080412, float:1.8079614E38)
            goto L_0x008e
        L_0x00e1:
            android.view.View r0 = r13.A0Q
            r0.setVisibility(r3)
            r13.A00()
            android.view.View r0 = r13.A0T
            r0.setVisibility(r3)
        L_0x00ee:
            android.view.View r2 = r13.A0Q
            r1 = 2131233309(0x7f080a1d, float:1.8082752E38)
            r0 = 2131898016(0x7f122ea0, float:1.9430938E38)
            goto L_0x0109
        L_0x00f7:
            android.view.View r0 = r13.A0Q
            r0.setVisibility(r3)
            android.view.View r0 = r13.A0T
            r0.setVisibility(r3)
            android.view.View r2 = r13.A0Q
            r1 = 2131231762(0x7f080412, float:1.8079614E38)
            r0 = 2131888771(0x7f120a83, float:1.9412187E38)
        L_0x0109:
            X.C72473Md.A1G(r2, r1, r0)
            goto L_0x0050
        L_0x010e:
            int r1 = r1.intValue()
            goto L_0x0040
        L_0x0114:
            X.1EC r1 = r0.A05
            X.1CJ r6 = r0.A0G
            X.0zA r5 = r0.A09
            boolean r1 = X.C63982u1.A08(r5, r6, r2, r1)
            if (r1 == 0) goto L_0x000c
            X.1TA r4 = r0.A0I
            X.1EC r1 = r0.A05
            boolean r1 = r4.A07(r1)
            if (r1 == 0) goto L_0x017c
            X.1EC r1 = r0.A05
            X.2Q4 r1 = r4.A02(r1)
            r0.A07 = r1
            if (r1 == 0) goto L_0x013b
            long r1 = r1.A01()
            X.C91454fi.A01(r0, r1)
        L_0x013b:
            X.2mw r1 = r0.A02
            if (r1 != 0) goto L_0x0154
            X.0ve r1 = r0.A0J
            boolean r1 = X.C40811vJ.A0W(r1)
            if (r1 == 0) goto L_0x0154
            X.1m1 r4 = r0.A0K
            X.1EC r3 = r0.A05
            r2 = 1
            X.4px r1 = new X.4px
            r1.<init>(r0, r2)
            r4.A03(r3, r1)
        L_0x0154:
            X.2Q4 r1 = r0.A07
            if (r1 != 0) goto L_0x01b2
            X.2mw r1 = r0.A02
            if (r1 != 0) goto L_0x01b2
            X.1EC r10 = r0.A05
            X.0ve r9 = r0.A0J
            X.1MZ r7 = r0.A0H
            X.1E7 r8 = r0.A03
            boolean r1 = X.C63982u1.A07(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0194
            X.11S r2 = r0.A0A
            X.1EC r1 = r0.A05
            int r1 = X.AnonymousClass3MW.A03(r7, r1)
            boolean r1 = X.C40811vJ.A0I(r2, r9, r1)
            if (r1 == 0) goto L_0x0190
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x000a
        L_0x017c:
            X.5Yr r2 = r0.A0D
            X.1EC r1 = r0.A05
            X.48z r3 = new X.48z
            r3.<init>(r2, r4, r1)
            r0.A01 = r3
            X.10I r2 = r0.A0O
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r2.CGM(r3, r1)
            goto L_0x013b
        L_0x0190:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x000a
        L_0x0194:
            X.1EC r1 = r0.A05
            boolean r1 = r7.A0J(r1)
            if (r1 == 0) goto L_0x000c
            X.11S r2 = r0.A0A
            X.1EC r1 = r0.A05
            int r1 = X.AnonymousClass3MW.A03(r7, r1)
            boolean r1 = X.C40811vJ.A0I(r2, r9, r1)
            if (r1 == 0) goto L_0x01ae
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            goto L_0x000a
        L_0x01ae:
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x000a
        L_0x01b2:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A03(com.whatsapp.group.view.custom.GroupDetailsCard):void");
    }

    private final AnonymousClass17W getCallConfirmationSheetBridge() {
        return (AnonymousClass17W) this.A0a.getValue();
    }

    private final void setSubtitleNumberOfParticipantsText(String str) {
        if (!(str == null || str.length() == 0)) {
            C42211xo A0i = AnonymousClass3MX.A0i(getSuspensionManager());
            AnonymousClass1E7 r0 = this.A0C;
            if (r0 != null) {
                if (!A0i.A02(r0)) {
                    C42211xo A0i2 = AnonymousClass3MX.A0i(getSuspensionManager());
                    AnonymousClass1E7 r02 = this.A0C;
                    if (r02 != null) {
                        if (!A0i2.A00(r02)) {
                            TextView textView = this.A0U;
                            textView.setVisibility(0);
                            textView.setText(str);
                            return;
                        }
                    }
                }
            }
            C18070vi.A11("groupChat");
            throw null;
        }
        this.A0U.setVisibility(8);
    }

    public void A04() {
        if (!this.A0Z) {
            this.A0Z = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A0E = AnonymousClass10E.A8r(r1);
            this.A00 = AnonymousClass3MZ.A0N(r1);
            this.A03 = AnonymousClass3MZ.A0W(r1);
            this.A05 = AnonymousClass10E.A4z(r1);
            this.A0L = C000200d.A00(r1.A3J);
            this.A0D = AnonymousClass3Ma.A0f(r1);
            this.A04 = (C107205Yu) r2.A0z.A2c.get();
            this.A0H = AnonymousClass3MY.A0X(r1);
            this.A0J = AnonymousClass3MZ.A12(r1);
            this.A0A = AnonymousClass3MY.A0V(r1);
            this.A01 = AnonymousClass10E.A17(r1);
            this.A0B = AnonymousClass3MZ.A0p(r1);
            this.A0M = C000200d.A00(r1.AAd);
            this.A0K = AnonymousClass3MZ.A13(r1);
            this.A02 = AnonymousClass3MZ.A0T(r1.A00);
            this.A06 = AnonymousClass3MZ.A0g(r1);
            this.A07 = AnonymousClass3MZ.A0l(r1);
            this.A08 = AnonymousClass3Ma.A0c(r1);
            this.A09 = AnonymousClass10E.A6Q(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0N;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1L9 getActivityUtils() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass1VP getCallsManager() {
        AnonymousClass1VP r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callsManager");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final AnonymousClass00H getDependencyBridgeRegistryLazy() {
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("dependencyBridgeRegistryLazy");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final View getGroupCallButton() {
        return this.A0Q;
    }

    public final C91454fi getGroupCallButtonController() {
        return this.A0G;
    }

    public final C107205Yu getGroupCallMenuHelperFactory() {
        C107205Yu r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupCallMenuHelperFactory");
        throw null;
    }

    public final AnonymousClass126 getGroupChatManager() {
        AnonymousClass126 r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatManager");
        throw null;
    }

    public final AnonymousClass1PU getGroupChatUtils() {
        AnonymousClass1PU r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatUtils");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager() {
        AnonymousClass1MZ r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final AnonymousClass1MW getParticipantUserStore() {
        AnonymousClass1MW r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("participantUserStore");
        throw null;
    }

    public final View getSearchChatButton() {
        return this.A0R;
    }

    public final AnonymousClass00H getSuspensionManager() {
        AnonymousClass00H r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("suspensionManager");
        throw null;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final C72043Kk getTextEmojiLabelViewControllerFactory() {
        C72043Kk r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("textEmojiLabelViewControllerFactory");
        throw null;
    }

    public final View getVideoCallButton() {
        return this.A0T;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    @OnLifecycleEvent(C27581Wq.ON_CREATE)
    public final void onActivityCreated() {
        C91454fi r2 = this.A0G;
        if (r2 != null) {
            r2.A0Q.registerObserver(r2.A0P);
            r2.A0S.registerObserver(r2.A0R);
            r2.A0M.registerObserver(r2.A0L);
        }
    }

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onActivityDestroyed() {
        C91454fi r3 = this.A0G;
        if (r3 != null) {
            r3.A0Q.unregisterObserver(r3.A0P);
            r3.A0S.unregisterObserver(r3.A0R);
            r3.A0M.unregisterObserver(r3.A0L);
            C825948z r0 = r3.A01;
            if (r0 != null) {
                r0.A0B(true);
                r3.A01 = null;
            }
            C825848y r02 = r3.A00;
            if (r02 != null) {
                r02.A0B(true);
                r3.A00 = null;
            }
            r3.A03 = null;
            r3.A05 = null;
            r3.A08 = AnonymousClass00R.A00;
            r3.A06 = null;
            r3.A04 = null;
            r3.A02 = null;
        }
    }

    public final void setAddPersonOnClickListener(View.OnClickListener onClickListener) {
        this.A0P.setOnClickListener(onClickListener);
    }

    public final void setSecondSubtitleText(String str) {
        if (str == null || str.length() == 0) {
            this.A0X.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A0X;
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public final void setSubtitleText(String str) {
        C72453Mb.A1L(this.A0V, str);
    }

    public final void setTitleColor(int i) {
        this.A0W.A01.setTextColor(i);
    }

    public final void A06(String str, boolean z) {
        Context context = getContext();
        C42141xh r4 = this.A0W;
        TextEmojiLabel textEmojiLabel = r4.A01;
        textEmojiLabel.setText(C43251zV.A04(context, textEmojiLabel.getPaint(), getEmojiLoader(), str, 0.9f));
        int i = 0;
        if (z) {
            i = 2;
        }
        r4.A03(i);
    }

    public final void setGroupCallButtonController(C91454fi r1) {
        this.A0G = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A04();
        this.A0a = AnonymousClass1DF.A01(new AnonymousClass5I2(this));
        LayoutInflater.from(getContext()).inflate(2131625495, this, true);
        View A062 = AnonymousClass1HF.A06(this, 2131427509);
        C18070vi.A0X(A062);
        this.A0S = A062;
        AnonymousClass1Y5.A07(A062, "Button");
        View A063 = AnonymousClass1HF.A06(this, 2131427471);
        C18070vi.A0X(A063);
        this.A0P = A063;
        AnonymousClass1Y5.A07(A063, "Button");
        View A064 = AnonymousClass1HF.A06(this, 2131427520);
        C18070vi.A0X(A064);
        this.A0R = A064;
        AnonymousClass1Y5.A07(A064, "Button");
        View A065 = AnonymousClass1HF.A06(this, 2131427486);
        C18070vi.A0X(A065);
        this.A0Q = A065;
        AnonymousClass1Y5.A07(A065, "Button");
        View A066 = AnonymousClass1HF.A06(this, 2131427535);
        C18070vi.A0X(A066);
        this.A0T = A066;
        AnonymousClass1Y5.A07(A066, "Button");
        View A067 = AnonymousClass1HF.A06(this, 2131431253);
        C18070vi.A0X(A067);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A067;
        this.A0V = textEmojiLabel;
        AnonymousClass1Y5.A07(textEmojiLabel, "Button");
        View A068 = AnonymousClass1HF.A06(this, 2131427806);
        C18070vi.A0X(A068);
        this.A0U = (TextView) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131431295);
        C18070vi.A0X(A069);
        this.A0X = (WaTextView) A069;
        this.A0W = C42141xh.A01(this, getTextEmojiLabelViewControllerFactory(), 2131431312);
        A01();
    }

    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A04();
        this.A0a = AnonymousClass1DF.A01(new AnonymousClass5I2(this));
        LayoutInflater.from(getContext()).inflate(2131625495, this, true);
        View A062 = AnonymousClass1HF.A06(this, 2131427509);
        C18070vi.A0X(A062);
        this.A0S = A062;
        AnonymousClass1Y5.A07(A062, "Button");
        View A063 = AnonymousClass1HF.A06(this, 2131427471);
        C18070vi.A0X(A063);
        this.A0P = A063;
        AnonymousClass1Y5.A07(A063, "Button");
        View A064 = AnonymousClass1HF.A06(this, 2131427520);
        C18070vi.A0X(A064);
        this.A0R = A064;
        AnonymousClass1Y5.A07(A064, "Button");
        View A065 = AnonymousClass1HF.A06(this, 2131427486);
        C18070vi.A0X(A065);
        this.A0Q = A065;
        AnonymousClass1Y5.A07(A065, "Button");
        View A066 = AnonymousClass1HF.A06(this, 2131427535);
        C18070vi.A0X(A066);
        this.A0T = A066;
        AnonymousClass1Y5.A07(A066, "Button");
        View A067 = AnonymousClass1HF.A06(this, 2131431253);
        C18070vi.A0X(A067);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A067;
        this.A0V = textEmojiLabel;
        AnonymousClass1Y5.A07(textEmojiLabel, "Button");
        View A068 = AnonymousClass1HF.A06(this, 2131427806);
        C18070vi.A0X(A068);
        this.A0U = (TextView) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131431295);
        C18070vi.A0X(A069);
        this.A0X = (WaTextView) A069;
        this.A0W = C42141xh.A01(this, getTextEmojiLabelViewControllerFactory(), 2131431312);
        A01();
    }
}
