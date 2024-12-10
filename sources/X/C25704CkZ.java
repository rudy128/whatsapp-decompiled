package X;

import android.content.res.TypedArray;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.CkZ  reason: case insensitive filesystem */
public final class C25704CkZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L = -1;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public C24353Bzo A0U;
    public C24353Bzo A0V;
    public C24353Bzo A0W;
    public C24353Bzo A0X;
    public AnonymousClass4D7 A0Y;
    public AnonymousClass4D7 A0Z;
    public C24253ByB A0a;
    public C24253ByB A0b;
    public C83064Df A0c;
    public C83064Df A0d;
    public AnonymousClass4D8 A0e;
    public AnonymousClass4D8 A0f;
    public C24267ByQ A0g;
    public C24291Byo A0h;
    public C24363Bzy A0i;
    public C24363Bzy A0j;
    public C39201sg A0k;
    public C39191sf A0l;
    public C24300Byx A0m;
    public C24280Byd A0n;
    public Integer A0o;
    public Integer A0p;
    public Integer A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public final WDSListItem A0z;
    public final TypedArray A10;

    public final void A01(AnonymousClass4D7 r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A0Y, r2);
        this.A0Y = r2;
        A00(this, A1Z);
    }

    public C25704CkZ(TypedArray typedArray, WDSListItem wDSListItem) {
        C24353Bzo bzo;
        C24353Bzo bzo2;
        C24353Bzo bzo3;
        C24353Bzo bzo4;
        String str;
        AnonymousClass4D8 r2;
        AnonymousClass4D7 r0;
        C83064Df r22;
        AnonymousClass4D8 r7;
        AnonymousClass4D7 r72;
        C83064Df r73;
        C24253ByB byB;
        Integer num;
        String str2;
        C24363Bzy bzy;
        String str3;
        Integer num2;
        TypedArray typedArray2 = typedArray;
        boolean A1X = AnonymousClass8BU.A1X(typedArray2);
        WDSListItem wDSListItem2 = wDSListItem;
        this.A0z = wDSListItem2;
        this.A10 = typedArray2;
        C24291Byo byo = C24291Byo.CUSTOM_MARGINS;
        this.A0h = byo;
        C24267ByQ byQ = C24267ByQ.NONE;
        this.A0g = byQ;
        Integer num3 = AnonymousClass00R.A00;
        this.A0o = num3;
        C24363Bzy bzy2 = C24363Bzy.BODY1;
        this.A0j = bzy2;
        this.A0i = C24363Bzy.BODY2;
        this.A0q = num3;
        C24253ByB byB2 = C24253ByB.CIRCLE;
        this.A0b = byB2;
        C83064Df r23 = C83064Df.A03;
        this.A0d = r23;
        AnonymousClass4D7 r1 = AnonymousClass4D7.NEUTRAL;
        this.A0Z = r1;
        AnonymousClass4D8 r02 = AnonymousClass4D8.BORDERLESS;
        this.A0f = r02;
        this.A0p = num3;
        this.A0a = byB2;
        this.A0c = r23;
        this.A0Y = r1;
        this.A0e = r02;
        C24353Bzo bzo5 = C24353Bzo.SPACING_DOUBLE;
        this.A0V = bzo5;
        this.A0X = bzo5;
        this.A0U = bzo5;
        this.A0W = C24353Bzo.SPACING_HALF;
        C39191sf r5 = C39191sf.MEDIUM;
        this.A0l = r5;
        C39201sg r4 = C39201sg.CIRCLE;
        this.A0k = r4;
        C24300Byx byx = C24300Byx.NONE;
        this.A0m = byx;
        C24280Byd byd = C24280Byd.UNSEEN;
        this.A0n = byd;
        if (typedArray2.hasValue(6)) {
            int i = typedArray2.getInt(6, 0);
            Integer[] A002 = AnonymousClass00R.A00(3);
            if (i < 0 || i >= A002.length) {
                num2 = num3;
            } else {
                num2 = A002[i];
            }
            C18070vi.A0d(num2, 0);
            boolean A1Z = AnonymousClass3Ma.A1Z(this.A0o, num2);
            this.A0o = num2;
            A00(this, A1Z);
        }
        String str4 = null;
        if (typedArray2.hasValue(4)) {
            C18000vb r03 = wDSListItem2.A06;
            if (r03 != null) {
                str3 = r03.A0E(typedArray2, 4);
            } else {
                str3 = null;
            }
            this.A0s = str3;
            if (str3 == null) {
                this.A0s = typedArray2.getString(4);
            }
        }
        if (typedArray2.hasValue(5)) {
            int i2 = typedArray2.getInt(5, 0);
            C24363Bzy[] values = C24363Bzy.values();
            if (i2 < 0 || i2 >= values.length) {
                bzy = bzy2;
            } else {
                bzy = values[i2];
            }
            C18070vi.A0d(bzy, 0);
            boolean A1Z2 = AnonymousClass3Ma.A1Z(this.A0j, bzy);
            this.A0j = bzy;
            A00(this, A1Z2);
        }
        if (typedArray2.hasValue(A1X ? 1 : 0)) {
            C18000vb r04 = wDSListItem2.A06;
            if (r04 != null) {
                str2 = r04.A0E(typedArray2, A1X);
            } else {
                str2 = null;
            }
            this.A0r = str2;
            if (str2 == null) {
                this.A0r = typedArray2.getString(A1X);
            }
        }
        if (typedArray2.hasValue(3)) {
            int i3 = typedArray2.getInt(3, 0);
            C24363Bzy[] values2 = C24363Bzy.values();
            if (i3 >= 0 && i3 < values2.length) {
                bzy2 = values2[i3];
            }
            C18070vi.A0d(bzy2, 0);
            boolean A1Z3 = AnonymousClass3Ma.A1Z(this.A0i, bzy2);
            this.A0i = bzy2;
            A00(this, A1Z3);
        }
        if (typedArray2.hasValue(60)) {
            int i4 = typedArray2.getInt(60, 0);
            Integer[] A003 = AnonymousClass00R.A00(6);
            if (i4 < 0 || i4 >= A003.length) {
                num = num3;
            } else {
                num = A003[i4];
            }
            C18070vi.A0d(num, 0);
            boolean A1Z4 = AnonymousClass3Ma.A1Z(this.A0q, num);
            this.A0q = num;
            A00(this, A1Z4);
        }
        if (typedArray2.hasValue(49)) {
            this.A0S = typedArray2.getResourceId(49, 0);
        }
        if (typedArray2.hasValue(52)) {
            int i5 = typedArray2.getInt(52, 0);
            C24253ByB[] values3 = C24253ByB.values();
            if (i5 < 0 || i5 >= values3.length) {
                byB = byB2;
            } else {
                byB = values3[i5];
            }
            C18070vi.A0d(byB, 0);
            boolean A1Z5 = AnonymousClass3Ma.A1Z(this.A0b, byB);
            this.A0b = byB;
            A00(this, A1Z5);
        }
        if (typedArray2.hasValue(53)) {
            int i6 = typedArray2.getInt(53, 0);
            C83064Df[] values4 = C83064Df.values();
            if (i6 < 0 || i6 >= values4.length) {
                r73 = C83064Df.A04;
            } else {
                r73 = values4[i6];
            }
            C18070vi.A0d(r73, 0);
            boolean A1Z6 = AnonymousClass3Ma.A1Z(this.A0d, r73);
            this.A0d = r73;
            A00(this, A1Z6);
        }
        if (typedArray2.hasValue(50)) {
            int i7 = typedArray2.getInt(50, 0);
            AnonymousClass4D7[] values5 = AnonymousClass4D7.values();
            if (i7 < 0 || i7 >= values5.length) {
                r72 = AnonymousClass4D7.NORMAL;
            } else {
                r72 = values5[i7];
            }
            C18070vi.A0d(r72, 0);
            boolean A1Z7 = AnonymousClass3Ma.A1Z(this.A0Z, r72);
            this.A0Z = r72;
            A00(this, A1Z7);
        }
        if (typedArray2.hasValue(54)) {
            int i8 = typedArray2.getInt(54, 0);
            AnonymousClass4D8[] values6 = AnonymousClass4D8.values();
            if (i8 < 0 || i8 >= values6.length) {
                r7 = AnonymousClass4D8.FILLED;
            } else {
                r7 = values6[i8];
            }
            C18070vi.A0d(r7, 0);
            boolean A1Z8 = AnonymousClass3Ma.A1Z(this.A0f, r7);
            this.A0f = r7;
            A00(this, A1Z8);
        }
        if (typedArray2.hasValue(51)) {
            this.A0x = typedArray2.getBoolean(51, false);
        }
        if (typedArray2.hasValue(56)) {
            this.A0T = typedArray2.getResourceId(56, 0);
        }
        if (typedArray2.hasValue(55)) {
            int i9 = typedArray2.getInt(55, 0);
            C24300Byx[] values7 = C24300Byx.values();
            if (i9 >= 0 && i9 < values7.length) {
                byx = values7[i9];
            }
            C18070vi.A0d(byx, 0);
            boolean A1Z9 = AnonymousClass3Ma.A1Z(this.A0m, byx);
            this.A0m = byx;
            A00(this, A1Z9);
        }
        if (typedArray2.hasValue(57)) {
            int i10 = typedArray2.getInt(57, 0);
            C39201sg[] values8 = C39201sg.values();
            if (i10 >= 0 && i10 < values8.length) {
                r4 = values8[i10];
            }
            C18070vi.A0d(r4, 0);
            boolean A1Z10 = AnonymousClass3Ma.A1Z(this.A0k, r4);
            this.A0k = r4;
            A00(this, A1Z10);
        }
        if (typedArray2.hasValue(58)) {
            int i11 = typedArray2.getInt(58, 0);
            C39191sf[] values9 = C39191sf.values();
            if (i11 >= 0 && i11 < values9.length) {
                r5 = values9[i11];
            }
            C18070vi.A0d(r5, 0);
            boolean A1Z11 = AnonymousClass3Ma.A1Z(this.A0l, r5);
            this.A0l = r5;
            A00(this, A1Z11);
        }
        if (typedArray2.hasValue(58)) {
            int i12 = typedArray2.getInt(58, 0);
            C24280Byd[] values10 = C24280Byd.values();
            if (i12 >= 0 && i12 < values10.length) {
                byd = values10[i12];
            }
            C18070vi.A0d(byd, 0);
            boolean A1Z12 = AnonymousClass3Ma.A1Z(this.A0n, byd);
            this.A0n = byd;
            A00(this, A1Z12);
        }
        if (typedArray2.hasValue(59)) {
            this.A0w = typedArray2.getBoolean(59, false);
        }
        if (typedArray2.hasValue(47)) {
            this.A0Q = typedArray2.getResourceId(47, 0);
        }
        if (typedArray2.hasValue(48)) {
            this.A0R = typedArray2.getResourceId(48, 0);
        }
        if (typedArray2.hasValue(46)) {
            this.A0P = typedArray2.getResourceId(46, 0);
        }
        if (typedArray2.hasValue(39)) {
            int i13 = typedArray2.getInt(39, 0);
            Integer[] A004 = AnonymousClass00R.A00(7);
            if (i13 >= 0 && i13 < A004.length) {
                num3 = A004[i13];
            }
            C18070vi.A0d(num3, 0);
            boolean A1Z13 = AnonymousClass3Ma.A1Z(this.A0p, num3);
            this.A0p = num3;
            A00(this, A1Z13);
        }
        if (typedArray2.hasValue(33)) {
            this.A0M = typedArray2.getResourceId(33, 0);
        }
        if (typedArray2.hasValue(36)) {
            int i14 = typedArray2.getInt(36, 0);
            C24253ByB[] values11 = C24253ByB.values();
            if (i14 >= 0 && i14 < values11.length) {
                byB2 = values11[i14];
            }
            C18070vi.A0d(byB2, 0);
            boolean A1Z14 = AnonymousClass3Ma.A1Z(this.A0a, byB2);
            this.A0a = byB2;
            A00(this, A1Z14);
        }
        if (typedArray2.hasValue(37)) {
            int i15 = typedArray2.getInt(37, 0);
            C83064Df[] values12 = C83064Df.values();
            if (i15 < 0 || i15 >= values12.length) {
                r22 = C83064Df.A04;
            } else {
                r22 = values12[i15];
            }
            C18070vi.A0d(r22, 0);
            boolean A1Z15 = AnonymousClass3Ma.A1Z(this.A0c, r22);
            this.A0c = r22;
            A00(this, A1Z15);
        }
        if (typedArray2.hasValue(34)) {
            int i16 = typedArray2.getInt(34, 0);
            AnonymousClass4D7[] values13 = AnonymousClass4D7.values();
            if (i16 < 0 || i16 >= values13.length) {
                r0 = AnonymousClass4D7.NORMAL;
            } else {
                r0 = values13[i16];
            }
            A01(r0);
        }
        if (typedArray2.hasValue(38)) {
            int i17 = typedArray2.getInt(38, 0);
            AnonymousClass4D8[] values14 = AnonymousClass4D8.values();
            if (i17 < 0 || i17 >= values14.length) {
                r2 = AnonymousClass4D8.FILLED;
            } else {
                r2 = values14[i17];
            }
            C18070vi.A0d(r2, 0);
            boolean A1Z16 = AnonymousClass3Ma.A1Z(this.A0e, r2);
            this.A0e = r2;
            A00(this, A1Z16);
        }
        if (typedArray2.hasValue(35)) {
            typedArray2.getBoolean(35, false);
        }
        if (typedArray2.hasValue(42)) {
            this.A0O = typedArray2.getResourceId(42, 0);
        }
        if (typedArray2.hasValue(43)) {
            C18000vb r05 = wDSListItem2.A06;
            if (r05 != null) {
                str = r05.A0E(typedArray2, 43);
            } else {
                str = null;
            }
            this.A0u = str;
        }
        if (typedArray2.hasValue(40)) {
            this.A0N = typedArray2.getResourceId(40, 0);
        }
        if (typedArray2.hasValue(41)) {
            C18000vb r06 = wDSListItem2.A06;
            this.A0t = r06 != null ? r06.A0E(typedArray2, 41) : str4;
        }
        if (typedArray2.hasValue(32)) {
            this.A0L = typedArray2.getColor(32, -1);
        }
        if (typedArray2.hasValue(31)) {
            int i18 = typedArray2.getInt(31, 0);
            C24267ByQ[] values15 = C24267ByQ.values();
            if (i18 >= 0 && i18 < values15.length) {
                byQ = values15[i18];
            }
            C18070vi.A0d(byQ, 0);
            boolean A1Z17 = AnonymousClass3Ma.A1Z(this.A0g, byQ);
            this.A0g = byQ;
            A00(this, A1Z17);
        }
        if (typedArray2.hasValue(45)) {
            int i19 = typedArray2.getInt(45, 0);
            C24353Bzo[] values16 = C24353Bzo.values();
            if (i19 < 0 || i19 >= values16.length) {
                bzo4 = C24353Bzo.NO_SPACE;
            } else {
                bzo4 = values16[i19];
            }
            C18070vi.A0d(bzo4, 0);
            boolean A1Z18 = AnonymousClass3Ma.A1Z(this.A0V, bzo4);
            this.A0V = bzo4;
            A00(this, A1Z18);
        }
        if (typedArray2.hasValue(62)) {
            int i20 = typedArray2.getInt(62, 0);
            C24353Bzo[] values17 = C24353Bzo.values();
            if (i20 < 0 || i20 >= values17.length) {
                bzo3 = C24353Bzo.NO_SPACE;
            } else {
                bzo3 = values17[i20];
            }
            C18070vi.A0d(bzo3, 0);
            boolean A1Z19 = AnonymousClass3Ma.A1Z(this.A0X, bzo3);
            this.A0X = bzo3;
            A00(this, A1Z19);
        }
        if (typedArray2.hasValue(44)) {
            int i21 = typedArray2.getInt(44, 0);
            C24353Bzo[] values18 = C24353Bzo.values();
            if (i21 < 0 || i21 >= values18.length) {
                bzo2 = C24353Bzo.NO_SPACE;
            } else {
                bzo2 = values18[i21];
            }
            C18070vi.A0d(bzo2, 0);
            boolean A1Z20 = AnonymousClass3Ma.A1Z(this.A0U, bzo2);
            this.A0U = bzo2;
            A00(this, A1Z20);
        }
        if (typedArray2.hasValue(61)) {
            int i22 = typedArray2.getInt(61, 0);
            C24353Bzo[] values19 = C24353Bzo.values();
            if (i22 < 0 || i22 >= values19.length) {
                bzo = C24353Bzo.NO_SPACE;
            } else {
                bzo = values19[i22];
            }
            C18070vi.A0d(bzo, 0);
            boolean A1Z21 = AnonymousClass3Ma.A1Z(this.A0W, bzo);
            this.A0W = bzo;
            A00(this, A1Z21);
        }
        if (typedArray2.hasValue(29)) {
            int i23 = typedArray2.getInt(29, 0);
            C24291Byo[] values20 = C24291Byo.values();
            if (i23 >= 0 && i23 < values20.length) {
                byo = values20[i23];
            }
            C18070vi.A0d(byo, 0);
            boolean A1Z22 = AnonymousClass3Ma.A1Z(this.A0h, byo);
            this.A0h = byo;
            A00(this, A1Z22);
        }
        if (typedArray2.hasValue(28)) {
            this.A0v = typedArray2.getBoolean(28, false);
        }
        if (typedArray2.hasValue(22)) {
            this.A0F = typedArray2.getResourceId(22, 0);
        }
        if (typedArray2.hasValue(13)) {
            this.A06 = typedArray2.getResourceId(13, 0);
        }
        if (typedArray2.hasValue(14)) {
            this.A07 = typedArray2.getResourceId(14, 0);
        }
        if (typedArray2.hasValue(11)) {
            this.A04 = typedArray2.getResourceId(11, 0);
        }
        if (typedArray2.hasValue(25)) {
            this.A0I = typedArray2.getResourceId(25, 0);
        }
        if (typedArray2.hasValue(24)) {
            this.A0H = typedArray2.getResourceId(24, 0);
        }
        if (typedArray2.hasValue(20)) {
            this.A0D = typedArray2.getResourceId(20, 0);
        }
        if (typedArray2.hasValue(18)) {
            this.A0B = typedArray2.getResourceId(18, 0);
        }
        if (typedArray2.hasValue(9)) {
            this.A02 = typedArray2.getResourceId(9, 0);
        }
        if (typedArray2.hasValue(21)) {
            this.A0E = typedArray2.getResourceId(21, 0);
        }
        if (typedArray2.hasValue(19)) {
            this.A0C = typedArray2.getResourceId(19, 0);
        }
        if (typedArray2.hasValue(10)) {
            this.A03 = typedArray2.getResourceId(10, 0);
        }
        if (typedArray2.hasValue(15)) {
            this.A08 = typedArray2.getResourceId(15, 0);
        }
        if (typedArray2.hasValue(12)) {
            this.A05 = typedArray2.getResourceId(12, 0);
        }
        if (typedArray2.hasValue(8)) {
            this.A01 = typedArray2.getResourceId(8, 0);
        }
        if (typedArray2.hasValue(17)) {
            this.A0A = typedArray2.getResourceId(17, 0);
        }
        if (typedArray2.hasValue(16)) {
            this.A09 = typedArray2.getResourceId(16, 0);
        }
        if (typedArray2.hasValue(27)) {
            this.A0K = typedArray2.getResourceId(27, 0);
        }
        if (typedArray2.hasValue(26)) {
            this.A0J = typedArray2.getResourceId(26, 0);
        }
        if (typedArray2.hasValue(23)) {
            this.A0G = typedArray2.getResourceId(23, 0);
        }
        if (typedArray2.hasValue(7)) {
            this.A00 = typedArray2.getResourceId(7, 0);
        }
        this.A0y = A1X;
    }

    public static void A00(C25704CkZ ckZ, boolean z) {
        if (z && ckZ.A0y) {
            ckZ.A0z.A07();
        }
    }
}
