package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nX  reason: invalid class name and case insensitive filesystem */
public final class C113675nX extends C37971qU {
    public static final TimeInterpolator A0C = new ValueAnimator().getInterpolator();
    public SelectedListContactPickerFragment A00 = null;
    public List A01 = AnonymousClass000.A13();
    public List A02 = AnonymousClass000.A13();
    public List A03 = AnonymousClass000.A13();
    public List A04 = AnonymousClass000.A13();
    public List A05 = AnonymousClass000.A13();
    public List A06 = AnonymousClass000.A13();
    public List A07 = AnonymousClass000.A13();
    public List A08 = AnonymousClass000.A13();
    public List A09 = AnonymousClass000.A13();
    public List A0A = AnonymousClass000.A13();
    public List A0B = AnonymousClass000.A13();

    /* JADX WARNING: type inference failed for: r0v11, types: [X.6Ub, java.lang.Object] */
    public boolean A0M(C42011xT r14, C42011xT r15, int i, int i2, int i3, int i4) {
        C42011xT r8 = r14;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r14 == r15) {
            return A0L(r8, i5, i6, i7, i8);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A00(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A00(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        List list = this.A09;
        ? obj = new Object();
        obj.A05 = r14;
        obj.A04 = r15;
        obj.A00 = i5;
        obj.A01 = i6;
        obj.A02 = i7;
        obj.A03 = i8;
        list.add(obj);
        return true;
    }

    private void A00(C42011xT r3) {
        r3.A0H.animate().setInterpolator(A0C);
        A0E(r3);
    }

    private boolean A03(C42011xT r5, C123346Ub r6) {
        if (r6.A04 == r5) {
            r6.A04 = null;
        } else if (r6.A05 != r5) {
            return false;
        } else {
            r6.A05 = null;
        }
        C108995ce.A0t(r5.A0H);
        A08(r5);
        return true;
    }

    public void A0C() {
        List list = this.A0A;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C42011xT r1 = ((AnonymousClass6UQ) list.get(size)).A04;
            C108975cc.A0w(r1.A0H, this, r1);
            list.remove(size);
        }
        List list2 = this.A0B;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A08((C42011xT) list2.get(size2));
            list2.remove(size2);
        }
        List list3 = this.A08;
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C42011xT r12 = (C42011xT) list3.get(size3);
            View view = r12.A0H;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A08(r12);
            list3.remove(size3);
        }
        List list4 = this.A09;
        int size4 = list4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C123346Ub r13 = (C123346Ub) list4.get(size4);
            C42011xT r0 = r13.A05;
            if (r0 != null) {
                A03(r0, r13);
            }
            C42011xT r02 = r13.A04;
            if (r02 != null) {
                A03(r02, r13);
            }
        }
        list4.clear();
        if (A0F()) {
            List list5 = this.A06;
            int size5 = list5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                List list6 = (List) list5.get(size5);
                int size6 = list6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C42011xT r14 = ((AnonymousClass6UQ) list6.get(size6)).A04;
                        C108975cc.A0w(r14.A0H, this, r14);
                        list6.remove(size6);
                        if (list6.isEmpty()) {
                            list5.remove(list6);
                        }
                    }
                }
            }
            List list7 = this.A02;
            int size7 = list7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                List list8 = (List) list7.get(size7);
                int size8 = list8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C42011xT r15 = (C42011xT) list8.get(size8);
                        View view2 = r15.A0H;
                        view2.setScaleX(1.0f);
                        view2.setScaleY(1.0f);
                        A08(r15);
                        list8.remove(size8);
                        if (list8.isEmpty()) {
                            list7.remove(list8);
                        }
                    }
                }
            }
            List list9 = this.A04;
            int size9 = list9.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    List list10 = (List) list9.get(size9);
                    int size10 = list10.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C123346Ub r16 = (C123346Ub) list10.get(size10);
                            C42011xT r03 = r16.A05;
                            if (r03 != null) {
                                A03(r03, r16);
                            }
                            C42011xT r04 = r16.A04;
                            if (r04 != null) {
                                A03(r04, r16);
                            }
                            if (list10.isEmpty()) {
                                list9.remove(list10);
                            }
                        }
                    }
                } else {
                    A02(this.A07);
                    A02(this.A05);
                    A02(this.A01);
                    A02(this.A03);
                    A07();
                    return;
                }
            }
        }
    }

    public void A0D() {
        long j;
        long j2;
        List<C42011xT> list = this.A0B;
        boolean A1a = AnonymousClass000.A1a(list);
        List list2 = this.A0A;
        boolean A1a2 = AnonymousClass000.A1a(list2);
        List list3 = this.A09;
        boolean A1a3 = AnonymousClass000.A1a(list3);
        List list4 = this.A08;
        boolean A1a4 = AnonymousClass000.A1a(list4);
        if (A1a || A1a2 || A1a4 || A1a3) {
            for (C42011xT r3 : list) {
                AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(r3.A0H);
                this.A07.add(r3);
                A0B2.A08(A0B());
                A0B2.A04(0.0f);
                A0B2.A05(0.0f);
                A0B2.A0B(new C116595yH(A0B2, r3, this, 0));
                A0B2.A02();
            }
            list.clear();
            if (A1a2) {
                ArrayList A13 = AnonymousClass000.A13();
                A13.addAll(list2);
                this.A06.add(A13);
                list2.clear();
                C146497Pi r32 = new C146497Pi(this, A13, 8);
                if (A1a) {
                    ((AnonymousClass6UQ) A13.get(0)).A04.A0H.postOnAnimationDelayed(r32, A0B());
                } else {
                    r32.run();
                }
            }
            if (A1a3) {
                ArrayList A132 = AnonymousClass000.A13();
                A132.addAll(list3);
                this.A04.add(A132);
                list3.clear();
                C146497Pi r33 = new C146497Pi(this, A132, 9);
                if (A1a) {
                    ((C123346Ub) A132.get(0)).A05.A0H.postOnAnimationDelayed(r33, A0B());
                } else {
                    r33.run();
                }
            }
            if (A1a4) {
                ArrayList A133 = AnonymousClass000.A13();
                A133.addAll(list4);
                this.A02.add(A133);
                list4.clear();
                C146497Pi r6 = new C146497Pi(this, A133, 10);
                if (A1a || A1a2 || A1a3) {
                    long j3 = 0;
                    if (A1a) {
                        j = A0B();
                    } else {
                        j = 0;
                    }
                    if (A1a2) {
                        j2 = A0A();
                    } else {
                        j2 = 0;
                    }
                    if (A1a3) {
                        j3 = A09();
                    }
                    ((C42011xT) A133.get(0)).A0H.postOnAnimationDelayed(r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A0E(C42011xT r8) {
        View view = r8.A0H;
        AnonymousClass1HF.A0B(view).A01();
        List list = this.A0A;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass6UQ) list.get(size)).A04 == r8) {
                C108975cc.A0w(view, this, r8);
                list.remove(size);
            }
        }
        A01(r8, this.A09);
        if (this.A0B.remove(r8)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A08(r8);
        }
        if (this.A08.remove(r8)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A08(r8);
        }
        List list2 = this.A04;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            List list3 = (List) list2.get(size2);
            A01(r8, list3);
            if (list3.isEmpty()) {
                list2.remove(size2);
            }
        }
        List list4 = this.A06;
        int size3 = list4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            List list5 = (List) list4.get(size3);
            int size4 = list5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((AnonymousClass6UQ) list5.get(size4)).A04 == r8) {
                    C108975cc.A0w(view, this, r8);
                    list5.remove(size4);
                    if (list5.isEmpty()) {
                        list4.remove(size3);
                    }
                }
            }
        }
        List list6 = this.A02;
        int size5 = list6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                List list7 = (List) list6.get(size5);
                if (list7.remove(r8)) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    A08(r8);
                    if (list7.isEmpty()) {
                        list6.remove(size5);
                    }
                }
            } else {
                this.A07.remove(r8);
                this.A01.remove(r8);
                this.A03.remove(r8);
                C108995ce.A14(this, r8, this.A05);
                return;
            }
        }
    }

    public boolean A0F() {
        if (!this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A0B.isEmpty() || !this.A05.isEmpty() || !this.A07.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.6UQ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r1 != 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.C42011xT r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            android.view.View r4 = r6.A0H
            float r1 = (float) r7
            float r0 = r4.getTranslationX()
            float r1 = r1 + r0
            int r3 = (int) r1
            float r1 = (float) r8
            float r0 = r4.getTranslationY()
            float r1 = r1 + r0
            int r2 = (int) r1
            r5.A00(r6)
            int r0 = r9 - r3
            int r1 = r10 - r2
            if (r0 != 0) goto L_0x0020
            if (r1 != 0) goto L_0x0027
            r5.A08(r6)
            r0 = 0
            return r0
        L_0x0020:
            int r0 = -r0
            float r0 = (float) r0
            r4.setTranslationX(r0)
            if (r1 == 0) goto L_0x002c
        L_0x0027:
            int r0 = -r1
            float r0 = (float) r0
            r4.setTranslationY(r0)
        L_0x002c:
            java.util.List r1 = r5.A0A
            X.6UQ r0 = new X.6UQ
            r0.<init>()
            r0.A04 = r6
            r0.A00 = r3
            r0.A01 = r2
            r0.A02 = r9
            r0.A03 = r10
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113675nX.A0L(X.1xT, int, int, int, int):boolean");
    }

    public C113675nX() {
        this.A00 = 240;
        this.A01 = 240;
        this.A02 = 240;
        this.A03 = 240;
        this.A00 = false;
    }

    private void A01(C42011xT r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C123346Ub r1 = (C123346Ub) list.get(size);
                if (A03(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public static void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass1HF.A0B(((C42011xT) list.get(size)).A0H).A01();
            } else {
                return;
            }
        }
    }

    public boolean A0G(C42011xT r3, List list) {
        if (!list.isEmpty() || A0J(r3)) {
            return true;
        }
        return false;
    }

    public boolean A0I(C42011xT r2) {
        A00(r2);
        this.A0B.add(r2);
        return true;
    }

    public boolean A0K(C42011xT r3) {
        A00(r3);
        View view = r3.A0H;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        this.A08.add(r3);
        return true;
    }
}
