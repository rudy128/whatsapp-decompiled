package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5lN  reason: invalid class name and case insensitive filesystem */
public abstract class C112375lN extends C38391rD implements AnonymousClass87D {
    public AnonymousClass87C A00;
    public int A01;
    public C133816pX A02;
    public final C129036h9 A03;
    public final AnonymousClass11C A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final AnonymousClass736 A07;
    public final AnonymousClass87C A08 = new C144537Hr(this, 1);
    public final C18010vc A09;
    public final AnonymousClass10I A0A;
    public final boolean A0B;

    public synchronized int A0Q() {
        int i;
        C133816pX r0 = this.A02;
        i = 0;
        if (r0 != null) {
            int size = r0.A04.size();
            C133816pX r02 = this.A02;
            if (!(r02 == null || r02.A00 == null)) {
                i = 1;
            }
            i += size;
        }
        return i;
    }

    public final synchronized void A0U(C133816pX r2) {
        C133816pX r0 = this.A02;
        if (r0 != null) {
            r0.A03.remove(this);
        }
        this.A02 = r2;
        if (r2 != null) {
            r2.A00(this);
            this.A01 = r2.A04.size();
        }
        notifyDataSetChanged();
    }

    public synchronized void Bmc(C42011xT r9, int i) {
        C133816pX r5;
        boolean z;
        C18070vi.A0d(r9, 0);
        if (getItemViewType(i) == 0) {
            ViewGroup.LayoutParams layoutParams = r9.A0H.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            ((BM8) layoutParams).A01 = true;
        } else if ((r9 instanceof AnonymousClass66Q) && (r5 = this.A02) != null) {
            if (A0V()) {
                i--;
            }
            AnonymousClass66Q r92 = (AnonymousClass66Q) r9;
            List list = r5.A04;
            AnonymousClass77J r0 = null;
            if (i < list.size()) {
                if (((double) (i + 1)) >= ((double) list.size()) * 0.75d && !r5.A02) {
                    if (!r5.A01) {
                        String str = r5.A00;
                        if (r5 instanceof AnonymousClass66W) {
                            AnonymousClass66W r1 = (AnonymousClass66W) r5;
                            if (r1.A00 != 0) {
                                if (str != null) {
                                    r1.A03(str);
                                }
                            } else if (str != null) {
                                r1.A02(str);
                            }
                        } else {
                            AnonymousClass66V r12 = (AnonymousClass66V) r5;
                            if (r12.A00 != 0) {
                                if (str != null) {
                                    r12.A03(str);
                                }
                            } else if (str != null) {
                                r12.A02(str);
                            }
                        }
                        z = false;
                        r5.A02 = z;
                    }
                    z = true;
                    r5.A02 = z;
                }
                r0 = (AnonymousClass77J) list.get(i);
            }
            r92.A01 = r0;
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass3Z9(new C151387mD(this), AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625445));
        }
        C18030ve r5 = this.A05;
        AnonymousClass736 r7 = this.A07;
        AnonymousClass18K r6 = this.A06;
        return new AnonymousClass66Q(viewGroup2, this.A04, r5, r6, r7, this.A08, this.A09);
    }

    public void A0L(C42011xT r2) {
        C42061xY r22;
        if ((r2 instanceof AnonymousClass66Q) && (r22 = (C42061xY) r2) != null) {
            r22.A0C();
        }
    }

    public void A0N(C42011xT r2) {
        C42061xY r22;
        if ((r2 instanceof AnonymousClass66Q) && (r22 = (C42061xY) r2) != null) {
            r22.A0B();
        }
    }

    public final boolean A0V() {
        if (!this.A0B) {
            return false;
        }
        C129036h9 r3 = this.A03;
        C18030ve r1 = r3.A02;
        C18070vi.A0d(r1, 0);
        if (!C25291Nq.A04(r1, 9452)) {
            return false;
        }
        C19830z4 r6 = r3.A00;
        if (!C72463Mc.A1Y(Boolean.valueOf(C17890vO.A0B(r6).getBoolean("has_sent_gif", false)))) {
            return false;
        }
        if (r6.A0W("pref_gif_tap_to_send_notice_seen_timestamp") <= 0 || r6.A0W("pref_gif_tap_to_send_notice_seen_timestamp") + 604800000 >= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void C3w(C133816pX r5) {
        if (C18070vi.A18(r5, this.A02)) {
            int i = this.A01;
            List list = r5.A04;
            if (i >= list.size()) {
                notifyDataSetChanged();
            } else {
                A0J(this.A01, list.size() - this.A01);
            }
            this.A01 = list.size();
        }
    }

    public int getItemViewType(int i) {
        if (i != 0 || !A0V()) {
            return 1;
        }
        return 0;
    }

    public C112375lN(AnonymousClass11C r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass736 r6, AnonymousClass87C r7, C129036h9 r8, C18010vc r9, AnonymousClass10I r10, boolean z) {
        C18070vi.A0j(r10, r4);
        this.A0A = r10;
        this.A05 = r4;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A00 = r7;
        this.A03 = r8;
        this.A09 = r9;
        this.A0B = z;
        if (z) {
            r10.CGF(C146747Ql.A00(this, 48));
        }
    }
}
