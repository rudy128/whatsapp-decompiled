package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4VY  reason: invalid class name */
public abstract class AnonymousClass4VY {
    public final C86104Qe A00;
    public final AnonymousClass1M9 A01;

    public final AnonymousClass5X0 A01(Collection collection) {
        AnonymousClass5X0 r0;
        if (A07()) {
            r0 = new C93464j1(A04(collection, false), (AnonymousClass4DG) null, (C27881Xz) null, 0, 2131231623, 0, 0, 0, false, true);
        } else {
            r0 = C93454j0.A00;
        }
        return r0;
    }

    public AnonymousClass4ZN A03(Collection collection, boolean z) {
        if (collection.isEmpty() && z) {
            return AnonymousClass3MX.A0t(2131895618);
        }
        if (collection.isEmpty() || A08(collection)) {
            return A05(z);
        }
        int size = collection.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, collection.size(), 0);
        return C1402670q.A01(A1a, 2131755253, size);
    }

    public final AnonymousClass4ZN A04(Collection collection, boolean z) {
        if (A07()) {
            int i = 2131899579;
            if (z) {
                i = 2131899577;
            }
            return AnonymousClass3MX.A0t(i);
        } else if (collection.isEmpty() || A08(collection)) {
            if (this instanceof C75953mC) {
                return C72453Mb.A0q(2131887636);
            }
            if (this instanceof C75933mA) {
                return C72453Mb.A0q(2131887636);
            }
            C18100vl r0 = ((C75943mB) this).A04;
            int A0D = C72463Mc.A0D(r0);
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, C72463Mc.A0D(r0));
            return C1402670q.A01(A1a, 2131755039, A0D);
        } else {
            int size = collection.size();
            Object[] A1a2 = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a2, collection.size(), 0);
            return C1402670q.A01(A1a2, 2131755039, size);
        }
    }

    public AnonymousClass4ZN A05(boolean z) {
        if (this instanceof C75953mC) {
            C75953mC r0 = (C75953mC) this;
            int A09 = r0.A03.A09(r0.A05);
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, A09, 0);
            return C1402670q.A01(A1a, 2131755200, A09);
        } else if (this instanceof C75933mA) {
            C75933mA r02 = (C75933mA) this;
            if (z) {
                Object[] A1b = AnonymousClass3MW.A1b();
                C18000vb r3 = r02.A01;
                C178119Bw r2 = r02.A03;
                A1b[0] = C64052u8.A04(r3, C17890vO.A03(r2.A08));
                C17880vN.A1T(A1b, r2.A05(), 1);
                return C1402670q.A02(A1b, 2131887791);
            }
            AnonymousClass1MW r1 = r02.A02;
            GroupJid groupJid = r02.A03.A0C;
            if (groupJid != null) {
                int A092 = r1.A09(groupJid);
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, A092, 0);
                return C1402670q.A01(objArr, 2131755200, A092);
            }
            throw C17890vO.A0K();
        } else {
            C75943mB r03 = (C75943mB) this;
            if (z) {
                Object[] A1b2 = AnonymousClass3MW.A1b();
                C18000vb r32 = r03.A02;
                C178119Bw r22 = r03.A03;
                A1b2[0] = C64052u8.A04(r32, C17890vO.A03(r22.A08));
                C17880vN.A1T(A1b2, r22.A05(), 1);
                return C1402670q.A02(A1b2, 2131887791);
            }
            C178119Bw r33 = r03.A03;
            Object[] objArr2 = new Object[1];
            C17880vN.A1T(objArr2, r33.A0B().size() - 1, 0);
            return C1402670q.A01(objArr2, 2131755038, r33.A0B().size() - 1);
        }
    }

    public List A06() {
        if (this instanceof C75953mC) {
            C75953mC r2 = (C75953mC) this;
            if (r2.A07) {
                return C18070vi.A0M(r2.A01.A0H(r2.A05));
            }
        } else if (!(this instanceof C75933mA)) {
            return AnonymousClass3MW.A11(((C75943mB) this).A04);
        } else {
            C75933mA r22 = (C75933mA) this;
            GroupJid groupJid = r22.A03.A0C;
            if (groupJid != null) {
                return C18070vi.A0M(r22.A01.A0H(groupJid));
            }
        }
        return C18460wS.A00;
    }

    public boolean A07() {
        if (this instanceof C75953mC) {
            return ((C75953mC) this).A08;
        }
        if (this instanceof C75933mA) {
            return false;
        }
        return true;
    }

    public boolean A08(Collection collection) {
        boolean z;
        int size;
        AnonymousClass1MW r2;
        GroupJid groupJid;
        if (this instanceof C75953mC) {
            C75953mC r1 = (C75953mC) this;
            z = true;
            size = collection.size() + 1;
            r2 = r1.A03;
            groupJid = r1.A05;
        } else if (this instanceof C75933mA) {
            C75933mA r12 = (C75933mA) this;
            z = true;
            size = collection.size() + 1;
            r2 = r12.A02;
            groupJid = r12.A03.A0C;
            if (groupJid == null) {
                throw C17890vO.A0K();
            }
        } else if (collection.size() + 1 != ((C75943mB) this).A03.A0B().size()) {
            return false;
        } else {
            return true;
        }
        if (size != r2.A09(groupJid)) {
            return false;
        }
        return z;
    }

    public AnonymousClass4VY(C86104Qe r1, AnonymousClass1M9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.4DG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.4DG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.1Xz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.4DG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C93464j1 A00(java.util.Collection r12) {
        /*
            r11 = this;
            boolean r0 = r11.A07()
            r10 = 1
            if (r0 == 0) goto L_0x001b
            X.4ZN r1 = r11.A04(r12, r10)
            r2 = 0
            r5 = 2131231646(0x7f08039e, float:1.8079379E38)
            r4 = 0
        L_0x0010:
            X.4j1 r0 = new X.4j1
            r7 = r4
            r8 = r4
            r9 = r4
            r3 = r2
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x001b:
            r1 = r11
            boolean r0 = r11 instanceof X.C75953mC
            if (r0 == 0) goto L_0x0037
            X.3mC r1 = (X.C75953mC) r1
            X.4Cl r1 = r1.A02
        L_0x0024:
            X.4Cl r0 = X.AnonymousClass4Cl.Video
            r5 = 2131231646(0x7f08039e, float:1.8079379E38)
            if (r1 == r0) goto L_0x002f
            r5 = 2131231623(0x7f080387, float:1.8079332E38)
            r10 = 0
        L_0x002f:
            X.4ZN r1 = r11.A04(r12, r10)
            r2 = 0
            r4 = 0
            r10 = 1
            goto L_0x0010
        L_0x0037:
            boolean r0 = r11 instanceof X.C75933mA
            if (r0 == 0) goto L_0x0040
            X.3mA r1 = (X.C75933mA) r1
            X.4Cl r1 = r1.A00
            goto L_0x0024
        L_0x0040:
            X.3mB r1 = (X.C75943mB) r1
            X.4Cl r1 = r1.A01
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VY.A00(java.util.Collection):X.4j1");
    }

    public final AnonymousClass4ZN A02(Collection collection) {
        C86104Qe r7;
        GroupJid groupJid;
        AnonymousClass4Cl r5;
        int i;
        String A0q;
        AnonymousClass4ZN A002;
        if (!collection.isEmpty() && !A08(collection) && (A002 = this.A00.A00(collection)) != null) {
            return A002;
        }
        if (this instanceof C75953mC) {
            C75953mC r2 = (C75953mC) this;
            r7 = r2.A00;
            groupJid = r2.A05;
            r5 = r2.A02;
        } else if (this instanceof C75933mA) {
            C75933mA r22 = (C75933mA) this;
            r7 = r22.A00;
            groupJid = r22.A03.A0C;
            if (groupJid != null) {
                r5 = AnonymousClass4Cl.Both;
            } else {
                throw C17890vO.A0K();
            }
        } else {
            C75943mB r23 = (C75943mB) this;
            AnonymousClass4ZN A003 = r23.A00.A00((Collection) r23.A04.getValue());
            if (A003 == null) {
                return C72453Mb.A0q(2131887611);
            }
            return A003;
        }
        AnonymousClass1M9 r3 = r7.A00;
        C24921Me r24 = r7.A01;
        AnonymousClass1E7 A012 = C63982u1.A01(r3, r7.A02, groupJid, r7.A03, false);
        if (A012 != null && (A0q = AnonymousClass3MY.A0q(r24, A012)) != null) {
            return new AnonymousClass482(A0q);
        }
        if (r5 == AnonymousClass4Cl.Video) {
            i = 2131887780;
        } else {
            i = 2131890896;
            if (r5 == AnonymousClass4Cl.Audio) {
                i = 2131887781;
            }
        }
        return AnonymousClass3MX.A0t(i);
    }
}
