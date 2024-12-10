package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9yp  reason: invalid class name and case insensitive filesystem */
public class C198739yp {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final C33711jG A02;
    public final C31061ex A03;
    public final C191529mk A04;
    public final C191619mt A05;
    public final A54 A06;
    public final C195929uA A07;
    public final C198169xt A08;
    public final C30931ek A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public static void A00(C198739yp r16, C198959zC r17, C190769lU r18, String str) {
        C198739yp r3 = r16;
        C191529mk r10 = r3.A04;
        List list = r3.A0D;
        C198959zC r2 = r17;
        C191069ly r13 = new C191069ly(new AY0(r3, r2, r18));
        String str2 = str;
        if ("token".equals(r2.A00.A03)) {
            AnonymousClass10I r32 = r10.A05;
            AnonymousClass17E r15 = r10.A03;
            AnonymousClass1QD r11 = r10.A01;
            C50412Ui r22 = r10.A04;
            C31061ex r12 = r10.A02;
            AnonymousClass11E r102 = r10.A00;
            AnonymousClass3MW.A1T(new C175528yr(r102, r11, r12, r13, (BB7) null, r15, r22, list, 0), r32, 0);
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass3Ma.A1P("fbpay_pin", str2, A13);
            AnonymousClass3MW.A1T(new C175528yr(r102, r11, r12, r13, (BB7) null, r15, r22, A13, 1), r32, 0);
            return;
        }
        r13.A00(1, str2);
        AnonymousClass10I r9 = r10.A05;
        AnonymousClass17E r8 = r10.A03;
        AnonymousClass1QD r7 = r10.A01;
        C50412Ui r5 = r10.A04;
        C31061ex r33 = r10.A02;
        AnonymousClass11E r112 = r10.A00;
        AnonymousClass3MW.A1T(new C175528yr(r112, r7, r33, (C191069ly) null, new C20765AXu(r13, r10, 0), r8, r5, list, -1), r9, 0);
    }

    public C198739yp(Context context, AnonymousClass1KB r14, AnonymousClass11S r15, AnonymousClass11P r16, C33711jG r17, C31061ex r18, C191529mk r19, A54 a54, C195929uA r21, C30931ek r22, String str, String str2, String str3, List list) {
        String str4 = str2;
        String str5 = str3;
        C17960vV.A0C((TextUtils.isEmpty(str4) ^ true) != AnonymousClass8BR.A1S(str5) ? false : true);
        this.A00 = context;
        this.A01 = r14;
        this.A04 = r19;
        this.A09 = r22;
        this.A07 = r21;
        C31061ex r9 = r18;
        this.A03 = r9;
        C33711jG r8 = r17;
        this.A02 = r8;
        A54 a542 = a54;
        this.A06 = a542;
        this.A08 = new C198169xt(r15, r16, r9);
        this.A05 = new C191619mt(context, r14, r8, r9, a542, "PIN");
        this.A0A = str;
        this.A0D = list;
        this.A0B = str4;
        this.A0C = str5;
    }
}
