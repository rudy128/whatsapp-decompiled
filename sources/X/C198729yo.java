package X;

import android.text.TextUtils;

/* renamed from: X.9yo  reason: invalid class name and case insensitive filesystem */
public class C198729yo {
    public final AnonymousClass9XG A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AT7 A03;
    public final C20640ASy A04;
    public final C20641ASz A05;
    public final C189429jE A06;
    public final AT4 A07;
    public final AnonymousClass1N9 A08;
    public final AnonymousClass1R0 A09;
    public final A19 A0A;
    public final A6X A0B;
    public final AnonymousClass00H A0C;
    public final C20624ASi A0D;

    public static boolean A00(C165858bs r3, String str) {
        if (r3.buttons_.size() != 1) {
            return false;
        }
        if ((((C165228an) r3.buttons_.get(0)).nativeFlowInfo_ != null || C164458Yx.DEFAULT_INSTANCE != null) && str.equals(AnonymousClass8BX.A0N(r3, 0).name_) && !TextUtils.isEmpty(AnonymousClass8BX.A0N(r3, 0).paramsJson_)) {
            return true;
        }
        return false;
    }

    public C198729yo(AnonymousClass9XG r1, AnonymousClass118 r2, C18030ve r3, AT7 at7, C20640ASy aSy, C20641ASz aSz, C189429jE r7, AT4 at4, C20624ASi aSi, AnonymousClass1N9 r10, AnonymousClass1R0 r11, A19 a19, A6X a6x, AnonymousClass00H r14) {
        this.A02 = r3;
        this.A01 = r2;
        this.A08 = r10;
        this.A04 = aSy;
        this.A05 = aSz;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = at7;
        this.A09 = r11;
        this.A0A = a19;
        this.A0C = r14;
        this.A0B = a6x;
        this.A0D = aSi;
        this.A07 = at4;
    }
}
