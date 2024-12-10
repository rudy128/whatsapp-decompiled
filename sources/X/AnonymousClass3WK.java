package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import java.util.List;
import java.util.Set;

/* renamed from: X.3WK  reason: invalid class name */
public final class AnonymousClass3WK extends C41251w3 {
    public float A00;
    public int A01 = -1;
    public final C84604Kd A02;
    public final AnonymousClass4P0 A03;
    public final Integer A04;
    public final Set A05 = C17880vN.A14();

    public void A0W(List list) {
        A0V((Runnable) null, list);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A0E = AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624207);
        Integer num = this.A04;
        return new AnonymousClass3ZF(A0E, this.A02, this.A03, num);
    }

    public void A0V(Runnable runnable, List list) {
        if (list != null) {
            Set set = this.A05;
            set.clear();
            set.addAll(list);
        }
        super.A0V(runnable, list);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r21, int i) {
        Drawable drawable;
        int dimensionPixelSize;
        AnonymousClass3ZF r4 = (AnonymousClass3ZF) r21;
        int i2 = i;
        C106535Wf r3 = (C106535Wf) C72463Mc.A0l(this, r4, i2);
        boolean A1T = AnonymousClass000.A1T(this.A01, i2);
        float f = this.A00;
        C18070vi.A0d(r3, 0);
        View view = r4.A0H;
        view.setContentDescription(C83464Ff.A00(AnonymousClass3MY.A04(view), r3));
        view.setSelected(A1T);
        C88234Yw.A02(view, (Long) null, f);
        C18100vl r8 = r4.A02;
        boolean z = r3 instanceof C108805cK;
        int i3 = 8;
        AnonymousClass3MW.A0A(r8).setVisibility(C72453Mb.A07(z ? 1 : 0));
        View A0A = AnonymousClass3MW.A0A(r4.A03);
        if (r3 instanceof C92444hJ) {
            i3 = 0;
        }
        A0A.setVisibility(i3);
        if (r3 instanceof C92424hH) {
            AnonymousClass4E4 BaM = ((C92424hH) r3).A00.BaM();
            if (BaM instanceof C75563hj) {
                View A0A2 = AnonymousClass3MW.A0A(r8);
                C18070vi.A0d(A0A2, 0);
                A0A2.setTag(2131431533, (Object) null);
                A0A2.setTag(2131432149, (Object) null);
                AnonymousClass3MX.A0J(r8).setImageResource(((C75563hj) BaM).A00);
            } else if (BaM instanceof C75573hk) {
                AnonymousClass4P0 r0 = r4.A01;
                String str = ((C75573hk) BaM).A00;
                ImageView A0J = AnonymousClass3MX.A0J(r8);
                C18070vi.A0d(A0J, 1);
                String lastPathSegment = Uri.parse(str).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = str;
                }
                Resources A052 = AnonymousClass3MX.A05(A0J);
                Integer num = r0.A02;
                if (num != null) {
                    dimensionPixelSize = num.intValue();
                } else {
                    dimensionPixelSize = A052.getDimensionPixelSize(2131165341);
                    Integer valueOf = Integer.valueOf(dimensionPixelSize);
                    r0.A02 = valueOf;
                    if (valueOf == null) {
                        throw C17880vN.A0g();
                    }
                }
                AnonymousClass48I r12 = new AnonymousClass48I(A0J, str, lastPathSegment, dimensionPixelSize, A1T);
                A2k a2k = r0.A01;
                if (a2k == null) {
                    synchronized (r0) {
                        File A0e = C17880vN.A0e(((AnonymousClass118) r0.A05.get()).A00.getCacheDir(), "ar_effects_thumbnail_cache");
                        AnonymousClass10I A0x = AnonymousClass3MX.A0x(r0.A07);
                        a2k = new C115515vB((AnonymousClass1KB) r0.A03.get(), (AnonymousClass181) r0.A04.get(), r0.A00, (AnonymousClass1D9) r0.A06.get(), A0x, A0e, "ar_effects", 4194304);
                        r0.A01 = a2k;
                    }
                }
                a2k.A03(r12, true);
            } else {
                throw AnonymousClass3MW.A14();
            }
        } else if (r3 instanceof C92434hI) {
            View A0A3 = AnonymousClass3MW.A0A(r8);
            C18070vi.A0d(A0A3, 0);
            A0A3.setTag(2131431533, (Object) null);
            A0A3.setTag(2131432149, (Object) null);
            if (!A1T || (drawable = ((C92434hI) r3).A00) == null) {
                AnonymousClass3MX.A0J(r8).setImageDrawable(new AnonymousClass3NM(AnonymousClass3MY.A04(AnonymousClass3MW.A0A(r8)), 2131233279, A1T));
            } else {
                AnonymousClass3MX.A0J(r8).setImageDrawable(drawable);
            }
        }
        if (!z) {
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setClickable(false);
        } else if (r4.A00 == null || !A1T) {
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setClickable(!A1T);
        } else {
            view.setOnClickListener(new AnonymousClass78Q((Object) r4, (Object) r3, 15));
            C90284dp.A00(view, r4, r3, 0);
            view.setOnTouchListener(new C90304dr(r3, r4, 2));
            return;
        }
        view.setLongClickable(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WK(C84604Kd r2, AnonymousClass4P0 r3, Integer num) {
        super((C40411uf) AnonymousClass3W6.A00);
        C72473Md.A1I(r3, num);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = num;
    }

    public int getItemViewType(int i) {
        C106535Wf r1 = (C106535Wf) A0U(i);
        if (r1 instanceof C92444hJ) {
            return 0;
        }
        if (r1 instanceof C92434hI) {
            return 1;
        }
        if (r1 instanceof C92424hH) {
            AnonymousClass4E4 BaM = ((C92424hH) r1).A00.BaM();
            if (BaM instanceof C75563hj) {
                return 2;
            }
            if (BaM instanceof C75573hk) {
                return 3;
            }
            throw AnonymousClass3MW.A14();
        }
        throw AnonymousClass3MW.A14();
    }
}
