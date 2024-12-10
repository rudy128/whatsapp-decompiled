package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* renamed from: X.0Pm  reason: invalid class name and case insensitive filesystem */
public final class C04910Pm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05 = new int[16];
    public AnonymousClass0PV[] A06 = new AnonymousClass0PV[16];
    public Object[] A07 = new Object[16];

    public static int A00(C04910Pm r2, int i) {
        return (1 << i) & r2.A04;
    }

    public final void A04() {
        this.A02 = 0;
        this.A00 = 0;
        C200310o.A06(this.A07, 0, this.A01);
        this.A01 = 0;
    }

    public final void A06(AnonymousClass0PV r6) {
        this.A03 = 0;
        this.A04 = 0;
        int i = this.A02;
        AnonymousClass0PV[] r2 = this.A06;
        if (i == r2.length) {
            int i2 = i;
            if (i > 1024) {
                i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            Object[] copyOf = Arrays.copyOf(r2, i + i2);
            C18070vi.A0X(copyOf);
            this.A06 = (AnonymousClass0PV[]) copyOf;
        }
        int i3 = this.A00;
        int i4 = r6.A00;
        A02(i3 + i4);
        int i5 = this.A01;
        int i6 = r6.A01;
        A03(i5 + i6);
        AnonymousClass0PV[] r22 = this.A06;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        r22[i7] = r6;
        this.A00 += i4;
        this.A01 += i6;
    }

    public static final AnonymousClass0PV A01(C04910Pm r2) {
        AnonymousClass0PV r0 = r2.A06[r2.A02 - 1];
        C18070vi.A0b(r0);
        return r0;
    }

    private final void A02(int i) {
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i > length) {
            int i2 = length;
            if (length > 1024) {
                i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            int i3 = length + i2;
            if (i3 < i) {
                i3 = i;
            }
            int[] copyOf = Arrays.copyOf(iArr, i3);
            C18070vi.A0X(copyOf);
            this.A05 = copyOf;
        }
    }

    private final void A03(int i) {
        Object[] objArr = this.A07;
        int length = objArr.length;
        if (i > length) {
            int i2 = length;
            if (length > 1024) {
                i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
            int i3 = length + i2;
            if (i3 < i) {
                i3 = i;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i3);
            C18070vi.A0X(copyOf);
            this.A07 = copyOf;
        }
    }

    public final void A05(C16270rz r6, C15750r8 r7, AnonymousClass0Qu r8) {
        C04910Pm r3;
        int i;
        if (this.A02 != 0) {
            C05840Vx r4 = new C05840Vx(this);
            do {
                r4.A00().A06(r6, r7, r8, r4);
                int i2 = r4.A02;
                r3 = r4.A03;
                if (i2 >= r3.A02) {
                    break;
                }
                AnonymousClass0PV A002 = r4.A00();
                r4.A00 += A002.A00;
                r4.A01 += A002.A01;
                i = r4.A02 + 1;
                r4.A02 = i;
            } while (i < r3.A02);
        }
        A04();
    }

    public final void A07(C04910Pm r13) {
        int i = this.A02;
        if (i == 0) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        AnonymousClass0PV[] r1 = this.A06;
        int i2 = i - 1;
        this.A02 = i2;
        AnonymousClass0PV r11 = r1[i2];
        C18070vi.A0b(r11);
        this.A06[this.A02] = null;
        r13.A06(r11);
        int i3 = this.A01;
        int i4 = i3;
        int i5 = r13.A01;
        int i6 = r11.A01;
        for (int i7 = 0; i7 < i6; i7++) {
            i5--;
            i3--;
            Object[] objArr = r13.A07;
            Object[] objArr2 = this.A07;
            objArr[i5] = objArr2[i3];
            objArr2[i3] = null;
        }
        int i8 = this.A00;
        int i9 = i8;
        int i10 = r13.A00;
        int i11 = r11.A00;
        for (int i12 = 0; i12 < i11; i12++) {
            i10--;
            i8--;
            int[] iArr = r13.A05;
            int[] iArr2 = this.A05;
            iArr[i10] = iArr2[i8];
            iArr2[i8] = 0;
        }
        this.A01 = i4 - i6;
        this.A00 = i9 - i11;
    }
}
