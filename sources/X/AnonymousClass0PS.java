package X;

/* renamed from: X.0PS  reason: invalid class name */
public final class AnonymousClass0PS {
    public boolean A00;
    public final String A01;
    public final AnonymousClass1OS A02;

    public final Object A00(Object obj, Object obj2) {
        return this.A02.invoke(obj, obj2);
    }

    public AnonymousClass0PS(String str, AnonymousClass1OS r2, boolean z) {
        this(str, r2);
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccessibilityKey: ");
        return AnonymousClass000.A0y(this.A01, A10);
    }

    public /* synthetic */ AnonymousClass0PS(String str, AnonymousClass1OS r3, AnonymousClass1Y1 r4, int i) {
        this(str, C14490p6.A00);
    }

    public AnonymousClass0PS(String str) {
        this(str, (AnonymousClass1OS) null, (AnonymousClass1Y1) null, 2);
        this.A00 = true;
    }

    public AnonymousClass0PS(String str, AnonymousClass1OS r2) {
        this.A01 = str;
        this.A02 = r2;
    }
}
