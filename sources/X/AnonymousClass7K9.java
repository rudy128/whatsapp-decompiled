package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7K9  reason: invalid class name */
public final class AnonymousClass7K9 implements C108105b8 {
    public boolean A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass74D A02;
    public final UpdatesViewModel A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final WeakReference A0F;
    public final AnonymousClass00H A0G;

    public void A05(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!C17880vN.A0U(this.A0A).A0L()) {
            A04(new C157037vh(this, collection));
            return;
        }
        A00(this).A03(collection);
        if (!this.A00) {
            this.A00 = true;
            C72453Mb.A1Q(this.A05, this);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C35681md) C18070vi.A0E(this.A0B)).A09(((C46162Dk) it.next()).A0M());
        }
        UpdatesViewModel.A0A(this);
    }

    public void A06(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!C17880vN.A0U(this.A0A).A0L()) {
            A04(new C157047vi(this, collection));
            return;
        }
        A00(this).A03(collection);
        if (!this.A00) {
            this.A00 = true;
            C72453Mb.A1Q(this.A05, this);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C35681md) C18070vi.A0E(this.A0B)).A0A(((C46162Dk) it.next()).A0M());
        }
        UpdatesViewModel.A0A(this);
    }

    public void Bkr(C29681ch r4, Integer num, Throwable th) {
        AnonymousClass1KB r1;
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            r1 = (AnonymousClass1KB) C18070vi.A0E(this.A09);
            i = 2131892365;
        } else if (intValue == 1) {
            r1 = (AnonymousClass1KB) C18070vi.A0E(this.A09);
            i = 2131897327;
        } else if (intValue == 3) {
            A02(r4);
            return;
        } else {
            return;
        }
        r1.A09(i, 0);
        A01(r4);
    }

    public void Bkv(C29681ch r3, Integer num) {
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            A01(r3);
        } else if (intValue == 3) {
            A02(r3);
        }
    }

    public AnonymousClass7K9(AnonymousClass1FY r16, AnonymousClass11P r17, AnonymousClass74D r18, UpdatesViewModel updatesViewModel, AnonymousClass10I r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31) {
        AnonymousClass00H r10 = r21;
        AnonymousClass74D r12 = r18;
        AnonymousClass11P r13 = r17;
        C18070vi.A0p(r13, r10, r12);
        AnonymousClass00H r9 = r22;
        C18070vi.A0d(r9, 5);
        AnonymousClass00H r5 = r26;
        AnonymousClass00H r6 = r25;
        AnonymousClass00H r7 = r24;
        AnonymousClass00H r8 = r23;
        AnonymousClass10I r11 = r20;
        C18070vi.A0x(r11, r8, r7, r6, r5);
        AnonymousClass00H r1 = r30;
        AnonymousClass00H r0 = r31;
        AnonymousClass00H r2 = r29;
        AnonymousClass00H r3 = r28;
        AnonymousClass00H r4 = r27;
        C18070vi.A0y(r4, r3, r2, r1, r0);
        this.A03 = updatesViewModel;
        this.A01 = r13;
        this.A09 = r10;
        this.A02 = r12;
        this.A0D = r9;
        this.A04 = r11;
        this.A08 = r8;
        this.A0G = r7;
        this.A0B = r6;
        this.A0E = r5;
        this.A05 = r4;
        this.A07 = r3;
        this.A0C = r2;
        this.A06 = r1;
        this.A0A = r0;
        this.A0F = AnonymousClass3MW.A0z(r16);
    }

    public static final AnonymousClass70D A00(AnonymousClass7K9 r0) {
        return (AnonymousClass70D) C18070vi.A0E(r0.A0G);
    }

    public static final void A03(AnonymousClass7K9 r8, Collection collection) {
        if (!C17880vN.A0U(r8.A0A).A0L()) {
            r8.A04(new C157057vj(r8, collection));
            return;
        }
        AnonymousClass1FU A0Z = C108945cZ.A0Z(r8.A0F);
        if (A0Z != null) {
            AnonymousClass70D A002 = A00(r8);
            C18070vi.A0d(collection, 0);
            synchronized (A002.A07) {
                ArrayList A0D2 = C29351c6.A0D(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    A0D2.add(((C46162Dk) it.next()).A08());
                }
                A002.A0C.addAll(A0D2);
            }
            if (!r8.A00) {
                r8.A00 = true;
                C72453Mb.A1Q(r8.A05, r8);
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C46162Dk r6 = (C46162Dk) it2.next();
                UpdatesViewModel updatesViewModel = r8.A03;
                C18070vi.A0d(r6, 0);
                if (AnonymousClass3MW.A11(updatesViewModel.A0q).contains(r6.A08())) {
                    updatesViewModel.A0V(r6, AnonymousClass00R.A0N, (C18090vk) null);
                } else {
                    ((C132876nm) updatesViewModel.A0t.getValue()).A00(r6, AnonymousClass00R.A0N, (Long) null, new C1586781p(updatesViewModel));
                }
            }
            A0Z.CNA(2131891797);
            UpdatesViewModel.A0A(r8);
        }
    }

    private final void A04(C18090vk r6) {
        AnonymousClass1FB r4 = (AnonymousClass1FB) this.A0F.get();
        if (r4 != null) {
            C73203Rj A002 = AnonymousClass4a6.A00(r4);
            A002.A0E(2131892932);
            A002.A0D(2131888732);
            A002.A0g(r4, new AnonymousClass7AP(r6, 23), 2131897145);
            AnonymousClass7AL.A00(r4, A002, 7, 2131889490);
            AnonymousClass3MY.A1G(A002);
        }
    }

    private final void A01(AnonymousClass1BI r3) {
        boolean A1U;
        boolean A1U2;
        boolean A1U3;
        AnonymousClass70D A002 = A00(this);
        synchronized (A002.A06) {
            A002.A0B.remove(r3);
        }
        AnonymousClass70D A003 = A00(this);
        synchronized (A003.A06) {
            A1U = C108945cZ.A1U(A003.A0B);
        }
        if (!A1U) {
            A00(this).A00 = false;
        }
        UpdatesViewModel.A0E(this.A03);
        if (this.A00) {
            AnonymousClass70D A004 = A00(this);
            synchronized (A004.A07) {
                A1U2 = C108945cZ.A1U(A004.A0C);
            }
            if (!A1U2) {
                AnonymousClass70D A005 = A00(this);
                synchronized (A005.A06) {
                    A1U3 = C108945cZ.A1U(A005.A0B);
                }
                if (!A1U3) {
                    this.A00 = false;
                    C108965cb.A1L(this.A05, this);
                }
            }
        }
    }

    private final void A02(AnonymousClass1BI r3) {
        boolean A1U;
        AnonymousClass70D A002 = A00(this);
        synchronized (A002.A07) {
            A002.A0C.remove(r3);
        }
        AnonymousClass70D A003 = A00(this);
        synchronized (A003.A07) {
            A1U = C108945cZ.A1U(A003.A0C);
        }
        if (!A1U) {
            AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A0F);
            if (A0Z != null) {
                A0Z.CEx();
            }
            A00(this).A00 = false;
            UpdatesViewModel.A0A(this);
        }
    }
}
