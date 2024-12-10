package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.Reference;
import java.util.HashMap;

/* renamed from: X.4aN  reason: invalid class name */
public class AnonymousClass4aN {
    public static HandlerThread A0U;
    public static AnonymousClass3NQ A0V;
    public static AnonymousClass3NS A0W;
    public static final int A0X = ViewConfiguration.getKeyRepeatDelay();
    public static final int A0Y = ViewConfiguration.getKeyRepeatTimeout();
    public static final HashMap A0Z = C17880vN.A11();
    public int A00;
    public int A01;
    public C107845ai A02;
    public C110655gg A03;
    public AnonymousClass3RO A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Paint A0A = AnonymousClass3MW.A06();
    public final LayoutInflater A0B;
    public final View.OnClickListener A0C;
    public final View A0D;
    public final ViewGroup A0E;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new C90584eJ((Object) this, 1);
    public final AbsListView.OnScrollListener A0G;
    public final AbsListView.OnScrollListener A0H = new C64782vK(this, 0);
    public final ImageView A0I;
    public final ViewPager A0J;
    public final C19830z4 A0K;
    public final AnonymousClass1KW A0L;
    public final C18010vc A0M;
    public final boolean A0N;
    public final C72993Oo[] A0O;
    public final C87854Xi[] A0P;
    public final View A0Q;
    public final AnonymousClass190 A0R;
    public final C1193267r A0S;
    public final C18030ve A0T;

    public static void A01(AnonymousClass3O9 r6, AnonymousClass4aN r7) {
        AnonymousClass3O9 r2 = r6;
        if (AnonymousClass74I.A02(r6.A04)) {
            C110655gg r1 = new C110655gg(r2, new C95884mx(r6, r7, 1), r7.A0L, r6.A04, false);
            r7.A03 = r1;
            AnonymousClass72X.A01(r2, r7.A0Q, r1);
        }
    }

    public static void A02(AnonymousClass3O9 r7, AnonymousClass4aN r8) {
        AnonymousClass3RO r1 = new AnonymousClass3RO(r7, new C95884mx(r7, r8, 0), r8.A0L, r7.A04, false);
        r8.A04 = r1;
        AnonymousClass72X.A01(r7, r8.A0Q, r1);
    }

    public static Drawable A00(long j) {
        Reference reference = (Reference) A0Z.get(Long.valueOf(j));
        if (reference == null) {
            return null;
        }
        return (Drawable) reference.get();
    }

    public static void A03(AnonymousClass4aN r9, int i) {
        for (C87854Xi r2 : r9.A0P) {
            ViewGroup viewGroup = r9.A0E;
            View findViewById = viewGroup.findViewById(r2.A01);
            View findViewById2 = viewGroup.findViewById(r2.A00);
            if (findViewById2 != null) {
                if (r2.A02 == i) {
                    findViewById2.setSelected(true);
                    C72463Mc.A0v(findViewById.getContext(), findViewById.getContext(), findViewById, 2130970739, 2131102169);
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public static void A04(AnonymousClass4aN r2, int[] iArr) {
        if (iArr == null) {
            r2.A0R.A0G("EmojiPicker/onEmojiSelected/emoji being added is null", (String) null, true);
            return;
        }
        r2.A0S.A0A(iArr);
        if (r2.A00 != 0) {
            r2.A0O[0].notifyDataSetChanged();
        }
        C107845ai r0 = r2.A02;
        if (r0 != null) {
            r0.BsW(iArr);
        }
    }

    public AnonymousClass4aN(Context context, View view, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener, AnonymousClass190 r17, C19830z4 r18, C18000vb r19, C1193267r r20, AnonymousClass1KW r21, C18030ve r22, C18010vc r23) {
        int length;
        int length2;
        AbsListView.OnScrollListener onScrollListener2 = onScrollListener;
        this.A0G = onScrollListener2;
        this.A0N = AnonymousClass000.A1W(onScrollListener2);
        this.A0Q = view;
        this.A09 = context;
        C18030ve r10 = r22;
        this.A0T = r10;
        this.A0R = r17;
        this.A0L = r21;
        C1193267r r8 = r20;
        this.A0S = r8;
        C19830z4 r7 = r18;
        this.A0K = r7;
        C18010vc r6 = r23;
        this.A0M = r6;
        this.A06 = AnonymousClass3Ma.A00(context, 2130969438, 2131100423);
        this.A08 = AnonymousClass3Ma.A00(context, 2130970659, 2131102034);
        this.A0E = AnonymousClass3MW.A0D(viewGroup, 2131430319);
        C137786w1.A00(r10);
        C87854Xi[] r1 = new C87854Xi[9];
        this.A0P = r1;
        r1[0] = new C74723cN(r8);
        int i = 1;
        while (true) {
            C87854Xi[] r3 = this.A0P;
            length = r3.length;
            if (i >= length) {
                break;
            }
            r3[i] = new C87854Xi(C137786w1.A00(r10)[i - 1], i);
            i++;
        }
        C72993Oo[] r12 = new C72993Oo[length];
        this.A0O = r12;
        C18000vb r32 = r19;
        r12[0] = new C72993Oo(context, this, r32, 0);
        this.A00 = r8.A03() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(2131433401);
        this.A0J = viewPager;
        viewPager.setAdapter(new C74773cS(this, r32));
        viewPager.A0K(new C91824gJ(context, this, r32, r6));
        this.A0B = (LayoutInflater) AnonymousClass11C.A02(context, "layout_inflater");
        this.A05 = context.getResources().getDimensionPixelSize(2131166635);
        this.A07 = context.getResources().getDimensionPixelSize(2131166633);
        for (C87854Xi r82 : this.A0P) {
            View findViewById = this.A0E.findViewById(r82.A00);
            AnonymousClass3MY.A0w(context, findViewById, r82.A03);
            C90084dV.A00(findViewById, this, r32, r82, 3);
        }
        if (AnonymousClass3MY.A1b(r32)) {
            length2 = this.A00;
        } else {
            length2 = (this.A0O.length - 1) - this.A00;
        }
        this.A0J.A0J(length2, false);
        A03(this, this.A00);
        this.A0C = new C90084dV((Object) this, (Object) r6, (Object) r7, 4);
        ImageView A0H2 = AnonymousClass3MW.A0H(viewGroup, 2131429906);
        this.A0I = A0H2;
        if (A0H2 != null) {
            AnonymousClass3NU r13 = new AnonymousClass3NU(Looper.getMainLooper(), this, 0);
            A0H2.setClickable(true);
            A0H2.setLongClickable(true);
            A0H2.setOnTouchListener(new C90304dr(r13, this, 1));
            AnonymousClass3MZ.A1N(A0H2, this, 24);
            AnonymousClass3NL.A01(this.A09, A0H2, r32, 2131231715);
            AnonymousClass3MY.A0w(context, A0H2, 2131886910);
        }
        View findViewById2 = viewGroup.findViewById(2131430346);
        this.A0D = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            AnonymousClass3MZ.A1N(findViewById2.findViewById(2131433257), this, 25);
            AnonymousClass3MZ.A1N(findViewById2, this, 26);
        }
    }
}
