package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass1VE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3VX;
import X.AnonymousClass4ZN;
import X.AnonymousClass6IR;
import X.AnonymousClass6p5;
import X.AnonymousClass720;
import X.AnonymousClass7C7;
import X.AnonymousClass7G5;
import X.C107345Zi;
import X.C108985cd;
import X.C122636Rd;
import X.C131886lp;
import X.C132236mS;
import X.C132246mT;
import X.C132256mU;
import X.C132266mV;
import X.C132276mW;
import X.C132286mX;
import X.C133476op;
import X.C133486oq;
import X.C136336te;
import X.C1402670q;
import X.C147377Sx;
import X.C160968Au;
import X.C175258yP;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C18460wS;
import X.C24921Me;
import X.C27581Wq;
import X.C40811vJ;
import X.C41731wy;
import X.C72453Mb;
import X.C72463Mc;
import X.C86534Sa;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InCallBannerViewModel extends AnonymousClass3VX implements C160968Au {
    public boolean A00 = false;
    public boolean A01 = true;
    public A99 A02;
    public boolean A03 = false;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M((Object) null);
    public final C41731wy A05 = new C41731wy(false);
    public final C41731wy A06 = AnonymousClass3MW.A0o();
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final C41731wy A09 = new C41731wy(AnonymousClass000.A13());
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final C41731wy A0B = new C41731wy(false);
    public final AnonymousClass00H A0C;
    public final AnonymousClass11S A0D;
    public final AnonymousClass1VE A0E;
    public final C175258yP A0F;
    public final C147377Sx A0G;
    public final AnonymousClass1M9 A0H;
    public final C24921Me A0I;
    public final C18030ve A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final C18140vp A0T;

    private void A07(C122636Rd r5) {
        AnonymousClass7C7 r0;
        int i = 0;
        while (true) {
            C147377Sx r2 = this.A0G;
            if (i >= r2.size()) {
                return;
            }
            if (r2.get(i).A04 != r5) {
                i++;
            } else if (i >= 0) {
                r2.remove(i);
                if (i == 0) {
                    AnonymousClass1DT r1 = this.A04;
                    if (r2.isEmpty() || this.A03) {
                        r0 = null;
                    } else {
                        r0 = r2.get(0);
                    }
                    r1.A0E(r0);
                }
                if (r2.isEmpty()) {
                    C72463Mc.A1B(this.A05);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    private AnonymousClass7C7 A04(AnonymousClass7C7 r6, AnonymousClass7C7 r7) {
        C122636Rd r4 = r6.A04;
        if (r4 != r7.A04) {
            return null;
        }
        if (r7.A0E) {
            return r7;
        }
        ArrayList A10 = C17880vN.A10(r6.A0B);
        for (Object A1I : r7.A0B) {
            C108985cd.A1I(A1I, A10);
        }
        if (r4 == C122636Rd.A0E) {
            return ((AnonymousClass6p5) this.A0N.get()).A00(A10, (AnonymousClass1OS) null, r7.A00);
        }
        if (r4 == C122636Rd.A0F) {
            return ((AnonymousClass6p5) this.A0N.get()).A01(A10, (AnonymousClass1OS) null, r7.A00);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A01 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05() {
        /*
            r4 = this;
            X.1DT r3 = r4.A04
            java.lang.Object r2 = r3.A06()
            X.7C7 r2 = (X.AnonymousClass7C7) r2
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0011
            boolean r0 = r4.A01
            r1 = 0
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r2 == 0) goto L_0x001f
            boolean r0 = r2.A0D
            if (r0 == r1) goto L_0x001f
            X.7C7 r0 = r2.A00(r1)
            r3.A0F(r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel.A05():void");
    }

    private void A06(C86534Sa r4) {
        AnonymousClass00H r2 = this.A0K;
        if (((C133476op) r2.get()).A01(r4, this.A02)) {
            A99 a99 = this.A02;
            C18070vi.A0d(r4, 1);
            A08(((C133476op) r2.get()).A00((View.OnClickListener) null, r4, a99));
            return;
        }
        A07(C122636Rd.A05);
    }

    private void A08(AnonymousClass7C7 r7) {
        if (r7 != null && !this.A03) {
            C147377Sx r4 = this.A0G;
            if (r4.isEmpty()) {
                r4.add(r7);
            } else {
                AnonymousClass7C7 A002 = r4.get(0);
                AnonymousClass7C7 A042 = A04(A002, r7);
                if (A042 != null) {
                    r4.set(A042, 0);
                } else {
                    int i = A002.A01;
                    int i2 = r7.A01;
                    if (i < i2) {
                        for (int i3 = 1; i3 < r4.size(); i3++) {
                            if (i2 < r4.get(i3).A01) {
                                r4.add(i3, r7);
                                return;
                            }
                            AnonymousClass7C7 A043 = A04(r4.get(i3), r7);
                            if (A043 != null) {
                                r4.set(A043, i3);
                                return;
                            }
                        }
                        r4.add(r7);
                        return;
                    } else if (!A002.A0E || r7.A04 == A002.A04) {
                        r4.set(r7, 0);
                    } else {
                        r4.add(0, r7);
                    }
                }
            }
            this.A04.A0E(r4.get(0));
        }
    }

    public void A0S() {
        this.A0F.unregisterObserver(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r4.isEmpty() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(boolean r6) {
        /*
            r5 = this;
            X.1wy r0 = r5.A0B
            X.AnonymousClass3MY.A1L(r0, r6)
            if (r6 != 0) goto L_0x0015
            X.7Sx r4 = r5.A0G
            boolean r0 = r4.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0016
            X.1DT r2 = r5.A04
        L_0x0012:
            r2.A0F(r3)
        L_0x0015:
            return
        L_0x0016:
            r1 = 0
            X.7C7 r0 = r4.get(r1)
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x002a
            X.1DT r2 = r5.A04
        L_0x0021:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0012
            X.7C7 r3 = r4.get(r1)
            goto L_0x0012
        L_0x002a:
            r4.remove(r1)
            X.1DT r2 = r5.A04
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0012
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel.A0T(boolean):void");
    }

    public void BIq(boolean z) {
        if (z) {
            A07(C122636Rd.A03);
            return;
        }
        AnonymousClass7C7 r0 = (AnonymousClass7C7) this.A04.A06();
        if (r0 != null && r0.A04 == C122636Rd.A02) {
            C72463Mc.A1B(this.A05);
        }
    }

    public void Bn8() {
        if (C72463Mc.A1Z(this.A0T)) {
            C72463Mc.A1B(this.A05);
        }
    }

    public void BnL(C86534Sa r2) {
        if (C72463Mc.A1Z(this.A0T)) {
            A06(r2);
        }
    }

    public void Bvf(boolean z) {
        AnonymousClass1VE r3 = this.A0E;
        int i = AnonymousClass1VE.A00(r3).getInt("high_data_usage_banner_shown_count", 0);
        C18030ve r6 = this.A0J;
        C18040vf r5 = C18040vf.A02;
        int A002 = C18020vd.A00(r5, r6, 4043);
        if (i < A002) {
            C17880vN.A1C(AnonymousClass3MZ.A08(r3), "high_data_usage_banner_shown_count", AnonymousClass1VE.A00(r3).getInt("high_data_usage_banner_shown_count", 0) + 1);
            C122636Rd r7 = C122636Rd.A07;
            AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131891220);
            Object copyOf = Arrays.copyOf(new Object[0], 0);
            C18070vi.A0d(copyOf, 2);
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = copyOf;
            AnonymousClass720 A032 = A03(r7, A0t, new AnonymousClass6IR(A1a, 2131891218), z);
            A032.A07 = true;
            A032.A04 = AnonymousClass3MX.A0t(2131891219);
            A032.A05 = C17880vN.A0n(C18020vd.A00(r5, r6, 4183));
            A08(A032.A02());
        } else if (A002 == 0) {
            C17880vN.A1B(AnonymousClass3MZ.A08(r3), "high_data_usage_banner_shown_count");
        }
    }

    public void Byq(UserJid userJid, boolean z) {
        A08(((C132236mS) this.A0L.get()).A00(userJid, z));
    }

    public void Byr(UserJid userJid, boolean z) {
        A08(((C132246mT) this.A0C.get()).A00(userJid, z));
    }

    public void Bz3(C136336te r6, boolean z) {
        AnonymousClass7C7 A002;
        int i = r6.A00;
        if (i == 2 && r6.A06) {
            A002 = ((C133486oq) this.A0M.get()).A01(r6, z);
        } else if (i != 1 || !r6.A05) {
            AnonymousClass7C7 r0 = (AnonymousClass7C7) this.A04.A06();
            if (r0 != null) {
                C122636Rd r1 = r0.A04;
                if ((r1 == C122636Rd.A0D && i != 2) || (r1 == C122636Rd.A0B && i != 1)) {
                    AnonymousClass3MY.A1L(this.A05, true);
                    return;
                }
                return;
            }
            return;
        } else {
            A002 = ((C133486oq) this.A0M.get()).A00(r6, z);
        }
        A08(A002);
    }

    public void C0b(int i) {
        AnonymousClass7C7 r0;
        boolean z = this.A03;
        boolean A1S = AnonymousClass000.A1S(i, 3);
        this.A03 = A1S;
        AnonymousClass3MY.A1L(this.A05, A1S);
        if (z && !this.A03) {
            AnonymousClass1DT r2 = this.A04;
            C147377Sx r1 = this.A0G;
            if (!r1.isEmpty()) {
                r0 = r1.get(0);
            } else {
                r0 = null;
            }
            r2.A0F(r0);
        }
    }

    public void C33(UserJid userJid, boolean z, boolean z2) {
        A08(((C132276mW) this.A0R.get()).A00(userJid, z, z2));
    }

    public void C36(UserJid userJid, boolean z, boolean z2) {
        int i;
        int i2;
        AnonymousClass1E7 A0H2 = this.A0H.A0H(userJid);
        if (z2) {
            i = 2131887672;
            i2 = 2131233217;
        } else {
            i = 2131887681;
            i2 = 2131233396;
            if (C72463Mc.A1Z(this.A0T)) {
                i2 = 2131233179;
            }
        }
        C122636Rd r3 = C122636Rd.A0I;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = this.A0I.A0I(A0H2);
        AnonymousClass720 A032 = A03(r3, C1402670q.A02(A1a, i), (AnonymousClass4ZN) null, z);
        AnonymousClass720.A01(A032, i2, 2131102055);
        A08(A032.A02());
    }

    public void C4Y(UserJid userJid, boolean z, boolean z2) {
        if (!C40811vJ.A0K(this.A0D, userJid)) {
            AnonymousClass7C7 A002 = ((C131886lp) this.A0O.get()).A00(this.A0H.A0H(userJid), z);
            if (A002 == null) {
                Log.e("InCallBannerViewModel/onScreenShareStateChanged view state is null");
            } else {
                A08(A002);
            }
        }
    }

    public void C6T(C27581Wq r2) {
        if (C72463Mc.A1Z(this.A0T)) {
            A06(this.A0F.A07());
        }
    }

    public void C9p(UserJid userJid, boolean z) {
        A08(((C132286mX) this.A0S.get()).A00(userJid, z));
    }

    public void CA5(int i) {
        A08(new AnonymousClass7C7((View.OnClickListener) null, ImageView.ScaleType.CENTER, C122636Rd.A0L, (C107345Zi) null, C72453Mb.A0q(i), (AnonymousClass4ZN) null, (AnonymousClass4ZN) null, (AnonymousClass4ZN) null, (Long) null, C18460wS.A00, 0, false, false, false, false));
    }

    public void CJD(boolean z) {
        this.A00 = z;
        A05();
    }

    public void CJG(boolean z) {
        this.A01 = z;
        A05();
    }

    public void CLR(A99 a99) {
        this.A02 = a99;
        if (a99 != null) {
            AnonymousClass3VX.A00(this.A0F, this);
        }
    }

    public void CMc(View.OnClickListener onClickListener, AnonymousClass4ZN r6, AnonymousClass4ZN r7, boolean z) {
        C122636Rd r3;
        if (z) {
            r3 = C122636Rd.A03;
        } else {
            r3 = C122636Rd.A02;
        }
        AnonymousClass720 r1 = new AnonymousClass720(r3, r6, (AnonymousClass4ZN) null, 2131102073);
        C18070vi.A0d(r6, 0);
        r1.A03 = r6;
        if (r7 != null) {
            r1.A03(onClickListener);
            r1.A04 = r7;
        }
        A08(r1.A02());
    }

    public void CMt(Bitmap bitmap, AnonymousClass4ZN r6, AnonymousClass4ZN r7, Integer num) {
        AnonymousClass720 r2 = new AnonymousClass720(C122636Rd.A06, r6, (AnonymousClass4ZN) null, 2131102073);
        if (r7 != null) {
            r2.A04 = r7;
            r2.A07 = true;
        }
        AnonymousClass7G5 r1 = new AnonymousClass7G5(bitmap, num);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r2.A02 = r1;
        r2.A01 = scaleType;
        A08(r2.A02());
    }

    public void CMy(AnonymousClass4ZN r5) {
        if (r5 == null) {
            A07(C122636Rd.A08);
        } else {
            A08(new AnonymousClass720(C122636Rd.A08, r5, (AnonymousClass4ZN) null, 2131102073).A02());
        }
    }

    public void CN1(UserJid userJid, boolean z) {
        AnonymousClass6p5 r3 = (AnonymousClass6p5) this.A0N.get();
        List singletonList = Collections.singletonList(userJid);
        int i = 2131102903;
        if (z) {
            i = 2131102073;
        }
        C18070vi.A0d(singletonList, 0);
        A08(r3.A00(singletonList, (AnonymousClass1OS) null, i));
    }

    public void CRd(UserJid userJid, boolean z) {
        A08(((C132256mU) this.A0P.get()).A00(userJid, z));
    }

    public void CRe(UserJid userJid, boolean z) {
        A08(((C132266mV) this.A0Q.get()).A00(userJid, z));
    }

    public InCallBannerViewModel(AnonymousClass11S r4, AnonymousClass1VE r5, C175258yP r6, AnonymousClass1M9 r7, C24921Me r8, C18030ve r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, C18140vp r20) {
        this.A0J = r9;
        this.A0D = r4;
        this.A0I = r8;
        this.A0H = r7;
        this.A0T = r20;
        this.A0G = new C147377Sx(this);
        this.A0F = r6;
        this.A0E = r5;
        r6.registerObserver(this);
        this.A0C = r10;
        this.A0K = r11;
        this.A0O = r12;
        this.A0Q = r13;
        this.A0S = r14;
        this.A0M = r15;
        this.A0P = r16;
        this.A0R = r17;
        this.A0L = r18;
        this.A0N = r19;
    }

    public static AnonymousClass720 A03(C122636Rd r2, AnonymousClass4ZN r3, AnonymousClass4ZN r4, boolean z) {
        int i = 2131102903;
        if (z) {
            i = 2131102073;
        }
        return new AnonymousClass720(r2, r3, r4, i);
    }

    public C41731wy BSA() {
        return this.A06;
    }

    public C41731wy BST() {
        return this.A07;
    }

    public C41731wy BVK() {
        return this.A08;
    }

    public C41731wy BWL() {
        return this.A09;
    }

    public C41731wy BYL() {
        return this.A0A;
    }

    public void CN2(List list, boolean z) {
        if (!list.isEmpty()) {
            AnonymousClass6p5 r2 = (AnonymousClass6p5) this.A0N.get();
            int i = 2131102903;
            if (z) {
                i = 2131102073;
            }
            A08(r2.A01(list, (AnonymousClass1OS) null, i));
        }
    }
}
