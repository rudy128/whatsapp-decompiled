package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3WN  reason: invalid class name */
public class AnonymousClass3WN extends C41251w3 {
    public static final AnonymousClass3Vw A0G = new Object();
    public AnonymousClass11S A00;
    public C72043Kk A01;
    public ParticipantsListViewModel A02;
    public C66812ym A03;
    public AnonymousClass1M9 A04;
    public C24921Me A05;
    public AnonymousClass11C A06;
    public AnonymousClass126 A07;
    public UserJid A08;
    public C24901Mc A09;
    public AnonymousClass1DC A0A;
    public C126746dE A0B;
    public RecyclerView A0C;
    public final C37451pZ A0D;
    public final C18030ve A0E;
    public final C18140vp A0F;

    public int A0X(UserJid userJid) {
        for (int i = 0; i < A0Q(); i++) {
            C86594Sg r1 = (C86594Sg) super.A0U(i);
            if ((r1 instanceof C76533nV) && ((C76533nV) r1).A03.equals(userJid)) {
                return i;
            }
        }
        return -1;
    }

    public AnonymousClass3WN(Context context, C27201Vd r3, C18030ve r4, C18140vp r5) {
        super((C40411uf) A0G);
        this.A0F = r5;
        this.A0D = r3.A06(context, "voip-call-control-bottom-sheet");
        A0K(true);
        this.A0E = r4;
    }

    public static void A00(AnonymousClass3WN r3, int i) {
        C126746dE r0 = r3.A0B;
        if (r0 != null) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r0.A00;
            if (voipCallControlBottomSheetV2.A0E != null && voipCallControlBottomSheetV2.A0D != null) {
                C17900vP.A0j("voip/VoipCallControlBottomSheetV2 scroll to position: ", AnonymousClass000.A10(), i);
                voipCallControlBottomSheetV2.A0L.A08 = null;
                voipCallControlBottomSheetV2.A0E.post(new C146827Qt(voipCallControlBottomSheetV2, i, 3));
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        AnonymousClass3ZY r32 = (AnonymousClass3ZY) r3;
        if (r32 instanceof C76173mi) {
            C76173mi r33 = (C76173mi) r32;
            r33.A0C();
            r33.A00 = null;
            C28931bI r1 = r33.A0A;
            if (r1.A00 != null) {
                r1.A02().removeCallbacks(r33.A0C);
            }
            r33.A0B.A04(8);
        }
    }

    public void A0T(RecyclerView recyclerView) {
        Log.i("voip/ParticipantsListAdapter/onDetachedFromRecyclerView");
        this.A0D.A02();
    }

    public void A0W(List list) {
        ArrayList A10;
        if (list == null) {
            A10 = null;
        } else {
            A10 = C17880vN.A10(list);
        }
        super.A0W(A10);
    }

    public void A0Y() {
        if (this.A0C != null) {
            for (int i = 0; i < A0Q(); i++) {
                C86594Sg r2 = (C86594Sg) super.A0U(i);
                if (r2.A00 == 4) {
                    C42011xT A0O = this.A0C.A0O(i);
                    if (A0O instanceof AnonymousClass3ZY) {
                        ((AnonymousClass3ZY) A0O).A0B(r2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C86594Sg r1 = (C86594Sg) super.A0U(i);
        C17960vV.A07(r1);
        ((AnonymousClass3ZY) r3).A0B(r1);
        if ((r1 instanceof C76533nV) && ((C76533nV) r1).A03.equals(this.A08)) {
            A00(this, i);
        }
    }

    public long A0M(int i) {
        int i2;
        C86594Sg r1 = (C86594Sg) super.A0U(i);
        if (r1 instanceof C76533nV) {
            i2 = ((C76533nV) r1).A03.hashCode();
        } else {
            i2 = r1.A00;
        }
        return (long) i2;
    }

    public void A0S(RecyclerView recyclerView) {
        this.A0C = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r5 = (X.C76173mi) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/ParticipantsListAdapter/updateProfilePhoto "
            X.C17900vP.A0Y(r8, r0, r1)
            r6 = 0
        L_0x000a:
            int r0 = r7.A0Q()
            if (r6 >= r0) goto L_0x0047
            java.lang.Object r1 = super.A0U(r6)
            X.4Sg r1 = (X.C86594Sg) r1
            boolean r0 = r1 instanceof X.C76533nV
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0C
            if (r0 == 0) goto L_0x0044
            X.3nV r1 = (X.C76533nV) r1
            X.1BI r0 = r1.A03
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0C
            X.1xT r5 = r0.A0O(r6)
            boolean r0 = r5 instanceof X.C76173mi
            if (r0 == 0) goto L_0x0044
            X.3mi r5 = (X.C76173mi) r5
            X.3nV r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            X.1pZ r4 = r5.A08
            X.1E7 r3 = r0.A02
            android.widget.ImageView r2 = r5.A03
            r1 = 1
            X.1z2 r0 = r5.A07
            r4.A05(r2, r0, r3, r1)
        L_0x0044:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WN.A0Z(com.whatsapp.jid.UserJid):void");
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0D2 = AnonymousClass3MZ.A0D(viewGroup);
        if (i == 0) {
            List list = C42011xT.A0I;
            return new C76133me(A0D2.inflate(2131627485, viewGroup, false), this.A02, C72463Mc.A1Z(this.A0F));
        } else if (i != 2) {
            switch (i) {
                case 4:
                    List list2 = C42011xT.A0I;
                    return new C76163mh(A0D2.inflate(2131627489, viewGroup, false), this.A02, this.A04, this.A05, this.A07, this.A09);
                case 5:
                    List list3 = C42011xT.A0I;
                    return new C76153mg(A0D2.inflate(2131627483, viewGroup, false), this.A02, C72463Mc.A1Z(this.A0F));
                case 6:
                    List list4 = C42011xT.A0I;
                    return new C76143mf(A0D2.inflate(2131626267, viewGroup, false), this.A02, C72463Mc.A1Z(this.A0F));
                case 7:
                    List list5 = C42011xT.A0I;
                    return new C76123md(A0D2.inflate(2131626309, viewGroup, false), this.A02);
                case 8:
                    List list6 = C42011xT.A0I;
                    View inflate = A0D2.inflate(2131624411, viewGroup, false);
                    ParticipantsListViewModel participantsListViewModel = this.A02;
                    C18070vi.A0d(inflate, 1);
                    return new AnonymousClass3ZY(inflate, participantsListViewModel);
                default:
                    C17960vV.A0F(C17890vO.A1R(i), "Unknown list item type");
                    List list7 = C42011xT.A0I;
                    View inflate2 = A0D2.inflate(2131627493, viewGroup, false);
                    ParticipantsListViewModel participantsListViewModel2 = this.A02;
                    C24921Me r7 = this.A05;
                    AnonymousClass11C r10 = this.A06;
                    return new C76173mi(inflate2, this.A01, participantsListViewModel2, r7, this.A03, this.A0D, r10, this.A0A, C72463Mc.A1Z(this.A0F));
            }
        } else {
            List list8 = C42011xT.A0I;
            return new C76113mc(A0D2.inflate(2131627488, viewGroup, false), this.A02);
        }
    }

    public int getItemViewType(int i) {
        C86594Sg r0 = (C86594Sg) super.A0U(i);
        C17960vV.A07(r0);
        return r0.A00;
    }
}
