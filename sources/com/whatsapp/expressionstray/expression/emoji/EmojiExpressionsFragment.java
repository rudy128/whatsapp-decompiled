package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass20F;
import X.AnonymousClass28O;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3RO;
import X.AnonymousClass7z3;
import X.AnonymousClass842;
import X.AnonymousClass843;
import X.AnonymousClass876;
import X.C108945cZ;
import X.C108965cb;
import X.C108975cc;
import X.C110655gg;
import X.C111845kW;
import X.C111855kX;
import X.C112735lx;
import X.C135736sg;
import X.C139496yw;
import X.C1420978d;
import X.C145907Nb;
import X.C150097k8;
import X.C150107k9;
import X.C150117kA;
import X.C150127kB;
import X.C150137kC;
import X.C150147kD;
import X.C155677t8;
import X.C155687t9;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C30391dr;
import X.C30451dy;
import X.C30551e8;
import X.C36711oL;
import X.C37581pm;
import X.C37961qT;
import X.C72453Mb;
import X.C99274sY;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader;
import com.whatsapp.util.Log;

public final class EmojiExpressionsFragment extends Hilt_EmojiExpressionsFragment implements AnonymousClass876 {
    public static final int[] A0R = {128557};
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public LinearLayoutManager A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public C110655gg A07;
    public AnonymousClass3RO A08;
    public AnonymousClass1KW A09;
    public C111855kX A0A;
    public C135736sg A0B;
    public C111845kW A0C;
    public EmojiImageView A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass1OB A0L;
    public CoordinatorLayout A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        this.A00 = C139496yw.A00(A2H());
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_on_create_view_start", (String) null);
        int i = this.A00;
        C18100vl r3 = this.A0N;
        ((C139496yw) A2H().get()).A01.markerAnnotate(694884634, i, "skintone_nux_viewstub_enabled", C72453Mb.A1a(r3));
        A2H().get();
        int i2 = 2131624264;
        if (C72453Mb.A1a(r3)) {
            i2 = 2131625183;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_on_create_view_end", (String) null);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_on_view_created_start", (String) null);
        this.A02 = AnonymousClass1HF.A06(view, 2131430351);
        this.A05 = C108945cZ.A0U(view, 2131431853);
        this.A06 = C108945cZ.A0U(view, 2131435026);
        C18100vl r2 = this.A0N;
        if (C72453Mb.A1a(r2)) {
            C28931bI A002 = C28931bI.A00(view, 2131430345);
            C145907Nb.A00(A002, this, 3);
            this.A0E = A002;
        } else {
            this.A01 = AnonymousClass1HF.A06(view, 2131430345);
            this.A0D = (EmojiImageView) AnonymousClass1HF.A06(view, 2131430323);
        }
        this.A0M = (CoordinatorLayout) AnonymousClass1HF.A06(view, 2131435506);
        if (C72453Mb.A1a(r2)) {
            this.A0F = C28931bI.A00(view, 2131430346);
        } else {
            this.A03 = AnonymousClass1HF.A06(view, 2131430346);
        }
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_set_up_rv_start", (String) null);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                C1420978d.A00(recyclerView, this, 6);
            } else {
                A02(this, A00(this));
            }
        }
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_set_up_rv_end", (String) null);
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_set_up_sections_start", (String) null);
        C111845kW r1 = new C111845kW(new AnonymousClass7z3(this));
        this.A0C = r1;
        RecyclerView recyclerView2 = this.A06;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(r1);
        }
        RecyclerView recyclerView3 = this.A06;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator((C37961qT) null);
        }
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_set_up_sections_end", (String) null);
        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
        EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1 emojiExpressionsFragment$observeEmojiExpressionsSideEffects$1 = new EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1(this, (C30391dr) null);
        AnonymousClass1OR r0 = AnonymousClass1OR.A00;
        Integer num = AnonymousClass00R.A00;
        C30451dy.A02(num, r0, emojiExpressionsFragment$observeEmojiExpressionsSideEffects$1, A0H2);
        Bundle bundle2 = this.A06;
        if (bundle2 != null && bundle2.getBoolean("isCollapsed")) {
            BpD();
        }
        C108975cc.A0H(A2H()).A02(this.A00, "emoji_on_view_created_end", (String) null);
        ((C139496yw) A2H().get()).A01(this.A00, num);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            C1420978d.A00(recyclerView, this, 5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4 == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r6) {
        /*
            androidx.recyclerview.widget.RecyclerView r0 = r6.A05
            r5 = 0
            if (r0 == 0) goto L_0x004e
            int r4 = r0.getWidth()
            if (r4 != 0) goto L_0x0041
        L_0x000b:
            X.00H r0 = r6.A0G
            if (r0 == 0) goto L_0x0050
            X.6ue r3 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "itemsRecyclerViewNull="
            r2.append(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A05
            boolean r0 = X.AnonymousClass000.A1X(r1)
            r2.append(r0)
            java.lang.String r0 = ",itemsRecyclerViewWidthNull="
            r2.append(r0)
            if (r1 == 0) goto L_0x0036
            int r0 = r1.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r5 = 1
        L_0x0037:
            java.lang.String r2 = X.AnonymousClass3MY.A0r(r2, r5)
            r1 = 2
            java.lang.String r0 = "emoji_batch_size_0"
            r3.A02(r1, r0, r2)
        L_0x0041:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131166635(0x7f0705ab, float:1.794752E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r4 = r4 / r0
            return r4
        L_0x004e:
            r4 = 0
            goto L_0x000b
        L_0x0050:
            java.lang.String r0 = "avatarLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment):int");
    }

    public final AnonymousClass00H A2H() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("expressionsTrayPerformanceLogger");
        throw null;
    }

    public void BpD() {
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null) {
            return;
        }
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            C1420978d.A00(recyclerView, this, 4);
        } else {
            A01(this);
        }
    }

    public EmojiExpressionsFragment() {
        C150147kD r1 = new C150147kD(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C150127kB(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(EmojiExpressionsViewModel.class);
        this.A0Q = C99274sY.A00(new C150137kC(A002), new C155687t9(this, A002), new C155677t8(A002), A15);
        this.A0N = AnonymousClass1DF.A00(num, new C150097k8(this));
        this.A0O = AnonymousClass1DF.A00(num, new C150107k9(this));
        this.A0P = AnonymousClass1DF.A00(num, new C150117kA(this));
    }

    public static final void A01(EmojiExpressionsFragment emojiExpressionsFragment) {
        int A002 = A00(emojiExpressionsFragment);
        if (A002 > 0) {
            AnonymousClass3Ma.A1R(emojiExpressionsFragment.A0L);
            C18100vl r2 = emojiExpressionsFragment.A0Q;
            ((EmojiExpressionsViewModel) r2.getValue()).A02 = C72453Mb.A1a(emojiExpressionsFragment.A0P);
            ((EmojiExpressionsViewModel) r2.getValue()).A01 = C72453Mb.A1a(emojiExpressionsFragment.A0O);
            emojiExpressionsFragment.A0L = AnonymousClass3MY.A0s(new EmojiExpressionsFragment$observeState$1(emojiExpressionsFragment, (C30391dr) null, A002), AnonymousClass3MZ.A0H(emojiExpressionsFragment));
            return;
        }
        Log.e("Emoji batch size 0, skipping, waiting for layout");
    }

    public static final void A02(EmojiExpressionsFragment emojiExpressionsFragment, int i) {
        Paint A062 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(emojiExpressionsFragment.A14(), A062, 2131100421);
        AnonymousClass00H r0 = emojiExpressionsFragment.A0H;
        if (r0 != null) {
            C111855kX r1 = new C111855kX(A062, (EmojiImageViewLoader) C18070vi.A0E(r0), C108975cc.A0H(emojiExpressionsFragment.A2H()), new AnonymousClass842(emojiExpressionsFragment), new AnonymousClass843(emojiExpressionsFragment), i, AnonymousClass3MZ.A09(emojiExpressionsFragment).getDimensionPixelSize(2131166635));
            emojiExpressionsFragment.A0A = r1;
            RecyclerView recyclerView = emojiExpressionsFragment.A05;
            if (recyclerView != null) {
                C108965cb.A14(r1, recyclerView);
                recyclerView.A0t(new C112735lx(emojiExpressionsFragment, 2));
                AnonymousClass1FL A1B = emojiExpressionsFragment.A1B();
                if (A1B != null) {
                    C36711oL r12 = ((C139496yw) emojiExpressionsFragment.A2H().get()).A00;
                    r12.A02(A1B);
                    recyclerView.A0t(new AnonymousClass28O(A1B, r12, 11));
                }
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(emojiExpressionsFragment.A14(), 1, false);
            emojiExpressionsFragment.A04 = linearLayoutManager;
            RecyclerView recyclerView2 = emojiExpressionsFragment.A05;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
                return;
            }
            return;
        }
        C18070vi.A11("emojiImageViewLoader");
        throw null;
    }

    public void A1s() {
        super.A1s();
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            EmojiImageViewLoader emojiImageViewLoader = (EmojiImageViewLoader) r0.get();
            C30551e8.A04(((AnonymousClass1OX) emojiImageViewLoader.A04.getValue()).getCoroutineContext());
            emojiImageViewLoader.A03.clear();
            this.A0M = null;
            this.A0A = null;
            this.A08 = null;
            this.A0C = null;
            this.A05 = null;
            this.A04 = null;
            this.A07 = null;
            this.A0F = null;
            this.A06 = null;
            this.A02 = null;
            this.A0D = null;
            this.A01 = null;
            this.A0E = null;
            return;
        }
        C18070vi.A11("emojiImageViewLoader");
        throw null;
    }
}
