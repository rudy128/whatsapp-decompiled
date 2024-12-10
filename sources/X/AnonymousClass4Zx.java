package X;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4Zx  reason: invalid class name */
public class AnonymousClass4Zx {
    public View A00;
    public C03610Iy A01;
    public C03610Iy A02;
    public C03610Iy A03;
    public final int A04;
    public final AnonymousClass11S A05;
    public final C107915ap A06;
    public final C195199sx A07;
    public final AnonymousClass1MZ A08;
    public final AnonymousClass1E7 A09;
    public final C18030ve A0A;
    public final AnonymousClass1BI A0B;
    public final WeakReference A0C;
    public final AnonymousClass4G0 A0D;
    public final C34511kb A0E;
    public final AnonymousClass1CJ A0F;
    public final AnonymousClass1MW A0G;

    private void A01(Menu menu, int i, int i2) {
        menu.add(0, 2, i2, i).setIcon(C72473Md.A0G(this.A0C, 2131231736));
    }

    private void A02(Menu menu, int i, int i2) {
        C17960vV.A0C(true);
        if (C40811vJ.A0V(this.A0A) && this.A0G.A0N(this.A0B)) {
            menu.add(0, i, i2, 2131895405).setIcon(C72473Md.A0G(this.A0C, 2131233223));
        }
    }

    private C03610Iy A00(View view) {
        C03610Iy r2 = new C03610Iy((Context) this.A0C.get(), view, 0, 0, 2132084381);
        C137526vb.A00(r2.A03);
        r2.A01 = new C91144fD(this, 1);
        r2.A00 = new C91134fC(this, 2);
        return r2;
    }

    public void A03(View view, int i) {
        C03610Iy r5;
        WeakReference weakReference = this.A0C;
        if (weakReference.get() == null || ((Activity) weakReference.get()).isFinishing()) {
            Log.w("GroupCallMenuHelper/launchPopupMenu activity is finished/finishing");
            return;
        }
        this.A00 = view;
        view.setAlpha(0.5f);
        if (i == 0) {
            r5 = this.A03;
            if (r5 == null) {
                r5 = A00(view);
                C003301m r4 = r5.A03;
                r4.add(0, 1, 1, 2131887636).setIcon(C72473Md.A0G(weakReference, 2131231735));
                A02(r4, 3, 2);
                this.A03 = r5;
            }
        } else if (i != 1) {
            r5 = this.A01;
            if (i != 2) {
                if (r5 == null) {
                    r5 = A00(view);
                    C003301m r3 = r5.A03;
                    A01(r3, 2131899576, 1);
                    A02(r3, 5, 2);
                }
            } else if (r5 == null) {
                r5 = A00(view);
                C003301m r32 = r5.A03;
                AnonymousClass1BI r42 = this.A0B;
                if (r42 instanceof AnonymousClass1EC) {
                    if (C40811vJ.A0J(this.A05, this.A0A, AnonymousClass3MW.A03(this.A08, (AnonymousClass1E9) r42), false)) {
                        r32.add(0, 6, 1, 2131898016).setIcon(C72473Md.A0G(weakReference, 2131233309));
                        A01(r32, 2131899576, 2);
                        A02(r32, 5, 3);
                    }
                }
                r32.add(0, 1, 1, 2131898713).setIcon(C72473Md.A0G(weakReference, 2131231735));
                A01(r32, 2131899576, 2);
                A02(r32, 5, 3);
            }
            this.A01 = r5;
        } else {
            r5 = this.A02;
            if (r5 == null) {
                r5 = A00(view);
                C003301m r2 = r5.A03;
                A01(r2, 2131887636, 1);
                A02(r2, 4, 2);
                this.A02 = r5;
            }
        }
        r5.A00();
    }

    public AnonymousClass4Zx(AnonymousClass01E r2, AnonymousClass11S r3, C107915ap r4, C195199sx r5, AnonymousClass4G0 r6, C34511kb r7, AnonymousClass1CJ r8, C25181Nf r9, AnonymousClass1MZ r10, AnonymousClass1MW r11, C18030ve r12, AnonymousClass1BI r13, int i) {
        this.A0A = r12;
        this.A05 = r3;
        this.A0F = r8;
        this.A0E = r7;
        this.A0G = r11;
        this.A0D = r6;
        this.A0B = r13;
        this.A0C = AnonymousClass3MW.A0z(r2);
        this.A06 = r4;
        this.A04 = i;
        this.A08 = r10;
        this.A07 = r5;
        this.A09 = r9.A01(r13);
    }
}
