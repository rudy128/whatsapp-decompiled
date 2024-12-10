package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.contact.FacepileView;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Set;

/* renamed from: X.6Gm  reason: invalid class name and case insensitive filesystem */
public final class C120906Gm extends AnonymousClass6Gn {
    public boolean A00;
    public C121886Lw A01;
    public final AnonymousClass11S A02;
    public final C137986wL A03;
    public final AnonymousClass11Q A04;
    public final C19830z4 A05;
    public final C18000vb A06;
    public final AnonymousClass1WR A07;
    public final C24681Lg A08;
    public final C88174Yp A09;
    public final C132456mq A0A;
    public final C120886Gk A0B;
    public final AnonymousClass72B A0C;
    public final C41821x7 A0D;
    public final C30141dS A0E;
    public final C18100vl A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C37571pl A0I;
    public final C19880zA A0J;
    public final C19880zA A0K;
    public final C19880zA A0L;
    public final C19880zA A0M;
    public final WfalManager A0N;
    public final AnonymousClass1M9 A0O;
    public final C24671Lf A0P;
    public final C24921Me A0Q;
    public final C27201Vd A0R;
    public final AnonymousClass11P A0S;
    public final AnonymousClass1Q1 A0T;
    public final C25931Qe A0U;
    public final C25191Ng A0V;
    public final C129216hR A0W;
    public final C120886Gk A0X;
    public final C127856f3 A0Y;
    public final C139066y9 A0Z;

    public static final void A00(Menu menu, C120906Gm r6, Integer num, int i, int i2) {
        MenuItem add = menu.add(0, i, 0, i2);
        if (r6.A0V) {
            Drawable A002 = C24261Jm.A00(r6.A0J(), num.intValue());
            if (A002 != null) {
                Context A0J2 = r6.A0J();
                int i3 = 2131100146;
                if (i == 2131432582) {
                    i3 = 2131103172;
                }
                A002.setTint(C19740yt.A00(A0J2, i3));
                add.setIcon(A002);
            }
            if (i == 2131432582) {
                SpannableString spannableString = new SpannableString(String.valueOf(add.getTitle()));
                spannableString.setSpan(new ForegroundColorSpan(C19740yt.A00(r6.A0J(), 2131103172)), 0, spannableString.length(), 0);
                add.setTitle(spannableString);
            }
        }
    }

    public static final void A01(C120906Gm r7) {
        C120906Gm r5 = r7;
        C17890vO.A0t(r7.A01);
        C121886Lw r2 = new C121886Lw(r7.A0U, new C126506cq(r5), r5, C18020vd.A05(C18040vf.A02, r7.A0L, 7497), r7.A05.A2U());
        r5.A01 = r2;
        C17890vO.A0u(r2, r5.A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A0L, 4905) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0131, code lost:
        if (X.AnonymousClass72Z.A03((X.AnonymousClass21W) r2) == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(android.view.View r10) {
        /*
            r9 = this;
            r3 = 0
            super.A0U(r10)
            X.6Gk r5 = r9.A0B
            android.view.ViewGroup r4 = r5.A02()
            android.view.ViewGroup r0 = r5.A02()
            int r2 = r0.getPaddingLeft()
            android.view.ViewGroup r0 = r5.A02()
            int r1 = r0.getPaddingTop()
            android.view.ViewGroup r0 = r5.A02()
            int r0 = r0.getPaddingRight()
            r8 = 0
            r4.setPadding(r2, r1, r0, r3)
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0045
            android.view.ViewGroup r1 = r5.A06
            if (r1 == 0) goto L_0x0033
            android.content.res.ColorStateList r0 = r9.A00
            X.AnonymousClass1HF.A0L(r0, r1)
        L_0x0033:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x003c
            android.content.res.ColorStateList r0 = r9.A00
            X.AnonymousClass1HF.A0L(r0, r1)
        L_0x003c:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0045
            android.content.res.ColorStateList r0 = r9.A00
            X.AnonymousClass1HF.A0L(r0, r1)
        L_0x0045:
            android.view.View r0 = r5.A01()
            r1 = 15
            X.AnonymousClass78P.A00(r0, r9, r1)
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x00c7
            android.view.ViewGroup r0 = r5.A06
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            X.AnonymousClass6LG.A00(r0, r9, r1)
        L_0x0059:
            android.view.View r0 = r5.A04
            r4 = 8
            if (r0 == 0) goto L_0x0089
            X.1dS r0 = r9.A0E
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0089
            android.view.View r1 = r5.A04
            if (r1 == 0) goto L_0x0070
            r0 = 19
        L_0x006d:
            X.AnonymousClass6LG.A00(r1, r9, r0)
        L_0x0070:
            r9.A0b()
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x00cf
            X.0zA r1 = r9.A0M
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00ca
            r1.A03()
            java.lang.String r0 = "logStatusEntryPointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0089:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x00b6
            X.11S r0 = r9.A02
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00bd
            X.11Q r0 = r9.A04
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x00af
            X.0ve r2 = r9.A0L
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00bd
        L_0x00af:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x00b6
            r0.setVisibility(r4)
        L_0x00b6:
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x0070
            r0 = 21
            goto L_0x006d
        L_0x00bd:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00b6
            r0 = 20
            X.AnonymousClass6LG.A00(r1, r9, r0)
            goto L_0x00b6
        L_0x00c7:
            android.view.ViewGroup r0 = r5.A08
            goto L_0x0054
        L_0x00ca:
            r0 = 22
            X.AnonymousClass6LG.A00(r2, r9, r0)
        L_0x00cf:
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0120
            X.4Yp r0 = r9.A09
            X.206 r7 = r9.A07
            boolean r0 = r0.A04(r7)
            if (r0 == 0) goto L_0x0162
            X.6wL r6 = r9.A03
            java.lang.Integer r0 = X.C17880vN.A0k()
            X.62z r2 = new X.62z
            r2.<init>()
            r2.A01 = r0
            X.205 r1 = r7.A0v
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.C137986wL.A00(r7)
            r2.A02 = r0
            X.00H r0 = r6.A01
            r0.get()
            X.1BI r0 = r1.A00
            int r0 = X.C63152sb.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.18K r0 = r6.A00
            r0.CC7(r2)
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0117
            r0.setVisibility(r3)
        L_0x0117:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x0120
            r0 = 14
            X.AnonymousClass6LG.A00(r1, r9, r0)
        L_0x0120:
            A01(r9)
            X.206 r2 = r9.A07
            boolean r0 = r2 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0133
            r0 = r2
            X.21W r0 = (X.AnonymousClass21W) r0
            boolean r1 = X.AnonymousClass72Z.A03(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            r9.A00 = r0
            boolean r0 = r2 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0144
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            if (r0 == 0) goto L_0x0144
            r8 = 1
        L_0x0144:
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x016a
            if (r8 != 0) goto L_0x016a
            r9.A0a()
            boolean r0 = X.AnonymousClass25A.A0p(r2)
            if (r0 == 0) goto L_0x015a
            android.view.ViewGroup r0 = r5.A02()
            r0.setVisibility(r4)
        L_0x015a:
            X.1Lg r1 = r9.A08
            X.1WR r0 = r9.A07
            r1.registerObserver(r0)
            return
        L_0x0162:
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0117
            r0.setVisibility(r4)
            goto L_0x0117
        L_0x016a:
            X.0ve r2 = r9.A0L
            r1 = 9775(0x262f, float:1.3698E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x017d
            X.10I r1 = r9.A0S
            r0 = 1
            X.AnonymousClass7RI.A01(r1, r9, r0)
            return
        L_0x017d:
            r9.A0Y(r3)
            X.1KB r1 = r9.A0F
            X.7RI r0 = X.AnonymousClass7RI.A00(r9, r3)
            r1.CGP(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120906Gm.A0U(android.view.View):void");
    }

    public void A0Q() {
        if (this.A00) {
            super.A0Q();
        }
    }

    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Set set;
        ViewGroup viewGroup2;
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0Z2 = super.A0Z(layoutInflater2, viewGroup);
        C17960vV.A05(A0Z2);
        boolean z = this.A0V;
        if (!z && (viewGroup2 = this.A0B.A08) != null) {
            viewGroup2.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C62762rw.A01(viewGroup2.getContext(), 76.0f));
            layoutParams.gravity = 1;
            viewGroup2.setLayoutParams(layoutParams);
            viewGroup2.setBackgroundResource(2131231783);
            layoutInflater2.inflate(2131627036, viewGroup2, true);
        }
        C120886Gk r6 = this.A0B;
        C27201Vd r36 = this.A0R;
        C19830z4 r23 = this.A05;
        C129216hR r27 = this.A0W;
        ViewGroup A022 = r6.A02();
        AnonymousClass11P r22 = this.A0S;
        AnonymousClass1KB r21 = this.A0F;
        AnonymousClass1M9 r18 = this.A0O;
        C24921Me r20 = this.A0Q;
        C18000vb r17 = this.A06;
        C24671Lf r19 = this.A0P;
        AnonymousClass1Q1 r15 = this.A0T;
        C25191Ng r14 = this.A0V;
        C127856f3 r13 = this.A0Y;
        AnonymousClass10I r11 = this.A0S;
        AnonymousClass72B r10 = this.A0C;
        AnonymousClass206 r5 = this.A07;
        Boolean valueOf = Boolean.valueOf(r10.A04(C122646Re.FACEBOOK, C18070vi.A0M(r5), 8, false));
        Boolean valueOf2 = Boolean.valueOf(r10.A04(C122646Re.INSTAGRAM, C18070vi.A0M(r5), 8, false));
        C111255jJ r2 = ((StatusPlaybackContactFragment) this.A0N.A01).A0T;
        C18000vb r24 = r17;
        AnonymousClass1Q1 r25 = r15;
        C25191Ng r26 = r14;
        C127856f3 r28 = r13;
        C111255jJ r29 = r2;
        AnonymousClass10I r30 = r11;
        AnonymousClass72B r31 = r10;
        boolean z2 = z;
        AnonymousClass1KB r172 = r21;
        C27201Vd r212 = r36;
        r6.A0A = new C1406672l(A022, r172, r18, r19, r20, r212, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, valueOf, valueOf2, z2, C18020vd.A05(C18040vf.A02, this.A0L, 9978));
        C692236j A023 = C63672tV.A02(r5);
        View view = null;
        if (A023 != null && (set = A023.A05) != null && !set.isEmpty() && this.A0G) {
            AnonymousClass1M9 r12 = r18;
            C24921Me r132 = r20;
            C27201Vd r142 = r36;
            Set set2 = set;
            C130866k8 r102 = new C130866k8(r6.A02(), r12, r132, r142, set2, C23761Hn.A01, this.A0I);
            r102.A02.setVisibility(8);
            r6.A0B = r102;
        }
        r6.A06 = AnonymousClass3MW.A0D(A0Z2, 2131436832);
        r6.A07 = (ImageView) C72453Mb.A0s(A0Z2, 2131435670).A02();
        if (z && C72453Mb.A1a(this.A0F)) {
            r6.A09 = (FacepileView) C72453Mb.A0s(A0Z2, 2131435669).A02();
        }
        r6.A08 = C17880vN.A0E(A0Z2, 2131434379);
        r6.A01 = A0Z2.findViewById(2131429869);
        r6.A02 = A0Z2.findViewById(2131430984);
        r6.A04 = A0Z2.findViewById(2131432784);
        r6.A03 = r6.A02().findViewById(2131432078);
        View findViewById = A0Z2.findViewById(2131427557);
        if (findViewById != null) {
            this.A0A.A00();
            findViewById.setVisibility(0);
            view = findViewById;
        }
        r6.A00 = view;
        r6.A05 = A0Z2.findViewById(2131435359);
        r6.A0C = C72453Mb.A0s(A0Z2, 2131436818);
        return A0Z2;
    }

    public final void A0b() {
        View view;
        int i;
        int i2;
        int i3;
        C1406672l r0 = this.A0B.A0A;
        if (r0 != null && (view = r0.A00) != null) {
            C129216hR r7 = this.A0W;
            AnonymousClass206 r3 = this.A07;
            C18070vi.A0d(r3, 1);
            int ordinal = AnonymousClass72B.A01(r7.A02).ordinal();
            if (ordinal == 3) {
                int i4 = 8;
                AnonymousClass3MY.A1B(view, 2131435639, 8);
                AnonymousClass00H r2 = r7.A01;
                boolean A052 = ((C41801x5) r2.get()).A05(C122646Re.FACEBOOK, r3);
                boolean A053 = ((C41801x5) r2.get()).A05(C122646Re.INSTAGRAM, r3);
                if (A052 || A053) {
                    TextView A0E2 = C17880vN.A0E(view, 2131435638);
                    View findViewById = view.findViewById(2131435629);
                    View findViewById2 = view.findViewById(2131435630);
                    if (A052) {
                        i3 = 2131898366;
                        if (A053) {
                            i3 = 2131898365;
                        }
                    } else if (A053) {
                        i3 = 2131898367;
                    } else {
                        return;
                    }
                    Integer valueOf = Integer.valueOf(i3);
                    if (valueOf != null) {
                        A0E2.setText(valueOf.intValue());
                        findViewById.setVisibility(C72453Mb.A07(A052 ? 1 : 0));
                        if (A053) {
                            i4 = 0;
                        }
                        findViewById2.setVisibility(i4);
                        i = 0;
                        i2 = 2131435640;
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass3MY.A1B(view, 2131435640, 8);
                    return;
                }
            } else if (ordinal == 1 || ordinal == 2) {
                i = C72453Mb.A07(C108945cZ.A12(r7.A03).A05(r3) ? 1 : 0);
                i2 = 2131435639;
            } else {
                return;
            }
            AnonymousClass3MY.A1B(view, i2, i);
        }
    }

    public void A0D() {
        super.A0D();
        C120886Gk r3 = this.A0B;
        C1406672l r2 = r3.A0A;
        if (r2 != null) {
            C108975cc.A18(r2.A0P);
            if (!r2.A0Q) {
                r2.A0D.unregisterObserver(r2.A0C);
                r2.A0H.unregisterObserver(r2.A0G);
                r2.A0J.unregisterObserver(r2.A0I);
            }
            r2.A0A.A0I(r2.A0O);
            r2.A05 = true;
        }
        C130866k8 r1 = r3.A0B;
        if (r1 != null) {
            C108975cc.A18(r1.A07);
            AnonymousClass3Ma.A1R(r1.A00);
        }
        C17890vO.A0t(this.A01);
        this.A01 = null;
        this.A08.unregisterObserver(this.A07);
    }

    public void A0R(int i) {
        WaTextView waTextView;
        super.A0R(i);
        if (i == 3) {
            C32741hg r4 = this.A05;
            AnonymousClass206 r2 = this.A07;
            C18070vi.A0d(r2, 0);
            C108965cb.A0Y(r4).A04(r2, (Long) null, (String) null, 35);
            C18100vl r0 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r4.A0K)).A02((AnonymousClass1BI) null, 101);
            C120886Gk r22 = this.A0B;
            C1406672l r02 = r22.A0A;
            if (!(r02 == null || (waTextView = r02.A0B) == null)) {
                waTextView.sendAccessibilityEvent(8);
            }
            C130866k8 r03 = r22.A0B;
            if (r03 != null) {
                WaTextView waTextView2 = r03.A03;
                waTextView2.requestFocus();
                waTextView2.setFocusableInTouchMode(true);
                waTextView2.performAccessibilityAction(64, (Bundle) null);
                waTextView2.sendAccessibilityEvent(8);
            }
            this.A0C.A02(true);
        } else if (i == 4) {
            C18100vl r04 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(this.A05.A0K)).A02((AnonymousClass1BI) null, 19);
            C120886Gk r23 = this.A0B;
            C1406672l r05 = r23.A0A;
            if (r05 != null) {
                r05.A06.setVisibility(0);
            }
            C130866k8 r06 = r23.A0B;
            if (r06 != null) {
                r06.A02.setVisibility(8);
            }
        }
    }

    public void A0V(boolean z) {
        super.A0V(z);
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.6Gk, X.70R] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120906Gm(X.C37571pl r53, X.C19880zA r54, X.C19880zA r55, X.C19880zA r56, X.C19880zA r57, X.AnonymousClass1L8 r58, X.AnonymousClass1L9 r59, X.C61862qP r60, X.AnonymousClass1KB r61, X.AnonymousClass11S r62, X.C34531kd r63, X.C40751vD r64, X.C33251iW r65, com.whatsapp.bridge.wfal.WfalManager r66, X.AnonymousClass1M9 r67, X.C24671Lf r68, X.C24921Me r69, X.C37451pZ r70, X.C27201Vd r71, X.C36531o3 r72, X.C137986wL r73, X.AnonymousClass11Q r74, X.AnonymousClass11C r75, X.AnonymousClass11P r76, X.C19830z4 r77, X.C18000vb r78, X.AnonymousClass1Q1 r79, X.C24681Lg r80, X.C36391no r81, X.AnonymousClass1WX r82, X.C24661Le r83, X.C32981i4 r84, X.C18030ve r85, X.C25931Qe r86, X.C88174Yp r87, X.C25191Ng r88, X.C62242r5 r89, X.C32861hs r90, X.AnonymousClass168 r91, X.AnonymousClass1c4 r92, X.AnonymousClass206 r93, X.C24641Lc r94, X.C132456mq r95, X.C129216hR r96, X.C32741hg r97, X.C1407572w r98, X.C131156kb r99, X.AnonymousClass6p9 r100, X.C139956zi r101, X.AnonymousClass10I r102, X.C139066y9 r103, X.AnonymousClass72B r104, X.C41821x7 r105, X.C30141dS r106, X.AnonymousClass00H r107, X.AnonymousClass00H r108, X.AnonymousClass00H r109) {
        /*
            r52 = this;
            r0 = 3
            r15 = r101
            r2 = r106
            X.C108975cc.A10(r15, r0, r2)
            r1 = 14
            r27 = r89
            r0 = r27
            X.C18070vi.A0d(r0, r1)
            r1 = 19
            r20 = r91
            r0 = r20
            X.C18070vi.A0d(r0, r1)
            r1 = 21
            r13 = r66
            r48 = r92
            r0 = r48
            X.C108975cc.A11(r0, r1, r13)
            r0 = 26
            r12 = r79
            X.C18070vi.A0d(r12, r0)
            r1 = 29
            r19 = r98
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r0 = 31
            r3 = r105
            X.C18070vi.A0d(r3, r0)
            r0 = 32
            r5 = r103
            X.C18070vi.A0d(r5, r0)
            r0 = 33
            r10 = r88
            X.C18070vi.A0d(r10, r0)
            r1 = 34
            r0 = r99
            X.C18070vi.A0d(r0, r1)
            r1 = 36
            r4 = r104
            X.C18070vi.A0d(r4, r1)
            r1 = 37
            r7 = r96
            X.C18070vi.A0d(r7, r1)
            r1 = 40
            r14 = r87
            X.C18070vi.A0d(r14, r1)
            r1 = 43
            r8 = r95
            X.C18070vi.A0d(r8, r1)
            r1 = r52
            r28 = r81
            r49 = r76
            r26 = r75
            r25 = r72
            r24 = r70
            r16 = r58
            r17 = r59
            r18 = r60
            r51 = r61
            r50 = r62
            r21 = r63
            r22 = r64
            r39 = r97
            r6 = r100
            r44 = r102
            r45 = r107
            r46 = r108
            r47 = r109
            r38 = r94
            r23 = r65
            r9 = r93
            r35 = r90
            r33 = r86
            r11 = r85
            r31 = r84
            r30 = r83
            r29 = r82
            r32 = r11
            r34 = r27
            r36 = r20
            r37 = r9
            r40 = r19
            r41 = r0
            r42 = r6
            r43 = r15
            r15 = r1
            r19 = r51
            r20 = r50
            r27 = r49
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r0 = r49
            r1.A0S = r0
            r0 = r50
            r1.A02 = r0
            r0 = r71
            r1.A0R = r0
            r1.A0E = r2
            r0 = r67
            r1.A0O = r0
            r0 = r69
            r1.A0Q = r0
            r0 = r78
            r1.A06 = r0
            r0 = r68
            r1.A0P = r0
            r0 = r80
            r1.A08 = r0
            r1.A0N = r13
            r1.A0T = r12
            r0 = r77
            r1.A05 = r0
            r1.A0D = r3
            r1.A0Z = r5
            r1.A0V = r10
            r0 = r74
            r1.A04 = r0
            r1.A0C = r4
            r1.A0W = r7
            r1.A09 = r14
            r1.A0A = r8
            r0 = r54
            r1.A0M = r0
            r0 = r55
            r1.A0L = r0
            r0 = r73
            r1.A03 = r0
            r0 = r56
            r1.A0J = r0
            r0 = r57
            r1.A0K = r0
            r0 = r33
            r1.A0U = r0
            r0 = r53
            r1.A0I = r0
            boolean r2 = r1.A0V
            X.6Gk r0 = new X.6Gk
            r0.<init>(r2)
            r1.A0X = r0
            r1.A0B = r0
            boolean r0 = r48.A08()
            r1.A0H = r0
            r2 = 9817(0x2659, float:1.3757E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r2)
            r1.A0G = r0
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            X.7q0 r0 = new X.7q0
            r0.<init>(r11)
            X.0vl r0 = X.AnonymousClass1DF.A00(r2, r0)
            r1.A0F = r0
            r3 = 1
            X.7FK r2 = new X.7FK
            r0 = r51
            r2.<init>(r0, r9, r1, r3)
            r1.A07 = r2
            X.6f3 r0 = new X.6f3
            r0.<init>(r9, r6)
            r1.A0Y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120906Gm.<init>(X.1pl, X.0zA, X.0zA, X.0zA, X.0zA, X.1L8, X.1L9, X.2qP, X.1KB, X.11S, X.1kd, X.1vD, X.1iW, com.whatsapp.bridge.wfal.WfalManager, X.1M9, X.1Lf, X.1Me, X.1pZ, X.1Vd, X.1o3, X.6wL, X.11Q, X.11C, X.11P, X.0z4, X.0vb, X.1Q1, X.1Lg, X.1no, X.1WX, X.1Le, X.1i4, X.0ve, X.1Qe, X.4Yp, X.1Ng, X.2r5, X.1hs, X.168, X.1c4, X.206, X.1Lc, X.6mq, X.6hR, X.1hg, X.72w, X.6kb, X.6p9, X.6zi, X.10I, X.6y9, X.72B, X.1x7, X.1dS, X.00H, X.00H, X.00H):void");
    }
}
