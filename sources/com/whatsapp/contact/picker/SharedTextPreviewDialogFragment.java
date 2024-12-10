package com.whatsapp.contact.picker;

import X.A3P;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1PU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48m;
import X.AnonymousClass4QJ;
import X.AnonymousClass4UI;
import X.AnonymousClass4WC;
import X.AnonymousClass6Ie;
import X.AnonymousClass6g9;
import X.AnonymousClass75B;
import X.AnonymousClass793;
import X.AnonymousClass79B;
import X.AnonymousClass7EM;
import X.AnonymousClass7GD;
import X.C107845ai;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C114545r0;
import X.C1193267r;
import X.C142987Bo;
import X.C143887Fe;
import X.C144657Ie;
import X.C146497Pi;
import X.C146817Qs;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C19830z4;
import X.C20016A3i;
import X.C22971Dz;
import X.C32011gU;
import X.C32741hg;
import X.C42171xk;
import X.C43251zV;
import X.C72463Mc;
import X.C74873d3;
import X.C87894Xm;
import X.C91254fO;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class SharedTextPreviewDialogFragment extends Hilt_SharedTextPreviewDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass190 A01;
    public AnonymousClass181 A02;
    public C143887Fe A03;
    public SharedTextPreviewScrollView A04;
    public C19830z4 A05;
    public C74873d3 A06;
    public AnonymousClass1L2 A07;
    public C1193267r A08;
    public AnonymousClass1KW A09;
    public AnonymousClass18K A0A;
    public C87894Xm A0B;
    public C32011gU A0C;
    public MentionableEntry A0D;
    public C18010vc A0E;
    public AnonymousClass4QJ A0F;
    public C32741hg A0G;
    public AnonymousClass1PU A0H;
    public AnonymousClass1L4 A0I;
    public AnonymousClass10I A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public Runnable A0O = null;
    public String A0P;
    public String A0Q;
    public boolean A0R = false;
    public boolean A0S = true;
    public View A0T;
    public ImageButton A0U;
    public String A0V;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y = false;
    public final Handler A0Z = C17890vO.A0D();
    public final C107845ai A0a = new C142987Bo(this, 0);

    public static SharedTextPreviewDialogFragment A00(String str, List list, boolean z, boolean z2, boolean z3) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
        Hilt_BaseSharedPreviewDialogFragment hilt_BaseSharedPreviewDialogFragment = new Hilt_BaseSharedPreviewDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putStringArrayList("jids", C22971Dz.A0B(list));
        hilt_BaseSharedPreviewDialogFragment.A1R(A0D2);
        Bundle A15 = hilt_BaseSharedPreviewDialogFragment.A15();
        A15.putString("message", str);
        A15.putBoolean("has_text_from_url", z);
        A15.putBoolean("fb_share_wa_redirect", z2);
        A15.putBoolean("disable_post_send_intent", z3);
        sharedTextPreviewDialogFragment.A1R(A15);
        return sharedTextPreviewDialogFragment;
    }

    public static void A01(Editable editable, SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment, boolean z) {
        String A022 = sharedTextPreviewDialogFragment.A0C.A02(editable.toString());
        sharedTextPreviewDialogFragment.A0Q = A022;
        if (A022 == null || A022.equals(sharedTextPreviewDialogFragment.A0P) || sharedTextPreviewDialogFragment.A0F.A00()) {
            A02((C143887Fe) null, sharedTextPreviewDialogFragment);
            return;
        }
        sharedTextPreviewDialogFragment.A0P = null;
        C143887Fe r0 = sharedTextPreviewDialogFragment.A03;
        if (r0 == null || !TextUtils.equals(r0.A0S, A022)) {
            A02(C20016A3i.A00(A022), sharedTextPreviewDialogFragment);
            if (sharedTextPreviewDialogFragment.A03 == null) {
                Runnable runnable = sharedTextPreviewDialogFragment.A0O;
                if (runnable != null) {
                    sharedTextPreviewDialogFragment.A0Z.removeCallbacks(runnable);
                    sharedTextPreviewDialogFragment.A0O = null;
                }
                if (z) {
                    AnonymousClass1KB r3 = sharedTextPreviewDialogFragment.A05;
                    AnonymousClass10I r9 = sharedTextPreviewDialogFragment.A0J;
                    AnonymousClass4WC.A00(r3, new C143887Fe(sharedTextPreviewDialogFragment.A02, sharedTextPreviewDialogFragment.A02, sharedTextPreviewDialogFragment.A0C, A022), sharedTextPreviewDialogFragment.A01, sharedTextPreviewDialogFragment.A02, sharedTextPreviewDialogFragment.A0A, new C144657Ie(sharedTextPreviewDialogFragment, 0), r9, A022, false);
                    return;
                }
                C146817Qs r32 = new C146817Qs(4, A022, sharedTextPreviewDialogFragment);
                sharedTextPreviewDialogFragment.A0O = r32;
                sharedTextPreviewDialogFragment.A0Z.postDelayed(r32, 700);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.getVisibility() != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r5) {
        /*
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r5.A09
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getVisibility()
            r1 = 2131168716(0x7f070dcc, float:1.7951742E38)
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            r1 = 2131168717(0x7f070dcd, float:1.7951744E38)
        L_0x0010:
            X.1FL r0 = r5.A1D()
            int r3 = X.AnonymousClass3MZ.A01(r0, r1)
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r0 = r0.getPaddingBottom()
            if (r0 == r3) goto L_0x0035
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r4 = r5.A04
            int r2 = r4.getPaddingLeft()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r1 = r0.getPaddingTop()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A04
            int r0 = r0.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
        L_0x0035:
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A0T
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A03
            r0.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            r0 = r2[r0]
            int r1 = r1 - r0
            if (r1 >= r3) goto L_0x0051
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
        L_0x0051:
            android.widget.ImageButton r0 = r5.A0U
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0)
            r2.bottomMargin = r3
            r0 = 9
            r2.addRule(r0)
            r1 = 8
            r0 = 2131435877(0x7f0b2165, float:1.8493609E38)
            r2.addRule(r1, r0)
            android.widget.ImageButton r0 = r5.A0U
            r0.setLayoutParams(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A03(com.whatsapp.contact.picker.SharedTextPreviewDialogFragment):void");
    }

    public static void A04(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        ViewGroup viewGroup;
        if (sharedTextPreviewDialogFragment.A09 != null && (viewGroup = sharedTextPreviewDialogFragment.A02) != null && viewGroup.getVisibility() == 0 && !sharedTextPreviewDialogFragment.A0R) {
            sharedTextPreviewDialogFragment.A0R = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C108945cZ.A04(sharedTextPreviewDialogFragment.A02));
            translateAnimation.setDuration(150);
            C114545r0.A00(translateAnimation, sharedTextPreviewDialogFragment, 3);
            sharedTextPreviewDialogFragment.A09.startAnimation(translateAnimation);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        boolean z;
        String replaceFirst;
        super.A1q(bundle, layoutInflater, viewGroup);
        int i = 0;
        this.A0D.addView(AnonymousClass3MZ.A0E(this).inflate(2131626953, (ViewGroup) null, false));
        this.A04 = (SharedTextPreviewScrollView) this.A0D.findViewById(2131435877);
        this.A0D = (MentionableEntry) this.A0D.findViewById(2131432484);
        this.A0T = this.A0D.findViewById(2131435844);
        C18000vb r0 = this.A01;
        MentionableEntry mentionableEntry = this.A0D;
        if (AnonymousClass3MW.A1Z(r0)) {
            C72463Mc.A14(mentionableEntry, 2, mentionableEntry.getPaddingTop());
        } else {
            mentionableEntry.setPadding(mentionableEntry.getPaddingLeft(), mentionableEntry.getPaddingTop(), 2, mentionableEntry.getPaddingBottom());
        }
        this.A0D.addTextChangedListener(new AnonymousClass6Ie(this));
        this.A0D.setInputType(131073);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A00.findViewById(2131430312);
        this.A0U = (ImageButton) this.A0D.findViewById(2131430310);
        AnonymousClass1FL A1B = A1B();
        C18030ve r19 = this.A02;
        AnonymousClass1L4 r17 = this.A0I;
        AnonymousClass190 r18 = this.A01;
        AnonymousClass1KW r15 = this.A09;
        C1193267r r14 = this.A08;
        AnonymousClass11C r7 = this.A08;
        C18000vb r6 = this.A01;
        EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A0K.get();
        C19830z4 r4 = this.A05;
        C18010vc r3 = this.A0E;
        ImageButton imageButton = this.A0U;
        MentionableEntry mentionableEntry2 = this.A0D;
        Integer A0h = AnonymousClass3MY.A0h();
        List list = this.A0A;
        if (list == null || list.isEmpty()) {
            num = null;
        } else if (list.size() == 1) {
            num = A3P.A00(C108945cZ.A0i(list, 0));
        } else {
            num = C108955ca.A0e();
        }
        AnonymousClass1L4 r30 = r17;
        ImageButton imageButton2 = imageButton;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C74873d3 r152 = new C74873d3(A1B, imageButton2, r18, keyboardPopupLayout2, mentionableEntry2, r7, r4, r6, C108945cZ.A0e(this.A0L), r14, r15, emojiSearchProvider, r19, r3, r30, A0h, num);
        this.A06 = r152;
        AnonymousClass4UI r42 = new AnonymousClass4UI(A1B(), r152, this.A0F);
        r42.A00 = new AnonymousClass7GD(this, 0);
        C74873d3 r32 = this.A06;
        r32.A0J(this.A0a);
        r32.A0E = new C146497Pi(this, r42, 11);
        String A022 = this.A0C.A02(this.A0V);
        if (A022 == null || (replaceFirst = this.A0V.replaceFirst(Pattern.quote(A022), "")) == null || !replaceFirst.trim().isEmpty()) {
            z = true;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("\n\n");
            this.A0V = AnonymousClass000.A0y(this.A0V, A10);
            z = false;
        }
        A2H();
        this.A0D.setText(C43251zV.A05(A1B(), this.A09, this.A0V));
        A01(this.A0D.getText(), this, true);
        this.A0D.requestFocus();
        Window window = this.A03.getWindow();
        C17960vV.A07(window);
        window.setSoftInputMode(5);
        MentionableEntry mentionableEntry3 = this.A0D;
        if (z) {
            i = AnonymousClass3Ma.A03(mentionableEntry3);
        }
        mentionableEntry3.setSelection(i);
        SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A04;
        sharedTextPreviewScrollView.A00 = new AnonymousClass7EM(this);
        Boolean bool = C17970vW.A03;
        AnonymousClass793.A00(sharedTextPreviewScrollView.getViewTreeObserver(), this, 6);
        this.A04.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass79B(this, 0));
        this.A04.setOverScrollMode(2);
        AnonymousClass3Ma.A1B(this.A0B, this, 40);
        this.A03.setOnKeyListener(new AnonymousClass75B(this, 0));
        A03(this);
        return this.A00;
    }

    public /* synthetic */ void A2I() {
        String A0h = C108985cd.A0h(this.A0D);
        if (A0h.length() == 0) {
            this.A05.A08(2131892920, 0);
            return;
        }
        boolean z = true;
        if (!C42171xk.A00(this.A0V.trim(), A0h)) {
            this.A0B.A00();
        }
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("has_text_from_url", this.A0X);
        WebPagePreviewView webPagePreviewView = this.A09;
        if (webPagePreviewView == null || webPagePreviewView.getVisibility() != 0) {
            z = false;
        }
        A0D2.putBoolean("load_preview", z);
        A0D2.putBoolean("fb_share_wa_redirect", this.A0Y);
        A0D2.putBoolean("disable_post_send_intent", this.A0W);
        List list = this.A0A;
        if (C108985cd.A1Z(this.A0N)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C22971Dz.A0a(C17880vN.A0S(it))) {
                        this.A0G.A0F((Integer) null, C108955ca.A0h(), C17880vN.A0i());
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.A0E.CHd(A0D2, A0h, this.A0A);
        A28();
        if (this.A0Y) {
            A1B().finish();
            A1B().overridePendingTransition(0, 17432577);
        }
    }

    public static void A02(C143887Fe r10, SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        TranslateAnimation translateAnimation;
        View view;
        AnonymousClass6g9 r0;
        if (sharedTextPreviewDialogFragment.A1B() != null) {
            if (r10 != null) {
                if (!TextUtils.equals(sharedTextPreviewDialogFragment.A0Q, r10.A0S)) {
                    return;
                }
                if (r10.A0K()) {
                    sharedTextPreviewDialogFragment.A03 = r10;
                    if (sharedTextPreviewDialogFragment.A09 == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(sharedTextPreviewDialogFragment.A1D());
                        sharedTextPreviewDialogFragment.A09 = webPagePreviewView;
                        webPagePreviewView.setForeground((Drawable) null);
                        sharedTextPreviewDialogFragment.A09.setMinimumHeight(AnonymousClass3MZ.A09(sharedTextPreviewDialogFragment).getDimensionPixelSize(2131168718));
                        sharedTextPreviewDialogFragment.A09.setImageContentBackgroundResource(0);
                        sharedTextPreviewDialogFragment.A09.setImageContentEnabled(false);
                        sharedTextPreviewDialogFragment.A02.addView(sharedTextPreviewDialogFragment.A09);
                        sharedTextPreviewDialogFragment.A09.A0H();
                        sharedTextPreviewDialogFragment.A09.setImageProgressBarVisibility(false);
                        sharedTextPreviewDialogFragment.A09.setImageContentMinimumHeight(AnonymousClass3MZ.A09(sharedTextPreviewDialogFragment).getDimensionPixelSize(2131167235));
                        sharedTextPreviewDialogFragment.A09.setImageCancelClickListener(new AnonymousClass48m(sharedTextPreviewDialogFragment, 27));
                        C143887Fe r02 = sharedTextPreviewDialogFragment.A03;
                        if (!(r02 == null || (r0 = r02.A05) == null)) {
                            String str = r0.A01;
                            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                sharedTextPreviewDialogFragment.A09.setImageContentEnabled(true);
                            }
                        }
                        sharedTextPreviewDialogFragment.A09.setImageContentClickListener(new AnonymousClass48m(sharedTextPreviewDialogFragment, 28));
                    }
                    A03(sharedTextPreviewDialogFragment);
                    if (!(sharedTextPreviewDialogFragment.A02.getVisibility() == 0 || sharedTextPreviewDialogFragment.A09 == null || sharedTextPreviewDialogFragment.A0R)) {
                        sharedTextPreviewDialogFragment.A0R = true;
                        int[] iArr = {0, 0};
                        sharedTextPreviewDialogFragment.A0D.getLocationOnScreen(iArr);
                        int A022 = AnonymousClass3MW.A02(sharedTextPreviewDialogFragment.A0D, iArr[1]);
                        int[] iArr2 = {0, 0};
                        sharedTextPreviewDialogFragment.A00.findViewById(2131434402).getLocationOnScreen(iArr2);
                        int i = iArr2[1];
                        int A052 = C108945cZ.A05(A022, i);
                        int dimensionPixelSize = AnonymousClass3MZ.A09(sharedTextPreviewDialogFragment).getDimensionPixelSize(2131168718) - AnonymousClass3MZ.A09(sharedTextPreviewDialogFragment).getDimensionPixelSize(2131168719);
                        if (A052 > dimensionPixelSize || (i == 0 && A022 == 0)) {
                            sharedTextPreviewDialogFragment.A2H();
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, C108945cZ.A04(sharedTextPreviewDialogFragment.A02), 0.0f);
                            translateAnimation.setDuration(150);
                            translateAnimation.setDuration(150);
                            sharedTextPreviewDialogFragment.A02.setVisibility(0);
                            sharedTextPreviewDialogFragment.A01.setVisibility(0);
                            view = sharedTextPreviewDialogFragment.A09;
                        } else {
                            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-dimensionPixelSize));
                            translateAnimation.setDuration(150);
                            C114545r0.A00(translateAnimation, sharedTextPreviewDialogFragment, 2);
                            view = sharedTextPreviewDialogFragment.A04;
                        }
                        view.startAnimation(translateAnimation);
                        sharedTextPreviewDialogFragment.A0R = false;
                    }
                    sharedTextPreviewDialogFragment.A0D.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = sharedTextPreviewDialogFragment.A09;
                    C17960vV.A05(webPagePreviewView2);
                    webPagePreviewView2.A0P(r10, (List) null, false);
                    return;
                }
            }
            sharedTextPreviewDialogFragment.A03 = null;
            A04(sharedTextPreviewDialogFragment);
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 27 && i2 == -1) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                this.A00.A08(A1B(), AnonymousClass1LU.A02(A1B));
                A1B().finish();
            }
            A28();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (bundle == null) {
            this.A0B.A01(new C91254fO(3), 110);
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A06.isShowing()) {
                this.A06.dismiss();
            }
            C108965cb.A0B(this).setSoftInputMode(2);
        }
        return super.A24(menuItem);
    }

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        String string = A15.getString("message");
        C17960vV.A08(string, "null message");
        this.A0V = string;
        boolean z = A15.getBoolean("has_text_from_url");
        C17960vV.A08(Boolean.valueOf(z), "null hasTextFromUrl");
        this.A0X = z;
        this.A0Y = A15.getBoolean("fb_share_wa_redirect");
        this.A0W = A15.getBoolean("disable_post_send_intent");
        return super.A27(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}
