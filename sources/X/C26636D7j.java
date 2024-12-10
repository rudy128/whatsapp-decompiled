package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D7j  reason: case insensitive filesystem */
public class C26636D7j implements C28645ECd, E3k, E7H, C28646ECe {
    public C25266Cc7 A00;
    public List A01;
    public final Matrix A02;
    public final String A03;
    public final List A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final C38631rd A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26636D7j(X.C39801tf r10, X.C38631rd r11, X.C40931vW r12, X.C26642D7p r13) {
        /*
            r9 = this;
            java.lang.String r6 = r12.A00
            boolean r8 = r12.A02
            java.util.List r2 = r12.A01
            java.util.ArrayList r7 = X.AnonymousClass000.A14(r2)
            r1 = 0
        L_0x000b:
            int r0 = r2.size()
            r3 = r11
            r5 = r13
            if (r1 >= r0) goto L_0x0025
            java.lang.Object r0 = r2.get(r1)
            X.1v6 r0 = (X.C40681v6) r0
            X.E7G r0 = r0.CPB(r10, r11, r13)
            if (r0 == 0) goto L_0x0022
            r7.add(r0)
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r4 = r2.get(r1)
            X.1v6 r4 = (X.C40681v6) r4
            boolean r0 = r4 instanceof X.C40691v7
            if (r0 == 0) goto L_0x003d
            X.1v7 r4 = (X.C40691v7) r4
        L_0x0038:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0040:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26636D7j.<init>(X.1tf, X.1rd, X.1vW, X.D7p):void");
    }

    public List A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass000.A13();
            int i = 0;
            while (true) {
                List list = this.A04;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof C28645ECd) {
                    this.A01.add(obj);
                }
                i++;
            }
        }
        return this.A01;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C25266Cc7 cc7 = this.A00;
        if (cc7 != null) {
            cc7.A04(ckt, obj);
        }
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int A0M;
        if (!this.A0A) {
            Matrix matrix2 = this.A02;
            matrix2.set(matrix);
            C25266Cc7 cc7 = this.A00;
            if (cc7 != null) {
                matrix2.preConcat(cc7.A00());
                C26049CrJ crJ = cc7.A02;
                if (crJ == null) {
                    A0M = 100;
                } else {
                    A0M = AnonymousClass000.A0M(crJ.A05());
                }
                i = (int) ((((((float) A0M) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (this.A09.A0U) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    List list = this.A04;
                    if (i2 >= list.size()) {
                        break;
                    } else if (!(list.get(i2) instanceof C28646ECe) || (i3 = i3 + 1) < 2) {
                        i2++;
                    } else if (i != 255) {
                        z = true;
                        RectF rectF = this.A07;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        BNg(matrix2, rectF, true);
                        Paint paint = this.A05;
                        paint.setAlpha(i);
                        C40171uH.A02(canvas, paint, rectF, 31);
                        i = 255;
                    }
                }
            }
            z = false;
            List list2 = this.A04;
            for (int A022 = AnonymousClass3MX.A02(list2, 1); A022 >= 0; A022--) {
                Object obj = list2.get(A022);
                if (obj instanceof C28646ECe) {
                    ((C28646ECe) obj).BJJ(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        C25266Cc7 cc7 = this.A00;
        if (cc7 != null) {
            matrix2.preConcat(cc7.A00());
        }
        RectF rectF2 = this.A08;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                E7G e7g = (E7G) list.get(size);
                if (e7g instanceof C28646ECe) {
                    ((C28646ECe) e7g).BNg(matrix2, rectF2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public Path BWP() {
        Matrix matrix = this.A02;
        matrix.reset();
        C25266Cc7 cc7 = this.A00;
        if (cc7 != null) {
            matrix.set(cc7.A00());
        }
        Path path = this.A06;
        path.reset();
        if (!this.A0A) {
            List list = this.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                E7G e7g = (E7G) list.get(size);
                if (e7g instanceof C28645ECd) {
                    path.addPath(((C28645ECd) e7g).BWP(), matrix);
                }
            }
        }
        return path;
    }

    public void C9s() {
        this.A09.invalidateSelf();
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        String str = this.A03;
        if (crD.A02(str, i) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                C26046CrD crD3 = new C26046CrD(crD2);
                crD3.A01.add(str);
                crD2 = crD3;
                if (crD.A01(str, i)) {
                    C26046CrD crD4 = new C26046CrD(crD3);
                    crD4.A00 = this;
                    list.add(crD4);
                }
            }
            if (crD.A03(str, i)) {
                int A002 = i + crD.A00(str, i);
                int i2 = 0;
                while (true) {
                    List list2 = this.A04;
                    if (i2 < list2.size()) {
                        E7G e7g = (E7G) list2.get(i2);
                        if (e7g instanceof E7H) {
                            ((E7H) e7g).CFv(crD, crD2, list, A002);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String getName() {
        return this.A03;
    }

    public void CIY(List list, List list2) {
        int size = list.size();
        List list3 = this.A04;
        ArrayList A0z = C17880vN.A0z(size + list3.size());
        A0z.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                E7G e7g = (E7G) list3.get(size2);
                e7g.CIY(A0z, list3.subList(0, size2));
                A0z.add(e7g);
            } else {
                return;
            }
        }
    }

    public C26636D7j(C38631rd r5, C40691v7 r6, C26642D7p d7p, String str, List list, boolean z) {
        this.A05 = new Paint();
        this.A07 = AnonymousClass3MW.A08();
        this.A02 = C108945cZ.A0J();
        this.A06 = C108945cZ.A0L();
        this.A08 = AnonymousClass3MW.A08();
        this.A03 = str;
        this.A09 = r5;
        this.A0A = z;
        this.A04 = list;
        if (r6 != null) {
            C25266Cc7 cc7 = new C25266Cc7(r6);
            this.A00 = cc7;
            cc7.A03(d7p);
            this.A00.A02(this);
        }
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof E3j) {
                A13.add(obj);
            }
        }
        int size2 = A13.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((E3j) A13.get(size2)).BAN(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
