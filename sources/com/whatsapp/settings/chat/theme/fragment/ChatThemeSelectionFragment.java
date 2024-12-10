package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass00R;
import X.AnonymousClass01E;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XS;
import X.AnonymousClass5VB;
import X.C103685Lg;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C37961qT;
import X.C72473Md;
import X.C89974dK;
import X.C91304fT;
import X.C91634g0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;

public final class ChatThemeSelectionFragment extends Hilt_ChatThemeSelectionFragment {
    public Bitmap A00;
    public RecyclerView A01;
    public ChatThemeViewModel A02;
    public AnonymousClass1LU A03;
    public C18600wl A04;
    public C18600wl A05;
    public boolean A06 = true;
    public final C18100vl A07 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103685Lg(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625359, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setTitle(2131896848);
        }
        AnonymousClass01E r0 = (AnonymousClass01E) A1B();
        if (r0 != null) {
            C72473Md.A18(r0);
        }
        ChatThemeViewModel chatThemeViewModel = (ChatThemeViewModel) AnonymousClass3Ma.A0I(this).A00(ChatThemeViewModel.class);
        C18070vi.A0d(chatThemeViewModel, 0);
        this.A02 = chatThemeViewModel;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131436110);
        C18070vi.A0d(recyclerView, 0);
        this.A01 = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(A14(), 2, 0, false));
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            Resources A09 = AnonymousClass3MZ.A09(this);
            C18070vi.A0X(A09);
            recyclerView2.A0r(new AnonymousClass3XS(AnonymousClass3MW.A01(A09, 2131169544)));
            RecyclerView recyclerView3 = this.A01;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator((C37961qT) null);
                C89974dK.A00(view.findViewById(2131432094), this, 17);
                C89974dK.A00(view.findViewById(2131432097), this, 18);
                ChatThemeViewModel chatThemeViewModel2 = this.A02;
                if (chatThemeViewModel2 != null) {
                    C91634g0.A00(A1G(), chatThemeViewModel2.A08, new AnonymousClass5VB(view, this), 29);
                    A1D().A2Q(new C91304fT(this, 1), A1G());
                    return;
                }
                str = "viewModel";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "themesRecyclerView";
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.graphics.Bitmap r23, android.view.View r24, com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r25, java.util.List r26, X.C30391dr r27) {
        /*
            r3 = r27
            r8 = r25
            r10 = r23
            r9 = r24
            boolean r0 = r3 instanceof X.C100914vH
            if (r0 == 0) goto L_0x0171
            r7 = r3
            X.4vH r7 = (X.C100914vH) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0171
            int r2 = r2 - r1
            r7.label = r2
        L_0x001a:
            java.lang.Object r14 = r7.result
            X.1g4 r16 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            java.lang.String r6 = "DEFAULT"
            r0 = 1
            if (r1 == 0) goto L_0x0157
            if (r1 != r0) goto L_0x017e
            boolean r5 = r7.Z$0
            java.lang.Object r12 = r7.L$10
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r4 = r7.L$9
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r11 = r7.L$8
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r13 = r7.L$7
            X.4Zr r13 = (X.C88434Zr) r13
            java.lang.Object r3 = r7.L$6
            X.4VO r3 = (X.AnonymousClass4VO) r3
            java.lang.Object r2 = r7.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r7.L$4
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r7.L$3
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            java.lang.Object r9 = r7.L$2
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r10 = r7.L$1
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.Object r8 = r7.L$0
            com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r8 = (com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment) r8
            X.C30691eM.A01(r14)
        L_0x0058:
            r27 = r1
            r1 = r12
        L_0x005b:
            android.content.Context r12 = r8.A14()
            boolean r14 = X.C28281Zt.A0B(r12)
            r12 = 0
            if (r14 == 0) goto L_0x0153
            X.4SC r15 = r3.A01
            java.lang.String r14 = r15.A03
            boolean r14 = X.C18070vi.A18(r14, r6)
            if (r14 != 0) goto L_0x0153
            boolean r14 = r3.A03
            if (r14 == 0) goto L_0x014b
            java.lang.Integer r14 = r15.A01
            if (r14 != 0) goto L_0x007c
            java.lang.Integer r14 = X.AnonymousClass3MW.A0v(r12)
        L_0x007c:
            int r24 = r14.intValue()
        L_0x0080:
            java.lang.String r13 = r13.A00
            r17 = r13
            r14 = 2130971972(0x7f040d44, float:1.7552697E38)
            r13 = 2131103226(0x7f060dfa, float:1.7818912E38)
            r15 = 2131103226(0x7f060dfa, float:1.7818912E38)
            int r21 = X.AnonymousClass1YL.A01(r11, r14, r13, r12)
            r13 = 2130971973(0x7f040d45, float:1.75527E38)
            int r22 = X.AnonymousClass1YL.A01(r11, r13, r15, r12)
            r14 = 2130971969(0x7f040d41, float:1.7552691E38)
            r13 = 2131103133(0x7f060d9d, float:1.7818724E38)
            int r23 = X.AnonymousClass1YL.A01(r11, r14, r13, r12)
            boolean r11 = r3.A03
            X.CbV r3 = new X.CbV
            r25 = r11
            r26 = r5
            r18 = r4
            r19 = r0
            r20 = r17
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.add(r3)
            r1 = r27
        L_0x00ba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x017d
            java.lang.Object r3 = r2.next()
            X.4VO r3 = (X.AnonymousClass4VO) r3
            X.4Zr r13 = r3.A00
            boolean r4 = r13 instanceof X.C80373x2
            if (r4 == 0) goto L_0x0146
            android.content.Context r5 = r8.A14()
            r4 = r13
            X.3x2 r4 = (X.C80373x2) r4
            int r4 = r4.A00
            android.view.ContextThemeWrapper r11 = new android.view.ContextThemeWrapper
            r11.<init>(r5, r4)
        L_0x00da:
            X.C18070vi.A0b(r11)
            X.4SC r4 = r3.A01
            java.lang.String r4 = r4.A03
            boolean r5 = X.C18070vi.A18(r4, r6)
            if (r5 == 0) goto L_0x012e
            r4 = r10
        L_0x00e8:
            boolean r12 = r3.A03
            if (r12 == 0) goto L_0x012a
            X.0wl r14 = r8.A05
            if (r14 == 0) goto L_0x0178
            r22 = 0
            com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1 r12 = new com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment$createSelectionItemsAndSetMessageColorListItemIcon$2$1
            r17 = r12
            r18 = r11
            r19 = r4
            r20 = r9
            r21 = r8
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r7.L$0 = r8
            r7.L$1 = r10
            r7.L$2 = r9
            r7.L$3 = r0
            r7.L$4 = r1
            r7.L$5 = r2
            r7.L$6 = r3
            r7.L$7 = r13
            r7.L$8 = r11
            r7.L$9 = r4
            r7.L$10 = r1
            r7.Z$0 = r5
            r15 = 1
            r7.label = r15
            java.lang.Object r14 = X.C30451dy.A00(r7, r14, r12)
            r12 = r16
            if (r14 != r12) goto L_0x0127
            return r16
        L_0x0127:
            r12 = r1
            goto L_0x0058
        L_0x012a:
            r27 = r1
            goto L_0x005b
        L_0x012e:
            X.4SC r4 = r3.A01
            android.graphics.drawable.Drawable r4 = r4.A00
            if (r4 == 0) goto L_0x0144
            android.graphics.Bitmap r12 = X.AnonymousClass4aX.A00(r4)
            X.C18070vi.A0X(r12)
            android.content.Context r4 = r8.A14()
            android.graphics.Bitmap r4 = A00(r4, r12)
            goto L_0x00e8
        L_0x0144:
            r4 = 0
            goto L_0x00e8
        L_0x0146:
            android.content.Context r11 = r8.A14()
            goto L_0x00da
        L_0x014b:
            r14 = 50
            java.lang.Integer r14 = X.AnonymousClass3MW.A0v(r14)
            goto L_0x007c
        L_0x0153:
            r24 = 0
            goto L_0x0080
        L_0x0157:
            X.C30691eM.A01(r14)
            X.0vl r0 = r8.A07
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 != 0) goto L_0x0167
            X.0wS r0 = X.C18460wS.A00
            return r0
        L_0x0167:
            java.util.ArrayList r1 = X.C29351c6.A0D(r26)
            java.util.Iterator r2 = r26.iterator()
            goto L_0x00ba
        L_0x0171:
            X.4vH r7 = new X.4vH
            r7.<init>(r8, r3)
            goto L_0x001a
        L_0x0178:
            X.AnonymousClass3MW.A1L()
            r0 = 0
            throw r0
        L_0x017d:
            return r1
        L_0x017e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment.A01(android.graphics.Bitmap, android.view.View, com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment, java.util.List, X.1dr):java.lang.Object");
    }

    public static final Bitmap A00(Context context, Bitmap bitmap) {
        float dimension = context.getResources().getDimension(2131165882);
        float dimension2 = context.getResources().getDimension(2131165881);
        if (((float) bitmap.getWidth()) < dimension || ((float) bitmap.getHeight()) < dimension2) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (int) ((((float) bitmap.getWidth()) - dimension) / 2.0f), (int) ((((float) bitmap.getHeight()) - dimension2) / 2.0f), (int) dimension, (int) dimension2);
        C18070vi.A0X(createBitmap);
        return createBitmap;
    }

    public void A1u() {
        super.A1u();
        if (!this.A06) {
            ChatThemeViewModel chatThemeViewModel = this.A02;
            if (chatThemeViewModel != null) {
                chatThemeViewModel.A0T(A1D());
            } else {
                AnonymousClass3MW.A1H();
                throw null;
            }
        } else {
            this.A06 = false;
        }
    }
}
