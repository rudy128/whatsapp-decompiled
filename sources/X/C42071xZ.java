package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1xZ  reason: invalid class name and case insensitive filesystem */
public class C42071xZ extends C42061xY implements C218317o {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public C42131xg A09;
    public C42461yD A0A;
    public C39621tN A0B;
    public C28931bI A0C;
    public C28931bI A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public C28931bI A0G;
    public C28931bI A0H;
    public C28931bI A0I;
    public C28931bI A0J;
    public C28931bI A0K;
    public C28931bI A0L;
    public C28931bI A0M;
    public C28931bI A0N;
    public C28931bI A0O;
    public C28931bI A0P;
    public C28931bI A0Q;
    public C28931bI A0R;
    public C28931bI A0S;
    public C28931bI A0T;
    public C28931bI A0U;
    public C42101xc A0V;
    public C28931bI A0W;
    public C28931bI A0X;
    public final C42091xb A0Y;
    public final C37451pZ A0Z;
    public final C37471pb A0a;
    public final C34021jm A0b;
    public final C18000vb A0c;
    public final C18030ve A0d;
    public final C43351zf A0e;
    public final C39241sk A0f = new C39331st();
    public final C39241sk A0g = new C42111xd();
    public final boolean A0h;
    public final C42081xa A0i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42071xZ(Context context, View view, C19880zA r15, C42081xa r16, C42091xb r17, C42101xc r18, C24921Me r19, C37451pZ r20, C37471pb r21, C34021jm r22, AnonymousClass118 r23, C18000vb r24, C18030ve r25, C43351zf r26, boolean z) {
        super(view);
        C18070vi.A0d(view, 1);
        C18030ve r11 = r25;
        this.A0d = r11;
        C18000vb r10 = r24;
        this.A0c = r10;
        this.A0e = r26;
        this.A0Z = r20;
        this.A0a = r21;
        this.A0b = r22;
        this.A0h = z;
        C42081xa r5 = r16;
        this.A0i = r5;
        C42091xb r6 = r17;
        this.A0Y = r6;
        A0H(context, view, r15, r5, r6, r18, r19, r23, r10, r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r5, 12387) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.content.Context r8, android.view.View r9, X.C19880zA r10, X.C42081xa r11, X.C42091xb r12, X.C42101xc r13, X.C24921Me r14, X.AnonymousClass118 r15, X.C18000vb r16, X.C18030ve r17) {
        /*
            r7 = this;
            r7.A0V = r13
            r0 = 2131429650(0x7f0b0912, float:1.8480979E38)
            android.view.View r2 = r9.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r5 = r17
            if (r2 == 0) goto L_0x0214
            if (r17 == 0) goto L_0x001e
            X.0vf r1 = X.C18040vf.A01
            r0 = 12387(0x3063, float:1.7358E-41)
            boolean r1 = X.C18020vd.A05(r1, r5, r0)
            r0 = 2131627413(0x7f0e0d95, float:1.888209E38)
            if (r1 != 0) goto L_0x0021
        L_0x001e:
            r0 = 2131627412(0x7f0e0d94, float:1.8882088E38)
        L_0x0021:
            r2.setLayoutResource(r0)
            android.view.View r6 = r2.inflate()
        L_0x0028:
            X.1xe r6 = (X.C42121xe) r6
            android.content.Context r1 = r15.A00
            X.1xg r0 = new X.1xg
            r2 = r10
            r3 = r14
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A09 = r0
            r0 = 2131429452(0x7f0b084c, float:1.8480577E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            r7.A02 = r0
            boolean r0 = X.AnonymousClass1J8.A09(r5)
            if (r0 != 0) goto L_0x004f
            X.1xg r0 = r7.A09
            X.1xi r0 = r0.A03
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            X.C43421zm.A04(r0)
        L_0x004f:
            r0 = 2131434205(0x7f0b1add, float:1.8490217E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0P = r0
            r0 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A04 = r0
            r0 = 2131431258(0x7f0b0f5a, float:1.848424E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0I = r0
            r0 = 2131431481(0x7f0b1039, float:1.8484692E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            r7.A03 = r0
            r0 = 2131435863(0x7f0b2157, float:1.849358E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0U = r0
            A01(r8, r9)
            r0 = 2131433424(0x7f0b17d0, float:1.8488633E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0F = r0
            r0 = 2131429455(0x7f0b084f, float:1.8480583E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            r7.A01 = r0
            r0 = 2131435461(0x7f0b1fc5, float:1.8492765E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r7.A07 = r0
            r0 = 2131428342(0x7f0b03f6, float:1.8478326E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            r7.A00 = r0
            r0 = 2131432810(0x7f0b156a, float:1.8487388E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r7.A08 = r0
            r0 = 2131429615(0x7f0b08ef, float:1.8480908E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0R = r0
            r0 = 2131429658(0x7f0b091a, float:1.8480995E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0J = r0
            r0 = 2131429655(0x7f0b0917, float:1.8480989E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0L = r0
            X.1xg r0 = r7.A09
            X.0ve r1 = r0.A05
            X.0vf r4 = X.C18040vf.A01
            r0 = 11407(0x2c8f, float:1.5985E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x0103
            X.1bI r0 = r7.A0L
            r0.A02()
        L_0x0103:
            r0 = 2131429296(0x7f0b07b0, float:1.848026E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0G = r0
            r0 = 2131435648(0x7f0b2080, float:1.8493144E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A06 = r0
            r0 = 2131435694(0x7f0b20ae, float:1.8493237E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0S = r0
            r0 = 2131432690(0x7f0b14f2, float:1.8487145E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A05 = r0
            r0 = 2131433695(0x7f0b18df, float:1.8489183E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0N = r0
            r0 = 2131432882(0x7f0b15b2, float:1.8487534E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0M = r0
            r0 = 2131433847(0x7f0b1977, float:1.8489491E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0O = r0
            r0 = 2131430161(0x7f0b0b11, float:1.8482015E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0H = r0
            r0 = 2131430164(0x7f0b0b14, float:1.8482021E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0T = r0
            r0 = 2131427708(0x7f0b017c, float:1.847704E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0C = r0
            r0 = 2131429600(0x7f0b08e0, float:1.8480877E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0K = r0
            r0 = 2131433425(0x7f0b17d1, float:1.8488635E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0E = r0
            X.1bI r1 = r7.A0M
            r3 = 0
            X.3AS r0 = new X.3AS
            r0.<init>(r8, r7, r3)
            r1.A07(r0)
            X.1bI r2 = r7.A0O
            r1 = 1
            X.3AS r0 = new X.3AS
            r0.<init>(r8, r7, r1)
            r2.A07(r0)
            X.1xg r0 = r7.A09
            X.0ve r1 = r0.A05
            r0 = 11407(0x2c8f, float:1.5985E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x01db
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166255(0x7f07042f, float:1.794675E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.1bI r0 = r7.A0L
            android.view.View r0 = r0.A02()
            X.C27641Ww.A03(r0, r1, r3)
        L_0x01db:
            r0 = 2131427852(0x7f0b020c, float:1.8477332E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0D = r0
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0Q = r0
            r0 = 2131429646(0x7f0b090e, float:1.848097E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0X = r0
            r0 = 2131429642(0x7f0b090a, float:1.8480962E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r7.A0W = r0
            return
        L_0x0214:
            r0 = 2131429649(0x7f0b0911, float:1.8480977E38)
            android.view.View r6 = X.AnonymousClass1HF.A06(r9, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42071xZ.A0H(android.content.Context, android.view.View, X.0zA, X.1xa, X.1xb, X.1xc, X.1Me, X.118, X.0vb, X.0ve):void");
    }

    public void A0J(boolean z, int i) {
        View view;
        int A002;
        if (i == 0) {
            C39621tN r2 = this.A0B;
            if (!(r2 instanceof C39631tO) || !this.A0b.BeI(((C39631tO) r2).BTb())) {
                View view2 = this.A02;
                if (z) {
                    C42491yG.A03(view2);
                    return;
                } else {
                    C42491yG.A02(view2);
                    return;
                }
            } else {
                view = this.A02;
                A002 = 2131231227;
            }
        } else if (i == 2) {
            view = this.A02;
            A002 = AnonymousClass1YL.A00(view.getContext(), 2130970064, 2131101205);
        } else {
            return;
        }
        view.setBackgroundResource(A002);
    }

    public void A0K(boolean z, int i) {
        C39241sk r0;
        if (this.A0U.A01() != 0 && this.A0I.A01() != 0) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A04;
            C39241sk r1 = wDSProfilePhoto.A04;
            if ((r1 instanceof C39331st) && !z) {
                r0 = null;
            } else if (r1 == null && z) {
                r0 = this.A0f;
            }
            wDSProfilePhoto.setProfileBadge(r0);
        } else if (z) {
            this.A0X.A04(0);
            this.A0X.A02().setContentDescription(C43391zj.A01(this.A0c, i));
            ((ImageView) this.A0X.A02()).setImageResource(2131231792);
            return;
        }
        this.A0X.A04(8);
    }

    public void A0L(boolean z, boolean z2) {
        C39181se r1;
        C28931bI r0;
        int i = 8;
        if (this.A0U.A01() == 0) {
            ((SelectionCheckView) this.A0Q.A02()).A04(z, z2);
            r0 = this.A0Q;
            if (z) {
                i = 0;
            }
        } else {
            if (z) {
                r1 = C39181se.CHECKED;
            } else {
                r1 = C39181se.NONE;
            }
            ((WDSProfilePhoto) this.A04).A00(r1, z2);
            r0 = this.A0Q;
        }
        r0.A04(i);
    }

    public static View A00(ViewGroup viewGroup, AnonymousClass1LT r4, boolean z) {
        View A002;
        int i = 2131624994;
        if (z) {
            i = 2131627576;
        }
        if (r4 == null || (A002 = r4.A00(viewGroup.getContext(), viewGroup, i, true)) == null) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        }
        return A002;
    }

    public static void A01(Context context, View view) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168955);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168954);
        View A062 = AnonymousClass1HF.A06(view, 2131429646);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A062.getLayoutParams();
        marginLayoutParams.width = dimensionPixelSize2;
        marginLayoutParams.height = dimensionPixelSize2;
        marginLayoutParams.topMargin = dimensionPixelSize;
        A062.setLayoutParams(marginLayoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: X.2D5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.2D6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: X.1yF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: X.1yF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v5, resolved type: X.1yF} */
    /* JADX WARNING: type inference failed for: r24v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C39621tN r105, X.C38341r8 r106, X.C139106yE r107, int r108, int r109, boolean r110) {
        /*
            r104 = this;
            r6 = r104
            android.view.View r0 = r6.A0H
            android.content.Context r45 = r0.getContext()
            X.1tN r1 = r6.A0B
            r3 = r105
            boolean r0 = X.C42171xk.A00(r1, r3)
            r98 = r106
            r99 = r107
            r100 = r109
            r101 = r110
            if (r0 != 0) goto L_0x0026
            boolean r0 = r1 instanceof X.C39611tM
            if (r0 == 0) goto L_0x0032
            X.1tM r1 = (X.C39611tM) r1
            boolean r0 = X.C39611tM.A01(r1, r3)
            if (r0 == 0) goto L_0x0032
        L_0x0026:
            X.1yD r1 = r6.A0A
            X.1tN r0 = r6.A0B
            r96 = r1
            r97 = r0
            r96.A0J(r97, r98, r99, r100, r101)
        L_0x0031:
            return
        L_0x0032:
            X.1yD r0 = r6.A0A
            if (r0 == 0) goto L_0x0039
            r0.A0I()
        L_0x0039:
            r6.A0B = r3
            X.1yD r1 = r6.A0A
            if (r1 == 0) goto L_0x0049
            X.2mO r0 = r1.A00
            if (r0 == 0) goto L_0x0049
            r0.A02()
            r0 = 0
            r1.A00 = r0
        L_0x0049:
            android.widget.ImageView r1 = r6.A04
            r0 = 0
            r1.setTag(r0)
            X.0ve r0 = r6.A0d
            r102 = r0
            r2 = 3580(0xdfc, float:5.017E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r0, r2)
            r103 = r108
            if (r0 == 0) goto L_0x02dc
            boolean r0 = r3 instanceof X.C42191xm
            if (r0 == 0) goto L_0x02dc
            r96 = 7
        L_0x0065:
            X.1xb r1 = r6.A0Y
            X.1jm r0 = r6.A0b
            r51 = r0
            X.1pb r0 = r6.A0a
            r50 = r0
            X.1pZ r0 = r6.A0Z
            r49 = r0
            X.1zf r0 = r6.A0e
            r48 = r0
            boolean r0 = r6.A0h
            r47 = r0
            X.1K2 r0 = r1.A00
            X.10E r11 = r0.A01
            X.00S r1 = r11.AAv
            java.lang.Object r44 = r1.get()
            r1 = r44
            X.11P r1 = (X.AnonymousClass11P) r1
            r44 = r1
            X.00S r1 = r11.A04
            java.lang.Object r43 = r1.get()
            r1 = r43
            X.0ve r1 = (X.C18030ve) r1
            r43 = r1
            X.00S r1 = r11.A4b
            java.lang.Object r42 = r1.get()
            r1 = r42
            X.1KB r1 = (X.AnonymousClass1KB) r1
            r42 = r1
            X.00S r1 = r11.A6G
            java.lang.Object r41 = r1.get()
            r1 = r41
            X.1gc r1 = (X.C32091gc) r1
            r41 = r1
            X.00S r1 = r11.A63
            java.lang.Object r40 = r1.get()
            r1 = r40
            X.11S r1 = (X.AnonymousClass11S) r1
            r40 = r1
            X.00S r1 = r11.ABY
            java.lang.Object r39 = r1.get()
            r1 = r39
            X.118 r1 = (X.AnonymousClass118) r1
            r39 = r1
            X.00S r1 = r11.AC1
            java.lang.Object r38 = r1.get()
            r1 = r38
            X.10I r1 = (X.AnonymousClass10I) r1
            r38 = r1
            X.00S r1 = r11.A13
            java.lang.Object r37 = r1.get()
            r1 = r37
            X.1PW r1 = (X.AnonymousClass1PW) r1
            r37 = r1
            X.00S r1 = r11.A2H
            java.lang.Object r36 = r1.get()
            r1 = r36
            X.1CJ r1 = (X.AnonymousClass1CJ) r1
            r36 = r1
            X.00S r1 = r11.A90
            java.lang.Object r35 = r1.get()
            r1 = r35
            X.12L r1 = (X.AnonymousClass12L) r1
            r35 = r1
            X.00S r1 = r11.A8L
            java.lang.Object r34 = r1.get()
            r1 = r34
            X.1R2 r1 = (X.AnonymousClass1R2) r1
            r34 = r1
            X.00S r1 = r11.A2d
            java.lang.Object r33 = r1.get()
            r1 = r33
            X.1VW r1 = (X.AnonymousClass1VW) r1
            r33 = r1
            X.00S r1 = r11.A2f
            java.lang.Object r32 = r1.get()
            r1 = r32
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            r32 = r1
            X.10G r10 = r11.A00
            X.00S r1 = r10.A12
            java.lang.Object r31 = r1.get()
            r1 = r31
            X.1xn r1 = (X.C42201xn) r1
            r31 = r1
            X.00S r1 = r11.A2x
            java.lang.Object r30 = r1.get()
            r1 = r30
            X.1NA r1 = (X.AnonymousClass1NA) r1
            r30 = r1
            X.00S r1 = r11.AAp
            java.lang.Object r29 = r1.get()
            r1 = r29
            X.11C r1 = (X.AnonymousClass11C) r1
            r29 = r1
            X.00S r1 = r11.ABX
            java.lang.Object r28 = r1.get()
            r1 = r28
            X.1Me r1 = (X.C24921Me) r1
            r28 = r1
            X.00S r1 = r11.ABz
            java.lang.Object r27 = r1.get()
            r1 = r27
            X.0vb r1 = (X.C18000vb) r1
            r27 = r1
            X.00S r1 = r11.A4j
            java.lang.Object r26 = r1.get()
            r1 = r26
            X.1PU r1 = (X.AnonymousClass1PU) r1
            r26 = r1
            X.00S r1 = r11.A8J
            java.lang.Object r25 = r1.get()
            r1 = r25
            X.1QS r1 = (X.AnonymousClass1QS) r1
            r25 = r1
            X.00S r1 = r11.A0x
            java.lang.Object r23 = r1.get()
            r1 = r23
            X.1pj r1 = (X.C37551pj) r1
            r23 = r1
            X.00S r1 = r11.A5f
            java.lang.Object r22 = r1.get()
            r1 = r22
            X.1R3 r1 = (X.AnonymousClass1R3) r1
            r22 = r1
            X.00S r1 = r11.AAd
            java.lang.Object r21 = r1.get()
            r1 = r21
            X.1xo r1 = (X.C42211xo) r1
            r21 = r1
            X.00S r1 = r11.A1m
            java.lang.Object r20 = r1.get()
            r1 = r20
            X.1TD r1 = (X.AnonymousClass1TD) r1
            r20 = r1
            X.00S r1 = r11.A2E
            java.lang.Object r19 = r1.get()
            r1 = r19
            X.1Nb r1 = (X.AnonymousClass1Nb) r1
            r19 = r1
            X.00S r1 = r11.A6I
            java.lang.Object r18 = r1.get()
            r1 = r18
            X.1WM r1 = (X.AnonymousClass1WM) r1
            r18 = r1
            X.00S r1 = r11.AA1
            java.lang.Object r17 = r1.get()
            r1 = r17
            X.1xp r1 = (X.C42221xp) r1
            r17 = r1
            X.00S r1 = r11.ABl
            java.lang.Object r16 = r1.get()
            r1 = r16
            X.0z4 r1 = (X.C19830z4) r1
            r16 = r1
            X.00S r1 = r11.A2L
            java.lang.Object r15 = r1.get()
            X.1kb r15 = (X.C34511kb) r15
            X.00S r1 = r11.A5X
            java.lang.Object r14 = r1.get()
            X.1TA r14 = (X.AnonymousClass1TA) r14
            X.00S r1 = r11.A8G
            java.lang.Object r13 = r1.get()
            X.1QO r13 = (X.AnonymousClass1QO) r13
            X.00S r1 = r11.AAo
            java.lang.Object r12 = r1.get()
            X.1gn r12 = (X.C32191gn) r12
            X.0zB r46 = X.C19890zB.A00
            X.00S r1 = r11.A5R
            java.lang.Object r9 = r1.get()
            X.1y1 r9 = (X.C42341y1) r9
            X.00S r1 = r11.A5P
            java.lang.Object r8 = r1.get()
            X.1kr r8 = (X.C34651kr) r8
            X.00S r1 = r11.A5U
            java.lang.Object r7 = r1.get()
            X.1tF r7 = (X.C39541tF) r7
            X.00S r1 = r11.A1h
            X.00H r94 = X.C000200d.A00(r1)
            X.00S r1 = r11.A27
            java.lang.Object r5 = r1.get()
            X.1Co r5 = (X.C22621Co) r5
            X.00S r1 = r11.A3l
            java.lang.Object r4 = r1.get()
            X.1y2 r4 = (X.C42351y2) r4
            X.1K1 r3 = r0.A00
            X.00S r0 = r3.A1g
            java.lang.Object r2 = r0.get()
            X.1y3 r2 = (X.C42361y3) r2
            X.00S r0 = r3.A1h
            java.lang.Object r1 = r0.get()
            X.1y4 r1 = (X.C42371y4) r1
            X.00S r0 = r3.A1i
            java.lang.Object r0 = r0.get()
            X.1y5 r0 = (X.C42381y5) r0
            X.00S r11 = r11.AAE
            X.00H r95 = X.C000200d.A00(r11)
            X.00S r10 = r10.A39
            java.lang.Object r10 = r10.get()
            X.1yA r10 = (X.C42431yA) r10
            X.00S r3 = r3.A1j
            java.lang.Object r3 = r3.get()
            X.1yC r3 = (X.C42451yC) r3
            X.1yF r24 = new X.1yF
            r55 = r23
            r56 = r37
            r57 = r15
            r58 = r33
            r59 = r32
            r60 = r28
            r61 = r49
            r62 = r50
            r63 = r51
            r64 = r6
            r65 = r29
            r66 = r44
            r67 = r39
            r68 = r16
            r69 = r27
            r70 = r20
            r71 = r5
            r72 = r36
            r73 = r30
            r74 = r14
            r75 = r22
            r76 = r18
            r77 = r17
            r78 = r4
            r79 = r43
            r80 = r35
            r81 = r21
            r82 = r7
            r83 = r8
            r84 = r41
            r85 = r10
            r86 = r13
            r87 = r25
            r88 = r34
            r89 = r9
            r90 = r19
            r91 = r26
            r92 = r48
            r93 = r38
            r97 = r47
            r44 = r24
            r47 = r31
            r48 = r2
            r49 = r1
            r50 = r0
            r51 = r3
            r52 = r42
            r53 = r40
            r54 = r12
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)
        L_0x02b8:
            r0 = r24
            r6.A0A = r0
        L_0x02bc:
            X.1yD r1 = r6.A0A
            X.1tN r0 = r6.A0B
            r96 = r1
            r97 = r0
            r96.A0J(r97, r98, r99, r100, r101)
            r1 = 4
            r0 = r103
            if (r0 != r1) goto L_0x0031
            boolean r0 = X.AnonymousClass1J8.A09(r102)
            if (r0 == 0) goto L_0x0031
            X.1xg r0 = r6.A09
            X.1xi r0 = r0.A03
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.A0L()
            return
        L_0x02dc:
            boolean r0 = r3 instanceof X.C39631tO
            if (r0 == 0) goto L_0x02e4
            r96 = r103
            goto L_0x0065
        L_0x02e4:
            boolean r0 = r3 instanceof X.C48582Na
            if (r0 == 0) goto L_0x040d
            X.1xc r1 = r6.A0V
            X.1zf r0 = r6.A0e
            r51 = r0
            X.1pZ r0 = r6.A0Z
            r31 = r0
            X.1jm r0 = r6.A0b
            r32 = r0
            X.1K2 r0 = r1.A00
            X.10E r12 = r0.A01
            X.00S r0 = r12.ABY
            java.lang.Object r23 = r0.get()
            r0 = r23
            X.118 r0 = (X.AnonymousClass118) r0
            r23 = r0
            X.00S r0 = r12.AAv
            java.lang.Object r22 = r0.get()
            r0 = r22
            X.11P r0 = (X.AnonymousClass11P) r0
            r22 = r0
            X.00S r0 = r12.A04
            java.lang.Object r21 = r0.get()
            r0 = r21
            X.0ve r0 = (X.C18030ve) r0
            r21 = r0
            X.00S r0 = r12.A6G
            java.lang.Object r20 = r0.get()
            r0 = r20
            X.1gc r0 = (X.C32091gc) r0
            r20 = r0
            X.00S r0 = r12.A63
            java.lang.Object r19 = r0.get()
            r0 = r19
            X.11S r0 = (X.AnonymousClass11S) r0
            r19 = r0
            X.00S r0 = r12.A2H
            java.lang.Object r18 = r0.get()
            r0 = r18
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            r18 = r0
            X.00S r0 = r12.A90
            java.lang.Object r17 = r0.get()
            r0 = r17
            X.12L r0 = (X.AnonymousClass12L) r0
            r17 = r0
            X.00S r0 = r12.A8L
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.1R2 r0 = (X.AnonymousClass1R2) r0
            r16 = r0
            X.00S r0 = r12.A2f
            java.lang.Object r15 = r0.get()
            X.1M9 r15 = (X.AnonymousClass1M9) r15
            X.00S r0 = r12.A2x
            java.lang.Object r14 = r0.get()
            X.1NA r14 = (X.AnonymousClass1NA) r14
            X.00S r0 = r12.AAp
            java.lang.Object r11 = r0.get()
            X.11C r11 = (X.AnonymousClass11C) r11
            X.00S r0 = r12.ABX
            java.lang.Object r10 = r0.get()
            X.1Me r10 = (X.C24921Me) r10
            X.00S r0 = r12.ABz
            java.lang.Object r9 = r0.get()
            X.0vb r9 = (X.C18000vb) r9
            X.00S r0 = r12.A4j
            java.lang.Object r8 = r0.get()
            X.1PU r8 = (X.AnonymousClass1PU) r8
            X.00S r0 = r12.A8J
            java.lang.Object r7 = r0.get()
            X.1QS r7 = (X.AnonymousClass1QS) r7
            X.00S r0 = r12.A0x
            java.lang.Object r5 = r0.get()
            X.1pj r5 = (X.C37551pj) r5
            X.00S r0 = r12.AAd
            java.lang.Object r4 = r0.get()
            X.1xo r4 = (X.C42211xo) r4
            X.00S r0 = r12.A2E
            java.lang.Object r3 = r0.get()
            X.1Nb r3 = (X.AnonymousClass1Nb) r3
            X.00S r0 = r12.A8G
            java.lang.Object r2 = r0.get()
            X.1QO r2 = (X.AnonymousClass1QO) r2
            X.00S r0 = r12.AAo
            java.lang.Object r1 = r0.get()
            X.1gn r1 = (X.C32191gn) r1
            X.00S r0 = r12.A5R
            java.lang.Object r0 = r0.get()
            X.1y1 r0 = (X.C42341y1) r0
            X.00S r13 = r12.A1h
            X.00H r52 = X.C000200d.A00(r13)
            X.00S r13 = r12.AAE
            X.00H r53 = X.C000200d.A00(r13)
            X.00S r12 = r12.A3l
            java.lang.Object r12 = r12.get()
            X.1y2 r12 = (X.C42351y2) r12
            X.2D6 r24 = new X.2D6
            r25 = r45
            r26 = r19
            r27 = r1
            r28 = r5
            r29 = r15
            r30 = r10
            r33 = r6
            r34 = r11
            r35 = r22
            r36 = r23
            r37 = r9
            r38 = r18
            r39 = r14
            r40 = r12
            r41 = r21
            r42 = r17
            r43 = r4
            r44 = r20
            r45 = r2
            r46 = r7
            r47 = r16
            r48 = r0
            r49 = r3
            r50 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x02b8
        L_0x040d:
            boolean r0 = r3 instanceof X.AnonymousClass2NZ
            if (r0 == 0) goto L_0x02bc
            X.1xa r1 = r6.A0i
            X.1zf r0 = r6.A0e
            r50 = r0
            X.1pb r0 = r6.A0a
            r31 = r0
            X.1jm r0 = r6.A0b
            r23 = r0
            X.1K2 r0 = r1.A00
            X.10E r12 = r0.A01
            X.00S r0 = r12.A5R
            java.lang.Object r22 = r0.get()
            r0 = r22
            X.1y1 r0 = (X.C42341y1) r0
            r22 = r0
            X.00S r0 = r12.ABY
            java.lang.Object r21 = r0.get()
            r0 = r21
            X.118 r0 = (X.AnonymousClass118) r0
            r21 = r0
            X.00S r0 = r12.AAv
            java.lang.Object r20 = r0.get()
            r0 = r20
            X.11P r0 = (X.AnonymousClass11P) r0
            r20 = r0
            X.00S r0 = r12.A04
            java.lang.Object r19 = r0.get()
            r0 = r19
            X.0ve r0 = (X.C18030ve) r0
            r19 = r0
            X.00S r0 = r12.A6G
            java.lang.Object r18 = r0.get()
            r0 = r18
            X.1gc r0 = (X.C32091gc) r0
            r18 = r0
            X.00S r0 = r12.A63
            java.lang.Object r17 = r0.get()
            r0 = r17
            X.11S r0 = (X.AnonymousClass11S) r0
            r17 = r0
            X.00S r0 = r12.A2H
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            r16 = r0
            X.00S r0 = r12.A90
            java.lang.Object r15 = r0.get()
            X.12L r15 = (X.AnonymousClass12L) r15
            X.00S r0 = r12.A8L
            java.lang.Object r14 = r0.get()
            X.1R2 r14 = (X.AnonymousClass1R2) r14
            X.00S r0 = r12.A2f
            java.lang.Object r11 = r0.get()
            X.1M9 r11 = (X.AnonymousClass1M9) r11
            X.00S r0 = r12.A2x
            java.lang.Object r10 = r0.get()
            X.1NA r10 = (X.AnonymousClass1NA) r10
            X.00S r0 = r12.AAp
            java.lang.Object r9 = r0.get()
            X.11C r9 = (X.AnonymousClass11C) r9
            X.00S r0 = r12.ABX
            java.lang.Object r8 = r0.get()
            X.1Me r8 = (X.C24921Me) r8
            X.00S r0 = r12.ABz
            java.lang.Object r7 = r0.get()
            X.0vb r7 = (X.C18000vb) r7
            X.00S r0 = r12.A4j
            java.lang.Object r5 = r0.get()
            X.1PU r5 = (X.AnonymousClass1PU) r5
            X.00S r0 = r12.A8J
            java.lang.Object r4 = r0.get()
            X.1QS r4 = (X.AnonymousClass1QS) r4
            X.00S r0 = r12.A0x
            java.lang.Object r3 = r0.get()
            X.1pj r3 = (X.C37551pj) r3
            X.00S r0 = r12.AAd
            java.lang.Object r2 = r0.get()
            X.1xo r2 = (X.C42211xo) r2
            X.00S r0 = r12.A8G
            java.lang.Object r1 = r0.get()
            X.1QO r1 = (X.AnonymousClass1QO) r1
            X.00S r0 = r12.AAo
            java.lang.Object r0 = r0.get()
            X.1gn r0 = (X.C32191gn) r0
            X.00S r13 = r12.A1h
            X.00H r51 = X.C000200d.A00(r13)
            X.00S r13 = r12.AAE
            X.00H r52 = X.C000200d.A00(r13)
            X.00S r12 = r12.A3l
            java.lang.Object r12 = r12.get()
            X.1y2 r12 = (X.C42351y2) r12
            X.2D5 r24 = new X.2D5
            r25 = r45
            r26 = r17
            r27 = r0
            r28 = r3
            r29 = r11
            r30 = r8
            r32 = r23
            r33 = r6
            r34 = r9
            r35 = r20
            r36 = r21
            r37 = r7
            r38 = r16
            r39 = r10
            r40 = r12
            r41 = r19
            r42 = r15
            r43 = r2
            r44 = r18
            r45 = r1
            r46 = r4
            r47 = r14
            r48 = r22
            r49 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            goto L_0x02b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42071xZ.A0I(X.1tN, X.1r8, X.6yE, int, int, boolean):void");
    }
}
