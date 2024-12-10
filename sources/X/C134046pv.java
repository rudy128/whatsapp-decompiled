package X;

import android.graphics.Bitmap;
import com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pv  reason: invalid class name and case insensitive filesystem */
public final class C134046pv {
    public final C25311Ns A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass71H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.6oW, java.lang.Object] */
    public final Object A00(C1418377d r14, C30391dr r15) {
        String A012;
        List list;
        String str;
        File A013;
        String A002;
        String str2;
        String str3;
        String str4;
        String str5;
        C133806pW r1 = (C133806pW) this.A05.get();
        if (r1.A00()) {
            if (C18020vd.A05(C18040vf.A02, r1.A03, 4772)) {
                C18030ve r12 = this.A02;
                String A0v = C108955ca.A0v(r12, 4842);
                if (AnonymousClass1YF.A0I(A0v).length() != 0 && A0v != null) {
                    String A0v2 = C108955ca.A0v(r12, 4843);
                    if (AnonymousClass1YF.A0I(A0v2).length() != 0 && A0v2 != null && (A012 = A01()) != null) {
                        AnonymousClass00H r6 = this.A06;
                        AnonymousClass725 A042 = C108945cZ.A0z(r6).A04(A012);
                        StringBuilder A10 = AnonymousClass000.A10();
                        if (A042 == null || (list = A042.A07) == null) {
                            list = AnonymousClass000.A13();
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C1418377d A0x = C108945cZ.A0x(it);
                                if (C18070vi.A18(A0x.A0C, r14.A0C) || C18070vi.A18(A0x.A0I, r14.A0I) || C18070vi.A18(A0x.A0F, r14.A0F)) {
                                    break;
                                }
                                A10.append(A0x.A0C);
                            } else {
                                String A0H = C18070vi.A0H(A10);
                                list.add(r14);
                                String A014 = A01();
                                String str6 = "";
                                if (A014 == null) {
                                    A014 = str6;
                                }
                                String A0v3 = C108955ca.A0v(r12, 4842);
                                if (AnonymousClass1YF.A0I(A0v3).length() == 0 || A0v3 == null) {
                                    A0v3 = str6;
                                }
                                String A0v4 = C108955ca.A0v(r12, 4843);
                                if (AnonymousClass1YF.A0I(A0v4).length() == 0 || A0v4 == null) {
                                    A0v4 = str6;
                                }
                                String A0v5 = C108955ca.A0v(r12, 4880);
                                if (AnonymousClass1YF.A0I(A0v5).length() != 0) {
                                    str6 = A0v5;
                                }
                                String A052 = C17970vW.A05(A0H);
                                Iterator it2 = list.iterator();
                                int i = 0;
                                while (it2.hasNext()) {
                                    i += C108945cZ.A0x(it2).A00;
                                }
                                long j = (long) i;
                                ? obj = new Object();
                                if (!(A042 == null || (str5 = A042.A0H) == null)) {
                                    A014 = str5;
                                }
                                obj.A0E = A014;
                                if (!(A042 == null || (str4 = A042.A04) == null)) {
                                    A0v3 = str4;
                                }
                                obj.A0G = A0v3;
                                if (!(A042 == null || (str3 = A042.A0K) == null)) {
                                    A0v4 = str3;
                                }
                                obj.A0I = A0v4;
                                if (!(A042 == null || (str2 = A042.A0D) == null)) {
                                    str6 = str2;
                                }
                                obj.A03 = str6;
                                obj.A0P = false;
                                obj.A0F = A052;
                                if (A042 == null || (str = A042.A0M) == null) {
                                    str = "-1";
                                }
                                obj.A0L = str;
                                obj.A0N = AnonymousClass000.A13();
                                obj.A01 = j;
                                obj.A0O = list;
                                boolean z = false;
                                obj.A0S = false;
                                obj.A0Z = false;
                                obj.A0V = false;
                                AnonymousClass725 A003 = obj.A00();
                                if (A042 == null) {
                                    z = true;
                                }
                                A003.A0A = z;
                                A003.A0B = false;
                                AnonymousClass71H r2 = this.A03;
                                C17960vV.A00();
                                if (!A003.A0W) {
                                    A002 = AnonymousClass725.A00(A003);
                                    C17960vV.A00();
                                    A013 = AnonymousClass71H.A01(r2, A002, false);
                                } else {
                                    A013 = ((C134006pr) r2.A01.get()).A01(A003);
                                    A002 = AnonymousClass725.A00(A003);
                                }
                                if (AnonymousClass71H.A00(r2, A013, A002) == null) {
                                    File A0I = this.A00.A00.A0I();
                                    String A0Z = C108995ce.A0Z(A002);
                                    Bitmap A004 = AnonymousClass4aX.A00(AnonymousClass4aX.A02(this.A01.A00, 2131232384, 2131103261));
                                    C18070vi.A0X(A004);
                                    C64062u9.A0B(A004, C17880vN.A0e(A0I, A0Z));
                                }
                                C108945cZ.A0z(r6).A06(A003);
                                Object A005 = C30451dy.A00(r15, this.A07, new FunStickerPack$addStickerIntoStickerPack$3(this, A003, (C30391dr) null));
                                if (A005 == C31751g4.COROUTINE_SUSPENDED) {
                                    return A005;
                                }
                            }
                        }
                    }
                }
            }
        }
        return C27621Wu.A00;
    }

    public final String A01() {
        String A0v = C108955ca.A0v(this.A02, 4841);
        if (AnonymousClass1YF.A0I(A0v).length() == 0) {
            return null;
        }
        return A0v;
    }

    public C134046pv(C25311Ns r1, AnonymousClass118 r2, C18030ve r3, AnonymousClass71H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, C18600wl r8) {
        C18070vi.A0w(r3, r2, r5, r6, r7);
        C18070vi.A0q(r8, r4, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
    }
}
