package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1DD;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QO;
import X.AnonymousClass1R2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48m;
import X.AnonymousClass4ML;
import X.AnonymousClass4PH;
import X.C000200d;
import X.C115095tO;
import X.C1179361n;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C194859sP;
import X.C19880zA;
import X.C19890zB;
import X.C22941Dw;
import X.C22971Dz;
import X.C23191Fb;
import X.C27691Xc;
import X.C30911ei;
import X.C30921ej;
import X.C62762rw;
import X.C63572tK;
import X.C72453Mb;
import X.C72473Md;
import X.C77903rl;
import X.C81613zW;
import X.C85754Op;
import X.C87544Vz;
import X.C88184Yq;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.text.CondensedTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ConversationAttachmentContentView extends ScrollView implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public LinearLayout A07;
    public C19880zA A08;
    public AnonymousClass1KB A09;
    public AnonymousClass11S A0A;
    public AnonymousClass4PH A0B;
    public ConversationCommunityViewModel A0C;
    public C115095tO A0D;
    public C88184Yq A0E;
    public AnonymousClass1CJ A0F;
    public C18030ve A0G;
    public AnonymousClass1BI A0H;
    public AnonymousClass1QJ A0I;
    public AnonymousClass1QO A0J;
    public C30921ej A0K;
    public C85754Op A0L;
    public AnonymousClass1R2 A0M;
    public AnonymousClass1DC A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass031 A0S;
    public boolean A0T;
    public boolean A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public boolean A0Y;
    public final LinkedHashMap A0Z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bb, code lost:
        r4.setColorFilter(X.AnonymousClass3MY.A02(r13, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c2, code lost:
        r4.setImportantForAccessibility(2);
        r17.setText(r8);
        r5.setId(r7);
        r4.setOnClickListener(r12);
        r5.setOnClickListener(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d3, code lost:
        if (r10 == null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d5, code lost:
        r4.setOnLongClickListener(r10);
        r5.setOnLongClickListener(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02db, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02dc, code lost:
        r15 = X.AnonymousClass3MZ.A02(getContext(), getContext(), 2130968692, 2131099739);
        r3 = X.C19740yt.A00(getContext(), 2131099783);
        r2 = new android.graphics.drawable.GradientDrawable();
        r2.setColor(r15);
        r2.setShape(0);
        r2.setGradientType(2);
        r2.setGradientCenter(-1.0f, 0.5f);
        r2.setCornerRadius(X.AnonymousClass3MW.A00(getResources(), 2131165371) / 4.0f);
        r2.setStroke(1, r3);
        r0 = X.AnonymousClass4aX.A09(getContext(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032c, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0333, code lost:
        r13.A08.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r5 = r13.A0M;
        r3 = X.C72473Md.A06(r13);
        r1 = getContext();
        r0 = r13.A0I.A01();
        r0.getClass();
        r6 = r5.A0M(r1, r0, r3, 2131169443);
        r0 = r13.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x033e, code lost:
        throw X.AnonymousClass000.A0s("getAttachQuickReplyIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033f, code lost:
        r13.A08.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x034a, code lost:
        throw X.AnonymousClass000.A0s("getAttachShopIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r0 == 2) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        r1 = 2131099768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r0 != 4) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        r1 = 2131099766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r0 == 2) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r2 = 2131099769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r0 != 4) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r2 = 2131099767;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r0 == 2) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r9 = 2131099769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r0 != 4) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r9 = 2131099765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        r12 = new X.AnonymousClass48m(r13, 31);
        r10 = null;
        r8 = 2131893596;
        r7 = 2131433823;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r1.equals("gallery") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r3 = 2131232193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r13.A0U == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        r3 = 2131231695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        r1 = 2131099752;
        r2 = 2131099753;
        r9 = 2131099754;
        r8 = 2131886762;
        r7 = 2131433819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r18 = true;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e3, code lost:
        if (r1.equals("calllink") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        r3 = 2131231690;
        r1 = 2131099740;
        r2 = 2131099741;
        r9 = 2131099742;
        r8 = 2131888969;
        r7 = 2131433814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        if (r1.equals("poll") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        r3 = 2131231697;
        r1 = 2131099774;
        r2 = 2131099775;
        r9 = 2131099776;
        r8 = 2131886763;
        r7 = 2131433825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r1.equals("shop") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
        if (r1.equals("audio") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
        r3 = 2131231689;
        r1 = 2131099736;
        r2 = 2131099737;
        r9 = 2131099738;
        r8 = 2131886756;
        r7 = 2131433813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0152, code lost:
        if (r1.equals("event") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0156, code lost:
        r3 = 2131231694;
        r1 = 2131099743;
        r2 = 2131099744;
        r9 = 2131103310;
        r8 = 2131886760;
        r7 = 2131433818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d3, code lost:
        r18 = false;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f1, code lost:
        r18 = false;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
        r12 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r1.equals("quick reply") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0217, code lost:
        r6 = X.AnonymousClass000.A0Y(r13).getDrawable(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021f, code lost:
        r4 = X.AnonymousClass3MZ.A0D(r13);
        r0 = 2131624708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0228, code lost:
        if (r13.A0U == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022a, code lost:
        r0 = 2131624710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022d, code lost:
        r5 = X.AnonymousClass3MX.A09(r4, r20, r0);
        r4 = X.AnonymousClass3MW.A0G(r5, 2131431496);
        r17 = X.AnonymousClass3MW.A0J(r5, 2131436044);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0241, code lost:
        if (r18 == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0243, code lost:
        r3 = getResources().getDimensionPixelSize(2131165371);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0250, code lost:
        if (r13.A0U != false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0252, code lost:
        r1 = X.AnonymousClass3MY.A02(r13, r1);
        r15 = X.AnonymousClass3MY.A02(r13, r2);
        r1 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{r1, r15});
        r1.setShape(1);
        r1.setGradientType(2);
        r1.setGradientCenter(-1.0f, 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0276, code lost:
        if (r3 <= 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0278, code lost:
        r1.setSize(r3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027b, code lost:
        if (r18 == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0281, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0283, code lost:
        r2 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
        r2.getPaint().setColor(r15);
        r1 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r1, r2});
        r0 = r3 / 4;
        r1.setLayerSize(1, r0, r0);
        r1.setLayerGravity(1, 17);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a9, code lost:
        r0 = X.AnonymousClass4aX.A09(getContext(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        r4.setBackground(r0);
        r4.setImageDrawable(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b9, code lost:
        if (r13.A0U == false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r1.equals("payment") == false) goto L_0x001f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View A00(android.widget.LinearLayout r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = 3
            X.48i r5 = new X.48i
            r13 = r19
            r1 = r21
            r5.<init>(r0, r1, r13)
            r4 = 4
            X.48i r12 = new X.48i
            r12.<init>(r4, r1, r13)
            r14 = 1
            X.4dl r6 = new X.4dl
            r6.<init>(r14, r1, r13)
            int r0 = r1.hashCode()
            r11 = 2
            r2 = -1
            switch(r0) {
                case -1367751899: goto L_0x00be;
                case -1275762953: goto L_0x0032;
                case -786681338: goto L_0x003b;
                case -309474065: goto L_0x0090;
                case -196315310: goto L_0x009a;
                case -171914408: goto L_0x00dd;
                case 111007: goto L_0x00fb;
                case 3446719: goto L_0x0106;
                case 3529462: goto L_0x0124;
                case 93166550: goto L_0x012e;
                case 96891546: goto L_0x014c;
                case 106006350: goto L_0x0169;
                case 861720859: goto L_0x0175;
                case 951526432: goto L_0x0197;
                case 1566438421: goto L_0x01b2;
                case 1901043637: goto L_0x01d7;
                default: goto L_0x001f;
            }
        L_0x001f:
            r10 = 0
            switch(r2) {
                case 1: goto L_0x0333;
                case 2: goto L_0x0044;
                case 3: goto L_0x0031;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00e7;
                case 6: goto L_0x01f6;
                case 7: goto L_0x0110;
                case 8: goto L_0x033f;
                case 9: goto L_0x0138;
                case 10: goto L_0x0156;
                case 11: goto L_0x032f;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConversationAttachmentContentHelper Icon not mapped properly "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r2)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0031:
            return r10
        L_0x0032:
            java.lang.String r0 = "quick reply"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0333
            goto L_0x001f
        L_0x003b:
            java.lang.String r0 = "payment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x001f
        L_0x0044:
            X.1R2 r5 = r13.A0M
            int r3 = X.C72473Md.A06(r13)
            r2 = 2131169443(0x7f0710a3, float:1.7953216E38)
            android.content.Context r1 = r13.getContext()
            X.1QJ r0 = r13.A0I
            X.1KJ r0 = r0.A01()
            r0.getClass()
            X.26n r6 = r5.A0M(r1, r0, r3, r2)
            int r0 = r13.A05
            if (r0 == r11) goto L_0x0067
            r1 = 2131099768(0x7f060078, float:1.7811899E38)
            if (r0 != r4) goto L_0x006a
        L_0x0067:
            r1 = 2131099766(0x7f060076, float:1.7811894E38)
        L_0x006a:
            if (r0 == r11) goto L_0x0071
            r2 = 2131099769(0x7f060079, float:1.78119E38)
            if (r0 != r4) goto L_0x0074
        L_0x0071:
            r2 = 2131099767(0x7f060077, float:1.7811897E38)
        L_0x0074:
            if (r0 == r11) goto L_0x007b
            r9 = 2131099769(0x7f060079, float:1.78119E38)
            if (r0 != r4) goto L_0x007e
        L_0x007b:
            r9 = 2131099765(0x7f060075, float:1.7811892E38)
        L_0x007e:
            r0 = 31
            X.48m r12 = new X.48m
            r12.<init>(r13, r0)
            r10 = 0
            r8 = 2131893596(0x7f121d5c, float:1.9421973E38)
            r7 = 2131433823(0x7f0b195f, float:1.8489443E38)
            r18 = 0
            goto L_0x021f
        L_0x0090:
            java.lang.String r0 = "product"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 3
            goto L_0x001f
        L_0x009a:
            java.lang.String r0 = "gallery"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a4
            goto L_0x001f
        L_0x00a4:
            boolean r0 = r13.A0U
            r3 = 2131232193(0x7f0805c1, float:1.8080488E38)
            if (r0 == 0) goto L_0x00ae
            r3 = 2131231695(0x7f0803cf, float:1.8079478E38)
        L_0x00ae:
            r1 = 2131099752(0x7f060068, float:1.7811866E38)
            r2 = 2131099753(0x7f060069, float:1.7811868E38)
            r9 = 2131099754(0x7f06006a, float:1.781187E38)
            r8 = 2131886762(0x7f1202aa, float:1.9408112E38)
            r7 = 2131433819(0x7f0b195b, float:1.8489434E38)
            goto L_0x00d8
        L_0x00be:
            java.lang.String r0 = "camera"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r3 = 2131231691(0x7f0803cb, float:1.807947E38)
            r1 = 2131099743(0x7f06005f, float:1.7811848E38)
            r2 = 2131099744(0x7f060060, float:1.781185E38)
            r9 = 2131099745(0x7f060061, float:1.7811852E38)
            r8 = 2131886757(0x7f1202a5, float:1.9408102E38)
            r7 = 2131433815(0x7f0b1957, float:1.8489426E38)
        L_0x00d8:
            r18 = 1
            r10 = r6
            goto L_0x01f4
        L_0x00dd:
            java.lang.String r0 = "calllink"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e7
            goto L_0x001f
        L_0x00e7:
            r3 = 2131231690(0x7f0803ca, float:1.8079468E38)
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            r2 = 2131099741(0x7f06005d, float:1.7811844E38)
            r9 = 2131099742(0x7f06005e, float:1.7811846E38)
            r8 = 2131888969(0x7f120b49, float:1.9412588E38)
            r7 = 2131433814(0x7f0b1956, float:1.8489424E38)
            goto L_0x01d3
        L_0x00fb:
            java.lang.String r0 = "pix"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 6
            goto L_0x001f
        L_0x0106:
            java.lang.String r0 = "poll"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x001f
        L_0x0110:
            r3 = 2131231697(0x7f0803d1, float:1.8079482E38)
            r1 = 2131099774(0x7f06007e, float:1.781191E38)
            r2 = 2131099775(0x7f06007f, float:1.7811913E38)
            r9 = 2131099776(0x7f060080, float:1.7811915E38)
            r8 = 2131886763(0x7f1202ab, float:1.9408114E38)
            r7 = 2131433825(0x7f0b1961, float:1.8489447E38)
            goto L_0x01f1
        L_0x0124:
            java.lang.String r0 = "shop"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x033f
            goto L_0x001f
        L_0x012e:
            java.lang.String r0 = "audio"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0138
            goto L_0x001f
        L_0x0138:
            r3 = 2131231689(0x7f0803c9, float:1.8079466E38)
            r1 = 2131099736(0x7f060058, float:1.7811834E38)
            r2 = 2131099737(0x7f060059, float:1.7811836E38)
            r9 = 2131099738(0x7f06005a, float:1.7811838E38)
            r8 = 2131886756(0x7f1202a4, float:1.94081E38)
            r7 = 2131433813(0x7f0b1955, float:1.8489422E38)
            goto L_0x01f1
        L_0x014c:
            java.lang.String r0 = "event"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0156
            goto L_0x001f
        L_0x0156:
            r3 = 2131231694(0x7f0803ce, float:1.8079476E38)
            r1 = 2131099743(0x7f06005f, float:1.7811848E38)
            r2 = 2131099744(0x7f060060, float:1.781185E38)
            r9 = 2131103310(0x7f060e4e, float:1.7819083E38)
            r8 = 2131886760(0x7f1202a8, float:1.9408108E38)
            r7 = 2131433818(0x7f0b195a, float:1.8489432E38)
            goto L_0x01d3
        L_0x0169:
            java.lang.String r0 = "order"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 11
            goto L_0x001f
        L_0x0175:
            java.lang.String r0 = "document"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.A0U
            r3 = 2131231870(0x7f08047e, float:1.8079833E38)
            if (r0 == 0) goto L_0x0187
            r3 = 2131231693(0x7f0803cd, float:1.8079474E38)
        L_0x0187:
            r1 = 2131099749(0x7f060065, float:1.781186E38)
            r2 = 2131099750(0x7f060066, float:1.7811862E38)
            r9 = 2131099751(0x7f060067, float:1.7811864E38)
            r8 = 2131886759(0x7f1202a7, float:1.9408106E38)
            r7 = 2131433817(0x7f0b1959, float:1.848943E38)
            goto L_0x01f1
        L_0x0197:
            java.lang.String r0 = "contact"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r3 = 2131231692(0x7f0803cc, float:1.8079472E38)
            r1 = 2131099746(0x7f060062, float:1.7811854E38)
            r2 = 2131099747(0x7f060063, float:1.7811856E38)
            r9 = 2131099748(0x7f060064, float:1.7811858E38)
            r8 = 2131886758(0x7f1202a6, float:1.9408104E38)
            r7 = 2131433816(0x7f0b1958, float:1.8489428E38)
            goto L_0x01f1
        L_0x01b2:
            java.lang.String r0 = "imagine sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.A0U
            r9 = 2131099755(0x7f06006b, float:1.7811872E38)
            if (r0 == 0) goto L_0x01c4
            r9 = 2131099756(0x7f06006c, float:1.7811874E38)
        L_0x01c4:
            r3 = 2131233192(0x7f0809a8, float:1.8082515E38)
            r1 = 2131099757(0x7f06006d, float:1.7811876E38)
            r2 = 2131099758(0x7f06006e, float:1.7811878E38)
            r8 = 2131898951(0x7f123247, float:1.9432834E38)
            r7 = 2131433820(0x7f0b195c, float:1.8489436E38)
        L_0x01d3:
            r18 = 0
            r10 = 0
            goto L_0x0217
        L_0x01d7:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r3 = 2131232058(0x7f08053a, float:1.8080215E38)
            r1 = 2131099759(0x7f06006f, float:1.781188E38)
            r2 = 2131099760(0x7f060070, float:1.7811882E38)
            r9 = 2131099761(0x7f060071, float:1.7811884E38)
            r8 = 2131894251(0x7f121feb, float:1.9423301E38)
            r7 = 2131433821(0x7f0b195d, float:1.8489439E38)
        L_0x01f1:
            r18 = 0
            r10 = 0
        L_0x01f4:
            r12 = r5
            goto L_0x0217
        L_0x01f6:
            boolean r0 = r13.A09()
            if (r0 == 0) goto L_0x0031
            r3 = 2131231696(0x7f0803d0, float:1.807948E38)
            r1 = 2131099766(0x7f060076, float:1.7811894E38)
            r2 = 2131099767(0x7f060077, float:1.7811897E38)
            r9 = 2131099764(0x7f060074, float:1.781189E38)
            r8 = 2131893593(0x7f121d59, float:1.9421967E38)
            r7 = 2131433824(0x7f0b1960, float:1.8489445E38)
            r0 = 32
            X.48m r12 = new X.48m
            r12.<init>(r13, r0)
            r18 = 0
        L_0x0217:
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r13)
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r3)
        L_0x021f:
            android.view.LayoutInflater r4 = X.AnonymousClass3MZ.A0D(r13)
            boolean r3 = r13.A0U
            r0 = 2131624708(0x7f0e0304, float:1.8876603E38)
            if (r3 == 0) goto L_0x022d
            r0 = 2131624710(0x7f0e0306, float:1.8876607E38)
        L_0x022d:
            r3 = r20
            android.view.View r5 = X.AnonymousClass3MX.A09(r4, r3, r0)
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.widget.ImageView r4 = X.AnonymousClass3MW.A0G(r5, r0)
            r0 = 2131436044(0x7f0b220c, float:1.8493947E38)
            android.widget.TextView r17 = X.AnonymousClass3MW.A0J(r5, r0)
            if (r18 == 0) goto L_0x032c
            android.content.res.Resources r3 = r13.getResources()
            r0 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r3 = r3.getDimensionPixelSize(r0)
        L_0x024e:
            boolean r0 = r13.A0U
            if (r0 != 0) goto L_0x02dc
            int r1 = X.AnonymousClass3MY.A02(r13, r1)
            int r15 = X.AnonymousClass3MY.A02(r13, r2)
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r0 = new int[r11]
            r16 = 0
            r0[r16] = r1
            r0[r14] = r15
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>(r2, r0)
            r1.setShape(r14)
            r1.setGradientType(r11)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.setGradientCenter(r0, r2)
            if (r3 <= 0) goto L_0x027b
            r1.setSize(r3, r3)
        L_0x027b:
            if (r18 == 0) goto L_0x02a9
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 < r0) goto L_0x02a9
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r2.<init>(r0)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setColor(r15)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r11]
            r0[r16] = r1
            r0[r14] = r2
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
            int r0 = r3 / 4
            r1.setLayerSize(r14, r0, r0)
            r0 = 17
            r1.setLayerGravity(r14, r0)
        L_0x02a9:
            android.content.Context r0 = r13.getContext()
            android.graphics.drawable.RippleDrawable r0 = X.AnonymousClass4aX.A09(r0, r1)
        L_0x02b1:
            r4.setBackground(r0)
            r4.setImageDrawable(r6)
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x02c2
            int r0 = X.AnonymousClass3MY.A02(r13, r9)
            r4.setColorFilter(r0)
        L_0x02c2:
            r4.setImportantForAccessibility(r11)
            r0 = r17
            r0.setText(r8)
            r5.setId(r7)
            r4.setOnClickListener(r12)
            r5.setOnClickListener(r12)
            if (r10 == 0) goto L_0x02db
            r4.setOnLongClickListener(r10)
            r5.setOnLongClickListener(r10)
        L_0x02db:
            return r5
        L_0x02dc:
            android.content.Context r3 = r13.getContext()
            android.content.Context r2 = r13.getContext()
            r1 = 2130968692(0x7f040074, float:1.7546045E38)
            r0 = 2131099739(0x7f06005b, float:1.781184E38)
            int r15 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.content.Context r1 = r13.getContext()
            r0 = 2131099783(0x7f060087, float:1.7811929E38)
            int r3 = X.C19740yt.A00(r1, r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setColor(r15)
            r0 = 0
            r2.setShape(r0)
            r2.setGradientType(r11)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.setGradientCenter(r1, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            r2.setCornerRadius(r1)
            r2.setStroke(r14, r3)
            android.content.Context r0 = r13.getContext()
            android.graphics.drawable.RippleDrawable r0 = X.AnonymousClass4aX.A09(r0, r2)
            goto L_0x02b1
        L_0x032c:
            r3 = 0
            goto L_0x024e
        L_0x032f:
            r13.A09()
            return r10
        L_0x0333:
            X.0zA r0 = r13.A08
            r0.A03()
            java.lang.String r0 = "getAttachQuickReplyIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x033f:
            X.0zA r0 = r13.A08
            r0.A03()
            java.lang.String r0 = "getAttachShopIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A00(android.widget.LinearLayout, java.lang.String):android.view.View");
    }

    public void A0G(int i, boolean z) {
        int[] iArr;
        long j;
        int[][] iArr2 = new int[3][];
        int[] iArr3 = {6, 0, 0, 0};
        if (z) {
            // fill-array-data instruction
            iArr3[0] = 2;
            iArr3[1] = 3;
            iArr3[2] = 6;
            iArr3[3] = 8;
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{6, 0, 0, 0};
        } else {
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{2, 3, 6, 8};
        }
        iArr2[2] = iArr;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A0i = C17890vO.A0i(this.A0Z);
        while (A0i.hasNext()) {
            A13.add(C17890vO.A0P(A0i));
        }
        int i2 = 0;
        int i3 = 0;
        do {
            int[] iArr4 = iArr2[i2];
            for (int i4 = 0; i4 < iArr4.length; i4++) {
                if (i4 < getNumberOfColumns() && i3 < A13.size()) {
                    View view = (View) A13.get(i3);
                    int i5 = iArr4[i4];
                    AnimationSet animationSet = new AnimationSet(true);
                    float f = 0.0f;
                    if (z) {
                        f = 1.0f;
                    }
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, f));
                    animationSet.setInterpolator(new OvershootInterpolator(1.0f));
                    animationSet.setDuration(300);
                    if (i5 == 0) {
                        j = 0;
                    } else {
                        j = (long) (i / i5);
                    }
                    animationSet.setStartOffset(j);
                    view.startAnimation(animationSet);
                    i3++;
                }
            }
            i2++;
        } while (i2 < 3);
    }

    private ArrayList A02() {
        boolean A052;
        if (this.A0U) {
            return A03();
        }
        ArrayList A13 = AnonymousClass000.A13();
        boolean A082 = A08();
        boolean A0A2 = A0A();
        if (C22971Dz.A0S(this.A0H)) {
            A052 = false;
        } else {
            A052 = AnonymousClass3MW.A0d(this.A0P).A05(this.A0H);
        }
        boolean A072 = A07();
        boolean A092 = A09();
        if (C22971Dz.A0V(this.A0H)) {
            this.A0Q.get();
        } else {
            A13.add("document");
        }
        if (this.A0N.BcY()) {
            A13.add("camera");
        }
        A13.add("gallery");
        if (A05()) {
            A13.add("audio");
        }
        A09();
        if (A092) {
            A13.add("pix");
        }
        if (A06()) {
            A13.add("location");
        }
        if (A082) {
            A13.add("payment");
        }
        AnonymousClass1BI r1 = this.A0H;
        if (!C22971Dz.A0S(r1)) {
            if (C22971Dz.A0V(r1)) {
                this.A0Q.get();
            } else {
                A13.add("contact");
            }
        }
        if (A0A2) {
            A13.add("poll");
        }
        if (A052) {
            A13.add("event");
        }
        C18030ve r3 = this.A0G;
        A13.size();
        if (!C22971Dz.A0V(this.A0H) && C18020vd.A05(C18040vf.A02, r3, 10698)) {
            A13.add("calllink");
        }
        if (!A072) {
            return A13;
        }
        A13.add("imagine sheet");
        return A13;
    }

    private boolean A05() {
        if (!C22971Dz.A0V(this.A0H)) {
            return true;
        }
        AnonymousClass4ML r3 = (AnonymousClass4ML) this.A0Q.get();
        if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MY.A0W(r3.A00), 6505) || !((C1179361n) r3.A01.get()).A03(2)) {
            return false;
        }
        return true;
    }

    private boolean A06() {
        if (!C72453Mb.A1a(((AnonymousClass1DD) this.A0N).A05)) {
            return false;
        }
        AnonymousClass1BI r1 = this.A0H;
        if (C22971Dz.A0S(r1)) {
            return false;
        }
        if (!C22971Dz.A0V(r1)) {
            return true;
        }
        this.A0Q.get();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (X.C22971Dz.A0V(r1) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (X.C22971Dz.A0d(r1) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A07() {
        /*
            r4 = this;
            boolean r0 = r4.A0T
            r3 = 0
            if (r0 != 0) goto L_0x0034
            X.1BI r1 = r4.A0H
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x0014
            boolean r0 = X.C22971Dz.A0d(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 != 0) goto L_0x0022
            boolean r1 = X.C22971Dz.A0V(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            X.00H r0 = r4.A0O
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0034
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A07():boolean");
    }

    private boolean A08() {
        if (!C22971Dz.A0S(this.A0H) && !A09()) {
            this.A05 = this.A0M.A0H(this.A0H);
            if (this.A0M.A0h(getContext(), C22941Dw.A00(this.A0H), this.A05)) {
                if (C22971Dz.A0V(this.A0H)) {
                    this.A0Q.get();
                } else if (!this.A0A.A0N()) {
                    C18030ve r1 = this.A0G;
                    C18070vi.A0d(r1, 0);
                    r1.A0N(4925);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A09() {
        C30911ei A002 = this.A0K.A00();
        if (A002 == null) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, A002.A00, 12355)) {
            return false;
        }
        String A062 = this.A0J.A06(this.A0H);
        AnonymousClass1BI r1 = this.A0H;
        if (C22971Dz.A0S(r1) || C22971Dz.A0e(r1) || C22971Dz.A0O(r1)) {
            return false;
        }
        C63572tK r0 = C63572tK.A0E;
        if ("BR".equals(A062)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r0.intValue() < r1) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0A() {
        /*
            r5 = this;
            X.1BI r1 = r5.A0H
            boolean r0 = X.C22971Dz.A0S(r1)
            r3 = 0
            if (r0 != 0) goto L_0x0087
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x0045
            X.00H r0 = r5.A0Q
            java.lang.Object r4 = r0.get()
            X.4ML r4 = (X.AnonymousClass4ML) r4
            X.00H r0 = r4.A00
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 5533(0x159d, float:7.753E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0087
            X.00H r2 = r4.A01
            java.lang.Object r1 = r2.get()
            X.61n r1 = (X.C1179361n) r1
            r0 = 66
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.get()
            X.61n r1 = (X.C1179361n) r1
            r0 = 67
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0087
        L_0x0045:
            X.1BI r1 = r5.A0H
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x008d
            X.1CJ r0 = r5.A0F
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 3
            if (r1 != r0) goto L_0x0086
            X.0ve r1 = r5.A0G
            X.C18070vi.A0d(r1, r3)
            r0 = 2738(0xab2, float:3.837E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x008d
            X.0ve r1 = r5.A0G
            r0 = 5056(0x13c0, float:7.085E-42)
            int r1 = X.C18020vd.A00(r2, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0086
            com.whatsapp.community.ConversationCommunityViewModel r0 = r5.A0C
            if (r0 == 0) goto L_0x008d
            android.util.Pair r0 = r0.A00
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0088
            int r0 = r0.intValue()
            if (r0 >= r1) goto L_0x008d
        L_0x0086:
            r3 = 1
        L_0x0087:
            return r3
        L_0x0088:
            java.lang.String r0 = "conversationCommunityViewModel/missing-cag-participant-count"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x008d:
            X.1BI r1 = r5.A0H
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x00ab
            X.0ve r2 = r5.A0G
            r1 = 2663(0xa67, float:3.732E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0087
        L_0x00ab:
            X.0ve r2 = r5.A0G
            X.C18070vi.A0d(r2, r3)
            r1 = 2194(0x892, float:3.074E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0087
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A0A():boolean");
    }

    /* access modifiers changed from: private */
    public Integer getActionThreadType() {
        int A052;
        AnonymousClass1BI r1 = this.A0H;
        if (C22971Dz.A0e(r1)) {
            A052 = 1;
        } else if (!C22971Dz.A0d(r1)) {
            return null;
        } else {
            A052 = C72453Mb.A05(this.A0A.A0O(r1) ? 1 : 0);
        }
        return Integer.valueOf(A052);
    }

    private int getColumnsCountV2() {
        if (this.A00 == 2) {
            return (int) Math.ceil((double) (((float) A03().size()) / 2.0f));
        }
        Point currentConversationViewSize = getCurrentConversationViewSize();
        return Math.min((currentConversationViewSize.x - getMinMarginSize()) / getIconSize(), 4);
    }

    private String getCommerceAttachmentType() {
        return "product";
    }

    private int getIconSize() {
        boolean z = this.A0U;
        Resources resources = getResources();
        int i = 2131168409;
        if (z) {
            i = 2131166167;
        }
        return resources.getDimensionPixelSize(i);
    }

    private View.OnClickListener getListenerToHandleOrderDisableState() {
        return new AnonymousClass48m(this, 33);
    }

    public void A0D() {
        int numberOfColumns;
        boolean z = this.A0U;
        this.A07.removeAllViews();
        if (z) {
            LinkedHashMap linkedHashMap = this.A0Z;
            linkedHashMap.clear();
            C77903rl r7 = new C77903rl(getContext(), this);
            r7.A01 = 0;
            r7.A00 = 0;
            this.A07.addView(r7);
            ArrayList A022 = A02();
            int columnsCountV2 = getColumnsCountV2();
            int ceil = (int) Math.ceil(((double) A022.size()) / ((double) columnsCountV2));
            Resources resources = getResources();
            int i = 2131165374;
            if (ceil > 2) {
                i = 2131165377;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            Resources resources2 = getResources();
            int i2 = 2131165373;
            if (columnsCountV2 > 3) {
                i2 = 2131165375;
            }
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
            Iterator it = A022.iterator();
            LinearLayout linearLayout = null;
            int i3 = 0;
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (i3 % columnsCountV2 == 0) {
                    if (i3 != 0) {
                        C77903rl.A00(this.A07, this, 0, dimensionPixelSize);
                    }
                    linearLayout = (LinearLayout) AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), this.A07, 2131624707);
                    this.A07.addView(linearLayout);
                } else {
                    C77903rl.A00(linearLayout, this, dimensionPixelSize2, 0);
                }
                View A002 = A00(linearLayout, A0v);
                if (A002 != null) {
                    linkedHashMap.put(A0v, A002);
                    linearLayout.addView(A002);
                    i3++;
                }
            }
            int i4 = 2131165382;
            if (ceil < 3) {
                i4 = 2131165381;
                C87544Vz.A01(this.A0G);
            }
            r7.A00 = AnonymousClass3Ma.A02(this, i4);
            C77903rl.A00(this.A07, this, 0, AnonymousClass3Ma.A02(this, i4));
            this.A0E.A04(this.A0H);
            ((C194859sP) this.A0R.get()).A02((Integer) null, (Integer) null, 28);
            return;
        }
        LinkedHashMap linkedHashMap2 = this.A0Z;
        linkedHashMap2.clear();
        ArrayList A023 = A02();
        if (this.A0U) {
            numberOfColumns = getColumnsCountV2();
        } else {
            numberOfColumns = getNumberOfColumns();
        }
        Iterator it2 = A023.iterator();
        LinearLayout linearLayout2 = null;
        int i5 = 0;
        while (it2.hasNext()) {
            String A0v2 = C17880vN.A0v(it2);
            if (i5 % numberOfColumns == 0) {
                linearLayout2 = (LinearLayout) AnonymousClass3MZ.A0D(this).inflate(2131624707, this.A07, false);
                C77903rl.A00(this.A07, this, 0, this.A03);
                this.A07.addView(linearLayout2);
            }
            View A003 = A00(linearLayout2, A0v2);
            if (A003 != null) {
                linkedHashMap2.put(A0v2, A003);
                linearLayout2.addView(A003);
                i5++;
            }
        }
        C77903rl.A00(this.A07, this, 0, this.A01);
        this.A0E.A04(this.A0H);
        ((C194859sP) this.A0R.get()).A02((Integer) null, (Integer) null, 28);
    }

    public void A0E() {
        Integer num;
        C88184Yq r3 = this.A0E;
        C81613zW r2 = r3.A01;
        if (r2 != null && (num = r2.A03) != null && num.intValue() == 1) {
            r2.A02 = C17880vN.A0j();
            C88184Yq.A00(r3);
            r3.A01();
        }
    }

    public void A0F() {
        if (!this.A0Y) {
            this.A0Y = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r2 = r1.A10;
            this.A0G = AnonymousClass10E.A8r(r2);
            this.A09 = AnonymousClass10E.A12(r2);
            this.A0A = AnonymousClass10E.A17(r2);
            this.A0F = AnonymousClass3Ma.A0d(r2);
            this.A08 = C19890zB.A00;
            this.A0M = (AnonymousClass1R2) r2.A8L.get();
            this.A0N = AnonymousClass3MZ.A13(r2);
            this.A0P = C000200d.A00(r2.A3m);
            this.A0J = AnonymousClass3Ma.A0q(r2);
            this.A0K = (C30921ej) r2.A8H.get();
            this.A0I = (AnonymousClass1QJ) r2.A8F.get();
            this.A0L = AnonymousClass1K1.A1R(r1.A0z);
            AnonymousClass10G r12 = r2.A00;
            this.A0B = (AnonymousClass4PH) r12.A8K.get();
            this.A0E = (C88184Yq) r12.A15.get();
            this.A0Q = C000200d.A00(r12.ADw);
            this.A0O = C000200d.A00(r2.A14);
            this.A0R = C000200d.A00(r2.A8X);
        }
    }

    public void A0H(ConversationCommunityViewModel conversationCommunityViewModel, C115095tO r6, AnonymousClass1BI r7, int i, boolean z) {
        this.A0H = r7;
        this.A0D = r6;
        this.A0C = conversationCommunityViewModel;
        this.A0T = z;
        C18030ve r3 = this.A0G;
        C18070vi.A0d(r3, 0);
        boolean z2 = false;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r3, 10753) || C18020vd.A05(r1, r3, 3223)) {
            z2 = true;
        }
        this.A0U = z2;
        this.A00 = i;
        A0D();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0S;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0S = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i4, i5);
        if (this.A0X != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            if (!this.A0U) {
                int childCount = this.A07.getChildCount();
                int i6 = this.A02;
                int i7 = i6 / 4;
                int i8 = i6 / 2;
                int i9 = (i6 * 4) / 5;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A07.getChildAt(i11);
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (childAt instanceof C77903rl) {
                        i12++;
                        measuredHeight2 = ((C77903rl) childAt).A00;
                        z = true;
                    } else {
                        z = false;
                    }
                    i13 += measuredHeight2;
                    if (i13 <= measuredHeight) {
                        i11++;
                        i14 = measuredHeight2;
                    } else if (i11 <= 2) {
                        int i15 = i7 / 2;
                        ((C77903rl) this.A07.getChildAt(0)).A00 = this.A01 / 2;
                        int i16 = childCount - 1;
                        ((C77903rl) this.A07.getChildAt(i16)).A00 = this.A01 / 2;
                        for (int i17 = 1; i17 < i16; i17++) {
                            if (this.A07.getChildAt(i17) instanceof C77903rl) {
                                ((C77903rl) this.A07.getChildAt(i17)).A00 = this.A03 / 2;
                            }
                        }
                        i10 = i15;
                    } else {
                        if (!z) {
                            int i18 = (measuredHeight - ((i7 + i13) - measuredHeight2)) / i12;
                            int i19 = (measuredHeight - ((i8 + i13) - measuredHeight2)) / i12;
                            i10 = (measuredHeight - ((i9 + i13) - measuredHeight2)) / i12;
                            if (Math.abs(i19) < Math.abs(i18)) {
                                i18 = i19;
                            }
                            if (Math.abs(i10) >= Math.abs(i18)) {
                                i10 = i18;
                            }
                            if (i11 == childCount - 2) {
                                i3 = ((measuredHeight - (i13 + ((C77903rl) this.A07.getChildAt(i11 + 1)).A00)) - i12) / (i12 + 1);
                            }
                        } else if (i11 == childCount - 1) {
                            i10 = (measuredHeight - i13) / i12;
                        } else {
                            int i20 = ((i11 + 1) - i12) * this.A02;
                            i10 = (measuredHeight - ((i7 + i13) / i12)) - i20;
                            i3 = (measuredHeight - (((i13 - i14) - measuredHeight2) + i9)) - i20;
                        }
                        if (Math.abs(i3) < Math.abs(i10)) {
                            i10 = i3;
                        }
                    }
                }
                this.A04 = i10;
            }
            this.A0X = getMeasuredHeight();
            super.onMeasure(i4, i5);
        }
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0F();
        this.A0Z = C17880vN.A13();
        A04();
    }

    private ArrayList A03() {
        boolean A052;
        ArrayList A13 = AnonymousClass000.A13();
        boolean A082 = A08();
        boolean A0A2 = A0A();
        if (C22971Dz.A0S(this.A0H)) {
            A052 = false;
        } else {
            A052 = AnonymousClass3MW.A0d(this.A0P).A05(this.A0H);
        }
        boolean A072 = A07();
        boolean A092 = A09();
        A13.add("gallery");
        if (this.A0N.BcY()) {
            A13.add("camera");
        }
        if (A06()) {
            A13.add("location");
        }
        AnonymousClass1BI r1 = this.A0H;
        if (!C22971Dz.A0S(r1)) {
            if (C22971Dz.A0V(r1)) {
                this.A0Q.get();
            } else {
                A13.add("contact");
            }
        }
        if (C22971Dz.A0V(this.A0H)) {
            this.A0Q.get();
        } else {
            A13.add("document");
        }
        if (A05()) {
            A13.add("audio");
        }
        if (A0A2) {
            A13.add("poll");
        }
        if (A082) {
            A13.add("payment");
        }
        A09();
        if (A092) {
            A13.add("pix");
        }
        if (A052) {
            A13.add("event");
        }
        C18030ve r3 = this.A0G;
        A13.size();
        if (!C22971Dz.A0V(this.A0H) && C18020vd.A05(C18040vf.A02, r3, 10698)) {
            A13.add("calllink");
        }
        if (A072) {
            A13.add("imagine sheet");
        }
        return A13;
    }

    private void A04() {
        this.A02 = getResources().getDimensionPixelSize(2131165371);
        this.A0V = getResources().getDimensionPixelSize(2131165370);
        this.A0W = getIconTextViewHeight();
        this.A01 = getResources().getDimensionPixelSize(2131166165);
        this.A03 = getResources().getDimensionPixelSize(2131166166);
        View.inflate(getContext(), 2131624706, this);
        this.A07 = AnonymousClass3MX.A0K(this, 2131434755);
    }

    private Point getCurrentConversationViewSize() {
        Point BPP;
        Context context = getContext();
        if (!(context instanceof C23191Fb) || (BPP = ((C23191Fb) context).BPP()) == null) {
            return C62762rw.A02(AnonymousClass11C.A01(context));
        }
        return BPP;
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), (AttributeSet) null, 2132082729);
        C72473Md.A12(condensedTextView, AnonymousClass3Ma.A09(this).widthPixels, 1073741824);
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(2131165367) * 2) + getResources().getDimensionPixelSize(2131165366);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize;
        Resources resources = getResources();
        int i = 2131165368;
        if (this.A0U) {
            i = 2131165369;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        if (this.A0U) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(2131165366);
        }
        return (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    private int getNumberOfColumns() {
        Point currentConversationViewSize = getCurrentConversationViewSize();
        int minMarginSize = (currentConversationViewSize.x - getMinMarginSize()) / getIconSize();
        int i = 2;
        if (minMarginSize >= 2) {
            i = Math.max(3, minMarginSize);
        }
        return Math.min(4, i);
    }

    public int A0B(View view) {
        Point A022 = C62762rw.A02(AnonymousClass11C.A01(getContext()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Math.max(getMaxMarginSize() + (getIconSize() * getNumberOfColumns()), ((iArr[0] + (view.getWidth() / 2)) - (A022.x / 2)) * 2);
    }

    public int A0C(View view) {
        int numberOfColumns;
        int i;
        int size = A02().size();
        if (this.A0U) {
            numberOfColumns = getColumnsCountV2();
        } else {
            numberOfColumns = getNumberOfColumns();
        }
        int ceil = (int) Math.ceil(((double) size) / ((double) numberOfColumns));
        if (!this.A0U || ceil >= 3) {
            i = this.A01;
        } else {
            i = getResources().getDimensionPixelSize(2131165381);
        }
        int A012 = ((this.A02 + this.A0V + this.A0W + this.A04) * ceil) + ((ceil - 1) * this.A03) + (i * 2) + C62762rw.A01(getContext(), 1.0f);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredHeight = ((iArr[1] - view.getMeasuredHeight()) - getResources().getDimensionPixelSize(2131165378)) - C62762rw.A00(getContext());
        if (measuredHeight >= A012 || A012 - (this.A02 / 2) <= measuredHeight) {
            return A012;
        }
        return measuredHeight;
    }

    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        int i = this.A06;
        int i2 = computeVerticalScrollRange - (i * 2);
        if (i <= 0 || i2 <= 0) {
            return computeVerticalScrollOffset;
        }
        return i + ((computeVerticalScrollOffset * i2) / computeVerticalScrollRange);
    }

    public int getPopupHeightV2() {
        int ceil = (int) Math.ceil(((double) A02().size()) / ((double) getColumnsCountV2()));
        Resources resources = getResources();
        int i = 2131165374;
        if (ceil > 2) {
            i = 2131165377;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        Resources resources2 = getResources();
        int i2 = 2131165381;
        if (ceil > 2) {
            i2 = 2131165382;
        }
        return ((this.A02 + this.A0V + this.A0W) * ceil) + ((ceil - 1) * dimensionPixelSize) + (resources2.getDimensionPixelSize(i2) * 2);
    }

    public void setActivityOrientation(int i) {
        this.A00 = i;
    }

    public void setVerticalScrollbarInset(int i) {
        this.A06 = i;
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0F();
        this.A0Z = C17880vN.A13();
        A04();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A0F();
        this.A0Z = C17880vN.A13();
        A04();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A0F();
    }

    public ConversationAttachmentContentView(Context context) {
        super(context);
        A0F();
        this.A0Z = C17880vN.A13();
        A04();
    }
}
