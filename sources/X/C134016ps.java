package X;

import java.util.List;

/* renamed from: X.6ps  reason: invalid class name and case insensitive filesystem */
public final class C134016ps {
    public long A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final boolean A00() {
        if (!this.A07.isEmpty() || !this.A02.isEmpty() || !this.A06.isEmpty() || !this.A04.isEmpty() || !this.A03.isEmpty() || !this.A05.isEmpty() || this.A00 != -1) {
            return false;
        }
        return true;
    }

    public C134016ps(String str, List list, List list2, List list3, List list4, List list5, List list6, long j) {
        this.A01 = str;
        this.A07 = list;
        this.A02 = list2;
        this.A06 = list3;
        this.A04 = list4;
        this.A03 = list5;
        this.A05 = list6;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("\"t0\":");
        A102.append(AnonymousClass6VU.A00(this.A07));
        A10.append(C17890vO.A0c(A102, ','));
        A10.append(10);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("\"t50\":");
        A103.append(AnonymousClass6VU.A00(this.A02));
        A10.append(C17890vO.A0c(A103, ','));
        A10.append(10);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("\"t100\":");
        C108985cd.A1L(AnonymousClass6VU.A00(this.A04), A104, A10);
        A10.append(10);
        return C18070vi.A0H(A10);
    }
}
