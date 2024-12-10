package X;

import java.util.Iterator;

/* renamed from: X.7FP  reason: invalid class name */
public class AnonymousClass7FP implements AnonymousClass3MJ {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C56192h3 A05;
    public final /* synthetic */ C131926lt A06;
    public final /* synthetic */ C55592g3 A07;

    public boolean CMS() {
        return false;
    }

    public AnonymousClass7FP(C56192h3 r1, C131926lt r2, C55592g3 r3, int i, int i2) {
        this.A07 = r3;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r1;
        this.A06 = r2;
    }

    public void Buc() {
        C25991Qk r1 = this.A07.A02;
        C56192h3 r0 = this.A05;
        r1.A05(r0);
        AnonymousClass1BI r6 = r0.A07;
        C131926lt r5 = this.A06;
        C1406372h r7 = r5.A01;
        C25321Nt r2 = r7.A03;
        D3j A002 = C25321Nt.A00(r2, r6);
        C17880vN.A1B(C19830z4.A00(r7.A01).remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt"), "storage_usage_deletion_all_msg_cnt");
        AnonymousClass6O0 r3 = r7.A00;
        D3j A003 = C25321Nt.A00(r2, r6);
        C18070vi.A0d(r6, 1);
        r3.A0J(new AnonymousClass7PZ(A003, r6, r6.getRawString()));
        Iterator it = r7.A07.iterator();
        while (it.hasNext()) {
            ((C1606589k) it.next()).Br6(A002, r6);
        }
        r5.A00.Buc();
    }

    public void C21(int i) {
        int i2 = this.A02;
        if (i2 == -1) {
            i2 = Math.max(this.A03 / 100, 1);
            this.A02 = i2;
        }
        int i3 = this.A04 + i;
        this.A00 = i3;
        if (i3 - this.A01 > i2) {
            this.A06.A00(this.A05.A07, i3, this.A03);
            this.A01 = this.A00;
        }
    }

    public void C6A() {
        this.A00 = this.A04;
    }
}
