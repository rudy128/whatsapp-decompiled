package X;

import androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1;
import java.util.List;

/* renamed from: X.0aS  reason: invalid class name and case insensitive filesystem */
public class C07150aS implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C07150aS(C17330uU r1, List list, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = list;
                this.A02 = r1;
                break;
            default:
                this.A02 = list;
                this.A01 = r1;
                break;
        }
    }

    public final Object A00(C15670r0 r3) {
        if (r3 instanceof C05420Ud) {
            ((List) this.A01).add(r3);
        } else if (r3 instanceof C05460Uh) {
            ((List) this.A01).remove(((C05460Uh) r3).A00);
        }
        AnonymousClass000.A1C((C17330uU) this.A02, AnonymousClass000.A1a((List) this.A01));
        return C27621Wu.A00;
    }

    public final Object A01(C15670r0 r3) {
        if (r3 instanceof C05430Ue) {
            ((List) this.A01).add(r3);
        } else if (r3 instanceof C05470Ui) {
            ((List) this.A01).remove(((C05470Ui) r3).A00);
        }
        AnonymousClass000.A1C((C17330uU) this.A02, AnonymousClass000.A1a((List) this.A01));
        return C27621Wu.A00;
    }

    public final Object A02(C15670r0 r3) {
        List list;
        AnonymousClass0Uk r0;
        if (r3 instanceof AnonymousClass0Uk) {
            ((List) this.A02).add(r3);
        } else {
            if (r3 instanceof C05490Ul) {
                list = (List) this.A02;
                r0 = ((C05490Ul) r3).A00;
            } else if (r3 instanceof C05480Uj) {
                list = (List) this.A02;
                r0 = ((C05480Uj) r3).A00;
            }
            list.remove(r0);
        }
        AnonymousClass000.A1C((C17330uU) this.A01, AnonymousClass000.A1a((List) this.A02));
        return C27621Wu.A00;
    }

    public final Object A03(C15670r0 r3) {
        AnonymousClass0UH r1;
        AnonymousClass0Uk r0;
        if (r3 instanceof AnonymousClass0Uk) {
            ((AnonymousClass0UH) this.A02).A05((AnonymousClass0Uk) r3, (AnonymousClass1OX) this.A01);
        } else {
            if (r3 instanceof C05490Ul) {
                r1 = (AnonymousClass0UH) this.A02;
                r0 = ((C05490Ul) r3).A00;
            } else {
                boolean z = r3 instanceof C05480Uj;
                r1 = (AnonymousClass0UH) this.A02;
                if (z) {
                    r0 = ((C05480Uj) r3).A00;
                } else {
                    r1.A02(r3, (AnonymousClass1OX) this.A01);
                }
            }
            r1.A04(r0);
        }
        return C27621Wu.A00;
    }

    public final Object A04(C30391dr r8, long j) {
        AnonymousClass0Q3 r4 = (AnonymousClass0Q3) this.A01;
        C17330uU r3 = r4.A04.A05;
        long j2 = ((AnonymousClass0QY) r3.getValue()).A00;
        long j3 = AnonymousClass0QY.A02;
        if (j2 == j3 || j == j3 || AnonymousClass0QY.A02(((AnonymousClass0QY) r3.getValue()).A00) == AnonymousClass0QY.A02(j)) {
            Object A07 = r4.A07(AnonymousClass000.A0e(j), r8);
            if (A07 == AnonymousClass3F6.A03()) {
                return A07;
            }
        } else {
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1(r4, (C30391dr) null, j), (AnonymousClass1OX) this.A02, 3);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r4) {
        switch (this.A00) {
            case 0:
                return A00((C15670r0) obj);
            case 1:
                return A01((C15670r0) obj);
            case 2:
                return A02((C15670r0) obj);
            case 3:
                return A04(r4, ((AnonymousClass0QY) obj).A00);
            default:
                return A03((C15670r0) obj);
        }
    }

    public C07150aS(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
