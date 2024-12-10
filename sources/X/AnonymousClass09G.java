package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.HashSet;

/* renamed from: X.09G  reason: invalid class name */
public final class AnonymousClass09G extends AnonymousClass0XW implements C17670v2, C17690v4, C17540up, AnonymousClass0t5, C17660v1, C17650v0, C17570us, C17580ut, C17640uz, C16460sI, C17600uv, C16490sL, C17620ux, C17550uq {
    public C17450ug A00;
    public AnonymousClass0AN A01;
    public HashSet A02;
    public C16910tQ A03;

    public void A0L() {
        A01(this, true);
    }

    public static final void A00(AnonymousClass09G r5) {
        if (r5.A07) {
            C17450ug r4 = r5.A00;
            if ((r5.A01 & 32) != 0) {
                if (r4 instanceof C17430ue) {
                    AnonymousClass0N0 modifierLocalManager = AnonymousClass0QV.A05(r5).getModifierLocalManager();
                    AnonymousClass0OJ BTf = ((C17430ue) r4).BTf();
                    modifierLocalManager.A03.A0F(AnonymousClass0QV.A03(r5));
                    modifierLocalManager.A04.A0F(BTf);
                    modifierLocalManager.A01();
                }
                if (r4 instanceof C17410uc) {
                    ((C17410uc) r4).Byh(AnonymousClass0O8.A00);
                }
            }
            if ((r5.A01 & 8) != 0) {
                AnonymousClass0QV.A05(r5).C51();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("unInitializeModifier called on unattached node");
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, X.0AN] */
    public static final void A01(AnonymousClass09G r5, boolean z) {
        if (r5.A07) {
            C17450ug r3 = r5.A00;
            if ((r5.A01 & 32) != 0) {
                if (r3 instanceof C17410uc) {
                    r5.A0I(new C08230el(r5));
                }
                if (r3 instanceof C17430ue) {
                    C17430ue r4 = (C17430ue) r3;
                    AnonymousClass0AN r1 = r5.A01;
                    if (r1 != null) {
                        AnonymousClass0OJ BTf = r4.BTf();
                        if (r1.A01(BTf)) {
                            r1.A00 = r4;
                            AnonymousClass0N0 modifierLocalManager = AnonymousClass0QV.A05(r5).getModifierLocalManager();
                            modifierLocalManager.A01.A0F(r5);
                            modifierLocalManager.A02.A0F(BTf);
                            modifierLocalManager.A01();
                        }
                    }
                    ? obj = new Object();
                    obj.A00 = r4;
                    r5.A01 = obj;
                    if (AnonymousClass0O8.A01(r5)) {
                        AnonymousClass0N0 modifierLocalManager2 = AnonymousClass0QV.A05(r5).getModifierLocalManager();
                        AnonymousClass0OJ BTf2 = r4.BTf();
                        modifierLocalManager2.A01.A0F(r5);
                        modifierLocalManager2.A02.A0F(BTf2);
                        modifierLocalManager2.A01();
                    }
                }
            }
            if ((r5.A01 & 4) != 0 && !z) {
                AnonymousClass0F2.A00(r5);
            }
            if ((r5.A01 & 2) != 0) {
                if (AnonymousClass0O8.A01(r5)) {
                    C01850Ad A0A = r5.A0A();
                    C18070vi.A0b(A0A);
                    ((AnonymousClass0BR) A0A).A1Q(r5);
                    A0A.A11();
                }
                if (!z) {
                    AnonymousClass0F2.A00(r5);
                    AnonymousClass0QV.A08(r5);
                }
            }
            if (r3 instanceof C17370uY) {
                AnonymousClass0XV A032 = AnonymousClass0QV.A03(r5);
                LazyListState lazyListState = ((AnonymousClass0XN) ((C17370uY) r3)).A00;
                C16680sp r0 = LazyListState.A0R;
                lazyListState.A04 = A032;
            }
            if ((r5.A01 & 128) != 0 && (r3 instanceof C17400ub) && AnonymousClass0O8.A01(r5)) {
                AnonymousClass0QV.A08(r5);
            }
            if ((r5.A01 & 256) != 0 && (r3 instanceof C17390ua) && AnonymousClass0O8.A01(r5)) {
                AnonymousClass0QV.A08(r5);
            }
            if ((r5.A01 & 8) != 0) {
                AnonymousClass0QV.A05(r5).C51();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("initializeModifier called on unattached node");
    }

    public final void A0N() {
        if (this.A07) {
            this.A02.clear();
            AnonymousClass0QV.A05(this).getSnapshotObserver().A08(this, new C08550fH(this), AnonymousClass0O8.A02);
        }
    }

    public void BCR(C16700sr r2) {
        throw AnonymousClass000.A0n("applyFocusProperties called on wrong node");
    }

    public void BCT(C16520sO r3) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C06370Yb BYw = ((C17420ud) r1).BYw();
        C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((C06370Yb) r3).A04(BYw);
    }

    public void BJM(C17480uj r3) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C17380uZ) r1).BJM(r3);
    }

    public Object BPr(AnonymousClass0OJ r10) {
        this.A02.add(r10);
        AnonymousClass0XW r1 = this.A03;
        if (r1.A07) {
            AnonymousClass0XW r6 = r1.A04;
            AnonymousClass0XV A032 = AnonymousClass0QV.A03(this);
            if (A032 != null) {
                while (true) {
                    if ((A032.A0S.A01.A00 & 32) != 0) {
                        while (r6 != null) {
                            if ((r6.A01 & 32) != 0) {
                                AnonymousClass0XW r7 = r6;
                                C06970a9 r4 = null;
                                do {
                                    if (r7 instanceof C17540up) {
                                        C02080Cq BXh = ((C17540up) r7).BXh();
                                        if (BXh.A01(r10)) {
                                            return BXh.A00(r10);
                                        }
                                    } else if ((r7.A01 & 32) != 0 && (r7 instanceof C014308l)) {
                                        int i = 0;
                                        for (AnonymousClass0XW r3 = ((C014308l) r7).A00; r3 != null; r3 = r3.A02) {
                                            if ((r3.A01 & 32) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r7 = r3;
                                                } else {
                                                    r4 = AnonymousClass001.A0z(r4);
                                                    r7 = AnonymousClass000.A0d(r4, r7);
                                                    r4.A0F(r3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r7 = AnonymousClass0QV.A00(r4);
                                    continue;
                                } while (r7 != null);
                            }
                            r6 = r6.A04;
                        }
                    }
                    A032 = A032.A0I();
                    if (A032 == null) {
                        break;
                    }
                    AnonymousClass0QR r0 = A032.A0S;
                    if (r0 != null) {
                        r6 = r0.A05;
                    } else {
                        r6 = null;
                    }
                }
            }
            return r10.A00().invoke();
        }
        throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
    }

    public C02080Cq BXh() {
        AnonymousClass0AN r0 = this.A01;
        if (r0 == null) {
            return AnonymousClass0AP.A00;
        }
        return r0;
    }

    public long BZL() {
        return C25293Ccv.A01(AnonymousClass0QV.A04(this, 128).A03);
    }

    public boolean Bdj() {
        C18070vi.A0z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return false;
    }

    public int BjB(C16860tL r3, C17740v9 r4, int i) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C17440uf) r1).BjB(r3, r4, i);
    }

    public int BjE(C16860tL r3, C17740v9 r4, int i) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C17440uf) r1).BjE(r3, r4, i);
    }

    public C16820tH Bja(C17500ul r3, C17530uo r4, long j) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C17440uf) r1).Bja(r3, r4, j);
    }

    public int Bjx(C16860tL r3, C17740v9 r4, int i) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C17440uf) r1).Bjx(r3, r4, i);
    }

    public int Bk0(C16860tL r3, C17740v9 r4, int i) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C17440uf) r1).Bk0(r3, r4, i);
    }

    public Object Bk2(Object obj) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return r1;
    }

    public void Bnm() {
        C18070vi.A0z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass000.A0s("getPointerInputFilter");
    }

    public void Buq(C16360s8 r2) {
        throw AnonymousClass000.A0n("onFocusEvent called on wrong node");
    }

    public void BvI(C16910tQ r3) {
        C17450ug r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((C17390ua) r1).BvJ();
    }

    public void C0v(AnonymousClass0Hm r3, AnonymousClass0CQ r4, long j) {
        C18070vi.A0z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass000.A0s("getPointerInputFilter");
    }

    public void C2y(long j) {
        C17450ug r1 = this.A00;
        if (r1 instanceof C17400ub) {
            ((C17400ub) r1).C2y(j);
        }
    }

    public boolean CLc() {
        C18070vi.A0z(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass000.A0s("getPointerInputFilter");
    }

    public String toString() {
        return this.A00.toString();
    }

    public void A0M() {
        A00(this);
    }

    public /* synthetic */ boolean BZA() {
        return false;
    }

    public /* synthetic */ boolean BZC() {
        return false;
    }

    public boolean Bgy() {
        return this.A07;
    }

    public /* synthetic */ void BrG() {
        Bnm();
        throw null;
    }

    public void Bxi() {
        AnonymousClass0F0.A00(this);
    }

    public /* synthetic */ void CA7() {
        Bnm();
        throw null;
    }

    public C28644ECa getDensity() {
        return AnonymousClass0QV.A03(this).A0M();
    }

    public C24246By4 getLayoutDirection() {
        return AnonymousClass0QV.A03(this).A0N();
    }

    public void C0g(C16910tQ r1) {
        this.A03 = r1;
    }
}
