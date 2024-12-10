package X;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0XZ  reason: invalid class name */
public final class AnonymousClass0XZ implements C16950tU {
    public static final AnonymousClass1OS A0D = C14390ow.A00;
    public int A00;
    public long A01 = AnonymousClass0NB.A01;
    public C16790tE A02;
    public C18090vk A03;
    public C22821Di A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AndroidComposeView A08;
    public final C16970tW A09;
    public final AnonymousClass0Q2 A0A;
    public final AnonymousClass0HC A0B = new AnonymousClass0HC();
    public final AnonymousClass0J1 A0C = new AnonymousClass0J1(A0D);

    public void CG5(C18090vk r3, C22821Di r4) {
        A00(false);
        this.A06 = false;
        this.A05 = false;
        this.A01 = AnonymousClass0NB.A01;
        this.A04 = r4;
        this.A03 = r3;
    }

    private final void A00(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            this.A08.A0Z(this, z);
        }
    }

    public void Bdn(float[] fArr) {
        float[] A002 = this.A0C.A00(this.A09);
        if (A002 != null) {
            C05040Qd.A06(fArr, A002);
        }
    }

    public void Bij(C02100Cs r3, boolean z) {
        float[] fArr;
        AnonymousClass0J1 r1 = this.A0C;
        C16970tW r0 = this.A09;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                r3.A01 = 0.0f;
                r3.A03 = 0.0f;
                r3.A02 = 0.0f;
                r3.A00 = 0.0f;
                return;
            }
        } else {
            fArr = r1.A01(r0);
        }
        C05040Qd.A02(r3, fArr);
    }

    public long Bik(long j, boolean z) {
        float[] fArr;
        AnonymousClass0J1 r1 = this.A0C;
        C16970tW r0 = this.A09;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                return AnonymousClass0QY.A01;
            }
        } else {
            fArr = r1.A01(r0);
        }
        return C05040Qd.A00(fArr, j);
    }

    public void Bk4(long j) {
        C16970tW r4 = this.A09;
        int BTx = r4.BTx();
        int Baa = r4.Baa();
        int A0G = AnonymousClass000.A0G(j);
        int A0H = AnonymousClass000.A0H(j);
        if (BTx != A0G || Baa != A0H) {
            if (BTx != A0G) {
                r4.Bkd(A0G - BTx);
            }
            if (Baa != A0H) {
                r4.Bkg(A0H - Baa);
            }
            int i = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.A08;
            if (i >= 26) {
                AnonymousClass0FO.A00(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            AnonymousClass0J1 r1 = this.A0C;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    public void CPj(float[] fArr) {
        C05040Qd.A06(fArr, this.A0C.A01(this.A09));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQf() {
        /*
            r4 = this;
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x000c
            X.0tW r0 = r4.A09
            boolean r0 = r0.BSI()
            if (r0 != 0) goto L_0x002e
        L_0x000c:
            X.0tW r3 = r4.A09
            boolean r0 = r3.BOo()
            if (r0 == 0) goto L_0x002f
            X.0Q2 r1 = r4.A0A
            boolean r0 = r1.A06
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002f
            X.AnonymousClass0Q2.A02(r1)
            X.0te r2 = r1.A02
        L_0x0021:
            X.1Di r1 = r4.A04
            if (r1 == 0) goto L_0x002a
            X.0HC r0 = r4.A0B
            r3.CDa(r0, r2, r1)
        L_0x002a:
            r0 = 0
            r4.A00(r0)
        L_0x002e:
            return
        L_0x002f:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XZ.CQf():void");
    }

    public void destroy() {
        C16970tW r1 = this.A09;
        if (r1.BSI()) {
            r1.BIm();
        }
        this.A04 = null;
        this.A03 = null;
        this.A06 = true;
        A00(false);
        AndroidComposeView androidComposeView = this.A08;
        androidComposeView.A0Y();
        androidComposeView.A0a(this);
    }

    public void invalidate() {
        if (!this.A07 && !this.A06) {
            this.A08.invalidate();
            A00(true);
        }
    }

    public AnonymousClass0XZ(AndroidComposeView androidComposeView, C18090vk r4, C22821Di r5) {
        C16970tW r1;
        this.A08 = androidComposeView;
        this.A04 = r5;
        this.A03 = r4;
        this.A0A = new AnonymousClass0Q2(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            r1 = new C06190Xh(androidComposeView);
        } else {
            r1 = new C06200Xi(androidComposeView);
        }
        C16970tW r12 = r1;
        r12.CJ3();
        r12.CIK(false);
        this.A09 = r12;
    }

    public void BJa(C16960tV r11) {
        Canvas A002 = AnonymousClass0M0.A00(r11);
        boolean z = false;
        if (A002.isHardwareAccelerated()) {
            CQf();
            C16970tW r3 = this.A09;
            if (r3.BRA() > 0.0f) {
                z = true;
            }
            this.A05 = z;
            if (z) {
                r11.BJz();
            }
            r3.BJZ(A002);
            if (this.A05) {
                r11.BIk();
                return;
            }
            return;
        }
        C16970tW r32 = this.A09;
        float BTx = (float) r32.BTx();
        float Baa = (float) r32.Baa();
        float BYM = (float) r32.BYM();
        float BNc = (float) r32.BNc();
        if (r32.BMz() < 1.0f) {
            C16790tE r2 = this.A02;
            if (r2 == null) {
                r2 = new AnonymousClass0WR();
                this.A02 = r2;
            }
            r2.CHo(r32.BMz());
            A002.saveLayer(BTx, Baa, BYM, BNc, ((AnonymousClass0WR) r2).A01);
        } else {
            r11.CGe();
        }
        r11.CPp(BTx, Baa);
        r11.BFU(this.A0C.A01(r32));
        if (r32.BOo() || r32.BOn()) {
            this.A0A.A06(r11);
        }
        C22821Di r0 = this.A04;
        if (r0 != null) {
            r0.invoke(r11);
        }
        r11.CFz();
        A00(false);
    }

    public boolean Bez(long j) {
        C01990Cf r2;
        float A012 = AnonymousClass0QY.A01(j);
        float A022 = AnonymousClass0QY.A02(j);
        C16970tW r3 = this.A09;
        if (r3.BOn()) {
            if (0.0f > A012 || A012 >= ((float) r3.getWidth()) || 0.0f > A022 || A022 >= ((float) r3.getHeight())) {
                return false;
            }
        } else if (r3.BOo()) {
            AnonymousClass0Q2 r1 = this.A0A;
            if (!r1.A05 || (r2 = r1.A01) == null) {
                return true;
            }
            return AnonymousClass0Q2.A04(r2, AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
        }
        return true;
    }

    public void CFr(long j) {
        int A0G = AnonymousClass000.A0G(j);
        int A0H = AnonymousClass000.A0H(j);
        C16970tW r6 = this.A09;
        long j2 = this.A01;
        long j3 = AnonymousClass0NB.A01;
        float f = (float) A0G;
        r6.CJy(AnonymousClass001.A02(j2) * f);
        float f2 = (float) A0H;
        r6.CJz(AnonymousClass001.A01(this.A01) * f2);
        if (r6.CK3(r6.BTx(), r6.Baa(), r6.BTx() + A0G, r6.Baa() + A0H)) {
            AnonymousClass0Q2 r5 = this.A0A;
            long A0p = AnonymousClass001.A0p(f, f2);
            long j4 = AnonymousClass0QG.A02;
            if (r5.A00 != A0p) {
                r5.A00 = A0p;
                r5.A03 = true;
            }
            r6.CJn(r5.A05());
            invalidate();
            AnonymousClass0J1 r1 = this.A0C;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r14.A05() == X.AnonymousClass0GC.A00) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        if (r14.A05() != X.AnonymousClass0GC.A00) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((!r13.A0A.A06) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQp(X.AnonymousClass0WP r14, X.C28644ECa r15, X.C24246By4 r16) {
        /*
            r13 = this;
            int r3 = r14.A02()
            int r0 = r13.A00
            r3 = r3 | r0
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0011
            long r0 = r14.Bal()
            r13.A01 = r0
        L_0x0011:
            X.0tW r4 = r13.A09
            boolean r0 = r4.BOo()
            r5 = 0
            if (r0 == 0) goto L_0x0023
            X.0Q2 r0 = r13.A0A
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            r2 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r0 = r3 & 1
            if (r0 == 0) goto L_0x002f
            float r0 = r14.BYZ()
            r4.CKX(r0)
        L_0x002f:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x003a
            float r0 = r14.BYa()
            r4.CKY(r0)
        L_0x003a:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0045
            float r0 = r14.A00()
            r4.CHo(r0)
        L_0x0045:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x004c
            r4.CLE()
        L_0x004c:
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0053
            r4.CLF()
        L_0x0053:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x005e
            float r0 = r14.A01()
            r4.CIl(r0)
        L_0x005e:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x006d
            long r0 = r14.A03()
            int r0 = X.AnonymousClass0Oy.A00(r0)
            r4.CHr(r0)
        L_0x006d:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x007c
            long r0 = r14.A04()
            int r0 = X.AnonymousClass0Oy.A00(r0)
            r4.CKp(r0)
        L_0x007c:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0083
            r4.CKV()
        L_0x0083:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x008a
            r4.CKT()
        L_0x008a:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0091
            r4.CKU()
        L_0x0091:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x009c
            float r0 = r14.BO8()
            r4.CID(r0)
        L_0x009c:
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00c0
            long r0 = r13.A01
            long r6 = X.AnonymousClass0NB.A01
            float r1 = X.AnonymousClass001.A02(r0)
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r4.CJy(r1)
            long r0 = r13.A01
            float r1 = X.AnonymousClass001.A01(r0)
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r4.CJz(r1)
        L_0x00c0:
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x00cf
            X.0s9 r1 = r14.A05()
            X.0s9 r0 = X.AnonymousClass0GC.A00
            r12 = 1
            if (r1 != r0) goto L_0x00d0
        L_0x00cf:
            r12 = 0
        L_0x00d0:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00ea
            r4.CIL(r12)
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x00e6
            X.0s9 r6 = r14.A05()
            X.0s9 r1 = X.AnonymousClass0GC.A00
            r0 = 1
            if (r6 == r1) goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            r4.CIK(r0)
        L_0x00ea:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00f2
            r4.CKL()
        L_0x00f2:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00fb
            r4.CIQ()
        L_0x00fb:
            X.0Q2 r6 = r13.A0A
            X.0s9 r7 = r14.A05()
            float r10 = r14.A00()
            float r11 = r14.A01()
            r8 = r15
            r9 = r16
            boolean r1 = r6.A07(r7, r8, r9, r10, r11, r12)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x011b
            android.graphics.Outline r0 = r6.A05()
            r4.CJn(r0)
        L_0x011b:
            if (r12 == 0) goto L_0x0124
            boolean r0 = r6.A06
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0124
            r5 = 1
        L_0x0124:
            if (r2 != r5) goto L_0x012a
            if (r5 == 0) goto L_0x0153
            if (r1 == 0) goto L_0x0153
        L_0x012a:
            r13.invalidate()
        L_0x012d:
            boolean r0 = r13.A05
            if (r0 != 0) goto L_0x0141
            float r1 = r4.BRA()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0141
            X.0vk r0 = r13.A03
            if (r0 == 0) goto L_0x0141
            r0.invoke()
        L_0x0141:
            r0 = r3 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x014c
            X.0J1 r1 = r13.A0C
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x014c:
            int r0 = r14.A02()
            r13.A00 = r0
            return
        L_0x0153:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            androidx.compose.ui.platform.AndroidComposeView r0 = r13.A08
            if (r2 < r1) goto L_0x015f
            X.AnonymousClass0FO.A00(r0)
            goto L_0x012d
        L_0x015f:
            r0.invalidate()
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XZ.CQp(X.0WP, X.ECa, X.By4):void");
    }
}
