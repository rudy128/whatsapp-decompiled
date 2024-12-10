package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.70O  reason: invalid class name */
public abstract class AnonymousClass70O {
    public final AnonymousClass1L8 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;
    public final C18000vb A03;
    public final AnonymousClass168 A04;
    public final C133426oj A05;

    public abstract long A0A();

    public abstract void A0E();

    public abstract void A0F();

    public abstract void A0G();

    public static void A09(C136026t9 r2, AnonymousClass70O r3) {
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        r2.A01();
        r3.A05.A01();
    }

    public View A0B() {
        if (this instanceof AnonymousClass6GX) {
            return ((AnonymousClass6GX) this).A09;
        }
        if (this instanceof AnonymousClass6Ga) {
            return ((AnonymousClass6Ga) this).A0G;
        }
        if (this instanceof AnonymousClass6GV) {
            return ((AnonymousClass6GV) this).A00;
        }
        if (this instanceof AnonymousClass6GW) {
            return ((AnonymousClass6GW) this).A0G;
        }
        if (this instanceof AnonymousClass6GT) {
            return ((AnonymousClass6GY) ((AnonymousClass6GT) this)).A08;
        }
        return ((AnonymousClass6GU) this).A00;
    }

    public void A0C() {
        C136026t9 r0;
        Handler handler;
        if (this instanceof AnonymousClass6GX) {
            AnonymousClass6GX r3 = (AnonymousClass6GX) this;
            C109645dm r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                AnonymousClass7RH.A00(handler, r2, 31);
            }
            if (!r3.A02 && r3.A05.A00.A07) {
                r3.A02 = true;
                r3.A0A.A07(r3);
            }
        } else if (this instanceof AnonymousClass6Ga) {
            AnonymousClass6Ga r22 = (AnonymousClass6Ga) this;
            AnonymousClass6Ga.A05(r22);
            if (!r22.A08 && !r22.A07) {
                AnonymousClass6Ga.A04(r22);
                if (r22.A04 != null) {
                    AnonymousClass6Ga.A05(r22);
                    AnonymousClass70X r02 = r22.A04;
                    if (r02 != null) {
                        r02.A0E();
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("statusplaybackvideo/no player for ");
                    Log.w(C17890vO.A0V(r22.A0O.A0v, A10));
                }
                DoodleView doodleView = r22.A0M;
                if (doodleView != null) {
                    C1410073x.A02(doodleView);
                }
                AnonymousClass6Ga.A07(r22);
            }
        } else {
            if (this instanceof AnonymousClass6GV) {
                r0 = ((AnonymousClass6GV) this).A06;
            } else if (this instanceof AnonymousClass6GW) {
                r0 = ((AnonymousClass6GW) this).A0F;
            } else if (this instanceof AnonymousClass6GT) {
                r0 = ((AnonymousClass6GY) ((AnonymousClass6GT) this)).A0B;
            } else {
                r0 = ((AnonymousClass6GU) this).A01;
            }
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.A0V == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.AnonymousClass6GX
            if (r0 == 0) goto L_0x001a
            X.6GX r3 = (X.AnonymousClass6GX) r3
            X.22l r0 = r3.A08
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0V
            r1 = 0
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            X.5fj r0 = r3.A09
            r0.setBlurEnabled(r1)
        L_0x0019:
            return
        L_0x001a:
            boolean r0 = r3 instanceof X.AnonymousClass6Ga
            if (r0 == 0) goto L_0x0033
            X.6Ga r3 = (X.AnonymousClass6Ga) r3
            boolean r0 = r3.A0I()
            if (r0 != 0) goto L_0x002f
            X.AnonymousClass6Ga.A06(r3)
            X.AnonymousClass6Ga.A08(r3)
            X.AnonymousClass6Ga.A05(r3)
        L_0x002f:
            X.AnonymousClass6Ga.A03(r3)
            return
        L_0x0033:
            boolean r0 = r3 instanceof X.AnonymousClass6GV
            if (r0 == 0) goto L_0x00a7
            X.6GV r3 = (X.AnonymousClass6GV) r3
            X.6kd r2 = X.C1404271j.A08
            X.1vD r1 = r3.A02
            X.1o3 r0 = r3.A03
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r6 = r1.A03()
            X.C18070vi.A0X(r6)
            X.206 r0 = r3.A05
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            r1 = 2131890597(0x7f1211a5, float:1.941589E38)
            if (r0 == 0) goto L_0x0057
            r1 = 2131890596(0x7f1211a4, float:1.9415888E38)
        L_0x0057:
            android.content.Context r0 = X.AnonymousClass70K.A0B(r3)
            java.lang.String r1 = r2.A00(r0, r6, r1)
            r8 = 0
            android.text.Spanned r0 = android.text.Html.fromHtml(r1)
            android.text.SpannableString r7 = android.text.SpannableString.valueOf(r0)
            X.C18070vi.A0X(r7)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r5 = r7.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            X.C18070vi.A0b(r5)
            int r4 = r5.length
            r2 = 0
        L_0x007c:
            if (r2 >= r4) goto L_0x00df
            r10 = r5[r2]
            int r1 = r7.getSpanStart(r10)
            int r0 = r7.getSpanEnd(r10)
            r7.removeSpan(r10)
            com.whatsapp.TextEmojiLabel r9 = r3.A01
            android.content.Context r11 = X.AnonymousClass3MY.A04(r9)
            X.1KB r13 = r3.A01
            X.11C r14 = r3.A02
            X.1L8 r12 = r3.A00
            java.lang.String r16 = r10.getURL()
            r15 = 0
            X.3cE r10 = new X.3cE
            r10.<init>((android.content.Context) r11, (X.AnonymousClass1L8) r12, (X.AnonymousClass1KB) r13, (X.AnonymousClass11C) r14, (X.AnonymousClass206) r15, (java.lang.String) r16)
            r7.setSpan(r10, r1, r0, r8)
            int r2 = r2 + 1
            goto L_0x007c
        L_0x00a7:
            boolean r0 = r3 instanceof X.AnonymousClass6GW
            if (r0 != 0) goto L_0x0019
            boolean r0 = r3 instanceof X.AnonymousClass6GY
            if (r0 == 0) goto L_0x0019
            X.6GY r3 = (X.AnonymousClass6GY) r3
            com.whatsapp.mediaview.PhotoView r5 = r3.A08
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r5)
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r0)
            X.C18070vi.A0X(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 3
            X.7NC r7 = new X.7NC
            r7.<init>(r3, r1, r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00ea
            X.1gV r4 = r3.A0C
            X.21d r6 = r3.A09
            X.205 r8 = r6.A0v
            r9 = 1
            r4.A0G(r5, r6, r7, r8, r9)
            return
        L_0x00df:
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r1.setText(r7)
            r0 = 27
            X.AnonymousClass3MY.A1E(r1, r6, r3, r0)
            return
        L_0x00ea:
            X.1gV r2 = r3.A0C
            X.21d r1 = r3.A09
            r0 = 1
            r2.A0I(r5, r1, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70O.A0D():void");
    }

    public void A0H(boolean z) {
        if (this instanceof AnonymousClass6GX) {
            ((AnonymousClass6GX) this).A04 = z;
        } else if (this instanceof AnonymousClass6Ga) {
            AnonymousClass6Ga r2 = (AnonymousClass6Ga) this;
            r2.A07 = z;
            AnonymousClass6Gp r1 = r2.A05.A00;
            if (r1.A07) {
                AnonymousClass70X r0 = r2.A04;
                if (z) {
                    if (r0 != null) {
                        r0.A0B();
                        Bitmap A08 = r0.A08();
                        if (A08 != null) {
                            r2.A0N.A0A(A08);
                            r2.A0A = true;
                        }
                    }
                    r2.A0F.setVisibility(0);
                    AnonymousClass6Ga.A08(r2);
                } else if (r0 == null) {
                    AnonymousClass6Ga.A05(r2);
                    r2.A0F();
                } else {
                    AnonymousClass6Ga.A05(r2);
                    r1.A0N();
                }
            }
        }
    }

    public boolean A0I() {
        AnonymousClass168 r2;
        AnonymousClass206 r1;
        if (this instanceof AnonymousClass6GX) {
            AnonymousClass6GX r0 = (AnonymousClass6GX) this;
            r2 = r0.A04;
            r1 = r0.A08;
        } else if (this instanceof AnonymousClass6Ga) {
            AnonymousClass6Ga r02 = (AnonymousClass6Ga) this;
            return C137406vP.A01(r02.A0K, r02.A04, r02.A0O);
        } else if (this instanceof AnonymousClass6GV) {
            AnonymousClass6GV r03 = (AnonymousClass6GV) this;
            return C137406vP.A01(r03.A04, r03.A04, r03.A05);
        } else if (this instanceof AnonymousClass6GW) {
            AnonymousClass6GW r04 = (AnonymousClass6GW) this;
            r2 = r04.A04;
            r1 = r04.A0E;
        } else if (!(this instanceof AnonymousClass6GY)) {
            return true;
        } else {
            AnonymousClass6GY r05 = (AnonymousClass6GY) this;
            r2 = r05.A04;
            r1 = r05.A09;
        }
        C18070vi.A0d(r1, 1);
        return C137406vP.A01((C18030ve) null, r2, r1);
    }

    public AnonymousClass70O(AnonymousClass1L8 r1, AnonymousClass1KB r2, AnonymousClass11C r3, C18000vb r4, AnonymousClass168 r5, C133426oj r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A05 = r6;
    }
}
