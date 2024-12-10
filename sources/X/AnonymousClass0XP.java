package X;

/* renamed from: X.0XP  reason: invalid class name */
public final class AnonymousClass0XP implements AnonymousClass0t7 {
    public final /* synthetic */ AnonymousClass0VQ A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass0XP(AnonymousClass0VQ r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public int BX9() {
        AnonymousClass0XV r0 = (AnonymousClass0XV) this.A00.A09.get(this.A01);
        if (r0 != null) {
            return C06970a9.A00(r0.A0F());
        }
        return 0;
    }

    public void CCJ(int i, long j) {
        AnonymousClass0VQ r4 = this.A00;
        AnonymousClass0XV r3 = (AnonymousClass0XV) r4.A09.get(this.A01);
        if (r3 != null && r3.A08 != null) {
            int A002 = C06970a9.A00(r3.A0F());
            if (i < 0 || i >= A002) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Index (");
                A10.append(i);
                A10.append(") is out of bound of [0, ");
                throw new IndexOutOfBoundsException(AnonymousClass001.A1L(A10, A002));
            } else if (!r3.A0Q.A0G.A08) {
                AnonymousClass0XV r2 = r4.A07;
                r2.A0C = true;
                AnonymousClass0O0.A00(r3).Bjd((AnonymousClass0XV) r3.A0F().A07().get(i), j);
                r2.A0C = false;
            } else {
                throw AnonymousClass000.A0k("Pre-measure called on node that is not placed");
            }
        }
    }

    public void dispose() {
        AnonymousClass0VQ r5 = this.A00;
        r5.A0E();
        Object remove = r5.A09.remove(this.A01);
        if (remove == null) {
            return;
        }
        if (r5.A02 > 0) {
            AnonymousClass0XV r4 = r5.A07;
            C06970a9 r3 = r4.A0R.A00;
            int indexOf = r3.A07().indexOf(remove);
            int A002 = C06970a9.A00(r3);
            int i = r5.A02;
            if (indexOf >= A002 - i) {
                r5.A03++;
                r5.A02 = i - 1;
                int A003 = (C06970a9.A00(r3) - r5.A02) - r5.A03;
                r4.A0C = true;
                r4.A0d(indexOf, A003, 1);
                r4.A0C = false;
                r5.A0F(A003);
                return;
            }
            throw AnonymousClass000.A0n("Item is not in pre-composed item range");
        }
        throw AnonymousClass000.A0n("No pre-composed items to dispose");
    }
}
