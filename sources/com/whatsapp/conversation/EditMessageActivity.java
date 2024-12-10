package com.whatsapp.conversation;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KW;
import X.AnonymousClass1YL;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21V;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NK;
import X.AnonymousClass3NL;
import X.AnonymousClass3TA;
import X.AnonymousClass3U2;
import X.AnonymousClass4J9;
import X.AnonymousClass4JA;
import X.AnonymousClass4SX;
import X.AnonymousClass4UI;
import X.AnonymousClass5GA;
import X.AnonymousClass5ZI;
import X.AnonymousClass74J;
import X.C000200d;
import X.C000400h;
import X.C006602x;
import X.C107845ai;
import X.C108605by;
import X.C1193267r;
import X.C143887Fe;
import X.C17890vO;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C26302CxJ;
import X.C27831Xu;
import X.C72473Md;
import X.C72483Me;
import X.C85704Ok;
import X.C91004ez;
import X.C92094gk;
import X.C94614ku;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

public final class EditMessageActivity extends AnonymousClass1FY {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ImageButton A04;
    public ScrollView A05;
    public CoordinatorLayout A06;
    public AnonymousClass4J9 A07;
    public AnonymousClass4JA A08;
    public KeyboardPopupLayout A09;
    public AnonymousClass3U2 A0A;
    public AnonymousClass5ZI A0B;
    public AnonymousClass4SX A0C;
    public AnonymousClass3TA A0D;
    public C1193267r A0E;
    public AnonymousClass4UI A0F;
    public MentionableEntry A0G;
    public C18010vc A0H;
    public AnonymousClass1DC A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public C85704Ok A0M;
    public boolean A0N;
    public final C107845ai A0O;
    public final C18100vl A0P;
    public final Handler A0Q;

    public EditMessageActivity() {
        this(0);
        this.A0Q = C17890vO.A0D();
        this.A0P = AnonymousClass1DF.A01(new AnonymousClass5GA(this));
        this.A0O = new C92094gk(this, 0);
    }

    public static final void A03(EditMessageActivity editMessageActivity) {
        EditMessageActivity editMessageActivity2 = editMessageActivity;
        MentionableEntry mentionableEntry = editMessageActivity.A0G;
        if (mentionableEntry != null) {
            Editable text = mentionableEntry.getText();
            if (text != null) {
                C18030ve r7 = editMessageActivity.A0E;
                AnonymousClass1KW r6 = editMessageActivity.A0D;
                AnonymousClass11C r5 = editMessageActivity.A08;
                C18010vc r8 = editMessageActivity.A0H;
                if (r8 != null) {
                    MentionableEntry mentionableEntry2 = editMessageActivity.A0G;
                    if (mentionableEntry2 != null) {
                        C26302CxJ.A0L(editMessageActivity2, text, mentionableEntry2.getPaint(), r5, r6, r7, r8, AnonymousClass1YL.A00(editMessageActivity, 2130970892, 2131102330), AnonymousClass1YL.A00(editMessageActivity, 2130970132, 2131101250), true);
                        return;
                    }
                } else {
                    C18070vi.A11("sharedPreferencesFactory");
                    throw null;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("entry");
        throw null;
    }

    public static final void A0c(EditMessageActivity editMessageActivity, AnonymousClass206 r10) {
        EditMessageActivity editMessageActivity2 = editMessageActivity;
        AnonymousClass3TA r8 = editMessageActivity.A0D;
        if (r8 != null) {
            C143887Fe r0 = r8.A00;
            if ((r0 == null || r0.A05 == null) && (!(r10 instanceof AnonymousClass21V) || ((AnonymousClass21V) r10).A18() == null)) {
                if (editMessageActivity.A0M == null) {
                    C85704Ok r4 = new C85704Ok(editMessageActivity2, editMessageActivity2.A04, new C94614ku(editMessageActivity, 0), r8, editMessageActivity.A05, false);
                    editMessageActivity2.A0M = r4;
                    ViewGroup viewGroup = editMessageActivity2.A03;
                    if (viewGroup == null) {
                        C18070vi.A11("webPagePreviewContainer");
                        throw null;
                    }
                    viewGroup.addView(r4.A04);
                }
                A0V(editMessageActivity2, 0);
                C85704Ok r1 = editMessageActivity2.A0M;
                if (r1 != null) {
                    AnonymousClass3TA r02 = editMessageActivity2.A0D;
                    if (r02 != null) {
                        C143887Fe r2 = r02.A00;
                        if (r2 != null) {
                            r1.A04.A0P(r2, (List) null, false);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } else {
                r8.A0b(r8.A0A);
                return;
            }
        }
        C18070vi.A11("webPagePreviewViewModel");
        throw null;
    }

    public static final void A0V(EditMessageActivity editMessageActivity, int i) {
        ViewGroup viewGroup = editMessageActivity.A03;
        if (viewGroup == null) {
            C18070vi.A11("webPagePreviewContainer");
            throw null;
        }
        viewGroup.setVisibility(i);
        A0Q(editMessageActivity);
    }

    public static final void A0d(EditMessageActivity editMessageActivity, boolean z) {
        View view = editMessageActivity.A02;
        if (view != null) {
            view.setEnabled(z);
            View view2 = editMessageActivity.A02;
            if (view2 != null) {
                if (view2 instanceof WaImageButton) {
                    ImageView imageView = (ImageView) view2;
                    Drawable drawable = imageView.getDrawable();
                    if (z) {
                        drawable.setTintList((ColorStateList) null);
                        imageView.setBackground((Drawable) null);
                        return;
                    }
                    C27831Xu.A0C(drawable, AnonymousClass3Ma.A00(editMessageActivity, 2130970507, 2131101877));
                    imageView.setBackgroundResource(2131231369);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("sendBtn");
        throw null;
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A0C = AnonymousClass3Ma.A0W(A0K2);
            this.A0B = (AnonymousClass5ZI) A0K2.A2I.get();
            this.A07 = (AnonymousClass4J9) A0K2.A2J.get();
            this.A0J = C000200d.A00(r3.A1c);
            this.A0K = C000200d.A00(r3.A1h);
            this.A0L = C000200d.A00(A0K2.A11);
            this.A0E = AnonymousClass3MZ.A0t(r2);
            this.A0H = AnonymousClass3Ma.A0r(r2);
            this.A0I = AnonymousClass3MZ.A13(r2);
            this.A08 = (AnonymousClass4JA) A0K2.A69.get();
        }
    }

    public void A3J() {
        AnonymousClass1BI r1;
        C108605by AHr = ((C006602x) C000400h.A00(C006602x.class, this)).AHr();
        Resources.Theme theme = getTheme();
        C18070vi.A0X(theme);
        AnonymousClass205 r0 = (AnonymousClass205) this.A0P.getValue();
        if (r0 != null) {
            r1 = r0.A00;
        } else {
            r1 = null;
        }
        AHr.CB2(theme, r1, false);
    }

    public void finish() {
        String str;
        View view = this.A00;
        if (view == null) {
            str = "footerContainer";
        } else {
            view.setVisibility(8);
            MentionableEntry mentionableEntry = this.A0G;
            if (mentionableEntry == null) {
                str = "entry";
            } else {
                mentionableEntry.A0H();
                super.finish();
                overridePendingTransition(0, 2130772022);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a1, code lost:
        if (r2 == null) goto L_0x03a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r4 = r38
            r0 = r39
            super.onCreate(r0)
            X.0ve r0 = r4.A0E
            r6 = 9071(0x236f, float:1.2711E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r5, r0, r6)
            r0 = 2131625163(0x7f0e04cb, float:1.8877526E38)
            if (r1 == 0) goto L_0x0019
            r0 = 2131625164(0x7f0e04cc, float:1.8877528E38)
        L_0x0019:
            r4.setContentView((int) r0)
            android.view.View r2 = X.AnonymousClass3MZ.A0F(r4)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131103241(0x7f060e09, float:1.7818943E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            androidx.appcompat.widget.Toolbar r3 = X.AnonymousClass3Ma.A0G(r4)
            r0 = 2131889633(0x7f120de1, float:1.9413935E38)
            r3.setTitle((int) r0)
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            int r0 = X.AnonymousClass3Ma.A00(r4, r1, r0)
            r3.setTitleTextColor((int) r0)
            boolean r1 = X.C22891Dp.A02
            r0 = 2131103204(0x7f060de4, float:1.7818868E38)
            if (r1 != 0) goto L_0x0056
            r1 = 2130970827(0x7f0408cb, float:1.7550375E38)
            r0 = 2131102235(0x7f060a1b, float:1.7816902E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x0056:
            int r2 = X.C19740yt.A00(r4, r0)
            r3.setBackgroundColor(r2)
            X.0vb r1 = r4.A00
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            X.AnonymousClass3NL.A02(r4, r3, r1, r0)
            r0 = 2131898718(0x7f12315e, float:1.9432362E38)
            r3.setNavigationContentDescription((int) r0)
            r1 = 1
            X.4dD r0 = new X.4dD
            r0.<init>(r4, r1)
            r3.setNavigationOnClickListener(r0)
            android.view.Window r0 = r4.getWindow()
            X.C18070vi.A0X(r0)
            X.C28271Zs.A00(r0, r2, r1)
            r1 = 2130772021(0x7f010035, float:1.7147149E38)
            r0 = 0
            r4.overridePendingTransition(r1, r0)
            X.4JA r1 = r4.A08
            if (r1 == 0) goto L_0x0500
            android.os.Handler r0 = r4.A0Q
            r3 = 0
            r2 = 1
            X.1It r1 = X.C91784gF.A00(r4, r3, r1, r0, r2)
            java.lang.Class<X.3TA> r0 = X.AnonymousClass3TA.class
            X.1J2 r0 = r1.A00(r0)
            X.3TA r0 = (X.AnonymousClass3TA) r0
            r4.A0D = r0
            X.0vl r1 = r4.A0P
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r7 = r1.getValue()
            X.205 r7 = (X.AnonymousClass205) r7
            if (r7 == 0) goto L_0x00f1
            X.4J9 r0 = r4.A07
            if (r0 == 0) goto L_0x00b9
            X.3TA r1 = r4.A0D
            if (r1 != 0) goto L_0x00bf
            java.lang.String r0 = "webPagePreviewViewModel"
            X.C18070vi.A11(r0)
            throw r3
        L_0x00b9:
            java.lang.String r0 = "editMessageViewModelFactory"
            X.C18070vi.A11(r0)
            throw r3
        L_0x00bf:
            X.1K2 r9 = r0.A00
            X.10E r8 = r9.A01
            X.11P r13 = X.AnonymousClass10E.A6O(r8)
            X.0ve r14 = X.AnonymousClass10E.A8r(r8)
            X.1gU r15 = X.AnonymousClass3MY.A0d(r8)
            X.00S r0 = r8.AA9
            java.lang.Object r10 = r0.get()
            X.181 r10 = (X.AnonymousClass181) r10
            X.1iW r11 = X.AnonymousClass3MZ.A0U(r8)
            X.1W6 r17 = X.AnonymousClass3Ma.A0s(r8)
            X.1K1 r0 = r9.A00
            X.00S r0 = r0.A0X
            X.00H r18 = X.C000200d.A00(r0)
            X.3U2 r9 = new X.3U2
            r12 = r1
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A0A = r9
        L_0x00f1:
            X.3U2 r0 = r4.A0A
            java.lang.String r19 = "editMessageViewModel"
            if (r0 == 0) goto L_0x04f8
            X.1DT r1 = r0.A03
            X.5Rj r0 = new X.5Rj
            r0.<init>(r4)
            r8 = 4
            X.C91644g1.A00(r4, r1, r0, r8)
            X.3U2 r0 = r4.A0A
            if (r0 == 0) goto L_0x04f8
            X.1DT r1 = r0.A05
            X.5Rk r0 = new X.5Rk
            r0.<init>(r4)
            X.C91644g1.A00(r4, r1, r0, r8)
            X.3U2 r0 = r4.A0A
            if (r0 == 0) goto L_0x04f8
            X.1DT r1 = r0.A04
            X.5Rl r0 = new X.5Rl
            r0.<init>(r4)
            X.C91644g1.A00(r4, r1, r0, r8)
            r0 = 2131429574(0x7f0b08c6, float:1.8480825E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r4.A09 = r0
            r0 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r4.A0G = r0
            r0 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r4.A04 = r0
            com.whatsapp.mentions.MentionableEntry r7 = r4.A0G
            java.lang.String r18 = "entry"
            if (r7 != 0) goto L_0x0149
            X.C18070vi.A11(r18)
            throw r3
        L_0x0149:
            int r1 = r7.getImeOptions()
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r7.setImeOptions(r1)
            X.3U2 r0 = r4.A0A
            if (r0 != 0) goto L_0x015b
            X.C18070vi.A11(r19)
            throw r3
        L_0x015b:
            X.206 r7 = r0.A0B
            if (r7 == 0) goto L_0x04fc
            r0 = 2131430951(0x7f0b0e27, float:1.8483617E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r4, r0)
            r4.A00 = r1
            r0 = 0
            r1.setAlpha(r0)
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r9 = r0.getConfiguration()
            com.whatsapp.KeyboardPopupLayout r1 = r4.A09
            if (r1 != 0) goto L_0x017e
            java.lang.String r0 = "keyboardPopupLayout"
            X.C18070vi.A11(r0)
            throw r3
        L_0x017e:
            X.4dh r0 = new X.4dh
            r0.<init>(r9, r4, r8)
            r1.addOnLayoutChangeListener(r0)
            r0 = 2131431653(0x7f0b10e5, float:1.8485041E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            r4.A01 = r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168773(0x7f070e05, float:1.7951857E38)
            int r10 = r1.getDimensionPixelOffset(r0)
            android.view.View r0 = r4.A01
            java.lang.String r17 = "inputLayout"
            if (r0 == 0) goto L_0x04f4
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.C18070vi.A0z(r9, r0)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x04f4
            int r0 = r9.leftMargin
            X.C27641Ww.A03(r1, r0, r10)
            X.5ZI r9 = r4.A0B
            if (r9 == 0) goto L_0x04ee
            X.1GP r1 = r4.getSupportFragmentManager()
            X.10I r0 = r4.A05
            X.2Py r0 = X.AnonymousClass68H.A01(r0)
            X.4a2 r1 = r9.BGL(r4, r1, r0)
            X.4kq r0 = new X.4kq
            r0.<init>(r4)
            X.3uP r1 = r1.A05(r0, r7)
            r0 = 0
            r1.setEnabled(r0)
            r0 = 2131432673(0x7f0b14e1, float:1.848711E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r4.A05 = r0
            java.lang.String r16 = "messageBubbleContainer"
            if (r0 == 0) goto L_0x04f0
            r0.addView(r1)
            android.widget.ScrollView r10 = r4.A05
            if (r10 == 0) goto L_0x04f0
            r0 = 14
            X.4rh r9 = new X.4rh
            r9.<init>(r4, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r10.postDelayed(r9, r0)
            X.0ve r0 = r4.A0E
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            if (r0 == 0) goto L_0x0286
            r0 = 2131429666(0x7f0b0922, float:1.8481011E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r4.A06 = r0
            android.widget.ScrollView r0 = r4.A05
            if (r0 == 0) goto L_0x0282
            int r11 = r0.getHeight()
            X.00H r0 = r4.A0L
            if (r0 == 0) goto L_0x027c
            java.lang.Object r13 = r0.get()
            X.74J r13 = (X.AnonymousClass74J) r13
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = r4.A06
            java.lang.String r16 = "rootLayout"
            if (r12 == 0) goto L_0x0282
            android.widget.ImageButton r10 = r4.A04
            java.lang.String r9 = "emojiBtn"
            if (r10 != 0) goto L_0x022a
            X.C18070vi.A11(r9)
            throw r3
        L_0x022a:
            com.whatsapp.mentions.MentionableEntry r6 = r4.A0G
            if (r6 != 0) goto L_0x0232
            X.C18070vi.A11(r18)
            throw r3
        L_0x0232:
            com.whatsapp.KeyboardPopupLayout r1 = r4.A09
            java.lang.String r16 = "keyboardPopupLayout"
            if (r1 == 0) goto L_0x0282
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            r5 = 0
            r22 = r4
            r25 = r12
            r24 = r10
            r26 = r1
            r27 = r6
            r28 = r0
            r29 = r3
            r30 = r5
            r20 = r13
            r21 = r4
            r23 = r12
            r20.A0L(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.4n6 r0 = new X.4n6
            r0.<init>(r4)
            r13.A0D = r0
            android.widget.ImageButton r1 = r4.A04
            if (r1 != 0) goto L_0x026a
            X.C18070vi.A11(r9)
            throw r3
        L_0x026a:
            r0 = 13
            X.C90104dX.A00(r1, r4, r11, r0)
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0G
            if (r0 != 0) goto L_0x0277
            X.C18070vi.A11(r18)
            throw r3
        L_0x0277:
            X.C89904dD.A00(r0, r4, r5)
            goto L_0x0334
        L_0x027c:
            java.lang.String r0 = "expressionsTrayController"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0282:
            X.C18070vi.A11(r16)
            throw r3
        L_0x0286:
            X.0ve r0 = r4.A0E
            r22 = r0
            X.1L4 r0 = r4.A09
            r21 = r0
            X.190 r0 = r4.A03
            r23 = r0
            X.1KW r0 = r4.A0D
            r20 = r0
            X.67r r13 = r4.A0E
            if (r13 == 0) goto L_0x04e8
            X.11C r15 = r4.A08
            X.0vb r14 = r4.A00
            X.00H r0 = r4.A0J
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r12 = r0.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r12 = (com.whatsapp.emoji.search.EmojiSearchProvider) r12
            X.0z4 r11 = r4.A0A
            X.0vc r10 = r4.A0H
            if (r10 == 0) goto L_0x04dc
            com.whatsapp.KeyboardPopupLayout r9 = r4.A09
            java.lang.String r16 = "keyboardPopupLayout"
            if (r9 != 0) goto L_0x02b8
            X.C18070vi.A11(r16)
            throw r3
        L_0x02b8:
            android.widget.ImageButton r6 = r4.A04
            if (r6 != 0) goto L_0x02c2
            java.lang.String r18 = "emojiBtn"
        L_0x02be:
            X.C18070vi.A11(r18)
            throw r3
        L_0x02c2:
            com.whatsapp.mentions.MentionableEntry r5 = r4.A0G
            if (r5 == 0) goto L_0x02be
            r0 = 16
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
            X.3U2 r0 = r4.A0A
            if (r0 != 0) goto L_0x02d3
            r18 = r19
            goto L_0x02be
        L_0x02d3:
            X.206 r0 = r0.A0B
            if (r0 == 0) goto L_0x031b
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x031b
            X.1BI r0 = r0.A00
        L_0x02dd:
            java.lang.Integer r37 = X.A3P.A00(r0)
            X.00H r0 = r4.A0K
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r1 = r0.get()
            X.A59 r1 = (X.A59) r1
            X.3d3 r0 = new X.3d3
            r24 = r9
            r25 = r5
            r26 = r15
            r27 = r11
            r28 = r14
            r29 = r1
            r30 = r13
            r31 = r20
            r32 = r12
            r33 = r22
            r34 = r10
            r35 = r21
            r20 = r0
            r21 = r4
            r22 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.5ai r1 = r4.A0O
            r0.A0J(r1)
            com.whatsapp.KeyboardPopupLayout r5 = r4.A09
            if (r5 != 0) goto L_0x031d
            X.C18070vi.A11(r16)
            throw r3
        L_0x031b:
            r0 = r3
            goto L_0x02dd
        L_0x031d:
            r1 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r5, r1)
            com.whatsapp.emoji.search.EmojiSearchContainer r5 = (com.whatsapp.emoji.search.EmojiSearchContainer) r5
            X.4UI r1 = new X.4UI
            r1.<init>(r4, r0, r5)
            r4.A0F = r1
            X.4n0 r0 = new X.4n0
            r0.<init>(r4, r2)
            r1.A00 = r0
        L_0x0334:
            android.view.Window r1 = r4.getWindow()
            r0 = 5
            r1.setSoftInputMode(r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            X.1EC r6 = X.C42941yz.A00(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0G
            if (r0 == 0) goto L_0x04d2
            boolean r0 = r0.A0O(r6)
            if (r0 == 0) goto L_0x0382
            r0 = 2131432483(0x7f0b1423, float:1.8486725E38)
            android.view.ViewGroup r10 = X.AnonymousClass3MX.A0F(r4, r0)
            com.whatsapp.mentions.MentionableEntry r5 = r4.A0G
            if (r5 == 0) goto L_0x04d2
            r1 = 0
            X.4oS r0 = new X.4oS
            r0.<init>(r4, r1)
            r5.A0C = r0
            r13 = r1
            r15 = r1
            r9 = r5
            r11 = r6
            r12 = r1
            r14 = r2
            r9.A0M(r10, r11, r12, r13, r14, r15)
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04d2
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x037c
            r1.A05 = r0
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            if (r0 != 0) goto L_0x0380
            r17 = r16
        L_0x037c:
            X.C18070vi.A11(r17)
            throw r3
        L_0x0380:
            r1.A04 = r0
        L_0x0382:
            boolean r1 = r7.A0w()
            r0 = 2131899167(0x7f12331f, float:1.9433272E38)
            if (r1 == 0) goto L_0x038e
            r0 = 2131888692(0x7f120a34, float:1.9412027E38)
        L_0x038e:
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04ce
            java.lang.String r0 = r4.getString(r0)
            r1.setHint(r0)
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x03f1
            java.lang.String r2 = r7.A0P()
        L_0x03a1:
            if (r2 != 0) goto L_0x03d1
        L_0x03a3:
            boolean r0 = r7.A0w()
            if (r0 != 0) goto L_0x03cf
            r4.finish()
        L_0x03ac:
            r0 = 2131437043(0x7f0b25f3, float:1.8495974E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r4, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.A03 = r0
            X.3TA r0 = r4.A0D
            java.lang.String r6 = "webPagePreviewViewModel"
            if (r0 == 0) goto L_0x04ca
            X.1DS r1 = r0.A0H
            X.5Uo r0 = new X.5Uo
            r0.<init>(r4, r7)
            X.C91644g1.A00(r4, r1, r0, r8)
            X.3U2 r0 = r4.A0A
            if (r0 != 0) goto L_0x040f
            X.C18070vi.A11(r19)
            throw r3
        L_0x03cf:
            java.lang.String r2 = ""
        L_0x03d1:
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04ce
            java.util.List r0 = r7.A0h
            r1.setMentionableText(r2, r0)
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04ce
            int r0 = r1.getSelectionEnd()
            r1.setSelection(r0)
            A03(r4)
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04ce
            r0 = 0
            r1.A0I(r0)
            goto L_0x03ac
        L_0x03f1:
            boolean r0 = r7 instanceof X.C438421d
            if (r0 != 0) goto L_0x0407
            boolean r0 = r7 instanceof X.AnonymousClass21Y
            if (r0 != 0) goto L_0x0407
            boolean r0 = r7 instanceof X.C440021t
            if (r0 != 0) goto L_0x0407
            boolean r0 = r7 instanceof X.C438921i
            if (r0 == 0) goto L_0x03a3
            r0 = r7
            X.21i r0 = (X.C438921i) r0
            java.lang.String r2 = r0.A01
            goto L_0x03a1
        L_0x0407:
            r0 = r7
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r2 = r0.A18()
            goto L_0x03a1
        L_0x040f:
            X.7Fe r5 = r0.A07
            if (r5 == 0) goto L_0x046b
            X.3TA r1 = r4.A0D
            if (r1 == 0) goto L_0x04ca
            java.lang.String r0 = r5.A0S
            r1.A0a(r0)
            X.3TA r2 = r4.A0D
            if (r2 == 0) goto L_0x04ca
            r2.A0X(r5)
            java.lang.String r5 = r5.A0S
            X.36w r1 = X.C60502o8.A00(r7)
            if (r1 == 0) goto L_0x043d
            java.lang.String r0 = r2.A0A
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x043d
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r2.A07 = r0
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x043d
            r2.A05 = r1
        L_0x043d:
            X.3TA r2 = r4.A0D
            if (r2 == 0) goto L_0x04ca
            X.0ve r0 = r4.A0E
            X.C18070vi.A0W(r0)
            X.36w r1 = X.C50372Ue.A00(r0, r7)
            if (r1 == 0) goto L_0x045e
            java.lang.String r0 = r2.A0A
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x045e
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r2.A06 = r0
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x045e
            r2.A04 = r1
        L_0x045e:
            X.3TA r0 = r4.A0D
            if (r0 == 0) goto L_0x04ca
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x046b
            A0c(r4, r7)
        L_0x046b:
            r0 = 2131435142(0x7f0b1e86, float:1.8492118E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r4, r0)
            r4.A02 = r1
            java.lang.String r6 = "sendBtn"
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MY.A08(r4)
            X.AnonymousClass4W7.A00(r0, r1)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169545(0x7f071109, float:1.7953423E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x04c6
            boolean r0 = r1 instanceof com.whatsapp.WaImageButton
            if (r0 == 0) goto L_0x0497
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
        L_0x0497:
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x04c6
            r0.setPadding(r2, r2, r2, r2)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x04c6
            r0 = 34
            X.AnonymousClass48m.A00(r1, r4, r0)
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0G
            r6 = r18
            if (r0 == 0) goto L_0x04c6
            X.AnonymousClass48E.A00(r0, r4, r8)
            com.whatsapp.mentions.MentionableEntry r5 = r4.A0G
            if (r5 == 0) goto L_0x04c6
            X.0vb r2 = r4.A00
            X.C18070vi.A0W(r2)
            com.whatsapp.mentions.MentionableEntry r1 = r4.A0G
            if (r1 == 0) goto L_0x04c6
            X.48C r0 = new X.48C
            r0.<init>(r1, r2)
            r5.addTextChangedListener(r0)
            return
        L_0x04c6:
            X.C18070vi.A11(r6)
            throw r3
        L_0x04ca:
            X.C18070vi.A11(r6)
            throw r3
        L_0x04ce:
            X.C18070vi.A11(r18)
            throw r3
        L_0x04d2:
            X.C18070vi.A11(r18)
            throw r3
        L_0x04d6:
            java.lang.String r0 = "expressionUserJourneyLogger"
            X.C18070vi.A11(r0)
            throw r3
        L_0x04dc:
            java.lang.String r0 = "sharedPreferencesFactory"
            X.C18070vi.A11(r0)
            throw r3
        L_0x04e2:
            java.lang.String r0 = "emojiSearchProvider"
            X.C18070vi.A11(r0)
            throw r3
        L_0x04e8:
            java.lang.String r0 = "recentEmojis"
            X.C18070vi.A11(r0)
            throw r3
        L_0x04ee:
            java.lang.String r16 = "conversationRowInflatorFactory"
        L_0x04f0:
            X.C18070vi.A11(r16)
            throw r3
        L_0x04f4:
            X.C18070vi.A11(r17)
            throw r3
        L_0x04f8:
            X.C18070vi.A11(r19)
            throw r3
        L_0x04fc:
            r4.finish()
            return
        L_0x0500:
            java.lang.String r0 = "webPagePreviewViewModelFactory"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.EditMessageActivity.onCreate(android.os.Bundle):void");
    }

    public static final void A0Q(EditMessageActivity editMessageActivity) {
        String str;
        int i = 2131231611;
        MentionableEntry mentionableEntry = editMessageActivity.A0G;
        if (mentionableEntry == null) {
            str = "entry";
        } else {
            if (mentionableEntry.A0M) {
                i = 2131231609;
            } else {
                ViewGroup viewGroup = editMessageActivity.A03;
                if (viewGroup == null) {
                    str = "webPagePreviewContainer";
                } else if (viewGroup.getVisibility() == 0) {
                    i = 2131231608;
                }
            }
            View view = editMessageActivity.A01;
            if (view == null) {
                str = "inputLayout";
            } else {
                AnonymousClass3NK.A00(AnonymousClass3NL.A00(editMessageActivity, editMessageActivity.A00, i), view);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (C18020vd.A05(C18040vf.A02, this.A0E, 9071)) {
            AnonymousClass00H r0 = this.A0L;
            if (r0 != null) {
                ((AnonymousClass74J) r0.get()).A0G();
            } else {
                C18070vi.A11("expressionsTrayController");
                throw null;
            }
        }
    }

    public EditMessageActivity(int i) {
        this.A0N = false;
        C91004ez.A00(this, 24);
    }
}
