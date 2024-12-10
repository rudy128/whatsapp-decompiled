package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.3sy  reason: invalid class name and case insensitive filesystem */
public final class C78543sy extends C78913tt implements C106825Xi {
    public C23651Hc A00;
    public AnonymousClass4U7 A01;
    public C106775Xd A02;
    public C196089uR A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final View A0A = AnonymousClass3MX.A0C(this, 2131432037);
    public final ConversationRowContactInfoLinkedAccount A0B = ((ConversationRowContactInfoLinkedAccount) AnonymousClass3MX.A0C(this, 2131432031));
    public final ConversationRowContactInfoLinkedAccount A0C = ((ConversationRowContactInfoLinkedAccount) AnonymousClass3MX.A0C(this, 2131432033));
    public final AnonymousClass4OU A0D;
    public final C18000vb A0E;
    public final AnonymousClass4WO A0F = ((AnonymousClass4WO) AnonymousClass12Q.A01(16420));
    public final C48122Lg A0G;
    public final WDSButton A0H;

    public final void setCatalogManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setCatalogObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setCtwaFlowContextStore(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setFlowsEntrypointMetadataCache(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setFlowsPreloaderWrapper(C106775Xd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setImageLoader(C196089uR r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setMessageClient(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setXmppStateManager(C23651Hc r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public static final AnonymousClass4U7 A04(C78543sy r5) {
        C194349ra r0;
        String str;
        UserJid userJid = (UserJid) r5.A03.A06(UserJid.class);
        String str2 = null;
        if (userJid == null || (r0 = (C194349ra) r5.A0G.A04(userJid)) == null) {
            return null;
        }
        JSONObject jSONObject = r0.A02;
        Long valueOf = Long.valueOf(jSONObject.optLong("biz_creation_date"));
        Object opt = jSONObject.opt("fb_follower_count");
        if (opt == null || opt.equals(JSONObject.NULL)) {
            str = null;
        } else {
            str = opt.toString();
        }
        Object opt2 = jSONObject.opt("ig_follower_count");
        if (opt2 != null && !opt2.equals(JSONObject.NULL)) {
            str2 = opt2.toString();
        }
        return new AnonymousClass4U7(valueOf, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r0 == false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AEB r9, X.C78543sy r10, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount r11, java.lang.String r12) {
        /*
            if (r12 == 0) goto L_0x00b4
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00b4
            if (r9 == 0) goto L_0x0012
            int r0 = r9.A00
            if (r0 <= 0) goto L_0x0012
            java.lang.String r12 = java.lang.String.valueOf(r0)
        L_0x0012:
            X.0vb r1 = r10.A0E
            r9 = 1
            X.C18070vi.A0d(r1, r9)
            if (r12 == 0) goto L_0x00af
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00af
            r7 = 0
            r11.setVisibility(r7)
            long r3 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x00a9 }
            r8 = 2131755035(0x7f10001b, float:1.9140938E38)
            java.lang.String r6 = X.C196739vZ.A01(r1, r3)     // Catch:{ NumberFormatException -> 0x00a9 }
            X.C18070vi.A0X(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r2 = X.C196739vZ.A00(r3)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r10 = "info"
            if (r2 != 0) goto L_0x004f
            com.whatsapp.WaTextView r5 = r11.A00     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r5 == 0) goto L_0x00a4
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r11)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r1 = (int) r3     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ NumberFormatException -> 0x00a9 }
            r0[r7] = r6     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r0 = r2.getQuantityString(r8, r1, r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5.setText(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            return
        L_0x004f:
            int r1 = r2.hashCode()     // Catch:{ NumberFormatException -> 0x00a9 }
            r0 = 66
            if (r1 == r0) goto L_0x0073
            r0 = 75
            if (r1 == r0) goto L_0x0069
            r0 = 77
            if (r1 != r0) goto L_0x007e
            java.lang.String r0 = "M"
            boolean r0 = r2.equals(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            r2 = 2131888740(0x7f120a64, float:1.9412124E38)
            goto L_0x007c
        L_0x0069:
            java.lang.String r0 = "K"
            boolean r0 = r2.equals(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            r2 = 2131888739(0x7f120a63, float:1.9412122E38)
            goto L_0x007c
        L_0x0073:
            java.lang.String r0 = "B"
            boolean r0 = r2.equals(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            r2 = 2131888738(0x7f120a62, float:1.941212E38)
        L_0x007c:
            if (r0 != 0) goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            android.content.Context r0 = r11.getContext()     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r6 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ NumberFormatException -> 0x00a9 }
            com.whatsapp.WaTextView r5 = r11.A00     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r5 == 0) goto L_0x00a4
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r11)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r1 = (int) r3     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ NumberFormatException -> 0x00a9 }
            r0[r7] = r6     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r0 = r2.getQuantityString(r8, r1, r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5.setText(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            return
        L_0x00a4:
            X.C18070vi.A11(r10)     // Catch:{ NumberFormatException -> 0x00a9 }
            r0 = 0
            throw r0     // Catch:{ NumberFormatException -> 0x00a9 }
        L_0x00a9:
            java.lang.String r0 = "ConversationRowContactInfoLinkedAccount: Error parsing follower count"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00af:
            r0 = 8
            r11.setVisibility(r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78543sy.A06(X.AEB, X.3sy, com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r0.booleanValue() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3.A0C != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r0 == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C78543sy r8) {
        /*
            X.1E7 r1 = r8.A03
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r1.A06(r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x008f
            X.0ve r1 = r8.A0F
            r0 = 6551(0x1997, float:9.18E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            r7 = 0
            if (r0 == 0) goto L_0x00af
            X.00H r0 = r8.getCtwaFlowContextStore()
            java.lang.Object r0 = r0.get()
            X.A5S r0 = (X.A5S) r0
            java.lang.Object r3 = r0.A04(r4)
            X.4FP r3 = (X.AnonymousClass4FP) r3
        L_0x0029:
            X.0ve r1 = r8.A0F
            r0 = 10399(0x289f, float:1.4572E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x00ad
            java.lang.Boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0042:
            r1 = 0
            if (r3 == 0) goto L_0x00ad
        L_0x0045:
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x00ad
            if (r1 != 0) goto L_0x00ad
        L_0x004b:
            com.whatsapp.wds.components.button.WDSButton r2 = r8.A0H
            if (r6 != 0) goto L_0x0051
            r5 = 8
        L_0x0051:
            r2.setVisibility(r5)
            if (r3 == 0) goto L_0x0058
            java.lang.String r7 = r3.A07
        L_0x0058:
            r2.setText(r7)
            java.util.List r0 = X.AnonymousClass4WO.A00
            if (r3 == 0) goto L_0x00ab
            java.lang.String r0 = r3.A07
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = X.C108975cc.A0d(r0)
        L_0x006b:
            java.util.List r0 = X.AnonymousClass4WO.A02
            boolean r0 = X.C29431cG.A18(r0, r1)
            if (r0 != 0) goto L_0x00a7
            java.util.List r0 = X.AnonymousClass4WO.A01
            boolean r0 = X.C29431cG.A18(r0, r1)
            if (r0 == 0) goto L_0x0090
            r1 = 2131231944(0x7f0804c8, float:1.8079983E38)
        L_0x007e:
            r2.setIcon((int) r1)
            if (r3 == 0) goto L_0x008f
            if (r6 == 0) goto L_0x008f
            r1 = 44
            X.4dV r0 = new X.4dV
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r4, (java.lang.Object) r3, (int) r1)
            r2.setOnClickListener(r0)
        L_0x008f:
            return
        L_0x0090:
            java.util.List r0 = X.AnonymousClass4WO.A03
            boolean r0 = X.C29431cG.A18(r0, r1)
            if (r0 == 0) goto L_0x009c
            r1 = 2131232082(0x7f080552, float:1.8080263E38)
            goto L_0x007e
        L_0x009c:
            java.util.List r0 = X.AnonymousClass4WO.A00
            boolean r0 = X.C29431cG.A18(r0, r1)
            r1 = 2131231741(0x7f0803fd, float:1.8079572E38)
            if (r0 != 0) goto L_0x007e
        L_0x00a7:
            r1 = 2131231687(0x7f0803c7, float:1.8079462E38)
            goto L_0x007e
        L_0x00ab:
            r1 = 0
            goto L_0x006b
        L_0x00ad:
            r6 = 0
            goto L_0x004b
        L_0x00af:
            r3 = r7
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78543sy.A07(X.3sy):void");
    }

    public void A1M() {
        if (!this.A09) {
            this.A09 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r1 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r1, A0O, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r1, r2, this);
            AnonymousClass3uQ.A12(r1, r2, this);
            AnonymousClass3uQ.A0y(A0n, r1, this, BE8.A0d(r1));
            AnonymousClass3uQ.A13(r1, r2, this, r1.ABq);
            AnonymousClass3uQ.A0x(A0n, r1, r2, this, r1.AIy);
            C19890zB r3 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r3, r1, r2, A0O, this);
            AnonymousClass3uQ.A11(r1, r2, this);
            AnonymousClass3uQ.A15(r1, this);
            AnonymousClass3uQ.A0s(r3, A0n, r1, r2, this);
            AnonymousClass3uQ.A0u(r3, r1, r2, A0O, this);
            AnonymousClass3uQ.A0t(r3, A0n, r1, A0O, this);
            AnonymousClass3uQ.A10(r1, r2, this);
            AnonymousClass3uQ.A0z(r1, r2, A0O, this, AnonymousClass3uQ.A0o(r1));
            C78403sk.A01(r3, r1, this);
            C78403sk.A02(A0n, r1, A0O, this);
            C78403sk.A00(r3, r1, r2, A0O, this);
            C78403sk.A03(A0n, r1, this);
            this.A00 = (C26911Ty) r1.A1J.get();
            this.A01 = (C24671Lf) r1.A2g.get();
            this.A02 = BE9.A0Y(r1);
            this.A04 = AnonymousClass3Ma.A0g(r1);
            this.A04 = C000200d.A00(r1.A1s);
            this.A05 = C000200d.A00(r1.AGx);
            this.A06 = C000200d.A00(r1.A1O);
            this.A07 = C000200d.A00(r1.ATt);
            this.A02 = r2.A43();
            this.A03 = (C196089uR) r2.ACu.get();
            this.A08 = C000200d.A00(r1.A6N);
            this.A00 = (C23651Hc) r1.ACD.get();
        }
    }

    public C23581Gv A2m() {
        return new C78523sw(this);
    }

    public final AnonymousClass00H getCatalogManager() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("catalogManager");
        throw null;
    }

    public final AnonymousClass00H getCatalogObservers() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("catalogObservers");
        throw null;
    }

    public final AnonymousClass4WO getContactInfoBizHelper() {
        return this.A0F;
    }

    public final AnonymousClass00H getCtwaFlowContextStore() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("ctwaFlowContextStore");
        throw null;
    }

    public final AnonymousClass00H getFlowsEntrypointMetadataCache() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("flowsEntrypointMetadataCache");
        throw null;
    }

    public final C106775Xd getFlowsPreloaderWrapper() {
        C106775Xd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("flowsPreloaderWrapper");
        throw null;
    }

    public final C196089uR getImageLoader() {
        C196089uR r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imageLoader");
        throw null;
    }

    public final AnonymousClass00H getMessageClient() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageClient");
        throw null;
    }

    public final C23651Hc getXmppStateManager() {
        C23651Hc r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("xmppStateManager");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78543sy(Context context, C108875cR r4, AnonymousClass4OU r5, C18000vb r6, C48122Lg r7, C436420i r8) {
        super(context, r4, r8);
        C18070vi.A0j(r6, context);
        C72473Md.A1J(r7, r5);
        A1M();
        this.A0E = r6;
        this.A0G = r7;
        this.A0D = r5;
        C89904dD.A00(this.A06, this, 29);
        this.A0H = (WDSButton) AnonymousClass3MX.A0C(this, 2131430923);
        findViewById(2131429416).setBackground(this.A09.BQF());
        C27641Ww.A05(this, this.A0D, 0, 0);
        A2o();
    }

    public static final String A05(C78543sy r4, AnonymousClass4FP r5) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r5.A01.getRawString());
        A10.append(',');
        String A0y = AnonymousClass000.A0y(r5.A08, A10);
        C18070vi.A0d(A0y, 0);
        C18100vl r42 = ((C19958A0p) r4.getFlowsEntrypointMetadataCache().get()).A01.A01;
        String string = ((SharedPreferences) r42.getValue()).getString(AnonymousClass001.A1H("flows_message_uuid_", A0y, AnonymousClass000.A10()), (String) null);
        if (string != null) {
            return string;
        }
        String A0Q = C17890vO.A0Q();
        C18070vi.A0d(A0Q, 1);
        C17880vN.A1E(C17890vO.A0A(r42), C17900vP.A0A("flows_message_uuid_", A0y), A0Q);
        return A0Q;
    }

    public static final void A08(C78543sy r11, UserJid userJid, String str, String str2, String str3, String str4) {
        HashSet hashSet = ((C822444b) r11.getCtwaFlowContextStore().get()).A00;
        synchronized (hashSet) {
            hashSet.add(r11);
        }
        C34811l7 r2 = (C34811l7) r11.A2A.get();
        C20271AEe A002 = AnonymousClass9QY.A00(str, str2, str3);
        C196289ul A022 = r2.A02("messageless_flow", A002.A00);
        if (A022 != null) {
            AnonymousClass1FY r4 = r11.A08;
            C194419rh r1 = new C194419rh((Integer) null, (String) null, 1);
            C18070vi.A0d(r4, 0);
            if (!(A022 instanceof AnonymousClass8nz)) {
                Log.e("NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction.");
                return;
            }
            String str5 = str4;
            ((C19958A0p) r2.A07.get()).A02(r1, str5);
            String A0f = C108985cd.A0f();
            Log.w("NativeFlowActionUtils/sendWamEvent: message was null, can't send event");
            ((AnonymousClass8nz) A022).A0H(r4, (AnonymousClass5XY) null, userJid, A002, str5, A0f, -1);
        }
    }

    public void A2o() {
        int i;
        int i2;
        String str;
        this.A01 = A04(this);
        C98784ri.A00(this.A1X, this, 4);
        C42141xh r2 = this.A07;
        r2.A05(this.A03);
        boolean A1T = AnonymousClass000.A1T(this.A03.A0A() ? 1 : 0, 1);
        r2.A03(A1T ? 1 : 0);
        if (A1T) {
            A2p(50);
        }
        C42741yf r0 = this.A03.A0G;
        WaTextView waTextView = this.A09;
        if (r0 != null) {
            waTextView.setText(getResources().getText(2131887564));
            i = 0;
        } else {
            i = 8;
        }
        waTextView.setVisibility(i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169505);
        this.A0A.A0A(this.A0C, this.A03, dimensionPixelSize);
        if (C18020vd.A05(C18040vf.A02, this.A0F, 8313)) {
            A2n();
        }
        AnonymousClass4U7 r4 = this.A01;
        if (r4 != null) {
            TextView A0E2 = C17880vN.A0E(this, 2131427417);
            Long l = r4.A00;
            if (l != null) {
                long longValue = l.longValue();
                C18000vb r1 = this.A0E;
                C18070vi.A0d(r1, 0);
                String format = new SimpleDateFormat(r1.A08(178), r1.A0N()).format(new Date(longValue));
                C18070vi.A0X(format);
                Context context = getContext();
                Object[] A1a = AnonymousClass3MW.A1a();
                i2 = 0;
                A1a[0] = format;
                AnonymousClass3MY.A0y(context, A0E2, A1a, 2131887114);
            } else {
                i2 = 8;
            }
            A0E2.setVisibility(i2);
            String str2 = r4.A01;
            if (!((str2 == null || str2.length() == 0) && ((str = r4.A02) == null || str.length() == 0))) {
                A06((AEB) null, this, this.A0B, str2);
                A06((AEB) null, this, this.A0C, r4.A02);
                getBusinessProfileManager().A0D(new C92834hz(r4, this, 1), (UserJid) this.A03.A06(UserJid.class));
            }
        }
        A07(this);
    }

    public int getLayout() {
        return 2131624796;
    }
}
