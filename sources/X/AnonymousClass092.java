package X;

import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.092  reason: invalid class name */
public final class AnonymousClass092 extends AnonymousClass0XW implements C17650v0, C16210rt {
    public long A00 = 0;
    public C17010ta A01;
    public AnonymousClass0CI A02;
    public C16840tJ A03;
    public C16910tQ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public AnonymousClass0NU A08;
    public C16910tQ A09;
    public final AnonymousClass0JE A0A = new AnonymousClass0JE();
    public final UpdatableAnimationState A0B;

    public static final float A00(AnonymousClass092 r7) {
        AnonymousClass0NU A042;
        C17010ta r3;
        float f;
        float f2;
        float A002;
        if (AnonymousClass000.A1P((r7.A00 > 0 ? 1 : (r7.A00 == 0 ? 0 : -1))) || ((A042 = r7.A04()) == null && (!r7.A07 || (A042 = A05(r7)) == null))) {
            return 0.0f;
        }
        long A012 = C25293Ccv.A01(r7.A00);
        int ordinal = r7.A02.ordinal();
        if (ordinal == 0) {
            r3 = r7.A01;
            f = A042.A03;
            f2 = A042.A00 - f;
            A002 = AnonymousClass0QG.A00(A012);
        } else if (ordinal == 1) {
            r3 = r7.A01;
            f = A042.A01;
            f2 = A042.A02 - f;
            A002 = AnonymousClass0QG.A02(A012);
        } else {
            throw new AnonymousClass3EW();
        }
        return r3.BDy(f, f2, A002);
    }

    private final int A01(long j, long j2) {
        int i;
        long j3;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            i = (int) (j & 4294967295L);
            j3 = j2 & 4294967295L;
        } else if (ordinal == 1) {
            i = (int) (j >> 32);
            j3 = j2 >> 32;
        } else {
            throw new AnonymousClass3EW();
        }
        return C18070vi.A00(i, (int) j3);
    }

    private final int A02(long j, long j2) {
        float A002;
        float A003;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            A002 = AnonymousClass0QG.A00(j);
            A003 = AnonymousClass0QG.A00(j2);
        } else if (ordinal == 1) {
            A002 = AnonymousClass0QG.A02(j);
            A003 = AnonymousClass0QG.A02(j2);
        } else {
            throw new AnonymousClass3EW();
        }
        return Float.compare(A002, A003);
    }

    private final AnonymousClass0NU A04() {
        C06970a9 r1 = this.A0A.A00;
        int i = r1.A00;
        AnonymousClass0NU r7 = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = r1.A01;
            while (true) {
                AnonymousClass0NU r4 = (AnonymousClass0NU) ((AnonymousClass0Ja) objArr[i2]).A00().invoke();
                if (r4 != null) {
                    long A0p = AnonymousClass001.A0p(r4.A02 - r4.A01, r4.A00 - r4.A03);
                    long j = AnonymousClass0QG.A02;
                    if (A02(A0p, C25293Ccv.A01(this.A00)) <= 0) {
                        r7 = r4;
                    } else if (r7 == null) {
                        return r4;
                    }
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
        }
        return r7;
    }

    public static final AnonymousClass0NU A05(AnonymousClass092 r4) {
        C16910tQ r1;
        C16910tQ r3 = r4.A09;
        if (r3 == null || !r3.Be8() || (r1 = r4.A04) == null || !r1.Be8()) {
            return null;
        }
        return r3.Bhs(r1, false);
    }

    private final void A06() {
        if (!this.A05) {
            AnonymousClass4Z4.A02(AnonymousClass00R.A0N, (C18560wh) null, new ContentInViewNode$launchAnimation$2(this, (C30391dr) null), A0B(), 1);
            return;
        }
        throw AnonymousClass000.A0n("launchAnimation called when previous animation was running");
    }

    public void C2y(long j) {
        AnonymousClass0NU A052;
        long j2 = this.A00;
        this.A00 = j;
        if (A01(j, j2) < 0 && (A052 = A05(this)) != null) {
            AnonymousClass0NU r3 = this.A08;
            if (r3 == null) {
                r3 = A052;
            }
            if (!this.A05 && !this.A07 && A07(this, r3, j2) && !A07(this, A052, j)) {
                this.A07 = true;
                A06();
            }
            this.A08 = A052;
        }
    }

    public AnonymousClass092(C17010ta r3, AnonymousClass0CI r4, C16840tJ r5, boolean z) {
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = z;
        this.A01 = r3;
        this.A0B = new UpdatableAnimationState(((AnonymousClass0UP) r3).A00);
    }

    public static final long A03(AnonymousClass092 r6, AnonymousClass0NU r7, long j) {
        long A0p;
        long A012 = C25293Ccv.A01(j);
        int ordinal = r6.A02.ordinal();
        if (ordinal == 0) {
            C17010ta r3 = r6.A01;
            float f = r7.A03;
            A0p = AnonymousClass001.A0p(0.0f, r3.BDy(f, r7.A00 - f, AnonymousClass0QG.A00(A012)));
        } else if (ordinal == 1) {
            C17010ta r32 = r6.A01;
            float f2 = r7.A01;
            A0p = AnonymousClass001.A0p(r32.BDy(f2, r7.A02 - f2, AnonymousClass0QG.A02(A012)), 0.0f);
        } else {
            throw new AnonymousClass3EW();
        }
        long j2 = AnonymousClass0QY.A03;
        return A0p;
    }

    public static final boolean A07(AnonymousClass092 r0, AnonymousClass0NU r1, long j) {
        long A032 = A03(r0, r1, j);
        if (Math.abs(AnonymousClass0QY.A01(A032)) > 0.5f || Math.abs(AnonymousClass0QY.A02(A032)) > 0.5f) {
            return false;
        }
        return true;
    }

    public Object BDJ(C30391dr r5, C18090vk r6) {
        AnonymousClass0NU r2 = (AnonymousClass0NU) r6.invoke();
        if (r2 != null && !A07(this, r2, this.A00)) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r22 = new C31781g7(1, C30581eB.A02(r5));
            r22.A0F();
            if (this.A0A.A02(new AnonymousClass0Ja(r6, r22)) && !this.A05) {
                A06();
            }
            Object A0C = r22.A0C();
            if (A0C == AnonymousClass3F6.A03()) {
                return A0C;
            }
        }
        return C27621Wu.A00;
    }

    public void C0g(C16910tQ r1) {
        this.A09 = r1;
    }
}
