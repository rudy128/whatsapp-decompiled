package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.Cpy  reason: case insensitive filesystem */
public final class C25984Cpy {
    public C04220Mi A00;
    public C04220Mi A01;
    public final C25080CWp A02;
    public final C24835CMd A03;
    public final DOZ A04;

    public static Float A01(Context context, int i) {
        return Float.valueOf(C25342Ce1.A01(context, (float) i));
    }

    public final C04240Mk A02(View view, DFL dfl) {
        int i;
        int i2;
        int A06;
        C04220Mi r1;
        DFL dfl2 = dfl;
        DFL A09 = dfl2.A09(43);
        if (A09 != null) {
            float A002 = CC7.A00(A09, 49);
            float A003 = CC7.A00(A09, 43);
            View view2 = view;
            DOZ doz = this.A04;
            Context context = doz.A00;
            float min = Math.min(((float) AnonymousClass3Ma.A09(view2).widthPixels) * 0.8f, C25342Ce1.A00(context, 300.0f));
            if (A002 == 0.0f) {
                i = (int) min;
                int i3 = C24676CEq.A00;
                i2 = Integer.MIN_VALUE;
            } else {
                i = (int) A002;
                int i4 = C24676CEq.A00;
                i2 = 1073741824;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
            if (A003 == 0.0f) {
                A06 = C24676CEq.A00;
            } else {
                A06 = BE7.A06((int) A003);
            }
            C25080CWp cWp = this.A02;
            cWp.A00 = null;
            AnonymousClass0OS r27 = C04220Mi.A04;
            C04220Mi r9 = this.A01;
            CBx.A00(doz);
            AnonymousClass0OS r7 = r27;
            C04220Mi A042 = r7.A04(r7.A02(context, r9, doz, -1), A09, (Object) null, C02740Fe.A00(makeMeasureSpec, A06));
            this.A01 = A042;
            Rect rect = A042.A01.A03.A03;
            int width = rect.width();
            int height = rect.height();
            DisplayMetrics A092 = AnonymousClass3Ma.A09(view2);
            int[] A1W = C108945cZ.A1W();
            view2.getLocationInWindow(A1W);
            C25232CbT cbT = new C25232CbT(A092.widthPixels, A092.heightPixels, A1W[0], A1W[1], view2.getWidth(), view2.getHeight(), width, height, CC8.A00(AnonymousClass3MY.A04(view2)));
            C24835CMd cMd = this.A03;
            HashMap hashMap = cMd.A01;
            C25214CbA cbA = (C25214CbA) hashMap.get(cbT);
            if (cbA == null) {
                E8A A0A = dfl2.A0A(40);
                if (A0A != null) {
                    DOZ doz2 = cMd.A00;
                    Context context2 = doz2.A00;
                    C20046A4p a4p = new C20046A4p();
                    a4p.A03(A01(context2, cbT.A05), 0);
                    a4p.A03(A01(context2, cbT.A04), 1);
                    a4p.A03(A01(context2, cbT.A02), 2);
                    a4p.A03(A01(context2, cbT.A03), 3);
                    a4p.A03(A01(context2, cbT.A01), 4);
                    a4p.A03(A01(context2, cbT.A00), 5);
                    a4p.A03(A01(context2, cbT.A07), 6);
                    a4p.A03(A01(context2, cbT.A06), 7);
                    Object A032 = C25681CkC.A03(doz2, dfl2, BE7.A0R(a4p, Boolean.valueOf(cbT.A08), 8), A0A);
                    C18070vi.A0X(A032);
                    DFL dfl3 = (DFL) A032;
                    C18070vi.A0d(dfl3, 0);
                    float A033 = dfl3.A03(43, 0.0f);
                    float A034 = dfl3.A03(44, 0.0f);
                    float A035 = dfl3.A03(42, 0.0f);
                    float A036 = dfl3.A03(41, 0.0f);
                    float A037 = dfl3.A03(38, 0.0f);
                    float A038 = dfl3.A03(40, 0.0f);
                    float A039 = dfl3.A03(48, 0.0f);
                    float A0310 = dfl3.A03(46, 0.0f);
                    float A0311 = dfl3.A03(55, 0.0f);
                    float A0312 = dfl3.A03(56, 0.0f);
                    float A0313 = dfl3.A03(54, 0.0f);
                    float A0314 = dfl3.A03(53, 0.0f);
                    String A0D = dfl3.A0D(45);
                    for (C24339Bza bza : C24339Bza.values()) {
                        if (C18070vi.A18(bza.value, A0D)) {
                            String A0e = BE7.A0e(dfl3);
                            C24344Bzf[] values = C24344Bzf.values();
                            int length = values.length;
                            int i5 = 0;
                            while (i5 < length) {
                                C24344Bzf bzf = values[i5];
                                if (C18070vi.A18(bzf.value, A0e)) {
                                    cbA = new C25214CbA(A00(context2, A033, A034, A035, A036), A00(context2, A0311, A0312, A0313, A0314), A00(context2, A037, A038, A039, A0310), bzf, bza);
                                    hashMap.put(cbT, cbA);
                                } else {
                                    i5++;
                                }
                            }
                            throw C17890vO.A0K();
                        }
                    }
                    throw C17890vO.A0K();
                }
                throw AnonymousClass000.A0k("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            if (C18070vi.A18(cWp.A00, cbA)) {
                r1 = this.A00;
                if (r1 == null) {
                    return null;
                }
            } else {
                cWp.A00 = cbA;
                C04220Mi r5 = this.A00;
                CBx.A00(doz);
                AnonymousClass0IV A022 = r27.A02(context, r5, doz, -1);
                RectF rectF = cbA.A02;
                int width2 = (int) rectF.width();
                int height2 = (int) rectF.height();
                r1 = r27.A04(A022, A09, (Object) null, AnonymousClass0OH.A00.A01(width2, width2, height2, height2));
                this.A00 = r1;
            }
            return r1.A01;
        }
        throw AnonymousClass000.A0k("Server should have ensured that the Tooltip Container always has a Tooltip.");
    }

    public C25984Cpy(C25080CWp cWp, DOZ doz) {
        this.A04 = doz;
        this.A02 = cWp;
        this.A03 = new C24835CMd(doz);
    }

    public static RectF A00(Context context, float f, float f2, float f3, float f4) {
        return new RectF(C25342Ce1.A00(context, f), C25342Ce1.A00(context, f2), C25342Ce1.A00(context, f + f3), C25342Ce1.A00(context, f2 + f4));
    }
}
