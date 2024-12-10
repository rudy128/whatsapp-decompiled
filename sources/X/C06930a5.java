package X;

import java.util.ListIterator;

/* renamed from: X.0a5  reason: invalid class name and case insensitive filesystem */
public final class C06930a5 implements ListIterator, C18450wR {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ C06850Zx A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C06930a5(C06850Zx r4, int i, int i2) {
        this(r4, (i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? r4.size() : 0);
    }

    /* renamed from: A00 */
    public AnonymousClass0XW next() {
        Object[] A06 = this.A03.A03;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = A06[i];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AnonymousClass0XW) obj;
    }

    /* renamed from: A01 */
    public AnonymousClass0XW previous() {
        Object[] A06 = this.A03.A03;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = A06[i];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AnonymousClass0XW) obj;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public boolean hasPrevious() {
        if (this.A00 > this.A02) {
            return true;
        }
        return false;
    }

    public int nextIndex() {
        return this.A00 - this.A02;
    }

    public int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass000.A12();
    }

    public C06930a5(C06850Zx r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
