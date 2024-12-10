package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ARC implements AnonymousClass1WR, AnonymousClass1WS, C23971Ii {
    public final int A00;
    public final Object A01;

    public ARC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void ByH(AnonymousClass206 r7, int i) {
        if (this.A00 == 0) {
            C18070vi.A0d(r7, 0);
            if (r7 instanceof AnonymousClass21K) {
                AnonymousClass205 r2 = r7.A0v;
                AnonymousClass8Gd r1 = (AnonymousClass8Gd) this.A01;
                if (C18070vi.A18(r2, r1.A0B)) {
                    r1.A0Y((AW0) null, (AnonymousClass21K) r7, 1);
                    return;
                }
            }
            if (C20120A8f.A07(r7)) {
                AnonymousClass8Gd r3 = (AnonymousClass8Gd) this.A01;
                AnonymousClass205 r22 = r3.A0B;
                if (r22 instanceof AnonymousClass2M2) {
                    List A17 = ((AnonymousClass21L) r7).A17();
                    if (A17 == null) {
                        A17 = C18460wS.A00;
                    }
                    AnonymousClass206 r12 = (AnonymousClass206) A17.get(((AnonymousClass2M2) r22).A00);
                    if (C18070vi.A18(r12.A0v, r22)) {
                        r3.A0Y((AW0) null, (AnonymousClass21K) r12, 1);
                    }
                }
            }
        }
    }

    public void ByK(AnonymousClass206 r7, int i) {
        if (this.A00 != 0) {
            C18070vi.A0d(r7, 0);
            AnonymousClass8GV r3 = (AnonymousClass8GV) this.A01;
            AnonymousClass22H r2 = r3.A00;
            if (r2 != null && C18070vi.A18(r7.A0v.A01, r2.A0v.A01)) {
                r3.A0T(r2);
                return;
            }
            return;
        }
        C18070vi.A0d(r7, 0);
        if (r7 instanceof AnonymousClass21K) {
            AnonymousClass205 r22 = r7.A0v;
            AnonymousClass8Gd r1 = (AnonymousClass8Gd) this.A01;
            if (C18070vi.A18(r22, r1.A0B)) {
                r1.A0Y((AW0) null, (AnonymousClass21K) r7, 1);
                return;
            }
        }
        if (C20120A8f.A07(r7)) {
            AnonymousClass8Gd r32 = (AnonymousClass8Gd) this.A01;
            AnonymousClass205 r23 = r32.A0B;
            if (r23 instanceof AnonymousClass2M2) {
                List A17 = ((AnonymousClass21L) r7).A17();
                if (A17 == null) {
                    A17 = C18460wS.A00;
                }
                AnonymousClass206 r12 = (AnonymousClass206) A17.get(((AnonymousClass2M2) r23).A00);
                if (C18070vi.A18(r12.A0v, r23)) {
                    r32.A0Y((AW0) null, (AnonymousClass21K) r12, 1);
                }
            }
        }
    }

    public /* synthetic */ void ByN(AnonymousClass206 r5) {
        if (this.A00 != 0) {
            C18070vi.A0d(r5, 0);
            AnonymousClass8GV r3 = (AnonymousClass8GV) this.A01;
            AnonymousClass22H r2 = r3.A00;
            if (r2 != null && C18070vi.A18(r5.A0v.A01, r2.A0v.A01)) {
                r3.A0T(r2);
            }
        }
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r4) {
        AnonymousClass1BI r0;
        AnonymousClass22H r02;
        AnonymousClass205 r1;
        AnonymousClass205 r03;
        if (this.A00 != 0) {
            C18070vi.A0d(r4, 0);
            AnonymousClass8GV r2 = (AnonymousClass8GV) this.A01;
            AnonymousClass22H r04 = r2.A00;
            if (r04 == null || (r03 = r04.A0v) == null) {
                r0 = null;
            } else {
                r0 = r03.A00;
            }
            if (r4.equals(r0) && (r02 = r2.A00) != null && (r1 = r02.A0v) != null && C108945cZ.A0s(r1, r2.A04) != null) {
                C72463Mc.A1B(r2.A05);
            }
        }
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
        if (this.A00 != 0) {
            C18070vi.A0d(collection, 0);
            AnonymousClass8GV r5 = (AnonymousClass8GV) this.A01;
            AnonymousClass22H r4 = r5.A00;
            if (r4 != null) {
                for (Object next : collection) {
                    if (C18070vi.A18(((AnonymousClass206) next).A0v, r4.A0v)) {
                        if (next != null) {
                            C72463Mc.A1B(r5.A05);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }
}
