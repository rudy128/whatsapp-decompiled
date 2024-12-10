package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;

/* renamed from: X.4lL  reason: invalid class name and case insensitive filesystem */
public class C94884lL implements C108675c7 {
    public int A00;
    public Integer A01;
    public final Context A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final C18140vp A05;

    public /* synthetic */ int BFV() {
        if (this instanceof C79273uy) {
            return ((C79273uy) this).A00;
        }
        if ((this instanceof C79293v2) || (this instanceof AnonymousClass3uz)) {
            return ((AnonymousClass3v3) this).A00;
        }
        return 0;
    }

    public int BNi() {
        if (this instanceof C79273uy) {
            return ((C79273uy) this).A00;
        }
        if (this instanceof C79293v2) {
            return ((AnonymousClass3v3) this).A00;
        }
        return 0;
    }

    public int BNk(AnonymousClass206 r3) {
        if (this instanceof C79273uy) {
            return ((C79273uy) this).A00;
        }
        if (this instanceof C79223us) {
            return 0;
        }
        if (this instanceof AnonymousClass3v1) {
            if (r3 != null && !r3.A0v.A02 && (r3.A11(8388608) || r3.A11(268435456))) {
                return 0;
            }
        } else if (this instanceof C79283v0) {
            return 0;
        } else {
            if (this instanceof C79293v2) {
                return ((AnonymousClass3v3) this).A00;
            }
            if (this instanceof AnonymousClass3uz) {
                AnonymousClass3v3 r1 = (AnonymousClass3v3) this;
                if (r3 == null || r3.A0v.A02) {
                    return r1.A00;
                }
                return r1.A00;
            } else if (this instanceof C79213ur) {
                return 0;
            }
        }
        return this.A00;
    }

    public int BNl(Context context) {
        Resources A0N;
        int i;
        if (this instanceof C79273uy) {
            C18070vi.A0d(context, 0);
            return C62762rw.A01(context, 8.0f);
        }
        if (this instanceof C79233ut) {
            A0N = context.getResources();
            i = 2131168791;
        } else {
            A0N = C72453Mb.A0N(context);
            i = 2131168070;
        }
        return A0N.getDimensionPixelSize(i);
    }

    public /* synthetic */ int BPM(Context context, int i) {
        if (this instanceof C79273uy) {
            C79273uy r3 = (C79273uy) this;
            C18070vi.A0d(context, 0);
            int A09 = C72453Mb.A09(r3.A02);
            int i2 = r3.A00;
            return (A09 - (i2 + i2)) - (r3.BW1(context, i) + r3.BW4(context, i));
        } else if (!(this instanceof C79293v2)) {
            return 0;
        } else {
            AnonymousClass3v3 r2 = (AnonymousClass3v3) this;
            C18070vi.A0d(context, 0);
            int A092 = C72453Mb.A09(r2.A02);
            int i3 = r2.A00;
            return (A092 - (i3 + i3)) - (i + i);
        }
    }

    public /* synthetic */ int BQ6() {
        if (this instanceof C79263uw) {
            int A002 = C18020vd.A00(C18040vf.A02, this.A04, 11759);
            if (A002 > 0) {
                return A002;
            }
            return 0;
        } else if (!(this instanceof C79253uv)) {
            return 0;
        } else {
            C18030ve r3 = this.A04;
            C18040vf r2 = C18040vf.A02;
            int A003 = C18020vd.A00(r2, r3, 8297);
            boolean A052 = C18020vd.A05(r2, r3, 10580);
            if (A003 <= 0 || !A052) {
                return 0;
            }
            return A003;
        }
    }

    public /* synthetic */ int BQ7() {
        if (!(this instanceof C79253uv)) {
            return 0;
        }
        C18030ve r3 = this.A04;
        C18040vf r2 = C18040vf.A02;
        int A002 = C18020vd.A00(r2, r3, 8297);
        boolean A052 = C18020vd.A05(r2, r3, 10580);
        if (A002 <= 0 || A052) {
            return 0;
        }
        return A002;
    }

    public Paint BRs() {
        Integer num = this.A01;
        if (num != null) {
            ((Paint) C72463Mc.A0m(this.A05)).setColor(num.intValue());
            this.A01 = null;
        }
        Paint paint = (Paint) C72463Mc.A0m(this.A05);
        C18070vi.A0X(paint);
        return paint;
    }

    public /* synthetic */ int BSX() {
        if (this instanceof C79273uy) {
            return ((C79273uy) this).A00;
        }
        if (this instanceof AnonymousClass3v3) {
            return ((AnonymousClass3v3) this).A00;
        }
        return 0;
    }

    public int BW1(Context context, int i) {
        if (this instanceof C79243uu) {
            return C72453Mb.A0N(context).getDimensionPixelSize(2131166963);
        }
        if ((this instanceof C79223us) || (this instanceof C79283v0)) {
            return 0;
        }
        if (this instanceof C79293v2) {
            return i;
        }
        C18070vi.A0d(context, 0);
        return C87344Vf.A00(context) + i;
    }

    public int BW4(Context context, int i) {
        if (this instanceof C79243uu) {
            return C72453Mb.A0N(context).getDimensionPixelSize(2131166962);
        }
        if (this instanceof C79233ut) {
            C18070vi.A0d(context, 0);
            return AnonymousClass3MX.A00(context.getResources(), 2131165535, C87344Vf.A00(context) + i);
        } else if ((this instanceof C79223us) || (this instanceof C79283v0)) {
            return 0;
        } else {
            if (this instanceof C79293v2) {
                return i;
            }
            C18070vi.A0d(context, 0);
            return C87344Vf.A00(context) + i;
        }
    }

    public int BWM(int i) {
        if (this instanceof C79293v2) {
            if (i != 0) {
                if (i == 1) {
                    return 2131624888;
                }
                if (i == 2) {
                    return 2131624886;
                }
                if (i == 3) {
                    return -1;
                }
                C17960vV.A0F(false, AnonymousClass001.A1I("CAGConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ", AnonymousClass000.A10(), i));
            }
            return 2131624889;
        } else if (i == 0) {
            return 2131624884;
        } else {
            if (i == 1) {
                return 2131624887;
            }
            if (i == 2) {
                return 2131624885;
            }
            if (i == 3) {
                return -1;
            }
            C17960vV.A0F(false, AnonymousClass001.A1I("FlowedConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ", AnonymousClass000.A10(), i));
            return 2131624884;
        }
    }

    public int BYu(Context context) {
        float max;
        float f;
        if (this instanceof C79233ut) {
            C79233ut r1 = (C79233ut) this;
            if (r1 instanceof C79203uq) {
                C18070vi.A0d(context, 0);
                max = Math.max(1.0f, C72463Mc.A00(context));
                f = 34.0f;
            } else if (!(r1 instanceof C79193up)) {
                return 0;
            } else {
                C18070vi.A0d(context, 0);
                max = Math.max(1.0f, C72463Mc.A00(context));
                f = 24.0f;
            }
            return (int) (max * f);
        }
        C18070vi.A0d(context, 0);
        return Math.max(1, (int) (C72463Mc.A00(context) / 2.0f));
    }

    public int BYv(Context context) {
        if (this instanceof C79233ut) {
            return 0;
        }
        return C72453Mb.A0N(context).getDimensionPixelSize(2131168615);
    }

    public boolean Beq() {
        if ((this instanceof C79303v4) || (this instanceof C79233ut) || (this instanceof C79223us)) {
            return false;
        }
        return true;
    }

    public boolean Bew(AnonymousClass206 r3) {
        if (this instanceof C79273uy) {
            return true;
        }
        if (!(this instanceof AnonymousClass3v3)) {
            return false;
        }
        AnonymousClass3v3 r1 = (AnonymousClass3v3) this;
        if (r1 instanceof AnonymousClass3v1) {
            return false;
        }
        if (!(r1 instanceof AnonymousClass3uz)) {
            return true;
        }
        C18070vi.A0d(r3, 0);
        if (r3.A0v.A02 || (r3 instanceof AnonymousClass210)) {
            return false;
        }
        return true;
    }

    public boolean Bfw() {
        if ((this instanceof AnonymousClass3ux) || (this instanceof C79213ur)) {
            return true;
        }
        return false;
    }

    public boolean BgQ() {
        if (this instanceof C79233ut) {
            return AnonymousClass3MW.A1Z(this.A03);
        }
        return AnonymousClass3MY.A1b(this.A03);
    }

    public /* synthetic */ void CJ5(int i) {
        if (this instanceof C79273uy) {
            ((C79273uy) this).A00 = i;
        } else if (this instanceof AnonymousClass3v3) {
            ((AnonymousClass3v3) this).A00 = i;
        }
    }

    public boolean CLh() {
        if ((this instanceof C79303v4) || (this instanceof C79233ut)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CLi() {
        if (this instanceof C79293v2) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CLp() {
        if ((this instanceof C79273uy) || (this instanceof C79223us) || (this instanceof C79293v2)) {
            return true;
        }
        return false;
    }

    public boolean CLq() {
        if ((this instanceof C79303v4) || (this instanceof C79233ut)) {
            return true;
        }
        return false;
    }

    public boolean CLw() {
        if (this instanceof C79233ut) {
            return AnonymousClass3MY.A1b(this.A03);
        }
        return AnonymousClass3MW.A1Z(this.A03);
    }

    public /* synthetic */ boolean CLx() {
        if (this instanceof C79273uy) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CLy() {
        if (this instanceof C79273uy) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CM7() {
        if ((this instanceof C79273uy) || (this instanceof C79293v2) || (this instanceof AnonymousClass3uz)) {
            return true;
        }
        return false;
    }

    public boolean CMI() {
        if ((this instanceof AnonymousClass3ux) || (this instanceof C79273uy) || (this instanceof C79293v2) || (this instanceof AnonymousClass3uz)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean CML() {
        if (this instanceof C79273uy) {
            return AnonymousClass000.A1O(C18020vd.A00(C18040vf.A02, this.A04, 7234));
        } else if (!(this instanceof C79213ur)) {
            return false;
        } else {
            return AnonymousClass000.A1O(C18020vd.A00(C18040vf.A02, this.A04, 7234));
        }
    }

    public boolean CMN() {
        if (this instanceof C79233ut) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CN6() {
        if (this instanceof C79293v2) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CN7() {
        if (this instanceof C79293v2) {
            return true;
        }
        return false;
    }

    public boolean CN8() {
        if ((this instanceof C79243uu) || (this instanceof C79293v2)) {
            return true;
        }
        return false;
    }

    public void CQj(Context context, int i) {
        if (this instanceof C79273uy) {
            C18070vi.A0d(context, 0);
            ((C79273uy) this).A00 = Math.max((i - C62762rw.A01(context, 600.0f)) / 2, C62762rw.A01(context, 0.0f));
        } else if (this instanceof C79293v2) {
            C18070vi.A0d(context, 0);
            ((AnonymousClass3v3) this).A00 = Math.max((i - C62762rw.A01(context, 480.0f)) / 2, C62762rw.A01(context, 16.0f));
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Hk, java.lang.Object] */
    public C94884lL(Context context, C18000vb r6, C18030ve r7) {
        C23731Hk r3;
        this.A02 = context;
        this.A04 = r7;
        this.A03 = r6;
        boolean A052 = C18020vd.A05(C18040vf.A02, r7, 7307);
        C99054sC r0 = new C99054sC((Object) this, 12);
        if (A052) {
            r3 = C23731Hk.A00(r0);
        } else {
            Object obj = r0.get();
            ? obj2 = new Object();
            Boolean bool = C17960vV.A01;
            obj2.A01 = null;
            obj2.A00 = obj;
            r3 = obj2;
        }
        C18070vi.A0b(r3);
        this.A05 = r3;
    }

    public void CQi(Context context) {
        this.A01 = Integer.valueOf(AnonymousClass1Z2.A06(C19740yt.A00(context, AnonymousClass1YL.A01(context, 2130971952, 2131103088, false)), 76));
        this.A00 = C62762rw.A01(context, 40.0f);
    }
}
