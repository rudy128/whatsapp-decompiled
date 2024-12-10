package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3u2  reason: invalid class name and case insensitive filesystem */
public class C78983u2 extends AnonymousClass3tM {
    public int A00;
    public int A01;
    public long A02 = 0;
    public View A03 = findViewById(2131429544);
    public View A04 = findViewById(2131436057);
    public ViewGroup A05 = AnonymousClass3MW.A0D(this, 2131436746);
    public ImageView A06 = AnonymousClass3MW.A0H(this, 2131431118);
    public TextView A07 = C17880vN.A0E(this, 2131429541);
    public TextView A08 = C17880vN.A0E(this, 2131431625);
    public C218617r A09;
    public WaFrameLayout A0A = ((WaFrameLayout) AnonymousClass1HF.A06(this, 2131432381));
    public C108355bZ A0B;
    public AnonymousClass4TR A0C;
    public C827349n A0D;
    public ConversationRowVideo$RowVideoView A0E = ((ConversationRowVideo$RowVideoView) findViewById(2131436123));
    public C28931bI A0F = C72453Mb.A0s(this, 2131428820);
    public C28931bI A0G = C72453Mb.A0s(this, 2131434181);
    public C86034Px A0H;
    public final AnonymousClass3M2 A0I = new C98114qb(this, 3);
    public final C38471rL A0J = new C825048f(this, 3);

    public void A1u() {
        A0E(false);
        AnonymousClass3uP.A0h(this, false);
    }

    public boolean A2r() {
        return true;
    }

    private void A02() {
        C827349n r1 = this.A0D;
        r1.A0O(0);
        r1.A0F();
        WaFrameLayout waFrameLayout = this.A0A;
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        this.A05.setVisibility(8);
        layoutParams.width = -1;
        layoutParams.height = -1;
        waFrameLayout.setLayoutParams(layoutParams);
    }

    public static void A03(C62572rc r2, C78983u2 r3, C440021t r4, boolean z) {
        AnonymousClass1KB r22;
        int i;
        String str;
        if (!r4.A0v.A02 || r2.A0V || r2.A0U || (str = r2.A0K) == null || !C26511Sk.A0H(r3.A09, str).exists()) {
            int i2 = r2.A07;
            r22 = r3.A0S;
            if (i2 == 1) {
                i = 11;
            } else {
                r22.CGP(new AnonymousClass7RF(r3, r4, 29, z));
                return;
            }
        } else {
            r22 = r3.A0S;
            i = 10;
        }
        r22.A0J(new C98784ri((Object) r3, i));
    }

    public static void A04(C78983u2 r4) {
        Log.w("ViewMessage/ no file");
        AnonymousClass206 r3 = r4.A0I;
        if (!r4.A2p()) {
            r4.A0S.CGP(new C98814rl(r4, r3, 9));
        }
    }

    public static void A05(C78983u2 r4) {
        WaFrameLayout waFrameLayout = r4.A0A;
        int width = waFrameLayout.getWidth();
        int height = waFrameLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        waFrameLayout.setLayoutParams(layoutParams);
        waFrameLayout.setClipChildren(true);
        r4.A05.setVisibility(0);
        r4.A0D.A0O(4);
    }

    public static void A0C(C78983u2 r3, C440021t r4) {
        if (!A0F(AnonymousClass206.A00((AnonymousClass21V) r3.A0I))) {
            A04(r3);
        } else {
            r3.A0S.CGP(new C98814rl(r3, r4, 11));
        }
    }

    private void A0E(boolean z) {
        C38471rL r6;
        int i;
        C38471rL r7;
        C440021t r3 = (C440021t) ((AnonymousClass21V) this.A0I);
        AnonymousClass205 r2 = r3.A0v;
        hashCode();
        C62572rc A002 = AnonymousClass206.A00(r3);
        AnonymousClass206 r62 = this.A0I;
        boolean A003 = C63652tT.A00(this.A0F, (C139506yx) this.A2W.get(), r62);
        if (z) {
            this.A07.setTag(Collections.singletonList(r3));
            A02();
        }
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0E;
        conversationRowVideo$RowVideoView.setIsGif(true);
        TextView textView = this.A08;
        textView.setVisibility(8);
        TextView textView2 = this.A07;
        int i2 = 0;
        textView2.setVisibility(0);
        if (AnonymousClass25A.A11(getFMessage())) {
            textView2.setVisibility(8);
            View view = this.A03;
            C28931bI r13 = this.A0G;
            AnonymousClass3uL.A0Q(view, textView2, r13, this.A0F, true, !z, false, A003);
            conversationRowVideo$RowVideoView.setVisibility(0);
            textView.setVisibility(8);
            if (r2.A02) {
                r7 = this.A0F;
            } else {
                r7 = null;
            }
            conversationRowVideo$RowVideoView.setOnClickListener(r7);
            this.A05.setOnClickListener(r7);
            C38471rL r63 = this.A0C;
            textView2.setOnClickListener(r63);
            r13.A05(r63);
        } else if (C79103uS.A1L(this)) {
            C90074dU r10 = new C90074dU(this, r3, 11);
            View view2 = this.A03;
            C28931bI r9 = this.A0G;
            C28931bI r8 = this.A0F;
            AnonymousClass3uL.A0Q(view2, textView2, r9, r8, false, false, false, A003);
            ((ImageView) AnonymousClass3MY.A0I(r8, 0)).setImageResource(2131231943);
            if (A003) {
                textView.setVisibility(0);
                if (AnonymousClass3MY.A1b(this.A0D)) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(2131231961, 0, 0, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C24261Jm.A00(getContext(), 2131231961), (Drawable) null);
                }
            } else {
                textView.setVisibility(8);
            }
            textView2.setVisibility(8);
            ViewGroup viewGroup = this.A05;
            viewGroup.setOnClickListener(this.A0F);
            A2l(viewGroup, viewGroup.getContext().getString(2131897885));
            textView2.setOnClickListener(r10);
            conversationRowVideo$RowVideoView.setOnClickListener(r10);
            A2l(conversationRowVideo$RowVideoView, conversationRowVideo$RowVideoView.getContext().getString(2131894628));
            if (A2s(r3)) {
                A1s();
            }
            A01();
        } else {
            C28931bI r82 = this.A0F;
            r82.A04(8);
            textView.setVisibility(8);
            if (!AnonymousClass4H3.A00(getFMessage())) {
                textView2.setText(2131895332);
                AnonymousClass3MY.A0w(getContext(), textView2, 2131895332);
                textView2.setCompoundDrawablesWithIntrinsicBounds(2131232383, 0, 0, 0);
                textView2.setOnClickListener(this.A0E);
                r6 = this.A0F;
            } else {
                A2E(textView2, (Integer) null, Collections.singletonList(r3), r3.A01);
                AnonymousClass3MY.A0w(textView2.getContext(), textView2, 2131887592);
                textView2.setCompoundDrawablesWithIntrinsicBounds(2131231869, 0, 0, 0);
                r6 = this.A0J;
                textView2.setOnClickListener(r6);
            }
            conversationRowVideo$RowVideoView.setOnClickListener(r6);
            AnonymousClass3uL.A0Q(this.A03, textView2, this.A0G, r82, false, !z, false, A003);
        }
        C18030ve r83 = this.A0F;
        C18070vi.A0d(r83, 0);
        if (C18020vd.A05(C18040vf.A02, r83, 9946)) {
            C98814rl.A00(this.A1X, this, r3, 10);
        } else {
            A0D(this, r3);
        }
        A1y();
        View.OnLongClickListener onLongClickListener = this.A2t;
        conversationRowVideo$RowVideoView.setOnLongClickListener(onLongClickListener);
        this.A05.setOnLongClickListener(onLongClickListener);
        C108355bZ r84 = this.A0B;
        WaFrameLayout waFrameLayout = this.A0A;
        waFrameLayout.setForeground(r84.BS0(AnonymousClass00R.A01, C72453Mb.A05(r2.A02 ? 1 : 0), waFrameLayout.isPressed()));
        if (r3.A0D == 0) {
            r3.A0D = C26511Sk.A03(A002.A0G);
        }
        int i3 = AnonymousClass206.A00((AnonymousClass21V) this.A0I).A05;
        ImageView imageView = this.A06;
        if (i3 != 1) {
            i = 2131231699;
            if (i3 != 2) {
                i2 = 8;
            }
            imageView.setImageResource(i);
        } else {
            i = 2131231698;
            imageView.setImageResource(i);
        }
        imageView.setVisibility(i2);
        A2m(this.A04, getFMessage().A18());
        hashCode();
        A2n(r3);
        A2P(r3);
        A2N(r3);
    }

    public static boolean A0F(C62572rc r2) {
        String path;
        File file = r2.A0G;
        if (file == null || (path = Uri.fromFile(file).getPath()) == null) {
            return false;
        }
        return new File(path).exists();
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(this.A0I) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1Z() {
        return AnonymousClass25A.A0W(this.A0E, this.A0I, this.A2O);
    }

    public void A1y() {
        C28931bI r2 = this.A0G;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r2, C88564a8.A01(r0, (AnonymousClass21V) this.A0I, r2));
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A0E(A1Z);
        }
    }

    public boolean A2a() {
        return AnonymousClass3MZ.A1b((AnonymousClass21V) this.A0I);
    }

    public int getBroadcastDrawableId() {
        if (AnonymousClass3MZ.A1b((AnonymousClass21V) this.A0I)) {
            return 2131231130;
        }
        return 2131231129;
    }

    public C440021t getFMessage() {
        return (C440021t) ((AnonymousClass21V) this.A0I);
    }

    public int getReactionsViewVerticalOverlap() {
        if (AnonymousClass3MZ.A1b((AnonymousClass21V) this.A0I)) {
            return getResources().getDimensionPixelOffset(2131168780);
        }
        return super.getReactionsViewVerticalOverlap();
    }

    public void onDetachedFromWindow() {
        AnonymousClass205 r1 = this.A0I.A0v;
        hashCode();
        super.onDetachedFromWindow();
        A02();
        AnonymousClass4TR r0 = this.A0C;
        if (r0 != null) {
            r0.A02(r1);
        }
    }

    public void onStartTemporaryDetach() {
        AnonymousClass4TR r5;
        long j;
        C19760yx r1;
        AnonymousClass21V r7 = (AnonymousClass21V) this.A0I;
        AnonymousClass205 r10 = r7.A0v;
        hashCode();
        super.onStartTemporaryDetach();
        if (this.A0D.A00.A02() != 1) {
            long j2 = this.A02;
            if (j2 > 0 && (r5 = this.A0C) != null) {
                long currentTimeMillis = System.currentTimeMillis() - j2;
                synchronized (r5) {
                    C18030ve r6 = r5.A01;
                    if (r7.A0D <= 1) {
                        j = 600;
                    } else {
                        j = C17890vO.A03(r7.A0D);
                    }
                    int i = (int) (currentTimeMillis / j);
                    Map map = r5.A00;
                    if (!(map == null || (r1 = (C19760yx) map.get(r10)) == null)) {
                        long longValue = ((Long) r1.A00).longValue() + currentTimeMillis;
                        int intValue = ((Integer) r1.A01).intValue();
                        if (i > 0) {
                            intValue += i;
                        }
                        r5.A00.put(r10, new C19760yx(Long.valueOf(longValue), Integer.valueOf(intValue)));
                        C18040vf r12 = C18040vf.A02;
                        if (C18020vd.A05(r12, r6, 2281) && longValue < C17890vO.A03(C18020vd.A00(r12, r6, 3684))) {
                            r6.A0G(3683);
                        }
                    }
                }
                this.A02 = 0;
            }
        }
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C440021t);
        super.setFMessage(r2);
    }

    public C78983u2(Context context, C108875cR r13, C440021t r14) {
        super(context, r13, r14);
        AnonymousClass4TR r0;
        A1M();
        this.A07.setTextSize(0, AnonymousClass3MW.A00(getResources(), 2131169440));
        C18030ve r9 = this.A0F;
        AnonymousClass1KB r8 = this.A0S;
        C86034Px r10 = this.A0H;
        this.A0D = new C827349n(this.A0E, this.A05, r8, r9, r10);
        this.A0D.A0T(new C98364r1(this, new AtomicBoolean(false), 0));
        C108875cR r1 = this.A0k;
        if (r1 != null) {
            r0 = (AnonymousClass4TR) r1.BPO(AnonymousClass4TR.class);
        } else {
            r0 = null;
        }
        this.A0C = r0;
        C98244qo.A00(this.A0G, 3);
        A0E(true);
    }

    private void A01() {
        if (C79103uS.A1J(this)) {
            C98784ri.A00(this.A1X, this, 13);
        } else {
            A0A(this);
        }
    }

    public static void A0A(C78983u2 r3) {
        C219217x r0;
        if (C79103uS.A1L(r3) && (r0 = r3.A03) != null && r0.A05() != AnonymousClass00R.A01 && A0F(AnonymousClass206.A00((AnonymousClass21V) r3.A0I))) {
            r3.A0S.A0J(new C98784ri((Object) r3, 9));
        }
    }

    public static void A0B(C78983u2 r2, C440021t r3) {
        AnonymousClass4TR r1;
        if (!C79103uS.A1L(r2)) {
            return;
        }
        if ((r2.A03 == null || AnonymousClass74O.A0O(r2.getContext(), r2.A03)) && (r1 = r2.A0C) != null) {
            r1.A01(r3.A0v);
            A05(r2);
            int A002 = r1.A00(r3);
            C827349n r0 = r2.A0D;
            r0.A0g(r3, A002);
            r0.A0E();
            Boolean bool = C17970vW.A03;
        }
    }

    public static void A0D(C78983u2 r4, C440021t r5) {
        int A002 = (int) (C72463Mc.A00(r4.getContext()) * 83.333336f);
        int A003 = C32021gV.A00(r5, A002);
        if (A003 <= 0) {
            A003 = (A002 * 9) / 16;
        }
        r4.A00 = A003;
        r4.A01 = A002;
        r4.A0E.A03(A002, A003, true);
        r4.A0S.CGP(new C98814rl(r4, r5, 8));
    }

    public boolean A1Y() {
        return A1f();
    }

    public void A20() {
        super.A20();
        if (this.A03 == null || AnonymousClass74O.A0O(getContext(), this.A03)) {
            C440021t r4 = (C440021t) ((AnonymousClass21V) this.A0I);
            C62572rc A002 = AnonymousClass206.A00(r4);
            boolean z = r4.A0v.A02;
            if (z || A002.A0V) {
                C79103uS.A1F(A002, r4, "ViewMessage/ from_me:", AnonymousClass000.A10(), z);
                if (C79103uS.A1J(this)) {
                    C98714rb.A00(this.A1X, this, A002, r4, 6);
                } else {
                    A03(A002, this, r4, A0F(A002));
                }
            }
        }
    }

    public int getMainChildMaxWidth() {
        if (C79103uS.A1H(this)) {
            return 0;
        }
        int A012 = C88264Yz.A01(getContext(), 72);
        int i = this.A00;
        int i2 = this.A01;
        if (i > i2) {
            return Math.max((int) ((((float) A012) / ((float) i)) * ((float) i2)), C88264Yz.A01(getContext(), 36));
        }
        return A012;
    }

    public void onAttachedToWindow() {
        hashCode();
        super.onAttachedToWindow();
        A01();
    }

    public void onFinishTemporaryDetach() {
        hashCode();
        super.onFinishTemporaryDetach();
    }

    public void onWindowFocusChanged(boolean z) {
        hashCode();
        super.onWindowFocusChanged(z);
        if (z) {
            A01();
        } else if (this.A0D.A00.A02() != 1 && this.A02 > 0 && this.A0C != null) {
            A02();
            this.A02 = 0;
        }
    }

    public int getCenteredLayoutId() {
        return 2131624830;
    }

    public int getIncomingLayoutId() {
        return 2131624830;
    }

    public int getOutgoingLayoutId() {
        return 2131624831;
    }
}
