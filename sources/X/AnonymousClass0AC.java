package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.0AC  reason: invalid class name */
public final class AnonymousClass0AC extends C02010Ch implements Iterable, C18450wR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public AnonymousClass0AC() {
        this((String) null, (List) null, (List) null, (AnonymousClass1Y1) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1023);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass0AC)) {
                AnonymousClass0AC r5 = (AnonymousClass0AC) obj;
                if (!(C18070vi.A18(this.A07, r5.A07) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A06 == r5.A06 && C18070vi.A18(this.A09, r5.A09) && C18070vi.A18(this.A08, r5.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A08() {
        return this.A08.size();
    }

    public final C02010Ch A09(int i) {
        return (C02010Ch) this.A08.get(i);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A08, AnonymousClass000.A0N(this.A09, AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(this.A07.hashCode() * 31, this.A02), this.A00), this.A01), this.A03), this.A04), this.A05), this.A06)));
    }

    public Iterator iterator() {
        return new C06740Zm(this);
    }

    public AnonymousClass0AC(String str, List list, List list2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A09 = list;
        this.A08 = list2;
    }

    public final float A01() {
        return this.A00;
    }

    public final float A02() {
        return this.A01;
    }

    public final float A03() {
        return this.A02;
    }

    public final float A04() {
        return this.A03;
    }

    public final float A05() {
        return this.A04;
    }

    public final float A06() {
        return this.A05;
    }

    public final float A07() {
        return this.A06;
    }

    public final String A0A() {
        return this.A07;
    }

    public final List A0B() {
        return this.A09;
    }

    public /* synthetic */ AnonymousClass0AC(String str, List list, List list2, AnonymousClass1Y1 r4, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this("", AnonymousClass0GD.A00, AnonymousClass1ZU.A09(), 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f);
    }
}
