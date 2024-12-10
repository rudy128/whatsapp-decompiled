package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.Calendar;

/* renamed from: X.AXg  reason: case insensitive filesystem */
public class C20751AXg implements BDG {
    public final C18000vb A00;
    public final AnonymousClass1QO A01;
    public final BD4 A02;
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("BrazilPaymentErrorHelper", "payment", "BR");
    public final AnonymousClass118 A04;
    public final C18030ve A05;
    public final AnonymousClass1LU A06;
    public final C184659bJ A07;
    public final C31051ew A08;
    public final C20110A7s A09;

    public String BPd(int i) {
        return null;
    }

    public int BRO(int i) {
        return 0;
    }

    public void BcM(String str) {
    }

    public boolean BeQ(int i) {
        return false;
    }

    public boolean BeU(int i) {
        return false;
    }

    public boolean BfC(int i) {
        return false;
    }

    public boolean BfD(int i) {
        return false;
    }

    public boolean BfH(int i) {
        return false;
    }

    public boolean BfU(int i) {
        return false;
    }

    public boolean Bgk(int i) {
        return false;
    }

    public int BjI() {
        return 0;
    }

    public int BjJ() {
        return 0;
    }

    public C010105w A01(Context context, C18030ve r6, A27 a27, int i, int i2) {
        String str;
        C010105w A052 = this.A09.A05(context, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
        if (A052 != null) {
            return A052;
        }
        if (C18020vd.A05(C18040vf.A02, r6, 698)) {
            str = a27.A03(String.valueOf(i));
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            int i3 = 2131893610;
            if (i != -233) {
                i3 = 2131889593;
                if (i != 477) {
                    i3 = 2131887407;
                    if (i != 10229) {
                        i3 = 2131893770;
                        if (i != 10234) {
                            i3 = 2131890001;
                            if (i != 10780) {
                                if (i != 2896002) {
                                    str = context.getString(i2);
                                } else {
                                    C73203Rj A002 = AnonymousClass4a6.A00(context);
                                    A002.A0D(2131887417);
                                    C73203Rj.A06(A002);
                                    A002.A0X(new C20153A9p(context, this, 14), 2131899101);
                                    return A002.create();
                                }
                            }
                        }
                    }
                }
            }
            str = context.getString(i3);
        }
        return C20110A7s.A00(context, new C20156A9s(0), str);
    }

    public String BRN(String str, int i) {
        Context context;
        int i2;
        if (i == 14121 || i == 14125) {
            context = this.A04.A00;
            i2 = 2131897001;
        } else if (i != 2709017) {
            return str;
        } else {
            context = this.A04.A00;
            i2 = 2131896997;
        }
        return context.getString(i2);
    }

    public String BYH(int i) {
        Context context;
        int i2;
        if (i == 1703) {
            context = this.A04.A00;
            i2 = 2131896976;
        } else if (i == 10768) {
            context = this.A04.A00;
            i2 = 2131897040;
        } else if (i == 10779 || i == 12854 || i == 12907 || i == 20986 || i == 2709018) {
            context = this.A04.A00;
            i2 = 2131896992;
        } else if (i == 2826005) {
            context = this.A04.A00;
            i2 = 2131894031;
        } else if (i == 10755) {
            context = this.A04.A00;
            i2 = 2131897036;
        } else if (i != 10756) {
            return null;
        } else {
            context = this.A04.A00;
            i2 = 2131897046;
        }
        return context.getString(i2);
    }

    public boolean Bf9(int i) {
        return AnonymousClass000.A1T(i, 2001);
    }

    public boolean BfE(int i) {
        return AnonymousClass000.A1T(i, 10244);
    }

    public boolean BfF(int i) {
        return AnonymousClass000.A1T(i, 10242);
    }

    public boolean BfG(int i) {
        return AnonymousClass000.A1T(i, 10241);
    }

    public boolean BfI(int i) {
        return AnonymousClass000.A1T(i, 10240);
    }

    public boolean BfQ(int i) {
        return AnonymousClass000.A1T(i, 12871);
    }

    public boolean BfR(int i) {
        return AnonymousClass000.A1T(i, 18510);
    }

    public boolean BfS(int i) {
        return AnonymousClass000.A1T(i, 12894);
    }

    public boolean BfW(int i) {
        return AnonymousClass000.A1T(i, 12858);
    }

    public boolean BfX(int i) {
        return AnonymousClass000.A1T(i, 21001);
    }

    public boolean Bfo(int i) {
        return AnonymousClass000.A1T(i, 20985);
    }

    public boolean Bgq(int i) {
        return AnonymousClass000.A1T(i, 21000);
    }

    public C20751AXg(AnonymousClass118 r4, C18000vb r5, C18030ve r6, AnonymousClass1LU r7, C184659bJ r8, C31051ew r9, C20110A7s a7s, AnonymousClass1QO r11, BD4 bd4) {
        this.A04 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r5;
        this.A01 = r11;
        this.A02 = bd4;
        this.A07 = r8;
        this.A09 = a7s;
        this.A08 = r9;
    }

    public C010105w A00(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, DialogInterface.OnDismissListener onDismissListener3, String str, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 2896002) {
            C73203Rj A002 = AnonymousClass4a6.A00(context2);
            A002.A0D(2131887417);
            C73203Rj.A06(A002);
            A002.A0X(new C20153A9p(context2, this, 14), 2131899101);
            return A002.create();
        }
        DialogInterface.OnDismissListener onDismissListener4 = onDismissListener2;
        DialogInterface.OnDismissListener onDismissListener5 = onDismissListener3;
        String str2 = str;
        switch (i) {
            case 10780:
                return C20110A7s.A00(context2, onDismissListener4, context2.getString(2131890001));
            case 2826028:
            case 2826029:
                return C20110A7s.A00(context2, onDismissListener5, C72473Md.A0j(context2, str2, 2131887389));
            case 2826043:
                C18000vb r4 = this.A00;
                Calendar instance = Calendar.getInstance(r4.A0N());
                instance.set(10, 20);
                instance.set(12, 0);
                String A003 = A8I.A00(r4, instance.getTimeInMillis());
                Calendar instance2 = Calendar.getInstance(r4.A0N());
                instance2.set(10, 6);
                instance2.set(12, 0);
                String A004 = A8I.A00(r4, instance2.getTimeInMillis());
                String valueOf = String.valueOf(2826043);
                String string = context2.getString(2131892867);
                Object[] objArr = new Object[2];
                objArr[0] = A003;
                String A0q = C17880vN.A0q(context2, A004, objArr, 1, 2131892866);
                BD4 bd4 = this.A02;
                if (bd4 != null) {
                    C171858sO BHN = bd4.BHN();
                    BHN.A08 = C17880vN.A0k();
                    BHN.A0b = "error";
                    BHN.A0S = valueOf;
                    BHN.A0T = A0q;
                    if (string != null) {
                        BHN.A0U = string;
                    }
                    AnonymousClass8BX.A1D(this.A03, bd4, "PaymentUserActionEvent errorLoggingEvent: ", AnonymousClass000.A10());
                    bd4.BiH(BHN);
                }
                String string2 = context2.getString(2131892867);
                Object[] objArr2 = new Object[2];
                objArr2[0] = A003;
                return C20110A7s.A01(context2, onDismissListener5, string2, C17880vN.A0q(context2, A004, objArr2, 1, 2131892866));
            default:
                return this.A09.A07(context2, onDismissListener, onDismissListener4, onDismissListener5, str2, i2);
        }
    }

    public String BPa(int i) {
        Context context;
        int i2;
        if (!AnonymousClass000.A1T(i, 2826013)) {
            return null;
        }
        AnonymousClass1QO r3 = this.A01;
        if (C18020vd.A05(C18040vf.A02, r3.A02, 1587)) {
            context = this.A04.A00;
            i2 = 2131896961;
        } else if (!r3.A01()) {
            return null;
        } else {
            boolean A0D = this.A08.A0D();
            context = this.A04.A00;
            i2 = 2131896963;
            if (!A0D) {
                i2 = 2131896962;
            }
        }
        return context.getString(i2);
    }

    public int BPb(C85754Op r5, int i) {
        if (!AnonymousClass000.A1T(i, 2826013)) {
            return -1;
        }
        AnonymousClass1QO r3 = this.A01;
        if (C18020vd.A05(C18040vf.A02, r3.A02, 1587)) {
            return 20;
        }
        if (!r3.A01()) {
            return -1;
        }
        if (!this.A08.A0D()) {
            return 25;
        }
        C18030ve r1 = r5.A01;
        r1.A0N(1176);
        r1.A0N(1212);
        return -1;
    }

    public String BPc(int i) {
        if (!AnonymousClass000.A1T(i, 2826013)) {
            return null;
        }
        AnonymousClass1QO r1 = this.A01;
        if (!r1.A01()) {
            if (!C18020vd.A05(C18040vf.A02, r1.A02, 1587)) {
                return null;
            }
        }
        return this.A04.A00.getString(2131897063);
    }

    public boolean Bfp(int i) {
        return AnonymousClass000.A1T(i, 1353003);
    }

    public boolean Bg3(int i) {
        return AnonymousClass000.A1T(i, 2826013);
    }

    public boolean CMO(int i) {
        return true;
    }
}
