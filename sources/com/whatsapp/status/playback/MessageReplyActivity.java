package com.whatsapp.status.playback;

import X.A1M;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1NM;
import X.AnonymousClass1OW;
import X.AnonymousClass1PM;
import X.AnonymousClass1SB;
import X.AnonymousClass206;
import X.AnonymousClass2GP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3V4;
import X.AnonymousClass4JZ;
import X.AnonymousClass4SK;
import X.AnonymousClass4VN;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass4aJ;
import X.AnonymousClass689;
import X.AnonymousClass6RP;
import X.AnonymousClass722;
import X.AnonymousClass724;
import X.AnonymousClass736;
import X.AnonymousClass73X;
import X.AnonymousClass74M;
import X.AnonymousClass758;
import X.AnonymousClass77C;
import X.AnonymousClass77J;
import X.AnonymousClass788;
import X.AnonymousClass78E;
import X.AnonymousClass78P;
import X.AnonymousClass7GH;
import X.AnonymousClass7MX;
import X.AnonymousClass7O7;
import X.AnonymousClass7OC;
import X.AnonymousClass7Q7;
import X.AnonymousClass7RH;
import X.AnonymousClass7RQ;
import X.AnonymousClass875;
import X.AnonymousClass8A7;
import X.BDO;
import X.C107845ai;
import X.C107985aw;
import X.C108355bZ;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C111185ii;
import X.C114955sg;
import X.C115095tO;
import X.C117015z4;
import X.C117025z5;
import X.C121826Lq;
import X.C125946bw;
import X.C128446g0;
import X.C129276hX;
import X.C132676nN;
import X.C133416oi;
import X.C133846pb;
import X.C134206qD;
import X.C135486sH;
import X.C137746vx;
import X.C139546z1;
import X.C140126zz;
import X.C1409873v;
import X.C1411674o;
import X.C1412374v;
import X.C1418377d;
import X.C142987Bo;
import X.C143707Em;
import X.C143887Fe;
import X.C146707Qh;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C191769n9;
import X.C196149uX;
import X.C19740yt;
import X.C219217x;
import X.C22971Dz;
import X.C23221Fe;
import X.C23501Gn;
import X.C24191Jf;
import X.C24641Lc;
import X.C24921Me;
import X.C25491Ok;
import X.C26302CxJ;
import X.C26421Sb;
import X.C26521Sl;
import X.C26631Sw;
import X.C26911Ty;
import X.C27201Vd;
import X.C27641Ww;
import X.C28931bI;
import X.C29111bd;
import X.C30801eX;
import X.C31131f4;
import X.C32021gV;
import X.C32741hg;
import X.C33251iW;
import X.C34531kd;
import X.C36401np;
import X.C43421zm;
import X.C692236j;
import X.C72453Mb;
import X.C73203Rj;
import X.C80753xv;
import X.C85424Ni;
import X.C85754Op;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

public class MessageReplyActivity extends C114955sg implements AnonymousClass8A7, C107985aw, C23221Fe {
    public static final Interpolator A1s = C29111bd.A00(0.32f, 0.0f, 0.67f, 0.0f);
    public static final Interpolator A1t = C29111bd.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A1u = C17880vN.A11();
    public static final HashMap A1v = C17880vN.A11();
    public AnimatorSet A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public FrameLayout A08;
    public GridLayout A09;
    public GridLayout A0A;
    public ImageButton A0B;
    public MaterialButtonToggleGroup A0C;
    public AnonymousClass4JZ A0D;
    public C34531kd A0E;
    public C33251iW A0F;
    public C196149uX A0G;
    public C26911Ty A0H;
    public A1M A0I;
    public BDO A0J;
    public C85424Ni A0K;
    public C108355bZ A0L;
    public AnonymousClass1M9 A0M;
    public AnonymousClass1PM A0N;
    public C24921Me A0O;
    public C25491Ok A0P;
    public C27201Vd A0Q;
    public C115095tO A0R;
    public AnonymousClass4VN A0S;
    public C31131f4 A0T;
    public AnonymousClass3V4 A0U;
    public AnonymousClass1NM A0V;
    public C219217x A0W;
    public C30801eX A0X;
    public AnonymousClass18K A0Y;
    public C125946bw A0Z;
    public C134206qD A0a;
    public C117015z4 A0b;
    public C80753xv A0c;
    public AnonymousClass736 A0d;
    public C140126zz A0e;
    public AnonymousClass1MB A0f;
    public AnonymousClass1LU A0g;
    public AnonymousClass1BI A0h;
    public AnonymousClass689 A0i;
    public C26421Sb A0j;
    public MentionableEntry A0k;
    public C85754Op A0l;
    public C191769n9 A0m;
    public C133846pb A0n;
    public C18010vc A0o;
    public AnonymousClass206 A0p;
    public C24641Lc A0q;
    public C26631Sw A0r;
    public AnonymousClass1SB A0s;
    public C132676nN A0t;
    public C129276hX A0u;
    public C36401np A0v;
    public C26521Sl A0w;
    public C32021gV A0x;
    public AnonymousClass1DC A0y;
    public C28931bI A0z;
    public C28931bI A10;
    public C28931bI A11;
    public C121826Lq A12;
    public AnonymousClass73X A13;
    public AnonymousClass74M A14;
    public AnonymousClass4SK A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B;
    public AnonymousClass00H A1C;
    public AnonymousClass00H A1D;
    public AnonymousClass00H A1E;
    public AnonymousClass00H A1F;
    public AnonymousClass00H A1G;
    public AnonymousClass00H A1H;
    public AnonymousClass00H A1I;
    public AnonymousClass00H A1J;
    public AnonymousClass00H A1K;
    public AnonymousClass00H A1L;
    public AnonymousClass00H A1M;
    public AnonymousClass00H A1N;
    public AnonymousClass00H A1O;
    public AnonymousClass00H A1P;
    public AnonymousClass00H A1Q;
    public AnonymousClass00H A1R;
    public AnonymousClass00H A1S;
    public AnonymousClass00H A1T;
    public AnonymousClass00H A1U;
    public AnonymousClass00H A1V;
    public Integer A1W = null;
    public boolean A1X = false;
    public boolean A1Y = false;
    public boolean A1Z = true;
    public boolean A1a;
    public View A1b;
    public View A1c;
    public View A1d;
    public MaterialButton A1e;
    public AnonymousClass7MX A1f;
    public C111185ii A1g;
    public AnonymousClass722 A1h;
    public boolean A1i;
    public boolean A1j;
    public final C107845ai A1k = new C142987Bo(this, 6);
    public final AnonymousClass875 A1l = new AnonymousClass7GH(this, 1);
    public final C133416oi A1m = new C133416oi(this);
    public final C23501Gn A1n = new C143707Em(this, 6);
    public final Set A1o = C17880vN.A12();
    public final Set A1p = C17880vN.A12();
    public final Set A1q = C17880vN.A12();
    public final int[] A1r = C108945cZ.A1W();

    private void A0r(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, int[] iArr) {
        int[] iArr2 = iArr;
        ImageView imageView2 = imageView;
        imageView2.setImageDrawable(this.A0D.A08(resources, new C117025z5(iArr2), 1.0f, -1));
        C108955ca.A1K(view, this, 8);
        view.setOnClickListener(new AnonymousClass788(new AnonymousClass78E(this, viewGroup, view, iArr2, 27), this.A05));
    }

    public static void A10(MessageReplyActivity messageReplyActivity, int i) {
        MessageReplyActivity messageReplyActivity2 = messageReplyActivity;
        AnonymousClass6RP A002 = ((AvatarSquidConfiguration) messageReplyActivity.A1C.get()).A00();
        if (A002 == AnonymousClass6RP.DISABLED) {
            messageReplyActivity.A0z.A04(8);
            return;
        }
        View findViewById = messageReplyActivity.A0z.A02().findViewById(2131435561);
        View findViewById2 = messageReplyActivity.A0z.A02().findViewById(2131435559);
        messageReplyActivity.A05.CGN(new AnonymousClass7Q7(messageReplyActivity2, A002, findViewById, findViewById2, i, 19));
        AnonymousClass78P.A00(findViewById2, messageReplyActivity2, 9);
    }

    public static boolean A14(MessageReplyActivity messageReplyActivity, boolean z) {
        if (!z) {
            Rect A072 = AnonymousClass3MW.A07();
            messageReplyActivity.A07.getWindowVisibleDisplayFrame(A072);
            DisplayMetrics A082 = C108965cb.A08(messageReplyActivity);
            int height = messageReplyActivity.A07.getRootView().getHeight();
            int i = A072.bottom - A072.top;
            if (((int) (((float) (height - i)) / A082.density)) <= 100) {
                return false;
            }
            ViewGroup.LayoutParams layoutParams = messageReplyActivity.A08.getLayoutParams();
            layoutParams.height = i;
            messageReplyActivity.A08.setLayoutParams(layoutParams);
            int height2 = ((i - messageReplyActivity.findViewById(2131435689).getHeight()) - messageReplyActivity.findViewById(2131435691).getHeight()) - messageReplyActivity.findViewById(2131430949).getHeight();
            int A002 = AnonymousClass3MX.A00(messageReplyActivity.getResources(), 2131168838, messageReplyActivity.getResources().getDimensionPixelSize(2131168839)) * 2;
            if (height2 < A002) {
                float f = ((float) height2) / ((float) A002);
                Iterator it = C137746vx.A00(C18020vd.A01(C18040vf.A02, messageReplyActivity.A0E, 1852)).iterator();
                while (it.hasNext()) {
                    C128446g0 r3 = (C128446g0) it.next();
                    View A062 = AnonymousClass1HF.A06(messageReplyActivity.A08, r3.A00);
                    View A063 = AnonymousClass1HF.A06(messageReplyActivity.A08, r3.A02);
                    ViewGroup.LayoutParams layoutParams2 = A063.getLayoutParams();
                    layoutParams2.width = (int) (((float) layoutParams2.width) * f);
                    AnonymousClass3MZ.A1G(A063, layoutParams2, (float) layoutParams2.height, f);
                    ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A062);
                    A0B2.width = (int) (((float) A0B2.width) * f);
                    AnonymousClass3MZ.A1G(A062, A0B2, (float) A0B2.height, f);
                    C27641Ww.A06(A062, messageReplyActivity.A00, (int) (((float) A0B2.leftMargin) * f), (int) (((float) A0B2.topMargin) * f), (int) (((float) A0B2.rightMargin) * f), (int) (((float) A0B2.bottomMargin) * f));
                }
                int height3 = messageReplyActivity.findViewById(2131430949).getHeight();
                C18000vb r7 = messageReplyActivity.A00;
                GridLayout gridLayout = messageReplyActivity.A0A;
                C27641Ww.A07(gridLayout, r7, gridLayout.getPaddingLeft(), messageReplyActivity.A0A.getPaddingTop(), messageReplyActivity.A0A.getPaddingRight(), height3);
            }
        }
        messageReplyActivity.A00.start();
        return true;
    }

    public /* synthetic */ void A4c(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, int[] iArr, boolean z) {
        C18070vi.A0d(iArr, 1);
        C18010vc r0 = this.A0o;
        if (z) {
            C1409873v.A03(r0, iArr);
        } else {
            C1409873v.A04(r0, iArr);
        }
        A0r(resources, view, viewGroup, imageView, (int[]) iArr.clone());
    }

    public void BCm() {
    }

    public void CFj() {
    }

    public static void A0s(Bitmap bitmap, MessageReplyActivity messageReplyActivity) {
        MaterialButton materialButton;
        messageReplyActivity.A01 = bitmap;
        Context context = messageReplyActivity.A08.getContext();
        Resources resources = context.getResources();
        if (messageReplyActivity.A01 == null || (materialButton = messageReplyActivity.A1e) == null) {
            MaterialButton materialButton2 = messageReplyActivity.A1e;
            if (materialButton2 != null) {
                materialButton2.setIconTint(C19740yt.A03(context, 2131231471));
                messageReplyActivity.A1e.setIconResource(2131232292);
                return;
            }
            return;
        }
        materialButton.setIconTint((ColorStateList) null);
        messageReplyActivity.A1e.setIcon(new BitmapDrawable(resources, messageReplyActivity.A01));
        if (messageReplyActivity.A1W != AnonymousClass00R.A01) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            messageReplyActivity.A1e.A01.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        messageReplyActivity.A1e.A01.clearColorFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009a, code lost:
        if (r6 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (X.C18020vd.A05(r2, r13.A0q.A01, 11138) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0t(android.view.View r20, com.whatsapp.status.playback.MessageReplyActivity r21) {
        /*
            r13 = r21
            X.0ve r1 = r13.A0E
            r0 = 1852(0x73c, float:2.595E-42)
            X.0vf r2 = X.C18040vf.A02
            java.lang.String r0 = X.C18020vd.A01(r2, r1, r0)
            java.util.ArrayList r5 = X.C137746vx.A00(r0)
            r0 = 2131435689(0x7f0b20a9, float:1.8493227E38)
            r3 = r20
            android.view.View r4 = X.AnonymousClass1HF.A06(r3, r0)
            X.00H r0 = r13.A17
            boolean r0 = X.C108975cc.A1I(r0)
            r14 = 0
            if (r0 != 0) goto L_0x003c
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r13)
            java.lang.String r0 = "status_reactions_nux_shown_count"
            int r1 = r1.getInt(r0, r14)
            r0 = 2
            if (r1 > r0) goto L_0x003c
            X.1Lc r0 = r13.A0q
            X.0ve r1 = r0.A01
            r0 = 11138(0x2b82, float:1.5608E-41)
            boolean r1 = X.C18020vd.A05(r2, r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r0 = 8
        L_0x003e:
            r4.setVisibility(r0)
            java.util.Iterator r7 = r5.iterator()
        L_0x0045:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r5 = r7.next()
            X.6g0 r5 = (X.C128446g0) r5
            int r0 = r5.A00
            android.view.View r12 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.emoji.EmojiContainerView r12 = (com.whatsapp.emoji.EmojiContainerView) r12
            int r0 = r5.A02
            android.widget.ImageView r10 = X.AnonymousClass3MW.A0G(r3, r0)
            X.1Lc r0 = r13.A0q
            X.0ve r1 = r0.A01
            r0 = 11078(0x2b46, float:1.5524E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0080
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r1 = 1110441984(0x42300000, float:44.0)
            int r0 = X.C62762rw.A01(r13, r1)
            r4.width = r0
            int r0 = X.C62762rw.A01(r13, r1)
            r4.height = r0
            r10.setLayoutParams(r4)
        L_0x0080:
            android.content.res.Resources r9 = X.AnonymousClass000.A0Y(r3)
            r4 = 1
            int[] r0 = new int[r4]
            int r5 = r5.A01
            r0[r14] = r5
            boolean r6 = X.AnonymousClass74I.A02(r0)
            int[] r0 = new int[r4]
            r0[r14] = r5
            boolean r1 = X.AnonymousClass74I.A03(r0)
            if (r1 != 0) goto L_0x009c
            r0 = 0
            if (r6 == 0) goto L_0x009d
        L_0x009c:
            r0 = 1
        L_0x009d:
            r12.A02 = r0
            if (r6 == 0) goto L_0x00e5
            X.0vc r1 = r13.A0o
            int[] r0 = new int[r4]
            r0[r14] = r5
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C1409873v.A05(r1, r0)
            X.737 r11 = new X.737
            r11.<init>((int[]) r0)
            X.78h r8 = new X.78h
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x00bb:
            r12.setOnLongClickListener(r8)
        L_0x00be:
            X.AnonymousClass3MW.A1Q(r10)
            java.lang.String r0 = r11.toString()
            r10.setContentDescription(r0)
            r12.setClickable(r4)
            android.widget.GridLayout r1 = r13.A0A
            int[] r0 = r11.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            r15 = r13
            r16 = r9
            r17 = r12
            r18 = r1
            r19 = r10
            r20 = r0
            r15.A0r(r16, r17, r18, r19, r20)
            goto L_0x0045
        L_0x00e5:
            if (r1 == 0) goto L_0x010f
            X.0vc r1 = r13.A0o
            int[] r0 = new int[r4]
            r0[r14] = r5
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.C1409873v.A06(r1, r0)
            X.737 r11 = new X.737
            r11.<init>((int[]) r0)
            X.78h r8 = new X.78h
            r15 = r8
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x00bb
        L_0x010f:
            int[] r0 = new int[r4]
            X.737 r11 = X.AnonymousClass737.A00(r0, r5, r14)
            r0 = 0
            r12.setOnLongClickListener(r0)
            goto L_0x00be
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.A0t(android.view.View, com.whatsapp.status.playback.MessageReplyActivity):void");
    }

    public static void A0u(ViewGroup viewGroup, MessageReplyActivity messageReplyActivity) {
        if (!messageReplyActivity.A1Y) {
            View inflate = messageReplyActivity.getLayoutInflater().inflate(2131626665, (ViewGroup) null, false);
            messageReplyActivity.A1d = inflate;
            ((FrameLayout) inflate.findViewById(2131434295)).setForeground(messageReplyActivity.A0L.BS0(AnonymousClass00R.A01, 2, false));
            viewGroup.setVisibility(0);
            viewGroup.addView(messageReplyActivity.A1d);
            TextView A0E2 = C17880vN.A0E(messageReplyActivity.A1d, 2131434307);
            TextView A0E3 = C17880vN.A0E(messageReplyActivity.A1d, 2131434293);
            TextView A0E4 = C17880vN.A0E(messageReplyActivity.A1d, 2131434304);
            float A002 = messageReplyActivity.A0S.A00(messageReplyActivity.getTheme(), messageReplyActivity.getResources());
            A0E2.setTextSize(A002);
            A0E3.setTextSize(A002);
            A0E4.setTextSize(A002);
            C43421zm.A04(A0E2);
            C43421zm.A04(A0E3);
            C43421zm.A04(A0E4);
            messageReplyActivity.A1d.findViewById(2131434306);
            C135486sH r4 = new C135486sH(messageReplyActivity.A0h, false, false);
            ((C139546z1) messageReplyActivity.A1R.get()).A01(messageReplyActivity.A1d, (AnonymousClass724) messageReplyActivity.A1N.get(), messageReplyActivity.A0p, r4);
        }
    }

    public static void A0v(UserJid userJid, MessageReplyActivity messageReplyActivity, int i) {
        AnonymousClass2GP r1 = new AnonymousClass2GP();
        r1.A06 = userJid.user;
        r1.A05 = C17880vN.A0n(messageReplyActivity.A02.A06());
        r1.A02 = Integer.valueOf(i);
        messageReplyActivity.A0Y.CC7(r1);
    }

    public static void A0w(MessageReplyActivity messageReplyActivity) {
        int i;
        messageReplyActivity.A1b.setVisibility(8);
        MentionableEntry mentionableEntry = messageReplyActivity.A0k;
        if (mentionableEntry != null && AnonymousClass1L4.A00(mentionableEntry)) {
            messageReplyActivity.A09.A01(messageReplyActivity.A0k);
        }
        messageReplyActivity.finish();
        if (messageReplyActivity.A1i || ((i = Build.VERSION.SDK_INT) >= 24 && i <= 27)) {
            messageReplyActivity.overridePendingTransition(0, 0);
        }
    }

    public static void A0x(MessageReplyActivity messageReplyActivity) {
        if (messageReplyActivity.A1a) {
            String string = messageReplyActivity.getString(2131895759);
            View A0D2 = AnonymousClass3MY.A0D(messageReplyActivity.getLayoutInflater(), 2131625048);
            AnonymousClass3MW.A0J(A0D2, 2131436257).setText(string);
            Toast toast = new Toast(messageReplyActivity.getApplicationContext());
            toast.setGravity(87, 0, 0);
            toast.setDuration(1);
            toast.setView(A0D2);
            toast.show();
        } else {
            messageReplyActivity.A05.A08(2131895759, 0);
        }
        A1v.remove(messageReplyActivity.A0p.A0v);
        A1u.remove(messageReplyActivity.A0p.A0v);
        A0w(messageReplyActivity);
    }

    public static void A0y(MessageReplyActivity messageReplyActivity) {
        GridLayout gridLayout;
        messageReplyActivity.A08.setVisibility(8);
        if (messageReplyActivity.A1W == AnonymousClass00R.A00) {
            gridLayout = messageReplyActivity.A0A;
        } else {
            gridLayout = messageReplyActivity.A09;
        }
        AnimatorSet A0B2 = C108945cZ.A0B();
        ArrayList A132 = AnonymousClass000.A13();
        if (gridLayout != null) {
            for (int i = 0; i < gridLayout.getChildCount(); i++) {
                ObjectAnimator A0C2 = C108945cZ.A0C(View.ALPHA, gridLayout.getChildAt(i), new float[1], 0.0f, 0);
                A0C2.setDuration(150);
                A0C2.setInterpolator(A1t);
                A132.add(A0C2);
            }
        }
        View view = messageReplyActivity.A05;
        if (view != null) {
            ObjectAnimator A0C3 = C108945cZ.A0C(View.ALPHA, view, new float[1], 0.0f, 0);
            A0C3.setDuration(150);
            A0C3.setInterpolator(A1t);
            A132.add(A0C3);
        }
        A0B2.playTogether(A132);
        A0B2.start();
    }

    public static void A0z(MessageReplyActivity messageReplyActivity) {
        A1v.put(messageReplyActivity.A0p.A0v, messageReplyActivity.A0k.getStringText());
        A1u.put(messageReplyActivity.A0p.A0v, AnonymousClass4aJ.A01(messageReplyActivity.A0k.getMentions()));
    }

    public static void A11(MessageReplyActivity messageReplyActivity, C1418377d r4) {
        AnonymousClass1E7 A0E2 = messageReplyActivity.A0M.A0E(messageReplyActivity.A0h);
        if (A0E2 != null && A0E2.A0C()) {
            AnonymousClass7RH.A01(messageReplyActivity.A05, messageReplyActivity, 19);
        }
        messageReplyActivity.A05.CGN(new AnonymousClass7RQ(messageReplyActivity, r4, 1));
    }

    public static void A12(MessageReplyActivity messageReplyActivity, String str) {
        AnonymousClass1E7 A0E2 = messageReplyActivity.A0M.A0E(messageReplyActivity.A0h);
        if (A0E2 != null && A0E2.A0C()) {
            AnonymousClass7RH.A01(messageReplyActivity.A05, messageReplyActivity, 19);
        }
        messageReplyActivity.setResult(-1);
        String str2 = str;
        messageReplyActivity.A0F.A0O((C143887Fe) null, messageReplyActivity.A0p, (C692236j) null, str2, Collections.singletonList(messageReplyActivity.A0h), messageReplyActivity.A0k.getMentions(), false, false);
        A0x(messageReplyActivity);
    }

    public void A4b(int i) {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            C32741hg r2 = statusReplyActivity.A02;
            if (r2 != null) {
                AnonymousClass206 r3 = statusReplyActivity.A0p;
                C18070vi.A0W(r3);
                r2.A0F.CGF(new C146707Qh(r2, r3, Integer.valueOf(i), 2, 1, 4));
                return;
            }
            C18070vi.A11("statusesStatsManager");
            throw null;
        }
    }

    public void A4d(AnonymousClass77J r18) {
        AnonymousClass77C r0;
        AnonymousClass77C r02;
        if (C108995ce.A1Z(this)) {
            AnonymousClass4Yv.A01(this, 106);
            return;
        }
        ArrayList A132 = AnonymousClass000.A13();
        AnonymousClass1BI r1 = this.A0h;
        A132.add(r1);
        AnonymousClass77J r5 = r18;
        AnonymousClass77C r6 = r5.A01;
        if (r6.A02 > 0) {
            r0 = r6;
        } else {
            r0 = r5.A02;
        }
        int i = r0.A02;
        if (r6.A00 > 0) {
            r02 = r6;
        } else {
            r02 = r5.A02;
        }
        int i2 = r02.A00;
        AnonymousClass1L9 r3 = this.A01;
        String str = r5.A02.A03;
        String str2 = r6.A03;
        String str3 = r5.A03.A03;
        int i3 = r5.A00;
        int i4 = 22;
        if (C22971Dz.A0a(r1)) {
            i4 = 24;
        }
        if (!AnonymousClass1L9.A07(AnonymousClass1LU.A1e(this, str, str2, str3, (String) null, A132, i3, i4, false, false).putExtra("jid", this.A0h.getRawString()).putExtra("media_width", i).putExtra("media_height", i2).putExtra("mentions", AnonymousClass4aJ.A01(this.A0k.getMentions())).putExtra("caption", this.A0k.getStringText()).putExtra("usage_quote", true), this, 25)) {
            r3.A01.A08(2131886448, 0);
        }
    }

    public boolean A4e() {
        if (this.A1a) {
            C18030ve r1 = this.A0E;
            C18040vf r3 = C18040vf.A02;
            if (C18020vd.A05(r3, r1, 4196) && C18020vd.A05(r3, this.A0E, 5644)) {
                if (C24191Jf.A02(this.A08, this.A0o) < C18020vd.A00(r3, this.A0E, 5645)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public boolean A4f() {
        if (this.A0k.getText() == null || TextUtils.getTrimmedLength(this.A0k.getText()) == 0) {
            return true;
        }
        return false;
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A1f.A02(pickerSearchDialogFragment);
    }

    public void C2j() {
        this.A0R.A0C();
    }

    public void C8O() {
        this.A0R.A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r9.A0G != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r1 = r4.getIntExtra("provider", 0);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r1 == 1) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r1 == 2) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        r9.A05 = r0;
        r2.A0F.A0n(new X.C63642tS(java.util.Collections.singletonList(r2.A0j.A03(r8, r9, r2.A0h, r2.A0p, (X.C692236j) null, r4.getStringExtra("caption"), (java.lang.String) null, X.AnonymousClass4aJ.A03(r4.getStringExtra("mentions")), (java.util.List) null, 13, 0, 0, false, false)), 1), r6, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (X.C108975cc.A1E(r2) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r2.A0c.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        A0x(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
        if (r8 == null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            r22 = this;
            r2 = r22
            r3 = r23
            r1 = r24
            r4 = r25
            super.onActivityResult(r3, r1, r4)
            java.util.Set r0 = r2.A1o
            java.util.Iterator r5 = r0.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r5.next()
            X.5Ye r0 = (X.C107045Ye) r0
            boolean r0 = r0.Bky(r4, r3, r1)
            if (r0 == 0) goto L_0x0011
        L_0x0023:
            return
        L_0x0024:
            r0 = 8
            r6 = -1
            if (r3 == r0) goto L_0x010d
            r0 = 9
            if (r3 == r0) goto L_0x010d
            r0 = 22
            if (r3 == r0) goto L_0x010d
            r0 = 25
            if (r3 == r0) goto L_0x004e
            r0 = 77
            if (r3 == r0) goto L_0x010d
            r0 = 802(0x322, float:1.124E-42)
            if (r3 == r0) goto L_0x0046
            r0 = 806(0x326, float:1.13E-42)
            if (r3 == r0) goto L_0x010d
            r0 = 858(0x35a, float:1.202E-42)
            if (r3 == r0) goto L_0x010d
            return
        L_0x0046:
            if (r1 == r6) goto L_0x010f
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0023
            goto L_0x010f
        L_0x004e:
            if (r1 != r6) goto L_0x0023
            java.lang.String r0 = "file_path"
            java.lang.String r5 = r4.getStringExtra(r0)
            java.lang.String r0 = "media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d8
        L_0x0068:
            X.2rc r9 = new X.2rc
            r9.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r3 = 0
            if (r0 != 0) goto L_0x00e6
            java.io.File r0 = X.C108945cZ.A17(r5)
            r9.A0G = r0
            byte[] r6 = X.C1408873l.A04(r0)
            r8 = r3
        L_0x007f:
            java.io.File r0 = r9.A0G
            if (r0 == 0) goto L_0x00d5
        L_0x0083:
            java.lang.String r0 = "provider"
            r3 = 0
            int r1 = r4.getIntExtra(r0, r3)
            r0 = 1
            if (r1 == r0) goto L_0x0091
            r0 = 2
            if (r1 == r0) goto L_0x0091
            r0 = 0
        L_0x0091:
            r9.A05 = r0
            X.1iW r5 = r2.A0F
            X.1Sb r7 = r2.A0j
            X.1BI r10 = r2.A0h
            java.lang.String r0 = "caption"
            java.lang.String r13 = r4.getStringExtra(r0)
            X.206 r11 = r2.A0p
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.util.ArrayList r15 = X.AnonymousClass4aJ.A03(r0)
            r12 = 0
            r17 = 13
            r16 = r12
            r20 = r3
            r21 = r3
            r18 = r3
            r14 = r12
            r19 = r3
            X.21V r0 = r7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 1
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.2tS r0 = new X.2tS
            r0.<init>(r1, r4)
            r5.A0n(r0, r6, r3, r3)
            boolean r0 = X.C108975cc.A1E(r2)
            if (r0 != 0) goto L_0x00d5
            X.3xv r0 = r2.A0c
            r0.A00(r3)
        L_0x00d5:
            A0x(r2)
        L_0x00d8:
            boolean r0 = X.C108975cc.A1E(r2)
            if (r0 == 0) goto L_0x0113
            X.74J r0 = X.C108965cb.A0L(r2)
            r0.A0D()
            return
        L_0x00e6:
            android.net.Uri r8 = android.net.Uri.parse(r1)
            java.lang.String r0 = "media_width"
            int r0 = r4.getIntExtra(r0, r6)
            r9.A08 = r0
            java.lang.String r0 = "media_height"
            int r0 = r4.getIntExtra(r0, r6)
            r9.A06 = r0
            java.lang.String r0 = "preview_media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            if (r1 == 0) goto L_0x0108
            X.736 r0 = r2.A0d
            byte[] r3 = r0.A03(r1)
        L_0x0108:
            r6 = r3
            if (r8 != 0) goto L_0x0083
            goto L_0x007f
        L_0x010d:
            if (r1 != r6) goto L_0x0023
        L_0x010f:
            A0x(r2)
            return
        L_0x0113:
            X.5z4 r0 = r2.A0b
            r0.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0332, code lost:
        if (r0.A0y.BcY() == false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0E, 1455) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r77) {
        /*
            r76 = this;
            r0 = r76
            r75 = r77
            r1 = r75
            super.onCreate(r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isStatusReply"
            r1 = 0
            boolean r6 = r3.getBooleanExtra(r2, r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isMediaViewReply"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A1i = r2
            r5 = 1
            if (r6 == 0) goto L_0x0030
            X.0ve r4 = r0.A0E
            r3 = 1455(0x5af, float:2.039E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r2, r4, r3)
            r2 = 1
            if (r3 != 0) goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            r0.A1a = r2
            X.1SB r10 = r0.A0s
            X.10I r12 = r0.A05
            X.00H r13 = r0.A1Q
            X.00H r2 = r0.A1S
            java.lang.Object r9 = r2.get()
            X.2LK r9 = (X.AnonymousClass2LK) r9
            X.0z4 r8 = r0.A0A
            X.00H r2 = r0.A1T
            java.lang.Object r11 = r2.get()
            X.6pA r11 = (X.AnonymousClass6pA) r11
            X.722 r7 = new X.722
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.A1h = r7
            X.7MX r2 = new X.7MX
            r2.<init>(r7)
            r0.A1f = r2
            X.1It r3 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r2 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.1J2 r16 = r3.A00(r2)
            r2 = r16
            com.whatsapp.community.ConversationCommunityViewModel r2 = (com.whatsapp.community.ConversationCommunityViewModel) r2
            r16 = r2
            X.1It r3 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<X.8FO> r2 = X.AnonymousClass8FO.class
            X.1J2 r17 = r3.A00(r2)
            r2 = r17
            X.8FO r2 = (X.AnonymousClass8FO) r2
            r17 = r2
            r2 = 2131626040(0x7f0e0838, float:1.8879305E38)
            r0.setContentView((int) r2)
            android.content.Intent r2 = r0.getIntent()
            X.205 r7 = X.AnonymousClass4aU.A02(r2)
            X.00H r2 = r0.A1K     // Catch:{ all -> 0x0899 }
            X.206 r4 = X.AnonymousClass1W2.A01(r7, r2)     // Catch:{ all -> 0x0899 }
            r0.A0p = r4
            if (r4 == 0) goto L_0x0884
            boolean r2 = r4 instanceof X.C436420i
            if (r2 != 0) goto L_0x0884
            X.205 r2 = r4.A0v
            X.1BI r3 = r2.A00
            boolean r2 = X.C22971Dz.A0a(r3)
            r0.A1Y = r2
            if (r2 == 0) goto L_0x0867
            X.1BI r3 = r4.A0H()
            X.C17960vV.A07(r3)
        L_0x00a8:
            r0.A0h = r3
            r2 = 2131432243(0x7f0b1333, float:1.8486238E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.A07 = r2
            boolean r2 = r0.A1i
            if (r2 != 0) goto L_0x00bb
            if (r6 == 0) goto L_0x00e7
        L_0x00bb:
            int r3 = android.graphics.Color.argb(r1, r1, r1, r1)
            r2 = 2131103059(0x7f060d53, float:1.7818573E38)
            int r7 = X.C19740yt.A00(r0, r2)
            int[] r2 = X.C108945cZ.A1W()
            r2[r1] = r3
            r2[r5] = r7
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofArgb(r2)
            r2 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r2)
            r2 = 28
            X.C1411074h.A00(r4, r0, r2)
            X.5cj r2 = new X.5cj
            r2.<init>(r0, r7, r5)
            r4.addListener(r2)
            r4.start()
        L_0x00e7:
            r2 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            r0.A04 = r2
            r2 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            r0.A1b = r2
            r2 = 2131429568(0x7f0b08c0, float:1.8480812E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            r0.A02 = r2
            r2 = 2131429164(0x7f0b072c, float:1.8479993E38)
            X.1bI r2 = X.AnonymousClass3Ma.A0x(r0, r2)
            r0.A10 = r2
            r2 = 2131435688(0x7f0b20a8, float:1.8493225E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r0.A08 = r2
            r2 = 2131434374(0x7f0b1b86, float:1.849056E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = (com.google.android.material.button.MaterialButtonToggleGroup) r2
            r0.A0C = r2
            r2 = 2131435691(0x7f0b20ab, float:1.8493231E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            r0.A05 = r2
            android.widget.FrameLayout r3 = r0.A08
            r2 = 2131427957(0x7f0b0275, float:1.8477545E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r2)
            android.widget.GridLayout r2 = (android.widget.GridLayout) r2
            r0.A09 = r2
            android.widget.FrameLayout r3 = r0.A08
            r2 = 2131432968(0x7f0b1608, float:1.8487708E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r2)
            android.widget.GridLayout r2 = (android.widget.GridLayout) r2
            r0.A0A = r2
            X.1Lc r2 = r0.A0q
            X.0ve r3 = r2.A01
            r2 = 11077(0x2b45, float:1.5522E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r8, r3, r2)
            if (r2 == 0) goto L_0x0176
            android.view.View r4 = r0.A05
            r3 = 9
            X.781 r2 = new X.781
            r2.<init>(r3)
            r4.setOnClickListener(r2)
            android.widget.GridLayout r4 = r0.A09
            r3 = 10
            X.781 r2 = new X.781
            r2.<init>(r3)
            r4.setOnClickListener(r2)
            android.widget.GridLayout r4 = r0.A0A
            r3 = 11
            X.781 r2 = new X.781
            r2.<init>(r3)
            r4.setOnClickListener(r2)
        L_0x0176:
            android.widget.FrameLayout r3 = r0.A08
            r2 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r0.A1e = r2
            android.widget.FrameLayout r3 = r0.A08
            r2 = 2131435560(0x7f0b2028, float:1.8492966E38)
            X.1bI r2 = X.C28931bI.A00(r3, r2)
            r0.A0z = r2
            r2 = 2131430255(0x7f0b0b6f, float:1.8482206E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.A1c = r2
            r2 = 2131429565(0x7f0b08bd, float:1.8480806E38)
            android.view.View r7 = r0.findViewById(r2)
            com.whatsapp.conversation.ConversationEntryActionButton r7 = (com.whatsapp.conversation.ConversationEntryActionButton) r7
            X.4JZ r9 = r0.A0D
            X.0ve r4 = r0.A0E
            X.1MB r3 = r0.A0f
            X.1BI r2 = r0.A0h
            boolean r2 = r3.A01(r2)
            if (r2 == 0) goto L_0x0863
            java.lang.Integer r2 = X.AnonymousClass00R.A01
        L_0x01b0:
            X.4VJ r21 = X.C87414Vm.A00(r4, r2)
            r18 = 0
            r24 = r1
            r25 = r1
            r19 = r0
            r20 = r9
            r22 = r18
            r23 = r1
            X.3V4 r2 = X.AnonymousClass4GQ.A00(r19, r20, r21, r22, r23, r24, r25)
            r0.A0U = r2
            r2 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            X.1bI r2 = X.C72453Mb.A0r(r0, r2)
            r0.A11 = r2
            X.3V4 r3 = r0.A0U
            r4 = 1
            X.7EQ r2 = new X.7EQ
            r2.<init>(r0, r5)
            r7.A02(r0, r2, r3)
            r2 = 2131428782(0x7f0b05ae, float:1.8479218E38)
            android.view.View r2 = X.C110885hR.A0A(r0, r2)
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            r0.A0B = r2
            r2.setPadding(r1, r1, r1, r1)
            android.widget.ImageButton r3 = r0.A0B
            X.1DC r2 = r0.A0y
            boolean r2 = r2.BcY()
            r9 = 8
            int r2 = X.C72453Mb.A07(r2)
            r3.setVisibility(r2)
            boolean r2 = r0.A1i
            if (r6 == 0) goto L_0x085d
            r3 = 6
        L_0x0200:
            android.widget.ImageButton r2 = r0.A0B
            r7 = 33
            X.C90104dX.A00(r2, r0, r3, r7)
            X.0ve r3 = r0.A0E
            X.1DC r2 = r0.A0y
            android.view.View r2 = X.AnonymousClass6W9.A00(r0, r3, r2)
            r0.A03 = r2
            r2.setVisibility(r1)
            android.view.View r3 = r0.A03
            r2 = 4
            X.AnonymousClass6LG.A00(r3, r0, r2)
            android.view.LayoutInflater r10 = r0.getLayoutInflater()
            r3 = 2131627463(0x7f0e0dc7, float:1.8882191E38)
            r2 = 2131436905(0x7f0b2569, float:1.8495694E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r10.inflate(r3, r2, r5)
            X.7OB r3 = new X.7OB
            r3.<init>(r0, r5)
            X.4SK r10 = r0.A15
            android.view.View r11 = r0.A04
            X.C17960vV.A05(r11)
            X.3V4 r2 = r0.A0U
            r12 = r0
            r13 = r2
            r14 = r3
            r15 = r6
            X.74M r10 = r10.A00(r11, r12, r13, r14, r15)
            r0.A14 = r10
            X.1BI r11 = r0.A0h
            X.72K r2 = r10.A0J
            boolean r2 = X.AnonymousClass000.A1W(r2)
            r3 = r2 ^ 1
            java.lang.String r2 = "Do not update the ptt receiver once the recording has started"
            X.C17960vV.A0H(r3, r2)
            r10.A0C = r11
            X.206 r2 = r0.A0p
            r10.A0E = r2
            r2 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r11 = X.C110885hR.A0A(r0, r2)
            com.whatsapp.mentions.MentionableEntry r11 = (com.whatsapp.mentions.MentionableEntry) r11
            r0.A0k = r11
            android.text.InputFilter[] r10 = new android.text.InputFilter[r5]
            r2 = 2
            X.77h r3 = new X.77h
            r3.<init>(r0, r2)
            r10[r1] = r3
            r11.setFilters(r10)
            X.6xm r11 = new X.6xm
            r11.<init>()
            com.whatsapp.mentions.MentionableEntry r10 = r0.A0k
            X.7Jh r3 = new X.7Jh
            r3.<init>(r11, r0, r5)
            r10.A0F = r3
            r3 = 2131431653(0x7f0b10e5, float:1.8485041E38)
            android.view.View r3 = r0.findViewById(r3)
            r10 = 2131231608(0x7f080378, float:1.8079302E38)
            r3.setBackgroundResource(r10)
            r3.setPadding(r1, r1, r1, r1)
            com.whatsapp.mentions.MentionableEntry r11 = r0.A0k
            X.1BI r10 = r0.A0h
            boolean r10 = r11.A0O(r10)
            if (r10 == 0) goto L_0x02bf
            com.whatsapp.mentions.MentionableEntry r12 = r0.A0k
            r12.A05 = r3
            X.4oS r10 = new X.4oS
            r10.<init>(r3, r2)
            r12.A0C = r10
            r10 = 2131432483(0x7f0b1423, float:1.8486725E38)
            android.view.View r11 = X.C110885hR.A0A(r0, r10)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            X.1BI r10 = r0.A0h
            r25 = r5
            r19 = r12
            r20 = r11
            r21 = r10
            r22 = r1
            r24 = r5
            r19.A0M(r20, r21, r22, r23, r24, r25)
        L_0x02bf:
            java.util.HashMap r10 = A1v
            X.206 r5 = r0.A0p
            X.205 r5 = r5.A0v
            java.lang.String r11 = X.C108945cZ.A1G(r5, r10)
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            if (r5 != 0) goto L_0x031c
            A0y(r0)
            java.util.HashMap r10 = A1u
            X.206 r5 = r0.A0p
            X.205 r5 = r5.A0v
            java.lang.String r5 = X.C108945cZ.A1G(r5, r10)
            java.util.ArrayList r10 = X.AnonymousClass4aJ.A03(r5)
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            r5.setMentionableText(r11, r10)
            X.0ve r15 = r0.A0E
            X.1KW r14 = r0.A0D
            X.11C r13 = r0.A08
            X.0vc r10 = r0.A0o
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            android.text.Editable r20 = r5.getEditableText()
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            android.text.TextPaint r21 = r5.getPaint()
            r12 = 2130970892(0x7f04090c, float:1.7550507E38)
            r5 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r26 = X.AnonymousClass1YL.A00(r0, r12, r5)
            r12 = 2130970132(0x7f040614, float:1.7548965E38)
            r5 = 2131101250(0x7f060642, float:1.7814904E38)
            int r27 = X.AnonymousClass1YL.A00(r0, r12, r5)
            r25 = r10
            r28 = r4
            r19 = r0
            r22 = r13
            r23 = r14
            r24 = r15
            X.C26302CxJ.A0L(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x031c:
            boolean r10 = X.AnonymousClass1EG.A0H(r11)
            r0.A1Z = r10
            X.3V4 r5 = r0.A0U
            r5.A0X(r10)
            android.widget.ImageButton r11 = r0.A0B
            if (r10 == 0) goto L_0x0334
            X.1DC r5 = r0.A0y
            boolean r10 = r5.BcY()
            r5 = 0
            if (r10 != 0) goto L_0x0336
        L_0x0334:
            r5 = 8
        L_0x0336:
            r11.setVisibility(r5)
            X.0ve r5 = r0.A0E
            X.C18070vi.A0d(r5, r1)
            r5 = 2131436064(0x7f0b2220, float:1.8493988E38)
            android.view.View r12 = X.C110885hR.A0A(r0, r5)
            int r10 = r12.getPaddingLeft()
            int r5 = r12.getPaddingRight()
            int r11 = java.lang.Math.max(r10, r5)
            android.view.ViewGroup$MarginLayoutParams r10 = X.AnonymousClass3MW.A0B(r12)
            X.0vb r5 = r0.A00
            boolean r5 = X.AnonymousClass3MY.A1b(r5)
            if (r5 == 0) goto L_0x0859
            r10.rightMargin = r11
        L_0x035f:
            r12.setLayoutParams(r10)
            X.1M9 r10 = r0.A0M
            X.1BI r5 = r0.A0h
            X.1E7 r5 = r10.A0H(r5)
            X.6Ig r10 = new X.6Ig
            r10.<init>(r5, r0, r6)
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            r5.addTextChangedListener(r10)
            com.whatsapp.mentions.MentionableEntry r11 = r0.A0k
            X.0vb r10 = r0.A00
            X.48C r5 = new X.48C
            r5.<init>(r11, r10)
            r11.addTextChangedListener(r5)
            com.whatsapp.mentions.MentionableEntry r11 = r0.A0k
            X.7ER r5 = new X.7ER
            r5.<init>(r0)
            r11.A01 = r5
            r10 = 5
            X.79Y r5 = new X.79Y
            r5.<init>(r0, r10)
            r11.setOnEditorActionListener(r5)
            r5 = 2131430163(0x7f0b0b13, float:1.848202E38)
            android.view.View r5 = X.C110885hR.A0A(r0, r5)
            X.AnonymousClass78P.A00(r5, r0, r9)
            X.1DC r5 = r0.A0y
            X.C18070vi.A0d(r5, r1)
            r5 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r11 = X.C110885hR.A0A(r0, r5)
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            X.00H r5 = r0.A1T
            java.lang.Object r5 = r5.get()
            X.6pA r5 = (X.AnonymousClass6pA) r5
            boolean r5 = r5.A01()
            if (r5 == 0) goto L_0x03ec
            X.0ve r14 = r0.A0E
            X.0z4 r13 = r0.A0A
            X.6hX r12 = r0.A0u
            X.7AY r5 = new X.7AY
            r5.<init>(r13, r14, r12)
            X.1It r12 = new X.1It
            r12.<init>(r5, r0)
            java.lang.Class<X.5ii> r5 = X.C111185ii.class
            X.1J2 r13 = r12.A00(r5)
            X.5ii r13 = (X.C111185ii) r13
            r0.A1g = r13
            X.722 r5 = r0.A1h
            r5.A01 = r13
            X.1KB r12 = r0.A05
            X.6nN r5 = new X.6nN
            r5.<init>(r12, r13)
            r0.A0t = r5
            X.00H r5 = r0.A1I
            java.lang.Object r12 = r5.get()
            X.6pK r12 = (X.C133686pK) r12
            r5 = r18
            r12.A01(r5)
        L_0x03ec:
            boolean r5 = r0.A1i
            if (r6 == 0) goto L_0x0851
            r24 = 6
        L_0x03f2:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r24)
            boolean r5 = X.C108975cc.A1E(r0)
            if (r5 == 0) goto L_0x078d
            r5 = 2131430331(0x7f0b0bbb, float:1.848236E38)
            android.view.View r22 = X.C110885hR.A0A(r0, r5)
            r5 = 2131430336(0x7f0b0bc0, float:1.848237E38)
            X.1bI r5 = X.AnonymousClass3Ma.A0x(r0, r5)
            X.74J r19 = X.C108965cb.A0L(r0)
            com.whatsapp.mentions.MentionableEntry r10 = r0.A0k
            android.view.ViewGroup r6 = r0.A07
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6
            android.view.View r5 = r5.A02()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r5 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r5
            r21 = r0
            r28 = r18
            r20 = r0
            r23 = r11
            r24 = r18
            r25 = r6
            r26 = r10
            r27 = r5
            r29 = r1
            r19.A0L(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 32
            X.AnonymousClass3MZ.A1P(r11, r0, r12, r5)
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            X.AnonymousClass3MZ.A1P(r5, r0, r12, r7)
        L_0x0439:
            X.722 r5 = r0.A1h
            X.2LK r6 = r5.A0B
            X.6qF r5 = r5.A09
            r6.registerObserver(r5)
            X.1BI r5 = r0.A0h
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r5)
            X.0ve r7 = r0.A0E
            r5 = 8674(0x21e2, float:1.2155E-41)
            boolean r5 = X.C18020vd.A05(r8, r7, r5)
            if (r5 == 0) goto L_0x04a9
            if (r6 == 0) goto L_0x04a9
            X.1Ok r5 = r0.A0P
            boolean r5 = r5.A00(r6)
            if (r5 == 0) goto L_0x04a9
            X.1bI r5 = r0.A10
            android.view.View r11 = r5.A02()
            r5 = 2131429163(0x7f0b072b, float:1.847999E38)
            android.view.View r10 = r11.findViewById(r5)
            android.content.res.Resources r8 = r0.getResources()
            boolean r7 = r0.A1a
            r5 = 2131165914(0x7f0702da, float:1.7946059E38)
            if (r7 == 0) goto L_0x0477
            r5 = 2131165915(0x7f0702db, float:1.794606E38)
        L_0x0477:
            int r5 = r8.getDimensionPixelSize(r5)
            r10.setMinimumHeight(r5)
            r5 = 2131429165(0x7f0b072d, float:1.8479995E38)
            android.widget.TextView r7 = X.C17880vN.A0E(r11, r5)
            X.1np r10 = r0.A0v
            r5 = 2131888344(0x7f1208d8, float:1.941132E38)
            java.lang.String r13 = r0.getString(r5)
            r15 = 2131103152(0x7f060db0, float:1.7818762E38)
            X.7RQ r5 = new X.7RQ
            r5.<init>(r0, r6, r2)
            java.lang.String r14 = "coex-status-privacy-disclaimer"
            r11 = r0
            r12 = r5
            android.text.SpannableStringBuilder r5 = r10.A06(r11, r12, r13, r14, r15)
            r7.setText(r5)
            X.0ve r5 = r0.A0E
            X.AnonymousClass3Ma.A1I(r7, r5)
            A0v(r6, r0, r4)
        L_0x04a9:
            boolean r6 = r0.A1a
            android.widget.FrameLayout r5 = r0.A08
            if (r6 != 0) goto L_0x06bd
            r5.setVisibility(r9)
            r3 = 2131434297(0x7f0b1b39, float:1.8490404E38)
            android.view.View r3 = X.C110885hR.A0A(r0, r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            A0u(r3, r0)
        L_0x04be:
            boolean r3 = r0.A1a
            if (r3 == 0) goto L_0x0691
            android.view.View r3 = r0.A02
            r5 = 0
            r3.setAlpha(r5)
            android.widget.FrameLayout r3 = r0.A08
            r3.setAlpha(r5)
            android.animation.AnimatorSet r3 = X.C108945cZ.A0B()
            r0.A00 = r3
            android.widget.FrameLayout r5 = r0.A08
            android.util.Property r11 = android.view.View.ALPHA
            float[] r3 = new float[r4]
            r10 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r9 = X.C108945cZ.A0C(r11, r5, r3, r10, r1)
            r5 = 150(0x96, double:7.4E-322)
            r9.setDuration(r5)
            android.view.animation.Interpolator r8 = A1s
            r9.setInterpolator(r8)
            android.view.View r7 = r0.A02
            float[] r3 = new float[r4]
            android.animation.ObjectAnimator r4 = X.C108945cZ.A0C(r11, r7, r3, r10, r1)
            r4.setDuration(r5)
            r4.setInterpolator(r8)
            android.animation.AnimatorSet r3 = r0.A00
            android.animation.Animator[] r1 = X.C108945cZ.A1Z(r4, r9, r2, r1)
            r3.playTogether(r1)
            X.0ve r3 = r0.A0E
            if (r3 == 0) goto L_0x0671
            X.0vf r2 = X.C18040vf.A01
            r1 = 12624(0x3150, float:1.769E-41)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 == 0) goto L_0x0671
            X.10I r2 = r0.A05
            r1 = 15
            X.AnonymousClass7RH.A01(r2, r0, r1)
        L_0x0515:
            X.5qZ r2 = new X.5qZ
            r2.<init>(r0)
            android.view.View r1 = r0.A1b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            X.1qK r1 = (X.C37891qK) r1
            r1.A00(r2)
            r1 = 13
            X.C114315qV.A00(r2, r0, r1)
            android.view.View r2 = r0.A1b
            r1 = 3
            X.AnonymousClass6LG.A00(r2, r0, r1)
            X.00H r1 = r0.A1F
            X.1pj r2 = X.AnonymousClass3MW.A0V(r1)
            X.1BI r1 = r0.A0h
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r1)
            boolean r1 = r2.A0P(r1)
            if (r1 == 0) goto L_0x0547
            r1 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r0, r1)
        L_0x0547:
            r2 = 811(0x32b, float:1.136E-42)
            r1 = 812(0x32c, float:1.138E-42)
            X.6dp r14 = new X.6dp
            r14.<init>(r2, r1)
            X.0ve r1 = r0.A0E
            r46 = r1
            X.10I r1 = r0.A05
            r64 = r1
            X.1KB r1 = r0.A05
            r74 = r1
            X.1L4 r1 = r0.A09
            r60 = r1
            X.11S r1 = r0.A02
            r73 = r1
            X.190 r1 = r0.A03
            r72 = r1
            X.1kd r1 = r0.A0E
            r71 = r1
            X.17r r1 = r0.A04
            r70 = r1
            X.18K r1 = r0.A0Y
            r47 = r1
            X.BDO r1 = r0.A0J
            r31 = r1
            X.1iW r1 = r0.A0F
            r27 = r1
            X.A1M r1 = r0.A0I
            r30 = r1
            X.00H r1 = r0.A1M
            java.lang.Object r13 = r1.get()
            X.2kg r13 = (X.C58432kg) r13
            X.00H r1 = r0.A0C
            java.lang.Object r12 = r1.get()
            X.11Z r12 = (X.AnonymousClass11Z) r12
            X.689 r1 = r0.A0i
            r50 = r1
            X.4Ni r1 = r0.A0K
            r32 = r1
            X.1Sl r1 = r0.A0w
            r62 = r1
            X.1DC r1 = r0.A0y
            r63 = r1
            X.11C r1 = r0.A08
            r42 = r1
            X.00H r1 = r0.A1F
            X.1pj r33 = X.AnonymousClass3MW.A0V(r1)
            X.6pb r1 = r0.A0n
            r56 = r1
            X.1NM r1 = r0.A0V
            r41 = r1
            X.00H r1 = r0.A1G
            java.lang.Object r11 = r1.get()
            X.1dX r11 = (X.C30191dX) r11
            X.17x r1 = r0.A0W
            r43 = r1
            X.0z4 r1 = r0.A0A
            r44 = r1
            X.1L1 r1 = r0.A0F
            r57 = r1
            X.00H r1 = r0.A1L
            java.lang.Object r10 = r1.get()
            X.6uJ r10 = (X.C136736uJ) r10
            X.9uX r1 = r0.A0G
            r26 = r1
            X.1Ty r1 = r0.A0H
            r25 = r1
            X.1LD r1 = r0.A08
            r24 = r1
            X.0vc r1 = r0.A0o
            r23 = r1
            X.1f4 r1 = r0.A0T
            r22 = r1
            X.00H r1 = r0.A1V
            r21 = r1
            X.1Gn r1 = r0.A1n
            r20 = r1
            X.1BI r15 = r0.A0h
            android.view.ViewGroup r9 = r0.A07
            com.whatsapp.KeyboardPopupLayout r9 = (com.whatsapp.KeyboardPopupLayout) r9
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0k
            X.9n9 r7 = r0.A0m
            X.4Op r6 = r0.A0l
            X.6bw r5 = r0.A0Z
            X.00H r4 = r0.A1O
            X.00H r3 = r0.A16
            X.5tO r2 = new X.5tO
            r1 = 0
            r36 = r0
            r66 = r18
            r19 = r0
            r28 = r26
            r29 = r25
            r34 = r16
            r35 = r11
            r37 = r14
            r38 = r18
            r39 = r22
            r40 = r20
            r45 = r12
            r48 = r5
            r49 = r15
            r51 = r13
            r52 = r8
            r53 = r6
            r54 = r17
            r55 = r7
            r58 = r23
            r59 = r24
            r61 = r10
            r65 = r21
            r67 = r4
            r68 = r3
            r69 = r1
            r18 = r2
            r20 = r72
            r21 = r0
            r22 = r70
            r23 = r74
            r24 = r9
            r25 = r73
            r26 = r71
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            r0.A0R = r2
            java.util.Set r4 = r0.A1p
            r4.add(r2)
            java.util.Set r3 = r0.A1o
            X.5tO r2 = r0.A0R
            r3.add(r2)
            java.util.Set r3 = r0.A1q
            X.5tO r2 = r0.A0R
            r3.add(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x065f:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x086e
            java.lang.Object r3 = r4.next()
            android.app.Application$ActivityLifecycleCallbacks r3 = (android.app.Application.ActivityLifecycleCallbacks) r3
            r2 = r75
            r3.onActivityCreated(r0, r2)
            goto L_0x065f
        L_0x0671:
            X.73X r2 = r0.A13
            X.1BI r1 = r0.A0h
            X.6gj r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x0682
            android.animation.AnimatorSet r1 = r0.A00
            r1.start()
            goto L_0x0515
        L_0x0682:
            android.view.ViewGroup r1 = r0.A07
            if (r1 == 0) goto L_0x0515
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r1 = 18
            X.AnonymousClass793.A00(r2, r0, r1)
            goto L_0x0515
        L_0x0691:
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r8 = r4
            r10 = r4
            r11 = r5
            r6 = r4
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r1)
            r1 = 300(0x12c, double:1.48E-321)
            r3.setStartOffset(r1)
            r3.setFillBefore(r4)
            r3.setFillAfter(r4)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.setInterpolator(r1)
            android.view.View r1 = r0.A02
            r1.startAnimation(r3)
            goto L_0x0515
        L_0x06bd:
            r5.setVisibility(r1)
            X.00H r5 = r0.A17
            boolean r5 = X.C108975cc.A1I(r5)
            if (r5 == 0) goto L_0x0787
            com.google.android.material.button.MaterialButtonToggleGroup r6 = r0.A0C
            if (r6 == 0) goto L_0x0767
            android.view.View r5 = r0.A05
            if (r5 == 0) goto L_0x0767
            r6.setVisibility(r1)
            android.view.View r5 = r0.A05
            r5.setVisibility(r1)
            X.00H r5 = r0.A1A
            X.10T r5 = X.C17880vN.A0V(r5)
            X.6oi r8 = r0.A1m
            r5.registerObserver(r8)
            com.google.android.material.button.MaterialButtonToggleGroup r7 = r0.A0C
            if (r7 == 0) goto L_0x06f2
            r5 = 4
            X.7BO r6 = new X.7BO
            r6.<init>(r0, r5)
            java.util.LinkedHashSet r5 = r7.A06
            r5.add(r6)
        L_0x06f2:
            X.0z4 r5 = r0.A0A
            java.lang.String r7 = "AVATAR"
            android.content.SharedPreferences r6 = X.C17890vO.A0B(r5)
            java.lang.String r5 = "status_reactions_type_selected_tab"
            java.lang.String r6 = r6.getString(r5, r7)
            java.lang.String r5 = "EMOJI"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x075e
            java.lang.Integer r7 = X.AnonymousClass00R.A00
        L_0x070a:
            java.lang.Integer r10 = X.AnonymousClass00R.A00
            com.google.android.material.button.MaterialButtonToggleGroup r6 = r0.A0C
            r5 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            if (r7 != r10) goto L_0x0716
            r5 = 2131430352(0x7f0b0bd0, float:1.8482403E38)
        L_0x0716:
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r6, r5, r4)
            X.00H r5 = r0.A1B
            java.lang.Object r9 = r5.get()
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r9 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r9
            java.lang.ref.WeakReference r8 = X.AnonymousClass3MW.A0z(r8)
            java.io.File r6 = r9.A00
            if (r6 == 0) goto L_0x0734
            java.lang.Object r5 = r8.get()
            X.6oi r5 = (X.C133416oi) r5
            if (r5 == 0) goto L_0x0734
            r5.A00(r6)
        L_0x0734:
            java.io.File r5 = r9.A00
            if (r5 != 0) goto L_0x0746
            X.1OX r7 = r9.A09
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 r6 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1
            r5 = r18
            r6.<init>(r9, r8, r5)
            X.1OR r5 = X.AnonymousClass1OR.A00
            X.C30451dy.A02(r10, r5, r6, r7)
        L_0x0746:
            r5 = 2131231611(0x7f08037b, float:1.8079308E38)
            r3.setBackgroundResource(r5)
            boolean r3 = r0.A4f()
            if (r3 == 0) goto L_0x0757
            android.widget.FrameLayout r3 = r0.A08
            r3.setVisibility(r1)
        L_0x0757:
            android.widget.FrameLayout r3 = r0.A08
            A0t(r3, r0)
            goto L_0x04be
        L_0x075e:
            boolean r5 = r6.equals(r7)
            if (r5 == 0) goto L_0x087f
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            goto L_0x070a
        L_0x0767:
            X.00H r5 = r0.A19
            X.6ue r8 = X.C108945cZ.A0p(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r5 = "hasAvatar="
            r6.append(r5)
            X.00H r5 = r0.A17
            boolean r5 = X.C108975cc.A1I(r5)
            java.lang.String r7 = X.AnonymousClass3MY.A0r(r6, r5)
            r6 = 4
            java.lang.String r5 = "failed_to_setup_avatar_reactions_empty_toggle_type_views"
            r8.A02(r6, r5, r7)
            goto L_0x0746
        L_0x0787:
            android.widget.GridLayout r5 = r0.A0A
            r5.setVisibility(r1)
            goto L_0x0746
        L_0x078d:
            X.6qD r12 = r0.A0a
            X.1BI r7 = r0.A0h
            r12.A05 = r7
            r12.A00 = r0
            android.view.ViewGroup r6 = r0.A07
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0k
            java.lang.Integer r23 = X.A3P.A00(r7)
            r19 = r12
            r20 = r11
            r21 = r6
            r22 = r5
            r19.A01(r20, r21, r22, r23, r24)
            X.00H r5 = r0.A1H
            java.lang.Object r5 = r5.get()
            X.6uD r5 = (X.C136686uD) r5
            X.6in r5 = r5.A00()
            r12.A02 = r5
            X.00H r5 = r0.A1H
            java.lang.Object r5 = r5.get()
            X.6uD r5 = (X.C136686uD) r5
            X.7Hs r5 = r5.A01()
            r12.A03 = r5
            X.00H r5 = r0.A1H
            java.lang.Object r7 = r5.get()
            X.6uD r7 = (X.C136686uD) r7
            X.5ii r6 = r0.A1g
            X.722 r5 = r0.A1h
            X.6q9 r5 = r7.A02(r6, r5)
            r12.A04 = r5
            X.5z4 r7 = r12.A00()
            r0.A0b = r7
            r6 = 14
            X.7RH r5 = new X.7RH
            r5.<init>((java.lang.Object) r0, (int) r6)
            r7.A0E = r5
            X.7MX r6 = r0.A1f
            X.1BI r5 = r0.A0h
            r6.A01(r7, r5, r0)
            X.5z4 r6 = r0.A0b
            X.5ai r5 = r0.A1k
            r6.A0J(r5)
            X.7G6 r5 = new X.7G6
            r5.<init>(r0, r2)
            r6.A09 = r5
            X.18K r12 = r0.A0Y
            X.6zz r11 = r0.A0e
            r5 = 2131431135(0x7f0b0edf, float:1.848399E38)
            X.1bI r25 = X.AnonymousClass3Ma.A0x(r0, r5)
            r5 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r6 = r0.findViewById(r5)
            com.whatsapp.emoji.search.EmojiSearchContainer r6 = (com.whatsapp.emoji.search.EmojiSearchContainer) r6
            X.5z4 r5 = r0.A0b
            X.3xv r7 = new X.3xv
            r20 = r0
            r21 = r6
            r22 = r12
            r23 = r5
            r24 = r11
            r19 = r7
            r19.<init>((android.app.Activity) r20, (com.whatsapp.emoji.search.EmojiSearchContainer) r21, (X.AnonymousClass18K) r22, (X.C117015z4) r23, (X.C140126zz) r24, (X.C28931bI) r25)
            r0.A0c = r7
            r6 = 4
            X.7GD r5 = new X.7GD
            r5.<init>(r0, r6)
            r7.A00 = r5
            X.7Hl r5 = new X.7Hl
            r5.<init>(r0, r1)
            r7.A00 = r5
            X.5z4 r6 = r0.A0b
            X.7MW r5 = new X.7MW
            r5.<init>(r0, r10)
            r6.A0N(r5)
            X.7MX r7 = r0.A1f
            X.7Hr r5 = new X.7Hr
            r5.<init>(r0, r2)
            r7.A01 = r5
            r6 = 6
            X.7MW r5 = new X.7MW
            r5.<init>(r0, r6)
            r7.A04 = r5
            goto L_0x0439
        L_0x0851:
            r24 = 8
            if (r5 == 0) goto L_0x03f2
            r24 = 7
            goto L_0x03f2
        L_0x0859:
            r10.leftMargin = r11
            goto L_0x035f
        L_0x085d:
            r3 = 5
            if (r2 == 0) goto L_0x0200
            r3 = 7
            goto L_0x0200
        L_0x0863:
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            goto L_0x01b0
        L_0x0867:
            java.lang.String r2 = "chatJid must not be null"
            X.C17960vV.A08(r3, r2)
            goto L_0x00a8
        L_0x086e:
            X.1DC r2 = r0.A0y
            X.C18070vi.A0d(r2, r1)
            android.view.View r1 = r0.A03
            r0.A06 = r1
            X.10I r2 = r0.A05
            r1 = 16
            X.AnonymousClass7RH.A01(r2, r0, r1)
            return
        L_0x087f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r6)
            throw r0
        L_0x0884:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "messagereply/message-deleted/"
            X.C17900vP.A0Y(r7, r2, r3)
            X.1KB r3 = r0.A05
            r2 = 2131896336(0x7f122810, float:1.942753E38)
            r3.A08(r2, r1)
            r0.finish()
            return
        L_0x0899:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r4;
        if (i == 17) {
            r4 = AnonymousClass4a6.A00(this);
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, 65536, 0);
            r4.A0S(getString(2131887936, objArr));
            AnonymousClass758.A01(r4, this, 24, 2131899381);
            AnonymousClass758.A00(r4, this, 25, 2131898766);
        } else if (i != 106) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass1E7 A0H2 = this.A0M.A0H(this.A0h);
            r4 = AnonymousClass4a6.A00(this);
            Object[] objArr2 = new Object[1];
            AnonymousClass3MX.A1N(this.A0O, A0H2, objArr2, 0);
            r4.A0S(getString(2131887927, objArr2));
            r4.A0Z(new C1412374v(A0H2, this, 8), 2131897273);
            AnonymousClass758.A00(r4, this, 23, 2131898766);
            r4.A0G(new C1411674o(this, 12));
        }
        return r4.create();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = this.A1q.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static AnimatorSet A0q(View view, ViewGroup viewGroup) {
        AnimatorSet A0B2 = C108945cZ.A0B();
        AnimatorSet A0B3 = C108945cZ.A0B();
        ObjectAnimator A0C2 = C108945cZ.A0C(View.SCALE_X, view, new float[1], 1.5f, 0);
        ObjectAnimator A0C3 = C108945cZ.A0C(View.SCALE_Y, view, new float[1], 1.5f, 0);
        A0C2.setDuration(500);
        A0C3.setDuration(500);
        Interpolator interpolator = A1t;
        A0C2.setInterpolator(interpolator);
        A0C3.setInterpolator(interpolator);
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = A0C2;
        AnimatorSet A0A2 = C108985cd.A0A(A0B3, A0C3, animatorArr, 1);
        ObjectAnimator A0C4 = C108945cZ.A0C(View.SCALE_X, view, new float[1], 0.0f, 0);
        ObjectAnimator A0C5 = C108945cZ.A0C(View.SCALE_Y, view, new float[1], 0.0f, 0);
        ObjectAnimator A0C6 = C108945cZ.A0C(View.ALPHA, view, new float[1], 0.0f, 0);
        A0C4.setDuration(200);
        A0C5.setDuration(200);
        A0C6.setDuration(200);
        Interpolator interpolator2 = A1s;
        A0C4.setInterpolator(interpolator2);
        A0C5.setInterpolator(interpolator2);
        A0C6.setInterpolator(interpolator2);
        AnimatorSet A0A3 = C108985cd.A0A(A0A2, A0C6, C108945cZ.A1Z(A0C4, A0C5, 3, 0), 2);
        ArrayList A132 = AnonymousClass000.A13();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getId() != view.getId()) {
                ObjectAnimator A0C7 = C108945cZ.A0C(View.ALPHA, viewGroup.getChildAt(i), new float[1], 0.0f, 0);
                A0C7.setDuration(250);
                A0C7.setInterpolator(interpolator);
                A132.add(A0C7);
            }
        }
        A0A3.playTogether(A132);
        A0B2.playTogether(new Animator[]{A0B3, A0A3});
        A0B2.playSequentially(C108945cZ.A1Z(A0B3, A0A2, 2, 0));
        return A0B2;
    }

    public static void A13(MessageReplyActivity messageReplyActivity, boolean z) {
        int i;
        boolean z2;
        if (C108995ce.A1Z(messageReplyActivity)) {
            i = 106;
        } else {
            AnonymousClass74M r1 = messageReplyActivity.A14;
            if (r1 != null) {
                if (r1.A0J != null) {
                    r1.A0Z(true, false);
                } else if (r1.A0K != null) {
                    C18030ve r2 = messageReplyActivity.A0E;
                    if (r2 != null) {
                        z2 = C18020vd.A05(C18040vf.A01, r2, 12409);
                    } else {
                        z2 = false;
                    }
                    AnonymousClass74M r5 = messageReplyActivity.A14;
                    if (z2) {
                        r5.A0S(new AnonymousClass7OC(messageReplyActivity, 1), false);
                        return;
                    }
                    File file = r5.A0K;
                    if (file != null) {
                        r5.A0R(r5.A0K.length(), file.getName(), false);
                    }
                    messageReplyActivity.A14.A0X(true);
                }
                A0x(messageReplyActivity);
                return;
            }
            String trim = messageReplyActivity.A0k.getStringText().trim();
            if (!C26302CxJ.A0V(messageReplyActivity.A08, messageReplyActivity.A0o, trim)) {
                messageReplyActivity.A05.A08(2131887925, 1);
                return;
            }
            if (z) {
                trim = AnonymousClass1EG.A0E(trim, 65536);
            } else if (trim.codePointCount(0, trim.length()) > 65536) {
                i = 17;
            }
            A12(messageReplyActivity, trim);
            return;
        }
        AnonymousClass4Yv.A01(messageReplyActivity, i);
    }

    public void BCn() {
        A0x(this);
    }

    public void CMj(DialogFragment dialogFragment) {
        CMl(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!C108975cc.A1E(this) && this.A0c.A01()) {
            View view = this.A1c;
            int[] iArr = this.A1r;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1])) {
                if (motionEvent.getRawY() < ((float) AnonymousClass3MW.A02(this.A1c, iArr[1]))) {
                    if (motionEvent.getAction() == 0) {
                        this.A1j = true;
                    } else if (motionEvent.getAction() == 1) {
                        if (this.A1j) {
                            this.A0c.A00(true);
                            this.A1c.requestFocus();
                        }
                        this.A1j = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AnonymousClass206 getQuotedMessage() {
        return this.A0p;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A1a) {
            FrameLayout frameLayout = this.A08;
            if (frameLayout != null) {
                frameLayout.setVisibility(C72453Mb.A02(A4f() ? 1 : 0));
            }
            A14(this, false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A1f.A00();
        AnonymousClass74M r0 = this.A14;
        if (r0 != null) {
            r0.A0M();
            this.A14 = null;
        }
        C117015z4 r02 = this.A0b;
        if (r02 != null) {
            r02.A0M();
        }
        C26631Sw r03 = this.A0r;
        if (r03 != null) {
            r03.A04();
        }
        C121826Lq r1 = this.A12;
        if (r1 != null) {
            r1.A0B(true);
            this.A12 = null;
        }
        Set<Application.ActivityLifecycleCallbacks> set = this.A1p;
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : set) {
            onActivityDestroyed.onActivityDestroyed(this);
        }
        set.clear();
        this.A1o.clear();
        this.A1q.clear();
        AnonymousClass722 r04 = this.A1h;
        r04.A0B.unregisterObserver(r04.A09);
        AnonymousClass1OW.A04((CancellationException) null, ((AvatarReactionRepository) this.A1B.get()).A09);
        C17880vN.A0V(this.A1A).unregisterObserver(this.A1m);
    }

    public void onPause() {
        super.onPause();
        AnonymousClass74M r1 = this.A14;
        if (r1 != null && r1.A0J != null) {
            r1.A0U((File) null, (File) null);
        }
    }

    public void onResume() {
        super.onResume();
        for (Application.ActivityLifecycleCallbacks onActivityResumed : this.A1p) {
            onActivityResumed.onActivityResumed(this);
        }
    }

    public void onStart() {
        boolean isShowing;
        super.onStart();
        if (C108975cc.A1E(this)) {
            isShowing = C108965cb.A0L(this).A0U();
        } else {
            isShowing = this.A0b.isShowing();
        }
        Window window = getWindow();
        int i = 4;
        if (isShowing) {
            i = 2;
        }
        window.setSoftInputMode(i | 1);
        if (!isShowing && C72453Mb.A08(this) != 2) {
            this.A0k.A0I(true);
        }
        C121826Lq r1 = this.A12;
        if (r1 != null) {
            r1.A0B(true);
            this.A12 = null;
        }
        AnonymousClass7O7 r4 = new AnonymousClass7O7(this, 1);
        C121826Lq r12 = new C121826Lq(this.A0h, C17880vN.A0c(this.A1K), r4, this.A13);
        this.A12 = r12;
        C17890vO.A0u(r12, this.A05);
    }
}
