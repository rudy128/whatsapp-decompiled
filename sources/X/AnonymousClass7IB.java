package X;

import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import com.whatsapp.graphql.GraphqlRequest$postAwaitResult$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7IB  reason: invalid class name */
public final class AnonymousClass7IB implements AnonymousClass8AB {
    public static final AnonymousClass6WV A08 = new AnonymousClass6WV();
    public static final AtomicInteger A09 = new AtomicInteger();
    public final int A00 = A09.getAndIncrement();
    public final long A01;
    public final AnonymousClass11P A02;
    public final C34991lS A03;
    public final C35021lW A04;
    public final AnonymousClass6WV A05;
    public final AnonymousClass87E A06;
    public final AnonymousClass19T A07;

    public void CBv(C1606989o r17) {
        C20657ATp aTp;
        C1606989o r5 = r17;
        C18070vi.A0d(r5, 0);
        AnonymousClass19T r8 = this.A07;
        int i = this.A00;
        C35021lW r2 = this.A04;
        r8.Bj4("fb_user_type", r2.A00, 386138113, i, false);
        long j = this.A01;
        if (j != 0) {
            r8.markerAnnotate(386138113, i, "doc_id", j);
        }
        AnonymousClass87E r1 = this.A06;
        if ((r1 instanceof C20657ATp) && (aTp = (C20657ATp) r1) != null) {
            r8.markerAnnotate(386138113, i, "bloks_app_id", aTp.A00);
        }
        if (r2.A01) {
            C34991lS r82 = this.A03;
            AnonymousClass732 A002 = r82.A00(r2);
            if (A002 != null) {
                AnonymousClass11P r12 = this.A02;
                if (!AnonymousClass6WW.A00(r12, A002, r2)) {
                    Long l = A002.A07;
                    if (l == null || AnonymousClass11P.A00(r12) <= A002.A00 + l.longValue()) {
                        A00(A002, this, r5);
                        return;
                    } else {
                        r82.A02(A002, new AnonymousClass7GT(this, r5, 3), (AnonymousClass705) null);
                        return;
                    }
                }
            }
            r82.A03(new AnonymousClass7GT(this, r5, 1), r2);
            return;
        }
        AnonymousClass732 A003 = this.A03.A00(r2);
        if (A003 != null) {
            AnonymousClass11P r13 = this.A02;
            Long l2 = A003.A07;
            if (l2 == null || AnonymousClass11P.A00(r13) <= A003.A00 + l2.longValue()) {
                A00(A003, this, r5);
                return;
            }
        }
        A01(this, r5);
        throw null;
    }

    public /* synthetic */ Object CBx(C30391dr r3, C18560wh r4) {
        return C30451dy.A00(r3, r4, new GraphqlRequest$postAwait$2(this, (C30391dr) null));
    }

    public /* synthetic */ Object CBy(C30391dr r3, C18560wh r4) {
        return C30451dy.A00(r3, r4, new GraphqlRequest$postAwaitResult$2(this, (C30391dr) null));
    }

    public static final void A00(AnonymousClass732 r10, AnonymousClass7IB r11, C1606989o r12) {
        AnonymousClass8AB BGW = r11.A06.BGW(C108985cd.A0m(r10.A02));
        if (r11.A01 == 0) {
            r11.A07.markerAnnotate(386138113, r11.A00, "doc_id", BGW.BQn());
        }
        BGW.CBv(new AnonymousClass7I1(r11, r10, r12, 1));
    }

    public static final void A01(AnonymousClass7IB r7, C1606989o r8) {
        C34991lS r1 = r7.A03;
        C35021lW r6 = r7.A04;
        AnonymousClass7GT r3 = new AnonymousClass7GT(r7, r8, 2);
        C35071lb A002 = ((C131566lJ) r1.A01.get()).A00(r6);
        new AnonymousClass7GZ(r3, r6, r1.A02, r1.A00);
        new AnonymousClass705(3, C20113A7w.A0L);
        A002.CBZ();
        throw null;
    }

    public static final void A02(AnonymousClass7IB r5, C138506xC r6, String str) {
        ArrayList arrayList;
        Collection<C1404571m> values;
        if (r6.A00 != 0) {
            Map map = r6.A04.A00;
            if (map == null || (values = map.values()) == null) {
                arrayList = null;
            } else {
                arrayList = C29351c6.A0D(values);
                for (C1404571m r1 : values) {
                    C18070vi.A0b(r1);
                    arrayList.add(new C122816Sa(r1));
                }
            }
            A03(r5, AnonymousClass000.A0y(".logResponse.2", AnonymousClass000.A11(str)), arrayList, true);
        } else if (r6.A03.A00 == null) {
            A03(r5, AnonymousClass000.A0y(".logResponse.1", AnonymousClass000.A11(str)), C18070vi.A0M(AnonymousClass000.A0n("Data received in response is null")), true);
        } else {
            r5.A07.markerEnd(386138113, r5.A00, 2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass7IB r7, java.lang.String r8, java.util.List r9, boolean r10) {
        /*
            X.19T r4 = r7.A07
            int r5 = r7.A00
            java.lang.String r7 = ""
            if (r9 == 0) goto L_0x002d
            java.util.ArrayList r2 = X.C29351c6.A0E(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L_0x0028
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getSimpleName()
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r0 = r7
        L_0x0029:
            r2.add(r0)
            goto L_0x0010
        L_0x002d:
            X.0wS r2 = X.C18460wS.A00
        L_0x002f:
            java.lang.String[] r1 = X.C108955ca.A1b(r2)
            r3 = 386138113(0x17040001, float:4.2651505E-25)
            java.lang.String r0 = "exception"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String[]) r1)
            if (r9 == 0) goto L_0x006b
            java.util.ArrayList r6 = X.C29351c6.A0E(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r2.next()
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.C122816Sa
            if (r0 == 0) goto L_0x0061
            X.6Sa r1 = (X.C122816Sa) r1
            X.71m r0 = r1.error
            java.lang.String r0 = r0.toString()
        L_0x005d:
            r6.add(r0)
            goto L_0x0045
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L_0x005d
        L_0x0069:
            r0 = r7
            goto L_0x005d
        L_0x006b:
            X.0wS r6 = X.C18460wS.A00
        L_0x006d:
            java.lang.String[] r1 = X.C108955ca.A1b(r6)
            java.lang.String r0 = "exception_message"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String[]) r1)
            java.lang.String r0 = "fail_location"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String) r8)
            r0 = 3
            if (r10 == 0) goto L_0x0080
            r0 = 87
        L_0x0080:
            r4.markerEnd(r3, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IB.A03(X.7IB, java.lang.String, java.util.List, boolean):void");
    }

    public AnonymousClass7IB(AnonymousClass11P r2, C34991lS r3, C35021lW r4, AnonymousClass6WV r5, AnonymousClass87E r6, AnonymousClass19T r7, long j) {
        C18070vi.A0s(r2, r3, r7, r4);
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = j;
        this.A06 = r6;
    }

    public long BQn() {
        return this.A01;
    }
}
