package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3hU  reason: invalid class name and case insensitive filesystem */
public abstract class C75433hU extends C75443hV implements C108765cG {
    public Configuration A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ViewStub A05;
    public ViewTreeObserver.OnGlobalLayoutListener A06;
    public ImageView A07;
    public ProgressBar A08;
    public TextView A09;
    public TextView A0A;
    public Toolbar A0B;
    public TextEmojiLabel A0C;
    public C42141xh A0D;
    public C42141xh A0E;
    public WaImageView A0F;
    public AnonymousClass4ER A0G;
    public AnonymousClass1E7 A0H;
    public C39541tF A0I;
    public C28931bI A0J;
    public C28931bI A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public ViewTreeObserver.OnGlobalLayoutListener A0O;
    public AnonymousClass49T A0P;
    public AnonymousClass4SJ A0Q;
    public View A0R;
    public C34651kr A0S;
    public final View.OnClickListener A0T = new AnonymousClass783(this, 46);
    public final AnonymousClass01E A0U;
    public final C42201xn A0V;
    public final AnonymousClass1KB A0W;
    public final C72043Kk A0X;
    public final AnonymousClass4ZR A0Y;
    public final C24921Me A0Z;
    public final C18000vb A0a;
    public final C88654aI A0b;
    public final C25181Nf A0c;
    public final C18030ve A0d;
    public final AnonymousClass1LT A0e;
    public final AnonymousClass1BI A0f;
    public final AnonymousClass10I A0g;
    public final Runnable A0h = new C70563Bp(this, 45);
    public final String A0i;
    public final AnonymousClass11S A0j;
    public final AnonymousClass1M6 A0k = new C92864i2(this, 2);
    public final C39511tC A0l;
    public final C34171k3 A0m = new C76693nw(this, 1);
    public final AnonymousClass1VW A0n;
    public final C23581Gv A0o = new C94164k9(this, 11);
    public final C24671Lf A0p;
    public final C27191Vc A0q;
    public final C27171Va A0r;
    public final C28741ap A0s = new C95414mC(this, 7);
    public final AnonymousClass1Q1 A0t;
    public final C25221Nj A0u = new C96314ne(this, 12);
    public final C25191Ng A0v;
    public final AnonymousClass1PU A0w;
    public final Runnable A0x = new C70563Bp(this, 44);
    public final C35751mk A0y;
    public final AnonymousClass1KW A0z;
    public final AnonymousClass1DC A10;

    public void onActivityStopped(Activity activity) {
        ViewTreeObserver viewTreeObserver;
        C18070vi.A0d(activity, 0);
        C42141xh r0 = this.A0E;
        if (r0 != null) {
            ViewTreeObserver viewTreeObserver2 = r0.A01.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.A0O);
            }
            View view = this.A02;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A06);
                return;
            }
            return;
        }
        C18070vi.A11("contactNameViewController");
        throw null;
    }

    public static final void A00(C75433hU r2) {
        if (r2.A0S == null || r2.A0Q == null || r2.A0I == null) {
            AnonymousClass10E r1 = (AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(r2.A0U, C000100c.class));
            r2.A0S = (C34651kr) r1.A5P.get();
            r2.A0Q = (AnonymousClass4SJ) r1.Ao8.A00.A2q.get();
            r2.A0I = (C39541tF) r1.A5U.get();
        }
    }

    public final ViewGroup A01() {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            return viewGroup;
        }
        C18070vi.A11("actionBar");
        throw null;
    }

    public final ViewGroup A02() {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            return viewGroup;
        }
        C18070vi.A11("contactHolder");
        throw null;
    }

    public final ImageView A09() {
        ImageView imageView = this.A07;
        if (imageView != null) {
            return imageView;
        }
        C18070vi.A11("contactPhoto");
        throw null;
    }

    public final TextEmojiLabel A0A() {
        TextEmojiLabel textEmojiLabel = this.A0C;
        if (textEmojiLabel != null) {
            return textEmojiLabel;
        }
        C18070vi.A11("contactStatus");
        throw null;
    }

    public void A0C() {
        if (this instanceof C77813rX) {
            C77813rX r1 = (C77813rX) this;
            C72453Mb.A1D(r1.A0F);
            C77813rX.A04(r1);
            C77813rX.A05(r1);
        } else if (this instanceof AnonymousClass3rT) {
            AnonymousClass3rT r2 = (AnonymousClass3rT) this;
            String str = r2.A00.A01;
            if (str != null) {
                r2.A0C.A0R(str);
                r2.A0C.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else if (this instanceof C77803rV) {
            C77803rV r3 = (C77803rV) this;
            if (C36301nf.A00(r3.A0d, 10056, 0) <= 0) {
                String A002 = r3.A0V.A00(r3.A0H);
                if (!r3.A0H.A0j && A002 != null) {
                    r3.A0C.setText(A002);
                    r3.A0C.setVisibility(0);
                    return;
                }
            }
            if (r3.A0G != null) {
                C77803rV.A06(r3);
            }
        } else if (this instanceof AnonymousClass3rW) {
            AnonymousClass3rW r12 = (AnonymousClass3rW) this;
            AnonymousClass3rW.A06(r12);
            AnonymousClass3rW.A05(r12);
            if (r12.A0G == null) {
                r12.A09 = true;
                return;
            }
            r12.A09 = false;
            AnonymousClass3rW.A04(r12);
        } else {
            AnonymousClass3rU r13 = (AnonymousClass3rU) this;
            r13.A0D();
            r13.A0K(r13.A00);
        }
    }

    public final void A0D() {
        if (this.A0Z.A0i(this.A0H) || this.A0H.A0H == null) {
            int i = 0;
            if (this.A0H.A0O()) {
                i = 3;
            }
            C42141xh r0 = this.A0E;
            if (r0 != null) {
                r0.A03(i);
            } else {
                C18070vi.A11("contactNameViewController");
                throw null;
            }
        }
    }

    public boolean A0F() {
        int i;
        C24921Me r3 = this.A0Z;
        boolean A0h2 = r3.A0h(this.A0H);
        AnonymousClass1E7 r1 = this.A0H;
        if (r1.A0H == null || (!A0h2 ? !r1.A0A() : !r1.A0C() || !((i = r1.A0A) == 2 || i == 3)) || r3.A0i(this.A0H)) {
            return false;
        }
        return true;
    }

    public final boolean A0G(AnonymousClass1BI r3) {
        if (r3 == null || !r3.equals(this.A0f)) {
            return false;
        }
        return true;
    }

    public void A0H(AnonymousClass1E7 r12) {
        WDSProfilePhoto wDSProfilePhoto;
        AnonymousClass4SJ r3;
        AnonymousClass1BI r6 = this.A0f;
        boolean z = false;
        if (C22971Dz.A0S(r6)) {
            A00(this);
            C39541tF r0 = this.A0I;
            if (r0 != null && r0.A00()) {
                z = true;
            }
        }
        if (!z || this.A0K == null) {
            A09().setVisibility(0);
            C28931bI r02 = this.A0K;
            if (r02 != null) {
                r02.A04(8);
            }
            ImageView A092 = A09();
            AnonymousClass1VW r5 = this.A0n;
            AnonymousClass1PU r10 = this.A0w;
            C27171Va r7 = this.A0r;
            C27191Vc r62 = this.A0q;
            AnonymousClass1E7 r9 = r12;
            if (r12 != null) {
                AnonymousClass49T r32 = new AnonymousClass49T(A092, r5, r62, r7, new AnonymousClass4LA(this), r9, r10);
                AnonymousClass3MW.A1T(r32, this.A0g, 0);
                this.A0P = r32;
                return;
            }
            return;
        }
        A09().setVisibility(8);
        C28931bI r03 = this.A0K;
        if (r03 != null) {
            r03.A04(0);
        }
        A00(this);
        C28931bI r04 = this.A0K;
        if (r04 != null && (wDSProfilePhoto = (WDSProfilePhoto) r04.A02()) != null) {
            wDSProfilePhoto.setImageResource(2131231047);
            C34651kr r4 = this.A0S;
            if (r4 != null && (r3 = this.A0Q) != null) {
                C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                AnonymousClass3MW.A1T(new AnonymousClass49A(r4, r3, (AnonymousClass1ED) r6, wDSProfilePhoto), this.A0g, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if ((r0 instanceof X.C39331st) != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r7 = this;
            X.1Nf r1 = r7.A0c
            X.1BI r0 = r7.A0f
            X.1E7 r1 = r1.A01(r0)
            r7.A0H = r1
            X.11S r0 = r7.A0j
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r1)
            if (r0 == 0) goto L_0x0082
            X.1xh r3 = r7.A0E
            if (r3 == 0) goto L_0x008f
            X.1E7 r2 = r7.A0H
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A09(r2, r1, r1, r0)
        L_0x001e:
            com.whatsapp.WaImageView r0 = r7.A0F
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0069
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0069
        L_0x002a:
            android.widget.TextView r0 = r7.A0A
            if (r0 == 0) goto L_0x008c
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0059
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0059
            android.widget.TextView r0 = r7.A0A
            if (r0 == 0) goto L_0x008c
            android.content.Context r5 = r0.getContext()
            android.widget.TextView r4 = r7.A0A
            if (r4 == 0) goto L_0x008c
            if (r5 == 0) goto L_0x0056
            r3 = 2131896789(0x7f1229d5, float:1.942845E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.CharSequence r1 = r4.getText()
            r0 = 0
            java.lang.String r2 = X.C17880vN.A0q(r5, r1, r2, r0, r3)
        L_0x0056:
            r4.setContentDescription(r2)
        L_0x0059:
            X.49T r0 = r7.A0P
            if (r0 == 0) goto L_0x0060
            r0.A0B(r6)
        L_0x0060:
            X.1E7 r0 = r7.A0H
            r7.A0H(r0)
            r7.A0C()
            return
        L_0x0069:
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x0059
            android.widget.ImageView r1 = r7.A09()
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0080
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            if (r1 == 0) goto L_0x0080
            X.1sk r0 = r1.A04
        L_0x007b:
            boolean r0 = r0 instanceof X.C39331st
            if (r0 == 0) goto L_0x0059
            goto L_0x002a
        L_0x0080:
            r0 = r2
            goto L_0x007b
        L_0x0082:
            X.1xh r1 = r7.A0E
            if (r1 == 0) goto L_0x008f
            X.1E7 r0 = r7.A0H
            r1.A05(r0)
            goto L_0x001e
        L_0x008c:
            java.lang.String r0 = "contactNameView"
            goto L_0x0091
        L_0x008f:
            java.lang.String r0 = "contactNameViewController"
        L_0x0091:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75433hU.A0I():void");
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.view.ViewGroup$MarginLayoutParams, X.039] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(android.app.Activity r10) {
        /*
            r9 = this;
            X.01E r6 = r9.A0U
            X.01n r0 = X.AnonymousClass3MY.A0J(r6)
            X.C18070vi.A0X(r0)
            android.content.Context r7 = r0.A0A()
            X.C18070vi.A0X(r7)
            boolean r5 = r9 instanceof X.AnonymousClass3rU
            if (r5 == 0) goto L_0x0227
            r3 = 0
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)
            r1 = 2131626048(0x7f0e0840, float:1.8879321E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r0, r3)
        L_0x0021:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C18070vi.A0z(r2, r0)
        L_0x0026:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r8 = 0
            X.C18070vi.A0d(r2, r8)
            r9.A03 = r2
            if (r5 == 0) goto L_0x01d2
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131437074(0x7f0b2612, float:1.8496036E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x0047
            X.AnonymousClass3MW.A1Q(r1)
            android.view.View$OnClickListener r0 = r9.A0T
            r1.setOnClickListener(r0)
            r9.A01 = r1
        L_0x0047:
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429438(0x7f0b083e, float:1.8480549E38)
            android.view.View r0 = r1.findViewById(r0)
            r9.A0R = r0
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429559(0x7f0b08b7, float:1.8480794E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.C18070vi.A0d(r0, r8)
            r9.A07 = r0
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x0071
            android.widget.ImageView r0 = r9.A09()
            X.AnonymousClass3MW.A1Q(r0)
        L_0x0071:
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131434161(0x7f0b1ab1, float:1.8490128E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0S(r1, r0)
            r9.A0F = r0
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429555(0x7f0b08b3, float:1.8480786E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C18070vi.A0d(r0, r8)
            r9.A04 = r0
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429556(0x7f0b08b4, float:1.8480788E38)
            r2 = 2131429556(0x7f0b08b4, float:1.8480788E38)
            android.widget.TextView r0 = X.AnonymousClass3Ma.A0E(r1, r0)
            X.C18070vi.A0d(r0, r8)
            r9.A0A = r0
            X.3Kk r1 = r9.A0X
            android.view.ViewGroup r0 = r9.A02()
            X.1xh r0 = X.C42141xh.A01(r0, r1, r2)
            r9.A0E = r0
            android.view.ViewGroup r0 = r9.A02()
            r3 = 1
            X.AnonymousClass1HF.A0q(r0, r3)
            X.1xh r0 = r9.A0E
            if (r0 == 0) goto L_0x025e
            com.whatsapp.TextEmojiLabel r2 = r0.A01
            X.C18070vi.A0W(r2)
            X.1KB r4 = r9.A0W
            java.lang.Runnable r1 = r9.A0x
            X.4e7 r0 = new X.4e7
            r0.<init>(r2, r4, r1)
            r9.A0O = r0
            X.1xh r0 = r9.A0E
            if (r0 == 0) goto L_0x025e
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x00dc
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r9.A0O
            r1.addOnGlobalLayoutListener(r0)
        L_0x00dc:
            android.view.ViewGroup r1 = r9.A02()
            r0 = 2131429561(0x7f0b08b9, float:1.8480798E38)
            android.view.View r2 = r1.findViewById(r0)
            r9.A02 = r2
            if (r2 == 0) goto L_0x00fd
            java.lang.Runnable r1 = r9.A0h
            X.4e6 r0 = new X.4e6
            r0.<init>(r2, r4, r1)
            r9.A06 = r0
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r9.A06
            r1.addOnGlobalLayoutListener(r0)
        L_0x00fd:
            android.view.ViewGroup r1 = r9.A02()
            r0 = 2131428528(0x7f0b04b0, float:1.8478703E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0110
            X.1bI r0 = X.AnonymousClass3MW.A0p(r0)
            r9.A0J = r0
        L_0x0110:
            X.1bI r1 = r9.A0J
            if (r1 == 0) goto L_0x0119
            r0 = 20
            X.C98254qp.A00(r1, r9, r0)
        L_0x0119:
            X.0ve r2 = r9.A0d
            r1 = 12068(0x2f24, float:1.6911E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x012c
            X.1bI r0 = r9.A0J
            if (r0 == 0) goto L_0x012c
            r0.A02()
        L_0x012c:
            android.view.ViewGroup r1 = r9.A02()
            r0 = 2131429560(0x7f0b08b8, float:1.8480796E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            X.C18070vi.A0d(r0, r8)
            r9.A0C = r0
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429573(0x7f0b08c5, float:1.8480823E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0151
            X.1bI r0 = X.AnonymousClass3MW.A0p(r0)
            r9.A0K = r0
        L_0x0151:
            android.view.ViewGroup r0 = r9.A02()
            r0.setClickable(r3)
            android.view.ViewGroup r1 = r9.A01()
            r0 = 2131429003(0x7f0b068b, float:1.8479666E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r1, r0)
            r9.A05 = r0
            androidx.appcompat.widget.Toolbar r1 = r9.A0B
            if (r1 == 0) goto L_0x0196
            android.view.ViewGroup r0 = r9.A01()
            r1.addView(r0)
        L_0x0170:
            boolean r0 = X.C22891Dp.A09
            if (r0 == 0) goto L_0x0195
            r1 = 2132083191(0x7f1501f7, float:1.9806517E38)
            X.1xh r0 = r9.A0E
            if (r0 == 0) goto L_0x025e
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            X.C29261bv.A08(r0, r1)
            r1 = 2132083190(0x7f1501f6, float:1.9806515E38)
            com.whatsapp.TextEmojiLabel r0 = r9.A0A()
            X.C29261bv.A08(r0, r1)
            X.1xh r0 = r9.A0D
            if (r0 == 0) goto L_0x0195
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            if (r0 == 0) goto L_0x0195
            X.C29261bv.A08(r0, r1)
        L_0x0195:
            return
        L_0x0196:
            X.01n r0 = X.AnonymousClass3MY.A0J(r6)
            X.C18070vi.A0X(r0)
            r0.A0G()
            if (r5 == 0) goto L_0x01c3
            android.content.res.Configuration r0 = r9.A00
            if (r0 == 0) goto L_0x025b
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L_0x01c3
            r1 = -1
            r0 = -2
            X.039 r2 = new X.039
            r2.<init>(r1, r0)
            r2.A00 = r3
            X.01n r1 = X.AnonymousClass3MY.A0J(r6)
            X.C18070vi.A0X(r1)
            android.view.ViewGroup r0 = r9.A01()
            r1.A0Q(r0, r2)
            goto L_0x0170
        L_0x01c3:
            X.01n r1 = X.AnonymousClass3MY.A0J(r6)
            X.C18070vi.A0X(r1)
            android.view.ViewGroup r0 = r9.A01()
            r1.A0P(r0)
            goto L_0x0170
        L_0x01d2:
            r1 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x01dc
            r1 = 2131437074(0x7f0b2612, float:1.8496036E38)
        L_0x01dc:
            android.view.ViewGroup r0 = r9.A01()
            android.view.View r7 = r0.findViewById(r1)
            r9.A01 = r7
            if (r7 == 0) goto L_0x0047
            android.content.res.Resources r1 = r6.getResources()
            X.C18070vi.A0X(r1)
            r0 = 2131898643(0x7f123113, float:1.943221E38)
            X.AnonymousClass3MX.A1D(r1, r7, r0)
            X.AnonymousClass3MW.A1Q(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 <= r0) goto L_0x0220
            int r4 = r7.getPaddingLeft()
            int r3 = r7.getPaddingRight()
            X.0vb r2 = r9.A0a
            X.01n r0 = X.AnonymousClass3MY.A0J(r6)
            X.C18070vi.A0X(r0)
            android.content.Context r1 = r0.A0A()
            r0 = 2131231282(0x7f080232, float:1.807864E38)
            X.3cP r0 = X.AnonymousClass3NL.A00(r1, r2, r0)
            r7.setBackground(r0)
            X.C27641Ww.A05(r7, r2, r4, r3)
        L_0x0220:
            android.view.View$OnClickListener r0 = r9.A0T
            r7.setOnClickListener(r0)
            goto L_0x0047
        L_0x0227:
            r4 = 0
            r3 = 2131624699(0x7f0e02fb, float:1.8876585E38)
            X.0ve r2 = r9.A0d
            r1 = 6218(0x184a, float:8.713E-42)
            X.0vf r0 = X.C18040vf.A01
            boolean r0 = X.AnonymousClass1J8.A0A(r2, r0, r1)
            r9.A0M = r0
            if (r0 == 0) goto L_0x023c
            r3 = 2131624704(0x7f0e0300, float:1.8876595E38)
        L_0x023c:
            r1 = 11930(0x2e9a, float:1.6717E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0251
            X.1LT r0 = r9.A0e
            android.view.View r2 = r0.A00(r7, r1, r3, r4)
            if (r2 == 0) goto L_0x0251
            goto L_0x0026
        L_0x0251:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            android.view.View r2 = r0.inflate(r3, r1, r4)
            goto L_0x0021
        L_0x025b:
            java.lang.String r0 = "currentConfig"
            goto L_0x0260
        L_0x025e:
            java.lang.String r0 = "contactNameViewController"
        L_0x0260:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75433hU.A0J(android.app.Activity):void");
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass49T r1 = this.A0P;
        if (r1 != null) {
            r1.A0B(true);
            this.A0P = null;
        }
        this.A0t.unregisterObserver(this.A0s);
        this.A0p.unregisterObserver(this.A0o);
        this.A0y.unregisterObserver(this.A0m);
        this.A0l.unregisterObserver(this.A0k);
        this.A0v.unregisterObserver(this.A0u);
    }

    public void A0B() {
        A09().setVisibility(0);
    }

    public final void A0E(View.OnClickListener onClickListener) {
        A02().setOnClickListener(onClickListener);
        View view = this.A0R;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Configuration configuration = C72453Mb.A0N(activity).getConfiguration();
        C18070vi.A0X(configuration);
        this.A00 = configuration;
        this.A0H = this.A0c.A01(this.A0f);
        A0J(activity);
        this.A0t.registerObserver(this.A0s);
        this.A0p.registerObserver(this.A0o);
        this.A0y.registerObserver(this.A0m);
        this.A0l.registerObserver(this.A0k);
        this.A0v.registerObserver(this.A0u);
    }

    public void onActivityResumed(Activity activity) {
        A0I();
        A0A().setSelected(true);
    }

    public C75433hU(AnonymousClass01E r27, C42201xn r28, AnonymousClass1KB r29, AnonymousClass11S r30, C72043Kk r31, AnonymousClass4ZR r32, C39511tC r33, C35751mk r34, AnonymousClass1VW r35, C24671Lf r36, C24921Me r37, C27191Vc r38, C27171Va r39, C18000vb r40, C88654aI r41, AnonymousClass1Q1 r42, C25181Nf r43, AnonymousClass1E7 r44, AnonymousClass1KW r45, C18030ve r46, C25191Ng r47, AnonymousClass1LT r48, AnonymousClass1BI r49, AnonymousClass1PU r50, AnonymousClass1DC r51, AnonymousClass10I r52, String str) {
        AnonymousClass10I r2 = r52;
        C18030ve r8 = r46;
        AnonymousClass1KB r23 = r29;
        AnonymousClass11S r22 = r30;
        AnonymousClass01E r25 = r27;
        C18070vi.A0w(r25, r8, r23, r22, r2);
        AnonymousClass1DC r3 = r51;
        AnonymousClass1PU r4 = r50;
        AnonymousClass1KW r9 = r45;
        C42201xn r24 = r28;
        AnonymousClass1VW r18 = r35;
        C18070vi.A0x(r9, r18, r24, r4, r3);
        C18000vb r13 = r40;
        C24921Me r16 = r37;
        C72473Md.A1L(r16, r13);
        C27171Va r14 = r39;
        C18070vi.A0d(r14, 14);
        C24671Lf r17 = r36;
        C18070vi.A0d(r17, 15);
        AnonymousClass1Q1 r12 = r42;
        C39511tC r20 = r33;
        C35751mk r19 = r34;
        C27191Vc r15 = r38;
        C18070vi.A0t(r12, r19, r20, r15);
        C25181Nf r11 = r43;
        C25191Ng r7 = r47;
        AnonymousClass1LT r6 = r48;
        C72043Kk r21 = r31;
        C18070vi.A0u(r11, r7, r21, r6);
        AnonymousClass1BI r5 = r49;
        C18070vi.A0d(r5, 24);
        AnonymousClass1E7 r10 = r44;
        C18070vi.A0d(r10, 25);
        this.A0U = r25;
        this.A0d = r8;
        this.A0W = r23;
        this.A0j = r22;
        this.A0g = r2;
        this.A0z = r9;
        this.A0n = r18;
        this.A0V = r24;
        this.A0w = r4;
        this.A10 = r3;
        this.A0Z = r16;
        this.A0a = r13;
        this.A0Y = r32;
        this.A0r = r14;
        this.A0p = r17;
        this.A0t = r12;
        this.A0y = r19;
        this.A0l = r20;
        this.A0q = r15;
        this.A0c = r11;
        this.A0v = r7;
        this.A0X = r21;
        this.A0e = r6;
        this.A0f = r5;
        this.A0H = r10;
        this.A0b = r41;
        this.A0i = str;
    }
}
