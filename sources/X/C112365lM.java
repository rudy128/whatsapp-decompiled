package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.5lM  reason: invalid class name and case insensitive filesystem */
public final class C112365lM extends C38391rD implements AnonymousClass1WR, AnonymousClass8AW, AnonymousClass1GC {
    public int A00 = -1;
    public AnonymousClass8AU A01;
    public C140066zt A02;
    public C136616u6 A03;
    public UpdatesFragment A04;
    public AnonymousClass6KO A05;
    public Integer A06;
    public WeakReference A07 = AnonymousClass3MW.A0z((Object) null);
    public WeakReference A08;
    public List A09;
    public boolean A0A;
    public C116725yW A0B;
    public final C131376kz A0C;
    public final C131386l0 A0D;
    public final AnonymousClass2Z6 A0E;
    public final AnonymousClass2Z7 A0F;
    public final AnonymousClass2ZB A0G;
    public final AnonymousClass2ZC A0H;
    public final AnonymousClass2ZD A0I;
    public final AnonymousClass2ZE A0J;
    public final C131406l2 A0K;
    public final AnonymousClass2ZF A0L;
    public final AnonymousClass2ZG A0M;
    public final AnonymousClass2ZH A0N;
    public final AnonymousClass2ZI A0O;
    public final C131426l5 A0P;
    public final C61152pD A0Q;
    public final AnonymousClass2ZJ A0R;
    public final AnonymousClass2ZK A0S;
    public final AnonymousClass2ZL A0T;
    public final WaFragment A0U;
    public final AnonymousClass1M9 A0V;
    public final UpdatesFragment A0W;
    public final UpdatesFragment A0X;
    public final UpdatesFragment A0Y;
    public final UpdatesFragment A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final AnonymousClass00H A0k;
    public final AnonymousClass00H A0l;
    public final C18100vl A0m = AnonymousClass1DF.A01(new C154267qr(this));
    public final C18100vl A0n;
    public final C18100vl A0o;
    public final C18100vl A0p = AnonymousClass1DF.A01(new C154287qt(this));
    public final C18100vl A0q;
    public final C18100vl A0r;
    public final C18100vl A0s;
    public final C18100vl A0t;
    public final C18100vl A0u = AnonymousClass1DF.A01(new C154327qx(this));
    public final AnonymousClass2Z8 A0v;
    public final AnonymousClass2ZA A0w;
    public final AnonymousClass1DC A0x;
    public final AnonymousClass00H A0y;
    public final AnonymousClass00H A0z;
    public final AnonymousClass00H A10;

    private final C140066zt A05(boolean z) {
        Context context;
        Object obj;
        C140066zt r2 = null;
        if (z || A0E(this) || A0A()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("UpdatesAdapter/creating tile spec hasNewsletters = ");
            C17900vP.A0r(A102, A0D(this));
            View A0O2 = C108945cZ.A0O(this.A07);
            if (A0O2 == null || (context = A0O2.getContext()) == null) {
                Log.i("UpdatesAdapter/calculateAndGetSpec RecyclerView is null");
                return null;
            }
            try {
                obj = AnonymousClass1L9.A00(context);
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            if (obj instanceof AnonymousClass1IU) {
                obj = null;
            }
            Context context2 = (Context) obj;
            if (context2 != null) {
                Integer num = this.A06;
                C18070vi.A0z(num, "null cannot be cast to non-null type kotlin.Int");
                int intValue = num.intValue();
                AnonymousClass00H r3 = this.A0j;
                r2 = ((C25988Cq2) this.A0z.get()).A02(context2, intValue, AnonymousClass000.A1T(A01(this, r3), 2), AnonymousClass000.A1T(A01(this, r3), 5));
                if (z) {
                    this.A02 = r2;
                    return r2;
                }
            }
        }
        return r2;
    }

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A07 = AnonymousClass3MW.A0z(recyclerView);
        ((C200710s) this.A0p.getValue()).execute(AnonymousClass7RC.A00(this, 33));
    }

    public void A0T(RecyclerView recyclerView) {
        C161008Az r1;
        C18070vi.A0d(recyclerView, 0);
        C108975cc.A18(this.A0o);
        if (AnonymousClass6UA.A00) {
            C108965cb.A1L(this.A0f, this);
            int size = A06(this).size();
            int i = 0;
            while (i < size) {
                if (AnonymousClass000.A1T(A01(this, this.A0j), 3)) {
                    C42011xT A0O2 = recyclerView.A0O(i);
                    if ((A0O2 instanceof C121436Jq) && A0O2 != null) {
                        A0O2.A09(true);
                        return;
                    }
                }
                C42011xT A0O3 = recyclerView.A0O(i);
                if (!(A0O3 instanceof C161008Az) || (r1 = (C161008Az) A0O3) == null) {
                    i++;
                } else {
                    r1.BIZ();
                    if (r1 instanceof AnonymousClass6KQ) {
                        C18100vl r12 = ((C126526cs) this.A0y.get()).A00;
                        if (r12.Bf6()) {
                            C108975cc.A18(r12);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: X.6KP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v69, resolved type: X.6K7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v70, resolved type: X.6KL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: X.6KJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: X.6K1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v73, resolved type: X.6Jq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: X.6Jo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v76, resolved type: X.6K9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v77, resolved type: X.6KD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v78, resolved type: X.6K4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v80, resolved type: X.6Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v81, resolved type: X.6Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v82, resolved type: X.6Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v84, resolved type: X.6KF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v85, resolved type: X.6KA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v88, resolved type: X.6KH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v90, resolved type: X.6KC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v91, resolved type: X.6KC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v92, resolved type: X.6Jz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v93, resolved type: X.6K8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v94, resolved type: X.6K6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v95, resolved type: X.6K9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v97, resolved type: X.6KE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v98, resolved type: X.6K2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v99, resolved type: X.6KI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v100, resolved type: X.6K5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v101, resolved type: X.6Jy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v102, resolved type: X.6KG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v103, resolved type: X.6Jl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v104, resolved type: X.6Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v105, resolved type: X.6K0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v106, resolved type: X.6K0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v108, resolved type: X.6Js} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v109, resolved type: X.6Jm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v110, resolved type: X.6KS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v111, resolved type: X.6KB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v112, resolved type: X.6Jy} */
    /* JADX WARNING: type inference failed for: r6v14, types: [X.6Jx, X.1xT] */
    /* JADX WARNING: type inference failed for: r6v20, types: [X.6Ji] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.C42011xT BqY(android.view.ViewGroup r26, int r27) {
        /*
            r25 = this;
            r1 = 0
            r3 = r26
            X.C18070vi.A0d(r3, r1)
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.UpdatesDataItem>"
            r4 = 0
            r2 = 1
            r0 = r25
            r6 = r27
            switch(r27) {
                case 0: goto L_0x078d;
                case 1: goto L_0x0733;
                case 2: goto L_0x06e8;
                case 3: goto L_0x0691;
                case 4: goto L_0x0681;
                case 5: goto L_0x061d;
                case 6: goto L_0x05fc;
                case 7: goto L_0x05c7;
                case 8: goto L_0x05af;
                case 9: goto L_0x055b;
                case 10: goto L_0x04e5;
                case 11: goto L_0x04c9;
                case 12: goto L_0x04a3;
                case 13: goto L_0x0011;
                case 14: goto L_0x0485;
                case 15: goto L_0x0485;
                case 16: goto L_0x0475;
                case 17: goto L_0x0437;
                case 18: goto L_0x0485;
                case 19: goto L_0x0427;
                case 20: goto L_0x0415;
                case 21: goto L_0x0415;
                case 22: goto L_0x0415;
                case 23: goto L_0x03fb;
                case 24: goto L_0x03fb;
                case 25: goto L_0x03eb;
                case 26: goto L_0x03ab;
                case 27: goto L_0x0393;
                case 28: goto L_0x0011;
                case 29: goto L_0x029b;
                case 30: goto L_0x0262;
                case 31: goto L_0x0238;
                case 32: goto L_0x01fa;
                case 33: goto L_0x01dc;
                case 34: goto L_0x01c9;
                case 35: goto L_0x019f;
                case 36: goto L_0x0121;
                case 37: goto L_0x00f9;
                case 38: goto L_0x05af;
                case 39: goto L_0x00e9;
                case 40: goto L_0x00d9;
                case 41: goto L_0x00c9;
                case 42: goto L_0x00ae;
                case 43: goto L_0x0093;
                case 44: goto L_0x007d;
                case 45: goto L_0x006d;
                case 46: goto L_0x0034;
                case 47: goto L_0x0021;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.00H r0 = r0.A0c
            X.C108955ca.A1S(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "View type not supported "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r6)
            throw r0
        L_0x0021:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131627277(0x7f0e0d0d, float:1.8881814E38)
            android.view.View r1 = A02(r0, r3)
            r0 = 2131166596(0x7f070584, float:1.7947442E38)
            X.6Jy r6 = new X.6Jy
            r6.<init>(r1, r0)
            goto L_0x07bf
        L_0x0034:
            X.00H r1 = r0.A0a
            X.0vd r4 = X.C17880vN.A0P(r1)
            r2 = 7724(0x1e2c, float:1.0824E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            r2 = 2131625153(0x7f0e04c1, float:1.8877506E38)
            if (r1 == 0) goto L_0x004a
            r2 = 2131625154(0x7f0e04c2, float:1.8877508E38)
        L_0x004a:
            X.2ZL r1 = r0.A0T
            android.view.View r7 = A02(r2, r3)
            com.whatsapp.updates.ui.UpdatesFragment r10 = r0.A0Z
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r1.A00
            X.10E r1 = r0.A00
            X.0ve r9 = X.AnonymousClass10E.A8r(r1)
            X.10G r0 = r1.A00
            X.1np r11 = X.AnonymousClass3MY.A0e(r0)
            X.11C r8 = X.AnonymousClass3Ma.A0a(r1)
            X.6KB r6 = new X.6KB
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x006d:
            X.2ZF r6 = r0.A0L
            boolean r2 = r0.A09()
            r4 = 2131624690(0x7f0e02f2, float:1.8876567E38)
            if (r2 == 0) goto L_0x012f
            r4 = 2131626135(0x7f0e0897, float:1.8879498E38)
            goto L_0x012f
        L_0x007d:
            java.util.List r1 = X.C42011xT.A0I
            r1 = 2131627081(0x7f0e0c49, float:1.8881416E38)
            android.view.View r3 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0Z
            X.6zt r0 = A04(r0)
            X.6KS r6 = new X.6KS
            r6.<init>(r3, r0, r1, r2)
            goto L_0x07bf
        L_0x0093:
            X.6l0 r6 = r0.A0D
            r1 = 2131627077(0x7f0e0c45, float:1.8881408E38)
            android.view.View r7 = A02(r1, r3)
            X.1pZ r8 = A03(r0)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0Z
            X.6zt r9 = A04(r0)
            r10 = r1
            r11 = r2
            X.6Jm r6 = r6.A00(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x00ae:
            X.6kz r6 = r0.A0C
            r1 = 2131627082(0x7f0e0c4a, float:1.8881418E38)
            android.view.View r7 = A02(r1, r3)
            X.1pZ r8 = A03(r0)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0Z
            X.6zt r9 = A04(r0)
            r10 = r1
            r11 = r2
            X.6Js r6 = r6.A00(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x00c9:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131627020(0x7f0e0c0c, float:1.8881293E38)
            android.view.View r0 = A02(r0, r3)
            X.6Jw r6 = new X.6Jw
            r6.<init>(r0)
            goto L_0x07bf
        L_0x00d9:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131627006(0x7f0e0bfe, float:1.8881264E38)
            android.view.View r0 = A02(r0, r3)
            X.6K0 r6 = new X.6K0
            r6.<init>(r0, r2)
            goto L_0x07bf
        L_0x00e9:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131627006(0x7f0e0bfe, float:1.8881264E38)
            android.view.View r0 = A02(r0, r3)
            X.6K0 r6 = new X.6K0
            r6.<init>(r0, r1)
            goto L_0x07bf
        L_0x00f9:
            X.6l5 r4 = r0.A0P
            boolean r2 = r0.A09()
            r1 = 2131624690(0x7f0e02f2, float:1.8876567E38)
            if (r2 == 0) goto L_0x0107
            r1 = 2131624691(0x7f0e02f3, float:1.8876569E38)
        L_0x0107:
            android.view.View r7 = A02(r1, r3)
            X.1pZ r8 = A03(r0)
            X.0vl r1 = r0.A0q
            boolean r10 = X.C72453Mb.A1a(r1)
            boolean r11 = r0.A09()
            r6 = r4
            r9 = r0
            X.6Jr r6 = r6.A00(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x0121:
            X.2ZF r6 = r0.A0L
            boolean r2 = r0.A09()
            r4 = 2131626137(0x7f0e0899, float:1.8879502E38)
            if (r2 == 0) goto L_0x012f
            r4 = 2131626138(0x7f0e089a, float:1.8879504E38)
        L_0x012f:
            android.view.View r7 = A02(r4, r3)
            X.1pZ r11 = A03(r0)
            X.0vl r2 = r0.A0q
            boolean r23 = X.C72453Mb.A1a(r2)
            com.whatsapp.updates.ui.UpdatesFragment r4 = r0.A0Z
            boolean r24 = r0.A09()
            java.util.List r2 = X.C42011xT.A0I
            X.10H r2 = r6.A00
            X.10E r3 = r2.A00
            X.10G r2 = r3.A00
            X.00S r6 = r2.A0z
            java.lang.Object r14 = r6.get()
            X.AQC r14 = (X.AQC) r14
            X.1VW r9 = X.AnonymousClass3MZ.A0e(r3)
            X.00S r6 = r2.A36
            X.00H r20 = X.C000200d.A00(r6)
            X.00S r6 = r2.A4y
            X.00H r21 = X.C000200d.A00(r6)
            X.00S r6 = r2.A0F
            X.00H r22 = X.C000200d.A00(r6)
            X.3Kk r8 = X.AnonymousClass3MZ.A0T(r2)
            X.11P r12 = X.AnonymousClass10E.A6O(r3)
            X.0vb r13 = X.AnonymousClass10E.A6Q(r3)
            X.00S r6 = r2.AI5
            java.lang.Object r15 = r6.get()
            X.6lS r15 = (X.C131656lS) r15
            X.1Me r10 = X.AnonymousClass3MZ.A0g(r3)
            X.00S r2 = r2.A4u
            java.lang.Object r2 = r2.get()
            X.6p3 r2 = (X.C133606p3) r2
            X.1DC r19 = X.AnonymousClass3MZ.A13(r3)
            X.6Jl r6 = new X.6Jl
            r16 = r2
            r17 = r4
            r18 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A09(r1)
            goto L_0x07bf
        L_0x019f:
            X.2ZK r2 = r0.A0S
            r1 = 2131625032(0x7f0e0448, float:1.887726E38)
            android.view.View r4 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r3 = r0.A0Z
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r2.A00
            X.10E r0 = r0.A00
            X.10G r2 = r0.A00
            X.00S r0 = r2.A20
            java.lang.Object r1 = r0.get()
            X.6ax r1 = (X.C125366ax) r1
            X.00S r0 = r2.A1D
            java.lang.Object r0 = r0.get()
            X.2L7 r0 = (X.AnonymousClass2L7) r0
            X.6KG r6 = new X.6KG
            r6.<init>(r4, r1, r0, r3)
            goto L_0x07bf
        L_0x01c9:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131627277(0x7f0e0d0d, float:1.8881814E38)
            android.view.View r1 = A02(r0, r3)
            r0 = 2131168775(0x7f070e07, float:1.7951861E38)
            X.6Jy r6 = new X.6Jy
            r6.<init>(r1, r0)
            goto L_0x07bf
        L_0x01dc:
            X.2ZJ r4 = r0.A0R
            r1 = 2131626682(0x7f0e0aba, float:1.8880607E38)
            android.view.View r2 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0W
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r4.A00
            X.10E r0 = r0.A00
            X.00S r0 = r0.A7C
            X.00H r0 = X.C000200d.A00(r0)
            X.6K5 r6 = new X.6K5
            r6.<init>(r2, r1, r0)
            goto L_0x07bf
        L_0x01fa:
            X.2pD r2 = r0.A0Q
            r1 = 2131626177(0x7f0e08c1, float:1.8879583E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r14 = r0.A0W
            X.1pZ r10 = A03(r0)
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r2.A00
            X.10E r2 = r0.A00
            X.10G r1 = r2.A00
            X.00S r0 = r1.A1X
            java.lang.Object r12 = r0.get()
            X.6lO r12 = (X.C131616lO) r12
            X.1c4 r11 = X.C108965cb.A0T(r2)
            X.00S r0 = r1.A3O
            java.lang.Object r13 = r0.get()
            X.4XM r13 = (X.AnonymousClass4XM) r13
            X.00S r0 = r1.A1w
            java.lang.Object r8 = r0.get()
            X.6l4 r8 = (X.AnonymousClass6l4) r8
            X.3Kk r9 = X.AnonymousClass3MZ.A0T(r1)
            X.6KI r6 = new X.6KI
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x07bf
        L_0x0238:
            X.00H r2 = r0.A0a
            java.lang.Object r0 = r2.get()
            X.0ve r0 = (X.C18030ve) r0
            boolean r1 = X.AnonymousClass1J8.A07(r0)
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131626683(0x7f0e0abb, float:1.888061E38)
            if (r1 == 0) goto L_0x024e
            r0 = 2131625863(0x7f0e0787, float:1.8878946E38)
        L_0x024e:
            android.view.View r1 = A02(r0, r3)
            java.lang.Object r0 = r2.get()
            X.0ve r0 = (X.C18030ve) r0
            X.C18070vi.A0X(r0)
            X.6K2 r6 = new X.6K2
            r6.<init>(r1, r0)
            goto L_0x07bf
        L_0x0262:
            X.00H r2 = r0.A0k
            java.lang.Object r4 = r2.get()
            X.6hV r4 = (X.C129256hV) r4
            X.1pZ r9 = A03(r0)
            com.whatsapp.updates.ui.UpdatesFragment r11 = r0.A0Z
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r3)
            r0 = 2131626136(0x7f0e0898, float:1.88795E38)
            android.view.View r7 = r2.inflate(r0, r3, r1)
            X.6az r1 = r4.A01
            X.C18070vi.A0b(r7)
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r1.A00
            X.10E r1 = r0.A00
            X.10G r0 = r1.A00
            X.00S r0 = r0.A0z
            java.lang.Object r10 = r0.get()
            X.AQC r10 = (X.AQC) r10
            X.1VW r8 = X.AnonymousClass3MZ.A0e(r1)
            X.6KE r6 = new X.6KE
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x029b:
            java.lang.ref.WeakReference r1 = r0.A08
            java.lang.Object r1 = r1.get()
            X.6KQ r1 = (X.AnonymousClass6KQ) r1
            if (r1 == 0) goto L_0x02a8
            r1.BIZ()
        L_0x02a8:
            r0.A01 = r4
            X.00H r1 = r0.A0k
            java.lang.Object r6 = r1.get()
            X.6hV r6 = (X.C129256hV) r6
            boolean r8 = r0.A0B()
            X.8AU r9 = r0.A01
            if (r9 != 0) goto L_0x030a
            java.lang.Object r4 = r1.get()
            X.6hV r4 = (X.C129256hV) r4
            X.6zt r13 = A04(r0)
            if (r13 != 0) goto L_0x02ca
            X.6zt r13 = r0.A05(r2)
        L_0x02ca:
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusTileSpec"
            X.C18070vi.A0z(r13, r1)
            boolean r1 = r0.A0B()
            if (r1 == 0) goto L_0x0384
            X.1pZ r12 = A03(r0)
            com.whatsapp.updates.ui.UpdatesFragment r14 = r0.A0Z
            r1 = 2
            X.C18070vi.A0d(r13, r1)
            X.6b1 r1 = r4.A03
            X.10H r1 = r1.A00
            X.10E r7 = r1.A00
            X.10G r4 = r7.A00
            X.00S r1 = r4.A1q
            java.lang.Object r10 = r1.get()
            X.6kz r10 = (X.C131376kz) r10
            X.00S r1 = r4.A1s
            java.lang.Object r11 = r1.get()
            X.6l0 r11 = (X.C131386l0) r11
            X.00S r1 = r7.A4b
            X.00H r16 = X.C000200d.A00(r1)
            X.10I r15 = X.AnonymousClass10E.AL1(r7)
            X.5lS r9 = new X.5lS
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x0306:
            X.8AU r9 = (X.AnonymousClass8AU) r9
            r0.A01 = r9
        L_0x030a:
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusGridAdapter"
            X.C18070vi.A0z(r9, r1)
            r4 = 0
            X.C18070vi.A0d(r9, r2)
            if (r8 == 0) goto L_0x0358
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r3)
            r0 = 2131627009(0x7f0e0c01, float:1.888127E38)
            android.view.View r7 = r1.inflate(r0, r3, r4)
            X.6b0 r1 = r6.A02
            X.C18070vi.A0b(r7)
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r1.A00
            X.10E r1 = r0.A00
            X.11P r8 = X.AnonymousClass10E.A6O(r1)
            X.00S r0 = r1.AAB
            X.00H r10 = X.C000200d.A00(r0)
            X.00S r0 = r1.A04
            X.00H r11 = X.C000200d.A00(r0)
            X.10G r0 = r1.A00
            X.00S r0 = r0.A1D
            X.00H r12 = X.C000200d.A00(r0)
            X.00S r0 = r1.ABz
            X.00H r13 = X.C000200d.A00(r0)
            X.00S r0 = r1.A4b
            X.00H r14 = X.C000200d.A00(r0)
            X.6KR r6 = new X.6KR
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0354:
            X.1xT r6 = (X.C42011xT) r6
            goto L_0x07bf
        L_0x0358:
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r3)
            r1 = 2131627010(0x7f0e0c02, float:1.8881272E38)
            android.view.View r3 = r2.inflate(r1, r3, r4)
            X.6ay r2 = r6.A00
            X.C18070vi.A0b(r3)
            java.util.List r1 = X.C42011xT.A0I
            X.10H r1 = r2.A00
            X.10E r1 = r1.A00
            X.10G r1 = r1.A00
            X.00S r1 = r1.A1D
            java.lang.Object r1 = r1.get()
            X.2L7 r1 = (X.AnonymousClass2L7) r1
            X.6KQ r6 = new X.6KQ
            r6.<init>(r3, r1, r9)
            java.lang.ref.WeakReference r1 = X.AnonymousClass3MW.A0z(r6)
            r0.A08 = r1
            goto L_0x0354
        L_0x0384:
            com.whatsapp.updates.ui.UpdatesFragment r7 = r0.A0Z
            com.whatsapp.base.WaFragment r4 = r0.A0U
            r1 = 2
            X.C18070vi.A0d(r13, r1)
            X.5nq r9 = new X.5nq
            r9.<init>(r4, r13, r7)
            goto L_0x0306
        L_0x0393:
            java.util.List r1 = X.C42011xT.A0I
            r1 = 2131625859(0x7f0e0783, float:1.8878938E38)
            android.view.View r3 = A02(r1, r3)
            r2 = 2131899251(0x7f123373, float:1.9433443E38)
            X.81e r1 = new X.81e
            r1.<init>(r0)
            X.6K9 r6 = new X.6K9
            r6.<init>(r3, r1, r2)
            goto L_0x07bf
        L_0x03ab:
            X.00H r1 = r0.A0a
            java.lang.Object r1 = r1.get()
            X.0ve r1 = (X.C18030ve) r1
            boolean r2 = X.AnonymousClass1J8.A07(r1)
            java.util.List r1 = X.C42011xT.A0I
            if (r2 == 0) goto L_0x03d3
            r1 = 2131625863(0x7f0e0787, float:1.8878946E38)
            android.view.View r2 = A02(r1, r3)
            X.00H r1 = r0.A0h
            X.1c4 r1 = X.C108955ca.A0W(r1)
            boolean r1 = r1.A0A()
            X.6K6 r6 = new X.6K6
            r6.<init>(r2, r0, r1)
            goto L_0x07bf
        L_0x03d3:
            r1 = 2131625862(0x7f0e0786, float:1.8878944E38)
            android.view.View r2 = A02(r1, r3)
            X.00H r1 = r0.A0h
            X.1c4 r1 = X.C108955ca.A0W(r1)
            boolean r1 = r1.A0A()
            X.6K8 r6 = new X.6K8
            r6.<init>(r2, r0, r1)
            goto L_0x07bf
        L_0x03eb:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131625116(0x7f0e049c, float:1.887743E38)
            android.view.View r0 = A02(r0, r3)
            X.6Jz r6 = new X.6Jz
            r6.<init>(r0)
            goto L_0x07bf
        L_0x03fb:
            java.util.List r1 = X.C42011xT.A0I
            r1 = 2131626779(0x7f0e0b1b, float:1.8880804E38)
            android.view.View r2 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0Y
            X.00H r0 = r0.A0e
            java.lang.Object r0 = r0.get()
            X.1np r0 = (X.C36401np) r0
            X.6KC r6 = new X.6KC
            r6.<init>(r2, r1, r0)
            goto L_0x07bf
        L_0x0415:
            java.util.List r1 = X.C42011xT.A0I
            r1 = 2131625114(0x7f0e049a, float:1.8877427E38)
            android.view.View r1 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0Y
            X.6KC r6 = new X.6KC
            r6.<init>(r1, r0, r4)
            goto L_0x07bf
        L_0x0427:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131625115(0x7f0e049b, float:1.8877429E38)
            android.view.View r0 = A02(r0, r3)
            X.6Jt r6 = new X.6Jt
            r6.<init>(r0)
            goto L_0x07bf
        L_0x0437:
            X.2ZD r2 = r0.A0I
            r1 = 2131626177(0x7f0e08c1, float:1.8879583E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r14 = r0.A0X
            X.1pZ r10 = A03(r0)
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r2.A00
            X.10E r2 = r0.A00
            X.10G r1 = r2.A00
            X.00S r0 = r1.A1X
            java.lang.Object r12 = r0.get()
            X.6lO r12 = (X.C131616lO) r12
            X.1c4 r11 = X.C108965cb.A0T(r2)
            X.00S r0 = r1.A3O
            java.lang.Object r13 = r0.get()
            X.4XM r13 = (X.AnonymousClass4XM) r13
            X.00S r0 = r1.A1t
            java.lang.Object r8 = r0.get()
            X.6l1 r8 = (X.C131396l1) r8
            X.3Kk r9 = X.AnonymousClass3MZ.A0T(r1)
            X.6KH r6 = new X.6KH
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x07bf
        L_0x0475:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131626833(0x7f0e0b51, float:1.8880913E38)
            android.view.View r0 = A02(r0, r3)
            X.6Jv r6 = new X.6Jv
            r6.<init>(r0)
            goto L_0x07bf
        L_0x0485:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131626832(0x7f0e0b50, float:1.8880911E38)
            android.view.View r0 = A02(r0, r3)
            X.6Ju r6 = new X.6Ju
            r6.<init>(r0)
            android.widget.TextView r2 = X.C108975cc.A0C(r0)
            float r0 = X.C108985cd.A01(r2)
            r2.setTextSize(r1, r0)
            X.C43421zm.A04(r2)
            goto L_0x07bf
        L_0x04a3:
            X.2ZG r6 = r0.A0M
            android.view.LayoutInflater r4 = X.AnonymousClass3MY.A0B(r3)
            r2 = 2131624149(0x7f0e00d5, float:1.887547E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r4, r3, r2, r1)
            com.whatsapp.updates.ui.UpdatesFragment r2 = r0.A0Z
            X.0zB r1 = X.C19890zB.A00
            X.10H r0 = r6.A00
            X.10E r0 = r0.A00
            X.10G r0 = r0.A00
            X.00S r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.6mq r0 = (X.C132456mq) r0
            X.6KA r6 = new X.6KA
            r6.<init>(r3, r1, r0, r2)
            goto L_0x07bf
        L_0x04c9:
            android.view.LayoutInflater r4 = X.AnonymousClass3MY.A0B(r3)
            r2 = 2131624147(0x7f0e00d3, float:1.8875465E38)
            android.view.View r2 = X.AnonymousClass3MX.A0B(r4, r3, r2, r1)
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A0Z
            X.00H r0 = r0.A0g
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.6mq r0 = (X.C132456mq) r0
            X.6KF r6 = new X.6KF
            r6.<init>(r2, r0, r1)
            goto L_0x07bf
        L_0x04e5:
            X.00H r1 = r0.A0a
            java.lang.Object r1 = r1.get()
            X.0ve r1 = (X.C18030ve) r1
            boolean r1 = X.AnonymousClass1J8.A07(r1)
            if (r1 == 0) goto L_0x052e
            X.2ZI r2 = r0.A0O
            r1 = 2131626690(0x7f0e0ac2, float:1.8880623E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r11 = r0.A0Z
            X.1pZ r9 = A03(r0)
            java.util.List r1 = X.C42011xT.A0I
            X.10H r1 = r2.A00
            X.10E r1 = r1.A00
            X.1c4 r10 = X.C108965cb.A0T(r1)
            X.10G r1 = r1.A00
            X.00S r1 = r1.A1x
            java.lang.Object r8 = r1.get()
            X.6l3 r8 = (X.C131416l3) r8
            X.6Ji r6 = new X.6Ji
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x051b:
            r0.A05 = r6
            X.6u6 r0 = r0.A03
            if (r0 == 0) goto L_0x07bf
            X.6JR r0 = r0.A01
            if (r0 == 0) goto L_0x07bf
            java.util.List r1 = r0.A00
            X.7KN r0 = r6.A01
            r0.A02(r1)
            goto L_0x07bf
        L_0x052e:
            X.2ZH r2 = r0.A0N
            r1 = 2131626689(0x7f0e0ac1, float:1.8880621E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r12 = r0.A0Z
            X.1pZ r9 = A03(r0)
            java.util.List r1 = X.C42011xT.A0I
            X.10H r1 = r2.A00
            X.10E r1 = r1.A00
            X.1c4 r11 = X.C108965cb.A0T(r1)
            X.0vb r10 = X.AnonymousClass10E.A6Q(r1)
            X.10G r1 = r1.A00
            X.00S r1 = r1.A1x
            java.lang.Object r8 = r1.get()
            X.6l3 r8 = (X.C131416l3) r8
            X.6Jj r6 = new X.6Jj
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x051b
        L_0x055b:
            X.00H r2 = r0.A0a
            java.lang.Object r2 = r2.get()
            X.0ve r2 = (X.C18030ve) r2
            boolean r4 = X.AnonymousClass1J8.A02(r2)
            java.util.List r2 = X.C42011xT.A0I
            if (r4 == 0) goto L_0x059c
            r2 = 2131626288(0x7f0e0930, float:1.8879808E38)
            android.view.View r4 = A02(r2, r3)
            boolean r2 = X.C22891Dp.A02
            if (r2 != 0) goto L_0x0589
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r3)
            r2 = 2131169544(0x7f071108, float:1.7953421E38)
            int r3 = r3.getDimensionPixelSize(r2)
            X.1sv r2 = new X.1sv
            r2.<init>(r1, r3, r1, r3)
            X.C43531zx.A03(r4, r2)
        L_0x0589:
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C18070vi.A0z(r4, r1)
            com.whatsapp.wds.components.banners.WDSBanner r4 = (com.whatsapp.wds.components.banners.WDSBanner) r4
            X.81c r1 = new X.81c
            r1.<init>(r0)
            X.6K4 r6 = new X.6K4
            r6.<init>(r0, r4, r1)
            goto L_0x07bf
        L_0x059c:
            r1 = 2131627269(0x7f0e0d05, float:1.8881798E38)
            android.view.View r2 = A02(r1, r3)
            X.81d r1 = new X.81d
            r1.<init>(r0)
            X.6KD r6 = new X.6KD
            r6.<init>(r2, r0, r1)
            goto L_0x07bf
        L_0x05af:
            java.util.List r1 = X.C42011xT.A0I
            r1 = 2131625859(0x7f0e0783, float:1.8878938E38)
            android.view.View r3 = A02(r1, r3)
            r2 = 2131897968(0x7f122e70, float:1.943084E38)
            X.81b r1 = new X.81b
            r1.<init>(r0)
            X.6K9 r6 = new X.6K9
            r6.<init>(r3, r1, r2)
            goto L_0x07bf
        L_0x05c7:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131625859(0x7f0e0783, float:1.8878938E38)
            android.view.View r3 = A02(r0, r3)
            X.6Jx r6 = new X.6Jx
            r6.<init>(r3)
            r0 = 2131435621(0x7f0b2065, float:1.849309E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r3, r0)
            r0 = 8
            r2.setVisibility(r0)
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r3 = r3.findViewById(r0)
            r2 = r3
            com.whatsapp.WaTextView r2 = (com.whatsapp.WaTextView) r2
            float r0 = X.C108985cd.A01(r2)
            r2.setTextSize(r1, r0)
            X.C43421zm.A04(r2)
            X.C18070vi.A0X(r3)
            r6.A00 = r2
            goto L_0x07bf
        L_0x05fc:
            X.6l2 r7 = r0.A0K
            r1 = 2131627089(0x7f0e0c51, float:1.8881433E38)
            android.view.View r6 = A02(r1, r3)
            X.1pZ r4 = A03(r0)
            X.00H r1 = r0.A0a
            X.0vd r3 = X.C17880vN.A0P(r1)
            r2 = 12110(0x2f4e, float:1.697E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            X.6Jo r6 = r7.A00(r6, r4, r0, r1)
            goto L_0x07bf
        L_0x061d:
            X.2ZE r4 = r0.A0J
            r1 = 2131627089(0x7f0e0c51, float:1.8881433E38)
            android.view.View r7 = A02(r1, r3)
            X.1pZ r10 = A03(r0)
            com.whatsapp.updates.ui.UpdatesFragment r15 = r0.A0Z
            X.00H r1 = r0.A0j
            X.0ve r3 = X.C108955ca.A0R(r1)
            r2 = 11378(0x2c72, float:1.5944E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r20 = X.C18020vd.A05(r1, r3, r2)
            java.util.List r1 = X.C42011xT.A0I
            X.10H r1 = r4.A00
            X.10E r2 = r1.A00
            X.10G r3 = r2.A00
            X.00S r1 = r3.A0z
            java.lang.Object r12 = r1.get()
            X.AQC r12 = (X.AQC) r12
            X.1VW r9 = X.AnonymousClass3MZ.A0e(r2)
            X.00S r1 = r3.A36
            X.00H r17 = X.C000200d.A00(r1)
            X.00S r1 = r3.A4y
            X.00H r18 = X.C000200d.A00(r1)
            X.00S r1 = r3.A0F
            X.00H r19 = X.C000200d.A00(r1)
            X.00S r1 = r3.A4u
            java.lang.Object r14 = r1.get()
            X.6p3 r14 = (X.C133606p3) r14
            X.1Lc r13 = X.C108965cb.A0X(r2)
            X.00S r1 = r3.A1u
            java.lang.Object r8 = r1.get()
            X.6at r8 = (X.C125326at) r8
            X.0z4 r11 = X.AnonymousClass3Ma.A0c(r2)
            X.6Jq r6 = new X.6Jq
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x07bf
        L_0x0681:
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2131626264(0x7f0e0918, float:1.887976E38)
            android.view.View r0 = A02(r0, r3)
            X.6K1 r6 = new X.6K1
            r6.<init>(r0)
            goto L_0x07bf
        L_0x0691:
            X.2ZC r2 = r0.A0H
            r1 = 2131626245(0x7f0e0905, float:1.887972E38)
            android.view.View r7 = A02(r1, r3)
            X.1pZ r12 = A03(r0)
            java.util.List r1 = X.C42011xT.A0I
            X.0zB r8 = X.C19890zB.A00
            X.10H r1 = r2.A00
            X.10E r3 = r1.A00
            X.1Me r11 = X.AnonymousClass3MZ.A0g(r3)
            X.10G r1 = r3.A00
            X.3Kk r10 = X.AnonymousClass3MZ.A0T(r1)
            X.11P r13 = X.AnonymousClass10E.A6O(r3)
            X.0ve r16 = X.AnonymousClass10E.A8r(r3)
            X.118 r14 = X.AnonymousClass3MZ.A0l(r3)
            X.1DC r21 = X.AnonymousClass3MZ.A13(r3)
            X.0vb r15 = X.AnonymousClass10E.A6Q(r3)
            X.00S r2 = r1.A4u
            java.lang.Object r2 = r2.get()
            X.6p3 r2 = (X.C133606p3) r2
            X.6jl r20 = X.AnonymousClass10G.ADt(r1)
            X.1c4 r17 = X.C108965cb.A0T(r3)
            X.00S r1 = r1.A1t
            java.lang.Object r1 = r1.get()
            X.6l1 r1 = (X.C131396l1) r1
            X.6KJ r6 = new X.6KJ
            r9 = r1
            r18 = r2
            r19 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x07bf
        L_0x06e8:
            X.00H r2 = r0.A0a
            java.lang.Object r1 = r2.get()
            X.0ve r1 = (X.C18030ve) r1
            boolean r1 = X.AnonymousClass1J8.A07(r1)
            if (r1 == 0) goto L_0x0719
            r1 = 2131627262(0x7f0e0cfe, float:1.8881783E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r9 = r0.A0Z
            java.lang.Object r8 = r2.get()
            X.0ve r8 = (X.C18030ve) r8
            X.C18070vi.A0X(r8)
            boolean r1 = A0E(r0)
            r10 = r1 ^ 1
            boolean r11 = A0D(r0)
            X.6KL r6 = new X.6KL
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bf
        L_0x0719:
            r1 = 2131627274(0x7f0e0d0a, float:1.8881808E38)
            android.view.View r3 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r2 = r0.A0Z
            boolean r1 = A0E(r0)
            r1 = r1 ^ 1
            boolean r0 = A0D(r0)
            X.6K7 r6 = new X.6K7
            r6.<init>(r3, r2, r1, r0)
            goto L_0x07bf
        L_0x0733:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "UpdatesAdapter/getStatusListViewHolder: UseStatusTiles: "
            r2.append(r1)
            boolean r1 = A0E(r0)
            X.C17900vP.A0r(r2, r1)
            boolean r1 = A0E(r0)
            r2 = 2131627087(0x7f0e0c4f, float:1.8881429E38)
            if (r1 == 0) goto L_0x074f
            r2 = 2131627088(0x7f0e0c50, float:1.888143E38)
        L_0x074f:
            X.2ZB r1 = r0.A0G
            android.view.View r7 = A02(r2, r3)
            X.0vl r0 = r0.A0t
            java.lang.Object r11 = r0.getValue()
            X.5lD r11 = (X.C112275lD) r11
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r1.A00
            X.10E r2 = r0.A00
            X.0vb r8 = X.AnonymousClass10E.A6Q(r2)
            X.10G r1 = r2.A00
            X.00S r0 = r1.A4s
            java.lang.Object r10 = r0.get()
            X.1ty r10 = (X.C39991ty) r10
            X.00S r0 = r1.A4q
            X.00H r12 = X.C000200d.A00(r0)
            X.00S r0 = r2.A4b
            X.00H r13 = X.C000200d.A00(r0)
            X.1Lc r9 = X.C108965cb.A0X(r2)
            X.00S r0 = r1.A1D
            X.00H r14 = X.C000200d.A00(r0)
            X.6KP r6 = new X.6KP
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x07bf
        L_0x078d:
            X.00H r1 = r0.A0a
            java.lang.Object r1 = r1.get()
            X.0ve r1 = (X.C18030ve) r1
            boolean r1 = X.AnonymousClass1J8.A07(r1)
            if (r1 == 0) goto L_0x07c3
            X.2Z7 r2 = r0.A0F
            r1 = 2131627278(0x7f0e0d0e, float:1.8881816E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r10 = r0.A0Z
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r2.A00
            X.10E r0 = r0.A00
            X.0vb r8 = X.AnonymousClass10E.A6Q(r0)
            X.1Lc r9 = X.C108965cb.A0X(r0)
            X.1DC r11 = X.AnonymousClass3MZ.A13(r0)
            X.6KM r6 = new X.6KM
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x07bd:
            X.1xT r6 = (X.C42011xT) r6
        L_0x07bf:
            X.C18070vi.A0z(r6, r5)
            return r6
        L_0x07c3:
            X.2Z6 r2 = r0.A0E
            r1 = 2131627274(0x7f0e0d0a, float:1.8881808E38)
            android.view.View r7 = A02(r1, r3)
            com.whatsapp.updates.ui.UpdatesFragment r10 = r0.A0Z
            java.util.List r0 = X.C42011xT.A0I
            X.10H r0 = r2.A00
            X.10E r0 = r0.A00
            X.0vb r8 = X.AnonymousClass10E.A6Q(r0)
            X.1Lc r9 = X.C108965cb.A0X(r0)
            X.1DC r11 = X.AnonymousClass3MZ.A13(r0)
            X.6KN r6 = new X.6KN
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x07bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112365lM.BqY(android.view.ViewGroup, int):X.1xT");
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (X.AnonymousClass000.A1T(A01(r6, r2), 3) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByK(X.AnonymousClass206 r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = X.C22971Dz.A0g(r7)
            if (r0 == 0) goto L_0x0058
            X.6vy r0 = X.C161008Az.A00
            java.util.Set r0 = X.C137756vy.A01
            boolean r0 = X.C108965cb.A1b(r0, r8)
            if (r0 == 0) goto L_0x0058
            java.lang.ref.WeakReference r0 = r6.A07
            java.lang.Object r5 = r0.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0058
            boolean r0 = r6.A0A()
            r4 = 0
            if (r0 != 0) goto L_0x003e
            X.00H r2 = r6.A0j
            int r1 = A01(r6, r2)
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x003e
            int r1 = A01(r6, r2)
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            java.util.List r0 = A06(r6)
            int r2 = r0.size()
        L_0x0047:
            if (r4 >= r2) goto L_0x0058
            X.1xT r1 = r5.A0O(r4)
            boolean r0 = r1 instanceof X.C161008Az
            if (r0 == 0) goto L_0x0059
            X.8Az r1 = (X.C161008Az) r1
            r1.ByX(r7, r8)
            if (r3 != 0) goto L_0x005d
        L_0x0058:
            return
        L_0x0059:
            r0 = 3
            if (r4 <= r0) goto L_0x005d
            return
        L_0x005d:
            int r4 = r4 + 1
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112365lM.ByK(X.206, int):void");
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
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

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        int A042 = C108955ca.A04(r3, 1);
        if (A042 == 3) {
            C108955ca.A1O(this.A0B);
            C108955ca.A1O(((C112275lD) this.A0t.getValue()).A01);
        } else if (A042 == 5) {
            C108975cc.A18(this.A0o);
        }
    }

    public static C37451pZ A03(C112365lM r0) {
        C37451pZ r02 = (C37451pZ) r0.A0o.getValue();
        C18070vi.A0X(r02);
        return r02;
    }

    public static final C140066zt A04(C112365lM r2) {
        Resources resources;
        Configuration configuration;
        Integer num = null;
        if (r2.A06 == null) {
            View A0O2 = C108945cZ.A0O(r2.A07);
            if (!(A0O2 == null || (resources = A0O2.getResources()) == null || (configuration = resources.getConfiguration()) == null)) {
                num = Integer.valueOf(configuration.orientation);
            }
            r2.A06 = num;
        }
        C140066zt r0 = r2.A02;
        if (r0 == null) {
            r0 = r2.A05(false);
        }
        r2.A02 = r0;
        return r0;
    }

    public static final List A06(C112365lM r1) {
        if (!C72453Mb.A1a(r1.A0u)) {
            return r1.A09;
        }
        List list = ((C40431uh) r1.A0m.getValue()).A02;
        C18070vi.A0X(list);
        return list;
    }

    private final boolean A09() {
        return AnonymousClass000.A1T(A01(this, this.A0j), 9);
    }

    private final boolean A0A() {
        return AnonymousClass000.A1T(A01(this, this.A0j), 5);
    }

    private final boolean A0C() {
        C140066zt A042;
        if (A01(this, this.A0j) != 2 || (A042 = A04(this)) == null || A042.A07) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(C112365lM r2) {
        C136616u6 r0;
        List list;
        if (r2.A0A || ((r0 = r2.A03) != null && (list = r0.A08) != null && AnonymousClass000.A1a(list))) {
            return true;
        }
        return false;
    }

    public static final boolean A0E(C112365lM r2) {
        int A012 = A01(r2, r2.A0j);
        if (A012 == 1 || A012 == 2) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C113585nK r22 = (C113585nK) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B();
    }

    public final void A0U() {
        Log.i("UpdatesAdapter/clear");
        this.A02 = null;
        if (C72453Mb.A1a(this.A0u)) {
            ((C40431uh) this.A0m.getValue()).A00((Runnable) null, C18460wS.A00);
        } else {
            A07(this, C18460wS.A00);
        }
    }

    public void Bl7() {
        if (this.A0x.BcY()) {
            this.A0Z.C14(11, 58);
        } else {
            this.A0Z.C1D();
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C113585nK r32 = (C113585nK) r3;
        C18070vi.A0d(r32, 0);
        Object obj = A06(this).get(i);
        C18070vi.A0X(obj);
        AnonymousClass6U0 r1 = (AnonymousClass6U0) obj;
        if (!A0A() || !(r32 instanceof AnonymousClass88I) || !(r1 instanceof AnonymousClass6JD)) {
            List list = C42011xT.A0I;
            r32.A0C(r1);
            return;
        }
        ((AnonymousClass88I) r32).BDF(A04(this), (AnonymousClass6JD) r1);
    }

    public void Byt() {
        UpdatesFragment.A07(this.A0Z);
    }

    public void Byu() {
        this.A0Z.Byu();
    }

    public void C6a(UserJid userJid) {
        this.A0Z.C6a(userJid);
    }

    public void C6g(UserJid userJid, boolean z) {
        this.A0Z.C6g(userJid, z);
    }

    private final int A00() {
        if (A0C() || A0E(this)) {
            return 2131166139;
        }
        if (AnonymousClass000.A1T(A01(this, this.A0j), 3)) {
            return 2131166142;
        }
        return 2131166138;
    }

    public static int A01(C112365lM r0, AnonymousClass00H r1) {
        return ((C24641Lc) r1.get()).A00(A0D(r0));
    }

    public static final View A02(int i, ViewGroup viewGroup) {
        return AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (X.AnonymousClass000.A1T(A01(r5, r2), 4) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C112365lM r5, java.util.List r6) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Running diff util, updates list size: "
            r1.append(r0)
            int r0 = r6.size()
            X.C17900vP.A0o(r1, r0)
            java.util.Iterator r2 = r6.iterator()
            r1 = 0
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            boolean r0 = r0 instanceof X.AnonymousClass6J8
            if (r0 != 0) goto L_0x0027
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0026:
            r1 = -1
        L_0x0027:
            r5.A00 = r1
            X.0vl r0 = r5.A0u
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0037
            X.0vl r0 = r5.A0m
            X.C108995ce.A1S(r6, r0)
            return
        L_0x0037:
            X.5yW r0 = r5.A0B
            X.C108955ca.A1O(r0)
            java.util.List r4 = r5.A09
            boolean r0 = A0E(r5)
            if (r0 != 0) goto L_0x0063
            X.00H r2 = r5.A0j
            int r1 = A01(r5, r2)
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x0063
            int r1 = A01(r5, r2)
            r0 = 4
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            X.5yW r3 = new X.5yW
            r3.<init>(r4, r6, r0)
            X.0vl r0 = r5.A0n
            java.lang.Object r2 = r0.getValue()
            X.1pb r2 = (X.C37471pb) r2
            r1 = 2
            X.7Ed r0 = new X.7Ed
            r0.<init>(r5, r6, r1)
            r2.A00(r0, r3)
            r5.A0B = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112365lM.A07(X.5lM, java.util.List):void");
    }

    private final void A08(Boolean bool, int i, boolean z) {
        if (A0E(this) || A0A()) {
            C140066zt r2 = this.A02;
            if (r2 == null || i != r2.A03 || z != r2.A05 || !C18070vi.A19(bool, r2.A06)) {
                this.A06 = Integer.valueOf(i);
                this.A02 = null;
            }
        }
    }

    private final boolean A0B() {
        if (A0C()) {
            C24641Lc A0v2 = C108945cZ.A0v(this.A0j);
            if (A0v2.A00(A0D(this)) == 2) {
                if (!C18020vd.A05(C18040vf.A02, A0v2.A01, 10007)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int A0Q() {
        return A06(this).size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.6u6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v71, resolved type: X.6U1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v72, resolved type: X.6U1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v75, resolved type: X.6U1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.6zt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v80, resolved type: X.6U1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v81, resolved type: X.6U1} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e7, code lost:
        if ((r9 instanceof X.AnonymousClass6KV) != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02eb, code lost:
        if ((r9 instanceof X.AnonymousClass6KU) == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ed, code lost:
        r6.add(new X.AnonymousClass6JH(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f9, code lost:
        if (A0E(r4) == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02fb, code lost:
        r6.add(new X.C121296Jc(false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0304, code lost:
        r3.addAll(X.AnonymousClass1ZT.A02(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x030b, code lost:
        r1 = X.AnonymousClass000.A13();
        r6 = r4.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031a, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 3) != false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0325, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 4) != false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0327, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032c, code lost:
        if (A09() == false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x032e, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032f, code lost:
        r0 = r31.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0331, code lost:
        if (r0 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0333, code lost:
        r8 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0335, code lost:
        if (r8 != false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033d, code lost:
        if (r0.A06.isEmpty() == false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0345, code lost:
        if (r0.A07.isEmpty() == false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034d, code lost:
        if (r0.A05.isEmpty() == false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0351, code lost:
        if (r0.A03 != null) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0353, code lost:
        r11 = r0.A04;
        r9 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0359, code lost:
        if (r9 == null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x035f, code lost:
        if (r9.A00() != 0) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0365, code lost:
        if (A0E(r4) != false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0367, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x036b, code lost:
        if (A0A() == false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x036d, code lost:
        r11 = new X.AnonymousClass6JM((X.AnonymousClass1E7) r4.A0s.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x037a, code lost:
        r1.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x037d, code lost:
        r3.addAll(r1);
        r8 = r4.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0386, code lost:
        if (X.C72453Mb.A1X(r8) == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0388, code lost:
        r1 = r31.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038a, code lost:
        if (r1 == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0390, code lost:
        if (r1.isEmpty() != false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0392, code lost:
        if (r5 == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0398, code lost:
        if (X.C17880vN.A1X(r3) == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x039a, code lost:
        r3.add(X.C121276Ja.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x039f, code lost:
        r11 = r31.A08;
        r10 = X.AnonymousClass000.A13();
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03a7, code lost:
        if (r11 == null) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a9, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ae, code lost:
        if (X.AnonymousClass000.A1a(r11) == true) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b0, code lost:
        r13 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03be, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 10993) != false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c0, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03c1, code lost:
        if (r5 != false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03c3, code lost:
        if (r14 != false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c5, code lost:
        r10.add(new X.AnonymousClass6JO(X.C108945cZ.A0v(r6).A0A(r13), r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03d5, code lost:
        if (r11 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03db, code lost:
        if (r11.isEmpty() == false) goto L_0x04e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03dd, code lost:
        if (r5 != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03df, code lost:
        if (r14 != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e1, code lost:
        r1 = r31.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e3, code lost:
        if (r1 == null) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03eb, code lost:
        if (X.AnonymousClass000.A1a(r1.A00) != true) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ed, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ee, code lost:
        r10.add(new X.AnonymousClass6JG(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03f6, code lost:
        r3.addAll(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03f9, code lost:
        r9 = r31.A06;
        r10 = X.AnonymousClass00R.A0Y;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03fe, code lost:
        if (r9 != r10) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0400, code lost:
        r1 = r31.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0402, code lost:
        if (r1 == null) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0408, code lost:
        if (X.AnonymousClass000.A1a(r1) != true) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x040e, code lost:
        if (X.C72453Mb.A1X(r8) == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0410, code lost:
        if (r6 == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x041e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 10997) != false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0420, code lost:
        if (r5 == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0422, code lost:
        r6 = r31.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0424, code lost:
        if (r6 == null) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042d, code lost:
        if ((!r6.isEmpty()) != true) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0433, code lost:
        if (X.C17880vN.A1X(r3) == false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0435, code lost:
        r3.add(X.C121276Ja.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x043a, code lost:
        r3.add(X.AnonymousClass6J6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043f, code lost:
        if (r6 == null) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0441, code lost:
        r3.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0444, code lost:
        r5 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0449, code lost:
        if (r5 == 0) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x044c, code lost:
        if (r5 == 2) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x044f, code lost:
        if (r5 == 3) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0452, code lost:
        if (r5 == 1) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0455, code lost:
        if (r5 != 4) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0457, code lost:
        r1 = X.AnonymousClass6JV.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0459, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0460, code lost:
        if (r3.isEmpty() == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0462, code lost:
        r3.add(X.AnonymousClass6JT.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x046b, code lost:
        if (X.C72453Mb.A1X(r8) == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0479, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 10997) != false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x047b, code lost:
        r3.add(X.AnonymousClass6JW.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0480, code lost:
        r5 = r31.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0482, code lost:
        if (r5 == null) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0484, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x048a, code lost:
        if (A0D(r4) != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x048c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0499, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 10993) != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x049b, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04a0, code lost:
        if (X.C72453Mb.A1X(r8) == false) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a2, code lost:
        r12 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04a8, code lost:
        if (r12.isEmpty() == false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ae, code lost:
        if (A0D(r4) != false) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04b0, code lost:
        if (r6 != false) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b2, code lost:
        r13 = r5.A03;
        r6 = r31.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04b6, code lost:
        if (r13 == false) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04b8, code lost:
        r9 = r6.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04bc, code lost:
        if (r9 == 0) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04be, code lost:
        if (r9 == 1) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04c1, code lost:
        if (r9 == 2) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04c7, code lost:
        throw X.AnonymousClass3MW.A14();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c8, code lost:
        r1 = X.AnonymousClass6JX.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04cb, code lost:
        r1 = X.AnonymousClass6JY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ce, code lost:
        r1 = X.AnonymousClass6JZ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d1, code lost:
        r1 = X.AnonymousClass6JS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d4, code lost:
        if (r9 == r10) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04d8, code lost:
        if (r5 == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04db, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04de, code lost:
        if (r11 == null) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04e4, code lost:
        if (X.AnonymousClass000.A1a(r11) == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04e6, code lost:
        if (r5 == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04e8, code lost:
        r10.add(X.AnonymousClass6J5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04f5, code lost:
        if (X.C108955ca.A0W(r8).A09() == false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04f7, code lost:
        r6 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04ff, code lost:
        if (r6.hasNext() == false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0501, code lost:
        ((X.C121346Jh) r6.next()).A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x050a, code lost:
        r10.addAll(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0517, code lost:
        if (X.C108955ca.A0W(r8).A07() != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0521, code lost:
        if (X.C108955ca.A0W(r8).A03() == false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0525, code lost:
        if (r5 == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0527, code lost:
        r9 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x052d, code lost:
        if (X.AnonymousClass000.A1a(r9) != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0535, code lost:
        if (X.AnonymousClass000.A1a(r0.A07) != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x053d, code lost:
        if (X.AnonymousClass000.A1a(r0.A05) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x053f, code lost:
        r1.add(X.AnonymousClass6J7.A00);
        r1.addAll(r9);
        r1.addAll(r0.A07);
        r1.addAll(r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0553, code lost:
        r9 = r31.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0555, code lost:
        if (r9 == null) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x055b, code lost:
        if (r9.isEmpty() == false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0561, code lost:
        if (A0E(r4) == false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0563, code lost:
        if (r10 != false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0569, code lost:
        if (A0A() != false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x056f, code lost:
        if (A0C() == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0575, code lost:
        if (A04(r4) == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0577, code lost:
        r9 = A04(r4);
        X.C18070vi.A0z(r9, "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusTileSpec");
        r1.add(new X.AnonymousClass6JP(r9, r0));
        r12 = r31.A00;
        r13 = A00();
        r9 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0590, code lost:
        r14 = 0;
        r15 = 0;
        r16 = X.AnonymousClass000.A1O(r9 & 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x059a, code lost:
        if ((r9 & 8) == 0) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x059c, code lost:
        r14 = 2131166383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05a1, code lost:
        if ((r9 & 16) == 0) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05a3, code lost:
        r15 = 2131166385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05a6, code lost:
        r11 = new X.C121316Je(r12, r13, r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05ad, code lost:
        r12 = r31.A00;
        r1.add(new X.C121306Jd(r12, A04(r4)));
        r13 = A00();
        r9 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05c6, code lost:
        if (A0A() == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05c8, code lost:
        r1.add(r0.A04);
        r1.addAll(r0.A06);
        r1.addAll(r0.A07);
        r10 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05dd, code lost:
        if (X.AnonymousClass000.A1a(r10) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05df, code lost:
        if (r8 == false) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05e1, code lost:
        r1.addAll(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05e6, code lost:
        r1.add(X.AnonymousClass6J9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05ed, code lost:
        if (r10 == false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05ef, code lost:
        r16 = r0.A00;
        r1.add(r0.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0601, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 4) != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0603, code lost:
        r11 = r31.A00;
        r12 = A00();
        r13 = 2131166383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0615, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 3) == false) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0617, code lost:
        r13 = 2131166384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x061a, code lost:
        r14 = 2131166385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0626, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 3) == false) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r0.intValue() == r2) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0628, code lost:
        r14 = 2131166386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x062b, code lost:
        r1.add(new X.C121316Je(r11, r12, r13, r14, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0634, code lost:
        r10 = 1;
        r12 = X.C108945cZ.A0v(r6);
        r9 = X.C72453Mb.A1a(r4.A0r);
        r13 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0642, code lost:
        if (r9 == false) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0644, code lost:
        r12 = 11411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0646, code lost:
        r13 = X.C18020vd.A00(X.C18040vf.A02, r13, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x064c, code lost:
        if (r13 <= 0) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0652, code lost:
        if (A0D(r4) != false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r44 = r1.A0B;
        r2 = r1.A02;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x065a, code lost:
        if (r0.A06.isEmpty() == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x065c, code lost:
        r18 = r0.A06;
        r9 = r18.size();
        r14 = r0.A07;
        r12 = X.C108945cZ.A0A(r14, r9) + 1;
        r17 = r0.A05;
        r12 = r12 + X.AnonymousClass000.A1a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x067d, code lost:
        if (X.C108945cZ.A0A(r14, r18.size()) <= 0) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0688, code lost:
        if (X.AnonymousClass000.A1T(A01(r4, r6), 4) != false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x068e, code lost:
        if (A09() == false) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0690, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0698, code lost:
        r9 = r12 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069a, code lost:
        if (r16 != false) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r2 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x069c, code lost:
        if (r8 != false) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x069e, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06a0, code lost:
        if (r9 != 1) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06a2, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06a4, code lost:
        r15 = r18.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06ac, code lost:
        if (r15.hasNext() == false) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06ae, code lost:
        r8 = r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06b2, code lost:
        if (r16 != false) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06b4, code lost:
        if (r13 <= r10) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        r5 = r2.A04;
        r14 = r5.A05;
        r8 = new X.AnonymousClass6JC(r5.A00, r5.A03, r5.A02, r5.A01, r5.A04, r14, r5.A06, r5.A07);
        r37 = X.AnonymousClass72J.A00(r2.A06);
        r38 = X.AnonymousClass72J.A00(r2.A07);
        r8 = r2.A02;
        r34 = new X.AnonymousClass72J(r2.A03, r8, r37, r38, X.AnonymousClass72J.A00(r2.A05), r8, r2.A08, r2.A01, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06b6, code lost:
        r10 = r10 + 1;
        r1.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06bc, code lost:
        r13 = java.lang.Math.max(r0.A06.size() + 1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06c9, code lost:
        r12 = 11412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06cd, code lost:
        r14 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06d5, code lost:
        if (r14.hasNext() == false) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06d7, code lost:
        r8 = r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06db, code lost:
        if (r16 != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06dd, code lost:
        if (r13 <= r10) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06df, code lost:
        r10 = r10 + 1;
        r1.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r2 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e9, code lost:
        if (X.AnonymousClass000.A1a(r17) == false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06eb, code lost:
        if (r16 != false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ed, code lost:
        if (r13 <= r10) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06ef, code lost:
        r10 = r10 + 1;
        r1.add(new X.AnonymousClass6JL(new X.C154237qo(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06fe, code lost:
        r8 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0700, code lost:
        if (r12 != r10) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0702, code lost:
        if (r8 == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0704, code lost:
        if (r12 <= r10) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0706, code lost:
        r10 = new X.AnonymousClass6JQ(new X.C154247qp(r4), r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cc, code lost:
        if (r2 == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0710, code lost:
        r1.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0715, code lost:
        if (r8 == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0717, code lost:
        if (r9 <= 1) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0719, code lost:
        r10 = new X.AnonymousClass6JQ(new X.C154257qq(r4), 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0725, code lost:
        r1.add(r0.A04);
        r10 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0730, code lost:
        if (X.AnonymousClass000.A1a(r10) == false) goto L_0x073d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0732, code lost:
        r1.add(new java.lang.Object());
        r1.addAll(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x073d, code lost:
        r11 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0743, code lost:
        if (X.AnonymousClass000.A1a(r11) == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0745, code lost:
        r1.add(new X.AnonymousClass6J4(r0.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        r9 = X.C29351c6.A0E(r2);
        r16 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0751, code lost:
        if (r0.A02 != false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0753, code lost:
        if (r8 == false) goto L_0x0758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0755, code lost:
        r1.addAll(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0758, code lost:
        r11 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x075e, code lost:
        if (X.AnonymousClass000.A1a(r11) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x076c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.C108955ca.A0R(r6), 6279) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x076e, code lost:
        r1.add(new X.AnonymousClass6J3(r0.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x077a, code lost:
        if (r0.A01 != false) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x077c, code lost:
        if (r8 == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x077e, code lost:
        r1.addAll(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0783, code lost:
        r0 = new X.C121296Jc(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x078a, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x078d, code lost:
        r9 = X.C122536Qt.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0794, code lost:
        if (X.C18020vd.A05(r1, r12, 6285) == false) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0796, code lost:
        r1 = X.AnonymousClass000.A13();
        r1.add(X.C122536Qt.A04);
        r10.A02.A00.get();
        r1.add(X.C122536Qt.A02);
        r13 = X.C29431cG.A0o(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07b3, code lost:
        if (r13.hasNext() == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07b5, code lost:
        r6 = (X.C122536Qt) r13.next();
        X.C18070vi.A0d(r6, 0);
        r1 = X.AnonymousClass719.A00(r6);
        r12 = r10.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07ce, code lost:
        if (X.C17880vN.A0B(r12).getBoolean(r1, false) != false) goto L_0x07af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        if (r16.hasNext() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07dd, code lost:
        if (X.C17880vN.A0B(r12).getInt(X.AnonymousClass719.A01(r6), 0) >= 3) goto L_0x07af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07df, code lost:
        if (r6 != r9) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07e1, code lost:
        r9 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07e8, code lost:
        r1 = (X.C112275lD) r4.A0t.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07f4, code lost:
        if (A0E(r4) == false) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07f6, code lost:
        r7 = A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07fa, code lost:
        r1.A0V(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07ff, code lost:
        r1 = new X.AnonymousClass6JI(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0805, code lost:
        r1 = new X.AnonymousClass6JI(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        r8 = (X.C121346Jh) r16.next();
        r18 = r8.A0A;
        r19 = r8.A00;
        r5 = r8.A08;
        r9.add(new X.C121346Jh(r18, r19, r8.A0B, r8.A07, r5, r8.A09, r8.A0C, r8.A0D, r8.A04, r8.A06, r8.A02, r8.A01, r8.A03, r8.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x080a, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0815, code lost:
        if (X.C108955ca.A0W(r8).A0A() == false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0817, code lost:
        r10 = X.AnonymousClass000.A1Z(r6, X.AnonymousClass00R.A00);
        r9 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x081f, code lost:
        if (r9 != false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x082d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 10995) == false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x082f, code lost:
        if (r13 != false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0831, code lost:
        if (r11 != false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0833, code lost:
        r3.add(X.AnonymousClass6JU.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0125, code lost:
        r34 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0838, code lost:
        if (r10 != false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x083a, code lost:
        if (r11 != false) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x083c, code lost:
        r11 = X.C29351c6.A0D(r12);
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0848, code lost:
        if (r12.hasNext() == false) goto L_0x0861;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x084a, code lost:
        r1 = (X.C135386s7) r12.next();
        r11.add(new X.C121336Jg(r1.A02, r1.A00, r1.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x085f, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0861, code lost:
        r3.addAll(X.C29431cG.A0v(r11, X.C18020vd.A00(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 8167)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0874, code lost:
        r3.add(new X.AnonymousClass6JN(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0881, code lost:
        throw X.AnonymousClass3MW.A14();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0882, code lost:
        r3.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0885, code lost:
        r1 = r31.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0887, code lost:
        if (r1 == null) goto L_0x088c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0889, code lost:
        r3.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0890, code lost:
        if (X.C72453Mb.A1X(r8) != false) goto L_0x08a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x089e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r8), 11378) == false) goto L_0x08a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08a0, code lost:
        if (r0 == null) goto L_0x08a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0142, code lost:
        if (r46 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08a2, code lost:
        r3.add(X.C121286Jb.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08a7, code lost:
        A07(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08aa, code lost:
        r4.A03 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014d, code lost:
        r35 = r1.A00;
        r36 = r1.A05;
        r12 = r1.A01;
        r2 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0159, code lost:
        if (r2 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        r13 = X.C29351c6.A0E(r2);
        r16 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0167, code lost:
        if (r16.hasNext() == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0169, code lost:
        r8 = (X.C121346Jh) r16.next();
        r18 = r8.A0A;
        r19 = r8.A00;
        r5 = r8.A08;
        r20 = r8.A0B;
        r26 = r8.A0C;
        r27 = r8.A0D;
        r13.add(new X.C121346Jh(r18, r19, r20, r8.A07, r5, r8.A09, r26, r27, r8.A04, r8.A06, r8.A02, r8.A01, r8.A03, r8.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b3, code lost:
        r2 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b5, code lost:
        if (r2 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b7, code lost:
        r0 = X.C29351c6.A0E(r2);
        r8 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c3, code lost:
        if (r8.hasNext() == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c5, code lost:
        r2 = (X.C121326Jf) r8.next();
        r6 = r2.A02;
        r5 = r2.A00;
        r3 = r2.A01;
        X.C18070vi.A0h(r6, r5);
        r0.add(new X.C121326Jf(r6, r5, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01dd, code lost:
        r31 = new X.C136616u6(r35, r12, r34, r1.A03, r36, r1.A06, r1.A04, r9, r13, r0, r44, r1.A0A, r1.A0C);
        r5 = r31.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0206, code lost:
        if (r5 != false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0208, code lost:
        r0 = r31.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x020a, code lost:
        if (r0 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020c, code lost:
        A08((java.lang.Boolean) null, r0.intValue(), X.C72463Mc.A1Y(r31.A03));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0219, code lost:
        r0 = r31.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021b, code lost:
        if (r0 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021d, code lost:
        r6 = r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0225, code lost:
        if (A0C() == false) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022b, code lost:
        if (A04(r4) == null) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022d, code lost:
        r3 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x022f, code lost:
        if (r3 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0231, code lost:
        r1 = A04(r4);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusTileSpec");
        r3.CRO(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x023d, code lost:
        if (r12 == null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x023f, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Updating recommended newsletters list size = ");
        r6 = r12.A00;
        X.C17900vP.A0o(r1, r6.size());
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0253, code lost:
        if (r0 == null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        r0.A01.A02(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0264, code lost:
        if (X.C108955ca.A0W(r4.A0h).A0A() == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0266, code lost:
        X.AnonymousClass3MX.A0x(r4.A0l).CGS(new X.AnonymousClass7RD(r4, r6, 22), "refreshVerticalRecommendedNewsletters/notifyItemChanged");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0278, code lost:
        r7 = r31;
        r3 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x027d, code lost:
        if (r5 != false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027f, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0282, code lost:
        if (r31.A0B == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0284, code lost:
        r11 = (X.C1404071h) r4.A0i.get();
        r10 = r11.A02;
        r12 = r10.A01;
        r1 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0298, code lost:
        if (X.C18020vd.A05(r1, r12, 6285) != false) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029a, code lost:
        r11.A03.A00.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a7, code lost:
        if (r11.A00.A0N() != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b5, code lost:
        if (X.AnonymousClass3MX.A1T(X.C17890vO.A0B(r11.A01), "show_statuses_education") == false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b7, code lost:
        r9 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bc, code lost:
        r6 = X.AnonymousClass1ZT.A01();
        r0 = r31.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c3, code lost:
        if (r0 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ca, code lost:
        if (X.AnonymousClass000.A1a(r0) == true) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02cc, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02db, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(r4.A0h), 11378) != false) goto L_0x0783;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02dd, code lost:
        r0 = new X.AnonymousClass6JK(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e2, code lost:
        r6.add(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(X.C136616u6 r46) {
        /*
            r45 = this;
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Updates list changed. newsletters = "
            r5.append(r0)
            r4 = r45
            X.6u6 r0 = r4.A03
            r7 = 0
            if (r0 == 0) goto L_0x0149
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0149
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001c:
            r5.append(r0)
            java.lang.String r0 = ", statuses = "
            r5.append(r0)
            X.6u6 r0 = r4.A03
            if (r0 == 0) goto L_0x0146
            X.72J r3 = r0.A02
            if (r3 == 0) goto L_0x0146
            java.util.List r0 = r3.A06
            int r1 = r0.size()
            java.util.List r0 = r3.A07
            int r2 = X.C108945cZ.A0A(r0, r1)
            X.6JC r0 = r3.A04
            X.2sx r1 = r0.A00()
            r0 = 1
            if (r1 != 0) goto L_0x0042
            r0 = 0
        L_0x0042:
            int r2 = r2 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0047:
            X.C17900vP.A0b(r0, r5)
            r6 = 0
            r1 = r46
            if (r46 == 0) goto L_0x005d
            java.util.List r0 = r1.A08
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != r2) goto L_0x005d
            r6 = 1
        L_0x005d:
            boolean r0 = A0D(r4)
            r4.A0A = r6
            X.6zt r3 = r4.A02
            if (r3 == 0) goto L_0x0142
            if (r6 != r0) goto L_0x0128
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x0142
            if (r46 == 0) goto L_0x0128
            java.lang.Integer r0 = r1.A04
            int r2 = r3.A03
            if (r0 == 0) goto L_0x0128
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0128
        L_0x007b:
            boolean r0 = r1.A0B
            r44 = r0
            X.72J r2 = r1.A02
            r0 = 0
            if (r2 == 0) goto L_0x0125
            X.6JC r5 = r2.A04
            X.6nQ r14 = r5.A05
            X.1E7 r9 = r5.A00
            X.206 r10 = r5.A03
            java.lang.CharSequence r15 = r5.A06
            boolean r3 = r5.A07
            X.206 r11 = r5.A02
            X.6rQ r13 = r5.A04
            X.206 r12 = r5.A01
            X.6JC r36 = new X.6JC
            r8 = r36
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r3 = r2.A06
            java.util.List r37 = X.AnonymousClass72J.A00(r3)
            java.util.List r3 = r2.A07
            java.util.List r38 = X.AnonymousClass72J.A00(r3)
            boolean r8 = r2.A02
            java.util.List r3 = r2.A05
            java.util.List r39 = X.AnonymousClass72J.A00(r3)
            X.6J9 r6 = r2.A03
            boolean r5 = r2.A08
            boolean r3 = r2.A01
            boolean r2 = r2.A00
            X.72J r34 = new X.72J
            r35 = r6
            r40 = r8
            r41 = r5
            r42 = r3
            r43 = r2
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x00ca:
            java.util.List r2 = r1.A08
            if (r2 == 0) goto L_0x014c
            java.util.ArrayList r9 = X.C29351c6.A0E(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x00d6:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x014d
            java.lang.Object r8 = r16.next()
            X.6Jh r8 = (X.C121346Jh) r8
            X.2Dk r2 = r8.A0A
            r18 = r2
            X.1E7 r2 = r8.A00
            r19 = r2
            long r5 = r8.A08
            java.lang.CharSequence r2 = r8.A0B
            r20 = r2
            boolean r2 = r8.A0C
            r26 = r2
            boolean r2 = r8.A0D
            r27 = r2
            long r2 = r8.A09
            int r10 = r8.A07
            r21 = r10
            boolean r15 = r8.A04
            boolean r14 = r8.A06
            boolean r13 = r8.A02
            boolean r12 = r8.A01
            boolean r11 = r8.A03
            boolean r10 = r8.A05
            X.6Jh r8 = new X.6Jh
            r17 = r8
            r22 = r5
            r24 = r2
            r28 = r15
            r29 = r14
            r30 = r13
            r31 = r12
            r32 = r11
            r33 = r10
            r17.<init>(r18, r19, r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33)
            r9.add(r8)
            goto L_0x00d6
        L_0x0125:
            r34 = r7
            goto L_0x00ca
        L_0x0128:
            int r5 = r3.A03
            boolean r3 = r3.A05
            X.00H r0 = r4.A0j
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            int r2 = r0.A00(r6)
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A08(r0, r5, r3)
        L_0x0142:
            if (r46 == 0) goto L_0x08aa
            goto L_0x007b
        L_0x0146:
            r0 = r7
            goto L_0x0047
        L_0x0149:
            r0 = r7
            goto L_0x001c
        L_0x014c:
            r9 = r7
        L_0x014d:
            X.6Up r2 = r1.A00
            r35 = r2
            java.lang.Integer r2 = r1.A05
            r36 = r2
            X.6JR r12 = r1.A01
            java.util.List r2 = r1.A07
            if (r2 == 0) goto L_0x01b2
            java.util.ArrayList r13 = X.C29351c6.A0E(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x0163:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x01b3
            java.lang.Object r8 = r16.next()
            X.6Jh r8 = (X.C121346Jh) r8
            X.2Dk r2 = r8.A0A
            r18 = r2
            X.1E7 r2 = r8.A00
            r19 = r2
            long r5 = r8.A08
            java.lang.CharSequence r2 = r8.A0B
            r20 = r2
            boolean r2 = r8.A0C
            r26 = r2
            boolean r2 = r8.A0D
            r27 = r2
            long r2 = r8.A09
            int r10 = r8.A07
            r21 = r10
            boolean r10 = r8.A04
            r28 = r10
            boolean r10 = r8.A06
            r29 = r10
            boolean r15 = r8.A02
            boolean r14 = r8.A01
            boolean r11 = r8.A03
            boolean r10 = r8.A05
            X.6Jh r8 = new X.6Jh
            r17 = r8
            r22 = r5
            r24 = r2
            r30 = r15
            r31 = r14
            r32 = r11
            r33 = r10
            r17.<init>(r18, r19, r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.add(r8)
            goto L_0x0163
        L_0x01b2:
            r13 = r7
        L_0x01b3:
            java.util.List r2 = r1.A09
            if (r2 == 0) goto L_0x01dd
            java.util.ArrayList r0 = X.C29351c6.A0E(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x01bf:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x01dd
            java.lang.Object r2 = r8.next()
            X.6Jf r2 = (X.C121326Jf) r2
            X.2Dk r6 = r2.A02
            X.1E7 r5 = r2.A00
            boolean r3 = r2.A01
            X.C18070vi.A0h(r6, r5)
            X.6Jf r2 = new X.6Jf
            r2.<init>(r6, r5, r3)
            r0.add(r2)
            goto L_0x01bf
        L_0x01dd:
            java.lang.Integer r8 = r1.A06
            boolean r6 = r1.A0A
            boolean r5 = r1.A0C
            java.lang.Integer r3 = r1.A04
            java.lang.Boolean r1 = r1.A03
            X.6u6 r2 = new X.6u6
            r31 = r2
            r32 = r35
            r33 = r12
            r35 = r1
            r37 = r8
            r38 = r3
            r39 = r9
            r40 = r13
            r41 = r0
            r42 = r44
            r43 = r6
            r44 = r5
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            boolean r5 = r2.A0A
            if (r5 != 0) goto L_0x0278
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0219
            int r1 = r0.intValue()
            java.lang.Boolean r0 = r2.A03
            boolean r0 = X.C72463Mc.A1Y(r0)
            r4.A08(r7, r1, r0)
        L_0x0219:
            X.72J r0 = r2.A02
            if (r0 == 0) goto L_0x023d
            java.util.ArrayList r6 = r0.A02()
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x07e8
            X.6zt r0 = A04(r4)
            if (r0 == 0) goto L_0x07e8
            X.8AU r3 = r4.A01
            if (r3 == 0) goto L_0x023d
            X.6zt r1 = A04(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusTileSpec"
            X.C18070vi.A0z(r1, r0)
            r3.CRO(r1, r6)
        L_0x023d:
            if (r12 == 0) goto L_0x0278
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Updating recommended newsletters list size = "
            r1.append(r0)
            java.util.List r6 = r12.A00
            int r0 = r6.size()
            X.C17900vP.A0o(r1, r0)
            X.6KO r0 = r4.A05
            if (r0 == 0) goto L_0x025a
            X.7KN r0 = r0.A01
            r0.A02(r6)
        L_0x025a:
            X.00H r0 = r4.A0h
            X.1c4 r0 = X.C108955ca.A0W(r0)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0278
            X.00H r0 = r4.A0l
            X.10I r3 = X.AnonymousClass3MX.A0x(r0)
            r0 = 22
            X.7RD r1 = new X.7RD
            r1.<init>(r4, r6, r0)
            java.lang.String r0 = "refreshVerticalRecommendedNewsletters/notifyItemChanged"
            r3.CGS(r1, r0)
        L_0x0278:
            r7 = r2
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            if (r5 != 0) goto L_0x030b
            boolean r0 = r2.A0B
            r9 = 0
            if (r0 == 0) goto L_0x02bc
            X.00H r0 = r4.A0i
            java.lang.Object r11 = r0.get()
            X.71h r11 = (X.C1404071h) r11
            X.719 r10 = r11.A02
            X.0ve r12 = r10.A01
            r6 = 6285(0x188d, float:8.807E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r12, r6)
            if (r0 != 0) goto L_0x078d
            X.1u0 r0 = r11.A03
            X.00H r0 = r0.A00
            r0.get()
        L_0x02a1:
            X.11S r0 = r11.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x078a
            X.0z4 r0 = r11.A01
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "show_statuses_education"
            boolean r0 = X.AnonymousClass3MX.A1T(r1, r0)
            if (r0 == 0) goto L_0x078a
            X.6KV r9 = new X.6KV
            r9.<init>()
        L_0x02bc:
            X.DcQ r6 = X.AnonymousClass1ZT.A01()
            java.util.List r0 = r2.A08
            r11 = 1
            if (r0 == 0) goto L_0x02cc
            boolean r0 = X.AnonymousClass000.A1a(r0)
            r10 = 1
            if (r0 == r11) goto L_0x02cd
        L_0x02cc:
            r10 = 0
        L_0x02cd:
            X.00H r0 = r4.A0h
            X.0ve r8 = X.AnonymousClass3MY.A0W(r0)
            r1 = 11378(0x2c72, float:1.5944E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0783
            X.6JK r0 = new X.6JK
            r0.<init>(r10)
        L_0x02e2:
            r6.add(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6KV
            if (r0 != 0) goto L_0x02ed
            boolean r0 = r9 instanceof X.AnonymousClass6KU
            if (r0 == 0) goto L_0x0304
        L_0x02ed:
            X.6JH r0 = new X.6JH
            r0.<init>(r9)
            r6.add(r0)
            boolean r0 = A0E(r4)
            if (r0 == 0) goto L_0x0304
            r1 = 0
            X.6Jc r0 = new X.6Jc
            r0.<init>(r1)
            r6.add(r0)
        L_0x0304:
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r6)
            r3.addAll(r0)
        L_0x030b:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.00H r6 = r4.A0j
            int r8 = A01(r4, r6)
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r8, r0)
            if (r0 != 0) goto L_0x032e
            int r8 = A01(r4, r6)
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1T(r8, r0)
            if (r0 != 0) goto L_0x032e
            boolean r0 = r4.A09()
            r10 = 0
            if (r0 == 0) goto L_0x032f
        L_0x032e:
            r10 = 1
        L_0x032f:
            X.72J r0 = r2.A02
            if (r0 == 0) goto L_0x037d
            boolean r8 = r0.A08
            if (r8 != 0) goto L_0x0525
            java.util.List r9 = r0.A06
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0525
            java.util.List r9 = r0.A07
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0525
            java.util.List r9 = r0.A05
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0525
            X.6J9 r9 = r0.A03
            if (r9 != 0) goto L_0x0525
            X.6JC r11 = r0.A04
            X.2sx r9 = r11.A00()
            if (r9 == 0) goto L_0x0361
            int r9 = r9.A00()
            if (r9 != 0) goto L_0x0525
        L_0x0361:
            boolean r8 = A0E(r4)
            if (r8 != 0) goto L_0x036d
            boolean r8 = r4.A0A()
            if (r8 == 0) goto L_0x037a
        L_0x036d:
            X.0vl r8 = r4.A0s
            java.lang.Object r8 = r8.getValue()
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            X.6JM r11 = new X.6JM
            r11.<init>(r8)
        L_0x037a:
            r1.add(r11)
        L_0x037d:
            r3.addAll(r1)
            X.00H r8 = r4.A0h
            boolean r1 = X.C72453Mb.A1X(r8)
            if (r1 == 0) goto L_0x050f
            java.util.List r1 = r2.A08
            if (r1 == 0) goto L_0x050f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x050f
        L_0x0392:
            if (r5 == 0) goto L_0x039f
            boolean r1 = X.C17880vN.A1X(r3)
            if (r1 == 0) goto L_0x039f
            X.6Ja r1 = X.C121276Ja.A00
            r3.add(r1)
        L_0x039f:
            java.util.List r11 = r2.A08
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r12 = 0
            r9 = 1
            if (r11 == 0) goto L_0x03b0
            boolean r1 = X.AnonymousClass000.A1a(r11)
            r13 = 1
            if (r1 == r9) goto L_0x03c0
        L_0x03b0:
            r13 = 0
            X.0ve r15 = X.AnonymousClass3MY.A0W(r8)
            r14 = 10993(0x2af1, float:1.5404E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r15, r14)
            r14 = 1
            if (r1 != 0) goto L_0x03c1
        L_0x03c0:
            r14 = 0
        L_0x03c1:
            if (r5 != 0) goto L_0x03d5
            if (r14 != 0) goto L_0x03d5
            X.1Lc r1 = X.C108945cZ.A0v(r6)
            boolean r6 = r1.A0A(r13)
            X.6JO r1 = new X.6JO
            r1.<init>(r6, r13)
            r10.add(r1)
        L_0x03d5:
            if (r11 == 0) goto L_0x03dd
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x04e0
        L_0x03dd:
            if (r5 != 0) goto L_0x04de
            if (r14 != 0) goto L_0x04de
            X.6JR r1 = r2.A01
            if (r1 == 0) goto L_0x03ee
            java.util.List r1 = r1.A00
            boolean r1 = X.AnonymousClass000.A1a(r1)
            if (r1 != r9) goto L_0x03ee
            r12 = 1
        L_0x03ee:
            X.6JG r1 = new X.6JG
            r1.<init>(r12)
            r10.add(r1)
        L_0x03f6:
            r3.addAll(r10)
        L_0x03f9:
            java.lang.Integer r9 = r2.A06
            java.lang.Integer r10 = X.AnonymousClass00R.A0Y
            r6 = 1
            if (r9 != r10) goto L_0x040a
            java.util.List r1 = r2.A09
            if (r1 == 0) goto L_0x04db
            boolean r1 = X.AnonymousClass000.A1a(r1)
            if (r1 != r6) goto L_0x04db
        L_0x040a:
            boolean r1 = X.C72453Mb.A1X(r8)
            if (r1 == 0) goto L_0x04d8
            if (r6 == 0) goto L_0x04d8
            X.0ve r11 = X.AnonymousClass3MY.A0W(r8)
            r6 = 10997(0x2af5, float:1.541E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r11, r6)
            if (r1 != 0) goto L_0x04d8
            if (r5 == 0) goto L_0x0480
            java.util.List r6 = r2.A09
            if (r6 == 0) goto L_0x04d4
            boolean r1 = r6.isEmpty()
            r5 = 1
            r1 = r1 ^ 1
            if (r1 != r5) goto L_0x04d4
        L_0x042f:
            boolean r1 = X.C17880vN.A1X(r3)
            if (r1 == 0) goto L_0x043a
            X.6Ja r1 = X.C121276Ja.A00
            r3.add(r1)
        L_0x043a:
            X.6J6 r1 = X.AnonymousClass6J6.A00
            r3.add(r1)
        L_0x043f:
            if (r6 == 0) goto L_0x0444
            r3.addAll(r6)
        L_0x0444:
            int r5 = r9.intValue()
            r1 = 0
            if (r5 == r1) goto L_0x04d1
            r1 = 2
            if (r5 == r1) goto L_0x04ce
            r1 = 3
            if (r5 == r1) goto L_0x04cb
            r1 = 1
            if (r5 == r1) goto L_0x04c8
            r1 = 4
            if (r5 != r1) goto L_0x087d
            X.6JV r1 = X.AnonymousClass6JV.A00
        L_0x0459:
            r3.add(r1)
        L_0x045c:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0480
            X.6JT r1 = X.AnonymousClass6JT.A00
            r3.add(r1)
            boolean r1 = X.C72453Mb.A1X(r8)
            if (r1 == 0) goto L_0x0480
            X.0ve r6 = X.AnonymousClass3MY.A0W(r8)
            r5 = 10997(0x2af5, float:1.541E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r6, r5)
            if (r1 != 0) goto L_0x0480
            X.6JW r1 = X.AnonymousClass6JW.A00
            r3.add(r1)
        L_0x0480:
            X.6JR r5 = r2.A01
            if (r5 == 0) goto L_0x0885
            boolean r1 = A0D(r4)
            r10 = 0
            r11 = 1
            if (r1 != 0) goto L_0x049b
            X.0ve r9 = X.AnonymousClass3MY.A0W(r8)
            r6 = 10993(0x2af1, float:1.5404E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r9, r6)
            r6 = 1
            if (r1 != 0) goto L_0x049c
        L_0x049b:
            r6 = 0
        L_0x049c:
            boolean r1 = X.C72453Mb.A1X(r8)
            if (r1 == 0) goto L_0x0885
            java.util.List r12 = r5.A00
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x04b0
            boolean r1 = A0D(r4)
            if (r1 != 0) goto L_0x0885
        L_0x04b0:
            if (r6 != 0) goto L_0x0885
            boolean r13 = r5.A03
            java.lang.Integer r6 = r2.A05
            if (r13 == 0) goto L_0x080d
            int r9 = r6.intValue()
            if (r9 == r10) goto L_0x0805
            if (r9 == r11) goto L_0x07ff
            r1 = 2
            if (r9 == r1) goto L_0x080d
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x04c8:
            X.6JX r1 = X.AnonymousClass6JX.A00
            goto L_0x0459
        L_0x04cb:
            X.6JY r1 = X.AnonymousClass6JY.A00
            goto L_0x0459
        L_0x04ce:
            X.6JZ r1 = X.AnonymousClass6JZ.A00
            goto L_0x0459
        L_0x04d1:
            X.6JS r1 = X.AnonymousClass6JS.A00
            goto L_0x0459
        L_0x04d4:
            if (r9 == r10) goto L_0x043f
            goto L_0x042f
        L_0x04d8:
            if (r5 == 0) goto L_0x0480
            goto L_0x045c
        L_0x04db:
            r6 = 0
            goto L_0x040a
        L_0x04de:
            if (r11 == 0) goto L_0x03f6
        L_0x04e0:
            boolean r1 = X.AnonymousClass000.A1a(r11)
            if (r1 == 0) goto L_0x04ed
            if (r5 == 0) goto L_0x04ed
            X.6J5 r1 = X.AnonymousClass6J5.A00
            r10.add(r1)
        L_0x04ed:
            X.1c4 r1 = X.C108955ca.A0W(r8)
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x050a
            java.util.Iterator r6 = r11.iterator()
        L_0x04fb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x050a
            java.lang.Object r1 = r6.next()
            X.6Jh r1 = (X.C121346Jh) r1
            r1.A05 = r9
            goto L_0x04fb
        L_0x050a:
            r10.addAll(r11)
            goto L_0x03f6
        L_0x050f:
            X.1c4 r1 = X.C108955ca.A0W(r8)
            boolean r1 = r1.A07()
            if (r1 != 0) goto L_0x0392
            X.1c4 r1 = X.C108955ca.A0W(r8)
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x03f9
            goto L_0x0392
        L_0x0525:
            if (r5 == 0) goto L_0x0553
            java.util.List r9 = r0.A06
            boolean r8 = X.AnonymousClass000.A1a(r9)
            if (r8 != 0) goto L_0x053f
            java.util.List r8 = r0.A07
            boolean r8 = X.AnonymousClass000.A1a(r8)
            if (r8 != 0) goto L_0x053f
            java.util.List r8 = r0.A05
            boolean r8 = X.AnonymousClass000.A1a(r8)
            if (r8 == 0) goto L_0x037d
        L_0x053f:
            X.6J7 r8 = X.AnonymousClass6J7.A00
            r1.add(r8)
            r1.addAll(r9)
            java.util.List r8 = r0.A07
            r1.addAll(r8)
            java.util.List r8 = r0.A05
            r1.addAll(r8)
            goto L_0x037d
        L_0x0553:
            java.util.List r9 = r2.A08
            if (r9 == 0) goto L_0x055d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0563
        L_0x055d:
            boolean r9 = A0E(r4)
            if (r9 == 0) goto L_0x05c2
        L_0x0563:
            if (r10 != 0) goto L_0x05c2
            boolean r9 = r4.A0A()
            if (r9 != 0) goto L_0x05c2
            boolean r8 = r4.A0C()
            if (r8 == 0) goto L_0x05ad
            X.6zt r8 = A04(r4)
            if (r8 == 0) goto L_0x05ad
            X.6zt r9 = A04(r4)
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusTileSpec"
            X.C18070vi.A0z(r9, r8)
            X.6JP r8 = new X.6JP
            r8.<init>(r9, r0)
            r1.add(r8)
            X.6Up r12 = r2.A00
            int r13 = r4.A00()
            r9 = 24
        L_0x0590:
            r14 = 0
            r15 = 0
            r8 = r9 & 2
            boolean r16 = X.AnonymousClass000.A1O(r8)
            r8 = r9 & 8
            if (r8 == 0) goto L_0x059f
            r14 = 2131166383(0x7f0704af, float:1.794701E38)
        L_0x059f:
            r8 = r9 & 16
            if (r8 == 0) goto L_0x05a6
            r15 = 2131166385(0x7f0704b1, float:1.7947014E38)
        L_0x05a6:
            X.6Je r11 = new X.6Je
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x037a
        L_0x05ad:
            X.6Up r12 = r2.A00
            X.6zt r9 = A04(r4)
            X.6Jd r8 = new X.6Jd
            r8.<init>(r12, r9)
            r1.add(r8)
            int r13 = r4.A00()
            r9 = 26
            goto L_0x0590
        L_0x05c2:
            boolean r9 = r4.A0A()
            if (r9 == 0) goto L_0x05ed
            X.6JC r9 = r0.A04
            r1.add(r9)
            java.util.List r9 = r0.A06
            r1.addAll(r9)
            java.util.List r9 = r0.A07
            r1.addAll(r9)
            java.util.List r10 = r0.A05
            boolean r9 = X.AnonymousClass000.A1a(r10)
            if (r9 == 0) goto L_0x037d
            if (r8 == 0) goto L_0x05e6
            r1.addAll(r10)
            goto L_0x037d
        L_0x05e6:
            X.6J9 r8 = X.AnonymousClass6J9.A00
            r1.add(r8)
            goto L_0x037d
        L_0x05ed:
            if (r10 == 0) goto L_0x0725
            boolean r9 = r0.A00
            r16 = r9
            X.6JC r9 = r0.A04
            r1.add(r9)
            int r10 = A01(r4, r6)
            r9 = 4
            boolean r9 = X.AnonymousClass000.A1T(r10, r9)
            if (r9 != 0) goto L_0x0634
            X.6Up r11 = r2.A00
            int r12 = r4.A00()
            int r10 = A01(r4, r6)
            r9 = 3
            boolean r9 = X.AnonymousClass000.A1T(r10, r9)
            r13 = 2131166383(0x7f0704af, float:1.794701E38)
            if (r9 == 0) goto L_0x061a
            r13 = 2131166384(0x7f0704b0, float:1.7947012E38)
        L_0x061a:
            int r10 = A01(r4, r6)
            r9 = 3
            boolean r9 = X.AnonymousClass000.A1T(r10, r9)
            r14 = 2131166385(0x7f0704b1, float:1.7947014E38)
            if (r9 == 0) goto L_0x062b
            r14 = 2131166386(0x7f0704b2, float:1.7947016E38)
        L_0x062b:
            r15 = 1
            X.6Je r10 = new X.6Je
            r10.<init>(r11, r12, r13, r14, r15)
            r1.add(r10)
        L_0x0634:
            r11 = 1
            r10 = 1
            X.1Lc r12 = X.C108945cZ.A0v(r6)
            X.0vl r9 = r4.A0r
            boolean r9 = X.C72453Mb.A1a(r9)
            X.0ve r13 = r12.A01
            if (r9 == 0) goto L_0x06c9
            r12 = 11411(0x2c93, float:1.599E-41)
        L_0x0646:
            X.0vf r9 = X.C18040vf.A02
            int r13 = X.C18020vd.A00(r9, r13, r12)
            if (r13 <= 0) goto L_0x06bc
            boolean r9 = A0D(r4)
            if (r9 != 0) goto L_0x065c
            java.util.List r9 = r0.A06
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x06bc
        L_0x065c:
            java.util.List r9 = r0.A06
            r18 = r9
            int r9 = r18.size()
            java.util.List r14 = r0.A07
            int r9 = X.C108945cZ.A0A(r14, r9)
            int r12 = r9 + 1
            java.util.List r9 = r0.A05
            r17 = r9
            boolean r9 = X.AnonymousClass000.A1a(r17)
            int r12 = r12 + r9
            int r9 = r18.size()
            int r9 = X.C108945cZ.A0A(r14, r9)
            if (r9 <= 0) goto L_0x0698
            int r15 = A01(r4, r6)
            r9 = 4
            boolean r9 = X.AnonymousClass000.A1T(r15, r9)
            if (r9 != 0) goto L_0x0690
            boolean r9 = r4.A09()
            if (r9 == 0) goto L_0x0698
        L_0x0690:
            X.6JE r9 = new X.6JE
            r9.<init>()
            r1.add(r9)
        L_0x0698:
            int r9 = r12 - r13
            if (r16 != 0) goto L_0x06a2
            if (r8 != 0) goto L_0x06a2
            r16 = 0
            if (r9 != r11) goto L_0x06a4
        L_0x06a2:
            r16 = 1
        L_0x06a4:
            java.util.Iterator r15 = r18.iterator()
        L_0x06a8:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x06cd
            java.lang.Object r8 = r15.next()
            if (r16 != 0) goto L_0x06b6
            if (r13 <= r10) goto L_0x06a8
        L_0x06b6:
            int r10 = r10 + 1
            r1.add(r8)
            goto L_0x06a8
        L_0x06bc:
            java.util.List r9 = r0.A06
            int r9 = r9.size()
            int r9 = r9 + 1
            int r13 = java.lang.Math.max(r9, r13)
            goto L_0x065c
        L_0x06c9:
            r12 = 11412(0x2c94, float:1.5992E-41)
            goto L_0x0646
        L_0x06cd:
            java.util.Iterator r14 = r14.iterator()
        L_0x06d1:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x06e5
            java.lang.Object r8 = r14.next()
            if (r16 != 0) goto L_0x06df
            if (r13 <= r10) goto L_0x06d1
        L_0x06df:
            int r10 = r10 + 1
            r1.add(r8)
            goto L_0x06d1
        L_0x06e5:
            boolean r8 = X.AnonymousClass000.A1a(r17)
            if (r8 == 0) goto L_0x06fe
            if (r16 != 0) goto L_0x06ef
            if (r13 <= r10) goto L_0x06fe
        L_0x06ef:
            int r10 = r10 + 1
            X.7qo r13 = new X.7qo
            r13.<init>(r4)
            X.6JL r8 = new X.6JL
            r8.<init>(r13)
            r1.add(r8)
        L_0x06fe:
            boolean r8 = r0.A00
            if (r12 != r10) goto L_0x0704
            if (r8 == 0) goto L_0x037d
        L_0x0704:
            if (r12 <= r10) goto L_0x0715
            X.7qp r8 = new X.7qp
            r8.<init>(r4)
            X.6JQ r10 = new X.6JQ
            r10.<init>(r8, r9, r11)
        L_0x0710:
            r1.add(r10)
            goto L_0x037d
        L_0x0715:
            if (r8 == 0) goto L_0x037d
            if (r9 <= r11) goto L_0x037d
            X.7qq r9 = new X.7qq
            r9.<init>(r4)
            r8 = 0
            X.6JQ r10 = new X.6JQ
            r10.<init>(r9, r8, r8)
            goto L_0x0710
        L_0x0725:
            X.6JC r9 = r0.A04
            r1.add(r9)
            java.util.List r10 = r0.A06
            boolean r9 = X.AnonymousClass000.A1a(r10)
            if (r9 == 0) goto L_0x073d
            X.6JE r9 = new X.6JE
            r9.<init>()
            r1.add(r9)
            r1.addAll(r10)
        L_0x073d:
            java.util.List r11 = r0.A07
            boolean r9 = X.AnonymousClass000.A1a(r11)
            if (r9 == 0) goto L_0x0758
            boolean r10 = r0.A02
            X.6J4 r9 = new X.6J4
            r9.<init>(r10)
            r1.add(r9)
            boolean r9 = r0.A02
            if (r9 != 0) goto L_0x0755
            if (r8 == 0) goto L_0x0758
        L_0x0755:
            r1.addAll(r11)
        L_0x0758:
            java.util.List r11 = r0.A05
            boolean r9 = X.AnonymousClass000.A1a(r11)
            if (r9 == 0) goto L_0x037d
            X.0ve r12 = X.C108955ca.A0R(r6)
            r10 = 6279(0x1887, float:8.799E-42)
            X.0vf r9 = X.C18040vf.A02
            boolean r9 = X.C18020vd.A05(r9, r12, r10)
            if (r9 == 0) goto L_0x037d
            boolean r10 = r0.A01
            X.6J3 r9 = new X.6J3
            r9.<init>(r10)
            r1.add(r9)
            boolean r9 = r0.A01
            if (r9 != 0) goto L_0x077e
            if (r8 == 0) goto L_0x037d
        L_0x077e:
            r1.addAll(r11)
            goto L_0x037d
        L_0x0783:
            X.6Jc r0 = new X.6Jc
            r0.<init>(r11)
            goto L_0x02e2
        L_0x078a:
            r9 = 0
            goto L_0x02bc
        L_0x078d:
            X.6Qt r9 = X.C122536Qt.ARCHIVE
            r8 = 0
            boolean r0 = X.C18020vd.A05(r1, r12, r6)
            if (r0 == 0) goto L_0x07e1
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.6Qt r0 = X.C122536Qt.UPDATES
            r1.add(r0)
            X.1u0 r0 = r10.A02
            X.00H r0 = r0.A00
            r0.get()
            X.6Qt r0 = X.C122536Qt.ADVERTISE
            r1.add(r0)
            java.util.Iterator r13 = X.C29431cG.A0o(r1)
        L_0x07af:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r6 = r13.next()
            X.6Qt r6 = (X.C122536Qt) r6
            X.C18070vi.A0d(r6, r8)
            java.lang.String r1 = X.AnonymousClass719.A00(r6)
            X.0z4 r0 = r10.A00
            X.00H r12 = r0.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r12)
            boolean r0 = r0.getBoolean(r1, r8)
            if (r0 != 0) goto L_0x07af
            java.lang.String r1 = X.AnonymousClass719.A01(r6)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r12)
            int r1 = r0.getInt(r1, r8)
            r0 = 3
            if (r1 >= r0) goto L_0x07af
            if (r6 != r9) goto L_0x02a1
        L_0x07e1:
            X.6KU r9 = new X.6KU
            r9.<init>()
            goto L_0x02bc
        L_0x07e8:
            X.0vl r0 = r4.A0t
            java.lang.Object r1 = r0.getValue()
            X.5lD r1 = (X.C112275lD) r1
            boolean r0 = A0E(r4)
            if (r0 == 0) goto L_0x07fa
            X.6zt r7 = A04(r4)
        L_0x07fa:
            r1.A0V(r7, r6)
            goto L_0x023d
        L_0x07ff:
            X.6JI r1 = new X.6JI
            r1.<init>(r11)
            goto L_0x080a
        L_0x0805:
            X.6JI r1 = new X.6JI
            r1.<init>(r10)
        L_0x080a:
            r3.add(r1)
        L_0x080d:
            X.1c4 r1 = X.C108955ca.A0W(r8)
            boolean r1 = r1.A0A()
            if (r1 == 0) goto L_0x0882
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            boolean r10 = X.AnonymousClass000.A1Z(r6, r1)
            boolean r9 = r5.A01
            if (r9 != 0) goto L_0x085f
            X.0ve r6 = X.AnonymousClass3MY.A0W(r8)
            r5 = 10995(0x2af3, float:1.5407E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r6, r5)
            if (r1 == 0) goto L_0x085f
        L_0x082f:
            if (r13 != 0) goto L_0x0838
            if (r11 != 0) goto L_0x0838
            X.6JU r1 = X.AnonymousClass6JU.A00
            r3.add(r1)
        L_0x0838:
            if (r10 != 0) goto L_0x0874
            if (r11 != 0) goto L_0x0874
            java.util.ArrayList r11 = X.C29351c6.A0D(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0844:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0861
            java.lang.Object r1 = r12.next()
            X.6s7 r1 = (X.C135386s7) r1
            X.2Dk r10 = r1.A02
            X.1E7 r6 = r1.A00
            boolean r5 = r1.A01
            X.6Jg r1 = new X.6Jg
            r1.<init>(r10, r6, r5)
            r11.add(r1)
            goto L_0x0844
        L_0x085f:
            r11 = 0
            goto L_0x082f
        L_0x0861:
            X.0ve r6 = X.AnonymousClass3MY.A0W(r8)
            r5 = 8167(0x1fe7, float:1.1444E-41)
            X.0vf r1 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r1, r6, r5)
            java.util.List r1 = X.C29431cG.A0v(r11, r1)
            r3.addAll(r1)
        L_0x0874:
            X.6JN r1 = new X.6JN
            r1.<init>(r9)
            r3.add(r1)
            goto L_0x0885
        L_0x087d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0882:
            r3.add(r5)
        L_0x0885:
            java.util.List r1 = r2.A07
            if (r1 == 0) goto L_0x088c
            r3.addAll(r1)
        L_0x088c:
            boolean r1 = X.C72453Mb.A1X(r8)
            if (r1 != 0) goto L_0x08a7
            X.0ve r5 = X.AnonymousClass3MY.A0W(r8)
            r2 = 11378(0x2c72, float:1.5944E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r5, r2)
            if (r1 == 0) goto L_0x08a7
            if (r0 == 0) goto L_0x08a7
            X.6Jb r0 = X.C121286Jb.A00
            r3.add(r0)
        L_0x08a7:
            A07(r4, r3)
        L_0x08aa:
            r4.A03 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112365lM.A0V(X.6u6):void");
    }

    public int getItemViewType(int i) {
        Object obj = A06(this).get(i);
        C18070vi.A0X(obj);
        AnonymousClass6U0 r1 = (AnonymousClass6U0) obj;
        boolean z = false;
        if (r1 instanceof AnonymousClass6JK) {
            return 0;
        }
        if (r1 instanceof C121306Jd) {
            return 1;
        }
        if (r1 instanceof AnonymousClass6JO) {
            return 2;
        }
        if (r1 instanceof C121346Jh) {
            return 3;
        }
        if (r1 instanceof AnonymousClass6JG) {
            return 4;
        }
        if (r1 instanceof AnonymousClass6JC) {
            C63372sx r0 = ((AnonymousClass6JC) r1).A05.A00;
            if (r0 == null || r0.A00() == 0) {
                z = true;
            }
            if (A09() && z) {
                return 45;
            }
            if (AnonymousClass000.A1T(A01(this, this.A0j), 3) || A09()) {
                return 36;
            }
            if (A0A()) {
                return 43;
            }
            return 5;
        } else if (r1 instanceof AnonymousClass6JM) {
            return 30;
        } else {
            if (r1 instanceof AnonymousClass6JB) {
                if (A0A()) {
                    return 42;
                }
                if (AnonymousClass000.A1T(A01(this, this.A0j), 3) || A09()) {
                    return 37;
                }
                return 6;
            } else if (r1 instanceof AnonymousClass6J9) {
                if (A0A()) {
                    return 44;
                }
                return 13;
            } else if (r1 instanceof AnonymousClass6J4) {
                if (AnonymousClass000.A1T(A01(this, this.A0j), 3)) {
                    return 38;
                }
                return 8;
            } else if (r1 instanceof AnonymousClass6JE) {
                return 7;
            } else {
                if (r1 instanceof AnonymousClass6JH) {
                    return 9;
                }
                if (r1 instanceof C121296Jc) {
                    if (((C121296Jc) r1).A00) {
                        return 47;
                    }
                    return 34;
                } else if (r1 instanceof AnonymousClass6JR) {
                    return 10;
                } else {
                    if (r1 instanceof AnonymousClass6JU) {
                        return 31;
                    }
                    if (r1 instanceof C121336Jg) {
                        return 32;
                    }
                    if (r1 instanceof AnonymousClass6JN) {
                        return 33;
                    }
                    if (r1 instanceof AnonymousClass6J7) {
                        return 14;
                    }
                    if (r1 instanceof AnonymousClass6J5) {
                        return 15;
                    }
                    if (r1 instanceof AnonymousClass6J6) {
                        return 18;
                    }
                    if (r1 instanceof C121276Ja) {
                        return 16;
                    }
                    if (r1 instanceof C121326Jf) {
                        return 17;
                    }
                    if (r1 instanceof AnonymousClass6JS) {
                        return 19;
                    }
                    if (r1 instanceof AnonymousClass6JX) {
                        return 20;
                    }
                    if (r1 instanceof AnonymousClass6JZ) {
                        return 21;
                    }
                    if (r1 instanceof AnonymousClass6JY) {
                        return 22;
                    }
                    if (r1 instanceof AnonymousClass6JV) {
                        return 23;
                    }
                    if (r1 instanceof AnonymousClass6JW) {
                        return 24;
                    }
                    if (r1 instanceof AnonymousClass6JT) {
                        return 25;
                    }
                    if (r1 instanceof AnonymousClass6JJ) {
                        return 14;
                    }
                    if (r1 instanceof AnonymousClass6JI) {
                        return 26;
                    }
                    if (r1 instanceof AnonymousClass6J3) {
                        return 27;
                    }
                    if (r1 instanceof AnonymousClass6JP) {
                        return 29;
                    }
                    if (r1 instanceof C121316Je) {
                        return 35;
                    }
                    if (r1 instanceof AnonymousClass6JQ) {
                        if (((AnonymousClass6JQ) r1).A02) {
                            return 40;
                        }
                        return 39;
                    } else if (r1 instanceof AnonymousClass6JL) {
                        return 41;
                    } else {
                        if (r1 instanceof AnonymousClass6JA) {
                            return -1;
                        }
                        if (r1 instanceof C121286Jb) {
                            return 46;
                        }
                        throw AnonymousClass3MW.A14();
                    }
                }
            }
        }
    }

    public C112365lM(C131376kz r43, C131386l0 r44, AnonymousClass2Z6 r45, AnonymousClass2Z7 r46, AnonymousClass2Z8 r47, AnonymousClass2ZA r48, AnonymousClass2ZB r49, AnonymousClass2ZC r50, AnonymousClass2ZD r51, AnonymousClass2ZE r52, C131406l2 r53, AnonymousClass2ZF r54, AnonymousClass2ZG r55, AnonymousClass2ZH r56, AnonymousClass2ZI r57, C131426l5 r58, C61152pD r59, AnonymousClass2ZJ r60, AnonymousClass2ZK r61, AnonymousClass2ZL r62, WaFragment waFragment, AnonymousClass1M9 r64, UpdatesFragment updatesFragment, UpdatesFragment updatesFragment2, UpdatesFragment updatesFragment3, UpdatesFragment updatesFragment4, AnonymousClass88H r69, AnonymousClass1DC r70, AnonymousClass00H r71, AnonymousClass00H r72, AnonymousClass00H r73, AnonymousClass00H r74, AnonymousClass00H r75, AnonymousClass00H r76, AnonymousClass00H r77, AnonymousClass00H r78, AnonymousClass00H r79, AnonymousClass00H r80, AnonymousClass00H r81, AnonymousClass00H r82, AnonymousClass00H r83, AnonymousClass00H r84, AnonymousClass00H r85, AnonymousClass00H r86, AnonymousClass00H r87, AnonymousClass00H r88) {
        AnonymousClass00H r22 = r71;
        C18070vi.A0d(r22, 1);
        AnonymousClass88H r23 = r69;
        AnonymousClass00H r21 = r72;
        AnonymousClass00H r20 = r73;
        C18070vi.A0p(r21, r20, r23);
        AnonymousClass00H r19 = r74;
        C18070vi.A0d(r19, 5);
        AnonymousClass1M9 r24 = r64;
        AnonymousClass2Z6 r39 = r45;
        AnonymousClass2Z7 r38 = r46;
        AnonymousClass2Z8 r37 = r47;
        AnonymousClass2ZA r36 = r48;
        C18070vi.A0x(r24, r39, r38, r37, r36);
        C131406l2 r33 = r53;
        AnonymousClass2ZB r35 = r49;
        AnonymousClass2ZC r34 = r50;
        AnonymousClass2ZD r15 = r51;
        AnonymousClass2ZE r14 = r52;
        C18070vi.A0y(r35, r34, r15, r14, r33);
        AnonymousClass2ZF r32 = r54;
        AnonymousClass2ZG r31 = r55;
        AnonymousClass2ZH r30 = r56;
        AnonymousClass2ZI r29 = r57;
        C18070vi.A0t(r32, r31, r30, r29);
        AnonymousClass00H r18 = r75;
        AnonymousClass2ZJ r26 = r60;
        C131426l5 r28 = r58;
        C61152pD r27 = r59;
        C18070vi.A0u(r28, r27, r26, r18);
        AnonymousClass00H r16 = r77;
        AnonymousClass00H r17 = r76;
        C108975cc.A11(r17, 24, r16);
        AnonymousClass2ZK r25 = r61;
        C18070vi.A0d(r25, 31);
        AnonymousClass00H r8 = r81;
        AnonymousClass00H r9 = r80;
        AnonymousClass00H r12 = r79;
        AnonymousClass00H r13 = r78;
        C109005cf.A0p(r13, r12, r9, r8);
        AnonymousClass00H r7 = r82;
        C18070vi.A0d(r7, 36);
        AnonymousClass00H r6 = r83;
        C18070vi.A0d(r6, 37);
        AnonymousClass00H r5 = r84;
        AnonymousClass00H r4 = r87;
        C131376kz r41 = r43;
        C131386l0 r40 = r44;
        C108995ce.A1I(r5, r4, r40, r41, 38);
        AnonymousClass2ZL r11 = r62;
        C18070vi.A0d(r11, 44);
        AnonymousClass00H r3 = r88;
        C18070vi.A0d(r3, 45);
        AnonymousClass1DC r10 = r70;
        C18070vi.A0d(r10, 46);
        this.A0l = r22;
        this.A0V = r24;
        this.A0E = r39;
        this.A0F = r38;
        this.A0v = r37;
        this.A0w = r36;
        this.A0G = r35;
        this.A0H = r34;
        this.A0I = r15;
        this.A0J = r14;
        this.A0K = r33;
        this.A0L = r32;
        this.A0M = r31;
        this.A0N = r30;
        this.A0O = r29;
        this.A0P = r28;
        this.A0Q = r27;
        this.A0R = r26;
        this.A0i = r18;
        this.A0h = r17;
        this.A0a = r16;
        this.A0Z = updatesFragment;
        this.A0X = updatesFragment2;
        this.A0W = updatesFragment3;
        this.A0Y = updatesFragment4;
        this.A0U = waFragment;
        this.A0S = r25;
        this.A0g = r13;
        this.A0j = r12;
        this.A0k = r9;
        this.A0e = r8;
        this.A0f = r7;
        this.A0z = r6;
        this.A0y = r5;
        this.A0d = r85;
        this.A10 = r86;
        this.A0b = r4;
        this.A0D = r40;
        this.A0C = r41;
        this.A0T = r11;
        this.A0c = r3;
        this.A0x = r10;
        Integer num = AnonymousClass00R.A0C;
        this.A0s = AnonymousClass1DF.A00(num, new C154317qw(r19));
        this.A0r = AnonymousClass1DF.A00(num, new C154307qv(this));
        this.A08 = AnonymousClass3MW.A0z((Object) null);
        this.A0n = AnonymousClass1DF.A01(new C154277qs(this));
        this.A0q = AnonymousClass1DF.A00(num, new C154297qu(this));
        this.A0A = true;
        this.A0o = AnonymousClass1DF.A00(num, new C156977vb(r21, r20));
        this.A0t = AnonymousClass1DF.A01(new C156987vc(this, r23));
        this.A09 = C18460wS.A00;
    }
}
