package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2A6  reason: invalid class name */
public class AnonymousClass2A6 extends MarkerEditor implements PointEditor {
    public long A00;
    public String A01;
    public String A02;
    public int A03 = 7;
    public final int A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass19X A06;
    public final Integer A07;

    public MarkerEditor point(String str, String str2, long j) {
        String str3 = str;
        if (str != null) {
            Integer num = this.A07;
            long j2 = j;
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            String str4 = str2;
            if (num == null) {
                if (i == 0) {
                    this.A06.markerPoint(this.A04, str, str2);
                } else {
                    this.A06.markerPoint(this.A04, str3, str4, j2, TimeUnit.MILLISECONDS);
                    return this;
                }
            } else if (i == 0) {
                this.A06.markerPoint(this.A04, num.intValue(), str, str2);
                return this;
            } else {
                this.A06.markerPoint(this.A04, num.intValue(), str3, str4, j2, TimeUnit.MILLISECONDS);
                return this;
            }
        }
        return this;
    }

    private void A00(String str) {
        String str2 = this.A01;
        if (str2 != null) {
            CharSequence[] charSequenceArr = new CharSequence[2];
            AnonymousClass001.A1Q(str2, str, charSequenceArr);
            str = AnonymousClass1EG.A08(" ; ", charSequenceArr);
        }
        this.A01 = str;
    }

    public void markerEditingCompleted() {
        if (this.A02 != null) {
            pointEditingCompleted();
        }
    }

    public MarkerEditor pointEditingCompleted() {
        String str = this.A02;
        if (str == null) {
            this.A05.BkP(this.A04);
        } else {
            point(str, this.A01, this.A00);
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = -1;
        return this;
    }

    public PointEditor pointEditor(String str) {
        this.A02 = str;
        this.A00 = -1;
        return this;
    }

    public AnonymousClass2A6(AnonymousClass19A r2, AnonymousClass19X r3, Integer num, int i) {
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = i;
        this.A07 = num;
    }

    public PointEditor pointCustomTimestamp(long j) {
        this.A00 = j;
        return this;
    }

    public PointEditor pointShouldIncludeMetadata(boolean z) {
        return this;
    }

    public MarkerEditor withLevel(int i) {
        this.A03 = i;
        return this;
    }

    public MarkerEditor pointWithMetadata(String str, String str2, long j) {
        point(str, str2, j);
        return this;
    }

    public PointEditor addPointData(String str, double d) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Double.valueOf(d);
        A00(String.format(locale, "%s:%10.5f", A1a));
        return this;
    }

    public PointEditor addPointData(String str, float f) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Float.valueOf(f);
        A00(String.format(locale, "%s:%10.5f", A1a));
        return this;
    }

    public PointEditor addPointData(String str, int i) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        C17880vN.A1T(A1a, i, 1);
        A00(String.format(locale, "%s:%d", A1a));
        return this;
    }

    public PointEditor addPointData(String str, long j) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Long.valueOf(j);
        A00(String.format(locale, "%s:%d", A1a));
        return this;
    }

    public PointEditor addPointData(String str, String str2) {
        Object[] objArr = new Object[2];
        AnonymousClass001.A1Q(str, str2, objArr);
        A00(String.format("%s:%s", objArr));
        return this;
    }

    public PointEditor addPointData(String str, boolean z) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Boolean.valueOf(z);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, double[] dArr) {
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(dArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, float[] fArr) {
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(fArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, int[] iArr) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(iArr);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, long[] jArr) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(jArr);
        A00(String.format(locale, "%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, String[] strArr) {
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(strArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public PointEditor addPointData(String str, boolean[] zArr) {
        Object[] A1a = C17890vO.A1a(str);
        A1a[1] = Arrays.toString(zArr);
        A00(String.format("%s:%s", A1a));
        return this;
    }

    public MarkerEditor annotate(String str, double d) {
        String str2 = str;
        if (str != null && C50432Uk.A00(this.A03)) {
            Integer num = this.A07;
            AnonymousClass19X r1 = this.A06;
            double d2 = d;
            if (num == null) {
                r1.markerAnnotate(this.A04, str, d);
            } else {
                r1.markerAnnotate(this.A04, num.intValue(), str2, d2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, int i) {
        if (str != null && C50432Uk.A00(this.A03)) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, i);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, i);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, long j) {
        String str2 = str;
        if (str != null && C50432Uk.A00(this.A03)) {
            Integer num = this.A07;
            AnonymousClass19X r1 = this.A06;
            long j2 = j;
            if (num == null) {
                r1.markerAnnotate(this.A04, str, j);
            } else {
                r1.markerAnnotate(this.A04, num.intValue(), str2, j2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, String str2) {
        if (!(str == null || str2 == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, str2);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, str2);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, boolean z) {
        if (str != null && C50432Uk.A00(this.A03)) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, z);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, z);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, double[] dArr) {
        if (!(str == null || dArr == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, dArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, dArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, int[] iArr) {
        if (!(str == null || iArr == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, iArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, iArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, long[] jArr) {
        if (!(str == null || jArr == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, jArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, jArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, String[] strArr) {
        if (!(str == null || strArr == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, strArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, strArr);
                return this;
            }
        }
        return this;
    }

    public MarkerEditor annotate(String str, boolean[] zArr) {
        if (!(str == null || zArr == null || !C50432Uk.A00(this.A03))) {
            Integer num = this.A07;
            if (num == null) {
                this.A06.markerAnnotate(this.A04, str, zArr);
            } else {
                this.A06.markerAnnotate(this.A04, num.intValue(), str, zArr);
                return this;
            }
        }
        return this;
    }
}
