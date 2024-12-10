package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.09X  reason: invalid class name */
public final class AnonymousClass09X extends AnonymousClass0XW implements C28644ECa, C17730v8, C17680v3 {
    public long A00 = 0;
    public AnonymousClass0Hm A01 = AnonymousClass0PB.A00;
    public AnonymousClass0Hm A02;
    public AnonymousClass1OS A03;
    public AnonymousClass1OB A04;
    public final C06970a9 A05 = C06970a9.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public final C06970a9 A06 = C06970a9.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
    }

    public /* synthetic */ float CPE(long j) {
        return C25292Ccu.A00(this, j);
    }

    public /* synthetic */ float CPF(float f) {
        return C26252Cvs.A00(this, f);
    }

    public /* synthetic */ float CPG(int i) {
        return C26252Cvs.A02(this, i);
    }

    public /* synthetic */ long CPH(long j) {
        return C26252Cvs.A06(this, j);
    }

    public /* synthetic */ float CPP(long j) {
        return C26252Cvs.A03(this, j);
    }

    public /* synthetic */ float CPQ(float f) {
        return C26252Cvs.A01(this, f);
    }

    public /* synthetic */ long CPT(long j) {
        return C26252Cvs.A07(this, j);
    }

    public /* synthetic */ long CPU(float f) {
        return C25292Ccu.A01(this, f);
    }

    public /* synthetic */ long CPV(float f) {
        return C26252Cvs.A05(this, f);
    }

    public static final C71053Dp A03(Object obj, C30391dr r2, AnonymousClass1OS r3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C71053Dp.A01;
        return new C71053Dp(C31751g4.COROUTINE_SUSPENDED, C30581eB.A02(C30581eB.A01(obj, r2, r3)));
    }

    private final void A04(AnonymousClass0Hm r6, AnonymousClass0CQ r7) {
        C06970a9 r4;
        C06970a9 r1 = this.A05;
        synchronized (r1) {
            r4 = this.A06;
            r4.A0C(r1, r4.A00);
        }
        try {
            int ordinal = r7.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                int i = r4.A00;
                if (i > 0) {
                    Object[] objArr = r4.A01;
                    int i2 = 0;
                    do {
                        ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr[i2]).A02(r6, r7);
                        i2++;
                    } while (i2 < i);
                }
            } else if (ordinal == 1) {
                int i3 = r4.A00;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr2 = r4.A01;
                    do {
                        ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr2[i4]).A02(r6, r7);
                        i4--;
                    } while (i4 >= 0);
                }
            }
        } finally {
            r4.A08();
        }
    }

    public Object BCr(C30391dr r6, AnonymousClass1OS r7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r4 = new C31781g7(1, C30581eB.A02(r6));
        r4.A0F();
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(this, r4);
        C06970a9 r2 = this.A05;
        synchronized (r2) {
            r2.A0F(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            A03(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, r7).resumeWith(C27621Wu.A00);
        }
        r4.Bdu(new C09970ha(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine));
        return r4.A0C();
    }

    public void Bnm() {
        AnonymousClass0Hm r6 = this.A02;
        if (r6 != null) {
            List list = r6.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!(!AnonymousClass000.A0f(list, i).A0B)) {
                    List list2 = r6.A03;
                    ArrayList A14 = AnonymousClass000.A14(list2);
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        AnonymousClass0KX A0f = AnonymousClass000.A0f(list2, i2);
                        long j = A0f.A05;
                        long j2 = A0f.A06;
                        long j3 = A0f.A0A;
                        float f = A0f.A03;
                        boolean z = A0f.A0B;
                        A14.add(new AnonymousClass0KX(f, 1, j, j3, j2, j3, j2, AnonymousClass0QY.A03, false, z, z));
                    }
                    AnonymousClass0Hm r2 = new AnonymousClass0Hm((AnonymousClass0IF) null, A14);
                    this.A01 = r2;
                    A04(r2, AnonymousClass0CQ.Initial);
                    A04(r2, AnonymousClass0CQ.Main);
                    A04(r2, AnonymousClass0CQ.Final);
                    this.A02 = null;
                    return;
                }
            }
        }
    }

    public void C0v(AnonymousClass0Hm r6, AnonymousClass0CQ r7, long j) {
        this.A00 = j;
        if (r7 == AnonymousClass0CQ.Initial) {
            this.A01 = r6;
        }
        if (this.A04 == null) {
            this.A04 = AnonymousClass4Z4.A02(AnonymousClass00R.A0N, (C18560wh) null, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, (C30391dr) null), A0B(), 1);
        }
        A04(r6, r7);
        List list = r6.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!AnonymousClass0Oz.A01(AnonymousClass000.A0f(list, i))) {
                    break;
                }
                i++;
            } else {
                r6 = null;
                break;
            }
        }
        this.A02 = r6;
    }

    public void CFk() {
        AnonymousClass1OB r1 = this.A04;
        if (r1 != null) {
            r1.BEM(new C07280ag());
            this.A04 = null;
        }
    }

    public AnonymousClass09X(AnonymousClass1OS r3) {
        this.A03 = r3;
    }

    public void A0M() {
        CFk();
    }

    public long A0N() {
        long CPT = CPT(AnonymousClass0QV.A03(this).A09.BV0());
        long j = this.A00;
        return AnonymousClass001.A0p(Math.max(0.0f, AnonymousClass0QG.A02(CPT) - AnonymousClass000.A02(j)) / 2.0f, Math.max(0.0f, AnonymousClass0QG.A00(CPT) - ((float) AnonymousClass000.A0H(j))) / 2.0f);
    }

    public AnonymousClass1OS A0O() {
        return this.A03;
    }

    public void A0P(AnonymousClass1OS r1) {
        CFk();
        this.A03 = r1;
    }

    public float BQU() {
        return AnonymousClass0QV.A03(this).A0M().BQU();
    }

    public float BRu() {
        return AnonymousClass0QV.A03(this).A0M().BRu();
    }

    public long BZM() {
        return this.A00;
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public void BrG() {
        CFk();
    }

    public void CA7() {
        CFk();
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }
}
