package X;

import android.graphics.RectF;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public class C63722ta {
    public int A00;
    public final C56232h8 A01;
    public final C58192kI A02;
    public final C62022qf A03;
    public final String A04;

    public static C63722ta A00(Uri uri, C61382pa r7, AnonymousClass6nF r8, C62022qf r9, C26551So r10, AnonymousClass73B r11, String str, int i, boolean z, boolean z2, boolean z3) {
        return new C63722ta(C60422o0.A00(r7, r10, (String) null, i, z3), C50312Ty.A00(uri, r8, r10, r11, i, z, z2), r9, str, 0);
    }

    public static C63722ta A02(AnonymousClass6nF r26, C62022qf r27, C26551So r28, AnonymousClass73B r29, File file, String str, String str2, String str3, boolean z) {
        C26551So r4 = r28;
        C18070vi.A0d(r4, 0);
        File file2 = file;
        AnonymousClass6nF r3 = r26;
        AnonymousClass73B r5 = r29;
        boolean z2 = z;
        return new C63722ta(C60422o0.A00((C61382pa) null, r4, (String) null, 0, true), new C58192kI(new C25811CmO((RectF) null, (C134926rN) null, (String) null, 0, 0, false, false, false, false), r3, r4, r5, file2, (String) null, file2.getName(), str2, str3, 0, 0, 0, 0, false, C63972u0.A06(r4), z2, z2, false, false, false, false, false), r27, str, 0);
    }

    public static C63722ta A03(AnonymousClass6nF r27, C62022qf r28, C26551So r29, File file, String str, int i, long j, long j2) {
        File file2 = file;
        C26551So r5 = r29;
        AnonymousClass6nF r4 = r27;
        String str2 = str;
        int i2 = i;
        return new C63722ta(C60422o0.A00((C61382pa) null, r5, (String) null, i2, true), new C58192kI(new C25811CmO((RectF) null, (C134926rN) null, (String) null, 0, 0, false, false, false, false), r4, r5, (AnonymousClass73B) null, file2, str2, Uri.fromFile(file2).toString(), (String) null, (String) null, 0, i2, j, j2, false, C63972u0.A06(r5), true, true, false, false, false, false, false), r28, (String) null, 0);
    }

    public static C63722ta A01(AnonymousClass11S r53, AnonymousClass1RK r54, C136906ub r55, C26431Sc r56, C62022qf r57, C63642tS r58, boolean z) {
        AnonymousClass73B r3;
        boolean z2;
        boolean A1X;
        C61382pa r1;
        String str;
        int[] iArr;
        C63642tS r2 = r58;
        C62572rc A002 = AnonymousClass206.A00(r2.A01());
        C18070vi.A0X(A002);
        String str2 = A002.A0L;
        C62022qf r52 = r57;
        Integer num = r52.A01;
        C136906ub r8 = r55;
        C18070vi.A0d(r8, 0);
        C26431Sc r5 = r56;
        C18070vi.A0d(r5, 2);
        CopyOnWriteArrayList copyOnWriteArrayList = r2.A03;
        boolean z3 = copyOnWriteArrayList instanceof Collection;
        boolean z4 = false;
        if (!z3 || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C18070vi.A0b(next);
                AnonymousClass21V r0 = (AnonymousClass21V) next;
                C18070vi.A0d(r0, 1);
                if (r5.A0H(r0)) {
                    z4 = true;
                    break;
                }
            }
        }
        AnonymousClass21V A012 = r2.A01();
        boolean A05 = r2.A05();
        boolean z5 = false;
        if (!z3 || !copyOnWriteArrayList.isEmpty()) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C17880vN.A0Y(it2).A0w()) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C62572rc A003 = AnonymousClass206.A00(A012);
        C18070vi.A0X(A003);
        if (A012 instanceof C441322g) {
            C441322g r02 = (C441322g) A012;
            r3 = r02.A05;
            z2 = r02.A1I();
        } else {
            r3 = null;
            z2 = false;
        }
        AnonymousClass6nF A004 = r8.A00(num, A012.A0u, A05);
        String str3 = A003.A0K;
        File file = A003.A0G;
        String A19 = A012.A19();
        String str4 = A012.A05;
        String str5 = A012.A06;
        C26551So A022 = C63972u0.A02(A012);
        C18070vi.A0X(A022);
        int i = A003.A05;
        int i2 = A012.A09;
        long j = A003.A0D;
        long j2 = A003.A0E;
        C62552ra r03 = A003.A0F;
        C18070vi.A0W(r03);
        int i3 = r03.A01;
        int i4 = r03.A00;
        boolean z6 = r03.A05;
        boolean z7 = r03.A06;
        RectF rectF = r03.A02;
        boolean z8 = r03.A09;
        int i5 = i2;
        long j3 = j;
        long j4 = j2;
        boolean z9 = A05;
        AnonymousClass73B r21 = r3;
        C58192kI r17 = new C58192kI(new C25811CmO(rectF, r03.A03, r03.A04, i3, i4, z6, z7, z8, r03.A08), A004, A022, r21, file, str3, A19, str4, str5, i, i5, j3, j4, z9, z5, z4, !A003.A0U, z, A003.A0T, A003.A0S, z2, AnonymousClass000.A1W(AnonymousClass6XJ.A00(A012)));
        AnonymousClass11S r4 = r53;
        AnonymousClass1RK r32 = r54;
        C18070vi.A0e(r4, 1, r32);
        Iterator it3 = copyOnWriteArrayList.iterator();
        C18070vi.A0X(it3);
        while (true) {
            if (it3.hasNext()) {
                if (!AnonymousClass25A.A0T(r4, C17880vN.A0Y(it3))) {
                    A1X = true;
                    break;
                }
            } else {
                A1X = C17880vN.A1X(r32.A06());
                break;
            }
        }
        AnonymousClass21V A013 = r2.A01();
        C62572rc A005 = AnonymousClass206.A00(A013);
        C18070vi.A0X(A005);
        long j5 = A013.A0I;
        byte[] bArr = A005.A0a;
        long j6 = A005.A0B;
        if (bArr == null) {
            r1 = null;
        } else {
            if (j6 <= 0) {
                j6 = j5;
            }
            r1 = new C61382pa(bArr, j6);
        }
        C693436v A17 = A013.A17();
        boolean A0V = C22971Dz.A0V(A013.A0v.A00);
        boolean z10 = !A0V;
        C26551So A023 = C63972u0.A02(A013);
        File file2 = A005.A0G;
        long j7 = A013.A01;
        String str6 = A013.A05;
        String str7 = A013.A08;
        int i6 = A013.A09;
        if (A0V) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        if (A17 != null) {
            iArr = A17.A07();
        } else {
            iArr = null;
        }
        int i7 = A005.A04;
        List A0t = C29431cG.A0t(copyOnWriteArrayList);
        ArrayList A0D = C29351c6.A0D(A0t);
        Iterator it4 = A0t.iterator();
        while (it4.hasNext()) {
            String str8 = C17880vN.A0Y(it4).A0v.A01;
            C18070vi.A0X(str8);
            A0D.add(str8);
        }
        boolean A014 = A3I.A01(A013);
        int A006 = AnonymousClass1SR.A00(r2);
        boolean z11 = r2.A01;
        C18070vi.A0b(A023);
        return new C63722ta(new C56232h8(r1, (C184589bC) null, A023, file2, str6, str7, str, (String) null, A0D, iArr, i6, i7, A006, j7, A1X, true, z10, A014, z11), r17, r52, str2, r2.A00);
    }

    public C63722ta(C56232h8 r1, C58192kI r2, C62022qf r3, String str, int i) {
        this.A04 = str;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
