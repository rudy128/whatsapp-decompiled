package com.whatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1VP;
import X.AnonymousClass1VQ;
import X.AnonymousClass1Y5;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3TA;
import X.AnonymousClass4JA;
import X.AnonymousClass4aX;
import X.AnonymousClass74H;
import X.AnonymousClass7AT;
import X.C003301m;
import X.C03610Iy;
import X.C108975cc;
import X.C108995ce;
import X.C137526vb;
import X.C1417476u;
import X.C1424379l;
import X.C143887Fe;
import X.C148867i8;
import X.C148877i9;
import X.C148887iA;
import X.C148897iB;
import X.C148907iC;
import X.C148917iD;
import X.C148927iE;
import X.C148937iF;
import X.C148947iG;
import X.C148957iH;
import X.C148967iI;
import X.C148977iJ;
import X.C155317sY;
import X.C155327sZ;
import X.C155337sa;
import X.C157847yk;
import X.C157857yl;
import X.C157867ym;
import X.C157877yn;
import X.C157887yo;
import X.C157897yp;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C192539oZ;
import X.C194859sP;
import X.C22971Dz;
import X.C24921Me;
import X.C28931bI;
import X.C30391dr;
import X.C37581pm;
import X.C72453Mb;
import X.C84084Hu;
import X.C88184Yq;
import X.C99274sY;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.wds.components.button.WDSButton;

public final class CreateCallLinkBottomSheet extends Hilt_CreateCallLinkBottomSheet {
    public ImageView A00;
    public ImageView A01;
    public CircularProgressBar A02;
    public AnonymousClass4JA A03;
    public AnonymousClass1KB A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C143887Fe A09;
    public C1417476u A0A;
    public AnonymousClass1M9 A0B;
    public C24921Me A0C;
    public AnonymousClass11C A0D;
    public C18030ve A0E;
    public AnonymousClass1LU A0F;
    public C28931bI A0G;
    public WDSButton A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public Integer A0Q = AnonymousClass00R.A00;
    public C18600wl A0R;
    public C18600wl A0S;
    public C03610Iy A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y;
    public final C18100vl A0Z;
    public final C18100vl A0a;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A02 = (CircularProgressBar) AnonymousClass1HF.A06(view, 2131434181);
        this.A05 = AnonymousClass3MW.A0R(view, 2131432001);
        this.A06 = AnonymousClass3MW.A0T(view, 2131428695);
        this.A0H = AnonymousClass3MW.A0q(view, 2131434059);
        this.A0G = C28931bI.A00(view, 2131435001);
        this.A00 = AnonymousClass3MW.A0G(view, 2131432016);
        this.A07 = AnonymousClass3MW.A0T(view, 2131428746);
        this.A08 = AnonymousClass3MW.A0T(view, 2131428752);
        this.A01 = AnonymousClass3MW.A0G(view, 2131428753);
        A07(this, true);
        C18100vl r2 = this.A0U;
        AnonymousClass7AT.A01(this, ((CallLinkViewModel) AnonymousClass7AT.A00(this, ((CallLinkViewModel) r2.getValue()).A02.A01("saved_state_link"), r2, new C157847yk(this), 18)).A02.A00(true, "saved_state_is_video_requested"), new C157857yl(this), 18);
        AnonymousClass7AT.A01(this, ((AnonymousClass3TA) this.A0a.getValue()).A0H, new C157867ym(this), 18);
        ImageView imageView = this.A01;
        if (imageView != null) {
            C84084Hu.A00(imageView, new C157877yn(this));
            AnonymousClass1Y5.A02(imageView, 2131887645);
        }
        WaTextView waTextView = this.A08;
        if (waTextView != null) {
            C84084Hu.A00(waTextView, new C157887yo(this));
        }
        C157897yp r1 = new C157897yp(this);
        WaTextView waTextView2 = this.A07;
        if (waTextView2 != null) {
            C84084Hu.A00(waTextView2, r1);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            C84084Hu.A00(imageView2, r1);
        }
        WaTextView waTextView3 = this.A06;
        if (waTextView3 != null) {
            C84084Hu.A00(waTextView3, r1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        String str;
        C18070vi.A0d(dialogInterface, 0);
        if (C72453Mb.A1a(this.A0W)) {
            AnonymousClass00H r0 = this.A0L;
            if (r0 != null) {
                ((C88184Yq) r0.get()).A02(19);
                AnonymousClass00H r02 = this.A0O;
                if (r02 != null) {
                    ((C194859sP) C18070vi.A0E(r02)).A01((Boolean) null, (Boolean) null, 25, (Integer) null, (Integer) null, 8);
                    return;
                }
                str = "preCallChatThreadLoggerLazy";
            } else {
                str = "conversationAttachmentEventLoggerLazy";
            }
        } else {
            AnonymousClass00H r03 = this.A0N;
            if (r03 != null) {
                ((C192539oZ) C18070vi.A0E(r03)).A01(25, (Integer) null, 8);
                return;
            }
            str = "preCallCallsTabLoggerLazy";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01bb, code lost:
        r5 = X.C72453Mb.A0D(r14.A02);
        r0 = r14.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c4, code lost:
        if (r0 == null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c6, code lost:
        r0.setEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c9, code lost:
        r0 = r14.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cb, code lost:
        if (r0 == null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cd, code lost:
        r0.A09(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d0, code lost:
        r1 = r14.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d2, code lost:
        if (r1 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d4, code lost:
        r1.setVisibility(X.C72453Mb.A07(X.C72453Mb.A1a(r14.A0Z) ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e1, code lost:
        r1 = r14.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e3, code lost:
        if (r1 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e5, code lost:
        r1.setEnabled(X.C72453Mb.A1a(r14.A0Z));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ee, code lost:
        r1 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f0, code lost:
        if (r1 == null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f8, code lost:
        if (X.C72453Mb.A1a(r14.A0Z) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fa, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01fb, code lost:
        r1.setVisibility(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fe, code lost:
        r1 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0200, code lost:
        if (r1 == null) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0202, code lost:
        r1.setEnabled(X.C72453Mb.A1a(r14.A0Z));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020b, code lost:
        r1 = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020d, code lost:
        if (r1 == null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020f, code lost:
        r1.setText(2131887682);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0215, code lost:
        r1 = r14.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0217, code lost:
        if (r1 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0219, code lost:
        r1.setImageResource(2131232364);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x021f, code lost:
        r0 = r14.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0221, code lost:
        if (r0 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0223, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0226, code lost:
        r14.A0Q = X.AnonymousClass00R.A00;
        r1 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x022d, code lost:
        if (r4 != 3) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x022f, code lost:
        r1 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0231, code lost:
        r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(new X.C116475xo(r14, 1), r1);
        r1.A2D(true);
        r1.A2F(r14.A1E(), "call_link_error_dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0246, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0247, code lost:
        r0 = "groupParticipantsManagerLazy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x024a, code lost:
        r0 = "preCallCallsTabLoggerLazy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x024d, code lost:
        r0 = "preCallChatThreadLoggerLazy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x024f, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0253, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r14.A0Q != X.AnonymousClass00R.A00) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        if (r4 == 2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        r13 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0103, code lost:
        if (r5.A00() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0105, code lost:
        r13 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010d, code lost:
        if (X.C72453Mb.A1a(r14.A0W) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
        r0 = r14.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        if (r0 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        r7 = (X.C194859sP) X.C18070vi.A0E(r0);
        r0 = com.whatsapp.jid.GroupJid.Companion;
        r1 = X.C36321nh.A00((com.whatsapp.jid.Jid) r14.A0V.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012b, code lost:
        if (r1 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012d, code lost:
        r0 = r14.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012f, code lost:
        if (r0 == null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0131, code lost:
        r11 = X.C72473Md.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0135, code lost:
        r7.A01((java.lang.Boolean) null, (java.lang.Boolean) null, 30, r11, (java.lang.Integer) null, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013b, code lost:
        if (r4 == 2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013e, code lost:
        if (r4 == 3) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (r4 == 0) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0144, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0146, code lost:
        r0 = r14.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0148, code lost:
        if (r0 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        ((X.C192539oZ) X.C18070vi.A0E(r0)).A01(X.C17880vN.A0m(), (java.lang.Integer) null, r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet r14) {
        /*
            X.76u r5 = r14.A0A
            if (r5 == 0) goto L_0x0078
            com.whatsapp.WaImageView r1 = r14.A05
            if (r1 == 0) goto L_0x0010
            X.829 r0 = new X.829
            r0.<init>(r14, r5)
            X.C84084Hu.A00(r1, r0)
        L_0x0010:
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A0H
            if (r1 == 0) goto L_0x001c
            X.82A r0 = new X.82A
            r0.<init>(r14, r5)
            X.C84084Hu.A00(r1, r0)
        L_0x001c:
            X.1bI r3 = r14.A0G
            if (r3 == 0) goto L_0x002f
            X.82B r2 = new X.82B
            r2.<init>(r14, r5)
            r1 = 41
            X.6LG r0 = new X.6LG
            r0.<init>(r2, r1)
            r3.A05(r0)
        L_0x002f:
            int r4 = r5.A03
            r6 = 2
            r3 = 1
            if (r4 != r3) goto L_0x00f9
            java.lang.Integer r1 = r14.A0Q
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x00fb
        L_0x003b:
            java.lang.Integer r1 = r14.A0Q
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            if (r1 == r6) goto L_0x0159
            if (r4 != r3) goto L_0x0078
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0079
            java.lang.String r3 = r5.A05
            r2 = 0
            r14.A09 = r2
            X.0vl r1 = r14.A0a
            java.lang.Object r0 = r1.getValue()
            X.3TA r0 = (X.AnonymousClass3TA) r0
            X.4QJ r0 = r0.A0m
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x01b3
            if (r3 == 0) goto L_0x01b3
            int r0 = r3.length()
            if (r0 == 0) goto L_0x01b3
            r14.A0Q = r6
            java.lang.Object r0 = r1.getValue()
            X.3TA r0 = (X.AnonymousClass3TA) r0
            r0.A0a(r3)
            java.lang.Object r0 = r1.getValue()
            X.3TA r0 = (X.AnonymousClass3TA) r0
            r0.A0Z(r2, r3)
        L_0x0078:
            return
        L_0x0079:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0078
            com.whatsapp.CircularProgressBar r0 = r14.A02
            int r2 = X.C72453Mb.A0D(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A0H
            if (r0 == 0) goto L_0x008a
            r0.setEnabled(r3)
        L_0x008a:
            X.1bI r1 = r14.A0G
            if (r1 == 0) goto L_0x0098
            X.0vl r0 = r14.A0W
            boolean r0 = X.C72453Mb.A1a(r0)
            r3 = r3 ^ r0
            r1.A09(r3)
        L_0x0098:
            com.whatsapp.WaTextView r1 = r14.A08
            r3 = 0
            if (r1 == 0) goto L_0x00aa
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x00aa:
            com.whatsapp.WaTextView r1 = r14.A08
            if (r1 == 0) goto L_0x00b7
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            r1.setEnabled(r0)
        L_0x00b7:
            android.widget.ImageView r1 = r14.A01
            if (r1 == 0) goto L_0x00c8
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x00c8:
            android.widget.ImageView r1 = r14.A01
            if (r1 == 0) goto L_0x00d5
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            r1.setEnabled(r0)
        L_0x00d5:
            com.whatsapp.WaTextView r1 = r14.A06
            if (r1 == 0) goto L_0x00df
            r0 = 2131887650(0x7f120622, float:1.9409913E38)
            r1.setText(r0)
        L_0x00df:
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            com.whatsapp.WaImageView r1 = r14.A05
            if (r0 != 0) goto L_0x00f3
            if (r1 == 0) goto L_0x01ab
            r0 = 2131231835(0x7f08045b, float:1.8079762E38)
            r1.setImageResource(r0)
            goto L_0x01ab
        L_0x00f3:
            if (r1 == 0) goto L_0x0078
            r1.setVisibility(r2)
            return
        L_0x00f9:
            if (r4 != r6) goto L_0x013b
        L_0x00fb:
            boolean r0 = r5.A00()
            r1 = 30
            r13 = 30
            if (r0 == 0) goto L_0x0107
            r13 = 14
        L_0x0107:
            X.0vl r0 = r14.A0W
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0146
            X.00H r0 = r14.A0O
            if (r0 == 0) goto L_0x024d
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.9sP r7 = (X.C194859sP) r7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            X.0vl r0 = r14.A0V
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.GroupJid r1 = X.C36321nh.A00(r0)
            if (r1 == 0) goto L_0x0144
            X.00H r0 = r14.A0M
            if (r0 == 0) goto L_0x0247
            java.lang.Integer r11 = X.C72473Md.A0d(r1, r0)
        L_0x0135:
            r8 = 0
            r12 = r8
            r9 = r8
            r7.A01(r8, r9, r10, r11, r12, r13)
        L_0x013b:
            if (r4 == r6) goto L_0x01bb
            r0 = 3
            if (r4 == r0) goto L_0x01bb
            if (r4 == 0) goto L_0x0159
            goto L_0x003b
        L_0x0144:
            r11 = 0
            goto L_0x0135
        L_0x0146:
            X.00H r0 = r14.A0N
            if (r0 == 0) goto L_0x024a
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9oZ r2 = (X.C192539oZ) r2
            java.lang.Integer r1 = X.C17880vN.A0m()
            r0 = 0
            r2.A01(r1, r0, r13)
            goto L_0x013b
        L_0x0159:
            com.whatsapp.CircularProgressBar r0 = r14.A02
            r2 = 0
            if (r0 == 0) goto L_0x0161
            r0.setVisibility(r2)
        L_0x0161:
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A0H
            if (r0 == 0) goto L_0x0168
            r0.setEnabled(r2)
        L_0x0168:
            X.1bI r0 = r14.A0G
            if (r0 == 0) goto L_0x016f
            r0.A09(r2)
        L_0x016f:
            com.whatsapp.WaTextView r1 = r14.A08
            r3 = 8
            if (r1 == 0) goto L_0x0182
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x0182:
            com.whatsapp.WaTextView r0 = r14.A08
            if (r0 == 0) goto L_0x0189
            r0.setEnabled(r2)
        L_0x0189:
            android.widget.ImageView r1 = r14.A01
            if (r1 == 0) goto L_0x019a
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x019a:
            android.widget.ImageView r0 = r14.A01
            if (r0 == 0) goto L_0x01a1
            r0.setEnabled(r2)
        L_0x01a1:
            com.whatsapp.WaTextView r1 = r14.A06
            if (r1 == 0) goto L_0x01ab
            r0 = 2131889110(0x7f120bd6, float:1.9412874E38)
            r1.setText(r0)
        L_0x01ab:
            com.whatsapp.WaImageView r0 = r14.A05
            if (r0 == 0) goto L_0x0078
            r0.setVisibility(r3)
            return
        L_0x01b3:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r14.A0Q = r0
            A00(r14)
            return
        L_0x01bb:
            com.whatsapp.CircularProgressBar r0 = r14.A02
            int r5 = X.C72453Mb.A0D(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A0H
            r2 = 0
            if (r0 == 0) goto L_0x01c9
            r0.setEnabled(r2)
        L_0x01c9:
            X.1bI r0 = r14.A0G
            if (r0 == 0) goto L_0x01d0
            r0.A09(r2)
        L_0x01d0:
            com.whatsapp.WaTextView r1 = r14.A08
            if (r1 == 0) goto L_0x01e1
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x01e1:
            com.whatsapp.WaTextView r1 = r14.A08
            if (r1 == 0) goto L_0x01ee
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            r1.setEnabled(r0)
        L_0x01ee:
            android.widget.ImageView r1 = r14.A01
            if (r1 == 0) goto L_0x01fe
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x01fb
            r5 = 0
        L_0x01fb:
            r1.setVisibility(r5)
        L_0x01fe:
            android.widget.ImageView r1 = r14.A01
            if (r1 == 0) goto L_0x020b
            X.0vl r0 = r14.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            r1.setEnabled(r0)
        L_0x020b:
            com.whatsapp.WaTextView r1 = r14.A06
            if (r1 == 0) goto L_0x0215
            r0 = 2131887682(0x7f120642, float:1.9409978E38)
            r1.setText(r0)
        L_0x0215:
            com.whatsapp.WaImageView r1 = r14.A05
            if (r1 == 0) goto L_0x021f
            r0 = 2131232364(0x7f08066c, float:1.8080835E38)
            r1.setImageResource(r0)
        L_0x021f:
            com.whatsapp.WaImageView r0 = r14.A05
            if (r0 == 0) goto L_0x0226
            r0.setVisibility(r2)
        L_0x0226:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r14.A0Q = r0
            r0 = 3
            r1 = 19
            if (r4 != r0) goto L_0x0231
            r1 = 20
        L_0x0231:
            java.lang.String r2 = "call_link_error_dialog"
            X.5xo r0 = new X.5xo
            r0.<init>(r14, r3)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r0, r1)
            r1.A2D(r3)
            X.1GP r0 = r14.A1E()
            r1.A2F(r0, r2)
            return
        L_0x0247:
            java.lang.String r0 = "groupParticipantsManagerLazy"
            goto L_0x024f
        L_0x024a:
            java.lang.String r0 = "preCallCallsTabLoggerLazy"
            goto L_0x024f
        L_0x024d:
            java.lang.String r0 = "preCallChatThreadLoggerLazy"
        L_0x024f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet.A00(com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet):void");
    }

    public static final void A01(CreateCallLinkBottomSheet createCallLinkBottomSheet) {
        C03610Iy r6 = createCallLinkBottomSheet.A0T;
        if (r6 == null) {
            WDSButton wDSButton = createCallLinkBottomSheet.A0H;
            if (wDSButton != null) {
                r6 = new C03610Iy(createCallLinkBottomSheet.A14(), wDSButton, 8388613, 0, 2132084381);
                C003301m r5 = r6.A03;
                C18070vi.A0X(r5);
                C137526vb.A00(r5);
                r6.A01 = new C1424379l(createCallLinkBottomSheet, 0);
                r5.add(0, 2, 1, 2131899576).setIcon(AnonymousClass4aX.A01(wDSButton.getContext(), 2131231736));
                r5.add(0, 1, 2, 2131898713).setIcon(AnonymousClass4aX.A01(wDSButton.getContext(), 2131231735));
                createCallLinkBottomSheet.A0T = r6;
            } else {
                throw C17890vO.A0K();
            }
        }
        r6.A00();
    }

    public static final void A02(CreateCallLinkBottomSheet createCallLinkBottomSheet) {
        C18100vl r0 = createCallLinkBottomSheet.A0U;
        CallLinkViewModel callLinkViewModel = (CallLinkViewModel) r0.getValue();
        Boolean bool = (Boolean) ((CallLinkViewModel) r0.getValue()).A02.A00(AnonymousClass000.A0i(), "saved_state_is_video_requested").A06();
        if (bool == null) {
            bool = AnonymousClass000.A0h();
        }
        CallLinkViewModel.A00(callLinkViewModel, bool.booleanValue());
    }

    public static final void A03(CreateCallLinkBottomSheet createCallLinkBottomSheet, C1417476u r7) {
        AnonymousClass00H r0 = createCallLinkBottomSheet.A0N;
        if (r0 != null) {
            ((C192539oZ) C18070vi.A0E(r0)).A01(25, (Integer) null, 9);
            AnonymousClass00H r02 = createCallLinkBottomSheet.A0K;
            if (r02 != null) {
                AnonymousClass1VQ.A07(createCallLinkBottomSheet.A14(), (AnonymousClass1VQ) ((AnonymousClass1VP) r02.get()), r7.A06, "skip_lobby_join_call_link", 16, r7.A00());
                createCallLinkBottomSheet.A28();
                return;
            }
            C18070vi.A11("callsManager");
            throw null;
        }
        C18070vi.A11("preCallCallsTabLoggerLazy");
        throw null;
    }

    public static final void A04(CreateCallLinkBottomSheet createCallLinkBottomSheet, C1417476u r10) {
        AnonymousClass00H r0 = createCallLinkBottomSheet.A0N;
        if (r0 != null) {
            C192539oZ r3 = (C192539oZ) C18070vi.A0E(r0);
            boolean A002 = r10.A00();
            int i = 31;
            if (A002) {
                i = 16;
            }
            r3.A01(25, (Integer) null, i);
            AnonymousClass00H r02 = createCallLinkBottomSheet.A0I;
            if (r02 != null) {
                ((AnonymousClass1L9) r02.get()).A08(createCallLinkBottomSheet.A14(), AnonymousClass74H.A00(createCallLinkBottomSheet.A14(), C108995ce.A0Y(r10.A05, AnonymousClass3MY.A0n(createCallLinkBottomSheet, r10.A02), new Object[1], 0, 1), createCallLinkBottomSheet.A1H(2131887683), 1, A002));
                return;
            }
            C18070vi.A11("activityUtils");
            throw null;
        }
        C18070vi.A11("preCallCallsTabLoggerLazy");
        throw null;
    }

    public static final void A05(CreateCallLinkBottomSheet createCallLinkBottomSheet, String str, int i) {
        WDSButton wDSButton = createCallLinkBottomSheet.A0H;
        if (wDSButton != null) {
            wDSButton.setText(str);
            wDSButton.setIcon(i);
            C1417476u r1 = createCallLinkBottomSheet.A0A;
            boolean z = false;
            if (r1 != null) {
                z = C108975cc.A1B(r1.A03);
            }
            wDSButton.setEnabled(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r0 = "globalUI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet r6, java.lang.String r7, boolean r8) {
        /*
            java.lang.String r4 = "CreateCallLinkBottomSheet/copylink/npe"
            X.11C r0 = r6.A0D
            if (r0 == 0) goto L_0x0066
            android.content.ClipboardManager r5 = r0.A09()
            r3 = 0
            if (r5 != 0) goto L_0x0018
            X.1KB r1 = r6.A04
            if (r1 == 0) goto L_0x0063
        L_0x0011:
            r0 = 2131897878(0x7f122e16, float:1.9430658E38)
            r1.A08(r0, r3)
        L_0x0017:
            return
        L_0x0018:
            if (r7 == 0) goto L_0x0017
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0017
            X.0vl r0 = r6.A0W     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            boolean r2 = X.C72453Mb.A1a(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            r1 = 1
            r0 = 1
            if (r2 == 0) goto L_0x002b
            r0 = 6
        L_0x002b:
            r2 = 0
            X.62u r1 = X.AnonymousClass74H.A02(r2, r1, r0, r8)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            X.00H r0 = r6.A0J     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r0.get()     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            X.A4u r0 = (X.A4u) r0     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            r0.A03(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r7, r7)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            r5.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            X.1KB r1 = r6.A04     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            if (r1 == 0) goto L_0x004f
            r0 = 2131891618(0x7f1215a2, float:1.9417961E38)
            r1.A08(r0, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            goto L_0x0062
        L_0x004f:
            X.AnonymousClass3MW.A1C()     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            throw r2     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
        L_0x0053:
            java.lang.String r0 = "callingWamEventHelperLazy"
            X.C18070vi.A11(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
            throw r2     // Catch:{ NullPointerException | SecurityException -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            X.1KB r1 = r6.A04
            if (r1 == 0) goto L_0x0063
            goto L_0x0011
        L_0x0062:
            return
        L_0x0063:
            java.lang.String r0 = "globalUI"
            goto L_0x0068
        L_0x0066:
            java.lang.String r0 = "systemServices"
        L_0x0068:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet.A06(com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet, java.lang.String, boolean):void");
    }

    public static final void A07(CreateCallLinkBottomSheet createCallLinkBottomSheet, boolean z) {
        if (!C72453Mb.A1a(createCallLinkBottomSheet.A0W)) {
            int i = 2131231623;
            if (z) {
                i = 2131232407;
            }
            boolean A1a = C72453Mb.A1a(createCallLinkBottomSheet.A0Y);
            Resources A092 = AnonymousClass3MZ.A09(createCallLinkBottomSheet);
            if (A1a) {
                A05(createCallLinkBottomSheet, AnonymousClass3MY.A0m(A092, 2131887655), i);
                createCallLinkBottomSheet.A08(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(createCallLinkBottomSheet), 2131887684), 2131232294);
                return;
            }
            A05(createCallLinkBottomSheet, AnonymousClass3MY.A0m(A092, 2131887684), 2131232294);
            createCallLinkBottomSheet.A08(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(createCallLinkBottomSheet), 2131887655), i);
        } else if (!C22971Dz.A0d((Jid) createCallLinkBottomSheet.A0V.getValue())) {
            A05(createCallLinkBottomSheet, AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(createCallLinkBottomSheet), 2131887648), 2131232506);
        } else {
            C37581pm A0G2 = AnonymousClass3MZ.A0G(createCallLinkBottomSheet);
            C18600wl r2 = createCallLinkBottomSheet.A0R;
            if (r2 != null) {
                AnonymousClass3MW.A1X(r2, new CreateCallLinkBottomSheet$setButtonText$1(createCallLinkBottomSheet, (C30391dr) null), A0G2);
            } else {
                C18070vi.A11("latencySensitiveDispatcher");
                throw null;
            }
        }
    }

    private final void A08(String str, int i) {
        WDSButton wDSButton;
        C28931bI r0 = this.A0G;
        if (r0 != null && (wDSButton = (WDSButton) r0.A02()) != null) {
            wDSButton.setText(str);
            wDSButton.setIcon(i);
            C1417476u r1 = this.A0A;
            boolean z = false;
            if (r1 != null) {
                z = C108975cc.A1B(r1.A03);
            }
            wDSButton.setEnabled(z);
        }
    }

    public CreateCallLinkBottomSheet() {
        super(2131625020);
        this.A00 = false;
        C148917iD r1 = new C148917iD(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C148927iE(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CallLinkViewModel.class);
        this.A0U = C99274sY.A00(new C148937iF(A002), new C155327sZ(this, A002), new C155317sY(A002), A15);
        C148977iJ r5 = new C148977iJ(this);
        C18100vl A003 = AnonymousClass1DF.A00(num, new C148957iH(new C148947iG(this)));
        this.A0a = C99274sY.A00(new C148967iI(A003), r5, new C155337sa(A003), AnonymousClass3MW.A15(AnonymousClass3TA.class));
        this.A0V = AnonymousClass1DF.A00(num, new C148867i8(this));
        this.A0W = AnonymousClass1DF.A00(num, new C148877i9(this));
        this.A0X = AnonymousClass1DF.A00(num, new C148887iA(this));
        this.A0Y = AnonymousClass1DF.A00(num, new C148897iB(this));
        this.A0Z = AnonymousClass1DF.A00(num, new C148907iC(this));
    }

    public void A1s() {
        super.A1s();
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
        this.A0H = null;
        this.A0G = null;
        this.A07 = null;
        this.A08 = null;
        this.A01 = null;
        this.A0T = null;
        this.A00 = null;
    }
}
