package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.ArrayList;

/* renamed from: X.6Jl  reason: invalid class name and case insensitive filesystem */
public class C121386Jl extends C121446Jr {
    public int A00 = -1;
    public long A01;
    public ValueAnimator A02;
    public C132706nQ A03;
    public Runnable A04;
    public boolean A05;
    public final C133606p3 A06;
    public final UpdatesFragment A07;
    public final AnonymousClass1DC A08;
    public final C18100vl A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(AnonymousClass7xG.A00);
    public final C18100vl A0B;
    public final boolean A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121386Jl(android.view.View r23, X.C72043Kk r24, X.AnonymousClass1VW r25, X.C24921Me r26, X.C37451pZ r27, X.AnonymousClass11P r28, X.C18000vb r29, X.AQC r30, X.C131656lS r31, X.C133606p3 r32, com.whatsapp.updates.ui.UpdatesFragment r33, X.AnonymousClass8AW r34, X.AnonymousClass1DC r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, boolean r39, boolean r40) {
        /*
            r22 = this;
            r0 = 3
            r9 = r25
            r3 = r36
            r14 = r30
            X.C72473Md.A1M(r14, r9, r3, r0)
            r1 = r38
            r2 = r37
            r8 = r24
            r12 = r28
            r13 = r29
            X.C18070vi.A0x(r2, r1, r8, r12, r13)
            r15 = r31
            r10 = r26
            X.C72473Md.A1L(r15, r10)
            r0 = 17
            r4 = r32
            X.C18070vi.A0d(r4, r0)
            r0 = 18
            r5 = r35
            X.C18070vi.A0d(r5, r0)
            r21 = 0
            r6 = r22
            r16 = r34
            r11 = r27
            r20 = r39
            r7 = r23
            r19 = r1
            r18 = r2
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r40
            r6.A0C = r0
            r0 = r33
            r6.A07 = r0
            r6.A06 = r4
            r6.A08 = r5
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.7rB r0 = new X.7rB
            r0.<init>(r6)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r6.A09 = r0
            r0 = -1
            r6.A00 = r0
            X.7xG r0 = X.AnonymousClass7xG.A00
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r6.A0A = r0
            X.7rC r0 = new X.7rC
            r0.<init>(r7)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r6.A0B = r0
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = r6.A0D
            if (r1 == 0) goto L_0x0079
            r0 = 41
            X.AnonymousClass3Ma.A1E(r1, r6, r0)
        L_0x0079:
            r0 = 2131432900(0x7f0b15c4, float:1.848757E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 == 0) goto L_0x0087
            r0 = 42
            X.AnonymousClass3Ma.A1E(r1, r6, r0)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121386Jl.<init>(android.view.View, X.3Kk, X.1VW, X.1Me, X.1pZ, X.11P, X.0vb, X.AQC, X.6lS, X.6p3, com.whatsapp.updates.ui.UpdatesFragment, X.8AW, X.1DC, X.00H, X.00H, X.00H, boolean, boolean):void");
    }

    private final boolean A02(boolean z) {
        int i;
        int i2;
        AnonymousClass6JC r1;
        AnonymousClass6JC r12;
        if (!this.A0F) {
            return true;
        }
        if (z) {
            i = C72453Mb.A0I(this.A09);
        } else {
            i = 0;
        }
        if ((this.A02 != null || ((i != 0 || this.A09.getVisibility() == 0) && !(i == C72453Mb.A0I(this.A09) && this.A09.getVisibility() == 0))) && (this.A02 == null || this.A00 != i)) {
            if (System.currentTimeMillis() - this.A01 < 1300) {
                AnonymousClass7RC r8 = new AnonymousClass7RC(this);
                Handler handler = (Handler) this.A0A.getValue();
                long currentTimeMillis = 1300 - (System.currentTimeMillis() - this.A01);
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                handler.postDelayed(r8, currentTimeMillis + 1);
                this.A04 = r8;
                return false;
            }
            AnonymousClass6J8 r13 = this.A02;
            if (!(!(r13 instanceof AnonymousClass6JC) || (r1 = (AnonymousClass6JC) r13) == null || r1.A04 == null)) {
                this.A01 = System.currentTimeMillis();
            }
            this.A00 = i;
            WaTextView waTextView = this.A09;
            if (waTextView.getVisibility() == 0) {
                i2 = waTextView.getMeasuredHeight();
            } else {
                i2 = 0;
            }
            int[] A1W = C108945cZ.A1W();
            A1W[0] = i2;
            A1W[1] = i;
            ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
            C1411074h.A00(ofInt, this, 33);
            ofInt.addListener(new C109135cs(this, i2, i));
            ofInt.setDuration(300);
            this.A02 = ofInt;
            ofInt.start();
        }
        AnonymousClass6J8 r14 = this.A02;
        if (!(!(r14 instanceof AnonymousClass6JC) || (r12 = (AnonymousClass6JC) r14) == null || r12.A04 == null)) {
            this.A01 = System.currentTimeMillis();
        }
        return true;
    }

    public static final void A01(AnonymousClass6JC r14, C121386Jl r15) {
        Context context;
        int i;
        Object[] objArr;
        String string;
        C63372sx A002 = r14.A00();
        if (A002 != null && A002.A00() != 0) {
            C134956rQ r0 = r14.A04;
            if (r0 == null || r0.A01 == AnonymousClass6R8.SUCCESS) {
                boolean z = !r15.A0F;
                if (r15.A02(z) && z) {
                    WaTextView waTextView = r15.A09;
                    waTextView.setVisibility(0);
                    CharSequence charSequence = r14.A06;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    waTextView.setText(charSequence);
                }
            } else if (r15.A02(true)) {
                WaTextView waTextView2 = r15.A09;
                waTextView2.setVisibility(0);
                C132696nP r1 = r14.A05.A02;
                ArrayList A13 = AnonymousClass000.A13();
                long size = (long) r1.A01.size();
                long size2 = (long) r1.A02.size();
                long size3 = (long) r1.A00.size();
                if (size > 0) {
                    C133606p3 r12 = r15.A06;
                    Object[] objArr2 = new Object[1];
                    AnonymousClass3MX.A1S(objArr2, 0, size);
                    A13.add(r12.A01(objArr2, 2131755147, size));
                }
                if (size2 > 0) {
                    C133606p3 r7 = r15.A06;
                    Object[] objArr3 = new Object[1];
                    AnonymousClass3MX.A1S(objArr3, 0, size2);
                    A13.add(r7.A01(objArr3, 2131755382, size2));
                }
                if (size3 > 0) {
                    C133606p3 r4 = r15.A06;
                    Object[] objArr4 = new Object[1];
                    AnonymousClass3MX.A1S(objArr4, 0, size3);
                    A13.add(r4.A01(objArr4, 2131755089, size3));
                }
                int size4 = A13.size();
                if (size4 == 2) {
                    context = C108945cZ.A0D(r15);
                    i = 2131897209;
                    objArr = new Object[2];
                    C108985cd.A1Q(A13, objArr);
                    string = context.getString(i, objArr);
                } else if (size4 != 3) {
                    string = (String) C29431cG.A0f(A13, 0);
                    if (string == null) {
                        string = "";
                    }
                } else {
                    context = C108945cZ.A0D(r15);
                    i = 2131896873;
                    objArr = new Object[3];
                    C108985cd.A1Q(A13, objArr);
                    objArr[2] = A13.get(2);
                    string = context.getString(i, objArr);
                }
                C18070vi.A0b(string);
                waTextView2.setText(string);
            }
        } else if (r15.A02(true)) {
            WaTextView waTextView3 = r15.A09;
            waTextView3.setVisibility(0);
            waTextView3.setText(2131892381);
        }
    }
}
