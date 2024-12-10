package X;

import android.provider.ContactsContract;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6MM  reason: invalid class name */
public class AnonymousClass6MM extends A34 {
    public final AnonymousClass1LA A00;
    public final C33251iW A01;
    public final AnonymousClass11P A02;
    public final C18000vb A03;
    public final AnonymousClass1BI A04;
    public final AnonymousClass1EC A05;
    public final AnonymousClass205 A06;
    public final AnonymousClass1W6 A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final boolean A0B;

    public AnonymousClass6MM(AnonymousClass1LA r2, C33251iW r3, AnonymousClass11P r4, C18000vb r5, AnonymousClass1BI r6, AnonymousClass1EC r7, AnonymousClass205 r8, AnonymousClass1W6 r9, ViewSharedContactArrayActivity viewSharedContactArrayActivity, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A07 = r9;
        this.A08 = AnonymousClass3MW.A0z(viewSharedContactArrayActivity);
        this.A04 = r6;
        this.A09 = arrayList;
        this.A0A = arrayList2;
        this.A0B = z;
        this.A06 = r8;
        this.A05 = r7;
    }

    public void A0F() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A08);
        if (A0Z != null) {
            C108965cb.A17(A0Z);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Boolean bool = (Boolean) obj;
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A08);
        if (A0Z != null) {
            A0Z.CEx();
            if (bool.booleanValue()) {
                C72453Mb.A14(A0Z);
            } else {
                A0Z.BhQ(2131892360);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList arrayList;
        AnonymousClass206 r10;
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        while (true) {
            arrayList = this.A09;
            r10 = null;
            if (i >= arrayList.size()) {
                break;
            }
            AnonymousClass73C r6 = (AnonymousClass73C) arrayList.get(i);
            SparseArray sparseArray = (SparseArray) this.A0A.get(i);
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                AnonymousClass6UK r8 = (AnonymousClass6UK) sparseArray.get(i2);
                if (!r8.A01) {
                    C17900vP.A0j("unchecked:", AnonymousClass000.A10(), i2);
                    if (r8.A00 instanceof C136406tl) {
                        C136406tl r82 = (C136406tl) r8.A00;
                        List list = (List) r6.A08.get(r82.A01);
                        if (list != null) {
                            list.remove(r82);
                            if (list.isEmpty()) {
                                r6.A08.remove(r82.A01);
                            }
                        }
                    } else {
                        Object obj = r8.A00;
                        if (obj instanceof C130276jA) {
                            C130276jA r9 = (C130276jA) obj;
                            r6.A03.remove(r9);
                            if (r9.A01 == ContactsContract.CommonDataKinds.Email.class) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("email");
                                C17900vP.A0b(r8.A00, A10);
                            } else if (r9.A01 == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("postal");
                                C17900vP.A0b(r8.A00, A102);
                            }
                        } else if (obj instanceof C129926ib) {
                            r6.A06.remove(r8.A00);
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("phone:");
                            C17900vP.A0b(r8.A00, A103);
                        } else if (r8.A00 instanceof C128206fc) {
                            r6.A07.remove(r8.A00);
                            StringBuilder A104 = AnonymousClass000.A10();
                            A104.append("website:");
                            C17900vP.A0b(r8.A00, A104);
                        } else if (r8.A00 instanceof C128186fa) {
                            r6.A09.A01 = null;
                            StringBuilder A105 = AnonymousClass000.A10();
                            A105.append("lid:");
                            C17900vP.A0b(r8.A00, A105);
                        }
                    }
                }
            }
            try {
                A13.add(new C139136yH(this.A00, this.A03).A01(r6));
                i++;
            } catch (C33281iZ e) {
                Log.e((Throwable) e);
                return false;
            }
        }
        AnonymousClass205 r1 = this.A06;
        if (r1 != null) {
            r10 = C108945cZ.A0s(r1, this.A07);
        } else {
            AnonymousClass1EC r2 = this.A05;
            if (r2 != null) {
                r10 = C181589Rb.A00(r2, (String) null, (String) null, AnonymousClass11P.A01(this.A02));
            }
        }
        if (arrayList.size() > 1) {
            C33251iW r22 = this.A01;
            AnonymousClass1BI r0 = this.A04;
            r22.A0h(r10, Collections.singletonList(r0), A13, this.A0B);
        } else {
            C33251iW r92 = this.A01;
            AnonymousClass1BI r12 = this.A04;
            r92.A0g(r10, ((AnonymousClass73C) arrayList.get(0)).A02(), C108945cZ.A1H(A13, 0), Collections.singletonList(r12), this.A0B);
        }
        return true;
    }
}
